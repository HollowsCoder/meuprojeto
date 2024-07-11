package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.reflect.ReflectionAccessor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {
    private final ReflectionAccessor accessor = ReflectionAccessor.getInstance();
    private final ConstructorConstructor constructorConstructor;
    private final Excluder excluder;
    private final FieldNamingStrategy fieldNamingPolicy;
    private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;

    public static final class Adapter<T> extends TypeAdapter<T> {
        private final Map<String, b> boundFields;
        private final ObjectConstructor<T> constructor;

        public Adapter(ObjectConstructor<T> objectConstructor, Map<String, b> map) {
            this.constructor = objectConstructor;
            this.boundFields = map;
        }

        public T read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            T construct = this.constructor.construct();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    b bVar = this.boundFields.get(jsonReader.nextName());
                    if (bVar != null) {
                        if (bVar.f3850c) {
                            bVar.a(construct, jsonReader);
                        }
                    }
                    jsonReader.skipValue();
                }
                jsonReader.endObject();
                return construct;
            } catch (IllegalStateException e10) {
                throw new JsonSyntaxException((Throwable) e10);
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            }
        }

        public void write(JsonWriter jsonWriter, T t10) {
            if (t10 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                for (b next : this.boundFields.values()) {
                    if (next.c(t10)) {
                        jsonWriter.name(next.f3848a);
                        next.b(jsonWriter, t10);
                    }
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public class a extends b {
        public final /* synthetic */ Field d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ boolean f3843e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ TypeAdapter f3844f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Gson f3845g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ TypeToken f3846h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ boolean f3847i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z, boolean z10, Field field, boolean z11, TypeAdapter typeAdapter, Gson gson, TypeToken typeToken, boolean z12) {
            super(str, z, z10);
            this.d = field;
            this.f3843e = z11;
            this.f3844f = typeAdapter;
            this.f3845g = gson;
            this.f3846h = typeToken;
            this.f3847i = z12;
        }

        public final void a(Object obj, JsonReader jsonReader) {
            Object read = this.f3844f.read(jsonReader);
            if (read != null || !this.f3847i) {
                this.d.set(obj, read);
            }
        }

        public final void b(JsonWriter jsonWriter, Object obj) {
            Object obj2 = this.d.get(obj);
            boolean z = this.f3843e;
            TypeAdapter typeAdapter = this.f3844f;
            if (!z) {
                typeAdapter = new a(this.f3845g, typeAdapter, this.f3846h.getType());
            }
            typeAdapter.write(jsonWriter, obj2);
        }

        public final boolean c(Object obj) {
            return this.f3849b && this.d.get(obj) != obj;
        }
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f3848a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f3849b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f3850c;

        public b(String str, boolean z, boolean z10) {
            this.f3848a = str;
            this.f3849b = z;
            this.f3850c = z10;
        }

        public abstract void a(Object obj, JsonReader jsonReader);

        public abstract void b(JsonWriter jsonWriter, Object obj);

        public abstract boolean c(Object obj);
    }

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor2, FieldNamingStrategy fieldNamingStrategy, Excluder excluder2, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.constructorConstructor = constructorConstructor2;
        this.fieldNamingPolicy = fieldNamingStrategy;
        this.excluder = excluder2;
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
    }

    private b createBoundField(Gson gson, Field field, String str, TypeToken<?> typeToken, boolean z, boolean z10) {
        TypeAdapter<?> typeAdapter;
        Gson gson2 = gson;
        TypeToken<?> typeToken2 = typeToken;
        boolean isPrimitive = Primitives.isPrimitive(typeToken.getRawType());
        Field field2 = field;
        JsonAdapter jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
        if (jsonAdapter != null) {
            JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = this.jsonAdapterFactory;
            ConstructorConstructor constructorConstructor2 = this.constructorConstructor;
            jsonAdapterAnnotationTypeAdapterFactory.getClass();
            typeAdapter = JsonAdapterAnnotationTypeAdapterFactory.a(constructorConstructor2, gson, typeToken2, jsonAdapter);
        } else {
            typeAdapter = null;
        }
        boolean z11 = typeAdapter != null;
        if (typeAdapter == null) {
            typeAdapter = gson.getAdapter(typeToken2);
        }
        return new a(str, z, z10, field, z11, typeAdapter, gson, typeToken, isPrimitive);
    }

    private Map<String, b> getBoundFields(Gson gson, TypeToken<?> typeToken, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = typeToken.getType();
        TypeToken<?> typeToken2 = typeToken;
        Class<? super Object> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i10 = 0;
            while (i10 < length) {
                Field field = declaredFields[i10];
                boolean excludeField = excludeField(field, true);
                boolean excludeField2 = excludeField(field, z);
                if (excludeField || excludeField2) {
                    this.accessor.makeAccessible(field);
                    Type resolve = C$Gson$Types.resolve(typeToken2.getType(), cls2, field.getGenericType());
                    List<String> fieldNames = getFieldNames(field);
                    int size = fieldNames.size();
                    b bVar = null;
                    int i11 = z;
                    while (i11 < size) {
                        String str = fieldNames.get(i11);
                        boolean z10 = i11 != 0 ? z : excludeField;
                        String str2 = str;
                        int i12 = i11;
                        b bVar2 = bVar;
                        int i13 = size;
                        List<String> list = fieldNames;
                        Field field2 = field;
                        bVar = bVar2 == null ? (b) linkedHashMap.put(str2, createBoundField(gson, field, str2, TypeToken.get(resolve), z10, excludeField2)) : bVar2;
                        i11 = i12 + 1;
                        excludeField = z10;
                        fieldNames = list;
                        size = i13;
                        field = field2;
                        z = false;
                    }
                    b bVar3 = bVar;
                    if (bVar3 != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + bVar3.f3848a);
                    }
                }
                i10++;
                z = false;
            }
            typeToken2 = TypeToken.get(C$Gson$Types.resolve(typeToken2.getType(), cls2, cls2.getGenericSuperclass()));
            cls2 = typeToken2.getRawType();
        }
        return linkedHashMap;
    }

    private List<String> getFieldNames(Field field) {
        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
        if (serializedName == null) {
            return Collections.singletonList(this.fieldNamingPolicy.translateName(field));
        }
        String value = serializedName.value();
        String[] alternate = serializedName.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String add : alternate) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        return new Adapter(this.constructorConstructor.get(typeToken), getBoundFields(gson, typeToken, rawType));
    }

    public boolean excludeField(Field field, boolean z) {
        Excluder excluder2 = this.excluder;
        if (excluder2.excludeClass(field.getType(), z) || excluder2.excludeField(field, z)) {
            return false;
        }
        return true;
    }
}

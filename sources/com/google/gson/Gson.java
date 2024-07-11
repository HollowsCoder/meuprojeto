package com.google.gson;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class Gson {
    private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
    private static final TypeToken<?> NULL_KEY_SURROGATE = TypeToken.get(Object.class);

    /* renamed from: a  reason: collision with root package name */
    public final List<TypeAdapterFactory> f3748a;

    /* renamed from: b  reason: collision with root package name */
    public final Excluder f3749b;

    /* renamed from: c  reason: collision with root package name */
    public final FieldNamingStrategy f3750c;
    private final ThreadLocal<Map<TypeToken<?>, f<?>>> calls;
    private final ConstructorConstructor constructorConstructor;
    public final Map<Type, InstanceCreator<?>> d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3751e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3752f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3753g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3754h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f3755i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f3756j;
    private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f3757k;
    public final String l;

    /* renamed from: m  reason: collision with root package name */
    public final int f3758m;

    /* renamed from: n  reason: collision with root package name */
    public final int f3759n;

    /* renamed from: o  reason: collision with root package name */
    public final LongSerializationPolicy f3760o;

    /* renamed from: p  reason: collision with root package name */
    public final List<TypeAdapterFactory> f3761p;

    /* renamed from: q  reason: collision with root package name */
    public final List<TypeAdapterFactory> f3762q;
    private final Map<TypeToken<?>, TypeAdapter<?>> typeTokenCache;

    public class a extends TypeAdapter<Number> {
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Double.valueOf(jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            Number number = (Number) obj;
            if (number == null) {
                jsonWriter.nullValue();
                return;
            }
            Gson.a(number.doubleValue());
            jsonWriter.value(number);
        }
    }

    public class b extends TypeAdapter<Number> {
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Float.valueOf((float) jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            Number number = (Number) obj;
            if (number == null) {
                jsonWriter.nullValue();
                return;
            }
            Gson.a((double) number.floatValue());
            jsonWriter.value(number);
        }
    }

    public class c extends TypeAdapter<Number> {
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Long.valueOf(jsonReader.nextLong());
            }
            jsonReader.nextNull();
            return null;
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            Number number = (Number) obj;
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(number.toString());
            }
        }
    }

    public class d extends TypeAdapter<AtomicLong> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TypeAdapter f3763a;

        public d(TypeAdapter typeAdapter) {
            this.f3763a = typeAdapter;
        }

        public final Object read(JsonReader jsonReader) {
            return new AtomicLong(((Number) this.f3763a.read(jsonReader)).longValue());
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            this.f3763a.write(jsonWriter, Long.valueOf(((AtomicLong) obj).get()));
        }
    }

    public class e extends TypeAdapter<AtomicLongArray> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TypeAdapter f3764a;

        public e(TypeAdapter typeAdapter) {
            this.f3764a = typeAdapter;
        }

        public final Object read(JsonReader jsonReader) {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(Long.valueOf(((Number) this.f3764a.read(jsonReader)).longValue()));
            }
            jsonReader.endArray();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
            }
            return atomicLongArray;
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
            jsonWriter.beginArray();
            int length = atomicLongArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                this.f3764a.write(jsonWriter, Long.valueOf(atomicLongArray.get(i10)));
            }
            jsonWriter.endArray();
        }
    }

    public static class f<T> extends TypeAdapter<T> {

        /* renamed from: a  reason: collision with root package name */
        public TypeAdapter<T> f3765a;

        public final T read(JsonReader jsonReader) {
            TypeAdapter<T> typeAdapter = this.f3765a;
            if (typeAdapter != null) {
                return typeAdapter.read(jsonReader);
            }
            throw new IllegalStateException();
        }

        public final void write(JsonWriter jsonWriter, T t10) {
            TypeAdapter<T> typeAdapter = this.f3765a;
            if (typeAdapter != null) {
                typeAdapter.write(jsonWriter, t10);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public Gson() {
        this(Excluder.DEFAULT, FieldNamingPolicy.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, LongSerializationPolicy.DEFAULT, (String) null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    public Gson(Excluder excluder, FieldNamingStrategy fieldNamingStrategy, Map<Type, InstanceCreator<?>> map, boolean z, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, LongSerializationPolicy longSerializationPolicy, String str, int i10, int i11, List<TypeAdapterFactory> list, List<TypeAdapterFactory> list2, List<TypeAdapterFactory> list3) {
        boolean z16 = z10;
        boolean z17 = z15;
        this.calls = new ThreadLocal<>();
        this.typeTokenCache = new ConcurrentHashMap();
        this.f3749b = excluder;
        this.f3750c = fieldNamingStrategy;
        this.d = map;
        ConstructorConstructor constructorConstructor2 = new ConstructorConstructor(map);
        this.constructorConstructor = constructorConstructor2;
        this.f3751e = z;
        this.f3752f = z16;
        this.f3753g = z11;
        this.f3754h = z12;
        this.f3755i = z13;
        this.f3756j = z14;
        this.f3757k = z17;
        this.f3760o = longSerializationPolicy;
        this.l = str;
        this.f3758m = i10;
        this.f3759n = i11;
        this.f3761p = list;
        this.f3762q = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.JSON_ELEMENT_FACTORY);
        arrayList.add(ObjectTypeAdapter.FACTORY);
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.STRING_FACTORY);
        arrayList.add(TypeAdapters.INTEGER_FACTORY);
        arrayList.add(TypeAdapters.BOOLEAN_FACTORY);
        arrayList.add(TypeAdapters.BYTE_FACTORY);
        arrayList.add(TypeAdapters.SHORT_FACTORY);
        TypeAdapter<Number> longAdapter = longAdapter(longSerializationPolicy);
        arrayList.add(TypeAdapters.newFactory(Long.TYPE, Long.class, longAdapter));
        arrayList.add(TypeAdapters.newFactory(Double.TYPE, Double.class, doubleAdapter(z17)));
        arrayList.add(TypeAdapters.newFactory(Float.TYPE, Float.class, floatAdapter(z17)));
        arrayList.add(TypeAdapters.NUMBER_FACTORY);
        arrayList.add(TypeAdapters.ATOMIC_INTEGER_FACTORY);
        arrayList.add(TypeAdapters.ATOMIC_BOOLEAN_FACTORY);
        arrayList.add(TypeAdapters.newFactory(AtomicLong.class, atomicLongAdapter(longAdapter)));
        arrayList.add(TypeAdapters.newFactory(AtomicLongArray.class, atomicLongArrayAdapter(longAdapter)));
        arrayList.add(TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY);
        arrayList.add(TypeAdapters.CHARACTER_FACTORY);
        arrayList.add(TypeAdapters.STRING_BUILDER_FACTORY);
        arrayList.add(TypeAdapters.STRING_BUFFER_FACTORY);
        arrayList.add(TypeAdapters.newFactory(BigDecimal.class, TypeAdapters.BIG_DECIMAL));
        arrayList.add(TypeAdapters.newFactory(BigInteger.class, TypeAdapters.BIG_INTEGER));
        arrayList.add(TypeAdapters.URL_FACTORY);
        arrayList.add(TypeAdapters.URI_FACTORY);
        arrayList.add(TypeAdapters.UUID_FACTORY);
        arrayList.add(TypeAdapters.CURRENCY_FACTORY);
        arrayList.add(TypeAdapters.LOCALE_FACTORY);
        arrayList.add(TypeAdapters.INET_ADDRESS_FACTORY);
        arrayList.add(TypeAdapters.BIT_SET_FACTORY);
        arrayList.add(DateTypeAdapter.FACTORY);
        arrayList.add(TypeAdapters.CALENDAR_FACTORY);
        arrayList.add(TimeTypeAdapter.FACTORY);
        arrayList.add(SqlDateTypeAdapter.FACTORY);
        arrayList.add(TypeAdapters.TIMESTAMP_FACTORY);
        arrayList.add(ArrayTypeAdapter.FACTORY);
        arrayList.add(TypeAdapters.CLASS_FACTORY);
        arrayList.add(new CollectionTypeAdapterFactory(constructorConstructor2));
        arrayList.add(new MapTypeAdapterFactory(constructorConstructor2, z16));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor2);
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.ENUM_FACTORY);
        arrayList.add(new ReflectiveTypeAdapterFactory(constructorConstructor2, fieldNamingStrategy, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f3748a = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private static void assertFullConsumption(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e10) {
                throw new JsonSyntaxException((Throwable) e10);
            } catch (IOException e11) {
                throw new JsonIOException((Throwable) e11);
            }
        }
    }

    private static TypeAdapter<AtomicLong> atomicLongAdapter(TypeAdapter<Number> typeAdapter) {
        return new d(typeAdapter).nullSafe();
    }

    private static TypeAdapter<AtomicLongArray> atomicLongArrayAdapter(TypeAdapter<Number> typeAdapter) {
        return new e(typeAdapter).nullSafe();
    }

    private TypeAdapter<Number> doubleAdapter(boolean z) {
        return z ? TypeAdapters.DOUBLE : new a();
    }

    private TypeAdapter<Number> floatAdapter(boolean z) {
        return z ? TypeAdapters.FLOAT : new b();
    }

    private static TypeAdapter<Number> longAdapter(LongSerializationPolicy longSerializationPolicy) {
        return longSerializationPolicy == LongSerializationPolicy.DEFAULT ? TypeAdapters.LONG : new c();
    }

    public Excluder excluder() {
        return this.f3749b;
    }

    public FieldNamingStrategy fieldNamingStrategy() {
        return this.f3750c;
    }

    public <T> T fromJson(JsonElement jsonElement, Class<T> cls) {
        return Primitives.wrap(cls).cast(fromJson(jsonElement, (Type) cls));
    }

    public <T> T fromJson(JsonElement jsonElement, Type type) {
        if (jsonElement == null) {
            return null;
        }
        return fromJson((JsonReader) new JsonTreeReader(jsonElement), type);
    }

    public <T> T fromJson(JsonReader jsonReader, Type type) {
        boolean isLenient = jsonReader.isLenient();
        jsonReader.setLenient(true);
        try {
            jsonReader.peek();
            T read = getAdapter(TypeToken.get(type)).read(jsonReader);
            jsonReader.setLenient(isLenient);
            return read;
        } catch (EOFException e10) {
            if (1 != 0) {
                jsonReader.setLenient(isLenient);
                return null;
            }
            throw new JsonSyntaxException((Throwable) e10);
        } catch (IllegalStateException e11) {
            throw new JsonSyntaxException((Throwable) e11);
        } catch (IOException e12) {
            throw new JsonSyntaxException((Throwable) e12);
        } catch (AssertionError e13) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.7): " + e13.getMessage());
            assertionError.initCause(e13);
            throw assertionError;
        } catch (Throwable th) {
            jsonReader.setLenient(isLenient);
            throw th;
        }
    }

    public <T> T fromJson(Reader reader, Class<T> cls) {
        JsonReader newJsonReader = newJsonReader(reader);
        T fromJson = fromJson(newJsonReader, (Type) cls);
        assertFullConsumption(fromJson, newJsonReader);
        return Primitives.wrap(cls).cast(fromJson);
    }

    public <T> T fromJson(Reader reader, Type type) {
        JsonReader newJsonReader = newJsonReader(reader);
        T fromJson = fromJson(newJsonReader, type);
        assertFullConsumption(fromJson, newJsonReader);
        return fromJson;
    }

    public <T> T fromJson(String str, Class<T> cls) {
        return Primitives.wrap(cls).cast(fromJson(str, (Type) cls));
    }

    public <T> T fromJson(String str, Type type) {
        if (str == null) {
            return null;
        }
        return fromJson((Reader) new StringReader(str), type);
    }

    public <T> TypeAdapter<T> getAdapter(TypeToken<T> typeToken) {
        Object obj;
        boolean z;
        Map<TypeToken<?>, TypeAdapter<?>> map = this.typeTokenCache;
        if (typeToken == null) {
            obj = NULL_KEY_SURROGATE;
        } else {
            obj = typeToken;
        }
        TypeAdapter<T> typeAdapter = map.get(obj);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        Map map2 = this.calls.get();
        if (map2 == null) {
            map2 = new HashMap();
            this.calls.set(map2);
            z = true;
        } else {
            z = false;
        }
        f fVar = (f) map2.get(typeToken);
        if (fVar != null) {
            return fVar;
        }
        try {
            f fVar2 = new f();
            map2.put(typeToken, fVar2);
            for (TypeAdapterFactory create : this.f3748a) {
                TypeAdapter<T> create2 = create.create(this, typeToken);
                if (create2 != null) {
                    if (fVar2.f3765a == null) {
                        fVar2.f3765a = create2;
                        this.typeTokenCache.put(typeToken, create2);
                        return create2;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (2.8.7) cannot handle " + typeToken);
        } finally {
            map2.remove(typeToken);
            if (z) {
                this.calls.remove();
            }
        }
    }

    public <T> TypeAdapter<T> getAdapter(Class<T> cls) {
        return getAdapter(TypeToken.get(cls));
    }

    public <T> TypeAdapter<T> getDelegateAdapter(TypeAdapterFactory typeAdapterFactory, TypeToken<T> typeToken) {
        List<TypeAdapterFactory> list = this.f3748a;
        if (!list.contains(typeAdapterFactory)) {
            typeAdapterFactory = this.jsonAdapterFactory;
        }
        boolean z = false;
        for (TypeAdapterFactory next : list) {
            if (z) {
                TypeAdapter<T> create = next.create(this, typeToken);
                if (create != null) {
                    return create;
                }
            } else if (next == typeAdapterFactory) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    public boolean htmlSafe() {
        return this.f3754h;
    }

    public GsonBuilder newBuilder() {
        return new GsonBuilder(this);
    }

    public JsonReader newJsonReader(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        jsonReader.setLenient(this.f3756j);
        return jsonReader;
    }

    public JsonWriter newJsonWriter(Writer writer) {
        if (this.f3753g) {
            writer.write(JSON_NON_EXECUTABLE_PREFIX);
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.f3755i) {
            jsonWriter.setIndent("  ");
        }
        jsonWriter.setSerializeNulls(this.f3751e);
        return jsonWriter;
    }

    public boolean serializeNulls() {
        return this.f3751e;
    }

    public String toJson(JsonElement jsonElement) {
        StringWriter stringWriter = new StringWriter();
        toJson(jsonElement, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    public String toJson(Object obj) {
        return obj == null ? toJson((JsonElement) JsonNull.INSTANCE) : toJson(obj, (Type) obj.getClass());
    }

    public String toJson(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        toJson(obj, type, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    public void toJson(JsonElement jsonElement, JsonWriter jsonWriter) {
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f3754h);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f3751e);
        try {
            Streams.write(jsonElement, jsonWriter);
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        } catch (IOException e10) {
            throw new JsonIOException((Throwable) e10);
        } catch (AssertionError e11) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.7): " + e11.getMessage());
            assertionError.initCause(e11);
            throw assertionError;
        } catch (Throwable th) {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th;
        }
    }

    public void toJson(JsonElement jsonElement, Appendable appendable) {
        try {
            toJson(jsonElement, newJsonWriter(Streams.writerForAppendable(appendable)));
        } catch (IOException e10) {
            throw new JsonIOException((Throwable) e10);
        }
    }

    public void toJson(Object obj, Appendable appendable) {
        if (obj != null) {
            toJson(obj, (Type) obj.getClass(), appendable);
        } else {
            toJson((JsonElement) JsonNull.INSTANCE, appendable);
        }
    }

    public void toJson(Object obj, Type type, JsonWriter jsonWriter) {
        TypeAdapter<?> adapter = getAdapter(TypeToken.get(type));
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f3754h);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f3751e);
        try {
            adapter.write(jsonWriter, obj);
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        } catch (IOException e10) {
            throw new JsonIOException((Throwable) e10);
        } catch (AssertionError e11) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.7): " + e11.getMessage());
            assertionError.initCause(e11);
            throw assertionError;
        } catch (Throwable th) {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th;
        }
    }

    public void toJson(Object obj, Type type, Appendable appendable) {
        try {
            toJson(obj, type, newJsonWriter(Streams.writerForAppendable(appendable)));
        } catch (IOException e10) {
            throw new JsonIOException((Throwable) e10);
        }
    }

    public JsonElement toJsonTree(Object obj) {
        return obj == null ? JsonNull.INSTANCE : toJsonTree(obj, obj.getClass());
    }

    public JsonElement toJsonTree(Object obj, Type type) {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        toJson(obj, type, (JsonWriter) jsonTreeWriter);
        return jsonTreeWriter.get();
    }

    public String toString() {
        return "{serializeNulls:" + this.f3751e + ",factories:" + this.f3748a + ",instanceCreators:" + this.constructorConstructor + "}";
    }
}

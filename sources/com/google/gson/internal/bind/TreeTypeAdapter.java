package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;

public final class TreeTypeAdapter<T> extends TypeAdapter<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Gson f3851a;
    private final TreeTypeAdapter<T>.a context = new a();
    private TypeAdapter<T> delegate;
    private final JsonDeserializer<T> deserializer;
    private final JsonSerializer<T> serializer;
    private final TypeAdapterFactory skipPast;
    private final TypeToken<T> typeToken;

    public final class a implements JsonSerializationContext, JsonDeserializationContext {
        public a() {
        }

        public final <R> R deserialize(JsonElement jsonElement, Type type) {
            return TreeTypeAdapter.this.f3851a.fromJson(jsonElement, type);
        }

        public final JsonElement serialize(Object obj) {
            return TreeTypeAdapter.this.f3851a.toJsonTree(obj);
        }

        public final JsonElement serialize(Object obj, Type type) {
            return TreeTypeAdapter.this.f3851a.toJsonTree(obj, type);
        }
    }

    public static final class b implements TypeAdapterFactory {

        /* renamed from: o  reason: collision with root package name */
        public final TypeToken<?> f3853o;

        /* renamed from: p  reason: collision with root package name */
        public final boolean f3854p;

        /* renamed from: q  reason: collision with root package name */
        public final Class<?> f3855q;

        /* renamed from: r  reason: collision with root package name */
        public final JsonSerializer<?> f3856r;

        /* renamed from: s  reason: collision with root package name */
        public final JsonDeserializer<?> f3857s;

        public b(Object obj, TypeToken<?> typeToken, boolean z, Class<?> cls) {
            JsonDeserializer<?> jsonDeserializer = null;
            JsonSerializer<?> jsonSerializer = obj instanceof JsonSerializer ? (JsonSerializer) obj : null;
            this.f3856r = jsonSerializer;
            jsonDeserializer = obj instanceof JsonDeserializer ? (JsonDeserializer) obj : jsonDeserializer;
            this.f3857s = jsonDeserializer;
            C$Gson$Preconditions.checkArgument((jsonSerializer == null && jsonDeserializer == null) ? false : true);
            this.f3853o = typeToken;
            this.f3854p = z;
            this.f3855q = cls;
        }

        public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            TypeToken<?> typeToken2 = this.f3853o;
            if (typeToken2 != null ? typeToken2.equals(typeToken) || (this.f3854p && typeToken2.getType() == typeToken.getRawType()) : this.f3855q.isAssignableFrom(typeToken.getRawType())) {
                return new TreeTypeAdapter(this.f3856r, this.f3857s, gson, typeToken, this);
            }
            return null;
        }
    }

    public TreeTypeAdapter(JsonSerializer<T> jsonSerializer, JsonDeserializer<T> jsonDeserializer, Gson gson, TypeToken<T> typeToken2, TypeAdapterFactory typeAdapterFactory) {
        this.serializer = jsonSerializer;
        this.deserializer = jsonDeserializer;
        this.f3851a = gson;
        this.typeToken = typeToken2;
        this.skipPast = typeAdapterFactory;
    }

    private TypeAdapter<T> delegate() {
        TypeAdapter<T> typeAdapter = this.delegate;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter<T> delegateAdapter = this.f3851a.getDelegateAdapter(this.skipPast, this.typeToken);
        this.delegate = delegateAdapter;
        return delegateAdapter;
    }

    public static TypeAdapterFactory newFactory(TypeToken<?> typeToken2, Object obj) {
        return new b(obj, typeToken2, false, (Class<?>) null);
    }

    public static TypeAdapterFactory newFactoryWithMatchRawType(TypeToken<?> typeToken2, Object obj) {
        return new b(obj, typeToken2, typeToken2.getType() == typeToken2.getRawType(), (Class<?>) null);
    }

    public static TypeAdapterFactory newTypeHierarchyFactory(Class<?> cls, Object obj) {
        return new b(obj, (TypeToken<?>) null, false, cls);
    }

    public T read(JsonReader jsonReader) {
        if (this.deserializer == null) {
            return delegate().read(jsonReader);
        }
        JsonElement parse = Streams.parse(jsonReader);
        if (parse.isJsonNull()) {
            return null;
        }
        return this.deserializer.deserialize(parse, this.typeToken.getType(), this.context);
    }

    public void write(JsonWriter jsonWriter, T t10) {
        JsonSerializer<T> jsonSerializer = this.serializer;
        if (jsonSerializer == null) {
            delegate().write(jsonWriter, t10);
        } else if (t10 == null) {
            jsonWriter.nullValue();
        } else {
            Streams.write(jsonSerializer.serialize(t10, this.typeToken.getType(), this.context), jsonWriter);
        }
    }
}

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public final class a<T> extends TypeAdapter<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Gson f3876a;

    /* renamed from: b  reason: collision with root package name */
    public final TypeAdapter<T> f3877b;

    /* renamed from: c  reason: collision with root package name */
    public final Type f3878c;

    public a(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.f3876a = gson;
        this.f3877b = typeAdapter;
        this.f3878c = type;
    }

    public final T read(JsonReader jsonReader) {
        return this.f3877b.read(jsonReader);
    }

    public final void write(JsonWriter jsonWriter, T t10) {
        Type type;
        Type type2 = this.f3878c;
        if (t10 == null || (type2 != Object.class && !(type2 instanceof TypeVariable) && !(type2 instanceof Class))) {
            type = type2;
        } else {
            type = t10.getClass();
        }
        TypeAdapter<T> typeAdapter = this.f3877b;
        if (type != type2) {
            TypeAdapter<?> adapter = this.f3876a.getAdapter(TypeToken.get(type));
            if (!(adapter instanceof ReflectiveTypeAdapterFactory.Adapter) || (typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                typeAdapter = adapter;
            }
        }
        typeAdapter.write(jsonWriter, t10);
    }
}

package com.google.gson;

import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

public abstract class TypeAdapter<T> {

    public class a extends TypeAdapter<T> {
        public a() {
        }

        public final T read(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return TypeAdapter.this.read(jsonReader);
            }
            jsonReader.nextNull();
            return null;
        }

        public final void write(JsonWriter jsonWriter, T t10) {
            if (t10 == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter.this.write(jsonWriter, t10);
            }
        }
    }

    public final T fromJson(Reader reader) {
        return read(new JsonReader(reader));
    }

    public final T fromJson(String str) {
        return fromJson((Reader) new StringReader(str));
    }

    public final T fromJsonTree(JsonElement jsonElement) {
        try {
            return read(new JsonTreeReader(jsonElement));
        } catch (IOException e10) {
            throw new JsonIOException((Throwable) e10);
        }
    }

    public final TypeAdapter<T> nullSafe() {
        return new a();
    }

    public abstract T read(JsonReader jsonReader);

    public final String toJson(T t10) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t10);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void toJson(Writer writer, T t10) {
        write(new JsonWriter(writer), t10);
    }

    public final JsonElement toJsonTree(T t10) {
        try {
            JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
            write(jsonTreeWriter, t10);
            return jsonTreeWriter.get();
        } catch (IOException e10) {
            throw new JsonIOException((Throwable) e10);
        }
    }

    public abstract void write(JsonWriter jsonWriter, T t10);
}

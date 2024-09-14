package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public final class JsonParser {
    public static JsonElement parseReader(JsonReader jsonReader) {
        boolean isLenient = jsonReader.isLenient();
        jsonReader.setLenient(true);
        try {
            JsonElement parse = Streams.parse(jsonReader);
            jsonReader.setLenient(isLenient);
            return parse;
        } catch (StackOverflowError e10) {
            throw new JsonParseException("Failed parsing JSON source: " + jsonReader + " to Json", e10);
        } catch (OutOfMemoryError e11) {
            throw new JsonParseException("Failed parsing JSON source: " + jsonReader + " to Json", e11);
        } catch (Throwable th) {
            jsonReader.setLenient(isLenient);
            throw th;
        }
    }

    public static JsonElement parseReader(Reader reader) {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            JsonElement parseReader = parseReader(jsonReader);
            if (!parseReader.isJsonNull()) {
                if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                    throw new JsonSyntaxException("Did not consume the entire document.");
                }
            }
            return parseReader;
        } catch (MalformedJsonException e10) {
            throw new JsonSyntaxException((Throwable) e10);
        } catch (IOException e11) {
            throw new JsonIOException((Throwable) e11);
        } catch (NumberFormatException e12) {
            throw new JsonSyntaxException((Throwable) e12);
        }
    }

    public static JsonElement parseString(String str) {
        return parseReader((Reader) new StringReader(str));
    }

    @Deprecated
    public JsonElement parse(JsonReader jsonReader) {
        return parseReader(jsonReader);
    }

    @Deprecated
    public JsonElement parse(Reader reader) {
        return parseReader(reader);
    }

    @Deprecated
    public JsonElement parse(String str) {
        return parseString(str);
    }
}
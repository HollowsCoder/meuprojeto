package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class JsonTreeReader extends JsonReader {
    private static final Object SENTINEL_CLOSED = new Object();
    private static final Reader UNREADABLE_READER = new a();
    private int[] pathIndices = new int[32];
    private String[] pathNames = new String[32];
    private Object[] stack = new Object[32];
    private int stackSize = 0;

    public class a extends Reader {
        public final void close() {
            throw new AssertionError();
        }

        public final int read(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public JsonTreeReader(JsonElement jsonElement) {
        super(UNREADABLE_READER);
        push(jsonElement);
    }

    private void expect(JsonToken jsonToken) {
        if (peek() != jsonToken) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
        }
    }

    private String locationString() {
        return " at path " + getPath();
    }

    private Object peekStack() {
        return this.stack[this.stackSize - 1];
    }

    private Object popStack() {
        Object[] objArr = this.stack;
        int i10 = this.stackSize - 1;
        this.stackSize = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    private void push(Object obj) {
        int i10 = this.stackSize;
        Object[] objArr = this.stack;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.stack = Arrays.copyOf(objArr, i11);
            this.pathIndices = Arrays.copyOf(this.pathIndices, i11);
            this.pathNames = (String[]) Arrays.copyOf(this.pathNames, i11);
        }
        Object[] objArr2 = this.stack;
        int i12 = this.stackSize;
        this.stackSize = i12 + 1;
        objArr2[i12] = obj;
    }

    public void beginArray() {
        expect(JsonToken.BEGIN_ARRAY);
        push(((JsonArray) peekStack()).iterator());
        this.pathIndices[this.stackSize - 1] = 0;
    }

    public void beginObject() {
        expect(JsonToken.BEGIN_OBJECT);
        push(((JsonObject) peekStack()).entrySet().iterator());
    }

    public void close() {
        this.stack = new Object[]{SENTINEL_CLOSED};
        this.stackSize = 1;
    }

    public void endArray() {
        expect(JsonToken.END_ARRAY);
        popStack();
        popStack();
        int i10 = this.stackSize;
        if (i10 > 0) {
            int[] iArr = this.pathIndices;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public void endObject() {
        expect(JsonToken.END_OBJECT);
        popStack();
        popStack();
        int i10 = this.stackSize;
        if (i10 > 0) {
            int[] iArr = this.pathIndices;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public String getPath() {
        StringBuilder sb = new StringBuilder("$");
        int i10 = 0;
        while (i10 < this.stackSize) {
            Object[] objArr = this.stack;
            Object obj = objArr[i10];
            if (obj instanceof JsonArray) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.pathIndices[i10]);
                    sb.append(']');
                }
            } else if (obj instanceof JsonObject) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    sb.append('.');
                    String str = this.pathNames[i10];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            }
            i10++;
        }
        return sb.toString();
    }

    public boolean hasNext() {
        JsonToken peek = peek();
        return (peek == JsonToken.END_OBJECT || peek == JsonToken.END_ARRAY) ? false : true;
    }

    public boolean nextBoolean() {
        expect(JsonToken.BOOLEAN);
        boolean asBoolean = ((JsonPrimitive) popStack()).getAsBoolean();
        int i10 = this.stackSize;
        if (i10 > 0) {
            int[] iArr = this.pathIndices;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return asBoolean;
    }

    public double nextDouble() {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek == jsonToken || peek == JsonToken.STRING) {
            double asDouble = ((JsonPrimitive) peekStack()).getAsDouble();
            if (isLenient() || (!Double.isNaN(asDouble) && !Double.isInfinite(asDouble))) {
                popStack();
                int i10 = this.stackSize;
                if (i10 > 0) {
                    int[] iArr = this.pathIndices;
                    int i11 = i10 - 1;
                    iArr[i11] = iArr[i11] + 1;
                }
                return asDouble;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + asDouble);
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
    }

    public int nextInt() {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek == jsonToken || peek == JsonToken.STRING) {
            int asInt = ((JsonPrimitive) peekStack()).getAsInt();
            popStack();
            int i10 = this.stackSize;
            if (i10 > 0) {
                int[] iArr = this.pathIndices;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return asInt;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
    }

    public long nextLong() {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek == jsonToken || peek == JsonToken.STRING) {
            long asLong = ((JsonPrimitive) peekStack()).getAsLong();
            popStack();
            int i10 = this.stackSize;
            if (i10 > 0) {
                int[] iArr = this.pathIndices;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return asLong;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
    }

    public String nextName() {
        expect(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) peekStack()).next();
        String str = (String) entry.getKey();
        this.pathNames[this.stackSize - 1] = str;
        push(entry.getValue());
        return str;
    }

    public void nextNull() {
        expect(JsonToken.NULL);
        popStack();
        int i10 = this.stackSize;
        if (i10 > 0) {
            int[] iArr = this.pathIndices;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public String nextString() {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (peek == jsonToken || peek == JsonToken.NUMBER) {
            String asString = ((JsonPrimitive) popStack()).getAsString();
            int i10 = this.stackSize;
            if (i10 > 0) {
                int[] iArr = this.pathIndices;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return asString;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
    }

    public JsonToken peek() {
        if (this.stackSize == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object peekStack = peekStack();
        if (peekStack instanceof Iterator) {
            boolean z = this.stack[this.stackSize - 2] instanceof JsonObject;
            Iterator it = (Iterator) peekStack;
            if (!it.hasNext()) {
                return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z) {
                return JsonToken.NAME;
            }
            push(it.next());
            return peek();
        } else if (peekStack instanceof JsonObject) {
            return JsonToken.BEGIN_OBJECT;
        } else {
            if (peekStack instanceof JsonArray) {
                return JsonToken.BEGIN_ARRAY;
            }
            if (peekStack instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) peekStack;
                if (jsonPrimitive.isString()) {
                    return JsonToken.STRING;
                }
                if (jsonPrimitive.isBoolean()) {
                    return JsonToken.BOOLEAN;
                }
                if (jsonPrimitive.isNumber()) {
                    return JsonToken.NUMBER;
                }
                throw new AssertionError();
            } else if (peekStack instanceof JsonNull) {
                return JsonToken.NULL;
            } else {
                if (peekStack == SENTINEL_CLOSED) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public void promoteNameToValue() {
        expect(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) peekStack()).next();
        push(entry.getValue());
        push(new JsonPrimitive((String) entry.getKey()));
    }

    public void skipValue() {
        if (peek() == JsonToken.NAME) {
            nextName();
            this.pathNames[this.stackSize - 2] = "null";
        } else {
            popStack();
            int i10 = this.stackSize;
            if (i10 > 0) {
                this.pathNames[i10 - 1] = "null";
            }
        }
        int i11 = this.stackSize;
        if (i11 > 0) {
            int[] iArr = this.pathIndices;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    public String toString() {
        return "JsonTreeReader";
    }
}

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

public final class MapTypeAdapterFactory implements TypeAdapterFactory {
    private final ConstructorConstructor constructorConstructor;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f3838o;

    public final class a<K, V> extends TypeAdapter<Map<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        public final a f3839a;

        /* renamed from: b  reason: collision with root package name */
        public final a f3840b;

        /* renamed from: c  reason: collision with root package name */
        public final ObjectConstructor<? extends Map<K, V>> f3841c;

        public a(Gson gson, Type type, TypeAdapter<K> typeAdapter, Type type2, TypeAdapter<V> typeAdapter2, ObjectConstructor<? extends Map<K, V>> objectConstructor) {
            this.f3839a = new a(gson, typeAdapter, type);
            this.f3840b = new a(gson, typeAdapter2, type2);
            this.f3841c = objectConstructor;
        }

        public final Object read(JsonReader jsonReader) {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map map = (Map) this.f3841c.construct();
            JsonToken jsonToken = JsonToken.BEGIN_ARRAY;
            a aVar = this.f3840b;
            a aVar2 = this.f3839a;
            if (peek == jsonToken) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    Object read = aVar2.read(jsonReader);
                    if (map.put(read, aVar.read(jsonReader)) == null) {
                        jsonReader.endArray();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + read);
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(jsonReader);
                    Object read2 = aVar2.read(jsonReader);
                    if (map.put(read2, aVar.read(jsonReader)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + read2);
                    }
                }
                jsonReader.endObject();
            }
            return map;
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            String str;
            boolean z;
            Map map = (Map) obj;
            if (map == null) {
                jsonWriter.nullValue();
                return;
            }
            boolean z10 = MapTypeAdapterFactory.this.f3838o;
            a aVar = this.f3840b;
            if (!z10) {
                jsonWriter.beginObject();
                for (Map.Entry entry : map.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    aVar.write(jsonWriter, entry.getValue());
                }
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i10 = 0;
                boolean z11 = false;
                for (Map.Entry entry2 : map.entrySet()) {
                    JsonElement jsonTree = this.f3839a.toJsonTree(entry2.getKey());
                    arrayList.add(jsonTree);
                    arrayList2.add(entry2.getValue());
                    if (jsonTree.isJsonArray() || jsonTree.isJsonObject()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z11 |= z;
                }
                if (z11) {
                    jsonWriter.beginArray();
                    int size = arrayList.size();
                    while (i10 < size) {
                        jsonWriter.beginArray();
                        Streams.write((JsonElement) arrayList.get(i10), jsonWriter);
                        aVar.write(jsonWriter, arrayList2.get(i10));
                        jsonWriter.endArray();
                        i10++;
                    }
                    jsonWriter.endArray();
                    return;
                }
                jsonWriter.beginObject();
                int size2 = arrayList.size();
                while (i10 < size2) {
                    JsonElement jsonElement = (JsonElement) arrayList.get(i10);
                    if (jsonElement.isJsonPrimitive()) {
                        JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
                        if (asJsonPrimitive.isNumber()) {
                            str = String.valueOf(asJsonPrimitive.getAsNumber());
                        } else if (asJsonPrimitive.isBoolean()) {
                            str = Boolean.toString(asJsonPrimitive.getAsBoolean());
                        } else if (asJsonPrimitive.isString()) {
                            str = asJsonPrimitive.getAsString();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (jsonElement.isJsonNull()) {
                        str = "null";
                    } else {
                        throw new AssertionError();
                    }
                    jsonWriter.name(str);
                    aVar.write(jsonWriter, arrayList2.get(i10));
                    i10++;
                }
            }
            jsonWriter.endObject();
        }
    }

    public MapTypeAdapterFactory(ConstructorConstructor constructorConstructor2, boolean z) {
        this.constructorConstructor = constructorConstructor2;
        this.f3838o = z;
    }

    private TypeAdapter<?> getKeyAdapter(Gson gson, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.BOOLEAN_AS_STRING : gson.getAdapter(TypeToken.get(type));
    }

    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        if (!Map.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        Type[] mapKeyAndValueTypes = C$Gson$Types.getMapKeyAndValueTypes(type, C$Gson$Types.getRawType(type));
        return new a(gson, mapKeyAndValueTypes[0], getKeyAdapter(gson, mapKeyAndValueTypes[0]), mapKeyAndValueTypes[1], gson.getAdapter(TypeToken.get(mapKeyAndValueTypes[1])), this.constructorConstructor.get(typeToken));
    }
}

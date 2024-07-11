package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class TypeAdapters {
    public static final TypeAdapter<AtomicBoolean> ATOMIC_BOOLEAN;
    public static final TypeAdapterFactory ATOMIC_BOOLEAN_FACTORY;
    public static final TypeAdapter<AtomicInteger> ATOMIC_INTEGER;
    public static final TypeAdapter<AtomicIntegerArray> ATOMIC_INTEGER_ARRAY;
    public static final TypeAdapterFactory ATOMIC_INTEGER_ARRAY_FACTORY;
    public static final TypeAdapterFactory ATOMIC_INTEGER_FACTORY;
    public static final TypeAdapter<BigDecimal> BIG_DECIMAL = new h();
    public static final TypeAdapter<BigInteger> BIG_INTEGER = new i();
    public static final TypeAdapter<BitSet> BIT_SET;
    public static final TypeAdapterFactory BIT_SET_FACTORY;
    public static final TypeAdapter<Boolean> BOOLEAN;
    public static final TypeAdapter<Boolean> BOOLEAN_AS_STRING = new e0();
    public static final TypeAdapterFactory BOOLEAN_FACTORY;
    public static final TypeAdapter<Number> BYTE;
    public static final TypeAdapterFactory BYTE_FACTORY;
    public static final TypeAdapter<Calendar> CALENDAR;
    public static final TypeAdapterFactory CALENDAR_FACTORY;
    public static final TypeAdapter<Character> CHARACTER;
    public static final TypeAdapterFactory CHARACTER_FACTORY;
    public static final TypeAdapter<Class> CLASS;
    public static final TypeAdapterFactory CLASS_FACTORY;
    public static final TypeAdapter<Currency> CURRENCY;
    public static final TypeAdapterFactory CURRENCY_FACTORY;
    public static final TypeAdapter<Number> DOUBLE = new d();
    public static final TypeAdapterFactory ENUM_FACTORY = new w();
    public static final TypeAdapter<Number> FLOAT = new c();
    public static final TypeAdapter<InetAddress> INET_ADDRESS;
    public static final TypeAdapterFactory INET_ADDRESS_FACTORY;
    public static final TypeAdapter<Number> INTEGER;
    public static final TypeAdapterFactory INTEGER_FACTORY;
    public static final TypeAdapter<JsonElement> JSON_ELEMENT;
    public static final TypeAdapterFactory JSON_ELEMENT_FACTORY;
    public static final TypeAdapter<Locale> LOCALE;
    public static final TypeAdapterFactory LOCALE_FACTORY;
    public static final TypeAdapter<Number> LONG = new b();
    public static final TypeAdapter<Number> NUMBER;
    public static final TypeAdapterFactory NUMBER_FACTORY;
    public static final TypeAdapter<Number> SHORT;
    public static final TypeAdapterFactory SHORT_FACTORY;
    public static final TypeAdapter<String> STRING;
    public static final TypeAdapter<StringBuffer> STRING_BUFFER;
    public static final TypeAdapterFactory STRING_BUFFER_FACTORY;
    public static final TypeAdapter<StringBuilder> STRING_BUILDER;
    public static final TypeAdapterFactory STRING_BUILDER_FACTORY;
    public static final TypeAdapterFactory STRING_FACTORY;
    public static final TypeAdapterFactory TIMESTAMP_FACTORY = new r();
    public static final TypeAdapter<URI> URI;
    public static final TypeAdapterFactory URI_FACTORY;
    public static final TypeAdapter<URL> URL;
    public static final TypeAdapterFactory URL_FACTORY;
    public static final TypeAdapter<UUID> UUID;
    public static final TypeAdapterFactory UUID_FACTORY;

    public class a extends TypeAdapter<AtomicIntegerArray> {
        public final Object read(JsonReader jsonReader) {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                try {
                    arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException((Throwable) e10);
                }
            }
            jsonReader.endArray();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            jsonWriter.beginArray();
            int length = atomicIntegerArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                jsonWriter.value((long) atomicIntegerArray.get(i10));
            }
            jsonWriter.endArray();
        }
    }

    public class a0 implements TypeAdapterFactory {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ Class f3858o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ Class f3859p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ TypeAdapter f3860q;

        public a0(Class cls, Class cls2, TypeAdapter typeAdapter) {
            this.f3858o = cls;
            this.f3859p = cls2;
            this.f3860q = typeAdapter;
        }

        public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            Class<? super T> rawType = typeToken.getRawType();
            if (rawType == this.f3858o || rawType == this.f3859p) {
                return this.f3860q;
            }
            return null;
        }

        public final String toString() {
            return "Factory[type=" + this.f3858o.getName() + "+" + this.f3859p.getName() + ",adapter=" + this.f3860q + "]";
        }
    }

    public class b extends TypeAdapter<Number> {
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Long.valueOf(jsonReader.nextLong());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException((Throwable) e10);
            }
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            jsonWriter.value((Number) obj);
        }
    }

    public class b0 implements TypeAdapterFactory {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ Class f3861o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ TypeAdapter f3862p;

        public class a extends TypeAdapter<T1> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Class f3863a;

            public a(Class cls) {
                this.f3863a = cls;
            }

            public final T1 read(JsonReader jsonReader) {
                T1 read = b0.this.f3862p.read(jsonReader);
                if (read != null) {
                    Class cls = this.f3863a;
                    if (!cls.isInstance(read)) {
                        throw new JsonSyntaxException("Expected a " + cls.getName() + " but was " + read.getClass().getName());
                    }
                }
                return read;
            }

            public final void write(JsonWriter jsonWriter, T1 t12) {
                b0.this.f3862p.write(jsonWriter, t12);
            }
        }

        public b0(Class cls, TypeAdapter typeAdapter) {
            this.f3861o = cls;
            this.f3862p = typeAdapter;
        }

        public final <T2> TypeAdapter<T2> create(Gson gson, TypeToken<T2> typeToken) {
            Class<? super T2> rawType = typeToken.getRawType();
            if (!this.f3861o.isAssignableFrom(rawType)) {
                return null;
            }
            return new a(rawType);
        }

        public final String toString() {
            return "Factory[typeHierarchy=" + this.f3861o.getName() + ",adapter=" + this.f3862p + "]";
        }
    }

    public class c extends TypeAdapter<Number> {
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Float.valueOf((float) jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            jsonWriter.value((Number) obj);
        }
    }

    public static /* synthetic */ class c0 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3865a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3865a = r0
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3865a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3865a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3865a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f3865a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f3865a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f3865a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f3865a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NAME     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f3865a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f3865a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.c0.<clinit>():void");
        }
    }

    public class d extends TypeAdapter<Number> {
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Double.valueOf(jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            jsonWriter.value((Number) obj);
        }
    }

    public class d0 extends TypeAdapter<Boolean> {
        public final Object read(JsonReader jsonReader) {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Boolean.valueOf(peek == JsonToken.STRING ? Boolean.parseBoolean(jsonReader.nextString()) : jsonReader.nextBoolean());
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            jsonWriter.value((Boolean) obj);
        }
    }

    public class e extends TypeAdapter<Number> {
        public final Object read(JsonReader jsonReader) {
            JsonToken peek = jsonReader.peek();
            int i10 = c0.f3865a[peek.ordinal()];
            if (i10 == 1 || i10 == 3) {
                return new LazilyParsedNumber(jsonReader.nextString());
            }
            if (i10 == 4) {
                jsonReader.nextNull();
                return null;
            }
            throw new JsonSyntaxException("Expecting number, got: " + peek);
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            jsonWriter.value((Number) obj);
        }
    }

    public class e0 extends TypeAdapter<Boolean> {
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Boolean.valueOf(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            String str;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                str = "null";
            } else {
                str = bool.toString();
            }
            jsonWriter.value(str);
        }
    }

    public class f extends TypeAdapter<Character> {
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String nextString = jsonReader.nextString();
            if (nextString.length() == 1) {
                return Character.valueOf(nextString.charAt(0));
            }
            throw new JsonSyntaxException("Expecting character, got: ".concat(nextString));
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            String str;
            Character ch = (Character) obj;
            if (ch == null) {
                str = null;
            } else {
                str = String.valueOf(ch);
            }
            jsonWriter.value(str);
        }
    }

    public class f0 extends TypeAdapter<Number> {
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Byte.valueOf((byte) jsonReader.nextInt());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException((Throwable) e10);
            }
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            jsonWriter.value((Number) obj);
        }
    }

    public class g extends TypeAdapter<String> {
        public final Object read(JsonReader jsonReader) {
            JsonToken peek = jsonReader.peek();
            if (peek != JsonToken.NULL) {
                return peek == JsonToken.BOOLEAN ? Boolean.toString(jsonReader.nextBoolean()) : jsonReader.nextString();
            }
            jsonReader.nextNull();
            return null;
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            jsonWriter.value((String) obj);
        }
    }

    public class g0 extends TypeAdapter<Number> {
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Short.valueOf((short) jsonReader.nextInt());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException((Throwable) e10);
            }
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            jsonWriter.value((Number) obj);
        }
    }

    public class h extends TypeAdapter<BigDecimal> {
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigDecimal(jsonReader.nextString());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException((Throwable) e10);
            }
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            jsonWriter.value((Number) (BigDecimal) obj);
        }
    }

    public class h0 extends TypeAdapter<Number> {
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Integer.valueOf(jsonReader.nextInt());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException((Throwable) e10);
            }
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            jsonWriter.value((Number) obj);
        }
    }

    public class i extends TypeAdapter<BigInteger> {
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigInteger(jsonReader.nextString());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException((Throwable) e10);
            }
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            jsonWriter.value((Number) (BigInteger) obj);
        }
    }

    public class i0 extends TypeAdapter<AtomicInteger> {
        public final Object read(JsonReader jsonReader) {
            try {
                return new AtomicInteger(jsonReader.nextInt());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException((Throwable) e10);
            }
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            jsonWriter.value((long) ((AtomicInteger) obj).get());
        }
    }

    public class j extends TypeAdapter<StringBuilder> {
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return new StringBuilder(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            String str;
            StringBuilder sb = (StringBuilder) obj;
            if (sb == null) {
                str = null;
            } else {
                str = sb.toString();
            }
            jsonWriter.value(str);
        }
    }

    public class j0 extends TypeAdapter<AtomicBoolean> {
        public final Object read(JsonReader jsonReader) {
            return new AtomicBoolean(jsonReader.nextBoolean());
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            jsonWriter.value(((AtomicBoolean) obj).get());
        }
    }

    public class k extends TypeAdapter<Class> {
        public final Object read(JsonReader jsonReader) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
        }
    }

    public static final class k0<T extends Enum<T>> extends TypeAdapter<T> {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f3866a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final HashMap f3867b = new HashMap();

        public k0(Class<T> cls) {
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    SerializedName serializedName = (SerializedName) cls.getField(name).getAnnotation(SerializedName.class);
                    if (serializedName != null) {
                        name = serializedName.value();
                        for (String put : serializedName.alternate()) {
                            this.f3866a.put(put, enumR);
                        }
                    }
                    this.f3866a.put(name, enumR);
                    this.f3867b.put(enumR, name);
                }
            } catch (NoSuchFieldException e10) {
                throw new AssertionError(e10);
            }
        }

        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return (Enum) this.f3866a.get(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            String str;
            Enum enumR = (Enum) obj;
            if (enumR == null) {
                str = null;
            } else {
                str = (String) this.f3867b.get(enumR);
            }
            jsonWriter.value(str);
        }
    }

    public class l extends TypeAdapter<StringBuffer> {
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return new StringBuffer(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            String str;
            StringBuffer stringBuffer = (StringBuffer) obj;
            if (stringBuffer == null) {
                str = null;
            } else {
                str = stringBuffer.toString();
            }
            jsonWriter.value(str);
        }
    }

    public class m extends TypeAdapter<URL> {
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String nextString = jsonReader.nextString();
            if ("null".equals(nextString)) {
                return null;
            }
            return new URL(nextString);
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            String str;
            URL url = (URL) obj;
            if (url == null) {
                str = null;
            } else {
                str = url.toExternalForm();
            }
            jsonWriter.value(str);
        }
    }

    public class n extends TypeAdapter<URI> {
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                String nextString = jsonReader.nextString();
                if ("null".equals(nextString)) {
                    return null;
                }
                return new URI(nextString);
            } catch (URISyntaxException e10) {
                throw new JsonIOException((Throwable) e10);
            }
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            String str;
            URI uri = (URI) obj;
            if (uri == null) {
                str = null;
            } else {
                str = uri.toASCIIString();
            }
            jsonWriter.value(str);
        }
    }

    public class o extends TypeAdapter<InetAddress> {
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return InetAddress.getByName(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            String str;
            InetAddress inetAddress = (InetAddress) obj;
            if (inetAddress == null) {
                str = null;
            } else {
                str = inetAddress.getHostAddress();
            }
            jsonWriter.value(str);
        }
    }

    public class p extends TypeAdapter<UUID> {
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return UUID.fromString(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            String str;
            UUID uuid = (UUID) obj;
            if (uuid == null) {
                str = null;
            } else {
                str = uuid.toString();
            }
            jsonWriter.value(str);
        }
    }

    public class q extends TypeAdapter<Currency> {
        public final Object read(JsonReader jsonReader) {
            return Currency.getInstance(jsonReader.nextString());
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            jsonWriter.value(((Currency) obj).getCurrencyCode());
        }
    }

    public class r implements TypeAdapterFactory {

        public class a extends TypeAdapter<Timestamp> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ TypeAdapter f3868a;

            public a(TypeAdapter typeAdapter) {
                this.f3868a = typeAdapter;
            }

            public final Object read(JsonReader jsonReader) {
                Date date = (Date) this.f3868a.read(jsonReader);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            public final void write(JsonWriter jsonWriter, Object obj) {
                this.f3868a.write(jsonWriter, (Timestamp) obj);
            }
        }

        public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() != Timestamp.class) {
                return null;
            }
            return new a(gson.getAdapter(Date.class));
        }
    }

    public class s extends TypeAdapter<Calendar> {
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (jsonReader.peek() != JsonToken.END_OBJECT) {
                String nextName = jsonReader.nextName();
                int nextInt = jsonReader.nextInt();
                if ("year".equals(nextName)) {
                    i10 = nextInt;
                } else if ("month".equals(nextName)) {
                    i11 = nextInt;
                } else if ("dayOfMonth".equals(nextName)) {
                    i12 = nextInt;
                } else if ("hourOfDay".equals(nextName)) {
                    i13 = nextInt;
                } else if ("minute".equals(nextName)) {
                    i14 = nextInt;
                } else if ("second".equals(nextName)) {
                    i15 = nextInt;
                }
            }
            jsonReader.endObject();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            Calendar calendar = (Calendar) obj;
            if (calendar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("year");
            jsonWriter.value((long) calendar.get(1));
            jsonWriter.name("month");
            jsonWriter.value((long) calendar.get(2));
            jsonWriter.name("dayOfMonth");
            jsonWriter.value((long) calendar.get(5));
            jsonWriter.name("hourOfDay");
            jsonWriter.value((long) calendar.get(11));
            jsonWriter.name("minute");
            jsonWriter.value((long) calendar.get(12));
            jsonWriter.name("second");
            jsonWriter.value((long) calendar.get(13));
            jsonWriter.endObject();
        }
    }

    public class t extends TypeAdapter<Locale> {
        public final Object read(JsonReader jsonReader) {
            Locale locale;
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            if (nextToken2 == null && str == null) {
                return new Locale(nextToken);
            }
            if (str != null) {
                locale = new Locale(nextToken, nextToken2, str);
            }
            return locale;
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            String str;
            Locale locale = (Locale) obj;
            if (locale == null) {
                str = null;
            } else {
                str = locale.toString();
            }
            jsonWriter.value(str);
        }
    }

    public class u extends TypeAdapter<JsonElement> {
        public static JsonElement a(JsonReader jsonReader) {
            switch (c0.f3865a[jsonReader.peek().ordinal()]) {
                case 1:
                    return new JsonPrimitive((Number) new LazilyParsedNumber(jsonReader.nextString()));
                case 2:
                    return new JsonPrimitive(Boolean.valueOf(jsonReader.nextBoolean()));
                case 3:
                    return new JsonPrimitive(jsonReader.nextString());
                case 4:
                    jsonReader.nextNull();
                    return JsonNull.INSTANCE;
                case 5:
                    JsonArray jsonArray = new JsonArray();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonArray.add(a(jsonReader));
                    }
                    jsonReader.endArray();
                    return jsonArray;
                case 6:
                    JsonObject jsonObject = new JsonObject();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        jsonObject.add(jsonReader.nextName(), a(jsonReader));
                    }
                    jsonReader.endObject();
                    return jsonObject;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public static void b(JsonElement jsonElement, JsonWriter jsonWriter) {
            if (jsonElement == null || jsonElement.isJsonNull()) {
                jsonWriter.nullValue();
            } else if (jsonElement.isJsonPrimitive()) {
                JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
                if (asJsonPrimitive.isNumber()) {
                    jsonWriter.value(asJsonPrimitive.getAsNumber());
                } else if (asJsonPrimitive.isBoolean()) {
                    jsonWriter.value(asJsonPrimitive.getAsBoolean());
                } else {
                    jsonWriter.value(asJsonPrimitive.getAsString());
                }
            } else if (jsonElement.isJsonArray()) {
                jsonWriter.beginArray();
                Iterator<JsonElement> it = jsonElement.getAsJsonArray().iterator();
                while (it.hasNext()) {
                    b(it.next(), jsonWriter);
                }
                jsonWriter.endArray();
            } else if (jsonElement.isJsonObject()) {
                jsonWriter.beginObject();
                for (Map.Entry next : jsonElement.getAsJsonObject().entrySet()) {
                    jsonWriter.name((String) next.getKey());
                    b((JsonElement) next.getValue(), jsonWriter);
                }
                jsonWriter.endObject();
            } else {
                throw new IllegalArgumentException("Couldn't write " + jsonElement.getClass());
            }
        }

        public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
            return a(jsonReader);
        }

        public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
            b((JsonElement) obj, jsonWriter);
        }
    }

    public class v extends TypeAdapter<BitSet> {
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L_0x005b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
            if (r8.nextInt() != 0) goto L_0x005b;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0060 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object read(com.google.gson.stream.JsonReader r8) {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.beginArray()
                com.google.gson.stream.JsonToken r1 = r8.peek()
                r2 = 0
                r3 = r2
            L_0x000e:
                com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.END_ARRAY
                if (r1 == r4) goto L_0x0067
                int[] r4 = com.google.gson.internal.bind.TypeAdapters.c0.f3865a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L_0x0053
                r6 = 2
                if (r4 == r6) goto L_0x004e
                r6 = 3
                if (r4 != r6) goto L_0x003a
                java.lang.String r1 = r8.nextString()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x002e }
                if (r1 == 0) goto L_0x005a
                goto L_0x005b
            L_0x002e:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.String r0 = "Error: Expecting: bitset number value (1, 0), Found: "
                java.lang.String r0 = androidx.appcompat.widget.x0.e(r0, r1)
                r8.<init>((java.lang.String) r0)
                throw r8
            L_0x003a:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "Invalid bitset value type: "
                r0.<init>(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>((java.lang.String) r0)
                throw r8
            L_0x004e:
                boolean r5 = r8.nextBoolean()
                goto L_0x005b
            L_0x0053:
                int r1 = r8.nextInt()
                if (r1 == 0) goto L_0x005a
                goto L_0x005b
            L_0x005a:
                r5 = r2
            L_0x005b:
                if (r5 == 0) goto L_0x0060
                r0.set(r3)
            L_0x0060:
                int r3 = r3 + 1
                com.google.gson.stream.JsonToken r1 = r8.peek()
                goto L_0x000e
            L_0x0067:
                r8.endArray()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.v.read(com.google.gson.stream.JsonReader):java.lang.Object");
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            BitSet bitSet = (BitSet) obj;
            jsonWriter.beginArray();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                jsonWriter.value(bitSet.get(i10) ? 1 : 0);
            }
            jsonWriter.endArray();
        }
    }

    public class w implements TypeAdapterFactory {
        /* JADX WARNING: type inference failed for: r3v0, types: [com.google.gson.reflect.TypeToken<T>, com.google.gson.reflect.TypeToken] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson r2, com.google.gson.reflect.TypeToken<T> r3) {
            /*
                r1 = this;
                java.lang.Class r2 = r3.getRawType()
                java.lang.Class<java.lang.Enum> r3 = java.lang.Enum.class
                boolean r0 = r3.isAssignableFrom(r2)
                if (r0 == 0) goto L_0x001f
                if (r2 != r3) goto L_0x000f
                goto L_0x001f
            L_0x000f:
                boolean r3 = r2.isEnum()
                if (r3 != 0) goto L_0x0019
                java.lang.Class r2 = r2.getSuperclass()
            L_0x0019:
                com.google.gson.internal.bind.TypeAdapters$k0 r3 = new com.google.gson.internal.bind.TypeAdapters$k0
                r3.<init>(r2)
                return r3
            L_0x001f:
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.w.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken):com.google.gson.TypeAdapter");
        }
    }

    public class x implements TypeAdapterFactory {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ TypeToken f3869o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ TypeAdapter f3870p;

        public x(TypeToken typeToken, TypeAdapter typeAdapter) {
            this.f3869o = typeToken;
            this.f3870p = typeAdapter;
        }

        public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.equals(this.f3869o)) {
                return this.f3870p;
            }
            return null;
        }
    }

    public class y implements TypeAdapterFactory {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ Class f3871o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ TypeAdapter f3872p;

        public y(Class cls, TypeAdapter typeAdapter) {
            this.f3871o = cls;
            this.f3872p = typeAdapter;
        }

        public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == this.f3871o) {
                return this.f3872p;
            }
            return null;
        }

        public final String toString() {
            return "Factory[type=" + this.f3871o.getName() + ",adapter=" + this.f3872p + "]";
        }
    }

    public class z implements TypeAdapterFactory {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ Class f3873o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ Class f3874p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ TypeAdapter f3875q;

        public z(Class cls, Class cls2, TypeAdapter typeAdapter) {
            this.f3873o = cls;
            this.f3874p = cls2;
            this.f3875q = typeAdapter;
        }

        public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            Class<? super T> rawType = typeToken.getRawType();
            if (rawType == this.f3873o || rawType == this.f3874p) {
                return this.f3875q;
            }
            return null;
        }

        public final String toString() {
            return "Factory[type=" + this.f3874p.getName() + "+" + this.f3873o.getName() + ",adapter=" + this.f3875q + "]";
        }
    }

    static {
        TypeAdapter<Class> nullSafe = new k().nullSafe();
        CLASS = nullSafe;
        CLASS_FACTORY = newFactory(Class.class, nullSafe);
        TypeAdapter<BitSet> nullSafe2 = new v().nullSafe();
        BIT_SET = nullSafe2;
        BIT_SET_FACTORY = newFactory(BitSet.class, nullSafe2);
        d0 d0Var = new d0();
        BOOLEAN = d0Var;
        BOOLEAN_FACTORY = newFactory(Boolean.TYPE, Boolean.class, d0Var);
        f0 f0Var = new f0();
        BYTE = f0Var;
        BYTE_FACTORY = newFactory(Byte.TYPE, Byte.class, f0Var);
        g0 g0Var = new g0();
        SHORT = g0Var;
        SHORT_FACTORY = newFactory(Short.TYPE, Short.class, g0Var);
        h0 h0Var = new h0();
        INTEGER = h0Var;
        INTEGER_FACTORY = newFactory(Integer.TYPE, Integer.class, h0Var);
        TypeAdapter<AtomicInteger> nullSafe3 = new i0().nullSafe();
        ATOMIC_INTEGER = nullSafe3;
        ATOMIC_INTEGER_FACTORY = newFactory(AtomicInteger.class, nullSafe3);
        TypeAdapter<AtomicBoolean> nullSafe4 = new j0().nullSafe();
        ATOMIC_BOOLEAN = nullSafe4;
        ATOMIC_BOOLEAN_FACTORY = newFactory(AtomicBoolean.class, nullSafe4);
        TypeAdapter<AtomicIntegerArray> nullSafe5 = new a().nullSafe();
        ATOMIC_INTEGER_ARRAY = nullSafe5;
        ATOMIC_INTEGER_ARRAY_FACTORY = newFactory(AtomicIntegerArray.class, nullSafe5);
        e eVar = new e();
        NUMBER = eVar;
        NUMBER_FACTORY = newFactory(Number.class, eVar);
        f fVar = new f();
        CHARACTER = fVar;
        CHARACTER_FACTORY = newFactory(Character.TYPE, Character.class, fVar);
        g gVar = new g();
        STRING = gVar;
        STRING_FACTORY = newFactory(String.class, gVar);
        j jVar = new j();
        STRING_BUILDER = jVar;
        STRING_BUILDER_FACTORY = newFactory(StringBuilder.class, jVar);
        l lVar = new l();
        STRING_BUFFER = lVar;
        STRING_BUFFER_FACTORY = newFactory(StringBuffer.class, lVar);
        m mVar = new m();
        URL = mVar;
        URL_FACTORY = newFactory(URL.class, mVar);
        n nVar = new n();
        URI = nVar;
        URI_FACTORY = newFactory(URI.class, nVar);
        o oVar = new o();
        INET_ADDRESS = oVar;
        INET_ADDRESS_FACTORY = newTypeHierarchyFactory(InetAddress.class, oVar);
        p pVar = new p();
        UUID = pVar;
        UUID_FACTORY = newFactory(UUID.class, pVar);
        TypeAdapter<Currency> nullSafe6 = new q().nullSafe();
        CURRENCY = nullSafe6;
        CURRENCY_FACTORY = newFactory(Currency.class, nullSafe6);
        s sVar = new s();
        CALENDAR = sVar;
        CALENDAR_FACTORY = newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, sVar);
        t tVar = new t();
        LOCALE = tVar;
        LOCALE_FACTORY = newFactory(Locale.class, tVar);
        u uVar = new u();
        JSON_ELEMENT = uVar;
        JSON_ELEMENT_FACTORY = newTypeHierarchyFactory(JsonElement.class, uVar);
    }

    private TypeAdapters() {
        throw new UnsupportedOperationException();
    }

    public static <TT> TypeAdapterFactory newFactory(TypeToken<TT> typeToken, TypeAdapter<TT> typeAdapter) {
        return new x(typeToken, typeAdapter);
    }

    public static <TT> TypeAdapterFactory newFactory(Class<TT> cls, TypeAdapter<TT> typeAdapter) {
        return new y(cls, typeAdapter);
    }

    public static <TT> TypeAdapterFactory newFactory(Class<TT> cls, Class<TT> cls2, TypeAdapter<? super TT> typeAdapter) {
        return new z(cls, cls2, typeAdapter);
    }

    public static <TT> TypeAdapterFactory newFactoryForMultipleTypes(Class<TT> cls, Class<? extends TT> cls2, TypeAdapter<? super TT> typeAdapter) {
        return new a0(cls, cls2, typeAdapter);
    }

    public static <T1> TypeAdapterFactory newTypeHierarchyFactory(Class<T1> cls, TypeAdapter<T1> typeAdapter) {
        return new b0(cls, typeAdapter);
    }
}

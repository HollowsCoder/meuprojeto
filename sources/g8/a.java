package g8;

import com.google.gson.TypeAdapter;
import com.google.gson.internal.JavaVersion;
import com.google.gson.internal.PreJava9DateFormatProvider;
import com.google.gson.stream.JsonWriter;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public final class a extends TypeAdapter<Date> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<? extends Date> f4993a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f4994b;

    public a(int i10, int i11, Class cls) {
        ArrayList arrayList = new ArrayList();
        this.f4994b = arrayList;
        a(cls);
        this.f4993a = cls;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (JavaVersion.isJava9OrLater()) {
            arrayList.add(PreJava9DateFormatProvider.getUSDateTimeFormat(i10, i11));
        }
    }

    public a(String str, Class cls) {
        ArrayList arrayList = new ArrayList();
        this.f4994b = arrayList;
        a(cls);
        this.f4993a = cls;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    public static void a(Class cls) {
        Class cls2;
        Class cls3;
        Class<Date> cls4 = Date.class;
        if (cls != cls4 && cls != (cls2 = java.sql.Date.class) && cls != (cls3 = Timestamp.class)) {
            throw new IllegalArgumentException("Date type must be one of " + cls4 + ", " + cls3 + ", or " + cls2 + " but was " + cls);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r4 = com.google.gson.internal.bind.util.ISO8601Utils.parse(r4, new java.text.ParsePosition(0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object read(com.google.gson.stream.JsonReader r4) {
        /*
            r3 = this;
            com.google.gson.stream.JsonToken r0 = r4.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
            if (r0 != r1) goto L_0x000d
            r4.nextNull()
            r4 = 0
            goto L_0x005a
        L_0x000d:
            java.lang.String r4 = r4.nextString()
            java.util.ArrayList r0 = r3.f4994b
            monitor-enter(r0)
            java.util.ArrayList r1 = r3.f4994b     // Catch:{ all -> 0x0068 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0068 }
        L_0x001a:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0068 }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0068 }
            java.text.DateFormat r2 = (java.text.DateFormat) r2     // Catch:{ all -> 0x0068 }
            java.util.Date r4 = r2.parse(r4)     // Catch:{ ParseException -> 0x001a }
            goto L_0x0035
        L_0x002b:
            java.text.ParsePosition r1 = new java.text.ParsePosition     // Catch:{ ParseException -> 0x0061 }
            r2 = 0
            r1.<init>(r2)     // Catch:{ ParseException -> 0x0061 }
            java.util.Date r4 = com.google.gson.internal.bind.util.ISO8601Utils.parse(r4, r1)     // Catch:{ ParseException -> 0x0061 }
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x0068 }
            java.lang.Class<? extends java.util.Date> r0 = r3.f4993a
            java.lang.Class<java.util.Date> r1 = java.util.Date.class
            if (r0 != r1) goto L_0x003d
            goto L_0x005a
        L_0x003d:
            java.lang.Class<java.sql.Timestamp> r1 = java.sql.Timestamp.class
            if (r0 != r1) goto L_0x004c
            java.sql.Timestamp r0 = new java.sql.Timestamp
            long r1 = r4.getTime()
            r0.<init>(r1)
        L_0x004a:
            r4 = r0
            goto L_0x005a
        L_0x004c:
            java.lang.Class<java.sql.Date> r1 = java.sql.Date.class
            if (r0 != r1) goto L_0x005b
            java.sql.Date r0 = new java.sql.Date
            long r1 = r4.getTime()
            r0.<init>(r1)
            goto L_0x004a
        L_0x005a:
            return r4
        L_0x005b:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L_0x0061:
            r1 = move-exception
            com.google.gson.JsonSyntaxException r2 = new com.google.gson.JsonSyntaxException     // Catch:{ all -> 0x0068 }
            r2.<init>(r4, r1)     // Catch:{ all -> 0x0068 }
            throw r2     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0068 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.a.read(com.google.gson.stream.JsonReader):java.lang.Object");
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        DateFormat dateFormat = (DateFormat) this.f4994b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            sb = new StringBuilder("DefaultDateTypeAdapter(");
            str = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            sb = new StringBuilder("DefaultDateTypeAdapter(");
            str = dateFormat.getClass().getSimpleName();
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    public final void write(JsonWriter jsonWriter, Object obj) {
        Date date = (Date) obj;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this.f4994b) {
            jsonWriter.value(((DateFormat) this.f4994b.get(0)).format(date));
        }
    }
}

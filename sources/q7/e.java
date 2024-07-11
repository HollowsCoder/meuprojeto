package q7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import o7.d;
import o7.f;
import o7.g;

public final class e implements p7.a<e> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f8254e = new a();

    /* renamed from: f  reason: collision with root package name */
    public static final b f8255f = new b();

    /* renamed from: g  reason: collision with root package name */
    public static final c f8256g = new c();

    /* renamed from: h  reason: collision with root package name */
    public static final a f8257h = new a();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f8258a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f8259b;

    /* renamed from: c  reason: collision with root package name */
    public final a f8260c = f8254e;
    public boolean d = false;

    public static final class a implements f<Date> {

        /* renamed from: a  reason: collision with root package name */
        public static final SimpleDateFormat f8261a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f8261a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public final void a(Object obj, Object obj2) {
            ((g) obj2).c(f8261a.format((Date) obj));
        }
    }

    public e() {
        HashMap hashMap = new HashMap();
        this.f8258a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f8259b = hashMap2;
        Class<String> cls = String.class;
        hashMap2.put(cls, f8255f);
        hashMap.remove(cls);
        Class<Boolean> cls2 = Boolean.class;
        hashMap2.put(cls2, f8256g);
        hashMap.remove(cls2);
        Class<Date> cls3 = Date.class;
        hashMap2.put(cls3, f8257h);
        hashMap.remove(cls3);
    }

    public final p7.a a(Class cls, d dVar) {
        this.f8258a.put(cls, dVar);
        this.f8259b.remove(cls);
        return this;
    }
}

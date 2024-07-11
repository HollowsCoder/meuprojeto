package s2;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final b f8621a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final c f8622b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final e f8623c = new e();

    public class a extends l {
        public final boolean a() {
            return true;
        }

        public final boolean b() {
            return true;
        }

        public final boolean c(q2.a aVar) {
            return aVar == q2.a.REMOTE;
        }

        public final boolean d(boolean z, q2.a aVar, q2.c cVar) {
            return (aVar == q2.a.RESOURCE_DISK_CACHE || aVar == q2.a.MEMORY_CACHE) ? false : true;
        }
    }

    public class b extends l {
        public final boolean a() {
            return false;
        }

        public final boolean b() {
            return false;
        }

        public final boolean c(q2.a aVar) {
            return false;
        }

        public final boolean d(boolean z, q2.a aVar, q2.c cVar) {
            return false;
        }
    }

    public class c extends l {
        public final boolean a() {
            return true;
        }

        public final boolean b() {
            return false;
        }

        public final boolean c(q2.a aVar) {
            return (aVar == q2.a.DATA_DISK_CACHE || aVar == q2.a.MEMORY_CACHE) ? false : true;
        }

        public final boolean d(boolean z, q2.a aVar, q2.c cVar) {
            return false;
        }
    }

    public class d extends l {
        public final boolean a() {
            return false;
        }

        public final boolean b() {
            return true;
        }

        public final boolean c(q2.a aVar) {
            return false;
        }

        public final boolean d(boolean z, q2.a aVar, q2.c cVar) {
            return (aVar == q2.a.RESOURCE_DISK_CACHE || aVar == q2.a.MEMORY_CACHE) ? false : true;
        }
    }

    public class e extends l {
        public final boolean a() {
            return true;
        }

        public final boolean b() {
            return true;
        }

        public final boolean c(q2.a aVar) {
            return aVar == q2.a.REMOTE;
        }

        public final boolean d(boolean z, q2.a aVar, q2.c cVar) {
            return ((z && aVar == q2.a.DATA_DISK_CACHE) || aVar == q2.a.LOCAL) && cVar == q2.c.TRANSFORMED;
        }
    }

    static {
        new a();
        new d();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(q2.a aVar);

    public abstract boolean d(boolean z, q2.a aVar, q2.c cVar);
}

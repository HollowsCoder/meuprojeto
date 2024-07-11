package w2;

import java.util.ArrayDeque;
import m3.j;

public final class m<A, B> {

    /* renamed from: a  reason: collision with root package name */
    public final l f9188a = new l();

    public static final class a<A> {
        public static final ArrayDeque d = new ArrayDeque(0);

        /* renamed from: a  reason: collision with root package name */
        public int f9189a;

        /* renamed from: b  reason: collision with root package name */
        public int f9190b;

        /* renamed from: c  reason: collision with root package name */
        public A f9191c;

        static {
            char[] cArr = j.f7084a;
        }

        public static a a(Object obj) {
            a aVar;
            ArrayDeque arrayDeque = d;
            synchronized (arrayDeque) {
                aVar = (a) arrayDeque.poll();
            }
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f9191c = obj;
            aVar.f9190b = 0;
            aVar.f9189a = 0;
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9190b == aVar.f9190b && this.f9189a == aVar.f9189a && this.f9191c.equals(aVar.f9191c);
        }

        public final int hashCode() {
            return this.f9191c.hashCode() + (((this.f9189a * 31) + this.f9190b) * 31);
        }
    }
}

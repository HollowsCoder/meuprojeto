package u2;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f9060a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final C0135b f9061b = new C0135b();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ReentrantLock f9062a = new ReentrantLock();

        /* renamed from: b  reason: collision with root package name */
        public int f9063b;
    }

    /* renamed from: u2.b$b  reason: collision with other inner class name */
    public static class C0135b {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayDeque f9064a = new ArrayDeque();
    }

    public final void a(String str) {
        a aVar;
        synchronized (this) {
            Object obj = this.f9060a.get(str);
            s6.a.n(obj);
            aVar = (a) obj;
            int i10 = aVar.f9063b;
            if (i10 >= 1) {
                int i11 = i10 - 1;
                aVar.f9063b = i11;
                if (i11 == 0) {
                    a aVar2 = (a) this.f9060a.remove(str);
                    if (aVar2.equals(aVar)) {
                        C0135b bVar = this.f9061b;
                        synchronized (bVar.f9064a) {
                            if (bVar.f9064a.size() < 10) {
                                bVar.f9064a.offer(aVar2);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f9063b);
            }
        }
        aVar.f9062a.unlock();
    }
}

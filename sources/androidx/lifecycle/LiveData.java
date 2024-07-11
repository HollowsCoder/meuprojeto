package androidx.lifecycle;

import android.os.Looper;
import androidx.fragment.app.m;
import androidx.lifecycle.h;
import b0.d;
import java.util.Map;
import k.b;

public abstract class LiveData<T> {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f1347k = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f1348a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final k.b<t<? super T>, LiveData<T>.c> f1349b = new k.b<>();

    /* renamed from: c  reason: collision with root package name */
    public int f1350c = 0;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f1351e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f1352f;

    /* renamed from: g  reason: collision with root package name */
    public int f1353g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1354h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1355i;

    /* renamed from: j  reason: collision with root package name */
    public final a f1356j;

    public class LifecycleBoundObserver extends LiveData<T>.c implements l {

        /* renamed from: s  reason: collision with root package name */
        public final n f1357s;

        public LifecycleBoundObserver(n nVar, d2.c cVar) {
            super(cVar);
            this.f1357s = nVar;
        }

        public final void f(n nVar, h.b bVar) {
            n nVar2 = this.f1357s;
            h.c cVar = nVar2.r().f1394c;
            if (cVar == h.c.DESTROYED) {
                LiveData.this.h(this.f1360o);
                return;
            }
            h.c cVar2 = null;
            while (cVar2 != cVar) {
                g(k());
                cVar2 = cVar;
                cVar = nVar2.r().f1394c;
            }
        }

        public final void i() {
            this.f1357s.r().b(this);
        }

        public final boolean j(n nVar) {
            return this.f1357s == nVar;
        }

        public final boolean k() {
            return this.f1357s.r().f1394c.isAtLeast(h.c.STARTED);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            Object obj;
            synchronized (LiveData.this.f1348a) {
                obj = LiveData.this.f1352f;
                LiveData.this.f1352f = LiveData.f1347k;
            }
            LiveData.this.i(obj);
        }
    }

    public class b extends LiveData<T>.c {
        public b(LiveData liveData, m.d dVar) {
            super(dVar);
        }

        public final boolean k() {
            return true;
        }
    }

    public abstract class c {

        /* renamed from: o  reason: collision with root package name */
        public final t<? super T> f1360o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f1361p;

        /* renamed from: q  reason: collision with root package name */
        public int f1362q = -1;

        public c(t<? super T> tVar) {
            this.f1360o = tVar;
        }

        public final void g(boolean z) {
            int i10;
            boolean z10;
            boolean z11;
            if (z != this.f1361p) {
                this.f1361p = z;
                if (z) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                LiveData liveData = LiveData.this;
                int i11 = liveData.f1350c;
                liveData.f1350c = i10 + i11;
                if (!liveData.d) {
                    liveData.d = true;
                    while (true) {
                        try {
                            int i12 = liveData.f1350c;
                            if (i11 == i12) {
                                break;
                            }
                            if (i11 != 0 || i12 <= 0) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (i11 <= 0 || i12 != 0) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (z10) {
                                liveData.f();
                            } else if (z11) {
                                liveData.g();
                            }
                            i11 = i12;
                        } finally {
                            liveData.d = false;
                        }
                    }
                }
                if (this.f1361p) {
                    liveData.c(this);
                }
            }
        }

        public void i() {
        }

        public boolean j(n nVar) {
            return false;
        }

        public abstract boolean k();
    }

    public LiveData() {
        Object obj = f1347k;
        this.f1352f = obj;
        this.f1356j = new a();
        this.f1351e = obj;
        this.f1353g = -1;
    }

    public static void a(String str) {
        boolean z;
        j.a.E().f6379o.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException(d.f("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(LiveData<T>.c cVar) {
        if (cVar.f1361p) {
            if (!cVar.k()) {
                cVar.g(false);
                return;
            }
            int i10 = cVar.f1362q;
            int i11 = this.f1353g;
            if (i10 < i11) {
                cVar.f1362q = i11;
                cVar.f1360o.e(this.f1351e);
            }
        }
    }

    public final void c(LiveData<T>.c cVar) {
        if (this.f1354h) {
            this.f1355i = true;
            return;
        }
        this.f1354h = true;
        do {
            this.f1355i = false;
            if (cVar == null) {
                k.b<t<? super T>, LiveData<T>.c> bVar = this.f1349b;
                bVar.getClass();
                b.d dVar = new b.d();
                bVar.f6611q.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((c) ((Map.Entry) dVar.next()).getValue());
                    if (this.f1355i) {
                        break;
                    }
                }
            } else {
                b(cVar);
                cVar = null;
            }
        } while (this.f1355i);
        this.f1354h = false;
    }

    public final void d(n nVar, d2.c cVar) {
        V v10;
        a("observe");
        if (nVar.r().f1394c != h.c.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(nVar, cVar);
            k.b<t<? super T>, LiveData<T>.c> bVar = this.f1349b;
            b.c<t<? super T>, LiveData<T>.c> e10 = bVar.e(cVar);
            if (e10 != null) {
                v10 = e10.f6614p;
            } else {
                b.c<K, V> cVar2 = new b.c<>(cVar, lifecycleBoundObserver);
                bVar.f6612r++;
                b.c<K, V> cVar3 = bVar.f6610p;
                if (cVar3 == null) {
                    bVar.f6609o = cVar2;
                } else {
                    cVar3.f6615q = cVar2;
                    cVar2.f6616r = cVar3;
                }
                bVar.f6610p = cVar2;
                v10 = null;
            }
            c cVar4 = (c) v10;
            if (cVar4 != null && !cVar4.j(nVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (cVar4 == null) {
                nVar.r().a(lifecycleBoundObserver);
            }
        }
    }

    public final void e(m.d dVar) {
        V v10;
        a("observeForever");
        b bVar = new b(this, dVar);
        k.b<t<? super T>, LiveData<T>.c> bVar2 = this.f1349b;
        b.c<t<? super T>, LiveData<T>.c> e10 = bVar2.e(dVar);
        if (e10 != null) {
            v10 = e10.f6614p;
        } else {
            b.c<K, V> cVar = new b.c<>(dVar, bVar);
            bVar2.f6612r++;
            b.c<K, V> cVar2 = bVar2.f6610p;
            if (cVar2 == null) {
                bVar2.f6609o = cVar;
            } else {
                cVar2.f6615q = cVar;
                cVar.f6616r = cVar2;
            }
            bVar2.f6610p = cVar;
            v10 = null;
        }
        c cVar3 = (c) v10;
        if (cVar3 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (cVar3 == null) {
            bVar.g(true);
        }
    }

    public void f() {
    }

    public void g() {
    }

    public void h(t<? super T> tVar) {
        a("removeObserver");
        c h10 = this.f1349b.h(tVar);
        if (h10 != null) {
            h10.i();
            h10.g(false);
        }
    }

    public abstract void i(T t10);
}

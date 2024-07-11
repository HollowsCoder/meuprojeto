package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.os.Looper;
import androidx.lifecycle.h;
import b0.d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import k.b;

public final class o extends h {

    /* renamed from: b  reason: collision with root package name */
    public final k.a<m, a> f1393b = new k.a<>();

    /* renamed from: c  reason: collision with root package name */
    public h.c f1394c;
    public final WeakReference<n> d;

    /* renamed from: e  reason: collision with root package name */
    public int f1395e = 0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1396f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1397g = false;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<h.c> f1398h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public final boolean f1399i;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public h.c f1400a;

        /* renamed from: b  reason: collision with root package name */
        public final l f1401b;

        public a(m mVar, h.c cVar) {
            l lVar;
            HashMap hashMap = q.f1402a;
            boolean z = mVar instanceof l;
            boolean z10 = mVar instanceof e;
            if (z && z10) {
                lVar = new FullLifecycleObserverAdapter((e) mVar, (l) mVar);
            } else if (z10) {
                lVar = new FullLifecycleObserverAdapter((e) mVar, (l) null);
            } else if (z) {
                lVar = (l) mVar;
            } else {
                Class<?> cls = mVar.getClass();
                if (q.c(cls) == 2) {
                    List list = (List) q.f1403b.get(cls);
                    if (list.size() == 1) {
                        lVar = new SingleGeneratedAdapterObserver(q.a((Constructor) list.get(0), mVar));
                    } else {
                        f[] fVarArr = new f[list.size()];
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            fVarArr[i10] = q.a((Constructor) list.get(i10), mVar);
                        }
                        lVar = new CompositeGeneratedAdaptersObserver(fVarArr);
                    }
                } else {
                    lVar = new ReflectiveGenericLifecycleObserver(mVar);
                }
            }
            this.f1401b = lVar;
            this.f1400a = cVar;
        }

        public final void a(n nVar, h.b bVar) {
            h.c targetState = bVar.getTargetState();
            h.c cVar = this.f1400a;
            if (targetState != null && targetState.compareTo(cVar) < 0) {
                cVar = targetState;
            }
            this.f1400a = cVar;
            this.f1401b.f(nVar, bVar);
            this.f1400a = targetState;
        }
    }

    public o(n nVar) {
        this.d = new WeakReference<>(nVar);
        this.f1394c = h.c.INITIALIZED;
        this.f1399i = true;
    }

    public final void a(m mVar) {
        n nVar;
        boolean z;
        d("addObserver");
        h.c cVar = this.f1394c;
        h.c cVar2 = h.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = h.c.INITIALIZED;
        }
        a aVar = new a(mVar, cVar2);
        k.a<m, a> aVar2 = this.f1393b;
        if (aVar2.i(mVar, aVar) == null && (nVar = this.d.get()) != null) {
            if (this.f1395e != 0 || this.f1396f) {
                z = true;
            } else {
                z = false;
            }
            h.c c10 = c(mVar);
            this.f1395e++;
            while (aVar.f1400a.compareTo(c10) < 0 && aVar2.f6608s.containsKey(mVar)) {
                h.c cVar3 = aVar.f1400a;
                ArrayList<h.c> arrayList = this.f1398h;
                arrayList.add(cVar3);
                h.b upFrom = h.b.upFrom(aVar.f1400a);
                if (upFrom != null) {
                    aVar.a(nVar, upFrom);
                    arrayList.remove(arrayList.size() - 1);
                    c10 = c(mVar);
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f1400a);
                }
            }
            if (!z) {
                h();
            }
            this.f1395e--;
        }
    }

    public final void b(m mVar) {
        d("removeObserver");
        this.f1393b.h(mVar);
    }

    public final h.c c(m mVar) {
        b.c<K, V> cVar;
        h.c cVar2;
        k.a<m, a> aVar = this.f1393b;
        h.c cVar3 = null;
        if (aVar.f6608s.containsKey(mVar)) {
            cVar = aVar.f6608s.get(mVar).f6616r;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            cVar2 = ((a) cVar.f6614p).f1400a;
        } else {
            cVar2 = null;
        }
        ArrayList<h.c> arrayList = this.f1398h;
        if (!arrayList.isEmpty()) {
            cVar3 = arrayList.get(arrayList.size() - 1);
        }
        h.c cVar4 = this.f1394c;
        if (cVar2 == null || cVar2.compareTo(cVar4) >= 0) {
            cVar2 = cVar4;
        }
        if (cVar3 == null || cVar3.compareTo(cVar2) >= 0) {
            return cVar2;
        }
        return cVar3;
    }

    @SuppressLint({"RestrictedApi"})
    public final void d(String str) {
        boolean z;
        if (this.f1399i) {
            j.a.E().f6379o.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException(d.f("Method ", str, " must be called on the main thread"));
            }
        }
    }

    public final void e(h.b bVar) {
        d("handleLifecycleEvent");
        f(bVar.getTargetState());
    }

    public final void f(h.c cVar) {
        if (this.f1394c != cVar) {
            this.f1394c = cVar;
            if (this.f1396f || this.f1395e != 0) {
                this.f1397g = true;
                return;
            }
            this.f1396f = true;
            h();
            this.f1396f = false;
        }
    }

    public final void g(h.c cVar) {
        d("setCurrentState");
        f(cVar);
    }

    public final void h() {
        boolean z;
        h.c cVar;
        n nVar = this.d.get();
        if (nVar != null) {
            while (true) {
                k.a<m, a> aVar = this.f1393b;
                if (aVar.f6612r == 0 || (((a) aVar.f6609o.f6614p).f1400a == (cVar = ((a) aVar.f6610p.f6614p).f1400a) && this.f1394c == cVar)) {
                    z = true;
                } else {
                    z = false;
                }
                this.f1397g = false;
                if (!z) {
                    int compareTo = this.f1394c.compareTo(((a) aVar.f6609o.f6614p).f1400a);
                    ArrayList<h.c> arrayList = this.f1398h;
                    HashMap<K, b.c<K, V>> hashMap = aVar.f6608s;
                    WeakHashMap<b.f<K, V>, Boolean> weakHashMap = aVar.f6611q;
                    if (compareTo < 0) {
                        b.C0090b bVar = new b.C0090b(aVar.f6610p, aVar.f6609o);
                        weakHashMap.put(bVar, Boolean.FALSE);
                        while (bVar.hasNext() && !this.f1397g) {
                            Map.Entry entry = (Map.Entry) bVar.next();
                            a aVar2 = (a) entry.getValue();
                            while (aVar2.f1400a.compareTo(this.f1394c) > 0 && !this.f1397g && hashMap.containsKey((m) entry.getKey())) {
                                h.b downFrom = h.b.downFrom(aVar2.f1400a);
                                if (downFrom != null) {
                                    arrayList.add(downFrom.getTargetState());
                                    aVar2.a(nVar, downFrom);
                                    arrayList.remove(arrayList.size() - 1);
                                } else {
                                    throw new IllegalStateException("no event down from " + aVar2.f1400a);
                                }
                            }
                        }
                    }
                    b.c<K, V> cVar2 = aVar.f6610p;
                    if (!this.f1397g && cVar2 != null && this.f1394c.compareTo(((a) cVar2.f6614p).f1400a) > 0) {
                        b.d dVar = new b.d();
                        weakHashMap.put(dVar, Boolean.FALSE);
                        while (dVar.hasNext() && !this.f1397g) {
                            Map.Entry entry2 = (Map.Entry) dVar.next();
                            a aVar3 = (a) entry2.getValue();
                            while (aVar3.f1400a.compareTo(this.f1394c) < 0 && !this.f1397g && hashMap.containsKey((m) entry2.getKey())) {
                                arrayList.add(aVar3.f1400a);
                                h.b upFrom = h.b.upFrom(aVar3.f1400a);
                                if (upFrom != null) {
                                    aVar3.a(nVar, upFrom);
                                    arrayList.remove(arrayList.size() - 1);
                                } else {
                                    throw new IllegalStateException("no event up from " + aVar3.f1400a);
                                }
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }
}

package androidx.lifecycle;

import androidx.lifecycle.h;
import androidx.savedstate.a;
import androidx.savedstate.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

final class SavedStateHandleController implements l {

    /* renamed from: o  reason: collision with root package name */
    public final String f1366o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1367p = false;

    /* renamed from: q  reason: collision with root package name */
    public final y f1368q;

    public static final class a implements a.C0022a {
        public final void a(c cVar) {
            HashMap<String, a0> hashMap;
            if (cVar instanceof d0) {
                c0 n10 = ((d0) cVar).n();
                androidx.savedstate.a c10 = cVar.c();
                n10.getClass();
                Iterator it = new HashSet(n10.f1386a.keySet()).iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashMap = n10.f1386a;
                    if (!hasNext) {
                        break;
                    }
                    SavedStateHandleController.g(hashMap.get((String) it.next()), c10, cVar.r());
                }
                if (!new HashSet(hashMap.keySet()).isEmpty()) {
                    c10.c();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    public SavedStateHandleController(String str, y yVar) {
        this.f1366o = str;
        this.f1368q = yVar;
    }

    public static void g(a0 a0Var, androidx.savedstate.a aVar, h hVar) {
        Object obj;
        HashMap hashMap = a0Var.f1372a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = a0Var.f1372a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController != null && !savedStateHandleController.f1367p) {
            savedStateHandleController.i(hVar, aVar);
            j(hVar, aVar);
        }
    }

    public static void j(final h hVar, final androidx.savedstate.a aVar) {
        h.c cVar = ((o) hVar).f1394c;
        if (cVar == h.c.INITIALIZED || cVar.isAtLeast(h.c.STARTED)) {
            aVar.c();
        } else {
            hVar.a(new l() {
                public final void f(n nVar, h.b bVar) {
                    if (bVar == h.b.ON_START) {
                        h.this.b(this);
                        aVar.c();
                    }
                }
            });
        }
    }

    public final void f(n nVar, h.b bVar) {
        if (bVar == h.b.ON_DESTROY) {
            this.f1367p = false;
            nVar.r().b(this);
        }
    }

    public final void i(h hVar, androidx.savedstate.a aVar) {
        if (!this.f1367p) {
            this.f1367p = true;
            hVar.a(this);
            aVar.b(this.f1366o, this.f1368q.d);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }
}

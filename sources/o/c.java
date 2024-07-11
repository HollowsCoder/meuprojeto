package o;

import android.util.SparseArray;
import com.google.android.gms.internal.measurement.h;
import com.google.android.gms.internal.measurement.i3;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.o;
import com.google.android.gms.internal.measurement.p;
import com.google.android.gms.internal.measurement.r1;
import com.google.android.gms.internal.measurement.tc;
import com.google.android.gms.internal.measurement.w3;
import h0.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import n.b;
import n.f;
import n.i;
import s6.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7535a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7536b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f7537c;
    public Object d;

    public c(int i10) {
        if (i10 == 1) {
            this.f7535a = new d(10);
            this.f7536b = new i();
            this.f7537c = new ArrayList();
            this.d = new HashSet();
        } else if (i10 == 2) {
            this.f7535a = new b();
            this.f7536b = new SparseArray();
            this.f7537c = new f();
            this.d = new b();
        } else if (i10 != 3) {
            this.f7535a = new e();
            this.f7536b = new e();
            this.f7537c = new e();
            this.d = new g[32];
        } else {
            m1.i iVar = new m1.i(2);
            this.f7535a = iVar;
            i3 i3Var = new i3((i3) null, iVar);
            this.f7537c = i3Var;
            this.f7536b = i3Var.c();
            q1.d dVar = new q1.d();
            this.d = dVar;
            i3Var.e("require", new tc(dVar));
            ((Map) ((q1.d) this.d).f8213p).put("internal.platform", r1.f2902a);
            i3Var.e("runtime.counter", new h(Double.valueOf(0.0d)));
        }
    }

    public /* synthetic */ c(Throwable th, m7.c cVar) {
        this.f7535a = th.getLocalizedMessage();
        this.f7536b = th.getClass().getName();
        this.f7537c = cVar.h(th.getStackTrace());
        Throwable cause = th.getCause();
        this.d = cause != null ? new c(cause, cVar) : null;
    }

    public final void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                ArrayList arrayList2 = (ArrayList) ((i) this.f7536b).getOrDefault(obj, null);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        a(arrayList2.get(i10), arrayList, hashSet);
                    }
                }
                hashSet.remove(obj);
                arrayList.add(obj);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    public final o b(i3 i3Var, w3... w3VarArr) {
        o oVar = o.f2850a;
        for (w3 g02 : w3VarArr) {
            oVar = a.g0(g02);
            androidx.databinding.a.R((i3) this.f7537c);
            if ((oVar instanceof p) || (oVar instanceof n)) {
                oVar = ((m1.i) this.f7535a).b(i3Var, oVar);
            }
        }
        return oVar;
    }
}

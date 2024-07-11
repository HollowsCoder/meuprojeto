package com.google.android.gms.internal.measurement;

import androidx.fragment.app.f0;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m1.i;
import o.c;
import q1.d;

public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public final c f2763a;

    /* renamed from: b  reason: collision with root package name */
    public i3 f2764b;

    /* renamed from: c  reason: collision with root package name */
    public final f0 f2765c = new f0(4);
    public final i d = new i(4);

    public k0() {
        c cVar = new c(3);
        this.f2763a = cVar;
        this.f2764b = ((i3) cVar.f7536b).c();
        ((Map) ((d) cVar.d).f8213p).put("internal.registerCallback", new a(this, 0));
        ((Map) ((d) cVar.d).f8213p).put("internal.eventLogger", new a(this, 1));
    }

    public final boolean a(b bVar) {
        f0 f0Var = this.f2765c;
        try {
            f0Var.f1151p = bVar;
            f0Var.f1152q = bVar.clone();
            ((List) f0Var.f1153r).clear();
            ((i3) this.f2763a.f7537c).e("runtime.counter", new h(Double.valueOf(0.0d)));
            this.d.d(this.f2764b.c(), f0Var);
            if ((!((b) f0Var.f1152q).equals((b) f0Var.f1151p)) || (!((List) f0Var.f1153r).isEmpty())) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw new e1(th);
        }
    }

    public final void b(t3 t3Var) {
        i iVar;
        c cVar = this.f2763a;
        try {
            this.f2764b = ((i3) cVar.f7536b).c();
            if (!(cVar.b(this.f2764b, (w3[]) t3Var.r().toArray(new w3[0])) instanceof g)) {
                for (s3 next : t3Var.s().r()) {
                    List<w3> s10 = next.s();
                    String r5 = next.r();
                    Iterator<w3> it = s10.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            o b10 = cVar.b(this.f2764b, it.next());
                            if (b10 instanceof l) {
                                i3 i3Var = this.f2764b;
                                if (!i3Var.d(r5)) {
                                    iVar = null;
                                } else {
                                    o g10 = i3Var.g(r5);
                                    if (!(g10 instanceof i)) {
                                        String valueOf = String.valueOf(r5);
                                        throw new IllegalStateException(valueOf.length() != 0 ? "Invalid function name: ".concat(valueOf) : new String("Invalid function name: "));
                                    }
                                    iVar = (i) g10;
                                }
                                if (iVar == null) {
                                    String valueOf2 = String.valueOf(r5);
                                    throw new IllegalStateException(valueOf2.length() != 0 ? "Rule function is undefined: ".concat(valueOf2) : new String("Rule function is undefined: "));
                                }
                                iVar.a(this.f2764b, Collections.singletonList(b10));
                            } else {
                                throw new IllegalArgumentException("Invalid rule definition");
                            }
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new e1(th);
        }
    }
}

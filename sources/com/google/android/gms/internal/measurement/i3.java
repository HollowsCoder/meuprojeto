package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import m1.i;

public final class i3 {

    /* renamed from: a  reason: collision with root package name */
    public final i3 f2743a;

    /* renamed from: b  reason: collision with root package name */
    public final i f2744b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f2745c = new HashMap();
    public final HashMap d = new HashMap();

    public i3(i3 i3Var, i iVar) {
        this.f2743a = i3Var;
        this.f2744b = iVar;
    }

    public final o a(o oVar) {
        return this.f2744b.b(this, oVar);
    }

    public final o b(e eVar) {
        o oVar = o.f2850a;
        Iterator<Integer> n10 = eVar.n();
        while (n10.hasNext()) {
            oVar = this.f2744b.b(this, eVar.u(n10.next().intValue()));
            if (oVar instanceof g) {
                break;
            }
        }
        return oVar;
    }

    public final i3 c() {
        return new i3(this, this.f2744b);
    }

    public final boolean d(String str) {
        if (this.f2745c.containsKey(str)) {
            return true;
        }
        i3 i3Var = this.f2743a;
        if (i3Var != null) {
            return i3Var.d(str);
        }
        return false;
    }

    public final void e(String str, o oVar) {
        i3 i3Var;
        HashMap hashMap = this.f2745c;
        if (!hashMap.containsKey(str) && (i3Var = this.f2743a) != null && i3Var.d(str)) {
            i3Var.e(str, oVar);
        } else if (!this.d.containsKey(str)) {
            if (oVar == null) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, oVar);
            }
        }
    }

    public final void f(String str, o oVar) {
        if (!this.d.containsKey(str)) {
            HashMap hashMap = this.f2745c;
            if (oVar == null) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, oVar);
            }
        }
    }

    public final o g(String str) {
        HashMap hashMap = this.f2745c;
        if (hashMap.containsKey(str)) {
            return (o) hashMap.get(str);
        }
        i3 i3Var = this.f2743a;
        if (i3Var != null) {
            return i3Var.g(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", new Object[]{str}));
    }
}

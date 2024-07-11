package h5;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import i4.o;
import j4.h;
import j4.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l4.g0;
import l4.j0;
import l4.w;
import n4.m;
import r4.d;
import r4.j;
import x4.c;

public final class p4 extends w2 {

    /* renamed from: a  reason: collision with root package name */
    public final z6 f5631a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f5632b;

    /* renamed from: c  reason: collision with root package name */
    public String f5633c = null;

    public p4(z6 z6Var) {
        m.h(z6Var);
        this.f5631a = z6Var;
    }

    public final byte[] A(p pVar, String str) {
        m.e(str);
        m.h(pVar);
        K(str, true);
        z6 z6Var = this.f5631a;
        g3 e10 = z6Var.e();
        i4 i4Var = z6Var.f5856y;
        b3 b3Var = i4Var.A;
        i4.l(b3Var);
        String str2 = pVar.f5621o;
        e10.A.b(b3Var.l(str2), "Log and bundle. event");
        ((d) z6Var.c()).getClass();
        long nanoTime = System.nanoTime() / 1000000;
        h4 f10 = z6Var.f();
        c cVar = new c(this, pVar, str);
        f10.i();
        f4 f4Var = new f4(f10, cVar, true);
        if (Thread.currentThread() == f10.f5430q) {
            f4Var.run();
        } else {
            f10.r(f4Var);
        }
        try {
            byte[] bArr = (byte[]) f4Var.get();
            if (bArr == null) {
                z6Var.e().f5397t.b(g3.p(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            ((d) z6Var.c()).getClass();
            long nanoTime2 = System.nanoTime();
            e3 e3Var = z6Var.e().A;
            b3 b3Var2 = i4Var.A;
            i4.l(b3Var2);
            e3Var.d("Log and bundle processed. event, size, time_ms", b3Var2.l(str2), Integer.valueOf(bArr.length), Long.valueOf((nanoTime2 / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e11) {
            g3 e12 = z6Var.e();
            f3 p10 = g3.p(str);
            b3 b3Var3 = i4Var.A;
            i4.l(b3Var3);
            e12.f5397t.d("Failed to log and bundle. appId, event, error", p10, b3Var3.l(str2), e11);
            return null;
        }
    }

    public final List<b> B(String str, String str2, String str3) {
        K(str, true);
        z6 z6Var = this.f5631a;
        try {
            return (List) z6Var.f().m(new l4(this, str, str2, str3, 1)).get();
        } catch (InterruptedException | ExecutionException e10) {
            z6Var.e().f5397t.b(e10, "Failed to get conditional user properties as");
            return Collections.emptyList();
        }
    }

    public final void E(i7 i7Var) {
        m.e(i7Var.f5468o);
        K(i7Var.f5468o, false);
        L(new o((Object) this, (Object) i7Var, 4));
    }

    public final void F(i7 i7Var) {
        J(i7Var);
        L(new n4(this, i7Var, 1));
    }

    public final List<c7> G(String str, String str2, String str3, boolean z) {
        K(str, true);
        z6 z6Var = this.f5631a;
        try {
            List<e7> list = (List) z6Var.f().m(new l4(this, str, str2, str3, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (e7 e7Var : list) {
                if (z || !g7.A(e7Var.f5364c)) {
                    arrayList.add(new c7(e7Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            g3 e11 = z6Var.e();
            e11.f5397t.c(g3.p(str), e10, "Failed to get user properties as. appId");
            return Collections.emptyList();
        }
    }

    public final void J(i7 i7Var) {
        m.h(i7Var);
        String str = i7Var.f5468o;
        m.e(str);
        K(str, false);
        this.f5631a.J().k(i7Var.f5469p, i7Var.E, i7Var.I);
    }

    public final void K(String str, boolean z) {
        boolean z10;
        boolean isEmpty = TextUtils.isEmpty(str);
        z6 z6Var = this.f5631a;
        if (!isEmpty) {
            if (z) {
                try {
                    if (this.f5632b == null) {
                        if (!"com.google.android.gms".equals(this.f5633c) && !j.a(z6Var.f5856y.f5452o, Binder.getCallingUid())) {
                            if (!i.a(z6Var.f5856y.f5452o).b(Binder.getCallingUid())) {
                                z10 = false;
                                this.f5632b = Boolean.valueOf(z10);
                            }
                        }
                        z10 = true;
                        this.f5632b = Boolean.valueOf(z10);
                    }
                    if (this.f5632b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e10) {
                    z6Var.e().f5397t.b(g3.p(str), "Measurement Service called with invalid calling package. appId");
                    throw e10;
                }
            }
            if (this.f5633c == null) {
                Context context = z6Var.f5856y.f5452o;
                int callingUid = Binder.getCallingUid();
                boolean z11 = h.f6549a;
                if (j.b(callingUid, context, str)) {
                    this.f5633c = str;
                }
            }
            if (!str.equals(this.f5633c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        z6Var.e().f5397t.a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    public final void L(Runnable runnable) {
        z6 z6Var = this.f5631a;
        if (z6Var.f().l()) {
            runnable.run();
        } else {
            z6Var.f().n(runnable);
        }
    }

    public final void d(Bundle bundle, i7 i7Var) {
        J(i7Var);
        String str = i7Var.f5468o;
        m.h(str);
        L(new j4(this, str, bundle, 0));
    }

    public final List<c7> g(String str, String str2, boolean z, i7 i7Var) {
        J(i7Var);
        String str3 = i7Var.f5468o;
        m.h(str3);
        z6 z6Var = this.f5631a;
        try {
            List<e7> list = (List) z6Var.f().m(new k4(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (e7 e7Var : list) {
                if (z || !g7.A(e7Var.f5364c)) {
                    arrayList.add(new c7(e7Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            g3 e11 = z6Var.e();
            e11.f5397t.c(g3.p(str3), e10, "Failed to query user properties. appId");
            return Collections.emptyList();
        }
    }

    public final void l(p pVar, i7 i7Var) {
        m.h(pVar);
        J(i7Var);
        L(new j0(this, pVar, i7Var, 1));
    }

    public final void n(i7 i7Var) {
        m.e(i7Var.f5468o);
        m.h(i7Var.J);
        n4 n4Var = new n4(this, i7Var, 0);
        z6 z6Var = this.f5631a;
        if (z6Var.f().l()) {
            n4Var.run();
        } else {
            z6Var.f().p(n4Var);
        }
    }

    public final void o(i7 i7Var) {
        J(i7Var);
        L(new w(1, this, i7Var));
    }

    public final List<b> p(String str, String str2, i7 i7Var) {
        J(i7Var);
        String str3 = i7Var.f5468o;
        m.h(str3);
        z6 z6Var = this.f5631a;
        try {
            return (List) z6Var.f().m(new k4(this, str3, str, str2, 1)).get();
        } catch (InterruptedException | ExecutionException e10) {
            z6Var.e().f5397t.b(e10, "Failed to get conditional user properties");
            return Collections.emptyList();
        }
    }

    public final String q(i7 i7Var) {
        J(i7Var);
        z6 z6Var = this.f5631a;
        try {
            return (String) z6Var.f().m(new x6(z6Var, i7Var)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            g3 e11 = z6Var.e();
            e11.f5397t.c(g3.p(i7Var.f5468o), e10, "Failed to get app instance id. appId");
            return null;
        }
    }

    public final void r(b bVar, i7 i7Var) {
        m.h(bVar);
        m.h(bVar.f5277q);
        J(i7Var);
        b bVar2 = new b(bVar);
        bVar2.f5275o = i7Var.f5468o;
        L(new g0(this, bVar2, i7Var, 2));
    }

    public final void t(c7 c7Var, i7 i7Var) {
        m.h(c7Var);
        J(i7Var);
        L(new j0(this, c7Var, i7Var, 2));
    }

    public final void u(long j8, String str, String str2, String str3) {
        L(new o4(this, str2, str3, str, j8, 0));
    }
}

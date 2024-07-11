package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.android.gms.internal.vision.f;
import com.google.android.gms.internal.vision.k;
import com.google.android.gms.internal.vision.n;
import com.google.android.gms.internal.vision.o;
import com.google.android.gms.internal.vision.p4;
import com.google.android.gms.internal.vision.s;
import com.google.android.gms.internal.vision.t;
import java.util.ArrayList;
import java.util.List;
import t4.c;

@Keep
public class LogUtils {
    public static f zza(Context context) {
        f.a p10 = f.p();
        String packageName = context.getPackageName();
        if (p10.f3144q) {
            p10.p();
            p10.f3144q = false;
        }
        f.o((f) p10.f3143p, packageName);
        String zzb = zzb(context);
        if (zzb != null) {
            if (p10.f3144q) {
                p10.p();
                p10.f3144q = false;
            }
            f.r((f) p10.f3143p, zzb);
        }
        return (f) p10.r();
    }

    private static String zzb(Context context) {
        try {
            return c.a(context).b(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            n5.c.a(e10, "Unable to find calling package info for %s", context.getPackageName());
            return null;
        }
    }

    public static t zza(long j8, int i10, String str, String str2, List<s> list, p4 p4Var) {
        n.a q10 = n.q();
        k.b r5 = k.r();
        if (r5.f3144q) {
            r5.p();
            r5.f3144q = false;
        }
        k.q((k) r5.f3143p, str2);
        if (r5.f3144q) {
            r5.p();
            r5.f3144q = false;
        }
        k.o((k) r5.f3143p, j8);
        long j10 = (long) i10;
        if (r5.f3144q) {
            r5.p();
            r5.f3144q = false;
        }
        k.t((k) r5.f3143p, j10);
        if (r5.f3144q) {
            r5.p();
            r5.f3144q = false;
        }
        k.p((k) r5.f3143p, list);
        ArrayList arrayList = new ArrayList();
        arrayList.add((k) r5.r());
        if (q10.f3144q) {
            q10.p();
            q10.f3144q = false;
        }
        n.p((n) q10.f3143p, arrayList);
        o.b p10 = o.p();
        long j11 = (long) p4Var.f3136p;
        if (p10.f3144q) {
            p10.p();
            p10.f3144q = false;
        }
        o.r((o) p10.f3143p, j11);
        long j12 = (long) p4Var.f3135o;
        if (p10.f3144q) {
            p10.p();
            p10.f3144q = false;
        }
        o.o((o) p10.f3143p, j12);
        long j13 = (long) p4Var.f3137q;
        if (p10.f3144q) {
            p10.p();
            p10.f3144q = false;
        }
        o.s((o) p10.f3143p, j13);
        long j14 = p4Var.f3138r;
        if (p10.f3144q) {
            p10.p();
            p10.f3144q = false;
        }
        o.t((o) p10.f3143p, j14);
        o oVar = (o) p10.r();
        if (q10.f3144q) {
            q10.p();
            q10.f3144q = false;
        }
        n.o((n) q10.f3143p, oVar);
        n nVar = (n) q10.r();
        t.a p11 = t.p();
        if (p11.f3144q) {
            p11.p();
            p11.f3144q = false;
        }
        t.o((t) p11.f3143p, nVar);
        return (t) p11.r();
    }
}

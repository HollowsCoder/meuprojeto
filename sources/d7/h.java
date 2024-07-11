package d7;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.j9;
import h5.r2;
import h5.s2;
import h5.u2;
import i4.c;
import java.util.List;
import m5.a;
import m5.i;
import m5.l;
import r1.d0;
import r1.m;

public final class h implements a, r2, m5.h, d0 {

    /* renamed from: o  reason: collision with root package name */
    public static final h f4228o = new h();

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ h f4229p = new h();

    /* renamed from: q  reason: collision with root package name */
    public static final h f4230q = new h();

    public /* bridge */ /* synthetic */ Object c(i iVar) {
        return null;
    }

    public Object f(s1.a aVar, float f10) {
        return m.b(aVar, f10);
    }

    public i i(Object obj) {
        boolean z;
        Bundle bundle = (Bundle) obj;
        int i10 = c.f6067h;
        if (bundle == null || !bundle.containsKey("google.messenger")) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            bundle = null;
        }
        return l.e(bundle);
    }

    public Object zza() {
        List<s2<?>> list = u2.f5707a;
        return Integer.valueOf((int) j9.f2758p.zza().F());
    }
}

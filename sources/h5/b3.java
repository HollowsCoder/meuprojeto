package h5;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.x0;
import b0.d;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import n4.m;
import s6.a;

public final class b3 extends r4 {

    /* renamed from: q  reason: collision with root package name */
    public static final AtomicReference<String[]> f5287q = new AtomicReference<>();

    /* renamed from: r  reason: collision with root package name */
    public static final AtomicReference<String[]> f5288r = new AtomicReference<>();

    /* renamed from: s  reason: collision with root package name */
    public static final AtomicReference<String[]> f5289s = new AtomicReference<>();

    public b3(i4 i4Var) {
        super(i4Var);
    }

    public static final String q(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        m.h(atomicReference);
        m.b(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (g7.B(str, strArr[i10])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i10];
                    if (str2 == null) {
                        str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                        strArr3[i10] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final boolean h() {
        return false;
    }

    public final boolean k() {
        i4 i4Var = this.f5649o;
        i4Var.getClass();
        if (!TextUtils.isEmpty(i4Var.f5453p)) {
            return false;
        }
        g3 g3Var = i4Var.w;
        i4.n(g3Var);
        if (Log.isLoggable(g3Var.r(), 3)) {
            return true;
        }
        return false;
    }

    public final String l(String str) {
        if (str == null) {
            return null;
        }
        return !k() ? str : q(str, a.L, a.J, f5287q);
    }

    public final String m(String str) {
        if (str == null) {
            return null;
        }
        return !k() ? str : q(str, androidx.databinding.a.f1019r0, androidx.databinding.a.f1017q0, f5288r);
    }

    public final String n(String str) {
        if (str == null) {
            return null;
        }
        if (!k()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return d.f("experiment_id(", str, ")");
        }
        return q(str, a.O, a.N, f5289s);
    }

    public final String o(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        if (!k()) {
            return bundle.toString();
        }
        StringBuilder g10 = x0.g("Bundle[{");
        for (String next : bundle.keySet()) {
            if (g10.length() != 8) {
                g10.append(", ");
            }
            g10.append(m(next));
            g10.append("=");
            Object obj = bundle.get(next);
            if (obj instanceof Bundle) {
                str = p(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                str = p((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                str = p(((ArrayList) obj).toArray());
            } else {
                str = String.valueOf(obj);
            }
            g10.append(str);
        }
        g10.append("}]");
        return g10.toString();
    }

    public final String p(Object[] objArr) {
        String str;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder g10 = x0.g("[");
        for (Bundle bundle : objArr) {
            if (bundle instanceof Bundle) {
                str = o(bundle);
            } else {
                str = String.valueOf(bundle);
            }
            if (str != null) {
                if (g10.length() != 1) {
                    g10.append(", ");
                }
                g10.append(str);
            }
        }
        g10.append("]");
        return g10.toString();
    }
}

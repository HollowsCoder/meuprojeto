package h5;

import android.os.Bundle;
import androidx.appcompat.widget.x0;
import com.google.android.gms.internal.measurement.a2;
import com.google.android.gms.internal.measurement.a3;
import com.google.android.gms.internal.measurement.b;
import com.google.android.gms.internal.measurement.b3;
import com.google.android.gms.internal.measurement.b6;
import com.google.android.gms.internal.measurement.d3;
import com.google.android.gms.internal.measurement.e2;
import com.google.android.gms.internal.measurement.e3;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.g2;
import com.google.android.gms.internal.measurement.k2;
import com.google.android.gms.internal.measurement.l6;
import com.google.android.gms.internal.measurement.m3;
import com.google.android.gms.internal.measurement.m6;
import com.google.android.gms.internal.measurement.o3;
import com.google.android.gms.internal.measurement.q3;
import com.google.android.gms.internal.measurement.r5;
import com.google.android.gms.internal.measurement.t2;
import com.google.android.gms.internal.measurement.v2;
import com.google.android.gms.internal.measurement.w2;
import com.google.android.gms.internal.measurement.x2;
import com.google.android.gms.internal.measurement.z5;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import s6.a;

public final class b7 extends u6 {
    public b7(z6 z6Var) {
        super(z6Var);
    }

    public static b6 E(b6 b6Var, byte[] bArr) {
        r5 r5Var;
        r5 r5Var2 = r5.f2904c;
        if (r5Var2 == null) {
            synchronized (r5.class) {
                r5Var = r5.f2904c;
                if (r5Var == null) {
                    r5Var = z5.b();
                    r5.f2904c = r5Var;
                }
            }
            r5Var2 = r5Var;
        }
        b6Var.getClass();
        if (r5Var2 != null) {
            b6Var.l(bArr, bArr.length, r5Var2);
            return b6Var;
        }
        b6Var.l(bArr, bArr.length, r5.a());
        return b6Var;
    }

    public static int F(e3 e3Var, String str) {
        for (int i10 = 0; i10 < ((f3) e3Var.f2635p).l1(); i10++) {
            if (str.equals(((f3) e3Var.f2635p).m1(i10).t())) {
                return i10;
            }
        }
        return -1;
    }

    public static ArrayList G(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                a3 D = b3.D();
                for (String next : bundle.keySet()) {
                    a3 D2 = b3.D();
                    D2.q(next);
                    Object obj = bundle.get(next);
                    if (obj instanceof Long) {
                        D2.s(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        D2.r((String) obj);
                    } else if (obj instanceof Double) {
                        D2.t(((Double) obj).doubleValue());
                    }
                    if (D.f2636q) {
                        D.m();
                        D.f2636q = false;
                    }
                    b3.M((b3) D.f2635p, (b3) D2.j());
                }
                if (((b3) D.f2635p).C() > 0) {
                    arrayList.add((b3) D.j());
                }
            }
        }
        return arrayList;
    }

    public static p H(b bVar) {
        Object obj;
        Bundle bundle = new Bundle();
        String str = "app";
        for (String str2 : bVar.f2623c.keySet()) {
            HashMap hashMap = bVar.f2623c;
            String str3 = null;
            if (hashMap.containsKey(str2)) {
                obj = hashMap.get(str2);
            } else {
                obj = null;
            }
            if ("_o".equals(str2) && obj != null) {
                str = obj.toString();
            }
            if (obj != null) {
                if (obj instanceof Long) {
                    bundle.putLong(str2, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    bundle.putDouble(str2, ((Double) obj).doubleValue());
                } else {
                    str3 = obj.toString();
                }
            }
            bundle.putString(str2, str3);
        }
        String n02 = a.n0(bVar.f2621a, a.J, a.L);
        if (n02 == null) {
            n02 = bVar.f2621a;
        }
        return new p(n02, new n(bundle), str, bVar.f2622b);
    }

    public static final void I(w2 w2Var, String str, Object obj) {
        List<b3> q10 = w2Var.q();
        int i10 = 0;
        while (true) {
            if (i10 >= q10.size()) {
                i10 = -1;
                break;
            } else if (str.equals(q10.get(i10).s())) {
                break;
            } else {
                i10++;
            }
        }
        a3 D = b3.D();
        D.q(str);
        if (obj instanceof Long) {
            D.s(((Long) obj).longValue());
        } else if (obj instanceof String) {
            D.r((String) obj);
        } else if (obj instanceof Double) {
            D.t(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList G = G((Bundle[]) obj);
            if (D.f2636q) {
                D.m();
                D.f2636q = false;
            }
            b3.N((b3) D.f2635p, G);
        }
        if (i10 >= 0) {
            if (w2Var.f2636q) {
                w2Var.m();
                w2Var.f2636q = false;
            }
            x2.D((x2) w2Var.f2635p, i10, (b3) D.j());
            return;
        }
        w2Var.t(D);
    }

    public static final b3 k(x2 x2Var, String str) {
        for (b3 next : x2Var.r()) {
            if (next.s().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r6v9, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable l(x2 x2Var, String str) {
        b3 k10 = k(x2Var, str);
        if (k10 == null) {
            return null;
        }
        if (k10.t()) {
            return k10.u();
        }
        if (k10.v()) {
            return Long.valueOf(k10.w());
        }
        if (k10.z()) {
            return Double.valueOf(k10.A());
        }
        if (k10.C() <= 0) {
            return null;
        }
        m6<b3> B = k10.B();
        ArrayList arrayList = new ArrayList();
        for (b3 b3Var : B) {
            if (b3Var != null) {
                Bundle bundle = new Bundle();
                for (b3 b3Var2 : b3Var.B()) {
                    if (b3Var2.t()) {
                        bundle.putString(b3Var2.s(), b3Var2.u());
                    } else if (b3Var2.v()) {
                        bundle.putLong(b3Var2.s(), b3Var2.w());
                    } else if (b3Var2.z()) {
                        bundle.putDouble(b3Var2.s(), b3Var2.A());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void o(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb.append("  ");
        }
    }

    public static final String p(boolean z, boolean z10, boolean z11) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z10) {
            sb.append("Sequence ");
        }
        if (z11) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static final void q(StringBuilder sb, String str, m3 m3Var) {
        if (m3Var != null) {
            o(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (m3Var.u() != 0) {
                o(sb, 4);
                sb.append("results: ");
                int i10 = 0;
                for (Long next : m3Var.t()) {
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next);
                    i10 = i11;
                }
                sb.append(10);
            }
            if (m3Var.s() != 0) {
                o(sb, 4);
                sb.append("status: ");
                int i12 = 0;
                for (Long next2 : m3Var.r()) {
                    int i13 = i12 + 1;
                    if (i12 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next2);
                    i12 = i13;
                }
                sb.append(10);
            }
            if (m3Var.w() != 0) {
                o(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i14 = 0;
                for (v2 v2Var : m3Var.v()) {
                    int i15 = i14 + 1;
                    if (i14 != 0) {
                        sb.append(", ");
                    }
                    sb.append(v2Var.r() ? Integer.valueOf(v2Var.s()) : null);
                    sb.append(":");
                    sb.append(v2Var.t() ? Long.valueOf(v2Var.u()) : null);
                    i14 = i15;
                }
                sb.append("}\n");
            }
            if (m3Var.z() != 0) {
                o(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i16 = 0;
                for (o3 o3Var : m3Var.y()) {
                    int i17 = i16 + 1;
                    if (i16 != 0) {
                        sb.append(", ");
                    }
                    sb.append(o3Var.r() ? Integer.valueOf(o3Var.s()) : null);
                    sb.append(": [");
                    int i18 = 0;
                    for (Long longValue : o3Var.t()) {
                        long longValue2 = longValue.longValue();
                        int i19 = i18 + 1;
                        if (i18 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i18 = i19;
                    }
                    sb.append("]");
                    i16 = i17;
                }
                sb.append("}\n");
            }
            o(sb, 3);
            sb.append("}\n");
        }
    }

    public static final void r(StringBuilder sb, int i10, String str, Object obj) {
        if (obj != null) {
            o(sb, i10 + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    public static final void s(StringBuilder sb, int i10, String str, e2 e2Var) {
        if (e2Var != null) {
            o(sb, i10);
            sb.append(str);
            sb.append(" {\n");
            if (e2Var.r()) {
                r(sb, i10, "comparison_type", e2Var.s().name());
            }
            if (e2Var.t()) {
                r(sb, i10, "match_as_float", Boolean.valueOf(e2Var.u()));
            }
            if (e2Var.v()) {
                r(sb, i10, "comparison_value", e2Var.w());
            }
            if (e2Var.x()) {
                r(sb, i10, "min_comparison_value", e2Var.y());
            }
            if (e2Var.z()) {
                r(sb, i10, "max_comparison_value", e2Var.A());
            }
            o(sb, i10);
            sb.append("}\n");
        }
    }

    public static boolean x(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean y(int i10, l6 l6Var) {
        if (i10 >= l6Var.size() * 64) {
            return false;
        }
        return ((1 << (i10 % 64)) & ((Long) l6Var.get(i10 / 64)).longValue()) != 0;
    }

    public static ArrayList z(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j8 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j8 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j8));
        }
        return arrayList;
    }

    public final List A(l6 l6Var, List list) {
        int i10;
        ArrayList arrayList = new ArrayList(l6Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            i4 i4Var = this.f5649o;
            if (intValue < 0) {
                g3 g3Var = i4Var.w;
                i4.n(g3Var);
                g3Var.w.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int intValue2 = num.intValue() / 64;
                if (intValue2 >= arrayList.size()) {
                    g3 g3Var2 = i4Var.w;
                    i4.n(g3Var2);
                    g3Var2.w.c(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(intValue2, Long.valueOf(((Long) arrayList.get(intValue2)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i10);
    }

    public final boolean B(long j8, long j10) {
        if (j8 == 0 || j10 <= 0) {
            return true;
        }
        this.f5649o.B.getClass();
        if (Math.abs(System.currentTimeMillis() - j8) > j10) {
            return true;
        }
        return false;
    }

    public final long C(byte[] bArr) {
        i4 i4Var = this.f5649o;
        g7 g7Var = i4Var.z;
        i4.l(g7Var);
        g7Var.g();
        MessageDigest x10 = g7.x();
        if (x10 != null) {
            return g7.y(x10.digest(bArr));
        }
        g3 g3Var = i4Var.w;
        i4.n(g3Var);
        g3Var.f5397t.a("Failed to get MD5");
        return 0;
    }

    public final byte[] D(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            g3 g3Var = this.f5649o.w;
            i4.n(g3Var);
            g3Var.f5397t.b(e10, "Failed to gzip content");
            throw e10;
        }
    }

    public final void i() {
    }

    public final void m(StringBuilder sb, int i10, m6 m6Var) {
        String str;
        String str2;
        Long l;
        if (m6Var != null) {
            int i11 = i10 + 1;
            Iterator it = m6Var.iterator();
            while (it.hasNext()) {
                b3 b3Var = (b3) it.next();
                if (b3Var != null) {
                    o(sb, i11);
                    sb.append("param {\n");
                    Double d = null;
                    if (b3Var.r()) {
                        b3 b3Var2 = this.f5649o.A;
                        i4.l(b3Var2);
                        str = b3Var2.m(b3Var.s());
                    } else {
                        str = null;
                    }
                    r(sb, i11, "name", str);
                    if (b3Var.t()) {
                        str2 = b3Var.u();
                    } else {
                        str2 = null;
                    }
                    r(sb, i11, "string_value", str2);
                    if (b3Var.v()) {
                        l = Long.valueOf(b3Var.w());
                    } else {
                        l = null;
                    }
                    r(sb, i11, "int_value", l);
                    if (b3Var.z()) {
                        d = Double.valueOf(b3Var.A());
                    }
                    r(sb, i11, "double_value", d);
                    if (b3Var.C() > 0) {
                        m(sb, i11, b3Var.B());
                    }
                    o(sb, i11);
                    sb.append("}\n");
                }
            }
        }
    }

    public final void n(StringBuilder sb, int i10, a2 a2Var) {
        if (a2Var != null) {
            o(sb, i10);
            sb.append("filter {\n");
            if (a2Var.v()) {
                r(sb, i10, "complement", Boolean.valueOf(a2Var.w()));
            }
            if (a2Var.x()) {
                b3 b3Var = this.f5649o.A;
                i4.l(b3Var);
                r(sb, i10, "param_name", b3Var.m(a2Var.y()));
            }
            if (a2Var.r()) {
                int i11 = i10 + 1;
                k2 s10 = a2Var.s();
                if (s10 != null) {
                    o(sb, i11);
                    sb.append("string_filter {\n");
                    if (s10.r()) {
                        r(sb, i11, "match_type", s10.s().name());
                    }
                    if (s10.t()) {
                        r(sb, i11, "expression", s10.u());
                    }
                    if (s10.v()) {
                        r(sb, i11, "case_sensitive", Boolean.valueOf(s10.w()));
                    }
                    if (s10.y() > 0) {
                        o(sb, i11 + 1);
                        sb.append("expression_list {\n");
                        for (String append : s10.x()) {
                            o(sb, i11 + 2);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    o(sb, i11);
                    sb.append("}\n");
                }
            }
            if (a2Var.t()) {
                s(sb, i10 + 1, "number_filter", a2Var.u());
            }
            o(sb, i10);
            sb.append("}\n");
        }
    }

    public final void t(a3 a3Var, Object obj) {
        if (a3Var.f2636q) {
            a3Var.m();
            a3Var.f2636q = false;
        }
        b3.H((b3) a3Var.f2635p);
        if (a3Var.f2636q) {
            a3Var.m();
            a3Var.f2636q = false;
        }
        b3.J((b3) a3Var.f2635p);
        if (a3Var.f2636q) {
            a3Var.m();
            a3Var.f2636q = false;
        }
        b3.L((b3) a3Var.f2635p);
        if (a3Var.f2636q) {
            a3Var.m();
            a3Var.f2636q = false;
        }
        b3.O((b3) a3Var.f2635p);
        if (obj instanceof String) {
            a3Var.r((String) obj);
        } else if (obj instanceof Long) {
            a3Var.s(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            a3Var.t(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList G = G((Bundle[]) obj);
            if (a3Var.f2636q) {
                a3Var.m();
                a3Var.f2636q = false;
            }
            b3.N((b3) a3Var.f2635p, G);
        } else {
            g3 g3Var = this.f5649o.w;
            i4.n(g3Var);
            g3Var.f5397t.b(obj, "Ignoring invalid (type) event param value");
        }
    }

    public final String u(d3 d3Var) {
        Long l;
        Long l8;
        Double d;
        StringBuilder g10 = x0.g("\nbatch {\n");
        for (f3 next : d3Var.r()) {
            if (next != null) {
                o(g10, 1);
                g10.append("bundle {\n");
                if (next.R()) {
                    r(g10, 1, "protocol_version", Integer.valueOf(next.R0()));
                }
                r(g10, 1, "platform", next.x1());
                if (next.t()) {
                    r(g10, 1, "gmp_version", Long.valueOf(next.u()));
                }
                if (next.v()) {
                    r(g10, 1, "uploading_gmp_version", Long.valueOf(next.w()));
                }
                if (next.w0()) {
                    r(g10, 1, "dynamite_version", Long.valueOf(next.x0()));
                }
                if (next.N()) {
                    r(g10, 1, "config_version", Long.valueOf(next.O()));
                }
                r(g10, 1, "gmp_app_id", next.G());
                r(g10, 1, "admob_app_id", next.v0());
                r(g10, 1, "app_id", next.r());
                r(g10, 1, "app_version", next.s());
                if (next.L()) {
                    r(g10, 1, "app_version_major", Integer.valueOf(next.M()));
                }
                r(g10, 1, "firebase_instance_id", next.K());
                if (next.B()) {
                    r(g10, 1, "dev_cert_hash", Long.valueOf(next.C()));
                }
                r(g10, 1, "app_store", next.D1());
                if (next.n1()) {
                    r(g10, 1, "upload_timestamp_millis", Long.valueOf(next.o1()));
                }
                if (next.p1()) {
                    r(g10, 1, "start_timestamp_millis", Long.valueOf(next.q1()));
                }
                if (next.r1()) {
                    r(g10, 1, "end_timestamp_millis", Long.valueOf(next.s1()));
                }
                if (next.t1()) {
                    r(g10, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(next.u1()));
                }
                if (next.v1()) {
                    r(g10, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(next.w1()));
                }
                r(g10, 1, "app_instance_id", next.A());
                r(g10, 1, "resettable_device_id", next.x());
                r(g10, 1, "ds_id", next.s0());
                if (next.y()) {
                    r(g10, 1, "limited_ad_tracking", Boolean.valueOf(next.z()));
                }
                r(g10, 1, "os_version", next.y1());
                r(g10, 1, "device_model", next.z1());
                r(g10, 1, "user_default_language", next.A1());
                if (next.B1()) {
                    r(g10, 1, "time_zone_offset_minutes", Integer.valueOf(next.C1()));
                }
                if (next.D()) {
                    r(g10, 1, "bundle_sequential_index", Integer.valueOf(next.E()));
                }
                if (next.H()) {
                    r(g10, 1, "service_upload", Boolean.valueOf(next.I()));
                }
                r(g10, 1, "health_monitor", next.F());
                i4 i4Var = this.f5649o;
                if (!i4Var.u.m((String) null, u2.f5740r0) && next.P() && next.Q() != 0) {
                    r(g10, 1, "android_id", Long.valueOf(next.Q()));
                }
                if (next.t0()) {
                    r(g10, 1, "retry_counter", Integer.valueOf(next.u0()));
                }
                if (next.z0()) {
                    r(g10, 1, "consent_signals", next.A0());
                }
                m6<q3> k12 = next.k1();
                b3 b3Var = i4Var.A;
                if (k12 != null) {
                    for (q3 q3Var : k12) {
                        if (q3Var != null) {
                            o(g10, 2);
                            g10.append("user_property {\n");
                            if (q3Var.r()) {
                                l = Long.valueOf(q3Var.s());
                            } else {
                                l = null;
                            }
                            r(g10, 2, "set_timestamp_millis", l);
                            i4.l(b3Var);
                            r(g10, 2, "name", b3Var.n(q3Var.t()));
                            r(g10, 2, "string_value", q3Var.v());
                            if (q3Var.w()) {
                                l8 = Long.valueOf(q3Var.x());
                            } else {
                                l8 = null;
                            }
                            r(g10, 2, "int_value", l8);
                            if (q3Var.y()) {
                                d = Double.valueOf(q3Var.z());
                            } else {
                                d = null;
                            }
                            r(g10, 2, "double_value", d);
                            o(g10, 2);
                            g10.append("}\n");
                        }
                    }
                }
                m6<t2> J = next.J();
                if (J != null) {
                    for (t2 t2Var : J) {
                        if (t2Var != null) {
                            o(g10, 2);
                            g10.append("audience_membership {\n");
                            if (t2Var.r()) {
                                r(g10, 2, "audience_id", Integer.valueOf(t2Var.s()));
                            }
                            if (t2Var.w()) {
                                r(g10, 2, "new_audience", Boolean.valueOf(t2Var.x()));
                            }
                            q(g10, "current_data", t2Var.t());
                            if (t2Var.u()) {
                                q(g10, "previous_data", t2Var.v());
                            }
                            o(g10, 2);
                            g10.append("}\n");
                        }
                    }
                }
                List<x2> h12 = next.h1();
                if (h12 != null) {
                    for (x2 next2 : h12) {
                        if (next2 != null) {
                            o(g10, 2);
                            g10.append("event {\n");
                            i4.l(b3Var);
                            r(g10, 2, "name", b3Var.l(next2.u()));
                            if (next2.v()) {
                                r(g10, 2, "timestamp_millis", Long.valueOf(next2.w()));
                            }
                            if (next2.x()) {
                                r(g10, 2, "previous_timestamp_millis", Long.valueOf(next2.y()));
                            }
                            if (next2.z()) {
                                r(g10, 2, "count", Integer.valueOf(next2.A()));
                            }
                            if (next2.s() != 0) {
                                m(g10, 2, (m6) next2.r());
                            }
                            o(g10, 2);
                            g10.append("}\n");
                        }
                    }
                }
                o(g10, 1);
                g10.append("}\n");
            }
        }
        g10.append("}\n");
        return g10.toString();
    }

    public final String v(g2 g2Var) {
        StringBuilder g10 = x0.g("\nproperty_filter {\n");
        if (g2Var.r()) {
            r(g10, 0, "filter_id", Integer.valueOf(g2Var.s()));
        }
        b3 b3Var = this.f5649o.A;
        i4.l(b3Var);
        r(g10, 0, "property_name", b3Var.n(g2Var.t()));
        String p10 = p(g2Var.v(), g2Var.w(), g2Var.y());
        if (!p10.isEmpty()) {
            r(g10, 0, "filter_type", p10);
        }
        n(g10, 1, g2Var.u());
        g10.append("}\n");
        return g10.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r5 = r4.f5649o.w;
        h5.i4.n(r5);
        r5.f5397t.a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T w(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ a -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ a -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ a -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ a -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ a -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002e
        L_0x001c:
            h5.i4 r5 = r4.f5649o     // Catch:{ all -> 0x001a }
            h5.g3 r5 = r5.w     // Catch:{ all -> 0x001a }
            h5.i4.n(r5)     // Catch:{ all -> 0x001a }
            h5.e3 r5 = r5.f5397t     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002e:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.b7.w(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }
}

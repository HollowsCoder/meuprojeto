package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;

public final class k2 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f2474a;

    /* renamed from: b  reason: collision with root package name */
    public static final u2<?, ?> f2475b = s(false);

    /* renamed from: c  reason: collision with root package name */
    public static final u2<?, ?> f2476c = s(true);
    public static final w2 d = new w2();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f2474a = cls;
    }

    public static void A(int i10, List list, y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            x xVar = yVar.f2594a;
            int i11 = 0;
            if (z) {
                xVar.R(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).longValue();
                    Logger logger = x.f2576p;
                    i12 += 8;
                }
                xVar.t0(i12);
                while (i11 < list.size()) {
                    xVar.e0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                xVar.b0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static int B(List<?> list) {
        return list.size() << 2;
    }

    public static void C(int i10, List list, y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            x xVar = yVar.f2594a;
            int i11 = 0;
            if (z) {
                xVar.R(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += x.w0(((Integer) list.get(i13)).intValue());
                }
                xVar.t0(i12);
                while (i11 < list.size()) {
                    xVar.s0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                xVar.a0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static int D(List<?> list) {
        return list.size() << 3;
    }

    public static void E(int i10, List list, y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            x xVar = yVar.f2594a;
            int i11 = 0;
            if (z) {
                xVar.R(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += x.x0(((Integer) list.get(i13)).intValue());
                }
                xVar.t0(i12);
                while (i11 < list.size()) {
                    xVar.t0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                xVar.d0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static int F(List<?> list) {
        return list.size();
    }

    public static void G(int i10, List list, y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            x xVar = yVar.f2594a;
            int i11 = 0;
            if (z) {
                xVar.R(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    int intValue = ((Integer) list.get(i13)).intValue();
                    i12 += x.x0((intValue >> 31) ^ (intValue << 1));
                }
                xVar.t0(i12);
                while (i11 < list.size()) {
                    int intValue2 = ((Integer) list.get(i11)).intValue();
                    xVar.t0((intValue2 >> 31) ^ (intValue2 << 1));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                int intValue3 = ((Integer) list.get(i11)).intValue();
                xVar.d0(i10, (intValue3 >> 31) ^ (intValue3 << 1));
                i11++;
            }
        }
    }

    public static void H(int i10, List list, y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            x xVar = yVar.f2594a;
            int i11 = 0;
            if (z) {
                xVar.R(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).intValue();
                    Logger logger = x.f2576p;
                    i12 += 4;
                }
                xVar.t0(i12);
                while (i11 < list.size()) {
                    xVar.u0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                xVar.i0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void I(int i10, List list, y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            x xVar = yVar.f2594a;
            int i11 = 0;
            if (z) {
                xVar.R(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).intValue();
                    Logger logger = x.f2576p;
                    i12 += 4;
                }
                xVar.t0(i12);
                while (i11 < list.size()) {
                    xVar.u0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                xVar.i0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void J(int i10, List list, y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            x xVar = yVar.f2594a;
            int i11 = 0;
            if (z) {
                xVar.R(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += x.w0(((Integer) list.get(i13)).intValue());
                }
                xVar.t0(i12);
                while (i11 < list.size()) {
                    xVar.s0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                xVar.a0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void K(int i10, List list, y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            x xVar = yVar.f2594a;
            int i11 = 0;
            if (z) {
                xVar.R(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Boolean) list.get(i13)).booleanValue();
                    Logger logger = x.f2576p;
                    i12++;
                }
                xVar.t0(i12);
                while (i11 < list.size()) {
                    xVar.H(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : 0);
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                xVar.U(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
        }
    }

    public static int L(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (x.v0(i10) * list.size()) + a(list);
    }

    public static int M(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x.v0(i10) * size) + g(list);
    }

    public static int N(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x.v0(i10) * size) + n(list);
    }

    public static int O(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x.v0(i10) * size) + r(list);
    }

    public static int P(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x.v0(i10) * size) + v(list);
    }

    public static int Q(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x.v0(i10) * size) + x(list);
    }

    public static int R(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x.v0(i10) * size) + z(list);
    }

    public static int S(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return x.p0(i10) * size;
    }

    public static int T(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return x.j0(i10) * size;
    }

    public static int U(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return x.X(i10) * size;
    }

    public static int a(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h1) {
            h1 h1Var = (h1) list;
            i10 = 0;
            while (i11 < size) {
                h1Var.h(i11);
                i10 += x.h0(h1Var.f2448p[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + x.h0(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static Object b(int i10, u0 u0Var, t0 t0Var, v2 v2Var, u2 u2Var) {
        if (t0Var == null) {
            return v2Var;
        }
        if (u0Var instanceof RandomAccess) {
            int size = u0Var.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = ((Integer) u0Var.get(i12)).intValue();
                if (t0Var.j(intValue) != null) {
                    if (i12 != i11) {
                        u0Var.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    if (v2Var == null) {
                        v2Var = u2Var.e();
                    }
                    u2Var.a(i10, (long) intValue, v2Var);
                }
            }
            if (i11 != size) {
                u0Var.subList(i11, size).clear();
            }
        } else {
            Iterator it = u0Var.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (t0Var.j(intValue2) == null) {
                    if (v2Var == null) {
                        v2Var = u2Var.e();
                    }
                    u2Var.a(i10, (long) intValue2, v2Var);
                    it.remove();
                }
            }
        }
        return v2Var;
    }

    public static void c(int i10, List list, y yVar) {
        if (list != null && !list.isEmpty()) {
            yVar.getClass();
            boolean z = list instanceof d1;
            int i11 = 0;
            x xVar = yVar.f2594a;
            if (z) {
                d1 d1Var = (d1) list;
                while (i11 < list.size()) {
                    Object V = d1Var.V(i11);
                    if (V instanceof String) {
                        xVar.M((String) V, i10);
                    } else {
                        xVar.J(i10, (u) V);
                    }
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                xVar.M((String) list.get(i11), i10);
                i11++;
            }
        }
    }

    public static void d(int i10, List list, y yVar, i2 i2Var) {
        if (list != null && !list.isEmpty()) {
            yVar.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                yVar.e(i10, i2Var, list.get(i11));
            }
        }
    }

    public static void e(int i10, List list, y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            x xVar = yVar.f2594a;
            int i11 = 0;
            if (z) {
                xVar.R(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Double) list.get(i13)).doubleValue();
                    Logger logger = x.f2576p;
                    i12 += 8;
                }
                xVar.t0(i12);
                while (i11 < list.size()) {
                    xVar.e0(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                double doubleValue = ((Double) list.get(i11)).doubleValue();
                xVar.getClass();
                xVar.b0(i10, Double.doubleToRawLongBits(doubleValue));
                i11++;
            }
        }
    }

    public static <T, FT extends j0<FT>> void f(c0<FT> c0Var, T t10, T t11) {
        m2 m2Var;
        g0<FT> a10 = c0Var.a(t11);
        if (!a10.a()) {
            g0<FT> d10 = c0Var.d(t10);
            d10.getClass();
            int i10 = 0;
            while (true) {
                m2Var = a10.f2421a;
                if (i10 >= m2Var.e()) {
                    break;
                }
                d10.k(m2Var.c(i10));
                i10++;
            }
            for (Map.Entry k10 : m2Var.f()) {
                d10.k(k10);
            }
        }
    }

    public static int g(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h1) {
            h1 h1Var = (h1) list;
            i10 = 0;
            while (i11 < size) {
                h1Var.h(i11);
                i10 += x.h0(h1Var.f2448p[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + x.h0(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void h(int i10, List list, y yVar) {
        if (list != null && !list.isEmpty()) {
            yVar.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                yVar.f2594a.J(i10, (u) list.get(i11));
            }
        }
    }

    public static void i(int i10, List list, y yVar, i2 i2Var) {
        if (list != null && !list.isEmpty()) {
            yVar.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                yVar.h(i10, i2Var, list.get(i11));
            }
        }
    }

    public static void j(int i10, List list, y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            x xVar = yVar.f2594a;
            int i11 = 0;
            if (z) {
                xVar.R(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Float) list.get(i13)).floatValue();
                    Logger logger = x.f2576p;
                    i12 += 4;
                }
                xVar.t0(i12);
                while (i11 < list.size()) {
                    xVar.u0(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                float floatValue = ((Float) list.get(i11)).floatValue();
                xVar.getClass();
                xVar.i0(i10, Float.floatToRawIntBits(floatValue));
                i11++;
            }
        }
    }

    public static int k(int i10, i2 i2Var, Object obj) {
        if (obj instanceof b1) {
            int v02 = x.v0(i10);
            int a10 = ((b1) obj).a();
            return x.x0(a10) + a10 + v02;
        }
        int v03 = x.v0(i10);
        m mVar = (m) ((r1) obj);
        int b10 = mVar.b();
        if (b10 == -1) {
            b10 = i2Var.d(mVar);
            mVar.a(b10);
        }
        return x.x0(b10) + b10 + v03;
    }

    public static int l(int i10, List<?> list) {
        int i11;
        int i12;
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        int v02 = x.v0(i10) * size;
        if (list instanceof d1) {
            d1 d1Var = (d1) list;
            while (i13 < size) {
                Object V = d1Var.V(i13);
                if (V instanceof u) {
                    int size2 = ((u) V).size();
                    i12 = x.x0(size2) + size2;
                } else {
                    i12 = x.n0((String) V);
                }
                v02 += i12;
                i13++;
            }
        } else {
            while (i13 < size) {
                Object obj = list.get(i13);
                if (obj instanceof u) {
                    int size3 = ((u) obj).size();
                    i11 = x.x0(size3) + size3;
                } else {
                    i11 = x.n0((String) obj);
                }
                v02 += i11;
                i13++;
            }
        }
        return v02;
    }

    public static int m(int i10, List<?> list, i2 i2Var) {
        int i11;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int v02 = x.v0(i10) * size;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            if (obj instanceof b1) {
                i11 = x.G((b1) obj);
            } else {
                m mVar = (m) ((r1) obj);
                int b10 = mVar.b();
                if (b10 == -1) {
                    b10 = i2Var.d(mVar);
                    mVar.a(b10);
                }
                i11 = x.x0(b10) + b10;
            }
            v02 += i11;
        }
        return v02;
    }

    public static int n(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h1) {
            h1 h1Var = (h1) list;
            i10 = 0;
            while (i11 < size) {
                h1Var.h(i11);
                long j8 = h1Var.f2448p[i11];
                i10 += x.h0((j8 >> 63) ^ (j8 << 1));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                long longValue = list.get(i11).longValue();
                i12 = i10 + x.h0((longValue >> 63) ^ (longValue << 1));
                i11++;
            }
        }
        return i10;
    }

    public static void o(int i10, List list, y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            x xVar = yVar.f2594a;
            int i11 = 0;
            if (z) {
                xVar.R(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += x.h0(((Long) list.get(i13)).longValue());
                }
                xVar.t0(i12);
                while (i11 < list.size()) {
                    xVar.V(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                xVar.I(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static int p(int i10, List<u> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int v02 = x.v0(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int size2 = list.get(i11).size();
            v02 += x.x0(size2) + size2;
        }
        return v02;
    }

    public static int q(int i10, List<r1> list, i2 i2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += x.Z(i10, list.get(i12), i2Var);
        }
        return i11;
    }

    public static int r(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q0) {
            q0 q0Var = (q0) list;
            i10 = 0;
            while (i11 < size) {
                q0Var.i(i11);
                i10 += x.w0(q0Var.f2526p[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + x.w0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static u2<?, ?> s(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (u2) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void t(int i10, List list, y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            x xVar = yVar.f2594a;
            int i11 = 0;
            if (z) {
                xVar.R(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += x.h0(((Long) list.get(i13)).longValue());
                }
                xVar.t0(i12);
                while (i11 < list.size()) {
                    xVar.V(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                xVar.I(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static boolean u(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int v(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q0) {
            q0 q0Var = (q0) list;
            i10 = 0;
            while (i11 < size) {
                q0Var.i(i11);
                i10 += x.w0(q0Var.f2526p[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + x.w0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void w(int i10, List list, y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            x xVar = yVar.f2594a;
            int i11 = 0;
            if (z) {
                xVar.R(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    long longValue = ((Long) list.get(i13)).longValue();
                    i12 += x.h0((longValue >> 63) ^ (longValue << 1));
                }
                xVar.t0(i12);
                while (i11 < list.size()) {
                    long longValue2 = ((Long) list.get(i11)).longValue();
                    xVar.V((longValue2 >> 63) ^ (longValue2 << 1));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                long longValue3 = ((Long) list.get(i11)).longValue();
                xVar.I(i10, (longValue3 >> 63) ^ (longValue3 << 1));
                i11++;
            }
        }
    }

    public static int x(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q0) {
            q0 q0Var = (q0) list;
            i10 = 0;
            while (i11 < size) {
                q0Var.i(i11);
                i10 += x.x0(q0Var.f2526p[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + x.x0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void y(int i10, List list, y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            x xVar = yVar.f2594a;
            int i11 = 0;
            if (z) {
                xVar.R(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).longValue();
                    Logger logger = x.f2576p;
                    i12 += 8;
                }
                xVar.t0(i12);
                while (i11 < list.size()) {
                    xVar.e0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                xVar.b0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static int z(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q0) {
            q0 q0Var = (q0) list;
            i10 = 0;
            while (i11 < size) {
                q0Var.i(i11);
                int i12 = q0Var.f2526p[i11];
                i10 += x.x0((i12 >> 31) ^ (i12 << 1));
                i11++;
            }
        } else {
            int i13 = 0;
            while (i11 < size) {
                int intValue = list.get(i11).intValue();
                i13 = i10 + x.x0((intValue >> 31) ^ (intValue << 1));
                i11++;
            }
        }
        return i10;
    }
}

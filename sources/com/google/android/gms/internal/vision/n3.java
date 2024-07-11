package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;

public final class n3 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f3120a;

    /* renamed from: b  reason: collision with root package name */
    public static final w3<?, ?> f3121b = e(false);

    /* renamed from: c  reason: collision with root package name */
    public static final w3<?, ?> f3122c = e(true);
    public static final x3 d = new x3();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f3120a = cls;
    }

    public static int A(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s1) {
            s1 s1Var = (s1) list;
            i10 = 0;
            while (i11 < size) {
                s1Var.i(i11);
                i10 += a1.i0(s1Var.f3162p[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + a1.i0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void B(int i10, List list, b1 b1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            a1 a1Var = b1Var.f3058a;
            int i11 = 0;
            if (z) {
                a1Var.H(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    long longValue = ((Long) list.get(i13)).longValue();
                    i12 += a1.g0((longValue >> 63) ^ (longValue << 1));
                }
                a1Var.S(i12);
                while (i11 < list.size()) {
                    long longValue2 = ((Long) list.get(i11)).longValue();
                    a1Var.N((longValue2 >> 63) ^ (longValue2 << 1));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                long longValue3 = ((Long) list.get(i11)).longValue();
                a1Var.I(i10, (longValue3 >> 63) ^ (longValue3 << 1));
                i11++;
            }
        }
    }

    public static int C(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (a1.e0(i10) * size) + D(list);
    }

    public static int D(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s1) {
            s1 s1Var = (s1) list;
            i10 = 0;
            while (i11 < size) {
                s1Var.i(i11);
                i10 += a1.n0(s1Var.f3162p[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + a1.n0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void E(int i10, List list, b1 b1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            a1 a1Var = b1Var.f3058a;
            int i11 = 0;
            if (z) {
                a1Var.H(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).longValue();
                    Logger logger = a1.f3034p;
                    i12 += 8;
                }
                a1Var.S(i12);
                while (i11 < list.size()) {
                    a1Var.b0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                a1Var.a0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static int F(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (a1.e0(i10) * size) + G(list);
    }

    public static int G(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s1) {
            s1 s1Var = (s1) list;
            i10 = 0;
            while (i11 < size) {
                s1Var.i(i11);
                int i12 = s1Var.f3162p[i11];
                i10 += a1.n0((i12 >> 31) ^ (i12 << 1));
                i11++;
            }
        } else {
            int i13 = 0;
            while (i11 < size) {
                int intValue = list.get(i11).intValue();
                i13 = i10 + a1.n0((intValue >> 31) ^ (intValue << 1));
                i11++;
            }
        }
        return i10;
    }

    public static void H(int i10, List list, b1 b1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            a1 a1Var = b1Var.f3058a;
            int i11 = 0;
            if (z) {
                a1Var.H(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).longValue();
                    Logger logger = a1.f3034p;
                    i12 += 8;
                }
                a1Var.S(i12);
                while (i11 < list.size()) {
                    a1Var.b0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                a1Var.a0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static int I(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return a1.q0(i10) * size;
    }

    public static int J(List<?> list) {
        return list.size() << 2;
    }

    public static void K(int i10, List list, b1 b1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            a1 a1Var = b1Var.f3058a;
            int i11 = 0;
            if (z) {
                a1Var.H(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += a1.i0(((Integer) list.get(i13)).intValue());
                }
                a1Var.S(i12);
                while (i11 < list.size()) {
                    a1Var.G(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                a1Var.T(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static int L(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return a1.l0(i10) * size;
    }

    public static int M(List<?> list) {
        return list.size() << 3;
    }

    public static void N(int i10, List list, b1 b1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            a1 a1Var = b1Var.f3058a;
            int i11 = 0;
            if (z) {
                a1Var.H(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += a1.n0(((Integer) list.get(i13)).intValue());
                }
                a1Var.S(i12);
                while (i11 < list.size()) {
                    a1Var.S(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                a1Var.Z(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static int O(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return a1.V(i10) * size;
    }

    public static int P(List<?> list) {
        return list.size();
    }

    public static void Q(int i10, List list, b1 b1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            a1 a1Var = b1Var.f3058a;
            int i11 = 0;
            if (z) {
                a1Var.H(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    int intValue = ((Integer) list.get(i13)).intValue();
                    i12 += a1.n0((intValue >> 31) ^ (intValue << 1));
                }
                a1Var.S(i12);
                while (i11 < list.size()) {
                    int intValue2 = ((Integer) list.get(i11)).intValue();
                    a1Var.S((intValue2 >> 31) ^ (intValue2 << 1));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                int intValue3 = ((Integer) list.get(i11)).intValue();
                a1Var.Z(i10, (intValue3 >> 31) ^ (intValue3 << 1));
                i11++;
            }
        }
    }

    public static void R(int i10, List list, b1 b1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            a1 a1Var = b1Var.f3058a;
            int i11 = 0;
            if (z) {
                a1Var.H(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).intValue();
                    Logger logger = a1.f3034p;
                    i12 += 4;
                }
                a1Var.S(i12);
                while (i11 < list.size()) {
                    a1Var.d0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                a1Var.h0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void S(int i10, List list, b1 b1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            a1 a1Var = b1Var.f3058a;
            int i11 = 0;
            if (z) {
                a1Var.H(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).intValue();
                    Logger logger = a1.f3034p;
                    i12 += 4;
                }
                a1Var.S(i12);
                while (i11 < list.size()) {
                    a1Var.d0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                a1Var.h0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void T(int i10, List list, b1 b1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            a1 a1Var = b1Var.f3058a;
            int i11 = 0;
            if (z) {
                a1Var.H(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += a1.i0(((Integer) list.get(i13)).intValue());
                }
                a1Var.S(i12);
                while (i11 < list.size()) {
                    a1Var.G(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                a1Var.T(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void U(int i10, List list, b1 b1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            a1 a1Var = b1Var.f3058a;
            int i11 = 0;
            if (z) {
                a1Var.H(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Boolean) list.get(i13)).booleanValue();
                    Logger logger = a1.f3034p;
                    i12++;
                }
                a1Var.S(i12);
                while (i11 < list.size()) {
                    a1Var.F(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : 0);
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                a1Var.M(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
        }
    }

    public static int a(int i10, m3 m3Var, Object obj) {
        int i11;
        if (obj instanceof h2) {
            h2 h2Var = (h2) obj;
            int n02 = a1.n0(i10 << 3);
            if (h2Var.f3096b != null) {
                i11 = h2Var.f3096b.p();
            } else if (h2Var.f3095a != null) {
                i11 = h2Var.f3095a.n();
            } else {
                i11 = 0;
            }
            return a1.n0(i11) + i11 + n02;
        }
        int n03 = a1.n0(i10 << 3);
        n0 n0Var = (n0) ((w2) obj);
        int f10 = n0Var.f();
        if (f10 == -1) {
            f10 = m3Var.e(n0Var);
            n0Var.b(f10);
        }
        return a1.n0(f10) + f10 + n03;
    }

    public static int b(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (a1.e0(i10) * list.size()) + d(list);
    }

    public static int c(int i10, List<?> list, m3 m3Var) {
        int i11;
        int i12;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e02 = a1.e0(i10) * size;
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = list.get(i13);
            if (obj instanceof h2) {
                h2 h2Var = (h2) obj;
                if (h2Var.f3096b != null) {
                    i12 = h2Var.f3096b.p();
                } else if (h2Var.f3095a != null) {
                    i12 = h2Var.f3095a.n();
                } else {
                    i12 = 0;
                }
                i11 = a1.n0(i12);
            } else {
                n0 n0Var = (n0) ((w2) obj);
                i11 = n0Var.f();
                if (i11 == -1) {
                    i11 = m3Var.e(n0Var);
                    n0Var.b(i11);
                }
                i12 = a1.n0(i11);
            }
            e02 += i11 + i12;
        }
        return e02;
    }

    public static int d(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof l2) {
            l2 l2Var = (l2) list;
            i10 = 0;
            while (i11 < size) {
                l2Var.i(i11);
                i10 += a1.g0(l2Var.f3113p[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + a1.g0(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static w3<?, ?> e(boolean z) {
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
            return (w3) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static Object f(int i10, a2 a2Var, v1 v1Var, y3 y3Var, w3 w3Var) {
        if (v1Var == null) {
            return y3Var;
        }
        if (a2Var instanceof RandomAccess) {
            int size = a2Var.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = ((Integer) a2Var.get(i12)).intValue();
                if (v1Var.d(intValue)) {
                    if (i12 != i11) {
                        a2Var.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    if (y3Var == null) {
                        y3Var = w3Var.a();
                    }
                    w3Var.b(i10, (long) intValue, y3Var);
                }
            }
            if (i11 != size) {
                a2Var.subList(i11, size).clear();
            }
        } else {
            Iterator it = a2Var.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!v1Var.d(intValue2)) {
                    if (y3Var == null) {
                        y3Var = w3Var.a();
                    }
                    w3Var.b(i10, (long) intValue2, y3Var);
                    it.remove();
                }
            }
        }
        return y3Var;
    }

    public static void g(int i10, List list, b1 b1Var) {
        if (list != null && !list.isEmpty()) {
            b1Var.getClass();
            boolean z = list instanceof j2;
            int i11 = 0;
            a1 a1Var = b1Var.f3058a;
            if (z) {
                j2 j2Var = (j2) list;
                while (i11 < list.size()) {
                    Object j8 = j2Var.j(i11);
                    if (j8 instanceof String) {
                        a1Var.O((String) j8, i10);
                    } else {
                        a1Var.J(i10, (w0) j8);
                    }
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                a1Var.O((String) list.get(i11), i10);
                i11++;
            }
        }
    }

    public static void h(int i10, List list, b1 b1Var, m3 m3Var) {
        if (list != null && !list.isEmpty()) {
            b1Var.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                b1Var.f(i10, m3Var, list.get(i11));
            }
        }
    }

    public static void i(int i10, List list, b1 b1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            a1 a1Var = b1Var.f3058a;
            int i11 = 0;
            if (z) {
                a1Var.H(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Double) list.get(i13)).doubleValue();
                    Logger logger = a1.f3034p;
                    i12 += 8;
                }
                a1Var.S(i12);
                while (i11 < list.size()) {
                    a1Var.b0(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                double doubleValue = ((Double) list.get(i11)).doubleValue();
                a1Var.getClass();
                a1Var.a0(i10, Double.doubleToRawLongBits(doubleValue));
                i11++;
            }
        }
    }

    public static <T, FT extends l1<FT>> void j(f1<FT> f1Var, T t10, T t11) {
        p3<T, Object> p3Var;
        j1<FT> a10 = f1Var.a(t11);
        if (!a10.f3101a.isEmpty()) {
            j1<FT> f10 = f1Var.f(t10);
            f10.getClass();
            int i10 = 0;
            while (true) {
                p3Var = a10.f3101a;
                if (i10 >= p3Var.e()) {
                    break;
                }
                f10.f(p3Var.d(i10));
                i10++;
            }
            for (Map.Entry<T, Object> f11 : p3Var.g()) {
                f10.f(f11);
            }
        }
    }

    public static boolean k(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int l(int i10, List<?> list) {
        int i11;
        int i12;
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        int e02 = a1.e0(i10) * size;
        if (list instanceof j2) {
            j2 j2Var = (j2) list;
            while (i13 < size) {
                Object j8 = j2Var.j(i13);
                if (j8 instanceof w0) {
                    int p10 = ((w0) j8).p();
                    i12 = a1.n0(p10) + p10;
                } else {
                    i12 = a1.Q((String) j8);
                }
                e02 += i12;
                i13++;
            }
        } else {
            while (i13 < size) {
                Object obj = list.get(i13);
                if (obj instanceof w0) {
                    int p11 = ((w0) obj).p();
                    i11 = a1.n0(p11) + p11;
                } else {
                    i11 = a1.Q((String) obj);
                }
                e02 += i11;
                i13++;
            }
        }
        return e02;
    }

    public static int m(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (a1.e0(i10) * size) + o(list);
    }

    public static int n(int i10, List<w2> list, m3 m3Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += a1.Y(i10, list.get(i12), m3Var);
        }
        return i11;
    }

    public static int o(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof l2) {
            l2 l2Var = (l2) list;
            i10 = 0;
            while (i11 < size) {
                l2Var.i(i11);
                i10 += a1.g0(l2Var.f3113p[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + a1.g0(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void p(int i10, List list, b1 b1Var) {
        if (list != null && !list.isEmpty()) {
            b1Var.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                b1Var.f3058a.J(i10, (w0) list.get(i11));
            }
        }
    }

    public static void q(int i10, List list, b1 b1Var, m3 m3Var) {
        if (list != null && !list.isEmpty()) {
            b1Var.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                b1Var.k(i10, m3Var, list.get(i11));
            }
        }
    }

    public static void r(int i10, List list, b1 b1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            a1 a1Var = b1Var.f3058a;
            int i11 = 0;
            if (z) {
                a1Var.H(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Float) list.get(i13)).floatValue();
                    Logger logger = a1.f3034p;
                    i12 += 4;
                }
                a1Var.S(i12);
                while (i11 < list.size()) {
                    a1Var.d0(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                float floatValue = ((Float) list.get(i11)).floatValue();
                a1Var.getClass();
                a1Var.h0(i10, Float.floatToRawIntBits(floatValue));
                i11++;
            }
        }
    }

    public static int s(int i10, List<w0> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e02 = a1.e0(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int p10 = list.get(i11).p();
            e02 += a1.n0(p10) + p10;
        }
        return e02;
    }

    public static int t(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (a1.e0(i10) * size) + u(list);
    }

    public static int u(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof l2) {
            l2 l2Var = (l2) list;
            i10 = 0;
            while (i11 < size) {
                l2Var.i(i11);
                long j8 = l2Var.f3113p[i11];
                i10 += a1.g0((j8 >> 63) ^ (j8 << 1));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                long longValue = list.get(i11).longValue();
                i12 = i10 + a1.g0((longValue >> 63) ^ (longValue << 1));
                i11++;
            }
        }
        return i10;
    }

    public static void v(int i10, List list, b1 b1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            a1 a1Var = b1Var.f3058a;
            int i11 = 0;
            if (z) {
                a1Var.H(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += a1.g0(((Long) list.get(i13)).longValue());
                }
                a1Var.S(i12);
                while (i11 < list.size()) {
                    a1Var.N(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                a1Var.I(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static int w(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (a1.e0(i10) * size) + x(list);
    }

    public static int x(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s1) {
            s1 s1Var = (s1) list;
            i10 = 0;
            while (i11 < size) {
                s1Var.i(i11);
                i10 += a1.i0(s1Var.f3162p[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + a1.i0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void y(int i10, List list, b1 b1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            a1 a1Var = b1Var.f3058a;
            int i11 = 0;
            if (z) {
                a1Var.H(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += a1.g0(((Long) list.get(i13)).longValue());
                }
                a1Var.S(i12);
                while (i11 < list.size()) {
                    a1Var.N(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                a1Var.I(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static int z(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (a1.e0(i10) * size) + A(list);
    }
}

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public final class u7 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f2955a;

    /* renamed from: b  reason: collision with root package name */
    public static final e8<?, ?> f2956b = u(false);

    /* renamed from: c  reason: collision with root package name */
    public static final e8<?, ?> f2957c = u(true);
    public static final g8 d = new g8();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f2955a = cls;
    }

    public static int A(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n5.X0(i10) * size) + z(list);
    }

    public static int B(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof g6) {
            g6 g6Var = (g6) list;
            i10 = 0;
            while (i11 < size) {
                g6Var.i(i11);
                i10 += n5.Y0(g6Var.f2719p[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + n5.Y0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int C(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n5.X0(i10) * size) + B(list);
    }

    public static int D(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof g6) {
            g6 g6Var = (g6) list;
            i10 = 0;
            while (i11 < size) {
                g6Var.i(i11);
                i10 += n5.Y0(g6Var.f2719p[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + n5.Y0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int E(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n5.X0(i10) * size) + D(list);
    }

    public static int F(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof g6) {
            g6 g6Var = (g6) list;
            i10 = 0;
            while (i11 < size) {
                g6Var.i(i11);
                i10 += n5.Z0(g6Var.f2719p[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + n5.Z0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int G(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n5.X0(i10) * size) + F(list);
    }

    public static int H(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof g6) {
            g6 g6Var = (g6) list;
            i10 = 0;
            while (i11 < size) {
                g6Var.i(i11);
                int i12 = g6Var.f2719p[i11];
                i10 += n5.Z0((i12 >> 31) ^ (i12 + i12));
                i11++;
            }
        } else {
            int i13 = 0;
            while (i11 < size) {
                int intValue = list.get(i11).intValue();
                i13 = i10 + n5.Z0((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    public static int I(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n5.X0(i10) * size) + H(list);
    }

    public static int J(List<?> list) {
        return list.size() * 4;
    }

    public static int K(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n5.Z0(i10 << 3) + 4) * size;
    }

    public static int L(List<?> list) {
        return list.size() * 8;
    }

    public static int M(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n5.Z0(i10 << 3) + 8) * size;
    }

    public static int N(List<?> list) {
        return list.size();
    }

    public static int O(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n5.Z0(i10 << 3) + 1) * size;
    }

    public static int P(int i10, List<?> list) {
        int i11;
        int i12;
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        int X0 = n5.X0(i10) * size;
        if (list instanceof t6) {
            t6 t6Var = (t6) list;
            while (i13 < size) {
                Object T = t6Var.T(i13);
                if (T instanceof k5) {
                    int i14 = ((k5) T).i();
                    i12 = n5.Z0(i14) + i14;
                } else {
                    i12 = n5.b1((String) T);
                }
                X0 += i12;
                i13++;
            }
        } else {
            while (i13 < size) {
                Object obj = list.get(i13);
                if (obj instanceof k5) {
                    int i15 = ((k5) obj).i();
                    i11 = n5.Z0(i15) + i15;
                } else {
                    i11 = n5.b1((String) obj);
                }
                X0 += i11;
                i13++;
            }
        }
        return X0;
    }

    public static int Q(int i10, t7 t7Var, Object obj) {
        int i11;
        if (obj instanceof r6) {
            r6 r6Var = (r6) obj;
            int Z0 = n5.Z0(i10 << 3);
            if (r6Var.f2907b != null) {
                i11 = ((j5) r6Var.f2907b).f2756q.length;
            } else if (r6Var.f2906a != null) {
                i11 = r6Var.f2906a.d();
            } else {
                i11 = 0;
            }
            return n5.Z0(i11) + i11 + Z0;
        }
        int Z02 = n5.Z0(i10 << 3);
        b5 b5Var = (b5) ((i7) obj);
        int b10 = b5Var.b();
        if (b10 == -1) {
            b10 = t7Var.g(b5Var);
            b5Var.f(b10);
        }
        return n5.Z0(b10) + b10 + Z02;
    }

    public static int R(int i10, List<?> list, t7 t7Var) {
        int i11;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int X0 = n5.X0(i10) * size;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            if (obj instanceof r6) {
                r6 r6Var = (r6) obj;
                if (r6Var.f2907b != null) {
                    i11 = ((j5) r6Var.f2907b).f2756q.length;
                } else if (r6Var.f2906a != null) {
                    i11 = r6Var.f2906a.d();
                } else {
                    i11 = 0;
                }
                X0 = n5.Z0(i11) + i11 + X0;
            } else {
                b5 b5Var = (b5) ((i7) obj);
                int b10 = b5Var.b();
                if (b10 == -1) {
                    b10 = t7Var.g(b5Var);
                    b5Var.f(b10);
                }
                X0 = n5.Z0(b10) + b10 + X0;
            }
        }
        return X0;
    }

    public static int S(int i10, List<k5> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int X0 = n5.X0(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int i12 = list.get(i11).i();
            X0 += n5.Z0(i12) + i12;
        }
        return X0;
    }

    public static int T(int i10, List<i7> list, t7 t7Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += n5.H0(i10, list.get(i12), t7Var);
        }
        return i11;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    public static Object b(int i10, m6 m6Var, j6 j6Var, f8 f8Var, e8 e8Var) {
        if (j6Var == null) {
            return f8Var;
        }
        if (m6Var instanceof RandomAccess) {
            int size = m6Var.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = ((Integer) m6Var.get(i12)).intValue();
                if (j6Var.d(intValue)) {
                    if (i12 != i11) {
                        m6Var.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    if (f8Var == null) {
                        f8Var = e8Var.b();
                    }
                    e8Var.a(i10, (long) intValue, f8Var);
                }
            }
            if (i11 != size) {
                m6Var.subList(i11, size).clear();
                return f8Var;
            }
        } else {
            Iterator it = m6Var.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!j6Var.d(intValue2)) {
                    if (f8Var == null) {
                        f8Var = e8Var.b();
                    }
                    e8Var.a(i10, (long) intValue2, f8Var);
                    it.remove();
                }
            }
        }
        return f8Var;
    }

    public static void c(int i10, List<Double> list, o5 o5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            n5 n5Var = o5Var.f2859a;
            int i11 = 0;
            if (z) {
                n5Var.I0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    list.get(i13).doubleValue();
                    i12 += 8;
                }
                n5Var.T0(i12);
                while (i11 < list.size()) {
                    n5Var.W0(Double.doubleToRawLongBits(list.get(i11).doubleValue()));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                n5Var.N0(i10, Double.doubleToRawLongBits(list.get(i11).doubleValue()));
                i11++;
            }
        }
    }

    public static void d(int i10, List<Float> list, o5 o5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            n5 n5Var = o5Var.f2859a;
            int i11 = 0;
            if (z) {
                n5Var.I0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    list.get(i13).floatValue();
                    i12 += 4;
                }
                n5Var.T0(i12);
                while (i11 < list.size()) {
                    n5Var.U0(Float.floatToRawIntBits(list.get(i11).floatValue()));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                n5Var.L0(i10, Float.floatToRawIntBits(list.get(i11).floatValue()));
                i11++;
            }
        }
    }

    public static void e(int i10, List<Long> list, o5 o5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            n5 n5Var = o5Var.f2859a;
            int i11 = 0;
            if (z) {
                n5Var.I0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += n5.a1(list.get(i13).longValue());
                }
                n5Var.T0(i12);
                while (i11 < list.size()) {
                    n5Var.V0(list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                n5Var.M0(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public static void f(int i10, List<Long> list, o5 o5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            n5 n5Var = o5Var.f2859a;
            int i11 = 0;
            if (z) {
                n5Var.I0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += n5.a1(list.get(i13).longValue());
                }
                n5Var.T0(i12);
                while (i11 < list.size()) {
                    n5Var.V0(list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                n5Var.M0(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public static void g(int i10, List<Long> list, o5 o5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            n5 n5Var = o5Var.f2859a;
            int i11 = 0;
            if (z) {
                n5Var.I0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    long longValue = list.get(i13).longValue();
                    i12 += n5.a1((longValue >> 63) ^ (longValue + longValue));
                }
                n5Var.T0(i12);
                while (i11 < list.size()) {
                    long longValue2 = list.get(i11).longValue();
                    n5Var.V0((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                long longValue3 = list.get(i11).longValue();
                n5Var.M0(i10, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i11++;
            }
        }
    }

    public static void h(int i10, List<Long> list, o5 o5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            n5 n5Var = o5Var.f2859a;
            int i11 = 0;
            if (z) {
                n5Var.I0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    list.get(i13).longValue();
                    i12 += 8;
                }
                n5Var.T0(i12);
                while (i11 < list.size()) {
                    n5Var.W0(list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                n5Var.N0(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public static void i(int i10, List<Long> list, o5 o5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            n5 n5Var = o5Var.f2859a;
            int i11 = 0;
            if (z) {
                n5Var.I0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    list.get(i13).longValue();
                    i12 += 8;
                }
                n5Var.T0(i12);
                while (i11 < list.size()) {
                    n5Var.W0(list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                n5Var.N0(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public static void j(int i10, List<Integer> list, o5 o5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            n5 n5Var = o5Var.f2859a;
            int i11 = 0;
            if (z) {
                n5Var.I0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += n5.Y0(list.get(i13).intValue());
                }
                n5Var.T0(i12);
                while (i11 < list.size()) {
                    n5Var.S0(list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                n5Var.J0(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public static void k(int i10, List<Integer> list, o5 o5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            n5 n5Var = o5Var.f2859a;
            int i11 = 0;
            if (z) {
                n5Var.I0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += n5.Z0(list.get(i13).intValue());
                }
                n5Var.T0(i12);
                while (i11 < list.size()) {
                    n5Var.T0(list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                n5Var.K0(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public static void l(int i10, List<Integer> list, o5 o5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            n5 n5Var = o5Var.f2859a;
            int i11 = 0;
            if (z) {
                n5Var.I0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    int intValue = list.get(i13).intValue();
                    i12 += n5.Z0((intValue >> 31) ^ (intValue + intValue));
                }
                n5Var.T0(i12);
                while (i11 < list.size()) {
                    int intValue2 = list.get(i11).intValue();
                    n5Var.T0((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                int intValue3 = list.get(i11).intValue();
                n5Var.K0(i10, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i11++;
            }
        }
    }

    public static void m(int i10, List<Integer> list, o5 o5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            n5 n5Var = o5Var.f2859a;
            int i11 = 0;
            if (z) {
                n5Var.I0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    list.get(i13).intValue();
                    i12 += 4;
                }
                n5Var.T0(i12);
                while (i11 < list.size()) {
                    n5Var.U0(list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                n5Var.L0(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public static void n(int i10, List<Integer> list, o5 o5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            n5 n5Var = o5Var.f2859a;
            int i11 = 0;
            if (z) {
                n5Var.I0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    list.get(i13).intValue();
                    i12 += 4;
                }
                n5Var.T0(i12);
                while (i11 < list.size()) {
                    n5Var.U0(list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                n5Var.L0(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public static void o(int i10, List<Integer> list, o5 o5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            n5 n5Var = o5Var.f2859a;
            int i11 = 0;
            if (z) {
                n5Var.I0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += n5.Y0(list.get(i13).intValue());
                }
                n5Var.T0(i12);
                while (i11 < list.size()) {
                    n5Var.S0(list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                n5Var.J0(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public static void p(int i10, List<Boolean> list, o5 o5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            n5 n5Var = o5Var.f2859a;
            int i11 = 0;
            if (z) {
                n5Var.I0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    list.get(i13).booleanValue();
                    i12++;
                }
                n5Var.T0(i12);
                while (i11 < list.size()) {
                    n5Var.R0(list.get(i11).booleanValue() ? (byte) 1 : 0);
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                n5Var.O0(i10, list.get(i11).booleanValue());
                i11++;
            }
        }
    }

    public static void q(int i10, List<String> list, o5 o5Var) {
        if (list != null && !list.isEmpty()) {
            o5Var.getClass();
            boolean z = list instanceof t6;
            int i11 = 0;
            n5 n5Var = o5Var.f2859a;
            if (z) {
                t6 t6Var = (t6) list;
                while (i11 < list.size()) {
                    Object T = t6Var.T(i11);
                    if (T instanceof String) {
                        n5Var.P0((String) T, i10);
                    } else {
                        n5Var.Q0(i10, (k5) T);
                    }
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                n5Var.P0(list.get(i11), i10);
                i11++;
            }
        }
    }

    public static void r(int i10, List<k5> list, o5 o5Var) {
        if (list != null && !list.isEmpty()) {
            o5Var.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                o5Var.f2859a.Q0(i10, list.get(i11));
            }
        }
    }

    public static void s(int i10, List<?> list, o5 o5Var, t7 t7Var) {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                o5Var.p(i10, t7Var, list.get(i11));
            }
        }
    }

    public static void t(int i10, List<?> list, o5 o5Var, t7 t7Var) {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                o5Var.q(i10, t7Var, list.get(i11));
            }
        }
    }

    public static e8<?, ?> u(boolean z) {
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
            return (e8) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int v(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x6) {
            x6 x6Var = (x6) list;
            i10 = 0;
            while (i11 < size) {
                x6Var.i(i11);
                i10 += n5.a1(x6Var.f2989p[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + n5.a1(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int w(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (n5.X0(i10) * list.size()) + v(list);
    }

    public static int x(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x6) {
            x6 x6Var = (x6) list;
            i10 = 0;
            while (i11 < size) {
                x6Var.i(i11);
                i10 += n5.a1(x6Var.f2989p[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + n5.a1(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int y(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n5.X0(i10) * size) + x(list);
    }

    public static int z(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x6) {
            x6 x6Var = (x6) list;
            i10 = 0;
            while (i11 < size) {
                x6Var.i(i11);
                long j8 = x6Var.f2989p[i11];
                i10 += n5.a1((j8 >> 63) ^ (j8 + j8));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                long longValue = list.get(i11).longValue();
                i12 = i10 + n5.a1((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }
}

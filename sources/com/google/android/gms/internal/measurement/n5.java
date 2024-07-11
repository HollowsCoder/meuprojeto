package com.google.android.gms.internal.measurement;

import java.util.logging.Logger;
import s6.a;

public abstract class n5 extends a {
    public static final Logger T = Logger.getLogger(n5.class.getName());
    public static final boolean U = o8.f2864e;
    public o5 S;

    public n5() {
    }

    public /* synthetic */ n5(int i10) {
    }

    @Deprecated
    public static int H0(int i10, i7 i7Var, t7 t7Var) {
        int Z0 = Z0(i10 << 3);
        int i11 = Z0 + Z0;
        b5 b5Var = (b5) i7Var;
        int b10 = b5Var.b();
        if (b10 == -1) {
            b10 = t7Var.g(b5Var);
            b5Var.f(b10);
        }
        return i11 + b10;
    }

    public static int X0(int i10) {
        return Z0(i10 << 3);
    }

    public static int Y0(int i10) {
        if (i10 >= 0) {
            return Z0(i10);
        }
        return 10;
    }

    public static int Z0(int i10) {
        if ((i10 & -128) == 0) {
            return 1;
        }
        if ((i10 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i10) == 0) {
            return 3;
        }
        return (i10 & -268435456) == 0 ? 4 : 5;
    }

    public static int a1(long j8) {
        int i10;
        if ((-128 & j8) == 0) {
            return 1;
        }
        if (j8 < 0) {
            return 10;
        }
        if ((-34359738368L & j8) != 0) {
            j8 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if ((-2097152 & j8) != 0) {
            i10 += 2;
            j8 >>>= 14;
        }
        return (j8 & -16384) != 0 ? i10 + 1 : i10;
    }

    public static int b1(String str) {
        int i10;
        try {
            i10 = q8.b(str);
        } catch (p8 unused) {
            i10 = str.getBytes(n6.f2844a).length;
        }
        return Z0(i10) + i10;
    }

    public abstract void I0(int i10, int i11);

    public abstract void J0(int i10, int i11);

    public abstract void K0(int i10, int i11);

    public abstract void L0(int i10, int i11);

    public abstract void M0(int i10, long j8);

    public abstract void N0(int i10, long j8);

    public abstract void O0(int i10, boolean z);

    public abstract void P0(String str, int i10);

    public abstract void Q0(int i10, k5 k5Var);

    public abstract void R0(byte b10);

    public abstract void S0(int i10);

    public abstract void T0(int i10);

    public abstract void U0(int i10);

    public abstract void V0(long j8);

    public abstract void W0(long j8);
}

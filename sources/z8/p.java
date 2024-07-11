package z8;

import n8.a;
import y8.b;
import y8.c;
import y8.d;
import y8.e;
import y8.f;
import y8.g;
import y8.h;
import y8.i;
import y8.j;
import y8.k;
import y8.l;
import y8.m;
import y8.n;
import y8.o;
import y8.q;
import y8.r;
import y8.s;
import y8.t;
import y8.u;
import y8.v;
import y8.w;

public final class p {
    public static void a(int i10, Object obj) {
        int i11;
        if (obj != null) {
            boolean z = false;
            if (obj instanceof a) {
                if (obj instanceof f) {
                    i11 = ((f) obj).c();
                } else if (obj instanceof y8.a) {
                    i11 = 0;
                } else if (obj instanceof l) {
                    i11 = 1;
                } else if (obj instanceof y8.p) {
                    i11 = 2;
                } else if (obj instanceof q) {
                    i11 = 3;
                } else if (obj instanceof r) {
                    i11 = 4;
                } else if (obj instanceof s) {
                    i11 = 5;
                } else if (obj instanceof t) {
                    i11 = 6;
                } else if (obj instanceof u) {
                    i11 = 7;
                } else if (obj instanceof v) {
                    i11 = 8;
                } else if (obj instanceof w) {
                    i11 = 9;
                } else if (obj instanceof b) {
                    i11 = 10;
                } else if (obj instanceof c) {
                    i11 = 11;
                } else if (obj instanceof d) {
                    i11 = 12;
                } else if (obj instanceof e) {
                    i11 = 13;
                } else if (obj instanceof f) {
                    i11 = 14;
                } else if (obj instanceof g) {
                    i11 = 15;
                } else if (obj instanceof h) {
                    i11 = 16;
                } else if (obj instanceof i) {
                    i11 = 17;
                } else if (obj instanceof j) {
                    i11 = 18;
                } else if (obj instanceof k) {
                    i11 = 19;
                } else if (obj instanceof m) {
                    i11 = 20;
                } else if (obj instanceof n) {
                    i11 = 21;
                } else if (obj instanceof o) {
                    i11 = 22;
                } else {
                    i11 = -1;
                }
                if (i11 == i10) {
                    z = true;
                }
            }
            if (!z) {
                b(obj, "kotlin.jvm.functions.Function" + i10);
                throw null;
            }
        }
    }

    public static void b(Object obj, String str) {
        String str2;
        if (obj == null) {
            str2 = "null";
        } else {
            str2 = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(str2 + " cannot be cast to " + str);
        g.j(p.class.getName(), classCastException);
        throw classCastException;
    }
}

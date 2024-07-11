package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.q1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class d1 {

    /* renamed from: b  reason: collision with root package name */
    public static volatile d1 f3077b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile d1 f3078c;
    public static final d1 d = new d1(0);

    /* renamed from: a  reason: collision with root package name */
    public final Map<a, q1.d<?, ?>> f3079a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f3080a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3081b;

        public a(int i10, Object obj) {
            this.f3080a = obj;
            this.f3081b = i10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r4 = (com.google.android.gms.internal.vision.d1.a) r4;
            r0 = r4.f3080a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof com.google.android.gms.internal.vision.d1.a
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                com.google.android.gms.internal.vision.d1$a r4 = (com.google.android.gms.internal.vision.d1.a) r4
                java.lang.Object r0 = r4.f3080a
                java.lang.Object r2 = r3.f3080a
                if (r2 != r0) goto L_0x0016
                int r0 = r3.f3081b
                int r4 = r4.f3081b
                if (r0 != r4) goto L_0x0016
                r4 = 1
                return r4
            L_0x0016:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.d1.a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f3080a) * 65535) + this.f3081b;
        }
    }

    public d1() {
        this.f3079a = new HashMap();
    }

    public d1(int i10) {
        this.f3079a = Collections.emptyMap();
    }

    public static d1 b() {
        d1 d1Var = f3077b;
        if (d1Var == null) {
            synchronized (d1.class) {
                d1Var = f3077b;
                if (d1Var == null) {
                    d1Var = d;
                    f3077b = d1Var;
                }
            }
        }
        return d1Var;
    }

    public final q1.d a(int i10, w2 w2Var) {
        return this.f3079a.get(new a(i10, w2Var));
    }
}

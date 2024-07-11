package com.google.android.gms.internal.vision;

public final class k3 implements u2 {

    /* renamed from: a  reason: collision with root package name */
    public final w2 f3109a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3110b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f3111c;
    public final int d;

    public k3(q1 q1Var, String str, Object[] objArr) {
        this.f3109a = q1Var;
        this.f3110b = str;
        this.f3111c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        char c10 = charAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 >= 55296) {
                c10 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            } else {
                this.d = c10 | (charAt2 << i11);
                return;
            }
        }
    }

    public final boolean a() {
        return (this.d & 2) == 2;
    }

    public final String b() {
        return this.f3110b;
    }

    public final Object[] c() {
        return this.f3111c;
    }

    public final int zza() {
        return (this.d & 1) == 1 ? 1 : 2;
    }

    public final w2 zzc() {
        return this.f3109a;
    }
}

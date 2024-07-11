package com.google.android.gms.internal.clearcut;

public final class h2 {

    /* renamed from: a  reason: collision with root package name */
    public int f2450a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2451b;

    public /* synthetic */ h2(String str) {
        this.f2451b = str;
    }

    public final int a() {
        Object obj = this.f2451b;
        int i10 = this.f2450a;
        this.f2450a = i10 + 1;
        char charAt = ((String) obj).charAt(i10);
        if (charAt < 55296) {
            return charAt;
        }
        char c10 = charAt & 8191;
        int i11 = 13;
        while (true) {
            int i12 = this.f2450a;
            this.f2450a = i12 + 1;
            char charAt2 = ((String) obj).charAt(i12);
            if (charAt2 < 55296) {
                return (charAt2 << i11) | c10;
            }
            c10 |= (charAt2 & 8191) << i11;
            i11 += 13;
        }
    }
}

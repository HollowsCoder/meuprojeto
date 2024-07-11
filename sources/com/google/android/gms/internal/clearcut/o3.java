package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.o3;

public class o3<M extends o3<M>> extends s3 {

    /* renamed from: p  reason: collision with root package name */
    public p3 f2512p;

    public int e() {
        if (this.f2512p != null) {
            int i10 = 0;
            while (true) {
                p3 p3Var = this.f2512p;
                if (i10 >= p3Var.f2523q) {
                    break;
                }
                p3Var.f2522p[i10].d();
                i10++;
            }
        }
        return 0;
    }

    public /* synthetic */ s3 h() {
        return (o3) clone();
    }

    public void i(n3 n3Var) {
        if (this.f2512p != null) {
            int i10 = 0;
            while (true) {
                p3 p3Var = this.f2512p;
                if (i10 < p3Var.f2523q) {
                    p3Var.f2522p[i10].c();
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: j */
    public M clone() {
        M m10 = (o3) super.clone();
        Object obj = r3.f2540a;
        p3 p3Var = this.f2512p;
        if (p3Var != null) {
            m10.f2512p = (p3) p3Var.clone();
        }
        return m10;
    }
}

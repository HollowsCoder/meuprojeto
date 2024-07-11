package com.google.android.gms.internal.vision;

import java.util.Map;

public final class o3 extends p3 {
    public o3(int i10) {
        super(i10);
    }

    public final void c() {
        if (!this.f3132r) {
            for (int i10 = 0; i10 < e(); i10++) {
                ((l1) d(i10).getKey()).b();
            }
            for (Map.Entry key : g()) {
                ((l1) key.getKey()).b();
            }
        }
        super.c();
    }
}

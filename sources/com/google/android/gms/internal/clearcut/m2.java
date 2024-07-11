package com.google.android.gms.internal.clearcut;

import java.util.Map;

public final class m2 extends l2 {
    public m2(int i10) {
        super(i10);
    }

    public final void i() {
        if (!this.f2500r) {
            for (int i10 = 0; i10 < e(); i10++) {
                ((j0) c(i10).getKey()).m();
            }
            for (Map.Entry key : f()) {
                ((j0) key.getKey()).m();
            }
        }
        super.i();
    }
}

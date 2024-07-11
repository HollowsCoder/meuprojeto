package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import s6.a;

public final class v7 extends b8 {
    public v7(int i10) {
        super(i10);
    }

    public final void a() {
        Iterable<Map.Entry> iterable;
        if (!this.f2642r) {
            for (int i10 = 0; i10 < this.f2640p.size(); i10++) {
                Map.Entry entry = this.f2640p.get(i10);
                if (((v5) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            if (this.f2641q.isEmpty()) {
                iterable = a.D;
            } else {
                iterable = this.f2641q.entrySet();
            }
            for (Map.Entry entry2 : iterable) {
                if (((v5) entry2.getKey()).zzc()) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        super.a();
    }
}

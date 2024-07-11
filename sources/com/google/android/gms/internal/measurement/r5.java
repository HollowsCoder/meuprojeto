package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class r5 {

    /* renamed from: b  reason: collision with root package name */
    public static volatile r5 f2903b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile r5 f2904c;
    public static final r5 d = new r5(0);

    /* renamed from: a  reason: collision with root package name */
    public final Map<q5, e6<?, ?>> f2905a;

    public r5() {
        this.f2905a = new HashMap();
    }

    public r5(int i10) {
        this.f2905a = Collections.emptyMap();
    }

    public static r5 a() {
        r5 r5Var = f2903b;
        if (r5Var == null) {
            synchronized (r5.class) {
                r5Var = f2903b;
                if (r5Var == null) {
                    r5Var = d;
                    f2903b = r5Var;
                }
            }
        }
        return r5Var;
    }

    public final <ContainingType extends i7> e6<ContainingType, ?> b(ContainingType containingtype, int i10) {
        return this.f2905a.get(new q5(i10, containingtype));
    }
}

package com.google.android.gms.internal.measurement;

import androidx.databinding.a;
import java.util.ArrayList;

public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2943a = new ArrayList();

    public abstract o a(String str, i3 i3Var, ArrayList arrayList);

    public final void b(String str) {
        if (this.f2943a.contains(a.K(str))) {
            String valueOf = String.valueOf(str);
            throw new UnsupportedOperationException(valueOf.length() != 0 ? "Command not implemented: ".concat(valueOf) : new String("Command not implemented: "));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}

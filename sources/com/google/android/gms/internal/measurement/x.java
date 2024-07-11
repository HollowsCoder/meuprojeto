package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.x0;
import androidx.databinding.a;
import java.util.ArrayList;

public final class x extends u {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2987b;

    public x(int i10) {
        this.f2987b = i10;
        if (i10 != 1) {
            ArrayList arrayList = this.f2943a;
            arrayList.add(z.AND);
            arrayList.add(z.NOT);
            arrayList.add(z.OR);
        }
    }

    public final o a(String str, i3 i3Var, ArrayList arrayList) {
        switch (this.f2987b) {
            case 0:
                z zVar = z.ADD;
                int ordinal = a.K(str).ordinal();
                if (ordinal == 1) {
                    o a10 = i3Var.a((o) x0.b(z.AND, 2, arrayList, 0));
                    if (!a10.c().booleanValue()) {
                        return a10;
                    }
                } else if (ordinal == 47) {
                    return new f(Boolean.valueOf(!i3Var.a((o) x0.b(z.NOT, 1, arrayList, 0)).c().booleanValue()));
                } else {
                    if (ordinal == 50) {
                        o a11 = i3Var.a((o) x0.b(z.OR, 2, arrayList, 0));
                        if (a11.c().booleanValue()) {
                            return a11;
                        }
                    } else {
                        b(str);
                        throw null;
                    }
                }
                return i3Var.a((o) arrayList.get(1));
            default:
                if (str == null || str.isEmpty() || !i3Var.d(str)) {
                    throw new IllegalArgumentException(String.format("Command not found: %s", new Object[]{str}));
                }
                o g10 = i3Var.g(str);
                if (g10 instanceof i) {
                    return ((i) g10).a(i3Var, arrayList);
                }
                throw new IllegalArgumentException(String.format("Function %s is not defined", new Object[]{str}));
        }
    }
}

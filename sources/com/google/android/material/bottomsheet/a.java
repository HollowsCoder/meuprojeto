package com.google.android.material.bottomsheet;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.b;
import i0.e0;
import i0.o;
import java.util.ArrayList;

public final class a implements o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f3309a;

    public a(b bVar) {
        this.f3309a = bVar;
    }

    public final e0 a(View view, e0 e0Var) {
        b bVar = this.f3309a;
        BottomSheetBehavior.d dVar = bVar.f3315x;
        if (dVar != null) {
            bVar.f3310q.P.remove(dVar);
        }
        b.C0032b bVar2 = new b.C0032b(bVar.f3313t, e0Var);
        bVar.f3315x = bVar2;
        ArrayList<BottomSheetBehavior.d> arrayList = bVar.f3310q.P;
        if (!arrayList.contains(bVar2)) {
            arrayList.add(bVar2);
        }
        return e0Var;
    }
}

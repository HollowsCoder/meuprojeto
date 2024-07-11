package h6;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h6.n;
import i0.e0;
import i0.o;
import w5.b;

public final class l implements o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n.a f5907a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n.b f5908b;

    public l(b bVar, n.b bVar2) {
        this.f5907a = bVar;
        this.f5908b = bVar2;
    }

    public final e0 a(View view, e0 e0Var) {
        int i10;
        n.b bVar = this.f5908b;
        int i11 = bVar.f5909a;
        b bVar2 = (b) this.f5907a;
        bVar2.getClass();
        int d = e0Var.d();
        BottomSheetBehavior bottomSheetBehavior = bVar2.f9242b;
        bottomSheetBehavior.f3289r = d;
        boolean a10 = n.a(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z = bottomSheetBehavior.f3284m;
        if (z) {
            int a11 = e0Var.a();
            bottomSheetBehavior.f3288q = a11;
            paddingBottom = a11 + bVar.f5911c;
        }
        boolean z10 = bottomSheetBehavior.f3285n;
        int i12 = bVar.f5910b;
        if (z10) {
            if (a10) {
                i10 = i12;
            } else {
                i10 = i11;
            }
            paddingLeft = i10 + e0Var.b();
        }
        if (bottomSheetBehavior.f3286o) {
            if (!a10) {
                i11 = i12;
            }
            paddingRight = e0Var.c() + i11;
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z11 = bVar2.f9241a;
        if (z11) {
            bottomSheetBehavior.f3283k = e0Var.f5969a.f().d;
        }
        if (z || z11) {
            bottomSheetBehavior.M();
        }
        return e0Var;
    }
}

package w5;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import j0.d;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9243a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f9244b;

    public c(BottomSheetBehavior bottomSheetBehavior, int i10) {
        this.f9244b = bottomSheetBehavior;
        this.f9243a = i10;
    }

    public final boolean a(View view) {
        this.f9244b.D(this.f9243a);
        return true;
    }
}

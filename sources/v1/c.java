package v1;

import android.content.DialogInterface;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.b;
import com.karumi.dexter.R;
import z8.g;

public final /* synthetic */ class c implements DialogInterface.OnShowListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f9120a;

    public /* synthetic */ c(d dVar) {
        this.f9120a = dVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        int i10 = d.x0;
        g.f(this.f9120a, "this$0");
        if (dialogInterface != null) {
            FrameLayout frameLayout = (FrameLayout) ((b) dialogInterface).findViewById(R.id.design_bottom_sheet);
            if (frameLayout != null) {
                BottomSheetBehavior x10 = BottomSheetBehavior.x(frameLayout);
                g.e(x10, "from(bSheet)");
                frameLayout.setLayoutParams(frameLayout.getLayoutParams());
                x10.D(3);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
    }
}

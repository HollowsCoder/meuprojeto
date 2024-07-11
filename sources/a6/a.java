package a6;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

public final class a extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Chip f111a;

    public a(Chip chip) {
        this.f111a = chip;
    }

    @TargetApi(21)
    public final void getOutline(View view, Outline outline) {
        com.google.android.material.chip.a aVar = this.f111a.f3344s;
        if (aVar != null) {
            aVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}

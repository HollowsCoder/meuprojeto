package w5;

import android.content.res.TypedArray;
import android.view.View;
import com.google.android.material.bottomsheet.b;

public final class d implements View.OnClickListener {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ b f9245o;

    public d(b bVar) {
        this.f9245o = bVar;
    }

    public final void onClick(View view) {
        b bVar = this.f9245o;
        if (bVar.u && bVar.isShowing()) {
            if (!bVar.w) {
                TypedArray obtainStyledAttributes = bVar.getContext().obtainStyledAttributes(new int[]{16843611});
                bVar.f3314v = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                bVar.w = true;
            }
            if (bVar.f3314v) {
                bVar.cancel();
            }
        }
    }
}

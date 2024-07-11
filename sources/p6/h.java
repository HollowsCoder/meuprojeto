package p6;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.b;

public final class h implements View.OnTouchListener {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ AutoCompleteTextView f7933o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ b f7934p;

    public h(b bVar, AutoCompleteTextView autoCompleteTextView) {
        this.f7934p = bVar;
        this.f7933o = autoCompleteTextView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 1) {
            b bVar = this.f7934p;
            bVar.getClass();
            long currentTimeMillis = System.currentTimeMillis() - bVar.f3637k;
            if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
                z = false;
            }
            if (z) {
                bVar.f3635i = false;
            }
            b.d(bVar, this.f7933o);
        }
        return false;
    }
}

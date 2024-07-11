package p6;

import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.b;

public final class i implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f7935a;

    public i(b bVar) {
        this.f7935a = bVar;
    }

    public final void onDismiss() {
        b bVar = this.f7935a;
        bVar.f3635i = true;
        bVar.f3637k = System.currentTimeMillis();
        bVar.f(false);
    }
}

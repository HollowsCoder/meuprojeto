package p3;

import android.view.View;
import p3.c;

public final class f implements View.OnClickListener {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ c.i f7914o;

    public f(c.i iVar) {
        this.f7914o = iVar;
    }

    public final void onClick(View view) {
        c.i iVar = this.f7914o;
        if (iVar.z) {
            iVar.E.b(iVar, new e(iVar, new h(iVar)));
        }
    }
}

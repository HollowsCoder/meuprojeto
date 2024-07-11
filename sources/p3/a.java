package p3;

import androidx.core.widget.NestedScrollView;
import p3.c;

public final class a implements NestedScrollView.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f7892a;

    public a(c cVar) {
        this.f7892a = cVar;
    }

    public final void a(NestedScrollView nestedScrollView, int i10, int i11) {
        c.i iVar = this.f7892a.f7898b;
        iVar.setTranslationY(iVar.getTranslationY() - ((float) (i10 - i11)));
    }
}

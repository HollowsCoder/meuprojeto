package p3;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import p3.c;

public final class i implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Rect f7917o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ c.i f7918p;

    public i(c.i iVar, Rect rect) {
        this.f7918p = iVar;
        this.f7917o = rect;
    }

    public final boolean onPreDraw() {
        c.i iVar = this.f7918p;
        iVar.b(this.f7917o);
        iVar.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
    }
}

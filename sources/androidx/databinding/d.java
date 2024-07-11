package androidx.databinding;

import android.view.Choreographer;

public final class d implements Choreographer.FrameCallback {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ ViewDataBinding f1030o;

    public d(ViewDataBinding viewDataBinding) {
        this.f1030o = viewDataBinding;
    }

    public final void doFrame(long j8) {
        this.f1030o.f993z0.run();
    }
}

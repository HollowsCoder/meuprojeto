package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.appcompat.widget.z;
import i.f;

public final class y extends n0 {

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ z.d f728x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ z f729y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(z zVar, View view, z.d dVar) {
        super(view);
        this.f729y = zVar;
        this.f728x = dVar;
    }

    public final f b() {
        return this.f728x;
    }

    @SuppressLint({"SyntheticAccessor"})
    public final boolean c() {
        z zVar = this.f729y;
        if (zVar.getInternalPopup().c()) {
            return true;
        }
        zVar.f740t.m(zVar.getTextDirection(), zVar.getTextAlignment());
        return true;
    }
}

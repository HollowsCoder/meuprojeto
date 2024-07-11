package k0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import k0.h;

public final class d extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f6623a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(InputConnection inputConnection, f fVar) {
        super(inputConnection, false);
        this.f6623a = fVar;
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        h hVar;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            hVar = new h(new h.a(inputContentInfo));
        } else {
            hVar = null;
        }
        if (((f) this.f6623a).a(hVar, i10, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i10, bundle);
    }
}

package k0;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import i0.e;
import i0.w;
import k0.h;

public final class f implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f6625a;

    public f(View view) {
        this.f6625a = view;
    }

    public final boolean a(h hVar, int i10, Bundle bundle) {
        e.b bVar;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                hVar.f6626a.d();
                InputContentInfo inputContentInfo = (InputContentInfo) hVar.f6626a.b();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        ClipDescription a10 = hVar.f6626a.a();
        h.c cVar = hVar.f6626a;
        ClipData clipData = new ClipData(a10, new ClipData.Item(cVar.c()));
        if (Build.VERSION.SDK_INT >= 31) {
            bVar = new e.a(clipData, 2);
        } else {
            bVar = new e.c(clipData, 2);
        }
        bVar.a(cVar.e());
        bVar.setExtras(bundle);
        if (w.g(this.f6625a, bVar.build()) == null) {
            return true;
        }
        return false;
    }
}

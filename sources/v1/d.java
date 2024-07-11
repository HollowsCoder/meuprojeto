package v1;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import com.google.android.material.bottomsheet.c;
import z8.g;

public class d extends c {
    public static final /* synthetic */ int x0 = 0;

    public final Dialog X(Bundle bundle) {
        Dialog X = super.X(bundle);
        X.setOnShowListener(new c(this));
        return X;
    }

    public final void a0(y yVar, String str) {
        g.f(yVar, "manager");
        try {
            a aVar = new a(yVar);
            aVar.f(0, this, str, 1);
            aVar.d();
        } catch (IllegalStateException unused) {
        }
    }
}

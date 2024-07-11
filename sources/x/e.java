package x;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.h;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.x;
import i0.g;
import n.i;

public class e extends Activity implements n, g.a {

    /* renamed from: o  reason: collision with root package name */
    public final o f9395o = new o(this);

    public e() {
        new i();
    }

    public final boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !g.a(decorView, keyEvent)) {
            return g.b(this, decorView, this, keyEvent);
        }
        return true;
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !g.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x.c(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        h.c cVar = h.c.CREATED;
        o oVar = this.f9395o;
        oVar.d("markState");
        oVar.g(cVar);
        super.onSaveInstanceState(bundle);
    }

    public o r() {
        return this.f9395o;
    }
}

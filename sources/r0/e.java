package r0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.i;

public final class e implements KeyListener {

    /* renamed from: o  reason: collision with root package name */
    public final KeyListener f8342o;

    /* renamed from: p  reason: collision with root package name */
    public final a f8343p;

    public static class a {
    }

    public e(KeyListener keyListener) {
        a aVar = new a();
        this.f8342o = keyListener;
        this.f8343p = aVar;
    }

    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f8342o.clearMetaKeyState(view, editable, i10);
    }

    public final int getInputType() {
        return this.f8342o.getInputType();
    }

    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean z;
        boolean z10;
        this.f8343p.getClass();
        Object obj = androidx.emoji2.text.e.f1038i;
        if (i10 == 67) {
            z = i.a(editable, keyEvent, false);
        } else if (i10 != 112) {
            z = false;
        } else {
            z = i.a(editable, keyEvent, true);
        }
        if (z) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.f8342o.onKeyDown(view, editable, i10, keyEvent)) {
            return true;
        }
        return false;
    }

    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f8342o.onKeyOther(view, editable, keyEvent);
    }

    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f8342o.onKeyUp(view, editable, i10, keyEvent);
    }
}

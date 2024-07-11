package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.j;

public final class g implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* renamed from: o  reason: collision with root package name */
    public final f f334o;

    /* renamed from: p  reason: collision with root package name */
    public b f335p;

    /* renamed from: q  reason: collision with root package name */
    public d f336q;

    public g(f fVar) {
        this.f334o = fVar;
    }

    public final void b(f fVar, boolean z) {
        b bVar;
        if ((z || fVar == this.f334o) && (bVar = this.f335p) != null) {
            bVar.dismiss();
        }
    }

    public final boolean c(f fVar) {
        return false;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        d dVar = this.f336q;
        if (dVar.f304t == null) {
            dVar.f304t = new d.a();
        }
        this.f334o.q(dVar.f304t.getItem(i10), (j) null, 0);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f336q.b(this.f334o, true);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        f fVar = this.f334o;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f335p.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f335p.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                fVar.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return fVar.performShortcut(i10, keyEvent, 0);
    }
}

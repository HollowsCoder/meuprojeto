package e;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import i0.g;
import java.lang.ref.WeakReference;
import n.d;

public class l extends Dialog implements e {

    /* renamed from: o  reason: collision with root package name */
    public g f4386o;

    /* renamed from: p  reason: collision with root package name */
    public final a f4387p;

    public class a implements g.a {
        public a() {
        }

        public final boolean a(KeyEvent keyEvent) {
            return l.this.b(keyEvent);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130968923(0x7f04015b, float:1.7546513E38)
            if (r6 != 0) goto L_0x0015
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L_0x0016
        L_0x0015:
            r2 = r6
        L_0x0016:
            r4.<init>(r5, r2)
            e.l$a r2 = new e.l$a
            r2.<init>()
            r4.f4387p = r2
            e.f r2 = r4.a()
            if (r6 != 0) goto L_0x0034
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L_0x0034:
            r5 = r2
            e.g r5 = (e.g) r5
            r5.f4336b0 = r6
            r2.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.l.<init>(android.content.Context, int):void");
    }

    public final f a() {
        if (this.f4386o == null) {
            d<WeakReference<f>> dVar = f.f4329o;
            this.f4386o = new g(getContext(), getWindow(), this, this);
        }
        return this.f4386o;
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public final boolean b(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void dismiss() {
        super.dismiss();
        a().l();
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return g.b(this.f4387p, getWindow().getDecorView(), this, keyEvent);
    }

    public final void e() {
    }

    public final <T extends View> T findViewById(int i10) {
        return a().e(i10);
    }

    public final void invalidateOptionsMenu() {
        a().i();
    }

    public final void k() {
    }

    public final void o() {
    }

    public void onCreate(Bundle bundle) {
        a().h();
        super.onCreate(bundle);
        a().k();
    }

    public final void onStop() {
        super.onStop();
        a().o();
    }

    public void setContentView(int i10) {
        a().r(i10);
    }

    public void setContentView(View view) {
        a().s(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().t(view, layoutParams);
    }

    public final void setTitle(int i10) {
        super.setTitle(i10);
        a().v(getContext().getString(i10));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().v(charSequence);
    }
}

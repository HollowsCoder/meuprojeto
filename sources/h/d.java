package h;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.c;
import h.a;
import java.lang.ref.WeakReference;

public final class d extends a implements f.a {

    /* renamed from: q  reason: collision with root package name */
    public final Context f5063q;

    /* renamed from: r  reason: collision with root package name */
    public final ActionBarContextView f5064r;

    /* renamed from: s  reason: collision with root package name */
    public final a.C0073a f5065s;

    /* renamed from: t  reason: collision with root package name */
    public WeakReference<View> f5066t;
    public boolean u;

    /* renamed from: v  reason: collision with root package name */
    public final f f5067v;

    public d(Context context, ActionBarContextView actionBarContextView, a.C0073a aVar) {
        this.f5063q = context;
        this.f5064r = actionBarContextView;
        this.f5065s = aVar;
        f fVar = new f(actionBarContextView.getContext());
        fVar.l = 1;
        this.f5067v = fVar;
        fVar.f317e = this;
    }

    public final boolean a(f fVar, MenuItem menuItem) {
        return this.f5065s.a(this, menuItem);
    }

    public final void b(f fVar) {
        i();
        c cVar = this.f5064r.f502r;
        if (cVar != null) {
            cVar.l();
        }
    }

    public final void c() {
        if (!this.u) {
            this.u = true;
            this.f5065s.c(this);
        }
    }

    public final View d() {
        WeakReference<View> weakReference = this.f5066t;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final f e() {
        return this.f5067v;
    }

    public final MenuInflater f() {
        return new f(this.f5064r.getContext());
    }

    public final CharSequence g() {
        return this.f5064r.getSubtitle();
    }

    public final CharSequence h() {
        return this.f5064r.getTitle();
    }

    public final void i() {
        this.f5065s.b(this, this.f5067v);
    }

    public final boolean j() {
        return this.f5064r.G;
    }

    public final void k(View view) {
        this.f5064r.setCustomView(view);
        this.f5066t = view != null ? new WeakReference<>(view) : null;
    }

    public final void l(int i10) {
        m(this.f5063q.getString(i10));
    }

    public final void m(CharSequence charSequence) {
        this.f5064r.setSubtitle(charSequence);
    }

    public final void n(int i10) {
        o(this.f5063q.getString(i10));
    }

    public final void o(CharSequence charSequence) {
        this.f5064r.setTitle(charSequence);
    }

    public final void p(boolean z) {
        this.f5058p = z;
        this.f5064r.setTitleOptional(z);
    }
}

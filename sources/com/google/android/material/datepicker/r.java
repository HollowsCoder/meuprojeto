package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

public final class r<S> extends x<S> {

    /* renamed from: i0  reason: collision with root package name */
    public int f3448i0;

    /* renamed from: j0  reason: collision with root package name */
    public d<S> f3449j0;

    /* renamed from: k0  reason: collision with root package name */
    public a f3450k0;

    public class a extends w<S> {
        public a() {
        }

        public final void a(S s10) {
            Iterator<w<S>> it = r.this.f3471h0.iterator();
            while (it.hasNext()) {
                it.next().a(s10);
            }
        }
    }

    public final void F(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f3448i0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f3449j0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f3450k0);
    }

    public final void w(Bundle bundle) {
        super.w(bundle);
        if (bundle == null) {
            bundle = this.f1241t;
        }
        this.f3448i0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f3449j0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f3450k0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(k(), this.f3448i0));
        d<S> dVar = this.f3449j0;
        new a();
        return dVar.U();
    }
}

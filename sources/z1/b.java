package z1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.c;
import com.appfab.facematchlive.FaceMatchApp;
import com.appfab.facematchlive.data.model.RemoteConfigModel;
import com.karumi.dexter.R;
import n8.i;
import v1.d;
import x1.k;
import z8.g;
import z8.h;

public final class b extends d {
    public static final /* synthetic */ int A0 = 0;
    public k y0;

    /* renamed from: z0  reason: collision with root package name */
    public y8.a<i> f9791z0 = a.f9792p;

    public static final class a extends h implements y8.a<i> {

        /* renamed from: p  reason: collision with root package name */
        public static final a f9792p = new a();

        public a() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object n() {
            return i.f7501a;
        }
    }

    public final void I(View view) {
        long j8;
        RemoteConfigModel remoteConfigModel;
        Long maxFreeSearchLimit;
        g.f(view, "view");
        FaceMatchApp a10 = FaceMatchApp.u.a();
        if (a10 == null || (remoteConfigModel = a10.f2219o) == null || (maxFreeSearchLimit = remoteConfigModel.getMaxFreeSearchLimit()) == null) {
            j8 = 3;
        } else {
            j8 = maxFreeSearchLimit.longValue();
        }
        k kVar = this.y0;
        if (kVar == null) {
            g.l("binding");
            throw null;
        } else if (kVar != null) {
            kVar.L0.setText(f9.h.Y(kVar.L0.getText().toString(), "*", String.valueOf(j8)));
            k kVar2 = this.y0;
            if (kVar2 != null) {
                kVar2.M0.setOnClickListener(new a(0, this));
                return;
            }
            g.l("binding");
            throw null;
        } else {
            g.l("binding");
            throw null;
        }
    }

    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        g.f(layoutInflater, "inflater");
        LayoutInflater layoutInflater2 = this.X;
        if (layoutInflater2 == null) {
            layoutInflater2 = B((Bundle) null);
            this.X = layoutInflater2;
        }
        ViewDataBinding c10 = c.c(layoutInflater2, R.layout.bottom_sheet_limit, viewGroup);
        g.e(c10, "inflate(layoutInflater, …_limit, container, false)");
        k kVar = (k) c10;
        this.y0 = kVar;
        View view = kVar.B0;
        g.e(view, "binding.root");
        return view;
    }
}

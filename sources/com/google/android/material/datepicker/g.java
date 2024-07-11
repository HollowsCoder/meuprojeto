package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.o;
import com.karumi.dexter.R;
import i0.w;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class g<S> extends x<S> {

    /* renamed from: s0  reason: collision with root package name */
    public static final /* synthetic */ int f3418s0 = 0;

    /* renamed from: i0  reason: collision with root package name */
    public int f3419i0;

    /* renamed from: j0  reason: collision with root package name */
    public d<S> f3420j0;

    /* renamed from: k0  reason: collision with root package name */
    public a f3421k0;

    /* renamed from: l0  reason: collision with root package name */
    public s f3422l0;

    /* renamed from: m0  reason: collision with root package name */
    public e f3423m0;

    /* renamed from: n0  reason: collision with root package name */
    public c f3424n0;

    /* renamed from: o0  reason: collision with root package name */
    public RecyclerView f3425o0;

    /* renamed from: p0  reason: collision with root package name */
    public RecyclerView f3426p0;

    /* renamed from: q0  reason: collision with root package name */
    public View f3427q0;

    /* renamed from: r0  reason: collision with root package name */
    public View f3428r0;

    public class a implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ int f3429o;

        public a(int i10) {
            this.f3429o = i10;
        }

        public final void run() {
            g.this.f3426p0.c0(this.f3429o);
        }
    }

    public class b extends i0.a {
        public final void d(View view, j0.b bVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f5951a;
            AccessibilityNodeInfo accessibilityNodeInfo = bVar.f6386a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) null);
        }
    }

    public class c extends z {
        public final /* synthetic */ int E;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(int i10, int i11) {
            super(i10);
            this.E = i11;
        }

        public final void D0(RecyclerView.z zVar, int[] iArr) {
            int i10 = this.E;
            g gVar = g.this;
            if (i10 == 0) {
                iArr[0] = gVar.f3426p0.getWidth();
                iArr[1] = gVar.f3426p0.getWidth();
                return;
            }
            iArr[0] = gVar.f3426p0.getHeight();
            iArr[1] = gVar.f3426p0.getHeight();
        }
    }

    public class d implements f {
        public d() {
        }
    }

    public enum e {
        DAY,
        YEAR
    }

    public interface f {
    }

    public final void F(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f3419i0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f3420j0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f3421k0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f3422l0);
    }

    public final boolean V(o.c cVar) {
        return super.V(cVar);
    }

    public final void W(int i10) {
        this.f3426p0.post(new a(i10));
    }

    public final void X(s sVar) {
        boolean z;
        RecyclerView recyclerView;
        int i10;
        s sVar2 = ((v) this.f3426p0.getAdapter()).f3466e.f3384o;
        Calendar calendar = sVar2.f3452o;
        if (calendar instanceof GregorianCalendar) {
            int i11 = sVar.f3454q;
            int i12 = sVar2.f3454q;
            int i13 = sVar.f3453p;
            int i14 = sVar2.f3453p;
            int i15 = (i13 - i14) + ((i11 - i12) * 12);
            s sVar3 = this.f3422l0;
            if (calendar instanceof GregorianCalendar) {
                int i16 = i15 - ((sVar3.f3453p - i14) + ((sVar3.f3454q - i12) * 12));
                boolean z10 = true;
                if (Math.abs(i16) > 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (i16 <= 0) {
                    z10 = false;
                }
                this.f3422l0 = sVar;
                if (!z || !z10) {
                    if (z) {
                        recyclerView = this.f3426p0;
                        i10 = i15 + 3;
                    }
                    W(i15);
                    return;
                }
                recyclerView = this.f3426p0;
                i10 = i15 - 3;
                recyclerView.a0(i10);
                W(i15);
                return;
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final void Y(e eVar) {
        this.f3423m0 = eVar;
        if (eVar == e.YEAR) {
            this.f3425o0.getLayoutManager().q0(this.f3422l0.f3454q - ((d0) this.f3425o0.getAdapter()).d.f3421k0.f3384o.f3454q);
            this.f3427q0.setVisibility(0);
            this.f3428r0.setVisibility(8);
        } else if (eVar == e.DAY) {
            this.f3427q0.setVisibility(8);
            this.f3428r0.setVisibility(0);
            X(this.f3422l0);
        }
    }

    public final void w(Bundle bundle) {
        super.w(bundle);
        if (bundle == null) {
            bundle = this.f1241t;
        }
        this.f3419i0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f3420j0 = (d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f3421k0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f3422l0 = (s) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(k(), this.f3419i0);
        this.f3424n0 = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        s sVar = this.f3421k0.f3384o;
        if (o.c0(contextThemeWrapper)) {
            i11 = R.layout.mtrl_calendar_vertical;
            i10 = 1;
        } else {
            i11 = R.layout.mtrl_calendar_horizontal;
            i10 = 0;
        }
        View inflate = cloneInContext.inflate(i11, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        w.k(gridView, new b());
        gridView.setAdapter(new f());
        gridView.setNumColumns(sVar.f3455r);
        gridView.setEnabled(false);
        this.f3426p0 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        k();
        this.f3426p0.setLayoutManager(new c(i10, i10));
        this.f3426p0.setTag("MONTHS_VIEW_GROUP_TAG");
        v vVar = new v(contextThemeWrapper, this.f3420j0, this.f3421k0, new d());
        this.f3426p0.setAdapter(vVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f3425o0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f3425o0.setLayoutManager(new GridLayoutManager(integer, 0));
            this.f3425o0.setAdapter(new d0(this));
            this.f3425o0.g(new h(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            w.k(materialButton, new i(this));
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(R.id.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(R.id.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.f3427q0 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f3428r0 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            Y(e.DAY);
            materialButton.setText(this.f3422l0.l(inflate.getContext()));
            this.f3426p0.h(new j(this, vVar, materialButton));
            materialButton.setOnClickListener(new k(this));
            materialButton3.setOnClickListener(new l(this, vVar));
            materialButton2.setOnClickListener(new m(this, vVar));
        }
        if (!o.c0(contextThemeWrapper)) {
            new u().a(this.f3426p0);
        }
        RecyclerView recyclerView2 = this.f3426p0;
        s sVar2 = this.f3422l0;
        s sVar3 = vVar.f3466e.f3384o;
        if (sVar3.f3452o instanceof GregorianCalendar) {
            recyclerView2.a0((sVar2.f3453p - sVar3.f3453p) + ((sVar2.f3454q - sVar3.f3454q) * 12));
            return inflate;
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }
}

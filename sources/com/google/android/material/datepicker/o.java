package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.m;
import androidx.fragment.app.y;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import com.karumi.dexter.R;
import i0.b0;
import i0.w;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m6.f;

public final class o<S> extends m {
    public static final /* synthetic */ int O0 = 0;
    public final LinkedHashSet<DialogInterface.OnDismissListener> A0 = new LinkedHashSet<>();
    public int B0;
    public d<S> C0;
    public x<S> D0;
    public a E0;
    public g<S> F0;
    public int G0;
    public CharSequence H0;
    public boolean I0;
    public int J0;
    public TextView K0;
    public CheckableImageButton L0;
    public f M0;
    public Button N0;
    public final LinkedHashSet<q<? super S>> x0 = new LinkedHashSet<>();
    public final LinkedHashSet<View.OnClickListener> y0 = new LinkedHashSet<>();

    /* renamed from: z0  reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f3443z0 = new LinkedHashSet<>();

    public class a implements View.OnClickListener {
        public a() {
        }

        public final void onClick(View view) {
            o oVar = o.this;
            Iterator<q<? super S>> it = oVar.x0.iterator();
            while (it.hasNext()) {
                oVar.C0.M();
                it.next().a();
            }
            oVar.W(false, false);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        public final void onClick(View view) {
            o oVar = o.this;
            Iterator<View.OnClickListener> it = oVar.y0.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            oVar.W(false, false);
        }
    }

    public class c extends w<S> {
        public c() {
        }

        public final void a(S s10) {
            int i10 = o.O0;
            o oVar = o.this;
            oVar.f0();
            oVar.N0.setEnabled(oVar.C0.C());
        }
    }

    public static int b0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        s sVar = new s(b0.c());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        int i10 = sVar.f3455r;
        int i11 = dimensionPixelSize * i10;
        return ((i10 - 1) * dimensionPixelOffset2) + i11 + (dimensionPixelOffset * 2);
    }

    public static boolean c0(Context context) {
        return d0(context, 16843277);
    }

    public static boolean d0(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(j6.b.b(R.attr.materialCalendarStyle, context, g.class.getCanonicalName()), new int[]{i10});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    public final void F(Bundle bundle) {
        s sVar;
        super.F(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.B0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.C0);
        a.b bVar = new a.b(this.E0);
        s sVar2 = this.F0.f3422l0;
        if (sVar2 != null) {
            bVar.f3394c = Long.valueOf(sVar2.f3457t);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.d);
        s i10 = s.i(bVar.f3392a);
        s i11 = s.i(bVar.f3393b);
        a.c cVar = (a.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = bVar.f3394c;
        if (l == null) {
            sVar = null;
        } else {
            sVar = s.i(l.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new a(i10, i11, cVar, sVar));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.G0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.H0);
    }

    public final void G() {
        super.G();
        Window window = Y().getWindow();
        if (this.I0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.M0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = R().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.M0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new d6.a(Y(), rect));
        }
        e0();
    }

    public final void H() {
        this.D0.f3471h0.clear();
        super.H();
    }

    public final Dialog X(Bundle bundle) {
        Context R = R();
        R();
        int i10 = this.B0;
        if (i10 == 0) {
            i10 = this.C0.u();
        }
        Dialog dialog = new Dialog(R, i10);
        Context context = dialog.getContext();
        this.I0 = c0(context);
        int b10 = j6.b.b(R.attr.colorSurface, context, o.class.getCanonicalName());
        f fVar = new f(context, (AttributeSet) null, R.attr.materialCalendarStyle, 2131952290);
        this.M0 = fVar;
        fVar.h(context);
        this.M0.j(ColorStateList.valueOf(b10));
        f fVar2 = this.M0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        fVar2.i(w.i.i(decorView));
        return dialog;
    }

    public final void e0() {
        x<S> xVar;
        R();
        int i10 = this.B0;
        if (i10 == 0) {
            i10 = this.C0.u();
        }
        d<S> dVar = this.C0;
        a aVar = this.E0;
        g<S> gVar = new g<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.f3387r);
        gVar.U(bundle);
        this.F0 = gVar;
        if (this.L0.isChecked()) {
            d<S> dVar2 = this.C0;
            a aVar2 = this.E0;
            xVar = new r<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i10);
            bundle2.putParcelable("DATE_SELECTOR_KEY", dVar2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar2);
            xVar.U(bundle2);
        } else {
            xVar = this.F0;
        }
        this.D0 = xVar;
        f0();
        y j8 = j();
        j8.getClass();
        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(j8);
        aVar3.f(R.id.mtrl_calendar_frame, this.D0, (String) null, 2);
        if (!aVar3.f1163g) {
            aVar3.f1164h = false;
            aVar3.f1095q.y(aVar3, false);
            this.D0.V(new c());
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void f0() {
        d<S> dVar = this.C0;
        k();
        String t10 = dVar.t();
        this.K0.setContentDescription(String.format(s(R.string.mtrl_picker_announce_current_selection), new Object[]{t10}));
        this.K0.setText(t10);
    }

    public final void g0(CheckableImageButton checkableImageButton) {
        this.L0.setContentDescription(checkableImageButton.getContext().getString(this.L0.isChecked() ? R.string.mtrl_picker_toggle_to_calendar_input_mode : R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f3443z0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.A0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.S;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void w(Bundle bundle) {
        super.w(bundle);
        if (bundle == null) {
            bundle = this.f1241t;
        }
        this.B0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.C0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.E0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.G0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.H0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.J0 = bundle.getInt("INPUT_MODE_KEY");
    }

    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        boolean z;
        if (this.I0) {
            i10 = R.layout.mtrl_picker_fullscreen;
        } else {
            i10 = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i10, viewGroup);
        Context context = inflate.getContext();
        if (this.I0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(b0(context), -2));
        } else {
            View findViewById = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(R.id.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(b0(context), -1));
            Resources resources = R().getResources();
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
            int i11 = t.f3458t;
            findViewById2.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i11 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i11) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.K0 = textView;
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        w.g.f(textView, 1);
        this.L0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.H0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.G0);
        }
        this.L0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.L0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, f.a.b(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], f.a.b(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.L0;
        if (this.J0 != 0) {
            z = true;
        } else {
            z = false;
        }
        checkableImageButton2.setChecked(z);
        w.k(this.L0, (i0.a) null);
        g0(this.L0);
        this.L0.setOnClickListener(new p(this));
        this.N0 = (Button) inflate.findViewById(R.id.confirm_button);
        if (this.C0.C()) {
            this.N0.setEnabled(true);
        } else {
            this.N0.setEnabled(false);
        }
        this.N0.setTag("CONFIRM_BUTTON_TAG");
        this.N0.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        button.setOnClickListener(new b());
        return inflate;
    }
}

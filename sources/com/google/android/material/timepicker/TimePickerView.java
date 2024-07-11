package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.karumi.dexter.R;
import i0.b0;
import i0.w;
import java.util.HashMap;
import java.util.WeakHashMap;

class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int F = 0;
    public final MaterialButtonToggleGroup E;

    public class a implements View.OnClickListener {
        public a() {
        }

        public final void onClick(View view) {
            int i10 = TimePickerView.F;
            TimePickerView.this.getClass();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.E = materialButtonToggleGroup;
        materialButtonToggleGroup.f3332r.add(new d(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        f fVar = new f(new GestureDetector(getContext(), new e(this)));
        chip.setOnTouchListener(fVar);
        chip2.setOnTouchListener(fVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(aVar);
        chip2.setOnClickListener(aVar);
    }

    public final void k() {
        boolean z;
        c.a aVar;
        if (this.E.getVisibility() == 0) {
            c cVar = new c();
            cVar.c(this);
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            char c10 = 1;
            if (w.e.d(this) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c10 = 2;
            }
            HashMap<Integer, c.a> hashMap = cVar.f844c;
            if (hashMap.containsKey(Integer.valueOf(R.id.material_clock_display)) && (aVar = hashMap.get(Integer.valueOf(R.id.material_clock_display))) != null) {
                c.b bVar = aVar.d;
                switch (c10) {
                    case 1:
                        bVar.f874h = -1;
                        bVar.f872g = -1;
                        bVar.E = -1;
                        bVar.L = Integer.MIN_VALUE;
                        break;
                    case 2:
                        bVar.f878j = -1;
                        bVar.f876i = -1;
                        bVar.F = -1;
                        bVar.N = Integer.MIN_VALUE;
                        break;
                    case 3:
                        bVar.l = -1;
                        bVar.f880k = -1;
                        bVar.G = 0;
                        bVar.M = Integer.MIN_VALUE;
                        break;
                    case 4:
                        bVar.f883m = -1;
                        bVar.f885n = -1;
                        bVar.H = 0;
                        bVar.O = Integer.MIN_VALUE;
                        break;
                    case 5:
                        bVar.f887o = -1;
                        bVar.f888p = -1;
                        bVar.f889q = -1;
                        bVar.K = 0;
                        bVar.R = Integer.MIN_VALUE;
                        break;
                    case 6:
                        bVar.f890r = -1;
                        bVar.f891s = -1;
                        bVar.J = 0;
                        bVar.Q = Integer.MIN_VALUE;
                        break;
                    case 7:
                        bVar.f892t = -1;
                        bVar.u = -1;
                        bVar.I = 0;
                        bVar.P = Integer.MIN_VALUE;
                        break;
                    case 8:
                        bVar.A = -1.0f;
                        bVar.z = -1;
                        bVar.f895y = -1;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown constraint");
                }
            }
            cVar.a(this);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k();
    }

    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            k();
        }
    }
}

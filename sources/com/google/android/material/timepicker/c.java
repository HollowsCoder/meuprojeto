package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import com.karumi.dexter.R;
import i0.b0;
import i0.w;
import java.util.HashMap;
import java.util.WeakHashMap;
import m6.f;
import m6.g;
import m6.i;
import p9.u;

public class c extends ConstraintLayout {
    public final a E;
    public int F;
    public f G;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            c.this.k();
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        f fVar = new f();
        this.G = fVar;
        g gVar = new g(0.5f);
        i iVar = fVar.f7121o.f7131a;
        iVar.getClass();
        i.a aVar = new i.a(iVar);
        aVar.f7164e = gVar;
        aVar.f7165f = gVar;
        aVar.f7166g = gVar;
        aVar.f7167h = gVar;
        fVar.setShapeAppearanceModel(new i(aVar));
        this.G.j(ColorStateList.valueOf(-1));
        f fVar2 = this.G;
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        w.d.q(this, fVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.N, i10, 0);
        this.F = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.E = new a();
        obtainStyledAttributes.recycle();
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            view.setId(w.e.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            a aVar = this.E;
            handler.removeCallbacks(aVar);
            handler.post(aVar);
        }
    }

    public final void k() {
        int childCount = getChildCount();
        int i10 = 1;
        for (int i11 = 0; i11 < childCount; i11++) {
            if ("skip".equals(getChildAt(i11).getTag())) {
                i10++;
            }
        }
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.c(this);
        float f10 = 0.0f;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int id = childAt.getId();
                int i13 = this.F;
                HashMap<Integer, c.a> hashMap = cVar.f844c;
                if (!hashMap.containsKey(Integer.valueOf(id))) {
                    hashMap.put(Integer.valueOf(id), new c.a());
                }
                c.b bVar = hashMap.get(Integer.valueOf(id)).d;
                bVar.f895y = R.id.circle_center;
                bVar.z = i13;
                bVar.A = f10;
                f10 = (360.0f / ((float) (childCount - i10))) + f10;
            }
        }
        cVar.a(this);
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        k();
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            a aVar = this.E;
            handler.removeCallbacks(aVar);
            handler.post(aVar);
        }
    }

    public final void setBackgroundColor(int i10) {
        this.G.j(ColorStateList.valueOf(i10));
    }
}

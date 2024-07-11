package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import java.util.HashMap;
import p9.u;

public final class d extends ViewGroup {

    /* renamed from: o  reason: collision with root package name */
    public c f920o;

    public static class a extends ConstraintLayout.b {
        public final float A0;
        public final float B0;
        public final float C0;

        /* renamed from: q0  reason: collision with root package name */
        public final float f921q0;

        /* renamed from: r0  reason: collision with root package name */
        public final boolean f922r0;

        /* renamed from: s0  reason: collision with root package name */
        public final float f923s0;
        public final float t0;

        /* renamed from: u0  reason: collision with root package name */
        public final float f924u0;

        /* renamed from: v0  reason: collision with root package name */
        public final float f925v0;

        /* renamed from: w0  reason: collision with root package name */
        public final float f926w0;
        public final float x0;
        public final float y0;

        /* renamed from: z0  reason: collision with root package name */
        public final float f927z0;

        public a() {
            this.f921q0 = 1.0f;
            this.f922r0 = false;
            this.f923s0 = 0.0f;
            this.t0 = 0.0f;
            this.f924u0 = 0.0f;
            this.f925v0 = 0.0f;
            this.f926w0 = 1.0f;
            this.x0 = 1.0f;
            this.y0 = 0.0f;
            this.f927z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f921q0 = 1.0f;
            this.f922r0 = false;
            this.f923s0 = 0.0f;
            this.t0 = 0.0f;
            this.f924u0 = 0.0f;
            this.f925v0 = 0.0f;
            this.f926w0 = 1.0f;
            this.x0 = 1.0f;
            this.y0 = 0.0f;
            this.f927z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.Y);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 15) {
                    this.f921q0 = obtainStyledAttributes.getFloat(index, this.f921q0);
                } else if (index == 28) {
                    this.f923s0 = obtainStyledAttributes.getFloat(index, this.f923s0);
                    this.f922r0 = true;
                } else if (index == 23) {
                    this.f924u0 = obtainStyledAttributes.getFloat(index, this.f924u0);
                } else if (index == 24) {
                    this.f925v0 = obtainStyledAttributes.getFloat(index, this.f925v0);
                } else if (index == 22) {
                    this.t0 = obtainStyledAttributes.getFloat(index, this.t0);
                } else if (index == 20) {
                    this.f926w0 = obtainStyledAttributes.getFloat(index, this.f926w0);
                } else if (index == 21) {
                    this.x0 = obtainStyledAttributes.getFloat(index, this.x0);
                } else if (index == 16) {
                    this.y0 = obtainStyledAttributes.getFloat(index, this.y0);
                } else if (index == 17) {
                    this.f927z0 = obtainStyledAttributes.getFloat(index, this.f927z0);
                } else if (index == 18) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == 19) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == 27) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    public c getConstraintSet() {
        if (this.f920o == null) {
            this.f920o = new c();
        }
        c cVar = this.f920o;
        cVar.getClass();
        int childCount = getChildCount();
        HashMap<Integer, c.a> hashMap = cVar.f844c;
        hashMap.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            a aVar = (a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!cVar.f843b || id != -1) {
                if (!hashMap.containsKey(Integer.valueOf(id))) {
                    hashMap.put(Integer.valueOf(id), new c.a());
                }
                c.a aVar2 = hashMap.get(Integer.valueOf(id));
                if (aVar2 != null) {
                    if (childAt instanceof b) {
                        b bVar = (b) childAt;
                        aVar2.c(id, aVar);
                        if (bVar instanceof Barrier) {
                            c.b bVar2 = aVar2.d;
                            bVar2.f873g0 = 1;
                            Barrier barrier = (Barrier) bVar;
                            bVar2.f869e0 = barrier.getType();
                            bVar2.f875h0 = barrier.getReferencedIds();
                            bVar2.f871f0 = barrier.getMargin();
                        }
                    }
                    aVar2.c(id, aVar);
                }
                i10++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        return this.f920o;
    }

    public final void onLayout(boolean z, int i10, int i11, int i12, int i13) {
    }
}

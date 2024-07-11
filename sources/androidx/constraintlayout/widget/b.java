package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p9.u;
import q.a;
import q.e;

public abstract class b extends View {

    /* renamed from: o  reason: collision with root package name */
    public int[] f833o = new int[32];

    /* renamed from: p  reason: collision with root package name */
    public int f834p;

    /* renamed from: q  reason: collision with root package name */
    public final Context f835q;

    /* renamed from: r  reason: collision with root package name */
    public a f836r;

    /* renamed from: s  reason: collision with root package name */
    public String f837s;

    /* renamed from: t  reason: collision with root package name */
    public String f838t;
    public View[] u = null;

    /* renamed from: v  reason: collision with root package name */
    public final HashMap<Integer, String> f839v = new HashMap<>();

    public b(Context context) {
        super(context);
        this.f835q = context;
        i((AttributeSet) null);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f835q = context;
        i(attributeSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x00b0
            int r0 = r6.length()
            if (r0 != 0) goto L_0x000a
            goto L_0x00b0
        L_0x000a:
            android.content.Context r0 = r5.f835q
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L_0x0021
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L_0x0021:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L_0x0031
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L_0x0032
        L_0x0031:
            r1 = r2
        L_0x0032:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L_0x005b
            if (r1 == 0) goto L_0x005b
            boolean r3 = r6 instanceof java.lang.String
            if (r3 == 0) goto L_0x004f
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r1.A
            if (r3 == 0) goto L_0x004f
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L_0x004f
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r1.A
            java.lang.Object r3 = r3.get(r6)
            goto L_0x0050
        L_0x004f:
            r3 = r2
        L_0x0050:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x005b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L_0x005c
        L_0x005b:
            r3 = 0
        L_0x005c:
            if (r3 != 0) goto L_0x0064
            if (r1 == 0) goto L_0x0064
            int r3 = r5.h(r1, r6)
        L_0x0064:
            if (r3 != 0) goto L_0x0070
            java.lang.Class<t.c> r1 = t.c.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch:{ Exception -> 0x0070 }
            int r3 = r1.getInt(r2)     // Catch:{ Exception -> 0x0070 }
        L_0x0070:
            if (r3 != 0) goto L_0x0080
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L_0x0080:
            if (r3 == 0) goto L_0x008f
            java.util.HashMap<java.lang.Integer, java.lang.String> r0 = r5.f839v
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r6)
            r5.d(r3)
            goto L_0x00b0
        L_0x008f:
            r0 = 23
            int r0 = androidx.appcompat.widget.x0.a(r6, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Could not find id of \""
            r1.append(r0)
            r1.append(r6)
            java.lang.String r6 = "\""
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.b.c(java.lang.String):void");
    }

    public final void d(int i10) {
        if (i10 != getId()) {
            int i11 = this.f834p + 1;
            int[] iArr = this.f833o;
            if (i11 > iArr.length) {
                this.f833o = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f833o;
            int i12 = this.f834p;
            iArr2[i12] = i10;
            this.f834p = i12 + 1;
        }
    }

    public final void e(String str) {
        if (str != null && str.length() != 0 && this.f835q != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = constraintLayout.getChildAt(i10);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).X)) {
                    if (childAt.getId() == -1) {
                        String simpleName = childAt.getClass().getSimpleName();
                        StringBuilder sb = new StringBuilder(simpleName.length() + 42);
                        sb.append("to use ConstraintTag view ");
                        sb.append(simpleName);
                        sb.append(" must have an ID");
                        Log.w("ConstraintHelper", sb.toString());
                    } else {
                        d(childAt.getId());
                    }
                }
            }
        }
    }

    public final void f(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f834p; i10++) {
            View view = constraintLayout.f770o.get(this.f833o[i10]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void g(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f833o, this.f834p);
    }

    public final int h(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f835q.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u.W);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f837s = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f838t = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void j(e eVar, boolean z) {
    }

    public final void k() {
        if (this.f836r != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.b) {
                ((ConstraintLayout.b) layoutParams).f809p0 = this.f836r;
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f837s;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f838t;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public final void onDraw(Canvas canvas) {
    }

    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f837s = str;
        if (str != null) {
            int i10 = 0;
            this.f834p = 0;
            while (true) {
                int indexOf = str.indexOf(44, i10);
                if (indexOf == -1) {
                    c(str.substring(i10));
                    return;
                } else {
                    c(str.substring(i10, indexOf));
                    i10 = indexOf + 1;
                }
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f838t = str;
        if (str != null) {
            int i10 = 0;
            this.f834p = 0;
            while (true) {
                int indexOf = str.indexOf(44, i10);
                if (indexOf == -1) {
                    e(str.substring(i10));
                    return;
                } else {
                    e(str.substring(i10, indexOf));
                    i10 = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f837s = null;
        this.f834p = 0;
        for (int d : iArr) {
            d(d);
        }
    }

    public final void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f837s == null) {
            d(i10);
        }
    }
}

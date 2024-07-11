package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class w implements LayoutInflater.Factory2 {

    /* renamed from: o  reason: collision with root package name */
    public final y f1303o;

    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ e0 f1304o;

        public a(e0 e0Var) {
            this.f1304o = e0Var;
        }

        public final void onViewAttachedToWindow(View view) {
            e0 e0Var = this.f1304o;
            n nVar = e0Var.f1145c;
            e0Var.k();
            p0.f((ViewGroup) nVar.S.getParent(), w.this.f1303o.G()).e();
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public w(y yVar) {
        this.f1303o = yVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r11, java.lang.String r12, android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r10 = this;
            java.lang.Class<androidx.fragment.app.s> r0 = androidx.fragment.app.s.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r12)
            androidx.fragment.app.y r1 = r10.f1303o
            if (r0 == 0) goto L_0x0014
            androidx.fragment.app.s r11 = new androidx.fragment.app.s
            r11.<init>(r13, r14, r1)
            return r11
        L_0x0014:
            java.lang.String r0 = "fragment"
            boolean r12 = r0.equals(r12)
            r0 = 0
            if (r12 != 0) goto L_0x001e
            return r0
        L_0x001e:
            java.lang.String r12 = "class"
            java.lang.String r12 = r14.getAttributeValue(r0, r12)
            int[] r2 = n.e.f7300t
            android.content.res.TypedArray r2 = r13.obtainStyledAttributes(r14, r2)
            r3 = 0
            if (r12 != 0) goto L_0x0031
            java.lang.String r12 = r2.getString(r3)
        L_0x0031:
            r4 = 1
            r5 = -1
            int r6 = r2.getResourceId(r4, r5)
            r7 = 2
            java.lang.String r8 = r2.getString(r7)
            r2.recycle()
            if (r12 == 0) goto L_0x0189
            java.lang.ClassLoader r2 = r13.getClassLoader()
            java.lang.Class r2 = androidx.fragment.app.u.b(r2, r12)     // Catch:{ ClassNotFoundException -> 0x0050 }
            java.lang.Class<androidx.fragment.app.n> r9 = androidx.fragment.app.n.class
            boolean r2 = r9.isAssignableFrom(r2)     // Catch:{ ClassNotFoundException -> 0x0050 }
            goto L_0x0051
        L_0x0050:
            r2 = r3
        L_0x0051:
            if (r2 != 0) goto L_0x0055
            goto L_0x0189
        L_0x0055:
            if (r11 == 0) goto L_0x005b
            int r3 = r11.getId()
        L_0x005b:
            if (r3 != r5) goto L_0x0080
            if (r6 != r5) goto L_0x0080
            if (r8 == 0) goto L_0x0062
            goto L_0x0080
        L_0x0062:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = r14.getPositionDescription()
            r13.append(r14)
            java.lang.String r14 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            r13.append(r14)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.<init>(r12)
            throw r11
        L_0x0080:
            if (r6 == r5) goto L_0x0086
            androidx.fragment.app.n r0 = r1.C(r6)
        L_0x0086:
            if (r0 != 0) goto L_0x008e
            if (r8 == 0) goto L_0x008e
            androidx.fragment.app.n r0 = r1.D(r8)
        L_0x008e:
            if (r0 != 0) goto L_0x0096
            if (r3 == r5) goto L_0x0096
            androidx.fragment.app.n r0 = r1.C(r3)
        L_0x0096:
            java.lang.String r2 = "Fragment "
            if (r0 != 0) goto L_0x00d6
            androidx.fragment.app.u r0 = r1.F()
            r13.getClassLoader()
            androidx.fragment.app.n r0 = r0.a(r12)
            r0.A = r4
            if (r6 == 0) goto L_0x00ab
            r13 = r6
            goto L_0x00ac
        L_0x00ab:
            r13 = r3
        L_0x00ac:
            r0.J = r13
            r0.K = r3
            r0.L = r8
            r0.B = r4
            r0.F = r1
            androidx.fragment.app.v<?> r13 = r1.f1319n
            r0.G = r13
            android.content.Context r13 = r13.f1300p
            android.os.Bundle r3 = r0.f1237p
            r0.C(r13, r14, r3)
            androidx.fragment.app.e0 r13 = r1.a(r0)
            boolean r14 = androidx.fragment.app.y.I(r7)
            if (r14 == 0) goto L_0x0112
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r2)
            r14.append(r0)
            java.lang.String r1 = " has been inflated via the <fragment> tag: id=0x"
            goto L_0x00ff
        L_0x00d6:
            boolean r13 = r0.B
            if (r13 != 0) goto L_0x014b
            r0.B = r4
            r0.F = r1
            androidx.fragment.app.v<?> r13 = r1.f1319n
            r0.G = r13
            android.content.Context r13 = r13.f1300p
            android.os.Bundle r3 = r0.f1237p
            r0.C(r13, r14, r3)
            androidx.fragment.app.e0 r13 = r1.g(r0)
            boolean r14 = androidx.fragment.app.y.I(r7)
            if (r14 == 0) goto L_0x0112
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r1 = "Retained Fragment "
            r14.<init>(r1)
            r14.append(r0)
            java.lang.String r1 = " has been re-attached via the <fragment> tag: id=0x"
        L_0x00ff:
            r14.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r6)
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r14)
        L_0x0112:
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            r0.R = r11
            r13.k()
            r13.j()
            android.view.View r11 = r0.S
            if (r11 == 0) goto L_0x013f
            if (r6 == 0) goto L_0x0125
            r11.setId(r6)
        L_0x0125:
            android.view.View r11 = r0.S
            java.lang.Object r11 = r11.getTag()
            if (r11 != 0) goto L_0x0132
            android.view.View r11 = r0.S
            r11.setTag(r8)
        L_0x0132:
            android.view.View r11 = r0.S
            androidx.fragment.app.w$a r12 = new androidx.fragment.app.w$a
            r12.<init>(r13)
            r11.addOnAttachStateChangeListener(r12)
            android.view.View r11 = r0.S
            return r11
        L_0x013f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r13 = " did not create a view."
            java.lang.String r12 = b0.d.f(r2, r12, r13)
            r11.<init>(r12)
            throw r11
        L_0x014b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = r14.getPositionDescription()
            r13.append(r14)
            java.lang.String r14 = ": Duplicate id 0x"
            r13.append(r14)
            java.lang.String r14 = java.lang.Integer.toHexString(r6)
            r13.append(r14)
            java.lang.String r14 = ", tag "
            r13.append(r14)
            r13.append(r8)
            java.lang.String r14 = ", or parent id 0x"
            r13.append(r14)
            java.lang.String r14 = java.lang.Integer.toHexString(r3)
            r13.append(r14)
            java.lang.String r14 = " with another fragment for "
            r13.append(r14)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.<init>(r12)
            throw r11
        L_0x0189:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.w.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}

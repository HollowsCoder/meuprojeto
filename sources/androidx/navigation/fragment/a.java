package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.y;
import androidx.navigation.h;
import androidx.navigation.p;
import java.util.ArrayDeque;
import java.util.Iterator;

@p.a("fragment")
public final class a extends p<C0017a> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1473a;

    /* renamed from: b  reason: collision with root package name */
    public final y f1474b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1475c;
    public final ArrayDeque<Integer> d = new ArrayDeque<>();

    /* renamed from: androidx.navigation.fragment.a$a  reason: collision with other inner class name */
    public static class C0017a extends h {
        public String w;

        public C0017a(p<? extends C0017a> pVar) {
            super(pVar);
        }

        public final void k(Context context, AttributeSet attributeSet) {
            super.k(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, s6.a.u);
            String string = obtainAttributes.getString(0);
            if (string != null) {
                this.w = string;
            }
            obtainAttributes.recycle();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.w;
            if (str == null) {
                str = "null";
            }
            sb.append(str);
            return sb.toString();
        }
    }

    public a(Context context, y yVar, int i10) {
        this.f1473a = context;
        this.f1474b = yVar;
        this.f1475c = i10;
    }

    public static String f(int i10, int i11) {
        return i10 + "-" + i11;
    }

    public final h a() {
        return new C0017a(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.navigation.h b(androidx.navigation.h r10, android.os.Bundle r11, androidx.navigation.m r12) {
        /*
            r9 = this;
            androidx.navigation.fragment.a$a r10 = (androidx.navigation.fragment.a.C0017a) r10
            androidx.fragment.app.y r0 = r9.f1474b
            boolean r1 = r0.M()
            r2 = 0
            if (r1 == 0) goto L_0x0014
            java.lang.String r10 = "FragmentNavigator"
            java.lang.String r11 = "Ignoring navigate() call: FragmentManager has already saved its state"
            android.util.Log.i(r10, r11)
            goto L_0x010c
        L_0x0014:
            java.lang.String r1 = r10.w
            if (r1 == 0) goto L_0x011c
            r3 = 0
            char r4 = r1.charAt(r3)
            r5 = 46
            android.content.Context r6 = r9.f1473a
            if (r4 != r5) goto L_0x0036
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r6.getPackageName()
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
        L_0x0036:
            androidx.fragment.app.u r4 = r0.F()
            r6.getClassLoader()
            androidx.fragment.app.n r1 = r4.a(r1)
            r1.U(r11)
            androidx.fragment.app.a r11 = new androidx.fragment.app.a
            r11.<init>(r0)
            r4 = -1
            if (r12 == 0) goto L_0x004f
            int r5 = r12.d
            goto L_0x0050
        L_0x004f:
            r5 = r4
        L_0x0050:
            if (r12 == 0) goto L_0x0055
            int r6 = r12.f1516e
            goto L_0x0056
        L_0x0055:
            r6 = r4
        L_0x0056:
            if (r12 == 0) goto L_0x005b
            int r7 = r12.f1517f
            goto L_0x005c
        L_0x005b:
            r7 = r4
        L_0x005c:
            if (r12 == 0) goto L_0x0061
            int r8 = r12.f1518g
            goto L_0x0062
        L_0x0061:
            r8 = r4
        L_0x0062:
            if (r5 != r4) goto L_0x006a
            if (r6 != r4) goto L_0x006a
            if (r7 != r4) goto L_0x006a
            if (r8 == r4) goto L_0x0082
        L_0x006a:
            if (r5 == r4) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r5 = r3
        L_0x006e:
            if (r6 == r4) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r6 = r3
        L_0x0072:
            if (r7 == r4) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r7 = r3
        L_0x0076:
            if (r8 == r4) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r8 = r3
        L_0x007a:
            r11.f1159b = r5
            r11.f1160c = r6
            r11.d = r7
            r11.f1161e = r8
        L_0x0082:
            int r5 = r9.f1475c
            if (r5 == 0) goto L_0x0114
            r6 = 2
            r11.f(r5, r1, r2, r6)
            r11.j(r1)
            int r1 = r10.f1494q
            java.util.ArrayDeque<java.lang.Integer> r5 = r9.d
            boolean r6 = r5.isEmpty()
            r7 = 1
            if (r12 == 0) goto L_0x00ac
            if (r6 != 0) goto L_0x00ac
            boolean r12 = r12.f1513a
            if (r12 == 0) goto L_0x00ac
            java.lang.Object r12 = r5.peekLast()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r1) goto L_0x00ac
            r12 = r7
            goto L_0x00ad
        L_0x00ac:
            r12 = r3
        L_0x00ad:
            if (r6 == 0) goto L_0x00b0
            goto L_0x00fc
        L_0x00b0:
            java.lang.String r6 = "This FragmentTransaction is not allowed to be added to the back stack."
            if (r12 == 0) goto L_0x00eb
            int r12 = r5.size()
            if (r12 <= r7) goto L_0x00fd
            int r12 = r5.size()
            java.lang.Object r8 = r5.peekLast()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.String r12 = f(r12, r8)
            androidx.fragment.app.y$m r8 = new androidx.fragment.app.y$m
            r8.<init>(r12, r4)
            r0.v(r8, r3)
            int r12 = r5.size()
            java.lang.String r12 = f(r12, r1)
            boolean r0 = r11.f1164h
            if (r0 == 0) goto L_0x00e5
            r11.f1163g = r7
            r11.f1165i = r12
            goto L_0x00fd
        L_0x00e5:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r6)
            throw r10
        L_0x00eb:
            int r12 = r5.size()
            int r12 = r12 + r7
            java.lang.String r12 = f(r12, r1)
            boolean r0 = r11.f1164h
            if (r0 == 0) goto L_0x010e
            r11.f1163g = r7
            r11.f1165i = r12
        L_0x00fc:
            r3 = r7
        L_0x00fd:
            r11.f1171p = r7
            r11.d()
            if (r3 == 0) goto L_0x010c
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            r5.add(r11)
            goto L_0x010d
        L_0x010c:
            r10 = r2
        L_0x010d:
            return r10
        L_0x010e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r6)
            throw r10
        L_0x0114:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Must use non-zero containerViewId"
            r10.<init>(r11)
            throw r10
        L_0x011c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Fragment class was not set"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.a.b(androidx.navigation.h, android.os.Bundle, androidx.navigation.m):androidx.navigation.h");
    }

    public final void c(Bundle bundle) {
        int[] intArray = bundle.getIntArray("androidx-nav-fragment:navigator:backStackIds");
        if (intArray != null) {
            ArrayDeque<Integer> arrayDeque = this.d;
            arrayDeque.clear();
            for (int valueOf : intArray) {
                arrayDeque.add(Integer.valueOf(valueOf));
            }
        }
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        ArrayDeque<Integer> arrayDeque = this.d;
        int[] iArr = new int[arrayDeque.size()];
        Iterator<Integer> it = arrayDeque.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        bundle.putIntArray("androidx-nav-fragment:navigator:backStackIds", iArr);
        return bundle;
    }

    public final boolean e() {
        ArrayDeque<Integer> arrayDeque = this.d;
        if (arrayDeque.isEmpty()) {
            return false;
        }
        y yVar = this.f1474b;
        if (yVar.M()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        yVar.v(new y.m(f(arrayDeque.size(), arrayDeque.peekLast().intValue()), -1), false);
        arrayDeque.removeLast();
        return true;
    }
}

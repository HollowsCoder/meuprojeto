package v1;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.c;
import e.d;
import v1.e;
import z8.g;

public abstract class b<T extends ViewDataBinding, V extends e<?>> extends d {
    public T E;
    public V F;
    public boolean G;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9119a;

        static {
            int[] iArr = new int[j2.b.values().length];
            iArr[j2.b.OK.ordinal()] = 1;
            iArr[j2.b.ERROR.ordinal()] = 2;
            iArr[j2.b.WARNING.ordinal()] = 3;
            iArr[j2.b.INFO.ordinal()] = 4;
            f9119a = iArr;
        }
    }

    public final T A() {
        T t10 = this.E;
        g.c(t10);
        return t10;
    }

    public abstract int B();

    public abstract int C();

    public abstract V D();

    public abstract void E();

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041 A[Catch:{ Exception -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042 A[Catch:{ Exception -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054 A[Catch:{ Exception -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b A[Catch:{ Exception -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0083 A[Catch:{ Exception -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009b A[Catch:{ Exception -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F(java.lang.String r4, java.lang.String r5, j2.b r6) {
        /*
            r3 = this;
            java.lang.String r0 = "alertTypes"
            z8.g.f(r6, r0)
            boolean r0 = r3.G     // Catch:{ Exception -> 0x00a4 }
            if (r0 != 0) goto L_0x00a8
            r0 = 1
            r3.G = r0     // Catch:{ Exception -> 0x00a4 }
            int[] r1 = v1.b.a.f9119a     // Catch:{ Exception -> 0x00a4 }
            int r6 = r6.ordinal()     // Catch:{ Exception -> 0x00a4 }
            r6 = r1[r6]     // Catch:{ Exception -> 0x00a4 }
            if (r6 == r0) goto L_0x003a
            r0 = 2
            if (r6 == r0) goto L_0x0036
            r0 = 3
            if (r6 == r0) goto L_0x002b
            r0 = 4
            if (r6 == r0) goto L_0x0020
            goto L_0x0036
        L_0x0020:
            r6 = 2131886108(0x7f12001c, float:1.9406786E38)
            java.lang.String r6 = r3.getString(r6)     // Catch:{ Exception -> 0x00a4 }
            r0 = 2131099699(0x7f060033, float:1.7811759E38)
            goto L_0x003f
        L_0x002b:
            r6 = 2131886109(0x7f12001d, float:1.9406788E38)
            java.lang.String r6 = r3.getString(r6)     // Catch:{ Exception -> 0x00a4 }
            r0 = 2131099918(0x7f06010e, float:1.7812203E38)
            goto L_0x003f
        L_0x0036:
            r6 = 2131099934(0x7f06011e, float:1.7812235E38)
            goto L_0x003d
        L_0x003a:
            r6 = 2131099803(0x7f06009b, float:1.781197E38)
        L_0x003d:
            r0 = r6
            r6 = r4
        L_0x003f:
            if (r4 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r4 = r6
        L_0x0043:
            i8.f$a r6 = i8.f.f6149c     // Catch:{ Exception -> 0x00a4 }
            r6.getClass()     // Catch:{ Exception -> 0x00a4 }
            i8.f r6 = i8.f.a.a(r3)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x00a4 }
            i8.a r1 = r6.f6150a     // Catch:{ Exception -> 0x00a4 }
            if (r1 == 0) goto L_0x0057
            r1.setText((java.lang.CharSequence) r5)     // Catch:{ Exception -> 0x00a4 }
        L_0x0057:
            i8.a r5 = r6.f6150a     // Catch:{ Exception -> 0x00a4 }
            if (r5 == 0) goto L_0x0061
            r1 = 2131230852(0x7f080084, float:1.8077768E38)
            r5.setIcon((int) r1)     // Catch:{ Exception -> 0x00a4 }
        L_0x0061:
            java.lang.ref.WeakReference<android.app.Activity> r5 = i8.f.f6148b     // Catch:{ Exception -> 0x00a4 }
            if (r5 == 0) goto L_0x007a
            java.lang.Object r5 = r5.get()     // Catch:{ Exception -> 0x00a4 }
            android.app.Activity r5 = (android.app.Activity) r5     // Catch:{ Exception -> 0x00a4 }
            if (r5 == 0) goto L_0x007a
            i8.a r1 = r6.f6150a     // Catch:{ Exception -> 0x00a4 }
            if (r1 == 0) goto L_0x007a
            java.lang.Object r2 = y.a.f9523a     // Catch:{ Exception -> 0x00a4 }
            int r5 = y.a.d.a(r5, r0)     // Catch:{ Exception -> 0x00a4 }
            r1.setAlertBackgroundColor(r5)     // Catch:{ Exception -> 0x00a4 }
        L_0x007a:
            v1.a r5 = new v1.a     // Catch:{ Exception -> 0x00a4 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x00a4 }
            i8.a r0 = r6.f6150a     // Catch:{ Exception -> 0x00a4 }
            if (r0 == 0) goto L_0x0086
            r0.setOnHideListener$alerter_release(r5)     // Catch:{ Exception -> 0x00a4 }
        L_0x0086:
            if (r4 == 0) goto L_0x008f
            i8.a r5 = r6.f6150a     // Catch:{ Exception -> 0x00a4 }
            if (r5 == 0) goto L_0x008f
            r5.setTitle((java.lang.CharSequence) r4)     // Catch:{ Exception -> 0x00a4 }
        L_0x008f:
            java.lang.ref.WeakReference<android.app.Activity> r4 = i8.f.f6148b     // Catch:{ Exception -> 0x00a4 }
            if (r4 == 0) goto L_0x00a8
            java.lang.Object r4 = r4.get()     // Catch:{ Exception -> 0x00a4 }
            android.app.Activity r4 = (android.app.Activity) r4     // Catch:{ Exception -> 0x00a4 }
            if (r4 == 0) goto L_0x00a8
            i8.g r5 = new i8.g     // Catch:{ Exception -> 0x00a4 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x00a4 }
            r4.runOnUiThread(r5)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x00a8
        L_0x00a4:
            r4 = move-exception
            r4.printStackTrace()
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.b.F(java.lang.String, java.lang.String, j2.b):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int C = C();
        DataBinderMapperImpl dataBinderMapperImpl = c.f1029a;
        setContentView(C);
        this.E = c.b((ViewGroup) getWindow().getDecorView().findViewById(16908290), 0, C);
        V v10 = this.F;
        if (v10 == null) {
            v10 = D();
        }
        this.F = v10;
        T t10 = this.E;
        if (t10 != null) {
            t10.c0(B(), this.F);
        }
        T t11 = this.E;
        if (t11 != null) {
            t11.V();
        }
        E();
    }
}

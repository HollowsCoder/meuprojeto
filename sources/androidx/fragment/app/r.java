package androidx.fragment.app;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

public final class r {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f1286a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f1287b;

        public a(Animator animator) {
            this.f1286a = null;
            this.f1287b = animator;
        }

        public a(Animation animation) {
            this.f1286a = animation;
            this.f1287b = null;
        }
    }

    public static class b extends AnimationSet implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public final ViewGroup f1288o;

        /* renamed from: p  reason: collision with root package name */
        public final View f1289p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f1290q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f1291r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f1292s = true;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1288o = viewGroup;
            this.f1289p = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public final boolean getTransformation(long j8, Transformation transformation) {
            this.f1292s = true;
            if (this.f1290q) {
                return !this.f1291r;
            }
            if (!super.getTransformation(j8, transformation)) {
                this.f1290q = true;
                i0.r.a(this.f1288o, this);
            }
            return true;
        }

        public final boolean getTransformation(long j8, Transformation transformation, float f10) {
            this.f1292s = true;
            if (this.f1290q) {
                return !this.f1291r;
            }
            if (!super.getTransformation(j8, transformation, f10)) {
                this.f1290q = true;
                i0.r.a(this.f1288o, this);
            }
            return true;
        }

        public final void run() {
            boolean z = this.f1290q;
            ViewGroup viewGroup = this.f1288o;
            if (z || !this.f1292s) {
                viewGroup.endViewTransition(this.f1289p);
                this.f1291r = true;
                return;
            }
            this.f1292s = false;
            viewGroup.post(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0047 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0048 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.fragment.app.r.a a(android.content.Context r5, androidx.fragment.app.n r6, boolean r7, boolean r8) {
        /*
            androidx.fragment.app.n$b r0 = r6.V
            r1 = 0
            if (r0 != 0) goto L_0x0007
            r2 = r1
            goto L_0x0009
        L_0x0007:
            int r2 = r0.f1250f
        L_0x0009:
            if (r8 == 0) goto L_0x001a
            if (r7 == 0) goto L_0x0014
            if (r0 != 0) goto L_0x0011
        L_0x000f:
            r8 = r1
            goto L_0x0027
        L_0x0011:
            int r8 = r0.d
            goto L_0x0027
        L_0x0014:
            if (r0 != 0) goto L_0x0017
            goto L_0x000f
        L_0x0017:
            int r8 = r0.f1249e
            goto L_0x0027
        L_0x001a:
            if (r7 == 0) goto L_0x0022
            if (r0 != 0) goto L_0x001f
            goto L_0x000f
        L_0x001f:
            int r8 = r0.f1247b
            goto L_0x0027
        L_0x0022:
            if (r0 != 0) goto L_0x0025
            goto L_0x000f
        L_0x0025:
            int r8 = r0.f1248c
        L_0x0027:
            r6.T(r1, r1, r1, r1)
            android.view.ViewGroup r0 = r6.R
            r3 = 0
            if (r0 == 0) goto L_0x003d
            r4 = 2131362371(0x7f0a0243, float:1.834452E38)
            java.lang.Object r0 = r0.getTag(r4)
            if (r0 == 0) goto L_0x003d
            android.view.ViewGroup r0 = r6.R
            r0.setTag(r4, r3)
        L_0x003d:
            android.view.ViewGroup r6 = r6.R
            if (r6 == 0) goto L_0x0048
            android.animation.LayoutTransition r6 = r6.getLayoutTransition()
            if (r6 == 0) goto L_0x0048
            return r3
        L_0x0048:
            if (r8 != 0) goto L_0x0078
            if (r2 == 0) goto L_0x0078
            r6 = 4097(0x1001, float:5.741E-42)
            if (r2 == r6) goto L_0x006e
            r6 = 4099(0x1003, float:5.744E-42)
            if (r2 == r6) goto L_0x0064
            r6 = 8194(0x2002, float:1.1482E-41)
            if (r2 == r6) goto L_0x005a
            r6 = -1
            goto L_0x0077
        L_0x005a:
            if (r7 == 0) goto L_0x0060
            r6 = 2130837507(0x7f020003, float:1.727997E38)
            goto L_0x0077
        L_0x0060:
            r6 = 2130837508(0x7f020004, float:1.7279972E38)
            goto L_0x0077
        L_0x0064:
            if (r7 == 0) goto L_0x006a
            r6 = 2130837509(0x7f020005, float:1.7279974E38)
            goto L_0x0077
        L_0x006a:
            r6 = 2130837510(0x7f020006, float:1.7279976E38)
            goto L_0x0077
        L_0x006e:
            if (r7 == 0) goto L_0x0074
            r6 = 2130837511(0x7f020007, float:1.7279978E38)
            goto L_0x0077
        L_0x0074:
            r6 = 2130837512(0x7f020008, float:1.727998E38)
        L_0x0077:
            r8 = r6
        L_0x0078:
            if (r8 == 0) goto L_0x00b8
            android.content.res.Resources r6 = r5.getResources()
            java.lang.String r6 = r6.getResourceTypeName(r8)
            java.lang.String r7 = "anim"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x009a
            android.view.animation.Animation r7 = android.view.animation.AnimationUtils.loadAnimation(r5, r8)     // Catch:{ NotFoundException -> 0x0098, RuntimeException -> 0x009a }
            if (r7 == 0) goto L_0x0096
            androidx.fragment.app.r$a r0 = new androidx.fragment.app.r$a     // Catch:{ NotFoundException -> 0x0098, RuntimeException -> 0x009a }
            r0.<init>((android.view.animation.Animation) r7)     // Catch:{ NotFoundException -> 0x0098, RuntimeException -> 0x009a }
            return r0
        L_0x0096:
            r1 = 1
            goto L_0x009a
        L_0x0098:
            r5 = move-exception
            throw r5
        L_0x009a:
            if (r1 != 0) goto L_0x00b8
            android.animation.Animator r7 = android.animation.AnimatorInflater.loadAnimator(r5, r8)     // Catch:{ RuntimeException -> 0x00a8 }
            if (r7 == 0) goto L_0x00b8
            androidx.fragment.app.r$a r0 = new androidx.fragment.app.r$a     // Catch:{ RuntimeException -> 0x00a8 }
            r0.<init>((android.animation.Animator) r7)     // Catch:{ RuntimeException -> 0x00a8 }
            return r0
        L_0x00a8:
            r7 = move-exception
            if (r6 != 0) goto L_0x00b7
            android.view.animation.Animation r5 = android.view.animation.AnimationUtils.loadAnimation(r5, r8)
            if (r5 == 0) goto L_0x00b8
            androidx.fragment.app.r$a r6 = new androidx.fragment.app.r$a
            r6.<init>((android.view.animation.Animation) r5)
            return r6
        L_0x00b7:
            throw r7
        L_0x00b8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.r.a(android.content.Context, androidx.fragment.app.n, boolean, boolean):androidx.fragment.app.r$a");
    }
}

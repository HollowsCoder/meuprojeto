package com.appfab.facematchlive.ui.flow.main;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import androidx.activity.result.d;
import androidx.emoji2.text.f;
import androidx.lifecycle.b0;
import androidx.lifecycle.s;
import com.airbnb.lottie.LottieAnimationView;
import com.appfab.facematchlive.FaceMatchApp;
import com.appfab.facematchlive.data.model.CurrentConfigModel;
import com.appfab.facematchlive.data.model.GalleryModel;
import com.appfab.facematchlive.ui.flow.custom_ad.CustomAdActivity;
import com.karumi.dexter.R;
import d2.k;
import d2.p;
import d2.q;
import de.hdodenhof.circleimageview.CircleImageView;
import h1.l;
import java.lang.ref.WeakReference;
import n8.i;
import p3.c;
import x1.e;
import z8.g;
import z8.h;

public final class MainActivity extends v1.b<e, p> implements q {
    public static final /* synthetic */ int P = 0;
    public boolean H = true;
    public String I;
    public String J;
    public boolean K;
    public final a L = new a(this);
    public c M;
    public final d N = v(new d2.c(0), new c.c());
    public final d O = v(new d2.a(this), new c.c());

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MainActivity f2229a;

        public a(MainActivity mainActivity) {
            this.f2229a = mainActivity;
        }
    }

    public static final class b extends h implements y8.a<i> {

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ MainActivity f2230p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(MainActivity mainActivity) {
            super(0);
            this.f2230p = mainActivity;
        }

        public final Object n() {
            T t10 = this.f2230p.E;
            g.c(t10);
            ((e) t10).P0.B0.setVisibility(4);
            return i.f7501a;
        }
    }

    public static void G(MainActivity mainActivity, androidx.activity.result.a aVar) {
        Bundle bundle;
        TextView textView;
        g.f(mainActivity, "this$0");
        g.f(aVar, "result");
        if (aVar.b() == -1) {
            Intent a10 = aVar.a();
            Object obj = null;
            if (a10 != null) {
                bundle = a10.getExtras();
            } else {
                bundle = null;
            }
            if (Build.VERSION.SDK_INT < 33) {
                if (bundle != null) {
                    obj = bundle.getSerializable("face");
                }
                obj = (GalleryModel) obj;
            } else if (bundle != null) {
                obj = (GalleryModel) bundle.getSerializable("face", GalleryModel.class);
            }
            boolean z = mainActivity.H;
            if (z && obj != null) {
                CircleImageView circleImageView = ((e) mainActivity.A()).M0;
                g.e(circleImageView, "binding().firstIV");
                mainActivity.runOnUiThread(new f(obj, circleImageView, mainActivity, 1));
                textView = ((e) mainActivity.A()).Y0;
            } else if (!z && obj != null) {
                CircleImageView circleImageView2 = ((e) mainActivity.A()).T0;
                g.e(circleImageView2, "binding().secondIV");
                mainActivity.runOnUiThread(new f(obj, circleImageView2, mainActivity, 1));
                textView = ((e) mainActivity.A()).Z0;
            } else {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public final int B() {
        return 3;
    }

    public final int C() {
        return R.layout.activity_main;
    }

    public final v1.e D() {
        return (p) new b0(this).a(p.class);
    }

    public final void E() {
        s<CurrentConfigModel> sVar;
        ((p) new b0(this).a(p.class)).f9121c = new WeakReference<>(this);
        T t10 = this.E;
        g.c(t10);
        ((e) t10).P0.L0.setOnClickListener(new d2.e(this));
        T t11 = this.E;
        g.c(t11);
        ((e) t11).P0.M0.setOnClickListener(new a2.b(this, 1));
        this.N.E(new Intent(this, CustomAdActivity.class));
        try {
            FaceMatchApp a10 = FaceMatchApp.u.a();
            if (a10 != null && (sVar = a10.f2220p) != null) {
                sVar.d(this, new d2.c(1));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void H(Boolean bool) {
        c cVar = this.M;
        if (cVar != null) {
            c.i iVar = cVar.f7898b;
            iVar.getClass();
            iVar.E.b(iVar, new p3.e(iVar, new p3.h(iVar)));
        }
        this.M = null;
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -0.0f);
        translateAnimation.setDuration(0);
        translateAnimation.setFillAfter(true);
        translateAnimation.setFillBefore(false);
        T t10 = this.E;
        g.c(t10);
        ((e) t10).V0.startAnimation(translateAnimation);
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.fadeout);
        g.e(loadAnimation, "loadAnimation(this@MainActivity, R.anim.fadeout)");
        loadAnimation.setDuration(0);
        loadAnimation.setFillAfter(true);
        loadAnimation.setFillBefore(false);
        T t11 = this.E;
        g.c(t11);
        ((e) t11).W0.startAnimation(loadAnimation);
        T t12 = this.E;
        g.c(t12);
        if (((e) t12).V0.getAnimation() != null) {
            T t13 = this.E;
            g.c(t13);
            ((e) t13).V0.getAnimation().cancel();
            T t14 = this.E;
            g.c(t14);
            ((e) t14).V0.getAnimation().reset();
        }
        T t15 = this.E;
        g.c(t15);
        if (((e) t15).W0.getAnimation() != null) {
            T t16 = this.E;
            g.c(t16);
            ((e) t16).W0.getAnimation().cancel();
            T t17 = this.E;
            g.c(t17);
            ((e) t17).W0.getAnimation().reset();
        }
        T t18 = this.E;
        g.c(t18);
        ((e) t18).V0.clearAnimation();
        T t19 = this.E;
        g.c(t19);
        ((e) t19).W0.clearAnimation();
        runOnUiThread(new d2.d(0, bool, this));
    }

    public final void I() {
        T t10 = this.E;
        g.c(t10);
        LottieAnimationView lottieAnimationView = ((e) t10).R0;
        lottieAnimationView.B = false;
        lottieAnimationView.A = false;
        lottieAnimationView.z = false;
        l lVar = lottieAnimationView.f2205v;
        lVar.f5152v.clear();
        lVar.f5148q.cancel();
        lottieAnimationView.d();
        T t11 = this.E;
        g.c(t11);
        ((e) t11).Q0.setVisibility(8);
    }

    public final void f() {
        T t10 = this.E;
        g.c(t10);
        View view = ((e) t10).P0.B0;
        g.e(view, "binding().includeActionMenu.root");
        h2.b.a(view, R.anim.selection_animation_out, new b(this));
        T t11 = this.E;
        g.c(t11);
        ((e) t11).U0.setVisibility(8);
    }

    public final void g(boolean z) {
        this.H = z;
        H(Boolean.valueOf(z));
        T t10 = this.E;
        g.c(t10);
        ((e) t10).U0.setVisibility(0);
        T t11 = this.E;
        g.c(t11);
        View view = ((e) t11).P0.B0;
        g.e(view, "binding().includeActionMenu.root");
        h2.b.a(view, R.anim.selection_animation_in, new k(this));
    }

    /* JADX WARNING: type inference failed for: r5v14, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m() {
        /*
            r7 = this;
            boolean r0 = r7.K
            if (r0 != 0) goto L_0x00b3
            android.view.LayoutInflater r0 = r7.getLayoutInflater()
            r1 = 2131558440(0x7f0d0028, float:1.8742196E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            T r1 = r7.E
            z8.g.c(r1)
            x1.e r1 = (x1.e) r1
            p3.c r3 = new p3.c
            p3.c$f r4 = new p3.c$f
            r5 = r7
        L_0x001c:
            boolean r6 = r5 instanceof android.content.ContextWrapper
            if (r6 == 0) goto L_0x002f
            boolean r6 = r5 instanceof android.app.Activity
            if (r6 == 0) goto L_0x0028
            r2 = r5
            android.app.Activity r2 = (android.app.Activity) r2
            goto L_0x002f
        L_0x0028:
            android.content.ContextWrapper r5 = (android.content.ContextWrapper) r5
            android.content.Context r5 = r5.getBaseContext()
            goto L_0x001c
        L_0x002f:
            r4.<init>(r2)
            android.widget.TextView r1 = r1.V0
            r3.<init>(r4, r1)
            p3.c$i r2 = r3.f7898b
            r4 = 0
            r2.setAutoHide(r4)
            r5 = 0
            r2.setDuration(r5)
            r5 = 1
            r2.setClickToHide(r5)
            r5 = 32
            r2.setCorner(r5)
            r5 = 8
            r2.setDistanceWithView(r5)
            r5 = 15
            r2.setArrowWidth(r5)
            r2.setArrowHeight(r5)
            r5 = 2131099720(0x7f060048, float:1.7811801E38)
            int r5 = r7.getColor(r5)
            r2.setColor(r5)
            r5 = 2131099718(0x7f060046, float:1.7811797E38)
            int r5 = r7.getColor(r5)
            r2.setShadowColor(r5)
            p3.c$b r5 = p3.c.b.CENTER
            r2.setAlign(r5)
            p3.c$g r5 = p3.c.g.BOTTOM
            r2.setPosition(r5)
            r2.setCustomView(r0)
            p3.c$c r0 = new p3.c$c
            r0.<init>()
            r2.setTooltipAnimation(r0)
            d2.a r0 = new d2.a
            r0.<init>(r7)
            r2.setListenerHide(r0)
            d2.b r0 = new d2.b
            r0.<init>(r4, r7)
            r2.setListenerDisplay(r0)
            r7.M = r3
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L_0x00b3
            boolean r2 = r0 instanceof android.app.Activity
            if (r2 == 0) goto L_0x00b3
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            p3.b r2 = new p3.b
            r2.<init>(r3, r0)
            r3 = 100
            r1.postDelayed(r2, r3)
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfab.facematchlive.ui.flow.main.MainActivity.m():void");
    }

    public final void p() {
        H((Boolean) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x012e A[EDGE_INSN: B:114:0x012e->B:80:0x012e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q() {
        /*
            r16 = this;
            r0 = r16
            java.lang.String r1 = r0.I
            r2 = 2131886247(0x7f1200a7, float:1.9407067E38)
            if (r1 == 0) goto L_0x01c4
            java.lang.String r1 = r0.J
            if (r1 == 0) goto L_0x01bc
            com.appfab.facematchlive.ui.flow.main.MainActivity$a r1 = r0.L
            r1.getClass()
            com.appfab.facematchlive.ui.flow.main.MainActivity r1 = r1.f2229a
            r1.getClass()
            com.appfab.facematchlive.FaceMatchApp$a r2 = com.appfab.facematchlive.FaceMatchApp.u
            com.appfab.facematchlive.FaceMatchApp r3 = r2.a()
            r5 = 1
            if (r3 == 0) goto L_0x002c
            java.util.concurrent.atomic.AtomicBoolean r3 = r3.f2224t
            if (r3 == 0) goto L_0x002c
            boolean r3 = r3.get()
            if (r3 != r5) goto L_0x002c
            r3 = r5
            goto L_0x002d
        L_0x002c:
            r3 = 0
        L_0x002d:
            com.appfab.facematchlive.FaceMatchApp r6 = r2.a()
            if (r6 == 0) goto L_0x0042
            com.appfab.facematchlive.data.model.RemoteConfigModel r6 = r6.f2219o
            if (r6 == 0) goto L_0x0042
            java.lang.Long r6 = r6.getMaxFreeSearchLimit()
            if (r6 == 0) goto L_0x0042
            long r6 = r6.longValue()
            goto L_0x0044
        L_0x0042:
            r6 = 3
        L_0x0044:
            com.appfab.facematchlive.FaceMatchApp r8 = r2.a()
            r9 = 0
            if (r8 == 0) goto L_0x005b
            com.appfab.facematchlive.data.model.RemoteConfigModel r8 = r8.f2219o
            if (r8 == 0) goto L_0x005b
            java.lang.Long r8 = r8.getMaxPremiumSearchLimit()
            if (r8 == 0) goto L_0x005b
            long r11 = r8.longValue()
            goto L_0x005c
        L_0x005b:
            r11 = r9
        L_0x005c:
            com.appfab.facematchlive.FaceMatchApp r8 = r2.a()
            r13 = 0
            if (r8 == 0) goto L_0x007e
            androidx.lifecycle.s<com.appfab.facematchlive.data.model.CurrentConfigModel> r8 = r8.f2220p
            if (r8 == 0) goto L_0x007e
            java.lang.Object r8 = r8.f1351e
            java.lang.Object r14 = androidx.lifecycle.LiveData.f1347k
            if (r8 == r14) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r8 = r13
        L_0x006f:
            com.appfab.facematchlive.data.model.CurrentConfigModel r8 = (com.appfab.facematchlive.data.model.CurrentConfigModel) r8
            if (r8 == 0) goto L_0x007e
            java.lang.Integer r8 = r8.getCurrentFreeSearchLimit()
            if (r8 == 0) goto L_0x007e
            int r8 = r8.intValue()
            goto L_0x007f
        L_0x007e:
            r8 = 0
        L_0x007f:
            com.appfab.facematchlive.FaceMatchApp r14 = r2.a()
            if (r14 == 0) goto L_0x00a0
            androidx.lifecycle.s<com.appfab.facematchlive.data.model.CurrentConfigModel> r14 = r14.f2220p
            if (r14 == 0) goto L_0x00a0
            java.lang.Object r14 = r14.f1351e
            java.lang.Object r15 = androidx.lifecycle.LiveData.f1347k
            if (r14 == r15) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r14 = r13
        L_0x0091:
            com.appfab.facematchlive.data.model.CurrentConfigModel r14 = (com.appfab.facematchlive.data.model.CurrentConfigModel) r14
            if (r14 == 0) goto L_0x00a0
            java.lang.Integer r14 = r14.getCurrentFreeSearchLimit()
            if (r14 == 0) goto L_0x00a0
            int r14 = r14.intValue()
            goto L_0x00a1
        L_0x00a0:
            r14 = 0
        L_0x00a1:
            if (r3 == 0) goto L_0x00ad
            long r4 = (long) r8
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x00ad
            int r8 = r8 + 1
        L_0x00aa:
            r4 = r8
            r5 = r14
            goto L_0x00c2
        L_0x00ad:
            if (r3 != 0) goto L_0x00b9
            int r4 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x00b9
            long r4 = (long) r14
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b9
            goto L_0x00bf
        L_0x00b9:
            if (r3 != 0) goto L_0x013a
            int r4 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x013a
        L_0x00bf:
            int r14 = r14 + 1
            goto L_0x00aa
        L_0x00c2:
            androidx.activity.b r3 = new androidx.activity.b
            r6 = 2
            r3.<init>(r6, r1)
            r1.runOnUiThread(r3)
            T r3 = r1.E
            z8.g.c(r3)
            x1.e r3 = (x1.e) r3
            com.airbnb.lottie.LottieAnimationView r3 = r3.R0
            r3.e()
            T r3 = r1.E
            z8.g.c(r3)
            x1.e r3 = (x1.e) r3
            androidx.constraintlayout.widget.ConstraintLayout r3 = r3.Q0
            r7 = 0
            r3.setVisibility(r7)
            androidx.lifecycle.o r7 = r1.f156r
            java.lang.String r3 = "lifecycle"
            z8.g.e(r7, r3)
        L_0x00eb:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r9 = r7.f1387a
            java.lang.Object r3 = r9.get()
            androidx.lifecycle.LifecycleCoroutineScopeImpl r3 = (androidx.lifecycle.LifecycleCoroutineScopeImpl) r3
            if (r3 == 0) goto L_0x00f6
            goto L_0x012e
        L_0x00f6:
            androidx.lifecycle.LifecycleCoroutineScopeImpl r10 = new androidx.lifecycle.LifecycleCoroutineScopeImpl
            g9.y0 r3 = new g9.y0
            r3.<init>(r13)
            g9.f0 r8 = g9.z.f5055a
            g9.s0 r8 = kotlinx.coroutines.internal.h.f6792a
            g9.s0 r8 = r8.y()
            q8.f r3 = r3.plus(r8)
            r10.<init>(r7, r3)
        L_0x010c:
            boolean r3 = r9.compareAndSet(r13, r10)
            if (r3 == 0) goto L_0x0114
            r3 = 1
            goto L_0x011b
        L_0x0114:
            java.lang.Object r3 = r9.get()
            if (r3 == 0) goto L_0x010c
            r3 = 0
        L_0x011b:
            if (r3 == 0) goto L_0x00eb
            g9.f0 r3 = g9.z.f5055a
            g9.s0 r3 = kotlinx.coroutines.internal.h.f6792a
            g9.s0 r3 = r3.y()
            androidx.lifecycle.j r7 = new androidx.lifecycle.j
            r7.<init>(r10, r13)
            p9.u.k(r10, r3, r7, r6)
            r3 = r10
        L_0x012e:
            d2.g r6 = new d2.g
            r6.<init>(r1, r13)
            r1 = 3
            p9.u.k(r3, r13, r6, r1)
            r8 = r4
            r14 = r5
            goto L_0x0187
        L_0x013a:
            if (r3 == 0) goto L_0x0174
            int r3 = z1.b.A0
            androidx.fragment.app.z r3 = r1.w()
            java.lang.String r4 = "supportFragmentManager"
            z8.g.e(r3, r4)
            d2.j r4 = new d2.j
            r4.<init>(r1)
            z1.b r1 = new z1.b
            r1.<init>()
            r5 = 0
            r1.f1214n0 = r5
            android.app.Dialog r6 = r1.f1219s0
            if (r6 == 0) goto L_0x015b
            r6.setCancelable(r5)
        L_0x015b:
            r1.f9791z0 = r4
            androidx.fragment.app.v<?> r4 = r1.G
            if (r4 == 0) goto L_0x0167
            boolean r4 = r1.f1244y
            if (r4 == 0) goto L_0x0167
            r4 = 1
            goto L_0x0168
        L_0x0167:
            r4 = 0
        L_0x0168:
            if (r4 != 0) goto L_0x0187
            java.lang.Class<z1.b> r4 = z1.b.class
            java.lang.String r4 = r4.getName()
            r1.a0(r3, r4)
            goto L_0x0187
        L_0x0174:
            r3 = 2131886195(0x7f120073, float:1.9406962E38)
            java.lang.String r3 = r1.getString(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r4 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r3, r4)
            r1.show()
        L_0x0187:
            com.appfab.facematchlive.FaceMatchApp r1 = r2.a()
            if (r1 == 0) goto L_0x019a
            androidx.lifecycle.s<com.appfab.facematchlive.data.model.CurrentConfigModel> r1 = r1.f2220p
            if (r1 == 0) goto L_0x019a
            java.lang.Object r1 = r1.f1351e
            java.lang.Object r3 = androidx.lifecycle.LiveData.f1347k
            if (r1 == r3) goto L_0x0198
            r13 = r1
        L_0x0198:
            com.appfab.facematchlive.data.model.CurrentConfigModel r13 = (com.appfab.facematchlive.data.model.CurrentConfigModel) r13
        L_0x019a:
            if (r13 != 0) goto L_0x019d
            goto L_0x01a4
        L_0x019d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r13.setCurrentPremiumSearchLimit(r1)
        L_0x01a4:
            if (r13 != 0) goto L_0x01a7
            goto L_0x01ae
        L_0x01a7:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r13.setCurrentFreeSearchLimit(r1)
        L_0x01ae:
            com.appfab.facematchlive.FaceMatchApp r1 = r2.a()
            if (r1 == 0) goto L_0x01d4
            androidx.lifecycle.s<com.appfab.facematchlive.data.model.CurrentConfigModel> r1 = r1.f2220p
            if (r1 == 0) goto L_0x01d4
            r1.j(r13)
            goto L_0x01d4
        L_0x01bc:
            java.lang.String r1 = r0.getString(r2)
            r2 = 2131886255(0x7f1200af, float:1.9407084E38)
            goto L_0x01cb
        L_0x01c4:
            java.lang.String r1 = r0.getString(r2)
            r2 = 2131886163(0x7f120053, float:1.9406897E38)
        L_0x01cb:
            java.lang.String r2 = r0.getString(r2)
            j2.b r3 = j2.b.ERROR
            r0.F(r1, r2, r3)
        L_0x01d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfab.facematchlive.ui.flow.main.MainActivity.q():void");
    }
}

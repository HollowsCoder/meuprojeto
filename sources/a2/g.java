package a2;

import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.c;
import androidx.recyclerview.widget.RecyclerView;
import com.appfab.facematchlive.ui.flow.custom_ad.CustomAdActivity;
import com.karumi.dexter.R;
import java.util.ArrayList;
import x1.o;

public final class g extends RecyclerView.f<a> {
    public final f d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<String> f59e = new ArrayList<>();

    public final class a extends RecyclerView.c0 {
        public final o u;

        public a(o oVar) {
            super(oVar.B0);
            this.u = oVar;
        }
    }

    public g(ArrayList arrayList, CustomAdActivity.a aVar) {
        z8.g.f(arrayList, "photoList");
        this.d = aVar;
        this.f59e = arrayList;
    }

    public final int a() {
        return this.f59e.size();
    }

    /* JADX WARNING: type inference failed for: r2v8, types: [android.app.Activity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(androidx.recyclerview.widget.RecyclerView.c0 r11, int r12) {
        /*
            r10 = this;
            a2.g$a r11 = (a2.g.a) r11
            x1.o r11 = r11.u
            android.widget.ImageView r0 = r11.M0
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L_0x019c
            com.bumptech.glide.b r1 = com.bumptech.glide.b.b(r1)
            f3.l r1 = r1.f2237t
            r1.getClass()
            boolean r2 = m3.j.g()
            r3 = 1
            if (r2 == 0) goto L_0x001d
            goto L_0x002d
        L_0x001d:
            android.content.Context r2 = r0.getContext()
            if (r2 == 0) goto L_0x0194
            android.content.Context r2 = r0.getContext()
            android.app.Activity r2 = f3.l.a(r2)
            if (r2 != 0) goto L_0x003b
        L_0x002d:
            android.content.Context r0 = r0.getContext()
            android.content.Context r0 = r0.getApplicationContext()
            com.bumptech.glide.m r0 = r1.f(r0)
            goto L_0x0162
        L_0x003b:
            boolean r4 = r2 instanceof androidx.fragment.app.q
            r5 = 0
            f3.g r6 = r1.f4619i
            r7 = 16908290(0x1020002, float:2.3877235E-38)
            if (r4 == 0) goto L_0x00f4
            androidx.fragment.app.q r2 = (androidx.fragment.app.q) r2
            n.b<android.view.View, androidx.fragment.app.n> r4 = r1.f4616f
            r4.clear()
            androidx.fragment.app.z r8 = r2.w()
            androidx.fragment.app.f0 r8 = r8.f1310c
            java.util.List r8 = r8.k()
            java.util.List r8 = (java.util.List) r8
            f3.l.c(r8, r4)
            android.view.View r7 = r2.findViewById(r7)
            r8 = r5
        L_0x0060:
            boolean r9 = r0.equals(r7)
            if (r9 != 0) goto L_0x007e
            java.lang.Object r8 = r4.getOrDefault(r0, r5)
            androidx.fragment.app.n r8 = (androidx.fragment.app.n) r8
            if (r8 == 0) goto L_0x006f
            goto L_0x007e
        L_0x006f:
            android.view.ViewParent r9 = r0.getParent()
            boolean r9 = r9 instanceof android.view.View
            if (r9 == 0) goto L_0x007e
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            goto L_0x0060
        L_0x007e:
            r4.clear()
            if (r8 == 0) goto L_0x00ee
            android.content.Context r0 = r8.k()
            if (r0 == 0) goto L_0x00e6
            boolean r0 = m3.j.g()
            if (r0 == 0) goto L_0x009d
            android.content.Context r0 = r8.k()
            android.content.Context r0 = r0.getApplicationContext()
            com.bumptech.glide.m r0 = r1.f(r0)
            goto L_0x0162
        L_0x009d:
            androidx.fragment.app.v<?> r0 = r8.G
            if (r0 != 0) goto L_0x00a2
            goto L_0x00a7
        L_0x00a2:
            android.app.Activity r2 = r0.f1299o
            r5 = r2
            androidx.fragment.app.q r5 = (androidx.fragment.app.q) r5
        L_0x00a7:
            if (r5 == 0) goto L_0x00b3
            if (r0 != 0) goto L_0x00ac
            goto L_0x00b0
        L_0x00ac:
            android.app.Activity r0 = r0.f1299o
            androidx.fragment.app.q r0 = (androidx.fragment.app.q) r0
        L_0x00b0:
            r6.g()
        L_0x00b3:
            androidx.fragment.app.y r0 = r8.j()
            android.content.Context r2 = r8.k()
            androidx.fragment.app.v<?> r4 = r8.G
            r5 = 0
            if (r4 == 0) goto L_0x00c6
            boolean r4 = r8.f1244y
            if (r4 == 0) goto L_0x00c6
            r4 = r3
            goto L_0x00c7
        L_0x00c6:
            r4 = r5
        L_0x00c7:
            if (r4 == 0) goto L_0x00e0
            boolean r4 = r8.M
            if (r4 != 0) goto L_0x00e0
            android.view.View r4 = r8.S
            if (r4 == 0) goto L_0x00e0
            android.os.IBinder r4 = r4.getWindowToken()
            if (r4 == 0) goto L_0x00e0
            android.view.View r4 = r8.S
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L_0x00e0
            r5 = r3
        L_0x00e0:
            com.bumptech.glide.m r0 = r1.j(r2, r0, r8, r5)
            goto L_0x0162
        L_0x00e6:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r12 = "You cannot start a load on a fragment before it is attached or after it is destroyed"
            r11.<init>(r12)
            throw r11
        L_0x00ee:
            com.bumptech.glide.m r0 = r1.g(r2)
            goto L_0x0162
        L_0x00f4:
            n.b<android.view.View, android.app.Fragment> r4 = r1.f4617g
            r4.clear()
            android.app.FragmentManager r8 = r2.getFragmentManager()
            r1.b(r8, r4)
            android.view.View r7 = r2.findViewById(r7)
            r8 = r5
        L_0x0105:
            boolean r9 = r0.equals(r7)
            if (r9 != 0) goto L_0x0123
            java.lang.Object r8 = r4.getOrDefault(r0, r5)
            android.app.Fragment r8 = (android.app.Fragment) r8
            if (r8 == 0) goto L_0x0114
            goto L_0x0123
        L_0x0114:
            android.view.ViewParent r9 = r0.getParent()
            boolean r9 = r9 instanceof android.view.View
            if (r9 == 0) goto L_0x0123
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            goto L_0x0105
        L_0x0123:
            r4.clear()
            if (r8 != 0) goto L_0x012d
            com.bumptech.glide.m r0 = r1.e(r2)
            goto L_0x0162
        L_0x012d:
            android.app.Activity r0 = r8.getActivity()
            if (r0 == 0) goto L_0x018c
            boolean r0 = m3.j.g()
            if (r0 != 0) goto L_0x0156
            android.app.Activity r0 = r8.getActivity()
            if (r0 == 0) goto L_0x0145
            r8.getActivity()
            r6.g()
        L_0x0145:
            android.app.FragmentManager r0 = r8.getChildFragmentManager()
            android.app.Activity r2 = r8.getActivity()
            boolean r4 = r8.isVisible()
            com.bumptech.glide.m r0 = r1.d(r2, r0, r8, r4)
            goto L_0x0162
        L_0x0156:
            android.app.Activity r0 = r8.getActivity()
            android.content.Context r0 = r0.getApplicationContext()
            com.bumptech.glide.m r0 = r1.f(r0)
        L_0x0162:
            java.util.ArrayList<java.lang.String> r1 = r10.f59e
            java.lang.Object r12 = r1.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            r0.getClass()
            com.bumptech.glide.l r1 = new com.bumptech.glide.l
            android.content.Context r2 = r0.f2292p
            java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
            com.bumptech.glide.b r5 = r0.f2291o
            r1.<init>(r5, r0, r4, r2)
            com.bumptech.glide.l r12 = r1.B(r12)
            android.widget.ImageView r0 = r11.M0
            r12.z(r0)
            z1.a r12 = new z1.a
            r12.<init>(r3, r10)
            androidx.constraintlayout.widget.ConstraintLayout r11 = r11.L0
            r11.setOnClickListener(r12)
            return
        L_0x018c:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "You cannot start a load on a fragment before it is attached"
            r11.<init>(r12)
            throw r11
        L_0x0194:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r12 = "Unable to obtain a request manager for a view without a Context"
            r11.<init>(r12)
            throw r11
        L_0x019c:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r12 = "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.g.d(androidx.recyclerview.widget.RecyclerView$c0, int):void");
    }

    public final RecyclerView.c0 e(RecyclerView recyclerView) {
        z8.g.f(recyclerView, "parent");
        ViewDataBinding c10 = c.c(LayoutInflater.from(recyclerView.getContext()), R.layout.item_custom_ad, recyclerView);
        z8.g.e(c10, "inflate(LayoutInflater.f…custom_ad, parent, false)");
        return new a((o) c10);
    }
}

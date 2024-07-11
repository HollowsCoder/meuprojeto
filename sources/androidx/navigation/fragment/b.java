package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.a;
import androidx.fragment.app.n;
import androidx.fragment.app.s;
import androidx.fragment.app.y;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.m;
import androidx.lifecycle.o;
import androidx.navigation.NavController;
import androidx.navigation.d;
import androidx.navigation.e;
import androidx.navigation.f;
import androidx.navigation.k;
import androidx.navigation.p;
import androidx.navigation.q;
import com.karumi.dexter.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class b extends n {

    /* renamed from: m0  reason: collision with root package name */
    public static final /* synthetic */ int f1476m0 = 0;

    /* renamed from: h0  reason: collision with root package name */
    public k f1477h0;

    /* renamed from: i0  reason: collision with root package name */
    public Boolean f1478i0 = null;

    /* renamed from: j0  reason: collision with root package name */
    public View f1479j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f1480k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f1481l0;

    public final void C(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.C(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1014p);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f1480k0 = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, s6.a.f8807v);
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.f1481l0 = true;
        }
        obtainStyledAttributes2.recycle();
    }

    public final void D(boolean z) {
        k kVar = this.f1477h0;
        if (kVar != null) {
            kVar.f1446o = z;
            kVar.h();
            return;
        }
        this.f1478i0 = Boolean.valueOf(z);
    }

    public final void F(Bundle bundle) {
        Bundle bundle2;
        k kVar = this.f1477h0;
        kVar.getClass();
        ArrayList arrayList = new ArrayList();
        Bundle bundle3 = new Bundle();
        for (Map.Entry next : kVar.f1443k.f1535a.entrySet()) {
            String str = (String) next.getKey();
            Bundle d = ((p) next.getValue()).d();
            if (d != null) {
                arrayList.add(str);
                bundle3.putBundle(str, d);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle2 = new Bundle();
            bundle3.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle2.putBundle("android-support-nav:controller:navigatorState", bundle3);
        } else {
            bundle2 = null;
        }
        ArrayDeque arrayDeque = kVar.f1440h;
        if (!arrayDeque.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[arrayDeque.size()];
            Iterator it = arrayDeque.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                parcelableArr[i10] = new e((d) it.next());
                i10++;
            }
            bundle2.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (kVar.f1439g) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android-support-nav:controller:deepLinkHandled", kVar.f1439g);
        }
        if (bundle2 != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", bundle2);
        }
        if (this.f1481l0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i11 = this.f1480k0;
        if (i11 != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i11);
        }
    }

    public final void I(View view) {
        if (view instanceof ViewGroup) {
            view.setTag(R.id.nav_controller_view_tag, this.f1477h0);
            if (view.getParent() != null) {
                View view2 = (View) view.getParent();
                this.f1479j0 = view2;
                if (view2.getId() == this.J) {
                    this.f1479j0.setTag(R.id.nav_controller_view_tag, this.f1477h0);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("created host view " + view + " is not a ViewGroup");
    }

    public final void u(Context context) {
        super.u(context);
        if (this.f1481l0) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(m());
            aVar.j(this);
            aVar.d();
        }
    }

    public final void v(n nVar) {
        q qVar = this.f1477h0.f1443k;
        qVar.getClass();
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) qVar.c(q.b(DialogFragmentNavigator.class));
        if (dialogFragmentNavigator.d.remove(nVar.L)) {
            nVar.f1230a0.a(dialogFragmentNavigator.f1472e);
        }
    }

    public final void w(Bundle bundle) {
        boolean z;
        Bundle bundle2;
        k kVar = new k(R());
        this.f1477h0 = kVar;
        if (this != kVar.f1441i) {
            kVar.f1441i = this;
            this.f1230a0.a(kVar.f1444m);
        }
        k kVar2 = this.f1477h0;
        androidx.fragment.app.q Q = Q();
        if (kVar2.f1441i != null) {
            NavController.a aVar = kVar2.f1445n;
            Iterator<androidx.activity.a> it = aVar.f187b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            Q.f159v.a(kVar2.f1441i, aVar);
            o r5 = kVar2.f1441i.r();
            m mVar = kVar2.f1444m;
            r5.b(mVar);
            kVar2.f1441i.r().a(mVar);
            k kVar3 = this.f1477h0;
            Boolean bool = this.f1478i0;
            int i10 = 0;
            if (bool == null || !bool.booleanValue()) {
                z = false;
            } else {
                z = true;
            }
            kVar3.f1446o = z;
            kVar3.h();
            Bundle bundle3 = null;
            this.f1478i0 = null;
            k kVar4 = this.f1477h0;
            c0 n10 = n();
            f fVar = kVar4.f1442j;
            f.a aVar2 = f.d;
            Class cls = f.class;
            if (fVar != ((f) new b0(n10, aVar2).a(cls))) {
                if (kVar4.f1440h.isEmpty()) {
                    kVar4.f1442j = (f) new b0(n10, aVar2).a(cls);
                } else {
                    throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                }
            }
            k kVar5 = this.f1477h0;
            kVar5.f1443k.a(new DialogFragmentNavigator(R(), j()));
            Context R = R();
            y j8 = j();
            int i11 = this.J;
            if (i11 == 0 || i11 == -1) {
                i11 = R.id.nav_host_fragment_container;
            }
            kVar5.f1443k.a(new a(R, j8, i11));
            if (bundle != null) {
                bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
                if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                    this.f1481l0 = true;
                    androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(m());
                    aVar3.j(this);
                    aVar3.d();
                }
                this.f1480k0 = bundle.getInt("android-support-nav:fragment:graphId");
            } else {
                bundle2 = null;
            }
            if (bundle2 != null) {
                k kVar6 = this.f1477h0;
                bundle2.setClassLoader(kVar6.f1434a.getClassLoader());
                kVar6.f1437e = bundle2.getBundle("android-support-nav:controller:navigatorState");
                kVar6.f1438f = bundle2.getParcelableArray("android-support-nav:controller:backStack");
                kVar6.f1439g = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled");
            }
            int i12 = this.f1480k0;
            if (i12 != 0) {
                this.f1477h0.g(i12, (Bundle) null);
            } else {
                Bundle bundle4 = this.f1241t;
                if (bundle4 != null) {
                    i10 = bundle4.getInt("android-support-nav:fragment:graphId");
                }
                if (bundle4 != null) {
                    bundle3 = bundle4.getBundle("android-support-nav:fragment:startDestinationArgs");
                }
                if (i10 != 0) {
                    this.f1477h0.g(i10, bundle3);
                }
            }
            super.w(bundle);
            return;
        }
        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
    }

    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        s sVar = new s(layoutInflater.getContext());
        int i10 = this.J;
        if (i10 == 0 || i10 == -1) {
            i10 = R.id.nav_host_fragment_container;
        }
        sVar.setId(i10);
        return sVar;
    }

    public final void z() {
        this.Q = true;
        View view = this.f1479j0;
        if (view != null && androidx.navigation.o.a(view) == this.f1477h0) {
            this.f1479j0.setTag(R.id.nav_controller_view_tag, (Object) null);
        }
        this.f1479j0 = null;
    }
}

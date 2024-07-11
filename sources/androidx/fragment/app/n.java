package androidx.fragment.app;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.o;
import androidx.lifecycle.s;
import androidx.lifecycle.z;
import com.karumi.dexter.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import n.j;
import w0.a;

public class n implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.n, d0, g, androidx.savedstate.c {

    /* renamed from: g0  reason: collision with root package name */
    public static final Object f1229g0 = new Object();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public y F;
    public v<?> G;
    public z H = new z();
    public n I;
    public int J;
    public int K;
    public String L;
    public boolean M;
    public boolean N;
    public boolean O;
    public final boolean P = true;
    public boolean Q;
    public ViewGroup R;
    public View S;
    public boolean T;
    public boolean U = true;
    public b V;
    public boolean W;
    public LayoutInflater X;
    public boolean Y;
    public h.c Z = h.c.RESUMED;

    /* renamed from: a0  reason: collision with root package name */
    public o f1230a0;

    /* renamed from: b0  reason: collision with root package name */
    public n0 f1231b0;

    /* renamed from: c0  reason: collision with root package name */
    public final s<androidx.lifecycle.n> f1232c0 = new s<>();

    /* renamed from: d0  reason: collision with root package name */
    public z f1233d0;

    /* renamed from: e0  reason: collision with root package name */
    public androidx.savedstate.b f1234e0;

    /* renamed from: f0  reason: collision with root package name */
    public final ArrayList<d> f1235f0;

    /* renamed from: o  reason: collision with root package name */
    public int f1236o = -1;

    /* renamed from: p  reason: collision with root package name */
    public Bundle f1237p;

    /* renamed from: q  reason: collision with root package name */
    public SparseArray<Parcelable> f1238q;

    /* renamed from: r  reason: collision with root package name */
    public Bundle f1239r;

    /* renamed from: s  reason: collision with root package name */
    public String f1240s = UUID.randomUUID().toString();

    /* renamed from: t  reason: collision with root package name */
    public Bundle f1241t;
    public n u;

    /* renamed from: v  reason: collision with root package name */
    public String f1242v = null;
    public int w;

    /* renamed from: x  reason: collision with root package name */
    public Boolean f1243x = null;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1244y;
    public boolean z;

    public class a extends androidx.activity.result.c {
        public a() {
        }

        public final View o(int i10) {
            n nVar = n.this;
            View view = nVar.S;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + nVar + " does not have a view");
        }

        public final boolean s() {
            return n.this.S != null;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1246a;

        /* renamed from: b  reason: collision with root package name */
        public int f1247b;

        /* renamed from: c  reason: collision with root package name */
        public int f1248c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f1249e;

        /* renamed from: f  reason: collision with root package name */
        public int f1250f;

        /* renamed from: g  reason: collision with root package name */
        public ArrayList<String> f1251g;

        /* renamed from: h  reason: collision with root package name */
        public ArrayList<String> f1252h;

        /* renamed from: i  reason: collision with root package name */
        public final Object f1253i;

        /* renamed from: j  reason: collision with root package name */
        public final Object f1254j;

        /* renamed from: k  reason: collision with root package name */
        public final Object f1255k;
        public float l = 1.0f;

        /* renamed from: m  reason: collision with root package name */
        public View f1256m = null;

        public b() {
            Object obj = n.f1229g0;
            this.f1253i = obj;
            this.f1254j = obj;
            this.f1255k = obj;
        }
    }

    public static class c extends RuntimeException {
        public c(String str, Exception exc) {
            super(str, exc);
        }
    }

    public static abstract class d {
        public abstract void a();
    }

    public n() {
        new AtomicInteger();
        this.f1235f0 = new ArrayList<>();
        this.f1230a0 = new o(this);
        this.f1234e0 = new androidx.savedstate.b(this);
        this.f1233d0 = null;
    }

    public void A() {
        this.Q = true;
    }

    public LayoutInflater B(Bundle bundle) {
        v<?> vVar = this.G;
        if (vVar != null) {
            LayoutInflater F2 = vVar.F();
            F2.setFactory2(this.H.f1312f);
            return F2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void C(Context context, AttributeSet attributeSet, Bundle bundle) {
        Activity activity;
        this.Q = true;
        v<?> vVar = this.G;
        if (vVar == null) {
            activity = null;
        } else {
            activity = vVar.f1299o;
        }
        if (activity != null) {
            this.Q = true;
        }
    }

    public void D(boolean z10) {
    }

    public void E() {
        this.Q = true;
    }

    public void F(Bundle bundle) {
    }

    public void G() {
        this.Q = true;
    }

    public void H() {
        this.Q = true;
    }

    public void I(View view) {
    }

    public void J(Bundle bundle) {
        this.Q = true;
    }

    public void K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.H.O();
        boolean z10 = true;
        this.D = true;
        this.f1231b0 = new n0(this, n());
        View x10 = x(layoutInflater, viewGroup, bundle);
        this.S = x10;
        if (x10 != null) {
            this.f1231b0.e();
            this.S.setTag(R.id.view_tree_lifecycle_owner, this.f1231b0);
            this.S.setTag(R.id.view_tree_view_model_store_owner, this.f1231b0);
            this.S.setTag(R.id.view_tree_saved_state_registry_owner, this.f1231b0);
            this.f1232c0.i(this.f1231b0);
            return;
        }
        if (this.f1231b0.f1260r == null) {
            z10 = false;
        }
        if (!z10) {
            this.f1231b0 = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public final void L() {
        this.H.t(1);
        if (this.S != null) {
            n0 n0Var = this.f1231b0;
            n0Var.e();
            if (n0Var.f1260r.f1394c.isAtLeast(h.c.CREATED)) {
                this.f1231b0.a(h.b.ON_DESTROY);
            }
        }
        this.f1236o = 1;
        this.Q = false;
        z();
        if (this.Q) {
            j<a.C0144a> jVar = ((a.b) new b0(n(), a.b.d).a(a.b.class)).f9152c;
            int j8 = jVar.j();
            for (int i10 = 0; i10 < j8; i10++) {
                jVar.k(i10).getClass();
            }
            this.D = false;
            return;
        }
        throw new r0("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public final void M() {
        onLowMemory();
        this.H.m();
    }

    public final void N(boolean z10) {
        this.H.n(z10);
    }

    public final void O(boolean z10) {
        this.H.r(z10);
    }

    public final boolean P() {
        if (!this.M) {
            return false | this.H.s();
        }
        return false;
    }

    public final q Q() {
        q qVar;
        v<?> vVar = this.G;
        if (vVar == null) {
            qVar = null;
        } else {
            qVar = (q) vVar.f1299o;
        }
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Context R() {
        Context k10 = k();
        if (k10 != null) {
            return k10;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View S() {
        View view = this.S;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void T(int i10, int i11, int i12, int i13) {
        if (this.V != null || i10 != 0 || i11 != 0 || i12 != 0 || i13 != 0) {
            h().f1247b = i10;
            h().f1248c = i11;
            h().d = i12;
            h().f1249e = i13;
        }
    }

    public final void U(Bundle bundle) {
        boolean z10;
        y yVar = this.F;
        if (yVar != null) {
            if (yVar == null) {
                z10 = false;
            } else {
                z10 = yVar.M();
            }
            if (z10) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f1241t = bundle;
    }

    public final androidx.savedstate.a c() {
        return this.f1234e0.f1884b;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public androidx.activity.result.c f() {
        return new a();
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.J));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.K));
        printWriter.print(" mTag=");
        printWriter.println(this.L);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f1236o);
        printWriter.print(" mWho=");
        printWriter.print(this.f1240s);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.E);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f1244y);
        printWriter.print(" mRemoving=");
        printWriter.print(this.z);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.A);
        printWriter.print(" mInLayout=");
        printWriter.println(this.B);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.M);
        printWriter.print(" mDetached=");
        printWriter.print(this.N);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.P);
        printWriter.print(" mHasMenu=");
        int i17 = 0;
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.O);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.U);
        if (this.F != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.F);
        }
        if (this.G != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.G);
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.I);
        }
        if (this.f1241t != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f1241t);
        }
        if (this.f1237p != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f1237p);
        }
        if (this.f1238q != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f1238q);
        }
        if (this.f1239r != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f1239r);
        }
        n nVar = this.u;
        if (nVar == null) {
            y yVar = this.F;
            if (yVar == null || (str2 = this.f1242v) == null) {
                nVar = null;
            } else {
                nVar = yVar.B(str2);
            }
        }
        if (nVar != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(nVar);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.w);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        b bVar = this.V;
        if (bVar == null) {
            z10 = false;
        } else {
            z10 = bVar.f1246a;
        }
        printWriter.println(z10);
        b bVar2 = this.V;
        if (bVar2 == null) {
            i10 = 0;
        } else {
            i10 = bVar2.f1247b;
        }
        if (i10 != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            b bVar3 = this.V;
            if (bVar3 == null) {
                i16 = 0;
            } else {
                i16 = bVar3.f1247b;
            }
            printWriter.println(i16);
        }
        b bVar4 = this.V;
        if (bVar4 == null) {
            i11 = 0;
        } else {
            i11 = bVar4.f1248c;
        }
        if (i11 != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            b bVar5 = this.V;
            if (bVar5 == null) {
                i15 = 0;
            } else {
                i15 = bVar5.f1248c;
            }
            printWriter.println(i15);
        }
        b bVar6 = this.V;
        if (bVar6 == null) {
            i12 = 0;
        } else {
            i12 = bVar6.d;
        }
        if (i12 != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            b bVar7 = this.V;
            if (bVar7 == null) {
                i14 = 0;
            } else {
                i14 = bVar7.d;
            }
            printWriter.println(i14);
        }
        b bVar8 = this.V;
        if (bVar8 == null) {
            i13 = 0;
        } else {
            i13 = bVar8.f1249e;
        }
        if (i13 != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            b bVar9 = this.V;
            if (bVar9 != null) {
                i17 = bVar9.f1249e;
            }
            printWriter.println(i17);
        }
        if (this.R != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.R);
        }
        if (this.S != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.S);
        }
        b bVar10 = this.V;
        if (bVar10 != null) {
            bVar10.getClass();
        }
        if (k() != null) {
            new w0.a(this, n()).E(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.H + ":");
        this.H.u(b0.d.e(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final b h() {
        if (this.V == null) {
            this.V = new b();
        }
        return this.V;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final b0.b i() {
        Application application;
        if (this.F != null) {
            if (this.f1233d0 == null) {
                Context applicationContext = R().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        application = null;
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && y.I(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + R().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.f1233d0 = new z(application, this, this.f1241t);
            }
            return this.f1233d0;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final y j() {
        if (this.G != null) {
            return this.H;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context k() {
        v<?> vVar = this.G;
        if (vVar == null) {
            return null;
        }
        return vVar.f1300p;
    }

    public final int l() {
        h.c cVar = this.Z;
        return (cVar == h.c.INITIALIZED || this.I == null) ? cVar.ordinal() : Math.min(cVar.ordinal(), this.I.l());
    }

    public final y m() {
        y yVar = this.F;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final c0 n() {
        if (this.F == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (l() != h.c.INITIALIZED.ordinal()) {
            HashMap<String, c0> hashMap = this.F.F.f1116e;
            c0 c0Var = hashMap.get(this.f1240s);
            if (c0Var != null) {
                return c0Var;
            }
            c0 c0Var2 = new c0();
            hashMap.put(this.f1240s, c0Var2);
            return c0Var2;
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public final Object o() {
        Object obj;
        b bVar = this.V;
        if (bVar == null || (obj = bVar.f1254j) == f1229g0) {
            return null;
        }
        return obj;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.Q = true;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Q().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public final void onLowMemory() {
        this.Q = true;
    }

    public final Object p() {
        Object obj;
        b bVar = this.V;
        if (bVar == null || (obj = bVar.f1253i) == f1229g0) {
            return null;
        }
        return obj;
    }

    public final Object q() {
        Object obj;
        b bVar = this.V;
        if (bVar == null || (obj = bVar.f1255k) == f1229g0) {
            return null;
        }
        return obj;
    }

    public final o r() {
        return this.f1230a0;
    }

    public final String s(int i10) {
        return R().getResources().getString(i10);
    }

    @Deprecated
    public void t(int i10, int i11, Intent intent) {
        if (y.I(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f1240s);
        if (this.J != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.J));
        }
        if (this.L != null) {
            sb.append(" tag=");
            sb.append(this.L);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u(Context context) {
        Activity activity;
        this.Q = true;
        v<?> vVar = this.G;
        if (vVar == null) {
            activity = null;
        } else {
            activity = vVar.f1299o;
        }
        if (activity != null) {
            this.Q = true;
        }
    }

    @Deprecated
    public void v(n nVar) {
    }

    public void w(Bundle bundle) {
        boolean z10;
        Parcelable parcelable;
        this.Q = true;
        if (!(bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null)) {
            this.H.T(parcelable);
            z zVar = this.H;
            zVar.f1328y = false;
            zVar.z = false;
            zVar.F.f1119h = false;
            zVar.t(1);
        }
        z zVar2 = this.H;
        if (zVar2.f1318m >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            zVar2.f1328y = false;
            zVar2.z = false;
            zVar2.F.f1119h = false;
            zVar2.t(1);
        }
    }

    public View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void y() {
        this.Q = true;
    }

    public void z() {
        this.Q = true;
    }
}

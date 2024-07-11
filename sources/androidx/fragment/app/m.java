package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.g0;
import androidx.fragment.app.n;
import androidx.fragment.app.y;
import androidx.lifecycle.n;
import androidx.lifecycle.t;
import com.karumi.dexter.R;

public class m extends n implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: h0  reason: collision with root package name */
    public Handler f1208h0;

    /* renamed from: i0  reason: collision with root package name */
    public final a f1209i0 = new a();

    /* renamed from: j0  reason: collision with root package name */
    public final b f1210j0 = new b();

    /* renamed from: k0  reason: collision with root package name */
    public final c f1211k0 = new c();

    /* renamed from: l0  reason: collision with root package name */
    public int f1212l0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public int f1213m0 = 0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f1214n0 = true;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f1215o0 = true;

    /* renamed from: p0  reason: collision with root package name */
    public int f1216p0 = -1;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f1217q0;

    /* renamed from: r0  reason: collision with root package name */
    public final d f1218r0 = new d();

    /* renamed from: s0  reason: collision with root package name */
    public Dialog f1219s0;
    public boolean t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f1220u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f1221v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f1222w0 = false;

    public class a implements Runnable {
        public a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void run() {
            m mVar = m.this;
            mVar.f1211k0.onDismiss(mVar.f1219s0);
        }
    }

    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void onCancel(DialogInterface dialogInterface) {
            m mVar = m.this;
            Dialog dialog = mVar.f1219s0;
            if (dialog != null) {
                mVar.onCancel(dialog);
            }
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void onDismiss(DialogInterface dialogInterface) {
            m mVar = m.this;
            Dialog dialog = mVar.f1219s0;
            if (dialog != null) {
                mVar.onDismiss(dialog);
            }
        }
    }

    public class d implements t<n> {
        public d() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void e(Object obj) {
            if (((n) obj) != null) {
                m mVar = m.this;
                if (mVar.f1215o0) {
                    View S = mVar.S();
                    if (S.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    } else if (mVar.f1219s0 != null) {
                        if (y.I(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + mVar.f1219s0);
                        }
                        mVar.f1219s0.setContentView(S);
                    }
                }
            }
        }
    }

    public class e extends androidx.activity.result.c {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ androidx.activity.result.c f1227o;

        public e(n.a aVar) {
            this.f1227o = aVar;
        }

        public final View o(int i10) {
            androidx.activity.result.c cVar = this.f1227o;
            if (cVar.s()) {
                return cVar.o(i10);
            }
            Dialog dialog = m.this.f1219s0;
            if (dialog != null) {
                return dialog.findViewById(i10);
            }
            return null;
        }

        public final boolean s() {
            if (this.f1227o.s() || m.this.f1222w0) {
                return true;
            }
            return false;
        }
    }

    public final void A() {
        this.Q = true;
        if (!this.f1221v0 && !this.f1220u0) {
            this.f1220u0 = true;
        }
        this.f1232c0.h(this.f1218r0);
    }

    /* JADX INFO: finally extract failed */
    public final LayoutInflater B(Bundle bundle) {
        StringBuilder sb;
        LayoutInflater B = super.B(bundle);
        boolean z = this.f1215o0;
        if (!z || this.f1217q0) {
            if (y.I(2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (!this.f1215o0) {
                    sb = new StringBuilder("mShowsDialog = false: ");
                } else {
                    sb = new StringBuilder("mCreatingDialog = true: ");
                }
                sb.append(str);
                Log.d("FragmentManager", sb.toString());
            }
            return B;
        }
        if (z && !this.f1222w0) {
            try {
                this.f1217q0 = true;
                Dialog X = X(bundle);
                this.f1219s0 = X;
                if (this.f1215o0) {
                    Z(X, this.f1212l0);
                    Context k10 = k();
                    if (k10 instanceof Activity) {
                        this.f1219s0.setOwnerActivity((Activity) k10);
                    }
                    this.f1219s0.setCancelable(this.f1214n0);
                    this.f1219s0.setOnCancelListener(this.f1210j0);
                    this.f1219s0.setOnDismissListener(this.f1211k0);
                    this.f1222w0 = true;
                } else {
                    this.f1219s0 = null;
                }
                this.f1217q0 = false;
            } catch (Throwable th) {
                this.f1217q0 = false;
                throw th;
            }
        }
        if (y.I(2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f1219s0;
        if (dialog != null) {
            return B.cloneInContext(dialog.getContext());
        }
        return B;
    }

    public void F(Bundle bundle) {
        Dialog dialog = this.f1219s0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.f1212l0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f1213m0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z = this.f1214n0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z10 = this.f1215o0;
        if (!z10) {
            bundle.putBoolean("android:showsDialog", z10);
        }
        int i12 = this.f1216p0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    public void G() {
        this.Q = true;
        Dialog dialog = this.f1219s0;
        if (dialog != null) {
            this.t0 = false;
            dialog.show();
            View decorView = this.f1219s0.getWindow().getDecorView();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    public void H() {
        this.Q = true;
        Dialog dialog = this.f1219s0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final void J(Bundle bundle) {
        Bundle bundle2;
        this.Q = true;
        if (this.f1219s0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f1219s0.onRestoreInstanceState(bundle2);
        }
    }

    public final void K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.K(layoutInflater, viewGroup, bundle);
        if (this.S == null && this.f1219s0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f1219s0.onRestoreInstanceState(bundle2);
        }
    }

    public void V() {
        W(false, false);
    }

    public final void W(boolean z, boolean z10) {
        if (!this.f1220u0) {
            this.f1220u0 = true;
            this.f1221v0 = false;
            Dialog dialog = this.f1219s0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f1219s0.dismiss();
                if (!z10) {
                    if (Looper.myLooper() == this.f1208h0.getLooper()) {
                        onDismiss(this.f1219s0);
                    } else {
                        this.f1208h0.post(this.f1209i0);
                    }
                }
            }
            this.t0 = true;
            if (this.f1216p0 >= 0) {
                y m10 = m();
                int i10 = this.f1216p0;
                if (i10 >= 0) {
                    m10.v(new y.m((String) null, i10), false);
                    this.f1216p0 = -1;
                    return;
                }
                throw new IllegalArgumentException(b0.d.c("Bad id: ", i10));
            }
            a aVar = new a(m());
            y yVar = this.F;
            if (yVar == null || yVar == aVar.f1095q) {
                aVar.b(new g0.a(3, this));
                if (z) {
                    aVar.e(true);
                } else {
                    aVar.d();
                }
            } else {
                throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
            }
        }
    }

    public Dialog X(Bundle bundle) {
        if (y.I(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(R(), this.f1213m0);
    }

    public final Dialog Y() {
        Dialog dialog = this.f1219s0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void Z(Dialog dialog, int i10) {
        if (!(i10 == 1 || i10 == 2)) {
            if (i10 == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void a0(y yVar, String str) {
        this.f1220u0 = false;
        this.f1221v0 = true;
        yVar.getClass();
        a aVar = new a(yVar);
        aVar.f(0, this, str, 1);
        aVar.d();
    }

    public final androidx.activity.result.c f() {
        return new e(new n.a());
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.t0) {
            if (y.I(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            W(true, true);
        }
    }

    public final void u(Context context) {
        super.u(context);
        this.f1232c0.e(this.f1218r0);
        if (!this.f1221v0) {
            this.f1220u0 = false;
        }
    }

    public void w(Bundle bundle) {
        super.w(bundle);
        this.f1208h0 = new Handler();
        this.f1215o0 = this.K == 0;
        if (bundle != null) {
            this.f1212l0 = bundle.getInt("android:style", 0);
            this.f1213m0 = bundle.getInt("android:theme", 0);
            this.f1214n0 = bundle.getBoolean("android:cancelable", true);
            this.f1215o0 = bundle.getBoolean("android:showsDialog", this.f1215o0);
            this.f1216p0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public final void z() {
        this.Q = true;
        Dialog dialog = this.f1219s0;
        if (dialog != null) {
            this.t0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f1219s0.dismiss();
            if (!this.f1220u0) {
                onDismiss(this.f1219s0);
            }
            this.f1219s0 = null;
            this.f1222w0 = false;
        }
    }
}

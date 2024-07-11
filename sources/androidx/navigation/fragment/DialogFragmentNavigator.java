package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.m;
import androidx.fragment.app.u;
import androidx.fragment.app.y;
import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import androidx.navigation.NavController;
import androidx.navigation.b;
import androidx.navigation.o;
import androidx.navigation.p;
import b0.d;
import java.util.HashSet;

@p.a("dialog")
public final class DialogFragmentNavigator extends p<a> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1469a;

    /* renamed from: b  reason: collision with root package name */
    public final y f1470b;

    /* renamed from: c  reason: collision with root package name */
    public int f1471c = 0;
    public final HashSet<String> d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    public final l f1472e = new l() {
        public final void f(n nVar, h.b bVar) {
            NavController a10;
            if (bVar == h.b.ON_STOP) {
                m mVar = (m) nVar;
                if (!mVar.Y().isShowing()) {
                    int i10 = b.f1476m0;
                    androidx.fragment.app.n nVar2 = mVar;
                    while (true) {
                        if (nVar2 == null) {
                            View view = mVar.S;
                            if (view != null) {
                                a10 = o.a(view);
                            } else {
                                Dialog dialog = mVar.f1219s0;
                                if (dialog == null || dialog.getWindow() == null) {
                                    throw new IllegalStateException("Fragment " + mVar + " does not have a NavController set");
                                }
                                a10 = o.a(dialog.getWindow().getDecorView());
                            }
                        } else if (nVar2 instanceof b) {
                            a10 = ((b) nVar2).f1477h0;
                            if (a10 == null) {
                                throw new IllegalStateException("NavController is not available before onCreate()");
                            }
                        } else {
                            androidx.fragment.app.n nVar3 = nVar2.m().f1322q;
                            if (nVar3 instanceof b) {
                                a10 = ((b) nVar3).f1477h0;
                                if (a10 == null) {
                                    throw new IllegalStateException("NavController is not available before onCreate()");
                                }
                            } else {
                                nVar2 = nVar2.I;
                            }
                        }
                    }
                    a10.e();
                }
            }
        }
    };

    public static class a extends androidx.navigation.h implements b {
        public String w;

        public a(p<? extends a> pVar) {
            super(pVar);
        }

        public final void k(Context context, AttributeSet attributeSet) {
            super.k(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, s6.a.f8806t);
            String string = obtainAttributes.getString(0);
            if (string != null) {
                this.w = string;
            }
            obtainAttributes.recycle();
        }
    }

    public DialogFragmentNavigator(Context context, y yVar) {
        this.f1469a = context;
        this.f1470b = yVar;
    }

    public final androidx.navigation.h a() {
        return new a(this);
    }

    public final androidx.navigation.h b(androidx.navigation.h hVar, Bundle bundle, androidx.navigation.m mVar) {
        a aVar = (a) hVar;
        y yVar = this.f1470b;
        if (yVar.M()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return null;
        }
        String str = aVar.w;
        if (str != null) {
            char charAt = str.charAt(0);
            Context context = this.f1469a;
            if (charAt == '.') {
                str = context.getPackageName() + str;
            }
            u F = yVar.F();
            context.getClassLoader();
            androidx.fragment.app.n a10 = F.a(str);
            if (m.class.isAssignableFrom(a10.getClass())) {
                m mVar2 = (m) a10;
                mVar2.U(bundle);
                mVar2.f1230a0.a(this.f1472e);
                StringBuilder sb = new StringBuilder("androidx-nav-fragment:navigator:dialog:");
                int i10 = this.f1471c;
                this.f1471c = i10 + 1;
                sb.append(i10);
                mVar2.a0(yVar, sb.toString());
                return aVar;
            }
            StringBuilder sb2 = new StringBuilder("Dialog destination ");
            String str2 = aVar.w;
            if (str2 != null) {
                throw new IllegalArgumentException(d.g(sb2, str2, " is not an instance of DialogFragment"));
            }
            throw new IllegalStateException("DialogFragment class was not set");
        }
        throw new IllegalStateException("DialogFragment class was not set");
    }

    public final void c(Bundle bundle) {
        this.f1471c = bundle.getInt("androidx-nav-dialogfragment:navigator:count", 0);
        for (int i10 = 0; i10 < this.f1471c; i10++) {
            m mVar = (m) this.f1470b.D(d.c("androidx-nav-fragment:navigator:dialog:", i10));
            if (mVar != null) {
                mVar.f1230a0.a(this.f1472e);
            } else {
                HashSet<String> hashSet = this.d;
                hashSet.add("androidx-nav-fragment:navigator:dialog:" + i10);
            }
        }
    }

    public final Bundle d() {
        if (this.f1471c == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("androidx-nav-dialogfragment:navigator:count", this.f1471c);
        return bundle;
    }

    public final boolean e() {
        if (this.f1471c == 0) {
            return false;
        }
        y yVar = this.f1470b;
        if (yVar.M()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        StringBuilder sb = new StringBuilder("androidx-nav-fragment:navigator:dialog:");
        int i10 = this.f1471c - 1;
        this.f1471c = i10;
        sb.append(i10);
        androidx.fragment.app.n D = yVar.D(sb.toString());
        if (D != null) {
            D.f1230a0.b(this.f1472e);
            ((m) D).V();
        }
        return true;
    }
}

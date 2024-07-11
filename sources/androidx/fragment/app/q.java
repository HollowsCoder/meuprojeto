package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.h;
import androidx.activity.result.f;
import androidx.activity.result.g;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import androidx.lifecycle.h;
import androidx.lifecycle.o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import x.a;

public class q extends ComponentActivity implements a.C0157a {
    public boolean A;
    public boolean B;
    public boolean C = true;

    /* renamed from: y  reason: collision with root package name */
    public final t f1284y = new t(new a());
    public final o z = new o(this);

    public class a extends v<q> implements d0, h, g, c0 {
        public a() {
            super(q.this);
        }

        public final q E() {
            return q.this;
        }

        public final LayoutInflater F() {
            q qVar = q.this;
            return qVar.getLayoutInflater().cloneInContext(qVar);
        }

        public final void G() {
            q.this.y();
        }

        public final OnBackPressedDispatcher b() {
            return q.this.f159v;
        }

        public final void g(n nVar) {
            q.this.getClass();
        }

        public final f l() {
            return q.this.f160x;
        }

        public final c0 n() {
            return q.this.n();
        }

        public final View o(int i10) {
            return q.this.findViewById(i10);
        }

        public final o r() {
            return q.this.z;
        }

        public final boolean s() {
            Window window = q.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }
    }

    public q() {
        this.f157s.f1884b.b("android:support:fragments", new o(this));
        t(new p(this));
    }

    public static boolean x(y yVar, h.c cVar) {
        q qVar;
        boolean z10 = false;
        for (n nVar : yVar.f1310c.k()) {
            if (nVar != null) {
                v<?> vVar = nVar.G;
                if (vVar == null) {
                    qVar = null;
                } else {
                    qVar = vVar.E();
                }
                if (qVar != null) {
                    z10 |= x(nVar.j(), cVar);
                }
                n0 n0Var = nVar.f1231b0;
                if (n0Var != null) {
                    n0Var.e();
                    if (n0Var.f1260r.f1394c.isAtLeast(h.c.STARTED)) {
                        nVar.f1231b0.f1260r.g(cVar);
                        z10 = true;
                    }
                }
                if (nVar.f1230a0.f1394c.isAtLeast(h.c.STARTED)) {
                    nVar.f1230a0.g(cVar);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.A);
        printWriter.print(" mResumed=");
        printWriter.print(this.B);
        printWriter.print(" mStopped=");
        printWriter.print(this.C);
        if (getApplication() != null) {
            new w0.a(this, n()).E(str2, printWriter);
        }
        this.f1284y.f1297a.f1302r.u(str, fileDescriptor, printWriter, strArr);
    }

    @Deprecated
    public final void h() {
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
        this.f1284y.a();
        super.onActivityResult(i10, i11, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        t tVar = this.f1284y;
        tVar.a();
        super.onConfigurationChanged(configuration);
        tVar.f1297a.f1302r.i(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.z.e(h.b.ON_CREATE);
        z zVar = this.f1284y.f1297a.f1302r;
        zVar.f1328y = false;
        zVar.z = false;
        zVar.F.f1119h = false;
        zVar.t(1);
    }

    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0) {
            return super.onCreatePanelMenu(i10, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i10, menu);
        getMenuInflater();
        return onCreatePanelMenu | this.f1284y.f1297a.f1302r.k();
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f1284y.f1297a.f1302r.f1312f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f1284y.f1297a.f1302r.l();
        this.z.e(h.b.ON_DESTROY);
    }

    public final void onLowMemory() {
        super.onLowMemory();
        this.f1284y.f1297a.f1302r.m();
    }

    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        t tVar = this.f1284y;
        if (i10 == 0) {
            return tVar.f1297a.f1302r.o();
        }
        if (i10 != 6) {
            return false;
        }
        return tVar.f1297a.f1302r.j();
    }

    public final void onMultiWindowModeChanged(boolean z10) {
        this.f1284y.f1297a.f1302r.n(z10);
    }

    public final void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.f1284y.a();
        super.onNewIntent(intent);
    }

    public void onPanelClosed(int i10, Menu menu) {
        if (i10 == 0) {
            this.f1284y.f1297a.f1302r.p();
        }
        super.onPanelClosed(i10, menu);
    }

    public void onPause() {
        super.onPause();
        this.B = false;
        this.f1284y.f1297a.f1302r.t(5);
        this.z.e(h.b.ON_PAUSE);
    }

    public final void onPictureInPictureModeChanged(boolean z10) {
        this.f1284y.f1297a.f1302r.r(z10);
    }

    public void onPostResume() {
        super.onPostResume();
        this.z.e(h.b.ON_RESUME);
        z zVar = this.f1284y.f1297a.f1302r;
        zVar.f1328y = false;
        zVar.z = false;
        zVar.F.f1119h = false;
        zVar.t(7);
    }

    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 == 0) {
            return super.onPreparePanel(0, view, menu) | this.f1284y.f1297a.f1302r.s();
        }
        return super.onPreparePanel(i10, view, menu);
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f1284y.a();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    public void onResume() {
        t tVar = this.f1284y;
        tVar.a();
        super.onResume();
        this.B = true;
        tVar.f1297a.f1302r.x(true);
    }

    public void onStart() {
        t tVar = this.f1284y;
        tVar.a();
        super.onStart();
        this.C = false;
        boolean z10 = this.A;
        v<?> vVar = tVar.f1297a;
        if (!z10) {
            this.A = true;
            z zVar = vVar.f1302r;
            zVar.f1328y = false;
            zVar.z = false;
            zVar.F.f1119h = false;
            zVar.t(4);
        }
        vVar.f1302r.x(true);
        this.z.e(h.b.ON_START);
        z zVar2 = vVar.f1302r;
        zVar2.f1328y = false;
        zVar2.z = false;
        zVar2.F.f1119h = false;
        zVar2.t(5);
    }

    public final void onStateNotSaved() {
        this.f1284y.a();
    }

    public void onStop() {
        super.onStop();
        this.C = true;
        do {
        } while (x(w(), h.c.CREATED));
        z zVar = this.f1284y.f1297a.f1302r;
        zVar.z = true;
        zVar.F.f1119h = true;
        zVar.t(4);
        this.z.e(h.b.ON_STOP);
    }

    public final z w() {
        return this.f1284y.f1297a.f1302r;
    }

    @Deprecated
    public void y() {
        invalidateOptionsMenu();
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f1284y.f1297a.f1302r.f1312f.onCreateView((View) null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}

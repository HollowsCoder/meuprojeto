package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.d;
import androidx.activity.result.f;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.x;
import androidx.lifecycle.z;
import c.a;
import com.karumi.dexter.R;
import i0.h;
import i0.i;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import x.e;

public class ComponentActivity extends e implements d0, g, androidx.savedstate.c, h, androidx.activity.result.g {

    /* renamed from: p  reason: collision with root package name */
    public final b.a f154p = new b.a();

    /* renamed from: q  reason: collision with root package name */
    public final h f155q = new h();

    /* renamed from: r  reason: collision with root package name */
    public final o f156r;

    /* renamed from: s  reason: collision with root package name */
    public final androidx.savedstate.b f157s;

    /* renamed from: t  reason: collision with root package name */
    public c0 f158t;
    public z u;

    /* renamed from: v  reason: collision with root package name */
    public final OnBackPressedDispatcher f159v;
    public final AtomicInteger w;

    /* renamed from: x  reason: collision with root package name */
    public final b f160x;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            }
        }
    }

    public class b extends f {
        public b() {
        }

        public final void b(int i10, c.a aVar, Intent intent) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0025a b10 = aVar.b(componentActivity, intent);
            if (b10 != null) {
                new Handler(Looper.getMainLooper()).post(new e(this, i10, b10));
                return;
            }
            Intent a10 = aVar.a(componentActivity, intent);
            if (a10.getExtras() != null && a10.getExtras().getClassLoader() == null) {
                a10.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
                String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                x.a.b(componentActivity, stringArrayExtra, i10);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
                androidx.activity.result.h hVar = (androidx.activity.result.h) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    IntentSender intentSender = hVar.f210o;
                    Intent intent2 = hVar.f211p;
                    int i11 = hVar.f212q;
                    int i12 = hVar.f213r;
                    int i13 = x.a.f9376c;
                    componentActivity.startIntentSenderForResult(intentSender, i10, intent2, i11, i12, 0, bundle);
                } catch (IntentSender.SendIntentException e10) {
                    new Handler(Looper.getMainLooper()).post(new f(this, i10, e10));
                }
            } else {
                int i14 = x.a.f9376c;
                componentActivity.startActivityForResult(a10, i10, bundle);
            }
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public c0 f166a;
    }

    public ComponentActivity() {
        o oVar = new o(this);
        this.f156r = oVar;
        androidx.savedstate.b bVar = new androidx.savedstate.b(this);
        this.f157s = bVar;
        this.f159v = new OnBackPressedDispatcher(new a());
        this.w = new AtomicInteger();
        this.f160x = new b();
        oVar.a(new l() {
            public final void f(n nVar, h.b bVar) {
                View view;
                if (bVar == h.b.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    if (window != null) {
                        view = window.peekDecorView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            }
        });
        oVar.a(new l() {
            public final void f(n nVar, h.b bVar) {
                if (bVar == h.b.ON_DESTROY) {
                    ComponentActivity.this.f154p.f1928b = null;
                    if (!ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.n().a();
                    }
                }
            }
        });
        oVar.a(new l() {
            public final void f(n nVar, h.b bVar) {
                ComponentActivity componentActivity = ComponentActivity.this;
                if (componentActivity.f158t == null) {
                    c cVar = (c) componentActivity.getLastNonConfigurationInstance();
                    if (cVar != null) {
                        componentActivity.f158t = cVar.f166a;
                    }
                    if (componentActivity.f158t == null) {
                        componentActivity.f158t = new c0();
                    }
                }
                componentActivity.f156r.b(this);
            }
        });
        bVar.f1884b.b("android:support:activity-result", new c(this));
        t(new d(this));
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        u();
        super.addContentView(view, layoutParams);
    }

    public final OnBackPressedDispatcher b() {
        return this.f159v;
    }

    public final androidx.savedstate.a c() {
        return this.f157s.f1884b;
    }

    public final b0.b i() {
        if (getApplication() != null) {
            if (this.u == null) {
                this.u = new z(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
            }
            return this.u;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public final f l() {
        return this.f160x;
    }

    public final c0 n() {
        if (getApplication() != null) {
            if (this.f158t == null) {
                c cVar = (c) getLastNonConfigurationInstance();
                if (cVar != null) {
                    this.f158t = cVar.f166a;
                }
                if (this.f158t == null) {
                    this.f158t = new c0();
                }
            }
            return this.f158t;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (!this.f160x.a(i10, i11, intent)) {
            super.onActivityResult(i10, i11, intent);
        }
    }

    public void onBackPressed() {
        this.f159v.b();
    }

    public void onCreate(Bundle bundle) {
        this.f157s.a(bundle);
        b.a aVar = this.f154p;
        aVar.f1928b = this;
        Iterator it = aVar.f1927a.iterator();
        while (it.hasNext()) {
            ((b.b) it.next()).a();
        }
        super.onCreate(bundle);
        x.c(this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater();
        Iterator<i> it = this.f155q.f5994a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        Iterator<i> it = this.f155q.f5994a.iterator();
        while (it.hasNext()) {
            if (it.next().b()) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (!this.f160x.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        c0 c0Var = this.f158t;
        if (c0Var == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            c0Var = cVar.f166a;
        }
        if (c0Var == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.f166a = c0Var;
        return cVar2;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        o oVar = this.f156r;
        if (oVar instanceof o) {
            oVar.g(h.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f157s.b(bundle);
    }

    public final o r() {
        return this.f156r;
    }

    public final void reportFullyDrawn() {
        try {
            if (b1.a.a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void setContentView(int i10) {
        u();
        super.setContentView(i10);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        u();
        super.setContentView(view);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        u();
        super.setContentView(view, layoutParams);
    }

    @Deprecated
    public final void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Deprecated
    public final void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Deprecated
    public final void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Deprecated
    public final void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public final void t(b.b bVar) {
        b.a aVar = this.f154p;
        if (aVar.f1928b != null) {
            bVar.a();
        }
        aVar.f1927a.add(bVar);
    }

    public final void u() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public final d v(androidx.activity.result.b bVar, c.c cVar) {
        return this.f160x.c("activity_rq#" + this.w.getAndIncrement(), this, cVar, bVar);
    }
}

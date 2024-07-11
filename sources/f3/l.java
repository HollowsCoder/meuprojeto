package f3;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.x0;
import androidx.fragment.app.n;
import androidx.fragment.app.q;
import androidx.fragment.app.y;
import androidx.fragment.app.z;
import com.bumptech.glide.f;
import com.bumptech.glide.h;
import com.bumptech.glide.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import m3.j;
import n.e;
import q0.d;
import z2.r;

public final class l implements Handler.Callback {

    /* renamed from: j  reason: collision with root package name */
    public static final a f4611j = new a();

    /* renamed from: a  reason: collision with root package name */
    public volatile m f4612a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f4613b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f4614c = new HashMap();
    public final Handler d;

    /* renamed from: e  reason: collision with root package name */
    public final b f4615e;

    /* renamed from: f  reason: collision with root package name */
    public final n.b<View, n> f4616f = new n.b<>();

    /* renamed from: g  reason: collision with root package name */
    public final n.b<View, Fragment> f4617g = new n.b<>();

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f4618h = new Bundle();

    /* renamed from: i  reason: collision with root package name */
    public final g f4619i;

    public class a implements b {
    }

    public interface b {
    }

    public l(b bVar, h hVar) {
        g gVar;
        this.f4615e = bVar == null ? f4611j : bVar;
        this.d = new Handler(Looper.getMainLooper(), this);
        if (!r.f9841h || !r.f9840g) {
            gVar = new e(2);
        } else if (hVar.f2249a.containsKey(f.class)) {
            gVar = new f();
        } else {
            gVar = new e(3);
        }
        this.f4619i = gVar;
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void c(List list, n.b bVar) {
        View view;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                if (!(nVar == null || (view = nVar.S) == null)) {
                    bVar.put(view, nVar);
                    c(nVar.j().f1310c.k(), bVar);
                }
            }
        }
    }

    @TargetApi(26)
    @Deprecated
    public final void b(FragmentManager fragmentManager, n.b<View, Fragment> bVar) {
        Fragment fragment;
        if (Build.VERSION.SDK_INT >= 26) {
            for (Fragment fragment2 : fragmentManager.getFragments()) {
                if (fragment2.getView() != null) {
                    bVar.put(fragment2.getView(), fragment2);
                    b(fragment2.getChildFragmentManager(), bVar);
                }
            }
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            Bundle bundle = this.f4618h;
            bundle.putInt("key", i10);
            try {
                fragment = fragmentManager.getFragment(bundle, "key");
            } catch (Exception unused) {
                fragment = null;
            }
            if (fragment != null) {
                if (fragment.getView() != null) {
                    bVar.put(fragment.getView(), fragment);
                    b(fragment.getChildFragmentManager(), bVar);
                }
                i10 = i11;
            } else {
                return;
            }
        }
    }

    @Deprecated
    public final m d(Context context, FragmentManager fragmentManager, Fragment fragment, boolean z) {
        k h10 = h(fragmentManager, fragment);
        m mVar = h10.f4607r;
        if (mVar != null) {
            return mVar;
        }
        com.bumptech.glide.b b10 = com.bumptech.glide.b.b(context);
        ((a) this.f4615e).getClass();
        m mVar2 = new m(b10, h10.f4604o, h10.f4605p, context);
        if (z) {
            mVar2.k();
        }
        h10.f4607r = mVar2;
        return mVar2;
    }

    public final m e(Activity activity) {
        boolean z;
        if (j.g()) {
            return f(activity.getApplicationContext());
        }
        if (activity instanceof q) {
            return g((q) activity);
        }
        if (!activity.isDestroyed()) {
            this.f4619i.g();
            FragmentManager fragmentManager = activity.getFragmentManager();
            Activity a10 = a(activity);
            if (a10 == null || !a10.isFinishing()) {
                z = true;
            } else {
                z = false;
            }
            return d(activity, fragmentManager, (Fragment) null, z);
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public final m f(Context context) {
        boolean z;
        if (context != null) {
            char[] cArr = j.f7084a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z = true;
            } else {
                z = false;
            }
            if (z && !(context instanceof Application)) {
                if (context instanceof q) {
                    return g((q) context);
                }
                if (context instanceof Activity) {
                    return e((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return f(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.f4612a == null) {
                synchronized (this) {
                    if (this.f4612a == null) {
                        com.bumptech.glide.b b10 = com.bumptech.glide.b.b(context.getApplicationContext());
                        b bVar = this.f4615e;
                        r2.a aVar = new r2.a((x0) null);
                        d dVar = new d(4);
                        Context applicationContext = context.getApplicationContext();
                        ((a) bVar).getClass();
                        this.f4612a = new m(b10, aVar, dVar, applicationContext);
                    }
                }
            }
            return this.f4612a;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public final m g(q qVar) {
        boolean z;
        if (j.g()) {
            return f(qVar.getApplicationContext());
        }
        if (!qVar.isDestroyed()) {
            this.f4619i.g();
            z w = qVar.w();
            Activity a10 = a(qVar);
            if (a10 == null || !a10.isFinishing()) {
                z = true;
            } else {
                z = false;
            }
            return j(qVar, w, (n) null, z);
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public final k h(FragmentManager fragmentManager, Fragment fragment) {
        k kVar = (k) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (kVar != null) {
            return kVar;
        }
        HashMap hashMap = this.f4613b;
        k kVar2 = (k) hashMap.get(fragmentManager);
        if (kVar2 == null) {
            kVar2 = new k();
            kVar2.f4609t = fragment;
            if (!(fragment == null || fragment.getActivity() == null)) {
                kVar2.a(fragment.getActivity());
            }
            hashMap.put(fragmentManager, kVar2);
            fragmentManager.beginTransaction().add(kVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return kVar2;
    }

    public final boolean handleMessage(Message message) {
        Object obj;
        Object obj2;
        Object obj3;
        HashMap hashMap;
        int i10 = message.what;
        boolean z = true;
        if (i10 == 1) {
            obj3 = (FragmentManager) message.obj;
            hashMap = this.f4613b;
        } else if (i10 != 2) {
            obj = null;
            z = false;
            obj2 = null;
            if (z && obj == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
            }
            return z;
        } else {
            obj3 = (y) message.obj;
            hashMap = this.f4614c;
        }
        Object remove = hashMap.remove(obj3);
        obj2 = obj3;
        obj = remove;
        Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        return z;
    }

    public final o i(y yVar, n nVar) {
        o oVar = (o) yVar.D("com.bumptech.glide.manager");
        if (oVar != null) {
            return oVar;
        }
        HashMap hashMap = this.f4614c;
        o oVar2 = (o) hashMap.get(yVar);
        if (oVar2 == null) {
            oVar2 = new o();
            oVar2.f4628m0 = nVar;
            if (!(nVar == null || nVar.k() == null)) {
                n nVar2 = nVar;
                while (true) {
                    n nVar3 = nVar2.I;
                    if (nVar3 == null) {
                        break;
                    }
                    nVar2 = nVar3;
                }
                y yVar2 = nVar2.F;
                if (yVar2 != null) {
                    oVar2.V(nVar.k(), yVar2);
                }
            }
            hashMap.put(yVar, oVar2);
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
            aVar.f(0, oVar2, "com.bumptech.glide.manager", 1);
            aVar.e(true);
            this.d.obtainMessage(2, yVar).sendToTarget();
        }
        return oVar2;
    }

    public final m j(Context context, y yVar, n nVar, boolean z) {
        o i10 = i(yVar, nVar);
        m mVar = i10.f4627l0;
        if (mVar != null) {
            return mVar;
        }
        com.bumptech.glide.b b10 = com.bumptech.glide.b.b(context);
        ((a) this.f4615e).getClass();
        m mVar2 = new m(b10, i10.f4623h0, i10.f4624i0, context);
        if (z) {
            mVar2.k();
        }
        i10.f4627l0 = mVar2;
        return mVar2;
    }
}

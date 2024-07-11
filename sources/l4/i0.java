package l4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.n;
import androidx.fragment.app.q;
import b5.d;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import m5.r;
import n.b;

public final class i0 extends n implements f {

    /* renamed from: k0  reason: collision with root package name */
    public static final WeakHashMap<q, WeakReference<i0>> f6920k0 = new WeakHashMap<>();

    /* renamed from: h0  reason: collision with root package name */
    public final Map<String, LifecycleCallback> f6921h0 = Collections.synchronizedMap(new b());

    /* renamed from: i0  reason: collision with root package name */
    public int f6922i0 = 0;

    /* renamed from: j0  reason: collision with root package name */
    public Bundle f6923j0;

    public final void E() {
        this.Q = true;
        this.f6922i0 = 3;
        for (LifecycleCallback lifecycleCallback : this.f6921h0.values()) {
            lifecycleCallback.getClass();
        }
    }

    public final void F(Bundle bundle) {
        for (Map.Entry next : this.f6921h0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) next.getValue()).getClass();
            bundle.putBundle((String) next.getKey(), bundle2);
        }
    }

    public final void G() {
        this.Q = true;
        this.f6922i0 = 2;
        for (LifecycleCallback lifecycleCallback : this.f6921h0.values()) {
            lifecycleCallback.getClass();
        }
    }

    public final void H() {
        this.Q = true;
        this.f6922i0 = 4;
        for (LifecycleCallback a10 : this.f6921h0.values()) {
            a10.a();
        }
    }

    public final void a(LifecycleCallback lifecycleCallback) {
        Map<String, LifecycleCallback> map = this.f6921h0;
        if (!map.containsKey("TaskOnStopCallback")) {
            map.put("TaskOnStopCallback", lifecycleCallback);
            if (this.f6922i0 > 0) {
                new d(Looper.getMainLooper()).post(new j0(this, lifecycleCallback, "TaskOnStopCallback", 0));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("TaskOnStopCallback".length() + 59);
        sb.append("LifecycleCallback with tag TaskOnStopCallback already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final LifecycleCallback e() {
        return r.a.class.cast(this.f6921h0.get("TaskOnStopCallback"));
    }

    public final void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f6921h0.values()) {
            lifecycleCallback.getClass();
        }
    }

    public final void t(int i10, int i11, Intent intent) {
        super.t(i10, i11, intent);
        for (LifecycleCallback lifecycleCallback : this.f6921h0.values()) {
            lifecycleCallback.getClass();
        }
    }

    public final void w(Bundle bundle) {
        super.w(bundle);
        this.f6922i0 = 1;
        this.f6923j0 = bundle;
        for (Map.Entry next : this.f6921h0.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) next.getValue();
            if (bundle != null) {
                bundle.getBundle((String) next.getKey());
            }
            lifecycleCallback.getClass();
        }
    }

    public final void y() {
        this.Q = true;
        this.f6922i0 = 5;
        for (LifecycleCallback lifecycleCallback : this.f6921h0.values()) {
            lifecycleCallback.getClass();
        }
    }
}

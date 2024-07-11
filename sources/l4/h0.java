package l4;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
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

public final class h0 extends Fragment implements f {

    /* renamed from: r  reason: collision with root package name */
    public static final WeakHashMap<Activity, WeakReference<h0>> f6916r = new WeakHashMap<>();

    /* renamed from: o  reason: collision with root package name */
    public final Map<String, LifecycleCallback> f6917o = Collections.synchronizedMap(new b());

    /* renamed from: p  reason: collision with root package name */
    public int f6918p = 0;

    /* renamed from: q  reason: collision with root package name */
    public Bundle f6919q;

    public final void a(LifecycleCallback lifecycleCallback) {
        Map<String, LifecycleCallback> map = this.f6917o;
        if (!map.containsKey("TaskOnStopCallback")) {
            map.put("TaskOnStopCallback", lifecycleCallback);
            if (this.f6918p > 0) {
                new d(Looper.getMainLooper()).post(new g0(this, lifecycleCallback, "TaskOnStopCallback", 0));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("TaskOnStopCallback".length() + 59);
        sb.append("LifecycleCallback with tag TaskOnStopCallback already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f6917o.values()) {
            lifecycleCallback.getClass();
        }
    }

    public final LifecycleCallback e() {
        return r.a.class.cast(this.f6917o.get("TaskOnStopCallback"));
    }

    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        for (LifecycleCallback lifecycleCallback : this.f6917o.values()) {
            lifecycleCallback.getClass();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6918p = 1;
        this.f6919q = bundle;
        for (Map.Entry next : this.f6917o.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) next.getValue();
            if (bundle != null) {
                bundle.getBundle((String) next.getKey());
            }
            lifecycleCallback.getClass();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f6918p = 5;
        for (LifecycleCallback lifecycleCallback : this.f6917o.values()) {
            lifecycleCallback.getClass();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f6918p = 3;
        for (LifecycleCallback lifecycleCallback : this.f6917o.values()) {
            lifecycleCallback.getClass();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry next : this.f6917o.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) next.getValue()).getClass();
                bundle.putBundle((String) next.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f6918p = 2;
        for (LifecycleCallback lifecycleCallback : this.f6917o.values()) {
            lifecycleCallback.getClass();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f6918p = 4;
        for (LifecycleCallback a10 : this.f6917o.values()) {
            a10.a();
        }
    }
}

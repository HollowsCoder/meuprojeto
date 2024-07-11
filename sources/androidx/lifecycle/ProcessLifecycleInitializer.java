package androidx.lifecycle;

import a1.b;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.h;
import androidx.lifecycle.k;
import java.util.Collections;
import java.util.List;

public final class ProcessLifecycleInitializer implements b<n> {
    public final List<Class<? extends b<?>>> a() {
        return Collections.emptyList();
    }

    public final Object b(Context context) {
        if (!k.f1392a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new k.a());
        }
        v vVar = v.w;
        vVar.getClass();
        vVar.f1409s = new Handler();
        vVar.f1410t.e(h.b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new w(vVar));
        return vVar;
    }
}

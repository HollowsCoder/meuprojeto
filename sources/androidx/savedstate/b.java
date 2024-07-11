package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.lifecycle.o;
import androidx.savedstate.a;
import java.util.Map;
import k.b;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final c f1883a;

    /* renamed from: b  reason: collision with root package name */
    public final a f1884b = new a();

    public b(c cVar) {
        this.f1883a = cVar;
    }

    public final void a(Bundle bundle) {
        c cVar = this.f1883a;
        o r5 = cVar.r();
        if (r5.f1394c == h.c.INITIALIZED) {
            r5.a(new Recreator(cVar));
            a aVar = this.f1884b;
            if (!aVar.f1881c) {
                if (bundle != null) {
                    aVar.f1880b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                }
                r5.a(new SavedStateRegistry$1(aVar));
                aVar.f1881c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public final void b(Bundle bundle) {
        a aVar = this.f1884b;
        aVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = aVar.f1880b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        k.b<String, a.b> bVar = aVar.f1879a;
        bVar.getClass();
        b.d dVar = new b.d();
        bVar.f6611q.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((a.b) entry.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}

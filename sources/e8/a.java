package e8;

import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.internal.b;
import java.util.concurrent.Callable;

public final /* synthetic */ class a implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f4514a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f4515b;

    public /* synthetic */ a(c cVar, h hVar) {
        this.f4514a = cVar;
        this.f4515b = hVar;
    }

    public final Object call() {
        c cVar = this.f4514a;
        h hVar = this.f4515b;
        b bVar = cVar.f4524i;
        synchronized (bVar.f3744b) {
            SharedPreferences.Editor edit = bVar.f3743a.edit();
            hVar.getClass();
            edit.putLong("fetch_timeout_in_seconds", 60).putLong("minimum_fetch_interval_in_seconds", hVar.f4527a).commit();
        }
        return null;
    }
}

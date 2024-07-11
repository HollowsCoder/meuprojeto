package t4;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;

public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final c f8995b = new c();

    /* renamed from: a  reason: collision with root package name */
    public b f8996a = null;

    @RecentlyNonNull
    public static b a(@RecentlyNonNull Context context) {
        b bVar;
        c cVar = f8995b;
        synchronized (cVar) {
            if (cVar.f8996a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                cVar.f8996a = new b(context);
            }
            bVar = cVar.f8996a;
        }
        return bVar;
    }
}

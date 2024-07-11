package f8;

import android.text.format.DateUtils;
import com.google.firebase.remoteconfig.internal.a;
import com.google.firebase.remoteconfig.internal.b;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import m5.a;
import m5.i;
import m5.l;
import m5.r;
import w7.e;

public final /* synthetic */ class f implements a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.remoteconfig.internal.a f4912o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ long f4913p;

    public /* synthetic */ f(com.google.firebase.remoteconfig.internal.a aVar, long j8) {
        this.f4912o = aVar;
        this.f4913p = j8;
    }

    public final Object c(i iVar) {
        i iVar2;
        boolean z;
        com.google.firebase.remoteconfig.internal.a aVar = this.f4912o;
        aVar.getClass();
        Date date = new Date(System.currentTimeMillis());
        boolean m10 = iVar.m();
        Date date2 = null;
        b bVar = aVar.f3737g;
        if (m10) {
            bVar.getClass();
            Date date3 = new Date(bVar.f3743a.getLong("last_fetch_time_in_millis", -1));
            if (date3.equals(b.d)) {
                z = false;
            } else {
                z = date.before(new Date(TimeUnit.SECONDS.toMillis(this.f4913p) + date3.getTime()));
            }
            if (z) {
                return l.e(new a.C0043a(2, (e) null, (String) null));
            }
        }
        Date date4 = bVar.a().f3747b;
        if (date.before(date4)) {
            date2 = date4;
        }
        Executor executor = aVar.f3734c;
        if (date2 != null) {
            String format = String.format("Fetch is throttled. Please wait before calling fetch again: %s", new Object[]{DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date2.getTime() - date.getTime()))});
            date2.getTime();
            iVar2 = l.d(new e8.f(format));
        } else {
            e eVar = aVar.f3732a;
            r id = eVar.getId();
            r a10 = eVar.a();
            iVar2 = l.g(id, a10).g(executor, new g(aVar, id, a10, date));
        }
        return iVar2.g(executor, new z3.i(aVar, date));
    }
}

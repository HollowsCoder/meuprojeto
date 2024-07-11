package t4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.RecentlyNonNull;
import r4.g;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8994a;

    public b(@RecentlyNonNull Context context) {
        this.f8994a = context;
    }

    @RecentlyNonNull
    public final ApplicationInfo a(@RecentlyNonNull String str, @RecentlyNonNull int i10) {
        return this.f8994a.getPackageManager().getApplicationInfo(str, i10);
    }

    @RecentlyNonNull
    public final PackageInfo b(@RecentlyNonNull String str, @RecentlyNonNull int i10) {
        return this.f8994a.getPackageManager().getPackageInfo(str, i10);
    }

    @RecentlyNonNull
    public final boolean c() {
        String nameForUid;
        int callingUid = Binder.getCallingUid();
        int myUid = Process.myUid();
        Context context = this.f8994a;
        if (callingUid == myUid) {
            return a.a(context);
        }
        if (!g.a() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }
}

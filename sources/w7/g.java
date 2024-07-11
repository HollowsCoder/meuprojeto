package w7;

import b0.d;
import com.karumi.dexter.BuildConfig;
import m5.j;
import y7.a;
import y7.c;

public final class g implements k {

    /* renamed from: a  reason: collision with root package name */
    public final l f9286a;

    /* renamed from: b  reason: collision with root package name */
    public final j<i> f9287b;

    public g(l lVar, j<i> jVar) {
        this.f9286a = lVar;
        this.f9287b = jVar;
    }

    public final boolean a(a aVar) {
        boolean z;
        if (aVar.f() == c.a.REGISTERED) {
            z = true;
        } else {
            z = false;
        }
        if (!z || this.f9286a.b(aVar)) {
            return false;
        }
        String str = aVar.d;
        if (str != null) {
            Long valueOf = Long.valueOf(aVar.f9607f);
            Long valueOf2 = Long.valueOf(aVar.f9608g);
            String str2 = BuildConfig.FLAVOR;
            if (valueOf == null) {
                str2 = str2.concat(" tokenExpirationTimestamp");
            }
            if (valueOf2 == null) {
                str2 = d.e(str2, " tokenCreationTimestamp");
            }
            if (str2.isEmpty()) {
                this.f9287b.a(new a(str, valueOf.longValue(), valueOf2.longValue()));
                return true;
            }
            throw new IllegalStateException("Missing required properties:".concat(str2));
        }
        throw new NullPointerException("Null token");
    }

    public final boolean b(Exception exc) {
        this.f9287b.b(exc);
        return true;
    }
}

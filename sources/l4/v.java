package l4;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.api.Scope;
import j5.b;
import java.util.Set;
import k4.a;
import k4.d;
import k5.e;
import l4.d;
import n4.c;

public final class v extends e implements d.a, d.b {

    /* renamed from: h  reason: collision with root package name */
    public static final j5.d f6941h = b.f6574a;

    /* renamed from: a  reason: collision with root package name */
    public final Context f6942a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f6943b;

    /* renamed from: c  reason: collision with root package name */
    public final a.C0093a<? extends j5.e, j5.a> f6944c = f6941h;
    public final Set<Scope> d;

    /* renamed from: e  reason: collision with root package name */
    public final c f6945e;

    /* renamed from: f  reason: collision with root package name */
    public j5.e f6946f;

    /* renamed from: g  reason: collision with root package name */
    public x f6947g;

    public v(Context context, z4.c cVar, c cVar2) {
        this.f6942a = context;
        this.f6943b = cVar;
        this.f6945e = cVar2;
        this.d = cVar2.f7402b;
    }

    public final void onConnected(Bundle bundle) {
        this.f6946f.n(this);
    }

    public final void onConnectionFailed(j4.b bVar) {
        ((d.c) this.f6947g).b(bVar);
    }

    public final void onConnectionSuspended(int i10) {
        this.f6946f.k();
    }
}

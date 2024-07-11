package x6;

import android.os.Bundle;
import g5.a;
import z6.b;

public final class d implements a.C0069a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f9520a;

    public d(e eVar) {
        this.f9520a = eVar;
    }

    public final void a(long j8, Bundle bundle, String str, String str2) {
        if (str != null && !str.equals("crash") && (!a.f9512a.contains(str2))) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j8);
            bundle2.putBundle("params", bundle);
            ((b) this.f9520a.f9521a).a(3, bundle2);
        }
    }
}

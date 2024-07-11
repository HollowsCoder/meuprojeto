package x6;

import android.os.Bundle;
import g5.a;
import java.util.HashSet;

public final class b implements a.C0069a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f9517a;

    public b(c cVar) {
        this.f9517a = cVar;
    }

    public final void a(long j8, Bundle bundle, String str, String str2) {
        c cVar = this.f9517a;
        if (cVar.f9518a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            HashSet hashSet = a.f9512a;
            String n02 = s6.a.n0(str2, s6.a.L, s6.a.J);
            if (n02 != null) {
                str2 = n02;
            }
            bundle2.putString("events", str2);
            ((z6.b) cVar.f9519b).a(2, bundle2);
        }
    }
}

package o9;

import i9.q;
import w9.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public long f7767a = ((long) 262144);

    /* renamed from: b  reason: collision with root package name */
    public final i f7768b;

    public a(i iVar) {
        this.f7768b = iVar;
    }

    public final q a() {
        boolean z;
        q.a aVar = new q.a();
        while (true) {
            String R = this.f7768b.R(this.f7767a);
            this.f7767a -= (long) R.length();
            if (R.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return aVar.d();
            }
            aVar.b(R);
        }
    }
}

package i4;

import android.os.Bundle;
import android.util.Log;
import m5.j;

public abstract class r<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f6102a;

    /* renamed from: b  reason: collision with root package name */
    public final j<T> f6103b = new j<>();

    /* renamed from: c  reason: collision with root package name */
    public final int f6104c;
    public final Bundle d;

    public r(int i10, int i11, Bundle bundle) {
        this.f6102a = i10;
        this.f6104c = i11;
        this.d = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean b();

    public final void c(s sVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(sVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f6103b.f7089a.r(sVar);
    }

    public final void d(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f6103b.a(bundle);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(this.f6104c);
        sb.append(" id=");
        sb.append(this.f6102a);
        sb.append(" oneWay=");
        sb.append(b());
        sb.append("}");
        return sb.toString();
    }
}

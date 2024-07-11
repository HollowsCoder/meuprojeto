package j4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import n4.j0;
import n4.k0;
import n4.l0;
import o4.a;
import o4.c;
import u4.b;

public final class t extends a {
    public static final Parcelable.Creator<t> CREATOR = new w();

    /* renamed from: o  reason: collision with root package name */
    public final String f6565o;

    /* renamed from: p  reason: collision with root package name */
    public final n f6566p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f6567q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f6568r;

    public t(String str, IBinder iBinder, boolean z, boolean z10) {
        this.f6565o = str;
        q qVar = null;
        if (iBinder != null) {
            try {
                int i10 = l0.f7449a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                u4.a a10 = (queryLocalInterface instanceof j0 ? (j0) queryLocalInterface : new k0(iBinder)).a();
                byte[] bArr = a10 == null ? null : (byte[]) b.K(a10);
                if (bArr != null) {
                    qVar = new q(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f6566p = qVar;
        this.f6567q = z;
        this.f6568r = z10;
    }

    public t(String str, n nVar, boolean z, boolean z10) {
        this.f6565o = str;
        this.f6566p = nVar;
        this.f6567q = z;
        this.f6568r = z10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int h10 = c.h(parcel, 20293);
        c.f(parcel, 1, this.f6565o);
        n nVar = this.f6566p;
        if (nVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            nVar = null;
        }
        c.c(parcel, 2, nVar);
        c.i(parcel, 3, 4);
        parcel.writeInt(this.f6567q ? 1 : 0);
        c.i(parcel, 4, 4);
        parcel.writeInt(this.f6568r ? 1 : 0);
        c.k(parcel, h10);
    }
}

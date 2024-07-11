package n4;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Scope;
import j4.d;
import j4.f;
import n4.h;
import o4.a;
import o4.c;

public final class e extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<e> CREATOR = new c0();
    public boolean A;

    /* renamed from: o  reason: collision with root package name */
    public final int f7420o;

    /* renamed from: p  reason: collision with root package name */
    public final int f7421p;

    /* renamed from: q  reason: collision with root package name */
    public final int f7422q;

    /* renamed from: r  reason: collision with root package name */
    public String f7423r;

    /* renamed from: s  reason: collision with root package name */
    public IBinder f7424s;

    /* renamed from: t  reason: collision with root package name */
    public Scope[] f7425t;
    public Bundle u;

    /* renamed from: v  reason: collision with root package name */
    public Account f7426v;
    public d[] w;

    /* renamed from: x  reason: collision with root package name */
    public d[] f7427x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f7428y;
    public final int z;

    public e(@RecentlyNonNull int i10) {
        this.f7420o = 5;
        this.f7422q = f.f6546a;
        this.f7421p = i10;
        this.f7428y = true;
    }

    public e(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, d[] dVarArr, d[] dVarArr2, boolean z10, int i13, boolean z11) {
        this.f7420o = i10;
        this.f7421p = i11;
        this.f7422q = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f7423r = "com.google.android.gms";
        } else {
            this.f7423r = str;
        }
        if (i10 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i14 = h.a.f7444a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                h aVar = queryLocalInterface instanceof h ? (h) queryLocalInterface : new h.a.C0105a(iBinder);
                int i15 = a.f7364b;
                if (aVar != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        account2 = aVar.zza();
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            this.f7426v = account2;
        } else {
            this.f7424s = iBinder;
            this.f7426v = account;
        }
        this.f7425t = scopeArr;
        this.u = bundle;
        this.w = dVarArr;
        this.f7427x = dVarArr2;
        this.f7428y = z10;
        this.z = i13;
        this.A = z11;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10) {
        int h10 = c.h(parcel, 20293);
        c.i(parcel, 1, 4);
        parcel.writeInt(this.f7420o);
        c.i(parcel, 2, 4);
        parcel.writeInt(this.f7421p);
        c.i(parcel, 3, 4);
        parcel.writeInt(this.f7422q);
        c.f(parcel, 4, this.f7423r);
        c.c(parcel, 5, this.f7424s);
        c.g(parcel, 6, this.f7425t, i10);
        c.a(parcel, 7, this.u);
        c.e(parcel, 8, this.f7426v, i10);
        c.g(parcel, 10, this.w, i10);
        c.g(parcel, 11, this.f7427x, i10);
        c.i(parcel, 12, 4);
        parcel.writeInt(this.f7428y ? 1 : 0);
        c.i(parcel, 13, 4);
        parcel.writeInt(this.z);
        boolean z10 = this.A;
        c.i(parcel, 14, 4);
        parcel.writeInt(z10 ? 1 : 0);
        c.k(parcel, h10);
    }
}

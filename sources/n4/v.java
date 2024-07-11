package n4;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import o4.a;
import o4.c;

public final class v extends a {
    public static final Parcelable.Creator<v> CREATOR = new x();

    /* renamed from: o  reason: collision with root package name */
    public final int f7470o;

    /* renamed from: p  reason: collision with root package name */
    public final Account f7471p;

    /* renamed from: q  reason: collision with root package name */
    public final int f7472q;

    /* renamed from: r  reason: collision with root package name */
    public final GoogleSignInAccount f7473r;

    public v(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f7470o = i10;
        this.f7471p = account;
        this.f7472q = i11;
        this.f7473r = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int h10 = c.h(parcel, 20293);
        c.i(parcel, 1, 4);
        parcel.writeInt(this.f7470o);
        c.e(parcel, 2, this.f7471p, i10);
        c.i(parcel, 3, 4);
        parcel.writeInt(this.f7472q);
        c.e(parcel, 4, this.f7473r, i10);
        c.k(parcel, h10);
    }
}

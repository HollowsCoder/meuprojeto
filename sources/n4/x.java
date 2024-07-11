package n4;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import o4.b;

public final class x implements Parcelable.Creator<v> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        int i10 = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i11 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            int i12 = 65535 & readInt;
            if (i12 == 1) {
                i10 = b.k(parcel, readInt);
            } else if (i12 == 2) {
                account = (Account) b.d(parcel, readInt, Account.CREATOR);
            } else if (i12 == 3) {
                i11 = b.k(parcel, readInt);
            } else if (i12 != 4) {
                b.n(parcel, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) b.d(parcel, readInt, GoogleSignInAccount.CREATOR);
            }
        }
        b.g(parcel, o10);
        return new v(i10, account, i11, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new v[i10];
    }
}

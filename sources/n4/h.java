package n4;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RecentlyNonNull;
import b5.b;
import b5.c;

public interface h extends IInterface {

    public static abstract class a extends b5.a implements h {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f7444a = 0;

        /* renamed from: n4.h$a$a  reason: collision with other inner class name */
        public static class C0105a extends b implements h {
            public C0105a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            public final Account zza() {
                Parcel J = J(I(), 2);
                Account account = (Account) c.a(J, Account.CREATOR);
                J.recycle();
                return account;
            }
        }
    }

    @RecentlyNonNull
    Account zza();
}

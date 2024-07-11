package n4;

import android.os.Parcel;
import b5.a;
import b5.c;
import j4.n;

public abstract class l0 extends a implements j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f7449a = 0;

    public l0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public final boolean I(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            u4.a a10 = ((n) this).a();
            parcel2.writeNoException();
            c.b(parcel2, a10);
        } else if (i10 != 2) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(((n) this).f6558b);
        }
        return true;
    }
}

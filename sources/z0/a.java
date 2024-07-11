package z0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface a extends IInterface {

    /* renamed from: z0.a$a  reason: collision with other inner class name */
    public static abstract class C0171a extends Binder implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f9787a = 0;

        /* renamed from: z0.a$a$a  reason: collision with other inner class name */
        public static class C0172a implements a {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f9788a;

            public C0172a(IBinder iBinder) {
                this.f9788a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f9788a;
            }

            public final void j(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    if (!this.f9788a.transact(1, obtain, (Parcel) null, 1)) {
                        int i10 = C0171a.f9787a;
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }
    }

    void j(String[] strArr);
}

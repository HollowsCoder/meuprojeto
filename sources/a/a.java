package a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface a extends IInterface {

    /* renamed from: a.a$a  reason: collision with other inner class name */
    public static abstract class C0000a extends Binder implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f3a = 0;

        /* renamed from: a.a$a$a  reason: collision with other inner class name */
        public static class C0001a implements a {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f4a;

            public C0001a(IBinder iBinder) {
                this.f4a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f4a;
            }
        }

        public C0000a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        public final IBinder asBinder() {
            return this;
        }

        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            Bundle bundle;
            if (i10 == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                b bVar = b.this;
                bVar.getClass();
                bVar.a(readInt, bundle);
                return true;
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }
}

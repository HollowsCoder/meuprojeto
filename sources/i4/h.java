package i4;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new f();

    /* renamed from: o  reason: collision with root package name */
    public final Messenger f6077o;

    public h(IBinder iBinder) {
        this.f6077o = new Messenger(iBinder);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.f6077o;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((h) obj).f6077o;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.f6077o;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f6077o;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}

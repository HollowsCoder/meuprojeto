package n4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import j4.b;
import n4.h;
import o4.a;
import o4.c;

public final class w extends a {
    public static final Parcelable.Creator<w> CREATOR = new y();

    /* renamed from: o  reason: collision with root package name */
    public final int f7474o;

    /* renamed from: p  reason: collision with root package name */
    public final IBinder f7475p;

    /* renamed from: q  reason: collision with root package name */
    public final b f7476q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f7477r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f7478s;

    public w(int i10, IBinder iBinder, b bVar, boolean z, boolean z10) {
        this.f7474o = i10;
        this.f7475p = iBinder;
        this.f7476q = bVar;
        this.f7477r = z;
        this.f7478s = z10;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f7476q.equals(wVar.f7476q)) {
            Object obj3 = null;
            IBinder iBinder = this.f7475p;
            if (iBinder == null) {
                obj2 = null;
            } else {
                int i10 = h.a.f7444a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof h) {
                    obj2 = (h) queryLocalInterface;
                } else {
                    obj2 = new h.a.C0105a(iBinder);
                }
            }
            IBinder iBinder2 = wVar.f7475p;
            if (iBinder2 != null) {
                int i11 = h.a.f7444a;
                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface2 instanceof h) {
                    obj3 = (h) queryLocalInterface2;
                } else {
                    obj3 = new h.a.C0105a(iBinder2);
                }
            }
            if (l.a(obj2, obj3)) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int h10 = c.h(parcel, 20293);
        c.i(parcel, 1, 4);
        parcel.writeInt(this.f7474o);
        c.c(parcel, 2, this.f7475p);
        c.e(parcel, 3, this.f7476q, i10);
        c.i(parcel, 4, 4);
        parcel.writeInt(this.f7477r ? 1 : 0);
        c.i(parcel, 5, 4);
        parcel.writeInt(this.f7478s ? 1 : 0);
        c.k(parcel, h10);
    }
}

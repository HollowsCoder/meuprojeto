package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new a();
    public Bundle A;

    /* renamed from: o  reason: collision with root package name */
    public final String f1130o;

    /* renamed from: p  reason: collision with root package name */
    public final String f1131p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f1132q;

    /* renamed from: r  reason: collision with root package name */
    public final int f1133r;

    /* renamed from: s  reason: collision with root package name */
    public final int f1134s;

    /* renamed from: t  reason: collision with root package name */
    public final String f1135t;
    public final boolean u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f1136v;
    public final boolean w;

    /* renamed from: x  reason: collision with root package name */
    public final Bundle f1137x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f1138y;
    public final int z;

    public class a implements Parcelable.Creator<d0> {
        public final Object createFromParcel(Parcel parcel) {
            return new d0(parcel);
        }

        public final Object[] newArray(int i10) {
            return new d0[i10];
        }
    }

    public d0(Parcel parcel) {
        this.f1130o = parcel.readString();
        this.f1131p = parcel.readString();
        boolean z10 = true;
        this.f1132q = parcel.readInt() != 0;
        this.f1133r = parcel.readInt();
        this.f1134s = parcel.readInt();
        this.f1135t = parcel.readString();
        this.u = parcel.readInt() != 0;
        this.f1136v = parcel.readInt() != 0;
        this.w = parcel.readInt() != 0;
        this.f1137x = parcel.readBundle();
        this.f1138y = parcel.readInt() == 0 ? false : z10;
        this.A = parcel.readBundle();
        this.z = parcel.readInt();
    }

    public d0(n nVar) {
        this.f1130o = nVar.getClass().getName();
        this.f1131p = nVar.f1240s;
        this.f1132q = nVar.A;
        this.f1133r = nVar.J;
        this.f1134s = nVar.K;
        this.f1135t = nVar.L;
        this.u = nVar.O;
        this.f1136v = nVar.z;
        this.w = nVar.N;
        this.f1137x = nVar.f1241t;
        this.f1138y = nVar.M;
        this.z = nVar.Z.ordinal();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1130o);
        sb.append(" (");
        sb.append(this.f1131p);
        sb.append(")}:");
        if (this.f1132q) {
            sb.append(" fromLayout");
        }
        int i10 = this.f1134s;
        if (i10 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i10));
        }
        String str = this.f1135t;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.u) {
            sb.append(" retainInstance");
        }
        if (this.f1136v) {
            sb.append(" removing");
        }
        if (this.w) {
            sb.append(" detached");
        }
        if (this.f1138y) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1130o);
        parcel.writeString(this.f1131p);
        parcel.writeInt(this.f1132q ? 1 : 0);
        parcel.writeInt(this.f1133r);
        parcel.writeInt(this.f1134s);
        parcel.writeString(this.f1135t);
        parcel.writeInt(this.u ? 1 : 0);
        parcel.writeInt(this.f1136v ? 1 : 0);
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeBundle(this.f1137x);
        parcel.writeInt(this.f1138y ? 1 : 0);
        parcel.writeBundle(this.A);
        parcel.writeInt(this.z);
    }
}

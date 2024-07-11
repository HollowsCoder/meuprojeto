package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.y;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new a();

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<d0> f1098o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<String> f1099p;

    /* renamed from: q  reason: collision with root package name */
    public b[] f1100q;

    /* renamed from: r  reason: collision with root package name */
    public int f1101r;

    /* renamed from: s  reason: collision with root package name */
    public String f1102s = null;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList<String> f1103t = new ArrayList<>();
    public final ArrayList<Bundle> u = new ArrayList<>();

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<y.k> f1104v;

    public class a implements Parcelable.Creator<a0> {
        public final Object createFromParcel(Parcel parcel) {
            return new a0(parcel);
        }

        public final Object[] newArray(int i10) {
            return new a0[i10];
        }
    }

    public a0() {
    }

    public a0(Parcel parcel) {
        this.f1098o = parcel.createTypedArrayList(d0.CREATOR);
        this.f1099p = parcel.createStringArrayList();
        this.f1100q = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f1101r = parcel.readInt();
        this.f1102s = parcel.readString();
        this.f1103t = parcel.createStringArrayList();
        this.u = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f1104v = parcel.createTypedArrayList(y.k.CREATOR);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.f1098o);
        parcel.writeStringList(this.f1099p);
        parcel.writeTypedArray(this.f1100q, i10);
        parcel.writeInt(this.f1101r);
        parcel.writeString(this.f1102s);
        parcel.writeStringList(this.f1103t);
        parcel.writeTypedList(this.u);
        parcel.writeTypedList(this.f1104v);
    }
}

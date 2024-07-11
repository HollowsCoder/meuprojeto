package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.g0;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final ArrayList<String> A;
    public final boolean B;

    /* renamed from: o  reason: collision with root package name */
    public final int[] f1105o;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList<String> f1106p;

    /* renamed from: q  reason: collision with root package name */
    public final int[] f1107q;

    /* renamed from: r  reason: collision with root package name */
    public final int[] f1108r;

    /* renamed from: s  reason: collision with root package name */
    public final int f1109s;

    /* renamed from: t  reason: collision with root package name */
    public final String f1110t;
    public final int u;

    /* renamed from: v  reason: collision with root package name */
    public final int f1111v;
    public final CharSequence w;

    /* renamed from: x  reason: collision with root package name */
    public final int f1112x;

    /* renamed from: y  reason: collision with root package name */
    public final CharSequence f1113y;
    public final ArrayList<String> z;

    public class a implements Parcelable.Creator<b> {
        public final Object createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        public final Object[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(Parcel parcel) {
        this.f1105o = parcel.createIntArray();
        this.f1106p = parcel.createStringArrayList();
        this.f1107q = parcel.createIntArray();
        this.f1108r = parcel.createIntArray();
        this.f1109s = parcel.readInt();
        this.f1110t = parcel.readString();
        this.u = parcel.readInt();
        this.f1111v = parcel.readInt();
        this.w = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1112x = parcel.readInt();
        this.f1113y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.z = parcel.createStringArrayList();
        this.A = parcel.createStringArrayList();
        this.B = parcel.readInt() != 0;
    }

    public b(a aVar) {
        int size = aVar.f1158a.size();
        this.f1105o = new int[(size * 5)];
        if (aVar.f1163g) {
            this.f1106p = new ArrayList<>(size);
            this.f1107q = new int[size];
            this.f1108r = new int[size];
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                g0.a aVar2 = aVar.f1158a.get(i10);
                int i12 = i11 + 1;
                this.f1105o[i11] = aVar2.f1172a;
                ArrayList<String> arrayList = this.f1106p;
                n nVar = aVar2.f1173b;
                arrayList.add(nVar != null ? nVar.f1240s : null);
                int[] iArr = this.f1105o;
                int i13 = i12 + 1;
                iArr[i12] = aVar2.f1174c;
                int i14 = i13 + 1;
                iArr[i13] = aVar2.d;
                int i15 = i14 + 1;
                iArr[i14] = aVar2.f1175e;
                iArr[i15] = aVar2.f1176f;
                this.f1107q[i10] = aVar2.f1177g.ordinal();
                this.f1108r[i10] = aVar2.f1178h.ordinal();
                i10++;
                i11 = i15 + 1;
            }
            this.f1109s = aVar.f1162f;
            this.f1110t = aVar.f1165i;
            this.u = aVar.f1097s;
            this.f1111v = aVar.f1166j;
            this.w = aVar.f1167k;
            this.f1112x = aVar.l;
            this.f1113y = aVar.f1168m;
            this.z = aVar.f1169n;
            this.A = aVar.f1170o;
            this.B = aVar.f1171p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f1105o);
        parcel.writeStringList(this.f1106p);
        parcel.writeIntArray(this.f1107q);
        parcel.writeIntArray(this.f1108r);
        parcel.writeInt(this.f1109s);
        parcel.writeString(this.f1110t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.f1111v);
        TextUtils.writeToParcel(this.w, parcel, 0);
        parcel.writeInt(this.f1112x);
        TextUtils.writeToParcel(this.f1113y, parcel, 0);
        parcel.writeStringList(this.z);
        parcel.writeStringList(this.A);
        parcel.writeInt(this.B ? 1 : 0);
    }
}

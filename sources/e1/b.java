package e1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import b0.d;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Method;

public final class b extends a {
    public final SparseIntArray d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f4450e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4451f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4452g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4453h;

    /* renamed from: i  reason: collision with root package name */
    public int f4454i;

    /* renamed from: j  reason: collision with root package name */
    public int f4455j;

    /* renamed from: k  reason: collision with root package name */
    public int f4456k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), BuildConfig.FLAVOR, new n.b(), new n.b(), new n.b());
    }

    public b(Parcel parcel, int i10, int i11, String str, n.b<String, Method> bVar, n.b<String, Method> bVar2, n.b<String, Class> bVar3) {
        super(bVar, bVar2, bVar3);
        this.d = new SparseIntArray();
        this.f4454i = -1;
        this.f4456k = -1;
        this.f4450e = parcel;
        this.f4451f = i10;
        this.f4452g = i11;
        this.f4455j = i10;
        this.f4453h = str;
    }

    public final b a() {
        Parcel parcel = this.f4450e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f4455j;
        if (i10 == this.f4451f) {
            i10 = this.f4452g;
        }
        return new b(parcel, dataPosition, i10, d.g(new StringBuilder(), this.f4453h, "  "), this.f4447a, this.f4448b, this.f4449c);
    }

    public final boolean e() {
        return this.f4450e.readInt() != 0;
    }

    public final byte[] f() {
        Parcel parcel = this.f4450e;
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        return bArr;
    }

    public final CharSequence g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f4450e);
    }

    public final boolean h(int i10) {
        while (this.f4455j < this.f4452g) {
            int i11 = this.f4456k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.f4455j;
            Parcel parcel = this.f4450e;
            parcel.setDataPosition(i12);
            int readInt = parcel.readInt();
            this.f4456k = parcel.readInt();
            this.f4455j += readInt;
        }
        return this.f4456k == i10;
    }

    public final int i() {
        return this.f4450e.readInt();
    }

    public final <T extends Parcelable> T k() {
        return this.f4450e.readParcelable(b.class.getClassLoader());
    }

    public final String l() {
        return this.f4450e.readString();
    }

    public final void n(int i10) {
        w();
        this.f4454i = i10;
        this.d.put(i10, this.f4450e.dataPosition());
        r(0);
        r(i10);
    }

    public final void o(boolean z) {
        this.f4450e.writeInt(z ? 1 : 0);
    }

    public final void p(byte[] bArr) {
        Parcel parcel = this.f4450e;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
            return;
        }
        parcel.writeInt(-1);
    }

    public final void q(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f4450e, 0);
    }

    public final void r(int i10) {
        this.f4450e.writeInt(i10);
    }

    public final void t(Parcelable parcelable) {
        this.f4450e.writeParcelable(parcelable, 0);
    }

    public final void u(String str) {
        this.f4450e.writeString(str);
    }

    public final void w() {
        int i10 = this.f4454i;
        if (i10 >= 0) {
            int i11 = this.d.get(i10);
            Parcel parcel = this.f4450e;
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(dataPosition - i11);
            parcel.setDataPosition(dataPosition);
        }
    }
}

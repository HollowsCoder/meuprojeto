package i5;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.appcompat.widget.x0;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import n.e;
import o4.c;

public final class a extends o4.a {
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* renamed from: o  reason: collision with root package name */
    public final String f6113o;

    /* renamed from: p  reason: collision with root package name */
    public final byte[] f6114p;

    /* renamed from: q  reason: collision with root package name */
    public final byte[][] f6115q;

    /* renamed from: r  reason: collision with root package name */
    public final byte[][] f6116r;

    /* renamed from: s  reason: collision with root package name */
    public final byte[][] f6117s;

    /* renamed from: t  reason: collision with root package name */
    public final byte[][] f6118t;
    public final int[] u;

    /* renamed from: v  reason: collision with root package name */
    public final byte[][] f6119v;

    static {
        byte[][] bArr = new byte[0][];
        new a(BuildConfig.FLAVOR, (byte[]) null, bArr, bArr, bArr, bArr, (int[]) null, (byte[][]) null);
    }

    public a(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f6113o = str;
        this.f6114p = bArr;
        this.f6115q = bArr2;
        this.f6116r = bArr3;
        this.f6117s = bArr4;
        this.f6118t = bArr5;
        this.u = iArr;
        this.f6119v = bArr6;
    }

    public static List<Integer> g0(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List<String> h0(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] encodeToString : bArr) {
            arrayList.add(Base64.encodeToString(encodeToString, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void i0(StringBuilder sb, String str, byte[][] bArr) {
        String str2;
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            sb.append("(");
            int length = bArr.length;
            boolean z = true;
            int i10 = 0;
            while (i10 < length) {
                byte[] bArr2 = bArr[i10];
                if (!z) {
                    sb.append(", ");
                }
                sb.append("'");
                sb.append(Base64.encodeToString(bArr2, 3));
                sb.append("'");
                i10++;
                z = false;
            }
            str2 = ")";
        }
        sb.append(str2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return e.t(this.f6113o, aVar.f6113o) && Arrays.equals(this.f6114p, aVar.f6114p) && e.t(h0(this.f6115q), h0(aVar.f6115q)) && e.t(h0(this.f6116r), h0(aVar.f6116r)) && e.t(h0(this.f6117s), h0(aVar.f6117s)) && e.t(h0(this.f6118t), h0(aVar.f6118t)) && e.t(g0(this.u), g0(aVar.u)) && e.t(h0(this.f6119v), h0(aVar.f6119v));
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str2 = this.f6113o;
        if (str2 == null) {
            str = "null";
        } else {
            StringBuilder sb2 = new StringBuilder(x0.a(str2, 2));
            sb2.append("'");
            sb2.append(str2);
            sb2.append("'");
            str = sb2.toString();
        }
        sb.append(str);
        sb.append(", direct=");
        byte[] bArr = this.f6114p;
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        i0(sb, "GAIA", this.f6115q);
        sb.append(", ");
        i0(sb, "PSEUDO", this.f6116r);
        sb.append(", ");
        i0(sb, "ALWAYS", this.f6117s);
        sb.append(", ");
        i0(sb, "OTHER", this.f6118t);
        sb.append(", ");
        sb.append("weak");
        sb.append("=");
        int[] iArr = this.u;
        if (iArr == null) {
            sb.append("null");
        } else {
            sb.append("(");
            int length = iArr.length;
            boolean z = true;
            int i10 = 0;
            while (i10 < length) {
                int i11 = iArr[i10];
                if (!z) {
                    sb.append(", ");
                }
                sb.append(i11);
                i10++;
                z = false;
            }
            sb.append(")");
        }
        sb.append(", ");
        i0(sb, "directs", this.f6119v);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int h10 = c.h(parcel, 20293);
        c.f(parcel, 2, this.f6113o);
        byte[] bArr = this.f6114p;
        if (bArr != null) {
            int h11 = c.h(parcel, 3);
            parcel.writeByteArray(bArr);
            c.k(parcel, h11);
        }
        c.b(parcel, 4, this.f6115q);
        c.b(parcel, 5, this.f6116r);
        c.b(parcel, 6, this.f6117s);
        c.b(parcel, 7, this.f6118t);
        c.d(parcel, 8, this.u);
        c.b(parcel, 9, this.f6119v);
        c.k(parcel, h10);
    }
}

package h4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.clearcut.a4;
import com.google.android.gms.internal.clearcut.i4;
import java.util.Arrays;
import n4.l;
import o4.a;
import o4.c;

public final class f extends a {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* renamed from: o  reason: collision with root package name */
    public final i4 f5253o;

    /* renamed from: p  reason: collision with root package name */
    public byte[] f5254p;

    /* renamed from: q  reason: collision with root package name */
    public final int[] f5255q;

    /* renamed from: r  reason: collision with root package name */
    public final String[] f5256r;

    /* renamed from: s  reason: collision with root package name */
    public final int[] f5257s;

    /* renamed from: t  reason: collision with root package name */
    public final byte[][] f5258t;
    public final i5.a[] u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f5259v;
    public final a4 w;

    public f(i4 i4Var, a4 a4Var) {
        this.f5253o = i4Var;
        this.w = a4Var;
        this.f5255q = null;
        this.f5256r = null;
        this.f5257s = null;
        this.f5258t = null;
        this.u = null;
        this.f5259v = true;
    }

    public f(i4 i4Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, i5.a[] aVarArr) {
        this.f5253o = i4Var;
        this.f5254p = bArr;
        this.f5255q = iArr;
        this.f5256r = strArr;
        this.w = null;
        this.f5257s = iArr2;
        this.f5258t = bArr2;
        this.u = aVarArr;
        this.f5259v = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return l.a(this.f5253o, fVar.f5253o) && Arrays.equals(this.f5254p, fVar.f5254p) && Arrays.equals(this.f5255q, fVar.f5255q) && Arrays.equals(this.f5256r, fVar.f5256r) && l.a(this.w, fVar.w) && l.a((Object) null, (Object) null) && l.a((Object) null, (Object) null) && Arrays.equals(this.f5257s, fVar.f5257s) && Arrays.deepEquals(this.f5258t, fVar.f5258t) && Arrays.equals(this.u, fVar.u) && this.f5259v == fVar.f5259v;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5253o, this.f5254p, this.f5255q, this.f5256r, this.w, null, null, this.f5257s, this.f5258t, this.u, Boolean.valueOf(this.f5259v)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.f5253o);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.f5254p;
        sb.append(bArr == null ? null : new String(bArr));
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.f5255q));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.f5256r));
        sb.append(", LogEvent: ");
        sb.append(this.w);
        sb.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb.append(Arrays.toString(this.f5257s));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.toString(this.f5258t));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.u));
        sb.append(", AddPhenotypeExperimentTokens: ");
        sb.append(this.f5259v);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int h10 = c.h(parcel, 20293);
        c.e(parcel, 2, this.f5253o, i10);
        byte[] bArr = this.f5254p;
        if (bArr != null) {
            int h11 = c.h(parcel, 3);
            parcel.writeByteArray(bArr);
            c.k(parcel, h11);
        }
        c.d(parcel, 4, this.f5255q);
        String[] strArr = this.f5256r;
        if (strArr != null) {
            int h12 = c.h(parcel, 5);
            parcel.writeStringArray(strArr);
            c.k(parcel, h12);
        }
        c.d(parcel, 6, this.f5257s);
        c.b(parcel, 7, this.f5258t);
        c.i(parcel, 8, 4);
        parcel.writeInt(this.f5259v ? 1 : 0);
        c.g(parcel, 9, this.u, i10);
        c.k(parcel, h10);
    }
}

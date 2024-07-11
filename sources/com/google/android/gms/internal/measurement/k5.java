package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.x0;
import androidx.databinding.a;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

public abstract class k5 implements Iterable<Byte>, Serializable {

    /* renamed from: p  reason: collision with root package name */
    public static final j5 f2770p = new j5(n6.f2845b);

    /* renamed from: o  reason: collision with root package name */
    public int f2771o = 0;

    static {
        int i10 = d5.f2671a;
    }

    public static j5 t(byte[] bArr, int i10, int i11) {
        u(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new j5(bArr2);
    }

    public static int u(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i10);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i11 < i10) {
            throw new IndexOutOfBoundsException(x0.c(66, "Beginning index larger than ending index: ", i10, ", ", i11));
        } else {
            throw new IndexOutOfBoundsException(x0.c(37, "End index: ", i11, " >= ", i12));
        }
    }

    public abstract byte e(int i10);

    public abstract boolean equals(Object obj);

    public abstract byte h(int i10);

    public final int hashCode() {
        int i10 = this.f2771o;
        if (i10 == 0) {
            int i11 = i();
            i10 = q(i11, i11);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f2771o = i10;
        }
        return i10;
    }

    public abstract int i();

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new g5(this);
    }

    public abstract j5 k();

    public abstract void m(n5 n5Var);

    public abstract String n(Charset charset);

    public abstract boolean p();

    public abstract int q(int i10, int i11);

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(i());
        objArr[2] = i() <= 50 ? a.y(this) : String.valueOf(a.y(k())).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}

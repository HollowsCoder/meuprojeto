package j4;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import n4.j0;
import n4.l0;
import n4.m;
import u4.a;
import u4.b;

public abstract class n extends l0 {

    /* renamed from: b  reason: collision with root package name */
    public final int f6558b;

    public n(byte[] bArr) {
        m.b(bArr.length == 25);
        this.f6558b = Arrays.hashCode(bArr);
    }

    public static byte[] K(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public abstract byte[] J();

    public final a a() {
        return new b(J());
    }

    public final boolean equals(Object obj) {
        a a10;
        if (obj != null && (obj instanceof j0)) {
            try {
                j0 j0Var = (j0) obj;
                if (j0Var.zzc() != this.f6558b || (a10 = j0Var.a()) == null) {
                    return false;
                }
                return Arrays.equals(J(), (byte[]) b.K(a10));
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6558b;
    }

    public final int zzc() {
        return this.f6558b;
    }
}

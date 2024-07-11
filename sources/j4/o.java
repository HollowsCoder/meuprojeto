package j4;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import n4.m;
import r4.f;

public final /* synthetic */ class o implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6559a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6560b;

    /* renamed from: c  reason: collision with root package name */
    public final n f6561c;

    public o(boolean z, String str, n nVar) {
        this.f6559a = z;
        this.f6560b = str;
        this.f6561c = nVar;
    }

    public final Object call() {
        boolean z;
        String str;
        MessageDigest messageDigest;
        boolean z10 = this.f6559a;
        String str2 = this.f6560b;
        n nVar = this.f6561c;
        if (z10 || !m.a(str2, nVar, true, false).f6569a) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            str = "debug cert rejected";
        } else {
            str = "not allowed";
        }
        Object[] objArr = new Object[5];
        objArr[0] = str;
        objArr[1] = str2;
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-1");
                if (messageDigest != null) {
                    break;
                }
                i10++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        m.h(messageDigest);
        byte[] digest = messageDigest.digest(nVar.J());
        char[] cArr = new char[(digest.length << 1)];
        int i11 = 0;
        for (byte b10 : digest) {
            byte b11 = b10 & 255;
            int i12 = i11 + 1;
            char[] cArr2 = f.f8433b;
            cArr[i11] = cArr2[b11 >>> 4];
            i11 = i12 + 1;
            cArr[i12] = cArr2[b11 & 15];
        }
        objArr[2] = new String(cArr);
        objArr[3] = Boolean.valueOf(z10);
        StringBuilder sb = new StringBuilder(14);
        sb.append("12451009.false");
        objArr[4] = sb.toString();
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", objArr);
    }
}

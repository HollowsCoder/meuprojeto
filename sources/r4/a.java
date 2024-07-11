package r4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import t4.c;

public final class a {
    @Deprecated
    @RecentlyNullable
    public static byte[] a(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        MessageDigest messageDigest;
        PackageInfo b10 = c.a(context).b(str, 64);
        Signature[] signatureArr = b10.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            int i10 = 0;
            while (true) {
                if (i10 >= 2) {
                    messageDigest = null;
                    break;
                }
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        break;
                    }
                    i10++;
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            if (messageDigest != null) {
                return messageDigest.digest(b10.signatures[0].toByteArray());
            }
        }
        return null;
    }
}

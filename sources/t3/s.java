package t3;

import android.util.Base64;
import com.google.auto.value.AutoValue;
import com.karumi.dexter.BuildConfig;
import q3.d;
import t3.j;

@AutoValue
public abstract class s {

    @AutoValue.Builder
    public static abstract class a {
    }

    public static j.a a() {
        j.a aVar = new j.a();
        aVar.c(d.DEFAULT);
        return aVar;
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract d d();

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? BuildConfig.FLAVOR : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}

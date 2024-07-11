package a4;

import b0.d;
import com.google.auto.value.AutoValue;
import com.karumi.dexter.BuildConfig;

@AutoValue
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f69a;

    static {
        String str;
        Long l = 10485760L;
        Integer num = 200;
        Integer num2 = 10000;
        Long l8 = 604800000L;
        Integer num3 = 81920;
        if (l == null) {
            str = " maxStorageSizeInBytes";
        } else {
            str = BuildConfig.FLAVOR;
        }
        if (num == null) {
            str = str.concat(" loadBatchSize");
        }
        if (num2 == null) {
            str = d.e(str, " criticalSectionEnterTimeoutMs");
        }
        if (l8 == null) {
            str = d.e(str, " eventCleanUpAge");
        }
        if (num3 == null) {
            str = d.e(str, " maxBlobByteSizePerRow");
        }
        if (str.isEmpty()) {
            f69a = new a(l.longValue(), num.intValue(), num2.intValue(), l8.longValue(), num3.intValue());
            return;
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public abstract int a();

    public abstract long b();

    public abstract int c();

    public abstract int d();

    public abstract long e();
}

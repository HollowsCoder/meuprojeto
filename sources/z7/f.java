package z7;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class f {

    @AutoValue.Builder
    public static abstract class a {
    }

    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public abstract b a();

    public abstract String b();

    public abstract long c();
}

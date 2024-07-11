package u3;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class g {

    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public abstract long a();

    public abstract a b();
}

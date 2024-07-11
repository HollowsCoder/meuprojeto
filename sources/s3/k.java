package s3;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class k {

    public enum a {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        
        private final int value;

        private a(int i10) {
            this.value = i10;
        }
    }

    public abstract a a();

    public abstract a b();
}

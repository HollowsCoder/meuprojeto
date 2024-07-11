package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.h;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public abstract class p<D extends h> {

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        String value();
    }

    public abstract D a();

    public abstract h b(h hVar, Bundle bundle, m mVar);

    public void c(Bundle bundle) {
    }

    public Bundle d() {
        return null;
    }

    public abstract boolean e();
}

package m6;

import android.graphics.RectF;
import java.util.Arrays;

public final class g implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f7149a;

    public g(float f10) {
        this.f7149a = f10;
    }

    public final float a(RectF rectF) {
        return rectF.height() * this.f7149a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f7149a == ((g) obj).f7149a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f7149a)});
    }
}

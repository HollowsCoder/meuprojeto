package m6;

import android.graphics.RectF;
import java.util.Arrays;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f7118a;

    public a(float f10) {
        this.f7118a = f10;
    }

    public final float a(RectF rectF) {
        return this.f7118a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f7118a == ((a) obj).f7118a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f7118a)});
    }
}

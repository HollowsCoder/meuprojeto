package m6;

import android.graphics.RectF;
import java.util.Arrays;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final c f7119a;

    /* renamed from: b  reason: collision with root package name */
    public final float f7120b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f7119a;
            f10 += ((b) cVar).f7120b;
        }
        this.f7119a = cVar;
        this.f7120b = f10;
    }

    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f7119a.a(rectF) + this.f7120b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f7119a.equals(bVar.f7119a) && this.f7120b == bVar.f7120b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7119a, Float.valueOf(this.f7120b)});
    }
}

package c1;

import android.view.View;
import android.view.WindowId;

public final class b0 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public final WindowId f2084a;

    public b0(View view) {
        this.f2084a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b0) && ((b0) obj).f2084a.equals(this.f2084a);
    }

    public final int hashCode() {
        return this.f2084a.hashCode();
    }
}

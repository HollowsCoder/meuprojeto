package k4;

import androidx.annotation.RecentlyNonNull;
import j4.d;

public final class i extends UnsupportedOperationException {

    /* renamed from: o  reason: collision with root package name */
    public final d f6696o;

    public i(@RecentlyNonNull d dVar) {
        this.f6696o = dVar;
    }

    @RecentlyNonNull
    public final String getMessage() {
        String valueOf = String.valueOf(this.f6696o);
        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}

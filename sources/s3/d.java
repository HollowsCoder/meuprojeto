package s3;

import java.util.ArrayList;
import java.util.List;

public final class d extends j {

    /* renamed from: a  reason: collision with root package name */
    public final List<m> f8757a;

    public d(ArrayList arrayList) {
        this.f8757a = arrayList;
    }

    public final List<m> a() {
        return this.f8757a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f8757a.equals(((j) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f8757a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f8757a + "}";
    }
}

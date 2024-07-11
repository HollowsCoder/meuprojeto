package l4;

import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
import k4.a;
import k4.a.c;
import n4.l;

public final class a<O extends a.c> {

    /* renamed from: a  reason: collision with root package name */
    public final int f6872a;

    /* renamed from: b  reason: collision with root package name */
    public final k4.a<O> f6873b;

    /* renamed from: c  reason: collision with root package name */
    public final O f6874c = null;

    public a(k4.a aVar) {
        this.f6873b = aVar;
        this.f6872a = Arrays.hashCode(new Object[]{aVar, null});
    }

    @RecentlyNonNull
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f6873b, aVar.f6873b) && l.a(this.f6874c, aVar.f6874c);
    }

    @RecentlyNonNull
    public final int hashCode() {
        return this.f6872a;
    }
}

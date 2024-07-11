package t3;

import java.util.Set;
import q3.b;
import q3.e;
import q3.g;

public final class t implements g {

    /* renamed from: a  reason: collision with root package name */
    public final Set<b> f8975a;

    /* renamed from: b  reason: collision with root package name */
    public final s f8976b;

    /* renamed from: c  reason: collision with root package name */
    public final w f8977c;

    public t(Set set, j jVar, w wVar) {
        this.f8975a = set;
        this.f8976b = jVar;
        this.f8977c = wVar;
    }

    public final v a(String str, b bVar, e eVar) {
        Set<b> set = this.f8975a;
        if (set.contains(bVar)) {
            return new v(this.f8976b, str, bVar, eVar, this.f8977c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, set}));
    }
}

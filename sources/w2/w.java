package w2;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import q2.h;
import w2.n;

public final class w<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f9230b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a  reason: collision with root package name */
    public final n<f, Data> f9231a;

    public static class a implements o<Uri, InputStream> {
        public final n<Uri, InputStream> b(r rVar) {
            return new w(rVar.b(f.class, InputStream.class));
        }
    }

    public w(n<f, Data> nVar) {
        this.f9231a = nVar;
    }

    public final n.a a(Object obj, int i10, int i11, h hVar) {
        return this.f9231a.a(new f(((Uri) obj).toString()), i10, i11, hVar);
    }

    public final boolean b(Object obj) {
        return f9230b.contains(((Uri) obj).getScheme());
    }
}

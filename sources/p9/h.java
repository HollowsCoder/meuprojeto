package p9;

import java.io.IOException;
import java.util.List;
import l9.a;
import p9.f;

public final class h extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ r f8026e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f.d f8027f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ List f8028g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(String str, r rVar, f.d dVar, List list) {
        super(str, true);
        this.f8026e = rVar;
        this.f8027f = dVar;
        this.f8028g = list;
    }

    public final long a() {
        try {
            f.this.f7997p.b(this.f8026e);
            return -1;
        } catch (IOException e10) {
            r9.h.f8494c.getClass();
            r9.h.f8492a.getClass();
            r9.h.i(4, "Http2Connection.Listener failure for " + f.this.f7999r, e10);
            try {
                this.f8026e.c(b.PROTOCOL_ERROR, e10);
                return -1;
            } catch (IOException unused) {
                return -1;
            }
        }
    }
}

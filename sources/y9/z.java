package y9;

import androidx.appcompat.widget.x0;
import i9.b0;
import i9.o;
import i9.q;
import i9.r;
import i9.t;
import i9.u;
import i9.x;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Pattern;
import w9.h;
import z8.g;

public final class z {
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f9774m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a  reason: collision with root package name */
    public final String f9775a;

    /* renamed from: b  reason: collision with root package name */
    public final r f9776b;

    /* renamed from: c  reason: collision with root package name */
    public String f9777c;
    public r.a d;

    /* renamed from: e  reason: collision with root package name */
    public final x.a f9778e = new x.a();

    /* renamed from: f  reason: collision with root package name */
    public final q.a f9779f;

    /* renamed from: g  reason: collision with root package name */
    public t f9780g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f9781h;

    /* renamed from: i  reason: collision with root package name */
    public final u.a f9782i;

    /* renamed from: j  reason: collision with root package name */
    public final o.a f9783j;

    /* renamed from: k  reason: collision with root package name */
    public b0 f9784k;

    public static class a extends b0 {

        /* renamed from: b  reason: collision with root package name */
        public final b0 f9785b;

        /* renamed from: c  reason: collision with root package name */
        public final t f9786c;

        public a(b0 b0Var, t tVar) {
            this.f9785b = b0Var;
            this.f9786c = tVar;
        }

        public final long a() {
            return this.f9785b.a();
        }

        public final t b() {
            return this.f9786c;
        }

        public final void c(h hVar) {
            this.f9785b.c(hVar);
        }
    }

    public z(String str, r rVar, String str2, q qVar, t tVar, boolean z, boolean z10, boolean z11) {
        q.a aVar;
        this.f9775a = str;
        this.f9776b = rVar;
        this.f9777c = str2;
        this.f9780g = tVar;
        this.f9781h = z;
        if (qVar != null) {
            aVar = qVar.i();
        } else {
            aVar = new q.a();
        }
        this.f9779f = aVar;
        if (z10) {
            this.f9783j = new o.a();
        } else if (z11) {
            u.a aVar2 = new u.a();
            this.f9782i = aVar2;
            t tVar2 = u.f6325g;
            g.f(tVar2, "type");
            if (g.a(tVar2.f6322b, "multipart")) {
                aVar2.f6333b = tVar2;
                return;
            }
            throw new IllegalArgumentException(("multipart != " + tVar2).toString());
        }
    }

    public final void a(String str, String str2, boolean z) {
        String str3 = str;
        o.a aVar = this.f9783j;
        aVar.getClass();
        ArrayList arrayList = aVar.f6290b;
        ArrayList arrayList2 = aVar.f6289a;
        if (z) {
            g.f(str3, "name");
            r.b bVar = r.l;
            arrayList2.add(r.b.a(bVar, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f6291c, 83));
            arrayList.add(r.b.a(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f6291c, 83));
            return;
        }
        g.f(str3, "name");
        r.b bVar2 = r.l;
        arrayList2.add(r.b.a(bVar2, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, aVar.f6291c, 91));
        arrayList.add(r.b.a(bVar2, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, aVar.f6291c, 91));
    }

    public final void b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                t.f6320f.getClass();
                this.f9780g = t.a.a(str2);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException(x0.e("Malformed content type: ", str2), e10);
            }
        } else {
            this.f9779f.a(str, str2);
        }
    }

    public final void c(String str, String str2, boolean z) {
        r.a aVar;
        String str3 = str;
        String str4 = this.f9777c;
        String str5 = null;
        if (str4 != null) {
            r rVar = this.f9776b;
            rVar.getClass();
            try {
                aVar = new r.a();
                aVar.c(rVar, str4);
            } catch (IllegalArgumentException unused) {
                aVar = null;
            }
            this.d = aVar;
            if (aVar != null) {
                this.f9777c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + rVar + ", Relative: " + this.f9777c);
            }
        }
        r.a aVar2 = this.d;
        aVar2.getClass();
        if (z) {
            g.f(str3, "encodedName");
            if (aVar2.f6317g == null) {
                aVar2.f6317g = new ArrayList();
            }
            ArrayList arrayList = aVar2.f6317g;
            g.c(arrayList);
            r.b bVar = r.l;
            arrayList.add(r.b.a(bVar, str, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211));
            ArrayList arrayList2 = aVar2.f6317g;
            g.c(arrayList2);
            if (str2 != null) {
                str5 = r.b.a(bVar, str2, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211);
            }
            arrayList2.add(str5);
            return;
        }
        g.f(str3, "name");
        if (aVar2.f6317g == null) {
            aVar2.f6317g = new ArrayList();
        }
        ArrayList arrayList3 = aVar2.f6317g;
        g.c(arrayList3);
        r.b bVar2 = r.l;
        arrayList3.add(r.b.a(bVar2, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219));
        ArrayList arrayList4 = aVar2.f6317g;
        g.c(arrayList4);
        if (str2 != null) {
            str5 = r.b.a(bVar2, str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219);
        }
        arrayList4.add(str5);
    }
}

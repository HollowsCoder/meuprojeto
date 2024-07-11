package x2;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import l3.b;
import q2.h;
import r2.b;
import w2.n;
import w2.o;
import w2.r;
import z2.c0;

public final class c implements n<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9449a;

    public static class a implements o<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f9450a;

        public a(Context context) {
            this.f9450a = context;
        }

        public final n<Uri, InputStream> b(r rVar) {
            return new c(this.f9450a);
        }
    }

    public c(Context context) {
        this.f9449a = context.getApplicationContext();
    }

    public final n.a a(Object obj, int i10, int i11, h hVar) {
        boolean z;
        Uri uri = (Uri) obj;
        boolean z10 = true;
        if (i10 == Integer.MIN_VALUE || i11 == Integer.MIN_VALUE || i10 > 512 || i11 > 384) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Long l = (Long) hVar.c(c0.d);
            if (l == null || l.longValue() != -1) {
                z10 = false;
            }
            if (z10) {
                b bVar = new b(uri);
                Context context = this.f9449a;
                return new n.a(bVar, r2.b.c(context, uri, new b.C0120b(context.getContentResolver())));
            }
        }
        return null;
    }

    public final boolean b(Object obj) {
        Uri uri = (Uri) obj;
        if (!s6.a.x(uri) || !uri.getPathSegments().contains("video")) {
            return false;
        }
        return true;
    }
}

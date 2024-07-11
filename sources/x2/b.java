package x2;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import q2.h;
import r2.b;
import w2.n;
import w2.o;
import w2.r;

public final class b implements n<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9447a;

    public static class a implements o<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f9448a;

        public a(Context context) {
            this.f9448a = context;
        }

        public final n<Uri, InputStream> b(r rVar) {
            return new b(this.f9448a);
        }
    }

    public b(Context context) {
        this.f9447a = context.getApplicationContext();
    }

    public final n.a a(Object obj, int i10, int i11, h hVar) {
        boolean z;
        Uri uri = (Uri) obj;
        if (i10 == Integer.MIN_VALUE || i11 == Integer.MIN_VALUE || i10 > 512 || i11 > 384) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return null;
        }
        l3.b bVar = new l3.b(uri);
        Context context = this.f9447a;
        return new n.a(bVar, r2.b.c(context, uri, new b.a(context.getContentResolver())));
    }

    public final boolean b(Object obj) {
        Uri uri = (Uri) obj;
        if (!s6.a.x(uri) || uri.getPathSegments().contains("video")) {
            return false;
        }
        return true;
    }
}

package w2;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import q2.h;
import w2.n;

public final class j implements n<Uri, File> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9183a;

    public static final class a implements o<Uri, File> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f9184a;

        public a(Context context) {
            this.f9184a = context;
        }

        public final n<Uri, File> b(r rVar) {
            return new j(this.f9184a);
        }
    }

    public static class b implements d<File> {

        /* renamed from: q  reason: collision with root package name */
        public static final String[] f9185q = {"_data"};

        /* renamed from: o  reason: collision with root package name */
        public final Context f9186o;

        /* renamed from: p  reason: collision with root package name */
        public final Uri f9187p;

        public b(Context context, Uri uri) {
            this.f9186o = context;
            this.f9187p = uri;
        }

        public final Class<File> a() {
            return File.class;
        }

        public final void b() {
        }

        public final void cancel() {
        }

        public final q2.a e() {
            return q2.a.LOCAL;
        }

        public final void f(com.bumptech.glide.j jVar, d.a<? super File> aVar) {
            Cursor query = this.f9186o.getContentResolver().query(this.f9187p, f9185q, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f9187p));
                return;
            }
            aVar.d(new File(str));
        }
    }

    public j(Context context) {
        this.f9183a = context;
    }

    public final n.a a(Object obj, int i10, int i11, h hVar) {
        Uri uri = (Uri) obj;
        return new n.a(new l3.b(uri), new b(this.f9183a, uri));
    }

    public final boolean b(Object obj) {
        return s6.a.x((Uri) obj);
    }
}

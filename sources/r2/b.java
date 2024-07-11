package r2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class b implements d<InputStream> {

    /* renamed from: o  reason: collision with root package name */
    public final Uri f8401o;

    /* renamed from: p  reason: collision with root package name */
    public final d f8402p;

    /* renamed from: q  reason: collision with root package name */
    public InputStream f8403q;

    public static class a implements c {

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f8404b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f8405a;

        public a(ContentResolver contentResolver) {
            this.f8405a = contentResolver;
        }

        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f8405a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f8404b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    /* renamed from: r2.b$b  reason: collision with other inner class name */
    public static class C0120b implements c {

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f8406b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f8407a;

        public C0120b(ContentResolver contentResolver) {
            this.f8407a = contentResolver;
        }

        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f8407a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f8406b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    public b(Uri uri, d dVar) {
        this.f8401o = uri;
        this.f8402p = dVar;
    }

    public static b c(Context context, Uri uri, c cVar) {
        return new b(uri, new d(com.bumptech.glide.b.b(context).f2235r.d(), cVar, com.bumptech.glide.b.b(context).f2236s, context.getContentResolver()));
    }

    public final Class<InputStream> a() {
        return InputStream.class;
    }

    public final void b() {
        InputStream inputStream = this.f8403q;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public final void cancel() {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r7 != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r7 == null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        r3 = r5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039 A[Catch:{ all -> 0x0024 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.InputStream d() {
        /*
            r12 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            android.net.Uri r1 = r12.f8401o
            r2.d r2 = r12.f8402p
            r2.getClass()
            java.lang.String r3 = "Failed to query for thumbnail for Uri: "
            r4 = 3
            r5 = 0
            r6 = 0
            r2.c r7 = r2.f8408a     // Catch:{ SecurityException -> 0x0030, all -> 0x002d }
            android.database.Cursor r7 = r7.a(r1)     // Catch:{ SecurityException -> 0x0030, all -> 0x002d }
            if (r7 == 0) goto L_0x002a
            boolean r8 = r7.moveToFirst()     // Catch:{ SecurityException -> 0x0028 }
            if (r8 == 0) goto L_0x002a
            java.lang.String r3 = r7.getString(r6)     // Catch:{ SecurityException -> 0x0028 }
            r7.close()
            goto L_0x004e
        L_0x0024:
            r0 = move-exception
            r5 = r7
            goto L_0x00e8
        L_0x0028:
            r8 = move-exception
            goto L_0x0033
        L_0x002a:
            if (r7 == 0) goto L_0x004d
            goto L_0x004a
        L_0x002d:
            r0 = move-exception
            goto L_0x00e8
        L_0x0030:
            r7 = move-exception
            r8 = r7
            r7 = r5
        L_0x0033:
            boolean r9 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0024 }
            if (r9 == 0) goto L_0x0048
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0024 }
            r9.<init>(r3)     // Catch:{ all -> 0x0024 }
            r9.append(r1)     // Catch:{ all -> 0x0024 }
            java.lang.String r3 = r9.toString()     // Catch:{ all -> 0x0024 }
            android.util.Log.d(r0, r3, r8)     // Catch:{ all -> 0x0024 }
        L_0x0048:
            if (r7 == 0) goto L_0x004d
        L_0x004a:
            r7.close()
        L_0x004d:
            r3 = r5
        L_0x004e:
            boolean r7 = android.text.TextUtils.isEmpty(r3)
            if (r7 == 0) goto L_0x0056
        L_0x0054:
            r3 = r5
            goto L_0x0079
        L_0x0056:
            java.io.File r7 = new java.io.File
            r7.<init>(r3)
            boolean r3 = r7.exists()
            if (r3 == 0) goto L_0x006c
            long r8 = r7.length()
            r10 = 0
            int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x006c
            r6 = 1
        L_0x006c:
            if (r6 != 0) goto L_0x006f
            goto L_0x0054
        L_0x006f:
            android.net.Uri r3 = android.net.Uri.fromFile(r7)
            android.content.ContentResolver r6 = r2.f8410c     // Catch:{ NullPointerException -> 0x00c5 }
            java.io.InputStream r3 = r6.openInputStream(r3)     // Catch:{ NullPointerException -> 0x00c5 }
        L_0x0079:
            r6 = -1
            if (r3 == 0) goto L_0x00bb
            r2.getClass()
            java.lang.String r7 = "Failed to open uri: "
            android.content.ContentResolver r8 = r2.f8410c     // Catch:{ IOException -> 0x0099, NullPointerException -> 0x0097 }
            java.io.InputStream r5 = r8.openInputStream(r1)     // Catch:{ IOException -> 0x0099, NullPointerException -> 0x0097 }
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r8 = r2.d     // Catch:{ IOException -> 0x0099, NullPointerException -> 0x0097 }
            t2.b r2 = r2.f8409b     // Catch:{ IOException -> 0x0099, NullPointerException -> 0x0097 }
            int r0 = com.bumptech.glide.load.a.a(r2, r5, r8)     // Catch:{ IOException -> 0x0099, NullPointerException -> 0x0097 }
            if (r5 == 0) goto L_0x00bc
            r5.close()     // Catch:{ IOException -> 0x00bc }
            goto L_0x00bc
        L_0x0095:
            r0 = move-exception
            goto L_0x00b5
        L_0x0097:
            r2 = move-exception
            goto L_0x009a
        L_0x0099:
            r2 = move-exception
        L_0x009a:
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0095 }
            if (r4 == 0) goto L_0x00af
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0095 }
            r4.<init>(r7)     // Catch:{ all -> 0x0095 }
            r4.append(r1)     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0095 }
            android.util.Log.d(r0, r1, r2)     // Catch:{ all -> 0x0095 }
        L_0x00af:
            if (r5 == 0) goto L_0x00bb
            r5.close()     // Catch:{ IOException -> 0x00bb }
            goto L_0x00bb
        L_0x00b5:
            if (r5 == 0) goto L_0x00ba
            r5.close()     // Catch:{ IOException -> 0x00ba }
        L_0x00ba:
            throw r0
        L_0x00bb:
            r0 = r6
        L_0x00bc:
            if (r0 == r6) goto L_0x00c4
            com.bumptech.glide.load.data.g r1 = new com.bumptech.glide.load.data.g
            r1.<init>(r3, r0)
            r3 = r1
        L_0x00c4:
            return r3
        L_0x00c5:
            r0 = move-exception
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "NPE opening uri: "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = " -> "
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            r2.<init>(r1)
            java.lang.Throwable r0 = r2.initCause(r0)
            java.io.FileNotFoundException r0 = (java.io.FileNotFoundException) r0
            throw r0
        L_0x00e8:
            if (r5 == 0) goto L_0x00ed
            r5.close()
        L_0x00ed:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.b.d():java.io.InputStream");
    }

    public final q2.a e() {
        return q2.a.LOCAL;
    }

    public final void f(j jVar, d.a<? super InputStream> aVar) {
        try {
            InputStream d = d();
            this.f8403q = d;
            aVar.d(d);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e10);
            }
            aVar.c(e10);
        }
    }
}

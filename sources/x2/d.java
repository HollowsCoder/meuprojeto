package x2;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import q2.h;
import w2.n;
import w2.o;
import w2.r;

public final class d<DataT> implements n<Uri, DataT> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9451a;

    /* renamed from: b  reason: collision with root package name */
    public final n<File, DataT> f9452b;

    /* renamed from: c  reason: collision with root package name */
    public final n<Uri, DataT> f9453c;
    public final Class<DataT> d;

    public static abstract class a<DataT> implements o<Uri, DataT> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f9454a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<DataT> f9455b;

        public a(Context context, Class<DataT> cls) {
            this.f9454a = context;
            this.f9455b = cls;
        }

        public final n<Uri, DataT> b(r rVar) {
            Class<DataT> cls = this.f9455b;
            return new d(this.f9454a, rVar.b(File.class, cls), rVar.b(Uri.class, cls), cls);
        }
    }

    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: x2.d$d  reason: collision with other inner class name */
    public static final class C0160d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: y  reason: collision with root package name */
        public static final String[] f9456y = {"_data"};

        /* renamed from: o  reason: collision with root package name */
        public final Context f9457o;

        /* renamed from: p  reason: collision with root package name */
        public final n<File, DataT> f9458p;

        /* renamed from: q  reason: collision with root package name */
        public final n<Uri, DataT> f9459q;

        /* renamed from: r  reason: collision with root package name */
        public final Uri f9460r;

        /* renamed from: s  reason: collision with root package name */
        public final int f9461s;

        /* renamed from: t  reason: collision with root package name */
        public final int f9462t;
        public final h u;

        /* renamed from: v  reason: collision with root package name */
        public final Class<DataT> f9463v;
        public volatile boolean w;

        /* renamed from: x  reason: collision with root package name */
        public volatile com.bumptech.glide.load.data.d<DataT> f9464x;

        public C0160d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i10, int i11, h hVar, Class<DataT> cls) {
            this.f9457o = context.getApplicationContext();
            this.f9458p = nVar;
            this.f9459q = nVar2;
            this.f9460r = uri;
            this.f9461s = i10;
            this.f9462t = i11;
            this.u = hVar;
            this.f9463v = cls;
        }

        public final Class<DataT> a() {
            return this.f9463v;
        }

        public final void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f9464x;
            if (dVar != null) {
                dVar.b();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bumptech.glide.load.data.d<DataT> c() {
            /*
                r14 = this;
                boolean r0 = android.os.Environment.isExternalStorageLegacy()
                r1 = 0
                q2.h r2 = r14.u
                int r3 = r14.f9462t
                int r4 = r14.f9461s
                android.content.Context r5 = r14.f9457o
                if (r0 == 0) goto L_0x0078
                android.net.Uri r0 = r14.f9460r
                java.lang.String r12 = "File path was empty in media store for: "
                java.lang.String r13 = "Failed to media store entry for: "
                android.content.ContentResolver r6 = r5.getContentResolver()     // Catch:{ all -> 0x0071 }
                java.lang.String[] r8 = f9456y     // Catch:{ all -> 0x0071 }
                r9 = 0
                r10 = 0
                r11 = 0
                r7 = r0
                android.database.Cursor r5 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0071 }
                if (r5 == 0) goto L_0x005c
                boolean r6 = r5.moveToFirst()     // Catch:{ all -> 0x006e }
                if (r6 == 0) goto L_0x005c
                java.lang.String r6 = "_data"
                int r6 = r5.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x006e }
                java.lang.String r6 = r5.getString(r6)     // Catch:{ all -> 0x006e }
                boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x006e }
                if (r7 != 0) goto L_0x004a
                java.io.File r0 = new java.io.File     // Catch:{ all -> 0x006e }
                r0.<init>(r6)     // Catch:{ all -> 0x006e }
                r5.close()
                w2.n<java.io.File, DataT> r5 = r14.f9458p
                w2.n$a r0 = r5.a(r0, r4, r3, r2)
                goto L_0x0091
            L_0x004a:
                java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ all -> 0x006e }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
                r2.<init>(r12)     // Catch:{ all -> 0x006e }
                r2.append(r0)     // Catch:{ all -> 0x006e }
                java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x006e }
                r1.<init>(r0)     // Catch:{ all -> 0x006e }
                throw r1     // Catch:{ all -> 0x006e }
            L_0x005c:
                java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ all -> 0x006e }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
                r2.<init>(r13)     // Catch:{ all -> 0x006e }
                r2.append(r0)     // Catch:{ all -> 0x006e }
                java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x006e }
                r1.<init>(r0)     // Catch:{ all -> 0x006e }
                throw r1     // Catch:{ all -> 0x006e }
            L_0x006e:
                r0 = move-exception
                r1 = r5
                goto L_0x0072
            L_0x0071:
                r0 = move-exception
            L_0x0072:
                if (r1 == 0) goto L_0x0077
                r1.close()
            L_0x0077:
                throw r0
            L_0x0078:
                java.lang.String r0 = "android.permission.ACCESS_MEDIA_LOCATION"
                int r0 = r5.checkSelfPermission(r0)
                if (r0 != 0) goto L_0x0082
                r0 = 1
                goto L_0x0083
            L_0x0082:
                r0 = 0
            L_0x0083:
                android.net.Uri r5 = r14.f9460r
                if (r0 == 0) goto L_0x008b
                android.net.Uri r5 = android.provider.MediaStore.setRequireOriginal(r5)
            L_0x008b:
                w2.n<android.net.Uri, DataT> r0 = r14.f9459q
                w2.n$a r0 = r0.a(r5, r4, r3, r2)
            L_0x0091:
                if (r0 == 0) goto L_0x0095
                com.bumptech.glide.load.data.d<Data> r1 = r0.f9194c
            L_0x0095:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: x2.d.C0160d.c():com.bumptech.glide.load.data.d");
        }

        public final void cancel() {
            this.w = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f9464x;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        public final q2.a e() {
            return q2.a.LOCAL;
        }

        public final void f(j jVar, d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> c10 = c();
                if (c10 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f9460r));
                    return;
                }
                this.f9464x = c10;
                if (this.w) {
                    cancel();
                } else {
                    c10.f(jVar, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.c(e10);
            }
        }
    }

    public d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f9451a = context.getApplicationContext();
        this.f9452b = nVar;
        this.f9453c = nVar2;
        this.d = cls;
    }

    public final n.a a(Object obj, int i10, int i11, h hVar) {
        Uri uri = (Uri) obj;
        return new n.a(new l3.b(uri), new C0160d(this.f9451a, this.f9452b, this.f9453c, uri, i10, i11, hVar, this.d));
    }

    public final boolean b(Object obj) {
        Uri uri = (Uri) obj;
        if (Build.VERSION.SDK_INT < 29 || !s6.a.x(uri)) {
            return false;
        }
        return true;
    }
}

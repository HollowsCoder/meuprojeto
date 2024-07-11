package z2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.j;
import java.io.InputStream;
import java.util.List;

public interface s {

    public static final class a implements s {

        /* renamed from: a  reason: collision with root package name */
        public final j f9850a;

        /* renamed from: b  reason: collision with root package name */
        public final t2.b f9851b;

        /* renamed from: c  reason: collision with root package name */
        public final List<ImageHeaderParser> f9852c;

        public a(t2.b bVar, InputStream inputStream, List list) {
            s6.a.n(bVar);
            this.f9851b = bVar;
            s6.a.n(list);
            this.f9852c = list;
            this.f9850a = new j(inputStream, bVar);
        }

        public final Bitmap a(BitmapFactory.Options options) {
            w wVar = this.f9850a.f2284a;
            wVar.reset();
            return BitmapFactory.decodeStream(wVar, (Rect) null, options);
        }

        public final void b() {
            w wVar = this.f9850a.f2284a;
            synchronized (wVar) {
                wVar.f9862q = wVar.f9860o.length;
            }
        }

        public final int c() {
            w wVar = this.f9850a.f2284a;
            wVar.reset();
            return com.bumptech.glide.load.a.a(this.f9851b, wVar, this.f9852c);
        }

        public final ImageHeaderParser.ImageType d() {
            w wVar = this.f9850a.f2284a;
            wVar.reset();
            return com.bumptech.glide.load.a.b(this.f9851b, wVar, this.f9852c);
        }
    }

    public static final class b implements s {

        /* renamed from: a  reason: collision with root package name */
        public final t2.b f9853a;

        /* renamed from: b  reason: collision with root package name */
        public final List<ImageHeaderParser> f9854b;

        /* renamed from: c  reason: collision with root package name */
        public final ParcelFileDescriptorRewinder f9855c;

        public b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, t2.b bVar) {
            s6.a.n(bVar);
            this.f9853a = bVar;
            s6.a.n(list);
            this.f9854b = list;
            this.f9855c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        public final Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f9855c.a().getFileDescriptor(), (Rect) null, options);
        }

        public final void b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x003d A[SYNTHETIC, Splitter:B:19:0x003d] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int c() {
            /*
                r10 = this;
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r10.f9855c
                t2.b r1 = r10.f9853a
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r2 = r10.f9854b
                int r3 = r2.size()
                r4 = 0
            L_0x000b:
                r5 = -1
                if (r4 >= r3) goto L_0x0044
                java.lang.Object r6 = r2.get(r4)
                com.bumptech.glide.load.ImageHeaderParser r6 = (com.bumptech.glide.load.ImageHeaderParser) r6
                z2.w r7 = new z2.w     // Catch:{ all -> 0x0039 }
                java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ all -> 0x0039 }
                android.os.ParcelFileDescriptor r9 = r0.a()     // Catch:{ all -> 0x0039 }
                java.io.FileDescriptor r9 = r9.getFileDescriptor()     // Catch:{ all -> 0x0039 }
                r8.<init>(r9)     // Catch:{ all -> 0x0039 }
                r7.<init>(r8, r1)     // Catch:{ all -> 0x0039 }
                int r6 = r6.c(r7, r1)     // Catch:{ all -> 0x0037 }
                r7.close()     // Catch:{ IOException -> 0x002d }
            L_0x002d:
                r0.a()
                if (r6 == r5) goto L_0x0034
                r5 = r6
                goto L_0x0044
            L_0x0034:
                int r4 = r4 + 1
                goto L_0x000b
            L_0x0037:
                r1 = move-exception
                goto L_0x003b
            L_0x0039:
                r1 = move-exception
                r7 = 0
            L_0x003b:
                if (r7 == 0) goto L_0x0040
                r7.close()     // Catch:{ IOException -> 0x0040 }
            L_0x0040:
                r0.a()
                throw r1
            L_0x0044:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: z2.s.b.c():int");
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x003d A[SYNTHETIC, Splitter:B:17:0x003d] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bumptech.glide.load.ImageHeaderParser.ImageType d() {
            /*
                r9 = this;
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r9.f9855c
                t2.b r1 = r9.f9853a
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r2 = r9.f9854b
                int r3 = r2.size()
                r4 = 0
            L_0x000b:
                if (r4 >= r3) goto L_0x0044
                java.lang.Object r5 = r2.get(r4)
                com.bumptech.glide.load.ImageHeaderParser r5 = (com.bumptech.glide.load.ImageHeaderParser) r5
                z2.w r6 = new z2.w     // Catch:{ all -> 0x0039 }
                java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ all -> 0x0039 }
                android.os.ParcelFileDescriptor r8 = r0.a()     // Catch:{ all -> 0x0039 }
                java.io.FileDescriptor r8 = r8.getFileDescriptor()     // Catch:{ all -> 0x0039 }
                r7.<init>(r8)     // Catch:{ all -> 0x0039 }
                r6.<init>(r7, r1)     // Catch:{ all -> 0x0039 }
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.b(r6)     // Catch:{ all -> 0x0037 }
                r6.close()     // Catch:{ IOException -> 0x002c }
            L_0x002c:
                r0.a()
                com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
                if (r5 == r6) goto L_0x0034
                goto L_0x0046
            L_0x0034:
                int r4 = r4 + 1
                goto L_0x000b
            L_0x0037:
                r1 = move-exception
                goto L_0x003b
            L_0x0039:
                r1 = move-exception
                r6 = 0
            L_0x003b:
                if (r6 == 0) goto L_0x0040
                r6.close()     // Catch:{ IOException -> 0x0040 }
            L_0x0040:
                r0.a()
                throw r1
            L_0x0044:
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            L_0x0046:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: z2.s.b.d():com.bumptech.glide.load.ImageHeaderParser$ImageType");
        }
    }

    Bitmap a(BitmapFactory.Options options);

    void b();

    int c();

    ImageHeaderParser.ImageType d();
}

package z2;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import q2.g;
import q2.j;
import s2.w;

public final class c0<T> implements j<T, Bitmap> {
    public static final q2.g<Long> d = new q2.g<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e  reason: collision with root package name */
    public static final q2.g<Integer> f9800e = new q2.g<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f  reason: collision with root package name */
    public static final e f9801f = new e();

    /* renamed from: a  reason: collision with root package name */
    public final f<T> f9802a;

    /* renamed from: b  reason: collision with root package name */
    public final t2.c f9803b;

    /* renamed from: c  reason: collision with root package name */
    public final e f9804c = f9801f;

    public class a implements g.b<Long> {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f9805a = ByteBuffer.allocate(8);

        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
            Long l = (Long) obj;
            messageDigest.update(bArr);
            synchronized (this.f9805a) {
                this.f9805a.position(0);
                messageDigest.update(this.f9805a.putLong(l.longValue()).array());
            }
        }
    }

    public class b implements g.b<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f9806a = ByteBuffer.allocate(4);

        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
            Integer num = (Integer) obj;
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f9806a) {
                    this.f9806a.position(0);
                    messageDigest.update(this.f9806a.putInt(num.intValue()).array());
                }
            }
        }
    }

    public static final class c implements f<AssetFileDescriptor> {
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    public static final class d implements f<ByteBuffer> {
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(new d0((ByteBuffer) obj));
        }
    }

    public static class e {
    }

    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t10);
    }

    public static final class g implements f<ParcelFileDescriptor> {
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
        }
    }

    public static final class h extends RuntimeException {
        public h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public c0(t2.c cVar, f<T> fVar) {
        this.f9803b = cVar;
        this.f9802a = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0069 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap c(android.media.MediaMetadataRetriever r9, long r10, int r12, int r13, int r14, z2.k r15) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L_0x0060
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r0) goto L_0x0060
            if (r14 == r0) goto L_0x0060
            z2.k$f r0 = z2.k.d
            if (r15 == r0) goto L_0x0060
            r0 = 18
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch:{ all -> 0x0051 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0051 }
            r1 = 19
            java.lang.String r1 = r9.extractMetadata(r1)     // Catch:{ all -> 0x0051 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0051 }
            r2 = 24
            java.lang.String r2 = r9.extractMetadata(r2)     // Catch:{ all -> 0x0051 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x0051 }
            r3 = 90
            if (r2 == r3) goto L_0x0036
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L_0x0039
        L_0x0036:
            r8 = r1
            r1 = r0
            r0 = r8
        L_0x0039:
            float r13 = r15.b(r0, r1, r13, r14)     // Catch:{ all -> 0x0051 }
            float r14 = (float) r0     // Catch:{ all -> 0x0051 }
            float r14 = r14 * r13
            int r6 = java.lang.Math.round(r14)     // Catch:{ all -> 0x0051 }
            float r14 = (float) r1     // Catch:{ all -> 0x0051 }
            float r13 = r13 * r14
            int r7 = java.lang.Math.round(r13)     // Catch:{ all -> 0x0051 }
            r2 = r9
            r3 = r10
            r5 = r12
            android.graphics.Bitmap r13 = r2.getScaledFrameAtTime(r3, r5, r6, r7)     // Catch:{ all -> 0x0051 }
            goto L_0x0061
        L_0x0051:
            r13 = move-exception
            r14 = 3
            java.lang.String r15 = "VideoDecoder"
            boolean r14 = android.util.Log.isLoggable(r15, r14)
            if (r14 == 0) goto L_0x0060
            java.lang.String r14 = "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame"
            android.util.Log.d(r15, r14, r13)
        L_0x0060:
            r13 = 0
        L_0x0061:
            if (r13 != 0) goto L_0x0067
            android.graphics.Bitmap r13 = r9.getFrameAtTime(r10, r12)
        L_0x0067:
            if (r13 == 0) goto L_0x006a
            return r13
        L_0x006a:
            z2.c0$h r9 = new z2.c0$h
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.c0.c(android.media.MediaMetadataRetriever, long, int, int, int, z2.k):android.graphics.Bitmap");
    }

    /* JADX INFO: finally extract failed */
    public final w<Bitmap> a(T t10, int i10, int i11, q2.h hVar) {
        long longValue = ((Long) hVar.c(d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) hVar.c(f9800e);
            if (num == null) {
                num = 2;
            }
            k kVar = (k) hVar.c(k.f9824f);
            if (kVar == null) {
                kVar = k.f9823e;
            }
            k kVar2 = kVar;
            this.f9804c.getClass();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                this.f9802a.a(mediaMetadataRetriever, t10);
                Bitmap c10 = c(mediaMetadataRetriever, longValue, num.intValue(), i10, i11, kVar2);
                mediaMetadataRetriever.release();
                return d.e(c10, this.f9803b);
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        } else {
            throw new IllegalArgumentException(b0.d.d("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
    }

    public final boolean b(T t10, q2.h hVar) {
        return true;
    }
}

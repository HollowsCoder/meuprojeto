package d3;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import d3.c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import m3.f;
import p2.d;
import p2.e;
import q2.h;
import q2.j;
import s2.w;
import t2.c;

public final class a implements j<ByteBuffer, c> {

    /* renamed from: f  reason: collision with root package name */
    public static final C0051a f4142f = new C0051a();

    /* renamed from: g  reason: collision with root package name */
    public static final b f4143g = new b();

    /* renamed from: a  reason: collision with root package name */
    public final Context f4144a;

    /* renamed from: b  reason: collision with root package name */
    public final List<ImageHeaderParser> f4145b;

    /* renamed from: c  reason: collision with root package name */
    public final b f4146c = f4143g;
    public final C0051a d;

    /* renamed from: e  reason: collision with root package name */
    public final b f4147e;

    /* renamed from: d3.a$a  reason: collision with other inner class name */
    public static class C0051a {
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayDeque f4148a = new ArrayDeque(0);

        public b() {
            char[] cArr = m3.j.f7084a;
        }
    }

    public a(Context context, List<ImageHeaderParser> list, c cVar, t2.b bVar) {
        C0051a aVar = f4142f;
        this.f4144a = context.getApplicationContext();
        this.f4145b = list;
        this.d = aVar;
        this.f4147e = new b(cVar, bVar);
    }

    public static int d(p2.c cVar, int i10, int i11) {
        int i12;
        int min = Math.min(cVar.f7866g / i11, cVar.f7865f / i10);
        if (min == 0) {
            i12 = 0;
        } else {
            i12 = Integer.highestOneBit(min);
        }
        int max = Math.max(1, i12);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i10 + "x" + i11 + "], actual dimens: [" + cVar.f7865f + "x" + cVar.f7866g + "]");
        }
        return max;
    }

    public final w a(Object obj, int i10, int i11, h hVar) {
        d dVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        b bVar = this.f4146c;
        synchronized (bVar) {
            d dVar2 = (d) bVar.f4148a.poll();
            if (dVar2 == null) {
                dVar2 = new d();
            }
            dVar = dVar2;
            dVar.f7872b = null;
            Arrays.fill(dVar.f7871a, (byte) 0);
            dVar.f7873c = new p2.c();
            dVar.d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            dVar.f7872b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            dVar.f7872b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            d c10 = c(byteBuffer, i10, i11, dVar, hVar);
            b bVar2 = this.f4146c;
            synchronized (bVar2) {
                dVar.f7872b = null;
                dVar.f7873c = null;
                bVar2.f4148a.offer(dVar);
            }
            return c10;
        } catch (Throwable th) {
            b bVar3 = this.f4146c;
            synchronized (bVar3) {
                dVar.f7872b = null;
                dVar.f7873c = null;
                bVar3.f4148a.offer(dVar);
                throw th;
            }
        }
    }

    public final boolean b(Object obj, h hVar) {
        ImageHeaderParser.ImageType imageType;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (((Boolean) hVar.c(g.f4181b)).booleanValue()) {
            return false;
        }
        if (byteBuffer == null) {
            imageType = ImageHeaderParser.ImageType.UNKNOWN;
        } else {
            List<ImageHeaderParser> list = this.f4145b;
            int size = list.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    imageType = ImageHeaderParser.ImageType.UNKNOWN;
                    break;
                }
                ImageHeaderParser.ImageType a10 = list.get(i10).a(byteBuffer);
                if (a10 != ImageHeaderParser.ImageType.UNKNOWN) {
                    imageType = a10;
                    break;
                }
                i10++;
            }
        }
        if (imageType == ImageHeaderParser.ImageType.GIF) {
            return true;
        }
        return false;
    }

    public final d c(ByteBuffer byteBuffer, int i10, int i11, d dVar, h hVar) {
        Bitmap.Config config;
        int i12 = f.f7074b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            p2.c b10 = dVar.b();
            if (b10.f7863c > 0) {
                if (b10.f7862b == 0) {
                    if (hVar.c(g.f4180a) == q2.b.PREFER_RGB_565) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    int d10 = d(b10, i10, i11);
                    C0051a aVar = this.d;
                    b bVar = this.f4147e;
                    aVar.getClass();
                    e eVar = new e(bVar, b10, byteBuffer, d10);
                    eVar.i(config);
                    eVar.c();
                    Bitmap b11 = eVar.b();
                    if (b11 == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + f.a(elapsedRealtimeNanos));
                        }
                        return null;
                    }
                    f fVar = r9;
                    f fVar2 = new f(com.bumptech.glide.b.b(this.f4144a), eVar, i10, i11, y2.c.f9534b, b11);
                    return new d(new c(new c.a(fVar)));
                }
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + f.a(elapsedRealtimeNanos));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + f.a(elapsedRealtimeNanos));
            }
        }
    }
}

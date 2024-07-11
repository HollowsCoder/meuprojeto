package z2;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public final class j implements ImageHeaderParser {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f9815a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f9816b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f9817a;

        public a(ByteBuffer byteBuffer) {
            this.f9817a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public final short a() {
            ByteBuffer byteBuffer = this.f9817a;
            if (byteBuffer.remaining() >= 1) {
                return (short) (byteBuffer.get() & 255);
            }
            throw new c.a();
        }

        public final int b() {
            return (a() << 8) | a();
        }

        public final long skip(long j8) {
            ByteBuffer byteBuffer = this.f9817a;
            int min = (int) Math.min((long) byteBuffer.remaining(), j8);
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f9818a;

        public b(int i10, byte[] bArr) {
            this.f9818a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        public final short a(int i10) {
            boolean z;
            ByteBuffer byteBuffer = this.f9818a;
            if (byteBuffer.remaining() - i10 >= 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return byteBuffer.getShort(i10);
            }
            return -1;
        }
    }

    public interface c {

        public static final class a extends IOException {
            public a() {
                super("Unexpectedly reached end of a file");
            }
        }

        short a();

        int b();

        long skip(long j8);
    }

    public static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        public final InputStream f9819a;

        public d(InputStream inputStream) {
            this.f9819a = inputStream;
        }

        public final short a() {
            int read = this.f9819a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }

        public final int b() {
            return (a() << 8) | a();
        }

        public final int c(int i10, byte[] bArr) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f9819a.read(bArr, i11, i10 - i11)) != -1) {
                i11 += i12;
            }
            if (i11 != 0 || i12 != -1) {
                return i11;
            }
            throw new c.a();
        }

        public final long skip(long j8) {
            if (j8 < 0) {
                return 0;
            }
            long j10 = j8;
            while (j10 > 0) {
                InputStream inputStream = this.f9819a;
                long skip = inputStream.skip(j10);
                if (skip > 0) {
                    j10 -= skip;
                } else if (inputStream.read() == -1) {
                    break;
                } else {
                    j10--;
                }
            }
            return j8 - j10;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bumptech.glide.load.ImageHeaderParser.ImageType d(z2.j.c r5) {
        /*
            int r0 = r5.b()     // Catch:{ a -> 0x00a0 }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch:{ a -> 0x00a0 }
            return r5
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r5.a()     // Catch:{ a -> 0x00a0 }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch:{ a -> 0x00a0 }
            return r5
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r5.a()     // Catch:{ a -> 0x00a0 }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r5.skip(r0)     // Catch:{ a -> 0x00a0 }
            short r5 = r5.a()     // Catch:{ a -> 0x0039 }
            r0 = 3
            if (r5 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch:{ a -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x0039 }
        L_0x0038:
            return r5
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x00a0 }
            return r5
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            if (r0 == r1) goto L_0x0044
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r5
        L_0x0044:
            r0 = 4
            r5.skip(r0)     // Catch:{ a -> 0x00a0 }
            int r2 = r5.b()     // Catch:{ a -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r5.b()     // Catch:{ a -> 0x00a0 }
            r2 = r2 | r3
            r3 = 1464156752(0x57454250, float:2.16888601E14)
            if (r2 == r3) goto L_0x005c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r5
        L_0x005c:
            int r2 = r5.b()     // Catch:{ a -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r5.b()     // Catch:{ a -> 0x00a0 }
            r2 = r2 | r3
            r3 = r2 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r3 == r4) goto L_0x0071
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r5
        L_0x0071:
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 88
            if (r2 != r3) goto L_0x0088
            r5.skip(r0)     // Catch:{ a -> 0x00a0 }
            short r5 = r5.a()     // Catch:{ a -> 0x00a0 }
            r5 = r5 & 16
            if (r5 == 0) goto L_0x0085
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a0 }
            goto L_0x0087
        L_0x0085:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
        L_0x0087:
            return r5
        L_0x0088:
            r3 = 76
            if (r2 != r3) goto L_0x009d
            r5.skip(r0)     // Catch:{ a -> 0x00a0 }
            short r5 = r5.a()     // Catch:{ a -> 0x00a0 }
            r5 = r5 & 8
            if (r5 == 0) goto L_0x009a
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a0 }
            goto L_0x009c
        L_0x009a:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
        L_0x009c:
            return r5
        L_0x009d:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
            return r5
        L_0x00a0:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.j.d(z2.j$c):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    public static int e(d dVar) {
        short a10;
        int b10;
        long j8;
        long skip;
        do {
            short a11 = dVar.a();
            if (a11 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + a11);
                }
                return -1;
            }
            a10 = dVar.a();
            if (a10 == 218) {
                return -1;
            }
            if (a10 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            b10 = dVar.b() - 2;
            if (a10 == 225) {
                return b10;
            }
            j8 = (long) b10;
            skip = dVar.skip(j8);
        } while (skip == j8);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + a10 + ", wanted to skip: " + b10 + ", but actually skipped: " + skip);
        }
        return -1;
    }

    public static int f(d dVar, byte[] bArr, int i10) {
        boolean z;
        ByteOrder byteOrder;
        boolean z10;
        int i11;
        String str;
        StringBuilder sb;
        StringBuilder sb2;
        int i12;
        int c10 = dVar.c(i10, bArr);
        if (c10 != i10) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + c10);
            }
            return -1;
        }
        short s10 = 1;
        byte[] bArr2 = f9815a;
        if (bArr == null || i10 <= bArr2.length) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            int i13 = 0;
            while (true) {
                if (i13 >= bArr2.length) {
                    break;
                } else if (bArr[i13] != bArr2[i13]) {
                    z = false;
                    break;
                } else {
                    i13++;
                }
            }
        }
        if (z) {
            b bVar = new b(i10, bArr);
            short a10 = bVar.a(6);
            if (a10 != 18761) {
                if (a10 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + a10);
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            ByteBuffer byteBuffer = bVar.f9818a;
            byteBuffer.order(byteOrder);
            if (byteBuffer.remaining() - 10 >= 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i11 = byteBuffer.getInt(10);
            } else {
                i11 = -1;
            }
            int i14 = i11 + 6;
            short a11 = bVar.a(i14);
            int i15 = 0;
            while (i15 < a11) {
                int i16 = (i15 * 12) + i14 + 2;
                short a12 = bVar.a(i16);
                if (a12 == 274) {
                    short a13 = bVar.a(i16 + 2);
                    if (a13 >= s10 && a13 <= 12) {
                        int i17 = i16 + 4;
                        if (byteBuffer.remaining() - i17 < 4) {
                            s10 = 0;
                        }
                        if (s10 != 0) {
                            i12 = byteBuffer.getInt(i17);
                        } else {
                            i12 = -1;
                        }
                        if (i12 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got tagIndex=" + i15 + " tagType=" + a12 + " formatCode=" + a13 + " componentCount=" + i12);
                            }
                            int i18 = i12 + f9816b[a13];
                            if (i18 <= 4) {
                                int i19 = i16 + 8;
                                if (i19 < 0 || i19 > byteBuffer.remaining()) {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        sb = new StringBuilder("Illegal tagValueOffset=");
                                        sb.append(i19);
                                        sb.append(" tagType=");
                                    }
                                } else if (i18 >= 0 && i18 + i19 <= byteBuffer.remaining()) {
                                    return bVar.a(i19);
                                } else {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        sb = new StringBuilder("Illegal number of bytes for TI tag data tagType=");
                                    }
                                }
                                sb.append(a12);
                                str = sb.toString();
                                Log.d("DfltImageHeaderParser", str);
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                sb2 = new StringBuilder("Got byte count > 4, not orientation, continuing, formatCode=");
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            str = "Negative tiff component count";
                            Log.d("DfltImageHeaderParser", str);
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        sb2 = new StringBuilder("Got invalid format code = ");
                    }
                    sb.append(a13);
                    str = sb.toString();
                    Log.d("DfltImageHeaderParser", str);
                }
                i15++;
                s10 = 1;
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    public final ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        s6.a.n(byteBuffer);
        return d(new a(byteBuffer));
    }

    public final ImageHeaderParser.ImageType b(InputStream inputStream) {
        s6.a.n(inputStream);
        return d(new d(inputStream));
    }

    public final int c(InputStream inputStream, t2.b bVar) {
        boolean z;
        String str;
        byte[] bArr;
        s6.a.n(inputStream);
        d dVar = new d(inputStream);
        s6.a.n(bVar);
        try {
            int b10 = dVar.b();
            if ((b10 & 65496) == 65496 || b10 == 19789 || b10 == 18761) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int e10 = e(dVar);
                if (e10 != -1) {
                    bArr = (byte[]) bVar.c(e10, byte[].class);
                    int f10 = f(dVar, bArr, e10);
                    bVar.put(bArr);
                    return f10;
                } else if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                } else {
                    str = "Failed to parse exif segment length, or exif segment not found";
                }
            } else if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                return -1;
            } else {
                str = "Parser doesn't handle magic number: " + b10;
            }
            Log.d("DfltImageHeaderParser", str);
            return -1;
        } catch (c.a unused) {
            return -1;
        } catch (Throwable th) {
            bVar.put(bArr);
            throw th;
        }
    }
}

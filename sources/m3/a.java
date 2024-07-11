package m3;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference<byte[]> f7060a = new AtomicReference<>();

    /* renamed from: m3.a$a  reason: collision with other inner class name */
    public static class C0101a extends InputStream {

        /* renamed from: o  reason: collision with root package name */
        public final ByteBuffer f7061o;

        /* renamed from: p  reason: collision with root package name */
        public int f7062p = -1;

        public C0101a(ByteBuffer byteBuffer) {
            this.f7061o = byteBuffer;
        }

        public final int available() {
            return this.f7061o.remaining();
        }

        public final synchronized void mark(int i10) {
            this.f7062p = this.f7061o.position();
        }

        public final boolean markSupported() {
            return true;
        }

        public final int read() {
            ByteBuffer byteBuffer = this.f7061o;
            if (!byteBuffer.hasRemaining()) {
                return -1;
            }
            return byteBuffer.get() & 255;
        }

        public final int read(byte[] bArr, int i10, int i11) {
            ByteBuffer byteBuffer = this.f7061o;
            if (!byteBuffer.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i11, available());
            byteBuffer.get(bArr, i10, min);
            return min;
        }

        public final synchronized void reset() {
            int i10 = this.f7062p;
            if (i10 != -1) {
                this.f7061o.position(i10);
            } else {
                throw new IOException("Cannot reset to unset mark position");
            }
        }

        public final long skip(long j8) {
            ByteBuffer byteBuffer = this.f7061o;
            if (!byteBuffer.hasRemaining()) {
                return -1;
            }
            long min = Math.min(j8, (long) available());
            byteBuffer.position((int) (((long) byteBuffer.position()) + min));
            return min;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f7063a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7064b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f7065c;

        public b(byte[] bArr, int i10, int i11) {
            this.f7065c = bArr;
            this.f7063a = i10;
            this.f7064b = i11;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|12|13|14|15) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x002d */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004f A[SYNTHETIC, Splitter:B:29:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0054 A[SYNTHETIC, Splitter:B:33:0x0054] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.MappedByteBuffer a(java.io.File r9) {
        /*
            r0 = 0
            long r5 = r9.length()     // Catch:{ all -> 0x004b }
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0043
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x003b
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "r"
            r7.<init>(r9, r1)     // Catch:{ all -> 0x004b }
            java.nio.channels.FileChannel r9 = r7.getChannel()     // Catch:{ all -> 0x0033 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0031 }
            r3 = 0
            r1 = r9
            java.nio.MappedByteBuffer r0 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0031 }
            java.nio.MappedByteBuffer r0 = r0.load()     // Catch:{ all -> 0x0031 }
            r9.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            r7.close()     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            return r0
        L_0x0031:
            r0 = move-exception
            goto L_0x0037
        L_0x0033:
            r9 = move-exception
            r8 = r0
            r0 = r9
            r9 = r8
        L_0x0037:
            r8 = r0
            r0 = r9
            r9 = r8
            goto L_0x004d
        L_0x003b:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "File unsuitable for memory mapping"
            r9.<init>(r1)     // Catch:{ all -> 0x004b }
            throw r9     // Catch:{ all -> 0x004b }
        L_0x0043:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "File too large to map into memory"
            r9.<init>(r1)     // Catch:{ all -> 0x004b }
            throw r9     // Catch:{ all -> 0x004b }
        L_0x004b:
            r9 = move-exception
            r7 = r0
        L_0x004d:
            if (r0 == 0) goto L_0x0052
            r0.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            if (r7 == 0) goto L_0x0057
            r7.close()     // Catch:{ IOException -> 0x0057 }
        L_0x0057:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.a.a(java.io.File):java.nio.MappedByteBuffer");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:3|4|5|6|7|8|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001f */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029 A[SYNTHETIC, Splitter:B:14:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002e A[SYNTHETIC, Splitter:B:18:0x002e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.nio.ByteBuffer r4, java.io.File r5) {
        /*
            r0 = 0
            r4.position(r0)
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0025 }
            java.lang.String r3 = "rw"
            r2.<init>(r5, r3)     // Catch:{ all -> 0x0025 }
            java.nio.channels.FileChannel r1 = r2.getChannel()     // Catch:{ all -> 0x0023 }
            r1.write(r4)     // Catch:{ all -> 0x0023 }
            r1.force(r0)     // Catch:{ all -> 0x0023 }
            r1.close()     // Catch:{ all -> 0x0023 }
            r2.close()     // Catch:{ all -> 0x0023 }
            r1.close()     // Catch:{ IOException -> 0x001f }
        L_0x001f:
            r2.close()     // Catch:{ IOException -> 0x0022 }
        L_0x0022:
            return
        L_0x0023:
            r4 = move-exception
            goto L_0x0027
        L_0x0025:
            r4 = move-exception
            r2 = r1
        L_0x0027:
            if (r1 == 0) goto L_0x002c
            r1.close()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            if (r2 == 0) goto L_0x0031
            r2.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.a.b(java.nio.ByteBuffer, java.io.File):void");
    }
}

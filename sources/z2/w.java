package z2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import t2.b;

public final class w extends FilterInputStream {

    /* renamed from: o  reason: collision with root package name */
    public volatile byte[] f9860o;

    /* renamed from: p  reason: collision with root package name */
    public int f9861p;

    /* renamed from: q  reason: collision with root package name */
    public int f9862q;

    /* renamed from: r  reason: collision with root package name */
    public int f9863r = -1;

    /* renamed from: s  reason: collision with root package name */
    public int f9864s;

    /* renamed from: t  reason: collision with root package name */
    public final b f9865t;

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public w(InputStream inputStream, b bVar) {
        super(inputStream);
        this.f9865t = bVar;
        this.f9860o = (byte[]) bVar.c(65536, byte[].class);
    }

    public static void c() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) {
        int i10;
        int i11 = this.f9863r;
        if (i11 == -1 || this.f9864s - i11 >= (i10 = this.f9862q)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f9863r = -1;
                this.f9864s = 0;
                this.f9861p = read;
            }
            return read;
        }
        if (i11 == 0 && i10 > bArr.length && this.f9861p == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i10) {
                i10 = length;
            }
            byte[] bArr2 = (byte[]) this.f9865t.c(i10, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f9860o = bArr2;
            this.f9865t.put(bArr);
            bArr = bArr2;
        } else if (i11 > 0) {
            System.arraycopy(bArr, i11, bArr, 0, bArr.length - i11);
        }
        int i12 = this.f9864s - this.f9863r;
        this.f9864s = i12;
        this.f9863r = 0;
        this.f9861p = 0;
        int read2 = inputStream.read(bArr, i12, bArr.length - i12);
        int i13 = this.f9864s;
        if (read2 > 0) {
            i13 += read2;
        }
        this.f9861p = i13;
        return read2;
    }

    public final synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f9860o == null || inputStream == null) {
            c();
            throw null;
        }
        return (this.f9861p - this.f9864s) + inputStream.available();
    }

    public final synchronized void b() {
        if (this.f9860o != null) {
            this.f9865t.put(this.f9860o);
            this.f9860o = null;
        }
    }

    public final void close() {
        if (this.f9860o != null) {
            this.f9865t.put(this.f9860o);
            this.f9860o = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final synchronized void mark(int i10) {
        this.f9862q = Math.max(this.f9862q, i10);
        this.f9863r = this.f9864s;
    }

    public final boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0019=Splitter:B:11:0x0019, B:27:0x0039=Splitter:B:27:0x0039} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read() {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f9860o     // Catch:{ all -> 0x003d }
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x003d }
            r2 = 0
            if (r0 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0039
            int r3 = r6.f9864s     // Catch:{ all -> 0x003d }
            int r4 = r6.f9861p     // Catch:{ all -> 0x003d }
            r5 = -1
            if (r3 < r4) goto L_0x0019
            int r1 = r6.a(r1, r0)     // Catch:{ all -> 0x003d }
            if (r1 != r5) goto L_0x0019
            monitor-exit(r6)
            return r5
        L_0x0019:
            byte[] r1 = r6.f9860o     // Catch:{ all -> 0x003d }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r6.f9860o     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            c()     // Catch:{ all -> 0x003d }
            throw r2     // Catch:{ all -> 0x003d }
        L_0x0026:
            int r1 = r6.f9861p     // Catch:{ all -> 0x003d }
            int r2 = r6.f9864s     // Catch:{ all -> 0x003d }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0037
            int r1 = r2 + 1
            r6.f9864s = r1     // Catch:{ all -> 0x003d }
            byte r0 = r0[r2]     // Catch:{ all -> 0x003d }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r6)
            return r0
        L_0x0037:
            monitor-exit(r6)
            return r5
        L_0x0039:
            c()     // Catch:{ all -> 0x003d }
            throw r2     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.w.read():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002f, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0045, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0052, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f9860o     // Catch:{ all -> 0x0088 }
            r1 = 0
            if (r0 == 0) goto L_0x0084
            if (r9 != 0) goto L_0x000b
            monitor-exit(r6)
            r7 = 0
            return r7
        L_0x000b:
            java.io.InputStream r2 = r6.in     // Catch:{ all -> 0x0088 }
            if (r2 == 0) goto L_0x0080
            int r3 = r6.f9864s     // Catch:{ all -> 0x0088 }
            int r4 = r6.f9861p     // Catch:{ all -> 0x0088 }
            if (r3 >= r4) goto L_0x0030
            int r4 = r4 - r3
            if (r4 < r9) goto L_0x0019
            r4 = r9
        L_0x0019:
            java.lang.System.arraycopy(r0, r3, r7, r8, r4)     // Catch:{ all -> 0x0088 }
            int r3 = r6.f9864s     // Catch:{ all -> 0x0088 }
            int r3 = r3 + r4
            r6.f9864s = r3     // Catch:{ all -> 0x0088 }
            if (r4 == r9) goto L_0x002e
            int r3 = r2.available()     // Catch:{ all -> 0x0088 }
            if (r3 != 0) goto L_0x002a
            goto L_0x002e
        L_0x002a:
            int r8 = r8 + r4
            int r3 = r9 - r4
            goto L_0x0031
        L_0x002e:
            monitor-exit(r6)
            return r4
        L_0x0030:
            r3 = r9
        L_0x0031:
            int r4 = r6.f9863r     // Catch:{ all -> 0x0088 }
            r5 = -1
            if (r4 != r5) goto L_0x0046
            int r4 = r0.length     // Catch:{ all -> 0x0088 }
            if (r3 < r4) goto L_0x0046
            int r4 = r2.read(r7, r8, r3)     // Catch:{ all -> 0x0088 }
            if (r4 != r5) goto L_0x0070
            if (r3 != r9) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            int r5 = r9 - r3
        L_0x0044:
            monitor-exit(r6)
            return r5
        L_0x0046:
            int r4 = r6.a(r2, r0)     // Catch:{ all -> 0x0088 }
            if (r4 != r5) goto L_0x0053
            if (r3 != r9) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            int r5 = r9 - r3
        L_0x0051:
            monitor-exit(r6)
            return r5
        L_0x0053:
            byte[] r4 = r6.f9860o     // Catch:{ all -> 0x0088 }
            if (r0 == r4) goto L_0x0060
            byte[] r0 = r6.f9860o     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x005c
            goto L_0x0060
        L_0x005c:
            c()     // Catch:{ all -> 0x0088 }
            throw r1     // Catch:{ all -> 0x0088 }
        L_0x0060:
            int r4 = r6.f9861p     // Catch:{ all -> 0x0088 }
            int r5 = r6.f9864s     // Catch:{ all -> 0x0088 }
            int r4 = r4 - r5
            if (r4 < r3) goto L_0x0068
            r4 = r3
        L_0x0068:
            java.lang.System.arraycopy(r0, r5, r7, r8, r4)     // Catch:{ all -> 0x0088 }
            int r5 = r6.f9864s     // Catch:{ all -> 0x0088 }
            int r5 = r5 + r4
            r6.f9864s = r5     // Catch:{ all -> 0x0088 }
        L_0x0070:
            int r3 = r3 - r4
            if (r3 != 0) goto L_0x0075
            monitor-exit(r6)
            return r9
        L_0x0075:
            int r5 = r2.available()     // Catch:{ all -> 0x0088 }
            if (r5 != 0) goto L_0x007e
            int r9 = r9 - r3
            monitor-exit(r6)
            return r9
        L_0x007e:
            int r8 = r8 + r4
            goto L_0x0031
        L_0x0080:
            c()     // Catch:{ all -> 0x0088 }
            throw r1     // Catch:{ all -> 0x0088 }
        L_0x0084:
            c()     // Catch:{ all -> 0x0088 }
            throw r1     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.w.read(byte[], int, int):int");
    }

    public final synchronized void reset() {
        if (this.f9860o != null) {
            int i10 = this.f9863r;
            if (-1 != i10) {
                this.f9864s = i10;
            } else {
                throw new a("Mark has been invalidated, pos: " + this.f9864s + " markLimit: " + this.f9862q);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    public final synchronized long skip(long j8) {
        if (j8 < 1) {
            return 0;
        }
        byte[] bArr = this.f9860o;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i10 = this.f9861p;
                int i11 = this.f9864s;
                if (((long) (i10 - i11)) >= j8) {
                    this.f9864s = (int) (((long) i11) + j8);
                    return j8;
                }
                long j10 = ((long) i10) - ((long) i11);
                this.f9864s = i10;
                if (this.f9863r == -1 || j8 > ((long) this.f9862q)) {
                    long skip = inputStream.skip(j8 - j10);
                    if (skip > 0) {
                        this.f9863r = -1;
                    }
                    return j10 + skip;
                } else if (a(inputStream, bArr) == -1) {
                    return j10;
                } else {
                    int i12 = this.f9861p;
                    int i13 = this.f9864s;
                    if (((long) (i12 - i13)) >= j8 - j10) {
                        this.f9864s = (int) ((((long) i13) + j8) - j10);
                        return j8;
                    }
                    long j11 = (j10 + ((long) i12)) - ((long) i13);
                    this.f9864s = i12;
                    return j11;
                }
            } else {
                c();
                throw null;
            }
        } else {
            c();
            throw null;
        }
    }
}

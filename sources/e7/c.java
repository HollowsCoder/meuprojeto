package e7;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.logging.Logger;

public final class c implements Closeable {
    public static final Logger u = Logger.getLogger(c.class.getName());

    /* renamed from: o  reason: collision with root package name */
    public final RandomAccessFile f4497o;

    /* renamed from: p  reason: collision with root package name */
    public int f4498p;

    /* renamed from: q  reason: collision with root package name */
    public int f4499q;

    /* renamed from: r  reason: collision with root package name */
    public a f4500r;

    /* renamed from: s  reason: collision with root package name */
    public a f4501s;

    /* renamed from: t  reason: collision with root package name */
    public final byte[] f4502t;

    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final a f4503c = new a(0, 0);

        /* renamed from: a  reason: collision with root package name */
        public final int f4504a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4505b;

        public a(int i10, int i11) {
            this.f4504a = i10;
            this.f4505b = i11;
        }

        public final String toString() {
            return a.class.getSimpleName() + "[position = " + this.f4504a + ", length = " + this.f4505b + "]";
        }
    }

    /* JADX INFO: finally extract failed */
    public c(File file) {
        File file2 = file;
        byte[] bArr = new byte[16];
        this.f4502t = bArr;
        if (!file.exists()) {
            File file3 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rwd");
            try {
                randomAccessFile.setLength(4096);
                randomAccessFile.seek(0);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 4; i10 < i12; i12 = 4) {
                    int i13 = iArr[i10];
                    bArr2[i11] = (byte) (i13 >> 24);
                    bArr2[i11 + 1] = (byte) (i13 >> 16);
                    bArr2[i11 + 2] = (byte) (i13 >> 8);
                    bArr2[i11 + 3] = (byte) i13;
                    i11 += 4;
                    i10++;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file3.renameTo(file2)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rwd");
        this.f4497o = randomAccessFile2;
        randomAccessFile2.seek(0);
        randomAccessFile2.readFully(bArr);
        int d = d(0, bArr);
        this.f4498p = d;
        if (((long) d) <= randomAccessFile2.length()) {
            this.f4499q = d(4, bArr);
            int d10 = d(8, bArr);
            int d11 = d(12, bArr);
            this.f4500r = c(d10);
            this.f4501s = c(d11);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f4498p + ", Actual length: " + randomAccessFile2.length());
    }

    public static int d(int i10, byte[] bArr) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void a(byte[] r10) {
        /*
            r9 = this;
            int r0 = r10.length
            monitor-enter(r9)
            r1 = r0 | 0
            if (r1 < 0) goto L_0x006d
            int r1 = r10.length     // Catch:{ all -> 0x0073 }
            r2 = 0
            int r1 = r1 - r2
            if (r0 > r1) goto L_0x006d
            r9.b(r0)     // Catch:{ all -> 0x0073 }
            monitor-enter(r9)     // Catch:{ all -> 0x0073 }
            int r1 = r9.f4499q     // Catch:{ all -> 0x006a }
            r3 = 1
            if (r1 != 0) goto L_0x0016
            r1 = r3
            goto L_0x0017
        L_0x0016:
            r1 = r2
        L_0x0017:
            monitor-exit(r9)     // Catch:{ all -> 0x0073 }
            r4 = 4
            if (r1 == 0) goto L_0x001e
            r5 = 16
            goto L_0x002a
        L_0x001e:
            e7.c$a r5 = r9.f4501s     // Catch:{ all -> 0x0073 }
            int r6 = r5.f4504a     // Catch:{ all -> 0x0073 }
            int r6 = r6 + r4
            int r5 = r5.f4505b     // Catch:{ all -> 0x0073 }
            int r6 = r6 + r5
            int r5 = r9.n(r6)     // Catch:{ all -> 0x0073 }
        L_0x002a:
            e7.c$a r6 = new e7.c$a     // Catch:{ all -> 0x0073 }
            r6.<init>(r5, r0)     // Catch:{ all -> 0x0073 }
            byte[] r7 = r9.f4502t     // Catch:{ all -> 0x0073 }
            int r8 = r0 >> 24
            byte r8 = (byte) r8     // Catch:{ all -> 0x0073 }
            r7[r2] = r8     // Catch:{ all -> 0x0073 }
            int r2 = r0 >> 16
            byte r2 = (byte) r2     // Catch:{ all -> 0x0073 }
            r7[r3] = r2     // Catch:{ all -> 0x0073 }
            int r2 = r0 >> 8
            byte r2 = (byte) r2     // Catch:{ all -> 0x0073 }
            r8 = 2
            r7[r8] = r2     // Catch:{ all -> 0x0073 }
            r2 = 3
            byte r8 = (byte) r0     // Catch:{ all -> 0x0073 }
            r7[r2] = r8     // Catch:{ all -> 0x0073 }
            r9.j(r5, r7, r4)     // Catch:{ all -> 0x0073 }
            int r2 = r5 + 4
            r9.j(r2, r10, r0)     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0051
            r10 = r5
            goto L_0x0055
        L_0x0051:
            e7.c$a r10 = r9.f4500r     // Catch:{ all -> 0x0073 }
            int r10 = r10.f4504a     // Catch:{ all -> 0x0073 }
        L_0x0055:
            int r0 = r9.f4498p     // Catch:{ all -> 0x0073 }
            int r2 = r9.f4499q     // Catch:{ all -> 0x0073 }
            int r2 = r2 + r3
            r9.o(r0, r2, r10, r5)     // Catch:{ all -> 0x0073 }
            r9.f4501s = r6     // Catch:{ all -> 0x0073 }
            int r10 = r9.f4499q     // Catch:{ all -> 0x0073 }
            int r10 = r10 + r3
            r9.f4499q = r10     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0068
            r9.f4500r = r6     // Catch:{ all -> 0x0073 }
        L_0x0068:
            monitor-exit(r9)
            return
        L_0x006a:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0073 }
            throw r10     // Catch:{ all -> 0x0073 }
        L_0x006d:
            java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException     // Catch:{ all -> 0x0073 }
            r10.<init>()     // Catch:{ all -> 0x0073 }
            throw r10     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.c.a(byte[]):void");
    }

    public final void b(int i10) {
        int i11 = i10 + 4;
        int l = this.f4498p - l();
        if (l < i11) {
            int i12 = this.f4498p;
            do {
                l += i12;
                i12 <<= 1;
            } while (l < i11);
            RandomAccessFile randomAccessFile = this.f4497o;
            randomAccessFile.setLength((long) i12);
            randomAccessFile.getChannel().force(true);
            a aVar = this.f4501s;
            int n10 = n(aVar.f4504a + 4 + aVar.f4505b);
            if (n10 < this.f4500r.f4504a) {
                FileChannel channel = randomAccessFile.getChannel();
                channel.position((long) this.f4498p);
                long j8 = (long) (n10 - 4);
                if (channel.transferTo(16, j8, channel) != j8) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i13 = this.f4501s.f4504a;
            int i14 = this.f4500r.f4504a;
            if (i13 < i14) {
                int i15 = (this.f4498p + i13) - 16;
                o(i12, this.f4499q, i14, i15);
                this.f4501s = new a(i15, this.f4501s.f4505b);
            } else {
                o(i12, this.f4499q, i14, i13);
            }
            this.f4498p = i12;
        }
    }

    public final a c(int i10) {
        if (i10 == 0) {
            return a.f4503c;
        }
        RandomAccessFile randomAccessFile = this.f4497o;
        randomAccessFile.seek((long) i10);
        return new a(i10, randomAccessFile.readInt());
    }

    public final synchronized void close() {
        this.f4497o.close();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void f() {
        /*
            r6 = this;
            monitor-enter(r6)
            monitor-enter(r6)     // Catch:{ all -> 0x006e }
            int r0 = r6.f4499q     // Catch:{ all -> 0x0070 }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000a
            r3 = r2
            goto L_0x000b
        L_0x000a:
            r3 = r1
        L_0x000b:
            monitor-exit(r6)     // Catch:{ all -> 0x006e }
            if (r3 != 0) goto L_0x0068
            if (r0 != r2) goto L_0x0036
            monitor-enter(r6)     // Catch:{ all -> 0x006e }
            r0 = 4096(0x1000, float:5.74E-42)
            r6.o(r0, r1, r1, r1)     // Catch:{ all -> 0x0033 }
            r6.f4499q = r1     // Catch:{ all -> 0x0033 }
            e7.c$a r1 = e7.c.a.f4503c     // Catch:{ all -> 0x0033 }
            r6.f4500r = r1     // Catch:{ all -> 0x0033 }
            r6.f4501s = r1     // Catch:{ all -> 0x0033 }
            int r1 = r6.f4498p     // Catch:{ all -> 0x0033 }
            if (r1 <= r0) goto L_0x002f
            java.io.RandomAccessFile r1 = r6.f4497o     // Catch:{ all -> 0x0033 }
            long r3 = (long) r0     // Catch:{ all -> 0x0033 }
            r1.setLength(r3)     // Catch:{ all -> 0x0033 }
            java.nio.channels.FileChannel r1 = r1.getChannel()     // Catch:{ all -> 0x0033 }
            r1.force(r2)     // Catch:{ all -> 0x0033 }
        L_0x002f:
            r6.f4498p = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r6)     // Catch:{ all -> 0x006e }
            goto L_0x0066
        L_0x0033:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x006e }
        L_0x0036:
            e7.c$a r0 = r6.f4500r     // Catch:{ all -> 0x006e }
            int r3 = r0.f4504a     // Catch:{ all -> 0x006e }
            r4 = 4
            int r3 = r3 + r4
            int r0 = r0.f4505b     // Catch:{ all -> 0x006e }
            int r3 = r3 + r0
            int r0 = r6.n(r3)     // Catch:{ all -> 0x006e }
            byte[] r3 = r6.f4502t     // Catch:{ all -> 0x006e }
            r6.g(r0, r3, r1, r4)     // Catch:{ all -> 0x006e }
            byte[] r3 = r6.f4502t     // Catch:{ all -> 0x006e }
            int r1 = d(r1, r3)     // Catch:{ all -> 0x006e }
            int r3 = r6.f4498p     // Catch:{ all -> 0x006e }
            int r4 = r6.f4499q     // Catch:{ all -> 0x006e }
            int r4 = r4 - r2
            e7.c$a r5 = r6.f4501s     // Catch:{ all -> 0x006e }
            int r5 = r5.f4504a     // Catch:{ all -> 0x006e }
            r6.o(r3, r4, r0, r5)     // Catch:{ all -> 0x006e }
            int r3 = r6.f4499q     // Catch:{ all -> 0x006e }
            int r3 = r3 - r2
            r6.f4499q = r3     // Catch:{ all -> 0x006e }
            e7.c$a r2 = new e7.c$a     // Catch:{ all -> 0x006e }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x006e }
            r6.f4500r = r2     // Catch:{ all -> 0x006e }
        L_0x0066:
            monitor-exit(r6)
            return
        L_0x0068:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x006e }
            r0.<init>()     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x006e }
        L_0x006e:
            r0 = move-exception
            goto L_0x0073
        L_0x0070:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x006e }
        L_0x0073:
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.c.f():void");
    }

    public final void g(int i10, byte[] bArr, int i11, int i12) {
        int n10 = n(i10);
        int i13 = n10 + i12;
        int i14 = this.f4498p;
        RandomAccessFile randomAccessFile = this.f4497o;
        if (i13 <= i14) {
            randomAccessFile.seek((long) n10);
        } else {
            int i15 = i14 - n10;
            randomAccessFile.seek((long) n10);
            randomAccessFile.readFully(bArr, i11, i15);
            randomAccessFile.seek(16);
            i11 += i15;
            i12 -= i15;
        }
        randomAccessFile.readFully(bArr, i11, i12);
    }

    public final void j(int i10, byte[] bArr, int i11) {
        int n10 = n(i10);
        int i12 = n10 + i11;
        int i13 = this.f4498p;
        RandomAccessFile randomAccessFile = this.f4497o;
        int i14 = 0;
        if (i12 <= i13) {
            randomAccessFile.seek((long) n10);
        } else {
            int i15 = i13 - n10;
            randomAccessFile.seek((long) n10);
            randomAccessFile.write(bArr, 0, i15);
            randomAccessFile.seek(16);
            i14 = 0 + i15;
            i11 -= i15;
        }
        randomAccessFile.write(bArr, i14, i11);
    }

    public final int l() {
        if (this.f4499q == 0) {
            return 16;
        }
        a aVar = this.f4501s;
        int i10 = aVar.f4504a;
        int i11 = this.f4500r.f4504a;
        return i10 >= i11 ? (i10 - i11) + 4 + aVar.f4505b + 16 : (((i10 + 4) + aVar.f4505b) + this.f4498p) - i11;
    }

    public final int n(int i10) {
        int i11 = this.f4498p;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    public final void o(int i10, int i11, int i12, int i13) {
        int i14 = 0;
        int[] iArr = {i10, i11, i12, i13};
        int i15 = 0;
        while (true) {
            byte[] bArr = this.f4502t;
            if (i14 < 4) {
                int i16 = iArr[i14];
                bArr[i15] = (byte) (i16 >> 24);
                bArr[i15 + 1] = (byte) (i16 >> 16);
                bArr[i15 + 2] = (byte) (i16 >> 8);
                bArr[i15 + 3] = (byte) i16;
                i15 += 4;
                i14++;
            } else {
                RandomAccessFile randomAccessFile = this.f4497o;
                randomAccessFile.seek(0);
                randomAccessFile.write(bArr);
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        u.log(java.util.logging.Level.WARNING, "read error", r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<e7.c> r1 = e7.c.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "[fileLength="
            r0.append(r1)
            int r1 = r7.f4498p
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            int r1 = r7.f4499q
            r0.append(r1)
            java.lang.String r1 = ", first="
            r0.append(r1)
            e7.c$a r1 = r7.f4500r
            r0.append(r1)
            java.lang.String r1 = ", last="
            r0.append(r1)
            e7.c$a r1 = r7.f4501s
            r0.append(r1)
            java.lang.String r1 = ", element lengths=["
            r0.append(r1)
            monitor-enter(r7)     // Catch:{ IOException -> 0x0071 }
            e7.c$a r1 = r7.f4500r     // Catch:{ all -> 0x006e }
            int r1 = r1.f4504a     // Catch:{ all -> 0x006e }
            r2 = 1
            r3 = 0
            r4 = r3
        L_0x0043:
            int r5 = r7.f4499q     // Catch:{ all -> 0x006e }
            if (r4 >= r5) goto L_0x006c
            e7.c$a r1 = r7.c(r1)     // Catch:{ all -> 0x006e }
            e7.c$b r5 = new e7.c$b     // Catch:{ all -> 0x006e }
            r5.<init>(r1)     // Catch:{ all -> 0x006e }
            int r5 = r1.f4505b     // Catch:{ all -> 0x006e }
            if (r2 == 0) goto L_0x0056
            r2 = r3
            goto L_0x005b
        L_0x0056:
            java.lang.String r6 = ", "
            r0.append(r6)     // Catch:{ all -> 0x006e }
        L_0x005b:
            r0.append(r5)     // Catch:{ all -> 0x006e }
            int r5 = r1.f4504a     // Catch:{ all -> 0x006e }
            int r5 = r5 + 4
            int r1 = r1.f4505b     // Catch:{ all -> 0x006e }
            int r5 = r5 + r1
            int r1 = r7.n(r5)     // Catch:{ all -> 0x006e }
            int r4 = r4 + 1
            goto L_0x0043
        L_0x006c:
            monitor-exit(r7)     // Catch:{ IOException -> 0x0071 }
            goto L_0x007b
        L_0x006e:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ IOException -> 0x0071 }
            throw r1     // Catch:{ IOException -> 0x0071 }
        L_0x0071:
            r1 = move-exception
            java.util.logging.Logger r2 = u
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r4 = "read error"
            r2.log(r3, r4, r1)
        L_0x007b:
            java.lang.String r1 = "]]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.c.toString():java.lang.String");
    }

    public final class b extends InputStream {

        /* renamed from: o  reason: collision with root package name */
        public int f4506o;

        /* renamed from: p  reason: collision with root package name */
        public int f4507p;

        public b(a aVar) {
            this.f4506o = c.this.n(aVar.f4504a + 4);
            this.f4507p = aVar.f4505b;
        }

        public final int read() {
            if (this.f4507p == 0) {
                return -1;
            }
            c cVar = c.this;
            cVar.f4497o.seek((long) this.f4506o);
            int read = cVar.f4497o.read();
            this.f4506o = cVar.n(this.f4506o + 1);
            this.f4507p--;
            return read;
        }

        public final int read(byte[] bArr, int i10, int i11) {
            if (bArr == null) {
                throw new NullPointerException("buffer");
            } else if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                int i12 = this.f4507p;
                if (i12 <= 0) {
                    return -1;
                }
                if (i11 > i12) {
                    i11 = i12;
                }
                int i13 = this.f4506o;
                c cVar = c.this;
                cVar.g(i13, bArr, i10, i11);
                this.f4506o = cVar.n(this.f4506o + i11);
                this.f4507p -= i11;
                return i11;
            }
        }
    }
}

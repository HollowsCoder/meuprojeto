package okhttp3.internal.publicsuffix;

import com.karumi.dexter.BuildConfig;
import f9.l;
import j9.c;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import o8.i;
import o8.k;
import p9.u;
import z8.g;

public final class PublicSuffixDatabase {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f7790e = {(byte) 42};

    /* renamed from: f  reason: collision with root package name */
    public static final List<String> f7791f = u.l("*");

    /* renamed from: g  reason: collision with root package name */
    public static final PublicSuffixDatabase f7792g = new PublicSuffixDatabase();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f7793a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f7794b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    public byte[] f7795c;
    public byte[] d;

    public static final class a {
        public static final String a(byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            boolean z;
            byte b10;
            int i12;
            byte[] bArr3 = bArr;
            byte[][] bArr4 = bArr2;
            byte[] bArr5 = PublicSuffixDatabase.f7790e;
            int length = bArr3.length;
            int i13 = 0;
            while (i13 < length) {
                int i14 = (i13 + length) / 2;
                while (i14 > -1 && bArr3[i14] != ((byte) 10)) {
                    i14--;
                }
                int i15 = i14 + 1;
                int i16 = 1;
                while (true) {
                    i11 = i15 + i16;
                    if (bArr3[i11] == ((byte) 10)) {
                        break;
                    }
                    i16++;
                }
                int i17 = i11 - i15;
                int i18 = i10;
                boolean z10 = false;
                int i19 = 0;
                int i20 = 0;
                while (true) {
                    if (z10) {
                        b10 = 46;
                        z = false;
                    } else {
                        byte b11 = bArr4[i18][i19];
                        byte[] bArr6 = c.f6602a;
                        byte b12 = b11 & 255;
                        z = z10;
                        b10 = b12;
                    }
                    byte b13 = bArr3[i15 + i20];
                    byte[] bArr7 = c.f6602a;
                    i12 = b10 - (b13 & 255);
                    if (i12 == 0) {
                        i20++;
                        i19++;
                        if (i20 == i17) {
                            break;
                        } else if (bArr4[i18].length != i19) {
                            z10 = z;
                        } else if (i18 == bArr4.length - 1) {
                            break;
                        } else {
                            i18++;
                            i19 = -1;
                            z10 = true;
                        }
                    } else {
                        break;
                    }
                }
                if (i12 >= 0) {
                    if (i12 <= 0) {
                        int i21 = i17 - i20;
                        int length2 = bArr4[i18].length - i19;
                        int length3 = bArr4.length;
                        for (int i22 = i18 + 1; i22 < length3; i22++) {
                            length2 += bArr4[i22].length;
                        }
                        if (length2 >= i21) {
                            if (length2 <= i21) {
                                Charset charset = StandardCharsets.UTF_8;
                                g.e(charset, "UTF_8");
                                return new String(bArr3, i15, i17, charset);
                            }
                        }
                    }
                    i13 = i11 + 1;
                }
                length = i15 - 1;
            }
            return null;
        }
    }

    static {
        new a();
    }

    public static List c(String str) {
        boolean z;
        Object obj;
        int i10 = 0;
        List n02 = l.n0(str, new char[]{'.'});
        if (n02.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        } else if (!g.a((String) n02.get(n02.size() - 1), BuildConfig.FLAVOR)) {
            return n02;
        } else {
            Iterable<Object> iterable = n02;
            int size = n02.size() - 1;
            if (size < 0) {
                size = 0;
            }
            if (size >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(("Requested element count " + size + " is less than zero.").toString());
            } else if (size == 0) {
                return k.f7764o;
            } else {
                if (iterable instanceof Collection) {
                    if (size >= ((Collection) iterable).size()) {
                        return i.y(iterable);
                    }
                    if (size == 1) {
                        if (iterable instanceof List) {
                            List list = (List) iterable;
                            if (!list.isEmpty()) {
                                obj = list.get(0);
                            } else {
                                throw new NoSuchElementException("List is empty.");
                            }
                        } else {
                            Iterator it = iterable.iterator();
                            if (it.hasNext()) {
                                obj = it.next();
                            } else {
                                throw new NoSuchElementException("Collection is empty.");
                            }
                        }
                        return u.l(obj);
                    }
                }
                ArrayList arrayList = new ArrayList(size);
                for (Object add : iterable) {
                    arrayList.add(add);
                    i10++;
                    if (i10 == size) {
                        break;
                    }
                }
                return u.n(arrayList);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r1 == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 != false) goto L_0x0039;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0043 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r0 = java.net.IDN.toUnicode(r13)
            java.lang.String r1 = "unicodeDomain"
            z8.g.e(r0, r1)
            java.util.List r0 = c(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r12.f7793a
            boolean r1 = r1.get()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0052
            java.util.concurrent.atomic.AtomicBoolean r1 = r12.f7793a
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L_0x0052
            r1 = r2
        L_0x0020:
            r12.b()     // Catch:{ InterruptedIOException -> 0x0043, IOException -> 0x0026 }
            if (r1 == 0) goto L_0x005f
            goto L_0x0039
        L_0x0026:
            r4 = move-exception
            r9.h$a r5 = r9.h.f8494c     // Catch:{ all -> 0x0041 }
            r5.getClass()     // Catch:{ all -> 0x0041 }
            r9.h r5 = r9.h.f8492a     // Catch:{ all -> 0x0041 }
            java.lang.String r6 = "Failed to read public suffix list"
            r5.getClass()     // Catch:{ all -> 0x0041 }
            r5 = 5
            r9.h.i(r5, r6, r4)     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x005f
        L_0x0039:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            goto L_0x005f
        L_0x0041:
            r13 = move-exception
            goto L_0x0048
        L_0x0043:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0041 }
            r1 = r3
            goto L_0x0020
        L_0x0048:
            if (r1 == 0) goto L_0x0051
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0051:
            throw r13
        L_0x0052:
            java.util.concurrent.CountDownLatch r1 = r12.f7794b     // Catch:{ InterruptedException -> 0x0058 }
            r1.await()     // Catch:{ InterruptedException -> 0x0058 }
            goto L_0x005f
        L_0x0058:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x005f:
            byte[] r1 = r12.f7795c
            if (r1 == 0) goto L_0x0065
            r1 = r3
            goto L_0x0066
        L_0x0065:
            r1 = r2
        L_0x0066:
            if (r1 == 0) goto L_0x01d7
            int r1 = r0.size()
            byte[][] r4 = new byte[r1][]
            r5 = r2
        L_0x006f:
            if (r5 >= r1) goto L_0x0096
            java.lang.Object r6 = r0.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r8 = "UTF_8"
            z8.g.e(r7, r8)
            if (r6 == 0) goto L_0x008e
            byte[] r6 = r6.getBytes(r7)
            java.lang.String r7 = "(this as java.lang.String).getBytes(charset)"
            z8.g.e(r6, r7)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x006f
        L_0x008e:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r13.<init>(r0)
            throw r13
        L_0x0096:
            r5 = r2
        L_0x0097:
            r6 = 0
            java.lang.String r7 = "publicSuffixListBytes"
            if (r5 >= r1) goto L_0x00ae
            byte[] r8 = r12.f7795c
            if (r8 == 0) goto L_0x00aa
            java.lang.String r8 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a.a(r8, r4, r5)
            if (r8 == 0) goto L_0x00a7
            goto L_0x00af
        L_0x00a7:
            int r5 = r5 + 1
            goto L_0x0097
        L_0x00aa:
            z8.g.l(r7)
            throw r6
        L_0x00ae:
            r8 = r6
        L_0x00af:
            if (r1 <= r3) goto L_0x00d2
            java.lang.Object r5 = r4.clone()
            byte[][] r5 = (byte[][]) r5
            int r9 = r5.length
            int r9 = r9 - r3
            r10 = r2
        L_0x00ba:
            if (r10 >= r9) goto L_0x00d2
            byte[] r11 = f7790e
            r5[r10] = r11
            byte[] r11 = r12.f7795c
            if (r11 == 0) goto L_0x00ce
            java.lang.String r11 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a.a(r11, r5, r10)
            if (r11 == 0) goto L_0x00cb
            goto L_0x00d3
        L_0x00cb:
            int r10 = r10 + 1
            goto L_0x00ba
        L_0x00ce:
            z8.g.l(r7)
            throw r6
        L_0x00d2:
            r11 = r6
        L_0x00d3:
            if (r11 == 0) goto L_0x00ed
            int r1 = r1 - r3
            r5 = r2
        L_0x00d7:
            if (r5 >= r1) goto L_0x00ed
            byte[] r7 = r12.d
            if (r7 == 0) goto L_0x00e7
            java.lang.String r7 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a.a(r7, r4, r5)
            if (r7 == 0) goto L_0x00e4
            goto L_0x00ee
        L_0x00e4:
            int r5 = r5 + 1
            goto L_0x00d7
        L_0x00e7:
            java.lang.String r13 = "publicSuffixExceptionListBytes"
            z8.g.l(r13)
            throw r6
        L_0x00ed:
            r7 = r6
        L_0x00ee:
            r1 = 46
            if (r7 == 0) goto L_0x0101
            java.lang.String r4 = "!"
            java.lang.String r4 = r4.concat(r7)
            char[] r5 = new char[r3]
            r5[r2] = r1
            java.util.List r1 = f9.l.n0(r4, r5)
            goto L_0x012d
        L_0x0101:
            if (r8 != 0) goto L_0x0108
            if (r11 != 0) goto L_0x0108
            java.util.List<java.lang.String> r1 = f7791f
            goto L_0x012d
        L_0x0108:
            o8.k r4 = o8.k.f7764o
            if (r8 == 0) goto L_0x0115
            char[] r5 = new char[r3]
            r5[r2] = r1
            java.util.List r5 = f9.l.n0(r8, r5)
            goto L_0x0116
        L_0x0115:
            r5 = r4
        L_0x0116:
            if (r11 == 0) goto L_0x0121
            char[] r4 = new char[r3]
            r4[r2] = r1
            java.util.List r1 = f9.l.n0(r11, r4)
            goto L_0x0122
        L_0x0121:
            r1 = r4
        L_0x0122:
            int r4 = r5.size()
            int r7 = r1.size()
            if (r4 <= r7) goto L_0x012d
            r1 = r5
        L_0x012d:
            int r4 = r0.size()
            int r5 = r1.size()
            r7 = 33
            if (r4 != r5) goto L_0x0146
            java.lang.Object r4 = r1.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            char r4 = r4.charAt(r2)
            if (r4 == r7) goto L_0x0146
            return r6
        L_0x0146:
            java.lang.Object r4 = r1.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            char r4 = r4.charAt(r2)
            int r0 = r0.size()
            int r1 = r1.size()
            if (r4 != r7) goto L_0x015b
            goto L_0x015d
        L_0x015b:
            int r1 = r1 + 1
        L_0x015d:
            int r0 = r0 - r1
            java.util.List r13 = c(r13)
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            o8.h r1 = new o8.h
            r1.<init>(r13)
            if (r0 < 0) goto L_0x016d
            r13 = r3
            goto L_0x016e
        L_0x016d:
            r13 = r2
        L_0x016e:
            if (r13 == 0) goto L_0x01ba
            if (r0 != 0) goto L_0x0173
            goto L_0x0184
        L_0x0173:
            boolean r13 = r1 instanceof e9.c
            if (r13 == 0) goto L_0x017e
            e9.c r1 = (e9.c) r1
            e9.b r1 = r1.a(r0)
            goto L_0x0184
        L_0x017e:
            e9.b r13 = new e9.b
            r13.<init>(r1, r0)
            r1 = r13
        L_0x0184:
            java.lang.String r13 = "<this>"
            z8.g.f(r1, r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = ""
            r13.append(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0197:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x01ad
            java.lang.Object r4 = r1.next()
            int r2 = r2 + r3
            if (r2 <= r3) goto L_0x01a9
            java.lang.String r5 = "."
            r13.append(r5)
        L_0x01a9:
            n.e.k(r13, r4, r6)
            goto L_0x0197
        L_0x01ad:
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "joinTo(StringBuilder(), …ed, transform).toString()"
            z8.g.e(r13, r0)
            return r13
        L_0x01ba:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "Requested element count "
            r13.<init>(r1)
            r13.append(r0)
            java.lang.String r0 = " is less than zero."
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        L_0x01d7:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to load publicsuffixes.gz resource from the classpath."
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        s6.a.r(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r5 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 == 0) goto L_0x004f
            w9.n r1 = new w9.n
            w9.p r0 = n.e.H(r0)
            r1.<init>(r0)
            w9.v r0 = n.e.o(r1)
            int r1 = r0.readInt()     // Catch:{ all -> 0x0048 }
            long r1 = (long) r1     // Catch:{ all -> 0x0048 }
            r0.X(r1)     // Catch:{ all -> 0x0048 }
            w9.f r3 = r0.f9361o     // Catch:{ all -> 0x0048 }
            byte[] r1 = r3.t(r1)     // Catch:{ all -> 0x0048 }
            int r2 = r0.readInt()     // Catch:{ all -> 0x0048 }
            long r2 = (long) r2     // Catch:{ all -> 0x0048 }
            r0.X(r2)     // Catch:{ all -> 0x0048 }
            w9.f r4 = r0.f9361o     // Catch:{ all -> 0x0048 }
            byte[] r2 = r4.t(r2)     // Catch:{ all -> 0x0048 }
            n8.i r3 = n8.i.f7501a     // Catch:{ all -> 0x0048 }
            r3 = 0
            s6.a.r(r0, r3)
            monitor-enter(r5)
            r5.f7795c = r1     // Catch:{ all -> 0x0045 }
            r5.d = r2     // Catch:{ all -> 0x0045 }
            monitor-exit(r5)
            java.util.concurrent.CountDownLatch r0 = r5.f7794b
            r0.countDown()
            return
        L_0x0045:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0048:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004a }
        L_0x004a:
            r2 = move-exception
            s6.a.r(r0, r1)
            throw r2
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.b():void");
    }
}

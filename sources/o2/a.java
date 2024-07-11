package o2;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a implements Closeable {
    public final ThreadPoolExecutor A = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());
    public final C0109a B = new C0109a();

    /* renamed from: o  reason: collision with root package name */
    public final File f7680o;

    /* renamed from: p  reason: collision with root package name */
    public final File f7681p;

    /* renamed from: q  reason: collision with root package name */
    public final File f7682q;

    /* renamed from: r  reason: collision with root package name */
    public final File f7683r;

    /* renamed from: s  reason: collision with root package name */
    public final int f7684s;

    /* renamed from: t  reason: collision with root package name */
    public final long f7685t;
    public final int u;

    /* renamed from: v  reason: collision with root package name */
    public long f7686v = 0;
    public BufferedWriter w;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap<String, d> f7687x = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: y  reason: collision with root package name */
    public int f7688y;
    public long z = 0;

    /* renamed from: o2.a$a  reason: collision with other inner class name */
    public class C0109a implements Callable<Void> {
        public C0109a() {
        }

        public final Object call() {
            synchronized (a.this) {
                a aVar = a.this;
                if (aVar.w != null) {
                    aVar.u();
                    if (a.this.j()) {
                        a.this.s();
                        a.this.f7688y = 0;
                    }
                }
            }
            return null;
        }
    }

    public static final class b implements ThreadFactory {
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    public final class c {

        /* renamed from: a  reason: collision with root package name */
        public final d f7690a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f7691b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f7692c;

        public c(d dVar) {
            boolean[] zArr;
            this.f7690a = dVar;
            if (dVar.f7696e) {
                zArr = null;
            } else {
                zArr = new boolean[a.this.u];
            }
            this.f7691b = zArr;
        }

        public final void a() {
            a.a(a.this, this, false);
        }

        public final File b() {
            File file;
            synchronized (a.this) {
                d dVar = this.f7690a;
                if (dVar.f7697f == this) {
                    if (!dVar.f7696e) {
                        this.f7691b[0] = true;
                    }
                    file = dVar.d[0];
                    a.this.f7680o.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return file;
        }
    }

    public final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f7693a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f7694b;

        /* renamed from: c  reason: collision with root package name */
        public final File[] f7695c;
        public final File[] d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f7696e;

        /* renamed from: f  reason: collision with root package name */
        public c f7697f;

        public d(String str) {
            this.f7693a = str;
            int i10 = a.this.u;
            this.f7694b = new long[i10];
            this.f7695c = new File[i10];
            this.d = new File[i10];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i11 = 0; i11 < a.this.u; i11++) {
                sb.append(i11);
                File[] fileArr = this.f7695c;
                String sb2 = sb.toString();
                File file = a.this.f7680o;
                fileArr[i11] = new File(file, sb2);
                sb.append(".tmp");
                this.d[i11] = new File(file, sb.toString());
                sb.setLength(length);
            }
        }

        public final String a() {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f7694b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }
    }

    public final class e {

        /* renamed from: a  reason: collision with root package name */
        public final File[] f7699a;

        public e(File[] fileArr) {
            this.f7699a = fileArr;
        }
    }

    public a(File file, long j8) {
        File file2 = file;
        this.f7680o = file2;
        this.f7684s = 1;
        this.f7681p = new File(file2, "journal");
        this.f7682q = new File(file2, "journal.tmp");
        this.f7683r = new File(file2, "journal.bkp");
        this.u = 1;
        this.f7685t = j8;
    }

    public static void a(a aVar, c cVar, boolean z10) {
        synchronized (aVar) {
            d dVar = cVar.f7690a;
            if (dVar.f7697f == cVar) {
                if (z10 && !dVar.f7696e) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= aVar.u) {
                            break;
                        } else if (!cVar.f7691b[i10]) {
                            cVar.a();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                        } else if (!dVar.d[i10].exists()) {
                            cVar.a();
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                for (int i11 = 0; i11 < aVar.u; i11++) {
                    File file = dVar.d[i11];
                    if (!z10) {
                        c(file);
                    } else if (file.exists()) {
                        File file2 = dVar.f7695c[i11];
                        file.renameTo(file2);
                        long j8 = dVar.f7694b[i11];
                        long length = file2.length();
                        dVar.f7694b[i11] = length;
                        aVar.f7686v = (aVar.f7686v - j8) + length;
                    }
                }
                aVar.f7688y++;
                dVar.f7697f = null;
                if (dVar.f7696e || z10) {
                    dVar.f7696e = true;
                    aVar.w.append("CLEAN");
                    aVar.w.append(' ');
                    aVar.w.append(dVar.f7693a);
                    aVar.w.append(dVar.a());
                    aVar.w.append(10);
                    if (z10) {
                        aVar.z++;
                        dVar.getClass();
                    }
                } else {
                    aVar.f7687x.remove(dVar.f7693a);
                    aVar.w.append("REMOVE");
                    aVar.w.append(' ');
                    aVar.w.append(dVar.f7693a);
                    aVar.w.append(10);
                }
                f(aVar.w);
                if (aVar.f7686v > aVar.f7685t || aVar.j()) {
                    aVar.A.submit(aVar.B);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @TargetApi(26)
    public static void b(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void c(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void f(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static a l(File file, long j8) {
        if (j8 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    t(file2, file3, false);
                }
            }
            a aVar = new a(file, j8);
            if (aVar.f7681p.exists()) {
                try {
                    aVar.o();
                    aVar.n();
                    return aVar;
                } catch (IOException e10) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                    aVar.close();
                    c.a(aVar.f7680o);
                }
            }
            file.mkdirs();
            a aVar2 = new a(file, j8);
            aVar2.s();
            return aVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void t(File file, File file2, boolean z10) {
        if (z10) {
            c(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final synchronized void close() {
        if (this.w != null) {
            Iterator it = new ArrayList(this.f7687x.values()).iterator();
            while (it.hasNext()) {
                c cVar = ((d) it.next()).f7697f;
                if (cVar != null) {
                    cVar.a();
                }
            }
            u();
            b(this.w);
            this.w = null;
        }
    }

    public final c d(String str) {
        synchronized (this) {
            if (this.w != null) {
                d dVar = this.f7687x.get(str);
                if (dVar == null) {
                    dVar = new d(str);
                    this.f7687x.put(str, dVar);
                } else if (dVar.f7697f != null) {
                    return null;
                }
                c cVar = new c(dVar);
                dVar.f7697f = cVar;
                this.w.append("DIRTY");
                this.w.append(' ');
                this.w.append(str);
                this.w.append(10);
                f(this.w);
                return cVar;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized e g(String str) {
        if (this.w != null) {
            d dVar = this.f7687x.get(str);
            if (dVar == null) {
                return null;
            }
            if (!dVar.f7696e) {
                return null;
            }
            for (File exists : dVar.f7695c) {
                if (!exists.exists()) {
                    return null;
                }
            }
            this.f7688y++;
            this.w.append("READ");
            this.w.append(' ');
            this.w.append(str);
            this.w.append(10);
            if (j()) {
                this.A.submit(this.B);
            }
            return new e(dVar.f7695c);
        }
        throw new IllegalStateException("cache is closed");
    }

    public final boolean j() {
        int i10 = this.f7688y;
        return i10 >= 2000 && i10 >= this.f7687x.size();
    }

    public final void n() {
        c(this.f7682q);
        Iterator<d> it = this.f7687x.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            c cVar = next.f7697f;
            int i10 = this.u;
            int i11 = 0;
            if (cVar == null) {
                while (i11 < i10) {
                    this.f7686v += next.f7694b[i11];
                    i11++;
                }
            } else {
                next.f7697f = null;
                while (i11 < i10) {
                    c(next.f7695c[i11]);
                    c(next.d[i11]);
                    i11++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:16|17|(1:19)|(1:21)(1:22)|23|24|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r10.f7688y = r1 - r10.f7687x.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006f, code lost:
        if (r2.f7704s == -1) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        if (r0 != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        r10.w = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r4, true), o2.c.f7706a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0062 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0062=Splitter:B:16:0x0062, B:29:0x0093=Splitter:B:29:0x0093} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o() {
        /*
            r10 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            o2.b r2 = new o2.b
            java.io.FileInputStream r3 = new java.io.FileInputStream
            java.io.File r4 = r10.f7681p
            r3.<init>(r4)
            java.nio.charset.Charset r5 = o2.c.f7706a
            r2.<init>(r3, r5)
            java.lang.String r3 = r2.a()     // Catch:{ all -> 0x0091 }
            java.lang.String r5 = r2.a()     // Catch:{ all -> 0x0091 }
            java.lang.String r6 = r2.a()     // Catch:{ all -> 0x0091 }
            java.lang.String r7 = r2.a()     // Catch:{ all -> 0x0091 }
            java.lang.String r8 = r2.a()     // Catch:{ all -> 0x0091 }
            java.lang.String r9 = "libcore.io.DiskLruCache"
            boolean r9 = r9.equals(r3)     // Catch:{ all -> 0x0091 }
            if (r9 == 0) goto L_0x0093
            java.lang.String r9 = "1"
            boolean r9 = r9.equals(r5)     // Catch:{ all -> 0x0091 }
            if (r9 == 0) goto L_0x0093
            int r9 = r10.f7684s     // Catch:{ all -> 0x0091 }
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch:{ all -> 0x0091 }
            boolean r6 = r9.equals(r6)     // Catch:{ all -> 0x0091 }
            if (r6 == 0) goto L_0x0093
            int r6 = r10.u     // Catch:{ all -> 0x0091 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0091 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x0091 }
            if (r6 == 0) goto L_0x0093
            java.lang.String r6 = ""
            boolean r6 = r6.equals(r8)     // Catch:{ all -> 0x0091 }
            if (r6 == 0) goto L_0x0093
            r0 = 0
            r1 = r0
        L_0x0058:
            java.lang.String r3 = r2.a()     // Catch:{ EOFException -> 0x0062 }
            r10.r(r3)     // Catch:{ EOFException -> 0x0062 }
            int r1 = r1 + 1
            goto L_0x0058
        L_0x0062:
            java.util.LinkedHashMap<java.lang.String, o2.a$d> r3 = r10.f7687x     // Catch:{ all -> 0x0091 }
            int r3 = r3.size()     // Catch:{ all -> 0x0091 }
            int r1 = r1 - r3
            r10.f7688y = r1     // Catch:{ all -> 0x0091 }
            int r1 = r2.f7704s     // Catch:{ all -> 0x0091 }
            r3 = -1
            r5 = 1
            if (r1 != r3) goto L_0x0072
            r0 = r5
        L_0x0072:
            if (r0 == 0) goto L_0x0078
            r10.s()     // Catch:{ all -> 0x0091 }
            goto L_0x008b
        L_0x0078:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x0091 }
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0091 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0091 }
            r3.<init>(r4, r5)     // Catch:{ all -> 0x0091 }
            java.nio.charset.Charset r4 = o2.c.f7706a     // Catch:{ all -> 0x0091 }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x0091 }
            r0.<init>(r1)     // Catch:{ all -> 0x0091 }
            r10.w = r0     // Catch:{ all -> 0x0091 }
        L_0x008b:
            r2.close()     // Catch:{ RuntimeException -> 0x008f, Exception -> 0x008e }
        L_0x008e:
            return
        L_0x008f:
            r0 = move-exception
            throw r0
        L_0x0091:
            r0 = move-exception
            goto L_0x00bc
        L_0x0093:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0091 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0091 }
            r6.<init>(r1)     // Catch:{ all -> 0x0091 }
            r6.append(r3)     // Catch:{ all -> 0x0091 }
            r6.append(r0)     // Catch:{ all -> 0x0091 }
            r6.append(r5)     // Catch:{ all -> 0x0091 }
            r6.append(r0)     // Catch:{ all -> 0x0091 }
            r6.append(r7)     // Catch:{ all -> 0x0091 }
            r6.append(r0)     // Catch:{ all -> 0x0091 }
            r6.append(r8)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "]"
            r6.append(r0)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0091 }
            r4.<init>(r0)     // Catch:{ all -> 0x0091 }
            throw r4     // Catch:{ all -> 0x0091 }
        L_0x00bc:
            r2.close()     // Catch:{ RuntimeException -> 0x00c0, Exception -> 0x00bf }
        L_0x00bf:
            throw r0
        L_0x00c0:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.a.o():void");
    }

    public final void r(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            LinkedHashMap<String, d> linkedHashMap = this.f7687x;
            if (indexOf2 == -1) {
                str2 = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    linkedHashMap.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i10, indexOf2);
            }
            d dVar = linkedHashMap.get(str2);
            if (dVar == null) {
                dVar = new d(str2);
                linkedHashMap.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f7696e = true;
                dVar.f7697f = null;
                if (split.length == a.this.u) {
                    int i11 = 0;
                    while (i11 < split.length) {
                        try {
                            dVar.f7694b[i11] = Long.parseLong(split[i11]);
                            i11++;
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f7697f = new c(dVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        } else {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    /* JADX INFO: finally extract failed */
    public final synchronized void s() {
        StringBuilder sb;
        BufferedWriter bufferedWriter = this.w;
        if (bufferedWriter != null) {
            b(bufferedWriter);
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f7682q), c.f7706a));
        try {
            bufferedWriter2.write("libcore.io.DiskLruCache");
            bufferedWriter2.write("\n");
            bufferedWriter2.write("1");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f7684s));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.u));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (d next : this.f7687x.values()) {
                if (next.f7697f != null) {
                    sb = new StringBuilder();
                    sb.append("DIRTY ");
                    sb.append(next.f7693a);
                    sb.append(10);
                } else {
                    sb = new StringBuilder();
                    sb.append("CLEAN ");
                    sb.append(next.f7693a);
                    sb.append(next.a());
                    sb.append(10);
                }
                bufferedWriter2.write(sb.toString());
            }
            b(bufferedWriter2);
            if (this.f7681p.exists()) {
                t(this.f7681p, this.f7683r, true);
            }
            t(this.f7682q, this.f7681p, false);
            this.f7683r.delete();
            this.w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f7681p, true), c.f7706a));
        } catch (Throwable th) {
            b(bufferedWriter2);
            throw th;
        }
    }

    public final void u() {
        while (this.f7686v > this.f7685t) {
            String str = (String) this.f7687x.entrySet().iterator().next().getKey();
            synchronized (this) {
                if (this.w != null) {
                    d dVar = this.f7687x.get(str);
                    if (dVar != null) {
                        if (dVar.f7697f == null) {
                            for (int i10 = 0; i10 < this.u; i10++) {
                                File file = dVar.f7695c[i10];
                                if (file.exists()) {
                                    if (!file.delete()) {
                                        throw new IOException("failed to delete " + file);
                                    }
                                }
                                long j8 = this.f7686v;
                                long[] jArr = dVar.f7694b;
                                this.f7686v = j8 - jArr[i10];
                                jArr[i10] = 0;
                            }
                            this.f7688y++;
                            this.w.append("REMOVE");
                            this.w.append(' ');
                            this.w.append(str);
                            this.w.append(10);
                            this.f7687x.remove(str);
                            if (j()) {
                                this.A.submit(this.B);
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("cache is closed");
                }
            }
        }
    }
}

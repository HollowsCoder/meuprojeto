package w8;

import com.google.android.gms.internal.measurement.d8;
import e9.d;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import o8.o;
import z8.g;

public final class a implements d<File> {

    /* renamed from: a  reason: collision with root package name */
    public final File f9294a;

    /* renamed from: b  reason: collision with root package name */
    public final b f9295b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9296c = Integer.MAX_VALUE;

    /* renamed from: w8.a$a  reason: collision with other inner class name */
    public static abstract class C0153a extends c {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0153a(File file) {
            super(file);
            g.f(file, "rootDir");
        }
    }

    public final class b extends o8.b<File> {

        /* renamed from: q  reason: collision with root package name */
        public final ArrayDeque<c> f9297q;

        /* renamed from: w8.a$b$a  reason: collision with other inner class name */
        public final class C0154a extends C0153a {

            /* renamed from: b  reason: collision with root package name */
            public boolean f9299b;

            /* renamed from: c  reason: collision with root package name */
            public File[] f9300c;
            public int d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f9301e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ b f9302f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0154a(b bVar, File file) {
                super(file);
                g.f(file, "rootDir");
                this.f9302f = bVar;
            }

            public final File a() {
                boolean z = this.f9301e;
                File file = this.f9308a;
                b bVar = this.f9302f;
                if (!z && this.f9300c == null) {
                    a.this.getClass();
                    File[] listFiles = file.listFiles();
                    this.f9300c = listFiles;
                    if (listFiles == null) {
                        a.this.getClass();
                        this.f9301e = true;
                    }
                }
                File[] fileArr = this.f9300c;
                if (fileArr != null) {
                    int i10 = this.d;
                    g.c(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.f9300c;
                        g.c(fileArr2);
                        int i11 = this.d;
                        this.d = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (!this.f9299b) {
                    this.f9299b = true;
                    return file;
                }
                a.this.getClass();
                return null;
            }
        }

        /* renamed from: w8.a$b$b  reason: collision with other inner class name */
        public final class C0155b extends c {

            /* renamed from: b  reason: collision with root package name */
            public boolean f9303b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0155b(File file) {
                super(file);
                g.f(file, "rootFile");
            }

            public final File a() {
                if (this.f9303b) {
                    return null;
                }
                this.f9303b = true;
                return this.f9308a;
            }
        }

        public final class c extends C0153a {

            /* renamed from: b  reason: collision with root package name */
            public boolean f9304b;

            /* renamed from: c  reason: collision with root package name */
            public File[] f9305c;
            public int d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ b f9306e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(b bVar, File file) {
                super(file);
                g.f(file, "rootDir");
                this.f9306e = bVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
                if (r0.length == 0) goto L_0x0040;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.io.File a() {
                /*
                    r5 = this;
                    boolean r0 = r5.f9304b
                    java.io.File r1 = r5.f9308a
                    w8.a$b r2 = r5.f9306e
                    if (r0 != 0) goto L_0x0011
                    w8.a r0 = w8.a.this
                    r0.getClass()
                    r0 = 1
                    r5.f9304b = r0
                    return r1
                L_0x0011:
                    java.io.File[] r0 = r5.f9305c
                    r3 = 0
                    if (r0 == 0) goto L_0x0025
                    int r4 = r5.d
                    z8.g.c(r0)
                    int r0 = r0.length
                    if (r4 >= r0) goto L_0x001f
                    goto L_0x0025
                L_0x001f:
                    w8.a r0 = w8.a.this
                    r0.getClass()
                    return r3
                L_0x0025:
                    java.io.File[] r0 = r5.f9305c
                    if (r0 != 0) goto L_0x0046
                    java.io.File[] r0 = r1.listFiles()
                    r5.f9305c = r0
                    if (r0 != 0) goto L_0x0036
                    w8.a r0 = w8.a.this
                    r0.getClass()
                L_0x0036:
                    java.io.File[] r0 = r5.f9305c
                    if (r0 == 0) goto L_0x0040
                    z8.g.c(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L_0x0046
                L_0x0040:
                    w8.a r0 = w8.a.this
                    r0.getClass()
                    return r3
                L_0x0046:
                    java.io.File[] r0 = r5.f9305c
                    z8.g.c(r0)
                    int r1 = r5.d
                    int r2 = r1 + 1
                    r5.d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: w8.a.b.c.a():java.io.File");
            }
        }

        public /* synthetic */ class d {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f9307a;

            static {
                int[] iArr = new int[b.values().length];
                iArr[b.TOP_DOWN.ordinal()] = 1;
                iArr[b.BOTTOM_UP.ordinal()] = 2;
                f9307a = iArr;
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f9297q = arrayDeque;
            boolean isDirectory = a.this.f9294a.isDirectory();
            File file = a.this.f9294a;
            if (isDirectory) {
                arrayDeque.push(a(file));
            } else if (file.isFile()) {
                arrayDeque.push(new C0155b(file));
            } else {
                this.f7751o = o.Done;
            }
        }

        public final C0153a a(File file) {
            int i10 = d.f9307a[a.this.f9295b.ordinal()];
            if (i10 == 1) {
                return new c(this, file);
            }
            if (i10 == 2) {
                return new C0154a(this, file);
            }
            throw new d8();
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final File f9308a;

        public c(File file) {
            g.f(file, "root");
            this.f9308a = file;
        }

        public abstract File a();
    }

    public a(File file, b bVar) {
        this.f9294a = file;
        this.f9295b = bVar;
    }

    public final Iterator<File> iterator() {
        return new b();
    }
}

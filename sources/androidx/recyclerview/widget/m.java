package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import e0.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

public final class m implements Runnable {

    /* renamed from: s  reason: collision with root package name */
    public static final ThreadLocal<m> f1831s = new ThreadLocal<>();

    /* renamed from: t  reason: collision with root package name */
    public static final a f1832t = new a();

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList<RecyclerView> f1833o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public long f1834p;

    /* renamed from: q  reason: collision with root package name */
    public long f1835q;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList<c> f1836r = new ArrayList<>();

    public class a implements Comparator<c> {
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
            if (r0 == null) goto L_0x0019;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
            if (r0 != false) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            return -1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int compare(java.lang.Object r7, java.lang.Object r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.m$c r7 = (androidx.recyclerview.widget.m.c) r7
                androidx.recyclerview.widget.m$c r8 = (androidx.recyclerview.widget.m.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x000c
                r3 = r2
                goto L_0x000d
            L_0x000c:
                r3 = r1
            L_0x000d:
                androidx.recyclerview.widget.RecyclerView r4 = r8.d
                if (r4 != 0) goto L_0x0013
                r4 = r2
                goto L_0x0014
            L_0x0013:
                r4 = r1
            L_0x0014:
                r5 = -1
                if (r3 == r4) goto L_0x001d
                if (r0 != 0) goto L_0x001b
            L_0x0019:
                r1 = r2
                goto L_0x0037
            L_0x001b:
                r1 = r5
                goto L_0x0037
            L_0x001d:
                boolean r0 = r7.f1840a
                boolean r3 = r8.f1840a
                if (r0 == r3) goto L_0x0026
                if (r0 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0026:
                int r0 = r8.f1841b
                int r2 = r7.f1841b
                int r0 = r0 - r2
                if (r0 == 0) goto L_0x002f
                r1 = r0
                goto L_0x0037
            L_0x002f:
                int r7 = r7.f1842c
                int r8 = r8.f1842c
                int r7 = r7 - r8
                if (r7 == 0) goto L_0x0037
                r1 = r7
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.m.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    @SuppressLint({"VisibleForTests"})
    public static class b implements RecyclerView.n.c {

        /* renamed from: a  reason: collision with root package name */
        public int f1837a;

        /* renamed from: b  reason: collision with root package name */
        public int f1838b;

        /* renamed from: c  reason: collision with root package name */
        public int[] f1839c;
        public int d;

        public final void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i11 >= 0) {
                int i12 = this.d * 2;
                int[] iArr = this.f1839c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f1839c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i12 >= iArr.length) {
                    int[] iArr3 = new int[(i12 * 2)];
                    this.f1839c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f1839c;
                iArr4[i12] = i10;
                iArr4[i12 + 1] = i11;
                this.d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        public final void b(RecyclerView recyclerView, boolean z) {
            boolean z10 = false;
            this.d = 0;
            int[] iArr = this.f1839c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.n nVar = recyclerView.A;
            if (recyclerView.z != null && nVar != null && nVar.f1646i) {
                if (!z) {
                    if (!recyclerView.I || recyclerView.R || recyclerView.f1588r.g()) {
                        z10 = true;
                    }
                    if (!z10) {
                        nVar.h(this.f1837a, this.f1838b, recyclerView.f1595v0, this);
                    }
                } else if (!recyclerView.f1588r.g()) {
                    nVar.i(recyclerView.z.a(), this);
                }
                int i10 = this.d;
                if (i10 > nVar.f1647j) {
                    nVar.f1647j = i10;
                    nVar.f1648k = z;
                    recyclerView.f1584p.k();
                }
            }
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1840a;

        /* renamed from: b  reason: collision with root package name */
        public int f1841b;

        /* renamed from: c  reason: collision with root package name */
        public int f1842c;
        public RecyclerView d;

        /* renamed from: e  reason: collision with root package name */
        public int f1843e;
    }

    public static RecyclerView.c0 c(RecyclerView recyclerView, int i10, long j8) {
        boolean z;
        int h10 = recyclerView.f1590s.h();
        int i11 = 0;
        while (true) {
            if (i11 >= h10) {
                z = false;
                break;
            }
            RecyclerView.c0 J = RecyclerView.J(recyclerView.f1590s.g(i11));
            if (J.f1611c == i10 && !J.g()) {
                z = true;
                break;
            }
            i11++;
        }
        if (z) {
            return null;
        }
        RecyclerView.u uVar = recyclerView.f1584p;
        try {
            recyclerView.P();
            RecyclerView.c0 i12 = uVar.i(i10, j8);
            if (i12 != null) {
                if (!i12.f() || i12.g()) {
                    uVar.a(i12, false);
                } else {
                    uVar.f(i12.f1609a);
                }
            }
            return i12;
        } finally {
            recyclerView.Q(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f1834p == 0) {
            this.f1834p = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.f1593u0;
        bVar.f1837a = i10;
        bVar.f1838b = i11;
    }

    public final void b(long j8) {
        c cVar;
        RecyclerView recyclerView;
        long j10;
        RecyclerView recyclerView2;
        c cVar2;
        boolean z;
        ArrayList<RecyclerView> arrayList = this.f1833o;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = arrayList.get(i11);
            if (recyclerView3.getWindowVisibility() == 0) {
                b bVar = recyclerView3.f1593u0;
                bVar.b(recyclerView3, false);
                i10 += bVar.d;
            }
        }
        ArrayList<c> arrayList2 = this.f1836r;
        arrayList2.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = arrayList.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar2 = recyclerView4.f1593u0;
                int abs = Math.abs(bVar2.f1838b) + Math.abs(bVar2.f1837a);
                for (int i14 = 0; i14 < bVar2.d * 2; i14 += 2) {
                    if (i12 >= arrayList2.size()) {
                        cVar2 = new c();
                        arrayList2.add(cVar2);
                    } else {
                        cVar2 = arrayList2.get(i12);
                    }
                    int[] iArr = bVar2.f1839c;
                    int i15 = iArr[i14 + 1];
                    if (i15 <= abs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar2.f1840a = z;
                    cVar2.f1841b = abs;
                    cVar2.f1842c = i15;
                    cVar2.d = recyclerView4;
                    cVar2.f1843e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList2, f1832t);
        for (int i16 = 0; i16 < arrayList2.size() && (recyclerView = cVar.d) != null; i16++) {
            if ((cVar = arrayList2.get(i16)).f1840a) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = j8;
            }
            RecyclerView.c0 c10 = c(recyclerView, cVar.f1843e, j10);
            if (!(c10 == null || c10.f1610b == null || !c10.f() || c10.g() || (recyclerView2 = c10.f1610b.get()) == null)) {
                if (recyclerView2.R && recyclerView2.f1590s.h() != 0) {
                    RecyclerView.k kVar = recyclerView2.f1571d0;
                    if (kVar != null) {
                        kVar.e();
                    }
                    RecyclerView.n nVar = recyclerView2.A;
                    RecyclerView.u uVar = recyclerView2.f1584p;
                    if (nVar != null) {
                        nVar.j0(uVar);
                        recyclerView2.A.k0(uVar);
                    }
                    uVar.f1665a.clear();
                    uVar.d();
                }
                b bVar3 = recyclerView2.f1593u0;
                bVar3.b(recyclerView2, true);
                if (bVar3.d != 0) {
                    try {
                        int i17 = d.f4446a;
                        Trace.beginSection("RV Nested Prefetch");
                        RecyclerView.z zVar = recyclerView2.f1595v0;
                        RecyclerView.f fVar = recyclerView2.z;
                        zVar.d = 1;
                        zVar.f1690e = fVar.a();
                        zVar.f1692g = false;
                        zVar.f1693h = false;
                        zVar.f1694i = false;
                        for (int i18 = 0; i18 < bVar3.d * 2; i18 += 2) {
                            c(recyclerView2, bVar3.f1839c[i18], j8);
                        }
                        long j11 = j8;
                        Trace.endSection();
                        cVar.f1840a = false;
                        cVar.f1841b = 0;
                        cVar.f1842c = 0;
                        cVar.d = null;
                        cVar.f1843e = 0;
                    } catch (Throwable th) {
                        int i19 = d.f4446a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            long j12 = j8;
            cVar.f1840a = false;
            cVar.f1841b = 0;
            cVar.f1842c = 0;
            cVar.d = null;
            cVar.f1843e = 0;
        }
    }

    public final void run() {
        try {
            int i10 = d.f4446a;
            Trace.beginSection("RV Prefetch");
            ArrayList<RecyclerView> arrayList = this.f1833o;
            if (arrayList.isEmpty()) {
                this.f1834p = 0;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j8 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                RecyclerView recyclerView = arrayList.get(i11);
                if (recyclerView.getWindowVisibility() == 0) {
                    j8 = Math.max(recyclerView.getDrawingTime(), j8);
                }
            }
            if (j8 == 0) {
                this.f1834p = 0;
                Trace.endSection();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j8) + this.f1835q);
            this.f1834p = 0;
            Trace.endSection();
        } catch (Throwable th) {
            this.f1834p = 0;
            int i12 = d.f4446a;
            Trace.endSection();
            throw th;
        }
    }
}

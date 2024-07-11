package j1;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import k1.m;
import o1.h;

@TargetApi(19)
public final class l implements m, j {

    /* renamed from: a  reason: collision with root package name */
    public final Path f6468a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Path f6469b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final Path f6470c = new Path();
    public final ArrayList d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final h f6471e;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6472a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o1.h$a[] r0 = o1.h.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6472a = r0
                o1.h$a r1 = o1.h.a.MERGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6472a     // Catch:{ NoSuchFieldError -> 0x001d }
                o1.h$a r1 = o1.h.a.ADD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6472a     // Catch:{ NoSuchFieldError -> 0x0028 }
                o1.h$a r1 = o1.h.a.SUBTRACT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f6472a     // Catch:{ NoSuchFieldError -> 0x0033 }
                o1.h$a r1 = o1.h.a.INTERSECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f6472a     // Catch:{ NoSuchFieldError -> 0x003e }
                o1.h$a r1 = o1.h.a.EXCLUDE_INTERSECTIONS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j1.l.a.<clinit>():void");
        }
    }

    public l(h hVar) {
        hVar.getClass();
        this.f6471e = hVar;
    }

    @TargetApi(19)
    public final void b(Path.Op op) {
        Matrix matrix;
        Matrix matrix2;
        Path path = this.f6469b;
        path.reset();
        Path path2 = this.f6468a;
        path2.reset();
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            m mVar = (m) arrayList.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                ArrayList arrayList2 = (ArrayList) dVar.d();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path f10 = ((m) arrayList2.get(size2)).f();
                    m mVar2 = dVar.f6426k;
                    if (mVar2 != null) {
                        matrix2 = mVar2.d();
                    } else {
                        matrix2 = dVar.f6419c;
                        matrix2.reset();
                    }
                    f10.transform(matrix2);
                    path.addPath(f10);
                }
            } else {
                path.addPath(mVar.f());
            }
        }
        int i10 = 0;
        m mVar3 = (m) arrayList.get(0);
        if (mVar3 instanceof d) {
            d dVar2 = (d) mVar3;
            List<m> d10 = dVar2.d();
            while (true) {
                ArrayList arrayList3 = (ArrayList) d10;
                if (i10 >= arrayList3.size()) {
                    break;
                }
                Path f11 = ((m) arrayList3.get(i10)).f();
                m mVar4 = dVar2.f6426k;
                if (mVar4 != null) {
                    matrix = mVar4.d();
                } else {
                    matrix = dVar2.f6419c;
                    matrix.reset();
                }
                f11.transform(matrix);
                path2.addPath(f11);
                i10++;
            }
        } else {
            path2.set(mVar3.f());
        }
        this.f6470c.op(path2, path, op);
    }

    public final void c(List<c> list, List<c> list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                ((m) arrayList.get(i10)).c(list, list2);
                i10++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(java.util.ListIterator<j1.c> r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r3.previous()
            if (r0 == r2) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r3.previous()
            j1.c r0 = (j1.c) r0
            boolean r1 = r0 instanceof j1.m
            if (r1 == 0) goto L_0x000d
            java.util.ArrayList r1 = r2.d
            j1.m r0 = (j1.m) r0
            r1.add(r0)
            r3.remove()
            goto L_0x000d
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.l.d(java.util.ListIterator):void");
    }

    public final Path f() {
        Path.Op op;
        Path path = this.f6470c;
        path.reset();
        h hVar = this.f6471e;
        if (hVar.f7633b) {
            return path;
        }
        int i10 = a.f6472a[hVar.f7632a.ordinal()];
        if (i10 == 1) {
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i11 >= arrayList.size()) {
                    break;
                }
                path.addPath(((m) arrayList.get(i11)).f());
                i11++;
            }
        } else {
            if (i10 == 2) {
                op = Path.Op.UNION;
            } else if (i10 == 3) {
                op = Path.Op.REVERSE_DIFFERENCE;
            } else if (i10 == 4) {
                op = Path.Op.INTERSECT;
            } else if (i10 == 5) {
                op = Path.Op.XOR;
            }
            b(op);
        }
        return path;
    }
}

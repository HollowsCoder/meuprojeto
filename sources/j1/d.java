package j1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import h1.l;
import java.util.ArrayList;
import java.util.List;
import k1.a;
import k1.m;
import m1.e;
import m1.f;
import n1.g;
import p1.b;
import t1.g;
import u1.c;

public final class d implements e, m, a.C0091a, f {

    /* renamed from: a  reason: collision with root package name */
    public final i1.a f6417a;

    /* renamed from: b  reason: collision with root package name */
    public final RectF f6418b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f6419c;
    public final Path d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f6420e;

    /* renamed from: f  reason: collision with root package name */
    public final String f6421f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6422g;

    /* renamed from: h  reason: collision with root package name */
    public final List<c> f6423h;

    /* renamed from: i  reason: collision with root package name */
    public final l f6424i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f6425j;

    /* renamed from: k  reason: collision with root package name */
    public final m f6426k;

    public d(l lVar, b bVar, String str, boolean z, ArrayList arrayList, g gVar) {
        this.f6417a = new i1.a();
        this.f6418b = new RectF();
        this.f6419c = new Matrix();
        this.d = new Path();
        this.f6420e = new RectF();
        this.f6421f = str;
        this.f6424i = lVar;
        this.f6422g = z;
        this.f6423h = arrayList;
        if (gVar != null) {
            m mVar = new m(gVar);
            this.f6426k = mVar;
            mVar.a(bVar);
            mVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof j) {
                arrayList2.add((j) cVar);
            }
        }
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                ((j) arrayList2.get(size2)).d(arrayList.listIterator(arrayList.size()));
            } else {
                return;
            }
        }
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.f6419c;
        matrix2.set(matrix);
        m mVar = this.f6426k;
        if (mVar != null) {
            matrix2.preConcat(mVar.d());
        }
        RectF rectF2 = this.f6420e;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List<c> list = this.f6423h;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                c cVar = list.get(size);
                if (cVar instanceof e) {
                    ((e) cVar).a(rectF2, matrix2, z);
                    rectF.union(rectF2);
                }
            } else {
                return;
            }
        }
    }

    public final void b() {
        this.f6424i.invalidateSelf();
    }

    public final void c(List<c> list, List<c> list2) {
        int size = list.size();
        List<c> list3 = this.f6423h;
        ArrayList arrayList = new ArrayList(list3.size() + size);
        arrayList.addAll(list);
        for (int size2 = list3.size() - 1; size2 >= 0; size2--) {
            c cVar = list3.get(size2);
            cVar.c(arrayList, list3.subList(0, size2));
            arrayList.add(cVar);
        }
    }

    public final List<m> d() {
        if (this.f6425j == null) {
            this.f6425j = new ArrayList();
            int i10 = 0;
            while (true) {
                List<c> list = this.f6423h;
                if (i10 >= list.size()) {
                    break;
                }
                c cVar = list.get(i10);
                if (cVar instanceof m) {
                    this.f6425j.add((m) cVar);
                }
                i10++;
            }
        }
        return this.f6425j;
    }

    public final void e(Canvas canvas, Matrix matrix, int i10) {
        boolean z;
        int i11;
        if (!this.f6422g) {
            Matrix matrix2 = this.f6419c;
            matrix2.set(matrix);
            m mVar = this.f6426k;
            if (mVar != null) {
                matrix2.preConcat(mVar.d());
                a<Integer, Integer> aVar = mVar.f6666j;
                if (aVar == null) {
                    i11 = 100;
                } else {
                    i11 = aVar.f().intValue();
                }
                i10 = (int) ((((((float) i11) / 100.0f) * ((float) i10)) / 255.0f) * 255.0f);
            }
            boolean z10 = this.f6424i.E;
            boolean z11 = false;
            List<c> list = this.f6423h;
            if (z10) {
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i12 < list.size()) {
                        if ((list.get(i12) instanceof e) && (i13 = i13 + 1) >= 2) {
                            z = true;
                            break;
                        }
                        i12++;
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z && i10 != 255) {
                    z11 = true;
                }
            }
            if (z11) {
                RectF rectF = this.f6418b;
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                a(rectF, matrix2, true);
                i1.a aVar2 = this.f6417a;
                aVar2.setAlpha(i10);
                g.a aVar3 = t1.g.f8886a;
                canvas.saveLayer(rectF, aVar2);
                androidx.databinding.a.n();
            }
            if (z11) {
                i10 = 255;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                c cVar = list.get(size);
                if (cVar instanceof e) {
                    ((e) cVar).e(canvas, matrix2, i10);
                }
            }
            if (z11) {
                canvas.restore();
            }
        }
    }

    public final Path f() {
        Matrix matrix = this.f6419c;
        matrix.reset();
        m mVar = this.f6426k;
        if (mVar != null) {
            matrix.set(mVar.d());
        }
        Path path = this.d;
        path.reset();
        if (this.f6422g) {
            return path;
        }
        List<c> list = this.f6423h;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof m) {
                path.addPath(((m) cVar).f(), matrix);
            }
        }
        return path;
    }

    public final void g(e eVar, int i10, ArrayList arrayList, e eVar2) {
        String str = this.f6421f;
        if (eVar.c(str, i10) || "__container".equals(str)) {
            if (!"__container".equals(str)) {
                eVar2.getClass();
                e eVar3 = new e(eVar2);
                eVar3.f7048a.add(str);
                if (eVar.a(str, i10)) {
                    e eVar4 = new e(eVar3);
                    eVar4.f7049b = this;
                    arrayList.add(eVar4);
                }
                eVar2 = eVar3;
            }
            if (eVar.d(str, i10)) {
                int b10 = eVar.b(str, i10) + i10;
                int i11 = 0;
                while (true) {
                    List<c> list = this.f6423h;
                    if (i11 < list.size()) {
                        c cVar = list.get(i11);
                        if (cVar instanceof f) {
                            ((f) cVar).g(eVar, b10, arrayList, eVar2);
                        }
                        i11++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final String getName() {
        return this.f6421f;
    }

    public final void h(c cVar, Object obj) {
        m mVar = this.f6426k;
        if (mVar != null) {
            mVar.c(cVar, obj);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(h1.l r8, p1.b r9, o1.n r10) {
        /*
            r7 = this;
            java.lang.String r3 = r10.f7659a
            boolean r4 = r10.f7661c
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.List<o1.b> r10 = r10.f7660b
            int r0 = r10.size()
            r5.<init>(r0)
            r0 = 0
            r1 = r0
        L_0x0011:
            int r2 = r10.size()
            if (r1 >= r2) goto L_0x0029
            java.lang.Object r2 = r10.get(r1)
            o1.b r2 = (o1.b) r2
            j1.c r2 = r2.a(r8, r9)
            if (r2 == 0) goto L_0x0026
            r5.add(r2)
        L_0x0026:
            int r1 = r1 + 1
            goto L_0x0011
        L_0x0029:
            int r1 = r10.size()
            if (r0 >= r1) goto L_0x0040
            java.lang.Object r1 = r10.get(r0)
            o1.b r1 = (o1.b) r1
            boolean r2 = r1 instanceof n1.g
            if (r2 == 0) goto L_0x003d
            n1.g r1 = (n1.g) r1
            r6 = r1
            goto L_0x0042
        L_0x003d:
            int r0 = r0 + 1
            goto L_0x0029
        L_0x0040:
            r10 = 0
            r6 = r10
        L_0x0042:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.d.<init>(h1.l, p1.b, o1.n):void");
    }
}

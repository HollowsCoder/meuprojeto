package j1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import h1.l;
import java.util.ArrayList;
import java.util.List;
import k1.a;
import k1.c;
import k1.e;
import k1.f;
import k1.n;
import n1.d;
import o1.q;
import p1.b;
import t1.g;

public abstract class a implements a.C0091a, k, e {

    /* renamed from: a  reason: collision with root package name */
    public final PathMeasure f6402a = new PathMeasure();

    /* renamed from: b  reason: collision with root package name */
    public final Path f6403b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final Path f6404c = new Path();
    public final RectF d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    public final l f6405e;

    /* renamed from: f  reason: collision with root package name */
    public final b f6406f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f6407g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f6408h;

    /* renamed from: i  reason: collision with root package name */
    public final i1.a f6409i;

    /* renamed from: j  reason: collision with root package name */
    public final c f6410j;

    /* renamed from: k  reason: collision with root package name */
    public final f f6411k;
    public final ArrayList l;

    /* renamed from: m  reason: collision with root package name */
    public final c f6412m;

    /* renamed from: n  reason: collision with root package name */
    public n f6413n;

    /* renamed from: j1.a$a  reason: collision with other inner class name */
    public static final class C0087a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f6414a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final s f6415b;

        public C0087a(s sVar) {
            this.f6415b = sVar;
        }
    }

    public a(l lVar, b bVar, Paint.Cap cap, Paint.Join join, float f10, d dVar, n1.b bVar2, List<n1.b> list, n1.b bVar3) {
        i1.a aVar = new i1.a(1);
        this.f6409i = aVar;
        this.f6405e = lVar;
        this.f6406f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f10);
        this.f6411k = (f) dVar.a();
        this.f6410j = (c) bVar2.a();
        this.f6412m = (c) (bVar3 == null ? null : bVar3.a());
        this.l = new ArrayList(list.size());
        this.f6408h = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.l.add(list.get(i10).a());
        }
        bVar.d(this.f6411k);
        bVar.d(this.f6410j);
        for (int i11 = 0; i11 < this.l.size(); i11++) {
            bVar.d((k1.a) this.l.get(i11));
        }
        c cVar = this.f6412m;
        if (cVar != null) {
            bVar.d(cVar);
        }
        this.f6411k.a(this);
        this.f6410j.a(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((k1.a) this.l.get(i12)).a(this);
        }
        c cVar2 = this.f6412m;
        if (cVar2 != null) {
            cVar2.a(this);
        }
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f6403b;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f6407g;
            if (i10 < arrayList.size()) {
                C0087a aVar = (C0087a) arrayList.get(i10);
                for (int i11 = 0; i11 < aVar.f6414a.size(); i11++) {
                    path.addPath(((m) aVar.f6414a.get(i11)).f(), matrix);
                }
                i10++;
            } else {
                RectF rectF2 = this.d;
                path.computeBounds(rectF2, false);
                float l8 = this.f6410j.l() / 2.0f;
                rectF2.set(rectF2.left - l8, rectF2.top - l8, rectF2.right + l8, rectF2.bottom + l8);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                androidx.databinding.a.n();
                return;
            }
        }
    }

    public final void b() {
        this.f6405e.invalidateSelf();
    }

    public final void c(List<c> list, List<c> list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        C0087a aVar = null;
        s sVar = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList2.get(size);
            if (cVar instanceof s) {
                s sVar2 = (s) cVar;
                if (sVar2.f6516c == q.a.INDIVIDUALLY) {
                    sVar = sVar2;
                }
            }
        }
        if (sVar != null) {
            sVar.d(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.f6407g;
            if (size2 < 0) {
                break;
            }
            c cVar2 = list2.get(size2);
            if (cVar2 instanceof s) {
                s sVar3 = (s) cVar2;
                if (sVar3.f6516c == q.a.INDIVIDUALLY) {
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                    C0087a aVar2 = new C0087a(sVar3);
                    sVar3.d(this);
                    aVar = aVar2;
                }
            }
            if (cVar2 instanceof m) {
                if (aVar == null) {
                    aVar = new C0087a(sVar);
                }
                aVar.f6414a.add((m) cVar2);
            }
        }
        if (aVar != null) {
            arrayList.add(aVar);
        }
    }

    public void e(Canvas canvas, Matrix matrix, int i10) {
        boolean z;
        boolean z10;
        float f10;
        float f11;
        float f12;
        float[] fArr;
        float f13;
        a aVar = this;
        Canvas canvas2 = canvas;
        Matrix matrix2 = matrix;
        float[] fArr2 = (float[]) g.d.get();
        boolean z11 = false;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix2.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            androidx.databinding.a.n();
            return;
        }
        e eVar = (e) aVar.f6411k;
        float l8 = (((float) i10) / 255.0f) * ((float) eVar.l(eVar.b(), eVar.d()));
        float f14 = 100.0f;
        PointF pointF = t1.f.f8885a;
        int max = Math.max(0, Math.min(255, (int) ((l8 / 100.0f) * 255.0f)));
        i1.a aVar2 = aVar.f6409i;
        aVar2.setAlpha(max);
        aVar2.setStrokeWidth(g.d(matrix) * aVar.f6410j.l());
        if (aVar2.getStrokeWidth() <= 0.0f) {
            androidx.databinding.a.n();
            return;
        }
        ArrayList arrayList = aVar.l;
        if (!arrayList.isEmpty()) {
            float d10 = g.d(matrix);
            int i11 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = aVar.f6408h;
                if (i11 >= size) {
                    break;
                }
                float floatValue = ((Float) ((k1.a) arrayList.get(i11)).f()).floatValue();
                fArr[i11] = floatValue;
                if (i11 % 2 == 0) {
                    if (floatValue < 1.0f) {
                        fArr[i11] = 1.0f;
                    }
                } else if (floatValue < 0.1f) {
                    fArr[i11] = 0.1f;
                }
                fArr[i11] = fArr[i11] * d10;
                i11++;
            }
            c cVar = aVar.f6412m;
            if (cVar == null) {
                f13 = 0.0f;
            } else {
                f13 = ((Float) cVar.f()).floatValue() * d10;
            }
            aVar2.setPathEffect(new DashPathEffect(fArr, f13));
        }
        androidx.databinding.a.n();
        n nVar = aVar.f6413n;
        if (nVar != null) {
            aVar2.setColorFilter((ColorFilter) nVar.f());
        }
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = aVar.f6407g;
            if (i12 < arrayList2.size()) {
                C0087a aVar3 = (C0087a) arrayList2.get(i12);
                s sVar = aVar3.f6415b;
                Path path = aVar.f6403b;
                ArrayList arrayList3 = aVar3.f6414a;
                if (sVar != null) {
                    path.reset();
                    int size2 = arrayList3.size();
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        path.addPath(((m) arrayList3.get(size2)).f(), matrix2);
                    }
                    PathMeasure pathMeasure = aVar.f6402a;
                    pathMeasure.setPath(path, z11);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length += pathMeasure.getLength();
                    }
                    s sVar2 = aVar3.f6415b;
                    float floatValue2 = (((Float) sVar2.f6518f.f()).floatValue() * length) / 360.0f;
                    float floatValue3 = ((((Float) sVar2.d.f()).floatValue() * length) / f14) + floatValue2;
                    float floatValue4 = ((((Float) sVar2.f6517e.f()).floatValue() * length) / f14) + floatValue2;
                    int size3 = arrayList3.size() - 1;
                    float f15 = 0.0f;
                    while (size3 >= 0) {
                        Path path2 = aVar.f6404c;
                        path2.set(((m) arrayList3.get(size3)).f());
                        path2.transform(matrix2);
                        pathMeasure.setPath(path2, z11);
                        float length2 = pathMeasure.getLength();
                        if (floatValue4 > length) {
                            float f16 = floatValue4 - length;
                            if (f16 < f15 + length2 && f15 < f16) {
                                if (floatValue3 > length) {
                                    f12 = (floatValue3 - length) / length2;
                                } else {
                                    f12 = 0.0f;
                                }
                                g.a(path2, f12, Math.min(f16 / length2, 1.0f), 0.0f);
                                canvas2.drawPath(path2, aVar2);
                                f15 += length2;
                                size3--;
                                aVar = this;
                                z11 = false;
                            }
                        }
                        float f17 = f15 + length2;
                        if (f17 >= floatValue3 && f15 <= floatValue4) {
                            if (f17 > floatValue4 || floatValue3 >= f15) {
                                if (floatValue3 < f15) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = (floatValue3 - f15) / length2;
                                }
                                if (floatValue4 > f17) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = (floatValue4 - f15) / length2;
                                }
                                g.a(path2, f10, f11, 0.0f);
                            }
                            canvas2.drawPath(path2, aVar2);
                        }
                        f15 += length2;
                        size3--;
                        aVar = this;
                        z11 = false;
                    }
                    androidx.databinding.a.n();
                    z10 = true;
                } else {
                    path.reset();
                    z10 = true;
                    for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                        path.addPath(((m) arrayList3.get(size4)).f(), matrix2);
                    }
                    androidx.databinding.a.n();
                    canvas2.drawPath(path, aVar2);
                    androidx.databinding.a.n();
                }
                i12++;
                aVar = this;
                boolean z12 = z10;
                z11 = false;
                f14 = 100.0f;
            } else {
                androidx.databinding.a.n();
                return;
            }
        }
    }

    public final void g(m1.e eVar, int i10, ArrayList arrayList, m1.e eVar2) {
        t1.f.d(eVar, i10, arrayList, eVar2, this);
    }

    public void h(u1.c cVar, Object obj) {
        k1.a aVar;
        if (obj == h1.q.d) {
            aVar = this.f6411k;
        } else if (obj == h1.q.f5199q) {
            aVar = this.f6410j;
        } else if (obj == h1.q.E) {
            n nVar = this.f6413n;
            b bVar = this.f6406f;
            if (nVar != null) {
                bVar.n(nVar);
            }
            if (cVar == null) {
                this.f6413n = null;
                return;
            }
            n nVar2 = new n(cVar, null);
            this.f6413n = nVar2;
            nVar2.a(this);
            bVar.d(this.f6413n);
            return;
        } else {
            return;
        }
        aVar.k(cVar);
    }
}

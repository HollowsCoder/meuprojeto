package p1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import h1.f;
import h1.l;
import h1.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k1.n;
import m1.e;
import n1.b;
import p1.b;
import t1.g;

public final class c extends b {
    public final RectF A = new RectF();
    public final RectF B = new RectF();
    public final Paint C = new Paint();

    /* renamed from: y  reason: collision with root package name */
    public k1.a<Float, Float> f7825y;
    public final ArrayList z = new ArrayList();

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7826a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                p1.e$b[] r0 = p1.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7826a = r0
                p1.e$b r1 = p1.e.b.ADD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7826a     // Catch:{ NoSuchFieldError -> 0x001d }
                p1.e$b r1 = p1.e.b.INVERT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p1.c.a.<clinit>():void");
        }
    }

    public c(l lVar, e eVar, List<e> list, f fVar) {
        super(lVar, eVar);
        b bVar;
        b bVar2;
        b bVar3 = eVar.f7844s;
        if (bVar3 != null) {
            k1.a<Float, Float> a10 = bVar3.a();
            this.f7825y = a10;
            d(a10);
            this.f7825y.a(this);
        } else {
            this.f7825y = null;
        }
        n.f fVar2 = new n.f(fVar.f5124i.size());
        int size = list.size() - 1;
        b bVar4 = null;
        while (true) {
            if (size >= 0) {
                e eVar2 = list.get(size);
                switch (b.a.f7823a[eVar2.f7831e.ordinal()]) {
                    case 1:
                        bVar2 = new g(lVar, eVar2);
                        break;
                    case 2:
                        bVar2 = new c(lVar, eVar2, fVar.f5119c.get(eVar2.f7833g), fVar);
                        break;
                    case 3:
                        bVar2 = new h(lVar, eVar2);
                        break;
                    case 4:
                        bVar2 = new d(lVar, eVar2);
                        break;
                    case 5:
                        bVar2 = new f(lVar, eVar2);
                        break;
                    case 6:
                        bVar2 = new i(lVar, eVar2);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("Unknown layer type ");
                        sb.append(eVar2.f7831e);
                        t1.c.b(sb.toString());
                        bVar2 = null;
                        break;
                }
                if (bVar2 != null) {
                    fVar2.i(bVar2.f7814n.d, bVar2);
                    if (bVar4 != null) {
                        bVar4.f7817q = bVar2;
                        bVar4 = null;
                    } else {
                        this.z.add(0, bVar2);
                        int i10 = a.f7826a[eVar2.u.ordinal()];
                        if (i10 == 1 || i10 == 2) {
                            bVar4 = bVar2;
                        }
                    }
                }
                size--;
            } else {
                for (int i11 = 0; i11 < fVar2.j(); i11++) {
                    if (fVar2.f7305o) {
                        fVar2.e();
                    }
                    b bVar5 = (b) fVar2.h(fVar2.f7306p[i11], (Long) null);
                    if (!(bVar5 == null || (bVar = (b) fVar2.h(bVar5.f7814n.f7832f, (Long) null)) == null)) {
                        bVar5.f7818r = bVar;
                    }
                }
                return;
            }
        }
    }

    public final void a(RectF rectF, Matrix matrix, boolean z10) {
        super.a(rectF, matrix, z10);
        ArrayList arrayList = this.z;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.A;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((b) arrayList.get(size)).a(rectF2, this.l, true);
            rectF.union(rectF2);
        }
    }

    public final void h(u1.c cVar, Object obj) {
        super.h(cVar, obj);
        if (obj != q.C) {
            return;
        }
        if (cVar == null) {
            k1.a<Float, Float> aVar = this.f7825y;
            if (aVar != null) {
                aVar.k((u1.c<Float>) null);
                return;
            }
            return;
        }
        n nVar = new n(cVar, null);
        this.f7825y = nVar;
        nVar.a(this);
        d(this.f7825y);
    }

    public final void k(Canvas canvas, Matrix matrix, int i10) {
        boolean z10;
        boolean z11;
        RectF rectF = this.B;
        e eVar = this.f7814n;
        rectF.set(0.0f, 0.0f, (float) eVar.f7840o, (float) eVar.f7841p);
        matrix.mapRect(rectF);
        boolean z12 = this.f7813m.E;
        ArrayList arrayList = this.z;
        if (!z12 || arrayList.size() <= 1 || i10 == 255) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            Paint paint = this.C;
            paint.setAlpha(i10);
            g.a aVar = g.f8886a;
            canvas.saveLayer(rectF, paint);
            androidx.databinding.a.n();
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!rectF.isEmpty()) {
                z11 = canvas.clipRect(rectF);
            } else {
                z11 = true;
            }
            if (z11) {
                ((b) arrayList.get(size)).e(canvas, matrix, i10);
            }
        }
        canvas.restore();
        androidx.databinding.a.n();
    }

    public final void o(e eVar, int i10, ArrayList arrayList, e eVar2) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.z;
            if (i11 < arrayList2.size()) {
                ((b) arrayList2.get(i11)).g(eVar, i10, arrayList, eVar2);
                i11++;
            } else {
                return;
            }
        }
    }

    public final void p(boolean z10) {
        super.p(z10);
        Iterator it = this.z.iterator();
        while (it.hasNext()) {
            ((b) it.next()).p(z10);
        }
    }

    public final void q(float f10) {
        super.q(f10);
        k1.a<Float, Float> aVar = this.f7825y;
        e eVar = this.f7814n;
        if (aVar != null) {
            f fVar = this.f7813m.f5147p;
            f10 = ((aVar.f().floatValue() * eVar.f7829b.f5127m) - eVar.f7829b.f5126k) / ((fVar.l - fVar.f5126k) + 0.01f);
        }
        if (this.f7825y == null) {
            f fVar2 = eVar.f7829b;
            f10 -= eVar.f7839n / (fVar2.l - fVar2.f5126k);
        }
        float f11 = eVar.f7838m;
        if (f11 != 0.0f) {
            f10 /= f11;
        }
        ArrayList arrayList = this.z;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((b) arrayList.get(size)).q(f10);
            } else {
                return;
            }
        }
    }
}

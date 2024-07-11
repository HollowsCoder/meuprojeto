package j1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import h1.l;
import h1.q;
import java.util.ArrayList;
import java.util.List;
import k1.a;
import k1.c;
import k1.m;
import m1.e;
import n1.g;
import o1.k;
import p1.b;
import t1.f;

public final class p implements e, m, j, a.C0091a, k {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f6495a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final Path f6496b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final l f6497c;
    public final b d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6498e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6499f;

    /* renamed from: g  reason: collision with root package name */
    public final c f6500g;

    /* renamed from: h  reason: collision with root package name */
    public final c f6501h;

    /* renamed from: i  reason: collision with root package name */
    public final m f6502i;

    /* renamed from: j  reason: collision with root package name */
    public d f6503j;

    public p(l lVar, b bVar, k kVar) {
        this.f6497c = lVar;
        this.d = bVar;
        this.f6498e = kVar.f7647a;
        this.f6499f = kVar.f7650e;
        a<Float, Float> a10 = kVar.f7648b.a();
        this.f6500g = (c) a10;
        bVar.d(a10);
        a10.a(this);
        a<Float, Float> a11 = kVar.f7649c.a();
        this.f6501h = (c) a11;
        bVar.d(a11);
        a11.a(this);
        g gVar = kVar.d;
        gVar.getClass();
        m mVar = new m(gVar);
        this.f6502i = mVar;
        mVar.a(bVar);
        mVar.b(this);
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        this.f6503j.a(rectF, matrix, z);
    }

    public final void b() {
        this.f6497c.invalidateSelf();
    }

    public final void c(List<c> list, List<c> list2) {
        this.f6503j.c(list, list2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(java.util.ListIterator<j1.c> r9) {
        /*
            r8 = this;
            j1.d r0 = r8.f6503j
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r9.previous()
            if (r0 == r8) goto L_0x0012
            goto L_0x0005
        L_0x0012:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0017:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r9.previous()
            r6.add(r0)
            r9.remove()
            goto L_0x0017
        L_0x0028:
            java.util.Collections.reverse(r6)
            j1.d r9 = new j1.d
            h1.l r2 = r8.f6497c
            p1.b r3 = r8.d
            java.lang.String r4 = "Repeater"
            boolean r5 = r8.f6499f
            r7 = 0
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.f6503j = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.p.d(java.util.ListIterator):void");
    }

    public final void e(Canvas canvas, Matrix matrix, int i10) {
        float floatValue = ((Float) this.f6500g.f()).floatValue();
        float floatValue2 = ((Float) this.f6501h.f()).floatValue();
        m mVar = this.f6502i;
        float floatValue3 = mVar.f6668m.f().floatValue() / 100.0f;
        float floatValue4 = mVar.f6669n.f().floatValue() / 100.0f;
        int i11 = (int) floatValue;
        while (true) {
            i11--;
            if (i11 >= 0) {
                Matrix matrix2 = this.f6495a;
                matrix2.set(matrix);
                float f10 = (float) i11;
                matrix2.preConcat(mVar.e(f10 + floatValue2));
                PointF pointF = f.f8885a;
                this.f6503j.e(canvas, matrix2, (int) ((((floatValue4 - floatValue3) * (f10 / floatValue)) + floatValue3) * ((float) i10)));
            } else {
                return;
            }
        }
    }

    public final Path f() {
        Path f10 = this.f6503j.f();
        Path path = this.f6496b;
        path.reset();
        float floatValue = ((Float) this.f6500g.f()).floatValue();
        float floatValue2 = ((Float) this.f6501h.f()).floatValue();
        int i10 = (int) floatValue;
        while (true) {
            i10--;
            if (i10 < 0) {
                return path;
            }
            Matrix matrix = this.f6495a;
            matrix.set(this.f6502i.e(((float) i10) + floatValue2));
            path.addPath(f10, matrix);
        }
    }

    public final void g(e eVar, int i10, ArrayList arrayList, e eVar2) {
        f.d(eVar, i10, arrayList, eVar2, this);
    }

    public final String getName() {
        return this.f6498e;
    }

    public final void h(u1.c cVar, Object obj) {
        c cVar2;
        if (!this.f6502i.c(cVar, obj)) {
            if (obj == q.f5201s) {
                cVar2 = this.f6500g;
            } else if (obj == q.f5202t) {
                cVar2 = this.f6501h;
            } else {
                return;
            }
            cVar2.k(cVar);
        }
    }
}

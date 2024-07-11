package p1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import h1.l;
import h1.q;
import i1.a;
import k1.n;
import u1.c;

public final class h extends b {
    public final float[] A;
    public final Path B;
    public final e C;
    public n D;

    /* renamed from: y  reason: collision with root package name */
    public final RectF f7848y = new RectF();
    public final a z;

    public h(l lVar, e eVar) {
        super(lVar, eVar);
        a aVar = new a();
        this.z = aVar;
        this.A = new float[8];
        this.B = new Path();
        this.C = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.l);
    }

    public final void a(RectF rectF, Matrix matrix, boolean z10) {
        super.a(rectF, matrix, z10);
        RectF rectF2 = this.f7848y;
        e eVar = this.C;
        rectF2.set(0.0f, 0.0f, (float) eVar.f7836j, (float) eVar.f7837k);
        this.l.mapRect(rectF2);
        rectF.set(rectF2);
    }

    public final void h(c cVar, Object obj) {
        super.h(cVar, obj);
        if (obj != q.E) {
            return;
        }
        if (cVar == null) {
            this.D = null;
        } else {
            this.D = new n(cVar, null);
        }
    }

    public final void k(Canvas canvas, Matrix matrix, int i10) {
        int i11;
        e eVar = this.C;
        int alpha = Color.alpha(eVar.l);
        if (alpha != 0) {
            k1.a<Integer, Integer> aVar = this.u.f6666j;
            if (aVar == null) {
                i11 = 100;
            } else {
                i11 = aVar.f().intValue();
            }
            int i12 = (int) ((((((float) alpha) / 255.0f) * ((float) i11)) / 100.0f) * (((float) i10) / 255.0f) * 255.0f);
            a aVar2 = this.z;
            aVar2.setAlpha(i12);
            n nVar = this.D;
            if (nVar != null) {
                aVar2.setColorFilter((ColorFilter) nVar.f());
            }
            if (i12 > 0) {
                float[] fArr = this.A;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                float f10 = (float) eVar.f7836j;
                fArr[2] = f10;
                fArr[3] = 0.0f;
                fArr[4] = f10;
                float f11 = (float) eVar.f7837k;
                fArr[5] = f11;
                fArr[6] = 0.0f;
                fArr[7] = f11;
                matrix.mapPoints(fArr);
                Path path = this.B;
                path.reset();
                path.moveTo(fArr[0], fArr[1]);
                path.lineTo(fArr[2], fArr[3]);
                path.lineTo(fArr[4], fArr[5]);
                path.lineTo(fArr[6], fArr[7]);
                path.lineTo(fArr[0], fArr[1]);
                path.close();
                canvas.drawPath(path, aVar2);
            }
        }
    }
}

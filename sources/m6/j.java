package m6;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;
import m6.f;
import n.e;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final l[] f7171a = new l[4];

    /* renamed from: b  reason: collision with root package name */
    public final Matrix[] f7172b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix[] f7173c = new Matrix[4];
    public final PointF d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    public final Path f7174e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final Path f7175f = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final l f7176g = new l();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f7177h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    public final float[] f7178i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    public final Path f7179j = new Path();

    /* renamed from: k  reason: collision with root package name */
    public final Path f7180k = new Path();
    public final boolean l = true;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final j f7181a = new j();
    }

    public j() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f7171a[i10] = new l();
            this.f7172b[i10] = new Matrix();
            this.f7173c[i10] = new Matrix();
        }
    }

    public final void a(i iVar, float f10, RectF rectF, f.a aVar, Path path) {
        int i10;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        l[] lVarArr;
        float f11;
        float f12;
        e eVar;
        Path path2;
        char c10;
        c cVar;
        e eVar2;
        float f13;
        float f14;
        float f15;
        float f16;
        j jVar = this;
        i iVar2 = iVar;
        float f17 = f10;
        RectF rectF2 = rectF;
        f.a aVar2 = aVar;
        Path path3 = path;
        path.rewind();
        Path path4 = jVar.f7174e;
        path4.rewind();
        Path path5 = jVar.f7175f;
        path5.rewind();
        path5.addRect(rectF2, Path.Direction.CW);
        int i11 = 0;
        while (true) {
            i10 = 4;
            matrixArr = jVar.f7173c;
            fArr = jVar.f7177h;
            matrixArr2 = jVar.f7172b;
            lVarArr = jVar.f7171a;
            if (i11 >= 4) {
                break;
            }
            if (i11 == 1) {
                cVar = iVar2.f7156g;
            } else if (i11 == 2) {
                cVar = iVar2.f7157h;
            } else if (i11 != 3) {
                cVar = iVar2.f7155f;
            } else {
                cVar = iVar2.f7154e;
            }
            if (i11 == 1) {
                eVar2 = iVar2.f7153c;
            } else if (i11 == 2) {
                eVar2 = iVar2.d;
            } else if (i11 != 3) {
                eVar2 = iVar2.f7152b;
            } else {
                eVar2 = iVar2.f7151a;
            }
            l lVar = lVarArr[i11];
            eVar2.getClass();
            eVar2.v(f17, cVar.a(rectF2), lVar);
            int i12 = i11 + 1;
            float f18 = (float) (i12 * 90);
            matrixArr2[i11].reset();
            PointF pointF = jVar.d;
            int i13 = i12;
            if (i11 == 1) {
                f15 = rectF2.right;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    f16 = rectF2.right;
                } else {
                    f16 = rectF2.left;
                }
                f13 = f16;
                f14 = rectF2.top;
                pointF.set(f13, f14);
                matrixArr2[i11].setTranslate(pointF.x, pointF.y);
                matrixArr2[i11].preRotate(f18);
                l lVar2 = lVarArr[i11];
                fArr[0] = lVar2.f7186c;
                fArr[1] = lVar2.d;
                matrixArr2[i11].mapPoints(fArr);
                matrixArr[i11].reset();
                matrixArr[i11].setTranslate(fArr[0], fArr[1]);
                matrixArr[i11].preRotate(f18);
                rectF2 = rectF;
                i11 = i13;
            } else {
                f15 = rectF2.left;
            }
            f13 = f15;
            f14 = rectF2.bottom;
            pointF.set(f13, f14);
            matrixArr2[i11].setTranslate(pointF.x, pointF.y);
            matrixArr2[i11].preRotate(f18);
            l lVar22 = lVarArr[i11];
            fArr[0] = lVar22.f7186c;
            fArr[1] = lVar22.d;
            matrixArr2[i11].mapPoints(fArr);
            matrixArr[i11].reset();
            matrixArr[i11].setTranslate(fArr[0], fArr[1]);
            matrixArr[i11].preRotate(f18);
            rectF2 = rectF;
            i11 = i13;
        }
        char c11 = 1;
        char c12 = 0;
        int i14 = 0;
        while (i14 < i10) {
            l lVar3 = lVarArr[i14];
            fArr[c12] = lVar3.f7184a;
            fArr[c11] = lVar3.f7185b;
            matrixArr2[i14].mapPoints(fArr);
            if (i14 == 0) {
                path3.moveTo(fArr[c12], fArr[c11]);
            } else {
                path3.lineTo(fArr[c12], fArr[c11]);
            }
            lVarArr[i14].c(matrixArr2[i14], path3);
            if (aVar2 != null) {
                l lVar4 = lVarArr[i14];
                Matrix matrix = matrixArr2[i14];
                f fVar = f.this;
                BitSet bitSet = fVar.f7124r;
                lVar4.getClass();
                bitSet.set(i14, false);
                lVar4.b(lVar4.f7188f);
                fVar.f7122p[i14] = new k(new ArrayList(lVar4.f7190h), new Matrix(matrix));
            }
            int i15 = i14 + 1;
            int i16 = i15 % 4;
            l lVar5 = lVarArr[i14];
            fArr[0] = lVar5.f7186c;
            fArr[1] = lVar5.d;
            matrixArr2[i14].mapPoints(fArr);
            l lVar6 = lVarArr[i16];
            float f19 = lVar6.f7184a;
            int i17 = i15;
            float[] fArr2 = jVar.f7178i;
            fArr2[0] = f19;
            fArr2[1] = lVar6.f7185b;
            matrixArr2[i16].mapPoints(fArr2);
            Path path6 = path4;
            float max = Math.max(((float) Math.hypot((double) (fArr[0] - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
            l lVar7 = lVarArr[i14];
            fArr[0] = lVar7.f7186c;
            fArr[1] = lVar7.d;
            matrixArr2[i14].mapPoints(fArr);
            if (i14 == 1 || i14 == 3) {
                f12 = rectF.centerX();
                f11 = fArr[0];
            } else {
                f12 = rectF.centerY();
                f11 = fArr[1];
            }
            float abs = Math.abs(f12 - f11);
            l lVar8 = jVar.f7176g;
            lVar8.e(0.0f, 270.0f, 0.0f);
            if (i14 == 1) {
                eVar = iVar2.f7160k;
            } else if (i14 == 2) {
                eVar = iVar2.l;
            } else if (i14 != 3) {
                eVar = iVar2.f7159j;
            } else {
                eVar = iVar2.f7158i;
            }
            eVar.c(max, abs, f17, lVar8);
            Path path7 = jVar.f7179j;
            path7.reset();
            lVar8.c(matrixArr[i14], path7);
            if (!jVar.l || (!jVar.b(path7, i14) && !jVar.b(path7, i16))) {
                path2 = path6;
                path3 = path;
                lVar8.c(matrixArr[i14], path3);
                aVar2 = aVar;
            } else {
                path7.op(path7, path5, Path.Op.DIFFERENCE);
                fArr[0] = lVar8.f7184a;
                fArr[1] = lVar8.f7185b;
                matrixArr[i14].mapPoints(fArr);
                path2 = path6;
                path2.moveTo(fArr[0], fArr[1]);
                lVar8.c(matrixArr[i14], path2);
                aVar2 = aVar;
                path3 = path;
            }
            if (aVar2 != null) {
                Matrix matrix2 = matrixArr[i14];
                f fVar2 = f.this;
                c10 = 0;
                fVar2.f7124r.set(i14 + 4, false);
                lVar8.b(lVar8.f7188f);
                fVar2.f7123q[i14] = new k(new ArrayList(lVar8.f7190h), new Matrix(matrix2));
            } else {
                c10 = 0;
            }
            jVar = this;
            c12 = c10;
            path4 = path2;
            i14 = i17;
            c11 = 1;
            i10 = 4;
            iVar2 = iVar;
        }
        Path path8 = path4;
        path.close();
        path8.close();
        if (!path8.isEmpty()) {
            path3.op(path8, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i10) {
        Path path2 = this.f7180k;
        path2.reset();
        this.f7171a[i10].c(this.f7172b[i10], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}

package m6;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;

public final class l {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public float f7184a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public float f7185b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public float f7186c;
    @Deprecated
    public float d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public float f7187e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public float f7188f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f7189g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f7190h = new ArrayList();

    public static class a extends f {

        /* renamed from: b  reason: collision with root package name */
        public final c f7191b;

        public a(c cVar) {
            this.f7191b = cVar;
        }

        public final void a(Matrix matrix, l6.a aVar, int i10, Canvas canvas) {
            boolean z;
            l6.a aVar2 = aVar;
            int i11 = i10;
            Canvas canvas2 = canvas;
            c cVar = this.f7191b;
            float f10 = cVar.f7198f;
            float f11 = cVar.f7199g;
            RectF rectF = new RectF(cVar.f7195b, cVar.f7196c, cVar.d, cVar.f7197e);
            aVar.getClass();
            if (f11 < 0.0f) {
                z = true;
            } else {
                z = false;
            }
            Path path = aVar2.f6970g;
            int[] iArr = l6.a.f6964k;
            if (z) {
                iArr[0] = 0;
                iArr[1] = aVar2.f6969f;
                iArr[2] = aVar2.f6968e;
                iArr[3] = aVar2.d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f10, f11);
                path.close();
                float f12 = (float) (-i11);
                rectF.inset(f12, f12);
                iArr[0] = 0;
                iArr[1] = aVar2.d;
                iArr[2] = aVar2.f6968e;
                iArr[3] = aVar2.f6969f;
            }
            float width = rectF.width() / 2.0f;
            if (width > 0.0f) {
                float f13 = 1.0f - (((float) i11) / width);
                float[] fArr = l6.a.l;
                fArr[1] = f13;
                fArr[2] = ((1.0f - f13) / 2.0f) + f13;
                RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
                Paint paint = aVar2.f6966b;
                paint.setShader(radialGradient);
                canvas.save();
                canvas2.concat(matrix);
                canvas2.scale(1.0f, rectF.height() / rectF.width());
                if (!z) {
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                    canvas2.drawPath(path, aVar2.f6971h);
                }
                canvas.drawArc(rectF, f10, f11, true, paint);
                canvas.restore();
            }
        }
    }

    public static class b extends f {

        /* renamed from: b  reason: collision with root package name */
        public final d f7192b;

        /* renamed from: c  reason: collision with root package name */
        public final float f7193c;
        public final float d;

        public b(d dVar, float f10, float f11) {
            this.f7192b = dVar;
            this.f7193c = f10;
            this.d = f11;
        }

        public final void a(Matrix matrix, l6.a aVar, int i10, Canvas canvas) {
            l6.a aVar2 = aVar;
            int i11 = i10;
            Canvas canvas2 = canvas;
            d dVar = this.f7192b;
            float f10 = dVar.f7201c;
            float f11 = this.d;
            float f12 = dVar.f7200b;
            float f13 = this.f7193c;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (f10 - f11), (double) (f12 - f13)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(f13, f11);
            matrix2.preRotate(b());
            aVar.getClass();
            rectF.bottom += (float) i11;
            rectF.offset(0.0f, (float) (-i11));
            int[] iArr = l6.a.f6962i;
            iArr[0] = aVar2.f6969f;
            iArr[1] = aVar2.f6968e;
            iArr[2] = aVar2.d;
            Paint paint = aVar2.f6967c;
            float f14 = rectF.left;
            paint.setShader(new LinearGradient(f14, rectF.top, f14, rectF.bottom, iArr, l6.a.f6963j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas2.concat(matrix2);
            canvas2.drawRect(rectF, paint);
            canvas.restore();
        }

        public final float b() {
            d dVar = this.f7192b;
            return (float) Math.toDegrees(Math.atan((double) ((dVar.f7201c - this.d) / (dVar.f7200b - this.f7193c))));
        }
    }

    public static class c extends e {

        /* renamed from: h  reason: collision with root package name */
        public static final RectF f7194h = new RectF();
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public float f7195b;
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public float f7196c;
        @Deprecated
        public float d;
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        public float f7197e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public float f7198f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public float f7199g;

        public c(float f10, float f11, float f12, float f13) {
            this.f7195b = f10;
            this.f7196c = f11;
            this.d = f12;
            this.f7197e = f13;
        }

        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f7202a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f7194h;
            rectF.set(this.f7195b, this.f7196c, this.d, this.f7197e);
            path.arcTo(rectF, this.f7198f, this.f7199g, false);
            path.transform(matrix);
        }
    }

    public static class d extends e {

        /* renamed from: b  reason: collision with root package name */
        public float f7200b;

        /* renamed from: c  reason: collision with root package name */
        public float f7201c;

        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f7202a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f7200b, this.f7201c);
            path.transform(matrix);
        }
    }

    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f7202a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        public static final Matrix f7203a = new Matrix();

        public abstract void a(Matrix matrix, l6.a aVar, int i10, Canvas canvas);
    }

    public l() {
        e(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        boolean z;
        float f16;
        c cVar = new c(f10, f11, f12, f13);
        cVar.f7198f = f14;
        cVar.f7199g = f15;
        this.f7189g.add(cVar);
        a aVar = new a(cVar);
        float f17 = f14 + f15;
        if (f15 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        if (z) {
            f16 = (180.0f + f17) % 360.0f;
        } else {
            f16 = f17;
        }
        b(f14);
        this.f7190h.add(aVar);
        this.f7187e = f16;
        double d10 = (double) f17;
        this.f7186c = (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))) + ((f10 + f12) * 0.5f);
        this.d = (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))) + ((f11 + f13) * 0.5f);
    }

    public final void b(float f10) {
        float f11 = this.f7187e;
        if (f11 != f10) {
            float f12 = ((f10 - f11) + 360.0f) % 360.0f;
            if (f12 <= 180.0f) {
                float f13 = this.f7186c;
                float f14 = this.d;
                c cVar = new c(f13, f14, f13, f14);
                cVar.f7198f = this.f7187e;
                cVar.f7199g = f12;
                this.f7190h.add(new a(cVar));
                this.f7187e = f10;
            }
        }
    }

    public final void c(Matrix matrix, Path path) {
        ArrayList arrayList = this.f7189g;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) arrayList.get(i10)).a(matrix, path);
        }
    }

    public final void d(float f10, float f11) {
        d dVar = new d();
        dVar.f7200b = f10;
        dVar.f7201c = f11;
        this.f7189g.add(dVar);
        b bVar = new b(dVar, this.f7186c, this.d);
        b(bVar.b() + 270.0f);
        this.f7190h.add(bVar);
        this.f7187e = bVar.b() + 270.0f;
        this.f7186c = f10;
        this.d = f11;
    }

    public final void e(float f10, float f11, float f12) {
        this.f7184a = 0.0f;
        this.f7185b = f10;
        this.f7186c = 0.0f;
        this.d = f10;
        this.f7187e = f11;
        this.f7188f = (f11 + f12) % 360.0f;
        this.f7189g.clear();
        this.f7190h.clear();
    }
}

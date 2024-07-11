package k1;

import android.graphics.Matrix;
import android.graphics.PointF;
import h1.q;
import j1.b;
import java.util.Collections;
import k1.a;
import n1.g;
import n1.h;
import u1.c;
import u1.d;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f6658a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f6659b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f6660c;
    public final Matrix d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f6661e;

    /* renamed from: f  reason: collision with root package name */
    public a<PointF, PointF> f6662f;

    /* renamed from: g  reason: collision with root package name */
    public a<?, PointF> f6663g;

    /* renamed from: h  reason: collision with root package name */
    public a<d, d> f6664h;

    /* renamed from: i  reason: collision with root package name */
    public a<Float, Float> f6665i;

    /* renamed from: j  reason: collision with root package name */
    public a<Integer, Integer> f6666j;

    /* renamed from: k  reason: collision with root package name */
    public c f6667k;
    public c l;

    /* renamed from: m  reason: collision with root package name */
    public a<?, Float> f6668m;

    /* renamed from: n  reason: collision with root package name */
    public a<?, Float> f6669n;

    public m(g gVar) {
        a<PointF, PointF> aVar;
        a<PointF, PointF> aVar2;
        a<d, d> aVar3;
        a<Float, Float> aVar4;
        c cVar;
        c cVar2;
        b bVar = gVar.f7349a;
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = bVar.a();
        }
        this.f6662f = aVar;
        h<PointF, PointF> hVar = gVar.f7350b;
        if (hVar == null) {
            aVar2 = null;
        } else {
            aVar2 = hVar.a();
        }
        this.f6663g = aVar2;
        n1.d dVar = gVar.f7351c;
        if (dVar == null) {
            aVar3 = null;
        } else {
            aVar3 = dVar.a();
        }
        this.f6664h = aVar3;
        n1.b bVar2 = gVar.d;
        if (bVar2 == null) {
            aVar4 = null;
        } else {
            aVar4 = bVar2.a();
        }
        this.f6665i = aVar4;
        n1.b bVar3 = gVar.f7353f;
        if (bVar3 == null) {
            cVar = null;
        } else {
            cVar = (c) bVar3.a();
        }
        this.f6667k = cVar;
        if (cVar != null) {
            this.f6659b = new Matrix();
            this.f6660c = new Matrix();
            this.d = new Matrix();
            this.f6661e = new float[9];
        } else {
            this.f6659b = null;
            this.f6660c = null;
            this.d = null;
            this.f6661e = null;
        }
        n1.b bVar4 = gVar.f7354g;
        if (bVar4 == null) {
            cVar2 = null;
        } else {
            cVar2 = (c) bVar4.a();
        }
        this.l = cVar2;
        n1.d dVar2 = gVar.f7352e;
        if (dVar2 != null) {
            this.f6666j = dVar2.a();
        }
        n1.b bVar5 = gVar.f7355h;
        if (bVar5 != null) {
            this.f6668m = bVar5.a();
        } else {
            this.f6668m = null;
        }
        n1.b bVar6 = gVar.f7356i;
        if (bVar6 != null) {
            this.f6669n = bVar6.a();
        } else {
            this.f6669n = null;
        }
    }

    public final void a(p1.b bVar) {
        bVar.d(this.f6666j);
        bVar.d(this.f6668m);
        bVar.d(this.f6669n);
        bVar.d(this.f6662f);
        bVar.d(this.f6663g);
        bVar.d(this.f6664h);
        bVar.d(this.f6665i);
        bVar.d(this.f6667k);
        bVar.d(this.l);
    }

    public final void b(a.C0091a aVar) {
        a<Integer, Integer> aVar2 = this.f6666j;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
        a<?, Float> aVar3 = this.f6668m;
        if (aVar3 != null) {
            aVar3.a(aVar);
        }
        a<?, Float> aVar4 = this.f6669n;
        if (aVar4 != null) {
            aVar4.a(aVar);
        }
        a<PointF, PointF> aVar5 = this.f6662f;
        if (aVar5 != null) {
            aVar5.a(aVar);
        }
        a<?, PointF> aVar6 = this.f6663g;
        if (aVar6 != null) {
            aVar6.a(aVar);
        }
        a<d, d> aVar7 = this.f6664h;
        if (aVar7 != null) {
            aVar7.a(aVar);
        }
        a<Float, Float> aVar8 = this.f6665i;
        if (aVar8 != null) {
            aVar8.a(aVar);
        }
        c cVar = this.f6667k;
        if (cVar != null) {
            cVar.a(aVar);
        }
        c cVar2 = this.l;
        if (cVar2 != null) {
            cVar2.a(aVar);
        }
    }

    public final boolean c(c cVar, Object obj) {
        c cVar2;
        a aVar;
        c cVar3;
        a<?, Float> aVar2;
        if (obj == q.f5188e) {
            aVar = this.f6662f;
            if (aVar == null) {
                this.f6662f = new n(cVar, new PointF());
                return true;
            }
        } else if (obj == q.f5189f) {
            aVar = this.f6663g;
            if (aVar == null) {
                this.f6663g = new n(cVar, new PointF());
                return true;
            }
        } else {
            if (obj == q.f5190g) {
                a<?, PointF> aVar3 = this.f6663g;
                if (aVar3 instanceof k) {
                    k kVar = (k) aVar3;
                    c<Float> cVar4 = kVar.f6656m;
                    kVar.f6656m = cVar;
                    return true;
                }
            }
            if (obj == q.f5191h) {
                a<?, PointF> aVar4 = this.f6663g;
                if (aVar4 instanceof k) {
                    k kVar2 = (k) aVar4;
                    c<Float> cVar5 = kVar2.f6657n;
                    kVar2.f6657n = cVar;
                    return true;
                }
            }
            if (obj == q.f5195m) {
                aVar = this.f6664h;
                if (aVar == null) {
                    this.f6664h = new n(cVar, new d());
                    return true;
                }
            } else if (obj == q.f5196n) {
                aVar = this.f6665i;
                if (aVar == null) {
                    this.f6665i = new n(cVar, Float.valueOf(0.0f));
                    return true;
                }
            } else if (obj == q.f5187c) {
                aVar = this.f6666j;
                if (aVar == null) {
                    this.f6666j = new n(cVar, 100);
                    return true;
                }
            } else {
                if (obj != q.A || (aVar2 = this.f6668m) == null) {
                    if (obj != q.B || (aVar2 = this.f6669n) == null) {
                        if (obj == q.f5197o && (cVar3 = this.f6667k) != null) {
                            if (cVar3 == null) {
                                this.f6667k = new c(Collections.singletonList(new u1.a(Float.valueOf(0.0f))));
                            }
                            aVar = this.f6667k;
                        } else if (obj != q.f5198p || (cVar2 = this.l) == null) {
                            return false;
                        } else {
                            if (cVar2 == null) {
                                this.l = new c(Collections.singletonList(new u1.a(Float.valueOf(0.0f))));
                            }
                            aVar = this.l;
                        }
                    } else if (aVar2 == null) {
                        this.f6669n = new n(cVar, 100);
                        return true;
                    }
                } else if (aVar2 == null) {
                    this.f6668m = new n(cVar, 100);
                    return true;
                }
                aVar2.k(cVar);
                return true;
            }
        }
        aVar.k(cVar);
        return true;
    }

    public final Matrix d() {
        float f10;
        float f11;
        float[] fArr;
        float f12;
        Matrix matrix = this.f6658a;
        matrix.reset();
        a<?, PointF> aVar = this.f6663g;
        if (aVar != null) {
            PointF f13 = aVar.f();
            float f14 = f13.x;
            if (!(f14 == 0.0f && f13.y == 0.0f)) {
                matrix.preTranslate(f14, f13.y);
            }
        }
        a<Float, Float> aVar2 = this.f6665i;
        if (aVar2 != null) {
            if (aVar2 instanceof n) {
                f12 = aVar2.f().floatValue();
            } else {
                f12 = ((c) aVar2).l();
            }
            if (f12 != 0.0f) {
                matrix.preRotate(f12);
            }
        }
        if (this.f6667k != null) {
            c cVar = this.l;
            if (cVar == null) {
                f10 = 0.0f;
            } else {
                f10 = (float) Math.cos(Math.toRadians((double) ((-cVar.l()) + 90.0f)));
            }
            c cVar2 = this.l;
            if (cVar2 == null) {
                f11 = 1.0f;
            } else {
                f11 = (float) Math.sin(Math.toRadians((double) ((-cVar2.l()) + 90.0f)));
            }
            float tan = (float) Math.tan(Math.toRadians((double) this.f6667k.l()));
            int i10 = 0;
            while (true) {
                fArr = this.f6661e;
                if (i10 >= 9) {
                    break;
                }
                fArr[i10] = 0.0f;
                i10++;
            }
            fArr[0] = f10;
            fArr[1] = f11;
            float f15 = -f11;
            fArr[3] = f15;
            fArr[4] = f10;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f6659b;
            matrix2.setValues(fArr);
            for (int i11 = 0; i11 < 9; i11++) {
                fArr[i11] = 0.0f;
            }
            fArr[0] = 1.0f;
            fArr[3] = tan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f6660c;
            matrix3.setValues(fArr);
            for (int i12 = 0; i12 < 9; i12++) {
                fArr[i12] = 0.0f;
            }
            fArr[0] = f10;
            fArr[1] = f15;
            fArr[3] = f11;
            fArr[4] = f10;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        a<d, d> aVar3 = this.f6664h;
        if (aVar3 != null) {
            d f16 = aVar3.f();
            float f17 = f16.f9058a;
            if (!(f17 == 1.0f && f16.f9059b == 1.0f)) {
                matrix.preScale(f17, f16.f9059b);
            }
        }
        a<PointF, PointF> aVar4 = this.f6662f;
        if (aVar4 != null) {
            PointF f18 = aVar4.f();
            float f19 = f18.x;
            if (!(f19 == 0.0f && f18.y == 0.0f)) {
                matrix.preTranslate(-f19, -f18.y);
            }
        }
        return matrix;
    }

    public final Matrix e(float f10) {
        PointF pointF;
        d dVar;
        float f11;
        a<?, PointF> aVar = this.f6663g;
        PointF pointF2 = null;
        if (aVar == null) {
            pointF = null;
        } else {
            pointF = aVar.f();
        }
        a<d, d> aVar2 = this.f6664h;
        if (aVar2 == null) {
            dVar = null;
        } else {
            dVar = aVar2.f();
        }
        Matrix matrix = this.f6658a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f10, pointF.y * f10);
        }
        if (dVar != null) {
            double d10 = (double) f10;
            matrix.preScale((float) Math.pow((double) dVar.f9058a, d10), (float) Math.pow((double) dVar.f9059b, d10));
        }
        a<Float, Float> aVar3 = this.f6665i;
        if (aVar3 != null) {
            float floatValue = aVar3.f().floatValue();
            a<PointF, PointF> aVar4 = this.f6662f;
            if (aVar4 != null) {
                pointF2 = aVar4.f();
            }
            float f12 = floatValue * f10;
            float f13 = 0.0f;
            if (pointF2 == null) {
                f11 = 0.0f;
            } else {
                f11 = pointF2.x;
            }
            if (pointF2 != null) {
                f13 = pointF2.y;
            }
            matrix.preRotate(f12, f11, f13);
        }
        return matrix;
    }
}

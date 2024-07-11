package u1;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import h1.f;

public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final f f9040a;

    /* renamed from: b  reason: collision with root package name */
    public final T f9041b;

    /* renamed from: c  reason: collision with root package name */
    public T f9042c;
    public final Interpolator d;

    /* renamed from: e  reason: collision with root package name */
    public final Interpolator f9043e;

    /* renamed from: f  reason: collision with root package name */
    public final Interpolator f9044f;

    /* renamed from: g  reason: collision with root package name */
    public final float f9045g;

    /* renamed from: h  reason: collision with root package name */
    public Float f9046h;

    /* renamed from: i  reason: collision with root package name */
    public float f9047i;

    /* renamed from: j  reason: collision with root package name */
    public float f9048j;

    /* renamed from: k  reason: collision with root package name */
    public int f9049k;
    public int l;

    /* renamed from: m  reason: collision with root package name */
    public float f9050m;

    /* renamed from: n  reason: collision with root package name */
    public float f9051n;

    /* renamed from: o  reason: collision with root package name */
    public PointF f9052o;

    /* renamed from: p  reason: collision with root package name */
    public PointF f9053p;

    public a(f fVar, T t10, T t11, Interpolator interpolator, float f10, Float f11) {
        this.f9047i = -3987645.8f;
        this.f9048j = -3987645.8f;
        this.f9049k = 784923401;
        this.l = 784923401;
        this.f9050m = Float.MIN_VALUE;
        this.f9051n = Float.MIN_VALUE;
        this.f9052o = null;
        this.f9053p = null;
        this.f9040a = fVar;
        this.f9041b = t10;
        this.f9042c = t11;
        this.d = interpolator;
        this.f9043e = null;
        this.f9044f = null;
        this.f9045g = f10;
        this.f9046h = f11;
    }

    public a(f fVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f10) {
        this.f9047i = -3987645.8f;
        this.f9048j = -3987645.8f;
        this.f9049k = 784923401;
        this.l = 784923401;
        this.f9050m = Float.MIN_VALUE;
        this.f9051n = Float.MIN_VALUE;
        this.f9052o = null;
        this.f9053p = null;
        this.f9040a = fVar;
        this.f9041b = obj;
        this.f9042c = obj2;
        this.d = null;
        this.f9043e = interpolator;
        this.f9044f = interpolator2;
        this.f9045g = f10;
        this.f9046h = null;
    }

    public a(f fVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f9047i = -3987645.8f;
        this.f9048j = -3987645.8f;
        this.f9049k = 784923401;
        this.l = 784923401;
        this.f9050m = Float.MIN_VALUE;
        this.f9051n = Float.MIN_VALUE;
        this.f9052o = null;
        this.f9053p = null;
        this.f9040a = fVar;
        this.f9041b = t10;
        this.f9042c = t11;
        this.d = interpolator;
        this.f9043e = interpolator2;
        this.f9044f = interpolator3;
        this.f9045g = f10;
        this.f9046h = f11;
    }

    public a(T t10) {
        this.f9047i = -3987645.8f;
        this.f9048j = -3987645.8f;
        this.f9049k = 784923401;
        this.l = 784923401;
        this.f9050m = Float.MIN_VALUE;
        this.f9051n = Float.MIN_VALUE;
        this.f9052o = null;
        this.f9053p = null;
        this.f9040a = null;
        this.f9041b = t10;
        this.f9042c = t10;
        this.d = null;
        this.f9043e = null;
        this.f9044f = null;
        this.f9045g = Float.MIN_VALUE;
        this.f9046h = Float.valueOf(Float.MAX_VALUE);
    }

    public final float a() {
        f fVar = this.f9040a;
        if (fVar == null) {
            return 1.0f;
        }
        if (this.f9051n == Float.MIN_VALUE) {
            if (this.f9046h == null) {
                this.f9051n = 1.0f;
            } else {
                this.f9051n = ((this.f9046h.floatValue() - this.f9045g) / (fVar.l - fVar.f5126k)) + b();
            }
        }
        return this.f9051n;
    }

    public final float b() {
        f fVar = this.f9040a;
        if (fVar == null) {
            return 0.0f;
        }
        if (this.f9050m == Float.MIN_VALUE) {
            float f10 = fVar.f5126k;
            this.f9050m = (this.f9045g - f10) / (fVar.l - f10);
        }
        return this.f9050m;
    }

    public final boolean c() {
        return this.d == null && this.f9043e == null && this.f9044f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f9041b + ", endValue=" + this.f9042c + ", startFrame=" + this.f9045g + ", endFrame=" + this.f9046h + ", interpolator=" + this.d + '}';
    }
}

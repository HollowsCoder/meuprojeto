package j1;

import android.graphics.Path;
import android.graphics.PointF;
import b0.d;
import h1.l;
import java.util.ArrayList;
import java.util.List;
import k1.a;
import k1.c;
import m1.e;
import o1.i;
import o1.q;
import p1.b;
import t1.f;

public final class n implements m, a.C0091a, k {

    /* renamed from: a  reason: collision with root package name */
    public final Path f6473a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final String f6474b;

    /* renamed from: c  reason: collision with root package name */
    public final l f6475c;
    public final i.a d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6476e;

    /* renamed from: f  reason: collision with root package name */
    public final c f6477f;

    /* renamed from: g  reason: collision with root package name */
    public final k1.a<?, PointF> f6478g;

    /* renamed from: h  reason: collision with root package name */
    public final c f6479h;

    /* renamed from: i  reason: collision with root package name */
    public final c f6480i;

    /* renamed from: j  reason: collision with root package name */
    public final c f6481j;

    /* renamed from: k  reason: collision with root package name */
    public final c f6482k;
    public final c l;

    /* renamed from: m  reason: collision with root package name */
    public final b f6483m = new b(0);

    /* renamed from: n  reason: collision with root package name */
    public boolean f6484n;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6485a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                o1.i$a[] r0 = o1.i.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6485a = r0
                o1.i$a r1 = o1.i.a.STAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6485a     // Catch:{ NoSuchFieldError -> 0x001d }
                o1.i$a r1 = o1.i.a.POLYGON     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j1.n.a.<clinit>():void");
        }
    }

    public n(l lVar, b bVar, i iVar) {
        k1.a<Float, Float> aVar;
        this.f6475c = lVar;
        this.f6474b = iVar.f7634a;
        i.a aVar2 = iVar.f7635b;
        this.d = aVar2;
        this.f6476e = iVar.f7642j;
        k1.a<Float, Float> a10 = iVar.f7636c.a();
        this.f6477f = (c) a10;
        k1.a<PointF, PointF> a11 = iVar.d.a();
        this.f6478g = a11;
        k1.a<Float, Float> a12 = iVar.f7637e.a();
        this.f6479h = (c) a12;
        k1.a<Float, Float> a13 = iVar.f7639g.a();
        this.f6481j = (c) a13;
        k1.a<Float, Float> a14 = iVar.f7641i.a();
        this.l = (c) a14;
        i.a aVar3 = i.a.STAR;
        if (aVar2 == aVar3) {
            this.f6480i = (c) iVar.f7638f.a();
            aVar = iVar.f7640h.a();
        } else {
            aVar = null;
            this.f6480i = null;
        }
        c cVar = (c) aVar;
        this.f6482k = cVar;
        bVar.d(a10);
        bVar.d(a11);
        bVar.d(a12);
        bVar.d(a13);
        bVar.d(a14);
        if (aVar2 == aVar3) {
            bVar.d(this.f6480i);
            bVar.d(cVar);
        }
        a10.a(this);
        a11.a(this);
        a12.a(this);
        a13.a(this);
        a14.a(this);
        if (aVar2 == aVar3) {
            this.f6480i.a(this);
            cVar.a(this);
        }
    }

    public final void b() {
        this.f6484n = false;
        this.f6475c.invalidateSelf();
    }

    public final void c(List<c> list, List<c> list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i10 < arrayList.size()) {
                c cVar = (c) arrayList.get(i10);
                if (cVar instanceof s) {
                    s sVar = (s) cVar;
                    if (sVar.f6516c == q.a.SIMULTANEOUSLY) {
                        this.f6483m.f6416a.add(sVar);
                        sVar.d(this);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final Path f() {
        n nVar;
        Path path;
        float f10;
        double d10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        Path path2;
        float f18;
        float f19;
        float f20;
        float f21;
        double d11;
        int i10;
        double d12;
        float f22;
        double d13;
        k1.a<?, PointF> aVar;
        boolean z = this.f6484n;
        Path path3 = this.f6473a;
        if (z) {
            return path3;
        }
        path3.reset();
        if (this.f6476e) {
            this.f6484n = true;
            return path3;
        }
        int i11 = a.f6485a[this.d.ordinal()];
        k1.a<?, PointF> aVar2 = this.f6478g;
        c cVar = this.l;
        c cVar2 = this.f6481j;
        c cVar3 = this.f6479h;
        c cVar4 = this.f6477f;
        if (i11 != 1) {
            if (i11 == 2) {
                int floor = (int) Math.floor((double) ((Float) cVar4.f()).floatValue());
                double radians = Math.toRadians((cVar3 == null ? 0.0d : (double) ((Float) cVar3.f()).floatValue()) - 90.0d);
                double d14 = (double) floor;
                float floatValue = ((Float) cVar.f()).floatValue() / 100.0f;
                float floatValue2 = ((Float) cVar2.f()).floatValue();
                double d15 = (double) floatValue2;
                float cos = (float) (Math.cos(radians) * d15);
                float sin = (float) (Math.sin(radians) * d15);
                path3.moveTo(cos, sin);
                double d16 = (double) ((float) (6.283185307179586d / d14));
                double d17 = radians + d16;
                double ceil = Math.ceil(d14);
                int i12 = 0;
                double d18 = d16;
                while (((double) i12) < ceil) {
                    float cos2 = (float) (Math.cos(d17) * d15);
                    float sin2 = (float) (Math.sin(d17) * d15);
                    if (floatValue != 0.0f) {
                        double d19 = d15;
                        i10 = i12;
                        double atan2 = (double) ((float) (Math.atan2((double) sin, (double) cos) - 1.5707963267948966d));
                        float cos3 = (float) Math.cos(atan2);
                        aVar = aVar2;
                        d11 = d17;
                        double atan22 = (double) ((float) (Math.atan2((double) sin2, (double) cos2) - 1.5707963267948966d));
                        float f23 = floatValue2 * floatValue * 0.25f;
                        d13 = d18;
                        f22 = sin2;
                        d12 = d19;
                        path3.cubicTo(cos - (cos3 * f23), sin - (((float) Math.sin(atan2)) * f23), (((float) Math.cos(atan22)) * f23) + cos2, (f23 * ((float) Math.sin(atan22))) + sin2, cos2, f22);
                    } else {
                        i10 = i12;
                        aVar = aVar2;
                        d11 = d17;
                        d13 = d18;
                        f22 = sin2;
                        d12 = d15;
                        path3.lineTo(cos2, f22);
                    }
                    double d20 = d11 + d13;
                    sin = f22;
                    d15 = d12;
                    d18 = d13;
                    aVar2 = aVar;
                    d17 = d20;
                    cos = cos2;
                    i12 = i10 + 1;
                }
                PointF f24 = aVar2.f();
                path3.offset(f24.x, f24.y);
                path3.close();
            }
            nVar = this;
            path = path3;
        } else {
            k1.a<?, PointF> aVar3 = aVar2;
            float floatValue3 = ((Float) cVar4.f()).floatValue();
            double radians2 = Math.toRadians((cVar3 == null ? 0.0d : (double) ((Float) cVar3.f()).floatValue()) - 90.0d);
            double d21 = (double) floatValue3;
            float f25 = (float) (6.283185307179586d / d21);
            float f26 = f25 / 2.0f;
            float f27 = floatValue3 - ((float) ((int) floatValue3));
            int i13 = (f27 > 0.0f ? 1 : (f27 == 0.0f ? 0 : -1));
            if (i13 != 0) {
                radians2 += (double) ((1.0f - f27) * f26);
            }
            float floatValue4 = ((Float) cVar2.f()).floatValue();
            float floatValue5 = ((Float) this.f6480i.f()).floatValue();
            c cVar5 = this.f6482k;
            float floatValue6 = cVar5 != null ? ((Float) cVar5.f()).floatValue() / 100.0f : 0.0f;
            float floatValue7 = cVar != null ? ((Float) cVar.f()).floatValue() / 100.0f : 0.0f;
            if (i13 != 0) {
                float a10 = d.a(floatValue4, floatValue5, f27, floatValue5);
                double d22 = (double) a10;
                f10 = floatValue5;
                f12 = (float) (Math.cos(radians2) * d22);
                float sin3 = (float) (d22 * Math.sin(radians2));
                path3.moveTo(f12, sin3);
                f13 = sin3;
                d10 = radians2 + ((double) ((f25 * f27) / 2.0f));
                f11 = a10;
            } else {
                f10 = floatValue5;
                double d23 = (double) floatValue4;
                f12 = (float) (Math.cos(radians2) * d23);
                float sin4 = (float) (d23 * Math.sin(radians2));
                path3.moveTo(f12, sin4);
                f13 = sin4;
                d10 = radians2 + ((double) f26);
                f11 = 0.0f;
            }
            double ceil2 = Math.ceil(d21) * 2.0d;
            int i14 = 0;
            double d24 = 2.0d;
            double d25 = d10;
            boolean z10 = false;
            while (true) {
                double d26 = (double) i14;
                if (d26 >= ceil2) {
                    break;
                }
                float f28 = z10 ? floatValue4 : f10;
                int i15 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                if (i15 == 0 || d26 != ceil2 - d24) {
                    f14 = f11;
                    f15 = f26;
                } else {
                    f14 = f11;
                    f15 = (f25 * f27) / 2.0f;
                }
                if (i15 == 0 || d26 != ceil2 - 1.0d) {
                    f17 = f25;
                    f16 = f26;
                } else {
                    f17 = f25;
                    f16 = f26;
                    f28 = f14;
                }
                double d27 = (double) f28;
                k1.a<?, PointF> aVar4 = aVar3;
                float cos4 = (float) (Math.cos(d25) * d27);
                float sin5 = (float) (d27 * Math.sin(d25));
                if (floatValue6 == 0.0f && floatValue7 == 0.0f) {
                    path3.lineTo(cos4, sin5);
                    path2 = path3;
                    f19 = f15;
                    f18 = sin5;
                    f21 = f10;
                    f20 = floatValue4;
                } else {
                    float f29 = floatValue4;
                    float f30 = f13;
                    double atan23 = (double) ((float) (Math.atan2((double) f13, (double) f12) - 1.5707963267948966d));
                    float cos5 = (float) Math.cos(atan23);
                    float sin6 = (float) Math.sin(atan23);
                    float f31 = f15;
                    f18 = sin5;
                    path2 = path3;
                    double atan24 = (double) ((float) (Math.atan2((double) sin5, (double) cos4) - 1.5707963267948966d));
                    float cos6 = (float) Math.cos(atan24);
                    float sin7 = (float) Math.sin(atan24);
                    float f32 = z10 ? floatValue6 : floatValue7;
                    float f33 = z10 ? floatValue7 : floatValue6;
                    float f34 = (z10 ? f10 : f29) * f32 * 0.47829f;
                    float f35 = cos5 * f34;
                    float f36 = f34 * sin6;
                    float f37 = (z10 ? f29 : f10) * f33 * 0.47829f;
                    float f38 = cos6 * f37;
                    float f39 = f37 * sin7;
                    if (i13 != 0) {
                        if (i14 == 0) {
                            f35 *= f27;
                            f36 *= f27;
                        } else if (d26 == ceil2 - 1.0d) {
                            f38 *= f27;
                            f39 *= f27;
                        }
                    }
                    f21 = f10;
                    f20 = f29;
                    path2.cubicTo(f12 - f35, f30 - f36, cos4 + f38, f18 + f39, cos4, f18);
                    f19 = f31;
                }
                d25 += (double) f19;
                z10 = !z10;
                i14++;
                d24 = 2.0d;
                f12 = cos4;
                f10 = f21;
                floatValue4 = f20;
                f11 = f14;
                f25 = f17;
                f26 = f16;
                aVar3 = aVar4;
                f13 = f18;
                path3 = path2;
            }
            nVar = this;
            PointF f40 = aVar3.f();
            path = path3;
            path.offset(f40.x, f40.y);
            path.close();
        }
        path.close();
        nVar.f6483m.d(path);
        nVar.f6484n = true;
        return path;
    }

    public final void g(e eVar, int i10, ArrayList arrayList, e eVar2) {
        f.d(eVar, i10, arrayList, eVar2, this);
    }

    public final String getName() {
        return this.f6474b;
    }

    public final void h(u1.c cVar, Object obj) {
        k1.a aVar;
        c cVar2;
        if (obj == h1.q.u) {
            aVar = this.f6477f;
        } else if (obj == h1.q.f5203v) {
            aVar = this.f6479h;
        } else if (obj == h1.q.l) {
            aVar = this.f6478g;
        } else {
            if (obj != h1.q.w || (cVar2 = this.f6480i) == null) {
                if (obj == h1.q.f5204x) {
                    aVar = this.f6481j;
                } else if (obj != h1.q.f5205y || (cVar2 = this.f6482k) == null) {
                    if (obj == h1.q.z) {
                        aVar = this.l;
                    } else {
                        return;
                    }
                }
            }
            cVar2.k(cVar);
            return;
        }
        aVar.k(cVar);
    }
}

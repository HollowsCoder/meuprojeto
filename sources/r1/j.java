package r1;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import o1.c;
import s1.a;
import t1.f;

public final class j implements d0<c> {

    /* renamed from: o  reason: collision with root package name */
    public int f8372o;

    public j(int i10) {
        this.f8372o = i10;
    }

    public final Object f(a aVar, float f10) {
        boolean z;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList = new ArrayList();
        int i13 = 1;
        int i14 = 0;
        if (aVar.r() == a.b.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            aVar.a();
        }
        while (aVar.g()) {
            arrayList.add(Float.valueOf((float) aVar.l()));
        }
        if (z) {
            aVar.c();
        }
        if (this.f8372o == -1) {
            this.f8372o = arrayList.size() / 4;
        }
        int i15 = this.f8372o;
        float[] fArr = new float[i15];
        int[] iArr = new int[i15];
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            i10 = this.f8372o * 4;
            if (i16 >= i10) {
                break;
            }
            int i19 = i16 / 4;
            double floatValue = (double) ((Float) arrayList.get(i16)).floatValue();
            int i20 = i16 % 4;
            if (i20 == 0) {
                if (i19 > 0) {
                    float f11 = (float) floatValue;
                    if (fArr[i19 - 1] >= f11) {
                        fArr[i19] = f11 + 0.01f;
                    }
                }
                fArr[i19] = (float) floatValue;
            } else if (i20 == 1) {
                i17 = (int) (floatValue * 255.0d);
            } else if (i20 == 2) {
                i18 = (int) (floatValue * 255.0d);
            } else if (i20 == 3) {
                iArr[i19] = Color.argb(255, i17, i18, (int) (floatValue * 255.0d));
            }
            i16++;
        }
        c cVar = new c(fArr, iArr);
        if (arrayList.size() > i10) {
            int size = (arrayList.size() - i10) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i21 = 0;
            while (i10 < arrayList.size()) {
                if (i10 % 2 == 0) {
                    dArr[i21] = (double) ((Float) arrayList.get(i10)).floatValue();
                } else {
                    dArr2[i21] = (double) ((Float) arrayList.get(i10)).floatValue();
                    i21++;
                }
                i10++;
            }
            while (true) {
                int[] iArr2 = cVar.f7610b;
                if (i14 >= iArr2.length) {
                    break;
                }
                int i22 = iArr2[i14];
                double d = (double) cVar.f7609a[i14];
                int i23 = i13;
                while (true) {
                    if (i23 >= size) {
                        i11 = i14;
                        i12 = (int) (dArr2[size - 1] * 255.0d);
                        break;
                    }
                    int i24 = i23 - 1;
                    double d10 = dArr[i24];
                    double d11 = dArr[i23];
                    if (d11 >= d) {
                        PointF pointF = f.f8885a;
                        i11 = i14;
                        double max = Math.max(0.0d, Math.min(1.0d, (d - d10) / (d11 - d10)));
                        double d12 = dArr2[i24];
                        i12 = (int) ((((dArr2[i23] - d12) * max) + d12) * 255.0d);
                        break;
                    }
                    int i25 = i14;
                    i23++;
                }
                iArr2[i11] = Color.argb(i12, Color.red(i22), Color.green(i22), Color.blue(i22));
                i14 = i11 + 1;
                i13 = 1;
            }
        }
        return cVar;
    }
}

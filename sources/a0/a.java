package a0;

import android.graphics.Color;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f7a;

    /* renamed from: b  reason: collision with root package name */
    public final float f8b;

    /* renamed from: c  reason: collision with root package name */
    public final float f9c;
    public final float d;

    /* renamed from: e  reason: collision with root package name */
    public final float f10e;

    /* renamed from: f  reason: collision with root package name */
    public final float f11f;

    public a(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f7a = f10;
        this.f8b = f11;
        this.f9c = f12;
        this.d = f13;
        this.f10e = f14;
        this.f11f = f15;
    }

    public static a a(int i10) {
        float f10;
        i iVar = i.f36k;
        float z = s6.a.z(Color.red(i10));
        float z10 = s6.a.z(Color.green(i10));
        float z11 = s6.a.z(Color.blue(i10));
        float[][] fArr = s6.a.f8804r;
        float[] fArr2 = fArr[0];
        float f11 = fArr2[1] * z10;
        float f12 = (fArr2[2] * z11) + f11 + (fArr2[0] * z);
        float[] fArr3 = fArr[1];
        float f13 = fArr3[1] * z10;
        float f14 = (fArr3[2] * z11) + f13 + (fArr3[0] * z);
        float[] fArr4 = fArr[2];
        float f15 = (z11 * fArr4[2]) + (z10 * fArr4[1]) + (z * fArr4[0]);
        float[][] fArr5 = s6.a.f8801o;
        float[] fArr6 = fArr5[0];
        float f16 = fArr6[1] * f14;
        float f17 = (fArr6[2] * f15) + f16 + (fArr6[0] * f12);
        float[] fArr7 = fArr5[1];
        float f18 = fArr7[1] * f14;
        float f19 = fArr7[2] * f15;
        float[] fArr8 = fArr5[2];
        float f20 = f12 * fArr8[0];
        float f21 = f15 * fArr8[2];
        float[] fArr9 = iVar.f42g;
        float f22 = fArr9[0] * f17;
        float f23 = fArr9[1] * (f19 + f18 + (fArr7[0] * f12));
        float f24 = fArr9[2] * (f21 + (f14 * fArr8[1]) + f20);
        float abs = Math.abs(f22);
        float f25 = iVar.f43h;
        float pow = (float) Math.pow(((double) (abs * f25)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (Math.abs(f23) * f25)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (Math.abs(f24) * f25)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f22) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f23) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f24) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d10 = (double) signum3;
        float f26 = ((float) (((((double) signum2) * -12.0d) + (((double) signum) * 11.0d)) + d10)) / 11.0f;
        float f27 = ((float) (((double) (signum + signum2)) - (d10 * 2.0d))) / 9.0f;
        float f28 = signum2 * 20.0f;
        float f29 = ((21.0f * signum3) + ((signum * 20.0f) + f28)) / 20.0f;
        float f30 = (((signum * 40.0f) + f28) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f27, (double) f26)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f31 = atan2;
        float f32 = (3.1415927f * f31) / 180.0f;
        float f33 = f30 * iVar.f38b;
        float f34 = iVar.f37a;
        double d11 = (double) (f33 / f34);
        float f35 = iVar.f45j;
        float f36 = iVar.d;
        float pow4 = ((float) Math.pow(d11, (double) (f35 * f36))) * 100.0f;
        Math.sqrt((double) (pow4 / 100.0f));
        float f37 = f34 + 4.0f;
        if (((double) f31) < 20.14d) {
            f10 = 360.0f + f31;
        } else {
            f10 = f31;
        }
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) iVar.f41f), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) f10) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * iVar.f40e) * iVar.f39c) * ((float) Math.sqrt((double) ((f27 * f27) + (f26 * f26))))) / (f29 + 0.305f)), 0.9d));
        float sqrt = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        Math.sqrt((double) ((pow5 * f36) / f37));
        float f38 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((iVar.f44i * sqrt * 0.0228f) + 1.0f))) * 43.85965f;
        double d12 = (double) f32;
        return new a(f31, sqrt, pow4, f38, log * ((float) Math.cos(d12)), log * ((float) Math.sin(d12)));
    }

    public static a b(float f10, float f11, float f12) {
        i iVar = i.f36k;
        float f13 = iVar.d;
        double d10 = ((double) f10) / 100.0d;
        Math.sqrt(d10);
        Math.sqrt((double) (((f11 / ((float) Math.sqrt(d10))) * iVar.d) / (iVar.f37a + 4.0f)));
        float f14 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float log = ((float) Math.log((((double) (iVar.f44i * f11)) * 0.0228d) + 1.0d)) * 43.85965f;
        double d11 = (double) ((3.1415927f * f12) / 180.0f);
        return new a(f12, f11, f10, f14, log * ((float) Math.cos(d11)), log * ((float) Math.sin(d11)));
    }

    public final int c(i iVar) {
        float f10;
        i iVar2 = iVar;
        float f11 = this.f8b;
        int i10 = (((double) f11) > 0.0d ? 1 : (((double) f11) == 0.0d ? 0 : -1));
        float f12 = this.f9c;
        if (i10 != 0) {
            double d10 = (double) f12;
            if (d10 != 0.0d) {
                f10 = f11 / ((float) Math.sqrt(d10 / 100.0d));
                float pow = (float) Math.pow(((double) f10) / Math.pow(1.64d - Math.pow(0.29d, (double) iVar2.f41f), 0.73d), 1.1111111111111112d);
                double d11 = (double) ((this.f7a * 3.1415927f) / 180.0f);
                float pow2 = iVar2.f37a * ((float) Math.pow(((double) f12) / 100.0d, (1.0d / ((double) iVar2.d)) / ((double) iVar2.f45j)));
                float cos = ((float) (Math.cos(2.0d + d11) + 3.8d)) * 0.25f * 3846.1538f * iVar2.f40e * iVar2.f39c;
                float f13 = pow2 / iVar2.f38b;
                float sin = (float) Math.sin(d11);
                float cos2 = (float) Math.cos(d11);
                float f14 = 11.0f * pow * cos2;
                float f15 = (((0.305f + f13) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (f14 + (cos * 23.0f)));
                float f16 = cos2 * f15;
                float f17 = f15 * sin;
                float f18 = f13 * 460.0f;
                float f19 = ((288.0f * f17) + ((451.0f * f16) + f18)) / 1403.0f;
                float f20 = ((f18 - (891.0f * f16)) - (261.0f * f17)) / 1403.0f;
                float f21 = ((f18 - (f16 * 220.0f)) - (f17 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(0.0d, (((double) Math.abs(f19)) * 27.13d) / (400.0d - ((double) Math.abs(f19))));
                float signum = Math.signum(f19);
                float f22 = 100.0f / iVar2.f43h;
                float pow3 = signum * f22 * ((float) Math.pow((double) max, 2.380952380952381d));
                float signum2 = Math.signum(f20) * f22 * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f20)) * 27.13d) / (400.0d - ((double) Math.abs(f20))))), 2.380952380952381d));
                float[] fArr = iVar2.f42g;
                float f23 = pow3 / fArr[0];
                float f24 = signum2 / fArr[1];
                float signum3 = ((Math.signum(f21) * f22) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f21)) * 27.13d) / (400.0d - ((double) Math.abs(f21))))), 2.380952380952381d))) / fArr[2];
                float[][] fArr2 = s6.a.f8802p;
                float[] fArr3 = fArr2[0];
                float f25 = fArr3[1] * f24;
                float f26 = (fArr3[2] * signum3) + f25 + (fArr3[0] * f23);
                float[] fArr4 = fArr2[1];
                float f27 = fArr4[1] * f24;
                float f28 = fArr4[2] * signum3;
                float[] fArr5 = fArr2[2];
                float f29 = f23 * fArr5[0];
                return b0.a.a((double) f26, (double) (f28 + f27 + (fArr4[0] * f23)), (double) ((signum3 * fArr5[2]) + (f24 * fArr5[1]) + f29));
            }
        }
        f10 = 0.0f;
        float pow4 = (float) Math.pow(((double) f10) / Math.pow(1.64d - Math.pow(0.29d, (double) iVar2.f41f), 0.73d), 1.1111111111111112d);
        double d112 = (double) ((this.f7a * 3.1415927f) / 180.0f);
        float pow22 = iVar2.f37a * ((float) Math.pow(((double) f12) / 100.0d, (1.0d / ((double) iVar2.d)) / ((double) iVar2.f45j)));
        float cos3 = ((float) (Math.cos(2.0d + d112) + 3.8d)) * 0.25f * 3846.1538f * iVar2.f40e * iVar2.f39c;
        float f132 = pow22 / iVar2.f38b;
        float sin2 = (float) Math.sin(d112);
        float cos22 = (float) Math.cos(d112);
        float f142 = 11.0f * pow4 * cos22;
        float f152 = (((0.305f + f132) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (f142 + (cos3 * 23.0f)));
        float f162 = cos22 * f152;
        float f172 = f152 * sin2;
        float f182 = f132 * 460.0f;
        float f192 = ((288.0f * f172) + ((451.0f * f162) + f182)) / 1403.0f;
        float f202 = ((f182 - (891.0f * f162)) - (261.0f * f172)) / 1403.0f;
        float f212 = ((f182 - (f162 * 220.0f)) - (f172 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(0.0d, (((double) Math.abs(f192)) * 27.13d) / (400.0d - ((double) Math.abs(f192))));
        float signum4 = Math.signum(f192);
        float f222 = 100.0f / iVar2.f43h;
        float pow32 = signum4 * f222 * ((float) Math.pow((double) max2, 2.380952380952381d));
        float signum22 = Math.signum(f202) * f222 * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f202)) * 27.13d) / (400.0d - ((double) Math.abs(f202))))), 2.380952380952381d));
        float[] fArr6 = iVar2.f42g;
        float f232 = pow32 / fArr6[0];
        float f242 = signum22 / fArr6[1];
        float signum32 = ((Math.signum(f212) * f222) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f212)) * 27.13d) / (400.0d - ((double) Math.abs(f212))))), 2.380952380952381d))) / fArr6[2];
        float[][] fArr22 = s6.a.f8802p;
        float[] fArr32 = fArr22[0];
        float f252 = fArr32[1] * f242;
        float f262 = (fArr32[2] * signum32) + f252 + (fArr32[0] * f232);
        float[] fArr42 = fArr22[1];
        float f272 = fArr42[1] * f242;
        float f282 = fArr42[2] * signum32;
        float[] fArr52 = fArr22[2];
        float f292 = f232 * fArr52[0];
        return b0.a.a((double) f262, (double) (f282 + f272 + (fArr42[0] * f232)), (double) ((signum32 * fArr52[2]) + (f242 * fArr52[1]) + f292));
    }
}

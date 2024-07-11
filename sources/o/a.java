package o;

import androidx.appcompat.widget.x0;
import b0.d;
import com.karumi.dexter.BuildConfig;
import java.util.Arrays;
import o.b;

public final class a implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public int f7522a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final b f7523b;

    /* renamed from: c  reason: collision with root package name */
    public final c f7524c;
    public int d = 8;

    /* renamed from: e  reason: collision with root package name */
    public int[] f7525e = new int[8];

    /* renamed from: f  reason: collision with root package name */
    public int[] f7526f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public float[] f7527g = new float[8];

    /* renamed from: h  reason: collision with root package name */
    public int f7528h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f7529i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7530j = false;

    public a(b bVar, c cVar) {
        this.f7523b = bVar;
        this.f7524c = cVar;
    }

    public final float a(int i10) {
        int i11 = this.f7528h;
        int i12 = 0;
        while (i11 != -1 && i12 < this.f7522a) {
            if (i12 == i10) {
                return this.f7527g[i11];
            }
            i11 = this.f7526f[i11];
            i12++;
        }
        return 0.0f;
    }

    public final void b(g gVar, float f10, boolean z) {
        if (f10 <= -0.001f || f10 >= 0.001f) {
            int i10 = this.f7528h;
            b bVar = this.f7523b;
            if (i10 == -1) {
                this.f7528h = 0;
                this.f7527g[0] = f10;
                this.f7525e[0] = gVar.f7562p;
                this.f7526f[0] = -1;
                gVar.z++;
                gVar.g(bVar);
                this.f7522a++;
                if (!this.f7530j) {
                    int i11 = this.f7529i + 1;
                    this.f7529i = i11;
                    int[] iArr = this.f7525e;
                    if (i11 >= iArr.length) {
                        this.f7530j = true;
                        this.f7529i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i12 = 0;
            int i13 = -1;
            while (i10 != -1 && i12 < this.f7522a) {
                int i14 = this.f7525e[i10];
                int i15 = gVar.f7562p;
                if (i14 == i15) {
                    float[] fArr = this.f7527g;
                    float f11 = fArr[i10] + f10;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i10] = f11;
                    if (f11 == 0.0f) {
                        if (i10 == this.f7528h) {
                            this.f7528h = this.f7526f[i10];
                        } else {
                            int[] iArr2 = this.f7526f;
                            iArr2[i13] = iArr2[i10];
                        }
                        if (z) {
                            gVar.i(bVar);
                        }
                        if (this.f7530j) {
                            this.f7529i = i10;
                        }
                        gVar.z--;
                        this.f7522a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i13 = i10;
                }
                i10 = this.f7526f[i10];
                i12++;
            }
            int i16 = this.f7529i;
            int i17 = i16 + 1;
            if (this.f7530j) {
                int[] iArr3 = this.f7525e;
                if (iArr3[i16] != -1) {
                    i16 = iArr3.length;
                }
            } else {
                i16 = i17;
            }
            int[] iArr4 = this.f7525e;
            if (i16 >= iArr4.length && this.f7522a < iArr4.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr5 = this.f7525e;
                    if (i18 >= iArr5.length) {
                        break;
                    } else if (iArr5[i18] == -1) {
                        i16 = i18;
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            int[] iArr6 = this.f7525e;
            if (i16 >= iArr6.length) {
                i16 = iArr6.length;
                int i19 = this.d * 2;
                this.d = i19;
                this.f7530j = false;
                this.f7529i = i16 - 1;
                this.f7527g = Arrays.copyOf(this.f7527g, i19);
                this.f7525e = Arrays.copyOf(this.f7525e, this.d);
                this.f7526f = Arrays.copyOf(this.f7526f, this.d);
            }
            this.f7525e[i16] = gVar.f7562p;
            this.f7527g[i16] = f10;
            int[] iArr7 = this.f7526f;
            if (i13 != -1) {
                iArr7[i16] = iArr7[i13];
                iArr7[i13] = i16;
            } else {
                iArr7[i16] = this.f7528h;
                this.f7528h = i16;
            }
            gVar.z++;
            gVar.g(bVar);
            this.f7522a++;
            if (!this.f7530j) {
                this.f7529i++;
            }
            int i20 = this.f7529i;
            int[] iArr8 = this.f7525e;
            if (i20 >= iArr8.length) {
                this.f7530j = true;
                this.f7529i = iArr8.length - 1;
            }
        }
    }

    public final void c(g gVar, float f10) {
        if (f10 == 0.0f) {
            j(gVar, true);
            return;
        }
        int i10 = this.f7528h;
        b bVar = this.f7523b;
        if (i10 == -1) {
            this.f7528h = 0;
            this.f7527g[0] = f10;
            this.f7525e[0] = gVar.f7562p;
            this.f7526f[0] = -1;
            gVar.z++;
            gVar.g(bVar);
            this.f7522a++;
            if (!this.f7530j) {
                int i11 = this.f7529i + 1;
                this.f7529i = i11;
                int[] iArr = this.f7525e;
                if (i11 >= iArr.length) {
                    this.f7530j = true;
                    this.f7529i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i12 = -1;
        int i13 = 0;
        while (i10 != -1 && i13 < this.f7522a) {
            int i14 = this.f7525e[i10];
            int i15 = gVar.f7562p;
            if (i14 == i15) {
                this.f7527g[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f7526f[i10];
            i13++;
        }
        int i16 = this.f7529i;
        int i17 = i16 + 1;
        if (this.f7530j) {
            int[] iArr2 = this.f7525e;
            if (iArr2[i16] != -1) {
                i16 = iArr2.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr3 = this.f7525e;
        if (i16 >= iArr3.length && this.f7522a < iArr3.length) {
            int i18 = 0;
            while (true) {
                int[] iArr4 = this.f7525e;
                if (i18 >= iArr4.length) {
                    break;
                } else if (iArr4[i18] == -1) {
                    i16 = i18;
                    break;
                } else {
                    i18++;
                }
            }
        }
        int[] iArr5 = this.f7525e;
        if (i16 >= iArr5.length) {
            i16 = iArr5.length;
            int i19 = this.d * 2;
            this.d = i19;
            this.f7530j = false;
            this.f7529i = i16 - 1;
            this.f7527g = Arrays.copyOf(this.f7527g, i19);
            this.f7525e = Arrays.copyOf(this.f7525e, this.d);
            this.f7526f = Arrays.copyOf(this.f7526f, this.d);
        }
        this.f7525e[i16] = gVar.f7562p;
        this.f7527g[i16] = f10;
        int[] iArr6 = this.f7526f;
        if (i12 != -1) {
            iArr6[i16] = iArr6[i12];
            iArr6[i12] = i16;
        } else {
            iArr6[i16] = this.f7528h;
            this.f7528h = i16;
        }
        gVar.z++;
        gVar.g(bVar);
        int i20 = this.f7522a + 1;
        this.f7522a = i20;
        if (!this.f7530j) {
            this.f7529i++;
        }
        int[] iArr7 = this.f7525e;
        if (i20 >= iArr7.length) {
            this.f7530j = true;
        }
        if (this.f7529i >= iArr7.length) {
            this.f7530j = true;
            this.f7529i = iArr7.length - 1;
        }
    }

    public final void clear() {
        int i10 = this.f7528h;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f7522a) {
            g gVar = ((g[]) this.f7524c.d)[this.f7525e[i10]];
            if (gVar != null) {
                gVar.i(this.f7523b);
            }
            i10 = this.f7526f[i10];
            i11++;
        }
        this.f7528h = -1;
        this.f7529i = -1;
        this.f7530j = false;
        this.f7522a = 0;
    }

    public final int d() {
        return this.f7522a;
    }

    public final boolean e(g gVar) {
        int i10 = this.f7528h;
        if (i10 == -1) {
            return false;
        }
        int i11 = 0;
        while (i10 != -1 && i11 < this.f7522a) {
            if (this.f7525e[i10] == gVar.f7562p) {
                return true;
            }
            i10 = this.f7526f[i10];
            i11++;
        }
        return false;
    }

    public final float f(b bVar, boolean z) {
        float g10 = g(bVar.f7531a);
        j(bVar.f7531a, z);
        b.a aVar = bVar.d;
        int d10 = aVar.d();
        for (int i10 = 0; i10 < d10; i10++) {
            g h10 = aVar.h(i10);
            b(h10, aVar.g(h10) * g10, z);
        }
        return g10;
    }

    public final float g(g gVar) {
        int i10 = this.f7528h;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f7522a) {
            if (this.f7525e[i10] == gVar.f7562p) {
                return this.f7527g[i10];
            }
            i10 = this.f7526f[i10];
            i11++;
        }
        return 0.0f;
    }

    public final g h(int i10) {
        int i11 = this.f7528h;
        int i12 = 0;
        while (i11 != -1 && i12 < this.f7522a) {
            if (i12 == i10) {
                return ((g[]) this.f7524c.d)[this.f7525e[i11]];
            }
            i11 = this.f7526f[i11];
            i12++;
        }
        return null;
    }

    public final void i(float f10) {
        int i10 = this.f7528h;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f7522a) {
            float[] fArr = this.f7527g;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f7526f[i10];
            i11++;
        }
    }

    public final float j(g gVar, boolean z) {
        int i10 = this.f7528h;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f7522a) {
            if (this.f7525e[i10] == gVar.f7562p) {
                if (i10 == this.f7528h) {
                    this.f7528h = this.f7526f[i10];
                } else {
                    int[] iArr = this.f7526f;
                    iArr[i12] = iArr[i10];
                }
                if (z) {
                    gVar.i(this.f7523b);
                }
                gVar.z--;
                this.f7522a--;
                this.f7525e[i10] = -1;
                if (this.f7530j) {
                    this.f7529i = i10;
                }
                return this.f7527g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f7526f[i10];
        }
        return 0.0f;
    }

    public final void k() {
        int i10 = this.f7528h;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f7522a) {
            float[] fArr = this.f7527g;
            fArr[i10] = fArr[i10] * -1.0f;
            i10 = this.f7526f[i10];
            i11++;
        }
    }

    public final String toString() {
        int i10 = this.f7528h;
        String str = BuildConfig.FLAVOR;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f7522a) {
            StringBuilder g10 = x0.g(d.e(str, " -> "));
            g10.append(this.f7527g[i10]);
            g10.append(" : ");
            StringBuilder g11 = x0.g(g10.toString());
            g11.append(((g[]) this.f7524c.d)[this.f7525e[i10]]);
            str = g11.toString();
            i10 = this.f7526f[i10];
            i11++;
        }
        return str;
    }
}

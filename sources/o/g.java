package o;

import com.karumi.dexter.BuildConfig;
import java.util.Arrays;

public final class g implements Comparable<g> {

    /* renamed from: o  reason: collision with root package name */
    public boolean f7561o;

    /* renamed from: p  reason: collision with root package name */
    public int f7562p = -1;

    /* renamed from: q  reason: collision with root package name */
    public int f7563q = -1;

    /* renamed from: r  reason: collision with root package name */
    public int f7564r = 0;

    /* renamed from: s  reason: collision with root package name */
    public float f7565s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f7566t = false;
    public final float[] u = new float[9];

    /* renamed from: v  reason: collision with root package name */
    public final float[] f7567v = new float[9];
    public a w;

    /* renamed from: x  reason: collision with root package name */
    public b[] f7568x = new b[16];

    /* renamed from: y  reason: collision with root package name */
    public int f7569y = 0;
    public int z = 0;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public g(a aVar) {
        this.w = aVar;
    }

    public final int compareTo(Object obj) {
        return this.f7562p - ((g) obj).f7562p;
    }

    public final void g(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f7569y;
            if (i10 >= i11) {
                b[] bVarArr = this.f7568x;
                if (i11 >= bVarArr.length) {
                    this.f7568x = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f7568x;
                int i12 = this.f7569y;
                bVarArr2[i12] = bVar;
                this.f7569y = i12 + 1;
                return;
            } else if (this.f7568x[i10] != bVar) {
                i10++;
            } else {
                return;
            }
        }
    }

    public final void i(b bVar) {
        int i10 = this.f7569y;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f7568x[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f7568x;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f7569y--;
                return;
            }
            i11++;
        }
    }

    public final void k() {
        this.w = a.UNKNOWN;
        this.f7564r = 0;
        this.f7562p = -1;
        this.f7563q = -1;
        this.f7565s = 0.0f;
        this.f7566t = false;
        int i10 = this.f7569y;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f7568x[i11] = null;
        }
        this.f7569y = 0;
        this.z = 0;
        this.f7561o = false;
        Arrays.fill(this.f7567v, 0.0f);
    }

    public final void l(d dVar, float f10) {
        this.f7565s = f10;
        this.f7566t = true;
        int i10 = this.f7569y;
        this.f7563q = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f7568x[i11].h(dVar, this, false);
        }
        this.f7569y = 0;
    }

    public final void n(d dVar, b bVar) {
        int i10 = this.f7569y;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f7568x[i11].i(dVar, bVar, false);
        }
        this.f7569y = 0;
    }

    public final String toString() {
        return BuildConfig.FLAVOR + this.f7562p;
    }
}

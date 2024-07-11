package m6;

import n.e;

public final class d extends e {
    public final float I = -1.0f;

    public d() {
        super(8);
    }

    public final void v(float f10, float f11, l lVar) {
        lVar.e(f11 * f10, 180.0f, 90.0f);
        double d = (double) f11;
        double d10 = (double) f10;
        lVar.d((float) (Math.sin(Math.toRadians((double) 90.0f)) * d * d10), (float) (Math.sin(Math.toRadians((double) 0.0f)) * d * d10));
    }
}

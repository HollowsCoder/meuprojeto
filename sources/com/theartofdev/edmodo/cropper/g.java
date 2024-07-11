package com.theartofdev.edmodo.cropper;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final float f4118a;

    /* renamed from: b  reason: collision with root package name */
    public final float f4119b;

    /* renamed from: c  reason: collision with root package name */
    public final float f4120c;
    public final float d;

    /* renamed from: e  reason: collision with root package name */
    public final b f4121e;

    /* renamed from: f  reason: collision with root package name */
    public final PointF f4122f;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4123a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.theartofdev.edmodo.cropper.g$b[] r0 = com.theartofdev.edmodo.cropper.g.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4123a = r0
                com.theartofdev.edmodo.cropper.g$b r1 = com.theartofdev.edmodo.cropper.g.b.TOP_LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4123a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.theartofdev.edmodo.cropper.g$b r1 = com.theartofdev.edmodo.cropper.g.b.TOP_RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4123a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.theartofdev.edmodo.cropper.g$b r1 = com.theartofdev.edmodo.cropper.g.b.BOTTOM_LEFT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4123a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.theartofdev.edmodo.cropper.g$b r1 = com.theartofdev.edmodo.cropper.g.b.BOTTOM_RIGHT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f4123a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.theartofdev.edmodo.cropper.g$b r1 = com.theartofdev.edmodo.cropper.g.b.LEFT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f4123a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.theartofdev.edmodo.cropper.g$b r1 = com.theartofdev.edmodo.cropper.g.b.TOP     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f4123a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.theartofdev.edmodo.cropper.g$b r1 = com.theartofdev.edmodo.cropper.g.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f4123a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.theartofdev.edmodo.cropper.g$b r1 = com.theartofdev.edmodo.cropper.g.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f4123a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.theartofdev.edmodo.cropper.g$b r1 = com.theartofdev.edmodo.cropper.g.b.CENTER     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.g.a.<clinit>():void");
        }
    }

    public enum b {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        CENTER
    }

    static {
        new Matrix();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0076, code lost:
        r1 = r6 - r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007a, code lost:
        r6 = r6 - r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007b, code lost:
        r0.x = r1;
        r0.y = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0062, code lost:
        r1 = r6 - r8;
        r6 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006c, code lost:
        r1 = r6 - r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g(com.theartofdev.edmodo.cropper.g.b r6, com.theartofdev.edmodo.cropper.f r7, float r8, float r9) {
        /*
            r5 = this;
            r5.<init>()
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r5.f4122f = r0
            r5.f4121e = r6
            float r1 = r7.f4110c
            float r2 = r7.f4113g
            float r3 = r7.f4117k
            float r2 = r2 / r3
            float r1 = java.lang.Math.max(r1, r2)
            r5.f4118a = r1
            float r1 = r7.d
            float r2 = r7.f4114h
            float r3 = r7.l
            float r2 = r2 / r3
            float r1 = java.lang.Math.max(r1, r2)
            r5.f4119b = r1
            float r1 = r7.f4111e
            float r2 = r7.f4115i
            float r3 = r7.f4117k
            float r2 = r2 / r3
            float r1 = java.lang.Math.min(r1, r2)
            r5.f4120c = r1
            float r1 = r7.f4112f
            float r2 = r7.f4116j
            float r3 = r7.l
            float r2 = r2 / r3
            float r1 = java.lang.Math.min(r1, r2)
            r5.d = r1
            android.graphics.RectF r7 = r7.a()
            int[] r1 = com.theartofdev.edmodo.cropper.g.a.f4123a
            int r6 = r6.ordinal()
            r6 = r1[r6]
            r1 = 0
            switch(r6) {
                case 1: goto L_0x0074;
                case 2: goto L_0x0071;
                case 3: goto L_0x006a;
                case 4: goto L_0x0067;
                case 5: goto L_0x0060;
                case 6: goto L_0x0078;
                case 7: goto L_0x005d;
                case 8: goto L_0x006e;
                case 9: goto L_0x0052;
                default: goto L_0x0050;
            }
        L_0x0050:
            r6 = r1
            goto L_0x007b
        L_0x0052:
            float r6 = r7.centerX()
            float r1 = r6 - r8
            float r6 = r7.centerY()
            goto L_0x007a
        L_0x005d:
            float r6 = r7.right
            goto L_0x0062
        L_0x0060:
            float r6 = r7.left
        L_0x0062:
            float r6 = r6 - r8
            r4 = r1
            r1 = r6
            r6 = r4
            goto L_0x007b
        L_0x0067:
            float r6 = r7.right
            goto L_0x006c
        L_0x006a:
            float r6 = r7.left
        L_0x006c:
            float r1 = r6 - r8
        L_0x006e:
            float r6 = r7.bottom
            goto L_0x007a
        L_0x0071:
            float r6 = r7.right
            goto L_0x0076
        L_0x0074:
            float r6 = r7.left
        L_0x0076:
            float r1 = r6 - r8
        L_0x0078:
            float r6 = r7.top
        L_0x007a:
            float r6 = r6 - r9
        L_0x007b:
            r0.x = r1
            r0.y = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.g.<init>(com.theartofdev.edmodo.cropper.g$b, com.theartofdev.edmodo.cropper.f, float, float):void");
    }

    public static void c(RectF rectF, RectF rectF2, float f10) {
        rectF.inset((rectF.width() - (rectF.height() * f10)) / 2.0f, 0.0f);
        float f11 = rectF.left;
        float f12 = rectF2.left;
        if (f11 < f12) {
            rectF.offset(f12 - f11, 0.0f);
        }
        float f13 = rectF.right;
        float f14 = rectF2.right;
        if (f13 > f14) {
            rectF.offset(f14 - f13, 0.0f);
        }
    }

    public static void f(RectF rectF, RectF rectF2, float f10) {
        rectF.inset(0.0f, (rectF.height() - (rectF.width() / f10)) / 2.0f);
        float f11 = rectF.top;
        float f12 = rectF2.top;
        if (f11 < f12) {
            rectF.offset(0.0f, f12 - f11);
        }
        float f13 = rectF.bottom;
        float f14 = rectF2.bottom;
        if (f13 > f14) {
            rectF.offset(0.0f, f14 - f13);
        }
    }

    public final void a(RectF rectF, float f10, RectF rectF2, int i10, float f11, float f12, boolean z, boolean z10) {
        float f13;
        float f14 = (float) i10;
        int i11 = (f10 > f14 ? 1 : (f10 == f14 ? 0 : -1));
        PointF pointF = this.f4122f;
        if (i11 > 0) {
            f10 = ((f10 - f14) / 1.05f) + f14;
            pointF.y -= (f10 - f14) / 1.1f;
        }
        float f15 = rectF2.bottom;
        if (f10 > f15) {
            pointF.y -= (f10 - f15) / 2.0f;
        }
        if (f15 - f10 < f11) {
            f10 = f15;
        }
        float f16 = rectF.top;
        float f17 = this.f4119b;
        if (f10 - f16 < f17) {
            f10 = f16 + f17;
        }
        float f18 = this.d;
        if (f10 - f16 > f18) {
            f10 = f16 + f18;
        }
        if (f15 - f10 < f11) {
            f10 = f15;
        }
        if (f12 > 0.0f) {
            float f19 = (f10 - f16) * f12;
            float f20 = this.f4118a;
            if (f19 < f20) {
                f10 = Math.min(f15, (f20 / f12) + f16);
                f19 = (f10 - rectF.top) * f12;
            }
            float f21 = this.f4120c;
            if (f19 > f21) {
                f10 = Math.min(rectF2.bottom, (f21 / f12) + rectF.top);
                f19 = (f10 - rectF.top) * f12;
            }
            if (!z || !z10) {
                if (z) {
                    float f22 = rectF.right;
                    float f23 = rectF2.left;
                    if (f22 - f19 < f23) {
                        f10 = Math.min(rectF2.bottom, ((f22 - f23) / f12) + rectF.top);
                        f19 = (f10 - rectF.top) * f12;
                    }
                }
                if (z10) {
                    float f24 = rectF.left;
                    float f25 = rectF2.right;
                    if (f19 + f24 > f25) {
                        f13 = Math.min(rectF2.bottom, ((f25 - f24) / f12) + rectF.top);
                    }
                }
            } else {
                f13 = Math.min(rectF2.bottom, (rectF2.width() / f12) + rectF.top);
            }
            f10 = Math.min(f10, f13);
        }
        rectF.bottom = f10;
    }

    public final void b(RectF rectF, float f10, RectF rectF2, float f11, float f12, boolean z, boolean z10) {
        float f13;
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        PointF pointF = this.f4122f;
        if (i10 < 0) {
            f10 /= 1.05f;
            pointF.x -= f10 / 1.1f;
        }
        float f14 = rectF2.left;
        if (f10 < f14) {
            pointF.x -= (f10 - f14) / 2.0f;
        }
        if (f10 - f14 < f11) {
            f10 = f14;
        }
        float f15 = rectF.right;
        float f16 = this.f4118a;
        if (f15 - f10 < f16) {
            f10 = f15 - f16;
        }
        float f17 = this.f4120c;
        if (f15 - f10 > f17) {
            f10 = f15 - f17;
        }
        if (f10 - f14 < f11) {
            f10 = f14;
        }
        if (f12 > 0.0f) {
            float f18 = (f15 - f10) / f12;
            float f19 = this.f4119b;
            if (f18 < f19) {
                f10 = Math.max(f14, f15 - (f19 * f12));
                f18 = (rectF.right - f10) / f12;
            }
            float f20 = this.d;
            if (f18 > f20) {
                f10 = Math.max(rectF2.left, rectF.right - (f20 * f12));
                f18 = (rectF.right - f10) / f12;
            }
            if (!z || !z10) {
                if (z) {
                    float f21 = rectF.bottom;
                    float f22 = rectF2.top;
                    if (f21 - f18 < f22) {
                        f10 = Math.max(rectF2.left, rectF.right - ((f21 - f22) * f12));
                        f18 = (rectF.right - f10) / f12;
                    }
                }
                if (z10) {
                    float f23 = rectF.top;
                    float f24 = rectF2.bottom;
                    if (f18 + f23 > f24) {
                        f13 = Math.max(rectF2.left, rectF.right - ((f24 - f23) * f12));
                    }
                }
            } else {
                f13 = Math.max(rectF2.left, rectF.right - (rectF2.height() * f12));
            }
            f10 = Math.max(f10, f13);
        }
        rectF.left = f10;
    }

    public final void d(RectF rectF, float f10, RectF rectF2, int i10, float f11, float f12, boolean z, boolean z10) {
        float f13;
        float f14 = (float) i10;
        int i11 = (f10 > f14 ? 1 : (f10 == f14 ? 0 : -1));
        PointF pointF = this.f4122f;
        if (i11 > 0) {
            f10 = ((f10 - f14) / 1.05f) + f14;
            pointF.x -= (f10 - f14) / 1.1f;
        }
        float f15 = rectF2.right;
        if (f10 > f15) {
            pointF.x -= (f10 - f15) / 2.0f;
        }
        if (f15 - f10 < f11) {
            f10 = f15;
        }
        float f16 = rectF.left;
        float f17 = this.f4118a;
        if (f10 - f16 < f17) {
            f10 = f16 + f17;
        }
        float f18 = this.f4120c;
        if (f10 - f16 > f18) {
            f10 = f16 + f18;
        }
        if (f15 - f10 < f11) {
            f10 = f15;
        }
        if (f12 > 0.0f) {
            float f19 = (f10 - f16) / f12;
            float f20 = this.f4119b;
            if (f19 < f20) {
                f10 = Math.min(f15, (f20 * f12) + f16);
                f19 = (f10 - rectF.left) / f12;
            }
            float f21 = this.d;
            if (f19 > f21) {
                f10 = Math.min(rectF2.right, (f21 * f12) + rectF.left);
                f19 = (f10 - rectF.left) / f12;
            }
            if (!z || !z10) {
                if (z) {
                    float f22 = rectF.bottom;
                    float f23 = rectF2.top;
                    if (f22 - f19 < f23) {
                        f10 = Math.min(rectF2.right, ((f22 - f23) * f12) + rectF.left);
                        f19 = (f10 - rectF.left) / f12;
                    }
                }
                if (z10) {
                    float f24 = rectF.top;
                    float f25 = rectF2.bottom;
                    if (f19 + f24 > f25) {
                        f13 = Math.min(rectF2.right, ((f25 - f24) * f12) + rectF.left);
                    }
                }
            } else {
                f13 = Math.min(rectF2.right, (rectF2.height() * f12) + rectF.left);
            }
            f10 = Math.min(f10, f13);
        }
        rectF.right = f10;
    }

    public final void e(RectF rectF, float f10, RectF rectF2, float f11, float f12, boolean z, boolean z10) {
        float f13;
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        PointF pointF = this.f4122f;
        if (i10 < 0) {
            f10 /= 1.05f;
            pointF.y -= f10 / 1.1f;
        }
        float f14 = rectF2.top;
        if (f10 < f14) {
            pointF.y -= (f10 - f14) / 2.0f;
        }
        if (f10 - f14 < f11) {
            f10 = f14;
        }
        float f15 = rectF.bottom;
        float f16 = this.f4119b;
        if (f15 - f10 < f16) {
            f10 = f15 - f16;
        }
        float f17 = this.d;
        if (f15 - f10 > f17) {
            f10 = f15 - f17;
        }
        if (f10 - f14 < f11) {
            f10 = f14;
        }
        if (f12 > 0.0f) {
            float f18 = (f15 - f10) * f12;
            float f19 = this.f4118a;
            if (f18 < f19) {
                f10 = Math.max(f14, f15 - (f19 / f12));
                f18 = (rectF.bottom - f10) * f12;
            }
            float f20 = this.f4120c;
            if (f18 > f20) {
                f10 = Math.max(rectF2.top, rectF.bottom - (f20 / f12));
                f18 = (rectF.bottom - f10) * f12;
            }
            if (!z || !z10) {
                if (z) {
                    float f21 = rectF.right;
                    float f22 = rectF2.left;
                    if (f21 - f18 < f22) {
                        f10 = Math.max(rectF2.top, rectF.bottom - ((f21 - f22) / f12));
                        f18 = (rectF.bottom - f10) * f12;
                    }
                }
                if (z10) {
                    float f23 = rectF.left;
                    float f24 = rectF2.right;
                    if (f18 + f23 > f24) {
                        f13 = Math.max(rectF2.top, rectF.bottom - ((f24 - f23) / f12));
                    }
                }
            } else {
                f13 = Math.max(rectF2.top, rectF.bottom - (rectF2.width() / f12));
            }
            f10 = Math.max(f10, f13);
        }
        rectF.top = f10;
    }
}

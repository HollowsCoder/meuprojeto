package o0;

import android.graphics.Rect;
import java.util.Comparator;
import o0.a;

public final class b {

    public interface a<T> {
    }

    /* renamed from: o0.b$b  reason: collision with other inner class name */
    public static class C0107b<T> implements Comparator<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f7582a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        public final Rect f7583b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        public final boolean f7584c;
        public final a<T> d;

        public C0107b(boolean z, a.C0106a aVar) {
            this.f7584c = z;
            this.d = aVar;
        }

        public final int compare(T t10, T t11) {
            a.C0106a aVar = (a.C0106a) this.d;
            aVar.getClass();
            Rect rect = this.f7582a;
            ((j0.b) t10).d(rect);
            aVar.getClass();
            Rect rect2 = this.f7583b;
            ((j0.b) t11).d(rect2);
            int i10 = rect.top;
            int i11 = rect2.top;
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
            int i12 = rect.left;
            int i13 = rect2.left;
            boolean z = this.f7584c;
            if (i12 < i13) {
                if (z) {
                    return 1;
                }
                return -1;
            } else if (i12 <= i13) {
                int i14 = rect.bottom;
                int i15 = rect2.bottom;
                if (i14 < i15) {
                    return -1;
                }
                if (i14 > i15) {
                    return 1;
                }
                int i16 = rect.right;
                int i17 = rect2.right;
                if (i16 < i17) {
                    if (z) {
                        return 1;
                    }
                    return -1;
                } else if (i16 <= i17) {
                    return 0;
                } else {
                    if (z) {
                        return -1;
                    }
                    return 1;
                }
            } else if (z) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r10.right <= r12.left) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r10.top >= r12.bottom) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r10.left >= r12.right) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = b(r9, r10, r11)
            boolean r1 = b(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L_0x007d
            if (r0 != 0) goto L_0x000f
            goto L_0x007d
        L_0x000f:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L_0x003d
            if (r9 == r3) goto L_0x0036
            if (r9 == r4) goto L_0x002f
            if (r9 != r1) goto L_0x0029
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L_0x0045
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x002f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L_0x0045
            goto L_0x0043
        L_0x0036:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L_0x0045
            goto L_0x0043
        L_0x003d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L_0x0045
        L_0x0043:
            r7 = r6
            goto L_0x0046
        L_0x0045:
            r7 = r2
        L_0x0046:
            if (r7 != 0) goto L_0x0049
            return r6
        L_0x0049:
            if (r9 == r5) goto L_0x007c
            if (r9 != r4) goto L_0x004e
            goto L_0x007c
        L_0x004e:
            int r11 = d(r9, r10, r11)
            if (r9 == r5) goto L_0x006f
            if (r9 == r3) goto L_0x006a
            if (r9 == r4) goto L_0x0065
            if (r9 != r1) goto L_0x005f
            int r9 = r12.bottom
            int r10 = r10.bottom
            goto L_0x0073
        L_0x005f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x0065:
            int r9 = r12.right
            int r10 = r10.right
            goto L_0x0073
        L_0x006a:
            int r9 = r10.top
            int r10 = r12.top
            goto L_0x0073
        L_0x006f:
            int r9 = r10.left
            int r10 = r12.left
        L_0x0073:
            int r9 = r9 - r10
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L_0x007b
            r2 = r6
        L_0x007b:
            return r2
        L_0x007c:
            return r6
        L_0x007d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.b.a(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean b(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static boolean c(int i10, Rect rect, Rect rect2) {
        if (i10 == 17) {
            int i11 = rect.right;
            int i12 = rect2.right;
            return (i11 > i12 || rect.left >= i12) && rect.left > rect2.left;
        } else if (i10 == 33) {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            return (i13 > i14 || rect.top >= i14) && rect.top > rect2.top;
        } else if (i10 == 66) {
            int i15 = rect.left;
            int i16 = rect2.left;
            return (i15 < i16 || rect.right <= i16) && rect.right < rect2.right;
        } else if (i10 == 130) {
            int i17 = rect.top;
            int i18 = rect2.top;
            return (i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static int d(int i10, Rect rect, Rect rect2) {
        int i11;
        int i12;
        if (i10 == 17) {
            i12 = rect.left;
            i11 = rect2.right;
        } else if (i10 == 33) {
            i12 = rect.top;
            i11 = rect2.bottom;
        } else if (i10 == 66) {
            i12 = rect2.left;
            i11 = rect.right;
        } else if (i10 == 130) {
            i12 = rect2.top;
            i11 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i12 - i11);
    }

    public static int e(int i10, Rect rect, Rect rect2) {
        int i11;
        int i12;
        int i13;
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            i12 = (rect.width() / 2) + rect.left;
            i13 = rect2.left;
            i11 = rect2.width();
            return Math.abs(i12 - ((i11 / 2) + i13));
        }
        i12 = (rect.height() / 2) + rect.top;
        i13 = rect2.top;
        i11 = rect2.height();
        return Math.abs(i12 - ((i11 / 2) + i13));
    }
}

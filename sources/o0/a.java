package o0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import i0.b0;
import i0.w;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o0.b;

public abstract class a extends i0.a {

    /* renamed from: n  reason: collision with root package name */
    public static final Rect f7570n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o  reason: collision with root package name */
    public static final C0106a f7571o = new C0106a();

    /* renamed from: p  reason: collision with root package name */
    public static final b f7572p = new b();
    public final Rect d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f7573e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final Rect f7574f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final int[] f7575g = new int[2];

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager f7576h;

    /* renamed from: i  reason: collision with root package name */
    public final View f7577i;

    /* renamed from: j  reason: collision with root package name */
    public c f7578j;

    /* renamed from: k  reason: collision with root package name */
    public int f7579k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public int f7580m = Integer.MIN_VALUE;

    /* renamed from: o0.a$a  reason: collision with other inner class name */
    public class C0106a implements b.a<j0.b> {
    }

    public class b {
    }

    public class c extends j0.c {
        public c() {
        }

        public final j0.b a(int i10) {
            return new j0.b(AccessibilityNodeInfo.obtain(a.this.n(i10).f6386a));
        }

        public final j0.b b(int i10) {
            a aVar = a.this;
            int i11 = i10 == 2 ? aVar.f7579k : aVar.l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i11);
        }

        public final boolean c(int i10, int i11, Bundle bundle) {
            int i12;
            a aVar = a.this;
            View view = aVar.f7577i;
            if (i10 != -1) {
                boolean z = true;
                if (i11 == 1) {
                    return aVar.s(i10);
                }
                if (i11 == 2) {
                    return aVar.j(i10);
                }
                if (i11 == 64) {
                    AccessibilityManager accessibilityManager = aVar.f7576h;
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i12 = aVar.f7579k) != i10) {
                        if (i12 != Integer.MIN_VALUE) {
                            aVar.f7579k = Integer.MIN_VALUE;
                            aVar.f7577i.invalidate();
                            aVar.t(i12, 65536);
                        }
                        aVar.f7579k = i10;
                        view.invalidate();
                        aVar.t(i10, 32768);
                        return z;
                    }
                } else if (i11 != 128) {
                    return aVar.o(i10, i11);
                } else {
                    if (aVar.f7579k == i10) {
                        aVar.f7579k = Integer.MIN_VALUE;
                        view.invalidate();
                        aVar.t(i10, 65536);
                        return z;
                    }
                }
                z = false;
                return z;
            }
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            return w.d.j(view, i11, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f7577i = view;
            this.f7576h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            if (w.d.c(view) == 0) {
                w.d.s(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    public final j0.c b(View view) {
        if (this.f7578j == null) {
            this.f7578j = new c();
        }
        return this.f7578j;
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    public final void d(View view, j0.b bVar) {
        this.f5951a.onInitializeAccessibilityNodeInfo(view, bVar.f6386a);
        p(bVar);
    }

    public final boolean j(int i10) {
        if (this.l != i10) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        r(i10, false);
        t(i10, 8);
        return true;
    }

    public final j0.b k(int i10) {
        boolean z;
        AccessibilityNodeInfo accessibilityNodeInfo;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        j0.b bVar = new j0.b(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        bVar.g("android.view.View");
        Rect rect = f7570n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        bVar.f6387b = -1;
        View view = this.f7577i;
        obtain.setParent(view);
        q(i10, bVar);
        if (bVar.e() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f7573e;
        bVar.d(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                obtain.setPackageName(view.getContext().getPackageName());
                bVar.f6388c = i10;
                obtain.setSource(view, i10);
                boolean z10 = false;
                if (this.f7579k == i10) {
                    obtain.setAccessibilityFocused(true);
                    bVar.a(128);
                } else {
                    obtain.setAccessibilityFocused(false);
                    bVar.a(64);
                }
                if (this.l == i10) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    bVar.a(2);
                } else if (obtain.isFocusable()) {
                    bVar.a(1);
                }
                obtain.setFocused(z);
                int[] iArr = this.f7575g;
                view.getLocationOnScreen(iArr);
                Rect rect3 = this.d;
                obtain.getBoundsInScreen(rect3);
                if (rect3.equals(rect)) {
                    bVar.d(rect3);
                    if (bVar.f6387b != -1) {
                        j0.b bVar2 = new j0.b(AccessibilityNodeInfo.obtain());
                        int i11 = bVar.f6387b;
                        while (true) {
                            accessibilityNodeInfo = bVar2.f6386a;
                            if (i11 == -1) {
                                break;
                            }
                            bVar2.f6387b = -1;
                            accessibilityNodeInfo.setParent(view, -1);
                            accessibilityNodeInfo.setBoundsInParent(rect);
                            q(i11, bVar2);
                            bVar2.d(rect2);
                            rect3.offset(rect2.left, rect2.top);
                            i11 = bVar2.f6387b;
                        }
                        accessibilityNodeInfo.recycle();
                    }
                    rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                }
                Rect rect4 = this.f7574f;
                if (view.getLocalVisibleRect(rect4)) {
                    rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    if (rect3.intersect(rect4)) {
                        bVar.f6386a.setBoundsInScreen(rect3);
                        if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                            while (true) {
                                ViewParent parent = view.getParent();
                                if (parent instanceof View) {
                                    view = (View) parent;
                                    if (view.getAlpha() > 0.0f) {
                                        if (view.getVisibility() != 0) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                } else if (parent != null) {
                                    z10 = true;
                                }
                            }
                        }
                        if (z10) {
                            obtain.setVisibleToUser(true);
                        }
                    }
                }
                return bVar;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0141, code lost:
        if (r14 < ((r15 * r15) + ((r13 * 13) * r13))) goto L_0x0143;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x014d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(int r19, android.graphics.Rect r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.l(r3)
            n.j r4 = new n.j
            r4.<init>()
            r6 = 0
        L_0x0014:
            int r7 = r3.size()
            if (r6 >= r7) goto L_0x0038
            java.lang.Object r7 = r3.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            j0.b r7 = r0.k(r7)
            java.lang.Object r8 = r3.get(r6)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r4.i(r8, r7)
            int r6 = r6 + 1
            goto L_0x0014
        L_0x0038:
            int r3 = r0.l
            r6 = 0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r7) goto L_0x0041
            r3 = r6
            goto L_0x0047
        L_0x0041:
            java.lang.Object r3 = r4.h(r3, r6)
            j0.b r3 = (j0.b) r3
        L_0x0047:
            r9 = 1
            o0.a$a r10 = f7571o
            o0.a$b r11 = f7572p
            android.view.View r12 = r0.f7577i
            r13 = 2
            if (r1 == r9) goto L_0x0155
            if (r1 == r13) goto L_0x0155
            r13 = 130(0x82, float:1.82E-43)
            r14 = 66
            r15 = 33
            r6 = 17
            if (r1 == r6) goto L_0x006c
            if (r1 == r15) goto L_0x006c
            if (r1 == r14) goto L_0x006c
            if (r1 != r13) goto L_0x0064
            goto L_0x006c
        L_0x0064:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L_0x006c:
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            int r5 = r0.l
            java.lang.String r8 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            if (r5 == r7) goto L_0x007f
            j0.b r2 = r0.n(r5)
            r2.d(r9)
            goto L_0x00b0
        L_0x007f:
            if (r2 == 0) goto L_0x0085
            r9.set(r2)
            goto L_0x00b0
        L_0x0085:
            int r2 = r12.getWidth()
            int r5 = r12.getHeight()
            if (r1 == r6) goto L_0x00ac
            if (r1 == r15) goto L_0x00a7
            if (r1 == r14) goto L_0x00a1
            if (r1 != r13) goto L_0x009b
            r5 = 0
            r12 = -1
            r9.set(r5, r12, r2, r12)
            goto L_0x00b0
        L_0x009b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r8)
            throw r1
        L_0x00a1:
            r2 = 0
            r12 = -1
            r9.set(r12, r2, r12, r5)
            goto L_0x00b0
        L_0x00a7:
            r12 = 0
            r9.set(r12, r5, r2, r5)
            goto L_0x00b0
        L_0x00ac:
            r12 = 0
            r9.set(r2, r12, r2, r5)
        L_0x00b0:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r9)
            if (r1 == r6) goto L_0x00df
            if (r1 == r15) goto L_0x00d4
            if (r1 == r14) goto L_0x00cb
            if (r1 != r13) goto L_0x00c5
            int r5 = r9.height()
            r6 = 1
            int r5 = r5 + r6
            int r5 = -r5
            goto L_0x00da
        L_0x00c5:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r8)
            throw r1
        L_0x00cb:
            r6 = 1
            int r5 = r9.width()
            int r5 = r5 + r6
            int r5 = -r5
            r8 = 0
            goto L_0x00e6
        L_0x00d4:
            r6 = 1
            int r5 = r9.height()
            int r5 = r5 + r6
        L_0x00da:
            r8 = 0
            r2.offset(r8, r5)
            goto L_0x00e9
        L_0x00df:
            r6 = 1
            r8 = 0
            int r5 = r9.width()
            int r5 = r5 + r6
        L_0x00e6:
            r2.offset(r5, r8)
        L_0x00e9:
            r11.getClass()
            int r5 = r4.j()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r11 = r8
            r16 = 0
        L_0x00f8:
            if (r11 >= r5) goto L_0x0150
            java.lang.Object r12 = r4.k(r11)
            j0.b r12 = (j0.b) r12
            if (r12 != r3) goto L_0x0103
            goto L_0x014d
        L_0x0103:
            r10.getClass()
            r12.d(r6)
            boolean r13 = o0.b.c(r1, r9, r6)
            if (r13 != 0) goto L_0x0110
            goto L_0x0145
        L_0x0110:
            boolean r13 = o0.b.c(r1, r9, r2)
            if (r13 != 0) goto L_0x0117
            goto L_0x0143
        L_0x0117:
            boolean r13 = o0.b.a(r1, r9, r6, r2)
            if (r13 == 0) goto L_0x011e
            goto L_0x0143
        L_0x011e:
            boolean r13 = o0.b.a(r1, r9, r2, r6)
            if (r13 == 0) goto L_0x0125
            goto L_0x0145
        L_0x0125:
            int r13 = o0.b.d(r1, r9, r6)
            int r14 = o0.b.e(r1, r9, r6)
            int r15 = r13 * 13
            int r15 = r15 * r13
            int r14 = r14 * r14
            int r14 = r14 + r15
            int r13 = o0.b.d(r1, r9, r2)
            int r15 = o0.b.e(r1, r9, r2)
            int r17 = r13 * 13
            int r17 = r17 * r13
            int r15 = r15 * r15
            int r15 = r15 + r17
            if (r14 >= r15) goto L_0x0145
        L_0x0143:
            r13 = 1
            goto L_0x0146
        L_0x0145:
            r13 = r8
        L_0x0146:
            if (r13 == 0) goto L_0x014d
            r2.set(r6)
            r16 = r12
        L_0x014d:
            int r11 = r11 + 1
            goto L_0x00f8
        L_0x0150:
            r1 = r16
            r2 = -1
            goto L_0x01c5
        L_0x0155:
            r8 = 0
            java.util.WeakHashMap<android.view.View, i0.b0> r2 = i0.w.f6004a
            int r2 = i0.w.e.d(r12)
            r5 = 1
            if (r2 != r5) goto L_0x0161
            r5 = 1
            goto L_0x0162
        L_0x0161:
            r5 = r8
        L_0x0162:
            r11.getClass()
            int r2 = r4.j()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r2)
            r9 = r8
        L_0x016f:
            if (r9 >= r2) goto L_0x017d
            java.lang.Object r11 = r4.k(r9)
            j0.b r11 = (j0.b) r11
            r6.add(r11)
            int r9 = r9 + 1
            goto L_0x016f
        L_0x017d:
            o0.b$b r2 = new o0.b$b
            r2.<init>(r5, r10)
            java.util.Collections.sort(r6, r2)
            r2 = 1
            if (r1 == r2) goto L_0x01aa
            if (r1 != r13) goto L_0x01a2
            int r1 = r6.size()
            if (r3 != 0) goto L_0x0192
            r12 = -1
            goto L_0x0196
        L_0x0192:
            int r12 = r6.lastIndexOf(r3)
        L_0x0196:
            int r12 = r12 + r2
            if (r12 >= r1) goto L_0x019f
            java.lang.Object r1 = r6.get(r12)
            r6 = r1
            goto L_0x01a0
        L_0x019f:
            r6 = 0
        L_0x01a0:
            r2 = -1
            goto L_0x01bf
        L_0x01a2:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r1.<init>(r2)
            throw r1
        L_0x01aa:
            int r1 = r6.size()
            if (r3 != 0) goto L_0x01b1
            goto L_0x01b5
        L_0x01b1:
            int r1 = r6.indexOf(r3)
        L_0x01b5:
            r2 = -1
            int r1 = r1 + r2
            if (r1 < 0) goto L_0x01be
            java.lang.Object r6 = r6.get(r1)
            goto L_0x01bf
        L_0x01be:
            r6 = 0
        L_0x01bf:
            r16 = r6
            j0.b r16 = (j0.b) r16
            r1 = r16
        L_0x01c5:
            if (r1 != 0) goto L_0x01c8
            goto L_0x01eb
        L_0x01c8:
            boolean r3 = r4.f7335o
            if (r3 == 0) goto L_0x01cf
            r4.e()
        L_0x01cf:
            r5 = r8
        L_0x01d0:
            int r3 = r4.f7338r
            if (r5 >= r3) goto L_0x01df
            java.lang.Object[] r3 = r4.f7337q
            r3 = r3[r5]
            if (r3 != r1) goto L_0x01dc
            r8 = r5
            goto L_0x01e0
        L_0x01dc:
            int r5 = r5 + 1
            goto L_0x01d0
        L_0x01df:
            r8 = r2
        L_0x01e0:
            boolean r1 = r4.f7335o
            if (r1 == 0) goto L_0x01e7
            r4.e()
        L_0x01e7:
            int[] r1 = r4.f7336p
            r7 = r1[r8]
        L_0x01eb:
            boolean r1 = r0.s(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.a.m(int, android.graphics.Rect):boolean");
    }

    public final j0.b n(int i10) {
        if (i10 != -1) {
            return k(i10);
        }
        View view = this.f7577i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
        j0.b bVar = new j0.b(obtain);
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                bVar.f6386a.addChild(view, ((Integer) arrayList.get(i11)).intValue());
            }
            return bVar;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public abstract boolean o(int i10, int i11);

    public void p(j0.b bVar) {
    }

    public abstract void q(int i10, j0.b bVar);

    public void r(int i10, boolean z) {
    }

    public final boolean s(int i10) {
        int i11;
        View view = this.f7577i;
        if ((!view.isFocused() && !view.requestFocus()) || (i11 = this.l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            j(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i10;
        r(i10, true);
        t(i10, 8);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = r5.f7577i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(int r6, int r7) {
        /*
            r5 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r0) goto L_0x008b
            android.view.accessibility.AccessibilityManager r0 = r5.f7576h
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L_0x000e
            goto L_0x008b
        L_0x000e:
            android.view.View r0 = r5.f7577i
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != 0) goto L_0x0017
            return
        L_0x0017:
            r2 = -1
            if (r6 == r2) goto L_0x0081
            android.view.accessibility.AccessibilityEvent r7 = android.view.accessibility.AccessibilityEvent.obtain(r7)
            j0.b r2 = r5.n(r6)
            java.util.List r3 = r7.getText()
            java.lang.CharSequence r4 = r2.e()
            r3.add(r4)
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.f6386a
            java.lang.CharSequence r3 = r2.getContentDescription()
            r7.setContentDescription(r3)
            boolean r3 = r2.isScrollable()
            r7.setScrollable(r3)
            boolean r3 = r2.isPassword()
            r7.setPassword(r3)
            boolean r3 = r2.isEnabled()
            r7.setEnabled(r3)
            boolean r3 = r2.isChecked()
            r7.setChecked(r3)
            java.util.List r3 = r7.getText()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x006b
            java.lang.CharSequence r3 = r7.getContentDescription()
            if (r3 == 0) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "Callbacks must add text or a content description in populateEventForVirtualViewId()"
            r6.<init>(r7)
            throw r6
        L_0x006b:
            java.lang.CharSequence r2 = r2.getClassName()
            r7.setClassName(r2)
            r7.setSource(r0, r6)
            android.content.Context r6 = r0.getContext()
            java.lang.String r6 = r6.getPackageName()
            r7.setPackageName(r6)
            goto L_0x0088
        L_0x0081:
            android.view.accessibility.AccessibilityEvent r7 = android.view.accessibility.AccessibilityEvent.obtain(r7)
            r0.onInitializeAccessibilityEvent(r7)
        L_0x0088:
            r1.requestSendAccessibilityEvent(r0, r7)
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.a.t(int, int):void");
    }

    public final void u(int i10) {
        int i11 = this.f7580m;
        if (i11 != i10) {
            this.f7580m = i10;
            t(i10, 128);
            t(i11, 256);
        }
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.karumi.dexter.R;
import i0.w;

public class o0 extends ViewGroup {
    public int A;
    public int B;
    public int C;

    /* renamed from: o  reason: collision with root package name */
    public boolean f669o;

    /* renamed from: p  reason: collision with root package name */
    public int f670p;

    /* renamed from: q  reason: collision with root package name */
    public int f671q;

    /* renamed from: r  reason: collision with root package name */
    public int f672r;

    /* renamed from: s  reason: collision with root package name */
    public int f673s;

    /* renamed from: t  reason: collision with root package name */
    public int f674t;
    public float u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f675v;
    public int[] w;

    /* renamed from: x  reason: collision with root package name */
    public int[] f676x;

    /* renamed from: y  reason: collision with root package name */
    public Drawable f677y;
    public int z;

    public static class a extends LinearLayout.LayoutParams {
        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public o0(Context context) {
        this(context, (AttributeSet) null);
    }

    public o0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public o0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Drawable drawable;
        int resourceId;
        this.f669o = true;
        this.f670p = -1;
        this.f671q = 0;
        this.f673s = 8388659;
        int[] iArr = androidx.databinding.a.M;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        w.j(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        int i11 = obtainStyledAttributes.getInt(1, -1);
        if (i11 >= 0) {
            setOrientation(i11);
        }
        int i12 = obtainStyledAttributes.getInt(0, -1);
        if (i12 >= 0) {
            setGravity(i12);
        }
        boolean z10 = obtainStyledAttributes.getBoolean(2, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.u = obtainStyledAttributes.getFloat(4, -1.0f);
        this.f670p = obtainStyledAttributes.getInt(3, -1);
        this.f675v = obtainStyledAttributes.getBoolean(7, false);
        if (!obtainStyledAttributes.hasValue(5) || (resourceId = obtainStyledAttributes.getResourceId(5, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(5);
        } else {
            drawable = f.a.b(context, resourceId);
        }
        setDividerDrawable(drawable);
        this.B = obtainStyledAttributes.getInt(8, 0);
        this.C = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void d(Canvas canvas, int i10) {
        this.f677y.setBounds(getPaddingLeft() + this.C, i10, (getWidth() - getPaddingRight()) - this.C, this.A + i10);
        this.f677y.draw(canvas);
    }

    public final void e(Canvas canvas, int i10) {
        this.f677y.setBounds(i10, getPaddingTop() + this.C, this.z + i10, (getHeight() - getPaddingBottom()) - this.C);
        this.f677y.draw(canvas);
    }

    /* renamed from: f */
    public a generateDefaultLayoutParams() {
        int i10 = this.f672r;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    /* renamed from: g */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public int getBaseline() {
        int i10;
        if (this.f670p < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f670p;
        if (childCount > i11) {
            View childAt = getChildAt(i11);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i12 = this.f671q;
                if (this.f672r == 1 && (i10 = this.f673s & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != 48) {
                    if (i10 == 16) {
                        i12 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f674t) / 2;
                    } else if (i10 == 80) {
                        i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f674t;
                    }
                }
                return i12 + ((a) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f670p == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f670p;
    }

    public Drawable getDividerDrawable() {
        return this.f677y;
    }

    public int getDividerPadding() {
        return this.C;
    }

    public int getDividerWidth() {
        return this.z;
    }

    public int getGravity() {
        return this.f673s;
    }

    public int getOrientation() {
        return this.f672r;
    }

    public int getShowDividers() {
        return this.B;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.u;
    }

    /* renamed from: h */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public final boolean i(int i10) {
        if (i10 == 0) {
            return (this.B & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.B & 4) != 0;
        }
        if ((this.B & 2) == 0) {
            return false;
        }
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (getChildAt(i11).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (this.f677y != null) {
            int i15 = 0;
            if (this.f672r == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i15 < virtualChildCount) {
                    View childAt = getChildAt(i15);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !i(i15))) {
                        d(canvas, (childAt.getTop() - ((a) childAt.getLayoutParams()).topMargin) - this.A);
                    }
                    i15++;
                }
                if (i(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        i14 = (getHeight() - getPaddingBottom()) - this.A;
                    } else {
                        i14 = childAt2.getBottom() + ((a) childAt2.getLayoutParams()).bottomMargin;
                    }
                    d(canvas, i14);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean a10 = m1.a(this);
            while (i15 < virtualChildCount2) {
                View childAt3 = getChildAt(i15);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !i(i15))) {
                    a aVar = (a) childAt3.getLayoutParams();
                    if (a10) {
                        i13 = childAt3.getRight() + aVar.rightMargin;
                    } else {
                        i13 = (childAt3.getLeft() - aVar.leftMargin) - this.z;
                    }
                    e(canvas, i13);
                }
                i15++;
            }
            if (i(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    a aVar2 = (a) childAt4.getLayoutParams();
                    if (a10) {
                        i12 = childAt4.getLeft();
                        i11 = aVar2.leftMargin;
                    } else {
                        i10 = childAt4.getRight() + aVar2.rightMargin;
                        e(canvas, i10);
                    }
                } else if (a10) {
                    i10 = getPaddingLeft();
                    e(canvas, i10);
                } else {
                    i12 = getWidth();
                    i11 = getPaddingRight();
                }
                i10 = (i12 - i11) - this.z;
                e(canvas, i10);
            }
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r26, int r27, int r28, int r29, int r30) {
        /*
            r25 = this;
            r0 = r25
            int r1 = r0.f672r
            r2 = 80
            r3 = 16
            r4 = 8
            r5 = 5
            r6 = 8388615(0x800007, float:1.1754953E-38)
            r7 = 2
            r9 = 1
            if (r1 != r9) goto L_0x00b9
            int r1 = r25.getPaddingLeft()
            int r10 = r29 - r27
            int r11 = r25.getPaddingRight()
            int r11 = r10 - r11
            int r10 = r10 - r1
            int r12 = r25.getPaddingRight()
            int r10 = r10 - r12
            int r12 = r25.getVirtualChildCount()
            int r13 = r0.f673s
            r14 = r13 & 112(0x70, float:1.57E-43)
            r6 = r6 & r13
            if (r14 == r3) goto L_0x0042
            if (r14 == r2) goto L_0x0036
            int r2 = r25.getPaddingTop()
            goto L_0x004d
        L_0x0036:
            int r2 = r25.getPaddingTop()
            int r2 = r2 + r30
            int r2 = r2 - r28
            int r3 = r0.f674t
            int r2 = r2 - r3
            goto L_0x004d
        L_0x0042:
            int r2 = r25.getPaddingTop()
            int r3 = r30 - r28
            int r13 = r0.f674t
            int r3 = r3 - r13
            int r3 = r3 / r7
            int r2 = r2 + r3
        L_0x004d:
            r3 = 0
        L_0x004e:
            if (r3 >= r12) goto L_0x01d1
            android.view.View r13 = r0.getChildAt(r3)
            if (r13 != 0) goto L_0x0059
            int r2 = r2 + 0
            goto L_0x00b3
        L_0x0059:
            int r14 = r13.getVisibility()
            if (r14 == r4) goto L_0x00b3
            int r14 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r16 = r13.getLayoutParams()
            r4 = r16
            androidx.appcompat.widget.o0$a r4 = (androidx.appcompat.widget.o0.a) r4
            int r8 = r4.gravity
            if (r8 >= 0) goto L_0x0074
            r8 = r6
        L_0x0074:
            java.util.WeakHashMap<android.view.View, i0.b0> r17 = i0.w.f6004a
            int r7 = i0.w.e.d(r25)
            int r7 = android.view.Gravity.getAbsoluteGravity(r8, r7)
            r7 = r7 & 7
            if (r7 == r9) goto L_0x008b
            if (r7 == r5) goto L_0x0088
            int r7 = r4.leftMargin
            int r7 = r7 + r1
            goto L_0x0096
        L_0x0088:
            int r7 = r11 - r14
            goto L_0x0093
        L_0x008b:
            int r7 = r10 - r14
            r8 = 2
            int r7 = r7 / r8
            int r7 = r7 + r1
            int r8 = r4.leftMargin
            int r7 = r7 + r8
        L_0x0093:
            int r8 = r4.rightMargin
            int r7 = r7 - r8
        L_0x0096:
            boolean r8 = r0.i(r3)
            if (r8 == 0) goto L_0x009f
            int r8 = r0.A
            int r2 = r2 + r8
        L_0x009f:
            int r8 = r4.topMargin
            int r2 = r2 + r8
            int r8 = r2 + 0
            int r14 = r14 + r7
            int r5 = r15 + r8
            r13.layout(r7, r8, r14, r5)
            int r4 = r4.bottomMargin
            int r15 = r15 + r4
            r4 = 0
            int r15 = r15 + r4
            int r15 = r15 + r2
            int r3 = r3 + 0
            r2 = r15
        L_0x00b3:
            int r3 = r3 + r9
            r4 = 8
            r5 = 5
            r7 = 2
            goto L_0x004e
        L_0x00b9:
            boolean r1 = androidx.appcompat.widget.m1.a(r25)
            int r4 = r25.getPaddingTop()
            int r5 = r30 - r28
            int r7 = r25.getPaddingBottom()
            int r7 = r5 - r7
            int r5 = r5 - r4
            int r8 = r25.getPaddingBottom()
            int r5 = r5 - r8
            int r8 = r25.getVirtualChildCount()
            int r10 = r0.f673s
            r6 = r6 & r10
            r10 = r10 & 112(0x70, float:1.57E-43)
            boolean r11 = r0.f669o
            int[] r12 = r0.w
            int[] r13 = r0.f676x
            java.util.WeakHashMap<android.view.View, i0.b0> r14 = i0.w.f6004a
            int r14 = i0.w.e.d(r25)
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r14)
            if (r6 == r9) goto L_0x00fe
            r14 = 5
            if (r6 == r14) goto L_0x00f2
            int r6 = r25.getPaddingLeft()
            goto L_0x010a
        L_0x00f2:
            int r6 = r25.getPaddingLeft()
            int r6 = r6 + r29
            int r6 = r6 - r27
            int r14 = r0.f674t
            int r6 = r6 - r14
            goto L_0x010a
        L_0x00fe:
            int r6 = r25.getPaddingLeft()
            int r14 = r29 - r27
            int r15 = r0.f674t
            int r14 = r14 - r15
            r15 = 2
            int r14 = r14 / r15
            int r6 = r6 + r14
        L_0x010a:
            if (r1 == 0) goto L_0x0110
            int r1 = r8 + -1
            r15 = -1
            goto L_0x0112
        L_0x0110:
            r15 = r9
            r1 = 0
        L_0x0112:
            r18 = r6
            r6 = 0
        L_0x0115:
            if (r6 >= r8) goto L_0x01d1
            int r19 = r15 * r6
            int r9 = r19 + r1
            android.view.View r2 = r0.getChildAt(r9)
            if (r2 != 0) goto L_0x012d
            int r18 = r18 + 0
        L_0x0123:
            r28 = r1
            r30 = r8
            r22 = r10
            r1 = 0
        L_0x012a:
            r2 = 1
            goto L_0x01c3
        L_0x012d:
            int r3 = r2.getVisibility()
            r14 = 8
            if (r3 == r14) goto L_0x0123
            int r3 = r2.getMeasuredWidth()
            int r21 = r2.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r22 = r2.getLayoutParams()
            r14 = r22
            androidx.appcompat.widget.o0$a r14 = (androidx.appcompat.widget.o0.a) r14
            r28 = r1
            if (r11 == 0) goto L_0x0155
            int r1 = r14.height
            r30 = r8
            r8 = -1
            if (r1 == r8) goto L_0x0157
            int r8 = r2.getBaseline()
            goto L_0x0158
        L_0x0155:
            r30 = r8
        L_0x0157:
            r8 = -1
        L_0x0158:
            int r1 = r14.gravity
            if (r1 >= 0) goto L_0x015d
            r1 = r10
        L_0x015d:
            r1 = r1 & 112(0x70, float:1.57E-43)
            r22 = r10
            r10 = 16
            if (r1 == r10) goto L_0x0195
            r10 = 48
            if (r1 == r10) goto L_0x0186
            r10 = 80
            if (r1 == r10) goto L_0x0170
            r1 = r4
            r10 = -1
            goto L_0x01a1
        L_0x0170:
            int r1 = r7 - r21
            int r10 = r14.bottomMargin
            int r1 = r1 - r10
            r10 = -1
            if (r8 == r10) goto L_0x01a1
            int r23 = r2.getMeasuredHeight()
            int r23 = r23 - r8
            r8 = 2
            r24 = r13[r8]
            int r24 = r24 - r23
            int r1 = r1 - r24
            goto L_0x01a1
        L_0x0186:
            r10 = -1
            int r1 = r14.topMargin
            int r1 = r1 + r4
            if (r8 == r10) goto L_0x01a1
            r20 = 1
            r23 = r12[r20]
            int r23 = r23 - r8
            int r1 = r23 + r1
            goto L_0x01a1
        L_0x0195:
            r10 = -1
            int r1 = r5 - r21
            r8 = 2
            int r1 = r1 / r8
            int r1 = r1 + r4
            int r8 = r14.topMargin
            int r1 = r1 + r8
            int r8 = r14.bottomMargin
            int r1 = r1 - r8
        L_0x01a1:
            boolean r8 = r0.i(r9)
            if (r8 == 0) goto L_0x01ab
            int r8 = r0.z
            int r18 = r18 + r8
        L_0x01ab:
            int r8 = r14.leftMargin
            int r18 = r18 + r8
            int r8 = r18 + 0
            int r9 = r3 + r8
            int r10 = r21 + r1
            r2.layout(r8, r1, r9, r10)
            int r1 = r14.rightMargin
            int r3 = r3 + r1
            r1 = 0
            int r3 = r3 + r1
            int r18 = r3 + r18
            int r6 = r6 + 0
            goto L_0x012a
        L_0x01c3:
            int r6 = r6 + r2
            r1 = r28
            r8 = r30
            r9 = r2
            r10 = r22
            r2 = 80
            r3 = 16
            goto L_0x0115
        L_0x01d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02b0, code lost:
        if (r13 < 0) goto L_0x02b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0492  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0497  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04c4  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04da  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x04ee  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x04fd  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0502  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x051e  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0554  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0557  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x055f  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x056d  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0603  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x06bf  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x06db  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x07c2  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x07e6  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x082a  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0834  */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x088e  */
    /* JADX WARNING: Removed duplicated region for block: B:420:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r39, int r40) {
        /*
            r38 = this;
            r6 = r38
            r7 = r39
            r8 = r40
            int r0 = r6.f672r
            r10 = -2
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 8
            r14 = 1073741824(0x40000000, float:2.0)
            r15 = 0
            r5 = 0
            r4 = 1
            if (r0 != r4) goto L_0x038c
            r6.f674t = r5
            int r3 = r38.getVirtualChildCount()
            int r2 = android.view.View.MeasureSpec.getMode(r39)
            int r1 = android.view.View.MeasureSpec.getMode(r40)
            int r0 = r6.f670p
            boolean r9 = r6.f675v
            r24 = r4
            r13 = r5
            r17 = r13
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r23 = r21
            r25 = r23
            r22 = r15
        L_0x0039:
            if (r13 >= r3) goto L_0x0179
            android.view.View r26 = r6.getChildAt(r13)
            if (r26 != 0) goto L_0x0047
            int r4 = r6.f674t
            int r4 = r4 + r5
            r6.f674t = r4
            goto L_0x004f
        L_0x0047:
            int r4 = r26.getVisibility()
            if (r4 != r12) goto L_0x005b
            int r13 = r13 + 0
        L_0x004f:
            r10 = r0
            r29 = r1
            r0 = r2
            r31 = r3
            r12 = r18
            r27 = 1
            goto L_0x0162
        L_0x005b:
            boolean r4 = r6.i(r13)
            if (r4 == 0) goto L_0x0068
            int r4 = r6.f674t
            int r5 = r6.A
            int r4 = r4 + r5
            r6.f674t = r4
        L_0x0068:
            android.view.ViewGroup$LayoutParams r4 = r26.getLayoutParams()
            r5 = r4
            androidx.appcompat.widget.o0$a r5 = (androidx.appcompat.widget.o0.a) r5
            float r4 = r5.weight
            float r22 = r22 + r4
            if (r1 != r14) goto L_0x0097
            int r12 = r5.height
            if (r12 != 0) goto L_0x0097
            int r12 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r12 <= 0) goto L_0x0097
            int r4 = r6.f674t
            int r12 = r5.topMargin
            int r12 = r12 + r4
            int r14 = r5.bottomMargin
            int r12 = r12 + r14
            int r4 = java.lang.Math.max(r4, r12)
            r6.f674t = r4
            r10 = r0
            r29 = r1
            r30 = r2
            r31 = r3
            r15 = r5
            r4 = 1
            r27 = 1
            goto L_0x00e8
        L_0x0097:
            int r12 = r5.height
            if (r12 != 0) goto L_0x00a3
            int r4 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r4 <= 0) goto L_0x00a3
            r5.height = r10
            r12 = 0
            goto L_0x00a4
        L_0x00a3:
            r12 = r11
        L_0x00a4:
            r4 = 0
            int r14 = (r22 > r15 ? 1 : (r22 == r15 ? 0 : -1))
            if (r14 != 0) goto L_0x00ac
            int r14 = r6.f674t
            goto L_0x00ad
        L_0x00ac:
            r14 = 0
        L_0x00ad:
            r10 = r0
            r0 = r38
            r29 = r1
            r1 = r26
            r30 = r2
            r2 = r39
            r31 = r3
            r3 = r4
            r27 = 1
            r4 = r40
            r15 = r5
            r5 = r14
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            if (r12 == r11) goto L_0x00c8
            r15.height = r12
        L_0x00c8:
            int r0 = r26.getMeasuredHeight()
            int r1 = r6.f674t
            int r2 = r1 + r0
            int r3 = r15.topMargin
            int r2 = r2 + r3
            int r3 = r15.bottomMargin
            int r2 = r2 + r3
            r3 = 0
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r6.f674t = r1
            r5 = r19
            if (r9 == 0) goto L_0x00e6
            int r19 = java.lang.Math.max(r0, r5)
        L_0x00e6:
            r4 = r23
        L_0x00e8:
            if (r10 < 0) goto L_0x00f2
            int r0 = r13 + 1
            if (r10 != r0) goto L_0x00f2
            int r0 = r6.f674t
            r6.f671q = r0
        L_0x00f2:
            if (r13 >= r10) goto L_0x0104
            float r0 = r15.weight
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00fc
            goto L_0x0104
        L_0x00fc:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0104:
            r0 = r30
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x0114
            int r1 = r15.width
            r2 = -1
            if (r1 != r2) goto L_0x0114
            r5 = r27
            r25 = r5
            goto L_0x0115
        L_0x0114:
            r5 = 0
        L_0x0115:
            int r1 = r15.leftMargin
            int r2 = r15.rightMargin
            int r1 = r1 + r2
            int r2 = r26.getMeasuredWidth()
            int r2 = r2 + r1
            r3 = r21
            int r3 = java.lang.Math.max(r3, r2)
            int r12 = r26.getMeasuredState()
            r14 = r18
            int r12 = android.view.View.combineMeasuredStates(r14, r12)
            if (r24 == 0) goto L_0x0139
            int r14 = r15.width
            r11 = -1
            if (r14 != r11) goto L_0x0139
            r11 = r27
            goto L_0x013a
        L_0x0139:
            r11 = 0
        L_0x013a:
            float r14 = r15.weight
            r15 = 0
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 <= 0) goto L_0x014c
            if (r5 == 0) goto L_0x0144
            goto L_0x0145
        L_0x0144:
            r1 = r2
        L_0x0145:
            r15 = r20
            int r20 = java.lang.Math.max(r15, r1)
            goto L_0x015a
        L_0x014c:
            r15 = r20
            if (r5 == 0) goto L_0x0151
            goto L_0x0152
        L_0x0151:
            r1 = r2
        L_0x0152:
            r2 = r17
            int r17 = java.lang.Math.max(r2, r1)
            r20 = r15
        L_0x015a:
            int r13 = r13 + 0
            r21 = r3
            r23 = r4
            r24 = r11
        L_0x0162:
            int r13 = r13 + 1
            r2 = r0
            r0 = r10
            r18 = r12
            r4 = r27
            r1 = r29
            r3 = r31
            r5 = 0
            r10 = -2
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 8
            r14 = 1073741824(0x40000000, float:2.0)
            r15 = 0
            goto L_0x0039
        L_0x0179:
            r29 = r1
            r0 = r2
            r31 = r3
            r27 = r4
            r2 = r17
            r14 = r18
            r5 = r19
            r15 = r20
            r3 = r21
            int r1 = r6.f674t
            r10 = r31
            if (r1 <= 0) goto L_0x019d
            boolean r1 = r6.i(r10)
            if (r1 == 0) goto L_0x019d
            int r1 = r6.f674t
            int r4 = r6.A
            int r1 = r1 + r4
            r6.f674t = r1
        L_0x019d:
            r1 = r29
            if (r9 == 0) goto L_0x01e3
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r4) goto L_0x01a7
            if (r1 != 0) goto L_0x01e3
        L_0x01a7:
            r4 = 0
            r6.f674t = r4
            r11 = r4
        L_0x01ab:
            if (r11 >= r10) goto L_0x01e3
            android.view.View r12 = r6.getChildAt(r11)
            if (r12 != 0) goto L_0x01b9
            int r12 = r6.f674t
            int r12 = r12 + r4
            r6.f674t = r12
            goto L_0x01df
        L_0x01b9:
            int r4 = r12.getVisibility()
            r13 = 8
            if (r4 != r13) goto L_0x01c4
            int r11 = r11 + 0
            goto L_0x01df
        L_0x01c4:
            android.view.ViewGroup$LayoutParams r4 = r12.getLayoutParams()
            androidx.appcompat.widget.o0$a r4 = (androidx.appcompat.widget.o0.a) r4
            int r12 = r6.f674t
            int r19 = r12 + r5
            int r13 = r4.topMargin
            int r19 = r19 + r13
            int r4 = r4.bottomMargin
            int r19 = r19 + r4
            r4 = 0
            int r13 = r19 + 0
            int r4 = java.lang.Math.max(r12, r13)
            r6.f674t = r4
        L_0x01df:
            int r11 = r11 + 1
            r4 = 0
            goto L_0x01ab
        L_0x01e3:
            int r4 = r6.f674t
            int r11 = r38.getPaddingTop()
            int r12 = r38.getPaddingBottom()
            int r12 = r12 + r11
            int r12 = r12 + r4
            r6.f674t = r12
            int r4 = r38.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r12, r4)
            r11 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r8, r11)
            r11 = 16777215(0xffffff, float:2.3509886E-38)
            r11 = r11 & r4
            int r12 = r6.f674t
            int r11 = r11 - r12
            if (r23 != 0) goto L_0x0250
            if (r11 == 0) goto L_0x020f
            r12 = 0
            int r13 = (r22 > r12 ? 1 : (r22 == r12 ? 0 : -1))
            if (r13 <= 0) goto L_0x020f
            goto L_0x0250
        L_0x020f:
            int r2 = java.lang.Math.max(r2, r15)
            if (r9 == 0) goto L_0x024c
            r9 = 1073741824(0x40000000, float:2.0)
            if (r1 == r9) goto L_0x024c
            r1 = 0
        L_0x021a:
            if (r1 >= r10) goto L_0x024c
            android.view.View r9 = r6.getChildAt(r1)
            if (r9 == 0) goto L_0x0249
            int r11 = r9.getVisibility()
            r12 = 8
            if (r11 != r12) goto L_0x022b
            goto L_0x0249
        L_0x022b:
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            androidx.appcompat.widget.o0$a r11 = (androidx.appcompat.widget.o0.a) r11
            float r11 = r11.weight
            r12 = 0
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x0249
            int r11 = r9.getMeasuredWidth()
            r12 = 1073741824(0x40000000, float:2.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r12)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r12)
            r9.measure(r11, r13)
        L_0x0249:
            int r1 = r1 + 1
            goto L_0x021a
        L_0x024c:
            r21 = r3
            goto L_0x032c
        L_0x0250:
            float r5 = r6.u
            r9 = 0
            int r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r12 <= 0) goto L_0x0259
            r22 = r5
        L_0x0259:
            r5 = 0
            r6.f674t = r5
            r5 = 0
        L_0x025d:
            if (r5 >= r10) goto L_0x031c
            android.view.View r9 = r6.getChildAt(r5)
            int r12 = r9.getVisibility()
            r13 = 8
            if (r12 != r13) goto L_0x026f
            r29 = r1
            goto L_0x0316
        L_0x026f:
            android.view.ViewGroup$LayoutParams r12 = r9.getLayoutParams()
            androidx.appcompat.widget.o0$a r12 = (androidx.appcompat.widget.o0.a) r12
            float r13 = r12.weight
            r15 = 0
            int r16 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r16 <= 0) goto L_0x02c8
            float r15 = (float) r11
            float r15 = r15 * r13
            float r15 = r15 / r22
            int r15 = (int) r15
            float r22 = r22 - r13
            int r11 = r11 - r15
            int r13 = r38.getPaddingLeft()
            int r16 = r38.getPaddingRight()
            int r16 = r16 + r13
            int r13 = r12.leftMargin
            int r16 = r16 + r13
            int r13 = r12.rightMargin
            int r13 = r16 + r13
            r16 = r11
            int r11 = r12.width
            int r11 = android.view.ViewGroup.getChildMeasureSpec(r7, r13, r11)
            int r13 = r12.height
            if (r13 != 0) goto L_0x02ab
            r13 = 1073741824(0x40000000, float:2.0)
            if (r1 == r13) goto L_0x02a7
            goto L_0x02ab
        L_0x02a7:
            if (r15 <= 0) goto L_0x02b2
            r13 = r15
            goto L_0x02b3
        L_0x02ab:
            int r13 = r9.getMeasuredHeight()
            int r13 = r13 + r15
            if (r13 >= 0) goto L_0x02b3
        L_0x02b2:
            r13 = 0
        L_0x02b3:
            r15 = 1073741824(0x40000000, float:2.0)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r15)
            r9.measure(r11, r13)
            int r11 = r9.getMeasuredState()
            r11 = r11 & -256(0xffffffffffffff00, float:NaN)
            int r14 = android.view.View.combineMeasuredStates(r14, r11)
            r11 = r16
        L_0x02c8:
            int r13 = r12.leftMargin
            int r15 = r12.rightMargin
            int r13 = r13 + r15
            int r15 = r9.getMeasuredWidth()
            int r15 = r15 + r13
            int r3 = java.lang.Math.max(r3, r15)
            r29 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x02e6
            int r1 = r12.width
            r16 = r3
            r3 = -1
            if (r1 != r3) goto L_0x02e9
            r1 = r27
            goto L_0x02ea
        L_0x02e6:
            r16 = r3
            r3 = -1
        L_0x02e9:
            r1 = 0
        L_0x02ea:
            if (r1 == 0) goto L_0x02ed
            goto L_0x02ee
        L_0x02ed:
            r13 = r15
        L_0x02ee:
            int r1 = java.lang.Math.max(r2, r13)
            if (r24 == 0) goto L_0x02fb
            int r2 = r12.width
            if (r2 != r3) goto L_0x02fb
            r2 = r27
            goto L_0x02fc
        L_0x02fb:
            r2 = 0
        L_0x02fc:
            int r3 = r6.f674t
            int r9 = r9.getMeasuredHeight()
            int r9 = r9 + r3
            int r13 = r12.topMargin
            int r9 = r9 + r13
            int r12 = r12.bottomMargin
            int r9 = r9 + r12
            r12 = 0
            int r9 = r9 + r12
            int r3 = java.lang.Math.max(r3, r9)
            r6.f674t = r3
            r24 = r2
            r3 = r16
            r2 = r1
        L_0x0316:
            int r5 = r5 + 1
            r1 = r29
            goto L_0x025d
        L_0x031c:
            int r1 = r6.f674t
            int r5 = r38.getPaddingTop()
            int r9 = r38.getPaddingBottom()
            int r9 = r9 + r5
            int r9 = r9 + r1
            r6.f674t = r9
            goto L_0x024c
        L_0x032c:
            if (r24 != 0) goto L_0x0333
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x0333
            goto L_0x0335
        L_0x0333:
            r2 = r21
        L_0x0335:
            int r0 = r38.getPaddingLeft()
            int r1 = r38.getPaddingRight()
            int r1 = r1 + r0
            int r1 = r1 + r2
            int r0 = r38.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r1, r0)
            int r0 = android.view.View.resolveSizeAndState(r0, r7, r14)
            r6.setMeasuredDimension(r0, r4)
            if (r25 == 0) goto L_0x08cb
            int r0 = r38.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = 0
        L_0x035b:
            if (r9 >= r10) goto L_0x08cb
            android.view.View r1 = r6.getChildAt(r9)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x0389
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            androidx.appcompat.widget.o0$a r11 = (androidx.appcompat.widget.o0.a) r11
            int r0 = r11.width
            r2 = -1
            if (r0 != r2) goto L_0x0389
            int r12 = r11.height
            int r0 = r1.getMeasuredHeight()
            r11.height = r0
            r3 = 0
            r5 = 0
            r0 = r38
            r2 = r7
            r4 = r40
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.height = r12
        L_0x0389:
            int r9 = r9 + 1
            goto L_0x035b
        L_0x038c:
            r27 = r4
            r0 = r5
            r6.f674t = r0
            int r9 = r38.getVirtualChildCount()
            int r10 = android.view.View.MeasureSpec.getMode(r39)
            int r11 = android.view.View.MeasureSpec.getMode(r40)
            int[] r0 = r6.w
            r12 = 4
            if (r0 == 0) goto L_0x03a6
            int[] r0 = r6.f676x
            if (r0 != 0) goto L_0x03ae
        L_0x03a6:
            int[] r0 = new int[r12]
            r6.w = r0
            int[] r0 = new int[r12]
            r6.f676x = r0
        L_0x03ae:
            int[] r13 = r6.w
            int[] r14 = r6.f676x
            r15 = 3
            r0 = -1
            r13[r15] = r0
            r17 = 2
            r13[r17] = r0
            r13[r27] = r0
            r1 = 0
            r13[r1] = r0
            r14[r15] = r0
            r14[r17] = r0
            r14[r27] = r0
            r14[r1] = r0
            boolean r5 = r6.f669o
            boolean r4 = r6.f675v
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 != r0) goto L_0x03d2
            r19 = r27
            goto L_0x03d4
        L_0x03d2:
            r19 = 0
        L_0x03d4:
            r20 = r27
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r12 = 0
            r15 = 0
            r22 = 0
            r23 = 0
            r32 = 0
        L_0x03e2:
            if (r3 >= r9) goto L_0x0591
            android.view.View r8 = r6.getChildAt(r3)
            if (r8 != 0) goto L_0x03f7
            int r8 = r6.f674t
            r25 = 0
            int r8 = r8 + 0
            r6.f674t = r8
            r25 = r0
            r26 = r2
            goto L_0x0405
        L_0x03f7:
            r25 = r0
            int r0 = r8.getVisibility()
            r26 = r2
            r2 = 8
            if (r0 != r2) goto L_0x040f
            int r3 = r3 + 0
        L_0x0405:
            r30 = r5
            r0 = r25
            r2 = r26
            r26 = r4
            goto L_0x0587
        L_0x040f:
            boolean r0 = r6.i(r3)
            if (r0 == 0) goto L_0x041c
            int r0 = r6.f674t
            int r2 = r6.z
            int r0 = r0 + r2
            r6.f674t = r0
        L_0x041c:
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            r2 = r0
            androidx.appcompat.widget.o0$a r2 = (androidx.appcompat.widget.o0.a) r2
            float r0 = r2.weight
            float r29 = r1 + r0
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 != r1) goto L_0x047b
            int r1 = r2.width
            if (r1 != 0) goto L_0x047b
            r1 = 0
            int r30 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r30 <= 0) goto L_0x047b
            if (r19 == 0) goto L_0x0443
            int r0 = r6.f674t
            int r1 = r2.leftMargin
            r30 = r3
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r1 = r1 + r0
            r6.f674t = r1
            goto L_0x0453
        L_0x0443:
            r30 = r3
            int r0 = r6.f674t
            int r1 = r2.leftMargin
            int r1 = r1 + r0
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r0 = java.lang.Math.max(r0, r1)
            r6.f674t = r0
        L_0x0453:
            if (r5 == 0) goto L_0x046a
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r8.measure(r1, r1)
            r1 = r2
            r34 = r25
            r35 = r26
            r25 = r30
            r26 = r4
            r30 = r5
            goto L_0x04f2
        L_0x046a:
            r1 = r2
            r34 = r25
            r35 = r26
            r25 = r30
            r0 = 1073741824(0x40000000, float:2.0)
            r26 = r4
            r30 = r5
            r4 = r27
            goto L_0x04f6
        L_0x047b:
            r30 = r3
            int r1 = r2.width
            if (r1 != 0) goto L_0x048b
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x048c
            r0 = -2
            r2.width = r0
            r3 = 0
            goto L_0x048e
        L_0x048b:
            r1 = 0
        L_0x048c:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x048e:
            int r0 = (r29 > r1 ? 1 : (r29 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0497
            int r0 = r6.f674t
            r31 = r0
            goto L_0x0499
        L_0x0497:
            r31 = 0
        L_0x0499:
            r33 = 0
            r1 = r25
            r0 = r38
            r34 = r1
            r1 = r8
            r36 = r2
            r35 = r26
            r2 = r39
            r37 = r3
            r25 = r30
            r3 = r31
            r26 = r4
            r4 = r40
            r30 = r5
            r5 = r33
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r0 = r37
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x04c4
            r1 = r36
            r1.width = r0
            goto L_0x04c6
        L_0x04c4:
            r1 = r36
        L_0x04c6:
            int r0 = r8.getMeasuredWidth()
            if (r19 == 0) goto L_0x04da
            int r2 = r6.f674t
            int r3 = r1.leftMargin
            int r3 = r3 + r0
            int r4 = r1.rightMargin
            int r3 = r3 + r4
            r4 = 0
            int r3 = r3 + r4
            int r3 = r3 + r2
            r6.f674t = r3
            goto L_0x04ec
        L_0x04da:
            r4 = 0
            int r2 = r6.f674t
            int r3 = r2 + r0
            int r5 = r1.leftMargin
            int r3 = r3 + r5
            int r5 = r1.rightMargin
            int r3 = r3 + r5
            int r3 = r3 + r4
            int r2 = java.lang.Math.max(r2, r3)
            r6.f674t = r2
        L_0x04ec:
            if (r26 == 0) goto L_0x04f2
            int r12 = java.lang.Math.max(r0, r12)
        L_0x04f2:
            r4 = r22
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x04f6:
            if (r11 == r0) goto L_0x0502
            int r0 = r1.height
            r2 = -1
            if (r0 != r2) goto L_0x0502
            r5 = r27
            r23 = r5
            goto L_0x0503
        L_0x0502:
            r5 = 0
        L_0x0503:
            int r0 = r1.topMargin
            int r2 = r1.bottomMargin
            int r0 = r0 + r2
            int r2 = r8.getMeasuredHeight()
            int r2 = r2 + r0
            int r3 = r8.getMeasuredState()
            int r3 = android.view.View.combineMeasuredStates(r15, r3)
            if (r30 == 0) goto L_0x0545
            int r8 = r8.getBaseline()
            r15 = -1
            if (r8 == r15) goto L_0x0545
            int r15 = r1.gravity
            if (r15 >= 0) goto L_0x0524
            int r15 = r6.f673s
        L_0x0524:
            r15 = r15 & 112(0x70, float:1.57E-43)
            r22 = 4
            int r15 = r15 >> 4
            r22 = -2
            r15 = r15 & -2
            int r15 = r15 >> 1
            r22 = r0
            r0 = r13[r15]
            int r0 = java.lang.Math.max(r0, r8)
            r13[r15] = r0
            r0 = r14[r15]
            int r8 = r2 - r8
            int r0 = java.lang.Math.max(r0, r8)
            r14[r15] = r0
            goto L_0x0547
        L_0x0545:
            r22 = r0
        L_0x0547:
            r0 = r32
            int r0 = java.lang.Math.max(r0, r2)
            if (r20 == 0) goto L_0x0557
            int r8 = r1.height
            r15 = -1
            if (r8 != r15) goto L_0x0557
            r8 = r27
            goto L_0x0558
        L_0x0557:
            r8 = 0
        L_0x0558:
            float r1 = r1.weight
            r15 = 0
            int r1 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r1 <= 0) goto L_0x056d
            if (r5 == 0) goto L_0x0563
            r2 = r22
        L_0x0563:
            r1 = r35
            int r2 = java.lang.Math.max(r1, r2)
            r1 = r2
            r2 = r34
            goto L_0x0579
        L_0x056d:
            r1 = r35
            if (r5 == 0) goto L_0x0573
            r2 = r22
        L_0x0573:
            r5 = r34
            int r2 = java.lang.Math.max(r5, r2)
        L_0x0579:
            int r5 = r25 + 0
            r32 = r0
            r0 = r2
            r15 = r3
            r22 = r4
            r3 = r5
            r20 = r8
            r2 = r1
            r1 = r29
        L_0x0587:
            int r3 = r3 + 1
            r8 = r40
            r4 = r26
            r5 = r30
            goto L_0x03e2
        L_0x0591:
            r26 = r4
            r30 = r5
            r5 = r0
            r0 = r32
            int r3 = r6.f674t
            if (r3 <= 0) goto L_0x05a9
            boolean r3 = r6.i(r9)
            if (r3 == 0) goto L_0x05a9
            int r3 = r6.f674t
            int r4 = r6.z
            int r3 = r3 + r4
            r6.f674t = r3
        L_0x05a9:
            r3 = r13[r27]
            r4 = -1
            r25 = r15
            if (r3 != r4) goto L_0x05c4
            r8 = 0
            r15 = r13[r8]
            if (r15 != r4) goto L_0x05c4
            r8 = r13[r17]
            if (r8 != r4) goto L_0x05c4
            r8 = 3
            r15 = r13[r8]
            if (r15 == r4) goto L_0x05bf
            goto L_0x05c5
        L_0x05bf:
            r32 = r0
            r29 = r11
            goto L_0x05f5
        L_0x05c4:
            r8 = 3
        L_0x05c5:
            r4 = r13[r8]
            r15 = 0
            r8 = r13[r15]
            r15 = r13[r17]
            int r3 = java.lang.Math.max(r3, r15)
            int r3 = java.lang.Math.max(r8, r3)
            int r3 = java.lang.Math.max(r4, r3)
            r4 = 3
            r8 = r14[r4]
            r4 = 0
            r15 = r14[r4]
            r4 = r14[r27]
            r29 = r11
            r11 = r14[r17]
            int r4 = java.lang.Math.max(r4, r11)
            int r4 = java.lang.Math.max(r15, r4)
            int r4 = java.lang.Math.max(r8, r4)
            int r4 = r4 + r3
            int r32 = java.lang.Math.max(r0, r4)
        L_0x05f5:
            if (r26 == 0) goto L_0x0646
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r0) goto L_0x05fd
            if (r10 != 0) goto L_0x0646
        L_0x05fd:
            r0 = 0
            r6.f674t = r0
            r3 = r0
        L_0x0601:
            if (r3 >= r9) goto L_0x0646
            android.view.View r4 = r6.getChildAt(r3)
            if (r4 != 0) goto L_0x060f
            int r4 = r6.f674t
            int r4 = r4 + r0
            r6.f674t = r4
            goto L_0x0642
        L_0x060f:
            int r0 = r4.getVisibility()
            r8 = 8
            if (r0 != r8) goto L_0x061a
            int r3 = r3 + 0
            goto L_0x0642
        L_0x061a:
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            androidx.appcompat.widget.o0$a r0 = (androidx.appcompat.widget.o0.a) r0
            if (r19 == 0) goto L_0x0630
            int r4 = r6.f674t
            int r8 = r0.leftMargin
            int r8 = r8 + r12
            int r0 = r0.rightMargin
            int r8 = r8 + r0
            r11 = 0
            int r8 = r8 + r11
            int r8 = r8 + r4
            r6.f674t = r8
            goto L_0x0642
        L_0x0630:
            r11 = 0
            int r4 = r6.f674t
            int r8 = r4 + r12
            int r15 = r0.leftMargin
            int r8 = r8 + r15
            int r0 = r0.rightMargin
            int r8 = r8 + r0
            int r8 = r8 + r11
            int r0 = java.lang.Math.max(r4, r8)
            r6.f674t = r0
        L_0x0642:
            int r3 = r3 + 1
            r0 = 0
            goto L_0x0601
        L_0x0646:
            int r0 = r6.f674t
            int r3 = r38.getPaddingLeft()
            int r4 = r38.getPaddingRight()
            int r4 = r4 + r3
            int r4 = r4 + r0
            r6.f674t = r4
            int r0 = r38.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r4, r0)
            r3 = 0
            int r0 = android.view.View.resolveSizeAndState(r0, r7, r3)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r0
            int r4 = r6.f674t
            int r3 = r3 - r4
            if (r22 != 0) goto L_0x06b8
            if (r3 == 0) goto L_0x0672
            r8 = 0
            int r11 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x0672
            goto L_0x06b8
        L_0x0672:
            int r1 = java.lang.Math.max(r5, r2)
            if (r26 == 0) goto L_0x06af
            r2 = 1073741824(0x40000000, float:2.0)
            if (r10 == r2) goto L_0x06af
            r5 = 0
        L_0x067d:
            if (r5 >= r9) goto L_0x06af
            android.view.View r2 = r6.getChildAt(r5)
            if (r2 == 0) goto L_0x06ac
            int r3 = r2.getVisibility()
            r8 = 8
            if (r3 != r8) goto L_0x068e
            goto L_0x06ac
        L_0x068e:
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.appcompat.widget.o0$a r3 = (androidx.appcompat.widget.o0.a) r3
            float r3 = r3.weight
            r8 = 0
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x06ac
            r3 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r3)
            int r10 = r2.getMeasuredHeight()
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r3)
            r2.measure(r8, r10)
        L_0x06ac:
            int r5 = r5 + 1
            goto L_0x067d
        L_0x06af:
            r3 = r40
            r15 = r25
            r12 = r29
            r8 = 0
            goto L_0x0864
        L_0x06b8:
            float r2 = r6.u
            r8 = 0
            int r11 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x06c0
            r1 = r2
        L_0x06c0:
            r2 = -1
            r8 = 3
            r13[r8] = r2
            r13[r17] = r2
            r13[r27] = r2
            r11 = 0
            r13[r11] = r2
            r14[r8] = r2
            r14[r17] = r2
            r14[r27] = r2
            r14[r11] = r2
            r6.f674t = r11
            r15 = r25
            r2 = -1
            r8 = 0
        L_0x06d9:
            if (r8 >= r9) goto L_0x080a
            android.view.View r11 = r6.getChildAt(r8)
            if (r11 == 0) goto L_0x07f2
            int r12 = r11.getVisibility()
            r4 = 8
            if (r12 != r4) goto L_0x06eb
            goto L_0x07f2
        L_0x06eb:
            android.view.ViewGroup$LayoutParams r4 = r11.getLayoutParams()
            androidx.appcompat.widget.o0$a r4 = (androidx.appcompat.widget.o0.a) r4
            float r12 = r4.weight
            r18 = 0
            int r22 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r22 <= 0) goto L_0x074a
            float r7 = (float) r3
            float r7 = r7 * r12
            float r7 = r7 / r1
            int r7 = (int) r7
            float r1 = r1 - r12
            int r3 = r3 - r7
            int r12 = r38.getPaddingTop()
            int r22 = r38.getPaddingBottom()
            int r22 = r22 + r12
            int r12 = r4.topMargin
            int r22 = r22 + r12
            int r12 = r4.bottomMargin
            int r12 = r22 + r12
            r22 = r1
            int r1 = r4.height
            r25 = r3
            r3 = r40
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r3, r12, r1)
            int r12 = r4.width
            if (r12 != 0) goto L_0x0729
            r12 = 1073741824(0x40000000, float:2.0)
            if (r10 == r12) goto L_0x0726
            goto L_0x0729
        L_0x0726:
            if (r7 <= 0) goto L_0x0730
            goto L_0x0731
        L_0x0729:
            int r12 = r11.getMeasuredWidth()
            int r7 = r7 + r12
            if (r7 >= 0) goto L_0x0731
        L_0x0730:
            r7 = 0
        L_0x0731:
            r12 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r12)
            r11.measure(r7, r1)
            int r1 = r11.getMeasuredState()
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r7
            int r15 = android.view.View.combineMeasuredStates(r15, r1)
            r1 = r22
            r7 = r25
            goto L_0x074d
        L_0x074a:
            r7 = r3
            r3 = r40
        L_0x074d:
            if (r19 == 0) goto L_0x0769
            int r12 = r6.f674t
            int r22 = r11.getMeasuredWidth()
            r25 = r1
            int r1 = r4.leftMargin
            int r22 = r22 + r1
            int r1 = r4.rightMargin
            int r22 = r22 + r1
            r1 = 0
            int r22 = r22 + 0
            int r12 = r22 + r12
            r6.f674t = r12
            r26 = r7
            goto L_0x0787
        L_0x0769:
            r25 = r1
            r1 = 0
            int r12 = r6.f674t
            int r22 = r11.getMeasuredWidth()
            int r22 = r22 + r12
            int r1 = r4.leftMargin
            int r22 = r22 + r1
            int r1 = r4.rightMargin
            int r22 = r22 + r1
            r26 = r7
            r1 = 0
            int r7 = r22 + 0
            int r1 = java.lang.Math.max(r12, r7)
            r6.f674t = r1
        L_0x0787:
            r12 = r29
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x0795
            int r1 = r4.height
            r7 = -1
            if (r1 != r7) goto L_0x0795
            r1 = r27
            goto L_0x0796
        L_0x0795:
            r1 = 0
        L_0x0796:
            int r7 = r4.topMargin
            r22 = r10
            int r10 = r4.bottomMargin
            int r7 = r7 + r10
            int r10 = r11.getMeasuredHeight()
            int r10 = r10 + r7
            int r2 = java.lang.Math.max(r2, r10)
            if (r1 == 0) goto L_0x07a9
            goto L_0x07aa
        L_0x07a9:
            r7 = r10
        L_0x07aa:
            int r1 = java.lang.Math.max(r5, r7)
            if (r20 == 0) goto L_0x07b8
            int r5 = r4.height
            r7 = -1
            if (r5 != r7) goto L_0x07b9
            r5 = r27
            goto L_0x07ba
        L_0x07b8:
            r7 = -1
        L_0x07b9:
            r5 = 0
        L_0x07ba:
            if (r30 == 0) goto L_0x07e6
            int r11 = r11.getBaseline()
            if (r11 == r7) goto L_0x07e6
            int r4 = r4.gravity
            if (r4 >= 0) goto L_0x07c8
            int r4 = r6.f673s
        L_0x07c8:
            r4 = r4 & 112(0x70, float:1.57E-43)
            r24 = 4
            int r4 = r4 >> 4
            r28 = -2
            r4 = r4 & -2
            int r4 = r4 >> 1
            r7 = r13[r4]
            int r7 = java.lang.Math.max(r7, r11)
            r13[r4] = r7
            r7 = r14[r4]
            int r10 = r10 - r11
            int r7 = java.lang.Math.max(r7, r10)
            r14[r4] = r7
            goto L_0x07ea
        L_0x07e6:
            r24 = 4
            r28 = -2
        L_0x07ea:
            r20 = r5
            r7 = r26
            r5 = r1
            r1 = r25
            goto L_0x07ff
        L_0x07f2:
            r7 = r3
            r22 = r10
            r12 = r29
            r18 = 0
            r24 = 4
            r28 = -2
            r3 = r40
        L_0x07ff:
            int r8 = r8 + 1
            r3 = r7
            r29 = r12
            r10 = r22
            r7 = r39
            goto L_0x06d9
        L_0x080a:
            r3 = r40
            r12 = r29
            int r1 = r6.f674t
            int r4 = r38.getPaddingLeft()
            int r7 = r38.getPaddingRight()
            int r7 = r7 + r4
            int r7 = r7 + r1
            r6.f674t = r7
            r1 = r13[r27]
            r4 = -1
            if (r1 != r4) goto L_0x0834
            r7 = 0
            r8 = r13[r7]
            if (r8 != r4) goto L_0x0834
            r7 = r13[r17]
            if (r7 != r4) goto L_0x0834
            r7 = 3
            r8 = r13[r7]
            if (r8 == r4) goto L_0x0830
            goto L_0x0835
        L_0x0830:
            r32 = r2
            r8 = 0
            goto L_0x0863
        L_0x0834:
            r7 = 3
        L_0x0835:
            r4 = r13[r7]
            r8 = 0
            r10 = r13[r8]
            r11 = r13[r17]
            int r1 = java.lang.Math.max(r1, r11)
            int r1 = java.lang.Math.max(r10, r1)
            int r1 = java.lang.Math.max(r4, r1)
            r4 = r14[r7]
            r7 = r14[r8]
            r10 = r14[r27]
            r11 = r14[r17]
            int r10 = java.lang.Math.max(r10, r11)
            int r7 = java.lang.Math.max(r7, r10)
            int r4 = java.lang.Math.max(r4, r7)
            int r4 = r4 + r1
            int r1 = java.lang.Math.max(r2, r4)
            r32 = r1
        L_0x0863:
            r1 = r5
        L_0x0864:
            if (r20 != 0) goto L_0x086b
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x086b
            goto L_0x086d
        L_0x086b:
            r1 = r32
        L_0x086d:
            int r2 = r38.getPaddingTop()
            int r4 = r38.getPaddingBottom()
            int r4 = r4 + r2
            int r4 = r4 + r1
            int r1 = r38.getSuggestedMinimumHeight()
            int r1 = java.lang.Math.max(r4, r1)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r15
            r0 = r0 | r2
            int r2 = r15 << 16
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r6.setMeasuredDimension(r0, r1)
            if (r23 == 0) goto L_0x08cb
            int r0 = r38.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
        L_0x0898:
            if (r8 >= r9) goto L_0x08cb
            android.view.View r1 = r6.getChildAt(r8)
            int r0 = r1.getVisibility()
            r10 = 8
            if (r0 == r10) goto L_0x08c7
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            androidx.appcompat.widget.o0$a r11 = (androidx.appcompat.widget.o0.a) r11
            int r0 = r11.height
            r12 = -1
            if (r0 != r12) goto L_0x08c8
            int r13 = r11.width
            int r0 = r1.getMeasuredWidth()
            r11.width = r0
            r3 = 0
            r5 = 0
            r0 = r38
            r2 = r39
            r4 = r7
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.width = r13
            goto L_0x08c8
        L_0x08c7:
            r12 = -1
        L_0x08c8:
            int r8 = r8 + 1
            goto L_0x0898
        L_0x08cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z10) {
        this.f669o = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 < 0 || i10 >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f670p = i10;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f677y) {
            this.f677y = drawable;
            boolean z10 = false;
            if (drawable != null) {
                this.z = drawable.getIntrinsicWidth();
                this.A = drawable.getIntrinsicHeight();
            } else {
                this.z = 0;
                this.A = 0;
            }
            if (drawable == null) {
                z10 = true;
            }
            setWillNotDraw(z10);
            requestLayout();
        }
    }

    public void setDividerPadding(int i10) {
        this.C = i10;
    }

    public void setGravity(int i10) {
        if (this.f673s != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i10 |= 48;
            }
            this.f673s = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f673s;
        if ((8388615 & i12) != i11) {
            this.f673s = i11 | (-8388616 & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f675v = z10;
    }

    public void setOrientation(int i10) {
        if (this.f672r != i10) {
            this.f672r = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.B) {
            requestLayout();
        }
        this.B = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        int i12 = this.f673s;
        if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != i11) {
            this.f673s = i11 | (i12 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.u = Math.max(0.0f, f10);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

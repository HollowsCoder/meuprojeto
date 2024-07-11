package i0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f5995a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f5996b;

    /* renamed from: c  reason: collision with root package name */
    public final View f5997c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f5998e;

    public k(View view) {
        this.f5997c = view;
    }

    public final boolean a(float f10, float f11, boolean z) {
        ViewParent f12;
        if (!this.d || (f12 = f(0)) == null) {
            return false;
        }
        try {
            return f12.onNestedFling(this.f5997c, f10, f11, z);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + f12 + " does not implement interface method onNestedFling", e10);
            return false;
        }
    }

    public final boolean b(float f10, float f11) {
        ViewParent f12;
        if (!this.d || (f12 = f(0)) == null) {
            return false;
        }
        try {
            return f12.onNestedPreFling(this.f5997c, f10, f11);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + f12 + " does not implement interface method onNestedPreFling", e10);
            return false;
        }
    }

    public final boolean c(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        ViewParent f10;
        int i13;
        int i14;
        int[] iArr3;
        int i15 = i10;
        int i16 = i11;
        int[] iArr4 = iArr2;
        int i17 = i12;
        if (!this.d || (f10 = f(i17)) == null) {
            return false;
        }
        if (i15 != 0 || i16 != 0) {
            View view = this.f5997c;
            if (iArr4 != null) {
                view.getLocationInWindow(iArr4);
                i14 = iArr4[0];
                i13 = iArr4[1];
            } else {
                i14 = 0;
                i13 = 0;
            }
            if (iArr == null) {
                if (this.f5998e == null) {
                    this.f5998e = new int[2];
                }
                iArr3 = this.f5998e;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            View view2 = this.f5997c;
            if (f10 instanceof l) {
                ((l) f10).j(view2, i10, i11, iArr3, i12);
            } else if (i17 == 0) {
                try {
                    f10.onNestedPreScroll(view2, i15, i16, iArr3);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + f10 + " does not implement interface method onNestedPreScroll", e10);
                }
            }
            if (iArr4 != null) {
                view.getLocationInWindow(iArr4);
                iArr4[0] = iArr4[0] - i14;
                iArr4[1] = iArr4[1] - i13;
            }
            if (iArr3[0] == 0 && iArr3[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr4 == null) {
            return false;
        } else {
            iArr4[0] = 0;
            iArr4[1] = 0;
            return false;
        }
    }

    public final void d(int i10, int i11, int i12, int[] iArr) {
        e(0, i10, 0, i11, (int[]) null, i12, iArr);
    }

    public final boolean e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent f10;
        int i15;
        int i16;
        int[] iArr3;
        int[] iArr4 = iArr;
        int i17 = i14;
        if (!this.d || (f10 = f(i17)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        View view = this.f5997c;
        if (iArr4 != null) {
            view.getLocationInWindow(iArr4);
            i16 = iArr4[0];
            i15 = iArr4[1];
        } else {
            i16 = 0;
            i15 = 0;
        }
        if (iArr2 == null) {
            if (this.f5998e == null) {
                this.f5998e = new int[2];
            }
            int[] iArr5 = this.f5998e;
            iArr5[0] = 0;
            iArr5[1] = 0;
            iArr3 = iArr5;
        } else {
            iArr3 = iArr2;
        }
        View view2 = this.f5997c;
        if (f10 instanceof m) {
            ((m) f10).m(view2, i10, i11, i12, i13, i14, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i12;
            iArr3[1] = iArr3[1] + i13;
            if (f10 instanceof l) {
                ((l) f10).n(view2, i10, i11, i12, i13, i14);
            } else if (i17 == 0) {
                try {
                    f10.onNestedScroll(view2, i10, i11, i12, i13);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + f10 + " does not implement interface method onNestedScroll", e10);
                }
            }
        }
        if (iArr4 != null) {
            view.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i16;
            iArr4[1] = iArr4[1] - i15;
        }
        return true;
    }

    public final ViewParent f(int i10) {
        if (i10 == 0) {
            return this.f5995a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f5996b;
    }

    public final boolean g(int i10, int i11) {
        boolean z;
        boolean z10;
        if (f(i11) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        if (this.d) {
            View view = this.f5997c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z11 = parent instanceof l;
                if (z11) {
                    z10 = ((l) parent).o(view2, view, i10, i11);
                } else {
                    if (i11 == 0) {
                        try {
                            z10 = parent.onStartNestedScroll(view2, view, i10);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e10);
                        }
                    }
                    z10 = false;
                }
                if (z10) {
                    if (i11 == 0) {
                        this.f5995a = parent;
                    } else if (i11 == 1) {
                        this.f5996b = parent;
                    }
                    if (z11) {
                        ((l) parent).b(view2, view, i10, i11);
                    } else if (i11 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view2, view, i10);
                        } catch (AbstractMethodError e11) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e11);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
        }
        return false;
    }

    public final void h(int i10) {
        ViewParent f10 = f(i10);
        if (f10 != null) {
            boolean z = f10 instanceof l;
            View view = this.f5997c;
            if (z) {
                ((l) f10).i(view, i10);
            } else if (i10 == 0) {
                try {
                    f10.onStopNestedScroll(view);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + f10 + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i10 == 0) {
                this.f5995a = null;
            } else if (i10 == 1) {
                this.f5996b = null;
            }
        }
    }
}

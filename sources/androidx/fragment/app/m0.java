package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import i0.b0;
import i0.r;
import i0.w;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import n.b;

@SuppressLint({"UnknownNullness"})
public abstract class m0 {
    public static void d(View view, List list) {
        boolean z;
        boolean z10;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z = false;
                break;
            } else if (list.get(i10) == view) {
                z = true;
                break;
            } else {
                i10++;
            }
        }
        if (!z) {
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            if (w.i.k(view) != null) {
                list.add(view);
            }
            for (int i11 = size; i11 < list.size(); i11++) {
                View view2 = (View) list.get(i11);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = viewGroup.getChildAt(i12);
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size) {
                                z10 = false;
                                break;
                            } else if (list.get(i13) == childAt) {
                                z10 = true;
                                break;
                            } else {
                                i13++;
                            }
                        }
                        if (!z10 && w.i.k(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static void g(View view, Rect rect) {
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        if (w.g.b(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public static boolean h(List list) {
        return list == null || list.isEmpty();
    }

    public static ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = (View) arrayList.get(i10);
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            arrayList2.add(w.i.k(view));
            w.i.v(view, (String) null);
        }
        return arrayList2;
    }

    public static void q(ViewGroup viewGroup, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, b bVar) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            View view = (View) arrayList.get(i10);
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            String k10 = w.i.k(view);
            arrayList4.add(k10);
            if (k10 != null) {
                w.i.v(view, (String) null);
                String str = (String) bVar.getOrDefault(k10, null);
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i11))) {
                        w.i.v((View) arrayList2.get(i11), k10);
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        r.a(viewGroup, new l0(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void a(View view, Object obj);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public abstract Object f(Object obj);

    public abstract Object i(Object obj, Object obj2, Object obj3);

    public abstract Object j(Object obj, Object obj2, Object obj3);

    public abstract void l(Object obj, View view, ArrayList<View> arrayList);

    public abstract void m(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void n(View view, Object obj);

    public abstract void o(Object obj, Rect rect);

    public void p(Object obj, e0.b bVar, Runnable runnable) {
        runnable.run();
    }

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    public abstract void s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object t(Object obj);
}

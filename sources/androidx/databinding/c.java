package androidx.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final DataBinderMapperImpl f1029a = new DataBinderMapperImpl();

    public static ViewDataBinding a(View view, int i10) {
        return f1029a.b(view, i10);
    }

    public static ViewDataBinding b(ViewGroup viewGroup, int i10, int i11) {
        int childCount = viewGroup.getChildCount();
        int i12 = childCount - i10;
        if (i12 == 1) {
            return a(viewGroup.getChildAt(childCount - 1), i11);
        }
        View[] viewArr = new View[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            viewArr[i13] = viewGroup.getChildAt(i13 + i10);
        }
        return f1029a.c(viewArr, i11);
    }

    public static ViewDataBinding c(LayoutInflater layoutInflater, int i10, ViewGroup viewGroup) {
        return a(layoutInflater.inflate(i10, viewGroup, false), i10);
    }
}

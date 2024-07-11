package androidx.databinding.library.baseAdapters;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.b;
import java.util.ArrayList;
import java.util.List;

public class DataBinderMapperImpl extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f1031a = new SparseIntArray(0);

    public final List<b> a() {
        return new ArrayList(0);
    }

    public final ViewDataBinding b(View view, int i10) {
        if (f1031a.get(i10) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public final ViewDataBinding c(View[] viewArr, int i10) {
        if (viewArr.length == 0 || f1031a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}

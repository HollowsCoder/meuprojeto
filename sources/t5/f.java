package t5;

import android.view.View;
import i0.b0;
import i0.w;
import java.util.WeakHashMap;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final View f9013a;

    /* renamed from: b  reason: collision with root package name */
    public int f9014b;

    /* renamed from: c  reason: collision with root package name */
    public int f9015c;
    public int d;

    public f(View view) {
        this.f9013a = view;
    }

    public final void a() {
        int i10 = this.d;
        View view = this.f9013a;
        int top = i10 - (view.getTop() - this.f9014b);
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f9015c));
    }
}

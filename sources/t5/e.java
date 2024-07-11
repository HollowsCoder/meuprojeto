package t5;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class e<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public f f9011a;

    /* renamed from: b  reason: collision with root package name */
    public int f9012b = 0;

    public e() {
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        t(coordinatorLayout, v10, i10);
        if (this.f9011a == null) {
            this.f9011a = new f(v10);
        }
        f fVar = this.f9011a;
        View view = fVar.f9013a;
        fVar.f9014b = view.getTop();
        fVar.f9015c = view.getLeft();
        this.f9011a.a();
        int i11 = this.f9012b;
        if (i11 == 0) {
            return true;
        }
        f fVar2 = this.f9011a;
        if (fVar2.d != i11) {
            fVar2.d = i11;
            fVar2.a();
        }
        this.f9012b = 0;
        return true;
    }

    public final int s() {
        f fVar = this.f9011a;
        if (fVar != null) {
            return fVar.d;
        }
        return 0;
    }

    public void t(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        coordinatorLayout.r(v10, i10);
    }
}

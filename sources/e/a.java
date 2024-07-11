package e;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

public abstract class a {

    /* renamed from: e.a$a  reason: collision with other inner class name */
    public static class C0052a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f4326a = 8388627;

        public C0052a() {
            super(-2, -2);
        }

        public C0052a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.databinding.a.A);
            this.f4326a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0052a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0052a(C0052a aVar) {
            super(aVar);
            this.f4326a = aVar.f4326a;
        }
    }

    public interface b {
        void a();
    }
}

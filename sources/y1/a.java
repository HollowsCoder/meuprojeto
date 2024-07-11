package y1;

import android.view.View;

public final class a implements View.OnClickListener {

    /* renamed from: o  reason: collision with root package name */
    public final C0163a f9525o;

    /* renamed from: p  reason: collision with root package name */
    public final int f9526p;

    /* renamed from: y1.a$a  reason: collision with other inner class name */
    public interface C0163a {
        void e(int i10);
    }

    public a(C0163a aVar, int i10) {
        this.f9525o = aVar;
        this.f9526p = i10;
    }

    public final void onClick(View view) {
        this.f9525o.e(this.f9526p);
    }
}

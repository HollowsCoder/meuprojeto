package f0;

import a0.d;
import android.graphics.Typeface;
import b0.e;

public final class a implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ s6.a f4552o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Typeface f4553p;

    public a(s6.a aVar, Typeface typeface) {
        this.f4552o = aVar;
        this.f4553p = typeface;
    }

    public final void run() {
        d.c cVar = ((e.a) this.f4552o).S;
        if (cVar != null) {
            cVar.d(this.f4553p);
        }
    }
}

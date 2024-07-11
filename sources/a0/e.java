package a0;

import a0.d;
import android.graphics.Typeface;

public final class e implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Typeface f29o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ d.c f30p;

    public e(d.c cVar, Typeface typeface) {
        this.f30p = cVar;
        this.f29o = typeface;
    }

    public final void run() {
        this.f30p.d(this.f29o);
    }
}

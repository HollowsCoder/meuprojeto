package j6;

import android.graphics.Typeface;
import androidx.activity.result.c;
import h6.b;

public final class a extends c {

    /* renamed from: o  reason: collision with root package name */
    public final Typeface f6575o;

    /* renamed from: p  reason: collision with root package name */
    public final C0089a f6576p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f6577q;

    /* renamed from: j6.a$a  reason: collision with other inner class name */
    public interface C0089a {
    }

    public a(b bVar, Typeface typeface) {
        this.f6575o = typeface;
        this.f6576p = bVar;
    }

    public final void p(int i10) {
        if (!this.f6577q) {
            h6.c cVar = ((b) this.f6576p).f5857a;
            a aVar = cVar.f5876v;
            boolean z = true;
            if (aVar != null) {
                aVar.f6577q = true;
            }
            Typeface typeface = cVar.f5874s;
            Typeface typeface2 = this.f6575o;
            if (typeface != typeface2) {
                cVar.f5874s = typeface2;
            } else {
                z = false;
            }
            if (z) {
                cVar.h();
            }
        }
    }

    public final void q(Typeface typeface, boolean z) {
        if (!this.f6577q) {
            h6.c cVar = ((b) this.f6576p).f5857a;
            a aVar = cVar.f5876v;
            boolean z10 = true;
            if (aVar != null) {
                aVar.f6577q = true;
            }
            if (cVar.f5874s != typeface) {
                cVar.f5874s = typeface;
            } else {
                z10 = false;
            }
            if (z10) {
                cVar.h();
            }
        }
    }
}

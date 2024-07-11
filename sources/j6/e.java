package j6;

import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.activity.result.c;

public final class e extends c {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ TextPaint f6592o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ c f6593p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ d f6594q;

    public e(d dVar, TextPaint textPaint, c cVar) {
        this.f6594q = dVar;
        this.f6592o = textPaint;
        this.f6593p = cVar;
    }

    public final void p(int i10) {
        this.f6593p.p(i10);
    }

    public final void q(Typeface typeface, boolean z) {
        this.f6594q.g(this.f6592o, typeface);
        this.f6593p.q(typeface, z);
    }
}

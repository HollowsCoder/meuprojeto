package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

public final class o extends j {
    public o(h hVar) {
        super(hVar);
    }

    public final void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        Paint paint2 = paint;
        e.a().getClass();
        h hVar = this.f1075p;
        m mVar = hVar.f1062b;
        Typeface typeface = mVar.d;
        Typeface typeface2 = paint.getTypeface();
        paint2.setTypeface(typeface);
        int i15 = hVar.f1061a * 2;
        Canvas canvas2 = canvas;
        canvas2.drawText(mVar.f1086b, i15, 2, f10, (float) i13, paint);
        paint2.setTypeface(typeface2);
    }
}

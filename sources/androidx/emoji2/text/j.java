package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import q0.a;

public abstract class j extends ReplacementSpan {

    /* renamed from: o  reason: collision with root package name */
    public final Paint.FontMetricsInt f1074o = new Paint.FontMetricsInt();

    /* renamed from: p  reason: collision with root package name */
    public final h f1075p;

    /* renamed from: q  reason: collision with root package name */
    public float f1076q = 1.0f;

    public j(h hVar) {
        if (hVar != null) {
            this.f1075p = hVar;
            return;
        }
        throw new NullPointerException("metadata cannot be null");
    }

    public final int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        short s10;
        Paint.FontMetricsInt fontMetricsInt2 = this.f1074o;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = ((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f;
        h hVar = this.f1075p;
        a c10 = hVar.c();
        int a10 = c10.a(14);
        short s11 = 0;
        if (a10 != 0) {
            s10 = c10.f8207b.getShort(a10 + c10.f8206a);
        } else {
            s10 = 0;
        }
        this.f1076q = abs / ((float) s10);
        a c11 = hVar.c();
        int a11 = c11.a(14);
        if (a11 != 0) {
            c11.f8207b.getShort(a11 + c11.f8206a);
        }
        a c12 = hVar.c();
        int a12 = c12.a(12);
        if (a12 != 0) {
            s11 = c12.f8207b.getShort(a12 + c12.f8206a);
        }
        short s12 = (short) ((int) (((float) s11) * this.f1076q));
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s12;
    }
}

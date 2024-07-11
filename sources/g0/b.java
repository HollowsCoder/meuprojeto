package g0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.appcompat.widget.x0;
import b0.d;
import java.util.Objects;

public final class b implements Spannable {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f4955a;

        /* renamed from: b  reason: collision with root package name */
        public final TextDirectionHeuristic f4956b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4957c;
        public final int d;

        public a(PrecomputedText.Params params) {
            this.f4955a = params.getTextPaint();
            this.f4956b = params.getTextDirection();
            this.f4957c = params.getBreakStrategy();
            this.d = params.getHyphenationFrequency();
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            }
            this.f4955a = textPaint;
            this.f4956b = textDirectionHeuristic;
            this.f4957c = i10;
            this.d = i11;
        }

        public final boolean a(a aVar) {
            if (this.f4957c != aVar.f4957c || this.d != aVar.d) {
                return false;
            }
            TextPaint textPaint = this.f4955a;
            if (textPaint.getTextSize() != aVar.f4955a.getTextSize()) {
                return false;
            }
            float textScaleX = textPaint.getTextScaleX();
            TextPaint textPaint2 = aVar.f4955a;
            if (textScaleX != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags() || !textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
                return false;
            }
            if (textPaint.getTypeface() == null) {
                if (textPaint2.getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f4956b == aVar.f4956b;
        }

        public final int hashCode() {
            TextPaint textPaint = this.f4955a;
            return Objects.hash(new Object[]{Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f4956b, Integer.valueOf(this.f4957c), Integer.valueOf(this.d)});
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder sb2 = new StringBuilder("textSize=");
            TextPaint textPaint = this.f4955a;
            sb2.append(textPaint.getTextSize());
            sb.append(sb2.toString());
            sb.append(", textScaleX=" + textPaint.getTextScaleX());
            sb.append(", textSkewX=" + textPaint.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
            sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
            sb.append(", textLocale=" + textPaint.getTextLocales());
            sb.append(", typeface=" + textPaint.getTypeface());
            if (i10 >= 26) {
                sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f4956b);
            sb.append(", breakStrategy=" + this.f4957c);
            sb.append(", hyphenationFrequency=" + this.d);
            sb.append("}");
            return sb.toString();
        }
    }

    public final char charAt(int i10) {
        throw null;
    }

    public final int getSpanEnd(Object obj) {
        throw null;
    }

    public final int getSpanFlags(Object obj) {
        throw null;
    }

    public final int getSpanStart(Object obj) {
        throw null;
    }

    public final <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            d.h(i10, i11, cls);
            throw null;
        }
        throw null;
    }

    public final int length() {
        throw null;
    }

    public final int nextSpanTransition(int i10, int i11, Class cls) {
        throw null;
    }

    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            d.i(obj);
            throw null;
        } else {
            throw null;
        }
    }

    public final void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            x0.j(obj, i10, i11, i12);
            throw null;
        } else {
            throw null;
        }
    }

    public final CharSequence subSequence(int i10, int i11) {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}

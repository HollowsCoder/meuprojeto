package h6;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.karumi.dexter.BuildConfig;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f5889a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f5890b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5891c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public Layout.Alignment f5892e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f  reason: collision with root package name */
    public int f5893f = Integer.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    public float f5894g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f5895h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    public int f5896i = 1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5897j = true;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5898k;
    public TextUtils.TruncateAt l = null;

    public static class a extends Exception {
    }

    public h(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f5889a = charSequence;
        this.f5890b = textPaint;
        this.f5891c = i10;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f5889a == null) {
            this.f5889a = BuildConfig.FLAVOR;
        }
        int max = Math.max(0, this.f5891c);
        CharSequence charSequence = this.f5889a;
        int i10 = this.f5893f;
        TextPaint textPaint = this.f5890b;
        if (i10 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, (float) max, this.l);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        if (this.f5898k && this.f5893f == 1) {
            this.f5892e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f5892e);
        obtain.setIncludePad(this.f5897j);
        obtain.setTextDirection(this.f5898k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f5893f);
        float f10 = this.f5894g;
        if (!(f10 == 0.0f && this.f5895h == 1.0f)) {
            obtain.setLineSpacing(f10, this.f5895h);
        }
        if (this.f5893f > 1) {
            obtain.setHyphenationFrequency(this.f5896i);
        }
        return obtain.build();
    }
}

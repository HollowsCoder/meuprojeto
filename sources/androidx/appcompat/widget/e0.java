package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

public final class e0 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ TextView f547o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Typeface f548p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f549q;

    public e0(TextView textView, Typeface typeface, int i10) {
        this.f547o = textView;
        this.f548p = typeface;
        this.f549q = i10;
    }

    public final void run() {
        this.f547o.setTypeface(this.f548p, this.f549q);
    }
}

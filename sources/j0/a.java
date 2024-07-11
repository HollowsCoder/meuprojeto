package j0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {

    /* renamed from: o  reason: collision with root package name */
    public final int f6383o;

    /* renamed from: p  reason: collision with root package name */
    public final b f6384p;

    /* renamed from: q  reason: collision with root package name */
    public final int f6385q;

    public a(int i10, b bVar, int i11) {
        this.f6383o = i10;
        this.f6384p = bVar;
        this.f6385q = i11;
    }

    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f6383o);
        this.f6384p.f6386a.performAction(this.f6385q, bundle);
    }
}

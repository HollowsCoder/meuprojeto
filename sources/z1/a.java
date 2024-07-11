package z1;

import android.view.View;
import z8.g;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f9789o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f9790p;

    public /* synthetic */ a(int i10, Object obj) {
        this.f9789o = i10;
        this.f9790p = obj;
    }

    public final void onClick(View view) {
        int i10 = this.f9789o;
        Object obj = this.f9790p;
        switch (i10) {
            case 0:
                b bVar = (b) obj;
                int i11 = b.A0;
                g.f(bVar, "this$0");
                bVar.f9791z0.n();
                bVar.V();
                return;
            default:
                a2.g gVar = (a2.g) obj;
                g.f(gVar, "this$0");
                gVar.d.onClick();
                return;
        }
    }
}

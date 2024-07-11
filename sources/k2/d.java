package k2;

import android.content.DialogInterface;
import y8.a;
import z8.g;

public final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ a f6679o;

    public /* synthetic */ d(a aVar) {
        this.f6679o = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        a aVar = this.f6679o;
        g.f(aVar, "$onCancel");
        aVar.n();
        dialogInterface.dismiss();
    }
}

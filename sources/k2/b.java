package k2;

import android.content.DialogInterface;
import com.karumi.dexter.Dexter;
import j2.c;
import y8.a;
import y8.l;
import z8.g;

public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ c f6673o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ c f6674p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ l f6675q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ a f6676r;

    public /* synthetic */ b(c cVar, c cVar2, l lVar, a aVar) {
        this.f6673o = cVar;
        this.f6674p = cVar2;
        this.f6675q = lVar;
        this.f6676r = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        c cVar = this.f6673o;
        g.f(cVar, "this$0");
        c cVar2 = this.f6674p;
        g.f(cVar2, "$permission");
        l lVar = this.f6675q;
        g.f(lVar, "$onComplete");
        a aVar = this.f6676r;
        g.f(aVar, "$onCancel");
        Dexter.withContext(cVar.f6677a).withPermission(cVar2.getValue()).withListener(new e(new f(lVar), cVar, new g(aVar))).check();
    }
}

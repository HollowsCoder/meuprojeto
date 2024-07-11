package h1;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

public final class j implements Callable<r<f>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WeakReference f5141a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f5142b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f5143c;
    public final /* synthetic */ String d;

    public j(WeakReference weakReference, Context context, int i10, String str) {
        this.f5141a = weakReference;
        this.f5142b = context;
        this.f5143c = i10;
        this.d = str;
    }

    public final Object call() {
        Context context = (Context) this.f5141a.get();
        if (context == null) {
            context = this.f5142b;
        }
        return g.e(this.f5143c, context, this.d);
    }
}

package f0;

import android.content.Context;
import f0.j;
import java.util.concurrent.Callable;

public final class f implements Callable<j.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f4563a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f4564b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f4565c;
    public final /* synthetic */ int d;

    public f(String str, Context context, e eVar, int i10) {
        this.f4563a = str;
        this.f4564b = context;
        this.f4565c = eVar;
        this.d = i10;
    }

    public final Object call() {
        return j.a(this.f4563a, this.f4564b, this.f4565c, this.d);
    }
}

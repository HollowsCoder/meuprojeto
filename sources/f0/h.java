package f0;

import android.content.Context;
import f0.j;
import java.util.concurrent.Callable;

public final class h implements Callable<j.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f4567a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f4568b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f4569c;
    public final /* synthetic */ int d;

    public h(String str, Context context, e eVar, int i10) {
        this.f4567a = str;
        this.f4568b = context;
        this.f4569c = eVar;
        this.d = i10;
    }

    public final Object call() {
        try {
            return j.a(this.f4567a, this.f4568b, this.f4569c, this.d);
        } catch (Throwable unused) {
            return new j.a(-3);
        }
    }
}

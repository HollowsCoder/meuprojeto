package h1;

import android.content.Context;
import java.util.concurrent.Callable;

public final class i implements Callable<r<f>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f5138a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f5139b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f5140c;

    public i(Context context, String str, String str2) {
        this.f5138a = context;
        this.f5139b = str;
        this.f5140c = str2;
    }

    public final Object call() {
        return g.b(this.f5138a, this.f5139b, this.f5140c);
    }
}

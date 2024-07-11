package d7;

import android.os.Bundle;
import java.util.concurrent.Callable;

public final class k implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f4240a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f4241b;

    public k(t tVar, long j8) {
        this.f4241b = tVar;
        this.f4240a = j8;
    }

    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f4240a);
        this.f4241b.f4279j.i(bundle);
        return null;
    }
}

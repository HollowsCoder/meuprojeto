package h1;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;

public final class k implements Callable<r<f>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InputStream f5144a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f5145b = null;

    public k(ByteArrayInputStream byteArrayInputStream) {
        this.f5144a = byteArrayInputStream;
    }

    public final Object call() {
        return g.c(this.f5144a, this.f5145b);
    }
}

package androidx.emoji2.text;

import androidx.emoji2.text.e;
import java.util.concurrent.ThreadPoolExecutor;

public final class g extends e.h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e.h f1059a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1060b;

    public g(e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1059a = hVar;
        this.f1060b = threadPoolExecutor;
    }

    public final void a(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f1060b;
        try {
            this.f1059a.a(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    public final void b(m mVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f1060b;
        try {
            this.f1059a.b(mVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}

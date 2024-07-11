package androidx.emoji2.text;

import g9.m;
import java.io.Serializable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import z8.g;

public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1035a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Serializable f1036b;

    public /* synthetic */ a(Serializable serializable, int i10) {
        this.f1035a = i10;
        this.f1036b = serializable;
    }

    public final Thread newThread(Runnable runnable) {
        int i10 = this.f1035a;
        Serializable serializable = this.f1036b;
        switch (i10) {
            case 0:
                Thread thread = new Thread(runnable, (String) serializable);
                thread.setPriority(10);
                return thread;
            default:
                m mVar = m.f5026p;
                Thread thread2 = new Thread(runnable, g.k(Integer.valueOf(((AtomicInteger) serializable).incrementAndGet()), "CommonPool-worker-"));
                thread2.setDaemon(true);
                return thread2;
        }
    }
}

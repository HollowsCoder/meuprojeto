package i4;

import j4.b;
import l4.d;
import l4.v;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f6085o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f6086p;

    public /* synthetic */ k(int i10, Object obj) {
        this.f6085o = i10;
        this.f6086p = obj;
    }

    public final void run() {
        int i10 = this.f6085o;
        Object obj = this.f6086p;
        switch (i10) {
            case 0:
                ((p) obj).a("Service disconnected", 2);
                return;
            default:
                ((d.c) ((v) obj).f6947g).b(new b(4));
                return;
        }
    }
}

package l4;

import l4.d;

public final class m implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f6929o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ d.a f6930p;

    public m(d.a aVar, int i10) {
        this.f6930p = aVar;
        this.f6929o = i10;
    }

    public final void run() {
        this.f6930p.a(this.f6929o);
    }
}

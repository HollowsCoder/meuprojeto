package h5;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import n4.m;

public final class j3 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final i3 f5483o;

    /* renamed from: p  reason: collision with root package name */
    public final int f5484p;

    /* renamed from: q  reason: collision with root package name */
    public final Throwable f5485q;

    /* renamed from: r  reason: collision with root package name */
    public final byte[] f5486r;

    /* renamed from: s  reason: collision with root package name */
    public final String f5487s;

    /* renamed from: t  reason: collision with root package name */
    public final Map<String, List<String>> f5488t;

    public /* synthetic */ j3(String str, i3 i3Var, int i10, IOException iOException, byte[] bArr, Map map) {
        m.h(i3Var);
        this.f5483o = i3Var;
        this.f5484p = i10;
        this.f5485q = iOException;
        this.f5486r = bArr;
        this.f5487s = str;
        this.f5488t = map;
    }

    public final void run() {
        this.f5483o.b(this.f5487s, this.f5484p, this.f5485q, this.f5486r, this.f5488t);
    }
}

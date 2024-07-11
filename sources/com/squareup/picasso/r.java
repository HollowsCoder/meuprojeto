package com.squareup.picasso;

import android.net.NetworkInfo;
import b0.d;
import com.squareup.picasso.a0;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import i9.c0;
import i9.d;
import i9.d0;
import i9.v;
import i9.x;
import java.io.IOException;
import m9.e;

public final class r extends y {

    /* renamed from: a  reason: collision with root package name */
    public final i f3967a;

    /* renamed from: b  reason: collision with root package name */
    public final a0 f3968b;

    public static class a extends IOException {
        public a() {
            super("Received response with 0 content-length header.");
        }
    }

    public static final class b extends IOException {

        /* renamed from: o  reason: collision with root package name */
        public final int f3969o;

        /* renamed from: p  reason: collision with root package name */
        public final int f3970p = 0;

        public b(int i10) {
            super(d.c("HTTP ", i10));
            this.f3969o = i10;
        }
    }

    public r(i iVar, a0 a0Var) {
        this.f3967a = iVar;
        this.f3968b = a0Var;
    }

    public final boolean b(w wVar) {
        String scheme = wVar.f3999c.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    public final int d() {
        return 2;
    }

    public final y.a e(w wVar, int i10) {
        i9.d dVar;
        t.c cVar;
        boolean z = true;
        if (i10 == 0) {
            dVar = null;
        } else if (q.isOfflineOnly(i10)) {
            dVar = i9.d.f6210n;
        } else {
            d.a aVar = new d.a();
            if (!q.shouldReadFromDiskCache(i10)) {
                aVar.f6223a = true;
            }
            if (!q.shouldWriteToDiskCache(i10)) {
                aVar.f6224b = true;
            }
            dVar = aVar.a();
        }
        x.a aVar2 = new x.a();
        aVar2.e(wVar.f3999c.toString());
        if (dVar != null) {
            String dVar2 = dVar.toString();
            if (dVar2.length() != 0) {
                z = false;
            }
            if (z) {
                aVar2.f6372c.f("Cache-Control");
            } else {
                aVar2.b("Cache-Control", dVar2);
            }
        }
        x a10 = aVar2.a();
        v vVar = ((s) this.f3967a).f3971a;
        vVar.getClass();
        c0 h10 = new e(vVar, a10, false).h();
        boolean c10 = h10.c();
        d0 d0Var = h10.f6196v;
        if (c10) {
            if (h10.f6197x == null) {
                cVar = t.c.NETWORK;
            } else {
                cVar = t.c.DISK;
            }
            if (cVar == t.c.DISK && d0Var.a() == 0) {
                d0Var.close();
                throw new a();
            }
            if (cVar == t.c.NETWORK && d0Var.a() > 0) {
                long a11 = d0Var.a();
                a0.a aVar3 = this.f3968b.f3896b;
                aVar3.sendMessage(aVar3.obtainMessage(4, Long.valueOf(a11)));
            }
            return new y.a(d0Var.c(), cVar);
        }
        d0Var.close();
        throw new b(h10.f6194s);
    }

    public final boolean f(NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }
}

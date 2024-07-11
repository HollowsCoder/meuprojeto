package y3;

import a4.d;
import b4.b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import q3.h;
import t3.j;
import t3.x;
import u3.e;
import z3.q;

public final class c implements d {

    /* renamed from: f  reason: collision with root package name */
    public static final Logger f9542f = Logger.getLogger(x.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final q f9543a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f9544b;

    /* renamed from: c  reason: collision with root package name */
    public final e f9545c;
    public final d d;

    /* renamed from: e  reason: collision with root package name */
    public final b f9546e;

    public c(Executor executor, e eVar, q qVar, d dVar, b bVar) {
        this.f9544b = executor;
        this.f9545c = eVar;
        this.f9543a = qVar;
        this.d = dVar;
        this.f9546e = bVar;
    }

    public final void a(h hVar, t3.h hVar2, j jVar) {
        this.f9544b.execute(new a(this, jVar, hVar, hVar2));
    }
}

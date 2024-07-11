package g9;

import java.util.concurrent.CancellationException;
import n8.i;
import y8.l;
import z8.g;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5029a;

    /* renamed from: b  reason: collision with root package name */
    public final d f5030b;

    /* renamed from: c  reason: collision with root package name */
    public final l<Throwable, i> f5031c;
    public final Object d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f5032e;

    public n(Object obj, d dVar, l<? super Throwable, i> lVar, Object obj2, Throwable th) {
        this.f5029a = obj;
        this.f5030b = dVar;
        this.f5031c = lVar;
        this.d = obj2;
        this.f5032e = th;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, d dVar, l lVar, CancellationException cancellationException, int i10) {
        this(obj, (i10 & 2) != 0 ? null : dVar, (l<? super Throwable, i>) (i10 & 4) != 0 ? null : lVar, (Object) null, (Throwable) (i10 & 16) != 0 ? null : cancellationException);
    }

    public static n a(n nVar, d dVar, CancellationException cancellationException, int i10) {
        Object obj;
        l<Throwable, i> lVar;
        Object obj2 = null;
        if ((i10 & 1) != 0) {
            obj = nVar.f5029a;
        } else {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            dVar = nVar.f5030b;
        }
        d dVar2 = dVar;
        if ((i10 & 4) != 0) {
            lVar = nVar.f5031c;
        } else {
            lVar = null;
        }
        if ((i10 & 8) != 0) {
            obj2 = nVar.d;
        }
        Object obj3 = obj2;
        Throwable th = cancellationException;
        if ((i10 & 16) != 0) {
            th = nVar.f5032e;
        }
        nVar.getClass();
        return new n(obj, dVar2, (l<? super Throwable, i>) lVar, obj3, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return g.a(this.f5029a, nVar.f5029a) && g.a(this.f5030b, nVar.f5030b) && g.a(this.f5031c, nVar.f5031c) && g.a(this.d, nVar.d) && g.a(this.f5032e, nVar.f5032e);
    }

    public final int hashCode() {
        int i10 = 0;
        Object obj = this.f5029a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        d dVar = this.f5030b;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        l<Throwable, i> lVar = this.f5031c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f5032e;
        if (th != null) {
            i10 = th.hashCode();
        }
        return hashCode4 + i10;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f5029a + ", cancelHandler=" + this.f5030b + ", onCancellation=" + this.f5031c + ", idempotentResume=" + this.d + ", cancelCause=" + this.f5032e + ')';
    }
}

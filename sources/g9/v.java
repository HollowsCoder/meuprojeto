package g9;

import com.google.android.gms.internal.measurement.d8;
import kotlinx.coroutines.internal.m;
import n.e;
import n8.i;
import q8.d;
import q8.f;
import y8.l;
import z8.g;
import z8.p;

public enum v {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5051a = null;

        static {
            int[] iArr = new int[v.values().length];
            iArr[v.DEFAULT.ordinal()] = 1;
            iArr[v.ATOMIC.ordinal()] = 2;
            iArr[v.UNDISPATCHED.ordinal()] = 3;
            iArr[v.LAZY.ordinal()] = 4;
            f5051a = iArr;
        }
    }

    public final <T> void invoke(l<? super d<? super T>, ? extends Object> lVar, d<? super T> dVar) {
        Object obj;
        f b10;
        Object c10;
        int i10 = a.f5051a[ordinal()];
        if (i10 == 1) {
            try {
                androidx.databinding.a.p(e.A(e.r(lVar, dVar)), i.f7501a, (l) null);
            } catch (Throwable th) {
                dVar.h(e.s(th));
                throw th;
            }
        } else if (i10 == 2) {
            g.f(lVar, "<this>");
            g.f(dVar, "completion");
            e.A(e.r(lVar, dVar)).h(i.f7501a);
        } else if (i10 == 3) {
            g.f(dVar, "completion");
            try {
                b10 = dVar.b();
                c10 = m.c(b10, (Object) null);
                if (lVar != null) {
                    p.a(1, lVar);
                    obj = lVar.k(dVar);
                    m.a(b10, c10);
                    if (obj == r8.a.COROUTINE_SUSPENDED) {
                        return;
                    }
                    dVar.h(obj);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } catch (Throwable th2) {
                obj = e.s(th2);
            }
        } else if (i10 != 4) {
            throw new d8();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    public final <R, T> void invoke(y8.p<? super R, ? super d<? super T>, ? extends Object> pVar, R r5, d<? super T> dVar) {
        Object obj;
        f b10;
        Object c10;
        int i10 = a.f5051a[ordinal()];
        if (i10 == 1) {
            try {
                androidx.databinding.a.p(e.A(e.q(pVar, r5, dVar)), i.f7501a, (l) null);
            } catch (Throwable th) {
                dVar.h(e.s(th));
                throw th;
            }
        } else if (i10 == 2) {
            g.f(pVar, "<this>");
            g.f(dVar, "completion");
            e.A(e.q(pVar, r5, dVar)).h(i.f7501a);
        } else if (i10 == 3) {
            g.f(dVar, "completion");
            try {
                b10 = dVar.b();
                c10 = m.c(b10, (Object) null);
                if (pVar != null) {
                    p.a(2, pVar);
                    obj = pVar.i(r5, dVar);
                    m.a(b10, c10);
                    if (obj == r8.a.COROUTINE_SUSPENDED) {
                        return;
                    }
                    dVar.h(obj);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } catch (Throwable th2) {
                obj = e.s(th2);
            }
        } else if (i10 != 4) {
            throw new d8();
        }
    }
}

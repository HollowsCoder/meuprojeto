package q8;

import com.karumi.dexter.BuildConfig;
import java.io.Serializable;
import q8.f;
import y8.p;
import z8.g;
import z8.h;

public final class c implements f, Serializable {

    /* renamed from: o  reason: collision with root package name */
    public final f f8269o;

    /* renamed from: p  reason: collision with root package name */
    public final f.b f8270p;

    public static final class a extends h implements p<String, f.b, String> {

        /* renamed from: p  reason: collision with root package name */
        public static final a f8271p = new a();

        public a() {
            super(2);
        }

        public final Object i(Object obj, Object obj2) {
            boolean z;
            String str = (String) obj;
            f.b bVar = (f.b) obj2;
            g.f(str, "acc");
            g.f(bVar, "element");
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public c(f.b bVar, f fVar) {
        g.f(fVar, "left");
        g.f(bVar, "element");
        this.f8269o = fVar;
        this.f8270p = bVar;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            int i10 = 2;
            c cVar2 = cVar;
            int i11 = 2;
            while (true) {
                f fVar = cVar2.f8269o;
                if (fVar instanceof c) {
                    cVar2 = (c) fVar;
                } else {
                    cVar2 = null;
                }
                if (cVar2 == null) {
                    break;
                }
                i11++;
            }
            c cVar3 = this;
            while (true) {
                f fVar2 = cVar3.f8269o;
                if (fVar2 instanceof c) {
                    cVar3 = (c) fVar2;
                } else {
                    cVar3 = null;
                }
                if (cVar3 == null) {
                    break;
                }
                i10++;
            }
            if (i11 != i10) {
                return false;
            }
            c cVar4 = this;
            while (true) {
                f.b bVar = cVar4.f8270p;
                if (g.a(cVar.get(bVar.getKey()), bVar)) {
                    f fVar3 = cVar4.f8269o;
                    if (!(fVar3 instanceof c)) {
                        g.d(fVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        f.b bVar2 = (f.b) fVar3;
                        z = g.a(cVar.get(bVar2.getKey()), bVar2);
                        break;
                    }
                    cVar4 = (c) fVar3;
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final <R> R fold(R r5, p<? super R, ? super f.b, ? extends R> pVar) {
        return pVar.i(this.f8269o.fold(r5, pVar), this.f8270p);
    }

    public final <E extends f.b> E get(f.c<E> cVar) {
        g.f(cVar, "key");
        c cVar2 = this;
        while (true) {
            E e10 = cVar2.f8270p.get(cVar);
            if (e10 != null) {
                return e10;
            }
            f fVar = cVar2.f8269o;
            if (!(fVar instanceof c)) {
                return fVar.get(cVar);
            }
            cVar2 = (c) fVar;
        }
    }

    public final int hashCode() {
        return this.f8270p.hashCode() + this.f8269o.hashCode();
    }

    public final f minusKey(f.c<?> cVar) {
        g.f(cVar, "key");
        f.b bVar = this.f8270p;
        f.b bVar2 = bVar.get(cVar);
        f fVar = this.f8269o;
        if (bVar2 != null) {
            return fVar;
        }
        f minusKey = fVar.minusKey(cVar);
        return minusKey == fVar ? this : minusKey == g.f8275o ? bVar : new c(bVar, minusKey);
    }

    public final f plus(f fVar) {
        return f.a.a(this, fVar);
    }

    public final String toString() {
        return "[" + ((String) fold(BuildConfig.FLAVOR, a.f8271p)) + ']';
    }
}

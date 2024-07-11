package k9;

import i9.c0;
import i9.d;
import i9.x;
import z8.g;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final x f6735a;

    /* renamed from: b  reason: collision with root package name */
    public final c0 f6736b;

    public static final class a {
        public static boolean a(x xVar, c0 c0Var) {
            g.f(c0Var, "response");
            g.f(xVar, "request");
            int i10 = c0Var.f6194s;
            if (!(i10 == 200 || i10 == 410 || i10 == 414 || i10 == 501 || i10 == 203 || i10 == 204)) {
                if (i10 != 307) {
                    if (!(i10 == 308 || i10 == 404 || i10 == 405)) {
                        switch (i10) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (c0.b(c0Var, "Expires") == null && c0Var.a().f6214c == -1 && !c0Var.a().f6216f && !c0Var.a().f6215e) {
                    return false;
                }
            }
            if (c0Var.a().f6213b) {
                return false;
            }
            i9.d dVar = xVar.f6365a;
            if (dVar == null) {
                i9.d.f6211o.getClass();
                dVar = d.b.a(xVar.d);
                xVar.f6365a = dVar;
            }
            if (!dVar.f6213b) {
                return true;
            }
            return false;
        }
    }

    public d(x xVar, c0 c0Var) {
        this.f6735a = xVar;
        this.f6736b = c0Var;
    }
}

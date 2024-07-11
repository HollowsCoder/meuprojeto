package r1;

import m1.b;
import s1.a;

public final class g implements d0<b> {

    /* renamed from: o  reason: collision with root package name */
    public static final g f8367o = new g();

    /* renamed from: p  reason: collision with root package name */
    public static final a.C0126a f8368p = a.C0126a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    public final Object f(a aVar, float f10) {
        b.a aVar2 = b.a.CENTER;
        aVar.b();
        b.a aVar3 = aVar2;
        String str = null;
        String str2 = null;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z = true;
        while (aVar.g()) {
            switch (aVar.t(f8368p)) {
                case 0:
                    str = aVar.o();
                    break;
                case 1:
                    str2 = aVar.o();
                    break;
                case 2:
                    f11 = (float) aVar.l();
                    break;
                case 3:
                    int n10 = aVar.n();
                    aVar3 = b.a.CENTER;
                    if (n10 <= aVar3.ordinal() && n10 >= 0) {
                        aVar3 = b.a.values()[n10];
                        break;
                    }
                case 4:
                    i10 = aVar.n();
                    break;
                case 5:
                    f12 = (float) aVar.l();
                    break;
                case 6:
                    f13 = (float) aVar.l();
                    break;
                case 7:
                    i11 = m.a(aVar);
                    break;
                case 8:
                    i12 = m.a(aVar);
                    break;
                case 9:
                    f14 = (float) aVar.l();
                    break;
                case 10:
                    z = aVar.j();
                    break;
                default:
                    aVar.u();
                    aVar.x();
                    break;
            }
        }
        a aVar4 = aVar;
        aVar.d();
        return new b(str, str2, f11, aVar3, i10, f12, f13, i11, i12, f14, z);
    }
}

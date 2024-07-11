package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.p;
import b0.d;

@p.a("navigation")
public final class j extends p<i> {

    /* renamed from: a  reason: collision with root package name */
    public final q f1509a;

    public j(q qVar) {
        this.f1509a = qVar;
    }

    public final h a() {
        return new i(this);
    }

    public final h b(h hVar, Bundle bundle, m mVar) {
        String str;
        i iVar = (i) hVar;
        int i10 = iVar.f1504x;
        if (i10 == 0) {
            StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
            int i11 = iVar.f1494q;
            if (i11 != 0) {
                if (iVar.f1495r == null) {
                    iVar.f1495r = Integer.toString(i11);
                }
                str = iVar.f1495r;
            } else {
                str = "the root navigation";
            }
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
        h n10 = iVar.n(i10, false);
        if (n10 != null) {
            return this.f1509a.c(n10.f1492o).b(n10, n10.e(bundle), mVar);
        }
        if (iVar.f1505y == null) {
            iVar.f1505y = Integer.toString(iVar.f1504x);
        }
        throw new IllegalArgumentException(d.f("navigation destination ", iVar.f1505y, " is not a direct child of this NavGraph"));
    }

    public final boolean e() {
        return true;
    }
}

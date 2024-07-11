package h5;

import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.x2;
import java.util.ArrayList;

public final class y6 {

    /* renamed from: a  reason: collision with root package name */
    public f3 f5826a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f5827b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f5828c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ z6 f5829e;

    public /* synthetic */ y6(z6 z6Var) {
        this.f5829e = z6Var;
    }

    public final boolean a(long j8, x2 x2Var) {
        if (this.f5828c == null) {
            this.f5828c = new ArrayList();
        }
        if (this.f5827b == null) {
            this.f5827b = new ArrayList();
        }
        if (this.f5828c.size() > 0 && ((((x2) this.f5828c.get(0)).w() / 1000) / 60) / 60 != ((x2Var.w() / 1000) / 60) / 60) {
            return false;
        }
        long d10 = this.d + ((long) x2Var.d());
        z6 z6Var = this.f5829e;
        z6Var.F();
        if (d10 >= ((long) Math.max(0, u2.f5722i.a(null).intValue()))) {
            return false;
        }
        this.d = d10;
        this.f5828c.add(x2Var);
        this.f5827b.add(Long.valueOf(j8));
        int size = this.f5828c.size();
        z6Var.F();
        if (size >= Math.max(1, u2.f5724j.a(null).intValue())) {
            return false;
        }
        return true;
    }
}

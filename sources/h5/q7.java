package h5;

import java.util.HashSet;
import n.b;

public final class q7 extends u6 {

    /* renamed from: r  reason: collision with root package name */
    public String f5659r;

    /* renamed from: s  reason: collision with root package name */
    public HashSet f5660s;

    /* renamed from: t  reason: collision with root package name */
    public b f5661t;
    public Long u;

    /* renamed from: v  reason: collision with root package name */
    public Long f5662v;

    public q7(z6 z6Var) {
        super(z6Var);
    }

    public final void i() {
    }

    public final l7 k(Integer num) {
        if (this.f5661t.containsKey(num)) {
            return (l7) this.f5661t.getOrDefault(num, null);
        }
        l7 l7Var = new l7(this, this.f5659r);
        this.f5661t.put(num, l7Var);
        return l7Var;
    }
}

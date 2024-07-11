package f9;

import n8.d;
import y8.p;
import z8.g;
import z8.h;

public final class i extends h implements p<CharSequence, Integer, d<? extends Integer, ? extends Integer>> {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ char[] f4939p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ boolean f4940q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(char[] cArr, boolean z) {
        super(2);
        this.f4939p = cArr;
        this.f4940q = z;
    }

    public final Object i(Object obj, Object obj2) {
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Number) obj2).intValue();
        g.f(charSequence, "$this$$receiver");
        int i02 = l.i0(intValue, charSequence, this.f4940q, this.f4939p);
        if (i02 < 0) {
            return null;
        }
        return new d(Integer.valueOf(i02), 1);
    }
}

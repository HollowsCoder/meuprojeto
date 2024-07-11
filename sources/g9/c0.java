package g9;

import f9.d;
import kotlinx.coroutines.internal.a;

public abstract class c0 extends s {

    /* renamed from: p  reason: collision with root package name */
    public long f5000p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f5001q;

    /* renamed from: r  reason: collision with root package name */
    public a<y<?>> f5002r;

    public final void C(boolean z) {
        this.f5000p = (z ? 4294967296L : 1) + this.f5000p;
        if (!z) {
            this.f5001q = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: g9.y} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean E() {
        /*
            r7 = this;
            kotlinx.coroutines.internal.a<g9.y<?>> r0 = r7.f5002r
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r2 = r0.f6772b
            int r3 = r0.f6773c
            r4 = 1
            r5 = 0
            if (r2 != r3) goto L_0x000f
            goto L_0x001f
        L_0x000f:
            java.lang.Object[] r3 = r0.f6771a
            r6 = r3[r2]
            r3[r2] = r5
            int r2 = r2 + r4
            int r3 = r3.length
            int r3 = r3 + -1
            r2 = r2 & r3
            r0.f6772b = r2
            if (r6 == 0) goto L_0x0028
            r5 = r6
        L_0x001f:
            g9.y r5 = (g9.y) r5
            if (r5 != 0) goto L_0x0024
            return r1
        L_0x0024:
            r5.run()
            return r4
        L_0x0028:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.c0.E():boolean");
    }

    public void shutdown() {
    }

    public final void y() {
        long j8 = this.f5000p - 4294967296L;
        this.f5000p = j8;
        if (j8 <= 0 && this.f5001q) {
            shutdown();
        }
    }

    public final void z(y<?> yVar) {
        a<y<?>> aVar = this.f5002r;
        if (aVar == null) {
            aVar = new a<>();
            this.f5002r = aVar;
        }
        Object[] objArr = aVar.f6771a;
        int i10 = aVar.f6773c;
        objArr[i10] = yVar;
        int length = (objArr.length - 1) & (i10 + 1);
        aVar.f6773c = length;
        int i11 = aVar.f6772b;
        if (length == i11) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[(length2 << 1)];
            d.O(objArr, objArr2, 0, i11, 0, 10);
            Object[] objArr3 = aVar.f6771a;
            int length3 = objArr3.length;
            int i12 = aVar.f6772b;
            d.O(objArr3, objArr2, length3 - i12, 0, i12, 4);
            aVar.f6771a = objArr2;
            aVar.f6772b = 0;
            aVar.f6773c = length2;
        }
    }
}

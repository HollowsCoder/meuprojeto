package y9;

import n.e;
import q8.d;
import s8.c;

public final class s {

    public static final class a implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ d f9711o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ Exception f9712p;

        public a(Exception exc, b bVar) {
            this.f9711o = bVar;
            this.f9712p = exc;
        }

        public final void run() {
            e.A(this.f9711o).h(e.s(this.f9712p));
        }
    }

    @s8.e(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {113}, m = "suspendAndThrow")
    public static final class b extends c {

        /* renamed from: r  reason: collision with root package name */
        public /* synthetic */ Object f9713r;

        /* renamed from: s  reason: collision with root package name */
        public int f9714s;

        public b(d dVar) {
            super(dVar);
        }

        public final Object f(Object obj) {
            this.f9713r = obj;
            this.f9714s |= Integer.MIN_VALUE;
            return s.a((Exception) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(java.lang.Exception r4, q8.d<?> r5) {
        /*
            boolean r0 = r5 instanceof y9.s.b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            y9.s$b r0 = (y9.s.b) r0
            int r1 = r0.f9714s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f9714s = r1
            goto L_0x0018
        L_0x0013:
            y9.s$b r0 = new y9.s$b
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f9713r
            r8.a r1 = r8.a.COROUTINE_SUSPENDED
            int r2 = r0.f9714s
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            n.e.I(r5)
            n8.i r4 = n8.i.f7501a
            return r4
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            n.e.I(r5)
            r0.getClass()
            r0.f9714s = r3
            g9.f0 r5 = g9.z.f5055a
            q8.f r2 = r0.f8834p
            z8.g.c(r2)
            y9.s$a r3 = new y9.s$a
            r3.<init>(r4, r0)
            r5.b(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.s.a(java.lang.Exception, q8.d):java.lang.Object");
    }
}

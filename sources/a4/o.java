package a4;

import a4.q;
import android.database.sqlite.SQLiteDatabase;
import m5.a;

public final /* synthetic */ class o implements q.a, a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Object f84o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f85p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f86q;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3) {
        this.f84o = obj;
        this.f85p = obj2;
        this.f86q = obj3;
    }

    public final Object apply(Object obj) {
        q qVar = (q) this.f84o;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        qVar.getClass();
        sQLiteDatabase.compileStatement((String) this.f85p).execute();
        q.o(sQLiteDatabase.rawQuery((String) this.f86q, (String[]) null), new n(qVar, 2));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (r1 == false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(m5.i r4) {
        /*
            r3 = this;
            java.lang.Object r4 = r3.f84o
            e8.c r4 = (e8.c) r4
            java.lang.Object r0 = r3.f85p
            m5.i r0 = (m5.i) r0
            java.lang.Object r1 = r3.f86q
            m5.i r1 = (m5.i) r1
            r4.getClass()
            boolean r2 = r0.m()
            if (r2 == 0) goto L_0x0053
            java.lang.Object r2 = r0.i()
            if (r2 != 0) goto L_0x001c
            goto L_0x0053
        L_0x001c:
            java.lang.Object r0 = r0.i()
            f8.e r0 = (f8.e) r0
            boolean r2 = r1.m()
            if (r2 == 0) goto L_0x0041
            java.lang.Object r1 = r1.i()
            f8.e r1 = (f8.e) r1
            if (r1 == 0) goto L_0x003d
            java.util.Date r2 = r0.f4910c
            java.util.Date r1 = r1.f4910c
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r1 = 0
            goto L_0x003e
        L_0x003d:
            r1 = 1
        L_0x003e:
            if (r1 != 0) goto L_0x0041
            goto L_0x0053
        L_0x0041:
            f8.d r1 = r4.f4520e
            m5.i r0 = r1.c(r0)
            e8.b r1 = new e8.b
            r1.<init>(r4)
            java.util.concurrent.Executor r4 = r4.f4519c
            m5.i r4 = r0.e(r4, r1)
            goto L_0x0059
        L_0x0053:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            m5.r r4 = m5.l.e(r4)
        L_0x0059:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.o.c(m5.i):java.lang.Object");
    }
}

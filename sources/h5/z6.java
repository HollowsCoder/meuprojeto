package h5;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import b0.d;
import com.google.android.gms.internal.measurement.a3;
import com.google.android.gms.internal.measurement.b3;
import com.google.android.gms.internal.measurement.e3;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.p3;
import com.google.android.gms.internal.measurement.q3;
import com.google.android.gms.internal.measurement.qa;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.w2;
import com.google.android.gms.internal.measurement.x2;
import i4.n;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import n4.m;
import t4.c;

public final class z6 implements s4 {
    public static volatile z6 P;
    public boolean A;
    public long B;
    public ArrayList C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public FileLock I;
    public FileChannel J;
    public ArrayList K;
    public ArrayList L;
    public long M;
    public final HashMap N;
    public final w6 O = new w6(this);

    /* renamed from: o  reason: collision with root package name */
    public final c4 f5848o;

    /* renamed from: p  reason: collision with root package name */
    public final l3 f5849p;

    /* renamed from: q  reason: collision with root package name */
    public i f5850q;

    /* renamed from: r  reason: collision with root package name */
    public n3 f5851r;

    /* renamed from: s  reason: collision with root package name */
    public s6 f5852s;

    /* renamed from: t  reason: collision with root package name */
    public q7 f5853t;
    public final b7 u;

    /* renamed from: v  reason: collision with root package name */
    public o5 f5854v;
    public g6 w;

    /* renamed from: x  reason: collision with root package name */
    public final v6 f5855x;

    /* renamed from: y  reason: collision with root package name */
    public final i4 f5856y;
    public boolean z = false;

    public z6(a7 a7Var) {
        this.f5856y = i4.h(a7Var.f5274a, (w0) null, (Long) null);
        this.M = -1;
        this.f5855x = new v6(this);
        b7 b7Var = new b7(this);
        b7Var.j();
        this.u = b7Var;
        l3 l3Var = new l3(this);
        l3Var.j();
        this.f5849p = l3Var;
        c4 c4Var = new c4(this);
        c4Var.j();
        this.f5848o = c4Var;
        this.N = new HashMap();
        f().n(new n(3, this, a7Var));
    }

    public static final void E(u6 u6Var) {
        if (u6Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!u6Var.f5774q) {
            String valueOf = String.valueOf(u6Var.getClass());
            throw new IllegalStateException(d.g(new StringBuilder(valueOf.length() + 27), "Component not initialized: ", valueOf));
        }
    }

    public static final void r(w2 w2Var, int i10, String str) {
        List<b3> q10 = w2Var.q();
        int i11 = 0;
        while (i11 < q10.size()) {
            if (!"_err".equals(q10.get(i11).s())) {
                i11++;
            } else {
                return;
            }
        }
        a3 D2 = b3.D();
        D2.q("_err");
        D2.s(Long.valueOf((long) i10).longValue());
        b3 b3Var = (b3) D2.j();
        a3 D3 = b3.D();
        D3.q("_ev");
        D3.r(str);
        b3 b3Var2 = (b3) D3.j();
        if (w2Var.f2636q) {
            w2Var.m();
            w2Var.f2636q = false;
        }
        x2.E((x2) w2Var.f2635p, b3Var);
        if (w2Var.f2636q) {
            w2Var.m();
            w2Var.f2636q = false;
        }
        x2.E((x2) w2Var.f2635p, b3Var2);
    }

    public static final void s(w2 w2Var, String str) {
        List<b3> q10 = w2Var.q();
        for (int i10 = 0; i10 < q10.size(); i10++) {
            if (str.equals(q10.get(i10).s())) {
                w2Var.u(i10);
                return;
            }
        }
    }

    public static z6 t(Context context) {
        m.h(context);
        m.h(context.getApplicationContext());
        if (P == null) {
            synchronized (z6.class) {
                if (P == null) {
                    P = new z6(new a7(context));
                }
            }
        }
        return P;
    }

    public final void A() {
        f().g();
        if (this.F || this.G || this.H) {
            g3 e10 = e();
            e10.B.d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.F), Boolean.valueOf(this.G), Boolean.valueOf(this.H));
            return;
        }
        e().B.a("Stopping uploading service(s)");
        ArrayList arrayList = this.C;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            ArrayList arrayList2 = this.C;
            m.h(arrayList2);
            arrayList2.clear();
        }
    }

    public final Boolean B(m4 m4Var) {
        try {
            int i10 = (m4Var.N() > -2147483648L ? 1 : (m4Var.N() == -2147483648L ? 0 : -1));
            i4 i4Var = this.f5856y;
            if (i10 != 0) {
                if (m4Var.N() == ((long) c.a(i4Var.f5452o).b(m4Var.x(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = c.a(i4Var.f5452o).b(m4Var.x(), 0).versionName;
                String L2 = m4Var.L();
                if (L2 != null && L2.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final i7 C(String str) {
        String str2;
        Object obj;
        e3 e3Var;
        String str3;
        String str4 = str;
        i iVar = this.f5850q;
        E(iVar);
        m4 L2 = iVar.L(str4);
        if (L2 == null || TextUtils.isEmpty(L2.L())) {
            str2 = "No app data available; dropping";
            e3Var = e().A;
            obj = str4;
        } else {
            Boolean B2 = B(L2);
            if (B2 == null || B2.booleanValue()) {
                String A2 = L2.A();
                String L3 = L2.L();
                long N2 = L2.N();
                String P2 = L2.P();
                long R = L2.R();
                long b10 = L2.b();
                boolean f10 = L2.f();
                String H2 = L2.H();
                long r5 = L2.r();
                boolean t10 = L2.t();
                String C2 = L2.C();
                i4 i4Var = L2.f5555a;
                h4 h4Var = i4Var.f5459x;
                i4.n(h4Var);
                h4Var.g();
                Boolean bool = L2.f5571s;
                long d = L2.d();
                h4 h4Var2 = i4Var.f5459x;
                i4.n(h4Var2);
                h4Var2.g();
                ArrayList arrayList = L2.u;
                qa.a();
                if (F().m(str4, u2.f5717f0)) {
                    str3 = L2.E();
                } else {
                    str3 = null;
                }
                return new i7(str, A2, L3, N2, P2, R, b10, (String) null, f10, false, H2, r5, 0, 0, t10, false, C2, bool, d, (List<String>) arrayList, str3, M(str).c());
            }
            g3 e10 = e();
            Object p10 = g3.p(str);
            e3Var = e10.f5397t;
            str2 = "App version does not match; dropping. appId";
            obj = p10;
        }
        e3Var.b(obj, str2);
        return null;
    }

    public final boolean D(i7 i7Var) {
        qa.a();
        boolean m10 = F().m(i7Var.f5468o, u2.f5717f0);
        String str = i7Var.E;
        String str2 = i7Var.f5469p;
        return m10 ? !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(i7Var.I) || !TextUtils.isEmpty(str) : !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str);
    }

    public final e F() {
        i4 i4Var = this.f5856y;
        m.h(i4Var);
        return i4Var.u;
    }

    public final i G() {
        i iVar = this.f5850q;
        E(iVar);
        return iVar;
    }

    public final n3 H() {
        n3 n3Var = this.f5851r;
        if (n3Var != null) {
            return n3Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final b7 I() {
        b7 b7Var = this.u;
        E(b7Var);
        return b7Var;
    }

    public final g7 J() {
        i4 i4Var = this.f5856y;
        m.h(i4Var);
        g7 g7Var = i4Var.z;
        i4.l(g7Var);
        return g7Var;
    }

    public final void K() {
        if (!this.z) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final void L(String str, f fVar) {
        f().g();
        K();
        this.N.put(str, fVar);
        i iVar = this.f5850q;
        E(iVar);
        i4 i4Var = iVar.f5649o;
        m.h(str);
        iVar.g();
        iVar.h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", fVar.c());
        try {
            if (iVar.y().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                g3 g3Var = i4Var.w;
                i4.n(g3Var);
                g3Var.f5397t.b(g3.p(str), "Failed to insert/update consent setting (got -1). appId");
            }
        } catch (SQLiteException e10) {
            g3 g3Var2 = i4Var.w;
            i4.n(g3Var2);
            g3Var2.f5397t.c(g3.p(str), e10, "Error storing consent setting. appId, error");
        }
    }

    public final f M(String str) {
        String str2;
        f().g();
        K();
        f fVar = (f) this.N.get(str);
        if (fVar != null) {
            return fVar;
        }
        i iVar = this.f5850q;
        E(iVar);
        m.h(str);
        iVar.g();
        iVar.h();
        Cursor cursor = null;
        try {
            Cursor rawQuery = iVar.y().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
            if (rawQuery.moveToFirst()) {
                str2 = rawQuery.getString(0);
                rawQuery.close();
            } else {
                rawQuery.close();
                str2 = "G1";
            }
            f b10 = f.b(str2);
            L(str, b10);
            return b10;
        } catch (SQLiteException e10) {
            g3 g3Var = iVar.f5649o.w;
            i4.n(g3Var);
            g3Var.f5397t.c("select consent_state from consent_settings where app_id=? limit 1;", e10, "Database error");
            throw e10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long N() {
        ((r4.d) c()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        g6 g6Var = this.w;
        g6Var.h();
        g6Var.g();
        q3 q3Var = g6Var.f5416y;
        long a10 = q3Var.a();
        if (a10 == 0) {
            g7 g7Var = g6Var.f5649o.z;
            i4.l(g7Var);
            a10 = ((long) g7Var.X().nextInt(86400000)) + 1;
            q3Var.b(a10);
        }
        return ((((currentTimeMillis + a10) / 1000) / 60) / 60) / 24;
    }

    public final void O(p pVar, String str) {
        String str2;
        p pVar2 = pVar;
        String str3 = str;
        i iVar = this.f5850q;
        E(iVar);
        m4 L2 = iVar.L(str3);
        if (L2 == null || TextUtils.isEmpty(L2.L())) {
            e().A.b(str3, "No app data available; dropping event");
            return;
        }
        Boolean B2 = B(L2);
        if (B2 == null) {
            if (!"_ui".equals(pVar2.f5621o)) {
                g3 e10 = e();
                e10.w.b(g3.p(str), "Could not find package. appId");
            }
        } else if (!B2.booleanValue()) {
            g3 e11 = e();
            e11.f5397t.b(g3.p(str), "App version does not match; dropping event. appId");
            return;
        }
        String A2 = L2.A();
        String L3 = L2.L();
        long N2 = L2.N();
        String P2 = L2.P();
        long R = L2.R();
        long b10 = L2.b();
        boolean f10 = L2.f();
        String H2 = L2.H();
        long r5 = L2.r();
        boolean t10 = L2.t();
        String C2 = L2.C();
        i4 i4Var = L2.f5555a;
        h4 h4Var = i4Var.f5459x;
        i4.n(h4Var);
        h4Var.g();
        Boolean bool = L2.f5571s;
        long d = L2.d();
        h4 h4Var2 = i4Var.f5459x;
        i4.n(h4Var2);
        h4Var2.g();
        ArrayList arrayList = L2.u;
        qa.a();
        ArrayList arrayList2 = arrayList;
        Boolean bool2 = bool;
        if (F().m(L2.x(), u2.f5717f0)) {
            str2 = L2.E();
        } else {
            str2 = null;
        }
        String str4 = str;
        i7 i7Var = r2;
        boolean z10 = f10;
        String str5 = H2;
        long j8 = r5;
        String str6 = C2;
        Boolean bool3 = bool2;
        long j10 = d;
        ArrayList arrayList3 = arrayList2;
        i7 i7Var2 = new i7(str4, A2, L3, N2, P2, R, b10, (String) null, z10, false, str5, j8, 0, 0, t10, false, str6, bool3, j10, (List<String>) arrayList3, str2, M(str3).c());
        P(pVar, i7Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ea, code lost:
        if (r5 == null) goto L_0x00ee;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0178  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void P(h5.p r12, h5.i7 r13) {
        /*
            r11 = this;
            java.lang.String r0 = r13.f5468o
            n4.m.e(r0)
            h5.h3 r0 = new h5.h3
            java.lang.String r5 = r12.f5621o
            java.lang.String r6 = r12.f5623q
            h5.n r1 = r12.f5622p
            android.os.Bundle r4 = r1.h0()
            long r2 = r12.f5624r
            r1 = r0
            r1.<init>(r2, r4, r5, r6)
            h5.g7 r12 = r11.J()
            h5.i r1 = r11.f5850q
            E(r1)
            java.lang.String r2 = r13.f5468o
            h5.i4 r3 = r1.f5649o
            r1.g()
            r1.h()
            r4 = 0
            android.database.sqlite.SQLiteDatabase r5 = r1.y()     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00d9 }
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00d9 }
            r7 = 0
            r6[r7] = r2     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00d9 }
            java.lang.String r8 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r5 = r5.rawQuery(r8, r6)     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00d9 }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x00d7 }
            if (r6 != 0) goto L_0x0052
            h5.g3 r1 = r3.w     // Catch:{ SQLiteException -> 0x00d7 }
            h5.i4.n(r1)     // Catch:{ SQLiteException -> 0x00d7 }
            h5.e3 r1 = r1.B     // Catch:{ SQLiteException -> 0x00d7 }
            java.lang.String r6 = "Default event parameters not found"
            r1.a(r6)     // Catch:{ SQLiteException -> 0x00d7 }
        L_0x004d:
            r5.close()
            goto L_0x00ee
        L_0x0052:
            byte[] r6 = r5.getBlob(r7)     // Catch:{ SQLiteException -> 0x00d7 }
            com.google.android.gms.internal.measurement.w2 r7 = com.google.android.gms.internal.measurement.x2.B()     // Catch:{ IOException -> 0x00c4 }
            com.google.android.gms.internal.measurement.b6 r6 = h5.b7.E(r7, r6)     // Catch:{ IOException -> 0x00c4 }
            com.google.android.gms.internal.measurement.w2 r6 = (com.google.android.gms.internal.measurement.w2) r6     // Catch:{ IOException -> 0x00c4 }
            com.google.android.gms.internal.measurement.f6 r6 = r6.j()     // Catch:{ IOException -> 0x00c4 }
            com.google.android.gms.internal.measurement.x2 r6 = (com.google.android.gms.internal.measurement.x2) r6     // Catch:{ IOException -> 0x00c4 }
            h5.z6 r1 = r1.f5701p     // Catch:{ SQLiteException -> 0x00d7 }
            r1.I()     // Catch:{ SQLiteException -> 0x00d7 }
            java.util.List r1 = r6.r()     // Catch:{ SQLiteException -> 0x00d7 }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x00d7 }
            r6.<init>()     // Catch:{ SQLiteException -> 0x00d7 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ SQLiteException -> 0x00d7 }
        L_0x0078:
            boolean r7 = r1.hasNext()     // Catch:{ SQLiteException -> 0x00d7 }
            if (r7 == 0) goto L_0x00c0
            java.lang.Object r7 = r1.next()     // Catch:{ SQLiteException -> 0x00d7 }
            com.google.android.gms.internal.measurement.b3 r7 = (com.google.android.gms.internal.measurement.b3) r7     // Catch:{ SQLiteException -> 0x00d7 }
            java.lang.String r8 = r7.s()     // Catch:{ SQLiteException -> 0x00d7 }
            boolean r9 = r7.z()     // Catch:{ SQLiteException -> 0x00d7 }
            if (r9 == 0) goto L_0x0096
            double r9 = r7.A()     // Catch:{ SQLiteException -> 0x00d7 }
            r6.putDouble(r8, r9)     // Catch:{ SQLiteException -> 0x00d7 }
            goto L_0x0078
        L_0x0096:
            boolean r9 = r7.x()     // Catch:{ SQLiteException -> 0x00d7 }
            if (r9 == 0) goto L_0x00a4
            float r7 = r7.y()     // Catch:{ SQLiteException -> 0x00d7 }
            r6.putFloat(r8, r7)     // Catch:{ SQLiteException -> 0x00d7 }
            goto L_0x0078
        L_0x00a4:
            boolean r9 = r7.t()     // Catch:{ SQLiteException -> 0x00d7 }
            if (r9 == 0) goto L_0x00b2
            java.lang.String r7 = r7.u()     // Catch:{ SQLiteException -> 0x00d7 }
            r6.putString(r8, r7)     // Catch:{ SQLiteException -> 0x00d7 }
            goto L_0x0078
        L_0x00b2:
            boolean r9 = r7.v()     // Catch:{ SQLiteException -> 0x00d7 }
            if (r9 == 0) goto L_0x0078
            long r9 = r7.w()     // Catch:{ SQLiteException -> 0x00d7 }
            r6.putLong(r8, r9)     // Catch:{ SQLiteException -> 0x00d7 }
            goto L_0x0078
        L_0x00c0:
            r5.close()
            goto L_0x00ef
        L_0x00c4:
            r1 = move-exception
            h5.g3 r6 = r3.w     // Catch:{ SQLiteException -> 0x00d7 }
            h5.i4.n(r6)     // Catch:{ SQLiteException -> 0x00d7 }
            h5.e3 r6 = r6.f5397t     // Catch:{ SQLiteException -> 0x00d7 }
            java.lang.String r7 = "Failed to retrieve default event parameters. appId"
            h5.f3 r8 = h5.g3.p(r2)     // Catch:{ SQLiteException -> 0x00d7 }
            r6.c(r8, r1, r7)     // Catch:{ SQLiteException -> 0x00d7 }
            goto L_0x004d
        L_0x00d7:
            r1 = move-exception
            goto L_0x00de
        L_0x00d9:
            r12 = move-exception
            goto L_0x0176
        L_0x00dc:
            r1 = move-exception
            r5 = r4
        L_0x00de:
            h5.g3 r3 = r3.w     // Catch:{ all -> 0x0174 }
            h5.i4.n(r3)     // Catch:{ all -> 0x0174 }
            h5.e3 r3 = r3.f5397t     // Catch:{ all -> 0x0174 }
            java.lang.String r6 = "Error selecting default event parameters"
            r3.b(r1, r6)     // Catch:{ all -> 0x0174 }
            if (r5 == 0) goto L_0x00ee
            goto L_0x004d
        L_0x00ee:
            r6 = r4
        L_0x00ef:
            android.os.Bundle r1 = r0.d
            r12.r(r1, r6)
            h5.g7 r12 = r11.J()
            h5.e r3 = r11.F()
            r3.getClass()
            h5.s2<java.lang.Integer> r5 = h5.u2.H
            int r2 = r3.l(r2, r5)
            r3 = 100
            int r2 = java.lang.Math.min(r2, r3)
            r3 = 25
            int r2 = java.lang.Math.max(r2, r3)
            r12.q(r0, r2)
            h5.p r12 = new h5.p
            java.lang.String r6 = r0.f5426a
            h5.n r7 = new h5.n
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>(r1)
            r7.<init>(r2)
            java.lang.String r8 = r0.f5427b
            long r9 = r0.f5428c
            r5 = r12
            r5.<init>(r6, r7, r8, r9)
            h5.e r0 = r11.F()
            h5.s2<java.lang.Boolean> r1 = h5.u2.f5708a0
            boolean r0 = r0.m(r4, r1)
            if (r0 == 0) goto L_0x0170
            java.lang.String r0 = "_cmp"
            java.lang.String r1 = r12.f5621o
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0141
            goto L_0x0170
        L_0x0141:
            h5.n r0 = r12.f5622p
            android.os.Bundle r1 = r0.f5587o
            java.lang.String r2 = "_cis"
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "referrer API v2"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0170
            android.os.Bundle r0 = r0.f5587o
            java.lang.String r1 = "gclid"
            java.lang.String r5 = r0.getString(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0170
            h5.c7 r0 = new h5.c7
            java.lang.String r6 = "_lgclid"
            long r3 = r12.f5624r
            java.lang.String r7 = "auto"
            r2 = r0
            r2.<init>(r3, r5, r6, r7)
            r11.l(r0, r13)
        L_0x0170:
            r11.Q(r12, r13)
            return
        L_0x0174:
            r12 = move-exception
            r4 = r5
        L_0x0176:
            if (r4 == 0) goto L_0x017b
            r4.close()
        L_0x017b:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.z6.P(h5.p, h5.i7):void");
    }

    public final void Q(p pVar, i7 i7Var) {
        boolean z10;
        List<b> list;
        i4 i4Var;
        List<b> list2;
        List<b> list3;
        e3 e3Var;
        String str;
        Object p10;
        b3 b3Var;
        p pVar2 = pVar;
        i7 i7Var2 = i7Var;
        m.h(i7Var);
        String str2 = i7Var2.f5468o;
        m.e(str2);
        f().g();
        K();
        long j8 = pVar2.f5624r;
        E(this.u);
        if (!TextUtils.isEmpty(i7Var2.f5469p) || !TextUtils.isEmpty(i7Var2.E)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (!i7Var2.f5474v) {
                q(i7Var2);
                return;
            }
            List<String> list4 = i7Var2.H;
            if (list4 != null) {
                String str3 = pVar2.f5621o;
                if (list4.contains(str3)) {
                    Bundle h02 = pVar2.f5622p.h0();
                    h02.putLong("ga_safelisted", 1);
                    pVar2 = new p(pVar2.f5621o, new n(h02), pVar2.f5623q, pVar2.f5624r);
                } else {
                    e().A.d("Dropping non-safelisted event. appId, event name, origin", str2, str3, pVar2.f5623q);
                    return;
                }
            }
            i iVar = this.f5850q;
            E(iVar);
            iVar.v();
            try {
                i iVar2 = this.f5850q;
                E(iVar2);
                m.e(str2);
                iVar2.g();
                iVar2.h();
                int i10 = (j8 > 0 ? 1 : (j8 == 0 ? 0 : -1));
                if (i10 < 0) {
                    g3 g3Var = iVar2.f5649o.w;
                    i4.n(g3Var);
                    g3Var.w.c(g3.p(str2), Long.valueOf(j8), "Invalid time querying timed out conditional properties");
                    list = Collections.emptyList();
                } else {
                    list = iVar2.K("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j8)});
                }
                Iterator<b> it = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    i4Var = this.f5856y;
                    if (!hasNext) {
                        break;
                    }
                    b next = it.next();
                    if (next != null) {
                        e3 e3Var2 = e().B;
                        String str4 = next.f5275o;
                        b3 b3Var2 = i4Var.A;
                        i4.l(b3Var2);
                        e3Var2.d("User property timed out", str4, b3Var2.n(next.f5277q.f5318p), next.f5277q.g0());
                        p pVar3 = next.u;
                        if (pVar3 != null) {
                            R(new p(pVar3, j8), i7Var2);
                        }
                        i iVar3 = this.f5850q;
                        E(iVar3);
                        iVar3.I(str2, next.f5277q.f5318p);
                    }
                }
                i iVar4 = this.f5850q;
                E(iVar4);
                m.e(str2);
                iVar4.g();
                iVar4.h();
                if (i10 < 0) {
                    g3 g3Var2 = iVar4.f5649o.w;
                    i4.n(g3Var2);
                    g3Var2.w.c(g3.p(str2), Long.valueOf(j8), "Invalid time querying expired conditional properties");
                    list2 = Collections.emptyList();
                } else {
                    list2 = iVar4.K("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j8)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (b next2 : list2) {
                    if (next2 != null) {
                        e3 e3Var3 = e().B;
                        String str5 = next2.f5275o;
                        b3 b3Var3 = i4Var.A;
                        i4.l(b3Var3);
                        e3Var3.d("User property expired", str5, b3Var3.n(next2.f5277q.f5318p), next2.f5277q.g0());
                        i iVar5 = this.f5850q;
                        E(iVar5);
                        iVar5.B(str2, next2.f5277q.f5318p);
                        p pVar4 = next2.f5283y;
                        if (pVar4 != null) {
                            arrayList.add(pVar4);
                        }
                        i iVar6 = this.f5850q;
                        E(iVar6);
                        iVar6.I(str2, next2.f5277q.f5318p);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    R(new p((p) it2.next(), j8), i7Var2);
                }
                i iVar7 = this.f5850q;
                E(iVar7);
                i4 i4Var2 = iVar7.f5649o;
                String str6 = pVar2.f5621o;
                m.e(str2);
                m.e(str6);
                iVar7.g();
                iVar7.h();
                if (i10 < 0) {
                    g3 g3Var3 = i4Var2.w;
                    i4.n(g3Var3);
                    e3 e3Var4 = g3Var3.w;
                    f3 p11 = g3.p(str2);
                    b3 b3Var4 = i4Var2.A;
                    i4.l(b3Var4);
                    e3Var4.d("Invalid time querying triggered conditional properties", p11, b3Var4.l(str6), Long.valueOf(j8));
                    list3 = Collections.emptyList();
                } else {
                    list3 = iVar7.K("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str6, String.valueOf(j8)});
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                Iterator<b> it3 = list3.iterator();
                while (it3.hasNext()) {
                    b next3 = it3.next();
                    if (next3 != null) {
                        c7 c7Var = next3.f5277q;
                        String str7 = next3.f5275o;
                        m.h(str7);
                        String str8 = next3.f5276p;
                        String str9 = c7Var.f5318p;
                        Object g02 = c7Var.g0();
                        m.h(g02);
                        Iterator<b> it4 = it3;
                        e7 e7Var = r5;
                        e7 e7Var2 = new e7(str7, str8, str9, j8, g02);
                        Object obj = e7Var.f5365e;
                        String str10 = e7Var.f5364c;
                        i iVar8 = this.f5850q;
                        E(iVar8);
                        if (iVar8.C(e7Var)) {
                            e3Var = e().B;
                            str = "User property triggered";
                            p10 = next3.f5275o;
                            b3Var = i4Var.A;
                            i4.l(b3Var);
                        } else {
                            e3Var = e().f5397t;
                            str = "Too many active user properties, ignoring";
                            p10 = g3.p(next3.f5275o);
                            b3Var = i4Var.A;
                            i4.l(b3Var);
                        }
                        e3Var.d(str, p10, b3Var.n(str10), obj);
                        p pVar5 = next3.w;
                        if (pVar5 != null) {
                            arrayList2.add(pVar5);
                        }
                        next3.f5277q = new c7(e7Var);
                        next3.f5279s = true;
                        i iVar9 = this.f5850q;
                        E(iVar9);
                        iVar9.G(next3);
                        it3 = it4;
                    }
                }
                R(pVar2, i7Var2);
                Iterator it5 = arrayList2.iterator();
                while (it5.hasNext()) {
                    R(new p((p) it5.next(), j8), i7Var2);
                }
                i iVar10 = this.f5850q;
                E(iVar10);
                iVar10.w();
            } finally {
                i iVar11 = this.f5850q;
                E(iVar11);
                iVar11.x();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0893, code lost:
        if (android.text.TextUtils.isEmpty(r33) == false) goto L_0x0895;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0398 A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03e9 A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03ec A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0458 A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0485  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0603 A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x063e A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x06e2 A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x074b A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x075c A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x076f A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0786 A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x079a A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x07a2 A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x07b6 A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x07c3 A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x07db A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x07ee A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0802 A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x081d A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0839 A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0881 A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x08a2 A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x08b9 A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x08db A[SYNTHETIC, Splitter:B:286:0x08db] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x096e A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0985 A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x09e9 A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0a03 A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0a1d A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x0a36 A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x0a50 A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x0a5b A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0a82 A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x0b04 A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x0b1b A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0b43 A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x0c58 A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x0cb8 A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x0cd9 A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }, LOOP:4: B:434:0x0cd3->B:436:0x0cd9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x0d44 A[Catch:{ SQLiteException -> 0x0d5d }] */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x0d58  */
    /* JADX WARNING: Removed duplicated region for block: B:477:0x0c6c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0217 A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0229 A[SYNTHETIC, Splitter:B:60:0x0229] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x028b A[SYNTHETIC, Splitter:B:74:0x028b] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x029d A[Catch:{ NumberFormatException -> 0x094c, all -> 0x0ddb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R(h5.p r44, h5.i7 r45) {
        /*
            r43 = this;
            r1 = r43
            r2 = r44
            r3 = r45
            java.lang.String r4 = "raw_events"
            java.lang.String r5 = "_sno"
            n4.m.h(r45)
            java.lang.String r6 = r3.f5470q
            java.lang.String r7 = r3.f5471r
            java.lang.String r8 = r3.f5468o
            n4.m.e(r8)
            long r9 = java.lang.System.nanoTime()
            h5.h4 r11 = r43.f()
            r11.g()
            r43.K()
            java.lang.String r11 = r3.f5468o
            h5.b7 r15 = r1.u
            E(r15)
            java.lang.String r14 = r3.f5469p
            boolean r12 = android.text.TextUtils.isEmpty(r14)
            r29 = 1
            r30 = r9
            java.lang.String r9 = r3.E
            if (r12 == 0) goto L_0x0041
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 == 0) goto L_0x0041
            r10 = 0
            goto L_0x0043
        L_0x0041:
            r10 = r29
        L_0x0043:
            if (r10 != 0) goto L_0x0046
            return
        L_0x0046:
            boolean r10 = r3.f5474v
            if (r10 == 0) goto L_0x0de6
            h5.c4 r12 = r1.f5848o
            E(r12)
            java.lang.String r13 = r2.f5621o
            boolean r17 = r12.n(r11, r13)
            r32 = r10
            h5.w6 r10 = r1.O
            r33 = r9
            java.lang.String r9 = "_err"
            r34 = r6
            h5.i4 r6 = r1.f5856y
            if (r17 == 0) goto L_0x011b
            h5.g3 r3 = r43.e()
            h5.e3 r3 = r3.l()
            h5.f3 r4 = h5.g3.p(r11)
            h5.b3 r5 = r6.p()
            java.lang.String r5 = r5.l(r13)
            java.lang.String r6 = "Dropping blacklisted event. appId"
            r3.c(r4, r5, r6)
            E(r12)
            java.lang.String r3 = "measurement.upload.blacklist_internal"
            java.lang.String r3 = r12.b(r11, r3)
            java.lang.String r4 = "1"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x00c2
            E(r12)
            java.lang.String r3 = "measurement.upload.blacklist_public"
            java.lang.String r3 = r12.b(r11, r3)
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x009d
            goto L_0x00c2
        L_0x009d:
            boolean r3 = r9.equals(r13)
            if (r3 != 0) goto L_0x011a
            h5.g7 r12 = r43.J()
            r15 = 11
            java.lang.String r16 = "_ev"
            java.lang.String r2 = r2.f5621o
            r18 = 0
            h5.e r3 = r43.F()
            h5.s2<java.lang.Boolean> r4 = h5.u2.t0
            r5 = 0
            boolean r19 = r3.m(r5, r4)
            r13 = r10
            r14 = r11
            r17 = r2
            r12.w(r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x00c2:
            h5.i r2 = r1.f5850q
            E(r2)
            h5.m4 r2 = r2.L(r11)
            if (r2 == 0) goto L_0x011a
            h5.i4 r3 = r2.f5555a
            h5.h4 r4 = r3.f5459x
            h5.i4.n(r4)
            r4.g()
            long r4 = r2.F
            h5.h4 r3 = r3.f5459x
            h5.i4.n(r3)
            r3.g()
            long r6 = r2.E
            long r3 = java.lang.Math.max(r4, r6)
            r4.c r5 = r43.c()
            r4.d r5 = (r4.d) r5
            long r5 = r5.a()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r43.F()
            h5.s2<java.lang.Long> r5 = h5.u2.f5749y
            r6 = 0
            java.lang.Object r5 = r5.a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x011a
            h5.g3 r3 = r43.e()
            h5.e3 r3 = r3.n()
            java.lang.String r4 = "Fetching config for blacklisted app"
            r3.a(r4)
            r1.h(r2)
        L_0x011a:
            return
        L_0x011b:
            h5.h3 r13 = new h5.h3
            r23 = r12
            java.lang.String r12 = r2.f5621o
            r24 = r14
            java.lang.String r14 = r2.f5623q
            r25 = r15
            h5.n r15 = r2.f5622p
            android.os.Bundle r15 = r15.h0()
            r35 = r4
            r26 = r5
            long r4 = r2.f5624r
            r17 = r13
            r18 = r4
            r20 = r15
            r21 = r12
            r22 = r14
            r17.<init>(r18, r20, r21, r22)
            h5.g7 r2 = r43.J()
            r36 = r7
            h5.e r7 = r43.F()
            r7.getClass()
            r37 = r8
            h5.s2<java.lang.Integer> r8 = h5.u2.H
            int r7 = r7.l(r11, r8)
            r8 = 100
            int r7 = java.lang.Math.min(r7, r8)
            r8 = 25
            int r7 = java.lang.Math.max(r7, r8)
            r2.q(r13, r7)
            h5.p r2 = new h5.p
            h5.n r7 = new h5.n
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>(r15)
            r7.<init>(r8)
            r17 = r2
            r18 = r12
            r19 = r7
            r20 = r14
            r21 = r4
            r17.<init>(r18, r19, r20, r21)
            h5.g3 r4 = r43.e()
            java.lang.String r4 = r4.r()
            r5 = 2
            boolean r4 = android.util.Log.isLoggable(r4, r5)
            java.lang.String r7 = r2.f5623q
            h5.n r8 = r2.f5622p
            java.lang.String r15 = r2.f5621o
            if (r4 == 0) goto L_0x01e7
            h5.g3 r4 = r43.e()
            h5.e3 r4 = r4.o()
            h5.b3 r12 = r6.p()
            boolean r13 = r12.k()
            if (r13 != 0) goto L_0x01a9
            java.lang.String r12 = r2.toString()
            goto L_0x01e2
        L_0x01a9:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "origin="
            r13.<init>(r14)
            r13.append(r7)
            java.lang.String r14 = ",name="
            r13.append(r14)
            java.lang.String r14 = r12.l(r15)
            r13.append(r14)
            java.lang.String r14 = ",params="
            r13.append(r14)
            if (r8 != 0) goto L_0x01c8
            r12 = 0
            goto L_0x01db
        L_0x01c8:
            boolean r14 = r12.k()
            if (r14 != 0) goto L_0x01d3
            java.lang.String r12 = r8.toString()
            goto L_0x01db
        L_0x01d3:
            android.os.Bundle r14 = r8.h0()
            java.lang.String r12 = r12.o(r14)
        L_0x01db:
            r13.append(r12)
            java.lang.String r12 = r13.toString()
        L_0x01e2:
            java.lang.String r13 = "Logging event"
            r4.b(r12, r13)
        L_0x01e7:
            h5.i r4 = r1.f5850q
            E(r4)
            r4.v()
            r1.q(r3)     // Catch:{ all -> 0x0ddb }
            java.lang.String r4 = "ecommerce_purchase"
            boolean r4 = r4.equals(r15)     // Catch:{ all -> 0x0ddb }
            java.lang.String r12 = "refund"
            if (r4 != 0) goto L_0x020d
            java.lang.String r4 = "purchase"
            boolean r4 = r4.equals(r15)     // Catch:{ all -> 0x0ddb }
            if (r4 != 0) goto L_0x020d
            boolean r4 = r12.equals(r15)     // Catch:{ all -> 0x0ddb }
            if (r4 == 0) goto L_0x020b
            goto L_0x020d
        L_0x020b:
            r4 = 0
            goto L_0x020f
        L_0x020d:
            r4 = r29
        L_0x020f:
            java.lang.String r13 = "_iap"
            boolean r13 = r13.equals(r15)     // Catch:{ all -> 0x0ddb }
            if (r13 != 0) goto L_0x021b
            if (r4 == 0) goto L_0x03d2
            r4 = r29
        L_0x021b:
            java.lang.String r13 = "currency"
            android.os.Bundle r14 = r8.f5587o     // Catch:{ all -> 0x0ddb }
            java.lang.String r13 = r14.getString(r13)     // Catch:{ all -> 0x0ddb }
            java.lang.String r14 = "value"
            android.os.Bundle r5 = r8.f5587o
            if (r4 == 0) goto L_0x028b
            java.lang.Double r4 = r8.g0()     // Catch:{ all -> 0x0ddb }
            double r17 = r4.doubleValue()     // Catch:{ all -> 0x0ddb }
            r19 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r17 = r17 * r19
            r21 = 0
            int r4 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r4 != 0) goto L_0x024d
            long r4 = r5.getLong(r14)     // Catch:{ all -> 0x0ddb }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0ddb }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0ddb }
            double r4 = (double) r4     // Catch:{ all -> 0x0ddb }
            double r17 = r4 * r19
        L_0x024d:
            r4 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r4 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0265
            r4 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r4 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x0265
            long r4 = java.lang.Math.round(r17)     // Catch:{ all -> 0x0ddb }
            boolean r12 = r12.equals(r15)     // Catch:{ all -> 0x0ddb }
            if (r12 == 0) goto L_0x0297
            long r4 = -r4
            goto L_0x0297
        L_0x0265:
            h5.g3 r2 = r43.e()     // Catch:{ all -> 0x0ddb }
            h5.e3 r2 = r2.l()     // Catch:{ all -> 0x0ddb }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            h5.f3 r4 = h5.g3.p(r11)     // Catch:{ all -> 0x0ddb }
            java.lang.Double r5 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x0ddb }
            r2.c(r4, r5, r3)     // Catch:{ all -> 0x0ddb }
            h5.i r2 = r1.f5850q     // Catch:{ all -> 0x0ddb }
            E(r2)     // Catch:{ all -> 0x0ddb }
            r2.w()     // Catch:{ all -> 0x0ddb }
            h5.i r2 = r1.f5850q
            E(r2)
            r2.x()
            return
        L_0x028b:
            long r4 = r5.getLong(r14)     // Catch:{ all -> 0x0ddb }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0ddb }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0ddb }
        L_0x0297:
            boolean r12 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0ddb }
            if (r12 != 0) goto L_0x03d2
            java.util.Locale r12 = java.util.Locale.US     // Catch:{ all -> 0x0ddb }
            java.lang.String r12 = r13.toUpperCase(r12)     // Catch:{ all -> 0x0ddb }
            java.lang.String r13 = "[A-Z]{3}"
            boolean r13 = r12.matches(r13)     // Catch:{ all -> 0x0ddb }
            if (r13 == 0) goto L_0x03d2
            java.lang.String r13 = "_ltv_"
            int r14 = r12.length()     // Catch:{ all -> 0x0ddb }
            if (r14 == 0) goto L_0x02b9
            java.lang.String r12 = r13.concat(r12)     // Catch:{ all -> 0x0ddb }
        L_0x02b7:
            r14 = r12
            goto L_0x02bf
        L_0x02b9:
            java.lang.String r12 = new java.lang.String     // Catch:{ all -> 0x0ddb }
            r12.<init>(r13)     // Catch:{ all -> 0x0ddb }
            goto L_0x02b7
        L_0x02bf:
            h5.i r12 = r1.f5850q     // Catch:{ all -> 0x0ddb }
            E(r12)     // Catch:{ all -> 0x0ddb }
            h5.e7 r12 = r12.D(r11, r14)     // Catch:{ all -> 0x0ddb }
            if (r12 == 0) goto L_0x0307
            java.lang.Object r12 = r12.f5365e     // Catch:{ all -> 0x0ddb }
            boolean r13 = r12 instanceof java.lang.Long     // Catch:{ all -> 0x0ddb }
            if (r13 != 0) goto L_0x02d1
            goto L_0x0307
        L_0x02d1:
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x0ddb }
            long r12 = r12.longValue()     // Catch:{ all -> 0x0ddb }
            h5.e7 r19 = new h5.e7     // Catch:{ all -> 0x0ddb }
            r17 = r14
            java.lang.String r14 = r2.f5623q     // Catch:{ all -> 0x0ddb }
            r4.c r18 = r43.c()     // Catch:{ all -> 0x0ddb }
            r4.d r18 = (r4.d) r18     // Catch:{ all -> 0x0ddb }
            long r20 = r18.a()     // Catch:{ all -> 0x0ddb }
            long r12 = r12 + r4
            java.lang.Long r18 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0ddb }
            r4 = r23
            r12 = r19
            r5 = 0
            r13 = r11
            r16 = r17
            r38 = r24
            r23 = r15
            r39 = r25
            r15 = r16
            r16 = r20
            r12.<init>(r13, r14, r15, r16, r18)     // Catch:{ all -> 0x0ddb }
            r40 = r4
        L_0x0303:
            r4 = r19
            goto L_0x038d
        L_0x0307:
            r16 = r14
            r14 = r23
            r38 = r24
            r39 = r25
            r23 = r15
            r15 = 0
            h5.i r12 = r1.f5850q     // Catch:{ all -> 0x0ddb }
            E(r12)     // Catch:{ all -> 0x0ddb }
            h5.e r13 = r43.F()     // Catch:{ all -> 0x0ddb }
            h5.s2<java.lang.Integer> r15 = h5.u2.D     // Catch:{ all -> 0x0ddb }
            int r13 = r13.l(r11, r15)     // Catch:{ all -> 0x0ddb }
            int r13 = r13 + -1
            n4.m.e(r11)     // Catch:{ all -> 0x0ddb }
            r12.g()     // Catch:{ all -> 0x0ddb }
            r12.h()     // Catch:{ all -> 0x0ddb }
            android.database.sqlite.SQLiteDatabase r15 = r12.y()     // Catch:{ SQLiteException -> 0x034e }
            r18 = r14
            r14 = 3
            java.lang.String[] r14 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x034c }
            r17 = 0
            r14[r17] = r11     // Catch:{ SQLiteException -> 0x0349 }
            r14[r29] = r11     // Catch:{ SQLiteException -> 0x0349 }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ SQLiteException -> 0x0349 }
            r19 = 2
            r14[r19] = r13     // Catch:{ SQLiteException -> 0x0349 }
            java.lang.String r13 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r15.execSQL(r13, r14)     // Catch:{ SQLiteException -> 0x0349 }
            goto L_0x0367
        L_0x0349:
            r0 = move-exception
        L_0x034a:
            r13 = r0
            goto L_0x0354
        L_0x034c:
            r0 = move-exception
            goto L_0x0351
        L_0x034e:
            r0 = move-exception
            r18 = r14
        L_0x0351:
            r17 = 0
            goto L_0x034a
        L_0x0354:
            h5.i4 r12 = r12.f5649o     // Catch:{ all -> 0x0ddb }
            h5.g3 r12 = r12.e()     // Catch:{ all -> 0x0ddb }
            h5.e3 r12 = r12.k()     // Catch:{ all -> 0x0ddb }
            java.lang.String r14 = "Error pruning currencies. appId"
            h5.f3 r15 = h5.g3.p(r11)     // Catch:{ all -> 0x0ddb }
            r12.c(r15, r13, r14)     // Catch:{ all -> 0x0ddb }
        L_0x0367:
            h5.e7 r19 = new h5.e7     // Catch:{ all -> 0x0ddb }
            java.lang.String r14 = r2.f5623q     // Catch:{ all -> 0x0ddb }
            r4.c r12 = r43.c()     // Catch:{ all -> 0x0ddb }
            r4.d r12 = (r4.d) r12     // Catch:{ all -> 0x0ddb }
            long r20 = r12.a()     // Catch:{ all -> 0x0ddb }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0ddb }
            r12 = r19
            r13 = r11
            r5 = r18
            r40 = r5
            r5 = r17
            r15 = r16
            r16 = r20
            r18 = r4
            r12.<init>(r13, r14, r15, r16, r18)     // Catch:{ all -> 0x0ddb }
            goto L_0x0303
        L_0x038d:
            h5.i r12 = r1.f5850q     // Catch:{ all -> 0x0ddb }
            E(r12)     // Catch:{ all -> 0x0ddb }
            boolean r12 = r12.C(r4)     // Catch:{ all -> 0x0ddb }
            if (r12 != 0) goto L_0x03da
            h5.g3 r12 = r43.e()     // Catch:{ all -> 0x0ddb }
            h5.e3 r12 = r12.k()     // Catch:{ all -> 0x0ddb }
            java.lang.String r13 = "Too many unique user properties are set. Ignoring user property. appId"
            h5.f3 r14 = h5.g3.p(r11)     // Catch:{ all -> 0x0ddb }
            h5.b3 r15 = r6.p()     // Catch:{ all -> 0x0ddb }
            java.lang.String r5 = r4.f5364c     // Catch:{ all -> 0x0ddb }
            java.lang.String r5 = r15.n(r5)     // Catch:{ all -> 0x0ddb }
            java.lang.Object r4 = r4.f5365e     // Catch:{ all -> 0x0ddb }
            r12.d(r13, r14, r5, r4)     // Catch:{ all -> 0x0ddb }
            h5.g7 r12 = r43.J()     // Catch:{ all -> 0x0ddb }
            h5.e r4 = r43.F()     // Catch:{ all -> 0x0ddb }
            h5.s2<java.lang.Boolean> r5 = h5.u2.t0     // Catch:{ all -> 0x0ddb }
            r13 = 0
            boolean r19 = r4.m(r13, r5)     // Catch:{ all -> 0x0ddb }
            r15 = 9
            r16 = 0
            r17 = 0
            r18 = 0
            r13 = r10
            r14 = r11
            r12.w(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0ddb }
            goto L_0x03da
        L_0x03d2:
            r40 = r23
            r38 = r24
            r39 = r25
            r23 = r15
        L_0x03da:
            boolean r4 = h5.g7.Y(r23)     // Catch:{ all -> 0x0ddb }
            r5 = r23
            boolean r9 = r9.equals(r5)     // Catch:{ all -> 0x0ddb }
            r43.J()     // Catch:{ all -> 0x0ddb }
            if (r8 != 0) goto L_0x03ec
            r15 = 0
            goto L_0x0416
        L_0x03ec:
            android.os.Bundle r12 = r8.f5587o     // Catch:{ all -> 0x0ddb }
            java.util.Set r12 = r12.keySet()     // Catch:{ all -> 0x0ddb }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x0ddb }
            r15 = 0
        L_0x03f8:
            boolean r17 = r12.hasNext()     // Catch:{ all -> 0x0ddb }
            if (r17 == 0) goto L_0x0416
            java.lang.Object r17 = r12.next()     // Catch:{ all -> 0x0ddb }
            r13 = r17
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0ddb }
            android.os.Bundle r14 = r8.f5587o     // Catch:{ all -> 0x0ddb }
            java.lang.Object r13 = r14.get(r13)     // Catch:{ all -> 0x0ddb }
            boolean r14 = r13 instanceof android.os.Parcelable[]     // Catch:{ all -> 0x0ddb }
            if (r14 == 0) goto L_0x03f8
            android.os.Parcelable[] r13 = (android.os.Parcelable[]) r13     // Catch:{ all -> 0x0ddb }
            int r13 = r13.length     // Catch:{ all -> 0x0ddb }
            long r13 = (long) r13     // Catch:{ all -> 0x0ddb }
            long r15 = r15 + r13
            goto L_0x03f8
        L_0x0416:
            r23 = 1
            long r16 = r15 + r23
            h5.i r12 = r1.f5850q     // Catch:{ all -> 0x0ddb }
            E(r12)     // Catch:{ all -> 0x0ddb }
            long r13 = r43.N()     // Catch:{ all -> 0x0ddb }
            r20 = 1
            r21 = 0
            r22 = 0
            r25 = r5
            r41 = r6
            r5 = 0
            r15 = r11
            r18 = r20
            r19 = r4
            r20 = r21
            r21 = r9
            h5.g r12 = r12.O(r13, r15, r16, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0ddb }
            long r13 = r12.f5388b     // Catch:{ all -> 0x0ddb }
            r43.F()     // Catch:{ all -> 0x0ddb }
            h5.s2<java.lang.Integer> r15 = h5.u2.f5726k     // Catch:{ all -> 0x0ddb }
            r5 = 0
            java.lang.Object r6 = r15.a(r5)     // Catch:{ all -> 0x0ddb }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0ddb }
            int r5 = r6.intValue()     // Catch:{ all -> 0x0ddb }
            long r5 = (long) r5     // Catch:{ all -> 0x0ddb }
            long r13 = r13 - r5
            r5 = 0
            int r15 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            r5 = 1000(0x3e8, double:4.94E-321)
            if (r15 <= 0) goto L_0x0485
            long r13 = r13 % r5
            int r2 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
            if (r2 != 0) goto L_0x0474
            h5.g3 r2 = r43.e()     // Catch:{ all -> 0x0ddb }
            h5.e3 r2 = r2.k()     // Catch:{ all -> 0x0ddb }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            h5.f3 r4 = h5.g3.p(r11)     // Catch:{ all -> 0x0ddb }
            long r5 = r12.f5388b     // Catch:{ all -> 0x0ddb }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0ddb }
            r2.c(r4, r5, r3)     // Catch:{ all -> 0x0ddb }
        L_0x0474:
            h5.i r2 = r1.f5850q     // Catch:{ all -> 0x0ddb }
            E(r2)     // Catch:{ all -> 0x0ddb }
            r2.w()     // Catch:{ all -> 0x0ddb }
            h5.i r2 = r1.f5850q
            E(r2)
            r2.x()
            return
        L_0x0485:
            if (r4 == 0) goto L_0x04ee
            long r13 = r12.f5387a     // Catch:{ all -> 0x0ddb }
            r43.F()     // Catch:{ all -> 0x0ddb }
            h5.s2<java.lang.Integer> r15 = h5.u2.f5729m     // Catch:{ all -> 0x0ddb }
            r5 = 0
            java.lang.Object r6 = r15.a(r5)     // Catch:{ all -> 0x0ddb }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0ddb }
            int r5 = r6.intValue()     // Catch:{ all -> 0x0ddb }
            long r5 = (long) r5     // Catch:{ all -> 0x0ddb }
            long r13 = r13 - r5
            r5 = 0
            int r15 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r15 <= 0) goto L_0x04ee
            r5 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 % r5
            int r3 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
            if (r3 != 0) goto L_0x04bf
            h5.g3 r3 = r43.e()     // Catch:{ all -> 0x0ddb }
            h5.e3 r3 = r3.k()     // Catch:{ all -> 0x0ddb }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            h5.f3 r5 = h5.g3.p(r11)     // Catch:{ all -> 0x0ddb }
            long r6 = r12.f5387a     // Catch:{ all -> 0x0ddb }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0ddb }
            r3.c(r5, r6, r4)     // Catch:{ all -> 0x0ddb }
        L_0x04bf:
            h5.g7 r12 = r43.J()     // Catch:{ all -> 0x0ddb }
            java.lang.String r16 = "_ev"
            java.lang.String r2 = r2.f5621o     // Catch:{ all -> 0x0ddb }
            h5.e r3 = r43.F()     // Catch:{ all -> 0x0ddb }
            h5.s2<java.lang.Boolean> r4 = h5.u2.t0     // Catch:{ all -> 0x0ddb }
            r5 = 0
            boolean r19 = r3.m(r5, r4)     // Catch:{ all -> 0x0ddb }
            r15 = 16
            r18 = 0
            r13 = r10
            r14 = r11
            r17 = r2
            r12.w(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0ddb }
            h5.i r2 = r1.f5850q     // Catch:{ all -> 0x0ddb }
            E(r2)     // Catch:{ all -> 0x0ddb }
            r2.w()     // Catch:{ all -> 0x0ddb }
            h5.i r2 = r1.f5850q
            E(r2)
            r2.x()
            return
        L_0x04ee:
            r5 = 1000000(0xf4240, float:1.401298E-39)
            if (r9 == 0) goto L_0x053e
            long r13 = r12.d     // Catch:{ all -> 0x0ddb }
            h5.e r6 = r43.F()     // Catch:{ all -> 0x0ddb }
            h5.s2<java.lang.Integer> r9 = h5.u2.l     // Catch:{ all -> 0x0ddb }
            r15 = r37
            int r6 = r6.l(r15, r9)     // Catch:{ all -> 0x0ddb }
            int r6 = java.lang.Math.min(r5, r6)     // Catch:{ all -> 0x0ddb }
            r9 = 0
            int r6 = java.lang.Math.max(r9, r6)     // Catch:{ all -> 0x0ddb }
            long r5 = (long) r6     // Catch:{ all -> 0x0ddb }
            long r13 = r13 - r5
            r5 = 0
            int r16 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r16 <= 0) goto L_0x0540
            int r2 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
            if (r2 != 0) goto L_0x052d
            h5.g3 r2 = r43.e()     // Catch:{ all -> 0x0ddb }
            h5.e3 r2 = r2.k()     // Catch:{ all -> 0x0ddb }
            java.lang.String r3 = "Too many error events logged. appId, count"
            h5.f3 r4 = h5.g3.p(r11)     // Catch:{ all -> 0x0ddb }
            long r5 = r12.d     // Catch:{ all -> 0x0ddb }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0ddb }
            r2.c(r4, r5, r3)     // Catch:{ all -> 0x0ddb }
        L_0x052d:
            h5.i r2 = r1.f5850q     // Catch:{ all -> 0x0ddb }
            E(r2)     // Catch:{ all -> 0x0ddb }
            r2.w()     // Catch:{ all -> 0x0ddb }
            h5.i r2 = r1.f5850q
            E(r2)
            r2.x()
            return
        L_0x053e:
            r15 = r37
        L_0x0540:
            android.os.Bundle r5 = r8.h0()     // Catch:{ all -> 0x0ddb }
            h5.g7 r6 = r43.J()     // Catch:{ all -> 0x0ddb }
            java.lang.String r8 = "_o"
            r6.v(r5, r8, r7)     // Catch:{ all -> 0x0ddb }
            h5.g7 r6 = r43.J()     // Catch:{ all -> 0x0ddb }
            boolean r7 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0ddb }
            if (r7 == 0) goto L_0x0559
            r13 = 0
            goto L_0x0567
        L_0x0559:
            h5.i4 r6 = r6.f5649o     // Catch:{ all -> 0x0ddb }
            h5.e r6 = r6.u     // Catch:{ all -> 0x0ddb }
            java.lang.String r7 = "debug.firebase.analytics.app"
            java.lang.String r6 = r6.h(r7)     // Catch:{ all -> 0x0ddb }
            boolean r13 = r6.equals(r11)     // Catch:{ all -> 0x0ddb }
        L_0x0567:
            java.lang.String r6 = "_r"
            if (r13 == 0) goto L_0x057f
            h5.g7 r7 = r43.J()     // Catch:{ all -> 0x0ddb }
            java.lang.Long r8 = java.lang.Long.valueOf(r23)     // Catch:{ all -> 0x0ddb }
            java.lang.String r12 = "_dbg"
            r7.v(r5, r12, r8)     // Catch:{ all -> 0x0ddb }
            h5.g7 r7 = r43.J()     // Catch:{ all -> 0x0ddb }
            r7.v(r5, r6, r8)     // Catch:{ all -> 0x0ddb }
        L_0x057f:
            java.lang.String r7 = "_s"
            r8 = r25
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0ddb }
            if (r7 == 0) goto L_0x05a5
            h5.i r7 = r1.f5850q     // Catch:{ all -> 0x0ddb }
            E(r7)     // Catch:{ all -> 0x0ddb }
            r8 = r26
            h5.e7 r7 = r7.D(r15, r8)     // Catch:{ all -> 0x0ddb }
            if (r7 == 0) goto L_0x05a5
            java.lang.Object r12 = r7.f5365e     // Catch:{ all -> 0x0ddb }
            boolean r12 = r12 instanceof java.lang.Long     // Catch:{ all -> 0x0ddb }
            if (r12 == 0) goto L_0x05a5
            h5.g7 r12 = r43.J()     // Catch:{ all -> 0x0ddb }
            java.lang.Object r7 = r7.f5365e     // Catch:{ all -> 0x0ddb }
            r12.v(r5, r8, r7)     // Catch:{ all -> 0x0ddb }
        L_0x05a5:
            h5.i r7 = r1.f5850q     // Catch:{ all -> 0x0ddb }
            E(r7)     // Catch:{ all -> 0x0ddb }
            h5.i4 r8 = r7.f5649o
            n4.m.e(r11)     // Catch:{ all -> 0x0ddb }
            r7.g()     // Catch:{ all -> 0x0ddb }
            r7.h()     // Catch:{ all -> 0x0ddb }
            android.database.sqlite.SQLiteDatabase r7 = r7.y()     // Catch:{ SQLiteException -> 0x05e6 }
            h5.e r12 = r8.o()     // Catch:{ SQLiteException -> 0x05e6 }
            h5.s2<java.lang.Integer> r13 = h5.u2.f5735p     // Catch:{ SQLiteException -> 0x05e6 }
            int r12 = r12.l(r11, r13)     // Catch:{ SQLiteException -> 0x05e6 }
            r9 = 1000000(0xf4240, float:1.401298E-39)
            int r9 = java.lang.Math.min(r9, r12)     // Catch:{ SQLiteException -> 0x05e6 }
            r12 = 0
            int r9 = java.lang.Math.max(r12, r9)     // Catch:{ SQLiteException -> 0x05e6 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x05e6 }
            r13 = 2
            java.lang.String[] r13 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x05e6 }
            r13[r12] = r11     // Catch:{ SQLiteException -> 0x05e6 }
            r13[r29] = r9     // Catch:{ SQLiteException -> 0x05e6 }
            java.lang.String r9 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            r14 = r35
            int r7 = r7.delete(r14, r9, r13)     // Catch:{ SQLiteException -> 0x05e4 }
            long r7 = (long) r7
            goto L_0x05fd
        L_0x05e4:
            r0 = move-exception
            goto L_0x05e9
        L_0x05e6:
            r0 = move-exception
            r14 = r35
        L_0x05e9:
            r7 = r0
            h5.g3 r8 = r8.e()     // Catch:{ all -> 0x0ddb }
            h5.e3 r8 = r8.k()     // Catch:{ all -> 0x0ddb }
            java.lang.String r9 = "Error deleting over the limit events. appId"
            h5.f3 r12 = h5.g3.p(r11)     // Catch:{ all -> 0x0ddb }
            r8.c(r12, r7, r9)     // Catch:{ all -> 0x0ddb }
            r7 = 0
        L_0x05fd:
            r12 = 0
            int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r9 <= 0) goto L_0x0618
            h5.g3 r9 = r43.e()     // Catch:{ all -> 0x0ddb }
            h5.e3 r9 = r9.l()     // Catch:{ all -> 0x0ddb }
            java.lang.String r12 = "Data lost. Too many events stored on disk, deleted. appId"
            h5.f3 r13 = h5.g3.p(r11)     // Catch:{ all -> 0x0ddb }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0ddb }
            r9.c(r13, r7, r12)     // Catch:{ all -> 0x0ddb }
        L_0x0618:
            h5.l r7 = new h5.l     // Catch:{ all -> 0x0ddb }
            h5.i4 r13 = r1.f5856y     // Catch:{ all -> 0x0ddb }
            java.lang.String r8 = r2.f5623q     // Catch:{ all -> 0x0ddb }
            java.lang.String r9 = r2.f5621o     // Catch:{ all -> 0x0ddb }
            long r2 = r2.f5624r     // Catch:{ all -> 0x0ddb }
            r12 = r7
            r42 = r14
            r14 = r8
            r8 = r15
            r15 = r11
            r16 = r9
            r17 = r2
            r19 = r5
            r12.<init>(r13, r14, r15, r16, r17, r19)     // Catch:{ all -> 0x0ddb }
            java.lang.String r2 = r7.f5519b     // Catch:{ all -> 0x0ddb }
            h5.i r3 = r1.f5850q     // Catch:{ all -> 0x0ddb }
            E(r3)     // Catch:{ all -> 0x0ddb }
            h5.m r3 = r3.z(r11, r2)     // Catch:{ all -> 0x0ddb }
            if (r3 != 0) goto L_0x06e2
            h5.i r3 = r1.f5850q     // Catch:{ all -> 0x0ddb }
            E(r3)     // Catch:{ all -> 0x0ddb }
            long r12 = r3.o(r11)     // Catch:{ all -> 0x0ddb }
            h5.e r3 = r43.F()     // Catch:{ all -> 0x0ddb }
            r3.getClass()     // Catch:{ all -> 0x0ddb }
            h5.s2<java.lang.Integer> r5 = h5.u2.G     // Catch:{ all -> 0x0ddb }
            int r3 = r3.l(r11, r5)     // Catch:{ all -> 0x0ddb }
            r9 = 2000(0x7d0, float:2.803E-42)
            int r3 = java.lang.Math.min(r3, r9)     // Catch:{ all -> 0x0ddb }
            r9 = 500(0x1f4, float:7.0E-43)
            int r3 = java.lang.Math.max(r3, r9)     // Catch:{ all -> 0x0ddb }
            long r14 = (long) r3     // Catch:{ all -> 0x0ddb }
            int r3 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r3 < 0) goto L_0x06c0
            if (r4 == 0) goto L_0x06c0
            h5.g3 r3 = r43.e()     // Catch:{ all -> 0x0ddb }
            h5.e3 r3 = r3.k()     // Catch:{ all -> 0x0ddb }
            java.lang.String r4 = "Too many event names used, ignoring event. appId, name, supported count"
            h5.f3 r6 = h5.g3.p(r11)     // Catch:{ all -> 0x0ddb }
            h5.b3 r7 = r41.p()     // Catch:{ all -> 0x0ddb }
            java.lang.String r2 = r7.l(r2)     // Catch:{ all -> 0x0ddb }
            h5.e r7 = r43.F()     // Catch:{ all -> 0x0ddb }
            r7.getClass()     // Catch:{ all -> 0x0ddb }
            int r5 = r7.l(r11, r5)     // Catch:{ all -> 0x0ddb }
            r7 = 2000(0x7d0, float:2.803E-42)
            int r5 = java.lang.Math.min(r5, r7)     // Catch:{ all -> 0x0ddb }
            r7 = 500(0x1f4, float:7.0E-43)
            int r5 = java.lang.Math.max(r5, r7)     // Catch:{ all -> 0x0ddb }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0ddb }
            r3.d(r4, r6, r2, r5)     // Catch:{ all -> 0x0ddb }
            h5.g7 r12 = r43.J()     // Catch:{ all -> 0x0ddb }
            h5.e r2 = r43.F()     // Catch:{ all -> 0x0ddb }
            h5.s2<java.lang.Boolean> r3 = h5.u2.t0     // Catch:{ all -> 0x0ddb }
            r4 = 0
            boolean r19 = r2.m(r4, r3)     // Catch:{ all -> 0x0ddb }
            r15 = 8
            r16 = 0
            r17 = 0
            r18 = 0
            r13 = r10
            r14 = r11
            r12.w(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0ddb }
            h5.i r2 = r1.f5850q
            E(r2)
            r2.x()
            return
        L_0x06c0:
            h5.m r2 = new h5.m     // Catch:{ all -> 0x0ddb }
            java.lang.String r14 = r7.f5519b     // Catch:{ all -> 0x0ddb }
            long r3 = r7.d     // Catch:{ all -> 0x0ddb }
            r15 = 0
            r17 = 0
            r19 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r12 = r2
            r13 = r11
            r21 = r3
            r12.<init>(r13, r14, r15, r17, r19, r21, r23, r25, r26, r27, r28)     // Catch:{ all -> 0x0ddb }
            r44 = r6
            r37 = r8
            goto L_0x0723
        L_0x06e2:
            long r4 = r3.f5545f     // Catch:{ all -> 0x0ddb }
            r2 = r41
            h5.l r7 = r7.a(r2, r4)     // Catch:{ all -> 0x0ddb }
            long r4 = r7.d     // Catch:{ all -> 0x0ddb }
            h5.m r26 = new h5.m     // Catch:{ all -> 0x0ddb }
            java.lang.String r10 = r3.f5541a     // Catch:{ all -> 0x0ddb }
            java.lang.String r11 = r3.f5542b     // Catch:{ all -> 0x0ddb }
            long r12 = r3.f5543c     // Catch:{ all -> 0x0ddb }
            long r14 = r3.d     // Catch:{ all -> 0x0ddb }
            r44 = r6
            r27 = r7
            long r6 = r3.f5544e     // Catch:{ all -> 0x0ddb }
            r41 = r2
            long r1 = r3.f5546g     // Catch:{ all -> 0x0dd7 }
            java.lang.Long r9 = r3.f5547h     // Catch:{ all -> 0x0dd7 }
            r37 = r8
            java.lang.Long r8 = r3.f5548i     // Catch:{ all -> 0x0dd7 }
            r23 = r8
            java.lang.Long r8 = r3.f5549j     // Catch:{ all -> 0x0dd7 }
            java.lang.Boolean r3 = r3.f5550k     // Catch:{ all -> 0x0dd7 }
            r22 = r9
            r9 = r26
            r16 = r6
            r18 = r4
            r20 = r1
            r24 = r8
            r25 = r3
            r9.<init>(r10, r11, r12, r14, r16, r18, r20, r22, r23, r24, r25)     // Catch:{ all -> 0x0dd7 }
            r1 = r43
            r2 = r26
            r7 = r27
        L_0x0723:
            h5.i r3 = r1.f5850q     // Catch:{ all -> 0x0ddb }
            E(r3)     // Catch:{ all -> 0x0ddb }
            r3.A(r2)     // Catch:{ all -> 0x0ddb }
            h5.h4 r2 = r43.f()     // Catch:{ all -> 0x0ddb }
            r2.g()     // Catch:{ all -> 0x0ddb }
            r43.K()     // Catch:{ all -> 0x0ddb }
            java.lang.String r2 = r7.f5518a
            n4.m.e(r2)     // Catch:{ all -> 0x0ddb }
            r3 = r37
            boolean r4 = r2.equals(r3)     // Catch:{ all -> 0x0ddb }
            n4.m.b(r4)     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.e3 r4 = com.google.android.gms.internal.measurement.f3.B0()     // Catch:{ all -> 0x0ddb }
            boolean r5 = r4.f2636q     // Catch:{ all -> 0x0ddb }
            if (r5 == 0) goto L_0x0751
            r4.m()     // Catch:{ all -> 0x0ddb }
            r5 = 0
            r4.f2636q = r5     // Catch:{ all -> 0x0ddb }
        L_0x0751:
            MessageType r5 = r4.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3 r5 = (com.google.android.gms.internal.measurement.f3) r5     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3.D0(r5)     // Catch:{ all -> 0x0ddb }
            boolean r5 = r4.f2636q     // Catch:{ all -> 0x0ddb }
            if (r5 == 0) goto L_0x0762
            r4.m()     // Catch:{ all -> 0x0ddb }
            r5 = 0
            r4.f2636q = r5     // Catch:{ all -> 0x0ddb }
        L_0x0762:
            MessageType r5 = r4.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3 r5 = (com.google.android.gms.internal.measurement.f3) r5     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3.U(r5)     // Catch:{ all -> 0x0ddb }
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0ddb }
            if (r5 != 0) goto L_0x0780
            boolean r5 = r4.f2636q     // Catch:{ all -> 0x0ddb }
            if (r5 == 0) goto L_0x0779
            r4.m()     // Catch:{ all -> 0x0ddb }
            r5 = 0
            r4.f2636q = r5     // Catch:{ all -> 0x0ddb }
        L_0x0779:
            MessageType r5 = r4.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3 r5 = (com.google.android.gms.internal.measurement.f3) r5     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3.a0(r5, r3)     // Catch:{ all -> 0x0ddb }
        L_0x0780:
            boolean r5 = android.text.TextUtils.isEmpty(r36)     // Catch:{ all -> 0x0ddb }
            if (r5 != 0) goto L_0x079a
            boolean r5 = r4.f2636q     // Catch:{ all -> 0x0ddb }
            if (r5 == 0) goto L_0x0790
            r4.m()     // Catch:{ all -> 0x0ddb }
            r5 = 0
            r4.f2636q = r5     // Catch:{ all -> 0x0ddb }
        L_0x0790:
            MessageType r5 = r4.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3 r5 = (com.google.android.gms.internal.measurement.f3) r5     // Catch:{ all -> 0x0ddb }
            r6 = r36
            com.google.android.gms.internal.measurement.f3.Z(r5, r6)     // Catch:{ all -> 0x0ddb }
            goto L_0x079c
        L_0x079a:
            r6 = r36
        L_0x079c:
            boolean r5 = android.text.TextUtils.isEmpty(r34)     // Catch:{ all -> 0x0ddb }
            if (r5 != 0) goto L_0x07b6
            boolean r5 = r4.f2636q     // Catch:{ all -> 0x0ddb }
            if (r5 == 0) goto L_0x07ac
            r4.m()     // Catch:{ all -> 0x0ddb }
            r5 = 0
            r4.f2636q = r5     // Catch:{ all -> 0x0ddb }
        L_0x07ac:
            MessageType r5 = r4.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3 r5 = (com.google.android.gms.internal.measurement.f3) r5     // Catch:{ all -> 0x0ddb }
            r8 = r34
            com.google.android.gms.internal.measurement.f3.b0(r5, r8)     // Catch:{ all -> 0x0ddb }
            goto L_0x07b8
        L_0x07b6:
            r8 = r34
        L_0x07b8:
            r5 = r45
            long r9 = r5.f5475x     // Catch:{ all -> 0x0ddb }
            r11 = -2147483648(0xffffffff80000000, double:NaN)
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x07d5
            int r9 = (int) r9     // Catch:{ all -> 0x0ddb }
            boolean r10 = r4.f2636q     // Catch:{ all -> 0x0ddb }
            if (r10 == 0) goto L_0x07ce
            r4.m()     // Catch:{ all -> 0x0ddb }
            r10 = 0
            r4.f2636q = r10     // Catch:{ all -> 0x0ddb }
        L_0x07ce:
            MessageType r10 = r4.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3 r10 = (com.google.android.gms.internal.measurement.f3) r10     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3.V0(r10, r9)     // Catch:{ all -> 0x0ddb }
        L_0x07d5:
            long r9 = r5.f5472s     // Catch:{ all -> 0x0ddb }
            boolean r11 = r4.f2636q     // Catch:{ all -> 0x0ddb }
            if (r11 == 0) goto L_0x07e1
            r4.m()     // Catch:{ all -> 0x0ddb }
            r11 = 0
            r4.f2636q = r11     // Catch:{ all -> 0x0ddb }
        L_0x07e1:
            MessageType r11 = r4.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3 r11 = (com.google.android.gms.internal.measurement.f3) r11     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3.c0(r11, r9)     // Catch:{ all -> 0x0ddb }
            boolean r9 = android.text.TextUtils.isEmpty(r38)     // Catch:{ all -> 0x0ddb }
            if (r9 != 0) goto L_0x0802
            boolean r9 = r4.f2636q     // Catch:{ all -> 0x0ddb }
            if (r9 == 0) goto L_0x07f8
            r4.m()     // Catch:{ all -> 0x0ddb }
            r9 = 0
            r4.f2636q = r9     // Catch:{ all -> 0x0ddb }
        L_0x07f8:
            MessageType r9 = r4.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3 r9 = (com.google.android.gms.internal.measurement.f3) r9     // Catch:{ all -> 0x0ddb }
            r10 = r38
            com.google.android.gms.internal.measurement.f3.o0(r9, r10)     // Catch:{ all -> 0x0ddb }
            goto L_0x0804
        L_0x0802:
            r10 = r38
        L_0x0804:
            n4.m.h(r3)     // Catch:{ all -> 0x0ddb }
            h5.f r9 = r1.M(r3)     // Catch:{ all -> 0x0ddb }
            java.lang.String r11 = r5.J     // Catch:{ all -> 0x0ddb }
            h5.f r11 = h5.f.b(r11)     // Catch:{ all -> 0x0ddb }
            h5.f r9 = r9.f(r11)     // Catch:{ all -> 0x0ddb }
            java.lang.String r9 = r9.c()     // Catch:{ all -> 0x0ddb }
            boolean r11 = r4.f2636q     // Catch:{ all -> 0x0ddb }
            if (r11 == 0) goto L_0x0823
            r4.m()     // Catch:{ all -> 0x0ddb }
            r11 = 0
            r4.f2636q = r11     // Catch:{ all -> 0x0ddb }
        L_0x0823:
            MessageType r11 = r4.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3 r11 = (com.google.android.gms.internal.measurement.f3) r11     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3.g1(r11, r9)     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.qa.a()     // Catch:{ all -> 0x0ddb }
            h5.e r9 = r43.F()     // Catch:{ all -> 0x0ddb }
            h5.s2<java.lang.Boolean> r11 = h5.u2.f5717f0     // Catch:{ all -> 0x0ddb }
            boolean r9 = r9.m(r3, r11)     // Catch:{ all -> 0x0ddb }
            if (r9 == 0) goto L_0x0881
            MessageType r9 = r4.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3 r9 = (com.google.android.gms.internal.measurement.f3) r9     // Catch:{ all -> 0x0ddb }
            java.lang.String r9 = r9.G()     // Catch:{ all -> 0x0ddb }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0ddb }
            if (r9 == 0) goto L_0x0862
            java.lang.String r9 = r5.I     // Catch:{ all -> 0x0ddb }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0ddb }
            if (r9 != 0) goto L_0x0862
            java.lang.String r9 = r5.I     // Catch:{ all -> 0x0ddb }
            boolean r11 = r4.f2636q     // Catch:{ all -> 0x0ddb }
            if (r11 == 0) goto L_0x085b
            r4.m()     // Catch:{ all -> 0x0ddb }
            r11 = 0
            r4.f2636q = r11     // Catch:{ all -> 0x0ddb }
        L_0x085b:
            MessageType r11 = r4.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3 r11 = (com.google.android.gms.internal.measurement.f3) r11     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3.f1(r11, r9)     // Catch:{ all -> 0x0ddb }
        L_0x0862:
            MessageType r9 = r4.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3 r9 = (com.google.android.gms.internal.measurement.f3) r9     // Catch:{ all -> 0x0ddb }
            java.lang.String r9 = r9.G()     // Catch:{ all -> 0x0ddb }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0ddb }
            if (r9 == 0) goto L_0x089a
            java.lang.String r9 = r4.E()     // Catch:{ all -> 0x0ddb }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0ddb }
            if (r9 == 0) goto L_0x089a
            boolean r9 = android.text.TextUtils.isEmpty(r33)     // Catch:{ all -> 0x0ddb }
            if (r9 != 0) goto L_0x089a
            goto L_0x0895
        L_0x0881:
            MessageType r9 = r4.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3 r9 = (com.google.android.gms.internal.measurement.f3) r9     // Catch:{ all -> 0x0ddb }
            java.lang.String r9 = r9.G()     // Catch:{ all -> 0x0ddb }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0ddb }
            if (r9 == 0) goto L_0x089a
            boolean r9 = android.text.TextUtils.isEmpty(r33)     // Catch:{ all -> 0x0ddb }
            if (r9 != 0) goto L_0x089a
        L_0x0895:
            r9 = r33
            r4.B(r9)     // Catch:{ all -> 0x0ddb }
        L_0x089a:
            long r11 = r5.f5473t     // Catch:{ all -> 0x0ddb }
            r13 = 0
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x08b3
            boolean r9 = r4.f2636q     // Catch:{ all -> 0x0ddb }
            if (r9 == 0) goto L_0x08ac
            r4.m()     // Catch:{ all -> 0x0ddb }
            r9 = 0
            r4.f2636q = r9     // Catch:{ all -> 0x0ddb }
        L_0x08ac:
            MessageType r9 = r4.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3 r9 = (com.google.android.gms.internal.measurement.f3) r9     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3.k0(r9, r11)     // Catch:{ all -> 0x0ddb }
        L_0x08b3:
            long r11 = r5.G     // Catch:{ all -> 0x0ddb }
            boolean r9 = r4.f2636q     // Catch:{ all -> 0x0ddb }
            if (r9 == 0) goto L_0x08bf
            r4.m()     // Catch:{ all -> 0x0ddb }
            r9 = 0
            r4.f2636q = r9     // Catch:{ all -> 0x0ddb }
        L_0x08bf:
            MessageType r9 = r4.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3 r9 = (com.google.android.gms.internal.measurement.f3) r9     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3.d1(r9, r11)     // Catch:{ all -> 0x0ddb }
            E(r39)     // Catch:{ all -> 0x0ddb }
            r9 = r39
            h5.z6 r11 = r9.f5701p     // Catch:{ all -> 0x0ddb }
            h5.i4 r11 = r11.f5856y     // Catch:{ all -> 0x0ddb }
            android.content.Context r11 = r11.d()     // Catch:{ all -> 0x0ddb }
            java.util.Map r11 = h5.u2.a(r11)     // Catch:{ all -> 0x0ddb }
            h5.i4 r12 = r9.f5649o
            if (r11 == 0) goto L_0x0969
            int r13 = r11.size()     // Catch:{ all -> 0x0ddb }
            if (r13 != 0) goto L_0x08e3
            goto L_0x0969
        L_0x08e3:
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0ddb }
            r13.<init>()     // Catch:{ all -> 0x0ddb }
            h5.s2<java.lang.Integer> r14 = h5.u2.O     // Catch:{ all -> 0x0ddb }
            r15 = 0
            java.lang.Object r14 = r14.a(r15)     // Catch:{ all -> 0x0ddb }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0ddb }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0ddb }
            java.util.Set r11 = r11.entrySet()     // Catch:{ all -> 0x0ddb }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0ddb }
        L_0x08fd:
            boolean r15 = r11.hasNext()     // Catch:{ all -> 0x0ddb }
            if (r15 == 0) goto L_0x0960
            java.lang.Object r15 = r11.next()     // Catch:{ all -> 0x0ddb }
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15     // Catch:{ all -> 0x0ddb }
            java.lang.Object r16 = r15.getKey()     // Catch:{ all -> 0x0ddb }
            r17 = r11
            r11 = r16
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0ddb }
            r16 = r2
            java.lang.String r2 = "measurement.id."
            boolean r2 = r11.startsWith(r2)     // Catch:{ all -> 0x0ddb }
            if (r2 == 0) goto L_0x095b
            java.lang.Object r2 = r15.getValue()     // Catch:{ NumberFormatException -> 0x094c }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x094c }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x094c }
            if (r2 == 0) goto L_0x095b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x094c }
            r13.add(r2)     // Catch:{ NumberFormatException -> 0x094c }
            int r2 = r13.size()     // Catch:{ NumberFormatException -> 0x094c }
            if (r2 < r14) goto L_0x095b
            h5.g3 r2 = r12.e()     // Catch:{ NumberFormatException -> 0x094c }
            h5.e3 r2 = r2.l()     // Catch:{ NumberFormatException -> 0x094c }
            java.lang.String r11 = "Too many experiment IDs. Number of IDs"
            int r15 = r13.size()     // Catch:{ NumberFormatException -> 0x094c }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ NumberFormatException -> 0x094c }
            r2.b(r15, r11)     // Catch:{ NumberFormatException -> 0x094c }
            goto L_0x0962
        L_0x094c:
            r0 = move-exception
            r2 = r0
            h5.g3 r11 = r12.e()     // Catch:{ all -> 0x0ddb }
            h5.e3 r11 = r11.l()     // Catch:{ all -> 0x0ddb }
            java.lang.String r15 = "Experiment ID NumberFormatException"
            r11.b(r2, r15)     // Catch:{ all -> 0x0ddb }
        L_0x095b:
            r2 = r16
            r11 = r17
            goto L_0x08fd
        L_0x0960:
            r16 = r2
        L_0x0962:
            int r2 = r13.size()     // Catch:{ all -> 0x0ddb }
            if (r2 != 0) goto L_0x096c
            goto L_0x096b
        L_0x0969:
            r16 = r2
        L_0x096b:
            r13 = 0
        L_0x096c:
            if (r13 == 0) goto L_0x0971
            r4.C(r13)     // Catch:{ all -> 0x0ddb }
        L_0x0971:
            h5.f r2 = r1.M(r3)     // Catch:{ all -> 0x0ddb }
            java.lang.String r11 = r5.J     // Catch:{ all -> 0x0ddb }
            h5.f r11 = h5.f.b(r11)     // Catch:{ all -> 0x0ddb }
            h5.f r2 = r2.f(r11)     // Catch:{ all -> 0x0ddb }
            boolean r11 = r2.d()     // Catch:{ all -> 0x0ddb }
            if (r11 == 0) goto L_0x09dc
            h5.g6 r11 = r1.w     // Catch:{ all -> 0x0ddb }
            r11.getClass()     // Catch:{ all -> 0x0ddb }
            boolean r13 = r2.d()     // Catch:{ all -> 0x0ddb }
            if (r13 == 0) goto L_0x0995
            android.util.Pair r11 = r11.k(r3)     // Catch:{ all -> 0x0ddb }
            goto L_0x099e
        L_0x0995:
            android.util.Pair r11 = new android.util.Pair     // Catch:{ all -> 0x0ddb }
            java.lang.String r13 = ""
            java.lang.Boolean r14 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0ddb }
            r11.<init>(r13, r14)     // Catch:{ all -> 0x0ddb }
        L_0x099e:
            java.lang.Object r13 = r11.first     // Catch:{ all -> 0x0ddb }
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13     // Catch:{ all -> 0x0ddb }
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0ddb }
            if (r13 != 0) goto L_0x09dc
            boolean r13 = r5.C     // Catch:{ all -> 0x0ddb }
            if (r13 == 0) goto L_0x09dc
            java.lang.Object r13 = r11.first     // Catch:{ all -> 0x0ddb }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0ddb }
            boolean r14 = r4.f2636q     // Catch:{ all -> 0x0ddb }
            if (r14 == 0) goto L_0x09ba
            r4.m()     // Catch:{ all -> 0x0ddb }
            r14 = 0
            r4.f2636q = r14     // Catch:{ all -> 0x0ddb }
        L_0x09ba:
            MessageType r14 = r4.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3 r14 = (com.google.android.gms.internal.measurement.f3) r14     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3.e0(r14, r13)     // Catch:{ all -> 0x0ddb }
            java.lang.Object r11 = r11.second     // Catch:{ all -> 0x0ddb }
            if (r11 == 0) goto L_0x09dc
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ all -> 0x0ddb }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x0ddb }
            boolean r13 = r4.f2636q     // Catch:{ all -> 0x0ddb }
            if (r13 == 0) goto L_0x09d5
            r4.m()     // Catch:{ all -> 0x0ddb }
            r13 = 0
            r4.f2636q = r13     // Catch:{ all -> 0x0ddb }
        L_0x09d5:
            MessageType r13 = r4.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3 r13 = (com.google.android.gms.internal.measurement.f3) r13     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3.g0(r13, r11)     // Catch:{ all -> 0x0ddb }
        L_0x09dc:
            h5.k r11 = r41.s()     // Catch:{ all -> 0x0ddb }
            r11.i()     // Catch:{ all -> 0x0ddb }
            java.lang.String r11 = android.os.Build.MODEL     // Catch:{ all -> 0x0ddb }
            boolean r13 = r4.f2636q     // Catch:{ all -> 0x0ddb }
            if (r13 == 0) goto L_0x09ef
            r4.m()     // Catch:{ all -> 0x0ddb }
            r13 = 0
            r4.f2636q = r13     // Catch:{ all -> 0x0ddb }
        L_0x09ef:
            MessageType r13 = r4.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3 r13 = (com.google.android.gms.internal.measurement.f3) r13     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3.W(r13, r11)     // Catch:{ all -> 0x0ddb }
            h5.k r11 = r41.s()     // Catch:{ all -> 0x0ddb }
            r11.i()     // Catch:{ all -> 0x0ddb }
            java.lang.String r11 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0ddb }
            boolean r13 = r4.f2636q     // Catch:{ all -> 0x0ddb }
            if (r13 == 0) goto L_0x0a09
            r4.m()     // Catch:{ all -> 0x0ddb }
            r13 = 0
            r4.f2636q = r13     // Catch:{ all -> 0x0ddb }
        L_0x0a09:
            MessageType r13 = r4.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3 r13 = (com.google.android.gms.internal.measurement.f3) r13     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3.V(r13, r11)     // Catch:{ all -> 0x0ddb }
            h5.k r11 = r41.s()     // Catch:{ all -> 0x0ddb }
            long r13 = r11.k()     // Catch:{ all -> 0x0ddb }
            int r11 = (int) r13     // Catch:{ all -> 0x0ddb }
            boolean r13 = r4.f2636q     // Catch:{ all -> 0x0ddb }
            if (r13 == 0) goto L_0x0a23
            r4.m()     // Catch:{ all -> 0x0ddb }
            r13 = 0
            r4.f2636q = r13     // Catch:{ all -> 0x0ddb }
        L_0x0a23:
            MessageType r13 = r4.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3 r13 = (com.google.android.gms.internal.measurement.f3) r13     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3.Y(r13, r11)     // Catch:{ all -> 0x0ddb }
            h5.k r11 = r41.s()     // Catch:{ all -> 0x0ddb }
            java.lang.String r11 = r11.l()     // Catch:{ all -> 0x0ddb }
            boolean r13 = r4.f2636q     // Catch:{ all -> 0x0ddb }
            if (r13 == 0) goto L_0x0a3c
            r4.m()     // Catch:{ all -> 0x0ddb }
            r13 = 0
            r4.f2636q = r13     // Catch:{ all -> 0x0ddb }
        L_0x0a3c:
            MessageType r13 = r4.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3 r13 = (com.google.android.gms.internal.measurement.f3) r13     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3.X(r13, r11)     // Catch:{ all -> 0x0ddb }
            h5.e r11 = r43.F()     // Catch:{ all -> 0x0ddb }
            h5.s2<java.lang.Boolean> r13 = h5.u2.f5740r0     // Catch:{ all -> 0x0ddb }
            r14 = 0
            boolean r11 = r11.m(r14, r13)     // Catch:{ all -> 0x0ddb }
            if (r11 != 0) goto L_0x0a55
            long r14 = r5.z     // Catch:{ all -> 0x0ddb }
            r4.y(r14)     // Catch:{ all -> 0x0ddb }
        L_0x0a55:
            boolean r11 = r41.i()     // Catch:{ all -> 0x0ddb }
            if (r11 == 0) goto L_0x0a77
            r4.q()     // Catch:{ all -> 0x0ddb }
            r11 = 0
            boolean r14 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0ddb }
            if (r14 == 0) goto L_0x0a66
            goto L_0x0a77
        L_0x0a66:
            boolean r2 = r4.f2636q     // Catch:{ all -> 0x0ddb }
            if (r2 != 0) goto L_0x0a6b
            goto L_0x0a71
        L_0x0a6b:
            r4.m()     // Catch:{ all -> 0x0ddb }
            r2 = 0
            r4.f2636q = r2     // Catch:{ all -> 0x0ddb }
        L_0x0a71:
            MessageType r2 = r4.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3 r2 = (com.google.android.gms.internal.measurement.f3) r2     // Catch:{ all -> 0x0ddb }
            r2 = 0
            throw r2     // Catch:{ all -> 0x0ddb }
        L_0x0a77:
            h5.i r11 = r1.f5850q     // Catch:{ all -> 0x0ddb }
            E(r11)     // Catch:{ all -> 0x0ddb }
            h5.m4 r11 = r11.L(r3)     // Catch:{ all -> 0x0ddb }
            if (r11 != 0) goto L_0x0ae9
            h5.m4 r11 = new h5.m4     // Catch:{ all -> 0x0ddb }
            r14 = r41
            r11.<init>(r14, r3)     // Catch:{ all -> 0x0ddb }
            java.lang.String r14 = r1.b(r2)     // Catch:{ all -> 0x0ddb }
            r11.z(r14)     // Catch:{ all -> 0x0ddb }
            java.lang.String r14 = r5.f5476y     // Catch:{ all -> 0x0ddb }
            r11.I(r14)     // Catch:{ all -> 0x0ddb }
            r11.B(r10)     // Catch:{ all -> 0x0ddb }
            boolean r10 = r2.d()     // Catch:{ all -> 0x0ddb }
            if (r10 == 0) goto L_0x0aa7
            h5.g6 r10 = r1.w     // Catch:{ all -> 0x0ddb }
            java.lang.String r10 = r10.l(r3)     // Catch:{ all -> 0x0ddb }
            r11.G(r10)     // Catch:{ all -> 0x0ddb }
        L_0x0aa7:
            r14 = 0
            r11.h(r14)     // Catch:{ all -> 0x0ddb }
            r11.J(r14)     // Catch:{ all -> 0x0ddb }
            r11.K(r14)     // Catch:{ all -> 0x0ddb }
            r11.M(r8)     // Catch:{ all -> 0x0ddb }
            long r14 = r5.f5475x     // Catch:{ all -> 0x0ddb }
            r11.O(r14)     // Catch:{ all -> 0x0ddb }
            r11.Q(r6)     // Catch:{ all -> 0x0ddb }
            long r14 = r5.f5472s     // Catch:{ all -> 0x0ddb }
            r11.a(r14)     // Catch:{ all -> 0x0ddb }
            long r14 = r5.f5473t     // Catch:{ all -> 0x0ddb }
            r11.c(r14)     // Catch:{ all -> 0x0ddb }
            r6 = r32
            r11.g(r6)     // Catch:{ all -> 0x0ddb }
            h5.e r6 = r43.F()     // Catch:{ all -> 0x0ddb }
            r8 = 0
            boolean r6 = r6.m(r8, r13)     // Catch:{ all -> 0x0ddb }
            if (r6 != 0) goto L_0x0adc
            long r13 = r5.z     // Catch:{ all -> 0x0ddb }
            r11.s(r13)     // Catch:{ all -> 0x0ddb }
        L_0x0adc:
            long r5 = r5.G     // Catch:{ all -> 0x0ddb }
            r11.e(r5)     // Catch:{ all -> 0x0ddb }
            h5.i r5 = r1.f5850q     // Catch:{ all -> 0x0ddb }
            E(r5)     // Catch:{ all -> 0x0ddb }
            r5.M(r11)     // Catch:{ all -> 0x0ddb }
        L_0x0ae9:
            boolean r2 = r2.e()     // Catch:{ all -> 0x0ddb }
            if (r2 == 0) goto L_0x0b11
            java.lang.String r2 = r11.y()     // Catch:{ all -> 0x0ddb }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0ddb }
            if (r2 != 0) goto L_0x0b11
            java.lang.String r2 = r11.y()     // Catch:{ all -> 0x0ddb }
            n4.m.h(r2)     // Catch:{ all -> 0x0ddb }
            boolean r5 = r4.f2636q     // Catch:{ all -> 0x0ddb }
            if (r5 == 0) goto L_0x0b0a
            r4.m()     // Catch:{ all -> 0x0ddb }
            r5 = 0
            r4.f2636q = r5     // Catch:{ all -> 0x0ddb }
        L_0x0b0a:
            MessageType r5 = r4.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3 r5 = (com.google.android.gms.internal.measurement.f3) r5     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3.i0(r5, r2)     // Catch:{ all -> 0x0ddb }
        L_0x0b11:
            java.lang.String r2 = r11.H()     // Catch:{ all -> 0x0ddb }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0ddb }
            if (r2 != 0) goto L_0x0b33
            java.lang.String r2 = r11.H()     // Catch:{ all -> 0x0ddb }
            n4.m.h(r2)     // Catch:{ all -> 0x0ddb }
            boolean r5 = r4.f2636q     // Catch:{ all -> 0x0ddb }
            if (r5 == 0) goto L_0x0b2c
            r4.m()     // Catch:{ all -> 0x0ddb }
            r5 = 0
            r4.f2636q = r5     // Catch:{ all -> 0x0ddb }
        L_0x0b2c:
            MessageType r5 = r4.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3 r5 = (com.google.android.gms.internal.measurement.f3) r5     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.f3.U0(r5, r2)     // Catch:{ all -> 0x0ddb }
        L_0x0b33:
            h5.i r2 = r1.f5850q     // Catch:{ all -> 0x0ddb }
            E(r2)     // Catch:{ all -> 0x0ddb }
            java.util.List r2 = r2.E(r3)     // Catch:{ all -> 0x0ddb }
            r13 = 0
        L_0x0b3d:
            int r3 = r2.size()     // Catch:{ all -> 0x0ddb }
            if (r13 >= r3) goto L_0x0bf3
            com.google.android.gms.internal.measurement.p3 r3 = com.google.android.gms.internal.measurement.q3.A()     // Catch:{ all -> 0x0ddb }
            java.lang.Object r5 = r2.get(r13)     // Catch:{ all -> 0x0ddb }
            h5.e7 r5 = (h5.e7) r5     // Catch:{ all -> 0x0ddb }
            java.lang.String r5 = r5.f5364c     // Catch:{ all -> 0x0ddb }
            r3.r(r5)     // Catch:{ all -> 0x0ddb }
            java.lang.Object r5 = r2.get(r13)     // Catch:{ all -> 0x0ddb }
            h5.e7 r5 = (h5.e7) r5     // Catch:{ all -> 0x0ddb }
            long r5 = r5.d     // Catch:{ all -> 0x0ddb }
            r3.q(r5)     // Catch:{ all -> 0x0ddb }
            E(r9)     // Catch:{ all -> 0x0ddb }
            java.lang.Object r5 = r2.get(r13)     // Catch:{ all -> 0x0ddb }
            h5.e7 r5 = (h5.e7) r5     // Catch:{ all -> 0x0ddb }
            java.lang.Object r5 = r5.f5365e     // Catch:{ all -> 0x0ddb }
            n4.m.h(r5)     // Catch:{ all -> 0x0ddb }
            boolean r6 = r3.f2636q     // Catch:{ all -> 0x0ddb }
            if (r6 == 0) goto L_0x0b75
            r3.m()     // Catch:{ all -> 0x0ddb }
            r6 = 0
            r3.f2636q = r6     // Catch:{ all -> 0x0ddb }
        L_0x0b75:
            MessageType r6 = r3.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.q3 r6 = (com.google.android.gms.internal.measurement.q3) r6     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.q3.F(r6)     // Catch:{ all -> 0x0ddb }
            boolean r6 = r3.f2636q     // Catch:{ all -> 0x0ddb }
            if (r6 == 0) goto L_0x0b86
            r3.m()     // Catch:{ all -> 0x0ddb }
            r6 = 0
            r3.f2636q = r6     // Catch:{ all -> 0x0ddb }
        L_0x0b86:
            MessageType r6 = r3.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.q3 r6 = (com.google.android.gms.internal.measurement.q3) r6     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.q3.H(r6)     // Catch:{ all -> 0x0ddb }
            boolean r6 = r3.f2636q     // Catch:{ all -> 0x0ddb }
            if (r6 == 0) goto L_0x0b97
            r3.m()     // Catch:{ all -> 0x0ddb }
            r6 = 0
            r3.f2636q = r6     // Catch:{ all -> 0x0ddb }
        L_0x0b97:
            MessageType r6 = r3.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.q3 r6 = (com.google.android.gms.internal.measurement.q3) r6     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.q3.J(r6)     // Catch:{ all -> 0x0ddb }
            boolean r6 = r5 instanceof java.lang.String     // Catch:{ all -> 0x0ddb }
            if (r6 == 0) goto L_0x0bb6
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0ddb }
            boolean r6 = r3.f2636q     // Catch:{ all -> 0x0ddb }
            if (r6 == 0) goto L_0x0bae
            r3.m()     // Catch:{ all -> 0x0ddb }
            r6 = 0
            r3.f2636q = r6     // Catch:{ all -> 0x0ddb }
        L_0x0bae:
            MessageType r6 = r3.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.q3 r6 = (com.google.android.gms.internal.measurement.q3) r6     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.q3.E(r6, r5)     // Catch:{ all -> 0x0ddb }
            goto L_0x0bec
        L_0x0bb6:
            boolean r6 = r5 instanceof java.lang.Long     // Catch:{ all -> 0x0ddb }
            if (r6 == 0) goto L_0x0bc4
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x0ddb }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0ddb }
            r3.s(r5)     // Catch:{ all -> 0x0ddb }
            goto L_0x0bec
        L_0x0bc4:
            boolean r6 = r5 instanceof java.lang.Double     // Catch:{ all -> 0x0ddb }
            if (r6 == 0) goto L_0x0be0
            java.lang.Double r5 = (java.lang.Double) r5     // Catch:{ all -> 0x0ddb }
            double r5 = r5.doubleValue()     // Catch:{ all -> 0x0ddb }
            boolean r8 = r3.f2636q     // Catch:{ all -> 0x0ddb }
            if (r8 == 0) goto L_0x0bd8
            r3.m()     // Catch:{ all -> 0x0ddb }
            r8 = 0
            r3.f2636q = r8     // Catch:{ all -> 0x0ddb }
        L_0x0bd8:
            MessageType r8 = r3.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.q3 r8 = (com.google.android.gms.internal.measurement.q3) r8     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.q3.I(r8, r5)     // Catch:{ all -> 0x0ddb }
            goto L_0x0bec
        L_0x0be0:
            h5.g3 r6 = r12.w     // Catch:{ all -> 0x0ddb }
            h5.i4.n(r6)     // Catch:{ all -> 0x0ddb }
            java.lang.String r8 = "Ignoring invalid (type) user attribute value"
            h5.e3 r6 = r6.f5397t     // Catch:{ all -> 0x0ddb }
            r6.b(r5, r8)     // Catch:{ all -> 0x0ddb }
        L_0x0bec:
            r4.I(r3)     // Catch:{ all -> 0x0ddb }
            int r13 = r13 + 1
            goto L_0x0b3d
        L_0x0bf3:
            h5.i r2 = r1.f5850q     // Catch:{ IOException -> 0x0d8d }
            E(r2)     // Catch:{ IOException -> 0x0d8d }
            com.google.android.gms.internal.measurement.f6 r3 = r4.j()     // Catch:{ IOException -> 0x0d8d }
            com.google.android.gms.internal.measurement.f3 r3 = (com.google.android.gms.internal.measurement.f3) r3     // Catch:{ IOException -> 0x0d8d }
            r2.g()     // Catch:{ IOException -> 0x0d8d }
            r2.h()     // Catch:{ IOException -> 0x0d8d }
            java.lang.String r5 = r3.r()     // Catch:{ IOException -> 0x0d8d }
            n4.m.e(r5)     // Catch:{ IOException -> 0x0d8d }
            byte[] r5 = r3.a()     // Catch:{ IOException -> 0x0d8d }
            h5.z6 r6 = r2.f5701p     // Catch:{ IOException -> 0x0d8d }
            h5.b7 r6 = r6.u     // Catch:{ IOException -> 0x0d8d }
            E(r6)     // Catch:{ IOException -> 0x0d8d }
            long r8 = r6.C(r5)     // Catch:{ IOException -> 0x0d8d }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ IOException -> 0x0d8d }
            r6.<init>()     // Catch:{ IOException -> 0x0d8d }
            java.lang.String r10 = "app_id"
            java.lang.String r11 = r3.r()     // Catch:{ IOException -> 0x0d8d }
            r6.put(r10, r11)     // Catch:{ IOException -> 0x0d8d }
            java.lang.String r10 = "metadata_fingerprint"
            java.lang.Long r11 = java.lang.Long.valueOf(r8)     // Catch:{ IOException -> 0x0d8d }
            r6.put(r10, r11)     // Catch:{ IOException -> 0x0d8d }
            java.lang.String r10 = "metadata"
            r6.put(r10, r5)     // Catch:{ IOException -> 0x0d8d }
            android.database.sqlite.SQLiteDatabase r5 = r2.y()     // Catch:{ SQLiteException -> 0x0d73 }
            java.lang.String r10 = "raw_events_metadata"
            r11 = 4
            r12 = 0
            r5.insertWithOnConflict(r10, r12, r6, r11)     // Catch:{ SQLiteException -> 0x0d73 }
            h5.i r2 = r1.f5850q     // Catch:{ all -> 0x0ddb }
            E(r2)     // Catch:{ all -> 0x0ddb }
            h5.n r3 = r7.f5522f     // Catch:{ all -> 0x0ddb }
            android.os.Bundle r3 = r3.f5587o     // Catch:{ all -> 0x0ddb }
            java.util.Set r3 = r3.keySet()     // Catch:{ all -> 0x0ddb }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0ddb }
        L_0x0c52:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0ddb }
            if (r4 == 0) goto L_0x0c6c
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0ddb }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0ddb }
            r5 = r44
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x0ddb }
            if (r4 == 0) goto L_0x0c69
            r4 = r16
            goto L_0x0ca0
        L_0x0c69:
            r44 = r5
            goto L_0x0c52
        L_0x0c6c:
            E(r40)     // Catch:{ all -> 0x0ddb }
            java.lang.String r3 = r7.f5519b     // Catch:{ all -> 0x0ddb }
            r4 = r16
            r5 = r40
            boolean r3 = r5.o(r4, r3)     // Catch:{ all -> 0x0ddb }
            h5.i r10 = r1.f5850q     // Catch:{ all -> 0x0ddb }
            E(r10)     // Catch:{ all -> 0x0ddb }
            long r11 = r43.N()     // Catch:{ all -> 0x0ddb }
            java.lang.String r13 = r7.f5518a     // Catch:{ all -> 0x0ddb }
            r14 = 0
            r15 = 0
            h5.g r5 = r10.N(r11, r13, r14, r15)     // Catch:{ all -> 0x0ddb }
            if (r3 == 0) goto L_0x0c9e
            long r5 = r5.f5390e     // Catch:{ all -> 0x0ddb }
            h5.e r3 = r43.F()     // Catch:{ all -> 0x0ddb }
            h5.s2<java.lang.Integer> r10 = h5.u2.f5733o     // Catch:{ all -> 0x0ddb }
            int r3 = r3.l(r4, r10)     // Catch:{ all -> 0x0ddb }
            long r10 = (long) r3     // Catch:{ all -> 0x0ddb }
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 >= 0) goto L_0x0c9e
            goto L_0x0ca0
        L_0x0c9e:
            r29 = 0
        L_0x0ca0:
            r2.g()     // Catch:{ all -> 0x0ddb }
            r2.h()     // Catch:{ all -> 0x0ddb }
            n4.m.e(r4)     // Catch:{ all -> 0x0ddb }
            h5.z6 r3 = r2.f5701p     // Catch:{ all -> 0x0ddb }
            h5.b7 r3 = r3.u     // Catch:{ all -> 0x0ddb }
            E(r3)     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.w2 r5 = com.google.android.gms.internal.measurement.x2.B()     // Catch:{ all -> 0x0ddb }
            boolean r6 = r5.f2636q     // Catch:{ all -> 0x0ddb }
            if (r6 == 0) goto L_0x0cbe
            r5.m()     // Catch:{ all -> 0x0ddb }
            r6 = 0
            r5.f2636q = r6     // Catch:{ all -> 0x0ddb }
        L_0x0cbe:
            MessageType r6 = r5.f2635p     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.x2 r6 = (com.google.android.gms.internal.measurement.x2) r6     // Catch:{ all -> 0x0ddb }
            long r10 = r7.f5521e     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.x2.K(r10, r6)     // Catch:{ all -> 0x0ddb }
            h5.n r6 = r7.f5522f     // Catch:{ all -> 0x0ddb }
            android.os.Bundle r10 = r6.f5587o     // Catch:{ all -> 0x0ddb }
            java.util.Set r10 = r10.keySet()     // Catch:{ all -> 0x0ddb }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0ddb }
        L_0x0cd3:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x0ddb }
            if (r11 == 0) goto L_0x0cf6
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x0ddb }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.a3 r12 = com.google.android.gms.internal.measurement.b3.D()     // Catch:{ all -> 0x0ddb }
            r12.q(r11)     // Catch:{ all -> 0x0ddb }
            android.os.Bundle r13 = r6.f5587o     // Catch:{ all -> 0x0ddb }
            java.lang.Object r11 = r13.get(r11)     // Catch:{ all -> 0x0ddb }
            n4.m.h(r11)     // Catch:{ all -> 0x0ddb }
            r3.t(r12, r11)     // Catch:{ all -> 0x0ddb }
            r5.t(r12)     // Catch:{ all -> 0x0ddb }
            goto L_0x0cd3
        L_0x0cf6:
            com.google.android.gms.internal.measurement.f6 r3 = r5.j()     // Catch:{ all -> 0x0ddb }
            com.google.android.gms.internal.measurement.x2 r3 = (com.google.android.gms.internal.measurement.x2) r3     // Catch:{ all -> 0x0ddb }
            byte[] r3 = r3.a()     // Catch:{ all -> 0x0ddb }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0ddb }
            r5.<init>()     // Catch:{ all -> 0x0ddb }
            java.lang.String r6 = "app_id"
            r5.put(r6, r4)     // Catch:{ all -> 0x0ddb }
            java.lang.String r6 = "name"
            java.lang.String r10 = r7.f5519b     // Catch:{ all -> 0x0ddb }
            r5.put(r6, r10)     // Catch:{ all -> 0x0ddb }
            java.lang.String r6 = "timestamp"
            long r10 = r7.d     // Catch:{ all -> 0x0ddb }
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0ddb }
            r5.put(r6, r7)     // Catch:{ all -> 0x0ddb }
            java.lang.String r6 = "metadata_fingerprint"
            java.lang.Long r7 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0ddb }
            r5.put(r6, r7)     // Catch:{ all -> 0x0ddb }
            java.lang.String r6 = "data"
            r5.put(r6, r3)     // Catch:{ all -> 0x0ddb }
            java.lang.String r3 = "realtime"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r29)     // Catch:{ all -> 0x0ddb }
            r5.put(r3, r6)     // Catch:{ all -> 0x0ddb }
            android.database.sqlite.SQLiteDatabase r3 = r2.y()     // Catch:{ SQLiteException -> 0x0d5d }
            r6 = r42
            r7 = 0
            long r5 = r3.insert(r6, r7, r5)     // Catch:{ SQLiteException -> 0x0d5d }
            r7 = -1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0d58
            h5.i4 r3 = r2.f5649o     // Catch:{ SQLiteException -> 0x0d5d }
            h5.g3 r3 = r3.e()     // Catch:{ SQLiteException -> 0x0d5d }
            h5.e3 r3 = r3.k()     // Catch:{ SQLiteException -> 0x0d5d }
            java.lang.String r5 = "Failed to insert raw event (got -1). appId"
            h5.f3 r6 = h5.g3.p(r4)     // Catch:{ SQLiteException -> 0x0d5d }
            r3.b(r6, r5)     // Catch:{ SQLiteException -> 0x0d5d }
            goto L_0x0da4
        L_0x0d58:
            r2 = 0
            r1.B = r2     // Catch:{ all -> 0x0ddb }
            goto L_0x0da4
        L_0x0d5d:
            r0 = move-exception
            r3 = r0
            h5.i4 r2 = r2.f5649o     // Catch:{ all -> 0x0ddb }
            h5.g3 r2 = r2.e()     // Catch:{ all -> 0x0ddb }
            h5.e3 r2 = r2.k()     // Catch:{ all -> 0x0ddb }
            java.lang.String r5 = "Error storing raw event. appId"
            h5.f3 r4 = h5.g3.p(r4)     // Catch:{ all -> 0x0ddb }
            r2.c(r4, r3, r5)     // Catch:{ all -> 0x0ddb }
            goto L_0x0da4
        L_0x0d73:
            r0 = move-exception
            r5 = r0
            h5.i4 r2 = r2.f5649o     // Catch:{ IOException -> 0x0d8d }
            h5.g3 r2 = r2.e()     // Catch:{ IOException -> 0x0d8d }
            h5.e3 r2 = r2.k()     // Catch:{ IOException -> 0x0d8d }
            java.lang.String r6 = "Error storing raw event metadata. appId"
            java.lang.String r3 = r3.r()     // Catch:{ IOException -> 0x0d8d }
            h5.f3 r3 = h5.g3.p(r3)     // Catch:{ IOException -> 0x0d8d }
            r2.c(r3, r5, r6)     // Catch:{ IOException -> 0x0d8d }
            throw r5     // Catch:{ IOException -> 0x0d8d }
        L_0x0d8d:
            r0 = move-exception
            r2 = r0
            h5.g3 r3 = r43.e()     // Catch:{ all -> 0x0ddb }
            h5.e3 r3 = r3.k()     // Catch:{ all -> 0x0ddb }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r4 = r4.q()     // Catch:{ all -> 0x0ddb }
            h5.f3 r4 = h5.g3.p(r4)     // Catch:{ all -> 0x0ddb }
            r3.c(r4, r2, r5)     // Catch:{ all -> 0x0ddb }
        L_0x0da4:
            h5.i r2 = r1.f5850q     // Catch:{ all -> 0x0ddb }
            E(r2)     // Catch:{ all -> 0x0ddb }
            r2.w()     // Catch:{ all -> 0x0ddb }
            h5.i r2 = r1.f5850q
            E(r2)
            r2.x()
            r43.z()
            h5.g3 r2 = r43.e()
            h5.e3 r2 = r2.o()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r30
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.b(r3, r4)
            return
        L_0x0dd7:
            r0 = move-exception
            r1 = r43
            goto L_0x0ddc
        L_0x0ddb:
            r0 = move-exception
        L_0x0ddc:
            r2 = r0
            h5.i r3 = r1.f5850q
            E(r3)
            r3.x()
            throw r2
        L_0x0de6:
            r5 = r3
            r1.q(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.z6.R(h5.p, h5.i7):void");
    }

    public final q0.d a() {
        throw null;
    }

    public final String b(f fVar) {
        if (!fVar.e()) {
            return null;
        }
        byte[] bArr = new byte[16];
        J().X().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    public final r4.c c() {
        i4 i4Var = this.f5856y;
        m.h(i4Var);
        return i4Var.B;
    }

    public final Context d() {
        return this.f5856y.f5452o;
    }

    public final g3 e() {
        i4 i4Var = this.f5856y;
        m.h(i4Var);
        g3 g3Var = i4Var.w;
        i4.n(g3Var);
        return g3Var;
    }

    public final h4 f() {
        i4 i4Var = this.f5856y;
        m.h(i4Var);
        h4 h4Var = i4Var.f5459x;
        i4.n(h4Var);
        return h4Var;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:219|220) */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0265, code lost:
        r0 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:?, code lost:
        e().f5397t.c(h5.g3.p(r11), r9, "Failed to parse upload URL. Not uploading. appId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x04fc, code lost:
        if (r3 != null) goto L_0x04fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010e, code lost:
        if (r12 != null) goto L_0x0110;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:219:0x0482 */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0285 A[SYNTHETIC, Splitter:B:147:0x0285] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x028e A[Catch:{ all -> 0x0116, all -> 0x0525 }] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0495 A[Catch:{ all -> 0x0116, all -> 0x0525 }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0508 A[Catch:{ all -> 0x0116, all -> 0x0525 }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0521 A[SYNTHETIC, Splitter:B:260:0x0521] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011a A[Catch:{ all -> 0x0116, all -> 0x0525 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:48:0x0110=Splitter:B:48:0x0110, B:45:0x0100=Splitter:B:45:0x0100, B:210:0x0410=Splitter:B:210:0x0410, B:137:0x0262=Splitter:B:137:0x0262, B:246:0x04fe=Splitter:B:246:0x04fe} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r23 = this;
            r1 = r23
            h5.l3 r3 = r1.f5849p
            h5.i4 r0 = r1.f5856y
            h5.h4 r2 = r23.f()
            r2.g()
            r23.K()
            r2 = 1
            r1.H = r2
            r9 = 0
            r0.getClass()     // Catch:{ all -> 0x0525 }
            h5.f6 r0 = r0.r()     // Catch:{ all -> 0x0525 }
            java.lang.Boolean r0 = r0.f5384s     // Catch:{ all -> 0x0525 }
            if (r0 != 0) goto L_0x0028
            h5.g3 r0 = r23.e()     // Catch:{ all -> 0x0525 }
            h5.e3 r0 = r0.w     // Catch:{ all -> 0x0525 }
            java.lang.String r2 = "Upload data called on the client side before use of service was decided"
            goto L_0x0053
        L_0x0028:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0525 }
            if (r0 == 0) goto L_0x0037
            h5.g3 r0 = r23.e()     // Catch:{ all -> 0x0525 }
            h5.e3 r0 = r0.f5397t     // Catch:{ all -> 0x0525 }
            java.lang.String r2 = "Upload called in the client side when service should be used"
            goto L_0x0053
        L_0x0037:
            long r4 = r1.B     // Catch:{ all -> 0x0525 }
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0040
            goto L_0x006b
        L_0x0040:
            h5.h4 r0 = r23.f()     // Catch:{ all -> 0x0525 }
            r0.g()     // Catch:{ all -> 0x0525 }
            java.util.ArrayList r0 = r1.K     // Catch:{ all -> 0x0525 }
            if (r0 == 0) goto L_0x0057
            h5.g3 r0 = r23.e()     // Catch:{ all -> 0x0525 }
            h5.e3 r0 = r0.B     // Catch:{ all -> 0x0525 }
            java.lang.String r2 = "Uploading requested multiple times"
        L_0x0053:
            r0.a(r2)     // Catch:{ all -> 0x0525 }
            goto L_0x006e
        L_0x0057:
            E(r3)     // Catch:{ all -> 0x0525 }
            boolean r0 = r3.k()     // Catch:{ all -> 0x0525 }
            if (r0 != 0) goto L_0x0072
            h5.g3 r0 = r23.e()     // Catch:{ all -> 0x0525 }
            h5.e3 r0 = r0.B     // Catch:{ all -> 0x0525 }
            java.lang.String r2 = "Network not connected, ignoring upload request"
            r0.a(r2)     // Catch:{ all -> 0x0525 }
        L_0x006b:
            r23.z()     // Catch:{ all -> 0x0525 }
        L_0x006e:
            r1.H = r9
            goto L_0x0519
        L_0x0072:
            r4.c r0 = r23.c()     // Catch:{ all -> 0x0525 }
            r4.d r0 = (r4.d) r0     // Catch:{ all -> 0x0525 }
            r0.getClass()     // Catch:{ all -> 0x0525 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0525 }
            h5.e r0 = r23.F()     // Catch:{ all -> 0x0525 }
            h5.s2<java.lang.Integer> r8 = h5.u2.P     // Catch:{ all -> 0x0525 }
            r10 = 0
            int r0 = r0.l(r10, r8)     // Catch:{ all -> 0x0525 }
            r23.F()     // Catch:{ all -> 0x0525 }
            h5.s2<java.lang.Long> r8 = h5.u2.d     // Catch:{ all -> 0x0525 }
            java.lang.Object r8 = r8.a(r10)     // Catch:{ all -> 0x0525 }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x0525 }
            long r11 = r8.longValue()     // Catch:{ all -> 0x0525 }
            long r11 = r4 - r11
            r8 = r9
        L_0x009c:
            if (r8 >= r0) goto L_0x00a7
            boolean r13 = r1.u(r11)     // Catch:{ all -> 0x0525 }
            if (r13 == 0) goto L_0x00a7
            int r8 = r8 + 1
            goto L_0x009c
        L_0x00a7:
            h5.g6 r0 = r1.w     // Catch:{ all -> 0x0525 }
            h5.q3 r0 = r0.w     // Catch:{ all -> 0x0525 }
            long r11 = r0.a()     // Catch:{ all -> 0x0525 }
            int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00c8
            h5.g3 r0 = r23.e()     // Catch:{ all -> 0x0525 }
            h5.e3 r0 = r0.A     // Catch:{ all -> 0x0525 }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r4 - r11
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x0525 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0525 }
            r0.b(r7, r6)     // Catch:{ all -> 0x0525 }
        L_0x00c8:
            h5.i r0 = r1.f5850q     // Catch:{ all -> 0x0525 }
            E(r0)     // Catch:{ all -> 0x0525 }
            java.lang.String r11 = r0.R()     // Catch:{ all -> 0x0525 }
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0525 }
            r6 = -1
            if (r0 != 0) goto L_0x0499
            long r12 = r1.M     // Catch:{ all -> 0x0525 }
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x011e
            h5.i r8 = r1.f5850q     // Catch:{ all -> 0x0525 }
            E(r8)     // Catch:{ all -> 0x0525 }
            android.database.sqlite.SQLiteDatabase r0 = r8.y()     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fc }
            java.lang.String r12 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r12 = r0.rawQuery(r12, r10)     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fc }
            boolean r0 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x00fa }
            if (r0 != 0) goto L_0x00f5
            goto L_0x0110
        L_0x00f5:
            long r6 = r12.getLong(r9)     // Catch:{ SQLiteException -> 0x00fa }
            goto L_0x0110
        L_0x00fa:
            r0 = move-exception
            goto L_0x0100
        L_0x00fc:
            r0 = move-exception
            goto L_0x0118
        L_0x00fe:
            r0 = move-exception
            r12 = r10
        L_0x0100:
            h5.i4 r8 = r8.f5649o     // Catch:{ all -> 0x0116 }
            h5.g3 r8 = r8.w     // Catch:{ all -> 0x0116 }
            h5.i4.n(r8)     // Catch:{ all -> 0x0116 }
            h5.e3 r8 = r8.f5397t     // Catch:{ all -> 0x0116 }
            java.lang.String r13 = "Error querying raw events"
            r8.b(r0, r13)     // Catch:{ all -> 0x0116 }
            if (r12 == 0) goto L_0x0113
        L_0x0110:
            r12.close()     // Catch:{ all -> 0x0525 }
        L_0x0113:
            r1.M = r6     // Catch:{ all -> 0x0525 }
            goto L_0x011e
        L_0x0116:
            r0 = move-exception
            r10 = r12
        L_0x0118:
            if (r10 == 0) goto L_0x011d
            r10.close()     // Catch:{ all -> 0x0525 }
        L_0x011d:
            throw r0     // Catch:{ all -> 0x0525 }
        L_0x011e:
            h5.e r0 = r23.F()     // Catch:{ all -> 0x0525 }
            h5.s2<java.lang.Integer> r6 = h5.u2.f5718g     // Catch:{ all -> 0x0525 }
            int r0 = r0.l(r11, r6)     // Catch:{ all -> 0x0525 }
            h5.e r6 = r23.F()     // Catch:{ all -> 0x0525 }
            h5.s2<java.lang.Integer> r7 = h5.u2.f5720h     // Catch:{ all -> 0x0525 }
            int r6 = r6.l(r11, r7)     // Catch:{ all -> 0x0525 }
            int r6 = java.lang.Math.max(r9, r6)     // Catch:{ all -> 0x0525 }
            h5.i r7 = r1.f5850q     // Catch:{ all -> 0x0525 }
            E(r7)     // Catch:{ all -> 0x0525 }
            h5.i4 r8 = r7.f5649o
            r7.g()     // Catch:{ all -> 0x0525 }
            r7.h()     // Catch:{ all -> 0x0525 }
            if (r0 <= 0) goto L_0x0147
            r12 = r2
            goto L_0x0148
        L_0x0147:
            r12 = r9
        L_0x0148:
            n4.m.b(r12)     // Catch:{ all -> 0x0525 }
            if (r6 <= 0) goto L_0x014f
            r12 = r2
            goto L_0x0150
        L_0x014f:
            r12 = r9
        L_0x0150:
            n4.m.b(r12)     // Catch:{ all -> 0x0525 }
            n4.m.e(r11)     // Catch:{ all -> 0x0525 }
            android.database.sqlite.SQLiteDatabase r13 = r7.y()     // Catch:{ SQLiteException -> 0x026b, all -> 0x0267 }
            java.lang.String r14 = "rowid"
            java.lang.String r15 = "data"
            java.lang.String r10 = "retry_count"
            java.lang.String[] r15 = new java.lang.String[]{r14, r15, r10}     // Catch:{ SQLiteException -> 0x026b, all -> 0x0267 }
            java.lang.String[] r10 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x026b, all -> 0x0267 }
            r10[r9] = r11     // Catch:{ SQLiteException -> 0x026b, all -> 0x0267 }
            java.lang.String r14 = "queue"
            java.lang.String r16 = "app_id=?"
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            java.lang.String r21 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x026b, all -> 0x0267 }
            r17 = r10
            android.database.Cursor r10 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x026b, all -> 0x0267 }
            boolean r0 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x0221 }
            if (r0 != 0) goto L_0x018d
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x0221 }
            r10.close()     // Catch:{ all -> 0x0525 }
            r21 = r3
            goto L_0x0288
        L_0x018d:
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0221 }
            r13.<init>()     // Catch:{ SQLiteException -> 0x0221 }
            r14 = r9
        L_0x0193:
            long r15 = r10.getLong(r9)     // Catch:{ SQLiteException -> 0x0221 }
            byte[] r0 = r10.getBlob(r2)     // Catch:{ IOException -> 0x023f }
            h5.z6 r2 = r7.f5701p     // Catch:{ IOException -> 0x023f }
            h5.b7 r2 = r2.u     // Catch:{ IOException -> 0x023f }
            E(r2)     // Catch:{ IOException -> 0x023f }
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0229 }
            r9.<init>(r0)     // Catch:{ IOException -> 0x0229 }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0229 }
            r0.<init>(r9)     // Catch:{ IOException -> 0x0229 }
            java.io.ByteArrayOutputStream r12 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0229 }
            r12.<init>()     // Catch:{ IOException -> 0x0229 }
            r20 = r7
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch:{ IOException -> 0x0225 }
            r21 = r3
        L_0x01b9:
            int r3 = r0.read(r7)     // Catch:{ IOException -> 0x021f }
            if (r3 > 0) goto L_0x0216
            r0.close()     // Catch:{ IOException -> 0x021f }
            r9.close()     // Catch:{ IOException -> 0x021f }
            byte[] r0 = r12.toByteArray()     // Catch:{ IOException -> 0x021f }
            boolean r2 = r13.isEmpty()     // Catch:{ SQLiteException -> 0x0204 }
            if (r2 != 0) goto L_0x01d5
            int r2 = r0.length     // Catch:{ SQLiteException -> 0x0204 }
            int r2 = r2 + r14
            if (r2 <= r6) goto L_0x01d5
            goto L_0x0262
        L_0x01d5:
            com.google.android.gms.internal.measurement.e3 r2 = com.google.android.gms.internal.measurement.f3.B0()     // Catch:{ IOException -> 0x0207 }
            com.google.android.gms.internal.measurement.b6 r2 = h5.b7.E(r2, r0)     // Catch:{ IOException -> 0x0207 }
            com.google.android.gms.internal.measurement.e3 r2 = (com.google.android.gms.internal.measurement.e3) r2     // Catch:{ IOException -> 0x0207 }
            r3 = 2
            boolean r7 = r10.isNull(r3)     // Catch:{ SQLiteException -> 0x0204 }
            if (r7 != 0) goto L_0x01ed
            int r7 = r10.getInt(r3)     // Catch:{ SQLiteException -> 0x0204 }
            r2.A(r7)     // Catch:{ SQLiteException -> 0x0204 }
        L_0x01ed:
            int r0 = r0.length     // Catch:{ SQLiteException -> 0x0204 }
            int r14 = r14 + r0
            com.google.android.gms.internal.measurement.f6 r0 = r2.j()     // Catch:{ SQLiteException -> 0x0204 }
            com.google.android.gms.internal.measurement.f3 r0 = (com.google.android.gms.internal.measurement.f3) r0     // Catch:{ SQLiteException -> 0x0204 }
            java.lang.Long r2 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteException -> 0x0204 }
            android.util.Pair r0 = android.util.Pair.create(r0, r2)     // Catch:{ SQLiteException -> 0x0204 }
            r13.add(r0)     // Catch:{ SQLiteException -> 0x0204 }
            goto L_0x0251
        L_0x0201:
            r0 = move-exception
            goto L_0x0493
        L_0x0204:
            r0 = move-exception
            goto L_0x026f
        L_0x0207:
            r0 = move-exception
            h5.g3 r2 = r8.w     // Catch:{ SQLiteException -> 0x0204 }
            h5.i4.n(r2)     // Catch:{ SQLiteException -> 0x0204 }
            h5.e3 r2 = r2.f5397t     // Catch:{ SQLiteException -> 0x0204 }
            java.lang.String r3 = "Failed to merge queued bundle. appId"
        L_0x0211:
            h5.f3 r7 = h5.g3.p(r11)     // Catch:{ SQLiteException -> 0x0204 }
            goto L_0x024e
        L_0x0216:
            r22 = r9
            r9 = 0
            r12.write(r7, r9, r3)     // Catch:{ IOException -> 0x021f }
            r9 = r22
            goto L_0x01b9
        L_0x021f:
            r0 = move-exception
            goto L_0x022e
        L_0x0221:
            r0 = move-exception
            r21 = r3
            goto L_0x026f
        L_0x0225:
            r0 = move-exception
            r21 = r3
            goto L_0x022e
        L_0x0229:
            r0 = move-exception
            r21 = r3
            r20 = r7
        L_0x022e:
            h5.i4 r2 = r2.f5649o     // Catch:{ IOException -> 0x023d }
            h5.g3 r2 = r2.w     // Catch:{ IOException -> 0x023d }
            h5.i4.n(r2)     // Catch:{ IOException -> 0x023d }
            h5.e3 r2 = r2.f5397t     // Catch:{ IOException -> 0x023d }
            java.lang.String r3 = "Failed to ungzip content"
            r2.b(r0, r3)     // Catch:{ IOException -> 0x023d }
            throw r0     // Catch:{ IOException -> 0x023d }
        L_0x023d:
            r0 = move-exception
            goto L_0x0244
        L_0x023f:
            r0 = move-exception
            r21 = r3
            r20 = r7
        L_0x0244:
            h5.g3 r2 = r8.w     // Catch:{ SQLiteException -> 0x0204 }
            h5.i4.n(r2)     // Catch:{ SQLiteException -> 0x0204 }
            h5.e3 r2 = r2.f5397t     // Catch:{ SQLiteException -> 0x0204 }
            java.lang.String r3 = "Failed to unzip queued bundle. appId"
            goto L_0x0211
        L_0x024e:
            r2.c(r7, r0, r3)     // Catch:{ SQLiteException -> 0x0204 }
        L_0x0251:
            boolean r0 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0204 }
            if (r0 == 0) goto L_0x0262
            if (r14 <= r6) goto L_0x025a
            goto L_0x0262
        L_0x025a:
            r7 = r20
            r3 = r21
            r2 = 1
            r9 = 0
            goto L_0x0193
        L_0x0262:
            r10.close()     // Catch:{ all -> 0x0525 }
            r0 = r13
            goto L_0x0288
        L_0x0267:
            r0 = move-exception
            r10 = 0
            goto L_0x0493
        L_0x026b:
            r0 = move-exception
            r21 = r3
            r10 = 0
        L_0x026f:
            h5.g3 r2 = r8.w     // Catch:{ all -> 0x0201 }
            h5.i4.n(r2)     // Catch:{ all -> 0x0201 }
            h5.e3 r2 = r2.f5397t     // Catch:{ all -> 0x0201 }
            java.lang.String r3 = "Error querying bundles. appId"
            h5.f3 r6 = h5.g3.p(r11)     // Catch:{ all -> 0x0201 }
            r2.c(r6, r0, r3)     // Catch:{ all -> 0x0201 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0201 }
            if (r10 == 0) goto L_0x0288
            r10.close()     // Catch:{ all -> 0x0525 }
        L_0x0288:
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x0525 }
            if (r2 != 0) goto L_0x0516
            h5.f r2 = r1.M(r11)     // Catch:{ all -> 0x0525 }
            boolean r2 = r2.d()     // Catch:{ all -> 0x0525 }
            if (r2 == 0) goto L_0x02ed
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0525 }
        L_0x029c:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0525 }
            if (r3 == 0) goto L_0x02bb
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0525 }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x0525 }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x0525 }
            com.google.android.gms.internal.measurement.f3 r3 = (com.google.android.gms.internal.measurement.f3) r3     // Catch:{ all -> 0x0525 }
            java.lang.String r6 = r3.x()     // Catch:{ all -> 0x0525 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0525 }
            if (r6 != 0) goto L_0x029c
            java.lang.String r2 = r3.x()     // Catch:{ all -> 0x0525 }
            goto L_0x02bc
        L_0x02bb:
            r2 = 0
        L_0x02bc:
            if (r2 == 0) goto L_0x02ed
            r3 = 0
        L_0x02bf:
            int r6 = r0.size()     // Catch:{ all -> 0x0525 }
            if (r3 >= r6) goto L_0x02ed
            java.lang.Object r6 = r0.get(r3)     // Catch:{ all -> 0x0525 }
            android.util.Pair r6 = (android.util.Pair) r6     // Catch:{ all -> 0x0525 }
            java.lang.Object r6 = r6.first     // Catch:{ all -> 0x0525 }
            com.google.android.gms.internal.measurement.f3 r6 = (com.google.android.gms.internal.measurement.f3) r6     // Catch:{ all -> 0x0525 }
            java.lang.String r7 = r6.x()     // Catch:{ all -> 0x0525 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0525 }
            if (r7 == 0) goto L_0x02da
            goto L_0x02ea
        L_0x02da:
            java.lang.String r6 = r6.x()     // Catch:{ all -> 0x0525 }
            boolean r6 = r6.equals(r2)     // Catch:{ all -> 0x0525 }
            if (r6 != 0) goto L_0x02ea
            r2 = 0
            java.util.List r0 = r0.subList(r2, r3)     // Catch:{ all -> 0x0525 }
            goto L_0x02ed
        L_0x02ea:
            int r3 = r3 + 1
            goto L_0x02bf
        L_0x02ed:
            com.google.android.gms.internal.measurement.c3 r2 = com.google.android.gms.internal.measurement.d3.t()     // Catch:{ all -> 0x0525 }
            int r3 = r0.size()     // Catch:{ all -> 0x0525 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0525 }
            int r7 = r0.size()     // Catch:{ all -> 0x0525 }
            r6.<init>(r7)     // Catch:{ all -> 0x0525 }
            h5.e r7 = r23.F()     // Catch:{ all -> 0x0525 }
            h5.d r7 = r7.f5344q     // Catch:{ all -> 0x0525 }
            java.lang.String r8 = "gaia_collection_enabled"
            java.lang.String r7 = r7.b(r11, r8)     // Catch:{ all -> 0x0525 }
            java.lang.String r8 = "1"
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x0525 }
            if (r7 == 0) goto L_0x031e
            h5.f r7 = r1.M(r11)     // Catch:{ all -> 0x0525 }
            boolean r7 = r7.d()     // Catch:{ all -> 0x0525 }
            if (r7 == 0) goto L_0x031e
            r7 = 1
            goto L_0x031f
        L_0x031e:
            r7 = 0
        L_0x031f:
            h5.f r8 = r1.M(r11)     // Catch:{ all -> 0x0525 }
            boolean r8 = r8.d()     // Catch:{ all -> 0x0525 }
            h5.f r9 = r1.M(r11)     // Catch:{ all -> 0x0525 }
            boolean r9 = r9.e()     // Catch:{ all -> 0x0525 }
            r10 = 0
        L_0x0330:
            h5.b7 r12 = r1.u
            if (r10 >= r3) goto L_0x03d8
            java.lang.Object r13 = r0.get(r10)     // Catch:{ all -> 0x0525 }
            android.util.Pair r13 = (android.util.Pair) r13     // Catch:{ all -> 0x0525 }
            java.lang.Object r13 = r13.first     // Catch:{ all -> 0x0525 }
            com.google.android.gms.internal.measurement.f3 r13 = (com.google.android.gms.internal.measurement.f3) r13     // Catch:{ all -> 0x0525 }
            com.google.android.gms.internal.measurement.b6 r13 = r13.n()     // Catch:{ all -> 0x0525 }
            com.google.android.gms.internal.measurement.e3 r13 = (com.google.android.gms.internal.measurement.e3) r13     // Catch:{ all -> 0x0525 }
            java.lang.Object r14 = r0.get(r10)     // Catch:{ all -> 0x0525 }
            android.util.Pair r14 = (android.util.Pair) r14     // Catch:{ all -> 0x0525 }
            java.lang.Object r14 = r14.second     // Catch:{ all -> 0x0525 }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ all -> 0x0525 }
            r6.add(r14)     // Catch:{ all -> 0x0525 }
            h5.e r14 = r23.F()     // Catch:{ all -> 0x0525 }
            r14.j()     // Catch:{ all -> 0x0525 }
            boolean r14 = r13.f2636q     // Catch:{ all -> 0x0525 }
            if (r14 == 0) goto L_0x0362
            r13.m()     // Catch:{ all -> 0x0525 }
            r14 = 0
            r13.f2636q = r14     // Catch:{ all -> 0x0525 }
        L_0x0362:
            MessageType r14 = r13.f2635p     // Catch:{ all -> 0x0525 }
            com.google.android.gms.internal.measurement.f3 r14 = (com.google.android.gms.internal.measurement.f3) r14     // Catch:{ all -> 0x0525 }
            com.google.android.gms.internal.measurement.f3.d0(r14)     // Catch:{ all -> 0x0525 }
            boolean r14 = r13.f2636q     // Catch:{ all -> 0x0525 }
            if (r14 == 0) goto L_0x0373
            r13.m()     // Catch:{ all -> 0x0525 }
            r14 = 0
            r13.f2636q = r14     // Catch:{ all -> 0x0525 }
        L_0x0373:
            MessageType r14 = r13.f2635p     // Catch:{ all -> 0x0525 }
            com.google.android.gms.internal.measurement.f3 r14 = (com.google.android.gms.internal.measurement.f3) r14     // Catch:{ all -> 0x0525 }
            com.google.android.gms.internal.measurement.f3.M0(r14, r4)     // Catch:{ all -> 0x0525 }
            boolean r14 = r13.f2636q     // Catch:{ all -> 0x0525 }
            if (r14 == 0) goto L_0x0384
            r13.m()     // Catch:{ all -> 0x0525 }
            r14 = 0
            r13.f2636q = r14     // Catch:{ all -> 0x0525 }
        L_0x0384:
            MessageType r14 = r13.f2635p     // Catch:{ all -> 0x0525 }
            com.google.android.gms.internal.measurement.f3 r14 = (com.google.android.gms.internal.measurement.f3) r14     // Catch:{ all -> 0x0525 }
            com.google.android.gms.internal.measurement.f3.p0(r14)     // Catch:{ all -> 0x0525 }
            if (r7 != 0) goto L_0x0390
            r13.z()     // Catch:{ all -> 0x0525 }
        L_0x0390:
            if (r8 != 0) goto L_0x0398
            r13.r()     // Catch:{ all -> 0x0525 }
            r13.s()     // Catch:{ all -> 0x0525 }
        L_0x0398:
            if (r9 != 0) goto L_0x039d
            r13.t()     // Catch:{ all -> 0x0525 }
        L_0x039d:
            h5.e r14 = r23.F()     // Catch:{ all -> 0x0525 }
            h5.s2<java.lang.Boolean> r15 = h5.u2.U     // Catch:{ all -> 0x0525 }
            boolean r14 = r14.m(r11, r15)     // Catch:{ all -> 0x0525 }
            if (r14 == 0) goto L_0x03bd
            com.google.android.gms.internal.measurement.f6 r14 = r13.j()     // Catch:{ all -> 0x0525 }
            com.google.android.gms.internal.measurement.f3 r14 = (com.google.android.gms.internal.measurement.f3) r14     // Catch:{ all -> 0x0525 }
            byte[] r14 = r14.a()     // Catch:{ all -> 0x0525 }
            E(r12)     // Catch:{ all -> 0x0525 }
            long r14 = r12.C(r14)     // Catch:{ all -> 0x0525 }
            r13.D(r14)     // Catch:{ all -> 0x0525 }
        L_0x03bd:
            boolean r12 = r2.f2636q     // Catch:{ all -> 0x0525 }
            if (r12 == 0) goto L_0x03c7
            r2.m()     // Catch:{ all -> 0x0525 }
            r12 = 0
            r2.f2636q = r12     // Catch:{ all -> 0x0525 }
        L_0x03c7:
            MessageType r12 = r2.f2635p     // Catch:{ all -> 0x0525 }
            com.google.android.gms.internal.measurement.d3 r12 = (com.google.android.gms.internal.measurement.d3) r12     // Catch:{ all -> 0x0525 }
            com.google.android.gms.internal.measurement.f6 r13 = r13.j()     // Catch:{ all -> 0x0525 }
            com.google.android.gms.internal.measurement.f3 r13 = (com.google.android.gms.internal.measurement.f3) r13     // Catch:{ all -> 0x0525 }
            com.google.android.gms.internal.measurement.d3.v(r12, r13)     // Catch:{ all -> 0x0525 }
            int r10 = r10 + 1
            goto L_0x0330
        L_0x03d8:
            h5.g3 r0 = r23.e()     // Catch:{ all -> 0x0525 }
            java.lang.String r0 = r0.r()     // Catch:{ all -> 0x0525 }
            r7 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r7)     // Catch:{ all -> 0x0525 }
            if (r0 == 0) goto L_0x03f5
            E(r12)     // Catch:{ all -> 0x0525 }
            com.google.android.gms.internal.measurement.f6 r0 = r2.j()     // Catch:{ all -> 0x0525 }
            com.google.android.gms.internal.measurement.d3 r0 = (com.google.android.gms.internal.measurement.d3) r0     // Catch:{ all -> 0x0525 }
            java.lang.String r0 = r12.u(r0)     // Catch:{ all -> 0x0525 }
            goto L_0x03f6
        L_0x03f5:
            r0 = 0
        L_0x03f6:
            E(r12)     // Catch:{ all -> 0x0525 }
            com.google.android.gms.internal.measurement.f6 r7 = r2.j()     // Catch:{ all -> 0x0525 }
            com.google.android.gms.internal.measurement.d3 r7 = (com.google.android.gms.internal.measurement.d3) r7     // Catch:{ all -> 0x0525 }
            byte[] r7 = r7.a()     // Catch:{ all -> 0x0525 }
            r23.F()     // Catch:{ all -> 0x0525 }
            h5.s2<java.lang.String> r8 = h5.u2.f5737q     // Catch:{ all -> 0x0525 }
            r9 = 0
            java.lang.Object r8 = r8.a(r9)     // Catch:{ all -> 0x0525 }
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0525 }
            java.net.URL r8 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0482 }
            r8.<init>(r9)     // Catch:{ MalformedURLException -> 0x0482 }
            boolean r10 = r6.isEmpty()     // Catch:{ MalformedURLException -> 0x0482 }
            r12 = 1
            r10 = r10 ^ r12
            n4.m.b(r10)     // Catch:{ MalformedURLException -> 0x0482 }
            java.util.ArrayList r10 = r1.K     // Catch:{ MalformedURLException -> 0x0482 }
            if (r10 == 0) goto L_0x042e
            h5.g3 r6 = r23.e()     // Catch:{ MalformedURLException -> 0x0482 }
            h5.e3 r6 = r6.f5397t     // Catch:{ MalformedURLException -> 0x0482 }
            java.lang.String r10 = "Set uploading progress before finishing the previous upload"
            r6.a(r10)     // Catch:{ MalformedURLException -> 0x0482 }
            goto L_0x0435
        L_0x042e:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x0482 }
            r10.<init>(r6)     // Catch:{ MalformedURLException -> 0x0482 }
            r1.K = r10     // Catch:{ MalformedURLException -> 0x0482 }
        L_0x0435:
            h5.g6 r6 = r1.w     // Catch:{ MalformedURLException -> 0x0482 }
            h5.q3 r6 = r6.f5415x     // Catch:{ MalformedURLException -> 0x0482 }
            r6.b(r4)     // Catch:{ MalformedURLException -> 0x0482 }
            java.lang.String r4 = "?"
            if (r3 <= 0) goto L_0x0448
            com.google.android.gms.internal.measurement.f3 r2 = r2.q()     // Catch:{ MalformedURLException -> 0x0482 }
            java.lang.String r4 = r2.r()     // Catch:{ MalformedURLException -> 0x0482 }
        L_0x0448:
            h5.g3 r2 = r23.e()     // Catch:{ MalformedURLException -> 0x0482 }
            h5.e3 r2 = r2.B     // Catch:{ MalformedURLException -> 0x0482 }
            java.lang.String r3 = "Uploading data. app, uncompressed size, data"
            int r5 = r7.length     // Catch:{ MalformedURLException -> 0x0482 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ MalformedURLException -> 0x0482 }
            r2.d(r3, r4, r5, r0)     // Catch:{ MalformedURLException -> 0x0482 }
            r2 = 1
            r1.G = r2     // Catch:{ MalformedURLException -> 0x0482 }
            E(r21)     // Catch:{ MalformedURLException -> 0x0482 }
            s2.t r0 = new s2.t     // Catch:{ MalformedURLException -> 0x0482 }
            r0.<init>((h5.z6) r1, (java.lang.String) r11)     // Catch:{ MalformedURLException -> 0x0482 }
            r21.g()     // Catch:{ MalformedURLException -> 0x0482 }
            r21.h()     // Catch:{ MalformedURLException -> 0x0482 }
            r3 = r21
            h5.i4 r2 = r3.f5649o     // Catch:{ MalformedURLException -> 0x0482 }
            h5.h4 r10 = r2.f()     // Catch:{ MalformedURLException -> 0x0482 }
            h5.k3 r12 = new h5.k3     // Catch:{ MalformedURLException -> 0x0482 }
            r13 = 0
            r2 = r12
            r4 = r11
            r5 = r8
            r6 = r7
            r7 = r13
            r8 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ MalformedURLException -> 0x0482 }
            r10.q(r12)     // Catch:{ MalformedURLException -> 0x0482 }
            goto L_0x0516
        L_0x0482:
            h5.g3 r0 = r23.e()     // Catch:{ all -> 0x0525 }
            h5.e3 r0 = r0.f5397t     // Catch:{ all -> 0x0525 }
            java.lang.String r2 = "Failed to parse upload URL. Not uploading. appId"
            h5.f3 r3 = h5.g3.p(r11)     // Catch:{ all -> 0x0525 }
            r0.c(r3, r9, r2)     // Catch:{ all -> 0x0525 }
            goto L_0x0516
        L_0x0493:
            if (r10 == 0) goto L_0x0498
            r10.close()     // Catch:{ all -> 0x0525 }
        L_0x0498:
            throw r0     // Catch:{ all -> 0x0525 }
        L_0x0499:
            r1.M = r6     // Catch:{ all -> 0x0525 }
            h5.i r0 = r1.f5850q     // Catch:{ all -> 0x0525 }
            E(r0)     // Catch:{ all -> 0x0525 }
            h5.i4 r2 = r0.f5649o
            r23.F()     // Catch:{ all -> 0x0525 }
            h5.s2<java.lang.Long> r3 = h5.u2.d     // Catch:{ all -> 0x0525 }
            r9 = 0
            java.lang.Object r3 = r3.a(r9)     // Catch:{ all -> 0x0525 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x0525 }
            long r6 = r3.longValue()     // Catch:{ all -> 0x0525 }
            long r4 = r4 - r6
            r0.g()     // Catch:{ all -> 0x0525 }
            r0.h()     // Catch:{ all -> 0x0525 }
            android.database.sqlite.SQLiteDatabase r0 = r0.y()     // Catch:{ SQLiteException -> 0x04ee, all -> 0x04eb }
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x04ee, all -> 0x04eb }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x04ee, all -> 0x04eb }
            r5 = 0
            r3[r5] = r4     // Catch:{ SQLiteException -> 0x04ee, all -> 0x04eb }
            java.lang.String r4 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            android.database.Cursor r3 = r0.rawQuery(r4, r3)     // Catch:{ SQLiteException -> 0x04ee, all -> 0x04eb }
            boolean r0 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x04e0 }
            if (r0 != 0) goto L_0x04e2
            h5.g3 r0 = r2.w     // Catch:{ SQLiteException -> 0x04e0 }
            h5.i4.n(r0)     // Catch:{ SQLiteException -> 0x04e0 }
            h5.e3 r0 = r0.B     // Catch:{ SQLiteException -> 0x04e0 }
            java.lang.String r4 = "No expired configs for apps with pending events"
            r0.a(r4)     // Catch:{ SQLiteException -> 0x04e0 }
            goto L_0x04fe
        L_0x04e0:
            r0 = move-exception
            goto L_0x04f0
        L_0x04e2:
            r4 = 0
            java.lang.String r10 = r3.getString(r4)     // Catch:{ SQLiteException -> 0x04e0 }
            r3.close()     // Catch:{ all -> 0x0525 }
            goto L_0x0502
        L_0x04eb:
            r0 = move-exception
            r10 = r9
            goto L_0x051f
        L_0x04ee:
            r0 = move-exception
            r3 = r9
        L_0x04f0:
            h5.g3 r2 = r2.w     // Catch:{ all -> 0x051d }
            h5.i4.n(r2)     // Catch:{ all -> 0x051d }
            h5.e3 r2 = r2.f5397t     // Catch:{ all -> 0x051d }
            java.lang.String r4 = "Error selecting expired configs"
            r2.b(r0, r4)     // Catch:{ all -> 0x051d }
            if (r3 == 0) goto L_0x0501
        L_0x04fe:
            r3.close()     // Catch:{ all -> 0x0525 }
        L_0x0501:
            r10 = r9
        L_0x0502:
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0525 }
            if (r0 != 0) goto L_0x0516
            h5.i r0 = r1.f5850q     // Catch:{ all -> 0x0525 }
            E(r0)     // Catch:{ all -> 0x0525 }
            h5.m4 r0 = r0.L(r10)     // Catch:{ all -> 0x0525 }
            if (r0 == 0) goto L_0x0516
            r1.h(r0)     // Catch:{ all -> 0x0525 }
        L_0x0516:
            r2 = 0
            r1.H = r2
        L_0x0519:
            r23.A()
            return
        L_0x051d:
            r0 = move-exception
            r10 = r3
        L_0x051f:
            if (r10 == 0) goto L_0x0524
            r10.close()     // Catch:{ all -> 0x0525 }
        L_0x0524:
            throw r0     // Catch:{ all -> 0x0525 }
        L_0x0525:
            r0 = move-exception
            r2 = 0
            r1.H = r2
            r23.A()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.z6.g():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009b, code lost:
        if (android.text.TextUtils.isEmpty(r2) != false) goto L_0x009d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(h5.m4 r13) {
        /*
            r12 = this;
            h5.c4 r0 = r12.f5848o
            h5.h4 r1 = r12.f()
            r1.g()
            com.google.android.gms.internal.measurement.qa.a()
            h5.e r1 = r12.F()
            java.lang.String r2 = r13.x()
            h5.s2<java.lang.Boolean> r3 = h5.u2.f5717f0
            boolean r1 = r1.m(r2, r3)
            if (r1 == 0) goto L_0x004c
            java.lang.String r1 = r13.A()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0071
            java.lang.String r1 = r13.E()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0071
            java.lang.String r1 = r13.C()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x003b
            goto L_0x0071
        L_0x003b:
            java.lang.String r5 = r13.x()
            n4.m.h(r5)
            r6 = 204(0xcc, float:2.86E-43)
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = r12
            r4.i(r5, r6, r7, r8, r9)
            return
        L_0x004c:
            java.lang.String r1 = r13.A()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0071
            java.lang.String r1 = r13.C()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0071
            java.lang.String r5 = r13.x()
            n4.m.h(r5)
            r6 = 204(0xcc, float:2.86E-43)
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = r12
            r4.i(r5, r6, r7, r8, r9)
            return
        L_0x0071:
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r2 = r13.A()
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            h5.v6 r5 = r12.f5855x
            if (r4 == 0) goto L_0x00a1
            com.google.android.gms.internal.measurement.qa.a()
            h5.i4 r2 = r5.f5649o
            h5.e r2 = r2.u
            java.lang.String r4 = r13.x()
            boolean r2 = r2.m(r4, r3)
            if (r2 == 0) goto L_0x009d
            java.lang.String r2 = r13.E()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x00a1
        L_0x009d:
            java.lang.String r2 = r13.C()
        L_0x00a1:
            h5.s2<java.lang.String> r3 = h5.u2.f5714e
            r4 = 0
            java.lang.Object r3 = r3.a(r4)
            java.lang.String r3 = (java.lang.String) r3
            android.net.Uri$Builder r3 = r1.scheme(r3)
            h5.s2<java.lang.String> r6 = h5.u2.f5716f
            java.lang.Object r6 = r6.a(r4)
            java.lang.String r6 = (java.lang.String) r6
            android.net.Uri$Builder r3 = r3.encodedAuthority(r6)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r6 = r2.length()
            java.lang.String r7 = "config/app/"
            if (r6 == 0) goto L_0x00cb
            java.lang.String r2 = r7.concat(r2)
            goto L_0x00d0
        L_0x00cb:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r7)
        L_0x00d0:
            android.net.Uri$Builder r2 = r3.path(r2)
            java.lang.String r3 = r13.y()
            java.lang.String r6 = "app_instance_id"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r6, r3)
            java.lang.String r3 = "platform"
            java.lang.String r6 = "android"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r3, r6)
            h5.i4 r3 = r5.f5649o
            h5.e r3 = r3.u
            r3.j()
            r6 = 42004(0xa414, double:2.07527E-319)
            java.lang.String r3 = java.lang.String.valueOf(r6)
            java.lang.String r6 = "gmp_version"
            r2.appendQueryParameter(r6, r3)
            com.google.android.gms.internal.measurement.pb.a()
            h5.i4 r2 = r5.f5649o
            h5.e r2 = r2.u
            java.lang.String r3 = r13.x()
            h5.s2<java.lang.Boolean> r5 = h5.u2.f5750z0
            boolean r2 = r2.m(r3, r5)
            if (r2 == 0) goto L_0x0113
            java.lang.String r2 = "runtime_version"
            java.lang.String r3 = "0"
            r1.appendQueryParameter(r2, r3)
        L_0x0113:
            android.net.Uri r1 = r1.build()
            java.lang.String r1 = r1.toString()
            java.lang.String r7 = r13.x()     // Catch:{ MalformedURLException -> 0x017f }
            n4.m.h(r7)     // Catch:{ MalformedURLException -> 0x017f }
            java.net.URL r8 = new java.net.URL     // Catch:{ MalformedURLException -> 0x017f }
            r8.<init>(r1)     // Catch:{ MalformedURLException -> 0x017f }
            h5.g3 r2 = r12.e()     // Catch:{ MalformedURLException -> 0x017f }
            h5.e3 r2 = r2.B     // Catch:{ MalformedURLException -> 0x017f }
            java.lang.String r3 = "Fetching remote configuration"
            r2.b(r7, r3)     // Catch:{ MalformedURLException -> 0x017f }
            E(r0)     // Catch:{ MalformedURLException -> 0x017f }
            com.google.android.gms.internal.measurement.o2 r2 = r0.k(r7)     // Catch:{ MalformedURLException -> 0x017f }
            E(r0)     // Catch:{ MalformedURLException -> 0x017f }
            r0.g()     // Catch:{ MalformedURLException -> 0x017f }
            n.b r0 = r0.f5308y     // Catch:{ MalformedURLException -> 0x017f }
            java.lang.Object r0 = r0.getOrDefault(r7, r4)     // Catch:{ MalformedURLException -> 0x017f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ MalformedURLException -> 0x017f }
            if (r2 == 0) goto L_0x0159
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ MalformedURLException -> 0x017f }
            if (r2 != 0) goto L_0x0159
            n.b r4 = new n.b     // Catch:{ MalformedURLException -> 0x017f }
            r4.<init>()     // Catch:{ MalformedURLException -> 0x017f }
            java.lang.String r2 = "If-Modified-Since"
            r4.put(r2, r0)     // Catch:{ MalformedURLException -> 0x017f }
        L_0x0159:
            r10 = r4
            r0 = 1
            r12.F = r0     // Catch:{ MalformedURLException -> 0x017f }
            h5.l3 r6 = r12.f5849p     // Catch:{ MalformedURLException -> 0x017f }
            E(r6)     // Catch:{ MalformedURLException -> 0x017f }
            h5.w6 r11 = new h5.w6     // Catch:{ MalformedURLException -> 0x017f }
            r11.<init>(r12)     // Catch:{ MalformedURLException -> 0x017f }
            r6.g()     // Catch:{ MalformedURLException -> 0x017f }
            r6.h()     // Catch:{ MalformedURLException -> 0x017f }
            h5.i4 r0 = r6.f5649o     // Catch:{ MalformedURLException -> 0x017f }
            h5.h4 r0 = r0.f5459x     // Catch:{ MalformedURLException -> 0x017f }
            h5.i4.n(r0)     // Catch:{ MalformedURLException -> 0x017f }
            h5.k3 r2 = new h5.k3     // Catch:{ MalformedURLException -> 0x017f }
            r9 = 0
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ MalformedURLException -> 0x017f }
            r0.q(r2)     // Catch:{ MalformedURLException -> 0x017f }
            return
        L_0x017f:
            h5.g3 r0 = r12.e()
            java.lang.String r13 = r13.x()
            h5.f3 r13 = h5.g3.p(r13)
            h5.e3 r0 = r0.f5397t
            java.lang.String r2 = "Failed to parse config URL. Not fetching. appId"
            r0.c(r13, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.z6.h(h5.m4):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048 A[Catch:{ all -> 0x00de, all -> 0x0184 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0132 A[Catch:{ all -> 0x00de, all -> 0x0184 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013e A[Catch:{ all -> 0x00de, all -> 0x0184 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(java.lang.String r10, int r11, java.lang.Throwable r12, byte[] r13, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r14) {
        /*
            r9 = this;
            h5.h4 r0 = r9.f()
            r0.g()
            r9.K()
            n4.m.e(r10)
            r0 = 0
            if (r13 != 0) goto L_0x0012
            byte[] r13 = new byte[r0]     // Catch:{ all -> 0x0184 }
        L_0x0012:
            h5.g3 r1 = r9.e()     // Catch:{ all -> 0x0184 }
            h5.e3 r1 = r1.B     // Catch:{ all -> 0x0184 }
            int r2 = r13.length     // Catch:{ all -> 0x0184 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0184 }
            java.lang.String r3 = "onConfigFetched. Response size"
            r1.b(r2, r3)     // Catch:{ all -> 0x0184 }
            h5.i r1 = r9.f5850q     // Catch:{ all -> 0x0184 }
            E(r1)     // Catch:{ all -> 0x0184 }
            r1.v()     // Catch:{ all -> 0x0184 }
            h5.i r1 = r9.f5850q     // Catch:{ all -> 0x00de }
            E(r1)     // Catch:{ all -> 0x00de }
            h5.m4 r1 = r1.L(r10)     // Catch:{ all -> 0x00de }
            r3 = 1
            r4 = 200(0xc8, float:2.8E-43)
            r5 = 304(0x130, float:4.26E-43)
            if (r11 == r4) goto L_0x0041
            r4 = 204(0xcc, float:2.86E-43)
            if (r11 == r4) goto L_0x0041
            if (r11 != r5) goto L_0x0045
            r11 = r5
        L_0x0041:
            if (r12 != 0) goto L_0x0045
            r4 = r3
            goto L_0x0046
        L_0x0045:
            r4 = r0
        L_0x0046:
            if (r1 != 0) goto L_0x0059
            h5.g3 r11 = r9.e()     // Catch:{ all -> 0x00de }
            h5.e3 r11 = r11.w     // Catch:{ all -> 0x00de }
            java.lang.String r12 = "App does not exist in onConfigFetched. appId"
            h5.f3 r10 = h5.g3.p(r10)     // Catch:{ all -> 0x00de }
            r11.b(r10, r12)     // Catch:{ all -> 0x00de }
            goto L_0x0165
        L_0x0059:
            r6 = 404(0x194, float:5.66E-43)
            h5.c4 r7 = r9.f5848o
            r8 = 0
            if (r4 != 0) goto L_0x00e1
            if (r11 != r6) goto L_0x0064
            goto L_0x00e1
        L_0x0064:
            r4.c r13 = r9.c()     // Catch:{ all -> 0x00de }
            r4.d r13 = (r4.d) r13     // Catch:{ all -> 0x00de }
            r13.getClass()     // Catch:{ all -> 0x00de }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00de }
            h5.i4 r2 = r1.f5555a     // Catch:{ all -> 0x00de }
            h5.h4 r2 = r2.f5459x     // Catch:{ all -> 0x00de }
            h5.i4.n(r2)     // Catch:{ all -> 0x00de }
            r2.g()     // Catch:{ all -> 0x00de }
            boolean r2 = r1.D     // Catch:{ all -> 0x00de }
            long r4 = r1.F     // Catch:{ all -> 0x00de }
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r3 = r0
        L_0x0085:
            r2 = r2 | r3
            r1.D = r2     // Catch:{ all -> 0x00de }
            r1.F = r13     // Catch:{ all -> 0x00de }
            h5.i r13 = r9.f5850q     // Catch:{ all -> 0x00de }
            E(r13)     // Catch:{ all -> 0x00de }
            r13.M(r1)     // Catch:{ all -> 0x00de }
            h5.g3 r13 = r9.e()     // Catch:{ all -> 0x00de }
            h5.e3 r13 = r13.B     // Catch:{ all -> 0x00de }
            java.lang.String r14 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00de }
            r13.c(r1, r12, r14)     // Catch:{ all -> 0x00de }
            E(r7)     // Catch:{ all -> 0x00de }
            r7.g()     // Catch:{ all -> 0x00de }
            n.b r12 = r7.f5308y     // Catch:{ all -> 0x00de }
            r12.put(r10, r8)     // Catch:{ all -> 0x00de }
            h5.g6 r10 = r9.w     // Catch:{ all -> 0x00de }
            h5.q3 r10 = r10.f5415x     // Catch:{ all -> 0x00de }
            r4.c r12 = r9.c()     // Catch:{ all -> 0x00de }
            r4.d r12 = (r4.d) r12     // Catch:{ all -> 0x00de }
            r12.getClass()     // Catch:{ all -> 0x00de }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00de }
            r10.b(r12)     // Catch:{ all -> 0x00de }
            r10 = 503(0x1f7, float:7.05E-43)
            if (r11 == r10) goto L_0x00c8
            r10 = 429(0x1ad, float:6.01E-43)
            if (r11 != r10) goto L_0x0162
        L_0x00c8:
            h5.g6 r10 = r9.w     // Catch:{ all -> 0x00de }
            h5.q3 r10 = r10.f5414v     // Catch:{ all -> 0x00de }
            r4.c r11 = r9.c()     // Catch:{ all -> 0x00de }
            r4.d r11 = (r4.d) r11     // Catch:{ all -> 0x00de }
            r11.getClass()     // Catch:{ all -> 0x00de }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00de }
            r10.b(r11)     // Catch:{ all -> 0x00de }
            goto L_0x0162
        L_0x00de:
            r10 = move-exception
            goto L_0x017b
        L_0x00e1:
            if (r14 == 0) goto L_0x00ec
            java.lang.String r12 = "Last-Modified"
            java.lang.Object r12 = r14.get(r12)     // Catch:{ all -> 0x00de }
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x00de }
            goto L_0x00ed
        L_0x00ec:
            r12 = r8
        L_0x00ed:
            if (r12 == 0) goto L_0x00fc
            int r14 = r12.size()     // Catch:{ all -> 0x00de }
            if (r14 <= 0) goto L_0x00fc
            java.lang.Object r12 = r12.get(r0)     // Catch:{ all -> 0x00de }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x00de }
            goto L_0x00fd
        L_0x00fc:
            r12 = r8
        L_0x00fd:
            if (r11 == r6) goto L_0x0109
            if (r11 != r5) goto L_0x0102
            goto L_0x0109
        L_0x0102:
            E(r7)     // Catch:{ all -> 0x00de }
            r7.m(r10, r12, r13)     // Catch:{ all -> 0x00de }
            goto L_0x0118
        L_0x0109:
            E(r7)     // Catch:{ all -> 0x00de }
            com.google.android.gms.internal.measurement.o2 r12 = r7.k(r10)     // Catch:{ all -> 0x00de }
            if (r12 != 0) goto L_0x0118
            E(r7)     // Catch:{ all -> 0x00de }
            r7.m(r10, r8, r8)     // Catch:{ all -> 0x00de }
        L_0x0118:
            r4.c r12 = r9.c()     // Catch:{ all -> 0x00de }
            r4.d r12 = (r4.d) r12     // Catch:{ all -> 0x00de }
            r12.getClass()     // Catch:{ all -> 0x00de }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00de }
            r1.i(r12)     // Catch:{ all -> 0x00de }
            h5.i r12 = r9.f5850q     // Catch:{ all -> 0x00de }
            E(r12)     // Catch:{ all -> 0x00de }
            r12.M(r1)     // Catch:{ all -> 0x00de }
            if (r11 != r6) goto L_0x013e
            h5.g3 r11 = r9.e()     // Catch:{ all -> 0x00de }
            h5.e3 r11 = r11.f5400y     // Catch:{ all -> 0x00de }
            java.lang.String r12 = "Config not found. Using empty config. appId"
            r11.b(r10, r12)     // Catch:{ all -> 0x00de }
            goto L_0x014d
        L_0x013e:
            h5.g3 r10 = r9.e()     // Catch:{ all -> 0x00de }
            h5.e3 r10 = r10.B     // Catch:{ all -> 0x00de }
            java.lang.String r12 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00de }
            r10.c(r11, r2, r12)     // Catch:{ all -> 0x00de }
        L_0x014d:
            h5.l3 r10 = r9.f5849p     // Catch:{ all -> 0x00de }
            E(r10)     // Catch:{ all -> 0x00de }
            boolean r10 = r10.k()     // Catch:{ all -> 0x00de }
            if (r10 == 0) goto L_0x0162
            boolean r10 = r9.y()     // Catch:{ all -> 0x00de }
            if (r10 == 0) goto L_0x0162
            r9.g()     // Catch:{ all -> 0x00de }
            goto L_0x0165
        L_0x0162:
            r9.z()     // Catch:{ all -> 0x00de }
        L_0x0165:
            h5.i r10 = r9.f5850q     // Catch:{ all -> 0x00de }
            E(r10)     // Catch:{ all -> 0x00de }
            r10.w()     // Catch:{ all -> 0x00de }
            h5.i r10 = r9.f5850q     // Catch:{ all -> 0x0184 }
            E(r10)     // Catch:{ all -> 0x0184 }
            r10.x()     // Catch:{ all -> 0x0184 }
            r9.F = r0
            r9.A()
            return
        L_0x017b:
            h5.i r11 = r9.f5850q     // Catch:{ all -> 0x0184 }
            E(r11)     // Catch:{ all -> 0x0184 }
            r11.x()     // Catch:{ all -> 0x0184 }
            throw r10     // Catch:{ all -> 0x0184 }
        L_0x0184:
            r10 = move-exception
            r9.F = r0
            r9.A()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.z6.i(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r11 = this;
            h5.h4 r0 = r11.f()
            r0.g()
            r11.K()
            boolean r0 = r11.A
            if (r0 != 0) goto L_0x01a0
            r0 = 1
            r11.A = r0
            h5.h4 r1 = r11.f()
            r1.g()
            h5.e r1 = r11.F()
            h5.s2<java.lang.Boolean> r2 = h5.u2.f5715e0
            r3 = 0
            boolean r1 = r1.m(r3, r2)
            h5.i4 r2 = r11.f5856y
            r4 = 0
            java.lang.String r5 = "Storage concurrent access okay"
            if (r1 == 0) goto L_0x003f
            java.nio.channels.FileLock r1 = r11.I
            if (r1 == 0) goto L_0x003f
            boolean r1 = r1.isValid()
            if (r1 != 0) goto L_0x0035
            goto L_0x003f
        L_0x0035:
            h5.g3 r1 = r11.e()
            h5.e3 r1 = r1.B
            r1.a(r5)
            goto L_0x0071
        L_0x003f:
            h5.i r1 = r11.f5850q
            h5.i4 r1 = r1.f5649o
            r1.getClass()
            android.content.Context r1 = r2.f5452o
            java.io.File r1 = r1.getFilesDir()
            java.io.File r6 = new java.io.File
            java.lang.String r7 = "google_app_measurement.db"
            r6.<init>(r1, r7)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0091, IOException -> 0x0089, OverlappingFileLockException -> 0x007f }
            java.lang.String r7 = "rw"
            r1.<init>(r6, r7)     // Catch:{ FileNotFoundException -> 0x0091, IOException -> 0x0089, OverlappingFileLockException -> 0x007f }
            java.nio.channels.FileChannel r1 = r1.getChannel()     // Catch:{ FileNotFoundException -> 0x0091, IOException -> 0x0089, OverlappingFileLockException -> 0x007f }
            r11.J = r1     // Catch:{ FileNotFoundException -> 0x0091, IOException -> 0x0089, OverlappingFileLockException -> 0x007f }
            java.nio.channels.FileLock r1 = r1.tryLock()     // Catch:{ FileNotFoundException -> 0x0091, IOException -> 0x0089, OverlappingFileLockException -> 0x007f }
            r11.I = r1     // Catch:{ FileNotFoundException -> 0x0091, IOException -> 0x0089, OverlappingFileLockException -> 0x007f }
            if (r1 == 0) goto L_0x0073
            h5.g3 r1 = r11.e()     // Catch:{ FileNotFoundException -> 0x0091, IOException -> 0x0089, OverlappingFileLockException -> 0x007f }
            h5.e3 r1 = r1.B     // Catch:{ FileNotFoundException -> 0x0091, IOException -> 0x0089, OverlappingFileLockException -> 0x007f }
            r1.a(r5)     // Catch:{ FileNotFoundException -> 0x0091, IOException -> 0x0089, OverlappingFileLockException -> 0x007f }
        L_0x0071:
            r1 = r0
            goto L_0x009e
        L_0x0073:
            h5.g3 r1 = r11.e()     // Catch:{ FileNotFoundException -> 0x0091, IOException -> 0x0089, OverlappingFileLockException -> 0x007f }
            h5.e3 r1 = r1.f5397t     // Catch:{ FileNotFoundException -> 0x0091, IOException -> 0x0089, OverlappingFileLockException -> 0x007f }
            java.lang.String r5 = "Storage concurrent data access panic"
            r1.a(r5)     // Catch:{ FileNotFoundException -> 0x0091, IOException -> 0x0089, OverlappingFileLockException -> 0x007f }
            goto L_0x009d
        L_0x007f:
            r1 = move-exception
            h5.g3 r5 = r11.e()
            java.lang.String r6 = "Storage lock already acquired"
            h5.e3 r5 = r5.w
            goto L_0x009a
        L_0x0089:
            r1 = move-exception
            h5.g3 r5 = r11.e()
            java.lang.String r6 = "Failed to access storage lock file"
            goto L_0x0098
        L_0x0091:
            r1 = move-exception
            h5.g3 r5 = r11.e()
            java.lang.String r6 = "Failed to acquire storage lock"
        L_0x0098:
            h5.e3 r5 = r5.f5397t
        L_0x009a:
            r5.b(r1, r6)
        L_0x009d:
            r1 = r4
        L_0x009e:
            if (r1 == 0) goto L_0x01a0
            java.nio.channels.FileChannel r1 = r11.J
            h5.h4 r5 = r11.f()
            r5.g()
            r5 = 0
            java.lang.String r7 = "Bad channel to read from"
            r8 = 4
            if (r1 == 0) goto L_0x00ec
            boolean r9 = r1.isOpen()
            if (r9 != 0) goto L_0x00b7
            goto L_0x00ec
        L_0x00b7:
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.allocate(r8)
            r1.position(r5)     // Catch:{ IOException -> 0x00df }
            int r1 = r1.read(r9)     // Catch:{ IOException -> 0x00df }
            if (r1 == r8) goto L_0x00d7
            r9 = -1
            if (r1 == r9) goto L_0x00f5
            h5.g3 r9 = r11.e()     // Catch:{ IOException -> 0x00df }
            h5.e3 r9 = r9.w     // Catch:{ IOException -> 0x00df }
            java.lang.String r10 = "Unexpected data length. Bytes read"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x00df }
            r9.b(r1, r10)     // Catch:{ IOException -> 0x00df }
            goto L_0x00f5
        L_0x00d7:
            r9.flip()     // Catch:{ IOException -> 0x00df }
            int r4 = r9.getInt()     // Catch:{ IOException -> 0x00df }
            goto L_0x00f5
        L_0x00df:
            r1 = move-exception
            h5.g3 r9 = r11.e()
            java.lang.String r10 = "Failed to read from channel"
            h5.e3 r9 = r9.f5397t
            r9.b(r1, r10)
            goto L_0x00f5
        L_0x00ec:
            h5.g3 r1 = r11.e()
            h5.e3 r1 = r1.f5397t
            r1.a(r7)
        L_0x00f5:
            h5.y2 r1 = r2.b()
            r1.h()
            int r1 = r1.f5815s
            h5.h4 r2 = r11.f()
            r2.g()
            if (r4 <= r1) goto L_0x0119
            h5.g3 r0 = r11.e()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            h5.e3 r0 = r0.f5397t
            java.lang.String r3 = "Panic: can't downgrade version. Previous, current version"
            goto L_0x019d
        L_0x0119:
            if (r4 >= r1) goto L_0x01a0
            java.nio.channels.FileChannel r2 = r11.J
            h5.h4 r9 = r11.f()
            r9.g()
            if (r2 == 0) goto L_0x0184
            boolean r9 = r2.isOpen()
            if (r9 != 0) goto L_0x012d
            goto L_0x0184
        L_0x012d:
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r8)
            r7.putInt(r1)
            r7.flip()
            r2.truncate(r5)     // Catch:{ IOException -> 0x0177 }
            h5.e r5 = r11.F()     // Catch:{ IOException -> 0x0177 }
            h5.s2<java.lang.Boolean> r6 = h5.u2.f5734o0     // Catch:{ IOException -> 0x0177 }
            r5.m(r3, r6)     // Catch:{ IOException -> 0x0177 }
            r2.write(r7)     // Catch:{ IOException -> 0x0177 }
            r2.force(r0)     // Catch:{ IOException -> 0x0177 }
            long r5 = r2.size()     // Catch:{ IOException -> 0x0177 }
            r7 = 4
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0166
            h5.g3 r0 = r11.e()     // Catch:{ IOException -> 0x0177 }
            h5.e3 r0 = r0.f5397t     // Catch:{ IOException -> 0x0177 }
            java.lang.String r3 = "Error writing to channel. Bytes written"
            long r5 = r2.size()     // Catch:{ IOException -> 0x0177 }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ IOException -> 0x0177 }
            r0.b(r2, r3)     // Catch:{ IOException -> 0x0177 }
        L_0x0166:
            h5.g3 r0 = r11.e()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            h5.e3 r0 = r0.B
            java.lang.String r3 = "Storage version upgraded. Previous, current version"
            goto L_0x019d
        L_0x0177:
            r0 = move-exception
            h5.g3 r2 = r11.e()
            java.lang.String r3 = "Failed to write to channel"
            h5.e3 r2 = r2.f5397t
            r2.b(r0, r3)
            goto L_0x018d
        L_0x0184:
            h5.g3 r0 = r11.e()
            h5.e3 r0 = r0.f5397t
            r0.a(r7)
        L_0x018d:
            h5.g3 r0 = r11.e()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            h5.e3 r0 = r0.f5397t
            java.lang.String r3 = "Storage version upgrade failed. Previous, current version"
        L_0x019d:
            r0.c(r2, r1, r3)
        L_0x01a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.z6.j():void");
    }

    public final void k(i7 i7Var) {
        if (this.K != null) {
            ArrayList arrayList = new ArrayList();
            this.L = arrayList;
            arrayList.addAll(this.K);
        }
        i iVar = this.f5850q;
        E(iVar);
        i4 i4Var = iVar.f5649o;
        String str = i7Var.f5468o;
        m.h(str);
        m.e(str);
        iVar.g();
        iVar.h();
        try {
            SQLiteDatabase y10 = iVar.y();
            String[] strArr = {str};
            int delete = y10.delete("apps", "app_id=?", strArr) + y10.delete("events", "app_id=?", strArr) + y10.delete("user_attributes", "app_id=?", strArr) + y10.delete("conditional_properties", "app_id=?", strArr) + y10.delete("raw_events", "app_id=?", strArr) + y10.delete("raw_events_metadata", "app_id=?", strArr) + y10.delete("queue", "app_id=?", strArr) + y10.delete("audience_filter_values", "app_id=?", strArr) + y10.delete("main_event_params", "app_id=?", strArr) + y10.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                g3 g3Var = i4Var.w;
                i4.n(g3Var);
                g3Var.B.c(str, Integer.valueOf(delete), "Reset analytics data. app, records");
            }
        } catch (SQLiteException e10) {
            g3 g3Var2 = i4Var.w;
            i4.n(g3Var2);
            g3Var2.f5397t.c(g3.p(str), e10, "Error resetting analytics data. appId, error");
        }
        if (i7Var.f5474v) {
            n(i7Var);
        }
    }

    public final void l(c7 c7Var, i7 i7Var) {
        long j8;
        int i10;
        int i11;
        c7 c7Var2 = c7Var;
        i7 i7Var2 = i7Var;
        f().g();
        K();
        if (D(i7Var2)) {
            if (!i7Var2.f5474v) {
                q(i7Var2);
                return;
            }
            int f02 = J().f0(c7Var2.f5318p);
            w6 w6Var = this.O;
            String str = c7Var2.f5318p;
            if (f02 != 0) {
                J();
                F();
                String m10 = g7.m(str, 24, true);
                if (str != null) {
                    i11 = str.length();
                } else {
                    i11 = 0;
                }
                J().w(w6Var, i7Var2.f5468o, f02, "_ev", m10, i11, F().m((String) null, u2.t0));
                return;
            }
            int t10 = J().t(c7Var.g0(), str);
            if (t10 != 0) {
                J();
                F();
                String m11 = g7.m(str, 24, true);
                Object g02 = c7Var.g0();
                if (g02 == null || (!(g02 instanceof String) && !(g02 instanceof CharSequence))) {
                    i10 = 0;
                } else {
                    i10 = String.valueOf(g02).length();
                }
                J().w(w6Var, i7Var2.f5468o, t10, "_ev", m11, i10, F().m((String) null, u2.t0));
                return;
            }
            Object u10 = J().u(c7Var.g0(), str);
            if (u10 != null) {
                boolean equals = "_sid".equals(str);
                String str2 = i7Var2.f5468o;
                if (equals) {
                    long j10 = c7Var2.f5319q;
                    String str3 = c7Var2.f5322t;
                    m.h(str2);
                    i iVar = this.f5850q;
                    E(iVar);
                    e7 D2 = iVar.D(str2, "_sno");
                    if (D2 != null) {
                        Object obj = D2.f5365e;
                        if (obj instanceof Long) {
                            j8 = ((Long) obj).longValue();
                            l(new c7(j10, Long.valueOf(j8 + 1), "_sno", str3), i7Var2);
                        }
                    }
                    if (D2 != null) {
                        e().w.b(D2.f5365e, "Retrieved last session number from database does not contain a valid (long) value");
                    }
                    i iVar2 = this.f5850q;
                    E(iVar2);
                    m z10 = iVar2.z(str2, "_s");
                    if (z10 != null) {
                        g3 e10 = e();
                        long j11 = z10.f5543c;
                        e10.B.b(Long.valueOf(j11), "Backfill the session number. Last used session number");
                        j8 = j11;
                    } else {
                        j8 = 0;
                    }
                    l(new c7(j10, Long.valueOf(j8 + 1), "_sno", str3), i7Var2);
                }
                m.h(str2);
                String str4 = c7Var2.f5322t;
                m.h(str4);
                e7 e7Var = new e7(str2, str4, c7Var2.f5318p, c7Var2.f5319q, u10);
                g3 e11 = e();
                i4 i4Var = this.f5856y;
                b3 b3Var = i4Var.A;
                i4.l(b3Var);
                String str5 = e7Var.f5364c;
                e11.B.c(b3Var.n(str5), u10, "Setting user property");
                i iVar3 = this.f5850q;
                E(iVar3);
                iVar3.v();
                try {
                    q(i7Var2);
                    i iVar4 = this.f5850q;
                    E(iVar4);
                    boolean C2 = iVar4.C(e7Var);
                    i iVar5 = this.f5850q;
                    E(iVar5);
                    iVar5.w();
                    if (!C2) {
                        e3 e3Var = e().f5397t;
                        b3 b3Var2 = i4Var.A;
                        i4.l(b3Var2);
                        e3Var.c(b3Var2.n(str5), e7Var.f5365e, "Too many unique user properties are set. Ignoring user property");
                        J().w(w6Var, i7Var2.f5468o, 9, (String) null, (String) null, 0, F().m((String) null, u2.t0));
                    }
                } finally {
                    i iVar6 = this.f5850q;
                    E(iVar6);
                    iVar6.x();
                }
            }
        }
    }

    public final void m(c7 c7Var, i7 i7Var) {
        Boolean bool;
        long j8;
        f().g();
        K();
        if (D(i7Var)) {
            if (!i7Var.f5474v) {
                q(i7Var);
            } else if (!"_npa".equals(c7Var.f5318p) || (bool = i7Var.F) == null) {
                g3 e10 = e();
                i4 i4Var = this.f5856y;
                b3 b3Var = i4Var.A;
                i4.l(b3Var);
                String str = c7Var.f5318p;
                e10.A.b(b3Var.n(str), "Removing user property");
                i iVar = this.f5850q;
                E(iVar);
                iVar.v();
                try {
                    q(i7Var);
                    i iVar2 = this.f5850q;
                    E(iVar2);
                    String str2 = i7Var.f5468o;
                    m.h(str2);
                    iVar2.B(str2, str);
                    i iVar3 = this.f5850q;
                    E(iVar3);
                    iVar3.w();
                    e3 e3Var = e().A;
                    b3 b3Var2 = i4Var.A;
                    i4.l(b3Var2);
                    e3Var.b(b3Var2.n(str), "User property removed");
                } finally {
                    i iVar4 = this.f5850q;
                    E(iVar4);
                    iVar4.x();
                }
            } else {
                e().A.a("Falling back to manifest metadata value for ad personalization");
                ((r4.d) c()).getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (true != bool.booleanValue()) {
                    j8 = 0;
                } else {
                    j8 = 1;
                }
                l(new c7(currentTimeMillis, Long.valueOf(j8), "_npa", "auto"), i7Var);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x0396 A[Catch:{ RuntimeException -> 0x0342, all -> 0x0531 }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03b3 A[Catch:{ RuntimeException -> 0x0342, all -> 0x0531 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03c6 A[SYNTHETIC, Splitter:B:140:0x03c6] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x044b A[Catch:{ RuntimeException -> 0x0342, all -> 0x0531 }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0467 A[Catch:{ RuntimeException -> 0x0342, all -> 0x0531 }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x04fe A[Catch:{ RuntimeException -> 0x0342, all -> 0x0531 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01e4 A[Catch:{ RuntimeException -> 0x0342, all -> 0x0531 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x021a A[Catch:{ RuntimeException -> 0x0342, all -> 0x0531 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x023b A[Catch:{ RuntimeException -> 0x0342, all -> 0x0531 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0241 A[Catch:{ RuntimeException -> 0x0342, all -> 0x0531 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x024e A[Catch:{ RuntimeException -> 0x0342, all -> 0x0531 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x025c A[Catch:{ RuntimeException -> 0x0342, all -> 0x0531 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(h5.i7 r29) {
        /*
            r28 = this;
            r1 = r28
            r2 = r29
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "com.android.vending"
            java.lang.String r6 = "_pfo"
            java.lang.String r7 = "_uwa"
            java.lang.String r0 = "app_id=?"
            h5.h4 r8 = r28.f()
            r8.g()
            r28.K()
            n4.m.h(r29)
            java.lang.String r8 = r2.f5468o
            n4.m.e(r8)
            boolean r9 = r28.D(r29)
            if (r9 == 0) goto L_0x053b
            h5.i r9 = r1.f5850q
            E(r9)
            h5.m4 r9 = r9.L(r8)
            r10 = 0
            java.lang.String r12 = r2.f5469p
            if (r9 == 0) goto L_0x005f
            java.lang.String r13 = r9.A()
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L_0x005f
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 != 0) goto L_0x005f
            r9.i(r10)
            h5.i r13 = r1.f5850q
            E(r13)
            r13.M(r9)
            h5.c4 r9 = r1.f5848o
            E(r9)
            r9.g()
            n.b r9 = r9.u
            r9.remove(r8)
        L_0x005f:
            boolean r9 = r2.f5474v
            if (r9 != 0) goto L_0x0067
            r28.q(r29)
            return
        L_0x0067:
            long r13 = r2.A
            int r9 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x007a
            r4.c r9 = r28.c()
            r4.d r9 = (r4.d) r9
            r9.getClass()
            long r13 = java.lang.System.currentTimeMillis()
        L_0x007a:
            h5.i4 r9 = r1.f5856y
            h5.k r15 = r9.s()
            android.content.Context r10 = r9.f5452o
            r15.g()
            r11 = 0
            r15.f5497t = r11
            r21 = r12
            r11 = 0
            r15.u = r11
            r12 = 1
            int r15 = r2.B
            if (r15 == 0) goto L_0x00ac
            if (r15 == r12) goto L_0x00ac
            h5.g3 r11 = r28.e()
            h5.f3 r12 = h5.g3.p(r8)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            h5.e3 r11 = r11.w
            r22 = r10
            java.lang.String r10 = "Incorrect app type, assuming installed app. appId, appType"
            r11.c(r12, r15, r10)
            r10 = 0
            goto L_0x00af
        L_0x00ac:
            r22 = r10
            r10 = r15
        L_0x00af:
            h5.i r11 = r1.f5850q
            E(r11)
            r11.v()
            h5.i r11 = r1.f5850q     // Catch:{ all -> 0x0531 }
            E(r11)     // Catch:{ all -> 0x0531 }
            java.lang.String r12 = "_npa"
            h5.e7 r11 = r11.D(r8, r12)     // Catch:{ all -> 0x0531 }
            r12 = r3
            r23 = r4
            if (r11 == 0) goto L_0x00d1
            java.lang.String r15 = "auto"
            java.lang.String r3 = r11.f5363b     // Catch:{ all -> 0x0531 }
            boolean r3 = r15.equals(r3)     // Catch:{ all -> 0x0531 }
            if (r3 == 0) goto L_0x0114
        L_0x00d1:
            java.lang.Boolean r3 = r2.F     // Catch:{ all -> 0x0531 }
            if (r3 == 0) goto L_0x0101
            h5.c7 r4 = new h5.c7     // Catch:{ all -> 0x0531 }
            java.lang.String r19 = "_npa"
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0531 }
            r15 = 1
            if (r15 == r3) goto L_0x00e3
            r15 = 0
            goto L_0x00e5
        L_0x00e3:
            r15 = 1
        L_0x00e5:
            java.lang.Long r18 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0531 }
            java.lang.String r20 = "auto"
            r15 = r4
            r16 = r13
            r15.<init>(r16, r18, r19, r20)     // Catch:{ all -> 0x0531 }
            if (r11 == 0) goto L_0x00fd
            java.lang.Object r3 = r11.f5365e     // Catch:{ all -> 0x0531 }
            java.lang.Long r11 = r4.f5320r     // Catch:{ all -> 0x0531 }
            boolean r3 = r3.equals(r11)     // Catch:{ all -> 0x0531 }
            if (r3 != 0) goto L_0x0114
        L_0x00fd:
            r1.l(r4, r2)     // Catch:{ all -> 0x0531 }
            goto L_0x0114
        L_0x0101:
            if (r11 == 0) goto L_0x0114
            h5.c7 r3 = new h5.c7     // Catch:{ all -> 0x0531 }
            java.lang.String r19 = "_npa"
            r18 = 0
            java.lang.String r20 = "auto"
            r15 = r3
            r16 = r13
            r15.<init>(r16, r18, r19, r20)     // Catch:{ all -> 0x0531 }
            r1.m(r3, r2)     // Catch:{ all -> 0x0531 }
        L_0x0114:
            h5.i r3 = r1.f5850q     // Catch:{ all -> 0x0531 }
            E(r3)     // Catch:{ all -> 0x0531 }
            n4.m.h(r8)     // Catch:{ all -> 0x0531 }
            h5.m4 r3 = r3.L(r8)     // Catch:{ all -> 0x0531 }
            if (r3 == 0) goto L_0x01de
            r28.J()     // Catch:{ all -> 0x0531 }
            java.lang.String r4 = r3.A()     // Catch:{ all -> 0x0531 }
            java.lang.String r11 = r2.E     // Catch:{ all -> 0x0531 }
            java.lang.String r15 = r3.C()     // Catch:{ all -> 0x0531 }
            r24 = r12
            r12 = r21
            boolean r4 = h5.g7.l(r12, r4, r11, r15)     // Catch:{ all -> 0x0531 }
            if (r4 == 0) goto L_0x01db
            h5.g3 r4 = r28.e()     // Catch:{ all -> 0x0531 }
            h5.e3 r4 = r4.w     // Catch:{ all -> 0x0531 }
            java.lang.String r11 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r12 = r3.x()     // Catch:{ all -> 0x0531 }
            h5.f3 r12 = h5.g3.p(r12)     // Catch:{ all -> 0x0531 }
            r4.b(r12, r11)     // Catch:{ all -> 0x0531 }
            h5.i r4 = r1.f5850q     // Catch:{ all -> 0x0531 }
            E(r4)     // Catch:{ all -> 0x0531 }
            h5.i4 r11 = r4.f5649o
            java.lang.String r3 = r3.x()     // Catch:{ all -> 0x0531 }
            r4.h()     // Catch:{ all -> 0x0531 }
            r4.g()     // Catch:{ all -> 0x0531 }
            n4.m.e(r3)     // Catch:{ all -> 0x0531 }
            android.database.sqlite.SQLiteDatabase r4 = r4.y()     // Catch:{ SQLiteException -> 0x01c6 }
            r12 = 1
            java.lang.String[] r15 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x01c6 }
            r12 = 0
            r15[r12] = r3     // Catch:{ SQLiteException -> 0x01c6 }
            java.lang.String r12 = "events"
            int r12 = r4.delete(r12, r0, r15)     // Catch:{ SQLiteException -> 0x01c6 }
            r21 = r6
            java.lang.String r6 = "user_attributes"
            int r6 = r4.delete(r6, r0, r15)     // Catch:{ SQLiteException -> 0x01c4 }
            int r12 = r12 + r6
            java.lang.String r6 = "conditional_properties"
            int r6 = r4.delete(r6, r0, r15)     // Catch:{ SQLiteException -> 0x01c4 }
            int r12 = r12 + r6
            java.lang.String r6 = "apps"
            int r6 = r4.delete(r6, r0, r15)     // Catch:{ SQLiteException -> 0x01c4 }
            int r12 = r12 + r6
            java.lang.String r6 = "raw_events"
            int r6 = r4.delete(r6, r0, r15)     // Catch:{ SQLiteException -> 0x01c4 }
            int r12 = r12 + r6
            java.lang.String r6 = "raw_events_metadata"
            int r6 = r4.delete(r6, r0, r15)     // Catch:{ SQLiteException -> 0x01c4 }
            int r12 = r12 + r6
            java.lang.String r6 = "event_filters"
            int r6 = r4.delete(r6, r0, r15)     // Catch:{ SQLiteException -> 0x01c4 }
            int r12 = r12 + r6
            java.lang.String r6 = "property_filters"
            int r6 = r4.delete(r6, r0, r15)     // Catch:{ SQLiteException -> 0x01c4 }
            int r12 = r12 + r6
            java.lang.String r6 = "audience_filter_values"
            int r6 = r4.delete(r6, r0, r15)     // Catch:{ SQLiteException -> 0x01c4 }
            int r12 = r12 + r6
            java.lang.String r6 = "consent_settings"
            int r0 = r4.delete(r6, r0, r15)     // Catch:{ SQLiteException -> 0x01c4 }
            int r12 = r12 + r0
            if (r12 <= 0) goto L_0x01d9
            h5.g3 r0 = r11.w     // Catch:{ SQLiteException -> 0x01c4 }
            h5.i4.n(r0)     // Catch:{ SQLiteException -> 0x01c4 }
            h5.e3 r0 = r0.B     // Catch:{ SQLiteException -> 0x01c4 }
            java.lang.String r4 = "Deleted application data. app, records"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)     // Catch:{ SQLiteException -> 0x01c4 }
            r0.c(r3, r6, r4)     // Catch:{ SQLiteException -> 0x01c4 }
            goto L_0x01d9
        L_0x01c4:
            r0 = move-exception
            goto L_0x01c9
        L_0x01c6:
            r0 = move-exception
            r21 = r6
        L_0x01c9:
            h5.g3 r4 = r11.w     // Catch:{ all -> 0x0531 }
            h5.i4.n(r4)     // Catch:{ all -> 0x0531 }
            h5.e3 r4 = r4.f5397t     // Catch:{ all -> 0x0531 }
            java.lang.String r6 = "Error deleting application data. appId, error"
            h5.f3 r3 = h5.g3.p(r3)     // Catch:{ all -> 0x0531 }
            r4.c(r3, r0, r6)     // Catch:{ all -> 0x0531 }
        L_0x01d9:
            r3 = 0
            goto L_0x01e2
        L_0x01db:
            r21 = r6
            goto L_0x01e2
        L_0x01de:
            r21 = r6
            r24 = r12
        L_0x01e2:
            if (r3 == 0) goto L_0x023b
            long r11 = r3.N()     // Catch:{ all -> 0x0531 }
            r15 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x01fc
            long r11 = r3.N()     // Catch:{ all -> 0x0531 }
            r4 = r7
            long r6 = r2.f5475x     // Catch:{ all -> 0x0531 }
            int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x01fd
            r0 = 1
            goto L_0x01fe
        L_0x01fc:
            r4 = r7
        L_0x01fd:
            r0 = 0
        L_0x01fe:
            java.lang.String r6 = r3.L()     // Catch:{ all -> 0x0531 }
            long r11 = r3.N()     // Catch:{ all -> 0x0531 }
            int r3 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r3 != 0) goto L_0x0216
            if (r6 == 0) goto L_0x0216
            java.lang.String r3 = r2.f5470q     // Catch:{ all -> 0x0531 }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0531 }
            if (r3 != 0) goto L_0x0216
            r3 = 1
            goto L_0x0217
        L_0x0216:
            r3 = 0
        L_0x0217:
            r0 = r0 | r3
            if (r0 == 0) goto L_0x023c
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0531 }
            r0.<init>()     // Catch:{ all -> 0x0531 }
            java.lang.String r3 = "_pv"
            r0.putString(r3, r6)     // Catch:{ all -> 0x0531 }
            h5.p r3 = new h5.p     // Catch:{ all -> 0x0531 }
            h5.n r6 = new h5.n     // Catch:{ all -> 0x0531 }
            r6.<init>(r0)     // Catch:{ all -> 0x0531 }
            java.lang.String r16 = "_au"
            java.lang.String r18 = "auto"
            r15 = r3
            r17 = r6
            r19 = r13
            r15.<init>(r16, r17, r18, r19)     // Catch:{ all -> 0x0531 }
            r1.Q(r3, r2)     // Catch:{ all -> 0x0531 }
            goto L_0x023c
        L_0x023b:
            r4 = r7
        L_0x023c:
            r28.q(r29)     // Catch:{ all -> 0x0531 }
            if (r10 != 0) goto L_0x024e
            h5.i r0 = r1.f5850q     // Catch:{ all -> 0x0531 }
            E(r0)     // Catch:{ all -> 0x0531 }
            java.lang.String r3 = "_f"
            h5.m r0 = r0.z(r8, r3)     // Catch:{ all -> 0x0531 }
            r3 = 0
            goto L_0x025a
        L_0x024e:
            h5.i r0 = r1.f5850q     // Catch:{ all -> 0x0531 }
            E(r0)     // Catch:{ all -> 0x0531 }
            java.lang.String r3 = "_v"
            h5.m r0 = r0.z(r8, r3)     // Catch:{ all -> 0x0531 }
            r3 = 1
        L_0x025a:
            if (r0 != 0) goto L_0x04fe
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            long r10 = r13 / r6
            r15 = 1
            long r10 = r10 + r15
            long r10 = r10 * r6
            java.lang.String r6 = "_dac"
            java.lang.String r7 = "_r"
            java.lang.String r12 = "_c"
            java.lang.String r15 = "_et"
            r25 = r6
            boolean r6 = r2.D
            if (r3 != 0) goto L_0x0481
            h5.c7 r0 = new h5.c7     // Catch:{ all -> 0x0531 }
            java.lang.String r19 = "_fot"
            java.lang.Long r18 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0531 }
            java.lang.String r20 = "auto"
            r3 = r15
            r15 = r0
            r16 = r13
            r15.<init>(r16, r18, r19, r20)     // Catch:{ all -> 0x0531 }
            r1.l(r0, r2)     // Catch:{ all -> 0x0531 }
            h5.h4 r0 = r28.f()     // Catch:{ all -> 0x0531 }
            r0.g()     // Catch:{ all -> 0x0531 }
            h5.w3 r0 = r9.L     // Catch:{ all -> 0x0531 }
            n4.m.h(r0)     // Catch:{ all -> 0x0531 }
            boolean r9 = r8.isEmpty()     // Catch:{ all -> 0x0531 }
            h5.i4 r10 = r0.f5792a
            if (r9 == 0) goto L_0x02a8
            h5.g3 r0 = r10.w     // Catch:{ all -> 0x0531 }
            h5.i4.n(r0)     // Catch:{ all -> 0x0531 }
            h5.e3 r0 = r0.f5399x     // Catch:{ all -> 0x0531 }
            java.lang.String r5 = "Install Referrer Reporter was called with invalid app package name"
            r26 = r13
            goto L_0x0361
        L_0x02a8:
            h5.h4 r9 = r10.f5459x     // Catch:{ all -> 0x0531 }
            h5.i4.n(r9)     // Catch:{ all -> 0x0531 }
            r9.g()     // Catch:{ all -> 0x0531 }
            boolean r9 = r0.a()     // Catch:{ all -> 0x0531 }
            if (r9 != 0) goto L_0x02c6
            h5.g3 r0 = r10.w     // Catch:{ all -> 0x0531 }
            h5.i4.n(r0)     // Catch:{ all -> 0x0531 }
            h5.e3 r0 = r0.z     // Catch:{ all -> 0x0531 }
            java.lang.String r5 = "Install Referrer Reporter is not available"
            r0.a(r5)     // Catch:{ all -> 0x0531 }
            r26 = r13
            goto L_0x0364
        L_0x02c6:
            h5.v3 r9 = new h5.v3     // Catch:{ all -> 0x0531 }
            r9.<init>(r0, r8)     // Catch:{ all -> 0x0531 }
            h5.h4 r11 = r10.f5459x     // Catch:{ all -> 0x0531 }
            android.content.Context r15 = r10.f5452o
            h5.i4.n(r11)     // Catch:{ all -> 0x0531 }
            r11.g()     // Catch:{ all -> 0x0531 }
            android.content.Intent r11 = new android.content.Intent     // Catch:{ all -> 0x0531 }
            java.lang.String r2 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r11.<init>(r2)     // Catch:{ all -> 0x0531 }
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ all -> 0x0531 }
            r26 = r13
            java.lang.String r13 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r2.<init>(r5, r13)     // Catch:{ all -> 0x0531 }
            r11.setComponent(r2)     // Catch:{ all -> 0x0531 }
            android.content.pm.PackageManager r2 = r15.getPackageManager()     // Catch:{ all -> 0x0531 }
            h5.g3 r10 = r10.w
            if (r2 != 0) goto L_0x02f8
            h5.i4.n(r10)     // Catch:{ all -> 0x0531 }
            h5.e3 r0 = r10.f5399x     // Catch:{ all -> 0x0531 }
            java.lang.String r5 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            goto L_0x0361
        L_0x02f8:
            r13 = 0
            java.util.List r2 = r2.queryIntentServices(r11, r13)     // Catch:{ all -> 0x0531 }
            if (r2 == 0) goto L_0x035a
            boolean r14 = r2.isEmpty()     // Catch:{ all -> 0x0531 }
            if (r14 != 0) goto L_0x035a
            java.lang.Object r2 = r2.get(r13)     // Catch:{ all -> 0x0531 }
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2     // Catch:{ all -> 0x0531 }
            android.content.pm.ServiceInfo r2 = r2.serviceInfo     // Catch:{ all -> 0x0531 }
            if (r2 == 0) goto L_0x0364
            java.lang.String r13 = r2.packageName     // Catch:{ all -> 0x0531 }
            java.lang.String r2 = r2.name     // Catch:{ all -> 0x0531 }
            if (r2 == 0) goto L_0x0352
            boolean r2 = r5.equals(r13)     // Catch:{ all -> 0x0531 }
            if (r2 == 0) goto L_0x0352
            boolean r0 = r0.a()     // Catch:{ all -> 0x0531 }
            if (r0 == 0) goto L_0x0352
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x0531 }
            r0.<init>(r11)     // Catch:{ all -> 0x0531 }
            q4.a r2 = q4.a.b()     // Catch:{ RuntimeException -> 0x0342 }
            r5 = 1
            boolean r0 = r2.a(r15, r0, r9, r5)     // Catch:{ RuntimeException -> 0x0342 }
            h5.i4.n(r10)     // Catch:{ RuntimeException -> 0x0342 }
            h5.e3 r2 = r10.B     // Catch:{ RuntimeException -> 0x0342 }
            java.lang.String r5 = "Install Referrer Service is"
            java.lang.String r9 = "available"
            java.lang.String r11 = "not available"
            r13 = 1
            if (r13 == r0) goto L_0x033e
            r9 = r11
        L_0x033e:
            r2.b(r9, r5)     // Catch:{ RuntimeException -> 0x0342 }
            goto L_0x0364
        L_0x0342:
            r0 = move-exception
            h5.i4.n(r10)     // Catch:{ all -> 0x0531 }
            h5.e3 r2 = r10.f5397t     // Catch:{ all -> 0x0531 }
            java.lang.String r5 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0531 }
            r2.b(r0, r5)     // Catch:{ all -> 0x0531 }
            goto L_0x0364
        L_0x0352:
            h5.i4.n(r10)     // Catch:{ all -> 0x0531 }
            h5.e3 r0 = r10.w     // Catch:{ all -> 0x0531 }
            java.lang.String r5 = "Play Store version 8.3.73 or higher required for Install Referrer"
            goto L_0x0361
        L_0x035a:
            h5.i4.n(r10)     // Catch:{ all -> 0x0531 }
            h5.e3 r0 = r10.z     // Catch:{ all -> 0x0531 }
            java.lang.String r5 = "Play Service for fetching Install Referrer is unavailable on device"
        L_0x0361:
            r0.a(r5)     // Catch:{ all -> 0x0531 }
        L_0x0364:
            h5.h4 r0 = r28.f()     // Catch:{ all -> 0x0531 }
            r0.g()     // Catch:{ all -> 0x0531 }
            r28.K()     // Catch:{ all -> 0x0531 }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ all -> 0x0531 }
            r2.<init>()     // Catch:{ all -> 0x0531 }
            r9 = 1
            r2.putLong(r12, r9)     // Catch:{ all -> 0x0531 }
            r2.putLong(r7, r9)     // Catch:{ all -> 0x0531 }
            r9 = 0
            r2.putLong(r4, r9)     // Catch:{ all -> 0x0531 }
            r5 = r21
            r2.putLong(r5, r9)     // Catch:{ all -> 0x0531 }
            r7 = r23
            r2.putLong(r7, r9)     // Catch:{ all -> 0x0531 }
            r11 = r24
            r2.putLong(r11, r9)     // Catch:{ all -> 0x0531 }
            r9 = 1
            r2.putLong(r3, r9)     // Catch:{ all -> 0x0531 }
            if (r6 == 0) goto L_0x039b
            r13 = r25
            r2.putLong(r13, r9)     // Catch:{ all -> 0x0531 }
        L_0x039b:
            h5.i r0 = r1.f5850q     // Catch:{ all -> 0x0531 }
            E(r0)     // Catch:{ all -> 0x0531 }
            n4.m.e(r8)     // Catch:{ all -> 0x0531 }
            r0.g()     // Catch:{ all -> 0x0531 }
            r0.h()     // Catch:{ all -> 0x0531 }
            long r9 = r0.n(r8)     // Catch:{ all -> 0x0531 }
            android.content.pm.PackageManager r0 = r22.getPackageManager()     // Catch:{ all -> 0x0531 }
            if (r0 != 0) goto L_0x03c6
            h5.g3 r0 = r28.e()     // Catch:{ all -> 0x0531 }
            h5.e3 r0 = r0.f5397t     // Catch:{ all -> 0x0531 }
            java.lang.String r4 = "PackageManager is null, first open report might be inaccurate. appId"
            h5.f3 r6 = h5.g3.p(r8)     // Catch:{ all -> 0x0531 }
            r0.b(r6, r4)     // Catch:{ all -> 0x0531 }
            r14 = r29
            goto L_0x0461
        L_0x03c6:
            t4.b r0 = t4.c.a(r22)     // Catch:{ NameNotFoundException -> 0x03d0 }
            r6 = 0
            android.content.pm.PackageInfo r0 = r0.b(r8, r6)     // Catch:{ NameNotFoundException -> 0x03d0 }
            goto L_0x03e1
        L_0x03d0:
            r0 = move-exception
            h5.g3 r6 = r28.e()     // Catch:{ all -> 0x0531 }
            h5.e3 r6 = r6.f5397t     // Catch:{ all -> 0x0531 }
            java.lang.String r12 = "Package info is null, first open report might be inaccurate. appId"
            h5.f3 r13 = h5.g3.p(r8)     // Catch:{ all -> 0x0531 }
            r6.c(r13, r0, r12)     // Catch:{ all -> 0x0531 }
            r0 = 0
        L_0x03e1:
            if (r0 == 0) goto L_0x042b
            long r12 = r0.firstInstallTime     // Catch:{ all -> 0x0531 }
            r14 = 0
            int r6 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x042b
            long r14 = r0.lastUpdateTime     // Catch:{ all -> 0x0531 }
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x040b
            h5.e r0 = r28.F()     // Catch:{ all -> 0x0531 }
            h5.s2<java.lang.Boolean> r6 = h5.u2.f5725j0     // Catch:{ all -> 0x0531 }
            r12 = 0
            boolean r0 = r0.m(r12, r6)     // Catch:{ all -> 0x0531 }
            if (r0 == 0) goto L_0x0404
            r13 = 0
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0409
        L_0x0404:
            r13 = 1
            r2.putLong(r4, r13)     // Catch:{ all -> 0x0531 }
        L_0x0409:
            r0 = 0
            goto L_0x040d
        L_0x040b:
            r12 = 0
            r0 = 1
        L_0x040d:
            h5.c7 r4 = new h5.c7     // Catch:{ all -> 0x0531 }
            java.lang.String r19 = "_fi"
            r6 = 1
            if (r6 == r0) goto L_0x0417
            r13 = 0
            goto L_0x0419
        L_0x0417:
            r13 = 1
        L_0x0419:
            java.lang.Long r18 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0531 }
            java.lang.String r20 = "auto"
            r15 = r4
            r16 = r26
            r15.<init>(r16, r18, r19, r20)     // Catch:{ all -> 0x0531 }
            r14 = r29
            r1.l(r4, r14)     // Catch:{ all -> 0x0531 }
            goto L_0x042e
        L_0x042b:
            r14 = r29
            r12 = 0
        L_0x042e:
            t4.b r0 = t4.c.a(r22)     // Catch:{ NameNotFoundException -> 0x0438 }
            r4 = 0
            android.content.pm.ApplicationInfo r0 = r0.a(r8, r4)     // Catch:{ NameNotFoundException -> 0x0438 }
            goto L_0x0449
        L_0x0438:
            r0 = move-exception
            h5.g3 r4 = r28.e()     // Catch:{ all -> 0x0531 }
            h5.e3 r4 = r4.f5397t     // Catch:{ all -> 0x0531 }
            java.lang.String r6 = "Application info is null, first open report might be inaccurate. appId"
            h5.f3 r13 = h5.g3.p(r8)     // Catch:{ all -> 0x0531 }
            r4.c(r13, r0, r6)     // Catch:{ all -> 0x0531 }
            r0 = r12
        L_0x0449:
            if (r0 == 0) goto L_0x0461
            int r4 = r0.flags     // Catch:{ all -> 0x0531 }
            r6 = 1
            r4 = r4 & r6
            if (r4 == 0) goto L_0x0456
            r12 = 1
            r2.putLong(r7, r12)     // Catch:{ all -> 0x0531 }
        L_0x0456:
            int r0 = r0.flags     // Catch:{ all -> 0x0531 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0461
            r6 = 1
            r2.putLong(r11, r6)     // Catch:{ all -> 0x0531 }
        L_0x0461:
            r6 = 0
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x046a
            r2.putLong(r5, r9)     // Catch:{ all -> 0x0531 }
        L_0x046a:
            h5.p r0 = new h5.p     // Catch:{ all -> 0x0531 }
            h5.n r4 = new h5.n     // Catch:{ all -> 0x0531 }
            r4.<init>(r2)     // Catch:{ all -> 0x0531 }
            java.lang.String r16 = "_f"
            java.lang.String r18 = "auto"
            r15 = r0
            r17 = r4
            r19 = r26
            r15.<init>(r16, r17, r18, r19)     // Catch:{ all -> 0x0531 }
            r1.P(r0, r14)     // Catch:{ all -> 0x0531 }
            goto L_0x04cf
        L_0x0481:
            r26 = r13
            r3 = r15
            r13 = r25
            r14 = r2
            h5.c7 r0 = new h5.c7     // Catch:{ all -> 0x0531 }
            java.lang.String r19 = "_fvt"
            java.lang.Long r18 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0531 }
            java.lang.String r20 = "auto"
            r15 = r0
            r16 = r26
            r15.<init>(r16, r18, r19, r20)     // Catch:{ all -> 0x0531 }
            r1.l(r0, r14)     // Catch:{ all -> 0x0531 }
            h5.h4 r0 = r28.f()     // Catch:{ all -> 0x0531 }
            r0.g()     // Catch:{ all -> 0x0531 }
            r28.K()     // Catch:{ all -> 0x0531 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0531 }
            r0.<init>()     // Catch:{ all -> 0x0531 }
            r4 = 1
            r0.putLong(r12, r4)     // Catch:{ all -> 0x0531 }
            r0.putLong(r7, r4)     // Catch:{ all -> 0x0531 }
            r0.putLong(r3, r4)     // Catch:{ all -> 0x0531 }
            if (r6 == 0) goto L_0x04b9
            r0.putLong(r13, r4)     // Catch:{ all -> 0x0531 }
        L_0x04b9:
            h5.p r2 = new h5.p     // Catch:{ all -> 0x0531 }
            h5.n r4 = new h5.n     // Catch:{ all -> 0x0531 }
            r4.<init>(r0)     // Catch:{ all -> 0x0531 }
            java.lang.String r16 = "_v"
            java.lang.String r18 = "auto"
            r15 = r2
            r17 = r4
            r19 = r26
            r15.<init>(r16, r17, r18, r19)     // Catch:{ all -> 0x0531 }
            r1.P(r2, r14)     // Catch:{ all -> 0x0531 }
        L_0x04cf:
            h5.e r0 = r28.F()     // Catch:{ all -> 0x0531 }
            h5.s2<java.lang.Boolean> r2 = h5.u2.T     // Catch:{ all -> 0x0531 }
            boolean r0 = r0.m(r8, r2)     // Catch:{ all -> 0x0531 }
            if (r0 != 0) goto L_0x0520
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0531 }
            r0.<init>()     // Catch:{ all -> 0x0531 }
            r4 = 1
            r0.putLong(r3, r4)     // Catch:{ all -> 0x0531 }
            java.lang.String r2 = "_fr"
            r0.putLong(r2, r4)     // Catch:{ all -> 0x0531 }
            h5.p r2 = new h5.p     // Catch:{ all -> 0x0531 }
            java.lang.String r16 = "_e"
            h5.n r3 = new h5.n     // Catch:{ all -> 0x0531 }
            r3.<init>(r0)     // Catch:{ all -> 0x0531 }
            java.lang.String r18 = "auto"
            r15 = r2
            r17 = r3
            r19 = r26
            r15.<init>(r16, r17, r18, r19)     // Catch:{ all -> 0x0531 }
            goto L_0x051d
        L_0x04fe:
            r26 = r13
            r14 = r2
            boolean r0 = r14.w     // Catch:{ all -> 0x0531 }
            if (r0 == 0) goto L_0x0520
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0531 }
            r0.<init>()     // Catch:{ all -> 0x0531 }
            h5.p r2 = new h5.p     // Catch:{ all -> 0x0531 }
            h5.n r3 = new h5.n     // Catch:{ all -> 0x0531 }
            r3.<init>(r0)     // Catch:{ all -> 0x0531 }
            java.lang.String r16 = "_cd"
            java.lang.String r18 = "auto"
            r15 = r2
            r17 = r3
            r19 = r26
            r15.<init>(r16, r17, r18, r19)     // Catch:{ all -> 0x0531 }
        L_0x051d:
            r1.P(r2, r14)     // Catch:{ all -> 0x0531 }
        L_0x0520:
            h5.i r0 = r1.f5850q     // Catch:{ all -> 0x0531 }
            E(r0)     // Catch:{ all -> 0x0531 }
            r0.w()     // Catch:{ all -> 0x0531 }
            h5.i r0 = r1.f5850q
            E(r0)
            r0.x()
            return
        L_0x0531:
            r0 = move-exception
            h5.i r2 = r1.f5850q
            E(r2)
            r2.x()
            throw r0
        L_0x053b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.z6.n(h5.i7):void");
    }

    public final void o(b bVar, i7 i7Var) {
        e3 e3Var;
        String str;
        Object p10;
        String n10;
        c7 c7Var;
        e3 e3Var2;
        String str2;
        Object p11;
        b3 b3Var;
        p pVar;
        m.h(bVar);
        m.e(bVar.f5275o);
        m.h(bVar.f5276p);
        m.h(bVar.f5277q);
        m.e(bVar.f5277q.f5318p);
        f().g();
        K();
        if (D(i7Var)) {
            if (!i7Var.f5474v) {
                q(i7Var);
                return;
            }
            b bVar2 = new b(bVar);
            boolean z10 = false;
            bVar2.f5279s = false;
            i iVar = this.f5850q;
            E(iVar);
            iVar.v();
            try {
                i iVar2 = this.f5850q;
                E(iVar2);
                String str3 = bVar2.f5275o;
                m.h(str3);
                b H2 = iVar2.H(str3, bVar2.f5277q.f5318p);
                i4 i4Var = this.f5856y;
                if (H2 != null) {
                    if (!H2.f5276p.equals(bVar2.f5276p)) {
                        e3 e3Var3 = e().w;
                        b3 b3Var2 = i4Var.A;
                        i4.l(b3Var2);
                        e3Var3.d("Updating a conditional user property with different origin. name, origin, origin (from DB)", b3Var2.n(bVar2.f5277q.f5318p), bVar2.f5276p, H2.f5276p);
                    }
                }
                if (H2 != null && H2.f5279s) {
                    bVar2.f5276p = H2.f5276p;
                    bVar2.f5278r = H2.f5278r;
                    bVar2.f5281v = H2.f5281v;
                    bVar2.f5280t = H2.f5280t;
                    bVar2.w = H2.w;
                    bVar2.f5279s = true;
                    c7 c7Var2 = bVar2.f5277q;
                    bVar2.f5277q = new c7(H2.f5277q.f5319q, c7Var2.g0(), c7Var2.f5318p, H2.f5277q.f5322t);
                } else if (TextUtils.isEmpty(bVar2.f5280t)) {
                    c7 c7Var3 = bVar2.f5277q;
                    bVar2.f5277q = new c7(bVar2.f5278r, c7Var3.g0(), c7Var3.f5318p, bVar2.f5277q.f5322t);
                    bVar2.f5279s = true;
                    z10 = true;
                }
                if (bVar2.f5279s) {
                    c7 c7Var4 = bVar2.f5277q;
                    String str4 = bVar2.f5275o;
                    m.h(str4);
                    String str5 = bVar2.f5276p;
                    String str6 = c7Var4.f5318p;
                    long j8 = c7Var4.f5319q;
                    Object g02 = c7Var4.g0();
                    m.h(g02);
                    e7 e7Var = new e7(str4, str5, str6, j8, g02);
                    Object obj = e7Var.f5365e;
                    String str7 = e7Var.f5364c;
                    i iVar3 = this.f5850q;
                    E(iVar3);
                    if (iVar3.C(e7Var)) {
                        e3Var2 = e().A;
                        str2 = "User property updated immediately";
                        p11 = bVar2.f5275o;
                        b3Var = i4Var.A;
                        i4.l(b3Var);
                    } else {
                        e3Var2 = e().f5397t;
                        str2 = "(2)Too many active user properties, ignoring";
                        p11 = g3.p(bVar2.f5275o);
                        b3Var = i4Var.A;
                        i4.l(b3Var);
                    }
                    e3Var2.d(str2, p11, b3Var.n(str7), obj);
                    if (z10 && (pVar = bVar2.w) != null) {
                        R(new p(pVar, bVar2.f5278r), i7Var);
                    }
                }
                i iVar4 = this.f5850q;
                E(iVar4);
                if (iVar4.G(bVar2)) {
                    e3Var = e().A;
                    str = "Conditional property added";
                    p10 = bVar2.f5275o;
                    b3 b3Var3 = i4Var.A;
                    i4.l(b3Var3);
                    n10 = b3Var3.n(bVar2.f5277q.f5318p);
                    c7Var = bVar2.f5277q;
                } else {
                    e3Var = e().f5397t;
                    str = "Too many conditional properties, ignoring";
                    p10 = g3.p(bVar2.f5275o);
                    b3 b3Var4 = i4Var.A;
                    i4.l(b3Var4);
                    n10 = b3Var4.n(bVar2.f5277q.f5318p);
                    c7Var = bVar2.f5277q;
                }
                e3Var.d(str, p10, n10, c7Var.g0());
                i iVar5 = this.f5850q;
                E(iVar5);
                iVar5.w();
            } finally {
                i iVar6 = this.f5850q;
                E(iVar6);
                iVar6.x();
            }
        }
    }

    public final void p(b bVar, i7 i7Var) {
        Bundle bundle;
        m.h(bVar);
        m.e(bVar.f5275o);
        m.h(bVar.f5277q);
        m.e(bVar.f5277q.f5318p);
        f().g();
        K();
        if (D(i7Var)) {
            if (i7Var.f5474v) {
                i iVar = this.f5850q;
                E(iVar);
                iVar.v();
                try {
                    q(i7Var);
                    String str = bVar.f5275o;
                    m.h(str);
                    i iVar2 = this.f5850q;
                    E(iVar2);
                    b H2 = iVar2.H(str, bVar.f5277q.f5318p);
                    i4 i4Var = this.f5856y;
                    if (H2 != null) {
                        e3 e3Var = e().A;
                        String str2 = bVar.f5275o;
                        b3 b3Var = i4Var.A;
                        i4.l(b3Var);
                        e3Var.c(str2, b3Var.n(bVar.f5277q.f5318p), "Removing conditional user property");
                        i iVar3 = this.f5850q;
                        E(iVar3);
                        iVar3.I(str, bVar.f5277q.f5318p);
                        if (H2.f5279s) {
                            i iVar4 = this.f5850q;
                            E(iVar4);
                            iVar4.B(str, bVar.f5277q.f5318p);
                        }
                        p pVar = bVar.f5283y;
                        if (pVar != null) {
                            n nVar = pVar.f5622p;
                            if (nVar != null) {
                                bundle = nVar.h0();
                            } else {
                                bundle = null;
                            }
                            p D2 = J().D(str, pVar.f5621o, bundle, H2.f5276p, pVar.f5624r, true);
                            m.h(D2);
                            R(D2, i7Var);
                        }
                    } else {
                        e3 e3Var2 = e().w;
                        f3 p10 = g3.p(bVar.f5275o);
                        b3 b3Var2 = i4Var.A;
                        i4.l(b3Var2);
                        e3Var2.c(p10, b3Var2.n(bVar.f5277q.f5318p), "Conditional user property doesn't exist");
                    }
                    i iVar5 = this.f5850q;
                    E(iVar5);
                    iVar5.w();
                } finally {
                    i iVar6 = this.f5850q;
                    E(iVar6);
                    iVar6.x();
                }
            } else {
                q(i7Var);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02fe, code lost:
        if (r7 != false) goto L_0x0300;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d2, code lost:
        if (r4.e() != false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01c6, code lost:
        if (r4.e() != false) goto L_0x01d9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0262  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final h5.m4 q(h5.i7 r37) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            h5.h4 r2 = r36.f()
            r2.g()
            r36.K()
            n4.m.h(r37)
            java.lang.String r2 = r1.f5468o
            n4.m.e(r2)
            h5.i r3 = r0.f5850q
            E(r3)
            h5.m4 r3 = r3.L(r2)
            h5.f r4 = r0.M(r2)
            java.lang.String r5 = r1.J
            h5.f r6 = h5.f.b(r5)
            h5.f r4 = r4.f(r6)
            boolean r6 = r4.d()
            if (r6 == 0) goto L_0x003a
            h5.g6 r6 = r0.w
            java.lang.String r6 = r6.l(r2)
            goto L_0x003c
        L_0x003a:
            java.lang.String r6 = ""
        L_0x003c:
            com.google.android.gms.internal.measurement.ea r7 = com.google.android.gms.internal.measurement.ea.f2688p
            com.google.android.gms.internal.measurement.r4<com.google.android.gms.internal.measurement.fa> r7 = r7.f2689o
            java.lang.Object r7 = r7.zza()
            com.google.android.gms.internal.measurement.fa r7 = (com.google.android.gms.internal.measurement.fa) r7
            r7.zza()
            h5.e r7 = r36.F()
            h5.s2<java.lang.Boolean> r8 = h5.u2.f5727k0
            r9 = 0
            boolean r7 = r7.m(r9, r8)
            h5.i4 r8 = r0.f5856y
            long r12 = r1.z
            long r14 = r1.G
            java.lang.Boolean r9 = r1.F
            boolean r10 = r1.C
            boolean r11 = r1.f5474v
            r16 = r14
            long r14 = r1.f5473t
            r18 = r5
            java.lang.String r5 = r1.f5471r
            r19 = r9
            r20 = r10
            long r9 = r1.f5475x
            r21 = r12
            long r12 = r1.f5472s
            r23 = r11
            java.lang.String r11 = r1.I
            r24 = r14
            java.lang.String r14 = r1.E
            java.lang.String r15 = r1.f5469p
            r26 = r5
            java.lang.String r5 = r1.u
            r27 = r5
            java.lang.String r5 = r1.f5470q
            java.lang.String r1 = r1.f5476y
            if (r7 == 0) goto L_0x0169
            if (r3 != 0) goto L_0x00a6
            h5.m4 r3 = new h5.m4
            r3.<init>(r8, r2)
            boolean r2 = r4.e()
            if (r2 == 0) goto L_0x009c
            java.lang.String r2 = r0.b(r4)
            r3.z(r2)
        L_0x009c:
            boolean r2 = r4.d()
            if (r2 == 0) goto L_0x00db
            r3.G(r6)
            goto L_0x00db
        L_0x00a6:
            boolean r2 = r4.d()
            if (r2 == 0) goto L_0x00c4
            if (r6 == 0) goto L_0x00c4
            h5.i4 r2 = r3.f5555a
            h5.h4 r2 = r2.f5459x
            h5.i4.n(r2)
            r2.g()
            java.lang.String r2 = r3.f5558e
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x00c4
            r3.G(r6)
            goto L_0x00d4
        L_0x00c4:
            java.lang.String r2 = r3.y()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x00db
            boolean r2 = r4.e()
            if (r2 == 0) goto L_0x00db
        L_0x00d4:
            java.lang.String r2 = r0.b(r4)
            r3.z(r2)
        L_0x00db:
            r3.B(r15)
            r3.D(r14)
            com.google.android.gms.internal.measurement.qa.a()
            h5.e r2 = r36.F()
            java.lang.String r4 = r3.x()
            h5.s2<java.lang.Boolean> r6 = h5.u2.f5717f0
            boolean r2 = r2.m(r4, r6)
            if (r2 == 0) goto L_0x00f7
            r3.F(r11)
        L_0x00f7:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0100
            r3.I(r1)
        L_0x0100:
            r1 = 0
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0109
            r3.a(r12)
        L_0x0109:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L_0x0112
            r3.M(r5)
        L_0x0112:
            r3.O(r9)
            if (r26 == 0) goto L_0x011c
            r4 = r26
            r3.Q(r4)
        L_0x011c:
            r1 = r24
            r3.c(r1)
            r7 = r23
            r3.g(r7)
            boolean r1 = android.text.TextUtils.isEmpty(r27)
            if (r1 != 0) goto L_0x0131
            r1 = r27
            r3.q(r1)
        L_0x0131:
            h5.e r1 = r36.F()
            h5.s2<java.lang.Boolean> r2 = h5.u2.f5740r0
            r4 = 0
            boolean r1 = r1.m(r4, r2)
            if (r1 != 0) goto L_0x0143
            r1 = r21
            r3.s(r1)
        L_0x0143:
            r1 = r20
            r3.u(r1)
            r1 = r19
            r3.v(r1)
            r1 = r16
            r3.e(r1)
            h5.i4 r1 = r3.f5555a
            h5.h4 r1 = r1.f5459x
            h5.i4.n(r1)
            r1.g()
            boolean r1 = r3.D
            if (r1 == 0) goto L_0x0168
            h5.i r1 = r0.f5850q
            E(r1)
            r1.M(r3)
        L_0x0168:
            return r3
        L_0x0169:
            r30 = r16
            r32 = r19
            r33 = r20
            r28 = r21
            r7 = r23
            r34 = r24
            r4 = r26
            n4.m.h(r2)
            h5.f r7 = r0.M(r2)
            h5.f r4 = h5.f.b(r18)
            h5.f r4 = r7.f(r4)
            r7 = 1
            if (r3 != 0) goto L_0x01a5
            h5.m4 r3 = new h5.m4
            r3.<init>(r8, r2)
            boolean r2 = r4.e()
            if (r2 == 0) goto L_0x019b
            java.lang.String r2 = r0.b(r4)
            r3.z(r2)
        L_0x019b:
            boolean r2 = r4.d()
            if (r2 == 0) goto L_0x01e0
            r3.G(r6)
            goto L_0x01e0
        L_0x01a5:
            boolean r2 = r4.d()
            if (r2 == 0) goto L_0x01c9
            if (r6 == 0) goto L_0x01c9
            h5.i4 r2 = r3.f5555a
            h5.h4 r2 = r2.f5459x
            h5.i4.n(r2)
            r2.g()
            java.lang.String r2 = r3.f5558e
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x01c9
            r3.G(r6)
            boolean r2 = r4.e()
            if (r2 == 0) goto L_0x01e0
            goto L_0x01d9
        L_0x01c9:
            java.lang.String r2 = r3.y()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x01e2
            boolean r2 = r4.e()
            if (r2 == 0) goto L_0x01e2
        L_0x01d9:
            java.lang.String r2 = r0.b(r4)
            r3.z(r2)
        L_0x01e0:
            r2 = r7
            goto L_0x01e3
        L_0x01e2:
            r2 = 0
        L_0x01e3:
            java.lang.String r4 = r3.A()
            boolean r4 = android.text.TextUtils.equals(r15, r4)
            if (r4 != 0) goto L_0x01f1
            r3.B(r15)
            r2 = r7
        L_0x01f1:
            java.lang.String r4 = r3.C()
            boolean r4 = android.text.TextUtils.equals(r14, r4)
            if (r4 != 0) goto L_0x01ff
            r3.D(r14)
            r2 = r7
        L_0x01ff:
            com.google.android.gms.internal.measurement.qa.a()
            h5.e r4 = r36.F()
            java.lang.String r6 = r3.x()
            h5.s2<java.lang.Boolean> r8 = h5.u2.f5717f0
            boolean r4 = r4.m(r6, r8)
            if (r4 == 0) goto L_0x0220
            java.lang.String r4 = r3.E()
            boolean r4 = android.text.TextUtils.equals(r11, r4)
            if (r4 != 0) goto L_0x0220
            r3.F(r11)
            r2 = r7
        L_0x0220:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L_0x0234
            java.lang.String r4 = r3.H()
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0234
            r3.I(r1)
            r2 = r7
        L_0x0234:
            r14 = 0
            int r1 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x0246
            long r14 = r3.R()
            int r1 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x0246
            r3.a(r12)
            r2 = r7
        L_0x0246:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L_0x025a
            java.lang.String r1 = r3.L()
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x025a
            r3.M(r5)
            r2 = r7
        L_0x025a:
            long r4 = r3.N()
            int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0266
            r3.O(r9)
            r2 = r7
        L_0x0266:
            if (r26 == 0) goto L_0x0278
            java.lang.String r1 = r3.P()
            r4 = r26
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0278
            r3.Q(r4)
            r2 = r7
        L_0x0278:
            long r4 = r3.b()
            r8 = r34
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0286
            r3.c(r8)
            r2 = r7
        L_0x0286:
            boolean r1 = r3.f()
            r4 = r23
            if (r4 == r1) goto L_0x0292
            r3.g(r4)
            r2 = r7
        L_0x0292:
            boolean r1 = android.text.TextUtils.isEmpty(r27)
            h5.i4 r4 = r3.f5555a
            if (r1 != 0) goto L_0x02b0
            h5.h4 r1 = r4.f5459x
            h5.i4.n(r1)
            r1.g()
            java.lang.String r1 = r3.C
            r5 = r27
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x02b0
            r3.q(r5)
            r2 = r7
        L_0x02b0:
            h5.e r1 = r36.F()
            h5.s2<java.lang.Boolean> r5 = h5.u2.f5740r0
            r6 = 0
            boolean r1 = r1.m(r6, r5)
            if (r1 != 0) goto L_0x02cb
            long r5 = r3.r()
            r8 = r28
            int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x02cb
            r3.s(r8)
            r2 = r7
        L_0x02cb:
            boolean r1 = r3.t()
            r5 = r33
            if (r5 == r1) goto L_0x02d7
            r3.u(r5)
            r2 = r7
        L_0x02d7:
            h5.h4 r1 = r4.f5459x
            h5.i4.n(r1)
            r1.g()
            java.lang.Boolean r1 = r3.f5571s
            r4 = r32
            if (r4 == r1) goto L_0x02e9
            r3.v(r4)
            goto L_0x02ea
        L_0x02e9:
            r7 = r2
        L_0x02ea:
            r4 = r30
            r1 = 0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x02fe
            long r1 = r3.d()
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x02fe
            r3.e(r4)
            goto L_0x0300
        L_0x02fe:
            if (r7 == 0) goto L_0x0308
        L_0x0300:
            h5.i r1 = r0.f5850q
            E(r1)
            r1.M(r3)
        L_0x0308:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.z6.q(h5.i7):h5.m4");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: h5.z6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v60, resolved type: n.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v61, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v24, resolved type: n.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v28, resolved type: n.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v185, resolved type: h5.z6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v186, resolved type: h5.z6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v151, resolved type: n.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v152, resolved type: n.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v107, resolved type: n.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v111, resolved type: n.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v112, resolved type: n.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v113, resolved type: n.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v115, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v187, resolved type: h5.z6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v188, resolved type: h5.z6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v190, resolved type: java.security.SecureRandom} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v191, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v192, resolved type: h5.z6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v189, resolved type: n.b} */
    /* JADX WARNING: type inference failed for: r24v0 */
    /* JADX WARNING: type inference failed for: r24v1 */
    /* JADX WARNING: type inference failed for: r11v63 */
    /* JADX WARNING: type inference failed for: r24v7 */
    /* JADX WARNING: type inference failed for: r24v33 */
    /* JADX WARNING: type inference failed for: r24v35 */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0ba1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0ba2, code lost:
        r1 = r0;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0ba5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0ba6, code lost:
        r40 = "data";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0bc1, code lost:
        if (r1 == null) goto L_0x0bc6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0bcd, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:620:0x0d55, code lost:
        if (r12 != null) goto L_0x0d57;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:808:0x11c4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:809:0x11c5, code lost:
        r40 = r12;
        r49 = r13;
        r11 = r47;
        r12 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:810:0x11ce, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:811:0x11cf, code lost:
        r1 = r0;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:819:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:825:0x11ff, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:900:0x13e8, code lost:
        if (r6 == null) goto L_0x13ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:947:0x1545, code lost:
        if (r9 != false) goto L_0x1550;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1039:0x175e A[SYNTHETIC, Splitter:B:1039:0x175e] */
    /* JADX WARNING: Removed duplicated region for block: B:1052:0x17a5 A[SYNTHETIC, Splitter:B:1052:0x17a5] */
    /* JADX WARNING: Removed duplicated region for block: B:1056:0x17cd A[SYNTHETIC, Splitter:B:1056:0x17cd] */
    /* JADX WARNING: Removed duplicated region for block: B:1131:0x19a2 A[Catch:{ all -> 0x198a, all -> 0x1bdd }] */
    /* JADX WARNING: Removed duplicated region for block: B:1132:0x19bb  */
    /* JADX WARNING: Removed duplicated region for block: B:1168:0x1a95 A[Catch:{ all -> 0x198a, all -> 0x1bdd }] */
    /* JADX WARNING: Removed duplicated region for block: B:1189:0x1b28 A[Catch:{ all -> 0x198a, all -> 0x1bdd }] */
    /* JADX WARNING: Removed duplicated region for block: B:1194:0x1b59 A[Catch:{ all -> 0x198a, all -> 0x1bdd }] */
    /* JADX WARNING: Removed duplicated region for block: B:1211:0x1bbe A[SYNTHETIC, Splitter:B:1211:0x1bbe] */
    /* JADX WARNING: Removed duplicated region for block: B:1264:0x0a53 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:1313:0x1613 A[EDGE_INSN: B:1313:0x1613->B:974:0x1613 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x040b A[Catch:{ all -> 0x0136, all -> 0x06eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x04cb A[Catch:{ all -> 0x0136, all -> 0x06eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0529 A[Catch:{ all -> 0x0136, all -> 0x06eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x066a A[SYNTHETIC, Splitter:B:245:0x066a] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x067f A[Catch:{ all -> 0x0136, all -> 0x06eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x06c1 A[Catch:{ all -> 0x06e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x08b1 A[SYNTHETIC, Splitter:B:367:0x08b1] */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x0936 A[SYNTHETIC, Splitter:B:398:0x0936] */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x0951 A[SYNTHETIC, Splitter:B:407:0x0951] */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x0973 A[SYNTHETIC, Splitter:B:418:0x0973] */
    /* JADX WARNING: Removed duplicated region for block: B:456:0x0a41 A[Catch:{ all -> 0x1bdf }] */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x0a78 A[SYNTHETIC, Splitter:B:462:0x0a78] */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x0ad2 A[Catch:{ all -> 0x0bc8, all -> 0x1bb3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:483:0x0aea A[ADDED_TO_REGION, Catch:{ all -> 0x0bc8, all -> 0x1bb3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:526:0x0ba1 A[ExcHandler: all (r0v59 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:485:0x0b02] */
    /* JADX WARNING: Removed duplicated region for block: B:540:0x0bcd A[Catch:{ all -> 0x0bc8, all -> 0x1bb3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:550:0x0c0f A[Catch:{ SQLiteException -> 0x0c7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:554:0x0c1c A[SYNTHETIC, Splitter:B:554:0x0c1c] */
    /* JADX WARNING: Removed duplicated region for block: B:588:0x0ca9 A[SYNTHETIC, Splitter:B:588:0x0ca9] */
    /* JADX WARNING: Removed duplicated region for block: B:593:0x0cba A[Catch:{ all -> 0x0bc8, all -> 0x1bb3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:660:0x0e4b A[Catch:{ all -> 0x0e46, all -> 0x1564 }] */
    /* JADX WARNING: Removed duplicated region for block: B:667:0x0e5a A[Catch:{ all -> 0x0bc8, all -> 0x1bb3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:741:0x1020 A[Catch:{ all -> 0x0bc8, all -> 0x1bb3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:810:0x11ce A[ExcHandler: all (r0v14 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:755:0x110c] */
    /* JADX WARNING: Removed duplicated region for block: B:818:0x11f2 A[SYNTHETIC, Splitter:B:818:0x11f2] */
    /* JADX WARNING: Removed duplicated region for block: B:825:0x11ff A[Catch:{ all -> 0x0e46, all -> 0x1564 }] */
    /* JADX WARNING: Removed duplicated region for block: B:831:0x1215 A[Catch:{ all -> 0x0e46, all -> 0x1564 }] */
    /* JADX WARNING: Removed duplicated region for block: B:854:0x12f6 A[Catch:{ all -> 0x0bc8, all -> 0x1bb3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:908:0x13f7 A[Catch:{ all -> 0x0e46, all -> 0x1564 }] */
    /* JADX WARNING: Removed duplicated region for block: B:958:0x1588 A[SYNTHETIC, Splitter:B:958:0x1588] */
    /* JADX WARNING: Removed duplicated region for block: B:978:0x1619 A[SYNTHETIC, Splitter:B:978:0x1619] */
    /* JADX WARNING: Removed duplicated region for block: B:986:0x1641 A[Catch:{ all -> 0x0bc8, all -> 0x1bb3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean u(long r86) {
        /*
            r85 = this;
            r1 = r85
            java.lang.String r2 = "_si"
            java.lang.String r3 = "_sc"
            java.lang.String r4 = "_sn"
            java.lang.String r5 = "_npa"
            java.lang.String r6 = "1"
            java.lang.String r7 = "_ai"
            h5.i r8 = r1.f5850q
            E(r8)
            r8.v()
            h5.y6 r8 = new h5.y6     // Catch:{ all -> 0x1bdf }
            r8.<init>(r1)     // Catch:{ all -> 0x1bdf }
            h5.i r9 = r1.f5850q     // Catch:{ all -> 0x1bdf }
            E(r9)     // Catch:{ all -> 0x1bdf }
            long r12 = r1.M     // Catch:{ all -> 0x1bdf }
            r10 = r86
            r14 = r8
            r9.r(r10, r12, r14)     // Catch:{ all -> 0x1bdf }
            java.util.ArrayList r9 = r8.f5828c     // Catch:{ all -> 0x1bdf }
            r10 = 0
            if (r9 == 0) goto L_0x1bca
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x1bdf }
            if (r9 == 0) goto L_0x0035
            goto L_0x1bca
        L_0x0035:
            com.google.android.gms.internal.measurement.f3 r9 = r8.f5826a     // Catch:{ all -> 0x1bdf }
            com.google.android.gms.internal.measurement.b6 r9 = r9.n()     // Catch:{ all -> 0x1bdf }
            com.google.android.gms.internal.measurement.e3 r9 = (com.google.android.gms.internal.measurement.e3) r9     // Catch:{ all -> 0x1bdf }
            boolean r11 = r9.f2636q     // Catch:{ all -> 0x1bdf }
            if (r11 == 0) goto L_0x004c
            r9.m()     // Catch:{ all -> 0x004a }
            r9.f2636q = r10     // Catch:{ all -> 0x004a }
            goto L_0x004c
        L_0x0047:
            r2 = r0
            goto L_0x095c
        L_0x004a:
            r0 = move-exception
            goto L_0x0047
        L_0x004c:
            MessageType r11 = r9.f2635p     // Catch:{ all -> 0x1bc5 }
            com.google.android.gms.internal.measurement.f3 r11 = (com.google.android.gms.internal.measurement.f3) r11     // Catch:{ all -> 0x1bc5 }
            com.google.android.gms.internal.measurement.f3.H0(r11)     // Catch:{ all -> 0x1bc5 }
            h5.e r11 = r85.F()     // Catch:{ all -> 0x1bdf }
            com.google.android.gms.internal.measurement.f3 r12 = r8.f5826a     // Catch:{ all -> 0x1bdf }
            java.lang.String r12 = r12.r()     // Catch:{ all -> 0x1bdf }
            h5.s2<java.lang.Boolean> r13 = h5.u2.T     // Catch:{ all -> 0x1bdf }
            boolean r11 = r11.m(r12, r13)     // Catch:{ all -> 0x1bdf }
            r13 = r10
            r16 = r13
            r21 = r16
            r10 = -1
            r12 = -1
            r17 = 0
            r19 = 0
            r22 = 0
        L_0x0070:
            java.util.ArrayList r14 = r8.f5828c     // Catch:{ all -> 0x1bdf }
            int r14 = r14.size()     // Catch:{ all -> 0x1bdf }
            r24 = 1000(0x3e8, double:4.94E-321)
            r27 = r2
            r28 = r3
            java.lang.String r3 = "_fr"
            h5.i4 r15 = r1.f5856y
            java.lang.String r2 = "_et"
            r30 = r5
            java.lang.String r5 = "_e"
            r31 = r11
            h5.c4 r11 = r1.f5848o
            r32 = r4
            h5.b7 r4 = r1.u
            if (r13 >= r14) goto L_0x06f0
            java.util.ArrayList r14 = r8.f5828c     // Catch:{ all -> 0x06eb }
            java.lang.Object r14 = r14.get(r13)     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.x2 r14 = (com.google.android.gms.internal.measurement.x2) r14     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.b6 r14 = r14.n()     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.w2 r14 = (com.google.android.gms.internal.measurement.w2) r14     // Catch:{ all -> 0x06eb }
            E(r11)     // Catch:{ all -> 0x06eb }
            r33 = r13
            com.google.android.gms.internal.measurement.f3 r13 = r8.f5826a     // Catch:{ all -> 0x06eb }
            java.lang.String r13 = r13.r()     // Catch:{ all -> 0x06eb }
            r34 = r12
            java.lang.String r12 = r14.v()     // Catch:{ all -> 0x06eb }
            boolean r12 = r11.n(r13, r12)     // Catch:{ all -> 0x06eb }
            java.lang.String r13 = "_err"
            if (r12 == 0) goto L_0x014d
            h5.g3 r2 = r85.e()     // Catch:{ all -> 0x06eb }
            h5.e3 r2 = r2.l()     // Catch:{ all -> 0x06eb }
            java.lang.String r3 = "Dropping blacklisted raw event. appId"
            com.google.android.gms.internal.measurement.f3 r4 = r8.f5826a     // Catch:{ all -> 0x06eb }
            java.lang.String r4 = r4.r()     // Catch:{ all -> 0x06eb }
            h5.f3 r4 = h5.g3.p(r4)     // Catch:{ all -> 0x06eb }
            h5.b3 r5 = r15.p()     // Catch:{ all -> 0x06eb }
            java.lang.String r12 = r14.v()     // Catch:{ all -> 0x06eb }
            java.lang.String r5 = r5.l(r12)     // Catch:{ all -> 0x06eb }
            r2.c(r4, r5, r3)     // Catch:{ all -> 0x06eb }
            E(r11)     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.f3 r2 = r8.f5826a     // Catch:{ all -> 0x06eb }
            java.lang.String r2 = r2.r()     // Catch:{ all -> 0x06eb }
            java.lang.String r3 = "measurement.upload.blacklist_internal"
            java.lang.String r2 = r11.b(r2, r3)     // Catch:{ all -> 0x014a }
            boolean r2 = r6.equals(r2)     // Catch:{ all -> 0x014a }
            if (r2 != 0) goto L_0x0139
            E(r11)     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.f3 r2 = r8.f5826a     // Catch:{ all -> 0x06eb }
            java.lang.String r2 = r2.r()     // Catch:{ all -> 0x06eb }
            java.lang.String r3 = "measurement.upload.blacklist_public"
            java.lang.String r2 = r11.b(r2, r3)     // Catch:{ all -> 0x0136 }
            boolean r2 = r6.equals(r2)     // Catch:{ all -> 0x0136 }
            if (r2 == 0) goto L_0x0105
            goto L_0x0139
        L_0x0105:
            java.lang.String r2 = r14.v()     // Catch:{ all -> 0x06eb }
            boolean r2 = r13.equals(r2)     // Catch:{ all -> 0x06eb }
            if (r2 != 0) goto L_0x0139
            h5.g7 r35 = r85.J()     // Catch:{ all -> 0x06eb }
            h5.w6 r2 = r1.O     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.f3 r3 = r8.f5826a     // Catch:{ all -> 0x06eb }
            java.lang.String r37 = r3.r()     // Catch:{ all -> 0x06eb }
            java.lang.String r39 = "_ev"
            java.lang.String r40 = r14.v()     // Catch:{ all -> 0x06eb }
            h5.e r3 = r85.F()     // Catch:{ all -> 0x06eb }
            h5.s2<java.lang.Boolean> r4 = h5.u2.t0     // Catch:{ all -> 0x06eb }
            r5 = 0
            boolean r42 = r3.m(r5, r4)     // Catch:{ all -> 0x06eb }
            r38 = 11
            r41 = 0
            r36 = r2
            r35.w(r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x06eb }
            goto L_0x0139
        L_0x0136:
            r0 = move-exception
            goto L_0x06ec
        L_0x0139:
            r35 = r6
            r26 = r7
            r3 = r10
            r15 = r27
            r12 = r28
            r10 = r32
            r6 = r33
            r5 = r34
            goto L_0x06d4
        L_0x014a:
            r0 = move-exception
            goto L_0x06ec
        L_0x014d:
            java.lang.String r12 = r14.v()     // Catch:{ all -> 0x06eb }
            r35 = r6
            java.lang.String[] r6 = s6.a.L     // Catch:{ all -> 0x06e9 }
            r36 = r2
            java.lang.String[] r2 = s6.a.J     // Catch:{ all -> 0x06e9 }
            java.lang.String r2 = s6.a.n0(r7, r6, r2)     // Catch:{ all -> 0x06e9 }
            boolean r2 = r12.equals(r2)     // Catch:{ all -> 0x06eb }
            if (r2 == 0) goto L_0x01ce
            r14.w(r7)     // Catch:{ all -> 0x06eb }
            h5.g3 r2 = r85.e()     // Catch:{ all -> 0x06eb }
            h5.e3 r2 = r2.o()     // Catch:{ all -> 0x06eb }
            java.lang.String r6 = "Renaming ad_impression to _ai"
            r2.a(r6)     // Catch:{ all -> 0x06eb }
            h5.g3 r2 = r85.e()     // Catch:{ all -> 0x06eb }
            java.lang.String r2 = r2.r()     // Catch:{ all -> 0x06eb }
            r6 = 5
            boolean r2 = android.util.Log.isLoggable(r2, r6)     // Catch:{ all -> 0x06eb }
            if (r2 == 0) goto L_0x01ce
            r2 = 0
        L_0x0183:
            MessageType r6 = r14.f2635p     // Catch:{ all -> 0x01cb }
            com.google.android.gms.internal.measurement.x2 r6 = (com.google.android.gms.internal.measurement.x2) r6     // Catch:{ all -> 0x01cb }
            int r6 = r6.s()     // Catch:{ all -> 0x01cb }
            if (r2 >= r6) goto L_0x01ce
            java.lang.String r6 = "ad_platform"
            com.google.android.gms.internal.measurement.b3 r12 = r14.r(r2)     // Catch:{ all -> 0x06eb }
            java.lang.String r12 = r12.s()     // Catch:{ all -> 0x06eb }
            boolean r6 = r6.equals(r12)     // Catch:{ all -> 0x06eb }
            if (r6 == 0) goto L_0x01c8
            com.google.android.gms.internal.measurement.b3 r6 = r14.r(r2)     // Catch:{ all -> 0x06eb }
            java.lang.String r6 = r6.u()     // Catch:{ all -> 0x06eb }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x06eb }
            if (r6 != 0) goto L_0x01c8
            java.lang.String r6 = "admob"
            com.google.android.gms.internal.measurement.b3 r12 = r14.r(r2)     // Catch:{ all -> 0x06eb }
            java.lang.String r12 = r12.u()     // Catch:{ all -> 0x06eb }
            boolean r6 = r6.equalsIgnoreCase(r12)     // Catch:{ all -> 0x06eb }
            if (r6 == 0) goto L_0x01c8
            h5.g3 r6 = r85.e()     // Catch:{ all -> 0x06eb }
            h5.e3 r6 = r6.m()     // Catch:{ all -> 0x06eb }
            java.lang.String r12 = "AdMob ad impression logged from app. Potentially duplicative."
            r6.a(r12)     // Catch:{ all -> 0x06eb }
        L_0x01c8:
            int r2 = r2 + 1
            goto L_0x0183
        L_0x01cb:
            r0 = move-exception
            goto L_0x06ec
        L_0x01ce:
            E(r11)     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.f3 r2 = r8.f5826a     // Catch:{ all -> 0x06eb }
            java.lang.String r2 = r2.r()     // Catch:{ all -> 0x06eb }
            java.lang.String r6 = r14.v()     // Catch:{ all -> 0x06eb }
            boolean r2 = r11.o(r2, r6)     // Catch:{ all -> 0x06eb }
            java.lang.String r6 = "_c"
            if (r2 != 0) goto L_0x0236
            E(r4)     // Catch:{ all -> 0x06eb }
            java.lang.String r11 = r14.v()     // Catch:{ all -> 0x06eb }
            n4.m.e(r11)     // Catch:{ all -> 0x06eb }
            int r12 = r11.hashCode()     // Catch:{ all -> 0x06eb }
            r26 = r7
            r7 = 94660(0x171c4, float:1.32647E-40)
            if (r12 == r7) goto L_0x0217
            r7 = 95025(0x17331, float:1.33158E-40)
            if (r12 == r7) goto L_0x020d
            r7 = 95027(0x17333, float:1.33161E-40)
            if (r12 == r7) goto L_0x0203
            goto L_0x0221
        L_0x0203:
            java.lang.String r7 = "_ui"
            boolean r7 = r11.equals(r7)
            if (r7 == 0) goto L_0x0221
            r7 = 1
            goto L_0x0222
        L_0x020d:
            java.lang.String r7 = "_ug"
            boolean r7 = r11.equals(r7)
            if (r7 == 0) goto L_0x0221
            r7 = 2
            goto L_0x0222
        L_0x0217:
            java.lang.String r7 = "_in"
            boolean r7 = r11.equals(r7)
            if (r7 == 0) goto L_0x0221
            r7 = 0
            goto L_0x0222
        L_0x0221:
            r7 = -1
        L_0x0222:
            if (r7 == 0) goto L_0x0238
            r11 = 1
            if (r7 == r11) goto L_0x0238
            r11 = 2
            if (r7 == r11) goto L_0x0238
            r38 = r3
            r39 = r4
            r7 = r5
            r37 = r9
            r29 = r10
            r2 = 0
            goto L_0x0409
        L_0x0236:
            r26 = r7
        L_0x0238:
            r7 = 0
            r11 = 0
            r12 = 0
        L_0x023b:
            r37 = r9
            MessageType r9 = r14.f2635p     // Catch:{ all -> 0x06e7 }
            com.google.android.gms.internal.measurement.x2 r9 = (com.google.android.gms.internal.measurement.x2) r9     // Catch:{ all -> 0x06e7 }
            int r9 = r9.s()     // Catch:{ all -> 0x06e7 }
            r29 = r10
            java.lang.String r10 = "_r"
            if (r7 >= r9) goto L_0x02b2
            com.google.android.gms.internal.measurement.b3 r9 = r14.r(r7)     // Catch:{ all -> 0x06eb }
            java.lang.String r9 = r9.s()     // Catch:{ all -> 0x06eb }
            boolean r9 = r6.equals(r9)     // Catch:{ all -> 0x06eb }
            if (r9 == 0) goto L_0x0277
            com.google.android.gms.internal.measurement.b3 r9 = r14.r(r7)     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.b6 r9 = r9.n()     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.a3 r9 = (com.google.android.gms.internal.measurement.a3) r9     // Catch:{ all -> 0x06eb }
            r10 = 1
            r9.s(r10)     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.f6 r9 = r9.j()     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.b3 r9 = (com.google.android.gms.internal.measurement.b3) r9     // Catch:{ all -> 0x06eb }
            r14.s(r7, r9)     // Catch:{ all -> 0x06eb }
            r38 = r3
            r39 = r4
            r11 = 1
            goto L_0x02a7
        L_0x0277:
            com.google.android.gms.internal.measurement.b3 r9 = r14.r(r7)     // Catch:{ all -> 0x06eb }
            java.lang.String r9 = r9.s()     // Catch:{ all -> 0x06eb }
            boolean r9 = r10.equals(r9)     // Catch:{ all -> 0x06eb }
            if (r9 == 0) goto L_0x02a3
            com.google.android.gms.internal.measurement.b3 r9 = r14.r(r7)     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.b6 r9 = r9.n()     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.a3 r9 = (com.google.android.gms.internal.measurement.a3) r9     // Catch:{ all -> 0x06eb }
            r38 = r3
            r39 = r4
            r3 = 1
            r9.s(r3)     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.f6 r3 = r9.j()     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.b3 r3 = (com.google.android.gms.internal.measurement.b3) r3     // Catch:{ all -> 0x06eb }
            r14.s(r7, r3)     // Catch:{ all -> 0x06eb }
            r12 = 1
            goto L_0x02a7
        L_0x02a3:
            r38 = r3
            r39 = r4
        L_0x02a7:
            int r7 = r7 + 1
            r10 = r29
            r9 = r37
            r3 = r38
            r4 = r39
            goto L_0x023b
        L_0x02b2:
            r38 = r3
            r39 = r4
            if (r11 != 0) goto L_0x02e4
            if (r2 == 0) goto L_0x02e4
            h5.g3 r3 = r85.e()     // Catch:{ all -> 0x06eb }
            h5.e3 r3 = r3.o()     // Catch:{ all -> 0x06eb }
            java.lang.String r4 = "Marking event as conversion"
            h5.b3 r7 = r15.p()     // Catch:{ all -> 0x06eb }
            java.lang.String r9 = r14.v()     // Catch:{ all -> 0x06eb }
            java.lang.String r7 = r7.l(r9)     // Catch:{ all -> 0x06eb }
            r3.b(r7, r4)     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.a3 r3 = com.google.android.gms.internal.measurement.b3.D()     // Catch:{ all -> 0x06eb }
            r3.q(r6)     // Catch:{ all -> 0x06eb }
            r7 = r5
            r4 = 1
            r3.s(r4)     // Catch:{ all -> 0x06eb }
            r14.t(r3)     // Catch:{ all -> 0x06eb }
            goto L_0x02e5
        L_0x02e4:
            r7 = r5
        L_0x02e5:
            if (r12 != 0) goto L_0x030f
            h5.g3 r3 = r85.e()     // Catch:{ all -> 0x06eb }
            h5.e3 r3 = r3.o()     // Catch:{ all -> 0x06eb }
            java.lang.String r4 = "Marking event as real-time"
            h5.b3 r5 = r15.p()     // Catch:{ all -> 0x06eb }
            java.lang.String r9 = r14.v()     // Catch:{ all -> 0x06eb }
            java.lang.String r5 = r5.l(r9)     // Catch:{ all -> 0x06eb }
            r3.b(r5, r4)     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.a3 r3 = com.google.android.gms.internal.measurement.b3.D()     // Catch:{ all -> 0x06eb }
            r3.q(r10)     // Catch:{ all -> 0x06eb }
            r4 = 1
            r3.s(r4)     // Catch:{ all -> 0x06eb }
            r14.t(r3)     // Catch:{ all -> 0x06eb }
        L_0x030f:
            h5.i r3 = r1.f5850q     // Catch:{ all -> 0x06eb }
            E(r3)     // Catch:{ all -> 0x06eb }
            long r41 = r85.N()     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.f3 r4 = r8.f5826a     // Catch:{ all -> 0x06eb }
            java.lang.String r43 = r4.r()     // Catch:{ all -> 0x06eb }
            r44 = 0
            r45 = 1
            r40 = r3
            h5.g r3 = r40.N(r41, r43, r44, r45)     // Catch:{ all -> 0x06eb }
            long r3 = r3.f5390e     // Catch:{ all -> 0x06eb }
            h5.e r5 = r85.F()     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.f3 r9 = r8.f5826a     // Catch:{ all -> 0x06eb }
            java.lang.String r9 = r9.r()     // Catch:{ all -> 0x06eb }
            h5.s2<java.lang.Integer> r11 = h5.u2.f5733o     // Catch:{ all -> 0x06eb }
            int r5 = r5.l(r9, r11)     // Catch:{ all -> 0x06eb }
            long r11 = (long) r5     // Catch:{ all -> 0x06eb }
            int r3 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x0343
            s(r14, r10)     // Catch:{ all -> 0x06eb }
            goto L_0x0345
        L_0x0343:
            r21 = 1
        L_0x0345:
            java.lang.String r3 = r14.v()     // Catch:{ all -> 0x06eb }
            boolean r3 = h5.g7.Y(r3)     // Catch:{ all -> 0x06eb }
            if (r3 == 0) goto L_0x0409
            if (r2 == 0) goto L_0x0409
            h5.i r3 = r1.f5850q     // Catch:{ all -> 0x06eb }
            E(r3)     // Catch:{ all -> 0x06eb }
            long r41 = r85.N()     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.f3 r4 = r8.f5826a     // Catch:{ all -> 0x06eb }
            java.lang.String r43 = r4.r()     // Catch:{ all -> 0x06eb }
            r44 = 1
            r45 = 0
            r40 = r3
            h5.g r3 = r40.N(r41, r43, r44, r45)     // Catch:{ all -> 0x06eb }
            long r3 = r3.f5389c     // Catch:{ all -> 0x06eb }
            h5.e r5 = r85.F()     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.f3 r9 = r8.f5826a     // Catch:{ all -> 0x06eb }
            java.lang.String r9 = r9.r()     // Catch:{ all -> 0x06eb }
            h5.s2<java.lang.Integer> r10 = h5.u2.f5731n     // Catch:{ all -> 0x06eb }
            int r5 = r5.l(r9, r10)     // Catch:{ all -> 0x06eb }
            long r9 = (long) r5     // Catch:{ all -> 0x06eb }
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x0409
            h5.g3 r3 = r85.e()     // Catch:{ all -> 0x06eb }
            h5.e3 r3 = r3.l()     // Catch:{ all -> 0x06eb }
            java.lang.String r4 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.f3 r5 = r8.f5826a     // Catch:{ all -> 0x06eb }
            java.lang.String r5 = r5.r()     // Catch:{ all -> 0x06eb }
            h5.f3 r5 = h5.g3.p(r5)     // Catch:{ all -> 0x06eb }
            r3.b(r5, r4)     // Catch:{ all -> 0x06eb }
            r3 = 0
            r4 = 0
            r5 = -1
            r9 = 0
        L_0x039c:
            MessageType r10 = r14.f2635p     // Catch:{ all -> 0x0406 }
            com.google.android.gms.internal.measurement.x2 r10 = (com.google.android.gms.internal.measurement.x2) r10     // Catch:{ all -> 0x0406 }
            int r10 = r10.s()     // Catch:{ all -> 0x0406 }
            if (r3 >= r10) goto L_0x03cb
            com.google.android.gms.internal.measurement.b3 r10 = r14.r(r3)     // Catch:{ all -> 0x06eb }
            java.lang.String r11 = r10.s()     // Catch:{ all -> 0x06eb }
            boolean r11 = r6.equals(r11)     // Catch:{ all -> 0x06eb }
            if (r11 == 0) goto L_0x03bd
            com.google.android.gms.internal.measurement.b6 r5 = r10.n()     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.a3 r5 = (com.google.android.gms.internal.measurement.a3) r5     // Catch:{ all -> 0x06eb }
            r9 = r5
            r5 = r3
            goto L_0x03c8
        L_0x03bd:
            java.lang.String r10 = r10.s()     // Catch:{ all -> 0x06eb }
            boolean r10 = r13.equals(r10)     // Catch:{ all -> 0x06eb }
            if (r10 == 0) goto L_0x03c8
            r4 = 1
        L_0x03c8:
            int r3 = r3 + 1
            goto L_0x039c
        L_0x03cb:
            if (r4 == 0) goto L_0x03d4
            if (r9 == 0) goto L_0x03d3
            r14.u(r5)     // Catch:{ all -> 0x06eb }
            goto L_0x0409
        L_0x03d3:
            r9 = 0
        L_0x03d4:
            if (r9 == 0) goto L_0x03ee
            com.google.android.gms.internal.measurement.b6 r3 = r9.clone()     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.a3 r3 = (com.google.android.gms.internal.measurement.a3) r3     // Catch:{ all -> 0x06eb }
            r3.q(r13)     // Catch:{ all -> 0x06eb }
            r9 = 10
            r3.s(r9)     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.f6 r3 = r3.j()     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.b3 r3 = (com.google.android.gms.internal.measurement.b3) r3     // Catch:{ all -> 0x06eb }
            r14.s(r5, r3)     // Catch:{ all -> 0x06eb }
            goto L_0x0409
        L_0x03ee:
            h5.g3 r3 = r85.e()     // Catch:{ all -> 0x06eb }
            h5.e3 r3 = r3.k()     // Catch:{ all -> 0x06eb }
            java.lang.String r4 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.f3 r5 = r8.f5826a     // Catch:{ all -> 0x06eb }
            java.lang.String r5 = r5.r()     // Catch:{ all -> 0x06eb }
            h5.f3 r5 = h5.g3.p(r5)     // Catch:{ all -> 0x06eb }
            r3.b(r5, r4)     // Catch:{ all -> 0x06eb }
            goto L_0x0409
        L_0x0406:
            r0 = move-exception
            goto L_0x06ec
        L_0x0409:
            if (r2 == 0) goto L_0x04c1
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x06eb }
            java.util.List r3 = r14.q()     // Catch:{ all -> 0x06eb }
            r2.<init>(r3)     // Catch:{ all -> 0x06eb }
            r3 = 0
            r4 = -1
            r5 = -1
        L_0x0417:
            int r9 = r2.size()     // Catch:{ all -> 0x06eb }
            java.lang.String r10 = "currency"
            java.lang.String r11 = "value"
            if (r3 >= r9) goto L_0x0447
            java.lang.Object r9 = r2.get(r3)     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.b3 r9 = (com.google.android.gms.internal.measurement.b3) r9     // Catch:{ all -> 0x06eb }
            java.lang.String r9 = r9.s()     // Catch:{ all -> 0x06eb }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x06eb }
            if (r9 == 0) goto L_0x0433
            r4 = r3
            goto L_0x0444
        L_0x0433:
            java.lang.Object r9 = r2.get(r3)     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.b3 r9 = (com.google.android.gms.internal.measurement.b3) r9     // Catch:{ all -> 0x06eb }
            java.lang.String r9 = r9.s()     // Catch:{ all -> 0x06eb }
            boolean r9 = r10.equals(r9)     // Catch:{ all -> 0x06eb }
            if (r9 == 0) goto L_0x0444
            r5 = r3
        L_0x0444:
            int r3 = r3 + 1
            goto L_0x0417
        L_0x0447:
            r3 = -1
            if (r4 != r3) goto L_0x044c
            goto L_0x04c1
        L_0x044c:
            java.lang.Object r3 = r2.get(r4)     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.b3 r3 = (com.google.android.gms.internal.measurement.b3) r3     // Catch:{ all -> 0x06eb }
            boolean r3 = r3.v()     // Catch:{ all -> 0x06eb }
            if (r3 != 0) goto L_0x047d
            java.lang.Object r3 = r2.get(r4)     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.b3 r3 = (com.google.android.gms.internal.measurement.b3) r3     // Catch:{ all -> 0x06eb }
            boolean r3 = r3.z()     // Catch:{ all -> 0x06eb }
            if (r3 != 0) goto L_0x047d
            h5.g3 r2 = r85.e()     // Catch:{ all -> 0x06eb }
            h5.e3 r2 = r2.m()     // Catch:{ all -> 0x06eb }
            java.lang.String r3 = "Value must be specified with a numeric type."
            r2.a(r3)     // Catch:{ all -> 0x06eb }
            r14.u(r4)     // Catch:{ all -> 0x06eb }
            s(r14, r6)     // Catch:{ all -> 0x06eb }
            r2 = 18
            r(r14, r2, r11)     // Catch:{ all -> 0x06eb }
            goto L_0x04c1
        L_0x047d:
            r3 = -1
            if (r5 != r3) goto L_0x0481
            goto L_0x04a9
        L_0x0481:
            java.lang.Object r2 = r2.get(r5)     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.b3 r2 = (com.google.android.gms.internal.measurement.b3) r2     // Catch:{ all -> 0x06eb }
            java.lang.String r2 = r2.u()     // Catch:{ all -> 0x06eb }
            int r3 = r2.length()     // Catch:{ all -> 0x06eb }
            r5 = 3
            if (r3 != r5) goto L_0x04a9
            r3 = 0
        L_0x0493:
            int r5 = r2.length()     // Catch:{ all -> 0x06eb }
            if (r3 >= r5) goto L_0x04c1
            int r5 = r2.codePointAt(r3)     // Catch:{ all -> 0x06eb }
            boolean r9 = java.lang.Character.isLetter(r5)     // Catch:{ all -> 0x06eb }
            if (r9 == 0) goto L_0x04a9
            int r5 = java.lang.Character.charCount(r5)     // Catch:{ all -> 0x06eb }
            int r3 = r3 + r5
            goto L_0x0493
        L_0x04a9:
            h5.g3 r2 = r85.e()     // Catch:{ all -> 0x06eb }
            h5.e3 r2 = r2.m()     // Catch:{ all -> 0x06eb }
            java.lang.String r3 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.a(r3)     // Catch:{ all -> 0x06eb }
            r14.u(r4)     // Catch:{ all -> 0x06eb }
            s(r14, r6)     // Catch:{ all -> 0x06eb }
            r2 = 19
            r(r14, r2, r10)     // Catch:{ all -> 0x06eb }
        L_0x04c1:
            java.lang.String r2 = r14.v()     // Catch:{ all -> 0x06eb }
            boolean r2 = r7.equals(r2)     // Catch:{ all -> 0x06eb }
            if (r2 == 0) goto L_0x0529
            E(r39)     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.f6 r2 = r14.j()     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.x2 r2 = (com.google.android.gms.internal.measurement.x2) r2     // Catch:{ all -> 0x06eb }
            r3 = r38
            com.google.android.gms.internal.measurement.b3 r2 = h5.b7.k(r2, r3)     // Catch:{ all -> 0x06eb }
            if (r2 != 0) goto L_0x051c
            if (r22 == 0) goto L_0x0508
            long r2 = r22.x()     // Catch:{ all -> 0x06eb }
            long r4 = r14.x()     // Catch:{ all -> 0x06eb }
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x06eb }
            int r2 = (r2 > r24 ? 1 : (r2 == r24 ? 0 : -1))
            if (r2 > 0) goto L_0x0508
            com.google.android.gms.internal.measurement.b6 r2 = r22.clone()     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.w2 r2 = (com.google.android.gms.internal.measurement.w2) r2     // Catch:{ all -> 0x06eb }
            boolean r3 = r1.w(r14, r2)     // Catch:{ all -> 0x06eb }
            if (r3 == 0) goto L_0x0508
            r3 = r29
            r9 = r37
            r9.F(r3, r2)     // Catch:{ all -> 0x06eb }
            r12 = r34
            r2 = 0
            r22 = 0
            goto L_0x050f
        L_0x0508:
            r3 = r29
            r9 = r37
            r2 = r14
            r12 = r16
        L_0x050f:
            r19 = r2
            r5 = r12
            r15 = r27
            r12 = r28
            r10 = r32
        L_0x0518:
            r4 = r36
            goto L_0x0654
        L_0x051c:
            r3 = r29
            r9 = r37
            r15 = r27
            r12 = r28
            r10 = r32
            r5 = r34
            goto L_0x0518
        L_0x0529:
            r3 = r29
            r9 = r37
            java.lang.String r2 = "_vs"
            java.lang.String r4 = r14.v()     // Catch:{ all -> 0x06eb }
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x06eb }
            if (r2 == 0) goto L_0x058d
            E(r39)     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.f6 r2 = r14.j()     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.x2 r2 = (com.google.android.gms.internal.measurement.x2) r2     // Catch:{ all -> 0x06eb }
            r4 = r36
            com.google.android.gms.internal.measurement.b3 r2 = h5.b7.k(r2, r4)     // Catch:{ all -> 0x06eb }
            if (r2 != 0) goto L_0x058a
            if (r19 == 0) goto L_0x0583
            long r5 = r19.x()     // Catch:{ all -> 0x06eb }
            long r10 = r14.x()     // Catch:{ all -> 0x06eb }
            long r5 = r5 - r10
            long r5 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x06eb }
            int r2 = (r5 > r24 ? 1 : (r5 == r24 ? 0 : -1))
            if (r2 > 0) goto L_0x0583
            com.google.android.gms.internal.measurement.b6 r2 = r19.clone()     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.w2 r2 = (com.google.android.gms.internal.measurement.w2) r2     // Catch:{ all -> 0x06eb }
            boolean r5 = r1.w(r2, r14)     // Catch:{ all -> 0x06eb }
            if (r5 == 0) goto L_0x0573
            r5 = r34
            r9.F(r5, r2)     // Catch:{ all -> 0x06eb }
            r10 = r3
            r2 = 0
            r19 = 0
            goto L_0x0578
        L_0x0573:
            r5 = r34
            r2 = r14
            r10 = r16
        L_0x0578:
            r22 = r2
            r3 = r10
        L_0x057b:
            r15 = r27
            r12 = r28
            r10 = r32
            goto L_0x0654
        L_0x0583:
            r5 = r34
            r22 = r14
            r3 = r16
            goto L_0x057b
        L_0x058a:
            r5 = r34
            goto L_0x057b
        L_0x058d:
            r5 = r34
            r4 = r36
            h5.e r2 = r85.F()     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.f3 r6 = r8.f5826a     // Catch:{ all -> 0x06eb }
            java.lang.String r6 = r6.r()     // Catch:{ all -> 0x06eb }
            h5.s2<java.lang.Boolean> r10 = h5.u2.f5723i0     // Catch:{ all -> 0x06eb }
            boolean r2 = r2.m(r6, r10)     // Catch:{ all -> 0x06eb }
            if (r2 == 0) goto L_0x057b
            java.lang.String r2 = "_ab"
            java.lang.String r6 = r14.v()     // Catch:{ all -> 0x06eb }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x06eb }
            if (r2 == 0) goto L_0x057b
            E(r39)     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.f6 r2 = r14.j()     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.x2 r2 = (com.google.android.gms.internal.measurement.x2) r2     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.b3 r2 = h5.b7.k(r2, r4)     // Catch:{ all -> 0x06eb }
            if (r2 != 0) goto L_0x057b
            if (r19 == 0) goto L_0x057b
            long r10 = r19.x()     // Catch:{ all -> 0x06eb }
            long r12 = r14.x()     // Catch:{ all -> 0x06eb }
            long r10 = r10 - r12
            long r10 = java.lang.Math.abs(r10)     // Catch:{ all -> 0x06eb }
            r12 = 4000(0xfa0, double:1.9763E-320)
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 > 0) goto L_0x057b
            com.google.android.gms.internal.measurement.b6 r2 = r19.clone()     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.w2 r2 = (com.google.android.gms.internal.measurement.w2) r2     // Catch:{ all -> 0x06eb }
            r1.x(r2, r14)     // Catch:{ all -> 0x06eb }
            java.lang.String r6 = r2.v()     // Catch:{ all -> 0x06eb }
            boolean r6 = r7.equals(r6)     // Catch:{ all -> 0x06eb }
            n4.m.b(r6)     // Catch:{ all -> 0x06eb }
            E(r39)     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.f6 r6 = r2.j()     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.x2 r6 = (com.google.android.gms.internal.measurement.x2) r6     // Catch:{ all -> 0x06eb }
            r10 = r32
            com.google.android.gms.internal.measurement.b3 r6 = h5.b7.k(r6, r10)     // Catch:{ all -> 0x06eb }
            E(r39)     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.f6 r11 = r2.j()     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.x2 r11 = (com.google.android.gms.internal.measurement.x2) r11     // Catch:{ all -> 0x06eb }
            r12 = r28
            com.google.android.gms.internal.measurement.b3 r11 = h5.b7.k(r11, r12)     // Catch:{ all -> 0x06eb }
            E(r39)     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.f6 r13 = r2.j()     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.x2 r13 = (com.google.android.gms.internal.measurement.x2) r13     // Catch:{ all -> 0x06eb }
            r15 = r27
            com.google.android.gms.internal.measurement.b3 r13 = h5.b7.k(r13, r15)     // Catch:{ all -> 0x06eb }
            java.lang.String r19 = ""
            if (r6 == 0) goto L_0x061d
            java.lang.String r6 = r6.u()     // Catch:{ all -> 0x06eb }
            goto L_0x061f
        L_0x061d:
            r6 = r19
        L_0x061f:
            boolean r24 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x06eb }
            if (r24 != 0) goto L_0x062b
            E(r39)     // Catch:{ all -> 0x06eb }
            h5.b7.I(r14, r10, r6)     // Catch:{ all -> 0x06eb }
        L_0x062b:
            if (r11 == 0) goto L_0x0631
            java.lang.String r19 = r11.u()     // Catch:{ all -> 0x06eb }
        L_0x0631:
            r6 = r19
            boolean r11 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x06eb }
            if (r11 != 0) goto L_0x063f
            E(r39)     // Catch:{ all -> 0x06eb }
            h5.b7.I(r14, r12, r6)     // Catch:{ all -> 0x06eb }
        L_0x063f:
            if (r13 == 0) goto L_0x064f
            E(r39)     // Catch:{ all -> 0x06eb }
            long r24 = r13.w()     // Catch:{ all -> 0x06eb }
            java.lang.Long r6 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x06eb }
            h5.b7.I(r14, r15, r6)     // Catch:{ all -> 0x06eb }
        L_0x064f:
            r9.F(r5, r2)     // Catch:{ all -> 0x06eb }
            r19 = 0
        L_0x0654:
            if (r31 != 0) goto L_0x06ae
            java.lang.String r2 = r14.v()     // Catch:{ all -> 0x06eb }
            boolean r2 = r7.equals(r2)     // Catch:{ all -> 0x06eb }
            if (r2 == 0) goto L_0x06ae
            MessageType r2 = r14.f2635p     // Catch:{ all -> 0x06ac }
            com.google.android.gms.internal.measurement.x2 r2 = (com.google.android.gms.internal.measurement.x2) r2     // Catch:{ all -> 0x06ac }
            int r2 = r2.s()     // Catch:{ all -> 0x06ac }
            if (r2 != 0) goto L_0x067f
            h5.g3 r2 = r85.e()     // Catch:{ all -> 0x06eb }
            h5.e3 r2 = r2.l()     // Catch:{ all -> 0x06eb }
            java.lang.String r4 = "Engagement event does not contain any parameters. appId"
            com.google.android.gms.internal.measurement.f3 r6 = r8.f5826a     // Catch:{ all -> 0x06eb }
            java.lang.String r6 = r6.r()     // Catch:{ all -> 0x06eb }
        L_0x067a:
            h5.f3 r6 = h5.g3.p(r6)     // Catch:{ all -> 0x06eb }
            goto L_0x06a1
        L_0x067f:
            E(r39)     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.f6 r2 = r14.j()     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.x2 r2 = (com.google.android.gms.internal.measurement.x2) r2     // Catch:{ all -> 0x06eb }
            java.io.Serializable r2 = h5.b7.l(r2, r4)     // Catch:{ all -> 0x06eb }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x06eb }
            if (r2 != 0) goto L_0x06a5
            h5.g3 r2 = r85.e()     // Catch:{ all -> 0x06eb }
            h5.e3 r2 = r2.l()     // Catch:{ all -> 0x06eb }
            java.lang.String r4 = "Engagement event does not include duration. appId"
            com.google.android.gms.internal.measurement.f3 r6 = r8.f5826a     // Catch:{ all -> 0x06eb }
            java.lang.String r6 = r6.r()     // Catch:{ all -> 0x06eb }
            goto L_0x067a
        L_0x06a1:
            r2.b(r6, r4)     // Catch:{ all -> 0x06eb }
            goto L_0x06ae
        L_0x06a5:
            long r6 = r2.longValue()     // Catch:{ all -> 0x06eb }
            long r17 = r17 + r6
            goto L_0x06ae
        L_0x06ac:
            r0 = move-exception
            goto L_0x06ec
        L_0x06ae:
            java.util.ArrayList r2 = r8.f5828c     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.f6 r4 = r14.j()     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.x2 r4 = (com.google.android.gms.internal.measurement.x2) r4     // Catch:{ all -> 0x06eb }
            r6 = r33
            r2.set(r6, r4)     // Catch:{ all -> 0x06eb }
            int r16 = r16 + 1
            boolean r2 = r9.f2636q     // Catch:{ all -> 0x06e5 }
            if (r2 == 0) goto L_0x06c7
            r9.m()     // Catch:{ all -> 0x06e5 }
            r2 = 0
            r9.f2636q = r2     // Catch:{ all -> 0x06e5 }
        L_0x06c7:
            MessageType r2 = r9.f2635p     // Catch:{ all -> 0x06e5 }
            com.google.android.gms.internal.measurement.f3 r2 = (com.google.android.gms.internal.measurement.f3) r2     // Catch:{ all -> 0x06e5 }
            com.google.android.gms.internal.measurement.f6 r4 = r14.j()     // Catch:{ all -> 0x06e5 }
            com.google.android.gms.internal.measurement.x2 r4 = (com.google.android.gms.internal.measurement.x2) r4     // Catch:{ all -> 0x06e5 }
            com.google.android.gms.internal.measurement.f3.F0(r2, r4)     // Catch:{ all -> 0x06e5 }
        L_0x06d4:
            int r13 = r6 + 1
            r4 = r10
            r2 = r15
            r7 = r26
            r11 = r31
            r6 = r35
            r10 = r3
            r3 = r12
            r12 = r5
            r5 = r30
            goto L_0x0070
        L_0x06e5:
            r0 = move-exception
            goto L_0x06ec
        L_0x06e7:
            r0 = move-exception
            goto L_0x06ec
        L_0x06e9:
            r0 = move-exception
            goto L_0x06ec
        L_0x06eb:
            r0 = move-exception
        L_0x06ec:
            r2 = r0
            r14 = r1
            goto L_0x17ca
        L_0x06f0:
            r39 = r4
            r7 = r5
            r4 = r2
            if (r31 == 0) goto L_0x074e
            r2 = r16
            r5 = 0
        L_0x06f9:
            if (r5 >= r2) goto L_0x074e
            MessageType r6 = r9.f2635p     // Catch:{ all -> 0x074c }
            com.google.android.gms.internal.measurement.f3 r6 = (com.google.android.gms.internal.measurement.f3) r6     // Catch:{ all -> 0x074c }
            com.google.android.gms.internal.measurement.x2 r6 = r6.j1(r5)     // Catch:{ all -> 0x074c }
            java.lang.String r10 = r6.u()     // Catch:{ all -> 0x06eb }
            boolean r10 = r7.equals(r10)     // Catch:{ all -> 0x06eb }
            if (r10 == 0) goto L_0x071e
            E(r39)     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.b3 r10 = h5.b7.k(r6, r3)     // Catch:{ all -> 0x06eb }
            if (r10 == 0) goto L_0x071e
            r9.H(r5)     // Catch:{ all -> 0x06eb }
            int r2 = r2 + -1
            int r5 = r5 + -1
            goto L_0x0749
        L_0x071e:
            E(r39)     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.b3 r6 = h5.b7.k(r6, r4)     // Catch:{ all -> 0x06eb }
            if (r6 == 0) goto L_0x0749
            boolean r10 = r6.v()     // Catch:{ all -> 0x06eb }
            if (r10 == 0) goto L_0x0736
            long r12 = r6.w()     // Catch:{ all -> 0x06eb }
            java.lang.Long r6 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x06eb }
            goto L_0x0737
        L_0x0736:
            r6 = 0
        L_0x0737:
            if (r6 == 0) goto L_0x0749
            long r12 = r6.longValue()     // Catch:{ all -> 0x06eb }
            r27 = 0
            int r10 = (r12 > r27 ? 1 : (r12 == r27 ? 0 : -1))
            if (r10 <= 0) goto L_0x0749
            long r12 = r6.longValue()     // Catch:{ all -> 0x06eb }
            long r17 = r17 + r12
        L_0x0749:
            r6 = 1
            int r5 = r5 + r6
            goto L_0x06f9
        L_0x074c:
            r0 = move-exception
            goto L_0x06ec
        L_0x074e:
            r2 = r17
            r4 = 0
            r1.v(r9, r2, r4)     // Catch:{ all -> 0x1bdf }
            MessageType r4 = r9.f2635p     // Catch:{ all -> 0x1bdf }
            com.google.android.gms.internal.measurement.f3 r4 = (com.google.android.gms.internal.measurement.f3) r4     // Catch:{ all -> 0x1bdf }
            java.util.List r4 = r4.h1()     // Catch:{ all -> 0x1bdf }
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)     // Catch:{ all -> 0x1bdf }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x1bdf }
        L_0x0764:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x1bdf }
            java.lang.String r6 = "_s"
            java.lang.String r7 = "_se"
            if (r5 == 0) goto L_0x078a
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.x2 r5 = (com.google.android.gms.internal.measurement.x2) r5     // Catch:{ all -> 0x06eb }
            java.lang.String r5 = r5.u()     // Catch:{ all -> 0x06eb }
            boolean r5 = r6.equals(r5)     // Catch:{ all -> 0x06eb }
            if (r5 == 0) goto L_0x0764
            h5.i r4 = r1.f5850q     // Catch:{ all -> 0x06eb }
            E(r4)     // Catch:{ all -> 0x06eb }
            java.lang.String r5 = r9.q()     // Catch:{ all -> 0x06eb }
            r4.B(r5, r7)     // Catch:{ all -> 0x06eb }
        L_0x078a:
            java.lang.String r4 = "_sid"
            int r4 = h5.b7.F(r9, r4)     // Catch:{ all -> 0x1bdf }
            if (r4 < 0) goto L_0x0797
            r4 = 1
            r1.v(r9, r2, r4)     // Catch:{ all -> 0x06eb }
            goto L_0x07b7
        L_0x0797:
            int r2 = h5.b7.F(r9, r7)     // Catch:{ all -> 0x1bdf }
            if (r2 < 0) goto L_0x07b7
            r9.J(r2)     // Catch:{ all -> 0x06eb }
            h5.g3 r2 = r85.e()     // Catch:{ all -> 0x06eb }
            h5.e3 r2 = r2.k()     // Catch:{ all -> 0x06eb }
            java.lang.String r3 = "Session engagement user property is in the bundle without session ID. appId"
            com.google.android.gms.internal.measurement.f3 r4 = r8.f5826a     // Catch:{ all -> 0x06eb }
            java.lang.String r4 = r4.r()     // Catch:{ all -> 0x06eb }
            h5.f3 r4 = h5.g3.p(r4)     // Catch:{ all -> 0x06eb }
            r2.b(r4, r3)     // Catch:{ all -> 0x06eb }
        L_0x07b7:
            E(r39)     // Catch:{ all -> 0x1bdf }
            r2 = r39
            h5.z6 r3 = r2.f5701p
            h5.i4 r4 = r2.f5649o
            h5.g3 r5 = r4.e()     // Catch:{ all -> 0x1bdf }
            h5.e3 r5 = r5.o()     // Catch:{ all -> 0x1bdf }
            java.lang.String r7 = "Checking account type status for ad personalization signals"
            r5.a(r7)     // Catch:{ all -> 0x1bdf }
            h5.c4 r5 = r3.f5848o     // Catch:{ all -> 0x1bdf }
            E(r5)     // Catch:{ all -> 0x1bdf }
            java.lang.String r7 = r9.q()     // Catch:{ all -> 0x1bdf }
            r5.g()     // Catch:{ all -> 0x1bdf }
            com.google.android.gms.internal.measurement.o2 r5 = r5.k(r7)     // Catch:{ all -> 0x1bdf }
            if (r5 != 0) goto L_0x07e1
            r5 = 0
            goto L_0x07e5
        L_0x07e1:
            boolean r5 = r5.z()     // Catch:{ all -> 0x1bdf }
        L_0x07e5:
            if (r5 == 0) goto L_0x0930
            h5.i r3 = r3.f5850q     // Catch:{ all -> 0x06eb }
            E(r3)     // Catch:{ all -> 0x06eb }
            java.lang.String r5 = r9.q()     // Catch:{ all -> 0x06eb }
            h5.m4 r3 = r3.L(r5)     // Catch:{ all -> 0x06eb }
            if (r3 == 0) goto L_0x0930
            boolean r3 = r3.t()     // Catch:{ all -> 0x06eb }
            if (r3 == 0) goto L_0x0930
            h5.k r3 = r4.s()     // Catch:{ all -> 0x06eb }
            java.lang.String r5 = "com.google"
            r3.g()     // Catch:{ all -> 0x092d }
            h5.i4 r7 = r3.f5649o     // Catch:{ all -> 0x092d }
            r4.d r10 = r7.B     // Catch:{ all -> 0x092d }
            r10.getClass()     // Catch:{ all -> 0x092d }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x092d }
            r10 = r15
            long r14 = r3.u     // Catch:{ all -> 0x092d }
            long r14 = r12 - r14
            r16 = 86400000(0x5265c00, double:4.2687272E-316)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 <= 0) goto L_0x081f
            r14 = 0
            r3.f5497t = r14     // Catch:{ all -> 0x092d }
        L_0x081f:
            java.lang.Boolean r14 = r3.f5497t     // Catch:{ all -> 0x092d }
            if (r14 != 0) goto L_0x08a9
            java.lang.String r14 = "android.permission.GET_ACCOUNTS"
            android.content.Context r15 = r7.f5452o     // Catch:{ all -> 0x092d }
            int r14 = y.a.a(r15, r14)     // Catch:{ all -> 0x092d }
            h5.g3 r7 = r7.w     // Catch:{ all -> 0x092d }
            if (r14 == 0) goto L_0x083d
            h5.i4.n(r7)     // Catch:{ all -> 0x092d }
            java.lang.String r5 = "Permission error checking for dasher/unicorn accounts"
            h5.e3 r7 = r7.f5399x     // Catch:{ all -> 0x092d }
            r7.a(r5)     // Catch:{ all -> 0x092d }
            r18 = r10
            goto L_0x08a1
        L_0x083d:
            android.accounts.AccountManager r14 = r3.f5496s     // Catch:{ all -> 0x092d }
            if (r14 != 0) goto L_0x0847
            android.accounts.AccountManager r14 = android.accounts.AccountManager.get(r15)     // Catch:{ all -> 0x092d }
            r3.f5496s = r14     // Catch:{ all -> 0x092d }
        L_0x0847:
            android.accounts.AccountManager r14 = r3.f5496s     // Catch:{ AuthenticatorException -> 0x0895, IOException -> 0x0893, OperationCanceledException -> 0x088e }
            java.lang.String r15 = "service_HOSTED"
            java.lang.String[] r15 = new java.lang.String[]{r15}     // Catch:{ AuthenticatorException -> 0x0895, IOException -> 0x0893, OperationCanceledException -> 0x088e }
            r18 = r10
            r10 = 0
            android.accounts.AccountManagerFuture r14 = r14.getAccountsByTypeAndFeatures(r5, r15, r10, r10)     // Catch:{ AuthenticatorException -> 0x088c, IOException -> 0x088a, OperationCanceledException -> 0x0888 }
            java.lang.Object r10 = r14.getResult()     // Catch:{ AuthenticatorException -> 0x088c, IOException -> 0x088a, OperationCanceledException -> 0x0888 }
            android.accounts.Account[] r10 = (android.accounts.Account[]) r10     // Catch:{ AuthenticatorException -> 0x088c, IOException -> 0x088a, OperationCanceledException -> 0x0888 }
            if (r10 == 0) goto L_0x0869
            int r10 = r10.length     // Catch:{ AuthenticatorException -> 0x088c, IOException -> 0x088a, OperationCanceledException -> 0x0888 }
            if (r10 <= 0) goto L_0x0869
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ AuthenticatorException -> 0x088c, IOException -> 0x088a, OperationCanceledException -> 0x0888 }
            r3.f5497t = r5     // Catch:{ AuthenticatorException -> 0x088c, IOException -> 0x088a, OperationCanceledException -> 0x0888 }
            r3.u = r12     // Catch:{ AuthenticatorException -> 0x088c, IOException -> 0x088a, OperationCanceledException -> 0x0888 }
        L_0x0867:
            r3 = 1
            goto L_0x08af
        L_0x0869:
            android.accounts.AccountManager r10 = r3.f5496s     // Catch:{ AuthenticatorException -> 0x088c, IOException -> 0x088a, OperationCanceledException -> 0x0888 }
            java.lang.String r14 = "service_uca"
            java.lang.String[] r14 = new java.lang.String[]{r14}     // Catch:{ AuthenticatorException -> 0x088c, IOException -> 0x088a, OperationCanceledException -> 0x0888 }
            r15 = 0
            android.accounts.AccountManagerFuture r5 = r10.getAccountsByTypeAndFeatures(r5, r14, r15, r15)     // Catch:{ AuthenticatorException -> 0x088c, IOException -> 0x088a, OperationCanceledException -> 0x0888 }
            java.lang.Object r5 = r5.getResult()     // Catch:{ AuthenticatorException -> 0x088c, IOException -> 0x088a, OperationCanceledException -> 0x0888 }
            android.accounts.Account[] r5 = (android.accounts.Account[]) r5     // Catch:{ AuthenticatorException -> 0x088c, IOException -> 0x088a, OperationCanceledException -> 0x0888 }
            if (r5 == 0) goto L_0x08a1
            int r5 = r5.length     // Catch:{ AuthenticatorException -> 0x088c, IOException -> 0x088a, OperationCanceledException -> 0x0888 }
            if (r5 <= 0) goto L_0x08a1
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ AuthenticatorException -> 0x088c, IOException -> 0x088a, OperationCanceledException -> 0x0888 }
            r3.f5497t = r5     // Catch:{ AuthenticatorException -> 0x088c, IOException -> 0x088a, OperationCanceledException -> 0x0888 }
            r3.u = r12     // Catch:{ AuthenticatorException -> 0x088c, IOException -> 0x088a, OperationCanceledException -> 0x0888 }
            goto L_0x0867
        L_0x0888:
            r0 = move-exception
            goto L_0x0891
        L_0x088a:
            r0 = move-exception
            goto L_0x0891
        L_0x088c:
            r0 = move-exception
            goto L_0x0891
        L_0x088e:
            r0 = move-exception
        L_0x088f:
            r18 = r10
        L_0x0891:
            r5 = r0
            goto L_0x0897
        L_0x0893:
            r0 = move-exception
            goto L_0x088f
        L_0x0895:
            r0 = move-exception
            goto L_0x088f
        L_0x0897:
            h5.i4.n(r7)     // Catch:{ all -> 0x092d }
            java.lang.String r10 = "Exception checking account types"
            h5.e3 r7 = r7.u     // Catch:{ all -> 0x092d }
            r7.b(r5, r10)     // Catch:{ all -> 0x092d }
        L_0x08a1:
            r3.u = r12     // Catch:{ all -> 0x092d }
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x092d }
            r3.f5497t = r5     // Catch:{ all -> 0x092d }
            r3 = 0
            goto L_0x08af
        L_0x08a9:
            r18 = r10
            boolean r3 = r14.booleanValue()     // Catch:{ all -> 0x092d }
        L_0x08af:
            if (r3 == 0) goto L_0x0932
            h5.g3 r3 = r4.e()     // Catch:{ all -> 0x06eb }
            h5.e3 r3 = r3.n()     // Catch:{ all -> 0x06eb }
            java.lang.String r5 = "Turning off ad personalization due to account type"
            r3.a(r5)     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.p3 r3 = com.google.android.gms.internal.measurement.q3.A()     // Catch:{ all -> 0x06eb }
            r5 = r30
            r3.r(r5)     // Catch:{ all -> 0x06eb }
            h5.k r4 = r4.s()     // Catch:{ all -> 0x06eb }
            long r12 = r4.m()     // Catch:{ all -> 0x06eb }
            r3.q(r12)     // Catch:{ all -> 0x06eb }
            r12 = 1
            r3.s(r12)     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.f6 r3 = r3.j()     // Catch:{ all -> 0x06eb }
            com.google.android.gms.internal.measurement.q3 r3 = (com.google.android.gms.internal.measurement.q3) r3     // Catch:{ all -> 0x06eb }
            r4 = 0
        L_0x08de:
            MessageType r7 = r9.f2635p     // Catch:{ all -> 0x092a }
            com.google.android.gms.internal.measurement.f3 r7 = (com.google.android.gms.internal.measurement.f3) r7     // Catch:{ all -> 0x092a }
            int r7 = r7.l1()     // Catch:{ all -> 0x092a }
            if (r4 >= r7) goto L_0x0915
            MessageType r7 = r9.f2635p     // Catch:{ all -> 0x0912 }
            com.google.android.gms.internal.measurement.f3 r7 = (com.google.android.gms.internal.measurement.f3) r7     // Catch:{ all -> 0x0912 }
            com.google.android.gms.internal.measurement.q3 r7 = r7.m1(r4)     // Catch:{ all -> 0x0912 }
            java.lang.String r7 = r7.t()     // Catch:{ all -> 0x06eb }
            boolean r7 = r5.equals(r7)     // Catch:{ all -> 0x06eb }
            if (r7 == 0) goto L_0x090f
            boolean r5 = r9.f2636q     // Catch:{ all -> 0x090c }
            if (r5 == 0) goto L_0x0904
            r9.m()     // Catch:{ all -> 0x090c }
            r5 = 0
            r9.f2636q = r5     // Catch:{ all -> 0x090c }
        L_0x0904:
            MessageType r5 = r9.f2635p     // Catch:{ all -> 0x090c }
            com.google.android.gms.internal.measurement.f3 r5 = (com.google.android.gms.internal.measurement.f3) r5     // Catch:{ all -> 0x090c }
            com.google.android.gms.internal.measurement.f3.J0(r5, r4, r3)     // Catch:{ all -> 0x090c }
            goto L_0x0932
        L_0x090c:
            r0 = move-exception
            goto L_0x06ec
        L_0x090f:
            int r4 = r4 + 1
            goto L_0x08de
        L_0x0912:
            r0 = move-exception
            goto L_0x06ec
        L_0x0915:
            boolean r4 = r9.f2636q     // Catch:{ all -> 0x0927 }
            if (r4 == 0) goto L_0x091f
            r9.m()     // Catch:{ all -> 0x0927 }
            r4 = 0
            r9.f2636q = r4     // Catch:{ all -> 0x0927 }
        L_0x091f:
            MessageType r4 = r9.f2635p     // Catch:{ all -> 0x0927 }
            com.google.android.gms.internal.measurement.f3 r4 = (com.google.android.gms.internal.measurement.f3) r4     // Catch:{ all -> 0x0927 }
            com.google.android.gms.internal.measurement.f3.K0(r4, r3)     // Catch:{ all -> 0x0927 }
            goto L_0x0932
        L_0x0927:
            r0 = move-exception
            goto L_0x06ec
        L_0x092a:
            r0 = move-exception
            goto L_0x06ec
        L_0x092d:
            r0 = move-exception
            goto L_0x06ec
        L_0x0930:
            r18 = r15
        L_0x0932:
            boolean r3 = r9.f2636q     // Catch:{ all -> 0x1bdf }
            if (r3 == 0) goto L_0x0941
            r9.m()     // Catch:{ all -> 0x093f }
            r3 = 0
            r9.f2636q = r3     // Catch:{ all -> 0x093f }
            goto L_0x0941
        L_0x093d:
            r2 = r0
            goto L_0x095c
        L_0x093f:
            r0 = move-exception
            goto L_0x093d
        L_0x0941:
            MessageType r3 = r9.f2635p     // Catch:{ all -> 0x1bc5 }
            com.google.android.gms.internal.measurement.f3 r3 = (com.google.android.gms.internal.measurement.f3) r3     // Catch:{ all -> 0x1bc5 }
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            com.google.android.gms.internal.measurement.f3.N0(r3, r4)     // Catch:{ all -> 0x1bc5 }
            boolean r3 = r9.f2636q     // Catch:{ all -> 0x1bdf }
            if (r3 == 0) goto L_0x095f
            r9.m()     // Catch:{ all -> 0x095a }
            r3 = 0
            r9.f2636q = r3     // Catch:{ all -> 0x095a }
            goto L_0x095f
        L_0x0958:
            r2 = r0
            goto L_0x095c
        L_0x095a:
            r0 = move-exception
            goto L_0x0958
        L_0x095c:
            r4 = r1
            goto L_0x1bc8
        L_0x095f:
            MessageType r3 = r9.f2635p     // Catch:{ all -> 0x1bc5 }
            com.google.android.gms.internal.measurement.f3 r3 = (com.google.android.gms.internal.measurement.f3) r3     // Catch:{ all -> 0x1bc5 }
            r4 = -9223372036854775808
            com.google.android.gms.internal.measurement.f3.O0(r3, r4)     // Catch:{ all -> 0x1bc5 }
            r3 = 0
        L_0x0969:
            MessageType r4 = r9.f2635p     // Catch:{ all -> 0x1bdf }
            com.google.android.gms.internal.measurement.f3 r4 = (com.google.android.gms.internal.measurement.f3) r4     // Catch:{ all -> 0x1bdf }
            int r4 = r4.i1()     // Catch:{ all -> 0x1bdf }
            if (r3 >= r4) goto L_0x09d9
            MessageType r4 = r9.f2635p     // Catch:{ all -> 0x09d6 }
            com.google.android.gms.internal.measurement.f3 r4 = (com.google.android.gms.internal.measurement.f3) r4     // Catch:{ all -> 0x09d6 }
            com.google.android.gms.internal.measurement.x2 r4 = r4.j1(r3)     // Catch:{ all -> 0x09d6 }
            long r12 = r4.w()     // Catch:{ all -> 0x06eb }
            MessageType r5 = r9.f2635p     // Catch:{ all -> 0x09d3 }
            com.google.android.gms.internal.measurement.f3 r5 = (com.google.android.gms.internal.measurement.f3) r5     // Catch:{ all -> 0x09d3 }
            long r14 = r5.q1()     // Catch:{ all -> 0x09d3 }
            int r5 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r5 >= 0) goto L_0x09a4
            long r12 = r4.w()     // Catch:{ all -> 0x06eb }
            boolean r5 = r9.f2636q     // Catch:{ all -> 0x09a1 }
            if (r5 == 0) goto L_0x0999
            r9.m()     // Catch:{ all -> 0x09a1 }
            r5 = 0
            r9.f2636q = r5     // Catch:{ all -> 0x09a1 }
        L_0x0999:
            MessageType r5 = r9.f2635p     // Catch:{ all -> 0x09a1 }
            com.google.android.gms.internal.measurement.f3 r5 = (com.google.android.gms.internal.measurement.f3) r5     // Catch:{ all -> 0x09a1 }
            com.google.android.gms.internal.measurement.f3.N0(r5, r12)     // Catch:{ all -> 0x09a1 }
            goto L_0x09a4
        L_0x09a1:
            r0 = move-exception
            goto L_0x06ec
        L_0x09a4:
            long r12 = r4.w()     // Catch:{ all -> 0x06eb }
            MessageType r5 = r9.f2635p     // Catch:{ all -> 0x09d0 }
            com.google.android.gms.internal.measurement.f3 r5 = (com.google.android.gms.internal.measurement.f3) r5     // Catch:{ all -> 0x09d0 }
            long r14 = r5.s1()     // Catch:{ all -> 0x09d0 }
            int r5 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r5 <= 0) goto L_0x09cd
            long r4 = r4.w()     // Catch:{ all -> 0x06eb }
            boolean r7 = r9.f2636q     // Catch:{ all -> 0x09ca }
            if (r7 == 0) goto L_0x09c2
            r9.m()     // Catch:{ all -> 0x09ca }
            r7 = 0
            r9.f2636q = r7     // Catch:{ all -> 0x09ca }
        L_0x09c2:
            MessageType r7 = r9.f2635p     // Catch:{ all -> 0x09ca }
            com.google.android.gms.internal.measurement.f3 r7 = (com.google.android.gms.internal.measurement.f3) r7     // Catch:{ all -> 0x09ca }
            com.google.android.gms.internal.measurement.f3.O0(r7, r4)     // Catch:{ all -> 0x09ca }
            goto L_0x09cd
        L_0x09ca:
            r0 = move-exception
            goto L_0x06ec
        L_0x09cd:
            int r3 = r3 + 1
            goto L_0x0969
        L_0x09d0:
            r0 = move-exception
            goto L_0x06ec
        L_0x09d3:
            r0 = move-exception
            goto L_0x06ec
        L_0x09d6:
            r0 = move-exception
            goto L_0x06ec
        L_0x09d9:
            r9.x()     // Catch:{ all -> 0x1bdf }
            r9.w()     // Catch:{ all -> 0x1bdf }
            h5.q7 r3 = r1.f5853t     // Catch:{ all -> 0x1bdf }
            E(r3)     // Catch:{ all -> 0x1bdf }
            java.lang.String r4 = r9.q()     // Catch:{ all -> 0x1bdf }
            MessageType r5 = r9.f2635p     // Catch:{ all -> 0x1bdf }
            com.google.android.gms.internal.measurement.f3 r5 = (com.google.android.gms.internal.measurement.f3) r5     // Catch:{ all -> 0x1bdf }
            java.util.List r5 = r5.h1()     // Catch:{ all -> 0x1bdf }
            java.util.List r5 = java.util.Collections.unmodifiableList(r5)     // Catch:{ all -> 0x1bdf }
            MessageType r7 = r9.f2635p     // Catch:{ all -> 0x1bdf }
            com.google.android.gms.internal.measurement.f3 r7 = (com.google.android.gms.internal.measurement.f3) r7     // Catch:{ all -> 0x1bdf }
            com.google.android.gms.internal.measurement.m6 r7 = r7.k1()     // Catch:{ all -> 0x1bdf }
            java.util.List r7 = java.util.Collections.unmodifiableList(r7)     // Catch:{ all -> 0x1bdf }
            MessageType r10 = r9.f2635p     // Catch:{ all -> 0x1bdf }
            com.google.android.gms.internal.measurement.f3 r10 = (com.google.android.gms.internal.measurement.f3) r10     // Catch:{ all -> 0x1bdf }
            long r12 = r10.q1()     // Catch:{ all -> 0x1bdf }
            java.lang.Long r10 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x1bdf }
            MessageType r12 = r9.f2635p     // Catch:{ all -> 0x1bdf }
            com.google.android.gms.internal.measurement.f3 r12 = (com.google.android.gms.internal.measurement.f3) r12     // Catch:{ all -> 0x1bdf }
            long r12 = r12.s1()     // Catch:{ all -> 0x1bdf }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x1bdf }
            java.lang.String r13 = "current_results"
            n4.m.e(r4)     // Catch:{ all -> 0x1bdf }
            n4.m.h(r5)     // Catch:{ all -> 0x1bdf }
            n4.m.h(r7)     // Catch:{ all -> 0x1bdf }
            r3.f5659r = r4     // Catch:{ all -> 0x1bdf }
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x1bdf }
            r4.<init>()     // Catch:{ all -> 0x1bdf }
            r3.f5660s = r4     // Catch:{ all -> 0x1bdf }
            n.b r4 = new n.b     // Catch:{ all -> 0x1bdf }
            r4.<init>()     // Catch:{ all -> 0x1bdf }
            r3.f5661t = r4     // Catch:{ all -> 0x1bdf }
            r3.u = r10     // Catch:{ all -> 0x1bdf }
            r3.f5662v = r12     // Catch:{ all -> 0x1bdf }
            java.util.Iterator r4 = r5.iterator()     // Catch:{ all -> 0x1bdf }
        L_0x0a3b:
            boolean r10 = r4.hasNext()     // Catch:{ all -> 0x1bdf }
            if (r10 == 0) goto L_0x0a53
            java.lang.Object r10 = r4.next()     // Catch:{ all -> 0x1bdf }
            com.google.android.gms.internal.measurement.x2 r10 = (com.google.android.gms.internal.measurement.x2) r10     // Catch:{ all -> 0x1bdf }
            java.lang.String r10 = r10.u()     // Catch:{ all -> 0x1bdf }
            boolean r10 = r6.equals(r10)     // Catch:{ all -> 0x1bdf }
            if (r10 == 0) goto L_0x0a3b
            r4 = 1
            goto L_0x0a54
        L_0x0a53:
            r4 = 0
        L_0x0a54:
            com.google.android.gms.internal.measurement.ba.a()     // Catch:{ all -> 0x1bdf }
            h5.i4 r6 = r3.f5649o     // Catch:{ all -> 0x1bdf }
            h5.e r10 = r6.o()     // Catch:{ all -> 0x1bdf }
            java.lang.String r12 = r3.f5659r     // Catch:{ all -> 0x1bdf }
            h5.s2<java.lang.Boolean> r14 = h5.u2.Y     // Catch:{ all -> 0x1bdf }
            boolean r10 = r10.m(r12, r14)     // Catch:{ all -> 0x1bdf }
            com.google.android.gms.internal.measurement.ba.a()     // Catch:{ all -> 0x1bdf }
            h5.e r12 = r6.o()     // Catch:{ all -> 0x1bdf }
            java.lang.String r14 = r3.f5659r     // Catch:{ all -> 0x1bdf }
            h5.s2<java.lang.Boolean> r15 = h5.u2.X     // Catch:{ all -> 0x1bdf }
            boolean r12 = r12.m(r14, r15)     // Catch:{ all -> 0x1bdf }
            h5.z6 r14 = r3.f5701p     // Catch:{ all -> 0x1bdf }
            if (r4 == 0) goto L_0x0ad2
            h5.i r15 = r14.G()     // Catch:{ all -> 0x1bb3 }
            r19 = r11
            java.lang.String r11 = r3.f5659r     // Catch:{ all -> 0x1bb3 }
            r15.h()     // Catch:{ all -> 0x1bb3 }
            r15.g()     // Catch:{ all -> 0x1bb3 }
            n4.m.e(r11)     // Catch:{ all -> 0x1bb3 }
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x1bb3 }
            r1.<init>()     // Catch:{ all -> 0x1bb3 }
            r39 = r2
            java.lang.String r2 = "current_session_count"
            r22 = r8
            r20 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x1bb3 }
            r1.put(r2, r8)     // Catch:{ all -> 0x1bb3 }
            android.database.sqlite.SQLiteDatabase r2 = r15.y()     // Catch:{ SQLiteException -> 0x0ab8 }
            r27 = r9
            r8 = 1
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x0ab4 }
            r9[r20] = r11     // Catch:{ SQLiteException -> 0x0ab4 }
            java.lang.String r8 = "events"
            r28 = r7
            java.lang.String r7 = "app_id = ?"
            r2.update(r8, r1, r7, r9)     // Catch:{ SQLiteException -> 0x0ab2 }
            goto L_0x0adc
        L_0x0ab2:
            r0 = move-exception
            goto L_0x0abd
        L_0x0ab4:
            r0 = move-exception
            r28 = r7
            goto L_0x0abd
        L_0x0ab8:
            r0 = move-exception
            r28 = r7
            r27 = r9
        L_0x0abd:
            r1 = r0
            h5.i4 r2 = r15.f5649o     // Catch:{ all -> 0x1bb3 }
            h5.g3 r2 = r2.e()     // Catch:{ all -> 0x1bb3 }
            h5.e3 r2 = r2.k()     // Catch:{ all -> 0x1bb3 }
            h5.f3 r7 = h5.g3.p(r11)     // Catch:{ all -> 0x1bb3 }
            java.lang.String r8 = "Error resetting session-scoped event counts. appId"
            r2.c(r7, r1, r8)     // Catch:{ all -> 0x1bb3 }
            goto L_0x0adc
        L_0x0ad2:
            r39 = r2
            r28 = r7
            r22 = r8
            r27 = r9
            r19 = r11
        L_0x0adc:
            java.util.Map r1 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x1bb3 }
            java.lang.String r2 = "Failed to merge filter. appId"
            java.lang.String r7 = "Database error querying filters. appId"
            java.lang.String r8 = "data"
            java.lang.String r9 = "audience_id"
            if (r12 == 0) goto L_0x0bd1
            if (r10 == 0) goto L_0x0bd1
            h5.i r1 = r14.G()     // Catch:{ all -> 0x1bb3 }
            h5.i4 r11 = r1.f5649o     // Catch:{ all -> 0x1bb3 }
            java.lang.String r15 = r3.f5659r     // Catch:{ all -> 0x1bb3 }
            n4.m.e(r15)     // Catch:{ all -> 0x1bb3 }
            r38 = r5
            n.b r5 = new n.b     // Catch:{ all -> 0x1bb3 }
            r5.<init>()     // Catch:{ all -> 0x1bb3 }
            android.database.sqlite.SQLiteDatabase r30 = r1.y()     // Catch:{ all -> 0x1bb3 }
            java.lang.String[] r32 = new java.lang.String[]{r9, r8}     // Catch:{ SQLiteException -> 0x0ba5, all -> 0x0ba1 }
            r40 = r8
            r1 = 1
            java.lang.String[] r8 = new java.lang.String[r1]     // Catch:{ SQLiteException -> 0x0b9f, all -> 0x0ba1 }
            r1 = 0
            r8[r1] = r15     // Catch:{ SQLiteException -> 0x0b9f, all -> 0x0ba1 }
            java.lang.String r31 = "event_filters"
            java.lang.String r33 = "app_id=?"
            r35 = 0
            r36 = 0
            r37 = 0
            r34 = r8
            android.database.Cursor r1 = r30.query(r31, r32, r33, r34, r35, r36, r37)     // Catch:{ SQLiteException -> 0x0b9f, all -> 0x0ba1 }
            boolean r8 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0b9b }
            if (r8 == 0) goto L_0x0b90
        L_0x0b24:
            r41 = r10
            r8 = 1
            byte[] r10 = r1.getBlob(r8)     // Catch:{ SQLiteException -> 0x0b8b }
            com.google.android.gms.internal.measurement.x1 r8 = com.google.android.gms.internal.measurement.y1.D()     // Catch:{ IOException -> 0x0b68 }
            com.google.android.gms.internal.measurement.b6 r8 = h5.b7.E(r8, r10)     // Catch:{ IOException -> 0x0b68 }
            com.google.android.gms.internal.measurement.x1 r8 = (com.google.android.gms.internal.measurement.x1) r8     // Catch:{ IOException -> 0x0b68 }
            com.google.android.gms.internal.measurement.f6 r8 = r8.j()     // Catch:{ IOException -> 0x0b68 }
            com.google.android.gms.internal.measurement.y1 r8 = (com.google.android.gms.internal.measurement.y1) r8     // Catch:{ IOException -> 0x0b68 }
            boolean r10 = r8.x()     // Catch:{ SQLiteException -> 0x0b8b }
            if (r10 != 0) goto L_0x0b44
            r42 = r12
            goto L_0x0b7b
        L_0x0b44:
            r10 = 0
            int r30 = r1.getInt(r10)     // Catch:{ SQLiteException -> 0x0b8b }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r30)     // Catch:{ SQLiteException -> 0x0b8b }
            java.lang.Object r30 = r5.get(r10)     // Catch:{ SQLiteException -> 0x0b8b }
            java.util.List r30 = (java.util.List) r30     // Catch:{ SQLiteException -> 0x0b8b }
            if (r30 != 0) goto L_0x0b60
            r42 = r12
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0b99 }
            r12.<init>()     // Catch:{ SQLiteException -> 0x0b99 }
            r5.put(r10, r12)     // Catch:{ SQLiteException -> 0x0b99 }
            goto L_0x0b64
        L_0x0b60:
            r42 = r12
            r12 = r30
        L_0x0b64:
            r12.add(r8)     // Catch:{ SQLiteException -> 0x0b99 }
            goto L_0x0b7b
        L_0x0b68:
            r0 = move-exception
            r42 = r12
            r8 = r0
            h5.g3 r10 = r11.e()     // Catch:{ SQLiteException -> 0x0b99 }
            h5.e3 r10 = r10.k()     // Catch:{ SQLiteException -> 0x0b99 }
            h5.f3 r12 = h5.g3.p(r15)     // Catch:{ SQLiteException -> 0x0b99 }
            r10.c(r12, r8, r2)     // Catch:{ SQLiteException -> 0x0b99 }
        L_0x0b7b:
            boolean r8 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0b99 }
            if (r8 != 0) goto L_0x0b86
            r1.close()     // Catch:{ all -> 0x1564 }
            goto L_0x0bda
        L_0x0b86:
            r10 = r41
            r12 = r42
            goto L_0x0b24
        L_0x0b8b:
            r0 = move-exception
        L_0x0b8c:
            r42 = r12
        L_0x0b8e:
            r5 = r0
            goto L_0x0bae
        L_0x0b90:
            r41 = r10
            r42 = r12
            java.util.Map r5 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0b99 }
            goto L_0x0bc3
        L_0x0b99:
            r0 = move-exception
            goto L_0x0b8e
        L_0x0b9b:
            r0 = move-exception
            r41 = r10
            goto L_0x0b8c
        L_0x0b9f:
            r0 = move-exception
            goto L_0x0ba8
        L_0x0ba1:
            r0 = move-exception
            r1 = r0
            r15 = 0
            goto L_0x0bcb
        L_0x0ba5:
            r0 = move-exception
            r40 = r8
        L_0x0ba8:
            r41 = r10
            r42 = r12
            r5 = r0
            r1 = 0
        L_0x0bae:
            h5.g3 r8 = r11.e()     // Catch:{ all -> 0x0bc8 }
            h5.e3 r8 = r8.k()     // Catch:{ all -> 0x0bc8 }
            h5.f3 r10 = h5.g3.p(r15)     // Catch:{ all -> 0x0bc8 }
            r8.c(r10, r5, r7)     // Catch:{ all -> 0x0bc8 }
            java.util.Map r5 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0bc8 }
            if (r1 == 0) goto L_0x0bc6
        L_0x0bc3:
            r1.close()     // Catch:{ all -> 0x1bb3 }
        L_0x0bc6:
            r1 = r5
            goto L_0x0bd9
        L_0x0bc8:
            r0 = move-exception
            r15 = r1
            r1 = r0
        L_0x0bcb:
            if (r15 == 0) goto L_0x0bd0
            r15.close()     // Catch:{ all -> 0x1bb3 }
        L_0x0bd0:
            throw r1     // Catch:{ all -> 0x1bb3 }
        L_0x0bd1:
            r38 = r5
            r40 = r8
            r41 = r10
            r42 = r12
        L_0x0bd9:
            r5 = r1
        L_0x0bda:
            h5.i r1 = r14.G()     // Catch:{ all -> 0x1bb3 }
            h5.i4 r8 = r1.f5649o     // Catch:{ all -> 0x1bb3 }
            java.lang.String r10 = r3.f5659r     // Catch:{ all -> 0x1bb3 }
            r1.h()     // Catch:{ all -> 0x1bb3 }
            r1.g()     // Catch:{ all -> 0x1bb3 }
            n4.m.e(r10)     // Catch:{ all -> 0x1bb3 }
            android.database.sqlite.SQLiteDatabase r30 = r1.y()     // Catch:{ all -> 0x1bb3 }
            java.lang.String[] r32 = new java.lang.String[]{r9, r13}     // Catch:{ SQLiteException -> 0x0c8b, all -> 0x0c84 }
            r1 = 1
            java.lang.String[] r11 = new java.lang.String[r1]     // Catch:{ SQLiteException -> 0x0c8b, all -> 0x0c84 }
            r1 = 0
            r11[r1] = r10     // Catch:{ SQLiteException -> 0x0c8b, all -> 0x0c84 }
            java.lang.String r31 = "audience_filter_values"
            java.lang.String r33 = "app_id=?"
            r35 = 0
            r36 = 0
            r37 = 0
            r34 = r11
            android.database.Cursor r1 = r30.query(r31, r32, r33, r34, r35, r36, r37)     // Catch:{ SQLiteException -> 0x0c8b, all -> 0x0c84 }
            boolean r11 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0c7e }
            if (r11 != 0) goto L_0x0c1c
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0c7e }
            r1.close()     // Catch:{ all -> 0x1bb3 }
            r44 = r7
            r43 = r13
            goto L_0x0cac
        L_0x0c1c:
            n.b r11 = new n.b     // Catch:{ SQLiteException -> 0x0c7e }
            r11.<init>()     // Catch:{ SQLiteException -> 0x0c7e }
        L_0x0c21:
            r12 = 0
            int r15 = r1.getInt(r12)     // Catch:{ SQLiteException -> 0x0c7e }
            r43 = r13
            r12 = 1
            byte[] r13 = r1.getBlob(r12)     // Catch:{ SQLiteException -> 0x0c7a }
            com.google.android.gms.internal.measurement.l3 r12 = com.google.android.gms.internal.measurement.m3.B()     // Catch:{ IOException -> 0x0c49 }
            com.google.android.gms.internal.measurement.b6 r12 = h5.b7.E(r12, r13)     // Catch:{ IOException -> 0x0c49 }
            com.google.android.gms.internal.measurement.l3 r12 = (com.google.android.gms.internal.measurement.l3) r12     // Catch:{ IOException -> 0x0c49 }
            com.google.android.gms.internal.measurement.f6 r12 = r12.j()     // Catch:{ IOException -> 0x0c49 }
            com.google.android.gms.internal.measurement.m3 r12 = (com.google.android.gms.internal.measurement.m3) r12     // Catch:{ IOException -> 0x0c49 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)     // Catch:{ SQLiteException -> 0x0c7a }
            r11.put(r13, r12)     // Catch:{ SQLiteException -> 0x0c7a }
            r44 = r7
            r30 = r11
            goto L_0x0c64
        L_0x0c49:
            r0 = move-exception
            r12 = r0
            h5.g3 r13 = r8.e()     // Catch:{ SQLiteException -> 0x0c7a }
            h5.e3 r13 = r13.k()     // Catch:{ SQLiteException -> 0x0c7a }
            r30 = r11
            java.lang.String r11 = "Failed to merge filter results. appId, audienceId, error"
            r44 = r7
            h5.f3 r7 = h5.g3.p(r10)     // Catch:{ SQLiteException -> 0x0c77 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ SQLiteException -> 0x0c77 }
            r13.d(r11, r7, r15, r12)     // Catch:{ SQLiteException -> 0x0c77 }
        L_0x0c64:
            boolean r7 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0c77 }
            if (r7 != 0) goto L_0x0c70
            r1.close()     // Catch:{ all -> 0x1564 }
            r8 = r30
            goto L_0x0cac
        L_0x0c70:
            r11 = r30
            r13 = r43
            r7 = r44
            goto L_0x0c21
        L_0x0c77:
            r0 = move-exception
        L_0x0c78:
            r7 = r0
            goto L_0x0c92
        L_0x0c7a:
            r0 = move-exception
            r44 = r7
            goto L_0x0c78
        L_0x0c7e:
            r0 = move-exception
            r44 = r7
            r43 = r13
            goto L_0x0c78
        L_0x0c84:
            r0 = move-exception
            r1 = r0
            r15 = 0
            r4 = r85
            goto L_0x1bbc
        L_0x0c8b:
            r0 = move-exception
            r44 = r7
            r43 = r13
            r7 = r0
            r1 = 0
        L_0x0c92:
            h5.g3 r8 = r8.e()     // Catch:{ all -> 0x1bb7 }
            h5.e3 r8 = r8.k()     // Catch:{ all -> 0x1bb7 }
            java.lang.String r11 = "Database error querying filter results. appId"
            h5.f3 r10 = h5.g3.p(r10)     // Catch:{ all -> 0x1bb7 }
            r8.c(r10, r7, r11)     // Catch:{ all -> 0x1bb7 }
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x1bb7 }
            if (r1 == 0) goto L_0x0cac
            r1.close()     // Catch:{ all -> 0x1bb3 }
        L_0x0cac:
            boolean r1 = r8.isEmpty()     // Catch:{ all -> 0x1bb3 }
            if (r1 == 0) goto L_0x0cba
        L_0x0cb2:
            r47 = r2
            r48 = r6
            r49 = r9
            goto L_0x1012
        L_0x0cba:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x1bb3 }
            java.util.Set r7 = r8.keySet()     // Catch:{ all -> 0x1bb3 }
            r1.<init>(r7)     // Catch:{ all -> 0x1bb3 }
            if (r4 == 0) goto L_0x0e4f
            java.lang.String r4 = r3.f5659r     // Catch:{ all -> 0x1bb3 }
            n4.m.e(r4)     // Catch:{ all -> 0x1bb3 }
            n.b r7 = new n.b     // Catch:{ all -> 0x1bb3 }
            r7.<init>()     // Catch:{ all -> 0x1bb3 }
            boolean r10 = r8.isEmpty()     // Catch:{ all -> 0x1bb3 }
            if (r10 == 0) goto L_0x0cd7
            goto L_0x0e50
        L_0x0cd7:
            h5.i r10 = r14.G()     // Catch:{ all -> 0x1bb3 }
            r10.h()     // Catch:{ all -> 0x1bb3 }
            r10.g()     // Catch:{ all -> 0x1bb3 }
            n4.m.e(r4)     // Catch:{ all -> 0x1bb3 }
            n.b r11 = new n.b     // Catch:{ all -> 0x1bb3 }
            r11.<init>()     // Catch:{ all -> 0x1bb3 }
            android.database.sqlite.SQLiteDatabase r12 = r10.y()     // Catch:{ all -> 0x1bb3 }
            r13 = 2
            java.lang.String[] r15 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0d3b, all -> 0x0d36 }
            r13 = 0
            r15[r13] = r4     // Catch:{ SQLiteException -> 0x0d3b, all -> 0x0d36 }
            r13 = 1
            r15[r13] = r4     // Catch:{ SQLiteException -> 0x0d3b, all -> 0x0d36 }
            java.lang.String r13 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            android.database.Cursor r12 = r12.rawQuery(r13, r15)     // Catch:{ SQLiteException -> 0x0d3b, all -> 0x0d36 }
            boolean r13 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x0d33 }
            if (r13 == 0) goto L_0x0d2e
        L_0x0d02:
            r13 = 0
            int r15 = r12.getInt(r13)     // Catch:{ SQLiteException -> 0x0d33 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)     // Catch:{ SQLiteException -> 0x0d33 }
            java.lang.Object r15 = r11.get(r13)     // Catch:{ SQLiteException -> 0x0d33 }
            java.util.List r15 = (java.util.List) r15     // Catch:{ SQLiteException -> 0x0d33 }
            if (r15 != 0) goto L_0x0d1b
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0d33 }
            r15.<init>()     // Catch:{ SQLiteException -> 0x0d33 }
            r11.put(r13, r15)     // Catch:{ SQLiteException -> 0x0d33 }
        L_0x0d1b:
            r13 = 1
            int r30 = r12.getInt(r13)     // Catch:{ SQLiteException -> 0x0d33 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r30)     // Catch:{ SQLiteException -> 0x0d33 }
            r15.add(r13)     // Catch:{ SQLiteException -> 0x0d33 }
            boolean r13 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x0d33 }
            if (r13 != 0) goto L_0x0d02
            goto L_0x0d57
        L_0x0d2e:
            java.util.Map r11 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0d33 }
            goto L_0x0d57
        L_0x0d33:
            r0 = move-exception
            r11 = r0
            goto L_0x0d3e
        L_0x0d36:
            r0 = move-exception
            r1 = r0
            r15 = 0
            goto L_0x0e49
        L_0x0d3b:
            r0 = move-exception
            r11 = r0
            r12 = 0
        L_0x0d3e:
            h5.i4 r10 = r10.f5649o     // Catch:{ all -> 0x0e46 }
            h5.g3 r10 = r10.e()     // Catch:{ all -> 0x0e46 }
            h5.e3 r10 = r10.k()     // Catch:{ all -> 0x0e46 }
            java.lang.String r13 = "Database error querying scoped filters. appId"
            h5.f3 r4 = h5.g3.p(r4)     // Catch:{ all -> 0x0e46 }
            r10.c(r4, r11, r13)     // Catch:{ all -> 0x0e46 }
            java.util.Map r11 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0e46 }
            if (r12 == 0) goto L_0x0d5a
        L_0x0d57:
            r12.close()     // Catch:{ all -> 0x1564 }
        L_0x0d5a:
            java.util.Set r4 = r8.keySet()     // Catch:{ all -> 0x1564 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x1564 }
        L_0x0d62:
            boolean r10 = r4.hasNext()     // Catch:{ all -> 0x1564 }
            if (r10 == 0) goto L_0x0e50
            java.lang.Object r10 = r4.next()     // Catch:{ all -> 0x1564 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x1564 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x1564 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x1564 }
            java.lang.Object r13 = r8.get(r12)     // Catch:{ all -> 0x1564 }
            com.google.android.gms.internal.measurement.m3 r13 = (com.google.android.gms.internal.measurement.m3) r13     // Catch:{ all -> 0x1564 }
            java.lang.Object r15 = r11.get(r12)     // Catch:{ all -> 0x1564 }
            java.util.List r15 = (java.util.List) r15     // Catch:{ all -> 0x1564 }
            if (r15 == 0) goto L_0x0e39
            boolean r30 = r15.isEmpty()     // Catch:{ all -> 0x1564 }
            if (r30 == 0) goto L_0x0d8c
            goto L_0x0e39
        L_0x0d8c:
            h5.b7 r12 = r14.I()     // Catch:{ all -> 0x1564 }
            java.util.List r30 = r13.t()     // Catch:{ all -> 0x1564 }
            r31 = r4
            r4 = r30
            com.google.android.gms.internal.measurement.l6 r4 = (com.google.android.gms.internal.measurement.l6) r4     // Catch:{ all -> 0x1564 }
            java.util.List r4 = r12.A(r4, r15)     // Catch:{ all -> 0x1564 }
            boolean r12 = r4.isEmpty()     // Catch:{ all -> 0x1564 }
            if (r12 != 0) goto L_0x0e36
            com.google.android.gms.internal.measurement.b6 r12 = r13.n()     // Catch:{ all -> 0x1564 }
            com.google.android.gms.internal.measurement.l3 r12 = (com.google.android.gms.internal.measurement.l3) r12     // Catch:{ all -> 0x1564 }
            r12.r()     // Catch:{ all -> 0x1564 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x1564 }
            r30 = r11
            boolean r11 = r12.f2636q     // Catch:{ all -> 0x1564 }
            if (r11 == 0) goto L_0x0dbb
            r12.m()     // Catch:{ all -> 0x1564 }
            r11 = 0
            r12.f2636q = r11     // Catch:{ all -> 0x1564 }
        L_0x0dbb:
            MessageType r11 = r12.f2635p     // Catch:{ all -> 0x1564 }
            com.google.android.gms.internal.measurement.m3 r11 = (com.google.android.gms.internal.measurement.m3) r11     // Catch:{ all -> 0x1564 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x1564 }
            com.google.android.gms.internal.measurement.m3.G(r11, r4)     // Catch:{ all -> 0x1564 }
            h5.b7 r4 = r14.I()     // Catch:{ all -> 0x1564 }
            java.util.List r11 = r13.r()     // Catch:{ all -> 0x1564 }
            com.google.android.gms.internal.measurement.l6 r11 = (com.google.android.gms.internal.measurement.l6) r11     // Catch:{ all -> 0x1564 }
            java.util.List r4 = r4.A(r11, r15)     // Catch:{ all -> 0x1564 }
            r12.q()     // Catch:{ all -> 0x1564 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x1564 }
            boolean r11 = r12.f2636q     // Catch:{ all -> 0x1564 }
            if (r11 == 0) goto L_0x0de1
            r12.m()     // Catch:{ all -> 0x1564 }
            r11 = 0
            r12.f2636q = r11     // Catch:{ all -> 0x1564 }
        L_0x0de1:
            MessageType r11 = r12.f2635p     // Catch:{ all -> 0x1564 }
            com.google.android.gms.internal.measurement.m3 r11 = (com.google.android.gms.internal.measurement.m3) r11     // Catch:{ all -> 0x1564 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x1564 }
            com.google.android.gms.internal.measurement.m3.E(r11, r4)     // Catch:{ all -> 0x1564 }
            r4 = 0
        L_0x0deb:
            int r11 = r13.w()     // Catch:{ all -> 0x1564 }
            if (r4 >= r11) goto L_0x0e09
            com.google.android.gms.internal.measurement.v2 r11 = r13.x(r4)     // Catch:{ all -> 0x1564 }
            int r11 = r11.s()     // Catch:{ all -> 0x1564 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x1564 }
            boolean r11 = r15.contains(r11)     // Catch:{ all -> 0x1564 }
            if (r11 == 0) goto L_0x0e06
            r12.s(r4)     // Catch:{ all -> 0x1564 }
        L_0x0e06:
            int r4 = r4 + 1
            goto L_0x0deb
        L_0x0e09:
            r4 = 0
        L_0x0e0a:
            int r11 = r13.z()     // Catch:{ all -> 0x1564 }
            if (r4 >= r11) goto L_0x0e28
            com.google.android.gms.internal.measurement.o3 r11 = r13.A(r4)     // Catch:{ all -> 0x1564 }
            int r11 = r11.s()     // Catch:{ all -> 0x1564 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x1564 }
            boolean r11 = r15.contains(r11)     // Catch:{ all -> 0x1564 }
            if (r11 == 0) goto L_0x0e25
            r12.t(r4)     // Catch:{ all -> 0x1564 }
        L_0x0e25:
            int r4 = r4 + 1
            goto L_0x0e0a
        L_0x0e28:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x1564 }
            com.google.android.gms.internal.measurement.f6 r10 = r12.j()     // Catch:{ all -> 0x1564 }
            com.google.android.gms.internal.measurement.m3 r10 = (com.google.android.gms.internal.measurement.m3) r10     // Catch:{ all -> 0x1564 }
            r7.put(r4, r10)     // Catch:{ all -> 0x1564 }
            goto L_0x0e40
        L_0x0e36:
            r30 = r11
            goto L_0x0e40
        L_0x0e39:
            r31 = r4
            r30 = r11
            r7.put(r12, r13)     // Catch:{ all -> 0x1564 }
        L_0x0e40:
            r11 = r30
            r4 = r31
            goto L_0x0d62
        L_0x0e46:
            r0 = move-exception
            r1 = r0
            r15 = r12
        L_0x0e49:
            if (r15 == 0) goto L_0x0e4e
            r15.close()     // Catch:{ all -> 0x1564 }
        L_0x0e4e:
            throw r1     // Catch:{ all -> 0x1564 }
        L_0x0e4f:
            r7 = r8
        L_0x0e50:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x1bb3 }
        L_0x0e54:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x1bb3 }
            if (r4 == 0) goto L_0x0cb2
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x1bb3 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x1bb3 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x1bb3 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x1bb3 }
            java.lang.Object r10 = r7.get(r10)     // Catch:{ all -> 0x1bb3 }
            com.google.android.gms.internal.measurement.m3 r10 = (com.google.android.gms.internal.measurement.m3) r10     // Catch:{ all -> 0x1bb3 }
            java.util.BitSet r11 = new java.util.BitSet     // Catch:{ all -> 0x1bb3 }
            r11.<init>()     // Catch:{ all -> 0x1bb3 }
            java.util.BitSet r12 = new java.util.BitSet     // Catch:{ all -> 0x1bb3 }
            r12.<init>()     // Catch:{ all -> 0x1bb3 }
            n.b r13 = new n.b     // Catch:{ all -> 0x1bb3 }
            r13.<init>()     // Catch:{ all -> 0x1bb3 }
            if (r10 == 0) goto L_0x0ec8
            int r15 = r10.w()     // Catch:{ all -> 0x1bb3 }
            if (r15 != 0) goto L_0x0e86
            goto L_0x0ec8
        L_0x0e86:
            com.google.android.gms.internal.measurement.m6 r15 = r10.v()     // Catch:{ all -> 0x1564 }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ all -> 0x1564 }
        L_0x0e8e:
            boolean r30 = r15.hasNext()     // Catch:{ all -> 0x1564 }
            if (r30 == 0) goto L_0x0ec8
            java.lang.Object r30 = r15.next()     // Catch:{ all -> 0x1564 }
            com.google.android.gms.internal.measurement.v2 r30 = (com.google.android.gms.internal.measurement.v2) r30     // Catch:{ all -> 0x1564 }
            boolean r31 = r30.r()     // Catch:{ all -> 0x1564 }
            if (r31 == 0) goto L_0x0e8e
            int r31 = r30.s()     // Catch:{ all -> 0x1564 }
            r45 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r31)     // Catch:{ all -> 0x1564 }
            boolean r31 = r30.t()     // Catch:{ all -> 0x1564 }
            if (r31 == 0) goto L_0x0ebd
            long r30 = r30.u()     // Catch:{ all -> 0x1564 }
            java.lang.Long r30 = java.lang.Long.valueOf(r30)     // Catch:{ all -> 0x1564 }
            r46 = r7
            r7 = r30
            goto L_0x0ec0
        L_0x0ebd:
            r46 = r7
            r7 = 0
        L_0x0ec0:
            r13.put(r1, r7)     // Catch:{ all -> 0x1564 }
            r1 = r45
            r7 = r46
            goto L_0x0e8e
        L_0x0ec8:
            r45 = r1
            r46 = r7
            n.b r1 = new n.b     // Catch:{ all -> 0x1bb3 }
            r1.<init>()     // Catch:{ all -> 0x1bb3 }
            if (r10 == 0) goto L_0x0f21
            int r7 = r10.z()     // Catch:{ all -> 0x1564 }
            if (r7 != 0) goto L_0x0eda
            goto L_0x0f21
        L_0x0eda:
            com.google.android.gms.internal.measurement.m6 r7 = r10.y()     // Catch:{ all -> 0x1564 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x1564 }
        L_0x0ee2:
            boolean r15 = r7.hasNext()     // Catch:{ all -> 0x1564 }
            if (r15 == 0) goto L_0x0f21
            java.lang.Object r15 = r7.next()     // Catch:{ all -> 0x1564 }
            com.google.android.gms.internal.measurement.o3 r15 = (com.google.android.gms.internal.measurement.o3) r15     // Catch:{ all -> 0x1564 }
            boolean r30 = r15.r()     // Catch:{ all -> 0x1564 }
            if (r30 == 0) goto L_0x0f1e
            int r30 = r15.u()     // Catch:{ all -> 0x1564 }
            if (r30 <= 0) goto L_0x0f1e
            int r30 = r15.s()     // Catch:{ all -> 0x1564 }
            r31 = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r30)     // Catch:{ all -> 0x1564 }
            int r30 = r15.u()     // Catch:{ all -> 0x1564 }
            r47 = r2
            r23 = -1
            int r2 = r30 + -1
            long r32 = r15.v(r2)     // Catch:{ all -> 0x1564 }
            java.lang.Long r2 = java.lang.Long.valueOf(r32)     // Catch:{ all -> 0x1564 }
            r1.put(r7, r2)     // Catch:{ all -> 0x1564 }
            r7 = r31
            r2 = r47
            goto L_0x0ee2
        L_0x0f1e:
            r23 = -1
            goto L_0x0ee2
        L_0x0f21:
            r47 = r2
            r23 = -1
            if (r10 == 0) goto L_0x0f7a
            r2 = 0
        L_0x0f28:
            int r7 = r10.s()     // Catch:{ all -> 0x1564 }
            int r7 = r7 * 64
            if (r2 >= r7) goto L_0x0f7a
            java.util.List r7 = r10.r()     // Catch:{ all -> 0x1564 }
            com.google.android.gms.internal.measurement.l6 r7 = (com.google.android.gms.internal.measurement.l6) r7     // Catch:{ all -> 0x1564 }
            boolean r7 = h5.b7.y(r2, r7)     // Catch:{ all -> 0x1564 }
            if (r7 == 0) goto L_0x0f68
            h5.g3 r7 = r6.e()     // Catch:{ all -> 0x1564 }
            h5.e3 r7 = r7.o()     // Catch:{ all -> 0x1564 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x1564 }
            r48 = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x1564 }
            r49 = r9
            java.lang.String r9 = "Filter already evaluated. audience ID, filter ID"
            r7.c(r15, r6, r9)     // Catch:{ all -> 0x1564 }
            r12.set(r2)     // Catch:{ all -> 0x1564 }
            java.util.List r6 = r10.t()     // Catch:{ all -> 0x1564 }
            com.google.android.gms.internal.measurement.l6 r6 = (com.google.android.gms.internal.measurement.l6) r6     // Catch:{ all -> 0x1564 }
            boolean r6 = h5.b7.y(r2, r6)     // Catch:{ all -> 0x1564 }
            if (r6 == 0) goto L_0x0f6c
            r11.set(r2)     // Catch:{ all -> 0x1564 }
            goto L_0x0f73
        L_0x0f68:
            r48 = r6
            r49 = r9
        L_0x0f6c:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x1564 }
            r13.remove(r6)     // Catch:{ all -> 0x1564 }
        L_0x0f73:
            int r2 = r2 + 1
            r6 = r48
            r9 = r49
            goto L_0x0f28
        L_0x0f7a:
            r48 = r6
            r49 = r9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x1564 }
            java.lang.Object r6 = r8.get(r2)     // Catch:{ all -> 0x1564 }
            r33 = r6
            com.google.android.gms.internal.measurement.m3 r33 = (com.google.android.gms.internal.measurement.m3) r33     // Catch:{ all -> 0x1564 }
            if (r42 == 0) goto L_0x0fe8
            if (r41 == 0) goto L_0x0fe8
            java.lang.Object r2 = r5.get(r2)     // Catch:{ all -> 0x1564 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x1564 }
            if (r2 == 0) goto L_0x0fe8
            java.lang.Long r6 = r3.f5662v     // Catch:{ all -> 0x1564 }
            if (r6 == 0) goto L_0x0fe8
            java.lang.Long r6 = r3.u     // Catch:{ all -> 0x1564 }
            if (r6 != 0) goto L_0x0f9f
            goto L_0x0fe8
        L_0x0f9f:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x1564 }
        L_0x0fa3:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x1564 }
            if (r6 == 0) goto L_0x0fe8
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x1564 }
            com.google.android.gms.internal.measurement.y1 r6 = (com.google.android.gms.internal.measurement.y1) r6     // Catch:{ all -> 0x1564 }
            int r7 = r6.s()     // Catch:{ all -> 0x1564 }
            java.lang.Long r9 = r3.f5662v     // Catch:{ all -> 0x1564 }
            long r9 = r9.longValue()     // Catch:{ all -> 0x1564 }
            long r9 = r9 / r24
            boolean r6 = r6.A()     // Catch:{ all -> 0x1564 }
            if (r6 == 0) goto L_0x0fc9
            java.lang.Long r6 = r3.u     // Catch:{ all -> 0x1564 }
            long r9 = r6.longValue()     // Catch:{ all -> 0x1564 }
            long r9 = r9 / r24
        L_0x0fc9:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x1564 }
            boolean r7 = r13.containsKey(r6)     // Catch:{ all -> 0x1564 }
            if (r7 == 0) goto L_0x0fda
            java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x1564 }
            r13.put(r6, r7)     // Catch:{ all -> 0x1564 }
        L_0x0fda:
            boolean r7 = r1.containsKey(r6)     // Catch:{ all -> 0x1564 }
            if (r7 == 0) goto L_0x0fa3
            java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x1564 }
            r1.put(r6, r7)     // Catch:{ all -> 0x1564 }
            goto L_0x0fa3
        L_0x0fe8:
            h5.l7 r2 = new h5.l7     // Catch:{ all -> 0x1564 }
            java.lang.String r6 = r3.f5659r     // Catch:{ all -> 0x1564 }
            r30 = r2
            r31 = r3
            r32 = r6
            r34 = r11
            r35 = r12
            r36 = r13
            r37 = r1
            r30.<init>(r31, r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x1564 }
            n.b r1 = r3.f5661t     // Catch:{ all -> 0x1564 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x1564 }
            r1.put(r4, r2)     // Catch:{ all -> 0x1564 }
            r1 = r45
            r7 = r46
            r2 = r47
            r6 = r48
            r9 = r49
            goto L_0x0e54
        L_0x1012:
            boolean r1 = r38.isEmpty()     // Catch:{ all -> 0x1bb3 }
            java.lang.String r2 = "Skipping failed audience ID"
            if (r1 == 0) goto L_0x1020
        L_0x101a:
            r13 = r44
            r44 = r2
            goto L_0x12ec
        L_0x1020:
            h5.m7 r1 = new h5.m7     // Catch:{ all -> 0x1bb3 }
            r1.<init>(r3)     // Catch:{ all -> 0x1bb3 }
            n.b r4 = new n.b     // Catch:{ all -> 0x1bb3 }
            r4.<init>()     // Catch:{ all -> 0x1bb3 }
            java.util.Iterator r5 = r38.iterator()     // Catch:{ all -> 0x1bb3 }
        L_0x102e:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x1bb3 }
            if (r6 == 0) goto L_0x101a
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x1bb3 }
            com.google.android.gms.internal.measurement.x2 r6 = (com.google.android.gms.internal.measurement.x2) r6     // Catch:{ all -> 0x1bb3 }
            java.lang.String r7 = r3.f5659r     // Catch:{ all -> 0x1bb3 }
            com.google.android.gms.internal.measurement.x2 r7 = r1.a(r6, r7)     // Catch:{ all -> 0x1bb3 }
            if (r7 == 0) goto L_0x102e
            h5.i r8 = r14.G()     // Catch:{ all -> 0x1bb3 }
            java.lang.String r9 = r3.f5659r     // Catch:{ all -> 0x1bb3 }
            java.lang.String r10 = r7.u()     // Catch:{ all -> 0x1bb3 }
            java.lang.String r11 = r6.u()     // Catch:{ all -> 0x1bb3 }
            h5.m r11 = r8.z(r9, r11)     // Catch:{ all -> 0x1bb3 }
            if (r11 != 0) goto L_0x1099
            h5.i4 r8 = r8.f5649o     // Catch:{ all -> 0x1564 }
            h5.g3 r11 = r8.e()     // Catch:{ all -> 0x1564 }
            h5.e3 r11 = r11.l()     // Catch:{ all -> 0x1564 }
            h5.f3 r12 = h5.g3.p(r9)     // Catch:{ all -> 0x1564 }
            h5.b3 r8 = r8.p()     // Catch:{ all -> 0x1564 }
            java.lang.String r8 = r8.l(r10)     // Catch:{ all -> 0x1564 }
            java.lang.String r10 = "Event aggregate wasn't created during raw event logging. appId, event"
            r11.c(r12, r8, r10)     // Catch:{ all -> 0x1564 }
            h5.m r8 = new h5.m     // Catch:{ all -> 0x1564 }
            java.lang.String r52 = r6.u()     // Catch:{ all -> 0x1564 }
            r53 = 1
            r55 = 1
            r57 = 1
            long r59 = r6.w()     // Catch:{ all -> 0x1564 }
            r61 = 0
            r63 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            r50 = r8
            r51 = r9
            r50.<init>(r51, r52, r53, r55, r57, r59, r61, r63, r64, r65, r66)     // Catch:{ all -> 0x1564 }
            r24 = r1
            r25 = r2
            r23 = r5
            goto L_0x10d6
        L_0x1099:
            h5.m r8 = new h5.m     // Catch:{ all -> 0x1564 }
            java.lang.String r6 = r11.f5541a     // Catch:{ all -> 0x1564 }
            java.lang.String r9 = r11.f5542b     // Catch:{ all -> 0x1564 }
            long r12 = r11.f5543c     // Catch:{ all -> 0x1564 }
            r24 = 1
            long r70 = r12 + r24
            long r12 = r11.d     // Catch:{ all -> 0x1564 }
            long r72 = r12 + r24
            long r12 = r11.f5544e     // Catch:{ all -> 0x1564 }
            long r74 = r12 + r24
            long r12 = r11.f5545f     // Catch:{ all -> 0x1564 }
            r15 = r1
            r10 = r2
            long r1 = r11.f5546g     // Catch:{ all -> 0x1564 }
            r23 = r5
            java.lang.Long r5 = r11.f5547h     // Catch:{ all -> 0x1564 }
            r24 = r15
            java.lang.Long r15 = r11.f5548i     // Catch:{ all -> 0x1564 }
            r25 = r10
            java.lang.Long r10 = r11.f5549j     // Catch:{ all -> 0x1564 }
            java.lang.Boolean r11 = r11.f5550k     // Catch:{ all -> 0x1564 }
            r67 = r8
            r68 = r6
            r69 = r9
            r76 = r12
            r78 = r1
            r80 = r5
            r81 = r15
            r82 = r10
            r83 = r11
            r67.<init>(r68, r69, r70, r72, r74, r76, r78, r80, r81, r82, r83)     // Catch:{ all -> 0x1564 }
        L_0x10d6:
            h5.i r1 = r14.G()     // Catch:{ all -> 0x1564 }
            r1.A(r8)     // Catch:{ all -> 0x1564 }
            long r1 = r8.f5543c     // Catch:{ all -> 0x1564 }
            java.lang.String r5 = r7.u()     // Catch:{ all -> 0x1564 }
            java.lang.Object r6 = r4.get(r5)     // Catch:{ all -> 0x1564 }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ all -> 0x1564 }
            if (r6 != 0) goto L_0x1203
            h5.i r6 = r14.G()     // Catch:{ all -> 0x1564 }
            h5.i4 r9 = r6.f5649o     // Catch:{ all -> 0x1564 }
            java.lang.String r10 = r3.f5659r     // Catch:{ all -> 0x1564 }
            r6.h()     // Catch:{ all -> 0x1564 }
            r6.g()     // Catch:{ all -> 0x1564 }
            n4.m.e(r10)     // Catch:{ all -> 0x1564 }
            n4.m.e(r5)     // Catch:{ all -> 0x1564 }
            n.b r11 = new n.b     // Catch:{ all -> 0x1564 }
            r11.<init>()     // Catch:{ all -> 0x1564 }
            android.database.sqlite.SQLiteDatabase r30 = r6.y()     // Catch:{ all -> 0x1564 }
            r12 = r40
            r13 = r49
            java.lang.String[] r32 = new java.lang.String[]{r13, r12}     // Catch:{ SQLiteException -> 0x11d2, all -> 0x11ce }
            r6 = 2
            java.lang.String[] r15 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x11c4, all -> 0x11ce }
            r6 = 0
            r15[r6] = r10     // Catch:{ SQLiteException -> 0x11c4, all -> 0x11ce }
            r6 = 1
            r15[r6] = r5     // Catch:{ SQLiteException -> 0x11c4, all -> 0x11ce }
            java.lang.String r31 = "event_filters"
            java.lang.String r33 = "app_id=? AND event_name=?"
            r35 = 0
            r36 = 0
            r37 = 0
            r34 = r15
            android.database.Cursor r6 = r30.query(r31, r32, r33, r34, r35, r36, r37)     // Catch:{ SQLiteException -> 0x11c4, all -> 0x11ce }
            boolean r15 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x11be }
            if (r15 == 0) goto L_0x11a8
        L_0x112f:
            r40 = r12
            r15 = 1
            byte[] r12 = r6.getBlob(r15)     // Catch:{ SQLiteException -> 0x11a1 }
            com.google.android.gms.internal.measurement.x1 r15 = com.google.android.gms.internal.measurement.y1.D()     // Catch:{ IOException -> 0x1178 }
            com.google.android.gms.internal.measurement.b6 r12 = h5.b7.E(r15, r12)     // Catch:{ IOException -> 0x1178 }
            com.google.android.gms.internal.measurement.x1 r12 = (com.google.android.gms.internal.measurement.x1) r12     // Catch:{ IOException -> 0x1178 }
            com.google.android.gms.internal.measurement.f6 r12 = r12.j()     // Catch:{ IOException -> 0x1178 }
            com.google.android.gms.internal.measurement.y1 r12 = (com.google.android.gms.internal.measurement.y1) r12     // Catch:{ IOException -> 0x1178 }
            r15 = 0
            int r30 = r6.getInt(r15)     // Catch:{ SQLiteException -> 0x1170 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r30)     // Catch:{ SQLiteException -> 0x1170 }
            java.lang.Object r30 = r11.get(r15)     // Catch:{ SQLiteException -> 0x1170 }
            java.util.List r30 = (java.util.List) r30     // Catch:{ SQLiteException -> 0x1170 }
            if (r30 != 0) goto L_0x1164
            r49 = r13
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x1162 }
            r13.<init>()     // Catch:{ SQLiteException -> 0x1162 }
            r11.put(r15, r13)     // Catch:{ SQLiteException -> 0x1162 }
            goto L_0x1168
        L_0x1162:
            r0 = move-exception
            goto L_0x1173
        L_0x1164:
            r49 = r13
            r13 = r30
        L_0x1168:
            r13.add(r12)     // Catch:{ SQLiteException -> 0x1162 }
            r30 = r11
            r11 = r47
            goto L_0x118f
        L_0x1170:
            r0 = move-exception
            r49 = r13
        L_0x1173:
            r12 = r0
            r11 = r47
            goto L_0x11db
        L_0x1178:
            r0 = move-exception
            r49 = r13
            r12 = r0
            h5.g3 r13 = r9.e()     // Catch:{ SQLiteException -> 0x119f }
            h5.e3 r13 = r13.k()     // Catch:{ SQLiteException -> 0x119f }
            h5.f3 r15 = h5.g3.p(r10)     // Catch:{ SQLiteException -> 0x119f }
            r30 = r11
            r11 = r47
            r13.c(r15, r12, r11)     // Catch:{ SQLiteException -> 0x11bc }
        L_0x118f:
            boolean r12 = r6.moveToNext()     // Catch:{ SQLiteException -> 0x11bc }
            if (r12 != 0) goto L_0x1196
            goto L_0x11b4
        L_0x1196:
            r47 = r11
            r11 = r30
            r12 = r40
            r13 = r49
            goto L_0x112f
        L_0x119f:
            r0 = move-exception
            goto L_0x11a4
        L_0x11a1:
            r0 = move-exception
            r49 = r13
        L_0x11a4:
            r11 = r47
        L_0x11a6:
            r12 = r0
            goto L_0x11db
        L_0x11a8:
            r40 = r12
            r49 = r13
            r11 = r47
            java.util.Map r9 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x11bc }
            r30 = r9
        L_0x11b4:
            r6.close()     // Catch:{ all -> 0x1564 }
            r6 = r30
            r13 = r44
            goto L_0x11f6
        L_0x11bc:
            r0 = move-exception
            goto L_0x11a6
        L_0x11be:
            r0 = move-exception
            r40 = r12
            r49 = r13
            goto L_0x11a4
        L_0x11c4:
            r0 = move-exception
            r40 = r12
            r49 = r13
            r11 = r47
            r6 = r0
            r12 = r6
            goto L_0x11da
        L_0x11ce:
            r0 = move-exception
            r1 = r0
            r15 = 0
            goto L_0x11fd
        L_0x11d2:
            r0 = move-exception
            r40 = r12
            r49 = r13
            r11 = r47
            r12 = r0
        L_0x11da:
            r6 = 0
        L_0x11db:
            h5.g3 r9 = r9.e()     // Catch:{ all -> 0x11fa }
            h5.e3 r9 = r9.k()     // Catch:{ all -> 0x11fa }
            h5.f3 r10 = h5.g3.p(r10)     // Catch:{ all -> 0x11fa }
            r13 = r44
            r9.c(r10, r12, r13)     // Catch:{ all -> 0x11fa }
            java.util.Map r9 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x11fa }
            if (r6 == 0) goto L_0x11f5
            r6.close()     // Catch:{ all -> 0x1564 }
        L_0x11f5:
            r6 = r9
        L_0x11f6:
            r4.put(r5, r6)     // Catch:{ all -> 0x1564 }
            goto L_0x1207
        L_0x11fa:
            r0 = move-exception
            r1 = r0
            r15 = r6
        L_0x11fd:
            if (r15 == 0) goto L_0x1202
            r15.close()     // Catch:{ all -> 0x1564 }
        L_0x1202:
            throw r1     // Catch:{ all -> 0x1564 }
        L_0x1203:
            r13 = r44
            r11 = r47
        L_0x1207:
            java.util.Set r5 = r6.keySet()     // Catch:{ all -> 0x1564 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x1564 }
        L_0x120f:
            boolean r9 = r5.hasNext()     // Catch:{ all -> 0x1564 }
            if (r9 == 0) goto L_0x12de
            java.lang.Object r9 = r5.next()     // Catch:{ all -> 0x1564 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x1564 }
            int r9 = r9.intValue()     // Catch:{ all -> 0x1564 }
            java.util.HashSet r10 = r3.f5660s     // Catch:{ all -> 0x1564 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x1564 }
            boolean r10 = r10.contains(r12)     // Catch:{ all -> 0x1564 }
            if (r10 == 0) goto L_0x123b
            h5.g3 r9 = r48.e()     // Catch:{ all -> 0x1564 }
            h5.e3 r9 = r9.o()     // Catch:{ all -> 0x1564 }
            r10 = r25
            r9.b(r12, r10)     // Catch:{ all -> 0x1564 }
            r25 = r10
            goto L_0x120f
        L_0x123b:
            r10 = r25
            java.lang.Object r12 = r6.get(r12)     // Catch:{ all -> 0x1564 }
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x1564 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x1564 }
            r15 = 1
        L_0x1248:
            boolean r25 = r12.hasNext()     // Catch:{ all -> 0x1564 }
            if (r25 == 0) goto L_0x12bd
            java.lang.Object r15 = r12.next()     // Catch:{ all -> 0x1564 }
            com.google.android.gms.internal.measurement.y1 r15 = (com.google.android.gms.internal.measurement.y1) r15     // Catch:{ all -> 0x1564 }
            r25 = r4
            h5.n7 r4 = new h5.n7     // Catch:{ all -> 0x1564 }
            r38 = r5
            java.lang.String r5 = r3.f5659r     // Catch:{ all -> 0x1564 }
            r4.<init>(r3, r5, r9, r15)     // Catch:{ all -> 0x1564 }
            java.lang.Long r5 = r3.u     // Catch:{ all -> 0x1564 }
            r41 = r6
            java.lang.Long r6 = r3.f5662v     // Catch:{ all -> 0x1564 }
            int r15 = r15.s()     // Catch:{ all -> 0x1564 }
            r47 = r11
            n.b r11 = r3.f5661t     // Catch:{ all -> 0x1564 }
            r42 = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x1564 }
            r44 = r10
            r10 = 0
            java.lang.Object r11 = r11.getOrDefault(r12, r10)     // Catch:{ all -> 0x1564 }
            h5.l7 r11 = (h5.l7) r11     // Catch:{ all -> 0x1564 }
            if (r11 != 0) goto L_0x1281
            r37 = 0
            goto L_0x1289
        L_0x1281:
            java.util.BitSet r10 = r11.d     // Catch:{ all -> 0x1564 }
            boolean r10 = r10.get(r15)     // Catch:{ all -> 0x1564 }
            r37 = r10
        L_0x1289:
            r30 = r4
            r31 = r5
            r32 = r6
            r33 = r7
            r34 = r1
            r36 = r8
            boolean r15 = r30.g(r31, r32, r33, r34, r36, r37)     // Catch:{ all -> 0x1564 }
            if (r15 == 0) goto L_0x12b3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x1564 }
            h5.l7 r5 = r3.k(r5)     // Catch:{ all -> 0x1564 }
            r5.a(r4)     // Catch:{ all -> 0x1564 }
            r4 = r25
            r5 = r38
            r6 = r41
            r12 = r42
            r10 = r44
            r11 = r47
            goto L_0x1248
        L_0x12b3:
            java.util.HashSet r4 = r3.f5660s     // Catch:{ all -> 0x1564 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x1564 }
            r4.add(r5)     // Catch:{ all -> 0x1564 }
            goto L_0x12c7
        L_0x12bd:
            r25 = r4
            r38 = r5
            r41 = r6
            r44 = r10
            r47 = r11
        L_0x12c7:
            if (r15 != 0) goto L_0x12d2
            java.util.HashSet r4 = r3.f5660s     // Catch:{ all -> 0x1564 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x1564 }
            r4.add(r5)     // Catch:{ all -> 0x1564 }
        L_0x12d2:
            r4 = r25
            r5 = r38
            r6 = r41
            r25 = r44
            r11 = r47
            goto L_0x120f
        L_0x12de:
            r44 = r25
            r47 = r11
            r5 = r23
            r1 = r24
            r2 = r44
            r44 = r13
            goto L_0x102e
        L_0x12ec:
            boolean r1 = r28.isEmpty()     // Catch:{ all -> 0x1bb3 }
            if (r1 == 0) goto L_0x12f6
        L_0x12f2:
            r11 = r49
            goto L_0x1567
        L_0x12f6:
            n.b r1 = new n.b     // Catch:{ all -> 0x1bb3 }
            r1.<init>()     // Catch:{ all -> 0x1bb3 }
            java.util.Iterator r2 = r28.iterator()     // Catch:{ all -> 0x1bb3 }
        L_0x12ff:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x1bb3 }
            if (r4 == 0) goto L_0x12f2
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x1564 }
            com.google.android.gms.internal.measurement.q3 r4 = (com.google.android.gms.internal.measurement.q3) r4     // Catch:{ all -> 0x1564 }
            java.lang.String r5 = r4.t()     // Catch:{ all -> 0x1564 }
            java.lang.Object r6 = r1.get(r5)     // Catch:{ all -> 0x1564 }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ all -> 0x1564 }
            if (r6 != 0) goto L_0x13fb
            h5.i r6 = r14.G()     // Catch:{ all -> 0x1564 }
            h5.i4 r7 = r6.f5649o     // Catch:{ all -> 0x1564 }
            java.lang.String r8 = r3.f5659r     // Catch:{ all -> 0x1564 }
            r6.h()     // Catch:{ all -> 0x1564 }
            r6.g()     // Catch:{ all -> 0x1564 }
            n4.m.e(r8)     // Catch:{ all -> 0x1564 }
            n4.m.e(r5)     // Catch:{ all -> 0x1564 }
            n.b r9 = new n.b     // Catch:{ all -> 0x1564 }
            r9.<init>()     // Catch:{ all -> 0x1564 }
            android.database.sqlite.SQLiteDatabase r30 = r6.y()     // Catch:{ all -> 0x1564 }
            r10 = r40
            r11 = r49
            java.lang.String[] r32 = new java.lang.String[]{r11, r10}     // Catch:{ SQLiteException -> 0x13d0, all -> 0x13cc }
            r6 = 2
            java.lang.String[] r12 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x13d0, all -> 0x13cc }
            r6 = 0
            r12[r6] = r8     // Catch:{ SQLiteException -> 0x13d0, all -> 0x13cc }
            r6 = 1
            r12[r6] = r5     // Catch:{ SQLiteException -> 0x13d0, all -> 0x13cc }
            java.lang.String r31 = "property_filters"
            java.lang.String r33 = "app_id=? AND property_name=?"
            r35 = 0
            r36 = 0
            r37 = 0
            r34 = r12
            android.database.Cursor r6 = r30.query(r31, r32, r33, r34, r35, r36, r37)     // Catch:{ SQLiteException -> 0x13d0, all -> 0x13cc }
            boolean r12 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x13c8 }
            if (r12 == 0) goto L_0x13be
        L_0x135b:
            r12 = 1
            byte[] r15 = r6.getBlob(r12)     // Catch:{ SQLiteException -> 0x13c8 }
            com.google.android.gms.internal.measurement.f2 r12 = com.google.android.gms.internal.measurement.g2.z()     // Catch:{ IOException -> 0x1396 }
            com.google.android.gms.internal.measurement.b6 r12 = h5.b7.E(r12, r15)     // Catch:{ IOException -> 0x1396 }
            com.google.android.gms.internal.measurement.f2 r12 = (com.google.android.gms.internal.measurement.f2) r12     // Catch:{ IOException -> 0x1396 }
            com.google.android.gms.internal.measurement.f6 r12 = r12.j()     // Catch:{ IOException -> 0x1396 }
            com.google.android.gms.internal.measurement.g2 r12 = (com.google.android.gms.internal.measurement.g2) r12     // Catch:{ IOException -> 0x1396 }
            r15 = 0
            int r23 = r6.getInt(r15)     // Catch:{ SQLiteException -> 0x13c8 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r23)     // Catch:{ SQLiteException -> 0x13c8 }
            java.lang.Object r23 = r9.get(r15)     // Catch:{ SQLiteException -> 0x13c8 }
            java.util.List r23 = (java.util.List) r23     // Catch:{ SQLiteException -> 0x13c8 }
            if (r23 != 0) goto L_0x138c
            r24 = r2
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x13c5 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x13c5 }
            r9.put(r15, r2)     // Catch:{ SQLiteException -> 0x13c5 }
            goto L_0x1390
        L_0x138c:
            r24 = r2
            r2 = r23
        L_0x1390:
            r2.add(r12)     // Catch:{ SQLiteException -> 0x13c5 }
            r23 = r9
            goto L_0x13ad
        L_0x1396:
            r0 = move-exception
            r24 = r2
            r2 = r0
            h5.g3 r12 = r7.e()     // Catch:{ SQLiteException -> 0x13c5 }
            h5.e3 r12 = r12.k()     // Catch:{ SQLiteException -> 0x13c5 }
            java.lang.String r15 = "Failed to merge filter"
            r23 = r9
            h5.f3 r9 = h5.g3.p(r8)     // Catch:{ SQLiteException -> 0x13c5 }
            r12.c(r9, r2, r15)     // Catch:{ SQLiteException -> 0x13c5 }
        L_0x13ad:
            boolean r2 = r6.moveToNext()     // Catch:{ SQLiteException -> 0x13c5 }
            if (r2 != 0) goto L_0x13b9
            r6.close()     // Catch:{ all -> 0x1564 }
            r6 = r23
            goto L_0x13ee
        L_0x13b9:
            r9 = r23
            r2 = r24
            goto L_0x135b
        L_0x13be:
            r24 = r2
            java.util.Map r2 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x13c5 }
            goto L_0x13ea
        L_0x13c5:
            r0 = move-exception
        L_0x13c6:
            r2 = r0
            goto L_0x13d5
        L_0x13c8:
            r0 = move-exception
            r24 = r2
            goto L_0x13c6
        L_0x13cc:
            r0 = move-exception
            r1 = r0
            r15 = 0
            goto L_0x13f5
        L_0x13d0:
            r0 = move-exception
            r24 = r2
            r2 = r0
            r6 = 0
        L_0x13d5:
            h5.g3 r7 = r7.e()     // Catch:{ all -> 0x13f2 }
            h5.e3 r7 = r7.k()     // Catch:{ all -> 0x13f2 }
            h5.f3 r8 = h5.g3.p(r8)     // Catch:{ all -> 0x13f2 }
            r7.c(r8, r2, r13)     // Catch:{ all -> 0x13f2 }
            java.util.Map r2 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x13f2 }
            if (r6 == 0) goto L_0x13ed
        L_0x13ea:
            r6.close()     // Catch:{ all -> 0x1564 }
        L_0x13ed:
            r6 = r2
        L_0x13ee:
            r1.put(r5, r6)     // Catch:{ all -> 0x1564 }
            goto L_0x1401
        L_0x13f2:
            r0 = move-exception
            r1 = r0
            r15 = r6
        L_0x13f5:
            if (r15 == 0) goto L_0x13fa
            r15.close()     // Catch:{ all -> 0x1564 }
        L_0x13fa:
            throw r1     // Catch:{ all -> 0x1564 }
        L_0x13fb:
            r24 = r2
            r10 = r40
            r11 = r49
        L_0x1401:
            java.util.Set r2 = r6.keySet()     // Catch:{ all -> 0x1564 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x1564 }
        L_0x1409:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x1564 }
            if (r5 == 0) goto L_0x1558
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x1564 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x1564 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x1564 }
            java.util.HashSet r7 = r3.f5660s     // Catch:{ all -> 0x1564 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x1564 }
            boolean r7 = r7.contains(r8)     // Catch:{ all -> 0x1564 }
            if (r7 == 0) goto L_0x1438
            h5.g3 r2 = r48.e()     // Catch:{ all -> 0x1564 }
            h5.e3 r2 = r2.o()     // Catch:{ all -> 0x1564 }
            r7 = r44
            r2.b(r8, r7)     // Catch:{ all -> 0x1564 }
            r23 = r1
            r44 = r7
            goto L_0x155a
        L_0x1438:
            r7 = r44
            java.lang.Object r8 = r6.get(r8)     // Catch:{ all -> 0x1564 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x1564 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x1564 }
            r9 = 1
        L_0x1445:
            boolean r12 = r8.hasNext()     // Catch:{ all -> 0x1564 }
            if (r12 == 0) goto L_0x153d
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x1564 }
            com.google.android.gms.internal.measurement.g2 r9 = (com.google.android.gms.internal.measurement.g2) r9     // Catch:{ all -> 0x1564 }
            h5.g3 r12 = r48.e()     // Catch:{ all -> 0x1564 }
            java.lang.String r12 = r12.r()     // Catch:{ all -> 0x1564 }
            r15 = 2
            boolean r12 = android.util.Log.isLoggable(r12, r15)     // Catch:{ all -> 0x1564 }
            if (r12 == 0) goto L_0x14b1
            h5.g3 r12 = r48.e()     // Catch:{ all -> 0x1564 }
            h5.e3 r12 = r12.o()     // Catch:{ all -> 0x1564 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x1564 }
            boolean r23 = r9.r()     // Catch:{ all -> 0x1564 }
            if (r23 == 0) goto L_0x1483
            int r23 = r9.s()     // Catch:{ all -> 0x1564 }
            java.lang.Integer r23 = java.lang.Integer.valueOf(r23)     // Catch:{ all -> 0x1564 }
            r25 = r2
            r84 = r23
            r23 = r1
            r1 = r84
            goto L_0x1488
        L_0x1483:
            r23 = r1
            r25 = r2
            r1 = 0
        L_0x1488:
            h5.b3 r2 = r48.p()     // Catch:{ all -> 0x1564 }
            r28 = r6
            java.lang.String r6 = r9.t()     // Catch:{ all -> 0x1564 }
            java.lang.String r2 = r2.n(r6)     // Catch:{ all -> 0x1564 }
            java.lang.String r6 = "Evaluating filter. audience, filter, property"
            r12.d(r6, r15, r1, r2)     // Catch:{ all -> 0x1564 }
            h5.g3 r1 = r48.e()     // Catch:{ all -> 0x1564 }
            h5.e3 r1 = r1.o()     // Catch:{ all -> 0x1564 }
            h5.b7 r2 = r14.I()     // Catch:{ all -> 0x1564 }
            java.lang.String r2 = r2.v(r9)     // Catch:{ all -> 0x1564 }
            java.lang.String r6 = "Filter definition"
            r1.b(r2, r6)     // Catch:{ all -> 0x1564 }
            goto L_0x14b7
        L_0x14b1:
            r23 = r1
            r25 = r2
            r28 = r6
        L_0x14b7:
            boolean r1 = r9.r()     // Catch:{ all -> 0x1564 }
            if (r1 == 0) goto L_0x1513
            int r1 = r9.s()     // Catch:{ all -> 0x1564 }
            r2 = 256(0x100, float:3.59E-43)
            if (r1 <= r2) goto L_0x14c6
            goto L_0x1513
        L_0x14c6:
            h5.p7 r1 = new h5.p7     // Catch:{ all -> 0x1564 }
            java.lang.String r2 = r3.f5659r     // Catch:{ all -> 0x1564 }
            r1.<init>(r3, r2, r5, r9)     // Catch:{ all -> 0x1564 }
            java.lang.Long r2 = r3.u     // Catch:{ all -> 0x1564 }
            java.lang.Long r6 = r3.f5662v     // Catch:{ all -> 0x1564 }
            int r9 = r9.s()     // Catch:{ all -> 0x1564 }
            n.b r12 = r3.f5661t     // Catch:{ all -> 0x1564 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x1564 }
            r44 = r7
            r7 = 0
            java.lang.Object r12 = r12.getOrDefault(r15, r7)     // Catch:{ all -> 0x1564 }
            h5.l7 r12 = (h5.l7) r12     // Catch:{ all -> 0x1564 }
            if (r12 != 0) goto L_0x14e8
            r7 = 0
            goto L_0x14ee
        L_0x14e8:
            java.util.BitSet r7 = r12.d     // Catch:{ all -> 0x1564 }
            boolean r7 = r7.get(r9)     // Catch:{ all -> 0x1564 }
        L_0x14ee:
            boolean r9 = r1.g(r2, r6, r4, r7)     // Catch:{ all -> 0x1564 }
            if (r9 == 0) goto L_0x1509
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x1564 }
            h5.l7 r2 = r3.k(r2)     // Catch:{ all -> 0x1564 }
            r2.a(r1)     // Catch:{ all -> 0x1564 }
            r1 = r23
            r2 = r25
            r6 = r28
            r7 = r44
            goto L_0x1445
        L_0x1509:
            java.util.HashSet r1 = r3.f5660s     // Catch:{ all -> 0x1564 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x1564 }
            r1.add(r2)     // Catch:{ all -> 0x1564 }
            goto L_0x1545
        L_0x1513:
            r44 = r7
            h5.g3 r1 = r48.e()     // Catch:{ all -> 0x1564 }
            h5.e3 r1 = r1.l()     // Catch:{ all -> 0x1564 }
            java.lang.String r2 = r3.f5659r     // Catch:{ all -> 0x1564 }
            h5.f3 r2 = h5.g3.p(r2)     // Catch:{ all -> 0x1564 }
            boolean r6 = r9.r()     // Catch:{ all -> 0x1564 }
            if (r6 == 0) goto L_0x1532
            int r6 = r9.s()     // Catch:{ all -> 0x1564 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x1564 }
            goto L_0x1533
        L_0x1532:
            r6 = 0
        L_0x1533:
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x1564 }
            java.lang.String r7 = "Invalid property filter ID. appId, id"
            r1.c(r2, r6, r7)     // Catch:{ all -> 0x1564 }
            goto L_0x1547
        L_0x153d:
            r23 = r1
            r25 = r2
            r28 = r6
            r44 = r7
        L_0x1545:
            if (r9 != 0) goto L_0x1550
        L_0x1547:
            java.util.HashSet r1 = r3.f5660s     // Catch:{ all -> 0x1564 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x1564 }
            r1.add(r2)     // Catch:{ all -> 0x1564 }
        L_0x1550:
            r1 = r23
            r2 = r25
            r6 = r28
            goto L_0x1409
        L_0x1558:
            r23 = r1
        L_0x155a:
            r40 = r10
            r49 = r11
            r1 = r23
            r2 = r24
            goto L_0x12ff
        L_0x1564:
            r0 = move-exception
            goto L_0x1620
        L_0x1567:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x1bb3 }
            r1.<init>()     // Catch:{ all -> 0x1bb3 }
            n.b r2 = r3.f5661t     // Catch:{ all -> 0x1bb3 }
            java.util.Set r2 = r2.keySet()     // Catch:{ all -> 0x1bb3 }
            java.util.HashSet r4 = r3.f5660s     // Catch:{ all -> 0x1bb3 }
            n.h$c r2 = (n.h.c) r2     // Catch:{ all -> 0x1bb3 }
            r2.removeAll(r4)     // Catch:{ all -> 0x1bb3 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x1bb3 }
        L_0x157d:
            r4 = r2
            n.h$a r4 = (n.h.a) r4     // Catch:{ all -> 0x1bb3 }
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x1bb3 }
            r6 = -1
            if (r5 == 0) goto L_0x1613
            java.lang.Object r4 = r4.next()     // Catch:{ all -> 0x1564 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x1564 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x1564 }
            n.b r5 = r3.f5661t     // Catch:{ all -> 0x1564 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x1564 }
            java.lang.Object r5 = r5.get(r8)     // Catch:{ all -> 0x1564 }
            h5.l7 r5 = (h5.l7) r5     // Catch:{ all -> 0x1564 }
            n4.m.h(r5)     // Catch:{ all -> 0x1564 }
            com.google.android.gms.internal.measurement.t2 r4 = r5.b(r4)     // Catch:{ all -> 0x1564 }
            r1.add(r4)     // Catch:{ all -> 0x1564 }
            h5.i r5 = r14.G()     // Catch:{ all -> 0x1564 }
            h5.i4 r9 = r5.f5649o     // Catch:{ all -> 0x1564 }
            java.lang.String r10 = r3.f5659r     // Catch:{ all -> 0x1564 }
            com.google.android.gms.internal.measurement.m3 r4 = r4.t()     // Catch:{ all -> 0x1564 }
            r5.h()     // Catch:{ all -> 0x1564 }
            r5.g()     // Catch:{ all -> 0x1564 }
            n4.m.e(r10)     // Catch:{ all -> 0x1564 }
            n4.m.h(r4)     // Catch:{ all -> 0x1564 }
            byte[] r4 = r4.a()     // Catch:{ all -> 0x1564 }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x1564 }
            r12.<init>()     // Catch:{ all -> 0x1564 }
            java.lang.String r13 = "app_id"
            r12.put(r13, r10)     // Catch:{ all -> 0x1564 }
            r12.put(r11, r8)     // Catch:{ all -> 0x1564 }
            r8 = r43
            r12.put(r8, r4)     // Catch:{ all -> 0x1564 }
            android.database.sqlite.SQLiteDatabase r4 = r5.y()     // Catch:{ SQLiteException -> 0x15fb }
            java.lang.String r5 = "audience_filter_values"
            r13 = 5
            r15 = 0
            long r4 = r4.insertWithOnConflict(r5, r15, r12, r13)     // Catch:{ SQLiteException -> 0x15f8 }
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x160f
            h5.g3 r4 = r9.e()     // Catch:{ SQLiteException -> 0x15f8 }
            h5.e3 r4 = r4.k()     // Catch:{ SQLiteException -> 0x15f8 }
            java.lang.String r5 = "Failed to insert filter results (got -1). appId"
            h5.f3 r6 = h5.g3.p(r10)     // Catch:{ SQLiteException -> 0x15f8 }
            r4.b(r6, r5)     // Catch:{ SQLiteException -> 0x15f8 }
            goto L_0x160f
        L_0x15f8:
            r0 = move-exception
        L_0x15f9:
            r4 = r0
            goto L_0x15fe
        L_0x15fb:
            r0 = move-exception
            r13 = 5
            goto L_0x15f9
        L_0x15fe:
            h5.g3 r5 = r9.e()     // Catch:{ all -> 0x1564 }
            h5.e3 r5 = r5.k()     // Catch:{ all -> 0x1564 }
            h5.f3 r6 = h5.g3.p(r10)     // Catch:{ all -> 0x1564 }
            java.lang.String r7 = "Error storing filter results. appId"
            r5.c(r6, r4, r7)     // Catch:{ all -> 0x1564 }
        L_0x160f:
            r43 = r8
            goto L_0x157d
        L_0x1613:
            r9 = r27
            boolean r2 = r9.f2636q     // Catch:{ all -> 0x1bb3 }
            if (r2 == 0) goto L_0x1628
            r9.m()     // Catch:{ all -> 0x1622 }
            r2 = 0
            r9.f2636q = r2     // Catch:{ all -> 0x1622 }
            goto L_0x1628
        L_0x1620:
            r1 = r0
            goto L_0x1624
        L_0x1622:
            r0 = move-exception
            goto L_0x1620
        L_0x1624:
            r4 = r85
            goto L_0x1be2
        L_0x1628:
            MessageType r2 = r9.f2635p     // Catch:{ all -> 0x1bb3 }
            com.google.android.gms.internal.measurement.f3 r2 = (com.google.android.gms.internal.measurement.f3) r2     // Catch:{ all -> 0x1bb3 }
            com.google.android.gms.internal.measurement.f3.q0(r2, r1)     // Catch:{ all -> 0x1bb3 }
            h5.e r1 = r85.F()     // Catch:{ all -> 0x1bb3 }
            r2 = r22
            com.google.android.gms.internal.measurement.f3 r3 = r2.f5826a     // Catch:{ all -> 0x1bb3 }
            java.lang.String r3 = r3.r()     // Catch:{ all -> 0x1bb3 }
            boolean r1 = r1.r(r3)     // Catch:{ all -> 0x1bb3 }
            if (r1 == 0) goto L_0x1987
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x1bb3 }
            r1.<init>()     // Catch:{ all -> 0x1bb3 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x1bb3 }
            r3.<init>()     // Catch:{ all -> 0x1bb3 }
            h5.g7 r4 = r85.J()     // Catch:{ all -> 0x1bb3 }
            java.security.SecureRandom r4 = r4.X()     // Catch:{ all -> 0x1bb3 }
            r5 = 0
        L_0x1654:
            MessageType r8 = r9.f2635p     // Catch:{ all -> 0x1bb3 }
            com.google.android.gms.internal.measurement.f3 r8 = (com.google.android.gms.internal.measurement.f3) r8     // Catch:{ all -> 0x1bb3 }
            int r8 = r8.i1()     // Catch:{ all -> 0x1bb3 }
            if (r5 >= r8) goto L_0x193d
            MessageType r8 = r9.f2635p     // Catch:{ all -> 0x1939 }
            com.google.android.gms.internal.measurement.f3 r8 = (com.google.android.gms.internal.measurement.f3) r8     // Catch:{ all -> 0x1939 }
            com.google.android.gms.internal.measurement.x2 r8 = r8.j1(r5)     // Catch:{ all -> 0x1939 }
            com.google.android.gms.internal.measurement.b6 r8 = r8.n()     // Catch:{ all -> 0x198c }
            com.google.android.gms.internal.measurement.w2 r8 = (com.google.android.gms.internal.measurement.w2) r8     // Catch:{ all -> 0x198c }
            java.lang.String r10 = r8.v()     // Catch:{ all -> 0x198c }
            java.lang.String r11 = "_ep"
            boolean r10 = r10.equals(r11)     // Catch:{ all -> 0x198c }
            java.lang.String r11 = "_efs"
            java.lang.String r12 = "_sr"
            if (r10 == 0) goto L_0x16f9
            E(r39)     // Catch:{ all -> 0x16f3 }
            com.google.android.gms.internal.measurement.f6 r10 = r8.j()     // Catch:{ all -> 0x16f3 }
            com.google.android.gms.internal.measurement.x2 r10 = (com.google.android.gms.internal.measurement.x2) r10     // Catch:{ all -> 0x16f3 }
            java.lang.String r13 = "_en"
            java.io.Serializable r10 = h5.b7.l(r10, r13)     // Catch:{ all -> 0x16f3 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x16f3 }
            java.lang.Object r13 = r1.get(r10)     // Catch:{ all -> 0x16f3 }
            h5.m r13 = (h5.m) r13     // Catch:{ all -> 0x16f3 }
            if (r13 != 0) goto L_0x16af
            r14 = r85
            h5.i r13 = r14.f5850q     // Catch:{ all -> 0x1719 }
            E(r13)     // Catch:{ all -> 0x1719 }
            com.google.android.gms.internal.measurement.f3 r15 = r2.f5826a     // Catch:{ all -> 0x1719 }
            java.lang.String r15 = r15.r()     // Catch:{ all -> 0x1719 }
            n4.m.h(r10)     // Catch:{ all -> 0x1719 }
            h5.m r13 = r13.z(r15, r10)     // Catch:{ all -> 0x1719 }
            if (r13 == 0) goto L_0x16b1
            r1.put(r10, r13)     // Catch:{ all -> 0x1719 }
            goto L_0x16b1
        L_0x16af:
            r14 = r85
        L_0x16b1:
            if (r13 == 0) goto L_0x16ec
            java.lang.Long r10 = r13.f5548i     // Catch:{ all -> 0x1719 }
            if (r10 != 0) goto L_0x16ec
            java.lang.Long r10 = r13.f5549j     // Catch:{ all -> 0x1719 }
            if (r10 == 0) goto L_0x16cd
            long r22 = r10.longValue()     // Catch:{ all -> 0x1719 }
            r24 = 1
            int r10 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r10 <= 0) goto L_0x16cd
            E(r39)     // Catch:{ all -> 0x1719 }
            java.lang.Long r10 = r13.f5549j     // Catch:{ all -> 0x1719 }
            h5.b7.I(r8, r12, r10)     // Catch:{ all -> 0x1719 }
        L_0x16cd:
            java.lang.Boolean r10 = r13.f5550k     // Catch:{ all -> 0x1719 }
            if (r10 == 0) goto L_0x16e3
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x1719 }
            if (r10 == 0) goto L_0x16e3
            E(r39)     // Catch:{ all -> 0x1719 }
            r12 = 1
            java.lang.Long r10 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x1719 }
            h5.b7.I(r8, r11, r10)     // Catch:{ all -> 0x1719 }
        L_0x16e3:
            com.google.android.gms.internal.measurement.f6 r10 = r8.j()     // Catch:{ all -> 0x1719 }
            com.google.android.gms.internal.measurement.x2 r10 = (com.google.android.gms.internal.measurement.x2) r10     // Catch:{ all -> 0x1719 }
            r3.add(r10)     // Catch:{ all -> 0x1719 }
        L_0x16ec:
            r9.F(r5, r8)     // Catch:{ all -> 0x1719 }
            r15 = r19
            goto L_0x17c6
        L_0x16f3:
            r0 = move-exception
            r14 = r85
        L_0x16f6:
            r2 = r0
            goto L_0x17ca
        L_0x16f9:
            r14 = r85
            E(r19)     // Catch:{ all -> 0x198c }
            com.google.android.gms.internal.measurement.f3 r10 = r2.f5826a     // Catch:{ all -> 0x198c }
            java.lang.String r10 = r10.r()     // Catch:{ all -> 0x198c }
            java.lang.String r13 = "measurement.account.time_zone_offset_minutes"
            r15 = r19
            java.lang.String r13 = r15.b(r10, r13)     // Catch:{ all -> 0x198c }
            boolean r19 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x198c }
            if (r19 != 0) goto L_0x1730
            long r22 = java.lang.Long.parseLong(r13)     // Catch:{ NumberFormatException -> 0x171b }
            r6 = r22
            goto L_0x1732
        L_0x1719:
            r0 = move-exception
            goto L_0x16f6
        L_0x171b:
            r0 = move-exception
            r13 = r0
            h5.i4 r6 = r15.f5649o     // Catch:{ all -> 0x1719 }
            h5.g3 r6 = r6.e()     // Catch:{ all -> 0x1719 }
            h5.e3 r6 = r6.l()     // Catch:{ all -> 0x1719 }
            java.lang.String r7 = "Unable to parse timezone offset. appId"
            h5.f3 r10 = h5.g3.p(r10)     // Catch:{ all -> 0x1719 }
            r6.c(r10, r13, r7)     // Catch:{ all -> 0x1719 }
        L_0x1730:
            r6 = 0
        L_0x1732:
            r85.J()     // Catch:{ all -> 0x198c }
            long r24 = r8.x()     // Catch:{ all -> 0x198c }
            r26 = 60000(0xea60, double:2.9644E-319)
            long r6 = r6 * r26
            long r24 = r6 + r24
            r13 = r11
            r16 = 86400000(0x5265c00, double:4.2687272E-316)
            long r10 = r24 / r16
            com.google.android.gms.internal.measurement.f6 r19 = r8.j()     // Catch:{ all -> 0x198c }
            com.google.android.gms.internal.measurement.x2 r19 = (com.google.android.gms.internal.measurement.x2) r19     // Catch:{ all -> 0x198c }
            r26 = r13
            r24 = 1
            java.lang.Long r13 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x198c }
            r24 = r6
            java.lang.String r6 = "_dbg"
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x198c }
            if (r7 != 0) goto L_0x1792
            java.util.List r7 = r19.r()     // Catch:{ all -> 0x1719 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x1719 }
        L_0x1766:
            boolean r19 = r7.hasNext()     // Catch:{ all -> 0x1719 }
            if (r19 == 0) goto L_0x1792
            java.lang.Object r19 = r7.next()     // Catch:{ all -> 0x1719 }
            com.google.android.gms.internal.measurement.b3 r19 = (com.google.android.gms.internal.measurement.b3) r19     // Catch:{ all -> 0x1719 }
            r27 = r7
            java.lang.String r7 = r19.s()     // Catch:{ all -> 0x1719 }
            boolean r7 = r6.equals(r7)     // Catch:{ all -> 0x1719 }
            if (r7 == 0) goto L_0x178f
            long r6 = r19.w()     // Catch:{ all -> 0x1719 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x1719 }
            boolean r6 = r13.equals(r6)     // Catch:{ all -> 0x1719 }
            if (r6 != 0) goto L_0x178d
            goto L_0x1792
        L_0x178d:
            r6 = 1
            goto L_0x17a3
        L_0x178f:
            r7 = r27
            goto L_0x1766
        L_0x1792:
            E(r15)     // Catch:{ all -> 0x198c }
            com.google.android.gms.internal.measurement.f3 r6 = r2.f5826a     // Catch:{ all -> 0x198c }
            java.lang.String r6 = r6.r()     // Catch:{ all -> 0x198c }
            java.lang.String r7 = r8.v()     // Catch:{ all -> 0x198c }
            int r6 = r15.p(r6, r7)     // Catch:{ all -> 0x198c }
        L_0x17a3:
            if (r6 > 0) goto L_0x17cd
            h5.g3 r7 = r85.e()     // Catch:{ all -> 0x1719 }
            h5.e3 r7 = r7.l()     // Catch:{ all -> 0x1719 }
            java.lang.String r10 = "Sample rate must be positive. event, rate"
            java.lang.String r11 = r8.v()     // Catch:{ all -> 0x1719 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x1719 }
            r7.c(r11, r6, r10)     // Catch:{ all -> 0x1719 }
            com.google.android.gms.internal.measurement.f6 r6 = r8.j()     // Catch:{ all -> 0x1719 }
            com.google.android.gms.internal.measurement.x2 r6 = (com.google.android.gms.internal.measurement.x2) r6     // Catch:{ all -> 0x1719 }
            r3.add(r6)     // Catch:{ all -> 0x1719 }
            r9.F(r5, r8)     // Catch:{ all -> 0x1719 }
        L_0x17c6:
            r19 = r15
            goto L_0x1876
        L_0x17ca:
            r4 = r14
            goto L_0x1be3
        L_0x17cd:
            java.lang.String r7 = r8.v()     // Catch:{ all -> 0x198c }
            java.lang.Object r7 = r1.get(r7)     // Catch:{ all -> 0x198c }
            h5.m r7 = (h5.m) r7     // Catch:{ all -> 0x198c }
            if (r7 != 0) goto L_0x182d
            h5.i r7 = r14.f5850q     // Catch:{ all -> 0x198c }
            E(r7)     // Catch:{ all -> 0x198c }
            com.google.android.gms.internal.measurement.f3 r13 = r2.f5826a     // Catch:{ all -> 0x198c }
            java.lang.String r13 = r13.r()     // Catch:{ all -> 0x198c }
            r19 = r15
            java.lang.String r15 = r8.v()     // Catch:{ all -> 0x198c }
            h5.m r7 = r7.z(r13, r15)     // Catch:{ all -> 0x198c }
            if (r7 != 0) goto L_0x182f
            h5.g3 r7 = r85.e()     // Catch:{ all -> 0x198c }
            h5.e3 r7 = r7.l()     // Catch:{ all -> 0x198c }
            java.lang.String r13 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.f3 r15 = r2.f5826a     // Catch:{ all -> 0x198c }
            java.lang.String r15 = r15.r()     // Catch:{ all -> 0x198c }
            java.lang.String r14 = r8.v()     // Catch:{ all -> 0x198c }
            r7.c(r15, r14, r13)     // Catch:{ all -> 0x198c }
            h5.m r7 = new h5.m     // Catch:{ all -> 0x198c }
            com.google.android.gms.internal.measurement.f3 r13 = r2.f5826a     // Catch:{ all -> 0x198c }
            java.lang.String r41 = r13.r()     // Catch:{ all -> 0x198c }
            java.lang.String r42 = r8.v()     // Catch:{ all -> 0x198c }
            r43 = 1
            r45 = 1
            r47 = 1
            long r49 = r8.x()     // Catch:{ all -> 0x198c }
            r51 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r40 = r7
            r40.<init>(r41, r42, r43, r45, r47, r49, r51, r53, r54, r55, r56)     // Catch:{ all -> 0x198c }
            goto L_0x182f
        L_0x182d:
            r19 = r15
        L_0x182f:
            E(r39)     // Catch:{ all -> 0x198c }
            com.google.android.gms.internal.measurement.f6 r13 = r8.j()     // Catch:{ all -> 0x198c }
            com.google.android.gms.internal.measurement.x2 r13 = (com.google.android.gms.internal.measurement.x2) r13     // Catch:{ all -> 0x198c }
            java.lang.String r14 = "_eid"
            java.io.Serializable r13 = h5.b7.l(r13, r14)     // Catch:{ all -> 0x198c }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ all -> 0x198c }
            if (r13 == 0) goto L_0x1844
            r14 = 1
            goto L_0x1845
        L_0x1844:
            r14 = 0
        L_0x1845:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)     // Catch:{ all -> 0x198c }
            r15 = 1
            if (r6 != r15) goto L_0x187d
            com.google.android.gms.internal.measurement.f6 r6 = r8.j()     // Catch:{ all -> 0x198c }
            com.google.android.gms.internal.measurement.x2 r6 = (com.google.android.gms.internal.measurement.x2) r6     // Catch:{ all -> 0x198c }
            r3.add(r6)     // Catch:{ all -> 0x198c }
            boolean r6 = r14.booleanValue()     // Catch:{ all -> 0x198c }
            if (r6 == 0) goto L_0x1873
            java.lang.Long r6 = r7.f5548i     // Catch:{ all -> 0x198c }
            if (r6 != 0) goto L_0x1867
            java.lang.Long r6 = r7.f5549j     // Catch:{ all -> 0x198c }
            if (r6 != 0) goto L_0x1867
            java.lang.Boolean r6 = r7.f5550k     // Catch:{ all -> 0x198c }
            if (r6 == 0) goto L_0x1873
        L_0x1867:
            r6 = 0
            h5.m r7 = r7.b(r6, r6, r6)     // Catch:{ all -> 0x198c }
            java.lang.String r6 = r8.v()     // Catch:{ all -> 0x198c }
            r1.put(r6, r7)     // Catch:{ all -> 0x198c }
        L_0x1873:
            r9.F(r5, r8)     // Catch:{ all -> 0x198c }
        L_0x1876:
            r15 = r4
            r4 = r5
            r16 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x1932
        L_0x187d:
            int r15 = r4.nextInt(r6)     // Catch:{ all -> 0x198c }
            if (r15 != 0) goto L_0x18bb
            E(r39)     // Catch:{ all -> 0x198c }
            r15 = r4
            r27 = r5
            long r4 = (long) r6     // Catch:{ all -> 0x198c }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x198c }
            h5.b7.I(r8, r12, r4)     // Catch:{ all -> 0x198c }
            com.google.android.gms.internal.measurement.f6 r5 = r8.j()     // Catch:{ all -> 0x198c }
            com.google.android.gms.internal.measurement.x2 r5 = (com.google.android.gms.internal.measurement.x2) r5     // Catch:{ all -> 0x198c }
            r3.add(r5)     // Catch:{ all -> 0x198c }
            boolean r5 = r14.booleanValue()     // Catch:{ all -> 0x198c }
            if (r5 == 0) goto L_0x18a5
            r5 = 0
            h5.m r7 = r7.b(r5, r4, r5)     // Catch:{ all -> 0x198c }
        L_0x18a5:
            java.lang.String r4 = r8.v()     // Catch:{ all -> 0x198c }
            long r5 = r8.x()     // Catch:{ all -> 0x198c }
            h5.m r5 = r7.a(r5, r10)     // Catch:{ all -> 0x198c }
            r1.put(r4, r5)     // Catch:{ all -> 0x198c }
            r4 = r27
            r16 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x192f
        L_0x18bb:
            r15 = r4
            r27 = r5
            java.lang.Long r4 = r7.f5547h     // Catch:{ all -> 0x198c }
            if (r4 == 0) goto L_0x18ca
            long r4 = r4.longValue()     // Catch:{ all -> 0x198c }
            r16 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x18d8
        L_0x18ca:
            r85.J()     // Catch:{ all -> 0x198c }
            long r4 = r8.y()     // Catch:{ all -> 0x198c }
            long r4 = r24 + r4
            r16 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r4 / r16
        L_0x18d8:
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x191b
            E(r39)     // Catch:{ all -> 0x198c }
            r4 = 1
            java.lang.Long r13 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x198c }
            r4 = r26
            h5.b7.I(r8, r4, r13)     // Catch:{ all -> 0x198c }
            E(r39)     // Catch:{ all -> 0x198c }
            long r4 = (long) r6     // Catch:{ all -> 0x198c }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x198c }
            h5.b7.I(r8, r12, r4)     // Catch:{ all -> 0x198c }
            com.google.android.gms.internal.measurement.f6 r5 = r8.j()     // Catch:{ all -> 0x198c }
            com.google.android.gms.internal.measurement.x2 r5 = (com.google.android.gms.internal.measurement.x2) r5     // Catch:{ all -> 0x198c }
            r3.add(r5)     // Catch:{ all -> 0x198c }
            boolean r5 = r14.booleanValue()     // Catch:{ all -> 0x198c }
            if (r5 == 0) goto L_0x190b
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x198c }
            r6 = 0
            h5.m r7 = r7.b(r6, r4, r5)     // Catch:{ all -> 0x198c }
        L_0x190b:
            java.lang.String r4 = r8.v()     // Catch:{ all -> 0x198c }
            long r5 = r8.x()     // Catch:{ all -> 0x198c }
            h5.m r5 = r7.a(r5, r10)     // Catch:{ all -> 0x198c }
            r1.put(r4, r5)     // Catch:{ all -> 0x198c }
            goto L_0x192d
        L_0x191b:
            boolean r4 = r14.booleanValue()     // Catch:{ all -> 0x198c }
            if (r4 == 0) goto L_0x192d
            java.lang.String r4 = r8.v()     // Catch:{ all -> 0x198c }
            r5 = 0
            h5.m r6 = r7.b(r13, r5, r5)     // Catch:{ all -> 0x198c }
            r1.put(r4, r6)     // Catch:{ all -> 0x198c }
        L_0x192d:
            r4 = r27
        L_0x192f:
            r9.F(r4, r8)     // Catch:{ all -> 0x198c }
        L_0x1932:
            int r5 = r4 + 1
            r4 = r15
            r6 = -1
            goto L_0x1654
        L_0x1939:
            r0 = move-exception
        L_0x193a:
            r1 = r0
            goto L_0x1624
        L_0x193d:
            int r4 = r3.size()     // Catch:{ all -> 0x198c }
            MessageType r5 = r9.f2635p     // Catch:{ all -> 0x198c }
            com.google.android.gms.internal.measurement.f3 r5 = (com.google.android.gms.internal.measurement.f3) r5     // Catch:{ all -> 0x198c }
            int r5 = r5.i1()     // Catch:{ all -> 0x198a }
            if (r4 >= r5) goto L_0x1962
            boolean r4 = r9.f2636q     // Catch:{ all -> 0x1960 }
            if (r4 == 0) goto L_0x1955
            r9.m()     // Catch:{ all -> 0x1960 }
            r4 = 0
            r9.f2636q = r4     // Catch:{ all -> 0x1960 }
        L_0x1955:
            MessageType r4 = r9.f2635p     // Catch:{ all -> 0x1960 }
            com.google.android.gms.internal.measurement.f3 r4 = (com.google.android.gms.internal.measurement.f3) r4     // Catch:{ all -> 0x1960 }
            com.google.android.gms.internal.measurement.f3.H0(r4)     // Catch:{ all -> 0x1960 }
            r9.G(r3)     // Catch:{ all -> 0x198c }
            goto L_0x1962
        L_0x1960:
            r0 = move-exception
            goto L_0x193a
        L_0x1962:
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x198c }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x198c }
        L_0x196a:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x198c }
            if (r3 == 0) goto L_0x1987
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x198c }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x198c }
            r4 = r85
            h5.i r5 = r4.f5850q     // Catch:{ all -> 0x1bdd }
            E(r5)     // Catch:{ all -> 0x1bdd }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x1bdd }
            h5.m r3 = (h5.m) r3     // Catch:{ all -> 0x1bdd }
            r5.A(r3)     // Catch:{ all -> 0x1bdd }
            goto L_0x196a
        L_0x1987:
            r4 = r85
            goto L_0x1991
        L_0x198a:
            r0 = move-exception
            goto L_0x198d
        L_0x198c:
            r0 = move-exception
        L_0x198d:
            r4 = r85
            goto L_0x1be1
        L_0x1991:
            com.google.android.gms.internal.measurement.f3 r1 = r2.f5826a     // Catch:{ all -> 0x1bdd }
            java.lang.String r1 = r1.r()     // Catch:{ all -> 0x1bdd }
            h5.i r3 = r4.f5850q     // Catch:{ all -> 0x1bdd }
            E(r3)     // Catch:{ all -> 0x1bdd }
            h5.m4 r3 = r3.L(r1)     // Catch:{ all -> 0x1bdd }
            if (r3 != 0) goto L_0x19bb
            h5.g3 r3 = r85.e()     // Catch:{ all -> 0x1bdd }
            h5.e3 r3 = r3.k()     // Catch:{ all -> 0x1bdd }
            java.lang.String r5 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.f3 r6 = r2.f5826a     // Catch:{ all -> 0x1bdd }
            java.lang.String r6 = r6.r()     // Catch:{ all -> 0x1bdd }
            h5.f3 r6 = h5.g3.p(r6)     // Catch:{ all -> 0x1bdd }
            r3.b(r6, r5)     // Catch:{ all -> 0x1bdd }
            goto L_0x1a8b
        L_0x19bb:
            h5.i4 r5 = r3.f5555a
            MessageType r6 = r9.f2635p     // Catch:{ all -> 0x1bdd }
            com.google.android.gms.internal.measurement.f3 r6 = (com.google.android.gms.internal.measurement.f3) r6     // Catch:{ all -> 0x1bdd }
            int r6 = r6.i1()     // Catch:{ all -> 0x1bdd }
            if (r6 <= 0) goto L_0x1a8b
            h5.h4 r6 = r5.f5459x     // Catch:{ all -> 0x1bdd }
            h5.i4.n(r6)     // Catch:{ all -> 0x1bdd }
            r6.g()     // Catch:{ all -> 0x1bdd }
            long r6 = r3.f5562i     // Catch:{ all -> 0x1bdd }
            r10 = 0
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x19e9
            boolean r8 = r9.f2636q     // Catch:{ all -> 0x1bdd }
            if (r8 == 0) goto L_0x19e1
            r9.m()     // Catch:{ all -> 0x1bdd }
            r8 = 0
            r9.f2636q = r8     // Catch:{ all -> 0x1bdd }
        L_0x19e1:
            MessageType r8 = r9.f2635p     // Catch:{ all -> 0x1bdd }
            com.google.android.gms.internal.measurement.f3 r8 = (com.google.android.gms.internal.measurement.f3) r8     // Catch:{ all -> 0x1bdd }
            com.google.android.gms.internal.measurement.f3.S(r8, r6)     // Catch:{ all -> 0x1bdd }
            goto L_0x19ec
        L_0x19e9:
            r9.L()     // Catch:{ all -> 0x1bdd }
        L_0x19ec:
            h5.h4 r8 = r5.f5459x     // Catch:{ all -> 0x1bdd }
            h5.i4.n(r8)     // Catch:{ all -> 0x1bdd }
            r8.g()     // Catch:{ all -> 0x1bdd }
            long r10 = r3.f5561h     // Catch:{ all -> 0x1bdd }
            r12 = 0
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 != 0) goto L_0x19fd
            goto L_0x19fe
        L_0x19fd:
            r6 = r10
        L_0x19fe:
            int r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r8 == 0) goto L_0x1a14
            boolean r8 = r9.f2636q     // Catch:{ all -> 0x1bdd }
            if (r8 == 0) goto L_0x1a0c
            r9.m()     // Catch:{ all -> 0x1bdd }
            r8 = 0
            r9.f2636q = r8     // Catch:{ all -> 0x1bdd }
        L_0x1a0c:
            MessageType r8 = r9.f2635p     // Catch:{ all -> 0x1bdd }
            com.google.android.gms.internal.measurement.f3 r8 = (com.google.android.gms.internal.measurement.f3) r8     // Catch:{ all -> 0x1bdd }
            com.google.android.gms.internal.measurement.f3.P0(r8, r6)     // Catch:{ all -> 0x1bdd }
            goto L_0x1a17
        L_0x1a14:
            r9.K()     // Catch:{ all -> 0x1bdd }
        L_0x1a17:
            h5.h4 r6 = r5.f5459x     // Catch:{ all -> 0x1bdd }
            h5.i4.n(r6)     // Catch:{ all -> 0x1bdd }
            r6.g()     // Catch:{ all -> 0x1bdd }
            long r6 = r3.f5560g     // Catch:{ all -> 0x1bdd }
            r10 = 1
            long r6 = r6 + r10
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x1a3e
            h5.g3 r6 = r5.w     // Catch:{ all -> 0x1bdd }
            h5.i4.n(r6)     // Catch:{ all -> 0x1bdd }
            java.lang.String r7 = r3.f5556b     // Catch:{ all -> 0x1bdd }
            h5.f3 r7 = h5.g3.p(r7)     // Catch:{ all -> 0x1bdd }
            h5.e3 r6 = r6.w     // Catch:{ all -> 0x1bdd }
            java.lang.String r8 = "Bundle index overflow. appId"
            r6.b(r7, r8)     // Catch:{ all -> 0x1bdd }
            goto L_0x1a3f
        L_0x1a3e:
            r12 = r6
        L_0x1a3f:
            r6 = 1
            r3.D = r6     // Catch:{ all -> 0x1bdd }
            r3.f5560g = r12     // Catch:{ all -> 0x1bdd }
            h5.h4 r5 = r5.f5459x     // Catch:{ all -> 0x1bdd }
            h5.i4.n(r5)     // Catch:{ all -> 0x1bdd }
            r5.g()     // Catch:{ all -> 0x1bdd }
            long r5 = r3.f5560g     // Catch:{ all -> 0x1bdd }
            int r5 = (int) r5     // Catch:{ all -> 0x1bdd }
            boolean r6 = r9.f2636q     // Catch:{ all -> 0x1bdd }
            if (r6 == 0) goto L_0x1a59
            r9.m()     // Catch:{ all -> 0x1bdd }
            r6 = 0
            r9.f2636q = r6     // Catch:{ all -> 0x1bdd }
        L_0x1a59:
            MessageType r6 = r9.f2635p     // Catch:{ all -> 0x1bdd }
            com.google.android.gms.internal.measurement.f3 r6 = (com.google.android.gms.internal.measurement.f3) r6     // Catch:{ all -> 0x1bdd }
            com.google.android.gms.internal.measurement.f3.l0(r6, r5)     // Catch:{ all -> 0x1bdd }
            MessageType r5 = r9.f2635p     // Catch:{ all -> 0x1bdd }
            com.google.android.gms.internal.measurement.f3 r5 = (com.google.android.gms.internal.measurement.f3) r5     // Catch:{ all -> 0x1bdd }
            long r5 = r5.q1()     // Catch:{ all -> 0x1bdd }
            r3.J(r5)     // Catch:{ all -> 0x1bdd }
            MessageType r5 = r9.f2635p     // Catch:{ all -> 0x1bdd }
            com.google.android.gms.internal.measurement.f3 r5 = (com.google.android.gms.internal.measurement.f3) r5     // Catch:{ all -> 0x1bdd }
            long r5 = r5.s1()     // Catch:{ all -> 0x1bdd }
            r3.K(r5)     // Catch:{ all -> 0x1bdd }
            java.lang.String r5 = r3.p()     // Catch:{ all -> 0x1bdd }
            if (r5 == 0) goto L_0x1a80
            r9.u(r5)     // Catch:{ all -> 0x1bdd }
            goto L_0x1a83
        L_0x1a80:
            r9.v()     // Catch:{ all -> 0x1bdd }
        L_0x1a83:
            h5.i r5 = r4.f5850q     // Catch:{ all -> 0x1bdd }
            E(r5)     // Catch:{ all -> 0x1bdd }
            r5.M(r3)     // Catch:{ all -> 0x1bdd }
        L_0x1a8b:
            MessageType r3 = r9.f2635p     // Catch:{ all -> 0x1bdd }
            com.google.android.gms.internal.measurement.f3 r3 = (com.google.android.gms.internal.measurement.f3) r3     // Catch:{ all -> 0x1bdd }
            int r3 = r3.i1()     // Catch:{ all -> 0x1bdd }
            if (r3 <= 0) goto L_0x1b0a
            r18.getClass()     // Catch:{ all -> 0x1bdd }
            E(r19)     // Catch:{ all -> 0x1bdd }
            com.google.android.gms.internal.measurement.f3 r3 = r2.f5826a     // Catch:{ all -> 0x1bdd }
            java.lang.String r3 = r3.r()     // Catch:{ all -> 0x1bdd }
            r5 = r19
            com.google.android.gms.internal.measurement.o2 r3 = r5.k(r3)     // Catch:{ all -> 0x1bdd }
            if (r3 == 0) goto L_0x1ac6
            boolean r5 = r3.r()     // Catch:{ all -> 0x1bdd }
            if (r5 != 0) goto L_0x1ab0
            goto L_0x1ac6
        L_0x1ab0:
            long r5 = r3.s()     // Catch:{ all -> 0x1bdd }
            boolean r3 = r9.f2636q     // Catch:{ all -> 0x1bdd }
            if (r3 == 0) goto L_0x1abe
            r9.m()     // Catch:{ all -> 0x1bdd }
            r3 = 0
            r9.f2636q = r3     // Catch:{ all -> 0x1bdd }
        L_0x1abe:
            MessageType r3 = r9.f2635p     // Catch:{ all -> 0x1bdd }
            com.google.android.gms.internal.measurement.f3 r3 = (com.google.android.gms.internal.measurement.f3) r3     // Catch:{ all -> 0x1bdd }
        L_0x1ac2:
            com.google.android.gms.internal.measurement.f3.X0(r3, r5)     // Catch:{ all -> 0x1bdd }
            goto L_0x1afa
        L_0x1ac6:
            com.google.android.gms.internal.measurement.f3 r3 = r2.f5826a     // Catch:{ all -> 0x1bdd }
            java.lang.String r3 = r3.G()     // Catch:{ all -> 0x1bdd }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1bdd }
            if (r3 == 0) goto L_0x1ae3
            boolean r3 = r9.f2636q     // Catch:{ all -> 0x1bdd }
            if (r3 == 0) goto L_0x1adc
            r9.m()     // Catch:{ all -> 0x1bdd }
            r3 = 0
            r9.f2636q = r3     // Catch:{ all -> 0x1bdd }
        L_0x1adc:
            MessageType r3 = r9.f2635p     // Catch:{ all -> 0x1bdd }
            com.google.android.gms.internal.measurement.f3 r3 = (com.google.android.gms.internal.measurement.f3) r3     // Catch:{ all -> 0x1bdd }
            r5 = -1
            goto L_0x1ac2
        L_0x1ae3:
            h5.g3 r3 = r85.e()     // Catch:{ all -> 0x1bdd }
            h5.e3 r3 = r3.l()     // Catch:{ all -> 0x1bdd }
            java.lang.String r5 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.f3 r6 = r2.f5826a     // Catch:{ all -> 0x1bdd }
            java.lang.String r6 = r6.r()     // Catch:{ all -> 0x1bdd }
            h5.f3 r6 = h5.g3.p(r6)     // Catch:{ all -> 0x1bdd }
            r3.b(r6, r5)     // Catch:{ all -> 0x1bdd }
        L_0x1afa:
            h5.i r3 = r4.f5850q     // Catch:{ all -> 0x1bdd }
            E(r3)     // Catch:{ all -> 0x1bdd }
            com.google.android.gms.internal.measurement.f6 r5 = r9.j()     // Catch:{ all -> 0x1bdd }
            com.google.android.gms.internal.measurement.f3 r5 = (com.google.android.gms.internal.measurement.f3) r5     // Catch:{ all -> 0x1bdd }
            r10 = r21
            r3.Q(r5, r10)     // Catch:{ all -> 0x1bdd }
        L_0x1b0a:
            h5.i r3 = r4.f5850q     // Catch:{ all -> 0x1bdd }
            E(r3)     // Catch:{ all -> 0x1bdd }
            java.util.ArrayList r2 = r2.f5827b     // Catch:{ all -> 0x1bdd }
            n4.m.h(r2)     // Catch:{ all -> 0x1bdd }
            r3.g()     // Catch:{ all -> 0x1bdd }
            r3.h()     // Catch:{ all -> 0x1bdd }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x1bdd }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x1bdd }
            r6 = 0
        L_0x1b22:
            int r7 = r2.size()     // Catch:{ all -> 0x1bdd }
            if (r6 >= r7) goto L_0x1b3f
            if (r6 == 0) goto L_0x1b2f
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x1bdd }
        L_0x1b2f:
            java.lang.Object r7 = r2.get(r6)     // Catch:{ all -> 0x1bdd }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x1bdd }
            long r7 = r7.longValue()     // Catch:{ all -> 0x1bdd }
            r5.append(r7)     // Catch:{ all -> 0x1bdd }
            int r6 = r6 + 1
            goto L_0x1b22
        L_0x1b3f:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x1bdd }
            android.database.sqlite.SQLiteDatabase r6 = r3.y()     // Catch:{ all -> 0x1bdd }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x1bdd }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x1bdd }
            int r6 = r2.size()     // Catch:{ all -> 0x1bdd }
            if (r5 == r6) goto L_0x1b74
            h5.i4 r3 = r3.f5649o     // Catch:{ all -> 0x1bdd }
            h5.g3 r3 = r3.e()     // Catch:{ all -> 0x1bdd }
            h5.e3 r3 = r3.k()     // Catch:{ all -> 0x1bdd }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x1bdd }
            int r2 = r2.size()     // Catch:{ all -> 0x1bdd }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x1bdd }
            r3.c(r5, r2, r6)     // Catch:{ all -> 0x1bdd }
        L_0x1b74:
            h5.i r2 = r4.f5850q     // Catch:{ all -> 0x1bdd }
            E(r2)     // Catch:{ all -> 0x1bdd }
            android.database.sqlite.SQLiteDatabase r3 = r2.y()     // Catch:{ all -> 0x1bdd }
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x1b8c }
            r6 = 0
            r5[r6] = r1     // Catch:{ SQLiteException -> 0x1b8c }
            r6 = 1
            r5[r6] = r1     // Catch:{ SQLiteException -> 0x1b8c }
            java.lang.String r6 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r3.execSQL(r6, r5)     // Catch:{ SQLiteException -> 0x1b8c }
            goto L_0x1ba1
        L_0x1b8c:
            r0 = move-exception
            r3 = r0
            h5.i4 r2 = r2.f5649o     // Catch:{ all -> 0x1bdd }
            h5.g3 r2 = r2.e()     // Catch:{ all -> 0x1bdd }
            h5.e3 r2 = r2.k()     // Catch:{ all -> 0x1bdd }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            h5.f3 r1 = h5.g3.p(r1)     // Catch:{ all -> 0x1bdd }
            r2.c(r1, r3, r5)     // Catch:{ all -> 0x1bdd }
        L_0x1ba1:
            h5.i r1 = r4.f5850q     // Catch:{ all -> 0x1bdd }
            E(r1)     // Catch:{ all -> 0x1bdd }
            r1.w()     // Catch:{ all -> 0x1bdd }
            h5.i r1 = r4.f5850q
            E(r1)
            r1.x()
            r1 = 1
            return r1
        L_0x1bb3:
            r0 = move-exception
            r4 = r85
            goto L_0x1be1
        L_0x1bb7:
            r0 = move-exception
            r4 = r85
            r15 = r1
            r1 = r0
        L_0x1bbc:
            if (r15 == 0) goto L_0x1bc4
            r15.close()     // Catch:{ all -> 0x1bc2 }
            goto L_0x1bc4
        L_0x1bc2:
            r0 = move-exception
            goto L_0x1be1
        L_0x1bc4:
            throw r1     // Catch:{ all -> 0x1bc2 }
        L_0x1bc5:
            r0 = move-exception
            r4 = r1
            r2 = r0
        L_0x1bc8:
            r1 = r2
            goto L_0x1be2
        L_0x1bca:
            r4 = r1
            h5.i r1 = r4.f5850q     // Catch:{ all -> 0x1bdd }
            E(r1)     // Catch:{ all -> 0x1bdd }
            r1.w()     // Catch:{ all -> 0x1bdd }
            h5.i r1 = r4.f5850q
            E(r1)
            r1.x()
            r1 = 0
            return r1
        L_0x1bdd:
            r0 = move-exception
            goto L_0x1be1
        L_0x1bdf:
            r0 = move-exception
            r4 = r1
        L_0x1be1:
            r1 = r0
        L_0x1be2:
            r2 = r1
        L_0x1be3:
            h5.i r1 = r4.f5850q
            E(r1)
            r1.x()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.z6.u(long):boolean");
    }

    public final void v(e3 e3Var, long j8, boolean z10) {
        String str;
        e7 e7Var;
        String str2;
        Object obj;
        e3 e3Var2 = e3Var;
        boolean z11 = z10;
        if (true != z11) {
            str = "_lte";
        } else {
            str = "_se";
        }
        i iVar = this.f5850q;
        E(iVar);
        e7 D2 = iVar.D(e3Var.q(), str);
        if (D2 == null || (obj = D2.f5365e) == null) {
            String q10 = e3Var.q();
            ((r4.d) c()).getClass();
            e7Var = new e7(q10, "auto", str, System.currentTimeMillis(), Long.valueOf(j8));
        } else {
            String q11 = e3Var.q();
            ((r4.d) c()).getClass();
            e7Var = new e7(q11, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j8));
        }
        p3 A2 = q3.A();
        A2.r(str);
        ((r4.d) c()).getClass();
        A2.q(System.currentTimeMillis());
        Object obj2 = e7Var.f5365e;
        A2.s(((Long) obj2).longValue());
        q3 q3Var = (q3) A2.j();
        int F2 = b7.F(e3Var2, str);
        if (F2 >= 0) {
            if (e3Var2.f2636q) {
                e3Var.m();
                e3Var2.f2636q = false;
            }
            f3.J0((f3) e3Var2.f2635p, F2, q3Var);
        } else {
            if (e3Var2.f2636q) {
                e3Var.m();
                e3Var2.f2636q = false;
            }
            f3.K0((f3) e3Var2.f2635p, q3Var);
        }
        if (j8 > 0) {
            i iVar2 = this.f5850q;
            E(iVar2);
            iVar2.C(e7Var);
            if (true != z11) {
                str2 = "lifetime";
            } else {
                str2 = "session-scoped";
            }
            e().B.c(str2, obj2, "Updated engagement user property. scope, value");
        }
    }

    public final boolean w(w2 w2Var, w2 w2Var2) {
        m.b("_e".equals(w2Var.v()));
        b7 b7Var = this.u;
        E(b7Var);
        b3 k10 = b7.k((x2) w2Var.j(), "_sc");
        String str = null;
        String u10 = k10 == null ? null : k10.u();
        E(b7Var);
        b3 k11 = b7.k((x2) w2Var2.j(), "_pc");
        if (k11 != null) {
            str = k11.u();
        }
        if (str == null || !str.equals(u10)) {
            return false;
        }
        x(w2Var, w2Var2);
        return true;
    }

    public final void x(w2 w2Var, w2 w2Var2) {
        m.b("_e".equals(w2Var.v()));
        b7 b7Var = this.u;
        E(b7Var);
        b3 k10 = b7.k((x2) w2Var.j(), "_et");
        if (k10 != null && k10.v() && k10.w() > 0) {
            long w10 = k10.w();
            E(b7Var);
            b3 k11 = b7.k((x2) w2Var2.j(), "_et");
            if (k11 != null && k11.w() > 0) {
                w10 += k11.w();
            }
            E(b7Var);
            b7.I(w2Var2, "_et", Long.valueOf(w10));
            E(b7Var);
            b7.I(w2Var, "_fr", 1L);
        }
    }

    public final boolean y() {
        boolean z10;
        f().g();
        K();
        i iVar = this.f5850q;
        E(iVar);
        if (iVar.t("select count(1) > 0 from raw_events", (String[]) null) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i iVar2 = this.f5850q;
            E(iVar2);
            if (!TextUtils.isEmpty(iVar2.R())) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0337 A[Catch:{ IllegalAccessException | InvocationTargetException -> 0x033b }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z() {
        /*
            r20 = this;
            r1 = r20
            java.lang.String r0 = "com.google.android.gms.measurement.AppMeasurementJobService"
            h5.h4 r2 = r20.f()
            r2.g()
            r20.K()
            long r2 = r1.B
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0045
            r4.c r2 = r20.c()
            r4.d r2 = (r4.d) r2
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r6 = r1.B
            long r2 = r2 - r6
            long r2 = java.lang.Math.abs(r2)
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            long r6 = r6 - r2
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0043
            h5.g3 r0 = r20.e()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            h5.e3 r0 = r0.B
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r0.b(r2, r3)
            goto L_0x03a7
        L_0x0043:
            r1.B = r4
        L_0x0045:
            h5.i4 r2 = r1.f5856y
            boolean r2 = r2.k()
            if (r2 == 0) goto L_0x039c
            boolean r2 = r20.y()
            if (r2 != 0) goto L_0x0055
            goto L_0x039c
        L_0x0055:
            r4.c r2 = r20.c()
            r4.d r2 = (r4.d) r2
            r2.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            r20.F()
            h5.s2<java.lang.Long> r6 = h5.u2.z
            r7 = 0
            java.lang.Object r6 = r6.a(r7)
            java.lang.Long r6 = (java.lang.Long) r6
            long r8 = r6.longValue()
            long r8 = java.lang.Math.max(r4, r8)
            h5.i r6 = r1.f5850q
            E(r6)
            java.lang.String r10 = "select count(1) > 0 from raw_events where realtime = 1"
            long r10 = r6.t(r10, r7)
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0087
            r6 = 1
            goto L_0x0088
        L_0x0087:
            r6 = 0
        L_0x0088:
            if (r6 != 0) goto L_0x00a1
            h5.i r6 = r1.f5850q
            E(r6)
            java.lang.String r12 = "select count(1) > 0 from queue where has_realtime = 1"
            long r12 = r6.t(r12, r7)
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x009b
            r6 = 1
            goto L_0x009c
        L_0x009b:
            r6 = 0
        L_0x009c:
            if (r6 == 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r6 = 0
            goto L_0x00a2
        L_0x00a1:
            r6 = 1
        L_0x00a2:
            if (r6 == 0) goto L_0x00c8
            h5.e r12 = r20.F()
            java.lang.String r13 = "debug.firebase.analytics.app"
            java.lang.String r12 = r12.h(r13)
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 != 0) goto L_0x00c2
            java.lang.String r13 = ".none."
            boolean r12 = r13.equals(r12)
            if (r12 != 0) goto L_0x00c2
            r20.F()
            h5.s2<java.lang.Long> r12 = h5.u2.u
            goto L_0x00cd
        L_0x00c2:
            r20.F()
            h5.s2<java.lang.Long> r12 = h5.u2.f5743t
            goto L_0x00cd
        L_0x00c8:
            r20.F()
            h5.s2<java.lang.Long> r12 = h5.u2.f5741s
        L_0x00cd:
            java.lang.Object r12 = r12.a(r7)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = java.lang.Math.max(r4, r12)
            h5.g6 r14 = r1.w
            h5.q3 r14 = r14.w
            long r14 = r14.a()
            h5.g6 r10 = r1.w
            h5.q3 r10 = r10.f5415x
            long r16 = r10.a()
            h5.i r10 = r1.f5850q
            E(r10)
            java.lang.String r11 = "select max(bundle_end_timestamp) from queue"
            long r10 = r10.u(r11, r7, r4)
            h5.i r4 = r1.f5850q
            E(r4)
            java.lang.String r5 = "select max(timestamp) from raw_events"
            r18 = r12
            r12 = 0
            long r4 = r4.u(r5, r7, r12)
            long r4 = java.lang.Math.max(r10, r4)
            int r10 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            h5.b7 r11 = r1.u
            if (r10 != 0) goto L_0x0111
            goto L_0x018f
        L_0x0111:
            long r4 = r4 - r2
            long r4 = java.lang.Math.abs(r4)
            long r4 = r2 - r4
            long r14 = r14 - r2
            long r12 = java.lang.Math.abs(r14)
            long r16 = r16 - r2
            long r14 = java.lang.Math.abs(r16)
            long r14 = r2 - r14
            long r2 = r2 - r12
            long r2 = java.lang.Math.max(r2, r14)
            long r8 = r8 + r4
            if (r6 == 0) goto L_0x0139
            r12 = 0
            int r6 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r6 <= 0) goto L_0x0139
            long r8 = java.lang.Math.min(r4, r2)
            long r8 = r8 + r18
        L_0x0139:
            E(r11)
            r12 = r18
            boolean r6 = r11.B(r2, r12)
            if (r6 != 0) goto L_0x0146
            long r2 = r2 + r12
            goto L_0x0147
        L_0x0146:
            r2 = r8
        L_0x0147:
            r8 = 0
            int r6 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x0191
            int r4 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x0191
            r4 = 0
        L_0x0152:
            r20.F()
            h5.s2<java.lang.Integer> r5 = h5.u2.B
            java.lang.Object r5 = r5.a(r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = 0
            int r5 = java.lang.Math.max(r6, r5)
            r6 = 20
            int r5 = java.lang.Math.min(r6, r5)
            if (r4 >= r5) goto L_0x018f
            r20.F()
            h5.s2<java.lang.Long> r5 = h5.u2.A
            java.lang.Object r5 = r5.a(r7)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            r8 = 0
            long r5 = java.lang.Math.max(r8, r5)
            r8 = 1
            long r8 = r8 << r4
            long r5 = r5 * r8
            long r2 = r2 + r5
            int r5 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r5 > 0) goto L_0x0191
            int r4 = r4 + 1
            goto L_0x0152
        L_0x018f:
            r2 = 0
        L_0x0191:
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0395
            h5.l3 r4 = r1.f5849p
            E(r4)
            boolean r4 = r4.k()
            if (r4 == 0) goto L_0x0347
            h5.g6 r4 = r1.w
            h5.q3 r4 = r4.f5414v
            long r4 = r4.a()
            r20.F()
            h5.s2<java.lang.Long> r6 = h5.u2.f5739r
            java.lang.Object r6 = r6.a(r7)
            java.lang.Long r6 = (java.lang.Long) r6
            long r8 = r6.longValue()
            r12 = 0
            long r8 = java.lang.Math.max(r12, r8)
            E(r11)
            boolean r6 = r11.B(r4, r8)
            if (r6 != 0) goto L_0x01cd
            long r4 = r4 + r8
            long r2 = java.lang.Math.max(r2, r4)
        L_0x01cd:
            h5.n3 r4 = r20.H()
            r4.a()
            r4.c r4 = r20.c()
            r4.d r4 = (r4.d) r4
            r4.getClass()
            long r4 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r4
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x020f
            r20.F()
            h5.s2<java.lang.Long> r2 = h5.u2.f5745v
            java.lang.Object r2 = r2.a(r7)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            long r2 = java.lang.Math.max(r4, r2)
            h5.g6 r4 = r1.w
            h5.q3 r4 = r4.w
            r4.c r5 = r20.c()
            r4.d r5 = (r4.d) r5
            r5.getClass()
            long r5 = java.lang.System.currentTimeMillis()
            r4.b(r5)
        L_0x020f:
            h5.g3 r4 = r20.e()
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            h5.e3 r4 = r4.B
            java.lang.String r6 = "Upload scheduled in approximately ms"
            r4.b(r5, r6)
            h5.s6 r4 = r1.f5852s
            E(r4)
            r4.h()
            h5.i4 r5 = r4.f5649o
            r5.getClass()
            android.content.Context r6 = r5.f5452o
            boolean r8 = h5.g7.Q(r6)
            h5.g3 r9 = r5.w
            if (r8 != 0) goto L_0x023f
            h5.i4.n(r9)
            java.lang.String r8 = "Receiver not registered/enabled"
            h5.e3 r10 = r9.A
            r10.a(r8)
        L_0x023f:
            android.content.pm.PackageManager r8 = r6.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0258 }
            if (r8 != 0) goto L_0x0246
            goto L_0x0258
        L_0x0246:
            android.content.ComponentName r10 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0258 }
            r10.<init>(r6, r0)     // Catch:{ NameNotFoundException -> 0x0258 }
            r11 = 0
            android.content.pm.ServiceInfo r8 = r8.getServiceInfo(r10, r11)     // Catch:{ NameNotFoundException -> 0x0258 }
            if (r8 == 0) goto L_0x0258
            boolean r8 = r8.enabled     // Catch:{ NameNotFoundException -> 0x0258 }
            if (r8 == 0) goto L_0x0258
            r8 = 1
            goto L_0x0259
        L_0x0258:
            r8 = 0
        L_0x0259:
            if (r8 != 0) goto L_0x0265
            h5.i4.n(r9)
            java.lang.String r8 = "Service not registered/enabled"
            h5.e3 r10 = r9.A
            r10.a(r8)
        L_0x0265:
            r4.k()
            h5.i4.n(r9)
            java.lang.Long r8 = java.lang.Long.valueOf(r2)
            h5.e3 r9 = r9.B
            java.lang.String r10 = "Scheduling upload, millis"
            r9.b(r8, r10)
            r4.d r5 = r5.B
            r5.getClass()
            android.os.SystemClock.elapsedRealtime()
            h5.s2<java.lang.Long> r5 = h5.u2.w
            java.lang.Object r5 = r5.a(r7)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            r9 = 0
            long r7 = java.lang.Math.max(r9, r7)
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x02aa
            h5.j r5 = r4.l()
            long r7 = r5.f5479c
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x02a0
            r5 = 1
            goto L_0x02a1
        L_0x02a0:
            r5 = 0
        L_0x02a1:
            if (r5 != 0) goto L_0x02aa
            h5.j r5 = r4.l()
            r5.b(r2)
        L_0x02aa:
            android.content.ComponentName r5 = new android.content.ComponentName
            r5.<init>(r6, r0)
            int r0 = r4.m()
            android.os.PersistableBundle r4 = new android.os.PersistableBundle
            r4.<init>()
            java.lang.String r7 = "action"
            java.lang.String r8 = "com.google.android.gms.measurement.UPLOAD"
            r4.putString(r7, r8)
            android.app.job.JobInfo$Builder r7 = new android.app.job.JobInfo$Builder
            r7.<init>(r0, r5)
            android.app.job.JobInfo$Builder r0 = r7.setMinimumLatency(r2)
            long r2 = r2 + r2
            android.app.job.JobInfo$Builder r0 = r0.setOverrideDeadline(r2)
            android.app.job.JobInfo$Builder r0 = r0.setExtras(r4)
            android.app.job.JobInfo r2 = r0.build()
            java.lang.reflect.Method r0 = com.google.android.gms.internal.measurement.h0.f2727a
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r0 = r6.getSystemService(r0)
            r3 = r0
            android.app.job.JobScheduler r3 = (android.app.job.JobScheduler) r3
            r3.getClass()
            java.lang.reflect.Method r4 = com.google.android.gms.internal.measurement.h0.f2727a
            if (r4 == 0) goto L_0x0343
            java.lang.String r0 = "android.permission.UPDATE_DEVICE_STATS"
            int r0 = r6.checkSelfPermission(r0)
            if (r0 == 0) goto L_0x02f0
            goto L_0x0343
        L_0x02f0:
            java.lang.reflect.Method r0 = com.google.android.gms.internal.measurement.h0.f2728b
            if (r0 == 0) goto L_0x0317
            java.lang.Class<android.os.UserHandle> r5 = android.os.UserHandle.class
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ IllegalAccessException -> 0x0308, InvocationTargetException -> 0x0306 }
            java.lang.Object r0 = r0.invoke(r5, r7)     // Catch:{ IllegalAccessException -> 0x0308, InvocationTargetException -> 0x0306 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalAccessException -> 0x0308, InvocationTargetException -> 0x0306 }
            if (r0 == 0) goto L_0x0317
            int r6 = r0.intValue()     // Catch:{ IllegalAccessException -> 0x0308, InvocationTargetException -> 0x0306 }
            goto L_0x0318
        L_0x0306:
            r0 = move-exception
            goto L_0x0309
        L_0x0308:
            r0 = move-exception
        L_0x0309:
            java.lang.String r5 = "JobSchedulerCompat"
            r6 = 6
            boolean r6 = android.util.Log.isLoggable(r5, r6)
            if (r6 == 0) goto L_0x0317
            java.lang.String r6 = "myUserId invocation illegal"
            android.util.Log.e(r5, r6, r0)
        L_0x0317:
            r6 = 0
        L_0x0318:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r5 = "UploadAlarm"
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ IllegalAccessException -> 0x033d, InvocationTargetException -> 0x033b }
            r8 = 0
            r7[r8] = r2     // Catch:{ IllegalAccessException -> 0x033d, InvocationTargetException -> 0x033b }
            r8 = 1
            r7[r8] = r0     // Catch:{ IllegalAccessException -> 0x033d, InvocationTargetException -> 0x033b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ IllegalAccessException -> 0x033d, InvocationTargetException -> 0x033b }
            r6 = 2
            r7[r6] = r0     // Catch:{ IllegalAccessException -> 0x033d, InvocationTargetException -> 0x033b }
            r0 = 3
            r7[r0] = r5     // Catch:{ IllegalAccessException -> 0x033d, InvocationTargetException -> 0x033b }
            java.lang.Object r0 = r4.invoke(r3, r7)     // Catch:{ IllegalAccessException -> 0x033d, InvocationTargetException -> 0x033b }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalAccessException -> 0x033d, InvocationTargetException -> 0x033b }
            if (r0 == 0) goto L_0x0346
            r0.intValue()     // Catch:{ IllegalAccessException -> 0x033d, InvocationTargetException -> 0x033b }
            goto L_0x0346
        L_0x033b:
            r0 = move-exception
            goto L_0x033e
        L_0x033d:
            r0 = move-exception
        L_0x033e:
            java.lang.String r4 = "error calling scheduleAsPackage"
            android.util.Log.e(r5, r4, r0)
        L_0x0343:
            r3.schedule(r2)
        L_0x0346:
            return
        L_0x0347:
            h5.g3 r0 = r20.e()
            java.lang.String r2 = "No network"
            h5.e3 r0 = r0.B
            r0.a(r2)
            h5.n3 r0 = r20.H()
            h5.z6 r2 = r0.f5591a
            r2.K()
            h5.h4 r3 = r2.f()
            r3.g()
            boolean r3 = r0.f5592b
            if (r3 == 0) goto L_0x0367
            goto L_0x03ae
        L_0x0367:
            h5.i4 r3 = r2.f5856y
            android.content.Context r3 = r3.f5452o
            android.content.IntentFilter r4 = new android.content.IntentFilter
            java.lang.String r5 = "android.net.conn.CONNECTIVITY_CHANGE"
            r4.<init>(r5)
            r3.registerReceiver(r0, r4)
            h5.l3 r3 = r2.f5849p
            E(r3)
            boolean r3 = r3.k()
            r0.f5593c = r3
            h5.g3 r2 = r2.e()
            boolean r3 = r0.f5593c
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            h5.e3 r2 = r2.B
            java.lang.String r4 = "Registering connectivity change receiver. Network connected"
            r2.b(r3, r4)
            r2 = 1
            r0.f5592b = r2
            goto L_0x03ae
        L_0x0395:
            h5.g3 r0 = r20.e()
            java.lang.String r2 = "Next upload time is 0"
            goto L_0x03a2
        L_0x039c:
            h5.g3 r0 = r20.e()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
        L_0x03a2:
            h5.e3 r0 = r0.B
            r0.a(r2)
        L_0x03a7:
            h5.n3 r0 = r20.H()
            r0.a()
        L_0x03ae:
            h5.s6 r0 = r1.f5852s
            E(r0)
            r0.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.z6.z():void");
    }
}

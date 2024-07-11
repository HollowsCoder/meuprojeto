package h5;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.e1;
import com.google.android.gms.internal.measurement.k0;
import com.google.android.gms.internal.measurement.l2;
import com.google.android.gms.internal.measurement.m2;
import com.google.android.gms.internal.measurement.n2;
import com.google.android.gms.internal.measurement.o2;
import com.google.android.gms.internal.measurement.p2;
import com.google.android.gms.internal.measurement.p6;
import com.google.android.gms.internal.measurement.pb;
import com.google.android.gms.internal.measurement.s3;
import com.google.android.gms.internal.measurement.t3;
import java.util.Map;
import n.b;
import n4.m;
import q1.d;
import s6.a;

public final class c4 extends u6 implements d {

    /* renamed from: r  reason: collision with root package name */
    public final b f5303r = new b();

    /* renamed from: s  reason: collision with root package name */
    public final b f5304s = new b();

    /* renamed from: t  reason: collision with root package name */
    public final b f5305t = new b();
    public final b u = new b();

    /* renamed from: v  reason: collision with root package name */
    public final b f5306v = new b();
    public final b4 w = new b4(this);

    /* renamed from: x  reason: collision with root package name */
    public final j6 f5307x = new j6((q4) this);

    /* renamed from: y  reason: collision with root package name */
    public final b f5308y = new b();

    public c4(z6 z6Var) {
        super(z6Var);
    }

    public static final b u(o2 o2Var) {
        b bVar = new b();
        for (p2 p2Var : o2Var.v()) {
            bVar.put(p2Var.r(), p2Var.s());
        }
        return bVar;
    }

    public final String b(String str, String str2) {
        g();
        q(str);
        Map map = (Map) this.f5303r.getOrDefault(str, null);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final void i() {
    }

    public final o2 k(String str) {
        h();
        g();
        m.e(str);
        q(str);
        return (o2) this.u.getOrDefault(str, null);
    }

    public final boolean l(String str) {
        o2 o2Var;
        pb.a();
        if (!this.f5649o.u.m((String) null, u2.f5750z0) || TextUtils.isEmpty(str) || (o2Var = (o2) this.u.getOrDefault(str, null)) == null || o2Var.B() == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0366, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0367, code lost:
        r1.put("filter_id", r3);
        r1.put("event_name", r9.t());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0377, code lost:
        if (r9.B() == false) goto L_0x0382;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0379, code lost:
        r3 = java.lang.Boolean.valueOf(r9.C());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0382, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0383, code lost:
        r1.put("session_scoped", r3);
        r1.put("data", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0397, code lost:
        if (r10.y().insertWithOnConflict(r4, (java.lang.String) null, r1, 5) != -1) goto L_0x03a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0399, code lost:
        r1 = r6.w;
        h5.i4.n(r1);
        r1.f5397t.b(h5.g3.p(r29), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x03a9, code lost:
        r3 = r24;
        r8 = r25;
        r1 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x03b1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        r1 = r6.w;
        h5.i4.n(r1);
        r1 = r1.f5397t;
        r3 = "Error storing event filter. appId";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x03bd, code lost:
        r26 = r1;
        r0 = r0.t().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03cb, code lost:
        if (r0.hasNext() == false) goto L_0x04c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03cd, code lost:
        r1 = r0.next();
        r10.h();
        r10.g();
        n4.m.e(r29);
        n4.m.h(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x03e7, code lost:
        if (android.text.TextUtils.isEmpty(r1.t()) == false) goto L_0x0413;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03e9, code lost:
        r0 = r6.w;
        h5.i4.n(r0);
        r0 = r0.w;
        r5 = h5.g3.p(r29);
        r6 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03fe, code lost:
        if (r1.r() == false) goto L_0x0409;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0400, code lost:
        r1 = java.lang.Integer.valueOf(r1.s());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0409, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x040a, code lost:
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r5, r6, java.lang.String.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0413, code lost:
        r8 = r1.a();
        r9 = new android.content.ContentValues();
        r9.put(r3, r2);
        r25 = r0;
        r9.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x042c, code lost:
        if (r1.r() == false) goto L_0x0437;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x042e, code lost:
        r0 = java.lang.Integer.valueOf(r1.s());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0437, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0438, code lost:
        r9.put("filter_id", r0);
        r27 = r3;
        r9.put("property_name", r1.t());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x044a, code lost:
        if (r1.x() == false) goto L_0x0455;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x044c, code lost:
        r0 = java.lang.Boolean.valueOf(r1.y());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0455, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0456, code lost:
        r9.put("session_scoped", r0);
        r9.put("data", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x046a, code lost:
        if (r10.y().insertWithOnConflict("property_filters", (java.lang.String) null, r9, 5) != -1) goto L_0x047d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x046c, code lost:
        r0 = r6.w;
        h5.i4.n(r0);
        r0.f5397t.b(h5.g3.p(r29), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x047d, code lost:
        r0 = r25;
        r3 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0483, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        r1 = r6.w;
        h5.i4.n(r1);
        r1 = r1.f5397t;
        r3 = "Error storing property filter. appId";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x048d, code lost:
        r1.c(h5.g3.p(r29), r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0494, code lost:
        r10.h();
        r10.g();
        n4.m.e(r29);
        r0 = r10.y();
        r6 = r21;
        r0.delete("property_filters", r6, new java.lang.String[]{r2, java.lang.String.valueOf(r7)});
        r0.delete(r4, r6, new java.lang.String[]{r2, java.lang.String.valueOf(r7)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x04c1, code lost:
        r6 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x04c3, code lost:
        r21 = r6;
        r3 = r24;
        r1 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0628, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02b1, code lost:
        r8 = r0.t().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x02bd, code lost:
        if (r8.hasNext() == false) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x02c9, code lost:
        if (r8.next().r() != false) goto L_0x02b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02cb, code lost:
        r0 = r6.w;
        h5.i4.n(r0);
        r0 = r0.w;
        r5 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02d5, code lost:
        r0.c(h5.g3.p(r29), java.lang.Integer.valueOf(r7), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02de, code lost:
        r8 = r0.w().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02ea, code lost:
        r24 = r3;
        r3 = "app_id";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02f6, code lost:
        if (r8.hasNext() == false) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r9 = (com.google.android.gms.internal.measurement.y1) r8.next();
        r10.h();
        r10.g();
        n4.m.e(r29);
        n4.m.h(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0312, code lost:
        if (android.text.TextUtils.isEmpty(r9.t()) == false) goto L_0x0340;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0314, code lost:
        r0 = r6.w;
        h5.i4.n(r0);
        r0 = r0.w;
        r5 = h5.g3.p(r29);
        r6 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0329, code lost:
        if (r9.r() == false) goto L_0x0334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x032b, code lost:
        r8 = java.lang.Integer.valueOf(r9.s());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0334, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0335, code lost:
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r5, r6, java.lang.String.valueOf(r8));
        r26 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0340, code lost:
        r25 = r8;
        r8 = r9.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0346, code lost:
        r26 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        r1 = new android.content.ContentValues();
        r1.put(r3, r2);
        r1.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x035b, code lost:
        if (r9.r() == false) goto L_0x0366;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x035d, code lost:
        r3 = java.lang.Integer.valueOf(r9.s());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(java.lang.String r29, java.lang.String r30, byte[] r31) {
        /*
            r28 = this;
            r1 = r28
            r2 = r29
            r28.h()
            r28.g()
            n4.m.e(r29)
            r3 = r31
            com.google.android.gms.internal.measurement.o2 r0 = r1.t(r2, r3)
            com.google.android.gms.internal.measurement.b6 r0 = r0.n()
            r4 = r0
            com.google.android.gms.internal.measurement.n2 r4 = (com.google.android.gms.internal.measurement.n2) r4
            r1.r(r2, r4)
            com.google.android.gms.internal.measurement.pb.a()
            h5.i4 r5 = r1.f5649o
            h5.e r0 = r5.u
            h5.s2<java.lang.Boolean> r6 = h5.u2.f5750z0
            r7 = 0
            boolean r0 = r0.m(r7, r6)
            if (r0 == 0) goto L_0x0036
            com.google.android.gms.internal.measurement.f6 r0 = r4.j()
            com.google.android.gms.internal.measurement.o2 r0 = (com.google.android.gms.internal.measurement.o2) r0
            r1.s(r2, r0)
        L_0x0036:
            n.b r6 = r1.u
            com.google.android.gms.internal.measurement.f6 r0 = r4.j()
            com.google.android.gms.internal.measurement.o2 r0 = (com.google.android.gms.internal.measurement.o2) r0
            r6.put(r2, r0)
            n.b r0 = r1.f5308y
            r8 = r30
            r0.put(r2, r8)
            n.b r0 = r1.f5303r
            com.google.android.gms.internal.measurement.f6 r9 = r4.j()
            com.google.android.gms.internal.measurement.o2 r9 = (com.google.android.gms.internal.measurement.o2) r9
            n.b r9 = u(r9)
            r0.put(r2, r9)
            h5.z6 r9 = r1.f5701p
            h5.i r10 = r9.f5850q
            h5.z6.E(r10)
            java.util.ArrayList r11 = new java.util.ArrayList
            MessageType r0 = r4.f2635p
            com.google.android.gms.internal.measurement.o2 r0 = (com.google.android.gms.internal.measurement.o2) r0
            com.google.android.gms.internal.measurement.m6 r0 = r0.y()
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r11.<init>(r0)
            java.lang.String r12 = "app_id=? and audience_id=?"
            java.lang.String r0 = "app_id=?"
            java.lang.String r13 = "event_filters"
            java.lang.String r14 = "property_filters"
            r7 = 0
        L_0x0078:
            int r15 = r11.size()
            if (r7 >= r15) goto L_0x0215
            java.lang.Object r15 = r11.get(r7)
            com.google.android.gms.internal.measurement.w1 r15 = (com.google.android.gms.internal.measurement.w1) r15
            com.google.android.gms.internal.measurement.b6 r15 = r15.n()
            com.google.android.gms.internal.measurement.v1 r15 = (com.google.android.gms.internal.measurement.v1) r15
            MessageType r1 = r15.f2635p
            com.google.android.gms.internal.measurement.w1 r1 = (com.google.android.gms.internal.measurement.w1) r1
            int r1 = r1.x()
            if (r1 == 0) goto L_0x018b
            r3 = r15
            r1 = 0
        L_0x0096:
            MessageType r8 = r3.f2635p
            com.google.android.gms.internal.measurement.w1 r8 = (com.google.android.gms.internal.measurement.w1) r8
            int r8 = r8.x()
            if (r1 >= r8) goto L_0x017e
            MessageType r8 = r3.f2635p
            com.google.android.gms.internal.measurement.w1 r8 = (com.google.android.gms.internal.measurement.w1) r8
            com.google.android.gms.internal.measurement.y1 r8 = r8.y(r1)
            com.google.android.gms.internal.measurement.b6 r8 = r8.n()
            com.google.android.gms.internal.measurement.x1 r8 = (com.google.android.gms.internal.measurement.x1) r8
            com.google.android.gms.internal.measurement.b6 r16 = r8.clone()
            r17 = r6
            r6 = r16
            com.google.android.gms.internal.measurement.x1 r6 = (com.google.android.gms.internal.measurement.x1) r6
            r16 = r9
            MessageType r9 = r8.f2635p
            com.google.android.gms.internal.measurement.y1 r9 = (com.google.android.gms.internal.measurement.y1) r9
            java.lang.String r9 = r9.t()
            r18 = r5
            java.lang.String[] r5 = s6.a.J
            r19 = r4
            java.lang.String[] r4 = s6.a.L
            java.lang.String r4 = s6.a.n0(r9, r5, r4)
            if (r4 == 0) goto L_0x00e3
            boolean r5 = r6.f2636q
            if (r5 == 0) goto L_0x00da
            r6.m()
            r5 = 0
            r6.f2636q = r5
        L_0x00da:
            MessageType r5 = r6.f2635p
            com.google.android.gms.internal.measurement.y1 r5 = (com.google.android.gms.internal.measurement.y1) r5
            com.google.android.gms.internal.measurement.y1.F(r5, r4)
            r4 = 1
            goto L_0x00e4
        L_0x00e3:
            r4 = 0
        L_0x00e4:
            r5 = r4
            r4 = 0
        L_0x00e6:
            MessageType r9 = r8.f2635p
            com.google.android.gms.internal.measurement.y1 r9 = (com.google.android.gms.internal.measurement.y1) r9
            int r9 = r9.v()
            if (r4 >= r9) goto L_0x0145
            MessageType r9 = r8.f2635p
            com.google.android.gms.internal.measurement.y1 r9 = (com.google.android.gms.internal.measurement.y1) r9
            com.google.android.gms.internal.measurement.a2 r9 = r9.w(r4)
            r20 = r8
            java.lang.String r8 = r9.y()
            r21 = r12
            java.lang.String[] r12 = androidx.databinding.a.f1017q0
            r22 = r13
            java.lang.String[] r13 = androidx.databinding.a.f1019r0
            java.lang.String r8 = s6.a.n0(r8, r12, r13)
            if (r8 == 0) goto L_0x013c
            com.google.android.gms.internal.measurement.b6 r5 = r9.n()
            com.google.android.gms.internal.measurement.z1 r5 = (com.google.android.gms.internal.measurement.z1) r5
            boolean r9 = r5.f2636q
            if (r9 == 0) goto L_0x011d
            r5.m()
            r9 = 0
            r5.f2636q = r9
            goto L_0x011e
        L_0x011d:
            r9 = 0
        L_0x011e:
            MessageType r12 = r5.f2635p
            com.google.android.gms.internal.measurement.a2 r12 = (com.google.android.gms.internal.measurement.a2) r12
            com.google.android.gms.internal.measurement.a2.B(r12, r8)
            com.google.android.gms.internal.measurement.f6 r5 = r5.j()
            com.google.android.gms.internal.measurement.a2 r5 = (com.google.android.gms.internal.measurement.a2) r5
            boolean r8 = r6.f2636q
            if (r8 == 0) goto L_0x0134
            r6.m()
            r6.f2636q = r9
        L_0x0134:
            MessageType r8 = r6.f2635p
            com.google.android.gms.internal.measurement.y1 r8 = (com.google.android.gms.internal.measurement.y1) r8
            com.google.android.gms.internal.measurement.y1.G(r8, r4, r5)
            r5 = 1
        L_0x013c:
            int r4 = r4 + 1
            r8 = r20
            r12 = r21
            r13 = r22
            goto L_0x00e6
        L_0x0145:
            r21 = r12
            r22 = r13
            if (r5 == 0) goto L_0x016c
            boolean r4 = r3.f2636q
            if (r4 == 0) goto L_0x0155
            r3.m()
            r4 = 0
            r3.f2636q = r4
        L_0x0155:
            MessageType r3 = r3.f2635p
            com.google.android.gms.internal.measurement.w1 r3 = (com.google.android.gms.internal.measurement.w1) r3
            com.google.android.gms.internal.measurement.f6 r4 = r6.j()
            com.google.android.gms.internal.measurement.y1 r4 = (com.google.android.gms.internal.measurement.y1) r4
            com.google.android.gms.internal.measurement.w1.B(r3, r1, r4)
            com.google.android.gms.internal.measurement.f6 r3 = r15.j()
            com.google.android.gms.internal.measurement.w1 r3 = (com.google.android.gms.internal.measurement.w1) r3
            r11.set(r7, r3)
            r3 = r15
        L_0x016c:
            int r1 = r1 + 1
            r8 = r30
            r9 = r16
            r6 = r17
            r5 = r18
            r4 = r19
            r12 = r21
            r13 = r22
            goto L_0x0096
        L_0x017e:
            r19 = r4
            r18 = r5
            r17 = r6
            r16 = r9
            r21 = r12
            r22 = r13
            goto L_0x0198
        L_0x018b:
            r19 = r4
            r18 = r5
            r17 = r6
            r16 = r9
            r21 = r12
            r22 = r13
            r3 = r15
        L_0x0198:
            MessageType r1 = r3.f2635p
            com.google.android.gms.internal.measurement.w1 r1 = (com.google.android.gms.internal.measurement.w1) r1
            int r1 = r1.u()
            if (r1 == 0) goto L_0x01ff
            r1 = 0
        L_0x01a3:
            MessageType r4 = r3.f2635p
            com.google.android.gms.internal.measurement.w1 r4 = (com.google.android.gms.internal.measurement.w1) r4
            int r4 = r4.u()
            if (r1 >= r4) goto L_0x01ff
            MessageType r4 = r3.f2635p
            com.google.android.gms.internal.measurement.w1 r4 = (com.google.android.gms.internal.measurement.w1) r4
            com.google.android.gms.internal.measurement.g2 r4 = r4.v(r1)
            java.lang.String r5 = r4.t()
            java.lang.String[] r6 = s6.a.N
            java.lang.String[] r8 = s6.a.O
            java.lang.String r5 = s6.a.n0(r5, r6, r8)
            if (r5 == 0) goto L_0x01fc
            com.google.android.gms.internal.measurement.b6 r4 = r4.n()
            com.google.android.gms.internal.measurement.f2 r4 = (com.google.android.gms.internal.measurement.f2) r4
            boolean r6 = r4.f2636q
            if (r6 == 0) goto L_0x01d4
            r4.m()
            r6 = 0
            r4.f2636q = r6
            goto L_0x01d5
        L_0x01d4:
            r6 = 0
        L_0x01d5:
            MessageType r8 = r4.f2635p
            com.google.android.gms.internal.measurement.g2 r8 = (com.google.android.gms.internal.measurement.g2) r8
            com.google.android.gms.internal.measurement.g2.B(r8, r5)
            boolean r5 = r3.f2636q
            if (r5 == 0) goto L_0x01e5
            r3.m()
            r3.f2636q = r6
        L_0x01e5:
            MessageType r3 = r3.f2635p
            com.google.android.gms.internal.measurement.w1 r3 = (com.google.android.gms.internal.measurement.w1) r3
            com.google.android.gms.internal.measurement.f6 r4 = r4.j()
            com.google.android.gms.internal.measurement.g2 r4 = (com.google.android.gms.internal.measurement.g2) r4
            com.google.android.gms.internal.measurement.w1.A(r3, r1, r4)
            com.google.android.gms.internal.measurement.f6 r3 = r15.j()
            com.google.android.gms.internal.measurement.w1 r3 = (com.google.android.gms.internal.measurement.w1) r3
            r11.set(r7, r3)
            r3 = r15
        L_0x01fc:
            int r1 = r1 + 1
            goto L_0x01a3
        L_0x01ff:
            int r7 = r7 + 1
            r1 = r28
            r8 = r30
            r3 = r31
            r9 = r16
            r6 = r17
            r5 = r18
            r4 = r19
            r12 = r21
            r13 = r22
            goto L_0x0078
        L_0x0215:
            r19 = r4
            r18 = r5
            r17 = r6
            r16 = r9
            r21 = r12
            r22 = r13
            r10.h()
            r10.g()
            n4.m.e(r29)
            android.database.sqlite.SQLiteDatabase r1 = r10.y()
            r1.beginTransaction()
            r10.h()     // Catch:{ all -> 0x062a }
            r10.g()     // Catch:{ all -> 0x062a }
            n4.m.e(r29)     // Catch:{ all -> 0x062a }
            android.database.sqlite.SQLiteDatabase r3 = r10.y()     // Catch:{ all -> 0x062a }
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ all -> 0x062a }
            r6 = 0
            r5[r6] = r2     // Catch:{ all -> 0x062a }
            r3.delete(r14, r0, r5)     // Catch:{ all -> 0x062a }
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ all -> 0x062a }
            r5[r6] = r2     // Catch:{ all -> 0x062a }
            r4 = r22
            r3.delete(r4, r0, r5)     // Catch:{ all -> 0x062a }
            java.util.Iterator r3 = r11.iterator()     // Catch:{ all -> 0x062a }
        L_0x0254:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x062a }
            h5.i4 r6 = r10.f5649o
            if (r0 == 0) goto L_0x04cb
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x062a }
            com.google.android.gms.internal.measurement.w1 r0 = (com.google.android.gms.internal.measurement.w1) r0     // Catch:{ all -> 0x062a }
            r10.h()     // Catch:{ all -> 0x062a }
            r10.g()     // Catch:{ all -> 0x062a }
            n4.m.e(r29)     // Catch:{ all -> 0x062a }
            n4.m.h(r0)     // Catch:{ all -> 0x062a }
            boolean r7 = r0.r()     // Catch:{ all -> 0x062a }
            if (r7 != 0) goto L_0x0285
            h5.g3 r0 = r6.w     // Catch:{ all -> 0x062a }
            h5.i4.n(r0)     // Catch:{ all -> 0x062a }
            h5.e3 r0 = r0.w     // Catch:{ all -> 0x062a }
            java.lang.String r5 = "Audience with no ID. appId"
            h5.f3 r6 = h5.g3.p(r29)     // Catch:{ all -> 0x062a }
            r0.b(r6, r5)     // Catch:{ all -> 0x062a }
            goto L_0x0254
        L_0x0285:
            int r7 = r0.s()     // Catch:{ all -> 0x062a }
            com.google.android.gms.internal.measurement.m6 r8 = r0.w()     // Catch:{ all -> 0x062a }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x062a }
        L_0x0291:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x062a }
            if (r9 == 0) goto L_0x02b1
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x062a }
            com.google.android.gms.internal.measurement.y1 r9 = (com.google.android.gms.internal.measurement.y1) r9     // Catch:{ all -> 0x062a }
            boolean r9 = r9.r()     // Catch:{ all -> 0x062a }
            if (r9 != 0) goto L_0x0291
            h5.g3 r0 = r6.w     // Catch:{ all -> 0x062a }
            h5.i4.n(r0)     // Catch:{ all -> 0x062a }
            h5.e3 r0 = r0.w     // Catch:{ all -> 0x062a }
            java.lang.String r5 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
        L_0x02ac:
            h5.f3 r6 = h5.g3.p(r29)     // Catch:{ all -> 0x062a }
            goto L_0x02d5
        L_0x02b1:
            java.util.List r8 = r0.t()     // Catch:{ all -> 0x062a }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x062a }
        L_0x02b9:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x062a }
            if (r9 == 0) goto L_0x02de
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x062a }
            com.google.android.gms.internal.measurement.g2 r9 = (com.google.android.gms.internal.measurement.g2) r9     // Catch:{ all -> 0x062a }
            boolean r9 = r9.r()     // Catch:{ all -> 0x062a }
            if (r9 != 0) goto L_0x02b9
            h5.g3 r0 = r6.w     // Catch:{ all -> 0x062a }
            h5.i4.n(r0)     // Catch:{ all -> 0x062a }
            h5.e3 r0 = r0.w     // Catch:{ all -> 0x062a }
            java.lang.String r5 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            goto L_0x02ac
        L_0x02d5:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x062a }
            r0.c(r6, r7, r5)     // Catch:{ all -> 0x062a }
            goto L_0x0254
        L_0x02de:
            com.google.android.gms.internal.measurement.m6 r8 = r0.w()     // Catch:{ all -> 0x062a }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x062a }
        L_0x02e6:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x062a }
            java.lang.String r5 = "data"
            java.lang.String r12 = "session_scoped"
            java.lang.String r13 = "filter_id"
            java.lang.String r15 = "audience_id"
            r24 = r3
            java.lang.String r3 = "app_id"
            if (r9 == 0) goto L_0x03bd
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x062a }
            com.google.android.gms.internal.measurement.y1 r9 = (com.google.android.gms.internal.measurement.y1) r9     // Catch:{ all -> 0x062a }
            r10.h()     // Catch:{ all -> 0x062a }
            r10.g()     // Catch:{ all -> 0x062a }
            n4.m.e(r29)     // Catch:{ all -> 0x062a }
            n4.m.h(r9)     // Catch:{ all -> 0x062a }
            java.lang.String r25 = r9.t()     // Catch:{ all -> 0x062a }
            boolean r25 = android.text.TextUtils.isEmpty(r25)     // Catch:{ all -> 0x062a }
            if (r25 == 0) goto L_0x0340
            h5.g3 r0 = r6.w     // Catch:{ all -> 0x062a }
            h5.i4.n(r0)     // Catch:{ all -> 0x062a }
            h5.e3 r0 = r0.w     // Catch:{ all -> 0x062a }
            java.lang.String r3 = "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"
            h5.f3 r5 = h5.g3.p(r29)     // Catch:{ all -> 0x062a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x062a }
            boolean r8 = r9.r()     // Catch:{ all -> 0x062a }
            if (r8 == 0) goto L_0x0334
            int r8 = r9.s()     // Catch:{ all -> 0x062a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x062a }
            goto L_0x0335
        L_0x0334:
            r8 = 0
        L_0x0335:
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x062a }
            r0.d(r3, r5, r6, r8)     // Catch:{ all -> 0x062a }
            r26 = r1
            goto L_0x0494
        L_0x0340:
            r25 = r8
            byte[] r8 = r9.a()     // Catch:{ all -> 0x062a }
            r26 = r1
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x0628 }
            r1.<init>()     // Catch:{ all -> 0x0628 }
            r1.put(r3, r2)     // Catch:{ all -> 0x0628 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0628 }
            r1.put(r15, r3)     // Catch:{ all -> 0x0628 }
            boolean r3 = r9.r()     // Catch:{ all -> 0x0628 }
            if (r3 == 0) goto L_0x0366
            int r3 = r9.s()     // Catch:{ all -> 0x0628 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0628 }
            goto L_0x0367
        L_0x0366:
            r3 = 0
        L_0x0367:
            r1.put(r13, r3)     // Catch:{ all -> 0x0628 }
            java.lang.String r3 = "event_name"
            java.lang.String r13 = r9.t()     // Catch:{ all -> 0x0628 }
            r1.put(r3, r13)     // Catch:{ all -> 0x0628 }
            boolean r3 = r9.B()     // Catch:{ all -> 0x0628 }
            if (r3 == 0) goto L_0x0382
            boolean r3 = r9.C()     // Catch:{ all -> 0x0628 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0628 }
            goto L_0x0383
        L_0x0382:
            r3 = 0
        L_0x0383:
            r1.put(r12, r3)     // Catch:{ all -> 0x0628 }
            r1.put(r5, r8)     // Catch:{ all -> 0x0628 }
            android.database.sqlite.SQLiteDatabase r3 = r10.y()     // Catch:{ SQLiteException -> 0x03b1 }
            r5 = 5
            r8 = 0
            long r12 = r3.insertWithOnConflict(r4, r8, r1, r5)     // Catch:{ SQLiteException -> 0x03b1 }
            r8 = -1
            int r1 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x03a9
            h5.g3 r1 = r6.w     // Catch:{ SQLiteException -> 0x03b1 }
            h5.i4.n(r1)     // Catch:{ SQLiteException -> 0x03b1 }
            h5.e3 r1 = r1.f5397t     // Catch:{ SQLiteException -> 0x03b1 }
            java.lang.String r3 = "Failed to insert event filter (got -1). appId"
            h5.f3 r5 = h5.g3.p(r29)     // Catch:{ SQLiteException -> 0x03b1 }
            r1.b(r5, r3)     // Catch:{ SQLiteException -> 0x03b1 }
        L_0x03a9:
            r3 = r24
            r8 = r25
            r1 = r26
            goto L_0x02e6
        L_0x03b1:
            r0 = move-exception
            h5.g3 r1 = r6.w     // Catch:{ all -> 0x0628 }
            h5.i4.n(r1)     // Catch:{ all -> 0x0628 }
            h5.e3 r1 = r1.f5397t     // Catch:{ all -> 0x0628 }
            java.lang.String r3 = "Error storing event filter. appId"
            goto L_0x048d
        L_0x03bd:
            r26 = r1
            java.util.List r0 = r0.t()     // Catch:{ all -> 0x0628 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0628 }
        L_0x03c7:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0628 }
            if (r1 == 0) goto L_0x04c1
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0628 }
            com.google.android.gms.internal.measurement.g2 r1 = (com.google.android.gms.internal.measurement.g2) r1     // Catch:{ all -> 0x0628 }
            r10.h()     // Catch:{ all -> 0x0628 }
            r10.g()     // Catch:{ all -> 0x0628 }
            n4.m.e(r29)     // Catch:{ all -> 0x0628 }
            n4.m.h(r1)     // Catch:{ all -> 0x0628 }
            java.lang.String r8 = r1.t()     // Catch:{ all -> 0x0628 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0628 }
            if (r8 == 0) goto L_0x0413
            h5.g3 r0 = r6.w     // Catch:{ all -> 0x0628 }
            h5.i4.n(r0)     // Catch:{ all -> 0x0628 }
            h5.e3 r0 = r0.w     // Catch:{ all -> 0x0628 }
            java.lang.String r3 = "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"
            h5.f3 r5 = h5.g3.p(r29)     // Catch:{ all -> 0x0628 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0628 }
            boolean r8 = r1.r()     // Catch:{ all -> 0x0628 }
            if (r8 == 0) goto L_0x0409
            int r1 = r1.s()     // Catch:{ all -> 0x0628 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0628 }
            goto L_0x040a
        L_0x0409:
            r1 = 0
        L_0x040a:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0628 }
            r0.d(r3, r5, r6, r1)     // Catch:{ all -> 0x0628 }
            goto L_0x0494
        L_0x0413:
            byte[] r8 = r1.a()     // Catch:{ all -> 0x0628 }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0628 }
            r9.<init>()     // Catch:{ all -> 0x0628 }
            r9.put(r3, r2)     // Catch:{ all -> 0x0628 }
            r25 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0628 }
            r9.put(r15, r0)     // Catch:{ all -> 0x0628 }
            boolean r0 = r1.r()     // Catch:{ all -> 0x0628 }
            if (r0 == 0) goto L_0x0437
            int r0 = r1.s()     // Catch:{ all -> 0x0628 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0628 }
            goto L_0x0438
        L_0x0437:
            r0 = 0
        L_0x0438:
            r9.put(r13, r0)     // Catch:{ all -> 0x0628 }
            java.lang.String r0 = "property_name"
            r27 = r3
            java.lang.String r3 = r1.t()     // Catch:{ all -> 0x0628 }
            r9.put(r0, r3)     // Catch:{ all -> 0x0628 }
            boolean r0 = r1.x()     // Catch:{ all -> 0x0628 }
            if (r0 == 0) goto L_0x0455
            boolean r0 = r1.y()     // Catch:{ all -> 0x0628 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0628 }
            goto L_0x0456
        L_0x0455:
            r0 = 0
        L_0x0456:
            r9.put(r12, r0)     // Catch:{ all -> 0x0628 }
            r9.put(r5, r8)     // Catch:{ all -> 0x0628 }
            android.database.sqlite.SQLiteDatabase r0 = r10.y()     // Catch:{ SQLiteException -> 0x0483 }
            r1 = 5
            r3 = 0
            long r8 = r0.insertWithOnConflict(r14, r3, r9, r1)     // Catch:{ SQLiteException -> 0x0483 }
            r22 = -1
            int r0 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1))
            if (r0 != 0) goto L_0x047d
            h5.g3 r0 = r6.w     // Catch:{ SQLiteException -> 0x0483 }
            h5.i4.n(r0)     // Catch:{ SQLiteException -> 0x0483 }
            h5.e3 r0 = r0.f5397t     // Catch:{ SQLiteException -> 0x0483 }
            java.lang.String r1 = "Failed to insert property filter (got -1). appId"
            h5.f3 r3 = h5.g3.p(r29)     // Catch:{ SQLiteException -> 0x0483 }
            r0.b(r3, r1)     // Catch:{ SQLiteException -> 0x0483 }
            goto L_0x0494
        L_0x047d:
            r0 = r25
            r3 = r27
            goto L_0x03c7
        L_0x0483:
            r0 = move-exception
            h5.g3 r1 = r6.w     // Catch:{ all -> 0x0628 }
            h5.i4.n(r1)     // Catch:{ all -> 0x0628 }
            h5.e3 r1 = r1.f5397t     // Catch:{ all -> 0x0628 }
            java.lang.String r3 = "Error storing property filter. appId"
        L_0x048d:
            h5.f3 r5 = h5.g3.p(r29)     // Catch:{ all -> 0x0628 }
            r1.c(r5, r0, r3)     // Catch:{ all -> 0x0628 }
        L_0x0494:
            r10.h()     // Catch:{ all -> 0x0628 }
            r10.g()     // Catch:{ all -> 0x0628 }
            n4.m.e(r29)     // Catch:{ all -> 0x0628 }
            android.database.sqlite.SQLiteDatabase r0 = r10.y()     // Catch:{ all -> 0x0628 }
            r1 = 2
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ all -> 0x0628 }
            r5 = 0
            r3[r5] = r2     // Catch:{ all -> 0x0628 }
            java.lang.String r6 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0628 }
            r8 = 1
            r3[r8] = r6     // Catch:{ all -> 0x0628 }
            r6 = r21
            r0.delete(r14, r6, r3)     // Catch:{ all -> 0x0628 }
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x0628 }
            r1[r5] = r2     // Catch:{ all -> 0x0628 }
            java.lang.String r3 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0628 }
            r1[r8] = r3     // Catch:{ all -> 0x0628 }
            r0.delete(r4, r6, r1)     // Catch:{ all -> 0x0628 }
            goto L_0x04c3
        L_0x04c1:
            r6 = r21
        L_0x04c3:
            r21 = r6
            r3 = r24
            r1 = r26
            goto L_0x0254
        L_0x04cb:
            r26 = r1
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0628 }
            r0.<init>()     // Catch:{ all -> 0x0628 }
            java.util.Iterator r1 = r11.iterator()     // Catch:{ all -> 0x0628 }
        L_0x04d6:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0628 }
            if (r3 == 0) goto L_0x04f6
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0628 }
            com.google.android.gms.internal.measurement.w1 r3 = (com.google.android.gms.internal.measurement.w1) r3     // Catch:{ all -> 0x0628 }
            boolean r4 = r3.r()     // Catch:{ all -> 0x0628 }
            if (r4 == 0) goto L_0x04f1
            int r3 = r3.s()     // Catch:{ all -> 0x0628 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0628 }
            goto L_0x04f2
        L_0x04f1:
            r8 = 0
        L_0x04f2:
            r0.add(r8)     // Catch:{ all -> 0x0628 }
            goto L_0x04d6
        L_0x04f6:
            n4.m.e(r29)     // Catch:{ all -> 0x0628 }
            r10.h()     // Catch:{ all -> 0x0628 }
            r10.g()     // Catch:{ all -> 0x0628 }
            android.database.sqlite.SQLiteDatabase r1 = r10.y()     // Catch:{ all -> 0x0628 }
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x05a4 }
            r3 = 0
            r4[r3] = r2     // Catch:{ SQLiteException -> 0x05a4 }
            java.lang.String r3 = "select count(1) from audience_filter_values where app_id=?"
            long r3 = r10.t(r3, r4)     // Catch:{ SQLiteException -> 0x05a4 }
            h5.e r5 = r6.u     // Catch:{ all -> 0x0628 }
            h5.s2<java.lang.Integer> r6 = h5.u2.E     // Catch:{ all -> 0x0628 }
            int r5 = r5.l(r2, r6)     // Catch:{ all -> 0x0628 }
            r6 = 2000(0x7d0, float:2.803E-42)
            int r5 = java.lang.Math.min(r6, r5)     // Catch:{ all -> 0x0628 }
            r6 = 0
            int r5 = java.lang.Math.max(r6, r5)     // Catch:{ all -> 0x0628 }
            long r6 = (long) r5     // Catch:{ all -> 0x0628 }
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x0529
            goto L_0x05b5
        L_0x0529:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0628 }
            r3.<init>()     // Catch:{ all -> 0x0628 }
            r4 = 0
        L_0x052f:
            int r6 = r0.size()     // Catch:{ all -> 0x0628 }
            if (r4 >= r6) goto L_0x054b
            java.lang.Object r6 = r0.get(r4)     // Catch:{ all -> 0x0628 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0628 }
            if (r6 == 0) goto L_0x05b5
            int r6 = r6.intValue()     // Catch:{ all -> 0x0628 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0628 }
            r3.add(r6)     // Catch:{ all -> 0x0628 }
            int r4 = r4 + 1
            goto L_0x052f
        L_0x054b:
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r3)     // Catch:{ all -> 0x0628 }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0628 }
            int r3 = r3.length()     // Catch:{ all -> 0x0628 }
            r4 = 2
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0628 }
            r4.<init>(r3)     // Catch:{ all -> 0x0628 }
            java.lang.String r3 = "("
            r4.append(r3)     // Catch:{ all -> 0x0628 }
            r4.append(r0)     // Catch:{ all -> 0x0628 }
            java.lang.String r0 = ")"
            r4.append(r0)     // Catch:{ all -> 0x0628 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0628 }
            java.lang.String r3 = "audience_filter_values"
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0628 }
            int r4 = r4.length()     // Catch:{ all -> 0x0628 }
            int r4 = r4 + 140
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0628 }
            r6.<init>(r4)     // Catch:{ all -> 0x0628 }
            java.lang.String r4 = "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "
            r6.append(r4)     // Catch:{ all -> 0x0628 }
            r6.append(r0)     // Catch:{ all -> 0x0628 }
            java.lang.String r0 = " order by rowid desc limit -1 offset ?)"
            r6.append(r0)     // Catch:{ all -> 0x0628 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0628 }
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x0628 }
            r6 = 0
            r4[r6] = r2     // Catch:{ all -> 0x0628 }
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch:{ all -> 0x0628 }
            r6 = 1
            r4[r6] = r5     // Catch:{ all -> 0x0628 }
            r1.delete(r3, r0, r4)     // Catch:{ all -> 0x0628 }
            goto L_0x05b5
        L_0x05a4:
            r0 = move-exception
            h5.g3 r1 = r6.w     // Catch:{ all -> 0x0628 }
            h5.i4.n(r1)     // Catch:{ all -> 0x0628 }
            h5.e3 r1 = r1.f5397t     // Catch:{ all -> 0x0628 }
            java.lang.String r3 = "Database error querying filters. appId"
            h5.f3 r4 = h5.g3.p(r29)     // Catch:{ all -> 0x0628 }
            r1.c(r4, r0, r3)     // Catch:{ all -> 0x0628 }
        L_0x05b5:
            r26.setTransactionSuccessful()     // Catch:{ all -> 0x0628 }
            r26.endTransaction()
            r1 = r19
            boolean r0 = r1.f2636q     // Catch:{ RuntimeException -> 0x05db }
            if (r0 == 0) goto L_0x05c7
            r1.m()     // Catch:{ RuntimeException -> 0x05db }
            r3 = 0
            r1.f2636q = r3     // Catch:{ RuntimeException -> 0x05db }
        L_0x05c7:
            MessageType r0 = r1.f2635p     // Catch:{ RuntimeException -> 0x05db }
            com.google.android.gms.internal.measurement.o2 r0 = (com.google.android.gms.internal.measurement.o2) r0     // Catch:{ RuntimeException -> 0x05db }
            com.google.android.gms.internal.measurement.o2.G(r0)     // Catch:{ RuntimeException -> 0x05db }
            com.google.android.gms.internal.measurement.f6 r0 = r1.j()     // Catch:{ RuntimeException -> 0x05db }
            com.google.android.gms.internal.measurement.o2 r0 = (com.google.android.gms.internal.measurement.o2) r0     // Catch:{ RuntimeException -> 0x05db }
            byte[] r0 = r0.a()     // Catch:{ RuntimeException -> 0x05db }
            r3 = r18
            goto L_0x05f0
        L_0x05db:
            r0 = move-exception
            r3 = r18
            h5.g3 r4 = r3.w
            h5.i4.n(r4)
            h5.f3 r5 = h5.g3.p(r29)
            h5.e3 r4 = r4.w
            java.lang.String r6 = "Unable to serialize reduced-size config. Storing full config instead. appId"
            r4.c(r5, r0, r6)
            r0 = r31
        L_0x05f0:
            com.google.android.gms.internal.measurement.jb r4 = com.google.android.gms.internal.measurement.jb.f2761p
            com.google.android.gms.internal.measurement.r4<com.google.android.gms.internal.measurement.kb> r4 = r4.f2762o
            java.lang.Object r4 = r4.zza()
            com.google.android.gms.internal.measurement.kb r4 = (com.google.android.gms.internal.measurement.kb) r4
            r4.zza()
            h5.e r3 = r3.u
            h5.s2<java.lang.Boolean> r4 = h5.u2.x0
            r5 = 0
            boolean r3 = r3.m(r5, r4)
            if (r3 == 0) goto L_0x0612
            r3 = r16
            h5.i r3 = r3.f5850q
            h5.z6.E(r3)
            r5 = r30
            goto L_0x0619
        L_0x0612:
            r3 = r16
            h5.i r3 = r3.f5850q
            h5.z6.E(r3)
        L_0x0619:
            r3.P(r2, r5, r0)
            com.google.android.gms.internal.measurement.f6 r0 = r1.j()
            com.google.android.gms.internal.measurement.o2 r0 = (com.google.android.gms.internal.measurement.o2) r0
            r1 = r17
            r1.put(r2, r0)
            return
        L_0x0628:
            r0 = move-exception
            goto L_0x062d
        L_0x062a:
            r0 = move-exception
            r26 = r1
        L_0x062d:
            r26.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.c4.m(java.lang.String, java.lang.String, byte[]):void");
    }

    public final boolean n(String str, String str2) {
        Boolean bool;
        g();
        q(str);
        if ("1".equals(b(str, "measurement.upload.blacklist_internal")) && g7.A(str2)) {
            return true;
        }
        if ("1".equals(b(str, "measurement.upload.blacklist_public")) && g7.Y(str2)) {
            return true;
        }
        Map map = (Map) this.f5304s.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean o(String str, String str2) {
        Boolean bool;
        g();
        q(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f5305t.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final int p(String str, String str2) {
        Integer num;
        g();
        q(str);
        Map map = (Map) this.f5306v.getOrDefault(str, null);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0089, code lost:
        if (r4 != null) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(java.lang.String r14) {
        /*
            r13 = this;
            r13.h()
            r13.g()
            n4.m.e(r14)
            n.b r0 = r13.u
            r1 = 0
            java.lang.Object r2 = r0.getOrDefault(r14, r1)
            if (r2 != 0) goto L_0x0118
            h5.z6 r2 = r13.f5701p
            h5.i r2 = r2.f5850q
            h5.z6.E(r2)
            h5.i4 r3 = r2.f5649o
            n4.m.e(r14)
            r2.g()
            r2.h()
            android.database.sqlite.SQLiteDatabase r4 = r2.y()     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            java.lang.String r2 = "remote_config"
            java.lang.String r5 = "config_last_modified_time"
            java.lang.String[] r6 = new java.lang.String[]{r2, r5}     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            r2 = 1
            java.lang.String[] r8 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            r12 = 0
            r8[r12] = r14     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            java.lang.String r5 = "apps"
            java.lang.String r7 = "app_id=?"
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0072 }
            if (r5 != 0) goto L_0x0048
            goto L_0x008b
        L_0x0048:
            byte[] r5 = r4.getBlob(r12)     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.String r2 = r4.getString(r2)     // Catch:{ SQLiteException -> 0x0072 }
            boolean r6 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0072 }
            if (r6 == 0) goto L_0x0066
            h5.g3 r6 = r3.w     // Catch:{ SQLiteException -> 0x0072 }
            h5.i4.n(r6)     // Catch:{ SQLiteException -> 0x0072 }
            h5.e3 r6 = r6.f5397t     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.String r7 = "Got multiple records for app config, expected one. appId"
            h5.f3 r8 = h5.g3.p(r14)     // Catch:{ SQLiteException -> 0x0072 }
            r6.b(r8, r7)     // Catch:{ SQLiteException -> 0x0072 }
        L_0x0066:
            if (r5 != 0) goto L_0x0069
            goto L_0x008b
        L_0x0069:
            android.util.Pair r6 = new android.util.Pair     // Catch:{ SQLiteException -> 0x0072 }
            r6.<init>(r5, r2)     // Catch:{ SQLiteException -> 0x0072 }
            r4.close()
            goto L_0x008f
        L_0x0072:
            r2 = move-exception
            goto L_0x0079
        L_0x0074:
            r14 = move-exception
            goto L_0x0112
        L_0x0077:
            r2 = move-exception
            r4 = r1
        L_0x0079:
            h5.g3 r3 = r3.w     // Catch:{ all -> 0x0110 }
            h5.i4.n(r3)     // Catch:{ all -> 0x0110 }
            h5.e3 r3 = r3.f5397t     // Catch:{ all -> 0x0110 }
            java.lang.String r5 = "Error querying remote config. appId"
            h5.f3 r6 = h5.g3.p(r14)     // Catch:{ all -> 0x0110 }
            r3.c(r6, r2, r5)     // Catch:{ all -> 0x0110 }
            if (r4 == 0) goto L_0x008e
        L_0x008b:
            r4.close()
        L_0x008e:
            r6 = r1
        L_0x008f:
            n.b r2 = r13.f5303r
            n.b r3 = r13.f5308y
            if (r6 != 0) goto L_0x00ae
            r2.put(r14, r1)
            n.b r2 = r13.f5304s
            r2.put(r14, r1)
            n.b r2 = r13.f5305t
            r2.put(r14, r1)
            r0.put(r14, r1)
            r3.put(r14, r1)
            n.b r0 = r13.f5306v
            r0.put(r14, r1)
            return
        L_0x00ae:
            java.lang.Object r4 = r6.first
            byte[] r4 = (byte[]) r4
            com.google.android.gms.internal.measurement.o2 r4 = r13.t(r14, r4)
            com.google.android.gms.internal.measurement.b6 r4 = r4.n()
            com.google.android.gms.internal.measurement.n2 r4 = (com.google.android.gms.internal.measurement.n2) r4
            r13.r(r14, r4)
            com.google.android.gms.internal.measurement.f6 r5 = r4.j()
            com.google.android.gms.internal.measurement.o2 r5 = (com.google.android.gms.internal.measurement.o2) r5
            n.b r5 = u(r5)
            r2.put(r14, r5)
            com.google.android.gms.internal.measurement.f6 r2 = r4.j()
            com.google.android.gms.internal.measurement.o2 r2 = (com.google.android.gms.internal.measurement.o2) r2
            r0.put(r14, r2)
            com.google.android.gms.internal.measurement.pb.a()
            h5.i4 r0 = r13.f5649o
            h5.e r2 = r0.u
            h5.s2<java.lang.Boolean> r5 = h5.u2.f5750z0
            boolean r2 = r2.m(r1, r5)
            if (r2 == 0) goto L_0x00ed
            com.google.android.gms.internal.measurement.f6 r2 = r4.j()
            com.google.android.gms.internal.measurement.o2 r2 = (com.google.android.gms.internal.measurement.o2) r2
            r13.s(r14, r2)
        L_0x00ed:
            com.google.android.gms.internal.measurement.jb r2 = com.google.android.gms.internal.measurement.jb.f2761p
            com.google.android.gms.internal.measurement.r4<com.google.android.gms.internal.measurement.kb> r2 = r2.f2762o
            java.lang.Object r2 = r2.zza()
            com.google.android.gms.internal.measurement.kb r2 = (com.google.android.gms.internal.measurement.kb) r2
            r2.zza()
            h5.e r0 = r0.u
            h5.s2<java.lang.Boolean> r2 = h5.u2.x0
            boolean r0 = r0.m(r1, r2)
            if (r0 == 0) goto L_0x010c
            java.lang.Object r0 = r6.second
            java.lang.String r0 = (java.lang.String) r0
            r3.put(r14, r0)
            return
        L_0x010c:
            r3.put(r14, r1)
            return
        L_0x0110:
            r14 = move-exception
            r1 = r4
        L_0x0112:
            if (r1 == 0) goto L_0x0117
            r1.close()
        L_0x0117:
            throw r14
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.c4.q(java.lang.String):void");
    }

    public final void r(String str, n2 n2Var) {
        b bVar = new b();
        b bVar2 = new b();
        b bVar3 = new b();
        for (int i10 = 0; i10 < ((o2) n2Var.f2635p).w(); i10++) {
            l2 l2Var = (l2) ((o2) n2Var.f2635p).x(i10).n();
            boolean isEmpty = TextUtils.isEmpty(l2Var.q());
            i4 i4Var = this.f5649o;
            if (isEmpty) {
                g3 g3Var = i4Var.w;
                i4.n(g3Var);
                g3Var.w.a("EventConfig contained null event name");
            } else {
                String q10 = l2Var.q();
                String n02 = a.n0(l2Var.q(), a.J, a.L);
                if (!TextUtils.isEmpty(n02)) {
                    if (l2Var.f2636q) {
                        l2Var.m();
                        l2Var.f2636q = false;
                    }
                    m2.x((m2) l2Var.f2635p, n02);
                    if (n2Var.f2636q) {
                        n2Var.m();
                        n2Var.f2636q = false;
                    }
                    o2.F((o2) n2Var.f2635p, i10, (m2) l2Var.j());
                }
                bVar.put(q10, Boolean.valueOf(((m2) l2Var.f2635p).s()));
                bVar2.put(l2Var.q(), Boolean.valueOf(((m2) l2Var.f2635p).t()));
                if (((m2) l2Var.f2635p).u()) {
                    if (((m2) l2Var.f2635p).v() < 2 || ((m2) l2Var.f2635p).v() > 65535) {
                        g3 g3Var2 = i4Var.w;
                        i4.n(g3Var2);
                        g3Var2.w.c(l2Var.q(), Integer.valueOf(((m2) l2Var.f2635p).v()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        bVar3.put(l2Var.q(), Integer.valueOf(((m2) l2Var.f2635p).v()));
                    }
                }
            }
        }
        this.f5304s.put(str, bVar);
        this.f5305t.put(str, bVar2);
        this.f5306v.put(str, bVar3);
    }

    public final void s(String str, o2 o2Var) {
        if (o2Var.B() != 0) {
            g3 g3Var = this.f5649o.w;
            i4.n(g3Var);
            g3Var.B.b(Integer.valueOf(o2Var.B()), "EES programs found");
            t3 t3Var = o2Var.A().get(0);
            try {
                k0 k0Var = new k0();
                ((Map) ((d) k0Var.f2763a.d).f8213p).put("internal.remoteConfig", new z3(str, 0, this));
                ((Map) ((d) k0Var.f2763a.d).f8213p).put("internal.logger", new a4(this));
                k0Var.b(t3Var);
                this.w.c(str, k0Var);
                g3 g3Var2 = this.f5649o.w;
                i4.n(g3Var2);
                g3Var2.B.c(str, Integer.valueOf(t3Var.s().s()), "EES program loaded for appId, activities");
                for (s3 r5 : t3Var.s().r()) {
                    g3 g3Var3 = this.f5649o.w;
                    i4.n(g3Var3);
                    g3Var3.B.b(r5.r(), "EES program activity");
                }
            } catch (e1 unused) {
                g3 g3Var4 = this.f5649o.w;
                i4.n(g3Var4);
                g3Var4.f5397t.b(str, "Failed to load EES program. appId");
            }
        } else {
            b4 b4Var = this.w;
            if (str != null) {
                synchronized (b4Var) {
                    if (b4Var.f7309a.remove(str) != null) {
                        b4Var.f7310b--;
                    }
                }
                return;
            }
            b4Var.getClass();
            throw new NullPointerException("key == null");
        }
    }

    public final o2 t(String str, byte[] bArr) {
        Long l;
        i4 i4Var = this.f5649o;
        if (bArr == null) {
            return o2.D();
        }
        try {
            o2 o2Var = (o2) ((n2) b7.E(o2.C(), bArr)).j();
            g3 g3Var = i4Var.w;
            i4.n(g3Var);
            e3 e3Var = g3Var.B;
            String str2 = null;
            if (o2Var.r()) {
                l = Long.valueOf(o2Var.s());
            } else {
                l = null;
            }
            if (o2Var.t()) {
                str2 = o2Var.u();
            }
            e3Var.c(l, str2, "Parsed config. version, gmp_app_id");
            return o2Var;
        } catch (p6 | RuntimeException e10) {
            g3 g3Var2 = i4Var.w;
            i4.n(g3Var2);
            g3Var2.w.c(g3.p(str), e10, "Unable to merge remote config. appId");
            return o2.D();
        }
    }
}

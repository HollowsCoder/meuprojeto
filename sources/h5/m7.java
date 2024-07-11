package h5;

import com.google.android.gms.internal.measurement.x2;

public final class m7 {

    /* renamed from: a  reason: collision with root package name */
    public x2 f5584a;

    /* renamed from: b  reason: collision with root package name */
    public Long f5585b;

    /* renamed from: c  reason: collision with root package name */
    public long f5586c;
    public final /* synthetic */ q7 d;

    public /* synthetic */ m7(q7 q7Var) {
        this.d = q7Var;
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [java.io.Serializable] */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e5, code lost:
        if (r2 == null) goto L_0x00ea;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.x2 a(com.google.android.gms.internal.measurement.x2 r23, java.lang.String r24) {
        /*
            r22 = this;
            r1 = r22
            r8 = r23
            r3 = r24
            java.lang.String r0 = r23.u()
            java.util.List r9 = r23.r()
            h5.q7 r2 = r1.d
            h5.z6 r4 = r2.f5701p
            r4.I()
            java.lang.String r4 = "_eid"
            java.io.Serializable r5 = h5.b7.l(r8, r4)
            java.lang.Long r5 = (java.lang.Long) r5
            r10 = 0
            if (r5 == 0) goto L_0x01f8
            java.lang.String r6 = "_ep"
            boolean r6 = r0.equals(r6)
            h5.i4 r11 = r2.f5649o
            h5.z6 r12 = r2.f5701p
            if (r6 == 0) goto L_0x01b9
            r12.I()
            java.lang.String r0 = "_en"
            java.io.Serializable r0 = h5.b7.l(r8, r0)
            r15 = r0
            java.lang.String r15 = (java.lang.String) r15
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            r2 = 0
            if (r0 == 0) goto L_0x004c
            h5.g3 r0 = r11.w
            h5.i4.n(r0)
            java.lang.String r3 = "Extra parameter without an event name. eventId"
            h5.e3 r0 = r0.u
            r0.b(r5, r3)
            return r2
        L_0x004c:
            com.google.android.gms.internal.measurement.x2 r0 = r1.f5584a
            r6 = 1
            if (r0 == 0) goto L_0x0063
            java.lang.Long r0 = r1.f5585b
            if (r0 == 0) goto L_0x0063
            long r16 = r5.longValue()
            java.lang.Long r0 = r1.f5585b
            long r18 = r0.longValue()
            int r0 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x010e
        L_0x0063:
            h5.i r0 = r12.f5850q
            h5.z6.E(r0)
            h5.i4 r7 = r0.f5649o
            r0.g()
            r0.h()
            android.database.sqlite.SQLiteDatabase r0 = r0.y()     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d3 }
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d3 }
            r2[r10] = r3     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d3 }
            java.lang.String r17 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d3 }
            r2[r6] = r17     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d3 }
            java.lang.String r13 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            android.database.Cursor r2 = r0.rawQuery(r13, r2)     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d3 }
            boolean r0 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x00bf }
            if (r0 != 0) goto L_0x0098
            h5.g3 r0 = r7.w     // Catch:{ SQLiteException -> 0x00bf }
            h5.i4.n(r0)     // Catch:{ SQLiteException -> 0x00bf }
            h5.e3 r0 = r0.B     // Catch:{ SQLiteException -> 0x00bf }
            java.lang.String r13 = "Main event not found"
            r0.a(r13)     // Catch:{ SQLiteException -> 0x00bf }
            goto L_0x00e7
        L_0x0098:
            byte[] r0 = r2.getBlob(r10)     // Catch:{ SQLiteException -> 0x00bf }
            long r13 = r2.getLong(r6)     // Catch:{ SQLiteException -> 0x00bf }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteException -> 0x00bf }
            com.google.android.gms.internal.measurement.w2 r14 = com.google.android.gms.internal.measurement.x2.B()     // Catch:{ IOException -> 0x00c1 }
            com.google.android.gms.internal.measurement.b6 r0 = h5.b7.E(r14, r0)     // Catch:{ IOException -> 0x00c1 }
            com.google.android.gms.internal.measurement.w2 r0 = (com.google.android.gms.internal.measurement.w2) r0     // Catch:{ IOException -> 0x00c1 }
            com.google.android.gms.internal.measurement.f6 r0 = r0.j()     // Catch:{ IOException -> 0x00c1 }
            com.google.android.gms.internal.measurement.x2 r0 = (com.google.android.gms.internal.measurement.x2) r0     // Catch:{ IOException -> 0x00c1 }
            android.util.Pair r0 = android.util.Pair.create(r0, r13)     // Catch:{ SQLiteException -> 0x00bf }
            r2.close()
            goto L_0x00eb
        L_0x00bc:
            r0 = move-exception
            goto L_0x01b3
        L_0x00bf:
            r0 = move-exception
            goto L_0x00d9
        L_0x00c1:
            r0 = move-exception
            h5.g3 r13 = r7.w     // Catch:{ SQLiteException -> 0x00bf }
            h5.i4.n(r13)     // Catch:{ SQLiteException -> 0x00bf }
            h5.e3 r13 = r13.f5397t     // Catch:{ SQLiteException -> 0x00bf }
            java.lang.String r14 = "Failed to merge main event. appId, eventId"
            h5.f3 r10 = h5.g3.p(r24)     // Catch:{ SQLiteException -> 0x00bf }
            r13.d(r14, r10, r5, r0)     // Catch:{ SQLiteException -> 0x00bf }
            goto L_0x00e7
        L_0x00d3:
            r0 = move-exception
            r2 = 0
            goto L_0x01b3
        L_0x00d7:
            r0 = move-exception
            r2 = 0
        L_0x00d9:
            h5.g3 r7 = r7.w     // Catch:{ all -> 0x00bc }
            h5.i4.n(r7)     // Catch:{ all -> 0x00bc }
            h5.e3 r7 = r7.f5397t     // Catch:{ all -> 0x00bc }
            java.lang.String r10 = "Error selecting main event"
            r7.b(r0, r10)     // Catch:{ all -> 0x00bc }
            if (r2 == 0) goto L_0x00ea
        L_0x00e7:
            r2.close()
        L_0x00ea:
            r0 = 0
        L_0x00eb:
            if (r0 == 0) goto L_0x01a5
            java.lang.Object r2 = r0.first
            if (r2 != 0) goto L_0x00f3
            goto L_0x01a5
        L_0x00f3:
            com.google.android.gms.internal.measurement.x2 r2 = (com.google.android.gms.internal.measurement.x2) r2
            r1.f5584a = r2
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r13 = r0.longValue()
            r1.f5586c = r13
            r12.I()
            com.google.android.gms.internal.measurement.x2 r0 = r1.f5584a
            java.io.Serializable r0 = h5.b7.l(r0, r4)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.f5585b = r0
        L_0x010e:
            long r13 = r1.f5586c
            r20 = -1
            long r13 = r13 + r20
            r1.f5586c = r13
            r16 = 0
            int r0 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x014f
            h5.i r0 = r12.f5850q
            h5.z6.E(r0)
            r0.g()
            h5.i4 r2 = r0.f5649o
            h5.g3 r4 = r2.w
            h5.i4.n(r4)
            java.lang.String r5 = "Clearing complex main event info. appId"
            h5.e3 r4 = r4.B
            r4.b(r3, r5)
            android.database.sqlite.SQLiteDatabase r0 = r0.y()     // Catch:{ SQLiteException -> 0x0141 }
            java.lang.String[] r4 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0141 }
            r5 = 0
            r4[r5] = r3     // Catch:{ SQLiteException -> 0x0141 }
            java.lang.String r3 = "delete from main_event_params where app_id=?"
            r0.execSQL(r3, r4)     // Catch:{ SQLiteException -> 0x0141 }
            goto L_0x0160
        L_0x0141:
            r0 = move-exception
            h5.g3 r2 = r2.w
            h5.i4.n(r2)
            java.lang.String r3 = "Error clearing complex main event"
            h5.e3 r2 = r2.f5397t
            r2.b(r0, r3)
            goto L_0x0160
        L_0x014f:
            h5.i r2 = r12.f5850q
            h5.z6.E(r2)
            long r6 = r1.f5586c
            com.google.android.gms.internal.measurement.x2 r0 = r1.f5584a
            r3 = r24
            r4 = r5
            r5 = r6
            r7 = r0
            r2.p(r3, r4, r5, r7)
        L_0x0160:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.internal.measurement.x2 r2 = r1.f5584a
            java.util.List r2 = r2.r()
            java.util.Iterator r2 = r2.iterator()
        L_0x016f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x018c
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.b3 r3 = (com.google.android.gms.internal.measurement.b3) r3
            r12.I()
            java.lang.String r4 = r3.s()
            com.google.android.gms.internal.measurement.b3 r4 = h5.b7.k(r8, r4)
            if (r4 != 0) goto L_0x016f
            r0.add(r3)
            goto L_0x016f
        L_0x018c:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x0197
            r0.addAll(r9)
            r9 = r0
            goto L_0x01a3
        L_0x0197:
            h5.g3 r0 = r11.w
            h5.i4.n(r0)
            java.lang.String r2 = "No unique parameters in main event. eventName"
            h5.e3 r0 = r0.u
            r0.b(r15, r2)
        L_0x01a3:
            r0 = r15
            goto L_0x01f8
        L_0x01a5:
            h5.g3 r0 = r11.w
            h5.i4.n(r0)
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            h5.e3 r0 = r0.u
            r0.c(r15, r5, r2)
            r2 = 0
            return r2
        L_0x01b3:
            if (r2 == 0) goto L_0x01b8
            r2.close()
        L_0x01b8:
            throw r0
        L_0x01b9:
            r1.f5585b = r5
            r1.f5584a = r8
            r12.I()
            r6 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r4 = "_epc"
            java.io.Serializable r4 = h5.b7.l(r8, r4)
            if (r4 == 0) goto L_0x01cf
            r2 = r4
        L_0x01cf:
            java.lang.Long r2 = (java.lang.Long) r2
            long r13 = r2.longValue()
            r1.f5586c = r13
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x01e8
            h5.g3 r2 = r11.w
            h5.i4.n(r2)
            java.lang.String r3 = "Complex event with zero extra param count. eventName"
            h5.e3 r2 = r2.u
            r2.b(r0, r3)
            goto L_0x01f8
        L_0x01e8:
            h5.i r2 = r12.f5850q
            h5.z6.E(r2)
            long r6 = r1.f5586c
            r3 = r24
            r4 = r5
            r5 = r6
            r7 = r23
            r2.p(r3, r4, r5, r7)
        L_0x01f8:
            com.google.android.gms.internal.measurement.b6 r2 = r23.n()
            com.google.android.gms.internal.measurement.w2 r2 = (com.google.android.gms.internal.measurement.w2) r2
            r2.w(r0)
            boolean r0 = r2.f2636q
            if (r0 == 0) goto L_0x020c
            r2.m()
            r3 = 0
            r2.f2636q = r3
            goto L_0x020d
        L_0x020c:
            r3 = 0
        L_0x020d:
            MessageType r0 = r2.f2635p
            com.google.android.gms.internal.measurement.x2 r0 = (com.google.android.gms.internal.measurement.x2) r0
            com.google.android.gms.internal.measurement.x2.G(r0)
            boolean r0 = r2.f2636q
            if (r0 == 0) goto L_0x021d
            r2.m()
            r2.f2636q = r3
        L_0x021d:
            MessageType r0 = r2.f2635p
            com.google.android.gms.internal.measurement.x2 r0 = (com.google.android.gms.internal.measurement.x2) r0
            com.google.android.gms.internal.measurement.x2.F(r0, r9)
            com.google.android.gms.internal.measurement.f6 r0 = r2.j()
            com.google.android.gms.internal.measurement.x2 r0 = (com.google.android.gms.internal.measurement.x2) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.m7.a(com.google.android.gms.internal.measurement.x2, java.lang.String):com.google.android.gms.internal.measurement.x2");
    }
}

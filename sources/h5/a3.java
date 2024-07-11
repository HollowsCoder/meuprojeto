package h5;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

public final class a3 extends s3 {

    /* renamed from: q  reason: collision with root package name */
    public final z2 f5267q = new z2(this, this.f5649o.f5452o);

    /* renamed from: r  reason: collision with root package name */
    public boolean f5268r;

    public a3(i4 i4Var) {
        super(i4Var);
    }

    public final boolean j() {
        return false;
    }

    public final void k() {
        int delete;
        i4 i4Var = this.f5649o;
        g();
        try {
            SQLiteDatabase m10 = m();
            if (m10 != null && (delete = m10.delete("messages", (String) null, (String[]) null)) > 0) {
                g3 g3Var = i4Var.w;
                i4.n(g3Var);
                g3Var.B.b(Integer.valueOf(delete), "Reset local analytics data. records");
            }
        } catch (SQLiteException e10) {
            g3 g3Var2 = i4Var.w;
            i4.n(g3Var2);
            g3Var2.f5397t.b(e10, "Error resetting local analytics data. error");
        }
    }

    public final void l() {
        g();
        if (!this.f5268r) {
            i4 i4Var = this.f5649o;
            if (i4Var.f5452o.getDatabasePath("google_app_measurement_local.db").exists()) {
                int i10 = 0;
                int i11 = 5;
                while (i10 < 5) {
                    SQLiteDatabase sQLiteDatabase = null;
                    try {
                        SQLiteDatabase m10 = m();
                        if (m10 == null) {
                            this.f5268r = true;
                            return;
                        }
                        m10.beginTransaction();
                        m10.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        m10.setTransactionSuccessful();
                        m10.endTransaction();
                        m10.close();
                        return;
                    } catch (SQLiteFullException e10) {
                        g3 g3Var = i4Var.w;
                        i4.n(g3Var);
                        g3Var.f5397t.b(e10, "Error deleting app launch break from local database");
                        this.f5268r = true;
                        if (sQLiteDatabase == null) {
                            i10++;
                        }
                        sQLiteDatabase.close();
                        i10++;
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep((long) i11);
                        i11 += 20;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                            i10++;
                        } else {
                            i10++;
                        }
                    } catch (SQLiteException e11) {
                        if (sQLiteDatabase != null) {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        }
                        g3 g3Var2 = i4Var.w;
                        i4.n(g3Var2);
                        g3Var2.f5397t.b(e11, "Error deleting app launch break from local database");
                        this.f5268r = true;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                            i10++;
                        } else {
                            i10++;
                        }
                    } catch (Throwable th) {
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                        throw th;
                    }
                }
                g3 g3Var3 = i4Var.w;
                i4.n(g3Var3);
                g3Var3.w.a("Error deleting app launch break from local database in reasonable time");
            }
        }
    }

    public final SQLiteDatabase m() {
        if (this.f5268r) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f5267q.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f5268r = true;
        return null;
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0125 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0125 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e A[SYNTHETIC, Splitter:B:25:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d2 A[SYNTHETIC, Splitter:B:55:0x00d2] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0098 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0125 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean n(int r18, byte[] r19) {
        /*
            r17 = this;
            r1 = r17
            r17.g()
            boolean r0 = r1.f5268r
            r2 = 0
            if (r0 == 0) goto L_0x000b
            return r2
        L_0x000b:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.String r0 = "type"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r18)
            r3.put(r0, r4)
            java.lang.String r0 = "entry"
            r4 = r19
            r3.put(r0, r4)
            h5.i4 r4 = r1.f5649o
            r4.getClass()
            r5 = 5
            r6 = r2
            r7 = r5
        L_0x0028:
            h5.g3 r8 = r4.w
            if (r6 >= r5) goto L_0x013b
            r9 = 0
            r10 = 1
            android.database.sqlite.SQLiteDatabase r11 = r17.m()     // Catch:{ SQLiteFullException -> 0x0109, SQLiteDatabaseLockedException -> 0x00f3, SQLiteException -> 0x00cd, all -> 0x00c7 }
            if (r11 != 0) goto L_0x0037
            r1.f5268r = r10     // Catch:{ SQLiteFullException -> 0x00c3, SQLiteDatabaseLockedException -> 0x00c0, SQLiteException -> 0x00bc, all -> 0x00b7 }
            return r2
        L_0x0037:
            r11.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00c3, SQLiteDatabaseLockedException -> 0x00c0, SQLiteException -> 0x00bc, all -> 0x00b7 }
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r12 = r11.rawQuery(r0, r9)     // Catch:{ SQLiteFullException -> 0x00c3, SQLiteDatabaseLockedException -> 0x00c0, SQLiteException -> 0x00bc, all -> 0x00b7 }
            if (r12 == 0) goto L_0x0053
            boolean r0 = r12.moveToFirst()     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            if (r0 == 0) goto L_0x0053
            long r13 = r12.getLong(r2)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            goto L_0x0055
        L_0x004d:
            r0 = move-exception
            goto L_0x00ac
        L_0x004f:
            r0 = move-exception
            goto L_0x00af
        L_0x0051:
            r0 = move-exception
            goto L_0x00b4
        L_0x0053:
            r13 = 0
        L_0x0055:
            r15 = 100000(0x186a0, double:4.94066E-319)
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            java.lang.String r5 = "messages"
            if (r0 < 0) goto L_0x0098
            h5.i4.n(r8)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            h5.e3 r0 = r8.f5397t     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            java.lang.String r9 = "Data loss, local db full"
            r0.a(r9)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            long r15 = r15 - r13
            r13 = 1
            long r15 = r15 + r13
            java.lang.String[] r0 = new java.lang.String[r10]     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            java.lang.String r9 = java.lang.Long.toString(r15)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            r0[r2] = r9     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            java.lang.String r9 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            int r0 = r11.delete(r5, r9, r0)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            long r13 = (long) r0     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0096
            h5.i4.n(r8)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            h5.e3 r0 = r8.f5397t     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            java.lang.String r9 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r2 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            java.lang.Long r10 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            long r15 = r15 - r13
            java.lang.Long r13 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            r0.d(r9, r2, r10, r13)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
        L_0x0096:
            r2 = 0
            goto L_0x0099
        L_0x0098:
            r2 = r9
        L_0x0099:
            r11.insertOrThrow(r5, r2, r3)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            r11.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            r11.endTransaction()     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            if (r12 == 0) goto L_0x00a7
            r12.close()
        L_0x00a7:
            r11.close()
            r2 = 1
            return r2
        L_0x00ac:
            r9 = r12
            goto L_0x0130
        L_0x00af:
            r9 = r11
            r2 = r12
            goto L_0x00d0
        L_0x00b2:
            r9 = r12
            goto L_0x00f6
        L_0x00b4:
            r9 = r12
            goto L_0x010d
        L_0x00b7:
            r0 = move-exception
            r2 = r9
        L_0x00b9:
            r9 = r2
            goto L_0x0130
        L_0x00bc:
            r0 = move-exception
            r2 = r9
            r9 = r11
            goto L_0x00d0
        L_0x00c0:
            r2 = r9
            r9 = r2
            goto L_0x00f6
        L_0x00c3:
            r0 = move-exception
            r2 = r9
            r9 = r2
            goto L_0x010d
        L_0x00c7:
            r0 = move-exception
            r2 = r9
            r9 = r2
            r11 = r9
            goto L_0x0130
        L_0x00cd:
            r0 = move-exception
            r2 = r9
            r9 = r2
        L_0x00d0:
            if (r9 == 0) goto L_0x00de
            boolean r5 = r9.inTransaction()     // Catch:{ all -> 0x00dc }
            if (r5 == 0) goto L_0x00de
            r9.endTransaction()     // Catch:{ all -> 0x00dc }
            goto L_0x00de
        L_0x00dc:
            r0 = move-exception
            goto L_0x012e
        L_0x00de:
            h5.i4.n(r8)     // Catch:{ all -> 0x00dc }
            h5.e3 r5 = r8.f5397t     // Catch:{ all -> 0x00dc }
            java.lang.String r8 = "Error writing entry to local database"
            r5.b(r0, r8)     // Catch:{ all -> 0x00dc }
            r5 = 1
            r1.f5268r = r5     // Catch:{ all -> 0x00dc }
            if (r2 == 0) goto L_0x00f0
            r2.close()
        L_0x00f0:
            if (r9 == 0) goto L_0x0125
            goto L_0x0122
        L_0x00f3:
            r2 = r9
            r9 = r2
            r11 = r9
        L_0x00f6:
            long r12 = (long) r7
            android.os.SystemClock.sleep(r12)     // Catch:{ all -> 0x0107 }
            int r7 = r7 + 20
            if (r9 == 0) goto L_0x0101
            r9.close()
        L_0x0101:
            if (r11 == 0) goto L_0x0125
            r11.close()
            goto L_0x0125
        L_0x0107:
            r0 = move-exception
            goto L_0x0130
        L_0x0109:
            r0 = move-exception
            r2 = r9
            r9 = r2
            r11 = r9
        L_0x010d:
            h5.i4.n(r8)     // Catch:{ all -> 0x012b }
            h5.e3 r2 = r8.f5397t     // Catch:{ all -> 0x012b }
            java.lang.String r5 = "Error writing entry; local database full"
            r2.b(r0, r5)     // Catch:{ all -> 0x012b }
            r2 = 1
            r1.f5268r = r2     // Catch:{ all -> 0x012b }
            if (r9 == 0) goto L_0x011f
            r9.close()
        L_0x011f:
            if (r11 == 0) goto L_0x0125
            r9 = r11
        L_0x0122:
            r9.close()
        L_0x0125:
            int r6 = r6 + 1
            r2 = 0
            r5 = 5
            goto L_0x0028
        L_0x012b:
            r0 = move-exception
            r2 = r9
            r9 = r11
        L_0x012e:
            r11 = r9
            goto L_0x00b9
        L_0x0130:
            if (r9 == 0) goto L_0x0135
            r9.close()
        L_0x0135:
            if (r11 == 0) goto L_0x013a
            r11.close()
        L_0x013a:
            throw r0
        L_0x013b:
            h5.i4.n(r8)
            java.lang.String r0 = "Failed to write entry to local database"
            h5.e3 r2 = r8.B
            r2.a(r0)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.a3.n(int, byte[]):boolean");
    }
}

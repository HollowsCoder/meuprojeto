package h5;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.appcompat.widget.x0;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.qa;
import com.google.android.gms.internal.measurement.x2;
import com.karumi.dexter.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n4.m;

public final class i extends u6 {
    public static final String[] A = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: t  reason: collision with root package name */
    public static final String[] f5443t = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] u = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: v  reason: collision with root package name */
    public static final String[] f5444v = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"};
    public static final String[] w = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: x  reason: collision with root package name */
    public static final String[] f5445x = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: y  reason: collision with root package name */
    public static final String[] f5446y = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] z = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: r  reason: collision with root package name */
    public final h f5447r;

    /* renamed from: s  reason: collision with root package name */
    public final r6 f5448s = new r6(this.f5649o.B);

    public i(z6 z6Var) {
        super(z6Var);
        this.f5649o.getClass();
        this.f5447r = new h(this, this.f5649o.f5452o);
    }

    public static final void s(ContentValues contentValues, Object obj) {
        m.e("value");
        m.h(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    public final void A(m mVar) {
        long j8;
        i4 i4Var = this.f5649o;
        m.h(mVar);
        g();
        h();
        ContentValues contentValues = new ContentValues();
        String str = mVar.f5541a;
        contentValues.put("app_id", str);
        contentValues.put("name", mVar.f5542b);
        contentValues.put("lifetime_count", Long.valueOf(mVar.f5543c));
        contentValues.put("current_bundle_count", Long.valueOf(mVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(mVar.f5545f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(mVar.f5546g));
        contentValues.put("last_bundled_day", mVar.f5547h);
        contentValues.put("last_sampled_complex_event_id", mVar.f5548i);
        contentValues.put("last_sampling_rate", mVar.f5549j);
        contentValues.put("current_session_count", Long.valueOf(mVar.f5544e));
        Boolean bool = mVar.f5550k;
        if (bool == null || !bool.booleanValue()) {
            j8 = null;
        } else {
            j8 = 1L;
        }
        contentValues.put("last_exempt_from_sampling", j8);
        try {
            if (y().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                g3 g3Var = i4Var.w;
                i4.n(g3Var);
                g3Var.f5397t.b(g3.p(str), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e10) {
            g3 g3Var2 = i4Var.w;
            i4.n(g3Var2);
            g3Var2.f5397t.c(g3.p(str), e10, "Error storing event aggregates. appId");
        }
    }

    public final void B(String str, String str2) {
        m.e(str);
        m.e(str2);
        g();
        h();
        try {
            y().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            i4 i4Var = this.f5649o;
            g3 g3Var = i4Var.w;
            i4.n(g3Var);
            f3 p10 = g3.p(str);
            b3 b3Var = i4Var.A;
            i4.l(b3Var);
            g3Var.f5397t.d("Error deleting user property. appId", p10, b3Var.n(str2), e10);
        }
    }

    public final boolean C(e7 e7Var) {
        g();
        h();
        String str = e7Var.f5362a;
        String str2 = e7Var.f5364c;
        e7 D = D(str, str2);
        i4 i4Var = this.f5649o;
        String str3 = e7Var.f5363b;
        if (D == null) {
            if (g7.Y(str2)) {
                if (t("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= ((long) Math.max(Math.min(i4Var.u.l(str, u2.F), 100), 25))) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long t10 = t("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, str3});
                i4Var.getClass();
                if (t10 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", str3);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(e7Var.d));
        s(contentValues, e7Var.f5365e);
        try {
            if (y().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                g3 g3Var = i4Var.w;
                i4.n(g3Var);
                g3Var.f5397t.b(g3.p(str), "Failed to insert/update user property (got -1). appId");
            }
        } catch (SQLiteException e10) {
            g3 g3Var2 = i4Var.w;
            i4.n(g3Var2);
            g3Var2.f5397t.c(g3.p(str), e10, "Error storing user property. appId");
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final h5.e7 D(java.lang.String r21, java.lang.String r22) {
        /*
            r20 = this;
            r1 = r20
            r9 = r22
            h5.i4 r10 = r1.f5649o
            n4.m.e(r21)
            n4.m.e(r22)
            r20.g()
            r20.h()
            r11 = 0
            android.database.sqlite.SQLiteDatabase r12 = r20.y()     // Catch:{ SQLiteException -> 0x007e, all -> 0x007c }
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r14 = new java.lang.String[]{r0, r2, r3}     // Catch:{ SQLiteException -> 0x007e, all -> 0x007c }
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x007e, all -> 0x007c }
            r3 = 0
            r2[r3] = r21     // Catch:{ SQLiteException -> 0x007e, all -> 0x007c }
            r4 = 1
            r2[r4] = r9     // Catch:{ SQLiteException -> 0x007e, all -> 0x007c }
            java.lang.String r13 = "user_attributes"
            java.lang.String r15 = "app_id=? and name=?"
            r17 = 0
            r18 = 0
            r19 = 0
            r16 = r2
            android.database.Cursor r12 = r12.query(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x007e, all -> 0x007c }
            boolean r2 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x007a }
            if (r2 != 0) goto L_0x0044
            r12.close()
            return r11
        L_0x0044:
            long r6 = r12.getLong(r3)     // Catch:{ SQLiteException -> 0x007a }
            java.lang.Object r8 = r1.m(r12, r4)     // Catch:{ SQLiteException -> 0x007a }
            if (r8 != 0) goto L_0x0052
            r12.close()
            return r11
        L_0x0052:
            java.lang.String r4 = r12.getString(r0)     // Catch:{ SQLiteException -> 0x007a }
            h5.e7 r0 = new h5.e7     // Catch:{ SQLiteException -> 0x007a }
            r2 = r0
            r3 = r21
            r5 = r22
            r2.<init>(r3, r4, r5, r6, r8)     // Catch:{ SQLiteException -> 0x007a }
            boolean r2 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x007a }
            if (r2 == 0) goto L_0x0076
            h5.g3 r2 = r10.w     // Catch:{ SQLiteException -> 0x007a }
            h5.i4.n(r2)     // Catch:{ SQLiteException -> 0x007a }
            h5.e3 r2 = r2.f5397t     // Catch:{ SQLiteException -> 0x007a }
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            h5.f3 r4 = h5.g3.p(r21)     // Catch:{ SQLiteException -> 0x007a }
            r2.b(r4, r3)     // Catch:{ SQLiteException -> 0x007a }
        L_0x0076:
            r12.close()
            return r0
        L_0x007a:
            r0 = move-exception
            goto L_0x0080
        L_0x007c:
            r0 = move-exception
            goto L_0x00a1
        L_0x007e:
            r0 = move-exception
            r12 = r11
        L_0x0080:
            h5.g3 r2 = r10.w     // Catch:{ all -> 0x009f }
            h5.i4.n(r2)     // Catch:{ all -> 0x009f }
            h5.e3 r2 = r2.f5397t     // Catch:{ all -> 0x009f }
            java.lang.String r3 = "Error querying user property. appId"
            h5.f3 r4 = h5.g3.p(r21)     // Catch:{ all -> 0x009f }
            h5.b3 r5 = r10.A     // Catch:{ all -> 0x009f }
            h5.i4.l(r5)     // Catch:{ all -> 0x009f }
            java.lang.String r5 = r5.n(r9)     // Catch:{ all -> 0x009f }
            r2.d(r3, r4, r5, r0)     // Catch:{ all -> 0x009f }
            if (r12 == 0) goto L_0x009e
            r12.close()
        L_0x009e:
            return r11
        L_0x009f:
            r0 = move-exception
            r11 = r12
        L_0x00a1:
            if (r11 == 0) goto L_0x00a6
            r11.close()
        L_0x00a6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.i.D(java.lang.String, java.lang.String):h5.e7");
    }

    public final List<e7> E(String str) {
        i4 i4Var = this.f5649o;
        m.e(str);
        g();
        h();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            i4Var.getClass();
            Cursor query = y().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", "1000");
            if (query.moveToFirst()) {
                do {
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    if (string2 == null) {
                        string2 = BuildConfig.FLAVOR;
                    }
                    String str2 = string2;
                    long j8 = query.getLong(2);
                    Object m10 = m(query, 3);
                    if (m10 == null) {
                        g3 g3Var = i4Var.w;
                        i4.n(g3Var);
                        g3Var.f5397t.b(g3.p(str), "Read invalid user property value, ignoring it. appId");
                    } else {
                        arrayList.add(new e7(str, str2, string, j8, m10));
                    }
                } while (query.moveToNext());
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e10) {
            g3 g3Var2 = i4Var.w;
            i4.n(g3Var2);
            g3Var2.f5397t.c(g3.p(str), e10, "Error querying user properties. appId");
            List<e7> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        h5.i4.n(r4);
        r4.f5397t.b(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0108 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<h5.e7> F(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            r17 = this;
            r1 = r17
            h5.i4 r2 = r1.f5649o
            n4.m.e(r18)
            r17.g()
            r17.h()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r11 = "1001"
            r12 = 0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00ee }
            r13 = 3
            r3.<init>(r13)     // Catch:{ SQLiteException -> 0x00ee }
            r14 = r18
            r3.add(r14)     // Catch:{ SQLiteException -> 0x00e8 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00e8 }
            java.lang.String r5 = "app_id=?"
            r4.<init>(r5)     // Catch:{ SQLiteException -> 0x00e8 }
            boolean r5 = android.text.TextUtils.isEmpty(r19)     // Catch:{ SQLiteException -> 0x00e8 }
            r15 = r19
            if (r5 != 0) goto L_0x0037
            r3.add(r15)     // Catch:{ SQLiteException -> 0x00e6 }
            java.lang.String r5 = " and origin=?"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x00e6 }
        L_0x0037:
            boolean r5 = android.text.TextUtils.isEmpty(r20)     // Catch:{ SQLiteException -> 0x00e6 }
            if (r5 != 0) goto L_0x004f
            java.lang.String r5 = java.lang.String.valueOf(r20)     // Catch:{ SQLiteException -> 0x00e6 }
            java.lang.String r6 = "*"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ SQLiteException -> 0x00e6 }
            r3.add(r5)     // Catch:{ SQLiteException -> 0x00e6 }
            java.lang.String r5 = " and name glob ?"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x00e6 }
        L_0x004f:
            int r5 = r3.size()     // Catch:{ SQLiteException -> 0x00e6 }
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x00e6 }
            java.lang.Object[] r3 = r3.toArray(r5)     // Catch:{ SQLiteException -> 0x00e6 }
            r7 = r3
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ SQLiteException -> 0x00e6 }
            android.database.sqlite.SQLiteDatabase r3 = r17.y()     // Catch:{ SQLiteException -> 0x00e6 }
            java.lang.String r5 = "user_attributes"
            java.lang.String r6 = "name"
            java.lang.String r8 = "set_timestamp"
            java.lang.String r9 = "value"
            java.lang.String r10 = "origin"
            java.lang.String[] r6 = new java.lang.String[]{r6, r8, r9, r10}     // Catch:{ SQLiteException -> 0x00e6 }
            java.lang.String r8 = r4.toString()     // Catch:{ SQLiteException -> 0x00e6 }
            java.lang.String r10 = "rowid"
            r2.getClass()     // Catch:{ SQLiteException -> 0x00e6 }
            r9 = 0
            r16 = 0
            r4 = r5
            r5 = r6
            r6 = r8
            r8 = r9
            r9 = r16
            android.database.Cursor r12 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x00e6 }
            boolean r3 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x00e6 }
            if (r3 != 0) goto L_0x008e
            r12.close()
            return r0
        L_0x008e:
            int r3 = r0.size()     // Catch:{ SQLiteException -> 0x00e6 }
            h5.g3 r4 = r2.w
            r5 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r5) goto L_0x00a7
            h5.i4.n(r4)     // Catch:{ SQLiteException -> 0x00e6 }
            h5.e3 r3 = r4.f5397t     // Catch:{ SQLiteException -> 0x00e6 }
            java.lang.String r4 = "Read more than the max allowed user properties, ignoring excess"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ SQLiteException -> 0x00e6 }
            r3.b(r5, r4)     // Catch:{ SQLiteException -> 0x00e6 }
            goto L_0x00e2
        L_0x00a7:
            r3 = 0
            java.lang.String r7 = r12.getString(r3)     // Catch:{ SQLiteException -> 0x00e6 }
            r3 = 1
            long r8 = r12.getLong(r3)     // Catch:{ SQLiteException -> 0x00e6 }
            r3 = 2
            java.lang.Object r10 = r1.m(r12, r3)     // Catch:{ SQLiteException -> 0x00e6 }
            java.lang.String r15 = r12.getString(r13)     // Catch:{ SQLiteException -> 0x00e6 }
            if (r10 != 0) goto L_0x00cd
            h5.i4.n(r4)     // Catch:{ SQLiteException -> 0x00e6 }
            h5.e3 r3 = r4.f5397t     // Catch:{ SQLiteException -> 0x00e6 }
            java.lang.String r4 = "(2)Read invalid user property value, ignoring it"
            h5.f3 r5 = h5.g3.p(r18)     // Catch:{ SQLiteException -> 0x00e6 }
            r11 = r20
            r3.d(r4, r5, r15, r11)     // Catch:{ SQLiteException -> 0x00e6 }
            goto L_0x00db
        L_0x00cd:
            r11 = r20
            h5.e7 r3 = new h5.e7     // Catch:{ SQLiteException -> 0x00e6 }
            r4 = r3
            r5 = r18
            r6 = r15
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x00e6 }
            r0.add(r3)     // Catch:{ SQLiteException -> 0x00e6 }
        L_0x00db:
            boolean r3 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x00e6 }
            if (r3 == 0) goto L_0x00e2
            goto L_0x008e
        L_0x00e2:
            r12.close()
            return r0
        L_0x00e6:
            r0 = move-exception
            goto L_0x00f2
        L_0x00e8:
            r0 = move-exception
        L_0x00e9:
            r15 = r19
            goto L_0x00f2
        L_0x00ec:
            r0 = move-exception
            goto L_0x010c
        L_0x00ee:
            r0 = move-exception
            r14 = r18
            goto L_0x00e9
        L_0x00f2:
            h5.g3 r2 = r2.w     // Catch:{ all -> 0x00ec }
            h5.i4.n(r2)     // Catch:{ all -> 0x00ec }
            h5.e3 r2 = r2.f5397t     // Catch:{ all -> 0x00ec }
            java.lang.String r3 = "(2)Error querying user properties"
            h5.f3 r4 = h5.g3.p(r18)     // Catch:{ all -> 0x00ec }
            r2.d(r3, r4, r15, r0)     // Catch:{ all -> 0x00ec }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00ec }
            if (r12 == 0) goto L_0x010b
            r12.close()
        L_0x010b:
            return r0
        L_0x010c:
            if (r12 == 0) goto L_0x0111
            r12.close()
        L_0x0111:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.i.F(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final boolean G(b bVar) {
        g();
        h();
        String str = bVar.f5275o;
        m.h(str);
        e7 D = D(str, bVar.f5277q.f5318p);
        i4 i4Var = this.f5649o;
        if (D == null) {
            long t10 = t("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            i4Var.getClass();
            if (t10 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", bVar.f5276p);
        contentValues.put("name", bVar.f5277q.f5318p);
        Object g02 = bVar.f5277q.g0();
        m.h(g02);
        s(contentValues, g02);
        contentValues.put("active", Boolean.valueOf(bVar.f5279s));
        contentValues.put("trigger_event_name", bVar.f5280t);
        contentValues.put("trigger_timeout", Long.valueOf(bVar.f5281v));
        g7 g7Var = i4Var.z;
        g3 g3Var = i4Var.w;
        i4.l(g7Var);
        g7Var.getClass();
        contentValues.put("timed_out_event", g7.F(bVar.u));
        contentValues.put("creation_timestamp", Long.valueOf(bVar.f5278r));
        g7 g7Var2 = i4Var.z;
        i4.l(g7Var2);
        p pVar = bVar.w;
        g7Var2.getClass();
        contentValues.put("triggered_event", g7.F(pVar));
        contentValues.put("triggered_timestamp", Long.valueOf(bVar.f5277q.f5319q));
        contentValues.put("time_to_live", Long.valueOf(bVar.f5282x));
        i4.l(g7Var2);
        g7Var2.getClass();
        contentValues.put("expired_event", g7.F(bVar.f5283y));
        try {
            if (y().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                i4.n(g3Var);
                g3Var.f5397t.b(g3.p(str), "Failed to insert/update conditional user property (got -1)");
            }
        } catch (SQLiteException e10) {
            i4.n(g3Var);
            g3Var.f5397t.c(g3.p(str), e10, "Error storing conditional user property");
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final h5.b H(java.lang.String r32, java.lang.String r33) {
        /*
            r31 = this;
            r1 = r31
            r8 = r33
            h5.z6 r0 = r1.f5701p
            h5.i4 r9 = r1.f5649o
            n4.m.e(r32)
            n4.m.e(r33)
            r31.g()
            r31.h()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r31.y()     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f4 }
            java.lang.String r12 = "origin"
            java.lang.String r13 = "value"
            java.lang.String r14 = "active"
            java.lang.String r15 = "trigger_event_name"
            java.lang.String r16 = "trigger_timeout"
            java.lang.String r17 = "timed_out_event"
            java.lang.String r18 = "creation_timestamp"
            java.lang.String r19 = "triggered_event"
            java.lang.String r20 = "triggered_timestamp"
            java.lang.String r21 = "time_to_live"
            java.lang.String r22 = "expired_event"
            java.lang.String[] r13 = new java.lang.String[]{r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22}     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f4 }
            r2 = 2
            java.lang.String[] r15 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f4 }
            r3 = 0
            r15[r3] = r32     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f4 }
            r4 = 1
            r15[r4] = r8     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f4 }
            java.lang.String r12 = "conditional_properties"
            java.lang.String r14 = "app_id=? and name=?"
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f4 }
            boolean r5 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x00ee }
            if (r5 != 0) goto L_0x0054
            r11.close()
            return r10
        L_0x0054:
            java.lang.String r18 = r11.getString(r3)     // Catch:{ SQLiteException -> 0x00ee }
            java.lang.Object r5 = r1.m(r11, r4)     // Catch:{ SQLiteException -> 0x00ee }
            int r2 = r11.getInt(r2)     // Catch:{ SQLiteException -> 0x00ee }
            if (r2 == 0) goto L_0x0065
            r22 = r4
            goto L_0x0067
        L_0x0065:
            r22 = r3
        L_0x0067:
            r2 = 3
            java.lang.String r23 = r11.getString(r2)     // Catch:{ SQLiteException -> 0x00ee }
            r2 = 4
            long r25 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x00ee }
            h5.b7 r2 = r0.u     // Catch:{ SQLiteException -> 0x00ee }
            h5.b7 r0 = r0.u
            h5.z6.E(r2)     // Catch:{ SQLiteException -> 0x00ee }
            r3 = 5
            byte[] r3 = r11.getBlob(r3)     // Catch:{ SQLiteException -> 0x00ee }
            android.os.Parcelable$Creator<h5.p> r4 = h5.p.CREATOR     // Catch:{ SQLiteException -> 0x00ee }
            android.os.Parcelable r2 = r2.w(r3, r4)     // Catch:{ SQLiteException -> 0x00ee }
            r24 = r2
            h5.p r24 = (h5.p) r24     // Catch:{ SQLiteException -> 0x00ee }
            r2 = 6
            long r20 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x00ee }
            h5.z6.E(r0)     // Catch:{ SQLiteException -> 0x00ee }
            r2 = 7
            byte[] r2 = r11.getBlob(r2)     // Catch:{ SQLiteException -> 0x00ee }
            android.os.Parcelable r2 = r0.w(r2, r4)     // Catch:{ SQLiteException -> 0x00ee }
            r27 = r2
            h5.p r27 = (h5.p) r27     // Catch:{ SQLiteException -> 0x00ee }
            r2 = 8
            long r6 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x00ee }
            r2 = 9
            long r28 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x00ee }
            h5.z6.E(r0)     // Catch:{ SQLiteException -> 0x00ee }
            r2 = 10
            byte[] r2 = r11.getBlob(r2)     // Catch:{ SQLiteException -> 0x00ee }
            android.os.Parcelable r0 = r0.w(r2, r4)     // Catch:{ SQLiteException -> 0x00ee }
            r30 = r0
            h5.p r30 = (h5.p) r30     // Catch:{ SQLiteException -> 0x00ee }
            h5.c7 r19 = new h5.c7     // Catch:{ SQLiteException -> 0x00ee }
            r2 = r19
            r3 = r6
            r6 = r33
            r7 = r18
            r2.<init>(r3, r5, r6, r7)     // Catch:{ SQLiteException -> 0x00ee }
            h5.b r0 = new h5.b     // Catch:{ SQLiteException -> 0x00ee }
            r16 = r0
            r17 = r32
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25, r27, r28, r30)     // Catch:{ SQLiteException -> 0x00ee }
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x00ee }
            if (r2 == 0) goto L_0x00f0
            h5.g3 r2 = r9.w     // Catch:{ SQLiteException -> 0x00ee }
            h5.i4.n(r2)     // Catch:{ SQLiteException -> 0x00ee }
            h5.e3 r2 = r2.f5397t     // Catch:{ SQLiteException -> 0x00ee }
            java.lang.String r3 = "Got multiple records for conditional property, expected one"
            h5.f3 r4 = h5.g3.p(r32)     // Catch:{ SQLiteException -> 0x00ee }
            h5.b3 r5 = r9.A     // Catch:{ SQLiteException -> 0x00ee }
            h5.i4.l(r5)     // Catch:{ SQLiteException -> 0x00ee }
            java.lang.String r5 = r5.n(r8)     // Catch:{ SQLiteException -> 0x00ee }
            r2.c(r4, r5, r3)     // Catch:{ SQLiteException -> 0x00ee }
            goto L_0x00f0
        L_0x00ee:
            r0 = move-exception
            goto L_0x00f8
        L_0x00f0:
            r11.close()
            return r0
        L_0x00f4:
            r0 = move-exception
            goto L_0x0119
        L_0x00f6:
            r0 = move-exception
            r11 = r10
        L_0x00f8:
            h5.g3 r2 = r9.w     // Catch:{ all -> 0x0117 }
            h5.i4.n(r2)     // Catch:{ all -> 0x0117 }
            h5.e3 r2 = r2.f5397t     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = "Error querying conditional property"
            h5.f3 r4 = h5.g3.p(r32)     // Catch:{ all -> 0x0117 }
            h5.b3 r5 = r9.A     // Catch:{ all -> 0x0117 }
            h5.i4.l(r5)     // Catch:{ all -> 0x0117 }
            java.lang.String r5 = r5.n(r8)     // Catch:{ all -> 0x0117 }
            r2.d(r3, r4, r5, r0)     // Catch:{ all -> 0x0117 }
            if (r11 == 0) goto L_0x0116
            r11.close()
        L_0x0116:
            return r10
        L_0x0117:
            r0 = move-exception
            r10 = r11
        L_0x0119:
            if (r10 == 0) goto L_0x011e
            r10.close()
        L_0x011e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.i.H(java.lang.String, java.lang.String):h5.b");
    }

    public final void I(String str, String str2) {
        m.e(str);
        m.e(str2);
        g();
        h();
        try {
            y().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            i4 i4Var = this.f5649o;
            g3 g3Var = i4Var.w;
            i4.n(g3Var);
            f3 p10 = g3.p(str);
            b3 b3Var = i4Var.A;
            i4.l(b3Var);
            g3Var.f5397t.d("Error deleting conditional property", p10, b3Var.n(str2), e10);
        }
    }

    public final List<b> J(String str, String str2, String str3) {
        m.e(str);
        g();
        h();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return K(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final List<b> K(String str, String[] strArr) {
        boolean z10;
        z6 z6Var = this.f5701p;
        i4 i4Var = this.f5649o;
        g();
        h();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            i4Var.getClass();
            cursor = y().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (cursor.moveToFirst()) {
                while (true) {
                    if (arrayList.size() < 1000) {
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        String string3 = cursor.getString(2);
                        Object m10 = m(cursor, 3);
                        if (cursor.getInt(4) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        String string4 = cursor.getString(5);
                        long j8 = cursor.getLong(6);
                        b7 b7Var = z6Var.u;
                        b7 b7Var2 = z6Var.u;
                        z6.E(b7Var);
                        byte[] blob = cursor.getBlob(7);
                        Parcelable.Creator creator = p.CREATOR;
                        long j10 = cursor.getLong(8);
                        z6.E(b7Var2);
                        long j11 = cursor.getLong(10);
                        long j12 = cursor.getLong(11);
                        z6.E(b7Var2);
                        arrayList.add(new b(string, string2, new c7(j11, m10, string3, string2), j10, z10, string4, (p) b7Var.w(blob, creator), j8, (p) b7Var2.w(cursor.getBlob(9), creator), j12, (p) b7Var2.w(cursor.getBlob(12), creator)));
                        if (!cursor.moveToNext()) {
                            break;
                        }
                    } else {
                        g3 g3Var = i4Var.w;
                        i4.n(g3Var);
                        g3Var.f5397t.b(1000, "Read more than the max allowed conditional properties, ignoring extra");
                        break;
                    }
                }
                cursor.close();
                return arrayList;
            }
            cursor.close();
            return arrayList;
        } catch (SQLiteException e10) {
            g3 g3Var2 = i4Var.w;
            i4.n(g3Var2);
            g3Var2.f5397t.b(e10, "Error querying conditional user property value");
            List<b> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x011e A[Catch:{ SQLiteException -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0120 A[Catch:{ SQLiteException -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x012e A[Catch:{ SQLiteException -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0132 A[Catch:{ SQLiteException -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x016a A[Catch:{ SQLiteException -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0183 A[Catch:{ SQLiteException -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x019f A[Catch:{ SQLiteException -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01a0 A[Catch:{ SQLiteException -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01af A[Catch:{ SQLiteException -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01ce A[Catch:{ SQLiteException -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01e7 A[Catch:{ SQLiteException -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x021b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final h5.m4 L(java.lang.String r35) {
        /*
            r34 = this;
            r1 = r34
            r2 = r35
            h5.i4 r3 = r1.f5649o
            n4.m.e(r35)
            r34.g()
            r34.h()
            r4 = 0
            android.database.sqlite.SQLiteDatabase r5 = r34.y()     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fd }
            java.lang.String r6 = "app_instance_id"
            java.lang.String r7 = "gmp_app_id"
            java.lang.String r8 = "resettable_device_id_hash"
            java.lang.String r9 = "last_bundle_index"
            java.lang.String r10 = "last_bundle_start_timestamp"
            java.lang.String r11 = "last_bundle_end_timestamp"
            java.lang.String r12 = "app_version"
            java.lang.String r13 = "app_store"
            java.lang.String r14 = "gmp_version"
            java.lang.String r15 = "dev_cert_hash"
            java.lang.String r16 = "measurement_enabled"
            java.lang.String r17 = "day"
            java.lang.String r18 = "daily_public_events_count"
            java.lang.String r19 = "daily_events_count"
            java.lang.String r20 = "daily_conversions_count"
            java.lang.String r21 = "config_fetched_time"
            java.lang.String r22 = "failed_config_fetch_time"
            java.lang.String r23 = "app_version_int"
            java.lang.String r24 = "firebase_instance_id"
            java.lang.String r25 = "daily_error_events_count"
            java.lang.String r26 = "daily_realtime_events_count"
            java.lang.String r27 = "health_monitor_sample"
            java.lang.String r28 = "android_id"
            java.lang.String r29 = "adid_reporting_enabled"
            java.lang.String r30 = "admob_app_id"
            java.lang.String r31 = "dynamite_version"
            java.lang.String r32 = "safelisted_events"
            java.lang.String r33 = "ga_app_id"
            java.lang.String[] r7 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33}     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fd }
            r0 = 1
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fd }
            r13 = 0
            r9[r13] = r2     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fd }
            java.lang.String r6 = "apps"
            java.lang.String r8 = "app_id=?"
            r10 = 0
            r11 = 0
            r12 = 0
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fd }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x01fb }
            if (r6 != 0) goto L_0x006b
            r5.close()
            return r4
        L_0x006b:
            h5.m4 r6 = new h5.m4     // Catch:{ SQLiteException -> 0x01fb }
            h5.z6 r7 = r1.f5701p     // Catch:{ SQLiteException -> 0x01fb }
            h5.i4 r7 = r7.f5856y     // Catch:{ SQLiteException -> 0x01fb }
            r6.<init>(r7, r2)     // Catch:{ SQLiteException -> 0x01fb }
            h5.i4 r7 = r6.f5555a     // Catch:{ SQLiteException -> 0x01fb }
            java.lang.String r8 = r5.getString(r13)     // Catch:{ SQLiteException -> 0x01fb }
            r6.z(r8)     // Catch:{ SQLiteException -> 0x01fb }
            java.lang.String r8 = r5.getString(r0)     // Catch:{ SQLiteException -> 0x01fb }
            r6.B(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r8 = 2
            java.lang.String r8 = r5.getString(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r6.G(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r8 = 3
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r6.h(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r8 = 4
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r6.J(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r8 = 5
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r6.K(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r8 = 6
            java.lang.String r8 = r5.getString(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r6.M(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r8 = 7
            java.lang.String r8 = r5.getString(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r6.Q(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r8 = 8
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r6.a(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r8 = 9
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r6.c(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r8 = 10
            boolean r9 = r5.isNull(r8)     // Catch:{ SQLiteException -> 0x01fb }
            if (r9 != 0) goto L_0x00d7
            int r8 = r5.getInt(r8)     // Catch:{ SQLiteException -> 0x01fb }
            if (r8 == 0) goto L_0x00d5
            goto L_0x00d7
        L_0x00d5:
            r8 = r13
            goto L_0x00d8
        L_0x00d7:
            r8 = r0
        L_0x00d8:
            r6.g(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r8 = 11
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r6.j(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r8 = 12
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r6.k(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r8 = 13
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r6.l(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r8 = 14
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r6.m(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r8 = 15
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r6.i(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r8 = 16
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x01fb }
            h5.h4 r10 = r7.f5459x     // Catch:{ SQLiteException -> 0x01fb }
            h5.i4.n(r10)     // Catch:{ SQLiteException -> 0x01fb }
            r10.g()     // Catch:{ SQLiteException -> 0x01fb }
            boolean r10 = r6.D     // Catch:{ SQLiteException -> 0x01fb }
            long r11 = r6.F     // Catch:{ SQLiteException -> 0x01fb }
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 == 0) goto L_0x0120
            r11 = r0
            goto L_0x0121
        L_0x0120:
            r11 = r13
        L_0x0121:
            r10 = r10 | r11
            r6.D = r10     // Catch:{ SQLiteException -> 0x01fb }
            r6.F = r8     // Catch:{ SQLiteException -> 0x01fb }
            r8 = 17
            boolean r9 = r5.isNull(r8)     // Catch:{ SQLiteException -> 0x01fb }
            if (r9 == 0) goto L_0x0132
            r8 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0137
        L_0x0132:
            int r8 = r5.getInt(r8)     // Catch:{ SQLiteException -> 0x01fb }
            long r8 = (long) r8     // Catch:{ SQLiteException -> 0x01fb }
        L_0x0137:
            r6.O(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r8 = 18
            java.lang.String r8 = r5.getString(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r6.I(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r8 = 19
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r6.o(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r8 = 20
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r6.n(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r8 = 21
            java.lang.String r8 = r5.getString(r8)     // Catch:{ SQLiteException -> 0x01fb }
            r6.q(r8)     // Catch:{ SQLiteException -> 0x01fb }
            h5.e r8 = r3.u     // Catch:{ SQLiteException -> 0x01fb }
            h5.s2<java.lang.Boolean> r9 = h5.u2.f5740r0     // Catch:{ SQLiteException -> 0x01fb }
            boolean r8 = r8.m(r4, r9)     // Catch:{ SQLiteException -> 0x01fb }
            r9 = 0
            if (r8 != 0) goto L_0x017b
            r8 = 22
            boolean r11 = r5.isNull(r8)     // Catch:{ SQLiteException -> 0x01fb }
            if (r11 == 0) goto L_0x0174
            r11 = r9
            goto L_0x0178
        L_0x0174:
            long r11 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x01fb }
        L_0x0178:
            r6.s(r11)     // Catch:{ SQLiteException -> 0x01fb }
        L_0x017b:
            r8 = 23
            boolean r11 = r5.isNull(r8)     // Catch:{ SQLiteException -> 0x01fb }
            if (r11 != 0) goto L_0x018b
            int r8 = r5.getInt(r8)     // Catch:{ SQLiteException -> 0x01fb }
            if (r8 == 0) goto L_0x018a
            goto L_0x018b
        L_0x018a:
            r0 = r13
        L_0x018b:
            r6.u(r0)     // Catch:{ SQLiteException -> 0x01fb }
            r0 = 24
            java.lang.String r0 = r5.getString(r0)     // Catch:{ SQLiteException -> 0x01fb }
            r6.D(r0)     // Catch:{ SQLiteException -> 0x01fb }
            r0 = 25
            boolean r8 = r5.isNull(r0)     // Catch:{ SQLiteException -> 0x01fb }
            if (r8 == 0) goto L_0x01a0
            goto L_0x01a4
        L_0x01a0:
            long r9 = r5.getLong(r0)     // Catch:{ SQLiteException -> 0x01fb }
        L_0x01a4:
            r6.e(r9)     // Catch:{ SQLiteException -> 0x01fb }
            r0 = 26
            boolean r8 = r5.isNull(r0)     // Catch:{ SQLiteException -> 0x01fb }
            if (r8 != 0) goto L_0x01c1
            java.lang.String r0 = r5.getString(r0)     // Catch:{ SQLiteException -> 0x01fb }
            java.lang.String r8 = ","
            r9 = -1
            java.lang.String[] r0 = r0.split(r8, r9)     // Catch:{ SQLiteException -> 0x01fb }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x01fb }
            r6.w(r0)     // Catch:{ SQLiteException -> 0x01fb }
        L_0x01c1:
            com.google.android.gms.internal.measurement.qa.a()     // Catch:{ SQLiteException -> 0x01fb }
            h5.e r0 = r3.u     // Catch:{ SQLiteException -> 0x01fb }
            h5.s2<java.lang.Boolean> r8 = h5.u2.f5717f0     // Catch:{ SQLiteException -> 0x01fb }
            boolean r0 = r0.m(r2, r8)     // Catch:{ SQLiteException -> 0x01fb }
            if (r0 == 0) goto L_0x01d7
            r0 = 27
            java.lang.String r0 = r5.getString(r0)     // Catch:{ SQLiteException -> 0x01fb }
            r6.F(r0)     // Catch:{ SQLiteException -> 0x01fb }
        L_0x01d7:
            h5.h4 r0 = r7.f5459x     // Catch:{ SQLiteException -> 0x01fb }
            h5.i4.n(r0)     // Catch:{ SQLiteException -> 0x01fb }
            r0.g()     // Catch:{ SQLiteException -> 0x01fb }
            r6.D = r13     // Catch:{ SQLiteException -> 0x01fb }
            boolean r0 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x01fb }
            if (r0 == 0) goto L_0x01f7
            h5.g3 r0 = r3.w     // Catch:{ SQLiteException -> 0x01fb }
            h5.i4.n(r0)     // Catch:{ SQLiteException -> 0x01fb }
            h5.e3 r0 = r0.f5397t     // Catch:{ SQLiteException -> 0x01fb }
            java.lang.String r7 = "Got multiple records for app, expected one. appId"
            h5.f3 r8 = h5.g3.p(r35)     // Catch:{ SQLiteException -> 0x01fb }
            r0.b(r8, r7)     // Catch:{ SQLiteException -> 0x01fb }
        L_0x01f7:
            r5.close()
            return r6
        L_0x01fb:
            r0 = move-exception
            goto L_0x0201
        L_0x01fd:
            r0 = move-exception
            goto L_0x0219
        L_0x01ff:
            r0 = move-exception
            r5 = r4
        L_0x0201:
            h5.g3 r3 = r3.w     // Catch:{ all -> 0x0217 }
            h5.i4.n(r3)     // Catch:{ all -> 0x0217 }
            h5.e3 r3 = r3.f5397t     // Catch:{ all -> 0x0217 }
            java.lang.String r6 = "Error querying app. appId"
            h5.f3 r2 = h5.g3.p(r35)     // Catch:{ all -> 0x0217 }
            r3.c(r2, r0, r6)     // Catch:{ all -> 0x0217 }
            if (r5 == 0) goto L_0x0216
            r5.close()
        L_0x0216:
            return r4
        L_0x0217:
            r0 = move-exception
            r4 = r5
        L_0x0219:
            if (r4 == 0) goto L_0x021e
            r4.close()
        L_0x021e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.i.L(java.lang.String):h5.m4");
    }

    public final void M(m4 m4Var) {
        g();
        h();
        String x10 = m4Var.x();
        m.h(x10);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", x10);
        contentValues.put("app_instance_id", m4Var.y());
        contentValues.put("gmp_app_id", m4Var.A());
        i4 i4Var = m4Var.f5555a;
        h4 h4Var = i4Var.f5459x;
        i4.n(h4Var);
        h4Var.g();
        contentValues.put("resettable_device_id_hash", m4Var.f5558e);
        h4 h4Var2 = i4Var.f5459x;
        i4.n(h4Var2);
        h4Var2.g();
        contentValues.put("last_bundle_index", Long.valueOf(m4Var.f5560g));
        h4 h4Var3 = i4Var.f5459x;
        i4.n(h4Var3);
        h4Var3.g();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(m4Var.f5561h));
        h4 h4Var4 = i4Var.f5459x;
        i4.n(h4Var4);
        h4Var4.g();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(m4Var.f5562i));
        contentValues.put("app_version", m4Var.L());
        contentValues.put("app_store", m4Var.P());
        contentValues.put("gmp_version", Long.valueOf(m4Var.R()));
        contentValues.put("dev_cert_hash", Long.valueOf(m4Var.b()));
        contentValues.put("measurement_enabled", Boolean.valueOf(m4Var.f()));
        h4 h4Var5 = i4Var.f5459x;
        i4.n(h4Var5);
        h4Var5.g();
        contentValues.put("day", Long.valueOf(m4Var.w));
        h4 h4Var6 = i4Var.f5459x;
        i4.n(h4Var6);
        h4Var6.g();
        contentValues.put("daily_public_events_count", Long.valueOf(m4Var.f5574x));
        i4.n(h4Var6);
        h4Var6.g();
        contentValues.put("daily_events_count", Long.valueOf(m4Var.f5575y));
        i4.n(h4Var6);
        h4Var6.g();
        contentValues.put("daily_conversions_count", Long.valueOf(m4Var.z));
        h4 h4Var7 = i4Var.f5459x;
        i4.n(h4Var7);
        h4Var7.g();
        contentValues.put("config_fetched_time", Long.valueOf(m4Var.E));
        h4 h4Var8 = i4Var.f5459x;
        i4.n(h4Var8);
        h4Var8.g();
        contentValues.put("failed_config_fetch_time", Long.valueOf(m4Var.F));
        contentValues.put("app_version_int", Long.valueOf(m4Var.N()));
        contentValues.put("firebase_instance_id", m4Var.H());
        i4.n(h4Var6);
        h4Var6.g();
        contentValues.put("daily_error_events_count", Long.valueOf(m4Var.A));
        i4.n(h4Var6);
        h4Var6.g();
        contentValues.put("daily_realtime_events_count", Long.valueOf(m4Var.B));
        h4 h4Var9 = i4Var.f5459x;
        i4.n(h4Var9);
        h4Var9.g();
        contentValues.put("health_monitor_sample", m4Var.C);
        contentValues.put("android_id", Long.valueOf(m4Var.r()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(m4Var.t()));
        contentValues.put("admob_app_id", m4Var.C());
        contentValues.put("dynamite_version", Long.valueOf(m4Var.d()));
        h4 h4Var10 = i4Var.f5459x;
        i4.n(h4Var10);
        h4Var10.g();
        ArrayList arrayList = m4Var.u;
        i4 i4Var2 = this.f5649o;
        if (arrayList != null) {
            if (arrayList.size() == 0) {
                g3 g3Var = i4Var2.w;
                i4.n(g3Var);
                g3Var.w.b(x10, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        qa.a();
        e eVar = i4Var2.u;
        g3 g3Var2 = i4Var2.w;
        if (eVar.m(x10, u2.f5717f0)) {
            contentValues.put("ga_app_id", m4Var.E());
        }
        try {
            SQLiteDatabase y10 = y();
            if (((long) y10.update("apps", contentValues, "app_id = ?", new String[]{x10})) == 0 && y10.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                i4.n(g3Var2);
                g3Var2.f5397t.b(g3.p(x10), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e10) {
            i4.n(g3Var2);
            g3Var2.f5397t.c(g3.p(x10), e10, "Error storing app. appId");
        }
    }

    public final g N(long j8, String str, boolean z10, boolean z11) {
        return O(j8, str, 1, false, false, z10, false, z11);
    }

    public final g O(long j8, String str, long j10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        i4 i4Var = this.f5649o;
        m.e(str);
        g();
        h();
        String[] strArr = {str};
        g gVar = new g();
        Cursor cursor = null;
        try {
            SQLiteDatabase y10 = y();
            cursor = y10.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                g3 g3Var = i4Var.w;
                i4.n(g3Var);
                g3Var.w.b(g3.p(str), "Not updating daily counts, app is not known. appId");
                cursor.close();
                return gVar;
            }
            if (cursor.getLong(0) == j8) {
                gVar.f5388b = cursor.getLong(1);
                gVar.f5387a = cursor.getLong(2);
                gVar.f5389c = cursor.getLong(3);
                gVar.d = cursor.getLong(4);
                gVar.f5390e = cursor.getLong(5);
            }
            if (z10) {
                gVar.f5388b += j10;
            }
            if (z11) {
                gVar.f5387a += j10;
            }
            if (z12) {
                gVar.f5389c += j10;
            }
            if (z13) {
                gVar.d += j10;
            }
            if (z14) {
                gVar.f5390e += j10;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j8));
            contentValues.put("daily_public_events_count", Long.valueOf(gVar.f5387a));
            contentValues.put("daily_events_count", Long.valueOf(gVar.f5388b));
            contentValues.put("daily_conversions_count", Long.valueOf(gVar.f5389c));
            contentValues.put("daily_error_events_count", Long.valueOf(gVar.d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(gVar.f5390e));
            y10.update("apps", contentValues, "app_id=?", strArr);
            cursor.close();
            return gVar;
        } catch (SQLiteException e10) {
            g3 g3Var2 = i4Var.w;
            i4.n(g3Var2);
            g3Var2.f5397t.c(g3.p(str), e10, "Error updating daily counts. appId");
            if (cursor != null) {
                cursor.close();
            }
            return gVar;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void P(String str, String str2, byte[] bArr) {
        i4 i4Var = this.f5649o;
        m.e(str);
        g();
        h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        try {
            if (((long) y().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                g3 g3Var = i4Var.w;
                i4.n(g3Var);
                g3Var.f5397t.b(g3.p(str), "Failed to update remote config (got 0). appId");
            }
        } catch (SQLiteException e10) {
            g3 g3Var2 = i4Var.w;
            i4.n(g3Var2);
            g3Var2.f5397t.c(g3.p(str), e10, "Error storing remote config. appId");
        }
    }

    public final void Q(f3 f3Var, boolean z10) {
        f3 f3Var2;
        String str;
        e3 e3Var;
        g();
        h();
        m.e(f3Var.r());
        if (f3Var.r1()) {
            k();
            i4 i4Var = this.f5649o;
            i4Var.B.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            long s12 = f3Var.s1();
            s2<Long> s2Var = u2.C;
            int i10 = (s12 > (currentTimeMillis - s2Var.a(null).longValue()) ? 1 : (s12 == (currentTimeMillis - s2Var.a(null).longValue()) ? 0 : -1));
            g3 g3Var = i4Var.w;
            if (i10 < 0 || f3Var.s1() > s2Var.a(null).longValue() + currentTimeMillis) {
                i4.n(g3Var);
                g3Var.w.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", g3.p(f3Var.r()), Long.valueOf(currentTimeMillis), Long.valueOf(f3Var.s1()));
            }
            byte[] a10 = f3Var.a();
            try {
                b7 b7Var = this.f5701p.u;
                z6.E(b7Var);
                byte[] D = b7Var.D(a10);
                i4.n(g3Var);
                g3Var.B.b(Integer.valueOf(D.length), "Saving bundle, size");
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", f3Var.r());
                contentValues.put("bundle_end_timestamp", Long.valueOf(f3Var.s1()));
                contentValues.put("data", D);
                contentValues.put("has_realtime", Integer.valueOf(z10 ? 1 : 0));
                if (f3Var.t0()) {
                    contentValues.put("retry_count", Integer.valueOf(f3Var.u0()));
                }
                try {
                    if (y().insert("queue", (String) null, contentValues) == -1) {
                        i4.n(g3Var);
                        g3Var.f5397t.b(g3.p(f3Var.r()), "Failed to insert bundle (got -1). appId");
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    i4.n(g3Var);
                    f3Var2 = g3.p(f3Var.r());
                    e3Var = g3Var.f5397t;
                    str = "Error storing bundle. appId";
                    e3Var.c(f3Var2, e, str);
                }
            } catch (IOException e11) {
                e = e11;
                i4.n(g3Var);
                f3Var2 = g3.p(f3Var.r());
                e3Var = g3Var.f5397t;
                str = "Data loss. Failed to serialize bundle. appId";
                e3Var.c(f3Var2, e, str);
            }
        } else {
            throw new IllegalStateException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String R() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.y()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0022, all -> 0x0020 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001e }
            r0.close()
            return r1
        L_0x001a:
            r0.close()
            return r1
        L_0x001e:
            r2 = move-exception
            goto L_0x0025
        L_0x0020:
            r0 = move-exception
            goto L_0x003d
        L_0x0022:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L_0x0025:
            h5.i4 r3 = r6.f5649o     // Catch:{ all -> 0x0039 }
            h5.g3 r3 = r3.w     // Catch:{ all -> 0x0039 }
            h5.i4.n(r3)     // Catch:{ all -> 0x0039 }
            h5.e3 r3 = r3.f5397t     // Catch:{ all -> 0x0039 }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r2, r4)     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0038
            r0.close()
        L_0x0038:
            return r1
        L_0x0039:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x003d:
            if (r1 == 0) goto L_0x0042
            r1.close()
        L_0x0042:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.i.R():java.lang.String");
    }

    public final void i() {
    }

    public final void k() {
        g();
        h();
        if (q()) {
            z6 z6Var = this.f5701p;
            long a10 = z6Var.w.u.a();
            i4 i4Var = this.f5649o;
            i4Var.B.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - a10) > u2.f5748x.a(null).longValue()) {
                z6Var.w.u.b(elapsedRealtime);
                g();
                h();
                if (q()) {
                    SQLiteDatabase y10 = y();
                    i4Var.B.getClass();
                    int delete = y10.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(u2.C.a(null).longValue())});
                    if (delete > 0) {
                        g3 g3Var = i4Var.w;
                        i4.n(g3Var);
                        g3Var.B.b(Integer.valueOf(delete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void l(List<Long> list) {
        g();
        h();
        if (list.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        } else if (q()) {
            String join = TextUtils.join(",", list);
            String f10 = x0.f(new StringBuilder(String.valueOf(join).length() + 2), "(", join, ")");
            int i10 = (t(x0.f(new StringBuilder(String.valueOf(f10).length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", f10, " AND retry_count =  2147483647 LIMIT 1"), (String[]) null) > 0 ? 1 : (t(x0.f(new StringBuilder(String.valueOf(f10).length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", f10, " AND retry_count =  2147483647 LIMIT 1"), (String[]) null) == 0 ? 0 : -1));
            i4 i4Var = this.f5649o;
            if (i10 > 0) {
                g3 g3Var = i4Var.w;
                i4.n(g3Var);
                g3Var.w.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase y10 = y();
                StringBuilder sb = new StringBuilder(String.valueOf(f10).length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(f10);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                y10.execSQL(sb.toString());
            } catch (SQLiteException e10) {
                g3 g3Var2 = i4Var.w;
                i4.n(g3Var2);
                g3Var2.f5397t.b(e10, "Error incrementing retry count. error");
            }
        }
    }

    public final Object m(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        i4 i4Var = this.f5649o;
        if (type == 0) {
            g3 g3Var = i4Var.w;
            i4.n(g3Var);
            g3Var.f5397t.a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i10));
            }
            if (type == 3) {
                return cursor.getString(i10);
            }
            if (type != 4) {
                g3 g3Var2 = i4Var.w;
                i4.n(g3Var2);
                g3Var2.f5397t.b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
                return null;
            }
            g3 g3Var3 = i4Var.w;
            i4.n(g3Var3);
            g3Var3.f5397t.a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    public final long n(String str) {
        String str2 = str;
        i4 i4Var = this.f5649o;
        m.e(str);
        m.e("first_open_count");
        g();
        h();
        SQLiteDatabase y10 = y();
        y10.beginTransaction();
        long j8 = 0;
        try {
            StringBuilder sb = new StringBuilder(48);
            sb.append("select first_open_count from app2 where app_id=?");
            long u10 = u(sb.toString(), new String[]{str2}, -1);
            if (u10 == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str2);
                contentValues.put("first_open_count", 0);
                contentValues.put("previous_install_count", 0);
                if (y10.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                    g3 g3Var = i4Var.w;
                    i4.n(g3Var);
                    g3Var.f5397t.c(g3.p(str), "first_open_count", "Failed to insert column (got -1). appId");
                    y10.endTransaction();
                    return -1;
                }
                u10 = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str2);
                contentValues2.put("first_open_count", Long.valueOf(1 + u10));
                if (((long) y10.update("app2", contentValues2, "app_id = ?", new String[]{str2})) == 0) {
                    g3 g3Var2 = i4Var.w;
                    i4.n(g3Var2);
                    g3Var2.f5397t.c(g3.p(str), "first_open_count", "Failed to update column (got 0). appId");
                    y10.endTransaction();
                    return -1;
                }
                y10.setTransactionSuccessful();
                y10.endTransaction();
                return u10;
            } catch (SQLiteException e10) {
                e = e10;
                j8 = u10;
                try {
                    g3 g3Var3 = i4Var.w;
                    i4.n(g3Var3);
                    g3Var3.f5397t.d("Error inserting column. appId", g3.p(str), "first_open_count", e);
                    y10.endTransaction();
                    return j8;
                } catch (Throwable th) {
                    y10.endTransaction();
                    throw th;
                }
            }
        } catch (SQLiteException e11) {
            e = e11;
            g3 g3Var32 = i4Var.w;
            i4.n(g3Var32);
            g3Var32.f5397t.d("Error inserting column. appId", g3.p(str), "first_open_count", e);
            y10.endTransaction();
            return j8;
        }
    }

    public final long o(String str) {
        m.e(str);
        return u("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    public final void p(String str, Long l, long j8, x2 x2Var) {
        g();
        h();
        m.h(x2Var);
        m.e(str);
        byte[] a10 = x2Var.a();
        i4 i4Var = this.f5649o;
        g3 g3Var = i4Var.w;
        g3 g3Var2 = i4Var.w;
        i4.n(g3Var);
        b3 b3Var = i4Var.A;
        i4.l(b3Var);
        g3Var.B.c(b3Var.l(str), Integer.valueOf(a10.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j8));
        contentValues.put("main_event", a10);
        try {
            if (y().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) == -1) {
                i4.n(g3Var2);
                g3Var2.f5397t.b(g3.p(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e10) {
            i4.n(g3Var2);
            g3Var2.f5397t.c(g3.p(str), e10, "Error storing complex main event. appId");
        }
    }

    public final boolean q() {
        i4 i4Var = this.f5649o;
        Context context = i4Var.f5452o;
        i4Var.getClass();
        return context.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: java.lang.String[]} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x0087=Splitter:B:28:0x0087, B:12:0x003d=Splitter:B:12:0x003d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(long r22, long r24, h5.y6 r26) {
        /*
            r21 = this;
            r1 = r21
            r2 = r26
            h5.i4 r3 = r1.f5649o
            r21.g()
            r21.h()
            r4 = 0
            android.database.sqlite.SQLiteDatabase r0 = r21.y()     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            r14 = 0
            r15 = 1
            r16 = -1
            r13 = 2
            java.lang.String r6 = ""
            if (r5 == 0) goto L_0x0070
            int r5 = (r24 > r16 ? 1 : (r24 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x0031
            java.lang.String[] r7 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            java.lang.String r8 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            r7[r14] = r8     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            java.lang.String r8 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            r7[r15] = r8     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            goto L_0x0039
        L_0x0031:
            java.lang.String[] r7 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            java.lang.String r8 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            r7[r14] = r8     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
        L_0x0039:
            if (r5 == 0) goto L_0x003d
            java.lang.String r6 = "rowid <= ? and "
        L_0x003d:
            int r5 = r6.length()     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            int r5 = r5 + 148
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            r8.<init>(r5)     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            java.lang.String r5 = "select app_id, metadata_fingerprint from raw_events where "
            r8.append(r5)     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            r8.append(r6)     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            java.lang.String r5 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r8.append(r5)     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            java.lang.String r5 = r8.toString()     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            android.database.Cursor r5 = r0.rawQuery(r5, r7)     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            if (r6 != 0) goto L_0x0067
            r5.close()
            return
        L_0x0067:
            java.lang.String r4 = r5.getString(r14)     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            java.lang.String r6 = r5.getString(r15)     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            goto L_0x00b5
        L_0x0070:
            int r5 = (r24 > r16 ? 1 : (r24 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x007f
            java.lang.String[] r7 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            r7[r14] = r4     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            java.lang.String r8 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            r7[r15] = r8     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            goto L_0x0083
        L_0x007f:
            java.lang.String[] r7 = new java.lang.String[]{r4}     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
        L_0x0083:
            if (r5 == 0) goto L_0x0087
            java.lang.String r6 = " and rowid <= ?"
        L_0x0087:
            int r5 = r6.length()     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            int r5 = r5 + 84
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            r8.<init>(r5)     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            java.lang.String r5 = "select metadata_fingerprint from raw_events where app_id = ?"
            r8.append(r5)     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            r8.append(r6)     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            java.lang.String r5 = " order by rowid limit 1;"
            r8.append(r5)     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            java.lang.String r5 = r8.toString()     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            android.database.Cursor r5 = r0.rawQuery(r5, r7)     // Catch:{ SQLiteException -> 0x0215, all -> 0x0213 }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            if (r6 != 0) goto L_0x00b1
            r5.close()
            return
        L_0x00b1:
            java.lang.String r6 = r5.getString(r14)     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
        L_0x00b5:
            r5.close()     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            r18 = r5
            r19 = r6
            java.lang.String r5 = "metadata"
            java.lang.String[] r7 = new java.lang.String[]{r5}     // Catch:{ SQLiteException -> 0x0208, all -> 0x0204 }
            java.lang.String[] r9 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0208, all -> 0x0204 }
            r9[r14] = r4     // Catch:{ SQLiteException -> 0x0208, all -> 0x0204 }
            r9[r15] = r19     // Catch:{ SQLiteException -> 0x0208, all -> 0x0204 }
            java.lang.String r6 = "raw_events_metadata"
            java.lang.String r8 = "app_id = ? and metadata_fingerprint = ?"
            r10 = 0
            r11 = 0
            java.lang.String r12 = "rowid"
            java.lang.String r20 = "2"
            r5 = r0
            r13 = r20
            android.database.Cursor r13 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ SQLiteException -> 0x0208, all -> 0x0204 }
            boolean r5 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x01db, all -> 0x01fe }
            if (r5 != 0) goto L_0x00f3
            h5.g3 r0 = r3.w     // Catch:{ SQLiteException -> 0x01db, all -> 0x01fe }
            h5.i4.n(r0)     // Catch:{ SQLiteException -> 0x01db, all -> 0x01fe }
            h5.e3 r0 = r0.f5397t     // Catch:{ SQLiteException -> 0x01db, all -> 0x01fe }
            java.lang.String r2 = "Raw event metadata record is missing. appId"
            h5.f3 r5 = h5.g3.p(r4)     // Catch:{ SQLiteException -> 0x01db, all -> 0x01fe }
            r0.b(r5, r2)     // Catch:{ SQLiteException -> 0x01db, all -> 0x01fe }
            r13.close()
            return
        L_0x00f3:
            byte[] r5 = r13.getBlob(r14)     // Catch:{ SQLiteException -> 0x01db, all -> 0x01fe }
            com.google.android.gms.internal.measurement.e3 r6 = com.google.android.gms.internal.measurement.f3.B0()     // Catch:{ IOException -> 0x01df }
            com.google.android.gms.internal.measurement.b6 r5 = h5.b7.E(r6, r5)     // Catch:{ IOException -> 0x01df }
            com.google.android.gms.internal.measurement.e3 r5 = (com.google.android.gms.internal.measurement.e3) r5     // Catch:{ IOException -> 0x01df }
            com.google.android.gms.internal.measurement.f6 r5 = r5.j()     // Catch:{ IOException -> 0x01df }
            com.google.android.gms.internal.measurement.f3 r5 = (com.google.android.gms.internal.measurement.f3) r5     // Catch:{ IOException -> 0x01df }
            boolean r6 = r13.moveToNext()     // Catch:{ SQLiteException -> 0x01db, all -> 0x01fe }
            if (r6 == 0) goto L_0x011d
            h5.g3 r6 = r3.w     // Catch:{ SQLiteException -> 0x01db, all -> 0x01fe }
            h5.i4.n(r6)     // Catch:{ SQLiteException -> 0x01db, all -> 0x01fe }
            h5.e3 r6 = r6.w     // Catch:{ SQLiteException -> 0x01db, all -> 0x01fe }
            java.lang.String r7 = "Get multiple raw event metadata records, expected one. appId"
            h5.f3 r8 = h5.g3.p(r4)     // Catch:{ SQLiteException -> 0x01db, all -> 0x01fe }
            r6.b(r8, r7)     // Catch:{ SQLiteException -> 0x01db, all -> 0x01fe }
        L_0x011d:
            r13.close()     // Catch:{ SQLiteException -> 0x01db, all -> 0x01fe }
            r2.f5826a = r5     // Catch:{ SQLiteException -> 0x01db, all -> 0x01fe }
            int r5 = (r24 > r16 ? 1 : (r24 == r16 ? 0 : -1))
            r12 = 3
            if (r5 == 0) goto L_0x0137
            java.lang.String r5 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x01db, all -> 0x01fe }
            r6[r14] = r4     // Catch:{ SQLiteException -> 0x01db, all -> 0x01fe }
            r6[r15] = r19     // Catch:{ SQLiteException -> 0x01db, all -> 0x01fe }
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x01db, all -> 0x01fe }
            r11 = 2
            r6[r11] = r7     // Catch:{ SQLiteException -> 0x01db, all -> 0x01fe }
            goto L_0x0140
        L_0x0137:
            r11 = 2
            java.lang.String r5 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x01db, all -> 0x01fe }
            r6[r14] = r4     // Catch:{ SQLiteException -> 0x01db, all -> 0x01fe }
            r6[r15] = r19     // Catch:{ SQLiteException -> 0x01db, all -> 0x01fe }
        L_0x0140:
            r8 = r5
            r9 = r6
            java.lang.String r5 = "rowid"
            java.lang.String r6 = "name"
            java.lang.String r7 = "timestamp"
            java.lang.String r10 = "data"
            java.lang.String[] r7 = new java.lang.String[]{r5, r6, r7, r10}     // Catch:{ SQLiteException -> 0x01db, all -> 0x01fe }
            java.lang.String r6 = "raw_events"
            r10 = 0
            r16 = 0
            java.lang.String r17 = "rowid"
            r18 = 0
            r5 = r0
            r11 = r16
            r15 = r12
            r12 = r17
            r17 = r13
            r13 = r18
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ SQLiteException -> 0x01fa, all -> 0x01f6 }
            boolean r0 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            if (r0 == 0) goto L_0x01c7
        L_0x016b:
            long r6 = r5.getLong(r14)     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            byte[] r0 = r5.getBlob(r15)     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            com.google.android.gms.internal.measurement.w2 r8 = com.google.android.gms.internal.measurement.x2.B()     // Catch:{ IOException -> 0x01aa }
            com.google.android.gms.internal.measurement.b6 r0 = h5.b7.E(r8, r0)     // Catch:{ IOException -> 0x01aa }
            com.google.android.gms.internal.measurement.w2 r0 = (com.google.android.gms.internal.measurement.w2) r0     // Catch:{ IOException -> 0x01aa }
            r8 = 1
            java.lang.String r9 = r5.getString(r8)     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            r0.w(r9)     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            r9 = 2
            long r10 = r5.getLong(r9)     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            boolean r12 = r0.f2636q     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            if (r12 == 0) goto L_0x0193
            r0.m()     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            r0.f2636q = r14     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
        L_0x0193:
            MessageType r12 = r0.f2635p     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            com.google.android.gms.internal.measurement.x2 r12 = (com.google.android.gms.internal.measurement.x2) r12     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            com.google.android.gms.internal.measurement.x2.J(r10, r12)     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            com.google.android.gms.internal.measurement.f6 r0 = r0.j()     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            com.google.android.gms.internal.measurement.x2 r0 = (com.google.android.gms.internal.measurement.x2) r0     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            boolean r0 = r2.a(r6, r0)     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            if (r0 != 0) goto L_0x01bd
            r5.close()
            return
        L_0x01aa:
            r0 = move-exception
            r8 = 1
            r9 = 2
            h5.g3 r6 = r3.w     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            h5.i4.n(r6)     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            h5.e3 r6 = r6.f5397t     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            java.lang.String r7 = "Data loss. Failed to merge raw event. appId"
            h5.f3 r10 = h5.g3.p(r4)     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            r6.c(r10, r0, r7)     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
        L_0x01bd:
            boolean r0 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            if (r0 != 0) goto L_0x016b
            r5.close()
            return
        L_0x01c7:
            h5.g3 r0 = r3.w     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            h5.i4.n(r0)     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            h5.e3 r0 = r0.w     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            java.lang.String r2 = "Raw event data disappeared while in transaction. appId"
            h5.f3 r6 = h5.g3.p(r4)     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            r0.b(r6, r2)     // Catch:{ SQLiteException -> 0x020f, all -> 0x020c }
            r5.close()
            return
        L_0x01db:
            r0 = move-exception
            r17 = r13
            goto L_0x0218
        L_0x01df:
            r0 = move-exception
            r17 = r13
            h5.g3 r2 = r3.w     // Catch:{ SQLiteException -> 0x01fa, all -> 0x01f6 }
            h5.i4.n(r2)     // Catch:{ SQLiteException -> 0x01fa, all -> 0x01f6 }
            h5.e3 r2 = r2.f5397t     // Catch:{ SQLiteException -> 0x01fa, all -> 0x01f6 }
            java.lang.String r5 = "Data loss. Failed to merge raw event metadata. appId"
            h5.f3 r6 = h5.g3.p(r4)     // Catch:{ SQLiteException -> 0x01fa, all -> 0x01f6 }
            r2.c(r6, r0, r5)     // Catch:{ SQLiteException -> 0x01fa, all -> 0x01f6 }
            r17.close()
            return
        L_0x01f6:
            r0 = move-exception
            r18 = r17
            goto L_0x0205
        L_0x01fa:
            r0 = move-exception
            r18 = r17
            goto L_0x0209
        L_0x01fe:
            r0 = move-exception
            r17 = r13
        L_0x0201:
            r4 = r17
            goto L_0x0230
        L_0x0204:
            r0 = move-exception
        L_0x0205:
            r4 = r18
            goto L_0x0230
        L_0x0208:
            r0 = move-exception
        L_0x0209:
            r17 = r18
            goto L_0x0218
        L_0x020c:
            r0 = move-exception
            r4 = r5
            goto L_0x0230
        L_0x020f:
            r0 = move-exception
            r17 = r5
            goto L_0x0218
        L_0x0213:
            r0 = move-exception
            goto L_0x0230
        L_0x0215:
            r0 = move-exception
            r17 = r4
        L_0x0218:
            h5.g3 r2 = r3.w     // Catch:{ all -> 0x022e }
            h5.i4.n(r2)     // Catch:{ all -> 0x022e }
            h5.e3 r2 = r2.f5397t     // Catch:{ all -> 0x022e }
            java.lang.String r3 = "Data loss. Error selecting raw event. appId"
            h5.f3 r4 = h5.g3.p(r4)     // Catch:{ all -> 0x022e }
            r2.c(r4, r0, r3)     // Catch:{ all -> 0x022e }
            if (r17 == 0) goto L_0x022d
            r17.close()
        L_0x022d:
            return
        L_0x022e:
            r0 = move-exception
            goto L_0x0201
        L_0x0230:
            if (r4 == 0) goto L_0x0235
            r4.close()
        L_0x0235:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.i.r(long, long, h5.y6):void");
    }

    public final long t(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = y().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j8 = cursor.getLong(0);
                cursor.close();
                return j8;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e10) {
            g3 g3Var = this.f5649o.w;
            i4.n(g3Var);
            g3Var.f5397t.c(str, e10, "Database error");
            throw e10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long u(String str, String[] strArr, long j8) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = y().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j10 = rawQuery.getLong(0);
                rawQuery.close();
                return j10;
            }
            rawQuery.close();
            return j8;
        } catch (SQLiteException e10) {
            g3 g3Var = this.f5649o.w;
            i4.n(g3Var);
            g3Var.f5397t.c(str, e10, "Database error");
            throw e10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void v() {
        h();
        y().beginTransaction();
    }

    public final void w() {
        h();
        y().setTransactionSuccessful();
    }

    public final void x() {
        h();
        y().endTransaction();
    }

    public final SQLiteDatabase y() {
        g();
        try {
            return this.f5447r.getWritableDatabase();
        } catch (SQLiteException e10) {
            g3 g3Var = this.f5649o.w;
            i4.n(g3Var);
            g3Var.w.b(e10, "Error opening database");
            throw e10;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final h5.m z(java.lang.String r28, java.lang.String r29) {
        /*
            r27 = this;
            r1 = r27
            r15 = r29
            h5.i4 r13 = r1.f5649o
            n4.m.e(r28)
            n4.m.e(r29)
            r27.g()
            r27.h()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r2 = "lifetime_count"
            java.lang.String r3 = "current_bundle_count"
            java.lang.String r4 = "last_fire_timestamp"
            java.lang.String r5 = "last_bundled_timestamp"
            java.lang.String r6 = "last_bundled_day"
            java.lang.String r7 = "last_sampled_complex_event_id"
            java.lang.String r8 = "last_sampling_rate"
            java.lang.String r9 = "last_exempt_from_sampling"
            java.lang.String r10 = "current_session_count"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r19 = 0
            android.database.sqlite.SQLiteDatabase r2 = r27.y()     // Catch:{ SQLiteException -> 0x0124, all -> 0x0122 }
            r10 = 0
            java.lang.String[] r3 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0124, all -> 0x0122 }
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch:{ SQLiteException -> 0x0124, all -> 0x0122 }
            r4 = r0
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ SQLiteException -> 0x0124, all -> 0x0122 }
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0124, all -> 0x0122 }
            r6[r10] = r28     // Catch:{ SQLiteException -> 0x0124, all -> 0x0122 }
            r11 = 1
            r6[r11] = r15     // Catch:{ SQLiteException -> 0x0124, all -> 0x0122 }
            java.lang.String r3 = "events"
            java.lang.String r5 = "app_id=? and name=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r14 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0124, all -> 0x0122 }
            boolean r2 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r2 != 0) goto L_0x005e
            r14.close()
            return r19
        L_0x005e:
            long r5 = r14.getLong(r10)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            long r7 = r14.getLong(r11)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            long r16 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r0 = 3
            boolean r2 = r14.isNull(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r3 = 0
            if (r2 == 0) goto L_0x0076
            r20 = r3
            goto L_0x007a
        L_0x0076:
            long r20 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
        L_0x007a:
            r0 = 4
            boolean r2 = r14.isNull(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r2 == 0) goto L_0x0084
            r0 = r19
            goto L_0x008c
        L_0x0084:
            long r22 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
        L_0x008c:
            r2 = 5
            boolean r9 = r14.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x0096
            r18 = r19
            goto L_0x00a0
        L_0x0096:
            long r22 = r14.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r18 = r2
        L_0x00a0:
            r2 = 6
            boolean r9 = r14.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x00aa
            r22 = r19
            goto L_0x00b4
        L_0x00aa:
            long r22 = r14.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r22 = r2
        L_0x00b4:
            r2 = 7
            boolean r9 = r14.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 != 0) goto L_0x00cd
            long r23 = r14.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r25 = 1
            int r2 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r2 != 0) goto L_0x00c6
            r10 = r11
        L_0x00c6:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r23 = r2
            goto L_0x00cf
        L_0x00cd:
            r23 = r19
        L_0x00cf:
            r2 = 8
            boolean r9 = r14.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x00d9
            r9 = r3
            goto L_0x00de
        L_0x00d9:
            long r2 = r14.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r9 = r2
        L_0x00de:
            h5.m r24 = new h5.m     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r2 = r24
            r3 = r28
            r4 = r29
            r11 = r16
            r1 = r13
            r25 = r14
            r13 = r20
            r15 = r0
            r16 = r18
            r17 = r22
            r18 = r23
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            boolean r0 = r25.moveToNext()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            if (r0 == 0) goto L_0x010d
            h5.g3 r0 = r1.w     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            h5.i4.n(r0)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            h5.e3 r0 = r0.f5397t     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            java.lang.String r2 = "Got multiple records for event aggregates, expected one. appId"
            h5.f3 r3 = h5.g3.p(r28)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            r0.b(r3, r2)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
        L_0x010d:
            r25.close()
            return r24
        L_0x0111:
            r0 = move-exception
            goto L_0x0118
        L_0x0113:
            r0 = move-exception
            goto L_0x011f
        L_0x0115:
            r0 = move-exception
            r25 = r14
        L_0x0118:
            r19 = r25
            goto L_0x014c
        L_0x011b:
            r0 = move-exception
            r1 = r13
            r25 = r14
        L_0x011f:
            r14 = r25
            goto L_0x0128
        L_0x0122:
            r0 = move-exception
            goto L_0x014c
        L_0x0124:
            r0 = move-exception
            r1 = r13
            r14 = r19
        L_0x0128:
            h5.g3 r2 = r1.w     // Catch:{ all -> 0x0149 }
            h5.i4.n(r2)     // Catch:{ all -> 0x0149 }
            h5.e3 r2 = r2.f5397t     // Catch:{ all -> 0x0149 }
            java.lang.String r3 = "Error querying events. appId"
            h5.f3 r4 = h5.g3.p(r28)     // Catch:{ all -> 0x0149 }
            h5.b3 r1 = r1.A     // Catch:{ all -> 0x0149 }
            h5.i4.l(r1)     // Catch:{ all -> 0x0149 }
            r5 = r29
            java.lang.String r1 = r1.l(r5)     // Catch:{ all -> 0x0149 }
            r2.d(r3, r4, r1, r0)     // Catch:{ all -> 0x0149 }
            if (r14 == 0) goto L_0x0148
            r14.close()
        L_0x0148:
            return r19
        L_0x0149:
            r0 = move-exception
            r19 = r14
        L_0x014c:
            if (r19 == 0) goto L_0x0151
            r19.close()
        L_0x0151:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.i.z(java.lang.String, java.lang.String):h5.m");
    }
}

package h5;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import s6.a;

public final class h extends SQLiteOpenHelper {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ i f5422o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(i iVar, Context context) {
        super(context, "google_app_measurement.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f5422o = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002c A[SYNTHETIC, Splitter:B:7:0x002c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.sqlite.SQLiteDatabase getWritableDatabase() {
        /*
            r9 = this;
            h5.i r0 = r9.f5422o
            h5.r6 r1 = r0.f5448s
            h5.i4 r2 = r0.f5649o
            r2.getClass()
            long r3 = r1.f5675b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0012
            goto L_0x0027
        L_0x0012:
            r4.c r3 = r1.f5674a
            r4.d r3 = (r4.d) r3
            r3.getClass()
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r7 = r1.f5675b
            long r3 = r3 - r7
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 < 0) goto L_0x0029
        L_0x0027:
            r1 = 1
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            if (r1 == 0) goto L_0x007e
            android.database.sqlite.SQLiteDatabase r0 = super.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0031 }
            return r0
        L_0x0031:
            h5.r6 r0 = r0.f5448s
            r4.c r1 = r0.f5674a
            r4.d r1 = (r4.d) r1
            r1.getClass()
            long r3 = android.os.SystemClock.elapsedRealtime()
            r0.f5675b = r3
            h5.g3 r1 = r2.w
            h5.i4.n(r1)
            java.lang.String r3 = "Opening the database failed, dropping and recreating it"
            h5.e3 r1 = r1.f5397t
            r1.a(r3)
            r2.getClass()
            android.content.Context r1 = r2.f5452o
            java.lang.String r3 = "google_app_measurement.db"
            java.io.File r1 = r1.getDatabasePath(r3)
            boolean r1 = r1.delete()
            if (r1 != 0) goto L_0x0069
            h5.g3 r1 = r2.w
            h5.i4.n(r1)
            java.lang.String r4 = "Failed to delete corrupted db file"
            h5.e3 r1 = r1.f5397t
            r1.b(r3, r4)
        L_0x0069:
            android.database.sqlite.SQLiteDatabase r1 = super.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0070 }
            r0.f5675b = r5     // Catch:{ SQLiteException -> 0x0070 }
            return r1
        L_0x0070:
            r0 = move-exception
            h5.g3 r1 = r2.w
            h5.i4.n(r1)
            java.lang.String r2 = "Failed to open freshly created database"
            h5.e3 r1 = r1.f5397t
            r1.b(r0, r2)
            throw r0
        L_0x007e:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            java.lang.String r1 = "Database open failed"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.h.getWritableDatabase():android.database.sqlite.SQLiteDatabase");
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        g3 g3Var = this.f5422o.f5649o.w;
        i4.n(g3Var);
        a.h0(g3Var, sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        i iVar = this.f5422o;
        g3 g3Var = iVar.f5649o.w;
        i4.n(g3Var);
        a.b0(g3Var, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", i.f5443t);
        g3 g3Var2 = iVar.f5649o.w;
        i4.n(g3Var2);
        a.b0(g3Var2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", (String[]) null);
        g3 g3Var3 = iVar.f5649o.w;
        i4.n(g3Var3);
        a.b0(g3Var3, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", i.u);
        g3 g3Var4 = iVar.f5649o.w;
        i4.n(g3Var4);
        a.b0(g3Var4, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", i.f5444v);
        g3 g3Var5 = iVar.f5649o.w;
        i4.n(g3Var5);
        a.b0(g3Var5, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", i.f5445x);
        g3 g3Var6 = iVar.f5649o.w;
        i4.n(g3Var6);
        a.b0(g3Var6, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", (String[]) null);
        g3 g3Var7 = iVar.f5649o.w;
        i4.n(g3Var7);
        a.b0(g3Var7, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", i.w);
        g3 g3Var8 = iVar.f5649o.w;
        i4.n(g3Var8);
        a.b0(g3Var8, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", i.f5446y);
        g3 g3Var9 = iVar.f5649o.w;
        i4.n(g3Var9);
        a.b0(g3Var9, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", i.z);
        g3 g3Var10 = iVar.f5649o.w;
        i4.n(g3Var10);
        a.b0(g3Var10, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", (String[]) null);
        g3 g3Var11 = iVar.f5649o.w;
        i4.n(g3Var11);
        a.b0(g3Var11, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", i.A);
        g3 g3Var12 = iVar.f5649o.w;
        i4.n(g3Var12);
        a.b0(g3Var12, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", (String[]) null);
        g3 g3Var13 = iVar.f5649o.w;
        i4.n(g3Var13);
        a.b0(g3Var13, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", (String[]) null);
        g3 g3Var14 = iVar.f5649o.w;
        i4.n(g3Var14);
        a.b0(g3Var14, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", (String[]) null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}

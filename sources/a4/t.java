package a4;

import a4.v;
import android.database.sqlite.SQLiteDatabase;

public final /* synthetic */ class t implements v.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f101a;

    public /* synthetic */ t(int i10) {
        this.f101a = i10;
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        switch (this.f101a) {
            case 0:
                sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
                return;
            default:
                sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                sQLiteDatabase.execSQL(v.f102q);
                return;
        }
    }
}

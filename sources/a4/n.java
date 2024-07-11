package a4;

import a4.q;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import x3.c;

public final /* synthetic */ class n implements q.a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f82o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ q f83p;

    public /* synthetic */ n(q qVar, int i10) {
        this.f82o = i10;
        this.f83p = qVar;
    }

    public final Object apply(Object obj) {
        int i10 = this.f82o;
        q qVar = this.f83p;
        switch (i10) {
            case 0:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                qVar.getClass();
                sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
                sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + qVar.f90p.a()).execute();
                return null;
            case 1:
                Cursor cursor = (Cursor) obj;
                qVar.getClass();
                while (cursor.moveToNext()) {
                    int i11 = cursor.getInt(0);
                    qVar.a((long) i11, c.a.MESSAGE_TOO_OLD, cursor.getString(1));
                }
                return null;
            default:
                Cursor cursor2 = (Cursor) obj;
                qVar.getClass();
                while (cursor2.moveToNext()) {
                    int i12 = cursor2.getInt(0);
                    qVar.a((long) i12, c.a.MAX_RETRIES_REACHED, cursor2.getString(1));
                }
                return null;
        }
    }
}

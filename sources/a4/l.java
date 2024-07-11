package a4;

import a4.q;
import android.database.sqlite.SQLiteDatabase;

public final /* synthetic */ class l implements q.a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ q f78o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ long f79p;

    public /* synthetic */ l(q qVar, long j8) {
        this.f78o = qVar;
        this.f79p = j8;
    }

    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        q qVar = this.f78o;
        qVar.getClass();
        String[] strArr = {String.valueOf(this.f79p)};
        q.o(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new n(qVar, 1));
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }
}

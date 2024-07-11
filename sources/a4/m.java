package a4;

import a4.q;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import d4.a;
import t3.s;

public final /* synthetic */ class m implements q.a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ long f80o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ s f81p;

    public /* synthetic */ m(long j8, s sVar) {
        this.f80o = j8;
        this.f81p = sVar;
    }

    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f80o));
        s sVar = this.f81p;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{sVar.b(), String.valueOf(a.a(sVar.d()))}) < 1) {
            contentValues.put("backend_name", sVar.b());
            contentValues.put("priority", Integer.valueOf(a.a(sVar.d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }
}

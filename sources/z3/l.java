package z3;

import a4.q;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import b4.b;
import t3.s;
import x3.c;

public final /* synthetic */ class l implements b.a, q.a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ long f9903o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f9904p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f9905q;

    public /* synthetic */ l(long j8, Object obj, Object obj2) {
        this.f9904p = obj;
        this.f9905q = obj2;
        this.f9903o = j8;
    }

    public final Object apply(Object obj) {
        String str = (String) this.f9904p;
        c.a aVar = (c.a) this.f9905q;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        q3.b bVar = q.f88t;
        boolean booleanValue = ((Boolean) q.o(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(aVar.getNumber())}), new r3.b(4))).booleanValue();
        long j8 = this.f9903o;
        if (!booleanValue) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(aVar.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j8));
            sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j8 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(aVar.getNumber())});
        }
        return null;
    }

    public final Object b() {
        m mVar = (m) this.f9904p;
        long a10 = mVar.f9911g.a() + this.f9903o;
        mVar.f9908c.a0(a10, (s) this.f9905q);
        return null;
    }
}

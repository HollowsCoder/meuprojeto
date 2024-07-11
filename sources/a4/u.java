package a4;

import a4.v;
import android.database.sqlite.SQLiteDatabase;

public final /* synthetic */ class u implements v.a {
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}

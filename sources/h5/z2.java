package h5;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import s6.a;

public final class z2 extends SQLiteOpenHelper {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ a3 f5833o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z2(a3 a3Var, Context context) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f5833o = a3Var;
    }

    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e10) {
            throw e10;
        } catch (SQLiteException unused) {
            a3 a3Var = this.f5833o;
            g3 g3Var = a3Var.f5649o.w;
            i4.n(g3Var);
            g3Var.f5397t.a("Opening the local database failed, dropping and recreating it");
            a3Var.f5649o.getClass();
            if (!a3Var.f5649o.f5452o.getDatabasePath("google_app_measurement_local.db").delete()) {
                g3 g3Var2 = a3Var.f5649o.w;
                i4.n(g3Var2);
                g3Var2.f5397t.b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e11) {
                g3 g3Var3 = a3Var.f5649o.w;
                i4.n(g3Var3);
                g3Var3.f5397t.b(e11, "Failed to open local database. Events will bypass local storage");
                return null;
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        g3 g3Var = this.f5833o.f5649o.w;
        i4.n(g3Var);
        a.h0(g3Var, sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        g3 g3Var = this.f5833o.f5649o.w;
        i4.n(g3Var);
        a.b0(g3Var, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}

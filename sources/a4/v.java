package a4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

public final class v extends SQLiteOpenHelper {

    /* renamed from: q  reason: collision with root package name */
    public static final String f102q = ("INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")");

    /* renamed from: r  reason: collision with root package name */
    public static final int f103r = 5;

    /* renamed from: s  reason: collision with root package name */
    public static final List<a> f104s = Arrays.asList(new a[]{new s(0), new t(0), new u(), new s(1), new t(1)});

    /* renamed from: o  reason: collision with root package name */
    public final int f105o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f106p = false;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    public v(int i10, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f105o = i10;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List<a> list = f104s;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                list.get(i10).a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i10 + " to " + i11 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f106p = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.f106p) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, this.f105o);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.f106p) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, i11);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f106p) {
            onConfigure(sQLiteDatabase);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (!this.f106p) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, i10, i11);
    }
}

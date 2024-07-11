package a4;

import a4.q;
import android.database.Cursor;
import x3.f;

public final /* synthetic */ class p implements q.a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ long f87o;

    public /* synthetic */ p(long j8) {
        this.f87o = j8;
    }

    public final Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        cursor.moveToNext();
        return new f(cursor.getLong(0), this.f87o);
    }
}

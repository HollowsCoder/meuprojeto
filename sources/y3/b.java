package y3;

import a4.d;
import a4.q;
import android.database.Cursor;
import b4.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import t3.h;
import t3.m;
import t3.n;
import t3.s;

public final /* synthetic */ class b implements b.a, q.a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ s f9539o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f9540p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f9541q;

    public /* synthetic */ b(q qVar, ArrayList arrayList, s sVar) {
        this.f9540p = qVar;
        this.f9541q = arrayList;
        this.f9539o = sVar;
    }

    public /* synthetic */ b(c cVar, s sVar, n nVar) {
        this.f9540p = cVar;
        this.f9539o = sVar;
        this.f9541q = nVar;
    }

    public final Object apply(Object obj) {
        boolean z;
        q3.b bVar;
        q3.b bVar2;
        q qVar = (q) this.f9540p;
        List list = (List) this.f9541q;
        Cursor cursor = (Cursor) obj;
        q3.b bVar3 = q.f88t;
        qVar.getClass();
        while (cursor.moveToNext()) {
            long j8 = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z = true;
            } else {
                z = false;
            }
            h.a aVar = new h.a();
            aVar.f8953f = new HashMap();
            aVar.d(cursor.getString(1));
            aVar.d = Long.valueOf(cursor.getLong(2));
            aVar.f8952e = Long.valueOf(cursor.getLong(3));
            if (z) {
                String string = cursor.getString(4);
                if (string == null) {
                    bVar2 = q.f88t;
                } else {
                    bVar2 = new q3.b(string);
                }
                aVar.c(new m(bVar2, cursor.getBlob(5)));
            } else {
                String string2 = cursor.getString(4);
                if (string2 == null) {
                    bVar = q.f88t;
                } else {
                    bVar = new q3.b(string2);
                }
                aVar.c(new m(bVar, (byte[]) q.o(qVar.f().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j8)}, (String) null, (String) null, "sequence_num"), new r3.b(5))));
            }
            if (!cursor.isNull(6)) {
                aVar.f8950b = Integer.valueOf(cursor.getInt(6));
            }
            list.add(new a4.b(j8, this.f9539o, aVar.b()));
        }
        return null;
    }

    public final Object b() {
        c cVar = (c) this.f9540p;
        d dVar = cVar.d;
        s sVar = this.f9539o;
        dVar.i(sVar, (n) this.f9541q);
        cVar.f9543a.a(sVar, 1);
        return null;
    }
}

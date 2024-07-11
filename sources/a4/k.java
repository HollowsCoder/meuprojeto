package a4;

import a4.q;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import d4.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import t3.n;
import t3.s;
import x3.a;
import x3.b;
import x3.c;
import x3.d;
import x3.e;
import x3.f;

public final /* synthetic */ class k implements q.a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f74o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ q f75p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f76q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f77r;

    public /* synthetic */ k(q qVar, Object obj, Object obj2, int i10) {
        this.f74o = i10;
        this.f75p = qVar;
        this.f76q = obj;
        this.f77r = obj2;
    }

    /* JADX INFO: finally extract failed */
    public final Object apply(Object obj) {
        boolean z;
        long j8;
        boolean z10;
        byte[] bArr;
        long insert;
        int i10 = this.f74o;
        q qVar = this.f75p;
        Object obj2 = this.f77r;
        Object obj3 = this.f76q;
        switch (i10) {
            case 0:
                n nVar = (n) obj3;
                s sVar = (s) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = qVar.f().compileStatement("PRAGMA page_count").simpleQueryForLong();
                e eVar = qVar.f92r;
                if (qVar.f().compileStatement("PRAGMA page_size").simpleQueryForLong() * simpleQueryForLong >= eVar.e()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    qVar.a(1, c.a.CACHE_FULL, nVar.g());
                    insert = -1;
                } else {
                    Long g10 = q.g(sQLiteDatabase, sVar);
                    if (g10 != null) {
                        j8 = g10.longValue();
                    } else {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("backend_name", sVar.b());
                        contentValues.put("priority", Integer.valueOf(a.a(sVar.d())));
                        contentValues.put("next_request_ms", 0);
                        if (sVar.c() != null) {
                            contentValues.put("extras", Base64.encodeToString(sVar.c(), 0));
                        }
                        j8 = sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
                    }
                    int d = eVar.d();
                    byte[] bArr2 = nVar.d().f8970b;
                    if (bArr2.length <= d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("context_id", Long.valueOf(j8));
                    contentValues2.put("transport_name", nVar.g());
                    contentValues2.put("timestamp_ms", Long.valueOf(nVar.e()));
                    contentValues2.put("uptime_ms", Long.valueOf(nVar.h()));
                    contentValues2.put("payload_encoding", nVar.d().f8969a.f8225a);
                    contentValues2.put("code", nVar.c());
                    contentValues2.put("num_attempts", 0);
                    contentValues2.put("inline", Boolean.valueOf(z10));
                    if (z10) {
                        bArr = bArr2;
                    } else {
                        bArr = new byte[0];
                    }
                    contentValues2.put("payload", bArr);
                    insert = sQLiteDatabase.insert("events", (String) null, contentValues2);
                    if (!z10) {
                        int ceil = (int) Math.ceil(((double) bArr2.length) / ((double) d));
                        for (int i11 = 1; i11 <= ceil; i11++) {
                            byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i11 - 1) * d, Math.min(i11 * d, bArr2.length));
                            ContentValues contentValues3 = new ContentValues();
                            contentValues3.put("event_id", Long.valueOf(insert));
                            contentValues3.put("sequence_num", Integer.valueOf(i11));
                            contentValues3.put("bytes", copyOfRange);
                            sQLiteDatabase.insert("event_payloads", (String) null, contentValues3);
                        }
                    }
                    for (Map.Entry next : Collections.unmodifiableMap(nVar.b()).entrySet()) {
                        ContentValues contentValues4 = new ContentValues();
                        contentValues4.put("event_id", Long.valueOf(insert));
                        contentValues4.put("name", (String) next.getKey());
                        contentValues4.put("value", (String) next.getValue());
                        sQLiteDatabase.insert("event_metadata", (String) null, contentValues4);
                    }
                }
                return Long.valueOf(insert);
            default:
                Map map = (Map) obj3;
                a.C0161a aVar = (a.C0161a) obj2;
                Cursor cursor = (Cursor) obj;
                qVar.getClass();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(0);
                    int i12 = cursor.getInt(1);
                    c.a aVar2 = c.a.REASON_UNKNOWN;
                    if (i12 != aVar2.getNumber()) {
                        c.a aVar3 = c.a.MESSAGE_TOO_OLD;
                        if (i12 != aVar3.getNumber()) {
                            aVar3 = c.a.CACHE_FULL;
                            if (i12 != aVar3.getNumber()) {
                                aVar3 = c.a.PAYLOAD_TOO_BIG;
                                if (i12 != aVar3.getNumber()) {
                                    aVar3 = c.a.MAX_RETRIES_REACHED;
                                    if (i12 != aVar3.getNumber()) {
                                        aVar3 = c.a.INVALID_PAYLOD;
                                        if (i12 != aVar3.getNumber()) {
                                            aVar3 = c.a.SERVER_ERROR;
                                            if (i12 != aVar3.getNumber()) {
                                                androidx.databinding.a.m(Integer.valueOf(i12), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        aVar2 = aVar3;
                    }
                    long j10 = cursor.getLong(2);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList());
                    }
                    ((List) map.get(string)).add(new c(j10, aVar2));
                }
                for (Map.Entry entry : map.entrySet()) {
                    int i13 = d.f9476c;
                    new ArrayList();
                    aVar.f9471b.add(new d((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
                }
                long a10 = qVar.f90p.a();
                SQLiteDatabase f10 = qVar.f();
                f10.beginTransaction();
                try {
                    f fVar = (f) q.o(f10.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new p(a10));
                    f10.setTransactionSuccessful();
                    f10.endTransaction();
                    aVar.f9470a = fVar;
                    aVar.f9472c = new b(new e(qVar.f().compileStatement("PRAGMA page_size").simpleQueryForLong() * qVar.f().compileStatement("PRAGMA page_count").simpleQueryForLong(), e.f69a.f62b));
                    aVar.d = qVar.f93s.get();
                    return new x3.a(aVar.f9470a, Collections.unmodifiableList(aVar.f9471b), aVar.f9472c, aVar.d);
                } catch (Throwable th) {
                    f10.endTransaction();
                    throw th;
                }
        }
    }
}

package d2;

import a4.q;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.JsonReader;
import androidx.activity.result.b;
import androidx.lifecycle.t;
import com.appfab.facematchlive.data.model.CurrentConfigModel;
import com.appfab.facematchlive.ui.flow.main.MainActivity;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import com.karumi.dexter.BuildConfig;
import d8.f;
import f7.a0;
import g7.a;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;
import q3.e;
import q7.d;
import v7.a;
import y6.s;
import z8.g;

public final /* synthetic */ class c implements b, t, q.a, f.a, a.C0141a, a.C0071a, e, y6.e {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f4127o;

    public /* synthetic */ c(int i10) {
        this.f4127o = i10;
    }

    public void a(Object obj) {
        int i10 = MainActivity.P;
        g.f((androidx.activity.result.a) obj, "result");
    }

    public Object apply(Object obj) {
        long j8;
        switch (this.f4127o) {
            case 2:
                q3.b bVar = q.f88t;
                return (List) q.o(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new r3.b(3));
            case 3:
                Cursor cursor = (Cursor) obj;
                q3.b bVar2 = q.f88t;
                if (cursor.moveToNext()) {
                    j8 = cursor.getLong(0);
                } else {
                    j8 = 0;
                }
                return Long.valueOf(j8);
            default:
                a0 a0Var = (a0) obj;
                j7.a.f6595b.getClass();
                d dVar = g7.a.f4992a;
                dVar.getClass();
                StringWriter stringWriter = new StringWriter();
                try {
                    dVar.a(stringWriter, a0Var);
                } catch (IOException unused) {
                }
                return stringWriter.toString().getBytes(Charset.forName("UTF-8"));
        }
    }

    public Object b(JsonReader jsonReader) {
        switch (this.f4127o) {
            case 6:
                return g7.a.d(jsonReader);
            case 7:
                return g7.a.b(jsonReader);
            default:
                return g7.a.a(jsonReader);
        }
    }

    public String c(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? BuildConfig.FLAVOR : "embedded";
    }

    public void d(v7.b bVar) {
    }

    public void e(Object obj) {
        CurrentConfigModel currentConfigModel = (CurrentConfigModel) obj;
        int i10 = MainActivity.P;
        if (currentConfigModel != null) {
            if (m2.a.f7058b == null) {
                m2.a.f7058b = new m2.a();
            }
            m2.a aVar = m2.a.f7058b;
            if (aVar != null) {
                aVar.c(h2.b.b(currentConfigModel));
            }
        }
    }

    public Object j(s sVar) {
        switch (this.f4127o) {
            case 0:
                Set<d8.d> e10 = sVar.e(d8.d.class);
                d8.c cVar = d8.c.f4311b;
                if (cVar == null) {
                    synchronized (d8.c.class) {
                        cVar = d8.c.f4311b;
                        if (cVar == null) {
                            cVar = new d8.c();
                            d8.c.f4311b = cVar;
                        }
                    }
                }
                return new d8.b(e10, cVar);
            default:
                return RemoteConfigRegistrar.lambda$getComponents$0(sVar);
        }
    }
}

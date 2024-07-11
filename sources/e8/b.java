package e8;

import a4.o;
import android.util.Log;
import f8.d;
import f8.e;
import m5.a;
import m5.h;
import m5.i;
import m5.l;
import org.json.JSONArray;
import org.json.JSONException;
import t6.c;

public final /* synthetic */ class b implements h, a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ c f4516o;

    public /* synthetic */ b(c cVar) {
        this.f4516o = cVar;
    }

    public final Object c(i iVar) {
        boolean z;
        c cVar = this.f4516o;
        cVar.getClass();
        if (iVar.m()) {
            d dVar = cVar.d;
            synchronized (dVar) {
                dVar.f4905c = l.e((Object) null);
            }
            f8.i iVar2 = dVar.f4904b;
            synchronized (iVar2) {
                iVar2.f4924a.deleteFile(iVar2.f4925b);
            }
            if (iVar.i() != null) {
                JSONArray jSONArray = ((e) iVar.i()).d;
                c cVar2 = cVar.f4518b;
                if (cVar2 != null) {
                    try {
                        cVar2.b(c.c(jSONArray));
                    } catch (JSONException e10) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e10);
                    } catch (t6.a e11) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e11);
                    }
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final i i(Object obj) {
        Void voidR = (Void) obj;
        c cVar = this.f4516o;
        i<e> b10 = cVar.d.b();
        i<e> b11 = cVar.f4520e.b();
        return l.g(b10, b11).g(cVar.f4519c, new o(cVar, b10, b11));
    }
}

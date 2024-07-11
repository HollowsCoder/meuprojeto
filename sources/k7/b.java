package k7;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.fragment.app.f0;
import androidx.lifecycle.r;
import h7.a;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import l7.f;
import m5.h;
import m5.i;
import m5.j;
import m5.l;
import n.e;
import org.json.JSONObject;

public final class b implements h<Void, Void> {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ c f6711o;

    public b(c cVar) {
        this.f6711o = cVar;
    }

    public final i i(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        Void voidR = (Void) obj;
        c cVar = this.f6711o;
        f0 f0Var = cVar.f6716f;
        f fVar = cVar.f6713b;
        f0Var.getClass();
        FileWriter fileWriter2 = null;
        try {
            HashMap l = f0.l(fVar);
            ((e) f0Var.f1152q).getClass();
            a aVar = new a((String) f0Var.f1151p, l);
            HashMap hashMap = aVar.f5915c;
            hashMap.put("User-Agent", "Crashlytics Android SDK/18.2.5");
            hashMap.put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            f0.c(aVar, fVar);
            ((s6.a) f0Var.f1153r).t("Requesting settings from " + ((String) f0Var.f1151p));
            ((s6.a) f0Var.f1153r).L("Settings query params were: " + l);
            jSONObject = f0Var.m(aVar.b());
        } catch (IOException e10) {
            if (((s6.a) f0Var.f1153r).j(6)) {
                Log.e("FirebaseCrashlytics", "Settings request failed.", e10);
            }
            jSONObject = null;
        }
        if (jSONObject != null) {
            l7.e d = cVar.f6714c.d(jSONObject);
            long j8 = d.d;
            r rVar = cVar.f6715e;
            rVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", (Throwable) null);
            }
            try {
                jSONObject.put("expires_at", j8);
                fileWriter = new FileWriter((File) rVar.f1404o);
                try {
                    fileWriter.write(jSONObject.toString());
                    fileWriter.flush();
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
                fileWriter = null;
                try {
                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                    d7.e.a(fileWriter, "Failed to close settings writer.");
                    c.b(jSONObject, "Loaded settings: ");
                    String str = fVar.f6982f;
                    SharedPreferences.Editor edit = cVar.f6712a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    edit.putString("existing_instance_identifier", str);
                    edit.apply();
                    cVar.f6718h.set(d);
                    AtomicReference<j<l7.a>> atomicReference = cVar.f6719i;
                    l7.a aVar2 = d.f6975a;
                    atomicReference.get().c(aVar2);
                    j jVar = new j();
                    jVar.c(aVar2);
                    atomicReference.set(jVar);
                    return l.e((Object) null);
                } catch (Throwable th) {
                    th = th;
                    fileWriter2 = fileWriter;
                    d7.e.a(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                d7.e.a(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            d7.e.a(fileWriter, "Failed to close settings writer.");
            c.b(jSONObject, "Loaded settings: ");
            String str2 = fVar.f6982f;
            SharedPreferences.Editor edit2 = cVar.f6712a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str2);
            edit2.apply();
            cVar.f6718h.set(d);
            AtomicReference<j<l7.a>> atomicReference2 = cVar.f6719i;
            l7.a aVar22 = d.f6975a;
            atomicReference2.get().c(aVar22);
            j jVar2 = new j();
            jVar2.c(aVar22);
            atomicReference2.set(jVar2);
        }
        return l.e((Object) null);
    }
}

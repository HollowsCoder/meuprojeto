package androidx.lifecycle;

import android.util.Log;
import com.google.android.gms.internal.clearcut.j;
import com.google.android.gms.internal.clearcut.k4;
import com.karumi.dexter.BuildConfig;
import i7.e;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import m5.a;
import m5.i;
import m5.l;
import org.json.JSONObject;

public final class r implements j, a {

    /* renamed from: o  reason: collision with root package name */
    public final Object f1404o;

    public /* synthetic */ r() {
        this.f1404o = new HashMap();
    }

    public r(e eVar) {
        this.f1404o = new File(eVar.f6130a, "com.crashlytics.settings.json");
    }

    public final JSONObject a() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        String str;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", (Throwable) null);
        }
        try {
            File file = (File) this.f1404o;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    Scanner useDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
                    if (useDelimiter.hasNext()) {
                        str = useDelimiter.next();
                    } else {
                        str = BuildConfig.FLAVOR;
                    }
                    jSONObject = new JSONObject(str);
                    fileInputStream2 = fileInputStream;
                } catch (Exception e10) {
                    e = e10;
                    try {
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        d7.e.a(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        d7.e.a(fileInputStream2, "Error while closing settings cache file.");
                        throw th;
                    }
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", (Throwable) null);
                }
                jSONObject = null;
            }
            d7.e.a(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
            Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
            d7.e.a(fileInputStream, "Error while closing settings cache file.");
            return null;
        } catch (Throwable th2) {
            th = th2;
            d7.e.a(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public final /* synthetic */ Object c(i iVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((Collection) this.f1404o);
        return l.e(arrayList);
    }

    public final Object e() {
        com.google.android.gms.internal.clearcut.e eVar = (com.google.android.gms.internal.clearcut.e) this.f1404o;
        eVar.getClass();
        return k4.a(com.google.android.gms.internal.clearcut.e.f2402h.getContentResolver(), eVar.f2407c);
    }

    public /* synthetic */ r(Object obj) {
        this.f1404o = obj;
    }
}

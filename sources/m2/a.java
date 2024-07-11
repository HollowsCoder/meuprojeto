package m2;

import android.content.Context;
import android.content.SharedPreferences;
import com.appfab.facematchlive.FaceMatchApp;
import com.appfab.facematchlive.data.model.CurrentConfigModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import z8.g;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static a f7058b;

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f7059a;

    /* renamed from: m2.a$a  reason: collision with other inner class name */
    public static final class C0100a {
        public static a a() {
            if (a.f7058b == null) {
                a.f7058b = new a();
            }
            return a.f7058b;
        }
    }

    public static final class b extends TypeToken<CurrentConfigModel> {
    }

    public a() {
        FaceMatchApp a10 = FaceMatchApp.u.a();
        Context applicationContext = a10 != null ? a10.getApplicationContext() : null;
        g.c(applicationContext);
        String str = j2.a.f6519a;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.appfab.facematchlive", 0);
        g.e(sharedPreferences, "FaceMatchApp.instance?.a…xt.MODE_PRIVATE\n        )");
        this.f7059a = sharedPreferences;
    }

    public final CurrentConfigModel a() {
        String string = this.f7059a.getString("currentConfig", (String) null);
        if (string == null || string.length() == 0) {
            return null;
        }
        return (CurrentConfigModel) new Gson().fromJson(string.toString(), new b().getType());
    }

    public final int b(int i10) {
        return this.f7059a.getInt("initDate", i10);
    }

    public final void c(String str) {
        SharedPreferences.Editor edit = this.f7059a.edit();
        edit.putString("currentConfig", str);
        edit.apply();
    }

    public final void d(Integer num) {
        SharedPreferences.Editor edit = this.f7059a.edit();
        g.c(num);
        edit.putInt("initDate", num.intValue());
        edit.apply();
    }
}

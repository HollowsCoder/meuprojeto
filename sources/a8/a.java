package a8;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import s7.c;
import y.a;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final c f115a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f116b;

    public a(Context context, String str, c cVar) {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Object obj = y.a.f9523a;
        Context a10 = a.e.a(context);
        SharedPreferences sharedPreferences = a10.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f115a = cVar;
        boolean z10 = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                PackageManager packageManager = a10.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(a10.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled"))) {
                    z10 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z = z10;
        }
        this.f116b = z;
    }
}

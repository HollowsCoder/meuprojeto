package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import androidx.appcompat.widget.x0;
import androidx.databinding.a;
import com.karumi.dexter.BuildConfig;
import java.io.IOException;

public final class i extends e {

    /* renamed from: k  reason: collision with root package name */
    public final Object f2460k;
    public String l;

    /* renamed from: m  reason: collision with root package name */
    public v3 f2461m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ k f2462n = a.f1028y;

    public i(l lVar, String str, v3 v3Var) {
        super(lVar, str, v3Var);
        this.f2460k = new Object();
    }

    public final Object b(SharedPreferences sharedPreferences) {
        String str = this.f2406b;
        try {
            return d(sharedPreferences.getString(str, BuildConfig.FLAVOR));
        } catch (ClassCastException e10) {
            String valueOf = String.valueOf(str);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? "Invalid byte[] value in SharedPreferences for ".concat(valueOf) : new String("Invalid byte[] value in SharedPreferences for "), e10);
            return null;
        }
    }

    public final Object d(String str) {
        v3 v3Var;
        try {
            synchronized (this.f2460k) {
                if (!str.equals(this.l)) {
                    k kVar = this.f2462n;
                    byte[] decode = Base64.decode(str, 3);
                    ((a) kVar).getClass();
                    v3 r5 = v3.r(decode);
                    this.l = str;
                    this.f2461m = r5;
                }
                v3Var = this.f2461m;
            }
            return v3Var;
        } catch (IOException | IllegalArgumentException unused) {
            String str2 = this.f2406b;
            StringBuilder sb = new StringBuilder(x0.a(str, x0.a(str2, 27)));
            sb.append("Invalid byte[] value for ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}

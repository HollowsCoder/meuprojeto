package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.appcompat.widget.x0;

public final class g extends e<Boolean> {
    public g(l lVar, Boolean bool) {
        super(lVar, "enable_log_sampling_rules", bool);
    }

    public final Object b(SharedPreferences sharedPreferences) {
        String str = this.f2406b;
        try {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, false));
        } catch (ClassCastException e10) {
            String valueOf = String.valueOf(str);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? "Invalid boolean value in SharedPreferences for ".concat(valueOf) : new String("Invalid boolean value in SharedPreferences for "), e10);
            return null;
        }
    }

    public final /* synthetic */ Object d(String str) {
        if (k4.f2479c.matcher(str).matches()) {
            return Boolean.TRUE;
        }
        if (k4.d.matcher(str).matches()) {
            return Boolean.FALSE;
        }
        String str2 = this.f2406b;
        StringBuilder sb = new StringBuilder(str.length() + x0.a(str2, 28));
        sb.append("Invalid boolean value for ");
        sb.append(str2);
        sb.append(": ");
        sb.append(str);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}

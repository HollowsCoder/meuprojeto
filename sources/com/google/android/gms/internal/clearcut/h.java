package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Log;

public final class h extends e<String> {
    public h(l lVar, String str) {
        super(lVar, str, (Object) null);
    }

    public final Object b(SharedPreferences sharedPreferences) {
        String str = this.f2406b;
        try {
            return sharedPreferences.getString(str, (String) null);
        } catch (ClassCastException e10) {
            String valueOf = String.valueOf(str);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? "Invalid string value in SharedPreferences for ".concat(valueOf) : new String("Invalid string value in SharedPreferences for "), e10);
            return null;
        }
    }

    public final /* synthetic */ Object d(String str) {
        return str;
    }
}

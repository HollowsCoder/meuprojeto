package com.google.android.gms.internal.measurement;

import android.util.Log;

public final class i4 extends m4<Boolean> {
    public i4(k4 k4Var, String str, Boolean bool) {
        super(k4Var, str, bool);
    }

    public final Object a(String str) {
        if (y3.f2999b.matcher(str).matches()) {
            return Boolean.TRUE;
        }
        if (y3.f3000c.matcher(str).matches()) {
            return Boolean.FALSE;
        }
        this.f2824a.getClass();
        String str2 = this.f2825b;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 28 + str.length());
        sb.append("Invalid boolean value for ");
        sb.append(str2);
        sb.append(": ");
        sb.append(str);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}

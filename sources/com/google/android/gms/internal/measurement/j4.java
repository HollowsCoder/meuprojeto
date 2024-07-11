package com.google.android.gms.internal.measurement;

import android.util.Log;

public final class j4 extends m4<Double> {
    public j4(k4 k4Var, Double d) {
        super(k4Var, "measurement.test.double_flag", d);
    }

    public final Object a(String str) {
        try {
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            this.f2824a.getClass();
            String str2 = this.f2825b;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 27 + str.length());
            sb.append("Invalid double value for ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}

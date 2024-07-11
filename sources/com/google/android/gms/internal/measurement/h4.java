package com.google.android.gms.internal.measurement;

import android.util.Log;

public final class h4 extends m4 {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f2733i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4(k4 k4Var, String str, Object obj, int i10) {
        super(k4Var, str, obj);
        this.f2733i = i10;
    }

    public final Object a(String str) {
        switch (this.f2733i) {
            case 0:
                try {
                    return Long.valueOf(Long.parseLong(str));
                } catch (NumberFormatException unused) {
                    this.f2824a.getClass();
                    String str2 = this.f2825b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 25 + str.length());
                    sb.append("Invalid long value for ");
                    sb.append(str2);
                    sb.append(": ");
                    sb.append(str);
                    Log.e("PhenotypeFlag", sb.toString());
                    return null;
                }
            default:
                return str;
        }
    }
}

package com.google.android.gms.internal.measurement;

import android.os.Build;

public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f2711a;

    static {
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 30) {
            String str = Build.VERSION.CODENAME;
            if (str.length() == 1 && str.charAt(0) >= 'S' && str.charAt(0) <= 'Z') {
                i10 = 33554432;
            }
        }
        f2711a = i10;
    }
}

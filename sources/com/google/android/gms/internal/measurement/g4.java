package com.google.android.gms.internal.measurement;

import android.net.Uri;
import n.b;

public final class g4 {

    /* renamed from: a  reason: collision with root package name */
    public static final b<String, Uri> f2714a = new b<>();

    public static synchronized Uri a() {
        Uri orDefault;
        String str;
        synchronized (g4.class) {
            b<String, Uri> bVar = f2714a;
            orDefault = bVar.getOrDefault("com.google.android.gms.measurement", null);
            if (orDefault == null) {
                String valueOf = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
                if (valueOf.length() != 0) {
                    str = "content://com.google.android.gms.phenotype/".concat(valueOf);
                } else {
                    str = new String("content://com.google.android.gms.phenotype/");
                }
                orDefault = Uri.parse(str);
                bVar.put("com.google.android.gms.measurement", orDefault);
            }
        }
        return orDefault;
    }
}

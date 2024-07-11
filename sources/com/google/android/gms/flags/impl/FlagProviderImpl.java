package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import d5.c;
import w4.d;
import x4.a;
import x4.b;

@DynamiteApi
public class FlagProviderImpl extends d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2356a = false;

    /* renamed from: b  reason: collision with root package name */
    public SharedPreferences f2357b;

    public boolean getBooleanFlagValue(String str, boolean z, int i10) {
        String str2;
        if (!this.f2356a) {
            return z;
        }
        SharedPreferences sharedPreferences = this.f2357b;
        Boolean valueOf = Boolean.valueOf(z);
        try {
            valueOf = (Boolean) c.a(new a(sharedPreferences, str, valueOf, 0));
        } catch (Exception e10) {
            String valueOf2 = String.valueOf(e10.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Flag value not available, returning default: ".concat(valueOf2);
            } else {
                str2 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str2);
        }
        return valueOf.booleanValue();
    }

    public int getIntFlagValue(String str, int i10, int i11) {
        String str2;
        if (!this.f2356a) {
            return i10;
        }
        SharedPreferences sharedPreferences = this.f2357b;
        Integer valueOf = Integer.valueOf(i10);
        try {
            valueOf = (Integer) c.a(new b(sharedPreferences, str, valueOf));
        } catch (Exception e10) {
            String valueOf2 = String.valueOf(e10.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Flag value not available, returning default: ".concat(valueOf2);
            } else {
                str2 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str2);
        }
        return valueOf.intValue();
    }

    public long getLongFlagValue(String str, long j8, int i10) {
        String str2;
        if (!this.f2356a) {
            return j8;
        }
        SharedPreferences sharedPreferences = this.f2357b;
        Long valueOf = Long.valueOf(j8);
        try {
            valueOf = (Long) c.a(new x4.c(sharedPreferences, str, valueOf));
        } catch (Exception e10) {
            String valueOf2 = String.valueOf(e10.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Flag value not available, returning default: ".concat(valueOf2);
            } else {
                str2 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str2);
        }
        return valueOf.longValue();
    }

    public String getStringFlagValue(String str, String str2, int i10) {
        String str3;
        if (!this.f2356a) {
            return str2;
        }
        try {
            return (String) c.a(new a(this.f2357b, str, str2, 1));
        } catch (Exception e10) {
            String valueOf = String.valueOf(e10.getMessage());
            if (valueOf.length() != 0) {
                str3 = "Flag value not available, returning default: ".concat(valueOf);
            } else {
                str3 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str3);
            return str2;
        }
    }

    public void init(u4.a aVar) {
        Context context = (Context) u4.b.K(aVar);
        if (!this.f2356a) {
            try {
                this.f2357b = x4.d.a(context.createPackageContext("com.google.android.gms", 0));
                this.f2356a = true;
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Exception e10) {
                String valueOf = String.valueOf(e10.getMessage());
                Log.w("FlagProviderImpl", valueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
            }
        }
    }
}

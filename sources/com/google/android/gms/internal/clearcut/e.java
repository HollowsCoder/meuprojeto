package com.google.android.gms.internal.clearcut;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Binder;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import androidx.lifecycle.r;
import java.util.concurrent.ConcurrentHashMap;
import s2.t;
import s6.a;

public abstract class e<T> {

    /* renamed from: g  reason: collision with root package name */
    public static final Object f2401g = new Object();
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: h  reason: collision with root package name */
    public static Context f2402h;

    /* renamed from: i  reason: collision with root package name */
    public static volatile Boolean f2403i;

    /* renamed from: j  reason: collision with root package name */
    public static volatile Boolean f2404j;

    /* renamed from: a  reason: collision with root package name */
    public final l f2405a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2406b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2407c;
    public final T d;

    /* renamed from: e  reason: collision with root package name */
    public volatile b f2408e;

    /* renamed from: f  reason: collision with root package name */
    public volatile SharedPreferences f2409f;

    public e() {
        throw null;
    }

    public e(l lVar, String str, Object obj) {
        this.f2408e = null;
        this.f2409f = null;
        String str2 = lVar.f2488a;
        if (str2 == null && lVar.f2489b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        } else if (str2 == null || lVar.f2489b == null) {
            this.f2405a = lVar;
            String valueOf = String.valueOf(lVar.f2490c);
            this.f2407c = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
            String valueOf2 = String.valueOf(lVar.d);
            this.f2406b = str.length() != 0 ? valueOf2.concat(str) : new String(valueOf2);
            this.d = obj;
        } else {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
    }

    public static <V> V c(j<V> jVar) {
        long clearCallingIdentity;
        try {
            return jVar.e();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V e10 = jVar.e();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return e10;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    public static boolean g() {
        String str;
        if (f2403i == null) {
            Context context = f2402h;
            boolean z = false;
            if (context == null) {
                return false;
            }
            if (Binder.getCallingPid() == Process.myPid()) {
                str = context.getPackageName();
            } else {
                str = null;
            }
            if (a.p(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", Binder.getCallingPid(), Binder.getCallingUid(), str) == 0) {
                z = true;
            }
            f2403i = Boolean.valueOf(z);
        }
        return f2403i.booleanValue();
    }

    public final T a() {
        if (f2402h != null) {
            if (this.f2405a.f2492f) {
                T f10 = f();
                if (f10 != null) {
                    return f10;
                }
                T e10 = e();
                if (e10 != null) {
                    return e10;
                }
            } else {
                T e11 = e();
                if (e11 != null) {
                    return e11;
                }
                T f11 = f();
                if (f11 != null) {
                    return f11;
                }
            }
            return this.d;
        }
        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
    }

    public abstract T b(SharedPreferences sharedPreferences);

    public abstract T d(String str);

    @TargetApi(24)
    public final T e() {
        boolean z;
        String str;
        boolean z10;
        if (g()) {
            z = ((Boolean) c(new f("gms:phenotype:phenotype_flag:debug_bypass_phenotype"))).booleanValue();
        } else {
            z = false;
        }
        if (!z) {
            l lVar = this.f2405a;
            if (lVar.f2489b != null) {
                if (this.f2408e == null) {
                    ContentResolver contentResolver = f2402h.getContentResolver();
                    Uri uri = this.f2405a.f2489b;
                    ConcurrentHashMap<Uri, b> concurrentHashMap = b.f2380h;
                    b bVar = concurrentHashMap.get(uri);
                    if (bVar == null) {
                        bVar = new b(contentResolver, uri);
                        b putIfAbsent = concurrentHashMap.putIfAbsent(uri, bVar);
                        if (putIfAbsent == null) {
                            bVar.f2382a.registerContentObserver(bVar.f2383b, false, bVar.f2384c);
                        } else {
                            bVar = putIfAbsent;
                        }
                    }
                    this.f2408e = bVar;
                }
                String str2 = (String) c(new t((Object) this, (Object) this.f2408e));
                if (str2 != null) {
                    return d(str2);
                }
            } else if (lVar.f2488a != null) {
                if (!f2402h.isDeviceProtectedStorage()) {
                    if (f2404j == null || !f2404j.booleanValue()) {
                        f2404j = Boolean.valueOf(((UserManager) f2402h.getSystemService(UserManager.class)).isUserUnlocked());
                    }
                    z10 = f2404j.booleanValue();
                } else {
                    z10 = true;
                }
                if (!z10) {
                    return null;
                }
                if (this.f2409f == null) {
                    this.f2409f = f2402h.getSharedPreferences(this.f2405a.f2488a, 0);
                }
                SharedPreferences sharedPreferences = this.f2409f;
                if (sharedPreferences.contains(this.f2406b)) {
                    return b(sharedPreferences);
                }
            }
        } else {
            String valueOf = String.valueOf(this.f2406b);
            if (valueOf.length() != 0) {
                str = "Bypass reading Phenotype values for flag: ".concat(valueOf);
            } else {
                str = new String("Bypass reading Phenotype values for flag: ");
            }
            Log.w("PhenotypeFlag", str);
        }
        return null;
    }

    public final T f() {
        String str;
        if (this.f2405a.f2491e || !g() || (str = (String) c(new r((Object) this))) == null) {
            return null;
        }
        return d(str);
    }
}

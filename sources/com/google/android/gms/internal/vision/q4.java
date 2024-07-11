package com.google.android.gms.internal.vision;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import n4.m;
import n5.c;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import q5.d;
import q5.i;

public abstract class q4<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3147a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3148b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final String f3149c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f3150e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3151f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3152g = false;

    /* renamed from: h  reason: collision with root package name */
    public i f3153h;

    public q4(Context context) {
        this.f3147a = context;
        this.f3149c = "FaceNativeHandle";
        this.d = "face".length() != 0 ? "com.google.android.gms.vision.dynamite.".concat("face") : new String("com.google.android.gms.vision.dynamite.");
        this.f3150e = "face";
    }

    public abstract i a(DynamiteModule dynamiteModule, Context context);

    public final void b() {
        synchronized (this.f3148b) {
            if (this.f3153h != null) {
                try {
                    i iVar = (i) ((d) this).c();
                    m.h(iVar);
                    iVar.zza();
                } catch (RemoteException e10) {
                    Log.e(this.f3149c, "Could not finalize native handle", e10);
                }
            }
        }
    }

    @RequiresNonNull({"context", "thickFeatureName", "featureName"})
    public final T c() {
        DynamiteModule dynamiteModule;
        synchronized (this.f3148b) {
            T t10 = this.f3153h;
            if (t10 != null) {
                return t10;
            }
            try {
                dynamiteModule = DynamiteModule.c(this.f3147a, DynamiteModule.f2349k, this.d);
            } catch (DynamiteModule.a unused) {
                String format = String.format("%s.%s", new Object[]{"com.google.android.gms.vision", this.f3150e});
                Object[] objArr = {format};
                if (Log.isLoggable("Vision", 3)) {
                    Log.d("Vision", String.format("Cannot load thick client module, fall back to load optional module %s", objArr));
                }
                try {
                    dynamiteModule = DynamiteModule.c(this.f3147a, DynamiteModule.f2347i, format);
                } catch (DynamiteModule.a e10) {
                    c.a(e10, "Error loading optional module %s", format);
                    if (!this.f3151f) {
                        Object[] objArr2 = {this.f3150e};
                        if (Log.isLoggable("Vision", 3)) {
                            Log.d("Vision", String.format("Broadcasting download intent for dependency %s", objArr2));
                        }
                        String str = this.f3150e;
                        Intent intent = new Intent();
                        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", str);
                        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
                        this.f3147a.sendBroadcast(intent);
                        this.f3151f = true;
                    }
                    dynamiteModule = null;
                }
            }
            if (dynamiteModule != null) {
                try {
                    this.f3153h = a(dynamiteModule, this.f3147a);
                } catch (RemoteException | DynamiteModule.a e11) {
                    Log.e(this.f3149c, "Error creating remote native handle", e11);
                }
            }
            boolean z = this.f3152g;
            if (!z && this.f3153h == null) {
                Log.w(this.f3149c, "Native handle not yet available. Reverting to no-op handle.");
                this.f3152g = true;
            } else if (z && this.f3153h != null) {
                Log.w(this.f3149c, "Native handle is now available.");
            }
            T t11 = this.f3153h;
            return t11;
        }
    }
}

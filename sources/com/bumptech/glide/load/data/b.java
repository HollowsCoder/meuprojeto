package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import q2.a;

public abstract class b<T> implements d<T> {

    /* renamed from: o  reason: collision with root package name */
    public final String f2265o;

    /* renamed from: p  reason: collision with root package name */
    public final AssetManager f2266p;

    /* renamed from: q  reason: collision with root package name */
    public T f2267q;

    public b(AssetManager assetManager, String str) {
        this.f2266p = assetManager;
        this.f2265o = str;
    }

    public final void b() {
        T t10 = this.f2267q;
        if (t10 != null) {
            try {
                c(t10);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t10);

    public final void cancel() {
    }

    public abstract T d(AssetManager assetManager, String str);

    public final a e() {
        return a.LOCAL;
    }

    public final void f(j jVar, d.a<? super T> aVar) {
        try {
            T d = d(this.f2266p, this.f2265o);
            this.f2267q = d;
            aVar.d(d);
        } catch (IOException e10) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e10);
            }
            aVar.c(e10);
        }
    }
}

package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import q2.a;

public abstract class k<T> implements d<T> {

    /* renamed from: o  reason: collision with root package name */
    public final Uri f2286o;

    /* renamed from: p  reason: collision with root package name */
    public final ContentResolver f2287p;

    /* renamed from: q  reason: collision with root package name */
    public T f2288q;

    public k(ContentResolver contentResolver, Uri uri) {
        this.f2287p = contentResolver;
        this.f2286o = uri;
    }

    public final void b() {
        T t10 = this.f2288q;
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

    public abstract Object d(ContentResolver contentResolver, Uri uri);

    public final a e() {
        return a.LOCAL;
    }

    public final void f(j jVar, d.a<? super T> aVar) {
        try {
            T d = d(this.f2287p, this.f2286o);
            this.f2288q = d;
            aVar.d(d);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e10);
            }
            aVar.c(e10);
        }
    }
}

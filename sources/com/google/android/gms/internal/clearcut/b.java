package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public final class b {

    /* renamed from: h  reason: collision with root package name */
    public static final ConcurrentHashMap<Uri, b> f2380h = new ConcurrentHashMap<>();

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f2381i = {"key", "value"};

    /* renamed from: a  reason: collision with root package name */
    public final ContentResolver f2382a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f2383b;

    /* renamed from: c  reason: collision with root package name */
    public final c f2384c;
    public final Object d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public volatile HashMap f2385e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f2386f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f2387g = new ArrayList();

    public b(ContentResolver contentResolver, Uri uri) {
        this.f2382a = contentResolver;
        this.f2383b = uri;
        this.f2384c = new c(this);
    }

    public final HashMap a() {
        Cursor query;
        try {
            HashMap hashMap = new HashMap();
            query = this.f2382a.query(this.f2383b, f2381i, (String) null, (String[]) null, (String) null);
            if (query != null) {
                while (query.moveToNext()) {
                    hashMap.put(query.getString(0), query.getString(1));
                }
                query.close();
            }
            return hashMap;
        } catch (SQLiteException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }
}

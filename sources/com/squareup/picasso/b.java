package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import n.e;

public final class b extends y {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3908a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3909b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public AssetManager f3910c;

    public b(Context context) {
        this.f3908a = context;
    }

    public final boolean b(w wVar) {
        Uri uri = wVar.f3999c;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    public final y.a e(w wVar, int i10) {
        if (this.f3910c == null) {
            synchronized (this.f3909b) {
                if (this.f3910c == null) {
                    this.f3910c = this.f3908a.getAssets();
                }
            }
        }
        return new y.a(e.H(this.f3910c.open(wVar.f3999c.toString().substring(22))), t.c.DISK);
    }
}

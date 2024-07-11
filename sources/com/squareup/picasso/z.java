package com.squareup.picasso;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.appcompat.widget.x0;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import java.io.FileNotFoundException;
import java.util.List;
import w9.b0;

public final class z extends y {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4022a;

    public z(Context context) {
        this.f4022a = context;
    }

    public final boolean b(w wVar) {
        if (wVar.d != 0) {
            return true;
        }
        return "android.resource".equals(wVar.f3999c.getScheme());
    }

    public final y.a e(w wVar, int i10) {
        Resources resources;
        int i11;
        StringBuilder sb = e0.f3939a;
        int i12 = wVar.d;
        Uri uri = wVar.f3999c;
        Context context = this.f4022a;
        if (i12 != 0 || uri == null) {
            resources = context.getResources();
        } else {
            String authority = uri.getAuthority();
            if (authority != null) {
                try {
                    resources = context.getPackageManager().getResourcesForApplication(authority);
                } catch (PackageManager.NameNotFoundException unused) {
                    throw new FileNotFoundException(x0.d("Unable to obtain resources for package: ", uri));
                }
            } else {
                throw new FileNotFoundException(x0.d("No package provided: ", uri));
            }
        }
        boolean z = true;
        int i13 = wVar.d;
        if (i13 == 0 && uri != null) {
            String authority2 = uri.getAuthority();
            if (authority2 != null) {
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments == null || pathSegments.isEmpty()) {
                    throw new FileNotFoundException(x0.d("No path segments: ", uri));
                }
                if (pathSegments.size() == 1) {
                    try {
                        i11 = Integer.parseInt(pathSegments.get(0));
                    } catch (NumberFormatException unused2) {
                        throw new FileNotFoundException(x0.d("Last path segment is not a resource ID: ", uri));
                    }
                } else if (pathSegments.size() == 2) {
                    i11 = resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                } else {
                    throw new FileNotFoundException(x0.d("More than two path segments: ", uri));
                }
                i13 = i11;
            } else {
                throw new FileNotFoundException(x0.d("No package provided: ", uri));
            }
        }
        BitmapFactory.Options c10 = y.c(wVar);
        if (c10 == null || !c10.inJustDecodeBounds) {
            z = false;
        }
        if (z) {
            BitmapFactory.decodeResource(resources, i13, c10);
            y.a(wVar.f4001f, wVar.f4002g, c10.outWidth, c10.outHeight, c10, wVar);
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i13, c10);
        t.c cVar = t.c.DISK;
        if (decodeResource != null) {
            return new y.a(decodeResource, (b0) null, cVar, 0);
        }
        throw new NullPointerException("bitmap == null");
    }
}

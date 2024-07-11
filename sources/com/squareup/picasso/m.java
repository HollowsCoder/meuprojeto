package com.squareup.picasso;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;

public final class m implements d {

    /* renamed from: a  reason: collision with root package name */
    public final l f3957a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f3958a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3959b;

        public a(Bitmap bitmap, int i10) {
            this.f3958a = bitmap;
            this.f3959b = i10;
        }
    }

    public m(Context context) {
        boolean z;
        int i10;
        StringBuilder sb = e0.f3939a;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if ((context.getApplicationInfo().flags & 1048576) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i10 = activityManager.getLargeMemoryClass();
        } else {
            i10 = activityManager.getMemoryClass();
        }
        this.f3957a = new l((int) ((((long) i10) * 1048576) / 7));
    }
}

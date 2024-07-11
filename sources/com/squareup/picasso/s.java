package com.squareup.picasso;

import android.content.Context;
import android.os.StatFs;
import i9.c;
import i9.v;
import java.io.File;

public final class s implements i {

    /* renamed from: a  reason: collision with root package name */
    public final v f3971a;

    public s(Context context) {
        long j8;
        StringBuilder sb = e0.f3939a;
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j8 = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            j8 = 5242880;
        }
        long max = Math.max(Math.min(j8, 52428800), 5242880);
        v.a aVar = new v.a();
        aVar.f6356k = new c(file, max);
        this.f3971a = new v(aVar);
    }
}

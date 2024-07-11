package com.squareup.picasso;

import android.os.Process;
import android.util.Log;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.concurrent.ThreadFactory;
import w9.j;

public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final StringBuilder f3939a = new StringBuilder();

    /* renamed from: b  reason: collision with root package name */
    public static final j f3940b = j.a.c("RIFF");

    /* renamed from: c  reason: collision with root package name */
    public static final j f3941c = j.a.c("WEBP");

    public static class a extends Thread {
        public a(Runnable runnable) {
            super(runnable);
        }

        public final void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    public static class b implements ThreadFactory {
        public final Thread newThread(Runnable runnable) {
            return new a(runnable);
        }
    }

    static {
        j jVar = j.f9328r;
    }

    public static String a(c cVar) {
        return b(cVar, BuildConfig.FLAVOR);
    }

    public static String b(c cVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        a aVar = cVar.f3931y;
        if (aVar != null) {
            sb.append(aVar.f3885b.b());
        }
        ArrayList arrayList = cVar.z;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0 || aVar != null) {
                    sb.append(", ");
                }
                sb.append(((a) arrayList.get(i10)).f3885b.b());
            }
        }
        return sb.toString();
    }

    public static void c(String str, String str2, String str3) {
        d(str, str2, str3, BuildConfig.FLAVOR);
    }

    public static void d(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", new Object[]{str, str2, str3, str4}));
    }
}

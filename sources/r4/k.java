package r4;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import java.lang.reflect.Method;
import t4.b;
import t4.c;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f8437a;

    /* renamed from: b  reason: collision with root package name */
    public static final Method f8438b;

    /* renamed from: c  reason: collision with root package name */
    public static final Method f8439c;
    public static final Method d;

    static {
        Method method;
        Method method2;
        Method method3;
        boolean z;
        boolean z10;
        Class<String> cls = String.class;
        Class<WorkSource> cls2 = WorkSource.class;
        Process.myUid();
        Method method4 = null;
        try {
            method = cls2.getMethod("add", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            method = null;
        }
        f8437a = method;
        try {
            method2 = cls2.getMethod("add", new Class[]{Integer.TYPE, cls});
        } catch (Exception unused2) {
            method2 = null;
        }
        f8438b = method2;
        try {
            method3 = cls2.getMethod("size", new Class[0]);
        } catch (Exception unused3) {
            method3 = null;
        }
        f8439c = method3;
        try {
            cls2.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception unused4) {
        }
        try {
            method4 = cls2.getMethod("getName", new Class[]{Integer.TYPE});
        } catch (Exception unused5) {
        }
        d = method4;
        if (Build.VERSION.SDK_INT >= 28) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                cls2.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e10) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e10);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, cls});
            } catch (Exception e11) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e11);
            }
        }
    }

    @RecentlyNonNull
    public static boolean a(@RecentlyNonNull Context context) {
        if (context == null || context.getPackageManager() == null) {
            return false;
        }
        b a10 = c.a(context);
        if (a10.f8994a.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0) {
            return true;
        }
        return false;
    }
}

package b0;

import a0.c;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class f extends l {

    /* renamed from: a  reason: collision with root package name */
    public static Class<?> f1937a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Constructor<?> f1938b = null;

    /* renamed from: c  reason: collision with root package name */
    public static Method f1939c = null;
    public static Method d = null;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f1940e = false;

    public static boolean g(Object obj, String str, int i10, boolean z) {
        h();
        try {
            return ((Boolean) f1939c.invoke(obj, new Object[]{str, Integer.valueOf(i10), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void h() {
        Method method;
        Constructor<?> constructor;
        Class<?> cls;
        Method method2;
        if (!f1940e) {
            f1940e = true;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                constructor = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            } catch (ClassNotFoundException | NoSuchMethodException e10) {
                Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
                cls = null;
                method2 = null;
                constructor = null;
                method = null;
            }
            f1938b = constructor;
            f1937a = cls;
            f1939c = method;
            d = method2;
        }
    }

    public Typeface a(Context context, c.b bVar, Resources resources, int i10) {
        h();
        try {
            Object newInstance = f1938b.newInstance(new Object[0]);
            c.C0003c[] cVarArr = bVar.f13a;
            int length = cVarArr.length;
            int i11 = 0;
            while (i11 < length) {
                c.C0003c cVar = cVarArr[i11];
                File d10 = m.d(context);
                if (d10 == null) {
                    return null;
                }
                try {
                    if (!m.b(d10, resources, cVar.f18f)) {
                        d10.delete();
                        return null;
                    } else if (!g(newInstance, d10.getPath(), cVar.f15b, cVar.f16c)) {
                        return null;
                    } else {
                        i11++;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    d10.delete();
                }
            }
            h();
            try {
                Object newInstance2 = Array.newInstance(f1937a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) d.invoke((Object) null, new Object[]{newInstance2});
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049 A[SYNTHETIC, Splitter:B:18:0x0049] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface b(android.content.Context r4, f0.l[] r5, int r6) {
        /*
            r3 = this;
            int r0 = r5.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L_0x0006
            return r2
        L_0x0006:
            f0.l r5 = r3.f(r6, r5)
            android.content.ContentResolver r6 = r4.getContentResolver()
            android.net.Uri r5 = r5.f4578a     // Catch:{ IOException -> 0x0080 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r6.openFileDescriptor(r5, r0, r2)     // Catch:{ IOException -> 0x0080 }
            if (r5 != 0) goto L_0x001e
            if (r5 == 0) goto L_0x001d
            r5.close()     // Catch:{ IOException -> 0x0080 }
        L_0x001d:
            return r2
        L_0x001e:
            java.lang.String r6 = "/proc/self/fd/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ErrnoException -> 0x0046 }
            r0.<init>(r6)     // Catch:{ ErrnoException -> 0x0046 }
            int r6 = r5.getFd()     // Catch:{ ErrnoException -> 0x0046 }
            r0.append(r6)     // Catch:{ ErrnoException -> 0x0046 }
            java.lang.String r6 = r0.toString()     // Catch:{ ErrnoException -> 0x0046 }
            java.lang.String r6 = android.system.Os.readlink(r6)     // Catch:{ ErrnoException -> 0x0046 }
            android.system.StructStat r0 = android.system.Os.stat(r6)     // Catch:{ ErrnoException -> 0x0046 }
            int r0 = r0.st_mode     // Catch:{ ErrnoException -> 0x0046 }
            boolean r0 = android.system.OsConstants.S_ISREG(r0)     // Catch:{ ErrnoException -> 0x0046 }
            if (r0 == 0) goto L_0x0046
            java.io.File r0 = new java.io.File     // Catch:{ ErrnoException -> 0x0046 }
            r0.<init>(r6)     // Catch:{ ErrnoException -> 0x0046 }
            goto L_0x0047
        L_0x0046:
            r0 = r2
        L_0x0047:
            if (r0 == 0) goto L_0x0058
            boolean r6 = r0.canRead()     // Catch:{ all -> 0x0076 }
            if (r6 != 0) goto L_0x0050
            goto L_0x0058
        L_0x0050:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r0)     // Catch:{ all -> 0x0076 }
            r5.close()     // Catch:{ IOException -> 0x0080 }
            return r4
        L_0x0058:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x0076 }
            java.io.FileDescriptor r0 = r5.getFileDescriptor()     // Catch:{ all -> 0x0076 }
            r6.<init>(r0)     // Catch:{ all -> 0x0076 }
            android.graphics.Typeface r4 = r3.c(r4, r6)     // Catch:{ all -> 0x006c }
            r6.close()     // Catch:{ all -> 0x0076 }
            r5.close()     // Catch:{ IOException -> 0x0080 }
            return r4
        L_0x006c:
            r4 = move-exception
            r6.close()     // Catch:{ all -> 0x0071 }
            goto L_0x0075
        L_0x0071:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch:{ all -> 0x0076 }
        L_0x0075:
            throw r4     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r4 = move-exception
            r5.close()     // Catch:{ all -> 0x007b }
            goto L_0x007f
        L_0x007b:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch:{ IOException -> 0x0080 }
        L_0x007f:
            throw r4     // Catch:{ IOException -> 0x0080 }
        L_0x0080:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.f.b(android.content.Context, f0.l[], int):android.graphics.Typeface");
    }
}

package b0;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import f0.l;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import n.i;

public final class g extends l {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f1941a;

    /* renamed from: b  reason: collision with root package name */
    public static final Constructor<?> f1942b;

    /* renamed from: c  reason: collision with root package name */
    public static final Method f1943c;
    public static final Method d;

    static {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Class<?> cls;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method2 = null;
            constructor = null;
            method = null;
        }
        f1942b = constructor;
        f1941a = cls;
        f1943c = method;
        d = method2;
    }

    public static boolean g(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z) {
        try {
            return ((Boolean) f1943c.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x005b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Typeface a(android.content.Context r18, a0.c.b r19, android.content.res.Resources r20, int r21) {
        /*
            r17 = this;
            r1 = 0
            r2 = 0
            java.lang.reflect.Constructor<?> r0 = f1942b     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000c }
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000c }
            java.lang.Object r0 = r0.newInstance(r3)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000c }
            r3 = r0
            goto L_0x000d
        L_0x000c:
            r3 = r1
        L_0x000d:
            if (r3 != 0) goto L_0x0010
            return r1
        L_0x0010:
            r0 = r19
            a0.c$c[] r4 = r0.f13a
            int r5 = r4.length
            r6 = r2
        L_0x0016:
            if (r6 >= r5) goto L_0x0071
            r7 = r4[r6]
            int r0 = r7.f18f
            java.io.File r8 = b0.m.d(r18)
            r9 = r20
            if (r8 != 0) goto L_0x0025
            goto L_0x002e
        L_0x0025:
            boolean r0 = b0.m.b(r8, r9, r0)     // Catch:{ all -> 0x006c }
            if (r0 != 0) goto L_0x0030
            r8.delete()
        L_0x002e:
            r0 = r1
            goto L_0x0059
        L_0x0030:
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0055 }
            r10.<init>(r8)     // Catch:{ IOException -> 0x0055 }
            java.nio.channels.FileChannel r11 = r10.getChannel()     // Catch:{ all -> 0x0049 }
            long r15 = r11.size()     // Catch:{ all -> 0x0049 }
            java.nio.channels.FileChannel$MapMode r12 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0049 }
            r13 = 0
            java.nio.MappedByteBuffer r0 = r11.map(r12, r13, r15)     // Catch:{ all -> 0x0049 }
            r10.close()     // Catch:{ IOException -> 0x0055 }
            goto L_0x0056
        L_0x0049:
            r0 = move-exception
            r11 = r0
            r10.close()     // Catch:{ all -> 0x004f }
            goto L_0x0054
        L_0x004f:
            r0 = move-exception
            r10 = r0
            r11.addSuppressed(r10)     // Catch:{ IOException -> 0x0055 }
        L_0x0054:
            throw r11     // Catch:{ IOException -> 0x0055 }
        L_0x0055:
            r0 = r1
        L_0x0056:
            r8.delete()
        L_0x0059:
            if (r0 != 0) goto L_0x005c
            return r1
        L_0x005c:
            int r8 = r7.f15b
            boolean r10 = r7.f16c
            int r7 = r7.f17e
            boolean r0 = g(r3, r0, r7, r8, r10)
            if (r0 != 0) goto L_0x0069
            return r1
        L_0x0069:
            int r6 = r6 + 1
            goto L_0x0016
        L_0x006c:
            r0 = move-exception
            r8.delete()
            throw r0
        L_0x0071:
            java.lang.Class<?> r0 = f1941a     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0088 }
            r4 = 1
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r4)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0088 }
            java.lang.reflect.Array.set(r0, r2, r3)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0088 }
            java.lang.reflect.Method r3 = d     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0088 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0088 }
            r4[r2] = r0     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0088 }
            java.lang.Object r0 = r3.invoke(r1, r4)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0088 }
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0088 }
            r1 = r0
        L_0x0088:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.g.a(android.content.Context, a0.c$b, android.content.res.Resources, int):android.graphics.Typeface");
    }

    public final Typeface b(Context context, l[] lVarArr, int i10) {
        Object obj;
        Typeface typeface;
        try {
            obj = f1942b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        i iVar = new i();
        for (l lVar : lVarArr) {
            Uri uri = lVar.f4578a;
            ByteBuffer byteBuffer = (ByteBuffer) iVar.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = m.e(context, uri);
                iVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null) {
                return null;
            }
            if (!g(obj, byteBuffer, lVar.f4579b, lVar.f4580c, lVar.d)) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(f1941a, 1);
            Array.set(newInstance, 0, obj);
            typeface = (Typeface) d.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            typeface = null;
        }
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, i10);
    }
}

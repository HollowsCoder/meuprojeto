package b0;

import a0.c;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import f0.l;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class h extends f {

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f1944f;

    /* renamed from: g  reason: collision with root package name */
    public final Constructor<?> f1945g;

    /* renamed from: h  reason: collision with root package name */
    public final Method f1946h;

    /* renamed from: i  reason: collision with root package name */
    public final Method f1947i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f1948j;

    /* renamed from: k  reason: collision with root package name */
    public final Method f1949k;
    public final Method l;

    public h() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method4 = m(cls);
            method3 = n(cls);
            method2 = cls.getMethod("freeze", new Class[0]);
            method5 = cls.getMethod("abortCreation", new Class[0]);
            method = o(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e10.getClass().getName()), e10);
            cls = null;
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f1944f = cls;
        this.f1945g = constructor;
        this.f1946h = method4;
        this.f1947i = method3;
        this.f1948j = method2;
        this.f1949k = method5;
        this.l = method;
    }

    public static Method m(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    public static Method n(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    public final Typeface a(Context context, c.b bVar, Resources resources, int i10) {
        Object obj;
        if (!l()) {
            return super.a(context, bVar, resources, i10);
        }
        try {
            obj = this.f1945g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (c.C0003c cVar : bVar.f13a) {
            if (!i(context, obj, cVar.f14a, cVar.f17e, cVar.f15b, cVar.f16c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.d))) {
                try {
                    this.f1949k.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (!k(obj)) {
            return null;
        }
        return j(obj);
    }

    public final Typeface b(Context context, l[] lVarArr, int i10) {
        Object obj;
        Typeface j8;
        boolean z;
        ParcelFileDescriptor openFileDescriptor;
        Throwable th;
        l[] lVarArr2 = lVarArr;
        int i11 = i10;
        if (lVarArr2.length < 1) {
            return null;
        }
        if (!l()) {
            l f10 = f(i11, lVarArr2);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(f10.f4578a, "r", (CancellationSignal) null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(f10.f4580c).setItalic(f10.d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            HashMap hashMap = new HashMap();
            for (l lVar : lVarArr2) {
                if (lVar.f4581e == 0) {
                    Uri uri = lVar.f4578a;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, m.e(context, uri));
                    }
                }
                Context context2 = context;
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            try {
                obj = this.f1945g.newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
                obj = null;
            }
            if (obj == null) {
                return null;
            }
            int length = lVarArr2.length;
            int i12 = 0;
            boolean z10 = false;
            while (true) {
                Method method = this.f1949k;
                if (i12 < length) {
                    l lVar2 = lVarArr2[i12];
                    ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(lVar2.f4578a);
                    if (byteBuffer != null) {
                        try {
                            z = ((Boolean) this.f1947i.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(lVar2.f4579b), null, Integer.valueOf(lVar2.f4580c), Integer.valueOf(lVar2.d ? 1 : 0)})).booleanValue();
                        } catch (IllegalAccessException | InvocationTargetException unused3) {
                            z = false;
                        }
                        if (!z) {
                            try {
                                method.invoke(obj, new Object[0]);
                                return null;
                            } catch (IllegalAccessException | InvocationTargetException unused4) {
                                return null;
                            }
                        } else {
                            z10 = true;
                        }
                    }
                    i12++;
                } else if (!z10) {
                    try {
                        method.invoke(obj, new Object[0]);
                        return null;
                    } catch (IllegalAccessException | InvocationTargetException unused5) {
                        return null;
                    }
                } else if (k(obj) && (j8 = j(obj)) != null) {
                    return Typeface.create(j8, i11);
                } else {
                    return null;
                }
            }
        }
        throw th;
    }

    public final Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        Object obj;
        if (!l()) {
            return super.d(context, resources, i10, str, i11);
        }
        try {
            obj = this.f1945g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (!i(context, obj, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            try {
                this.f1949k.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        } else if (!k(obj)) {
            return null;
        } else {
            return j(obj);
        }
    }

    public final boolean i(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f1946h.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f1944f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.l.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.f1948j.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean l() {
        Method method = this.f1946h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public Method o(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}

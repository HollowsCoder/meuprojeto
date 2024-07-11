package h8;

import com.google.gson.JsonIOException;
import com.google.gson.internal.reflect.ReflectionAccessor;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public final class b extends ReflectionAccessor {

    /* renamed from: c  reason: collision with root package name */
    public static Class f5916c;

    /* renamed from: a  reason: collision with root package name */
    public final Object f5917a;

    /* renamed from: b  reason: collision with root package name */
    public final Field f5918b;

    public b() {
        Object obj;
        Field field = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f5916c = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get((Object) null);
        } catch (Exception unused) {
            obj = null;
        }
        this.f5917a = obj;
        try {
            field = AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused2) {
        }
        this.f5918b = field;
    }

    public final void makeAccessible(AccessibleObject accessibleObject) {
        Field field;
        boolean z = false;
        Object obj = this.f5917a;
        if (!(obj == null || (field = this.f5918b) == null)) {
            try {
                f5916c.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(obj, new Object[]{accessibleObject, Long.valueOf(((Long) f5916c.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(obj, new Object[]{field})).longValue()), Boolean.TRUE});
                z = true;
            } catch (Exception unused) {
            }
        }
        if (!z) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e10) {
                throw new JsonIOException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e10);
            }
        }
    }
}

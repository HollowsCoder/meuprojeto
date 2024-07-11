package androidx.fragment.app;

import androidx.fragment.app.n;
import b0.d;
import n.i;

public class u {

    /* renamed from: a  reason: collision with root package name */
    public static final i<ClassLoader, i<String, Class<?>>> f1298a = new i<>();

    public static Class<?> b(ClassLoader classLoader, String str) {
        i<ClassLoader, i<String, Class<?>>> iVar = f1298a;
        i orDefault = iVar.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new i();
            iVar.put(classLoader, orDefault);
        }
        Class<?> cls = (Class) orDefault.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        orDefault.put(str, cls2);
        return cls2;
    }

    public static Class<? extends n> c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassNotFoundException e10) {
            throw new n.c(d.f("Unable to instantiate fragment ", str, ": make sure class name exists"), e10);
        } catch (ClassCastException e11) {
            throw new n.c(d.f("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e11);
        }
    }

    public n a(String str) {
        throw null;
    }
}

package v4;

import dalvik.system.PathClassLoader;

public final class a extends PathClassLoader {
    public a(ClassLoader classLoader, String str) {
        super(str, classLoader);
    }

    public final Class<?> loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}

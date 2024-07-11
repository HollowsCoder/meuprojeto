package androidx.lifecycle;

import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f1402a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f1403b = new HashMap();

    public static f a(Constructor<? extends f> constructor, Object obj) {
        try {
            return (f) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    public static String b(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    public static int c(Class<?> cls) {
        Constructor<?> constructor;
        List<?> list;
        boolean z;
        boolean z10;
        boolean z11;
        String str;
        HashMap hashMap = f1402a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i10 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package packageR = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                if (packageR != null) {
                    str = packageR.getName();
                } else {
                    str = BuildConfig.FLAVOR;
                }
                if (!str.isEmpty()) {
                    canonicalName = canonicalName.substring(str.length() + 1);
                }
                String b10 = b(canonicalName);
                if (!str.isEmpty()) {
                    b10 = str + "." + b10;
                }
                constructor = Class.forName(b10).getDeclaredConstructor(new Class[]{cls});
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            }
            HashMap hashMap2 = f1403b;
            if (constructor != null) {
                list = Collections.singletonList(constructor);
            } else {
                b bVar = b.f1374c;
                HashMap hashMap3 = bVar.f1376b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z = false;
                                break;
                            } else if (((u) declaredMethods[i11].getAnnotation(u.class)) != null) {
                                bVar.a(cls, declaredMethods);
                                z = true;
                                break;
                            } else {
                                i11++;
                            }
                        }
                    } catch (NoClassDefFoundError e11) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
                    }
                }
                if (!z) {
                    Class<? super Object> superclass = cls.getSuperclass();
                    Class<m> cls2 = m.class;
                    if (superclass == null || !cls2.isAssignableFrom(superclass)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        if (c(superclass) != 1) {
                            arrayList = new ArrayList((Collection) hashMap2.get(superclass));
                        }
                    }
                    Class[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            Class cls3 = interfaces[i12];
                            if (cls3 == null || !cls2.isAssignableFrom(cls3)) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (z11) {
                                if (c(cls3) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.addAll((Collection) hashMap2.get(cls3));
                            }
                            i12++;
                        } else if (arrayList != null) {
                            list = arrayList;
                        }
                    }
                }
            }
            hashMap2.put(cls, list);
            i10 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i10));
        return i10;
    }
}

package androidx.lifecycle;

import androidx.lifecycle.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final b f1374c = new b();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f1375a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f1376b = new HashMap();

    @Deprecated
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f1377a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<C0015b, h.b> f1378b;

        public a(HashMap hashMap) {
            this.f1378b = hashMap;
            for (Map.Entry entry : hashMap.entrySet()) {
                h.b bVar = (h.b) entry.getValue();
                List list = (List) this.f1377a.get(bVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f1377a.put(bVar, list);
                }
                list.add((C0015b) entry.getKey());
            }
        }

        public static void a(List<C0015b> list, n nVar, h.b bVar, Object obj) {
            if (list != null) {
                int size = list.size() - 1;
                while (size >= 0) {
                    C0015b bVar2 = list.get(size);
                    bVar2.getClass();
                    try {
                        int i10 = bVar2.f1379a;
                        Method method = bVar2.f1380b;
                        if (i10 == 0) {
                            method.invoke(obj, new Object[0]);
                        } else if (i10 == 1) {
                            method.invoke(obj, new Object[]{nVar});
                        } else if (i10 == 2) {
                            method.invoke(obj, new Object[]{nVar, bVar});
                        }
                        size--;
                    } catch (InvocationTargetException e10) {
                        throw new RuntimeException("Failed to call observer method", e10.getCause());
                    } catch (IllegalAccessException e11) {
                        throw new RuntimeException(e11);
                    }
                }
            }
        }
    }

    @Deprecated
    /* renamed from: androidx.lifecycle.b$b  reason: collision with other inner class name */
    public static final class C0015b {

        /* renamed from: a  reason: collision with root package name */
        public final int f1379a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f1380b;

        public C0015b(int i10, Method method) {
            this.f1379a = i10;
            this.f1380b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0015b)) {
                return false;
            }
            C0015b bVar = (C0015b) obj;
            return this.f1379a == bVar.f1379a && this.f1380b.getName().equals(bVar.f1380b.getName());
        }

        public final int hashCode() {
            return this.f1380b.getName().hashCode() + (this.f1379a * 31);
        }
    }

    public static void c(HashMap hashMap, C0015b bVar, h.b bVar2, Class cls) {
        h.b bVar3 = (h.b) hashMap.get(bVar);
        if (bVar3 != null && bVar2 != bVar3) {
            Method method = bVar.f1380b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
        } else if (bVar3 == null) {
            hashMap.put(bVar, bVar2);
        }
    }

    public final a a(Class<?> cls, Method[] methodArr) {
        int i10;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).f1378b);
        }
        for (Class b10 : cls.getInterfaces()) {
            for (Map.Entry next : b(b10).f1378b.entrySet()) {
                c(hashMap, (C0015b) next.getKey(), (h.b) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e10) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            u uVar = (u) method.getAnnotation(u.class);
            if (uVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else if (parameterTypes[0].isAssignableFrom(n.class)) {
                    i10 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                h.b value = uVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(h.b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == h.b.ON_ANY) {
                        i10 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    c(hashMap, new C0015b(i10, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f1375a.put(cls, aVar);
        this.f1376b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    public final a b(Class<?> cls) {
        a aVar = (a) this.f1375a.get(cls);
        return aVar != null ? aVar : a(cls, (Method[]) null);
    }
}

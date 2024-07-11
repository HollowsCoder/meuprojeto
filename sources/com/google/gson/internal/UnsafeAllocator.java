package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public abstract class UnsafeAllocator {

    public class a extends UnsafeAllocator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Method f3831a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f3832b;

        public a(Method method, Object obj) {
            this.f3831a = method;
            this.f3832b = obj;
        }

        public final <T> T newInstance(Class<T> cls) {
            UnsafeAllocator.a(cls);
            return this.f3831a.invoke(this.f3832b, new Object[]{cls});
        }
    }

    public class b extends UnsafeAllocator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Method f3833a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f3834b;

        public b(int i10, Method method) {
            this.f3833a = method;
            this.f3834b = i10;
        }

        public final <T> T newInstance(Class<T> cls) {
            UnsafeAllocator.a(cls);
            return this.f3833a.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f3834b)});
        }
    }

    public class c extends UnsafeAllocator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Method f3835a;

        public c(Method method) {
            this.f3835a = method;
        }

        public final <T> T newInstance(Class<T> cls) {
            UnsafeAllocator.a(cls);
            return this.f3835a.invoke((Object) null, new Object[]{cls, Object.class});
        }
    }

    public class d extends UnsafeAllocator {
        public final <T> T newInstance(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    public static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: ".concat(cls.getName()));
        } else if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: ".concat(cls.getName()));
        }
    }

    public static UnsafeAllocator create() {
        Class<ObjectStreamClass> cls = ObjectStreamClass.class;
        Class<Class> cls2 = Class.class;
        try {
            Class<?> cls3 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls3.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls3.getMethod("allocateInstance", new Class[]{cls2}), declaredField.get((Object) null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("getConstructorId", new Class[]{cls2});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = cls.getDeclaredMethod("newInstance", new Class[]{cls2, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return new b(intValue, declaredMethod2);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{cls2, cls2});
                    declaredMethod3.setAccessible(true);
                    return new c(declaredMethod3);
                } catch (Exception unused3) {
                    return new d();
                }
            }
        }
    }

    public abstract <T> T newInstance(Class<T> cls);
}

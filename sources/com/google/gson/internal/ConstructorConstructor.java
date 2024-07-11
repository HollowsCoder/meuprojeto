package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import com.google.gson.JsonIOException;
import com.google.gson.internal.reflect.ReflectionAccessor;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public final class ConstructorConstructor {
    private final ReflectionAccessor accessor = ReflectionAccessor.getInstance();
    private final Map<Type, InstanceCreator<?>> instanceCreators;

    public class a implements ObjectConstructor<T> {
        public final T construct() {
            return new ConcurrentHashMap();
        }
    }

    public class b implements ObjectConstructor<T> {
        public final T construct() {
            return new TreeMap();
        }
    }

    public class c implements ObjectConstructor<T> {
        public final T construct() {
            return new LinkedHashMap();
        }
    }

    public class d implements ObjectConstructor<T> {
        public final T construct() {
            return new LinkedTreeMap();
        }
    }

    public class e implements ObjectConstructor<T> {

        /* renamed from: a  reason: collision with root package name */
        public final UnsafeAllocator f3774a = UnsafeAllocator.create();

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Class f3775b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Type f3776c;

        public e(Class cls, Type type) {
            this.f3775b = cls;
            this.f3776c = type;
        }

        public final T construct() {
            try {
                return this.f3774a.newInstance(this.f3775b);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f3776c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e10);
            }
        }
    }

    public class f implements ObjectConstructor<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ InstanceCreator f3777a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Type f3778b;

        public f(InstanceCreator instanceCreator, Type type) {
            this.f3777a = instanceCreator;
            this.f3778b = type;
        }

        public final T construct() {
            return this.f3777a.createInstance(this.f3778b);
        }
    }

    public class g implements ObjectConstructor<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ InstanceCreator f3779a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Type f3780b;

        public g(InstanceCreator instanceCreator, Type type) {
            this.f3779a = instanceCreator;
            this.f3780b = type;
        }

        public final T construct() {
            return this.f3779a.createInstance(this.f3780b);
        }
    }

    public class h implements ObjectConstructor<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Constructor f3781a;

        public h(Constructor constructor) {
            this.f3781a = constructor;
        }

        public final T construct() {
            Constructor constructor = this.f3781a;
            try {
                return constructor.newInstance((Object[]) null);
            } catch (InstantiationException e10) {
                throw new RuntimeException("Failed to invoke " + constructor + " with no args", e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to invoke " + constructor + " with no args", e11.getTargetException());
            } catch (IllegalAccessException e12) {
                throw new AssertionError(e12);
            }
        }
    }

    public class i implements ObjectConstructor<T> {
        public final T construct() {
            return new TreeSet();
        }
    }

    public class j implements ObjectConstructor<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Type f3782a;

        public j(Type type) {
            this.f3782a = type;
        }

        public final T construct() {
            Type type = this.f3782a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new JsonIOException("Invalid EnumSet type: " + type.toString());
            }
            throw new JsonIOException("Invalid EnumSet type: " + type.toString());
        }
    }

    public class k implements ObjectConstructor<T> {
        public final T construct() {
            return new LinkedHashSet();
        }
    }

    public class l implements ObjectConstructor<T> {
        public final T construct() {
            return new ArrayDeque();
        }
    }

    public class m implements ObjectConstructor<T> {
        public final T construct() {
            return new ArrayList();
        }
    }

    public class n implements ObjectConstructor<T> {
        public final T construct() {
            return new ConcurrentSkipListMap();
        }
    }

    public ConstructorConstructor(Map<Type, InstanceCreator<?>> map) {
        this.instanceCreators = map;
    }

    private <T> ObjectConstructor<T> newDefaultConstructor(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.accessor.makeAccessible(declaredConstructor);
            }
            return new h(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> ObjectConstructor<T> newDefaultImplementationConstructor(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new i() : EnumSet.class.isAssignableFrom(cls) ? new j(type) : Set.class.isAssignableFrom(cls) ? new k() : Queue.class.isAssignableFrom(cls) ? new l() : new m();
        }
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
            return new n();
        }
        if (ConcurrentMap.class.isAssignableFrom(cls)) {
            return new a();
        }
        if (SortedMap.class.isAssignableFrom(cls)) {
            return new b();
        }
        if (type instanceof ParameterizedType) {
            if (!String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
                return new c();
            }
        }
        return new d();
    }

    private <T> ObjectConstructor<T> newUnsafeAllocator(Type type, Class<? super T> cls) {
        return new e(cls, type);
    }

    public <T> ObjectConstructor<T> get(TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        InstanceCreator instanceCreator = this.instanceCreators.get(type);
        if (instanceCreator != null) {
            return new f(instanceCreator, type);
        }
        InstanceCreator instanceCreator2 = this.instanceCreators.get(rawType);
        if (instanceCreator2 != null) {
            return new g(instanceCreator2, type);
        }
        ObjectConstructor<T> newDefaultConstructor = newDefaultConstructor(rawType);
        if (newDefaultConstructor != null) {
            return newDefaultConstructor;
        }
        ObjectConstructor<T> newDefaultImplementationConstructor = newDefaultImplementationConstructor(type, rawType);
        return newDefaultImplementationConstructor != null ? newDefaultImplementationConstructor : newUnsafeAllocator(type, rawType);
    }

    public String toString() {
        return this.instanceCreators.toString();
    }
}

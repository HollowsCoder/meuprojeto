package com.google.gson.reflect;

import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.C$Gson$Types;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

public class TypeToken<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<? super T> f3879a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f3880b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3881c;

    public TypeToken() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            Type canonicalize = C$Gson$Types.canonicalize(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.f3880b = canonicalize;
            this.f3879a = C$Gson$Types.getRawType(canonicalize);
            this.f3881c = canonicalize.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public TypeToken(Type type) {
        Type canonicalize = C$Gson$Types.canonicalize((Type) C$Gson$Preconditions.checkNotNull(type));
        this.f3880b = canonicalize;
        this.f3879a = C$Gson$Types.getRawType(canonicalize);
        this.f3881c = canonicalize.hashCode();
    }

    private static AssertionError buildUnexpectedTypeError(Type type, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder("Unexpected type. Expected one of: ");
        for (Class<?> name : clsArr) {
            sb.append(name.getName());
            sb.append(", ");
        }
        sb.append("but got: ");
        sb.append(type.getClass().getName());
        sb.append(", for type token: ");
        sb.append(type.toString());
        sb.append('.');
        return new AssertionError(sb.toString());
    }

    public static <T> TypeToken<T> get(Class<T> cls) {
        return new TypeToken<>(cls);
    }

    public static TypeToken<?> get(Type type) {
        return new TypeToken<>(type);
    }

    public static TypeToken<?> getArray(Type type) {
        return new TypeToken<>(C$Gson$Types.arrayOf(type));
    }

    public static TypeToken<?> getParameterized(Type type, Type... typeArr) {
        return new TypeToken<>(C$Gson$Types.newParameterizedTypeWithOwner((Type) null, type, typeArr));
    }

    private static boolean isAssignableFrom(Type type, GenericArrayType genericArrayType) {
        Class<?> cls;
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (!(genericComponentType instanceof ParameterizedType)) {
            return true;
        }
        if (type instanceof GenericArrayType) {
            cls = ((GenericArrayType) type).getGenericComponentType();
        } else {
            boolean z = type instanceof Class;
            cls = type;
            if (z) {
                Class<?> cls2 = (Class) type;
                while (cls2.isArray()) {
                    cls2 = cls2.getComponentType();
                }
                cls = cls2;
            }
        }
        return isAssignableFrom(cls, (ParameterizedType) genericComponentType, new HashMap());
    }

    private static boolean isAssignableFrom(Type type, ParameterizedType parameterizedType, Map<String, Type> map) {
        if (type == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class<?> rawType = C$Gson$Types.getRawType(type);
        ParameterizedType parameterizedType2 = type instanceof ParameterizedType ? (ParameterizedType) type : null;
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable[] typeParameters = rawType.getTypeParameters();
            for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
                Type type2 = actualTypeArguments[i10];
                TypeVariable typeVariable = typeParameters[i10];
                while (type2 instanceof TypeVariable) {
                    type2 = map.get(((TypeVariable) type2).getName());
                }
                map.put(typeVariable.getName(), type2);
            }
            if (typeEquals(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type isAssignableFrom : rawType.getGenericInterfaces()) {
            if (isAssignableFrom(isAssignableFrom, parameterizedType, new HashMap(map))) {
                return true;
            }
        }
        return isAssignableFrom(rawType.getGenericSuperclass(), parameterizedType, new HashMap(map));
    }

    private static boolean matches(Type type, Type type2, Map<String, Type> map) {
        return type2.equals(type) || ((type instanceof TypeVariable) && type2.equals(map.get(((TypeVariable) type).getName())));
    }

    private static boolean typeEquals(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
            if (!matches(actualTypeArguments[i10], actualTypeArguments2[i10], map)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TypeToken) {
            if (C$Gson$Types.equals(this.f3880b, ((TypeToken) obj).f3880b)) {
                return true;
            }
        }
        return false;
    }

    public final Class<? super T> getRawType() {
        return this.f3879a;
    }

    public final Type getType() {
        return this.f3880b;
    }

    public final int hashCode() {
        return this.f3881c;
    }

    @Deprecated
    public boolean isAssignableFrom(TypeToken<?> typeToken) {
        return isAssignableFrom(typeToken.getType());
    }

    @Deprecated
    public boolean isAssignableFrom(Class<?> cls) {
        return isAssignableFrom((Type) cls);
    }

    @Deprecated
    public boolean isAssignableFrom(Type type) {
        if (type == null) {
            return false;
        }
        Type type2 = this.f3880b;
        if (type2.equals(type)) {
            return true;
        }
        boolean z = type2 instanceof Class;
        Class<? super T> cls = this.f3879a;
        if (z) {
            return cls.isAssignableFrom(C$Gson$Types.getRawType(type));
        }
        if (type2 instanceof ParameterizedType) {
            return isAssignableFrom(type, (ParameterizedType) type2, new HashMap());
        }
        if (type2 instanceof GenericArrayType) {
            return cls.isAssignableFrom(C$Gson$Types.getRawType(type)) && isAssignableFrom(type, (GenericArrayType) type2);
        }
        throw buildUnexpectedTypeError(type2, Class.class, ParameterizedType.class, GenericArrayType.class);
    }

    public final String toString() {
        return C$Gson$Types.typeToString(this.f3880b);
    }
}

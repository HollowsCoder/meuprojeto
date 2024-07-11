package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* renamed from: com.google.gson.internal.$Gson$Types  reason: invalid class name */
public final class C$Gson$Types {

    /* renamed from: a  reason: collision with root package name */
    public static final Type[] f3767a = new Type[0];

    /* renamed from: com.google.gson.internal.$Gson$Types$a */
    public static final class a implements GenericArrayType, Serializable {

        /* renamed from: o  reason: collision with root package name */
        public final Type f3768o;

        public a(Type type) {
            this.f3768o = C$Gson$Types.canonicalize(type);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C$Gson$Types.equals(this, (GenericArrayType) obj);
        }

        public final Type getGenericComponentType() {
            return this.f3768o;
        }

        public final int hashCode() {
            return this.f3768o.hashCode();
        }

        public final String toString() {
            return C$Gson$Types.typeToString(this.f3768o) + "[]";
        }
    }

    /* renamed from: com.google.gson.internal.$Gson$Types$b */
    public static final class b implements ParameterizedType, Serializable {

        /* renamed from: o  reason: collision with root package name */
        public final Type f3769o;

        /* renamed from: p  reason: collision with root package name */
        public final Type f3770p;

        /* renamed from: q  reason: collision with root package name */
        public final Type[] f3771q;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z10 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z10) {
                    z = false;
                }
                C$Gson$Preconditions.checkArgument(z);
            }
            this.f3769o = type == null ? null : C$Gson$Types.canonicalize(type);
            this.f3770p = C$Gson$Types.canonicalize(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f3771q = typeArr2;
            int length = typeArr2.length;
            for (int i10 = 0; i10 < length; i10++) {
                C$Gson$Preconditions.checkNotNull(this.f3771q[i10]);
                C$Gson$Types.a(this.f3771q[i10]);
                Type[] typeArr3 = this.f3771q;
                typeArr3[i10] = C$Gson$Types.canonicalize(typeArr3[i10]);
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C$Gson$Types.equals(this, (ParameterizedType) obj);
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f3771q.clone();
        }

        public final Type getOwnerType() {
            return this.f3769o;
        }

        public final Type getRawType() {
            return this.f3770p;
        }

        public final int hashCode() {
            int i10;
            int hashCode = Arrays.hashCode(this.f3771q) ^ this.f3770p.hashCode();
            Type type = this.f3769o;
            if (type != null) {
                i10 = type.hashCode();
            } else {
                i10 = 0;
            }
            return hashCode ^ i10;
        }

        public final String toString() {
            Type[] typeArr = this.f3771q;
            int length = typeArr.length;
            Type type = this.f3770p;
            if (length == 0) {
                return C$Gson$Types.typeToString(type);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C$Gson$Types.typeToString(type));
            sb.append("<");
            sb.append(C$Gson$Types.typeToString(typeArr[0]));
            for (int i10 = 1; i10 < length; i10++) {
                sb.append(", ");
                sb.append(C$Gson$Types.typeToString(typeArr[i10]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: com.google.gson.internal.$Gson$Types$c */
    public static final class c implements WildcardType, Serializable {

        /* renamed from: o  reason: collision with root package name */
        public final Type f3772o;

        /* renamed from: p  reason: collision with root package name */
        public final Type f3773p;

        public c(Type[] typeArr, Type[] typeArr2) {
            boolean z = true;
            C$Gson$Preconditions.checkArgument(typeArr2.length <= 1);
            C$Gson$Preconditions.checkArgument(typeArr.length == 1);
            if (typeArr2.length == 1) {
                C$Gson$Preconditions.checkNotNull(typeArr2[0]);
                C$Gson$Types.a(typeArr2[0]);
                Class<Object> cls = Object.class;
                C$Gson$Preconditions.checkArgument(typeArr[0] != cls ? false : z);
                this.f3773p = C$Gson$Types.canonicalize(typeArr2[0]);
                this.f3772o = cls;
                return;
            }
            C$Gson$Preconditions.checkNotNull(typeArr[0]);
            C$Gson$Types.a(typeArr[0]);
            this.f3773p = null;
            this.f3772o = C$Gson$Types.canonicalize(typeArr[0]);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C$Gson$Types.equals(this, (WildcardType) obj);
        }

        public final Type[] getLowerBounds() {
            Type type = this.f3773p;
            if (type == null) {
                return C$Gson$Types.f3767a;
            }
            return new Type[]{type};
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.f3772o};
        }

        public final int hashCode() {
            Type type = this.f3773p;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f3772o.hashCode() + 31);
        }

        public final String toString() {
            Type type = this.f3773p;
            if (type != null) {
                return "? super " + C$Gson$Types.typeToString(type);
            }
            Class<Object> cls = Object.class;
            Type type2 = this.f3772o;
            if (type2 == cls) {
                return "?";
            }
            return "? extends " + C$Gson$Types.typeToString(type2);
        }
    }

    private C$Gson$Types() {
        throw new UnsupportedOperationException();
    }

    public static void a(Type type) {
        C$Gson$Preconditions.checkArgument(!(type instanceof Class) || !((Class) type).isPrimitive());
    }

    public static GenericArrayType arrayOf(Type type) {
        return new a(type);
    }

    public static Type b(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return b(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return b(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type c(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C$Gson$Preconditions.checkArgument(cls2.isAssignableFrom(cls));
        return resolve(type, cls, b(type, cls, cls2));
    }

    public static Type canonicalize(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(canonicalize(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    private static Class<?> declaringClassOf(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    public static boolean equals(Type type, Type type2) {
        boolean z;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) {
                z = true;
            } else {
                z = false;
            }
            if (!z || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return false;
            }
            return true;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return equals(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return false;
            }
            return true;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                return false;
            }
            return true;
        }
    }

    public static Type getArrayComponentType(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    public static Type getCollectionElementType(Type type, Class<?> cls) {
        Type c10 = c(type, cls, Collection.class);
        if (c10 instanceof WildcardType) {
            c10 = ((WildcardType) c10).getUpperBounds()[0];
        }
        return c10 instanceof ParameterizedType ? ((ParameterizedType) c10).getActualTypeArguments()[0] : Object.class;
    }

    public static Type[] getMapKeyAndValueTypes(Type type, Class<?> cls) {
        if (type == Properties.class) {
            Class<String> cls2 = String.class;
            return new Type[]{cls2, cls2};
        }
        Type c10 = c(type, cls, Map.class);
        if (c10 instanceof ParameterizedType) {
            return ((ParameterizedType) c10).getActualTypeArguments();
        }
        Class<Object> cls3 = Object.class;
        return new Type[]{cls3, cls3};
    }

    public static Class<?> getRawType(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C$Gson$Preconditions.checkArgument(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(getRawType(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return getRawType(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? "null" : type.getClass().getName();
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    private static int indexOf(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
        }
        throw new NoSuchElementException();
    }

    public static ParameterizedType newParameterizedTypeWithOwner(Type type, Type type2, Type... typeArr) {
        return new b(type, type2, typeArr);
    }

    public static Type resolve(Type type, Class<?> cls, Type type2) {
        return resolve(type, cls, type2, new HashSet());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.reflect.TypeVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type resolve(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable> r11) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x0034
            r0 = r10
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            boolean r1 = r11.contains(r0)
            if (r1 == 0) goto L_0x000e
            return r10
        L_0x000e:
            r11.add(r0)
            java.lang.Class r10 = declaringClassOf(r0)
            if (r10 != 0) goto L_0x0019
        L_0x0017:
            r10 = r0
            goto L_0x0031
        L_0x0019:
            java.lang.reflect.Type r1 = b(r8, r9, r10)
            boolean r2 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L_0x0017
            java.lang.reflect.TypeVariable[] r10 = r10.getTypeParameters()
            int r10 = indexOf(r10, r0)
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()
            r10 = r1[r10]
        L_0x0031:
            if (r10 != r0) goto L_0x0000
            return r10
        L_0x0034:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0051
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x0051
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = resolve(r8, r9, r10, r11)
            if (r10 != r8) goto L_0x004c
            goto L_0x0050
        L_0x004c:
            java.lang.reflect.GenericArrayType r0 = arrayOf(r8)
        L_0x0050:
            return r0
        L_0x0051:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0067
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = resolve(r8, r9, r0, r11)
            if (r0 != r8) goto L_0x0062
            goto L_0x0066
        L_0x0062:
            java.lang.reflect.GenericArrayType r10 = arrayOf(r8)
        L_0x0066:
            return r10
        L_0x0067:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00a7
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = resolve(r8, r9, r0, r11)
            if (r3 == r0) goto L_0x007b
            r0 = r1
            goto L_0x007c
        L_0x007b:
            r0 = r2
        L_0x007c:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x0081:
            if (r2 >= r5) goto L_0x009c
            r6 = r4[r2]
            java.lang.reflect.Type r6 = resolve(r8, r9, r6, r11)
            r7 = r4[r2]
            if (r6 == r7) goto L_0x0099
            if (r0 != 0) goto L_0x0097
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = r1
        L_0x0097:
            r4[r2] = r6
        L_0x0099:
            int r2 = r2 + 1
            goto L_0x0081
        L_0x009c:
            if (r0 == 0) goto L_0x00a6
            java.lang.reflect.Type r8 = r10.getRawType()
            java.lang.reflect.ParameterizedType r10 = newParameterizedTypeWithOwner(r3, r8, r4)
        L_0x00a6:
            return r10
        L_0x00a7:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x00d9
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto L_0x00c7
            r1 = r0[r2]
            java.lang.reflect.Type r8 = resolve(r8, r9, r1, r11)
            r9 = r0[r2]
            if (r8 == r9) goto L_0x00d9
            java.lang.reflect.WildcardType r8 = supertypeOf(r8)
            return r8
        L_0x00c7:
            int r0 = r3.length
            if (r0 != r1) goto L_0x00d9
            r0 = r3[r2]
            java.lang.reflect.Type r8 = resolve(r8, r9, r0, r11)
            r9 = r3[r2]
            if (r8 == r9) goto L_0x00d9
            java.lang.reflect.WildcardType r8 = subtypeOf(r8)
            return r8
        L_0x00d9:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C$Gson$Types.resolve(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }

    public static WildcardType subtypeOf(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new c(typeArr, f3767a);
    }

    public static WildcardType supertypeOf(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getLowerBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new c(new Type[]{Object.class}, typeArr);
    }

    public static String typeToString(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}

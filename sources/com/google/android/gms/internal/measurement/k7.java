package com.google.android.gms.internal.measurement;

import androidx.databinding.a;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public final class k7 {
    public static final void a(StringBuilder sb, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object a10 : (List) obj) {
                a(sb, i10, str, a10);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry a11 : ((Map) obj).entrySet()) {
                a(sb, i10, str, a11);
            }
        } else {
            sb.append(10);
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                j5 j5Var = k5.f2770p;
                sb.append(a.y(new j5(((String) obj).getBytes(n6.f2844a))));
                sb.append('\"');
            } else if (obj instanceof k5) {
                sb.append(": \"");
                sb.append(a.y((k5) obj));
                sb.append('\"');
            } else if (obj instanceof f6) {
                sb.append(" {");
                b((f6) obj, sb, i10 + 2);
                sb.append("\n");
                while (i11 < i10) {
                    sb.append(' ');
                    i11++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i13 = i10 + 2;
                a(sb, i13, "key", entry.getKey());
                a(sb, i13, "value", entry.getValue());
                sb.append("\n");
                while (i11 < i10) {
                    sb.append(' ');
                    i11++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    public static void b(i7 i7Var, StringBuilder sb, int i10) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Object obj;
        String str6;
        String str7;
        String str8;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : i7Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str9 = (String) it.next();
            if (str9.startsWith("get")) {
                str = str9.substring(3);
            } else {
                str = str9;
            }
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String valueOf = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(str.substring(1, str.length() - 4));
                if (valueOf2.length() != 0) {
                    str8 = valueOf.concat(valueOf2);
                } else {
                    str8 = new String(valueOf);
                }
                Method method2 = (Method) hashMap.get(str9);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    a(sb, i10, c(str8), f6.j(i7Var, method2, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String valueOf3 = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(str.substring(1, str.length() - 3));
                if (valueOf4.length() != 0) {
                    str7 = valueOf3.concat(valueOf4);
                } else {
                    str7 = new String(valueOf3);
                }
                Method method3 = (Method) hashMap.get(str9);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    a(sb, i10, c(str7), f6.j(i7Var, method3, new Object[0]));
                }
            }
            if (str.length() != 0) {
                str2 = "set".concat(str);
            } else {
                str2 = new String("set");
            }
            if (((Method) hashMap2.get(str2)) != null) {
                if (str.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(str.substring(0, str.length() - 5));
                    if (valueOf5.length() != 0) {
                        str6 = "get".concat(valueOf5);
                    } else {
                        str6 = new String("get");
                    }
                    if (hashMap.containsKey(str6)) {
                    }
                }
                String valueOf6 = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(str.substring(1));
                if (valueOf7.length() != 0) {
                    str3 = valueOf6.concat(valueOf7);
                } else {
                    str3 = new String(valueOf6);
                }
                if (str.length() != 0) {
                    str4 = "get".concat(str);
                } else {
                    str4 = new String("get");
                }
                Method method4 = (Method) hashMap.get(str4);
                if (str.length() != 0) {
                    str5 = "has".concat(str);
                } else {
                    str5 = new String("has");
                }
                Method method5 = (Method) hashMap.get(str5);
                if (method4 != null) {
                    Object j8 = f6.j(i7Var, method4, new Object[0]);
                    if (method5 == null) {
                        if (j8 instanceof Boolean) {
                            if (!((Boolean) j8).booleanValue()) {
                            }
                        } else if (j8 instanceof Integer) {
                            if (((Integer) j8).intValue() == 0) {
                            }
                        } else if (j8 instanceof Float) {
                            if (((Float) j8).floatValue() == 0.0f) {
                            }
                        } else if (!(j8 instanceof Double)) {
                            if (j8 instanceof String) {
                                obj = BuildConfig.FLAVOR;
                            } else if (j8 instanceof k5) {
                                obj = k5.f2770p;
                            } else if (j8 instanceof i7) {
                                if (j8 == ((i7) j8).h()) {
                                }
                            } else if ((j8 instanceof Enum) && ((Enum) j8).ordinal() == 0) {
                            }
                            if (j8.equals(obj)) {
                            }
                        } else if (((Double) j8).doubleValue() == 0.0d) {
                        }
                    } else if (!((Boolean) f6.j(i7Var, method5, new Object[0])).booleanValue()) {
                    }
                    a(sb, i10, c(str3), j8);
                }
            }
        }
        if (!(i7Var instanceof d6)) {
            f8 f8Var = ((f6) i7Var).zzc;
            if (f8Var != null) {
                for (int i11 = 0; i11 < f8Var.f2701a; i11++) {
                    a(sb, i10, String.valueOf(f8Var.f2702b[i11] >>> 3), f8Var.f2703c[i11]);
                }
                return;
            }
            return;
        }
        d6 d6Var = (d6) i7Var;
        throw null;
    }

    public static final String c(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}

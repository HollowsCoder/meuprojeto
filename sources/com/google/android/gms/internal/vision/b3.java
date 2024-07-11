package com.google.android.gms.internal.vision;

import java.util.List;
import java.util.Map;
import s6.a;

public final class b3 {
    public static final String a(String str) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01e2, code lost:
        if (((java.lang.Boolean) r4).booleanValue() == false) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01f0, code lost:
        if (((java.lang.Integer) r4).intValue() == 0) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0201, code lost:
        if (((java.lang.Float) r4).floatValue() == 0.0f) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0213, code lost:
        if (((java.lang.Double) r4).doubleValue() == 0.0d) goto L_0x0243;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0249  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(com.google.android.gms.internal.vision.w2 r13, java.lang.StringBuilder r14, int r15) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.TreeSet r2 = new java.util.TreeSet
            r2.<init>()
            java.lang.Class r3 = r13.getClass()
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()
            int r4 = r3.length
            r5 = 0
            r6 = r5
        L_0x001a:
            java.lang.String r7 = "get"
            if (r6 >= r4) goto L_0x0049
            r8 = r3[r6]
            java.lang.String r9 = r8.getName()
            r1.put(r9, r8)
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r9 = r9.length
            if (r9 != 0) goto L_0x0046
            java.lang.String r9 = r8.getName()
            r0.put(r9, r8)
            java.lang.String r9 = r8.getName()
            boolean r7 = r9.startsWith(r7)
            if (r7 == 0) goto L_0x0046
            java.lang.String r7 = r8.getName()
            r2.add(r7)
        L_0x0046:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x0049:
            java.util.Iterator r2 = r2.iterator()
        L_0x004d:
            boolean r3 = r2.hasNext()
            r4 = 3
            if (r3 == 0) goto L_0x0262
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r6 = r3.startsWith(r7)
            if (r6 == 0) goto L_0x0065
            java.lang.String r6 = r3.substring(r4)
            goto L_0x0066
        L_0x0065:
            r6 = r3
        L_0x0066:
            java.lang.String r8 = "List"
            boolean r9 = r6.endsWith(r8)
            r10 = 1
            if (r9 == 0) goto L_0x00c8
            java.lang.String r9 = "OrBuilderList"
            boolean r9 = r6.endsWith(r9)
            if (r9 != 0) goto L_0x00c8
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x00c8
            java.lang.String r8 = r6.substring(r5, r10)
            java.lang.String r8 = r8.toLowerCase()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r6.length()
            int r9 = r9 + -4
            java.lang.String r9 = r6.substring(r10, r9)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r11 = r9.length()
            if (r11 == 0) goto L_0x00a2
            java.lang.String r8 = r8.concat(r9)
            goto L_0x00a8
        L_0x00a2:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r8)
            r8 = r9
        L_0x00a8:
            java.lang.Object r9 = r0.get(r3)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r9 == 0) goto L_0x00c8
            java.lang.Class r11 = r9.getReturnType()
            java.lang.Class<java.util.List> r12 = java.util.List.class
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00c8
            java.lang.String r3 = a(r8)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Object r4 = com.google.android.gms.internal.vision.q1.k(r13, r9, r4)
            goto L_0x025d
        L_0x00c8:
            java.lang.String r8 = "Map"
            boolean r9 = r6.endsWith(r8)
            if (r9 == 0) goto L_0x0134
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x0134
            java.lang.String r8 = r6.substring(r5, r10)
            java.lang.String r8 = r8.toLowerCase()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r6.length()
            int r9 = r9 - r4
            java.lang.String r4 = r6.substring(r10, r9)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r9 = r4.length()
            if (r9 == 0) goto L_0x00fa
            java.lang.String r4 = r8.concat(r4)
            goto L_0x00ff
        L_0x00fa:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r8)
        L_0x00ff:
            java.lang.Object r3 = r0.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L_0x0134
            java.lang.Class r8 = r3.getReturnType()
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0134
            java.lang.Class<java.lang.Deprecated> r8 = java.lang.Deprecated.class
            boolean r8 = r3.isAnnotationPresent(r8)
            if (r8 != 0) goto L_0x0134
            int r8 = r3.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isPublic(r8)
            if (r8 == 0) goto L_0x0134
            java.lang.String r4 = a(r4)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Object r3 = com.google.android.gms.internal.vision.q1.k(r13, r3, r6)
            c(r14, r15, r4, r3)
            goto L_0x004d
        L_0x0134:
            int r3 = r6.length()
            java.lang.String r4 = "set"
            if (r3 == 0) goto L_0x0141
            java.lang.String r3 = r4.concat(r6)
            goto L_0x0146
        L_0x0141:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r4)
        L_0x0146:
            java.lang.Object r3 = r1.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L_0x004d
            java.lang.String r3 = "Bytes"
            boolean r3 = r6.endsWith(r3)
            if (r3 == 0) goto L_0x017a
            int r3 = r6.length()
            int r3 = r3 + -5
            java.lang.String r3 = r6.substring(r5, r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x016f
            java.lang.String r3 = r7.concat(r3)
            goto L_0x0174
        L_0x016f:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r7)
        L_0x0174:
            boolean r3 = r0.containsKey(r3)
            if (r3 != 0) goto L_0x004d
        L_0x017a:
            java.lang.String r3 = r6.substring(r5, r10)
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = r6.substring(r10)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r8 = r4.length()
            if (r8 == 0) goto L_0x0199
            java.lang.String r3 = r3.concat(r4)
            goto L_0x019f
        L_0x0199:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r3 = r4
        L_0x019f:
            int r4 = r6.length()
            if (r4 == 0) goto L_0x01aa
            java.lang.String r4 = r7.concat(r6)
            goto L_0x01af
        L_0x01aa:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r7)
        L_0x01af:
            java.lang.Object r4 = r0.get(r4)
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            int r8 = r6.length()
            java.lang.String r9 = "has"
            if (r8 == 0) goto L_0x01c2
            java.lang.String r6 = r9.concat(r6)
            goto L_0x01c7
        L_0x01c2:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r9)
        L_0x01c7:
            java.lang.Object r6 = r0.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r4 == 0) goto L_0x004d
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r4 = com.google.android.gms.internal.vision.q1.k(r13, r4, r8)
            if (r6 != 0) goto L_0x024b
            boolean r6 = r4 instanceof java.lang.Boolean
            if (r6 == 0) goto L_0x01e5
            r6 = r4
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x0245
            goto L_0x0243
        L_0x01e5:
            boolean r6 = r4 instanceof java.lang.Integer
            if (r6 == 0) goto L_0x01f3
            r6 = r4
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 != 0) goto L_0x0245
            goto L_0x0243
        L_0x01f3:
            boolean r6 = r4 instanceof java.lang.Float
            if (r6 == 0) goto L_0x0204
            r6 = r4
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x0245
            goto L_0x0243
        L_0x0204:
            boolean r6 = r4 instanceof java.lang.Double
            if (r6 == 0) goto L_0x0216
            r6 = r4
            java.lang.Double r6 = (java.lang.Double) r6
            double r8 = r6.doubleValue()
            r11 = 0
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x0245
            goto L_0x0243
        L_0x0216:
            boolean r6 = r4 instanceof java.lang.String
            if (r6 == 0) goto L_0x021d
            java.lang.String r6 = ""
            goto L_0x0223
        L_0x021d:
            boolean r6 = r4 instanceof com.google.android.gms.internal.vision.w0
            if (r6 == 0) goto L_0x0228
            com.google.android.gms.internal.vision.z0 r6 = com.google.android.gms.internal.vision.w0.f3182p
        L_0x0223:
            boolean r6 = r4.equals(r6)
            goto L_0x0246
        L_0x0228:
            boolean r6 = r4 instanceof com.google.android.gms.internal.vision.w2
            if (r6 == 0) goto L_0x0236
            r6 = r4
            com.google.android.gms.internal.vision.w2 r6 = (com.google.android.gms.internal.vision.w2) r6
            com.google.android.gms.internal.vision.q1 r6 = r6.h()
            if (r4 != r6) goto L_0x0245
            goto L_0x0243
        L_0x0236:
            boolean r6 = r4 instanceof java.lang.Enum
            if (r6 == 0) goto L_0x0245
            r6 = r4
            java.lang.Enum r6 = (java.lang.Enum) r6
            int r6 = r6.ordinal()
            if (r6 != 0) goto L_0x0245
        L_0x0243:
            r6 = r10
            goto L_0x0246
        L_0x0245:
            r6 = r5
        L_0x0246:
            if (r6 != 0) goto L_0x0249
            goto L_0x0257
        L_0x0249:
            r10 = r5
            goto L_0x0257
        L_0x024b:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r6 = com.google.android.gms.internal.vision.q1.k(r13, r6, r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r10 = r6.booleanValue()
        L_0x0257:
            if (r10 == 0) goto L_0x004d
            java.lang.String r3 = a(r3)
        L_0x025d:
            c(r14, r15, r3, r4)
            goto L_0x004d
        L_0x0262:
            boolean r0 = r13 instanceof com.google.android.gms.internal.vision.q1.c
            if (r0 == 0) goto L_0x029c
            r0 = r13
            com.google.android.gms.internal.vision.q1$c r0 = (com.google.android.gms.internal.vision.q1.c) r0
            com.google.android.gms.internal.vision.j1<com.google.android.gms.internal.vision.q1$e> r0 = r0.zzc
            java.util.Iterator r0 = r0.i()
        L_0x026f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x029c
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.vision.q1$e r2 = (com.google.android.gms.internal.vision.q1.e) r2
            r2.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 13
            r2.<init>(r3)
            java.lang.String r3 = "[0]"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object r1 = r1.getValue()
            c(r14, r15, r2, r1)
            goto L_0x026f
        L_0x029c:
            com.google.android.gms.internal.vision.q1 r13 = (com.google.android.gms.internal.vision.q1) r13
            com.google.android.gms.internal.vision.y3 r13 = r13.zzb
            if (r13 == 0) goto L_0x02b9
        L_0x02a2:
            int r0 = r13.f3190a
            if (r5 >= r0) goto L_0x02b9
            int[] r0 = r13.f3191b
            r0 = r0[r5]
            int r0 = r0 >>> r4
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object[] r1 = r13.f3192c
            r1 = r1[r5]
            c(r14, r15, r0, r1)
            int r5 = r5 + 1
            goto L_0x02a2
        L_0x02b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.b3.b(com.google.android.gms.internal.vision.w2, java.lang.StringBuilder, int):void");
    }

    public static final void c(StringBuilder sb, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object c10 : (List) obj) {
                c(sb, i10, str, c10);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry c11 : ((Map) obj).entrySet()) {
                c(sb, i10, str, c11);
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
                z0 z0Var = w0.f3182p;
                sb.append(a.Y(new z0(((String) obj).getBytes(u1.f3170a))));
                sb.append('\"');
            } else if (obj instanceof w0) {
                sb.append(": \"");
                sb.append(a.Y((w0) obj));
                sb.append('\"');
            } else if (obj instanceof q1) {
                sb.append(" {");
                b((q1) obj, sb, i10 + 2);
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
                c(sb, i13, "key", entry.getKey());
                c(sb, i13, "value", entry.getValue());
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
}

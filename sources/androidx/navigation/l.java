package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.databinding.a;
import androidx.navigation.a;
import java.util.ArrayList;
import java.util.HashMap;
import n.e;
import n.j;
import org.xmlpull.v1.XmlPullParserException;

public final class l {

    /* renamed from: c  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f1510c = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final Context f1511a;

    /* renamed from: b  reason: collision with root package name */
    public final q f1512b;

    public l(Context context, q qVar) {
        this.f1511a = context;
        this.f1512b = qVar;
    }

    public static n a(TypedValue typedValue, n nVar, n nVar2, String str, String str2) {
        if (nVar == null || nVar == nVar2) {
            return nVar != null ? nVar : nVar2;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: androidx.navigation.n$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: androidx.navigation.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: androidx.navigation.n$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: androidx.navigation.n$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: androidx.navigation.n$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: androidx.navigation.n$j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: androidx.navigation.n$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: androidx.navigation.n$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: androidx.navigation.n$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: androidx.navigation.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: androidx.navigation.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: androidx.navigation.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v4, resolved type: androidx.navigation.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v5, resolved type: androidx.navigation.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v6, resolved type: androidx.navigation.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v7, resolved type: androidx.navigation.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v8, resolved type: androidx.navigation.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v9, resolved type: androidx.navigation.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v10, resolved type: androidx.navigation.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v11, resolved type: androidx.navigation.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v12, resolved type: androidx.navigation.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v13, resolved type: androidx.navigation.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v14, resolved type: androidx.navigation.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v41, resolved type: androidx.navigation.n$c} */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:133|134|135) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:136|137|138) */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        r15.c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x029e, code lost:
        r3 = r15;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r14.c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02a3, code lost:
        r3 = r14;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02a5, code lost:
        r3 = r13;
        r4 = r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:133:0x029b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:136:0x02a0 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.navigation.c d(android.content.res.TypedArray r27, android.content.res.Resources r28, int r29) {
        /*
            r0 = r27
            r1 = 3
            r2 = 0
            boolean r3 = r0.getBoolean(r1, r2)
            java.lang.ThreadLocal<android.util.TypedValue> r4 = f1510c
            java.lang.Object r5 = r4.get()
            android.util.TypedValue r5 = (android.util.TypedValue) r5
            if (r5 != 0) goto L_0x001a
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            r4.set(r5)
        L_0x001a:
            r4 = 2
            java.lang.String r4 = r0.getString(r4)
            androidx.navigation.n$d r6 = androidx.navigation.n.f1520c
            androidx.navigation.n$i r7 = androidx.navigation.n.f1524h
            androidx.navigation.n$b r8 = androidx.navigation.n.l
            androidx.navigation.n$k r9 = androidx.navigation.n.f1526j
            androidx.navigation.n$g r10 = androidx.navigation.n.f1522f
            androidx.navigation.n$e r11 = androidx.navigation.n.d
            androidx.navigation.n$f r12 = androidx.navigation.n.f1521e
            androidx.navigation.n$a r13 = androidx.navigation.n.f1527k
            androidx.navigation.n$j r14 = androidx.navigation.n.f1525i
            androidx.navigation.n$h r15 = androidx.navigation.n.f1523g
            androidx.navigation.n$c r1 = androidx.navigation.n.f1519b
            java.lang.Class<android.os.Parcelable> r2 = android.os.Parcelable.class
            r17 = r7
            java.lang.Class<java.io.Serializable> r7 = java.io.Serializable.class
            r18 = r8
            java.lang.String r8 = "boolean"
            r19 = r9
            java.lang.String r9 = "integer"
            r20 = r10
            java.lang.String r10 = "float"
            r21 = 0
            if (r4 == 0) goto L_0x0175
            r22 = r11
            java.lang.String r11 = r28.getResourcePackageName(r29)
            boolean r23 = r9.equals(r4)
            if (r23 == 0) goto L_0x005e
            r23 = r3
            r24 = r12
            r3 = r1
            goto L_0x017d
        L_0x005e:
            r23 = r3
            java.lang.String r3 = "integer[]"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x006e
            r24 = r12
            r3 = r22
            goto L_0x017d
        L_0x006e:
            java.lang.String r3 = "long"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x007b
            r3 = r12
            r24 = r3
            goto L_0x017d
        L_0x007b:
            java.lang.String r3 = "long[]"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0089
            r24 = r12
            r3 = r20
            goto L_0x017d
        L_0x0089:
            boolean r3 = r8.equals(r4)
            if (r3 == 0) goto L_0x0094
            r24 = r12
            r3 = r14
            goto L_0x017d
        L_0x0094:
            java.lang.String r3 = "boolean[]"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00a2
            r24 = r12
            r3 = r19
            goto L_0x017d
        L_0x00a2:
            java.lang.String r3 = "string"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00ae
        L_0x00aa:
            r24 = r12
            goto L_0x0173
        L_0x00ae:
            java.lang.String r3 = "string[]"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00bc
            r24 = r12
            r3 = r18
            goto L_0x017d
        L_0x00bc:
            boolean r3 = r10.equals(r4)
            if (r3 == 0) goto L_0x00c7
            r24 = r12
            r3 = r15
            goto L_0x017d
        L_0x00c7:
            java.lang.String r3 = "float[]"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00d5
            r24 = r12
            r3 = r17
            goto L_0x017d
        L_0x00d5:
            java.lang.String r3 = "reference"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00e2
            r3 = r6
            r24 = r12
            goto L_0x017d
        L_0x00e2:
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x00aa
            java.lang.String r3 = "."
            boolean r3 = r4.startsWith(r3)     // Catch:{ ClassNotFoundException -> 0x016c }
            if (r3 == 0) goto L_0x00f7
            if (r11 == 0) goto L_0x00f7
            java.lang.String r3 = r11.concat(r4)     // Catch:{ ClassNotFoundException -> 0x016c }
            goto L_0x00f8
        L_0x00f7:
            r3 = r4
        L_0x00f8:
            java.lang.String r11 = "[]"
            boolean r11 = r4.endsWith(r11)     // Catch:{ ClassNotFoundException -> 0x016c }
            if (r11 == 0) goto L_0x0129
            int r11 = r3.length()     // Catch:{ ClassNotFoundException -> 0x016c }
            int r11 = r11 + -2
            r24 = r12
            r12 = 0
            java.lang.String r3 = r3.substring(r12, r11)     // Catch:{ ClassNotFoundException -> 0x016c }
            java.lang.Class r11 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x016c }
            boolean r12 = r2.isAssignableFrom(r11)     // Catch:{ ClassNotFoundException -> 0x016c }
            if (r12 == 0) goto L_0x011d
            androidx.navigation.n$m r3 = new androidx.navigation.n$m     // Catch:{ ClassNotFoundException -> 0x016c }
            r3.<init>(r11)     // Catch:{ ClassNotFoundException -> 0x016c }
            goto L_0x017d
        L_0x011d:
            boolean r12 = r7.isAssignableFrom(r11)     // Catch:{ ClassNotFoundException -> 0x016c }
            if (r12 == 0) goto L_0x0155
            androidx.navigation.n$o r3 = new androidx.navigation.n$o     // Catch:{ ClassNotFoundException -> 0x016c }
            r3.<init>(r11)     // Catch:{ ClassNotFoundException -> 0x016c }
            goto L_0x017d
        L_0x0129:
            r24 = r12
            java.lang.Class r11 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x016c }
            boolean r12 = r2.isAssignableFrom(r11)     // Catch:{ ClassNotFoundException -> 0x016c }
            if (r12 == 0) goto L_0x013b
            androidx.navigation.n$n r3 = new androidx.navigation.n$n     // Catch:{ ClassNotFoundException -> 0x016c }
            r3.<init>(r11)     // Catch:{ ClassNotFoundException -> 0x016c }
            goto L_0x017d
        L_0x013b:
            java.lang.Class<java.lang.Enum> r12 = java.lang.Enum.class
            boolean r12 = r12.isAssignableFrom(r11)     // Catch:{ ClassNotFoundException -> 0x016c }
            if (r12 == 0) goto L_0x0149
            androidx.navigation.n$l r3 = new androidx.navigation.n$l     // Catch:{ ClassNotFoundException -> 0x016c }
            r3.<init>(r11)     // Catch:{ ClassNotFoundException -> 0x016c }
            goto L_0x017d
        L_0x0149:
            boolean r12 = r7.isAssignableFrom(r11)     // Catch:{ ClassNotFoundException -> 0x016c }
            if (r12 == 0) goto L_0x0155
            androidx.navigation.n$p r3 = new androidx.navigation.n$p     // Catch:{ ClassNotFoundException -> 0x016c }
            r3.<init>(r11)     // Catch:{ ClassNotFoundException -> 0x016c }
            goto L_0x017d
        L_0x0155:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ ClassNotFoundException -> 0x016c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x016c }
            r1.<init>()     // Catch:{ ClassNotFoundException -> 0x016c }
            r1.append(r3)     // Catch:{ ClassNotFoundException -> 0x016c }
            java.lang.String r2 = " is not Serializable or Parcelable."
            r1.append(r2)     // Catch:{ ClassNotFoundException -> 0x016c }
            java.lang.String r1 = r1.toString()     // Catch:{ ClassNotFoundException -> 0x016c }
            r0.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x016c }
            throw r0     // Catch:{ ClassNotFoundException -> 0x016c }
        L_0x016c:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0173:
            r3 = r13
            goto L_0x017d
        L_0x0175:
            r23 = r3
            r22 = r11
            r24 = r12
            r3 = r21
        L_0x017d:
            r12 = 1
            boolean r11 = r0.getValue(r12, r5)
            if (r11 == 0) goto L_0x02ae
            java.lang.String r11 = "' for "
            java.lang.String r12 = "unsupported value '"
            if (r3 != r6) goto L_0x01ce
            int r0 = r5.resourceId
            if (r0 == 0) goto L_0x0199
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = r24
            r6 = 1
            r16 = 0
            goto L_0x02b5
        L_0x0199:
            int r0 = r5.type
            r4 = 16
            if (r0 != r4) goto L_0x01ab
            int r0 = r5.data
            if (r0 != 0) goto L_0x01ab
            r16 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r6 = r3
            goto L_0x01de
        L_0x01ab:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r12)
            java.lang.CharSequence r2 = r5.string
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = r3.b()
            r1.append(r2)
            java.lang.String r2 = ". Must be a reference to a resource."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01ce:
            r25 = r6
            r16 = 0
            int r6 = r5.resourceId
            if (r6 == 0) goto L_0x0207
            if (r3 != 0) goto L_0x01e4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r6 = r25
        L_0x01de:
            r3 = r6
            r4 = r24
            r6 = 1
            goto L_0x02b5
        L_0x01e4:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r12)
            java.lang.CharSequence r2 = r5.string
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = r3.b()
            r1.append(r2)
            java.lang.String r2 = ". You must use a \"reference\" type to reference other resources."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0207:
            r6 = 1
            if (r3 != r13) goto L_0x0210
            java.lang.String r0 = r0.getString(r6)
            goto L_0x0284
        L_0x0210:
            int r0 = r5.type
            r11 = 3
            if (r0 == r11) goto L_0x0287
            r11 = 4
            if (r0 == r11) goto L_0x0273
            r11 = 5
            if (r0 == r11) goto L_0x025f
            r11 = 18
            if (r0 == r11) goto L_0x024e
            r11 = 16
            if (r0 < r11) goto L_0x0238
            r8 = 31
            if (r0 > r8) goto L_0x0238
            if (r3 != r15) goto L_0x0231
            androidx.navigation.n r0 = a(r5, r3, r15, r4, r10)
            int r3 = r5.data
            float r3 = (float) r3
            goto L_0x027b
        L_0x0231:
            androidx.navigation.n r0 = a(r5, r3, r1, r4, r9)
            int r3 = r5.data
            goto L_0x026e
        L_0x0238:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "unsupported argument type "
            r1.<init>(r2)
            int r2 = r5.type
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x024e:
            androidx.navigation.n r0 = a(r5, r3, r14, r4, r8)
            int r3 = r5.data
            if (r3 == 0) goto L_0x0258
            r12 = r6
            goto L_0x025a
        L_0x0258:
            r12 = r16
        L_0x025a:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r12)
            goto L_0x027f
        L_0x025f:
            java.lang.String r0 = "dimension"
            androidx.navigation.n r0 = a(r5, r3, r1, r4, r0)
            android.util.DisplayMetrics r3 = r28.getDisplayMetrics()
            float r3 = r5.getDimension(r3)
            int r3 = (int) r3
        L_0x026e:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x027f
        L_0x0273:
            androidx.navigation.n r0 = a(r5, r3, r15, r4, r10)
            float r3 = r5.getFloat()
        L_0x027b:
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
        L_0x027f:
            r26 = r3
            r3 = r0
            r0 = r26
        L_0x0284:
            r4 = r24
            goto L_0x02b5
        L_0x0287:
            java.lang.CharSequence r0 = r5.string
            java.lang.String r0 = r0.toString()
            if (r3 != 0) goto L_0x02a7
            r1.c(r0)     // Catch:{ IllegalArgumentException -> 0x0294 }
            r3 = r1
            goto L_0x02a7
        L_0x0294:
            r4 = r24
            r4.c(r0)     // Catch:{ IllegalArgumentException -> 0x029b }
            r3 = r4
            goto L_0x02a9
        L_0x029b:
            r15.c(r0)     // Catch:{ IllegalArgumentException -> 0x02a0 }
            r3 = r15
            goto L_0x02a9
        L_0x02a0:
            r14.c(r0)     // Catch:{ IllegalArgumentException -> 0x02a5 }
            r3 = r14
            goto L_0x02a9
        L_0x02a5:
            r3 = r13
            goto L_0x02a9
        L_0x02a7:
            r4 = r24
        L_0x02a9:
            java.lang.Object r0 = r3.c(r0)
            goto L_0x02b5
        L_0x02ae:
            r6 = r12
            r4 = r24
            r16 = 0
            r0 = r21
        L_0x02b5:
            if (r0 == 0) goto L_0x02b8
            goto L_0x02bc
        L_0x02b8:
            r6 = r16
            r0 = r21
        L_0x02bc:
            if (r3 == 0) goto L_0x02c0
            r21 = r3
        L_0x02c0:
            if (r21 != 0) goto L_0x03ab
            boolean r3 = r0 instanceof java.lang.Integer
            if (r3 == 0) goto L_0x02c9
        L_0x02c6:
            r7 = r1
            goto L_0x03ad
        L_0x02c9:
            boolean r1 = r0 instanceof int[]
            if (r1 == 0) goto L_0x02d1
            r7 = r22
            goto L_0x03ad
        L_0x02d1:
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 == 0) goto L_0x02d8
            r7 = r4
            goto L_0x03ad
        L_0x02d8:
            boolean r1 = r0 instanceof long[]
            if (r1 == 0) goto L_0x02e0
            r7 = r20
            goto L_0x03ad
        L_0x02e0:
            boolean r1 = r0 instanceof java.lang.Float
            if (r1 == 0) goto L_0x02e7
            r7 = r15
            goto L_0x03ad
        L_0x02e7:
            boolean r1 = r0 instanceof float[]
            if (r1 == 0) goto L_0x02ef
            r7 = r17
            goto L_0x03ad
        L_0x02ef:
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L_0x02f6
            r7 = r14
            goto L_0x03ad
        L_0x02f6:
            boolean r1 = r0 instanceof boolean[]
            if (r1 == 0) goto L_0x02fe
            r7 = r19
            goto L_0x03ad
        L_0x02fe:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L_0x03a9
            if (r0 != 0) goto L_0x0306
            goto L_0x03a9
        L_0x0306:
            boolean r1 = r0 instanceof java.lang.String[]
            if (r1 == 0) goto L_0x030e
            r7 = r18
            goto L_0x03ad
        L_0x030e:
            java.lang.Class r1 = r0.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto L_0x0334
            java.lang.Class r1 = r0.getClass()
            java.lang.Class r1 = r1.getComponentType()
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x0334
            androidx.navigation.n$m r1 = new androidx.navigation.n$m
            java.lang.Class r2 = r0.getClass()
            java.lang.Class r2 = r2.getComponentType()
            r1.<init>(r2)
            goto L_0x02c6
        L_0x0334:
            java.lang.Class r1 = r0.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto L_0x035b
            java.lang.Class r1 = r0.getClass()
            java.lang.Class r1 = r1.getComponentType()
            boolean r1 = r7.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x035b
            androidx.navigation.n$o r1 = new androidx.navigation.n$o
            java.lang.Class r2 = r0.getClass()
            java.lang.Class r2 = r2.getComponentType()
            r1.<init>(r2)
            goto L_0x02c6
        L_0x035b:
            boolean r1 = r0 instanceof android.os.Parcelable
            if (r1 == 0) goto L_0x036a
            androidx.navigation.n$n r1 = new androidx.navigation.n$n
            java.lang.Class r2 = r0.getClass()
            r1.<init>(r2)
            goto L_0x02c6
        L_0x036a:
            boolean r1 = r0 instanceof java.lang.Enum
            if (r1 == 0) goto L_0x0379
            androidx.navigation.n$l r1 = new androidx.navigation.n$l
            java.lang.Class r2 = r0.getClass()
            r1.<init>(r2)
            goto L_0x02c6
        L_0x0379:
            boolean r1 = r0 instanceof java.io.Serializable
            if (r1 == 0) goto L_0x0388
            androidx.navigation.n$p r1 = new androidx.navigation.n$p
            java.lang.Class r2 = r0.getClass()
            r1.<init>(r2)
            goto L_0x02c6
        L_0x0388:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Object of type "
            r2.<init>(r3)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r2.append(r0)
            java.lang.String r0 = " is not supported for navigation arguments."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x03a9:
            r7 = r13
            goto L_0x03ad
        L_0x03ab:
            r7 = r21
        L_0x03ad:
            androidx.navigation.c r1 = new androidx.navigation.c
            r2 = r23
            r1.<init>(r7, r2, r0, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.l.d(android.content.res.TypedArray, android.content.res.Resources, int):androidx.navigation.c");
    }

    public final h b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i10) {
        int depth;
        int i11;
        Context context;
        int i12;
        int depth2;
        String str;
        String str2;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        h a10 = this.f1512b.c(xmlResourceParser.getName()).a();
        Context context2 = this.f1511a;
        a10.k(context2, attributeSet2);
        int i13 = 1;
        int depth3 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i13 || ((depth = xmlResourceParser.getDepth()) < depth3 && next == 3)) {
                return a10;
            }
            if (next == 2 && depth <= depth3) {
                String name = xmlResourceParser.getName();
                boolean equals = "argument".equals(name);
                int[] iArr = e.C;
                if (equals) {
                    TypedArray obtainAttributes = resources2.obtainAttributes(attributeSet2, iArr);
                    String string = obtainAttributes.getString(0);
                    if (string != null) {
                        c d = d(obtainAttributes, resources2, i10);
                        if (a10.f1498v == null) {
                            a10.f1498v = new HashMap<>();
                        }
                        a10.f1498v.put(string, d);
                        obtainAttributes.recycle();
                    } else {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                } else {
                    int i14 = i10;
                    if ("deepLink".equals(name)) {
                        TypedArray obtainAttributes2 = resources2.obtainAttributes(attributeSet2, e.D);
                        String string2 = obtainAttributes2.getString(3);
                        String string3 = obtainAttributes2.getString(i13);
                        String string4 = obtainAttributes2.getString(2);
                        if (!TextUtils.isEmpty(string2) || !TextUtils.isEmpty(string3) || !TextUtils.isEmpty(string4)) {
                            String str3 = null;
                            if (string2 != null) {
                                str = string2.replace("${applicationId}", context2.getPackageName());
                            } else {
                                str = null;
                            }
                            if (!TextUtils.isEmpty(string3)) {
                                str2 = string3.replace("${applicationId}", context2.getPackageName());
                                if (str2.isEmpty()) {
                                    throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
                                }
                            } else {
                                str2 = null;
                            }
                            if (string4 != null) {
                                str3 = string4.replace("${applicationId}", context2.getPackageName());
                            }
                            g gVar = new g(str, str2, str3);
                            if (a10.f1497t == null) {
                                a10.f1497t = new ArrayList<>();
                            }
                            a10.f1497t.add(gVar);
                            obtainAttributes2.recycle();
                        } else {
                            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                        }
                    } else {
                        if ("action".equals(name)) {
                            TypedArray obtainAttributes3 = resources2.obtainAttributes(attributeSet2, e.B);
                            int resourceId = obtainAttributes3.getResourceId(0, 0);
                            obtainAttributes3.getResourceId(i13, 0);
                            a aVar = new a();
                            obtainAttributes3.getBoolean(4, false);
                            obtainAttributes3.getResourceId(7, -1);
                            obtainAttributes3.getBoolean(8, false);
                            obtainAttributes3.getResourceId(2, -1);
                            obtainAttributes3.getResourceId(3, -1);
                            obtainAttributes3.getResourceId(5, -1);
                            obtainAttributes3.getResourceId(6, -1);
                            Bundle bundle = new Bundle();
                            int i15 = 1;
                            int depth4 = xmlResourceParser.getDepth() + 1;
                            context = context2;
                            i11 = depth3;
                            int i16 = i14;
                            while (true) {
                                int next2 = xmlResourceParser.next();
                                if (next2 == i15 || ((depth2 = xmlResourceParser.getDepth()) < depth4 && next2 == 3)) {
                                    bundle.isEmpty();
                                    i12 = 1;
                                } else {
                                    if (next2 == 2 && depth2 <= depth4) {
                                        if ("argument".equals(xmlResourceParser.getName())) {
                                            TypedArray obtainAttributes4 = resources2.obtainAttributes(attributeSet2, iArr);
                                            String string5 = obtainAttributes4.getString(0);
                                            if (string5 != null) {
                                                c d10 = d(obtainAttributes4, resources2, i16);
                                                boolean z = d10.f1454c;
                                                if (z && z) {
                                                    d10.f1452a.d(bundle, string5, d10.d);
                                                }
                                                obtainAttributes4.recycle();
                                            } else {
                                                throw new XmlPullParserException("Arguments must have a name");
                                            }
                                        }
                                        i16 = i10;
                                    }
                                    int i17 = i10;
                                    i15 = 1;
                                }
                            }
                            bundle.isEmpty();
                            i12 = 1;
                            if (!(!(a10 instanceof a.C0016a))) {
                                throw new UnsupportedOperationException("Cannot add action " + resourceId + " to " + a10 + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                            } else if (resourceId != 0) {
                                if (a10.u == null) {
                                    a10.u = new j<>();
                                }
                                a10.u.i(resourceId, aVar);
                                obtainAttributes3.recycle();
                            } else {
                                throw new IllegalArgumentException("Cannot have an action with actionId 0");
                            }
                        } else {
                            context = context2;
                            i11 = depth3;
                            i12 = i13;
                            if ("include".equals(name) && (a10 instanceof i)) {
                                TypedArray obtainAttributes5 = resources2.obtainAttributes(attributeSet2, androidx.databinding.a.f1016q);
                                ((i) a10).m(c(obtainAttributes5.getResourceId(0, 0)));
                                obtainAttributes5.recycle();
                            } else if (a10 instanceof i) {
                                ((i) a10).m(b(resources, xmlResourceParser, attributeSet, i10));
                            }
                        }
                        i13 = i12;
                        context2 = context;
                        depth3 = i11;
                    }
                }
                context = context2;
                i11 = depth3;
                i12 = i13;
                i13 = i12;
                context2 = context;
                depth3 = i11;
            }
        }
        return a10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049 A[Catch:{ Exception -> 0x0053, all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b A[Catch:{ Exception -> 0x0053, all -> 0x0051 }] */
    @android.annotation.SuppressLint({"ResourceType"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.navigation.i c(int r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f1511a
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.XmlResourceParser r1 = r0.getXml(r7)
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r1)
        L_0x000e:
            int r3 = r1.next()     // Catch:{ Exception -> 0x0053 }
            r4 = 2
            if (r3 == r4) goto L_0x0019
            r5 = 1
            if (r3 == r5) goto L_0x0019
            goto L_0x000e
        L_0x0019:
            if (r3 != r4) goto L_0x0049
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x0053 }
            androidx.navigation.h r2 = r6.b(r0, r1, r2, r7)     // Catch:{ Exception -> 0x0053 }
            boolean r4 = r2 instanceof androidx.navigation.i     // Catch:{ Exception -> 0x0053 }
            if (r4 == 0) goto L_0x002d
            androidx.navigation.i r2 = (androidx.navigation.i) r2     // Catch:{ Exception -> 0x0053 }
            r1.close()
            return r2
        L_0x002d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0053 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0053 }
            r4.<init>()     // Catch:{ Exception -> 0x0053 }
            java.lang.String r5 = "Root element <"
            r4.append(r5)     // Catch:{ Exception -> 0x0053 }
            r4.append(r3)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = "> did not inflate into a NavGraph"
            r4.append(r3)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0053 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0053 }
            throw r2     // Catch:{ Exception -> 0x0053 }
        L_0x0049:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = "No start tag found"
            r2.<init>(r3)     // Catch:{ Exception -> 0x0053 }
            throw r2     // Catch:{ Exception -> 0x0053 }
        L_0x0051:
            r7 = move-exception
            goto L_0x007b
        L_0x0053:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x0051 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r4.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r5 = "Exception inflating "
            r4.append(r5)     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = r0.getResourceName(r7)     // Catch:{ all -> 0x0051 }
            r4.append(r7)     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = " line "
            r4.append(r7)     // Catch:{ all -> 0x0051 }
            int r7 = r1.getLineNumber()     // Catch:{ all -> 0x0051 }
            r4.append(r7)     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0051 }
            r3.<init>(r7, r2)     // Catch:{ all -> 0x0051 }
            throw r3     // Catch:{ all -> 0x0051 }
        L_0x007b:
            r1.close()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.l.c(int):androidx.navigation.i");
    }
}

package t8;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9033a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: t8.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r0 != 0) goto L_0x000b
            goto L_0x0043
        L_0x000b:
            r2 = 6
            r3 = 46
            r4 = 0
            int r2 = f9.l.g0(r0, r3, r4, r4, r2)
            if (r2 >= 0) goto L_0x001b
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0043 }
            int r0 = r0 * r1
            goto L_0x0046
        L_0x001b:
            int r5 = r2 + 1
            r6 = 4
            int r3 = f9.l.g0(r0, r3, r5, r4, r6)
            if (r3 >= 0) goto L_0x0028
            int r3 = r0.length()
        L_0x0028:
            java.lang.String r2 = r0.substring(r4, r2)
            java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
            z8.g.e(r2, r4)
            java.lang.String r0 = r0.substring(r5, r3)
            z8.g.e(r0, r4)
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0043 }
            int r2 = r2 * r1
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0043 }
            int r0 = r0 + r2
            goto L_0x0046
        L_0x0043:
            r0 = 65542(0x10006, float:9.1844E-41)
        L_0x0046:
            r2 = 65544(0x10008, float:9.1847E-41)
            java.lang.String r3 = ", base type classloader: "
            java.lang.Class<t8.a> r4 = t8.a.class
            java.lang.String r5 = "forName(\"kotlin.internal…entations\").newInstance()"
            java.lang.String r6 = "Instance class was loaded from a different classloader: "
            if (r0 >= r2) goto L_0x0055
            if (r0 >= r1) goto L_0x00cb
        L_0x0055:
            java.lang.Class<v8.a> r2 = v8.a.class
            java.lang.Object r2 = r2.newInstance()     // Catch:{ ClassNotFoundException -> 0x008e }
            z8.g.e(r2, r5)     // Catch:{ ClassNotFoundException -> 0x008e }
            t8.a r2 = (t8.a) r2     // Catch:{ ClassCastException -> 0x0062 }
            goto L_0x014d
        L_0x0062:
            r7 = move-exception
            java.lang.Class r2 = r2.getClass()     // Catch:{ ClassNotFoundException -> 0x008e }
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x008e }
            java.lang.ClassLoader r8 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x008e }
            boolean r9 = z8.g.a(r2, r8)     // Catch:{ ClassNotFoundException -> 0x008e }
            if (r9 != 0) goto L_0x008d
            java.lang.ClassNotFoundException r9 = new java.lang.ClassNotFoundException     // Catch:{ ClassNotFoundException -> 0x008e }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x008e }
            r10.<init>(r6)     // Catch:{ ClassNotFoundException -> 0x008e }
            r10.append(r2)     // Catch:{ ClassNotFoundException -> 0x008e }
            r10.append(r3)     // Catch:{ ClassNotFoundException -> 0x008e }
            r10.append(r8)     // Catch:{ ClassNotFoundException -> 0x008e }
            java.lang.String r2 = r10.toString()     // Catch:{ ClassNotFoundException -> 0x008e }
            r9.<init>(r2, r7)     // Catch:{ ClassNotFoundException -> 0x008e }
            throw r9     // Catch:{ ClassNotFoundException -> 0x008e }
        L_0x008d:
            throw r7     // Catch:{ ClassNotFoundException -> 0x008e }
        L_0x008e:
            java.lang.String r2 = "kotlin.internal.JRE8PlatformImplementations"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x00cb }
            java.lang.Object r2 = r2.newInstance()     // Catch:{ ClassNotFoundException -> 0x00cb }
            z8.g.e(r2, r5)     // Catch:{ ClassNotFoundException -> 0x00cb }
            t8.a r2 = (t8.a) r2     // Catch:{ ClassCastException -> 0x009f }
            goto L_0x014d
        L_0x009f:
            r7 = move-exception
            java.lang.Class r2 = r2.getClass()     // Catch:{ ClassNotFoundException -> 0x00cb }
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00cb }
            java.lang.ClassLoader r8 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00cb }
            boolean r9 = z8.g.a(r2, r8)     // Catch:{ ClassNotFoundException -> 0x00cb }
            if (r9 != 0) goto L_0x00ca
            java.lang.ClassNotFoundException r9 = new java.lang.ClassNotFoundException     // Catch:{ ClassNotFoundException -> 0x00cb }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x00cb }
            r10.<init>(r6)     // Catch:{ ClassNotFoundException -> 0x00cb }
            r10.append(r2)     // Catch:{ ClassNotFoundException -> 0x00cb }
            r10.append(r3)     // Catch:{ ClassNotFoundException -> 0x00cb }
            r10.append(r8)     // Catch:{ ClassNotFoundException -> 0x00cb }
            java.lang.String r2 = r10.toString()     // Catch:{ ClassNotFoundException -> 0x00cb }
            r9.<init>(r2, r7)     // Catch:{ ClassNotFoundException -> 0x00cb }
            throw r9     // Catch:{ ClassNotFoundException -> 0x00cb }
        L_0x00ca:
            throw r7     // Catch:{ ClassNotFoundException -> 0x00cb }
        L_0x00cb:
            r2 = 65543(0x10007, float:9.1845E-41)
            if (r0 >= r2) goto L_0x00d2
            if (r0 >= r1) goto L_0x0148
        L_0x00d2:
            java.lang.Class<u8.a> r0 = u8.a.class
            java.lang.Object r0 = r0.newInstance()     // Catch:{ ClassNotFoundException -> 0x010b }
            z8.g.e(r0, r5)     // Catch:{ ClassNotFoundException -> 0x010b }
            r2 = r0
            t8.a r2 = (t8.a) r2     // Catch:{ ClassCastException -> 0x00df }
            goto L_0x014d
        L_0x00df:
            r1 = move-exception
            java.lang.Class r0 = r0.getClass()     // Catch:{ ClassNotFoundException -> 0x010b }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x010b }
            java.lang.ClassLoader r2 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x010b }
            boolean r7 = z8.g.a(r0, r2)     // Catch:{ ClassNotFoundException -> 0x010b }
            if (r7 != 0) goto L_0x010a
            java.lang.ClassNotFoundException r7 = new java.lang.ClassNotFoundException     // Catch:{ ClassNotFoundException -> 0x010b }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x010b }
            r8.<init>(r6)     // Catch:{ ClassNotFoundException -> 0x010b }
            r8.append(r0)     // Catch:{ ClassNotFoundException -> 0x010b }
            r8.append(r3)     // Catch:{ ClassNotFoundException -> 0x010b }
            r8.append(r2)     // Catch:{ ClassNotFoundException -> 0x010b }
            java.lang.String r0 = r8.toString()     // Catch:{ ClassNotFoundException -> 0x010b }
            r7.<init>(r0, r1)     // Catch:{ ClassNotFoundException -> 0x010b }
            throw r7     // Catch:{ ClassNotFoundException -> 0x010b }
        L_0x010a:
            throw r1     // Catch:{ ClassNotFoundException -> 0x010b }
        L_0x010b:
            java.lang.String r0 = "kotlin.internal.JRE7PlatformImplementations"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0148 }
            java.lang.Object r0 = r0.newInstance()     // Catch:{ ClassNotFoundException -> 0x0148 }
            z8.g.e(r0, r5)     // Catch:{ ClassNotFoundException -> 0x0148 }
            r2 = r0
            t8.a r2 = (t8.a) r2     // Catch:{ ClassCastException -> 0x011c }
            goto L_0x014d
        L_0x011c:
            r1 = move-exception
            java.lang.Class r0 = r0.getClass()     // Catch:{ ClassNotFoundException -> 0x0148 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0148 }
            java.lang.ClassLoader r2 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0148 }
            boolean r4 = z8.g.a(r0, r2)     // Catch:{ ClassNotFoundException -> 0x0148 }
            if (r4 != 0) goto L_0x0147
            java.lang.ClassNotFoundException r4 = new java.lang.ClassNotFoundException     // Catch:{ ClassNotFoundException -> 0x0148 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0148 }
            r5.<init>(r6)     // Catch:{ ClassNotFoundException -> 0x0148 }
            r5.append(r0)     // Catch:{ ClassNotFoundException -> 0x0148 }
            r5.append(r3)     // Catch:{ ClassNotFoundException -> 0x0148 }
            r5.append(r2)     // Catch:{ ClassNotFoundException -> 0x0148 }
            java.lang.String r0 = r5.toString()     // Catch:{ ClassNotFoundException -> 0x0148 }
            r4.<init>(r0, r1)     // Catch:{ ClassNotFoundException -> 0x0148 }
            throw r4     // Catch:{ ClassNotFoundException -> 0x0148 }
        L_0x0147:
            throw r1     // Catch:{ ClassNotFoundException -> 0x0148 }
        L_0x0148:
            t8.a r2 = new t8.a
            r2.<init>()
        L_0x014d:
            f9033a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t8.b.<clinit>():void");
    }
}

package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.b0;
import androidx.savedstate.a;
import androidx.savedstate.c;
import z8.g;

public final class z extends b0.c {

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f1421f;

    /* renamed from: g  reason: collision with root package name */
    public static final Class<?>[] f1422g;

    /* renamed from: a  reason: collision with root package name */
    public final Application f1423a;

    /* renamed from: b  reason: collision with root package name */
    public final b0.d f1424b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f1425c;
    public final h d;

    /* renamed from: e  reason: collision with root package name */
    public final a f1426e;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<android.app.Application> r1 = android.app.Application.class
            r2 = 0
            r0[r2] = r1
            r1 = 1
            java.lang.Class<androidx.lifecycle.y> r3 = androidx.lifecycle.y.class
            r0[r1] = r3
            f1421f = r0
            java.lang.Class[] r0 = new java.lang.Class[r1]
            r0[r2] = r3
            f1422g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.z.<clinit>():void");
    }

    @SuppressLint({"LambdaLast"})
    public z(Application application, c cVar, Bundle bundle) {
        b0.d dVar;
        this.f1426e = cVar.c();
        this.d = cVar.r();
        this.f1425c = bundle;
        this.f1423a = application;
        if (application != null) {
            if (b0.a.f1383c == null) {
                b0.a.f1383c = new b0.a(application);
            }
            dVar = b0.a.f1383c;
            g.c(dVar);
        } else {
            if (b0.d.f1385a == null) {
                b0.d.f1385a = new b0.d();
            }
            dVar = b0.d.f1385a;
            g.c(dVar);
        }
        this.f1424b = dVar;
    }

    public final <T extends a0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final void b(a0 a0Var) {
        SavedStateHandleController.g(a0Var, this.f1426e, this.d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends androidx.lifecycle.a0> T c(java.lang.String r12, java.lang.Class<T> r13) {
        /*
            r11 = this;
            java.lang.Class<androidx.lifecycle.a> r0 = androidx.lifecycle.a.class
            boolean r0 = r0.isAssignableFrom(r13)
            r1 = 0
            r2 = 0
            android.app.Application r3 = r11.f1423a
            if (r0 == 0) goto L_0x0029
            if (r3 == 0) goto L_0x0029
            java.lang.Class<?>[] r4 = f1421f
            java.lang.reflect.Constructor[] r5 = r13.getConstructors()
            int r6 = r5.length
            r7 = r2
        L_0x0016:
            if (r7 >= r6) goto L_0x0043
            r8 = r5[r7]
            java.lang.Class[] r9 = r8.getParameterTypes()
            boolean r9 = java.util.Arrays.equals(r4, r9)
            if (r9 == 0) goto L_0x0026
        L_0x0024:
            r1 = r8
            goto L_0x0043
        L_0x0026:
            int r7 = r7 + 1
            goto L_0x0016
        L_0x0029:
            java.lang.Class<?>[] r4 = f1422g
            java.lang.reflect.Constructor[] r5 = r13.getConstructors()
            int r6 = r5.length
            r7 = r2
        L_0x0031:
            if (r7 >= r6) goto L_0x0043
            r8 = r5[r7]
            java.lang.Class[] r9 = r8.getParameterTypes()
            boolean r9 = java.util.Arrays.equals(r4, r9)
            if (r9 == 0) goto L_0x0040
            goto L_0x0024
        L_0x0040:
            int r7 = r7 + 1
            goto L_0x0031
        L_0x0043:
            if (r1 != 0) goto L_0x004c
            androidx.lifecycle.b0$d r12 = r11.f1424b
            androidx.lifecycle.a0 r12 = r12.a(r13)
            return r12
        L_0x004c:
            androidx.savedstate.a r4 = r11.f1426e
            android.os.Bundle r5 = r4.a(r12)
            java.lang.Class[] r6 = androidx.lifecycle.y.f1416e
            android.os.Bundle r6 = r11.f1425c
            if (r5 != 0) goto L_0x0060
            if (r6 != 0) goto L_0x0060
            androidx.lifecycle.y r5 = new androidx.lifecycle.y
            r5.<init>()
            goto L_0x00c1
        L_0x0060:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            if (r6 == 0) goto L_0x0083
            java.util.Set r8 = r6.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x006f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0083
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r6.get(r9)
            r7.put(r9, r10)
            goto L_0x006f
        L_0x0083:
            if (r5 != 0) goto L_0x008b
            androidx.lifecycle.y r5 = new androidx.lifecycle.y
            r5.<init>(r7)
            goto L_0x00c1
        L_0x008b:
            java.lang.String r6 = "keys"
            java.util.ArrayList r6 = r5.getParcelableArrayList(r6)
            java.lang.String r8 = "values"
            java.util.ArrayList r5 = r5.getParcelableArrayList(r8)
            if (r6 == 0) goto L_0x0135
            if (r5 == 0) goto L_0x0135
            int r8 = r6.size()
            int r9 = r5.size()
            if (r8 != r9) goto L_0x0135
            r8 = r2
        L_0x00a6:
            int r9 = r6.size()
            if (r8 >= r9) goto L_0x00bc
            java.lang.Object r9 = r6.get(r8)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r5.get(r8)
            r7.put(r9, r10)
            int r8 = r8 + 1
            goto L_0x00a6
        L_0x00bc:
            androidx.lifecycle.y r5 = new androidx.lifecycle.y
            r5.<init>(r7)
        L_0x00c1:
            androidx.lifecycle.SavedStateHandleController r6 = new androidx.lifecycle.SavedStateHandleController
            r6.<init>(r12, r5)
            androidx.lifecycle.h r12 = r11.d
            r6.i(r12, r4)
            androidx.lifecycle.SavedStateHandleController.j(r12, r4)
            r12 = 1
            if (r0 == 0) goto L_0x00df
            if (r3 == 0) goto L_0x00df
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException -> 0x0120, InstantiationException -> 0x0106, InvocationTargetException -> 0x00ed }
            r0[r2] = r3     // Catch:{ IllegalAccessException -> 0x0120, InstantiationException -> 0x0106, InvocationTargetException -> 0x00ed }
            r0[r12] = r5     // Catch:{ IllegalAccessException -> 0x0120, InstantiationException -> 0x0106, InvocationTargetException -> 0x00ed }
            java.lang.Object r12 = r1.newInstance(r0)     // Catch:{ IllegalAccessException -> 0x0120, InstantiationException -> 0x0106, InvocationTargetException -> 0x00ed }
            goto L_0x00e7
        L_0x00df:
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ IllegalAccessException -> 0x0120, InstantiationException -> 0x0106, InvocationTargetException -> 0x00ed }
            r12[r2] = r5     // Catch:{ IllegalAccessException -> 0x0120, InstantiationException -> 0x0106, InvocationTargetException -> 0x00ed }
            java.lang.Object r12 = r1.newInstance(r12)     // Catch:{ IllegalAccessException -> 0x0120, InstantiationException -> 0x0106, InvocationTargetException -> 0x00ed }
        L_0x00e7:
            androidx.lifecycle.a0 r12 = (androidx.lifecycle.a0) r12     // Catch:{ IllegalAccessException -> 0x0120, InstantiationException -> 0x0106, InvocationTargetException -> 0x00ed }
            r12.b(r6)     // Catch:{ IllegalAccessException -> 0x0120, InstantiationException -> 0x0106, InvocationTargetException -> 0x00ed }
            return r12
        L_0x00ed:
            r12 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "An exception happened in constructor of "
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            java.lang.Throwable r12 = r12.getCause()
            r0.<init>(r13, r12)
            throw r0
        L_0x0106:
            r12 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "A "
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = " cannot be instantiated."
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13, r12)
            throw r0
        L_0x0120:
            r12 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to access "
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13, r12)
            throw r0
        L_0x0135:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Invalid bundle passed as restored state"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.z.c(java.lang.String, java.lang.Class):androidx.lifecycle.a0");
    }
}

package kotlinx.coroutines.internal;

import g9.s0;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final s0 f6792a;

    /* JADX WARNING: type inference failed for: r0v9, types: [e9.a] */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r3.hintOnError();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0077 */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.fast.service.loader"
            int r1 = kotlinx.coroutines.internal.l.f6794a
            r1 = 0
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ SecurityException -> 0x000a }
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            if (r0 != 0) goto L_0x000e
            goto L_0x0011
        L_0x000e:
            java.lang.Boolean.parseBoolean(r0)
        L_0x0011:
            java.lang.Class<kotlinx.coroutines.internal.MainDispatcherFactory> r0 = kotlinx.coroutines.internal.MainDispatcherFactory.class
            java.lang.ClassLoader r2 = r0.getClassLoader()     // Catch:{ all -> 0x0085 }
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0, r2)     // Catch:{ all -> 0x0085 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0085 }
            java.lang.String r2 = "<this>"
            z8.g.f(r0, r2)     // Catch:{ all -> 0x0085 }
            e9.f r2 = new e9.f     // Catch:{ all -> 0x0085 }
            r2.<init>(r0)     // Catch:{ all -> 0x0085 }
            boolean r0 = r2 instanceof e9.a     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x002e
            goto L_0x0034
        L_0x002e:
            e9.a r0 = new e9.a     // Catch:{ all -> 0x0085 }
            r0.<init>(r2)     // Catch:{ all -> 0x0085 }
            r2 = r0
        L_0x0034:
            java.util.List r0 = e9.e.w(r2)     // Catch:{ all -> 0x0085 }
            r2 = r0
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x0085 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0085 }
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0085 }
            if (r3 != 0) goto L_0x0047
            r3 = r1
            goto L_0x006e
        L_0x0047:
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0085 }
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0085 }
            if (r4 != 0) goto L_0x0052
            goto L_0x006e
        L_0x0052:
            r4 = r3
            kotlinx.coroutines.internal.MainDispatcherFactory r4 = (kotlinx.coroutines.internal.MainDispatcherFactory) r4     // Catch:{ all -> 0x0085 }
            int r4 = r4.getLoadPriority()     // Catch:{ all -> 0x0085 }
        L_0x0059:
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x0085 }
            r6 = r5
            kotlinx.coroutines.internal.MainDispatcherFactory r6 = (kotlinx.coroutines.internal.MainDispatcherFactory) r6     // Catch:{ all -> 0x0085 }
            int r6 = r6.getLoadPriority()     // Catch:{ all -> 0x0085 }
            if (r4 >= r6) goto L_0x0068
            r3 = r5
            r4 = r6
        L_0x0068:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x0085 }
            if (r5 != 0) goto L_0x0059
        L_0x006e:
            kotlinx.coroutines.internal.MainDispatcherFactory r3 = (kotlinx.coroutines.internal.MainDispatcherFactory) r3     // Catch:{ all -> 0x0085 }
            if (r3 == 0) goto L_0x007d
            g9.s0 r1 = r3.createDispatcher(r0)     // Catch:{ all -> 0x0077 }
            goto L_0x007a
        L_0x0077:
            r3.hintOnError()     // Catch:{ all -> 0x0085 }
        L_0x007a:
            f6792a = r1
            return
        L_0x007d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0085 }
            java.lang.String r1 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            r0.<init>(r1)     // Catch:{ all -> 0x0085 }
            throw r0     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.h.<clinit>():void");
    }
}

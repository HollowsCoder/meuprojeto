package t8;

import a9.b;
import a9.c;
import java.lang.reflect.Method;
import z8.g;

public class a {

    /* renamed from: t8.a$a  reason: collision with other inner class name */
    public static final class C0133a {

        /* renamed from: a  reason: collision with root package name */
        public static final Method f9032a;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Class[]} */
        /* JADX WARNING: type inference failed for: r5v5 */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
            if (z8.g.a(r5, r0) != false) goto L_0x0036;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        static {
            /*
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                z8.g.e(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L_0x000e:
                r5 = 0
                if (r4 >= r2) goto L_0x003d
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = z8.g.a(r7, r8)
                if (r7 == 0) goto L_0x0035
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                z8.g.e(r7, r8)
                int r8 = r7.length
                r9 = 1
                if (r8 != r9) goto L_0x002e
                r5 = r7[r3]
            L_0x002e:
                boolean r5 = z8.g.a(r5, r0)
                if (r5 == 0) goto L_0x0035
                goto L_0x0036
            L_0x0035:
                r9 = r3
            L_0x0036:
                if (r9 == 0) goto L_0x003a
                r5 = r6
                goto L_0x003d
            L_0x003a:
                int r4 = r4 + 1
                goto L_0x000e
            L_0x003d:
                f9032a = r5
                int r0 = r1.length
            L_0x0040:
                if (r3 >= r0) goto L_0x0054
                r2 = r1[r3]
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = z8.g.a(r2, r4)
                if (r2 == 0) goto L_0x0051
                goto L_0x0054
            L_0x0051:
                int r3 = r3 + 1
                goto L_0x0040
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t8.a.C0133a.<clinit>():void");
        }
    }

    public void a(Throwable th, Throwable th2) {
        g.f(th, "cause");
        g.f(th2, "exception");
        Method method = C0133a.f9032a;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }

    public c b() {
        return new b();
    }
}

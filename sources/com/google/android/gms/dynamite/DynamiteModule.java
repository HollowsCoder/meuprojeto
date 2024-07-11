package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.appcompat.widget.x0;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import n4.l;
import n4.m;
import v4.e;

public final class DynamiteModule {

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f2341b = null;

    /* renamed from: c  reason: collision with root package name */
    public static v4.c f2342c = null;
    public static e d = null;

    /* renamed from: e  reason: collision with root package name */
    public static String f2343e = null;

    /* renamed from: f  reason: collision with root package name */
    public static int f2344f = -1;

    /* renamed from: g  reason: collision with root package name */
    public static final ThreadLocal<c> f2345g = new ThreadLocal<>();

    /* renamed from: h  reason: collision with root package name */
    public static final b f2346h = new b();
    @RecentlyNonNull

    /* renamed from: i  reason: collision with root package name */
    public static final a f2347i = new a();
    @RecentlyNonNull

    /* renamed from: j  reason: collision with root package name */
    public static final c f2348j = new c();
    @RecentlyNonNull

    /* renamed from: k  reason: collision with root package name */
    public static final d f2349k = new d();

    /* renamed from: a  reason: collision with root package name */
    public final Context f2350a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        @RecentlyNullable
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    public interface b {

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public int f2351a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f2352b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f2353c = 0;
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b  reason: collision with other inner class name */
        public interface C0030b {
            int a(Context context, String str, boolean z);

            int b(Context context, String str);
        }

        a a(Context context, String str, C0030b bVar);
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public Cursor f2354a;
    }

    public static class d implements b.C0030b {

        /* renamed from: a  reason: collision with root package name */
        public final int f2355a;

        public d(int i10) {
            this.f2355a = i10;
        }

        public final int a(Context context, String str, boolean z) {
            return 0;
        }

        public final int b(Context context, String str) {
            return this.f2355a;
        }
    }

    public DynamiteModule(Context context) {
        m.h(context);
        this.f2350a = context;
    }

    @RecentlyNonNull
    public static int a(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        String str2;
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (l.a(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(x0.a(str, 45));
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e10) {
            String valueOf2 = String.valueOf(e10.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Failed to load module descriptor class: ".concat(valueOf2);
            } else {
                str2 = new String("Failed to load module descriptor class: ");
            }
            Log.e("DynamiteModule", str2);
            return 0;
        }
    }

    @RecentlyNonNull
    public static DynamiteModule c(@RecentlyNonNull Context context, @RecentlyNonNull b bVar, @RecentlyNonNull String str) {
        b.a a10;
        String str2;
        ThreadLocal<c> threadLocal = f2345g;
        c cVar = threadLocal.get();
        c cVar2 = new c();
        threadLocal.set(cVar2);
        try {
            a10 = bVar.a(context, str, f2346h);
            int i10 = a10.f2351a;
            int i11 = a10.f2352b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i10);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i11);
            Log.i("DynamiteModule", sb.toString());
            int i12 = a10.f2353c;
            if (i12 == 0 || ((i12 == -1 && a10.f2351a == 0) || (i12 == 1 && a10.f2352b == 0))) {
                int i13 = a10.f2351a;
                int i14 = a10.f2352b;
                StringBuilder sb2 = new StringBuilder(91);
                sb2.append("No acceptable module found. Local version is ");
                sb2.append(i13);
                sb2.append(" and remote version is ");
                sb2.append(i14);
                sb2.append(".");
                throw new a(sb2.toString());
            } else if (i12 == -1) {
                DynamiteModule f10 = f(context, str);
                Cursor cursor = cVar2.f2354a;
                if (cursor != null) {
                    cursor.close();
                }
                threadLocal.set(cVar);
                return f10;
            } else if (i12 == 1) {
                DynamiteModule e10 = e(a10.f2352b, context, str);
                Cursor cursor2 = cVar2.f2354a;
                if (cursor2 != null) {
                    cursor2.close();
                }
                threadLocal.set(cVar);
                return e10;
            } else {
                int i15 = a10.f2353c;
                StringBuilder sb3 = new StringBuilder(47);
                sb3.append("VersionPolicy returned invalid code:");
                sb3.append(i15);
                throw new a(sb3.toString());
            }
        } catch (a e11) {
            String valueOf = String.valueOf(e11.getMessage());
            if (valueOf.length() != 0) {
                str2 = "Failed to load remote module: ".concat(valueOf);
            } else {
                str2 = new String("Failed to load remote module: ");
            }
            Log.w("DynamiteModule", str2);
            int i16 = a10.f2351a;
            if (i16 == 0 || bVar.a(context, str, new d(i16)).f2353c != -1) {
                throw new a("Remote load failed. No local fallback found.", e11);
            }
            DynamiteModule f11 = f(context, str);
            Cursor cursor3 = cVar2.f2354a;
            if (cursor3 != null) {
                cursor3.close();
            }
            threadLocal.set(cVar);
            return f11;
        } catch (Throwable th) {
            Cursor cursor4 = cVar2.f2354a;
            if (cursor4 != null) {
                cursor4.close();
            }
            threadLocal.set(cVar);
            throw th;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x0091=Splitter:B:39:0x0091, B:23:0x0052=Splitter:B:23:0x0052, B:17:0x0037=Splitter:B:17:0x0037} */
    @androidx.annotation.RecentlyNonNull
    public static int d(@androidx.annotation.RecentlyNonNull android.content.Context r8, @androidx.annotation.RecentlyNonNull java.lang.String r9, @androidx.annotation.RecentlyNonNull boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x00ff }
            java.lang.Boolean r1 = f2341b     // Catch:{ all -> 0x00fc }
            if (r1 != 0) goto L_0x00c9
            android.content.Context r1 = r8.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00a4, IllegalAccessException -> 0x00a2, NoSuchFieldException -> 0x00a0 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00a4, IllegalAccessException -> 0x00a2, NoSuchFieldException -> 0x00a0 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException -> 0x00a4, IllegalAccessException -> 0x00a2, NoSuchFieldException -> 0x00a0 }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x00a4, IllegalAccessException -> 0x00a2, NoSuchFieldException -> 0x00a0 }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException -> 0x00a4, IllegalAccessException -> 0x00a2, NoSuchFieldException -> 0x00a0 }
            java.lang.Class r2 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00a4, IllegalAccessException -> 0x00a2, NoSuchFieldException -> 0x00a0 }
            monitor-enter(r2)     // Catch:{ ClassNotFoundException -> 0x00a4, IllegalAccessException -> 0x00a2, NoSuchFieldException -> 0x00a0 }
            r3 = 0
            java.lang.Object r4 = r1.get(r3)     // Catch:{ all -> 0x009d }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x009d }
            if (r4 == 0) goto L_0x003a
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009d }
            if (r4 != r1) goto L_0x0034
            goto L_0x0099
        L_0x0034:
            h(r4)     // Catch:{ a -> 0x0037 }
        L_0x0037:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x009d }
            goto L_0x009b
        L_0x003a:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r8.getApplicationContext()     // Catch:{ all -> 0x009d }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x009d }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x009d }
            if (r4 == 0) goto L_0x0052
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009d }
        L_0x004e:
            r1.set(r3, r4)     // Catch:{ all -> 0x009d }
            goto L_0x0099
        L_0x0052:
            int r4 = k(r8, r9, r10)     // Catch:{ a -> 0x0094 }
            java.lang.String r5 = f2343e     // Catch:{ a -> 0x0094 }
            if (r5 == 0) goto L_0x0091
            boolean r5 = r5.isEmpty()     // Catch:{ a -> 0x0094 }
            if (r5 == 0) goto L_0x0061
            goto L_0x0091
        L_0x0061:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ a -> 0x0094 }
            r6 = 29
            if (r5 < r6) goto L_0x0076
            dalvik.system.DelegateLastClassLoader r5 = new dalvik.system.DelegateLastClassLoader     // Catch:{ a -> 0x0094 }
            java.lang.String r6 = f2343e     // Catch:{ a -> 0x0094 }
            n4.m.h(r6)     // Catch:{ a -> 0x0094 }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x0094 }
            r5.<init>(r6, r7)     // Catch:{ a -> 0x0094 }
            goto L_0x0084
        L_0x0076:
            v4.a r5 = new v4.a     // Catch:{ a -> 0x0094 }
            java.lang.String r6 = f2343e     // Catch:{ a -> 0x0094 }
            n4.m.h(r6)     // Catch:{ a -> 0x0094 }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x0094 }
            r5.<init>(r7, r6)     // Catch:{ a -> 0x0094 }
        L_0x0084:
            h(r5)     // Catch:{ a -> 0x0094 }
            r1.set(r3, r5)     // Catch:{ a -> 0x0094 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ a -> 0x0094 }
            f2341b = r5     // Catch:{ a -> 0x0094 }
            monitor-exit(r2)     // Catch:{ all -> 0x009d }
            monitor-exit(r0)     // Catch:{ all -> 0x00fc }
            return r4
        L_0x0091:
            monitor-exit(r2)     // Catch:{ all -> 0x009d }
            monitor-exit(r0)     // Catch:{ all -> 0x00fc }
            return r4
        L_0x0094:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009d }
            goto L_0x004e
        L_0x0099:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009d }
        L_0x009b:
            monitor-exit(r2)     // Catch:{ all -> 0x009d }
            goto L_0x00c7
        L_0x009d:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x009d }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00a4, IllegalAccessException -> 0x00a2, NoSuchFieldException -> 0x00a0 }
        L_0x00a0:
            r1 = move-exception
            goto L_0x00a5
        L_0x00a2:
            r1 = move-exception
            goto L_0x00a5
        L_0x00a4:
            r1 = move-exception
        L_0x00a5:
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00fc }
            int r3 = r1.length()     // Catch:{ all -> 0x00fc }
            int r3 = r3 + 30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fc }
            r4.<init>(r3)     // Catch:{ all -> 0x00fc }
            java.lang.String r3 = "Failed to load module via V2: "
            r4.append(r3)     // Catch:{ all -> 0x00fc }
            r4.append(r1)     // Catch:{ all -> 0x00fc }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00fc }
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x00fc }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00fc }
        L_0x00c7:
            f2341b = r1     // Catch:{ all -> 0x00fc }
        L_0x00c9:
            monitor-exit(r0)     // Catch:{ all -> 0x00fc }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x00ff }
            if (r0 == 0) goto L_0x00f7
            int r8 = k(r8, r9, r10)     // Catch:{ a -> 0x00d5 }
            return r8
        L_0x00d5:
            r9 = move-exception
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00ff }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00ff }
            int r1 = r9.length()     // Catch:{ all -> 0x00ff }
            if (r1 == 0) goto L_0x00ed
            java.lang.String r9 = r0.concat(r9)     // Catch:{ all -> 0x00ff }
            goto L_0x00f2
        L_0x00ed:
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x00ff }
            r9.<init>(r0)     // Catch:{ all -> 0x00ff }
        L_0x00f2:
            android.util.Log.w(r10, r9)     // Catch:{ all -> 0x00ff }
            r8 = 0
            return r8
        L_0x00f7:
            int r8 = i(r8, r9, r10)     // Catch:{ all -> 0x00ff }
            return r8
        L_0x00fc:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00fc }
            throw r9     // Catch:{ all -> 0x00ff }
        L_0x00ff:
            r9 = move-exception
            n4.m.h(r8)     // Catch:{ Exception -> 0x0104 }
            goto L_0x010c
        L_0x0104:
            r8 = move-exception
            java.lang.String r10 = "CrashUtils"
            java.lang.String r0 = "Error adding exception to DropBox!"
            android.util.Log.e(r10, r0, r8)
        L_0x010c:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.d(android.content.Context, java.lang.String, boolean):int");
    }

    public static DynamiteModule e(int i10, Context context, String str) {
        Boolean bool;
        u4.a aVar;
        try {
            synchronized (DynamiteModule.class) {
                bool = f2341b;
            }
            if (bool == null) {
                throw new a("Failed to determine which loading route to use.");
            } else if (bool.booleanValue()) {
                return j(i10, context, str);
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
                sb.append("Selected remote version of ");
                sb.append(str);
                sb.append(", version >= ");
                sb.append(i10);
                Log.i("DynamiteModule", sb.toString());
                v4.c g10 = g(context);
                if (g10 != null) {
                    int a10 = g10.a();
                    if (a10 >= 3) {
                        c cVar = f2345g.get();
                        if (cVar != null) {
                            aVar = g10.b(new u4.b(context), str, i10, new u4.b(cVar.f2354a));
                        } else {
                            throw new a("No cached result cursor holder");
                        }
                    } else if (a10 == 2) {
                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                        aVar = g10.C(new u4.b(context), str, i10);
                    } else {
                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                        aVar = g10.s(new u4.b(context), str, i10);
                    }
                    if (u4.b.K(aVar) != null) {
                        return new DynamiteModule((Context) u4.b.K(aVar));
                    }
                    throw new a("Failed to load remote module.");
                }
                throw new a("Failed to create IDynamiteLoader.");
            }
        } catch (RemoteException e10) {
            throw new a("Failed to load remote module.", e10);
        } catch (a e11) {
            throw e11;
        } catch (Throwable th) {
            try {
                m.h(context);
            } catch (Exception e12) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e12);
            }
            throw new a("Failed to load remote module.", th);
        }
    }

    public static DynamiteModule f(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    public static v4.c g(Context context) {
        v4.c cVar;
        synchronized (DynamiteModule.class) {
            v4.c cVar2 = f2342c;
            if (cVar2 != null) {
                return cVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    cVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    cVar = queryLocalInterface instanceof v4.c ? (v4.c) queryLocalInterface : new v4.b(iBinder);
                }
                if (cVar != null) {
                    f2342c = cVar;
                    return cVar;
                }
            } catch (Exception e10) {
                String valueOf = String.valueOf(e10.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void h(java.lang.ClassLoader r2) {
        /*
            java.lang.String r0 = "com.google.android.gms.dynamiteloader.DynamiteLoaderV2"
            java.lang.Class r2 = r2.loadClass(r0)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r1)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            java.lang.Object r2 = r2.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            if (r2 != 0) goto L_0x0019
            r2 = 0
            goto L_0x002d
        L_0x0019:
            java.lang.String r0 = "com.google.android.gms.dynamite.IDynamiteLoaderV2"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            boolean r1 = r0 instanceof v4.e     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            if (r1 == 0) goto L_0x0027
            r2 = r0
            v4.e r2 = (v4.e) r2     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            goto L_0x002d
        L_0x0027:
            v4.d r0 = new v4.d     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            r0.<init>(r2)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            r2 = r0
        L_0x002d:
            d = r2     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            return
        L_0x0030:
            r2 = move-exception
            goto L_0x0039
        L_0x0032:
            r2 = move-exception
            goto L_0x0039
        L_0x0034:
            r2 = move-exception
            goto L_0x0039
        L_0x0036:
            r2 = move-exception
            goto L_0x0039
        L_0x0038:
            r2 = move-exception
        L_0x0039:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a
            java.lang.String r1 = "Failed to instantiate dynamite loader"
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.h(java.lang.ClassLoader):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r2 != false) goto L_0x0045;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0093 A[Catch:{ all -> 0x005c }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0098 A[Catch:{ all -> 0x005c }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int i(android.content.Context r6, java.lang.String r7, boolean r8) {
        /*
            java.lang.String r0 = "DynamiteModule"
            v4.c r1 = g(r6)
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            r3 = 0
            int r4 = r1.a()     // Catch:{ RemoteException -> 0x005f }
            r5 = 3
            if (r4 < r5) goto L_0x0062
            u4.b r4 = new u4.b     // Catch:{ RemoteException -> 0x005f }
            r4.<init>(r6)     // Catch:{ RemoteException -> 0x005f }
            u4.a r6 = r1.f(r4, r7, r8)     // Catch:{ RemoteException -> 0x005f }
            java.lang.Object r6 = u4.b.K(r6)     // Catch:{ RemoteException -> 0x005f }
            android.database.Cursor r6 = (android.database.Cursor) r6     // Catch:{ RemoteException -> 0x005f }
            if (r6 == 0) goto L_0x004b
            boolean r7 = r6.moveToFirst()     // Catch:{ RemoteException -> 0x0059, all -> 0x0056 }
            if (r7 != 0) goto L_0x002a
            goto L_0x004b
        L_0x002a:
            int r7 = r6.getInt(r2)     // Catch:{ RemoteException -> 0x0059, all -> 0x0056 }
            if (r7 <= 0) goto L_0x0044
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r8 = f2345g     // Catch:{ RemoteException -> 0x0059, all -> 0x0056 }
            java.lang.Object r8 = r8.get()     // Catch:{ RemoteException -> 0x0059, all -> 0x0056 }
            com.google.android.gms.dynamite.DynamiteModule$c r8 = (com.google.android.gms.dynamite.DynamiteModule.c) r8     // Catch:{ RemoteException -> 0x0059, all -> 0x0056 }
            if (r8 == 0) goto L_0x0041
            android.database.Cursor r1 = r8.f2354a     // Catch:{ RemoteException -> 0x0059, all -> 0x0056 }
            if (r1 != 0) goto L_0x0041
            r8.f2354a = r6     // Catch:{ RemoteException -> 0x0059, all -> 0x0056 }
            r2 = 1
        L_0x0041:
            if (r2 == 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r3 = r6
        L_0x0045:
            if (r3 == 0) goto L_0x004a
            r3.close()
        L_0x004a:
            return r7
        L_0x004b:
            java.lang.String r7 = "Failed to retrieve remote module version."
            android.util.Log.w(r0, r7)     // Catch:{ RemoteException -> 0x0059, all -> 0x0056 }
            if (r6 == 0) goto L_0x0055
            r6.close()
        L_0x0055:
            return r2
        L_0x0056:
            r7 = move-exception
            r3 = r6
            goto L_0x00a7
        L_0x0059:
            r7 = move-exception
            r3 = r6
            goto L_0x0083
        L_0x005c:
            r6 = move-exception
            r7 = r6
            goto L_0x00a7
        L_0x005f:
            r6 = move-exception
            r7 = r6
            goto L_0x0083
        L_0x0062:
            r5 = 2
            if (r4 != r5) goto L_0x0074
            java.lang.String r4 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r0, r4)     // Catch:{ RemoteException -> 0x005f }
            u4.b r4 = new u4.b     // Catch:{ RemoteException -> 0x005f }
            r4.<init>(r6)     // Catch:{ RemoteException -> 0x005f }
            int r6 = r1.H(r4, r7, r8)     // Catch:{ RemoteException -> 0x005f }
            return r6
        L_0x0074:
            java.lang.String r4 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r0, r4)     // Catch:{ RemoteException -> 0x005f }
            u4.b r4 = new u4.b     // Catch:{ RemoteException -> 0x005f }
            r4.<init>(r6)     // Catch:{ RemoteException -> 0x005f }
            int r6 = r1.x(r4, r7, r8)     // Catch:{ RemoteException -> 0x005f }
            return r6
        L_0x0083:
            java.lang.String r6 = "Failed to retrieve remote module version: "
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x005c }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x005c }
            int r8 = r7.length()     // Catch:{ all -> 0x005c }
            if (r8 == 0) goto L_0x0098
            java.lang.String r6 = r6.concat(r7)     // Catch:{ all -> 0x005c }
            goto L_0x009e
        L_0x0098:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x005c }
            r7.<init>(r6)     // Catch:{ all -> 0x005c }
            r6 = r7
        L_0x009e:
            android.util.Log.w(r0, r6)     // Catch:{ all -> 0x005c }
            if (r3 == 0) goto L_0x00a6
            r3.close()
        L_0x00a6:
            return r2
        L_0x00a7:
            if (r3 == 0) goto L_0x00ac
            r3.close()
        L_0x00ac:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.i(android.content.Context, java.lang.String, boolean):int");
    }

    public static DynamiteModule j(int i10, Context context, String str) {
        e eVar;
        boolean z;
        Boolean valueOf;
        u4.a aVar;
        StringBuilder sb = new StringBuilder(x0.a(str, 51));
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i10);
        Log.i("DynamiteModule", sb.toString());
        synchronized (DynamiteModule.class) {
            eVar = d;
        }
        if (eVar != null) {
            c cVar = f2345g.get();
            if (cVar == null || cVar.f2354a == null) {
                throw new a("No result cursor");
            }
            Context applicationContext = context.getApplicationContext();
            Cursor cursor = cVar.f2354a;
            new u4.b(null);
            synchronized (DynamiteModule.class) {
                if (f2344f >= 2) {
                    z = true;
                } else {
                    z = false;
                }
                valueOf = Boolean.valueOf(z);
            }
            if (valueOf.booleanValue()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                aVar = eVar.w(new u4.b(applicationContext), str, i10, new u4.b(cursor));
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                aVar = eVar.b(new u4.b(applicationContext), str, i10, new u4.b(cursor));
            }
            Context context2 = (Context) u4.b.K(aVar);
            if (context2 != null) {
                return new DynamiteModule(context2);
            }
            throw new a("Failed to get module context");
        }
        throw new a("DynamiteLoaderV2 was not cached.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0079, code lost:
        if (r8 != false) goto L_0x0080;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int k(android.content.Context r7, java.lang.String r8, boolean r9) {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch:{ Exception -> 0x009d }
            if (r9 == 0) goto L_0x000a
            java.lang.String r7 = "api_force_staging"
            goto L_0x000c
        L_0x000a:
            java.lang.String r7 = "api"
        L_0x000c:
            int r9 = r7.length()     // Catch:{ Exception -> 0x009d }
            int r9 = r9 + 42
            java.lang.String r2 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x009d }
            int r2 = r2.length()     // Catch:{ Exception -> 0x009d }
            int r9 = r9 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009d }
            r2.<init>(r9)     // Catch:{ Exception -> 0x009d }
            java.lang.String r9 = "content://com.google.android.gms.chimera/"
            r2.append(r9)     // Catch:{ Exception -> 0x009d }
            r2.append(r7)     // Catch:{ Exception -> 0x009d }
            java.lang.String r7 = "/"
            r2.append(r7)     // Catch:{ Exception -> 0x009d }
            r2.append(r8)     // Catch:{ Exception -> 0x009d }
            java.lang.String r7 = r2.toString()     // Catch:{ Exception -> 0x009d }
            android.net.Uri r2 = android.net.Uri.parse(r7)     // Catch:{ Exception -> 0x009d }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x009d }
            if (r7 == 0) goto L_0x0086
            boolean r8 = r7.moveToFirst()     // Catch:{ Exception -> 0x0098, all -> 0x0095 }
            if (r8 == 0) goto L_0x0086
            r8 = 0
            int r9 = r7.getInt(r8)     // Catch:{ Exception -> 0x0098, all -> 0x0095 }
            if (r9 <= 0) goto L_0x007f
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x0098, all -> 0x0095 }
            r2 = 2
            java.lang.String r2 = r7.getString(r2)     // Catch:{ all -> 0x007c }
            f2343e = r2     // Catch:{ all -> 0x007c }
            java.lang.String r2 = "loaderVersion"
            int r2 = r7.getColumnIndex(r2)     // Catch:{ all -> 0x007c }
            if (r2 < 0) goto L_0x0067
            int r2 = r7.getInt(r2)     // Catch:{ all -> 0x007c }
            f2344f = r2     // Catch:{ all -> 0x007c }
        L_0x0067:
            monitor-exit(r1)     // Catch:{ all -> 0x007c }
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r1 = f2345g     // Catch:{ Exception -> 0x0098, all -> 0x0095 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x0098, all -> 0x0095 }
            com.google.android.gms.dynamite.DynamiteModule$c r1 = (com.google.android.gms.dynamite.DynamiteModule.c) r1     // Catch:{ Exception -> 0x0098, all -> 0x0095 }
            if (r1 == 0) goto L_0x0079
            android.database.Cursor r2 = r1.f2354a     // Catch:{ Exception -> 0x0098, all -> 0x0095 }
            if (r2 != 0) goto L_0x0079
            r1.f2354a = r7     // Catch:{ Exception -> 0x0098, all -> 0x0095 }
            r8 = 1
        L_0x0079:
            if (r8 == 0) goto L_0x007f
            goto L_0x0080
        L_0x007c:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007c }
            throw r8     // Catch:{ Exception -> 0x0098, all -> 0x0095 }
        L_0x007f:
            r0 = r7
        L_0x0080:
            if (r0 == 0) goto L_0x0085
            r0.close()
        L_0x0085:
            return r9
        L_0x0086:
            java.lang.String r8 = "DynamiteModule"
            java.lang.String r9 = "Failed to retrieve remote module version."
            android.util.Log.w(r8, r9)     // Catch:{ Exception -> 0x0098, all -> 0x0095 }
            com.google.android.gms.dynamite.DynamiteModule$a r8 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x0098, all -> 0x0095 }
            java.lang.String r9 = "Failed to connect to dynamite module ContentResolver."
            r8.<init>(r9)     // Catch:{ Exception -> 0x0098, all -> 0x0095 }
            throw r8     // Catch:{ Exception -> 0x0098, all -> 0x0095 }
        L_0x0095:
            r8 = move-exception
            r0 = r7
            goto L_0x00af
        L_0x0098:
            r8 = move-exception
            r0 = r7
            goto L_0x009f
        L_0x009b:
            r8 = r7
            goto L_0x00af
        L_0x009d:
            r7 = move-exception
            r8 = r7
        L_0x009f:
            boolean r7 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.a     // Catch:{ all -> 0x00ad }
            if (r7 == 0) goto L_0x00a5
            throw r8     // Catch:{ all -> 0x00ad }
        L_0x00a5:
            com.google.android.gms.dynamite.DynamiteModule$a r7 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x00ad }
            java.lang.String r9 = "V2 version check failed"
            r7.<init>(r9, r8)     // Catch:{ all -> 0x00ad }
            throw r7     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r7 = move-exception
            goto L_0x009b
        L_0x00af:
            if (r0 == 0) goto L_0x00b4
            r0.close()
        L_0x00b4:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.k(android.content.Context, java.lang.String, boolean):int");
    }

    @RecentlyNonNull
    public final IBinder b(@RecentlyNonNull String str) {
        try {
            return (IBinder) this.f2350a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new a(str.length() != 0 ? "Failed to instantiate module class: ".concat(str) : new String("Failed to instantiate module class: "), e10);
        }
    }
}

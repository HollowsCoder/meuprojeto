package com.bumptech.glide;

import a3.a;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.f0;
import b3.d;
import c1.r;
import com.bumptech.glide.h;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.j;
import f3.l;
import h3.a;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n.e;
import q2.j;
import s2.m;
import t2.c;
import u2.h;
import u2.i;
import v2.a;
import w2.a;
import w2.b;
import w2.c;
import w2.d;
import w2.e;
import w2.j;
import w2.s;
import w2.t;
import w2.u;
import w2.v;
import w2.w;
import x2.a;
import x2.b;
import x2.c;
import x2.d;
import x2.e;
import z2.a0;
import z2.c0;
import z2.f;
import z2.g;
import z2.p;
import z2.t;
import z2.v;
import z2.x;
import z2.y;

public final class b implements ComponentCallbacks2 {
    public static volatile b w;

    /* renamed from: x  reason: collision with root package name */
    public static volatile boolean f2231x;

    /* renamed from: o  reason: collision with root package name */
    public final c f2232o;

    /* renamed from: p  reason: collision with root package name */
    public final h f2233p;

    /* renamed from: q  reason: collision with root package name */
    public final g f2234q;

    /* renamed from: r  reason: collision with root package name */
    public final k f2235r;

    /* renamed from: s  reason: collision with root package name */
    public final t2.b f2236s;

    /* renamed from: t  reason: collision with root package name */
    public final l f2237t;
    public final f3.c u;

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList f2238v = new ArrayList();

    public interface a {
    }

    /* JADX INFO: finally extract failed */
    public b(Context context, m mVar, h hVar, c cVar, t2.b bVar, l lVar, f3.c cVar2, int i10, c cVar3, n.b bVar2, List list, h hVar2) {
        j jVar;
        j jVar2;
        s.c cVar4;
        d dVar;
        Context context2 = context;
        c cVar5 = cVar;
        t2.b bVar3 = bVar;
        i iVar = i.LOW;
        this.f2232o = cVar5;
        this.f2236s = bVar3;
        this.f2233p = hVar;
        this.f2237t = lVar;
        this.u = cVar2;
        Resources resources = context.getResources();
        k kVar = new k();
        this.f2235r = kVar;
        z2.j jVar3 = new z2.j();
        j1.b bVar4 = kVar.f2256g;
        synchronized (bVar4) {
            try {
                bVar4.f6416a.add(jVar3);
            } catch (Throwable th) {
                throw th;
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 27) {
            p pVar = new p();
            j1.b bVar5 = kVar.f2256g;
            synchronized (bVar5) {
                bVar5.f6416a.add(pVar);
            }
        }
        List<ImageHeaderParser> d = kVar.d();
        d3.a aVar = new d3.a(context2, d, cVar5, bVar3);
        c0 c0Var = new c0(cVar5, new c0.g());
        z2.m mVar2 = new z2.m(kVar.d(), resources.getDisplayMetrics(), cVar5, bVar3);
        if (!hVar2.f2249a.containsKey(d.class) || i11 < 28) {
            jVar = new f(0, mVar2);
            jVar2 = new y(mVar2, bVar3);
        } else {
            jVar2 = new t();
            jVar = new g();
        }
        d dVar2 = new d(context2);
        s.c cVar6 = new s.c(resources);
        s.d dVar3 = new s.d(resources);
        s.b bVar6 = new s.b(resources);
        int i12 = i11;
        s.a aVar2 = new s.a(resources);
        z2.b bVar7 = new z2.b(bVar3);
        s.a aVar3 = aVar2;
        e3.a aVar4 = new e3.a();
        s.d dVar4 = dVar3;
        e eVar = new e(1);
        ContentResolver contentResolver = context.getContentResolver();
        e eVar2 = new e(0);
        Class<ByteBuffer> cls = ByteBuffer.class;
        s.b bVar8 = bVar6;
        h3.a aVar5 = kVar.f2252b;
        synchronized (aVar5) {
            cVar4 = cVar6;
            try {
                dVar = dVar2;
                aVar5.f5220a.add(new a.C0075a(cls, eVar2));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        r rVar = new r(2, bVar3);
        Class<InputStream> cls2 = InputStream.class;
        h3.a aVar6 = kVar.f2252b;
        synchronized (aVar6) {
            try {
                aVar6.f5220a.add(new a.C0075a(cls2, rVar));
            } catch (Throwable th3) {
                throw th3;
            }
        }
        Class<Bitmap> cls3 = Bitmap.class;
        kVar.c(jVar, cls, cls3, "Bitmap");
        kVar.c(jVar2, cls2, cls3, "Bitmap");
        v vVar = new v(mVar2);
        Class<ParcelFileDescriptor> cls4 = ParcelFileDescriptor.class;
        kVar.c(vVar, cls4, cls3, "Bitmap");
        kVar.c(c0Var, cls4, cls3, "Bitmap");
        Class<AssetFileDescriptor> cls5 = AssetFileDescriptor.class;
        kVar.c(new c0(cVar5, new c0.c()), cls5, cls3, "Bitmap");
        u.a<?> aVar7 = u.a.f9223a;
        kVar.a(cls3, cls3, aVar7);
        Class<AssetFileDescriptor> cls6 = cls5;
        kVar.c(new a0(), cls3, cls3, "Bitmap");
        kVar.b(cls3, bVar7);
        z2.a aVar8 = new z2.a(resources, jVar);
        Class<BitmapDrawable> cls7 = BitmapDrawable.class;
        Class<Bitmap> cls8 = cls3;
        kVar.c(aVar8, cls, cls7, "BitmapDrawable");
        kVar.c(new z2.a(resources, jVar2), cls2, cls7, "BitmapDrawable");
        kVar.c(new z2.a(resources, c0Var), cls4, cls7, "BitmapDrawable");
        kVar.b(cls7, new androidx.appcompat.widget.m(2, cVar5, bVar7));
        t2.b bVar9 = bVar;
        d3.h hVar3 = new d3.h(d, aVar, bVar9);
        Class<d3.c> cls9 = d3.c.class;
        kVar.c(hVar3, cls2, cls9, "Gif");
        kVar.c(aVar, cls, cls9, "Gif");
        kVar.b(cls9, new q0.d(3));
        Class<p2.a> cls10 = p2.a.class;
        kVar.a(cls10, cls10, aVar7);
        Class<Bitmap> cls11 = cls8;
        kVar.c(new f(1, cVar5), cls10, cls11, "Bitmap");
        Class<Uri> cls12 = Uri.class;
        Class<Drawable> cls13 = Drawable.class;
        d dVar5 = dVar;
        kVar.c(dVar5, cls12, cls13, "legacy_append");
        kVar.c(new x(dVar5, cVar5), cls12, cls11, "legacy_append");
        kVar.f(new a.C0004a());
        Class<File> cls14 = File.class;
        kVar.a(cls14, cls, new c.b());
        kVar.a(cls14, cls2, new e.C0149e());
        kVar.c(new c3.a(), cls14, cls14, "legacy_append");
        kVar.a(cls14, cls4, new e.b());
        kVar.a(cls14, cls14, aVar7);
        kVar.f(new j.a(bVar9));
        kVar.f(new ParcelFileDescriptorRewinder.a());
        Class cls15 = Integer.TYPE;
        s.c cVar7 = cVar4;
        kVar.a(cls15, cls2, cVar7);
        Class<d3.c> cls16 = cls9;
        s.b bVar10 = bVar8;
        kVar.a(cls15, cls4, bVar10);
        Class<Integer> cls17 = Integer.class;
        kVar.a(cls17, cls2, cVar7);
        kVar.a(cls17, cls4, bVar10);
        s.d dVar6 = dVar4;
        kVar.a(cls17, cls12, dVar6);
        s.a aVar9 = aVar3;
        Class<AssetFileDescriptor> cls18 = cls6;
        kVar.a(cls15, cls18, aVar9);
        kVar.a(cls17, cls18, aVar9);
        kVar.a(cls15, cls12, dVar6);
        Class<String> cls19 = String.class;
        kVar.a(cls19, cls2, new d.c());
        kVar.a(cls12, cls2, new d.c());
        kVar.a(cls19, cls2, new t.c());
        kVar.a(cls19, cls4, new t.b());
        kVar.a(cls19, cls18, new t.a());
        kVar.a(cls12, cls2, new a.c(context.getAssets()));
        kVar.a(cls12, cls4, new a.b(context.getAssets()));
        Context context3 = context;
        kVar.a(cls12, cls2, new b.a(context3));
        kVar.a(cls12, cls2, new c.a(context3));
        if (i12 >= 29) {
            kVar.a(cls12, cls2, new d.c(context3));
            kVar.a(cls12, cls4, new d.b(context3));
        }
        ContentResolver contentResolver2 = contentResolver;
        kVar.a(cls12, cls2, new v.d(contentResolver2));
        kVar.a(cls12, cls4, new v.b(contentResolver2));
        kVar.a(cls12, cls18, new v.a(contentResolver2));
        kVar.a(cls12, cls2, new w.a());
        kVar.a(URL.class, cls2, new e.a());
        kVar.a(cls12, cls14, new j.a(context3));
        kVar.a(w2.f.class, cls2, new a.C0159a());
        Class<byte[]> cls20 = byte[].class;
        kVar.a(cls20, cls, new b.a());
        kVar.a(cls20, cls2, new b.d());
        kVar.a(cls12, cls12, aVar7);
        kVar.a(cls13, cls13, aVar7);
        kVar.c(new b3.e(), cls13, cls13, "legacy_append");
        Class<Bitmap> cls21 = cls8;
        kVar.g(cls21, cls7, new r(resources));
        e3.a aVar10 = aVar4;
        kVar.g(cls21, cls20, aVar10);
        t2.c cVar8 = cVar;
        n.e eVar3 = eVar;
        kVar.g(cls13, cls20, new f0(cVar8, aVar10, eVar3, 2));
        kVar.g(cls16, cls20, eVar3);
        c0 c0Var2 = new c0(cVar8, new c0.d());
        kVar.c(c0Var2, ByteBuffer.class, cls21, "legacy_append");
        kVar.c(new z2.a(resources, c0Var2), ByteBuffer.class, cls7, "legacy_append");
        this.f2234q = new g(context, bVar, kVar, new n.e(4), cVar3, bVar2, list, mVar, hVar2, i10);
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        int i10;
        c cVar;
        t2.c cVar2;
        if (!f2231x) {
            f2231x = true;
            n.b bVar = new n.b();
            h.a aVar = new h.a();
            c cVar3 = new c();
            Context applicationContext = context.getApplicationContext();
            Collections.emptyList();
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Loading Glide modules");
            }
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo.metaData != null) {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                    }
                    for (String next : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(next))) {
                            arrayList.add(g3.e.a(next));
                            if (Log.isLoggable("ManifestParser", 3)) {
                                Log.d("ManifestParser", "Loaded Glide module: " + next);
                            }
                        }
                    }
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Finished loading Glide modules");
                    }
                } else if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Got null app info metadata");
                }
                if (generatedAppGlideModule != null && !generatedAppGlideModule.c().isEmpty()) {
                    Set<Class<?>> c10 = generatedAppGlideModule.c();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        g3.c cVar4 = (g3.c) it.next();
                        if (c10.contains(cVar4.getClass())) {
                            if (Log.isLoggable("Glide", 3)) {
                                Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + cVar4);
                            }
                            it.remove();
                        }
                    }
                }
                if (Log.isLoggable("Glide", 3)) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Log.d("Glide", "Discovered GlideModule from manifest: " + ((g3.c) it2.next()).getClass());
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((g3.c) it3.next()).a();
                }
                if (v2.a.f9123q == 0) {
                    v2.a.f9123q = Math.min(4, Runtime.getRuntime().availableProcessors());
                }
                int i11 = v2.a.f9123q;
                if (!TextUtils.isEmpty("source")) {
                    v2.a aVar2 = new v2.a(new ThreadPoolExecutor(i11, i11, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.C0139a("source", false)));
                    int i12 = v2.a.f9123q;
                    if (!TextUtils.isEmpty("disk-cache")) {
                        v2.a aVar3 = new v2.a(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.C0139a("disk-cache", true)));
                        if (v2.a.f9123q == 0) {
                            v2.a.f9123q = Math.min(4, Runtime.getRuntime().availableProcessors());
                        }
                        if (v2.a.f9123q >= 4) {
                            i10 = 2;
                        } else {
                            i10 = 1;
                        }
                        if (!TextUtils.isEmpty("animation")) {
                            v2.a aVar4 = new v2.a(new ThreadPoolExecutor(i10, i10, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.C0139a("animation", true)));
                            i iVar = new i(new i.a(applicationContext));
                            f3.e eVar = new f3.e();
                            int i13 = iVar.f9074a;
                            if (i13 > 0) {
                                cVar = cVar3;
                                cVar2 = new t2.i((long) i13);
                            } else {
                                cVar = cVar3;
                                cVar2 = new t2.d();
                            }
                            t2.h hVar = new t2.h(iVar.f9076c);
                            u2.g gVar = new u2.g((long) iVar.f9075b);
                            m mVar = new m(gVar, new u2.f(applicationContext), aVar3, aVar2, new v2.a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, v2.a.f9122p, TimeUnit.MILLISECONDS, new SynchronousQueue(), new a.C0139a("source-unlimited", false))), aVar4);
                            List emptyList = Collections.emptyList();
                            h hVar2 = new h(aVar);
                            b bVar2 = new b(applicationContext, mVar, gVar, cVar2, hVar, new l((l.b) null, hVar2), eVar, 4, cVar, bVar, emptyList, hVar2);
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                g3.c cVar5 = (g3.c) it4.next();
                                try {
                                    cVar5.b();
                                } catch (AbstractMethodError e10) {
                                    throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(cVar5.getClass().getName()), e10);
                                }
                            }
                            applicationContext.registerComponentCallbacks(bVar2);
                            w = bVar2;
                            f2231x = false;
                            return;
                        }
                        throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
                    }
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
                }
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            } catch (PackageManager.NameNotFoundException e11) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e11);
            }
        } else {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
    }

    public static b b(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (w == null) {
            Context applicationContext = context.getApplicationContext();
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{applicationContext.getApplicationContext()});
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (InstantiationException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (IllegalAccessException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e13);
            }
            synchronized (b.class) {
                if (w == null) {
                    a(context, generatedAppGlideModule);
                }
            }
        }
        return w;
    }

    public final void c(m mVar) {
        synchronized (this.f2238v) {
            if (this.f2238v.contains(mVar)) {
                this.f2238v.remove(mVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
        boolean z;
        char[] cArr = m3.j.f7084a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((m3.g) this.f2233p).e(0);
            this.f2232o.b();
            this.f2236s.b();
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }

    public final void onTrimMemory(int i10) {
        boolean z;
        long j8;
        char[] cArr = m3.j.f7084a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            synchronized (this.f2238v) {
                Iterator it = this.f2238v.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).getClass();
                }
            }
            u2.g gVar = (u2.g) this.f2233p;
            gVar.getClass();
            if (i10 >= 40) {
                gVar.e(0);
            } else if (i10 >= 20 || i10 == 15) {
                synchronized (gVar) {
                    j8 = gVar.f7076b;
                }
                gVar.e(j8 / 2);
            }
            this.f2232o.a(i10);
            this.f2236s.a(i10);
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }
}

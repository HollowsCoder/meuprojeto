package h1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import n.e;
import r1.q;
import t1.g;
import w9.v;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f5130a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f5131b = {80, 75, 3, 4};

    public class a implements o<f> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f5132a;

        public a(String str) {
            this.f5132a = str;
        }

        public final void onResult(Object obj) {
            f fVar = (f) obj;
            g.f5130a.remove(this.f5132a);
        }
    }

    public class b implements o<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f5133a;

        public b(String str) {
            this.f5133a = str;
        }

        public final void onResult(Object obj) {
            Throwable th = (Throwable) obj;
            g.f5130a.remove(this.f5133a);
        }
    }

    public class c implements Callable<r<f>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f5134a;

        public c(f fVar) {
            this.f5134a = fVar;
        }

        public final Object call() {
            return new r(this.f5134a);
        }
    }

    public static t<f> a(String str, Callable<r<f>> callable) {
        f fVar;
        if (str == null) {
            fVar = null;
        } else {
            fVar = m1.g.f7050b.f7051a.b(str);
        }
        if (fVar != null) {
            return new t<>(new c(fVar), false);
        }
        HashMap hashMap = f5130a;
        if (str != null && hashMap.containsKey(str)) {
            return (t) hashMap.get(str);
        }
        t<f> tVar = new t<>(callable, false);
        if (str != null) {
            a aVar = new a(str);
            synchronized (tVar) {
                if (!(tVar.d == null || tVar.d.f5206a == null)) {
                    aVar.onResult(tVar.d.f5206a);
                }
                tVar.f5210a.add(aVar);
            }
            b bVar = new b(str);
            synchronized (tVar) {
                if (!(tVar.d == null || tVar.d.f5207b == null)) {
                    bVar.onResult(tVar.d.f5207b);
                }
                tVar.f5211b.add(bVar);
            }
            hashMap.put(str, tVar);
        }
        return tVar;
    }

    public static r<f> b(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip")) {
                if (!str.endsWith(".lottie")) {
                    return c(context.getAssets().open(str), str2);
                }
            }
            return f(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e10) {
            return new r<>((Throwable) e10);
        }
    }

    public static r<f> c(InputStream inputStream, String str) {
        try {
            v o10 = e.o(e.H(inputStream));
            String[] strArr = s1.a.f8542s;
            return d(new s1.b(o10), str, true);
        } finally {
            t1.g.b(inputStream);
        }
    }

    public static r d(s1.b bVar, String str, boolean z) {
        try {
            f a10 = q.a(bVar);
            if (str != null) {
                m1.g.f7050b.f7051a.c(str, a10);
            }
            r rVar = new r(a10);
            if (z) {
                t1.g.b(bVar);
            }
            return rVar;
        } catch (Exception e10) {
            r rVar2 = new r((Throwable) e10);
            if (z) {
                t1.g.b(bVar);
            }
            return rVar2;
        } catch (Throwable th) {
            if (z) {
                t1.g.b(bVar);
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        t1.c.f8876a.getClass();
        r6 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static h1.r e(int r5, android.content.Context r6, java.lang.String r7) {
        /*
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ NotFoundException -> 0x0054 }
            java.io.InputStream r5 = r6.openRawResource(r5)     // Catch:{ NotFoundException -> 0x0054 }
            w9.p r5 = n.e.H(r5)     // Catch:{ NotFoundException -> 0x0054 }
            w9.v r5 = n.e.o(r5)     // Catch:{ NotFoundException -> 0x0054 }
            w9.v r6 = r5.b()     // Catch:{ Exception -> 0x002e }
            byte[] r0 = f5131b     // Catch:{ Exception -> 0x002e }
            int r1 = r0.length     // Catch:{ Exception -> 0x002e }
            r2 = 0
        L_0x0018:
            if (r2 >= r1) goto L_0x0028
            byte r3 = r0[r2]     // Catch:{ Exception -> 0x002e }
            byte r4 = r6.readByte()     // Catch:{ Exception -> 0x002e }
            if (r4 == r3) goto L_0x0025
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x002e }
            goto L_0x0035
        L_0x0025:
            int r2 = r2 + 1
            goto L_0x0018
        L_0x0028:
            r6.close()     // Catch:{ Exception -> 0x002e }
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x002e }
            goto L_0x0035
        L_0x002e:
            t1.b r6 = t1.c.f8876a     // Catch:{ NotFoundException -> 0x0054 }
            r6.getClass()     // Catch:{ NotFoundException -> 0x0054 }
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ NotFoundException -> 0x0054 }
        L_0x0035:
            boolean r6 = r6.booleanValue()     // Catch:{ NotFoundException -> 0x0054 }
            if (r6 == 0) goto L_0x004a
            java.util.zip.ZipInputStream r6 = new java.util.zip.ZipInputStream     // Catch:{ NotFoundException -> 0x0054 }
            w9.v$a r0 = new w9.v$a     // Catch:{ NotFoundException -> 0x0054 }
            r0.<init>(r5)     // Catch:{ NotFoundException -> 0x0054 }
            r6.<init>(r0)     // Catch:{ NotFoundException -> 0x0054 }
            h1.r r5 = f(r6, r7)     // Catch:{ NotFoundException -> 0x0054 }
            return r5
        L_0x004a:
            w9.v$a r6 = new w9.v$a     // Catch:{ NotFoundException -> 0x0054 }
            r6.<init>(r5)     // Catch:{ NotFoundException -> 0x0054 }
            h1.r r5 = c(r6, r7)     // Catch:{ NotFoundException -> 0x0054 }
            return r5
        L_0x0054:
            r5 = move-exception
            h1.r r6 = new h1.r
            r6.<init>((java.lang.Throwable) r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.g.e(int, android.content.Context, java.lang.String):h1.r");
    }

    public static r<f> f(ZipInputStream zipInputStream, String str) {
        try {
            return g(zipInputStream, str);
        } finally {
            t1.g.b(zipInputStream);
        }
    }

    public static r<f> g(ZipInputStream zipInputStream, String str) {
        n nVar;
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            f fVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (!name.contains("__MACOSX")) {
                    if (!nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                        if (nextEntry.getName().contains(".json")) {
                            v o10 = e.o(e.H(zipInputStream));
                            String[] strArr = s1.a.f8542s;
                            fVar = (f) d(new s1.b(o10), (String) null, false).f5206a;
                        } else {
                            if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg")) {
                                if (name.contains(".jpeg")) {
                                }
                            }
                            String[] split = name.split("/");
                            hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                        }
                        nextEntry = zipInputStream.getNextEntry();
                    }
                }
                zipInputStream.closeEntry();
                nextEntry = zipInputStream.getNextEntry();
            }
            if (fVar == null) {
                return new r<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                Iterator<n> it = fVar.d.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        nVar = null;
                        break;
                    }
                    nVar = it.next();
                    if (nVar.f5184c.equals(str2)) {
                        break;
                    }
                }
                if (nVar != null) {
                    Bitmap bitmap = (Bitmap) entry.getValue();
                    g.a aVar = t1.g.f8886a;
                    int width = bitmap.getWidth();
                    int i10 = nVar.f5182a;
                    int i11 = nVar.f5183b;
                    if (!(width == i10 && bitmap.getHeight() == i11)) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
                        bitmap.recycle();
                        bitmap = createScaledBitmap;
                    }
                    nVar.d = bitmap;
                }
            }
            for (Map.Entry next : fVar.d.entrySet()) {
                if (((n) next.getValue()).d == null) {
                    return new r<>((Throwable) new IllegalStateException("There is no image for " + ((n) next.getValue()).f5184c));
                }
            }
            if (str != null) {
                m1.g.f7050b.f7051a.c(str, fVar);
            }
            return new r<>(fVar);
        } catch (IOException e10) {
            return new r<>((Throwable) e10);
        }
    }

    public static String h(Context context, int i10) {
        boolean z;
        String str;
        StringBuilder sb = new StringBuilder("rawRes");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "_night_";
        } else {
            str = "_day_";
        }
        sb.append(str);
        sb.append(i10);
        return sb.toString();
    }
}

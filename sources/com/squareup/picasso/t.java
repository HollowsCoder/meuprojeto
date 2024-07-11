package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import com.squareup.picasso.a;
import com.squareup.picasso.h;
import com.squareup.picasso.m;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

public final class t {

    /* renamed from: m  reason: collision with root package name */
    public static final a f3972m = new a(Looper.getMainLooper());
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: n  reason: collision with root package name */
    public static volatile t f3973n = null;

    /* renamed from: a  reason: collision with root package name */
    public final e f3974a;

    /* renamed from: b  reason: collision with root package name */
    public final List<y> f3975b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f3976c;
    public final h d;

    /* renamed from: e  reason: collision with root package name */
    public final d f3977e;

    /* renamed from: f  reason: collision with root package name */
    public final a0 f3978f;

    /* renamed from: g  reason: collision with root package name */
    public final WeakHashMap f3979g;

    /* renamed from: h  reason: collision with root package name */
    public final WeakHashMap f3980h;

    /* renamed from: i  reason: collision with root package name */
    public final ReferenceQueue<Object> f3981i;

    /* renamed from: j  reason: collision with root package name */
    public final Bitmap.Config f3982j = null;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f3983k;
    public volatile boolean l;

    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            boolean z;
            boolean z10;
            Bitmap bitmap;
            int i10 = message.what;
            if (i10 == 3) {
                a aVar = (a) message.obj;
                if (aVar.f3884a.l) {
                    e0.d("Main", "canceled", aVar.f3885b.b(), "target got garbage collected");
                }
                aVar.f3884a.a(aVar.d());
            } else if (i10 == 8) {
                List list = (List) message.obj;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    c cVar = (c) list.get(i11);
                    t tVar = cVar.f3924p;
                    tVar.getClass();
                    a aVar2 = cVar.f3931y;
                    ArrayList arrayList = cVar.z;
                    if (arrayList == null || arrayList.isEmpty()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (aVar2 != null || z) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        Uri uri = cVar.u.f3999c;
                        Exception exc = cVar.D;
                        Bitmap bitmap2 = cVar.A;
                        c cVar2 = cVar.C;
                        if (aVar2 != null) {
                            tVar.b(bitmap2, cVar2, aVar2, exc);
                        }
                        if (z) {
                            int size2 = arrayList.size();
                            for (int i12 = 0; i12 < size2; i12++) {
                                tVar.b(bitmap2, cVar2, (a) arrayList.get(i12), exc);
                            }
                        }
                    }
                }
            } else if (i10 == 13) {
                List list2 = (List) message.obj;
                int size3 = list2.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    a aVar3 = (a) list2.get(i13);
                    t tVar2 = aVar3.f3884a;
                    tVar2.getClass();
                    if (p.shouldReadFromMemoryCache(aVar3.f3887e)) {
                        m.a aVar4 = (m.a) ((m) tVar2.f3977e).f3957a.get(aVar3.f3891i);
                        if (aVar4 != null) {
                            bitmap = aVar4.f3958a;
                        } else {
                            bitmap = null;
                        }
                        a0 a0Var = tVar2.f3978f;
                        if (bitmap != null) {
                            a0Var.f3896b.sendEmptyMessage(0);
                        } else {
                            a0Var.f3896b.sendEmptyMessage(1);
                        }
                    } else {
                        bitmap = null;
                    }
                    if (bitmap != null) {
                        c cVar3 = c.MEMORY;
                        tVar2.b(bitmap, cVar3, aVar3, (Exception) null);
                        if (tVar2.l) {
                            e0.d("Main", "completed", aVar3.f3885b.b(), "from " + cVar3);
                        }
                    } else {
                        tVar2.c(aVar3);
                        if (tVar2.l) {
                            e0.c("Main", "resumed", aVar3.f3885b.b());
                        }
                    }
                }
            } else {
                throw new AssertionError("Unknown handler message received: " + message.what);
            }
        }
    }

    public static class b extends Thread {

        /* renamed from: o  reason: collision with root package name */
        public final ReferenceQueue<Object> f3984o;

        /* renamed from: p  reason: collision with root package name */
        public final Handler f3985p;

        public class a implements Runnable {

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ Exception f3986o;

            public a(Exception exc) {
                this.f3986o = exc;
            }

            public final void run() {
                throw new RuntimeException(this.f3986o);
            }
        }

        public b(ReferenceQueue referenceQueue, a aVar) {
            this.f3984o = referenceQueue;
            this.f3985p = aVar;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        public final void run() {
            Handler handler = this.f3985p;
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a.C0045a aVar = (a.C0045a) this.f3984o.remove(1000);
                    Message obtainMessage = handler.obtainMessage();
                    if (aVar != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = aVar.f3894a;
                        handler.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e10) {
                    handler.post(new a(e10));
                    return;
                }
            }
        }
    }

    public enum c {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        
        final int debugColor;

        private c(int i10) {
            this.debugColor = i10;
        }
    }

    public enum d {
        LOW,
        NORMAL,
        HIGH
    }

    public interface e {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3987a = new a();

        public static class a implements e {
        }
    }

    public t(Context context, h hVar, d dVar, e eVar, a0 a0Var) {
        this.f3976c = context;
        this.d = hVar;
        this.f3977e = dVar;
        this.f3974a = eVar;
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new z(context));
        arrayList.add(new e(context));
        arrayList.add(new o(context));
        arrayList.add(new f(context));
        arrayList.add(new b(context));
        arrayList.add(new j(context));
        arrayList.add(new r(hVar.f3945c, a0Var));
        this.f3975b = Collections.unmodifiableList(arrayList);
        this.f3978f = a0Var;
        this.f3979g = new WeakHashMap();
        this.f3980h = new WeakHashMap();
        this.f3983k = false;
        this.l = false;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f3981i = referenceQueue;
        new b(referenceQueue, f3972m).start();
    }

    public static t d() {
        if (f3973n == null) {
            synchronized (t.class) {
                if (f3973n == null) {
                    Context context = PicassoProvider.f3883o;
                    if (context != null) {
                        Context applicationContext = context.getApplicationContext();
                        s sVar = new s(applicationContext);
                        m mVar = new m(applicationContext);
                        v vVar = new v();
                        e.a aVar = e.f3987a;
                        a0 a0Var = new a0(mVar);
                        f3973n = new t(applicationContext, new h(applicationContext, vVar, f3972m, sVar, mVar, a0Var), mVar, aVar, a0Var);
                    } else {
                        throw new IllegalStateException("context == null");
                    }
                }
            }
        }
        return f3973n;
    }

    public final void a(Object obj) {
        boolean z;
        StringBuilder sb = e0.f3939a;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            a aVar = (a) this.f3979g.remove(obj);
            if (aVar != null) {
                aVar.a();
                h.a aVar2 = this.d.f3949h;
                aVar2.sendMessage(aVar2.obtainMessage(2, aVar));
            }
            if (obj instanceof ImageView) {
                if (((g) this.f3980h.remove((ImageView) obj)) != null) {
                    throw null;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Method call should happen from the main thread.");
    }

    public final void b(Bitmap bitmap, c cVar, a aVar, Exception exc) {
        String str;
        String str2;
        String str3;
        if (!aVar.l) {
            if (!aVar.f3893k) {
                this.f3979g.remove(aVar.d());
            }
            if (bitmap == null) {
                aVar.c();
                if (this.l) {
                    str3 = aVar.f3885b.b();
                    str2 = exc.getMessage();
                    str = "errored";
                } else {
                    return;
                }
            } else if (cVar != null) {
                aVar.b(bitmap, cVar);
                if (this.l) {
                    str3 = aVar.f3885b.b();
                    str2 = "from " + cVar;
                    str = "completed";
                } else {
                    return;
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
            e0.d("Main", str, str3, str2);
        }
    }

    public final void c(a aVar) {
        Object d10 = aVar.d();
        if (d10 != null) {
            WeakHashMap weakHashMap = this.f3979g;
            if (weakHashMap.get(d10) != aVar) {
                a(d10);
                weakHashMap.put(d10, aVar);
            }
        }
        h.a aVar2 = this.d.f3949h;
        aVar2.sendMessage(aVar2.obtainMessage(1, aVar));
    }
}

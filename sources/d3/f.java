package d3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.g;
import com.bumptech.glide.l;
import com.bumptech.glide.m;
import java.util.ArrayList;
import p2.e;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final p2.a f4161a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f4162b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f4163c;
    public final m d;

    /* renamed from: e  reason: collision with root package name */
    public final t2.c f4164e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4165f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4166g;

    /* renamed from: h  reason: collision with root package name */
    public l<Bitmap> f4167h;

    /* renamed from: i  reason: collision with root package name */
    public a f4168i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4169j;

    /* renamed from: k  reason: collision with root package name */
    public a f4170k;
    public Bitmap l;

    /* renamed from: m  reason: collision with root package name */
    public q2.l<Bitmap> f4171m;

    /* renamed from: n  reason: collision with root package name */
    public a f4172n;

    /* renamed from: o  reason: collision with root package name */
    public int f4173o;

    /* renamed from: p  reason: collision with root package name */
    public int f4174p;

    /* renamed from: q  reason: collision with root package name */
    public int f4175q;

    public static class a extends j3.c<Bitmap> {

        /* renamed from: r  reason: collision with root package name */
        public final Handler f4176r;

        /* renamed from: s  reason: collision with root package name */
        public final int f4177s;

        /* renamed from: t  reason: collision with root package name */
        public final long f4178t;
        public Bitmap u;

        public a(Handler handler, int i10, long j8) {
            this.f4176r = handler;
            this.f4177s = i10;
            this.f4178t = j8;
        }

        public final void i(Drawable drawable) {
            this.u = null;
        }

        public final void j(Object obj) {
            this.u = (Bitmap) obj;
            Handler handler = this.f4176r;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f4178t);
        }
    }

    public interface b {
        void a();
    }

    public class c implements Handler.Callback {
        public c() {
        }

        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            f fVar = f.this;
            if (i10 == 1) {
                fVar.b((a) message.obj);
                return true;
            } else if (i10 != 2) {
                return false;
            } else {
                fVar.d.l((a) message.obj);
                return false;
            }
        }
    }

    public f(com.bumptech.glide.b bVar, e eVar, int i10, int i11, y2.c cVar, Bitmap bitmap) {
        t2.c cVar2 = bVar.f2232o;
        g gVar = bVar.f2234q;
        Context baseContext = gVar.getBaseContext();
        if (baseContext != null) {
            m f10 = com.bumptech.glide.b.b(baseContext).f2237t.f(baseContext);
            Context baseContext2 = gVar.getBaseContext();
            if (baseContext2 != null) {
                m f11 = com.bumptech.glide.b.b(baseContext2).f2237t.f(baseContext2);
                f11.getClass();
                l<Bitmap> w = new l(f11.f2291o, f11, Bitmap.class, f11.f2292p).w(m.f2290y).w(((i3.f) ((i3.f) ((i3.f) new i3.f().h(s2.l.f8621a)).u()).r()).l(i10, i11));
                this.f4163c = new ArrayList();
                this.d = f10;
                Handler handler = new Handler(Looper.getMainLooper(), new c());
                this.f4164e = cVar2;
                this.f4162b = handler;
                this.f4167h = w;
                this.f4161a = eVar;
                c(cVar, bitmap);
                return;
            }
            throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    public final void a() {
        if (this.f4165f && !this.f4166g) {
            a aVar = this.f4172n;
            if (aVar != null) {
                this.f4172n = null;
                b(aVar);
                return;
            }
            this.f4166g = true;
            p2.a aVar2 = this.f4161a;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) aVar2.e());
            aVar2.c();
            this.f4170k = new a(this.f4162b, aVar2.a(), uptimeMillis);
            l<Bitmap> B = this.f4167h.w((i3.f) new i3.f().q(new l3.b(Double.valueOf(Math.random())))).B(aVar2);
            B.A(this.f4170k, B);
        }
    }

    public final void b(a aVar) {
        this.f4166g = false;
        boolean z = this.f4169j;
        Handler handler = this.f4162b;
        if (z) {
            handler.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f4165f) {
            this.f4172n = aVar;
        } else {
            if (aVar.u != null) {
                Bitmap bitmap = this.l;
                if (bitmap != null) {
                    this.f4164e.e(bitmap);
                    this.l = null;
                }
                a aVar2 = this.f4168i;
                this.f4168i = aVar;
                ArrayList arrayList = this.f4163c;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((b) arrayList.get(size)).a();
                }
                if (aVar2 != null) {
                    handler.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            a();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [q2.l<android.graphics.Bitmap>, java.lang.Object, q2.l] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(q2.l<android.graphics.Bitmap> r4, android.graphics.Bitmap r5) {
        /*
            r3 = this;
            s6.a.n(r4)
            r3.f4171m = r4
            s6.a.n(r5)
            r3.l = r5
            com.bumptech.glide.l<android.graphics.Bitmap> r0 = r3.f4167h
            i3.f r1 = new i3.f
            r1.<init>()
            r2 = 1
            i3.a r4 = r1.t(r4, r2)
            com.bumptech.glide.l r4 = r0.w(r4)
            r3.f4167h = r4
            int r4 = m3.j.c(r5)
            r3.f4173o = r4
            int r4 = r5.getWidth()
            r3.f4174p = r4
            int r4 = r5.getHeight()
            r3.f4175q = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.f.c(q2.l, android.graphics.Bitmap):void");
    }
}

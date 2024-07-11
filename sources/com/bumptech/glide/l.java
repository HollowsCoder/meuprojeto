package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.Log;
import android.widget.ImageView;
import f3.n;
import i3.b;
import i3.c;
import i3.d;
import i3.e;
import i3.f;
import i3.h;
import i3.i;
import j3.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m3.j;
import z2.k;
import z2.q;

public final class l<TranscodeType> extends i3.a<l<TranscodeType>> {
    public final Context O;
    public final m P;
    public final Class<TranscodeType> Q;
    public final g R;
    public n<?, ? super TranscodeType> S;
    public Object T;
    public ArrayList U;
    public l<TranscodeType> V;
    public l<TranscodeType> W;
    public final boolean X = true;
    public boolean Y;
    public boolean Z;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2260a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f2261b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
                com.bumptech.glide.j[] r0 = com.bumptech.glide.j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2261b = r0
                r1 = 1
                com.bumptech.glide.j r2 = com.bumptech.glide.j.LOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f2261b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.j r3 = com.bumptech.glide.j.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f2261b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bumptech.glide.j r4 = com.bumptech.glide.j.HIGH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f2261b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bumptech.glide.j r5 = com.bumptech.glide.j.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f2260a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f2260a     // Catch:{ NoSuchFieldError -> 0x004e }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f2260a     // Catch:{ NoSuchFieldError -> 0x0058 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f2260a     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f2260a     // Catch:{ NoSuchFieldError -> 0x006d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f2260a     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f2260a     // Catch:{ NoSuchFieldError -> 0x0083 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f2260a     // Catch:{ NoSuchFieldError -> 0x008f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.l.a.<clinit>():void");
        }
    }

    static {
        f fVar = (f) ((f) ((f) new f().h(s2.l.f8622b)).m(j.LOW)).r();
    }

    @SuppressLint({"CheckResult"})
    public l(b bVar, m mVar, Class<TranscodeType> cls, Context context) {
        f fVar;
        this.P = mVar;
        this.Q = cls;
        this.O = context;
        Map<Class<?>, n<?, ?>> map = mVar.f2291o.f2234q.f2244f;
        n<?, ? super TranscodeType> nVar = map.get(cls);
        if (nVar == null) {
            for (Map.Entry next : map.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    nVar = (n) next.getValue();
                }
            }
        }
        this.S = nVar == null ? g.f2239k : nVar;
        this.R = bVar.f2234q;
        Iterator<e<Object>> it = mVar.w.iterator();
        while (it.hasNext()) {
            v(it.next());
        }
        synchronized (mVar) {
            fVar = mVar.f2298x;
        }
        w(fVar);
    }

    public final void A(g gVar, i3.a aVar) {
        boolean z;
        s6.a.n(gVar);
        if (this.Y) {
            Object obj = new Object();
            n<?, ? super TranscodeType> nVar = this.S;
            c x10 = x(aVar.f6032y, aVar.f6031x, aVar.f6027r, nVar, aVar, (d) null, gVar, obj);
            c h10 = gVar.h();
            if (x10.c(h10)) {
                if (aVar.w || !h10.k()) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    s6.a.n(h10);
                    if (!h10.isRunning()) {
                        h10.g();
                        return;
                    }
                    return;
                }
            }
            this.P.l(gVar);
            gVar.g(x10);
            m mVar = this.P;
            synchronized (mVar) {
                mVar.f2296t.f4630o.add(gVar);
                n nVar2 = mVar.f2294r;
                ((Set) nVar2.f4622c).add(x10);
                if (!nVar2.f4621b) {
                    x10.g();
                } else {
                    x10.clear();
                    if (Log.isLoggable("RequestTracker", 2)) {
                        Log.v("RequestTracker", "Paused, delaying request");
                    }
                    ((List) nVar2.d).add(x10);
                }
            }
            return;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public final l<TranscodeType> B(Object obj) {
        if (this.J) {
            return d().B(obj);
        }
        this.T = obj;
        this.Y = true;
        n();
        return this;
    }

    public final h C(int i10, int i11, j jVar, n nVar, i3.a aVar, d dVar, g gVar, Object obj) {
        Context context = this.O;
        Object obj2 = this.T;
        Class<TranscodeType> cls = this.Q;
        ArrayList arrayList = this.U;
        g gVar2 = this.R;
        return new h(context, gVar2, obj, obj2, cls, aVar, i10, i11, jVar, gVar, arrayList, dVar, gVar2.f2245g, nVar.f2302o);
    }

    public final i3.a c(i3.a aVar) {
        s6.a.n(aVar);
        return (l) super.c(aVar);
    }

    public final l<TranscodeType> v(e<TranscodeType> eVar) {
        if (this.J) {
            return d().v(eVar);
        }
        if (eVar != null) {
            if (this.U == null) {
                this.U = new ArrayList();
            }
            this.U.add(eVar);
        }
        n();
        return this;
    }

    public final l<TranscodeType> w(i3.a<?> aVar) {
        s6.a.n(aVar);
        return (l) super.c(aVar);
    }

    public final c x(int i10, int i11, j jVar, n nVar, i3.a aVar, d dVar, g gVar, Object obj) {
        b bVar;
        b bVar2;
        i iVar;
        int i12;
        n<?, ? super TranscodeType> nVar2;
        j jVar2;
        int i13;
        int i14;
        i3.a aVar2 = aVar;
        Object obj2 = obj;
        if (this.W != null) {
            bVar2 = new b(obj2, dVar);
            bVar = bVar2;
        } else {
            bVar = null;
            bVar2 = dVar;
        }
        l<TranscodeType> lVar = this.V;
        if (lVar == null) {
            iVar = C(i10, i11, jVar, nVar, aVar, bVar2, gVar, obj);
        } else if (!this.Z) {
            n<?, ? super TranscodeType> nVar3 = lVar.S;
            if (lVar.X) {
                nVar2 = nVar;
            } else {
                nVar2 = nVar3;
            }
            if (i3.a.i(lVar.f6024o, 8)) {
                jVar2 = this.V.f6027r;
            } else {
                int i15 = a.f2261b[jVar.ordinal()];
                if (i15 == 1) {
                    jVar2 = j.NORMAL;
                } else if (i15 == 2) {
                    jVar2 = j.HIGH;
                } else if (i15 == 3 || i15 == 4) {
                    jVar2 = j.IMMEDIATE;
                } else {
                    throw new IllegalArgumentException("unknown priority: " + this.f6027r);
                }
            }
            j jVar3 = jVar2;
            l<TranscodeType> lVar2 = this.V;
            int i16 = lVar2.f6032y;
            int i17 = lVar2.f6031x;
            if (j.h(i10, i11)) {
                l<TranscodeType> lVar3 = this.V;
                if (!j.h(lVar3.f6032y, lVar3.f6031x)) {
                    i14 = aVar2.f6032y;
                    i13 = aVar2.f6031x;
                    i iVar2 = new i(obj2, bVar2);
                    g gVar2 = gVar;
                    i iVar3 = iVar2;
                    h C = C(i10, i11, jVar, nVar, aVar, iVar2, gVar2, obj);
                    this.Z = true;
                    l<TranscodeType> lVar4 = this.V;
                    c x10 = lVar4.x(i14, i13, jVar3, nVar2, lVar4, iVar3, gVar2, obj);
                    this.Z = false;
                    i iVar4 = iVar3;
                    iVar4.f6061c = C;
                    iVar4.d = x10;
                    iVar = iVar4;
                }
            }
            i13 = i17;
            i14 = i16;
            i iVar22 = new i(obj2, bVar2);
            g gVar22 = gVar;
            i iVar32 = iVar22;
            h C2 = C(i10, i11, jVar, nVar, aVar, iVar22, gVar22, obj);
            this.Z = true;
            l<TranscodeType> lVar42 = this.V;
            c x102 = lVar42.x(i14, i13, jVar3, nVar2, lVar42, iVar32, gVar22, obj);
            this.Z = false;
            i iVar42 = iVar32;
            iVar42.f6061c = C2;
            iVar42.d = x102;
            iVar = iVar42;
        } else {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        if (bVar == null) {
            return iVar;
        }
        l<TranscodeType> lVar5 = this.W;
        int i18 = lVar5.f6032y;
        int i19 = lVar5.f6031x;
        if (j.h(i10, i11)) {
            l<TranscodeType> lVar6 = this.W;
            if (!j.h(lVar6.f6032y, lVar6.f6031x)) {
                int i20 = aVar2.f6032y;
                i12 = aVar2.f6031x;
                i18 = i20;
                l<TranscodeType> lVar7 = this.W;
                c x11 = lVar7.x(i18, i12, lVar7.f6027r, lVar7.S, lVar7, bVar, gVar, obj);
                bVar.f6035c = iVar;
                bVar.d = x11;
                return bVar;
            }
        }
        i12 = i19;
        l<TranscodeType> lVar72 = this.W;
        c x112 = lVar72.x(i18, i12, lVar72.f6027r, lVar72.S, lVar72, bVar, gVar, obj);
        bVar.f6035c = iVar;
        bVar.d = x112;
        return bVar;
    }

    /* renamed from: y */
    public final l<TranscodeType> d() {
        l<TranscodeType> lVar = (l) super.clone();
        lVar.S = lVar.S.clone();
        if (lVar.U != null) {
            lVar.U = new ArrayList(lVar.U);
        }
        l<TranscodeType> lVar2 = lVar.V;
        if (lVar2 != null) {
            lVar.V = lVar2.d();
        }
        l<TranscodeType> lVar3 = lVar.W;
        if (lVar3 != null) {
            lVar.W = lVar3.d();
        }
        return lVar;
    }

    public final void z(ImageView imageView) {
        boolean z;
        i3.a aVar;
        g gVar;
        char[] cArr = j.f7084a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            s6.a.n(imageView);
            if (!i3.a.i(this.f6024o, 2048) && this.B && imageView.getScaleType() != null) {
                switch (a.f2260a[imageView.getScaleType().ordinal()]) {
                    case 1:
                        aVar = d().k(k.f9822c, new z2.h());
                        break;
                    case 2:
                    case 6:
                        aVar = d().j();
                        break;
                    case 3:
                    case 4:
                    case 5:
                        aVar = d().k(k.f9820a, new q());
                        aVar.M = true;
                        break;
                }
            }
            aVar = this;
            this.R.f2242c.getClass();
            Class<TranscodeType> cls = this.Q;
            if (Bitmap.class.equals(cls)) {
                gVar = new j3.b(imageView);
            } else if (Drawable.class.isAssignableFrom(cls)) {
                gVar = new j3.d(imageView);
            } else {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            A(gVar, aVar);
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }
}

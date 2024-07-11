package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import com.squareup.picasso.t;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class w {

    /* renamed from: s  reason: collision with root package name */
    public static final long f3996s = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a  reason: collision with root package name */
    public int f3997a;

    /* renamed from: b  reason: collision with root package name */
    public long f3998b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f3999c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final List<c0> f4000e = null;

    /* renamed from: f  reason: collision with root package name */
    public final int f4001f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4002g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4003h;

    /* renamed from: i  reason: collision with root package name */
    public final int f4004i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f4005j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f4006k;
    public final float l;

    /* renamed from: m  reason: collision with root package name */
    public final float f4007m;

    /* renamed from: n  reason: collision with root package name */
    public final float f4008n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f4009o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f4010p;

    /* renamed from: q  reason: collision with root package name */
    public final Bitmap.Config f4011q;

    /* renamed from: r  reason: collision with root package name */
    public final t.d f4012r;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f4013a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4014b = 0;

        /* renamed from: c  reason: collision with root package name */
        public final Bitmap.Config f4015c;
        public t.d d;

        public a(Uri uri, Bitmap.Config config) {
            this.f4013a = uri;
            this.f4015c = config;
        }
    }

    public w(Uri uri, int i10, int i11, int i12, Bitmap.Config config, t.d dVar) {
        this.f3999c = uri;
        this.d = i10;
        this.f4001f = i11;
        this.f4002g = i12;
        this.f4003h = false;
        this.f4005j = false;
        this.f4004i = 0;
        this.f4006k = false;
        this.l = 0.0f;
        this.f4007m = 0.0f;
        this.f4008n = 0.0f;
        this.f4009o = false;
        this.f4010p = false;
        this.f4011q = config;
        this.f4012r = dVar;
    }

    public final boolean a() {
        return (this.f4001f == 0 && this.f4002g == 0) ? false : true;
    }

    public final String b() {
        StringBuilder sb;
        long nanoTime = System.nanoTime() - this.f3998b;
        if (nanoTime > f3996s) {
            sb = new StringBuilder();
            sb.append(d());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toSeconds(nanoTime));
            sb.append('s');
        } else {
            sb = new StringBuilder();
            sb.append(d());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toMillis(nanoTime));
            sb.append("ms");
        }
        return sb.toString();
    }

    public final boolean c() {
        return a() || this.l != 0.0f;
    }

    public final String d() {
        return "[R" + this.f3997a + ']';
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i10 = this.d;
        if (i10 > 0) {
            sb.append(i10);
        } else {
            sb.append(this.f3999c);
        }
        List<c0> list = this.f4000e;
        if (list != null && !list.isEmpty()) {
            for (c0 a10 : list) {
                sb.append(' ');
                sb.append(a10.a());
            }
        }
        int i11 = this.f4001f;
        if (i11 > 0) {
            sb.append(" resize(");
            sb.append(i11);
            sb.append(',');
            sb.append(this.f4002g);
            sb.append(')');
        }
        if (this.f4003h) {
            sb.append(" centerCrop");
        }
        if (this.f4005j) {
            sb.append(" centerInside");
        }
        float f10 = this.l;
        if (f10 != 0.0f) {
            sb.append(" rotation(");
            sb.append(f10);
            if (this.f4009o) {
                sb.append(" @ ");
                sb.append(this.f4007m);
                sb.append(',');
                sb.append(this.f4008n);
            }
            sb.append(')');
        }
        if (this.f4010p) {
            sb.append(" purgeable");
        }
        Bitmap.Config config = this.f4011q;
        if (config != null) {
            sb.append(' ');
            sb.append(config);
        }
        sb.append('}');
        return sb.toString();
    }
}

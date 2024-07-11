package t2;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import m3.j;

public final class i implements c {

    /* renamed from: j  reason: collision with root package name */
    public static final Bitmap.Config f8904j = Bitmap.Config.ARGB_8888;

    /* renamed from: a  reason: collision with root package name */
    public final j f8905a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Bitmap.Config> f8906b;

    /* renamed from: c  reason: collision with root package name */
    public final a f8907c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public long f8908e;

    /* renamed from: f  reason: collision with root package name */
    public int f8909f;

    /* renamed from: g  reason: collision with root package name */
    public int f8910g;

    /* renamed from: h  reason: collision with root package name */
    public int f8911h;

    /* renamed from: i  reason: collision with root package name */
    public int f8912i;

    public static final class a {
    }

    public i(long j8) {
        l lVar = new l();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add((Object) null);
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.d = j8;
        this.f8905a = lVar;
        this.f8906b = unmodifiableSet;
        this.f8907c = new a();
    }

    @SuppressLint({"InlinedApi"})
    public final void a(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 >= 40 || i10 >= 20) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            h(this.d / 2);
        }
    }

    public final void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        h(0);
    }

    public final Bitmap c(int i10, int i11, Bitmap.Config config) {
        Bitmap g10 = g(i10, i11, config);
        if (g10 != null) {
            return g10;
        }
        if (config == null) {
            config = f8904j;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    public final Bitmap d(int i10, int i11, Bitmap.Config config) {
        Bitmap g10 = g(i10, i11, config);
        if (g10 != null) {
            g10.eraseColor(0);
            return g10;
        }
        if (config == null) {
            config = f8904j;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    public final synchronized void e(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable()) {
                        ((l) this.f8905a).getClass();
                        if (((long) j.c(bitmap)) <= this.d) {
                            if (this.f8906b.contains(bitmap.getConfig())) {
                                ((l) this.f8905a).getClass();
                                int c10 = j.c(bitmap);
                                ((l) this.f8905a).f(bitmap);
                                this.f8907c.getClass();
                                this.f8911h++;
                                this.f8908e += (long) c10;
                                if (Log.isLoggable("LruBitmapPool", 2)) {
                                    Log.v("LruBitmapPool", "Put bitmap in pool=" + ((l) this.f8905a).e(bitmap));
                                }
                                if (Log.isLoggable("LruBitmapPool", 2)) {
                                    f();
                                }
                                h(this.d);
                                return;
                            }
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + ((l) this.f8905a).e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f8906b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    public final void f() {
        Log.v("LruBitmapPool", "Hits=" + this.f8909f + ", misses=" + this.f8910g + ", puts=" + this.f8911h + ", evictions=" + this.f8912i + ", currentSize=" + this.f8908e + ", maxSize=" + this.d + "\nStrategy=" + this.f8905a);
    }

    public final synchronized Bitmap g(int i10, int i11, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap b10;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                if (config == Bitmap.Config.HARDWARE) {
                    throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
                }
            }
            j jVar = this.f8905a;
            if (config != null) {
                config2 = config;
            } else {
                config2 = f8904j;
            }
            b10 = ((l) jVar).b(i10, i11, config2);
            if (b10 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder("Missing bitmap=");
                    ((l) this.f8905a).getClass();
                    sb.append(l.c(j.b(i10, i11, config), config));
                    Log.d("LruBitmapPool", sb.toString());
                }
                this.f8910g++;
            } else {
                this.f8909f++;
                long j8 = this.f8908e;
                ((l) this.f8905a).getClass();
                this.f8908e = j8 - ((long) j.c(b10));
                this.f8907c.getClass();
                b10.setHasAlpha(true);
                b10.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Get bitmap=");
                ((l) this.f8905a).getClass();
                sb2.append(l.c(j.b(i10, i11, config), config));
                Log.v("LruBitmapPool", sb2.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return b10;
    }

    public final synchronized void h(long j8) {
        while (this.f8908e > j8) {
            l lVar = (l) this.f8905a;
            Bitmap c10 = lVar.f8918b.c();
            if (c10 != null) {
                lVar.a(Integer.valueOf(j.c(c10)), c10);
            }
            if (c10 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    f();
                }
                this.f8908e = 0;
                return;
            }
            this.f8907c.getClass();
            long j10 = this.f8908e;
            ((l) this.f8905a).getClass();
            this.f8908e = j10 - ((long) j.c(c10));
            this.f8912i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + ((l) this.f8905a).e(c10));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                f();
            }
            c10.recycle();
        }
    }
}

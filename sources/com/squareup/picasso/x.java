package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.widget.ImageView;
import com.squareup.picasso.m;
import com.squareup.picasso.t;
import com.squareup.picasso.w;
import java.util.concurrent.atomic.AtomicInteger;

public final class x {
    public static final AtomicInteger d = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    public final t f4016a;

    /* renamed from: b  reason: collision with root package name */
    public final w.a f4017b;

    /* renamed from: c  reason: collision with root package name */
    public int f4018c;

    public x(t tVar, Uri uri) {
        this.f4016a = tVar;
        this.f4017b = new w.a(uri, tVar.f3982j);
    }

    public final void a(ImageView imageView) {
        boolean z;
        boolean z10;
        Bitmap bitmap;
        ImageView imageView2 = imageView;
        long nanoTime = System.nanoTime();
        StringBuilder sb = e0.f3939a;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        } else if (imageView2 != null) {
            w.a aVar = this.f4017b;
            if (aVar.f4013a == null && aVar.f4014b == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                this.f4016a.a(imageView2);
                Paint paint = u.f3988h;
                imageView2.setImageDrawable((Drawable) null);
                if (imageView.getDrawable() instanceof Animatable) {
                    ((Animatable) imageView.getDrawable()).start();
                    return;
                }
                return;
            }
            int andIncrement = d.getAndIncrement();
            w.a aVar2 = this.f4017b;
            if (aVar2.d == null) {
                aVar2.d = t.d.NORMAL;
            }
            Uri uri = aVar2.f4013a;
            int i10 = aVar2.f4014b;
            aVar2.getClass();
            aVar2.getClass();
            Bitmap.Config config = aVar2.f4015c;
            int i11 = i10;
            int i12 = i10;
            Bitmap.Config config2 = config;
            Uri uri2 = uri;
            w wVar = new w(uri, i11, 0, 0, config2, aVar2.d);
            wVar.f3997a = andIncrement;
            wVar.f3998b = nanoTime;
            if (this.f4016a.l) {
                e0.d("Main", "created", wVar.d(), wVar.toString());
            }
            ((t.e.a) this.f4016a.f3974a).getClass();
            StringBuilder sb2 = e0.f3939a;
            if (uri2 != null) {
                String uri3 = uri2.toString();
                sb2.ensureCapacity(uri3.length() + 50);
                sb2.append(uri3);
            } else {
                sb2.ensureCapacity(50);
                sb2.append(i12);
            }
            sb2.append(10);
            if (0.0f != 0.0f) {
                sb2.append("rotation:");
                sb2.append(0.0f);
                sb2.append(10);
            }
            if (wVar.a()) {
                sb2.append("resize:");
                sb2.append(0);
                sb2.append('x');
                sb2.append(0);
                sb2.append(10);
            }
            String sb3 = sb2.toString();
            sb2.setLength(0);
            if (p.shouldReadFromMemoryCache(0)) {
                t tVar = this.f4016a;
                m.a aVar3 = (m.a) ((m) tVar.f3977e).f3957a.get(sb3);
                if (aVar3 != null) {
                    bitmap = aVar3.f3958a;
                } else {
                    bitmap = null;
                }
                Bitmap bitmap2 = bitmap;
                a0 a0Var = tVar.f3978f;
                if (bitmap2 != null) {
                    a0Var.f3896b.sendEmptyMessage(0);
                } else {
                    a0Var.f3896b.sendEmptyMessage(1);
                }
                if (bitmap2 != null) {
                    this.f4016a.a(imageView2);
                    t tVar2 = this.f4016a;
                    Context context = tVar2.f3976c;
                    t.c cVar = t.c.MEMORY;
                    u.a(imageView, context, bitmap2, cVar, false, tVar2.f3983k);
                    if (this.f4016a.l) {
                        String d10 = wVar.d();
                        e0.d("Main", "completed", d10, "from " + cVar);
                        return;
                    }
                    return;
                }
            }
            Paint paint2 = u.f3988h;
            imageView2.setImageDrawable((Drawable) null);
            if (imageView.getDrawable() instanceof Animatable) {
                ((Animatable) imageView.getDrawable()).start();
            }
            this.f4016a.c(new k(this.f4016a, imageView, wVar, this.f4018c, sb3));
        } else {
            throw new IllegalArgumentException("Target must not be null.");
        }
    }

    public final void b(q qVar, q... qVarArr) {
        if (qVar != null) {
            this.f4018c = qVar.index | this.f4018c;
            if (qVarArr.length > 0) {
                int length = qVarArr.length;
                int i10 = 0;
                while (i10 < length) {
                    q qVar2 = qVarArr[i10];
                    if (qVar2 != null) {
                        this.f4018c = qVar2.index | this.f4018c;
                        i10++;
                    } else {
                        throw new IllegalArgumentException("Network policy cannot be null.");
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Network policy cannot be null.");
    }
}

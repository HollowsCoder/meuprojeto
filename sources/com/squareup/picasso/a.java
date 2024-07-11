package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.t;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final t f3884a;

    /* renamed from: b  reason: collision with root package name */
    public final w f3885b;

    /* renamed from: c  reason: collision with root package name */
    public final C0045a f3886c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3887e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3888f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3889g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f3890h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3891i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f3892j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3893k;
    public boolean l;

    /* renamed from: com.squareup.picasso.a$a  reason: collision with other inner class name */
    public static class C0045a<M> extends WeakReference<M> {

        /* renamed from: a  reason: collision with root package name */
        public final a f3894a;

        public C0045a(a aVar, M m10, ReferenceQueue<? super M> referenceQueue) {
            super(m10, referenceQueue);
            this.f3894a = aVar;
        }
    }

    public a(t tVar, Object obj, w wVar, int i10, String str) {
        this.f3884a = tVar;
        this.f3885b = wVar;
        this.f3886c = obj == null ? null : new C0045a(this, obj, tVar.f3981i);
        this.f3887e = 0;
        this.f3888f = i10;
        this.d = false;
        this.f3889g = 0;
        this.f3890h = null;
        this.f3891i = str;
        this.f3892j = this;
    }

    public void a() {
        this.l = true;
    }

    public abstract void b(Bitmap bitmap, t.c cVar);

    public abstract void c();

    public final T d() {
        C0045a aVar = this.f3886c;
        if (aVar == null) {
            return null;
        }
        return aVar.get();
    }
}

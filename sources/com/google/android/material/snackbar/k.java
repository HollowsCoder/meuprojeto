package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.ref.WeakReference;

public final class k {

    /* renamed from: e  reason: collision with root package name */
    public static k f3570e;

    /* renamed from: a  reason: collision with root package name */
    public final Object f3571a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f3572b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c  reason: collision with root package name */
    public c f3573c;
    public c d;

    public class a implements Handler.Callback {
        public a() {
        }

        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            k kVar = k.this;
            c cVar = (c) message.obj;
            synchronized (kVar.f3571a) {
                if (kVar.f3573c == cVar || kVar.d == cVar) {
                    kVar.a(cVar, 2);
                }
            }
            return true;
        }
    }

    public interface b {
        void a();

        void b(int i10);
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<b> f3575a;

        /* renamed from: b  reason: collision with root package name */
        public int f3576b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f3577c;

        public c(int i10, BaseTransientBottomBar.c cVar) {
            this.f3575a = new WeakReference<>(cVar);
            this.f3576b = i10;
        }
    }

    public static k b() {
        if (f3570e == null) {
            f3570e = new k();
        }
        return f3570e;
    }

    public final boolean a(c cVar, int i10) {
        b bVar = cVar.f3575a.get();
        if (bVar == null) {
            return false;
        }
        this.f3572b.removeCallbacksAndMessages(cVar);
        bVar.b(i10);
        return true;
    }

    public final boolean c(BaseTransientBottomBar.c cVar) {
        boolean z;
        c cVar2 = this.f3573c;
        if (cVar2 == null) {
            return false;
        }
        if (cVar == null || cVar2.f3575a.get() != cVar) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public final void d(c cVar) {
        int i10 = cVar.f3576b;
        if (i10 != -2) {
            if (i10 <= 0) {
                i10 = i10 == -1 ? 1500 : 2750;
            }
            Handler handler = this.f3572b;
            handler.removeCallbacksAndMessages(cVar);
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i10);
        }
    }
}

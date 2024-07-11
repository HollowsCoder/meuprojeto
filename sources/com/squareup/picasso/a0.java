package com.squareup.picasso;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final d f3895a;

    /* renamed from: b  reason: collision with root package name */
    public final a f3896b;

    /* renamed from: c  reason: collision with root package name */
    public long f3897c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public long f3898e;

    /* renamed from: f  reason: collision with root package name */
    public long f3899f;

    /* renamed from: g  reason: collision with root package name */
    public long f3900g;

    /* renamed from: h  reason: collision with root package name */
    public long f3901h;

    /* renamed from: i  reason: collision with root package name */
    public long f3902i;

    /* renamed from: j  reason: collision with root package name */
    public long f3903j;

    /* renamed from: k  reason: collision with root package name */
    public int f3904k;
    public int l;

    /* renamed from: m  reason: collision with root package name */
    public int f3905m;

    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final a0 f3906a;

        /* renamed from: com.squareup.picasso.a0$a$a  reason: collision with other inner class name */
        public class C0046a implements Runnable {

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ Message f3907o;

            public C0046a(Message message) {
                this.f3907o = message;
            }

            public final void run() {
                throw new AssertionError("Unhandled stats message." + this.f3907o.what);
            }
        }

        public a(Looper looper, a0 a0Var) {
            super(looper);
            this.f3906a = a0Var;
        }

        public final void handleMessage(Message message) {
            int i10 = message.what;
            a0 a0Var = this.f3906a;
            if (i10 == 0) {
                a0Var.f3897c++;
            } else if (i10 == 1) {
                a0Var.d++;
            } else if (i10 == 2) {
                long j8 = (long) message.arg1;
                int i11 = a0Var.l + 1;
                a0Var.l = i11;
                long j10 = a0Var.f3899f + j8;
                a0Var.f3899f = j10;
                a0Var.f3902i = j10 / ((long) i11);
            } else if (i10 == 3) {
                long j11 = (long) message.arg1;
                a0Var.f3905m++;
                long j12 = a0Var.f3900g + j11;
                a0Var.f3900g = j12;
                a0Var.f3903j = j12 / ((long) a0Var.l);
            } else if (i10 != 4) {
                t.f3972m.post(new C0046a(message));
            } else {
                a0Var.f3904k++;
                long longValue = ((Long) message.obj).longValue() + a0Var.f3898e;
                a0Var.f3898e = longValue;
                a0Var.f3901h = longValue / ((long) a0Var.f3904k);
            }
        }
    }

    public a0(d dVar) {
        this.f3895a = dVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        StringBuilder sb = e0.f3939a;
        d0 d0Var = new d0(looper);
        d0Var.sendMessageDelayed(d0Var.obtainMessage(), 1000);
        this.f3896b = new a(handlerThread.getLooper(), this);
    }

    public final b0 a() {
        m mVar = (m) this.f3895a;
        int maxSize = mVar.f3957a.maxSize();
        int size = mVar.f3957a.size();
        return new b0(maxSize, size, this.f3897c, this.d, this.f3898e, this.f3899f, this.f3900g, this.f3901h, this.f3902i, this.f3903j, this.f3904k, this.l, this.f3905m, System.currentTimeMillis());
    }
}

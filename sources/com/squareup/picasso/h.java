package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import com.karumi.dexter.BuildConfig;
import com.squareup.picasso.t;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3943a;

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f3944b;

    /* renamed from: c  reason: collision with root package name */
    public final i f3945c;
    public final LinkedHashMap d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public final WeakHashMap f3946e = new WeakHashMap();

    /* renamed from: f  reason: collision with root package name */
    public final WeakHashMap f3947f = new WeakHashMap();

    /* renamed from: g  reason: collision with root package name */
    public final LinkedHashSet f3948g = new LinkedHashSet();

    /* renamed from: h  reason: collision with root package name */
    public final a f3949h;

    /* renamed from: i  reason: collision with root package name */
    public final Handler f3950i;

    /* renamed from: j  reason: collision with root package name */
    public final d f3951j;

    /* renamed from: k  reason: collision with root package name */
    public final a0 f3952k;
    public final ArrayList l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f3953m;

    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final h f3954a;

        /* renamed from: com.squareup.picasso.h$a$a  reason: collision with other inner class name */
        public class C0048a implements Runnable {

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ Message f3955o;

            public C0048a(Message message) {
                this.f3955o = message;
            }

            public final void run() {
                throw new AssertionError("Unknown handler message received: " + this.f3955o.what);
            }
        }

        public a(Looper looper, h hVar) {
            super(looper);
            this.f3954a = hVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v74, resolved type: java.util.ArrayList} */
        /* JADX WARNING: type inference failed for: r1v66, types: [java.util.List] */
        /* JADX WARNING: type inference failed for: r1v71 */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x002e, code lost:
            r1 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0169, code lost:
            if (r4 != 12) goto L_0x016f;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:134:0x02b5  */
        /* JADX WARNING: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r15) {
            /*
                r14 = this;
                int r0 = r15.what
                r1 = 0
                java.lang.String r2 = "canceled"
                java.lang.String r3 = "Dispatcher"
                switch(r0) {
                    case 1: goto L_0x03d6;
                    case 2: goto L_0x0360;
                    case 3: goto L_0x000a;
                    case 4: goto L_0x02e8;
                    case 5: goto L_0x0225;
                    case 6: goto L_0x0219;
                    case 7: goto L_0x01b5;
                    case 8: goto L_0x000a;
                    case 9: goto L_0x0132;
                    case 10: goto L_0x0129;
                    case 11: goto L_0x005f;
                    case 12: goto L_0x0016;
                    default: goto L_0x000a;
                }
            L_0x000a:
                com.squareup.picasso.t$a r0 = com.squareup.picasso.t.f3972m
                com.squareup.picasso.h$a$a r1 = new com.squareup.picasso.h$a$a
                r1.<init>(r15)
                r0.post(r1)
                goto L_0x03e0
            L_0x0016:
                java.lang.Object r15 = r15.obj
                com.squareup.picasso.h r0 = r14.f3954a
                java.util.LinkedHashSet r2 = r0.f3948g
                boolean r2 = r2.remove(r15)
                if (r2 != 0) goto L_0x0024
                goto L_0x03e0
            L_0x0024:
                java.util.WeakHashMap r2 = r0.f3947f
                java.util.Collection r2 = r2.values()
                java.util.Iterator r2 = r2.iterator()
            L_0x002e:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0050
                java.lang.Object r3 = r2.next()
                com.squareup.picasso.a r3 = (com.squareup.picasso.a) r3
                java.lang.Object r4 = r3.f3892j
                boolean r4 = r4.equals(r15)
                if (r4 == 0) goto L_0x002e
                if (r1 != 0) goto L_0x0049
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
            L_0x0049:
                r1.add(r3)
                r2.remove()
                goto L_0x002e
            L_0x0050:
                if (r1 == 0) goto L_0x03e0
                android.os.Handler r15 = r0.f3950i
                r0 = 13
                android.os.Message r0 = r15.obtainMessage(r0, r1)
                r15.sendMessage(r0)
                goto L_0x03e0
            L_0x005f:
                java.lang.Object r15 = r15.obj
                com.squareup.picasso.h r0 = r14.f3954a
                java.util.LinkedHashSet r1 = r0.f3948g
                boolean r1 = r1.add(r15)
                if (r1 != 0) goto L_0x006d
                goto L_0x03e0
            L_0x006d:
                java.util.LinkedHashMap r1 = r0.d
                java.util.Collection r1 = r1.values()
                java.util.Iterator r1 = r1.iterator()
            L_0x0077:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L_0x03e0
                java.lang.Object r4 = r1.next()
                com.squareup.picasso.c r4 = (com.squareup.picasso.c) r4
                com.squareup.picasso.t r5 = r4.f3924p
                boolean r5 = r5.l
                com.squareup.picasso.a r6 = r4.f3931y
                java.util.ArrayList r7 = r4.z
                if (r7 == 0) goto L_0x0095
                boolean r8 = r7.isEmpty()
                if (r8 != 0) goto L_0x0095
                r8 = 1
                goto L_0x0096
            L_0x0095:
                r8 = 0
            L_0x0096:
                if (r6 != 0) goto L_0x009b
                if (r8 != 0) goto L_0x009b
                goto L_0x0077
            L_0x009b:
                java.lang.String r9 = "' was paused"
                java.lang.String r10 = "because tag '"
                java.lang.String r11 = "paused"
                if (r6 == 0) goto L_0x00d1
                java.lang.Object r12 = r6.f3892j
                boolean r12 = r12.equals(r15)
                if (r12 == 0) goto L_0x00d1
                r4.d(r6)
                java.util.WeakHashMap r12 = r0.f3947f
                java.lang.Object r13 = r6.d()
                r12.put(r13, r6)
                if (r5 == 0) goto L_0x00d1
                com.squareup.picasso.w r6 = r6.f3885b
                java.lang.String r6 = r6.b()
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>(r10)
                r12.append(r15)
                r12.append(r9)
                java.lang.String r12 = r12.toString()
                com.squareup.picasso.e0.d(r3, r11, r6, r12)
            L_0x00d1:
                if (r8 == 0) goto L_0x0113
                int r6 = r7.size()
                int r6 = r6 + -1
            L_0x00d9:
                if (r6 < 0) goto L_0x0113
                java.lang.Object r8 = r7.get(r6)
                com.squareup.picasso.a r8 = (com.squareup.picasso.a) r8
                java.lang.Object r12 = r8.f3892j
                boolean r12 = r12.equals(r15)
                if (r12 != 0) goto L_0x00ea
                goto L_0x0110
            L_0x00ea:
                r4.d(r8)
                java.util.WeakHashMap r12 = r0.f3947f
                java.lang.Object r13 = r8.d()
                r12.put(r13, r8)
                if (r5 == 0) goto L_0x0110
                com.squareup.picasso.w r8 = r8.f3885b
                java.lang.String r8 = r8.b()
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>(r10)
                r12.append(r15)
                r12.append(r9)
                java.lang.String r12 = r12.toString()
                com.squareup.picasso.e0.d(r3, r11, r8, r12)
            L_0x0110:
                int r6 = r6 + -1
                goto L_0x00d9
            L_0x0113:
                boolean r6 = r4.b()
                if (r6 == 0) goto L_0x0077
                r1.remove()
                if (r5 == 0) goto L_0x0077
                java.lang.String r4 = com.squareup.picasso.e0.a(r4)
                java.lang.String r5 = "all actions paused"
                com.squareup.picasso.e0.d(r3, r2, r4, r5)
                goto L_0x0077
            L_0x0129:
                com.squareup.picasso.h r0 = r14.f3954a
                int r15 = r15.arg1
                r0.getClass()
                goto L_0x03e0
            L_0x0132:
                java.lang.Object r15 = r15.obj
                android.net.NetworkInfo r15 = (android.net.NetworkInfo) r15
                com.squareup.picasso.h r0 = r14.f3954a
                java.util.concurrent.ExecutorService r1 = r0.f3944b
                boolean r2 = r1 instanceof com.squareup.picasso.v
                if (r2 == 0) goto L_0x0176
                com.squareup.picasso.v r1 = (com.squareup.picasso.v) r1
                r2 = 3
                if (r15 == 0) goto L_0x0173
                r1.getClass()
                boolean r4 = r15.isConnectedOrConnecting()
                if (r4 != 0) goto L_0x014d
                goto L_0x0173
            L_0x014d:
                int r4 = r15.getType()
                if (r4 == 0) goto L_0x0160
                r5 = 1
                if (r4 == r5) goto L_0x015e
                r5 = 6
                if (r4 == r5) goto L_0x015e
                r5 = 9
                if (r4 == r5) goto L_0x015e
                goto L_0x016f
            L_0x015e:
                r2 = 4
                goto L_0x016f
            L_0x0160:
                int r4 = r15.getSubtype()
                switch(r4) {
                    case 1: goto L_0x016c;
                    case 2: goto L_0x016c;
                    case 3: goto L_0x016e;
                    case 4: goto L_0x016e;
                    case 5: goto L_0x016e;
                    case 6: goto L_0x016e;
                    default: goto L_0x0167;
                }
            L_0x0167:
                r5 = 12
                if (r4 == r5) goto L_0x016e
                goto L_0x016f
            L_0x016c:
                r2 = 1
                goto L_0x016f
            L_0x016e:
                r2 = 2
            L_0x016f:
                r1.a(r2)
                goto L_0x0176
            L_0x0173:
                r1.a(r2)
            L_0x0176:
                if (r15 == 0) goto L_0x03e0
                boolean r15 = r15.isConnected()
                if (r15 == 0) goto L_0x03e0
                java.util.WeakHashMap r15 = r0.f3946e
                boolean r15 = r15.isEmpty()
                if (r15 != 0) goto L_0x03e0
                java.util.WeakHashMap r15 = r0.f3946e
                java.util.Collection r15 = r15.values()
                java.util.Iterator r15 = r15.iterator()
            L_0x0190:
                boolean r1 = r15.hasNext()
                if (r1 == 0) goto L_0x03e0
                java.lang.Object r1 = r15.next()
                com.squareup.picasso.a r1 = (com.squareup.picasso.a) r1
                r15.remove()
                com.squareup.picasso.t r2 = r1.f3884a
                boolean r2 = r2.l
                if (r2 == 0) goto L_0x01b0
                com.squareup.picasso.w r2 = r1.f3885b
                java.lang.String r2 = r2.b()
                java.lang.String r4 = "replaying"
                com.squareup.picasso.e0.c(r3, r4, r2)
            L_0x01b0:
                r2 = 0
                r0.e(r1, r2)
                goto L_0x0190
            L_0x01b5:
                com.squareup.picasso.h r15 = r14.f3954a
                r15.getClass()
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.ArrayList r1 = r15.l
                r0.<init>(r1)
                java.util.ArrayList r1 = r15.l
                r1.clear()
                android.os.Handler r15 = r15.f3950i
                r1 = 8
                android.os.Message r1 = r15.obtainMessage(r1, r0)
                r15.sendMessage(r1)
                boolean r15 = r0.isEmpty()
                if (r15 == 0) goto L_0x01d9
                goto L_0x03e0
            L_0x01d9:
                r15 = 0
                java.lang.Object r15 = r0.get(r15)
                com.squareup.picasso.c r15 = (com.squareup.picasso.c) r15
                com.squareup.picasso.t r15 = r15.f3924p
                boolean r15 = r15.l
                if (r15 == 0) goto L_0x03e0
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x01ef:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x020e
                java.lang.Object r1 = r0.next()
                com.squareup.picasso.c r1 = (com.squareup.picasso.c) r1
                int r2 = r15.length()
                if (r2 <= 0) goto L_0x0206
                java.lang.String r2 = ", "
                r15.append(r2)
            L_0x0206:
                java.lang.String r1 = com.squareup.picasso.e0.a(r1)
                r15.append(r1)
                goto L_0x01ef
            L_0x020e:
                java.lang.String r15 = r15.toString()
                java.lang.String r0 = "delivered"
                com.squareup.picasso.e0.c(r3, r0, r15)
                goto L_0x03e0
            L_0x0219:
                java.lang.Object r15 = r15.obj
                com.squareup.picasso.c r15 = (com.squareup.picasso.c) r15
                com.squareup.picasso.h r0 = r14.f3954a
                r1 = 0
                r0.d(r15, r1)
                goto L_0x03e0
            L_0x0225:
                java.lang.Object r15 = r15.obj
                com.squareup.picasso.c r15 = (com.squareup.picasso.c) r15
                com.squareup.picasso.h r0 = r14.f3954a
                r0.getClass()
                java.util.concurrent.Future<?> r2 = r15.B
                if (r2 == 0) goto L_0x023a
                boolean r2 = r2.isCancelled()
                if (r2 == 0) goto L_0x023a
                r2 = 1
                goto L_0x023b
            L_0x023a:
                r2 = 0
            L_0x023b:
                if (r2 == 0) goto L_0x023f
                goto L_0x03e0
            L_0x023f:
                java.util.concurrent.ExecutorService r2 = r0.f3944b
                boolean r2 = r2.isShutdown()
                r4 = 0
                if (r2 == 0) goto L_0x024d
                r0.d(r15, r4)
                goto L_0x03e0
            L_0x024d:
                boolean r2 = r0.f3953m
                if (r2 == 0) goto L_0x0261
                android.content.Context r1 = r0.f3943a
                java.lang.StringBuilder r2 = com.squareup.picasso.e0.f3939a
                java.lang.String r2 = "connectivity"
                java.lang.Object r1 = r1.getSystemService(r2)
                android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
                android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            L_0x0261:
                int r2 = r15.F
                if (r2 <= 0) goto L_0x0267
                r5 = 1
                goto L_0x0268
            L_0x0267:
                r5 = r4
            L_0x0268:
                if (r5 != 0) goto L_0x026c
                r1 = r4
                goto L_0x0276
            L_0x026c:
                int r2 = r2 + -1
                r15.F = r2
                com.squareup.picasso.y r2 = r15.f3930x
                boolean r1 = r2.f(r1)
            L_0x0276:
                if (r1 == 0) goto L_0x02a0
                com.squareup.picasso.t r1 = r15.f3924p
                boolean r1 = r1.l
                if (r1 == 0) goto L_0x0287
                java.lang.String r1 = "retrying"
                java.lang.String r2 = com.squareup.picasso.e0.a(r15)
                com.squareup.picasso.e0.c(r3, r1, r2)
            L_0x0287:
                java.lang.Exception r1 = r15.D
                boolean r1 = r1 instanceof com.squareup.picasso.r.a
                if (r1 == 0) goto L_0x0296
                int r1 = r15.w
                com.squareup.picasso.q r2 = com.squareup.picasso.q.NO_CACHE
                int r2 = r2.index
                r1 = r1 | r2
                r15.w = r1
            L_0x0296:
                java.util.concurrent.ExecutorService r0 = r0.f3944b
                java.util.concurrent.Future r0 = r0.submit(r15)
                r15.B = r0
                goto L_0x03e0
            L_0x02a0:
                boolean r1 = r0.f3953m
                if (r1 == 0) goto L_0x02af
                com.squareup.picasso.y r1 = r15.f3930x
                r1.getClass()
                boolean r1 = r1 instanceof com.squareup.picasso.r
                if (r1 == 0) goto L_0x02af
                r1 = 1
                goto L_0x02b0
            L_0x02af:
                r1 = r4
            L_0x02b0:
                r0.d(r15, r1)
                if (r1 == 0) goto L_0x03e0
                com.squareup.picasso.a r1 = r15.f3931y
                if (r1 == 0) goto L_0x02c7
                java.lang.Object r2 = r1.d()
                if (r2 == 0) goto L_0x02c7
                r3 = 1
                r1.f3893k = r3
                java.util.WeakHashMap r3 = r0.f3946e
                r3.put(r2, r1)
            L_0x02c7:
                java.util.ArrayList r15 = r15.z
                if (r15 == 0) goto L_0x03e0
                int r1 = r15.size()
            L_0x02cf:
                if (r4 >= r1) goto L_0x03e0
                java.lang.Object r2 = r15.get(r4)
                com.squareup.picasso.a r2 = (com.squareup.picasso.a) r2
                java.lang.Object r3 = r2.d()
                if (r3 == 0) goto L_0x02e5
                r5 = 1
                r2.f3893k = r5
                java.util.WeakHashMap r5 = r0.f3946e
                r5.put(r3, r2)
            L_0x02e5:
                int r4 = r4 + 1
                goto L_0x02cf
            L_0x02e8:
                java.lang.Object r15 = r15.obj
                com.squareup.picasso.c r15 = (com.squareup.picasso.c) r15
                com.squareup.picasso.h r0 = r14.f3954a
                r0.getClass()
                int r1 = r15.f3929v
                boolean r1 = com.squareup.picasso.p.shouldWriteToMemoryCache(r1)
                if (r1 == 0) goto L_0x0343
                com.squareup.picasso.d r1 = r0.f3951j
                java.lang.String r2 = r15.f3928t
                android.graphics.Bitmap r4 = r15.A
                com.squareup.picasso.m r1 = (com.squareup.picasso.m) r1
                r1.getClass()
                if (r2 == 0) goto L_0x033b
                if (r4 == 0) goto L_0x033b
                java.lang.StringBuilder r5 = com.squareup.picasso.e0.f3939a
                int r5 = r4.getAllocationByteCount()
                if (r5 < 0) goto L_0x0327
                com.squareup.picasso.l r6 = r1.f3957a
                int r6 = r6.maxSize()
                com.squareup.picasso.l r1 = r1.f3957a
                if (r5 <= r6) goto L_0x031e
                r1.remove(r2)
                goto L_0x0343
            L_0x031e:
                com.squareup.picasso.m$a r6 = new com.squareup.picasso.m$a
                r6.<init>(r4, r5)
                r1.put(r2, r6)
                goto L_0x0343
            L_0x0327:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Negative size: "
                r0.<init>(r1)
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                r15.<init>(r0)
                throw r15
            L_0x033b:
                java.lang.NullPointerException r15 = new java.lang.NullPointerException
                java.lang.String r0 = "key == null || bitmap == null"
                r15.<init>(r0)
                throw r15
            L_0x0343:
                java.util.LinkedHashMap r1 = r0.d
                java.lang.String r2 = r15.f3928t
                r1.remove(r2)
                r0.a(r15)
                com.squareup.picasso.t r0 = r15.f3924p
                boolean r0 = r0.l
                if (r0 == 0) goto L_0x03e0
                java.lang.String r15 = com.squareup.picasso.e0.a(r15)
                java.lang.String r0 = "for completion"
                java.lang.String r1 = "batched"
                com.squareup.picasso.e0.d(r3, r1, r15, r0)
                goto L_0x03e0
            L_0x0360:
                java.lang.Object r15 = r15.obj
                com.squareup.picasso.a r15 = (com.squareup.picasso.a) r15
                com.squareup.picasso.h r0 = r14.f3954a
                r0.getClass()
                java.lang.String r1 = r15.f3891i
                java.util.LinkedHashMap r4 = r0.d
                java.lang.Object r4 = r4.get(r1)
                com.squareup.picasso.c r4 = (com.squareup.picasso.c) r4
                if (r4 == 0) goto L_0x0392
                r4.d(r15)
                boolean r4 = r4.b()
                if (r4 == 0) goto L_0x0392
                java.util.LinkedHashMap r4 = r0.d
                r4.remove(r1)
                com.squareup.picasso.t r1 = r15.f3884a
                boolean r1 = r1.l
                if (r1 == 0) goto L_0x0392
                com.squareup.picasso.w r1 = r15.f3885b
                java.lang.String r1 = r1.b()
                com.squareup.picasso.e0.c(r3, r2, r1)
            L_0x0392:
                java.util.LinkedHashSet r1 = r0.f3948g
                java.lang.Object r4 = r15.f3892j
                boolean r1 = r1.contains(r4)
                if (r1 == 0) goto L_0x03b6
                java.util.WeakHashMap r1 = r0.f3947f
                java.lang.Object r4 = r15.d()
                r1.remove(r4)
                com.squareup.picasso.t r1 = r15.f3884a
                boolean r1 = r1.l
                if (r1 == 0) goto L_0x03b6
                com.squareup.picasso.w r1 = r15.f3885b
                java.lang.String r1 = r1.b()
                java.lang.String r4 = "because paused request got canceled"
                com.squareup.picasso.e0.d(r3, r2, r1, r4)
            L_0x03b6:
                java.util.WeakHashMap r0 = r0.f3946e
                java.lang.Object r15 = r15.d()
                java.lang.Object r15 = r0.remove(r15)
                com.squareup.picasso.a r15 = (com.squareup.picasso.a) r15
                if (r15 == 0) goto L_0x03e0
                com.squareup.picasso.t r0 = r15.f3884a
                boolean r0 = r0.l
                if (r0 == 0) goto L_0x03e0
                com.squareup.picasso.w r15 = r15.f3885b
                java.lang.String r15 = r15.b()
                java.lang.String r0 = "from replaying"
                com.squareup.picasso.e0.d(r3, r2, r15, r0)
                goto L_0x03e0
            L_0x03d6:
                java.lang.Object r15 = r15.obj
                com.squareup.picasso.a r15 = (com.squareup.picasso.a) r15
                com.squareup.picasso.h r0 = r14.f3954a
                r1 = 1
                r0.e(r15, r1)
            L_0x03e0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.h.a.handleMessage(android.os.Message):void");
        }
    }

    public static class b extends HandlerThread {
        public b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    public static class c extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public final h f3956a;

        public c(h hVar) {
            this.f3956a = hVar;
        }

        @SuppressLint({"MissingPermission"})
        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                boolean equals = "android.intent.action.AIRPLANE_MODE".equals(action);
                h hVar = this.f3956a;
                if (equals) {
                    if (intent.hasExtra("state")) {
                        boolean booleanExtra = intent.getBooleanExtra("state", false);
                        a aVar = hVar.f3949h;
                        aVar.sendMessage(aVar.obtainMessage(10, booleanExtra ? 1 : 0, 0));
                    }
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    StringBuilder sb = e0.f3939a;
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                    a aVar2 = hVar.f3949h;
                    aVar2.sendMessage(aVar2.obtainMessage(9, activeNetworkInfo));
                }
            }
        }
    }

    public h(Context context, ExecutorService executorService, t.a aVar, i iVar, d dVar, a0 a0Var) {
        b bVar = new b();
        bVar.start();
        Looper looper = bVar.getLooper();
        StringBuilder sb = e0.f3939a;
        d0 d0Var = new d0(looper);
        d0Var.sendMessageDelayed(d0Var.obtainMessage(), 1000);
        this.f3943a = context;
        this.f3944b = executorService;
        this.f3949h = new a(bVar.getLooper(), this);
        this.f3945c = iVar;
        this.f3950i = aVar;
        this.f3951j = dVar;
        this.f3952k = a0Var;
        this.l = new ArrayList(4);
        boolean z = true;
        try {
            int i10 = Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (NullPointerException | SecurityException unused) {
        }
        this.f3953m = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 ? false : z;
        c cVar = new c(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        h hVar = cVar.f3956a;
        if (hVar.f3953m) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        hVar.f3943a.registerReceiver(cVar, intentFilter);
    }

    public final void a(c cVar) {
        boolean z;
        Future<?> future = cVar.B;
        if (future == null || !future.isCancelled()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            Bitmap bitmap = cVar.A;
            if (bitmap != null) {
                bitmap.prepareToDraw();
            }
            this.l.add(cVar);
            a aVar = this.f3949h;
            if (!aVar.hasMessages(7)) {
                aVar.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    public final void b(c cVar) {
        a aVar = this.f3949h;
        aVar.sendMessage(aVar.obtainMessage(4, cVar));
    }

    public final void c(c cVar) {
        a aVar = this.f3949h;
        aVar.sendMessage(aVar.obtainMessage(6, cVar));
    }

    public final void d(c cVar, boolean z) {
        String str;
        if (cVar.f3924p.l) {
            String a10 = e0.a(cVar);
            if (z) {
                str = " (will replay)";
            } else {
                str = BuildConfig.FLAVOR;
            }
            e0.d("Dispatcher", "batched", a10, "for error".concat(str));
        }
        this.d.remove(cVar.f3928t);
        a(cVar);
    }

    public final void e(a aVar, boolean z) {
        c cVar;
        String str;
        String str2;
        if (this.f3948g.contains(aVar.f3892j)) {
            this.f3947f.put(aVar.d(), aVar);
            if (aVar.f3884a.l) {
                String b10 = aVar.f3885b.b();
                e0.d("Dispatcher", "paused", b10, "because tag '" + aVar.f3892j + "' is paused");
                return;
            }
            return;
        }
        c cVar2 = (c) this.d.get(aVar.f3891i);
        if (cVar2 != null) {
            boolean z10 = cVar2.f3924p.l;
            w wVar = aVar.f3885b;
            if (cVar2.f3931y == null) {
                cVar2.f3931y = aVar;
                if (z10) {
                    ArrayList arrayList = cVar2.z;
                    if (arrayList == null || arrayList.isEmpty()) {
                        str2 = wVar.b();
                        str = "to empty hunter";
                    } else {
                        str2 = wVar.b();
                        str = e0.b(cVar2, "to ");
                    }
                    e0.d("Hunter", "joined", str2, str);
                    return;
                }
                return;
            }
            if (cVar2.z == null) {
                cVar2.z = new ArrayList(3);
            }
            cVar2.z.add(aVar);
            if (z10) {
                e0.d("Hunter", "joined", wVar.b(), e0.b(cVar2, "to "));
            }
            t.d dVar = aVar.f3885b.f4012r;
            if (dVar.ordinal() > cVar2.G.ordinal()) {
                cVar2.G = dVar;
            }
        } else if (!this.f3944b.isShutdown()) {
            t tVar = aVar.f3884a;
            d dVar2 = this.f3951j;
            a0 a0Var = this.f3952k;
            Object obj = c.H;
            w wVar2 = aVar.f3885b;
            List<y> list = tVar.f3975b;
            int size = list.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    cVar = new c(tVar, this, dVar2, a0Var, aVar, c.K);
                    break;
                }
                y yVar = list.get(i10);
                if (yVar.b(wVar2)) {
                    cVar = new c(tVar, this, dVar2, a0Var, aVar, yVar);
                    break;
                }
                i10++;
            }
            cVar.B = this.f3944b.submit(cVar);
            this.d.put(aVar.f3891i, cVar);
            if (z) {
                this.f3946e.remove(aVar.d());
            }
            if (aVar.f3884a.l) {
                e0.c("Dispatcher", "enqueued", aVar.f3885b.b());
            }
        } else if (aVar.f3884a.l) {
            e0.d("Dispatcher", "ignored", aVar.f3885b.b(), "because shut down");
        }
    }
}

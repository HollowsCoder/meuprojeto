package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.g;
import androidx.lifecycle.c0;
import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.navigation.d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class NavController {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1434a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f1435b;

    /* renamed from: c  reason: collision with root package name */
    public l f1436c;
    public i d;

    /* renamed from: e  reason: collision with root package name */
    public Bundle f1437e;

    /* renamed from: f  reason: collision with root package name */
    public Parcelable[] f1438f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1439g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayDeque f1440h = new ArrayDeque();

    /* renamed from: i  reason: collision with root package name */
    public n f1441i;

    /* renamed from: j  reason: collision with root package name */
    public f f1442j;

    /* renamed from: k  reason: collision with root package name */
    public final q f1443k = new q();
    public final CopyOnWriteArrayList<b> l = new CopyOnWriteArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public final m f1444m = new l() {
        public final void f(n nVar, h.b bVar) {
            h.c cVar;
            NavController navController = NavController.this;
            if (navController.d != null) {
                Iterator it = navController.f1440h.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    dVar.getClass();
                    switch (d.a.f1463a[bVar.ordinal()]) {
                        case 1:
                        case 2:
                            cVar = h.c.CREATED;
                            break;
                        case 3:
                        case 4:
                            cVar = h.c.STARTED;
                            break;
                        case 5:
                            cVar = h.c.RESUMED;
                            break;
                        case 6:
                            cVar = h.c.DESTROYED;
                            break;
                        default:
                            throw new IllegalArgumentException("Unexpected event value " + bVar);
                    }
                    dVar.u = cVar;
                    dVar.a();
                }
            }
        }
    };

    /* renamed from: n  reason: collision with root package name */
    public final a f1445n = new a();

    /* renamed from: o  reason: collision with root package name */
    public boolean f1446o = true;

    public class a extends g {
        public a() {
        }

        public final void a() {
            NavController.this.e();
        }
    }

    public interface b {
        void a();
    }

    public NavController(Context context) {
        this.f1434a = context;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof Activity) {
                this.f1435b = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        q qVar = this.f1443k;
        qVar.a(new j(qVar));
        this.f1443k.a(new a(this.f1434a));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d9 A[LOOP:4: B:48:0x00d3->B:50:0x00d9, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r11 = this;
        L_0x0000:
            java.util.ArrayDeque r0 = r11.f1440h
            boolean r1 = r0.isEmpty()
            r2 = 1
            if (r1 != 0) goto L_0x0026
            java.lang.Object r1 = r0.peekLast()
            androidx.navigation.d r1 = (androidx.navigation.d) r1
            androidx.navigation.h r1 = r1.f1456p
            boolean r1 = r1 instanceof androidx.navigation.i
            if (r1 == 0) goto L_0x0026
            java.lang.Object r1 = r0.peekLast()
            androidx.navigation.d r1 = (androidx.navigation.d) r1
            androidx.navigation.h r1 = r1.f1456p
            int r1 = r1.f1494q
            boolean r1 = r11.f(r1, r2)
            if (r1 == 0) goto L_0x0026
            goto L_0x0000
        L_0x0026:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x00e6
            java.lang.Object r1 = r0.peekLast()
            androidx.navigation.d r1 = (androidx.navigation.d) r1
            androidx.navigation.h r1 = r1.f1456p
            boolean r3 = r1 instanceof androidx.navigation.b
            if (r3 == 0) goto L_0x0053
            java.util.Iterator r3 = r0.descendingIterator()
        L_0x003c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0053
            java.lang.Object r4 = r3.next()
            androidx.navigation.d r4 = (androidx.navigation.d) r4
            androidx.navigation.h r4 = r4.f1456p
            boolean r5 = r4 instanceof androidx.navigation.i
            if (r5 != 0) goto L_0x003c
            boolean r5 = r4 instanceof androidx.navigation.b
            if (r5 != 0) goto L_0x003c
            goto L_0x0054
        L_0x0053:
            r4 = 0
        L_0x0054:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Iterator r5 = r0.descendingIterator()
        L_0x005d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00a5
            java.lang.Object r6 = r5.next()
            androidx.navigation.d r6 = (androidx.navigation.d) r6
            androidx.lifecycle.h$c r7 = r6.f1461v
            androidx.navigation.h r8 = r6.f1456p
            if (r1 == 0) goto L_0x007f
            int r9 = r8.f1494q
            int r10 = r1.f1494q
            if (r9 != r10) goto L_0x007f
            androidx.lifecycle.h$c r8 = androidx.lifecycle.h.c.RESUMED
            if (r7 == r8) goto L_0x007c
            r3.put(r6, r8)
        L_0x007c:
            androidx.navigation.i r1 = r1.f1493p
            goto L_0x005d
        L_0x007f:
            if (r4 == 0) goto L_0x009d
            int r8 = r8.f1494q
            int r9 = r4.f1494q
            if (r8 != r9) goto L_0x009d
            androidx.lifecycle.h$c r8 = androidx.lifecycle.h.c.RESUMED
            if (r7 != r8) goto L_0x0093
            androidx.lifecycle.h$c r7 = androidx.lifecycle.h.c.STARTED
            r6.f1461v = r7
            r6.a()
            goto L_0x009a
        L_0x0093:
            androidx.lifecycle.h$c r8 = androidx.lifecycle.h.c.STARTED
            if (r7 == r8) goto L_0x009a
            r3.put(r6, r8)
        L_0x009a:
            androidx.navigation.i r4 = r4.f1493p
            goto L_0x005d
        L_0x009d:
            androidx.lifecycle.h$c r7 = androidx.lifecycle.h.c.CREATED
            r6.f1461v = r7
            r6.a()
            goto L_0x005d
        L_0x00a5:
            java.util.Iterator r1 = r0.iterator()
        L_0x00a9:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00c7
            java.lang.Object r4 = r1.next()
            androidx.navigation.d r4 = (androidx.navigation.d) r4
            java.lang.Object r5 = r3.get(r4)
            androidx.lifecycle.h$c r5 = (androidx.lifecycle.h.c) r5
            if (r5 == 0) goto L_0x00c3
            r4.f1461v = r5
            r4.a()
            goto L_0x00a9
        L_0x00c3:
            r4.a()
            goto L_0x00a9
        L_0x00c7:
            java.lang.Object r0 = r0.peekLast()
            androidx.navigation.d r0 = (androidx.navigation.d) r0
            java.util.concurrent.CopyOnWriteArrayList<androidx.navigation.NavController$b> r1 = r11.l
            java.util.Iterator r1 = r1.iterator()
        L_0x00d3:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00e5
            java.lang.Object r3 = r1.next()
            androidx.navigation.NavController$b r3 = (androidx.navigation.NavController.b) r3
            androidx.navigation.h r4 = r0.f1456p
            r3.a()
            goto L_0x00d3
        L_0x00e5:
            return r2
        L_0x00e6:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.a():boolean");
    }

    public final h b(int i10) {
        h hVar;
        i iVar;
        i iVar2 = this.d;
        if (iVar2 == null) {
            return null;
        }
        if (iVar2.f1494q == i10) {
            return iVar2;
        }
        ArrayDeque arrayDeque = this.f1440h;
        if (arrayDeque.isEmpty()) {
            hVar = this.d;
        } else {
            hVar = ((d) arrayDeque.getLast()).f1456p;
        }
        if (hVar instanceof i) {
            iVar = (i) hVar;
        } else {
            iVar = hVar.f1493p;
        }
        return iVar.n(i10, true);
    }

    public final h c() {
        d dVar;
        ArrayDeque arrayDeque = this.f1440h;
        if (arrayDeque.isEmpty()) {
            dVar = null;
        } else {
            dVar = (d) arrayDeque.getLast();
        }
        if (dVar != null) {
            return dVar.f1456p;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e A[LOOP:0: B:10:0x002e->B:15:0x004e, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(androidx.navigation.h r18, android.os.Bundle r19, androidx.navigation.m r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            if (r2 == 0) goto L_0x0014
            r4 = -1
            int r5 = r2.f1514b
            if (r5 == r4) goto L_0x0014
            boolean r4 = r2.f1515c
            boolean r4 = r0.f(r5, r4)
            goto L_0x0015
        L_0x0014:
            r4 = 0
        L_0x0015:
            java.lang.String r5 = r1.f1492o
            androidx.navigation.q r6 = r0.f1443k
            androidx.navigation.p r5 = r6.c(r5)
            android.os.Bundle r12 = r18.e(r19)
            androidx.navigation.h r5 = r5.b(r1, r12, r2)
            java.util.ArrayDeque r13 = r0.f1440h
            r14 = 1
            if (r5 == 0) goto L_0x0144
            boolean r2 = r5 instanceof androidx.navigation.b
            if (r2 != 0) goto L_0x0051
        L_0x002e:
            boolean r2 = r13.isEmpty()
            if (r2 != 0) goto L_0x0051
            java.lang.Object r2 = r13.peekLast()
            androidx.navigation.d r2 = (androidx.navigation.d) r2
            androidx.navigation.h r2 = r2.f1456p
            boolean r2 = r2 instanceof androidx.navigation.b
            if (r2 == 0) goto L_0x0051
            java.lang.Object r2 = r13.peekLast()
            androidx.navigation.d r2 = (androidx.navigation.d) r2
            androidx.navigation.h r2 = r2.f1456p
            int r2 = r2.f1494q
            boolean r2 = r0.f(r2, r14)
            if (r2 == 0) goto L_0x0051
            goto L_0x002e
        L_0x0051:
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            boolean r6 = r1 instanceof androidx.navigation.i
            if (r6 == 0) goto L_0x0091
            r6 = r5
        L_0x005b:
            androidx.navigation.i r15 = r6.f1493p
            if (r15 == 0) goto L_0x008a
            androidx.navigation.d r11 = new androidx.navigation.d
            android.content.Context r7 = r0.f1434a
            androidx.lifecycle.n r10 = r0.f1441i
            androidx.navigation.f r9 = r0.f1442j
            r6 = r11
            r8 = r15
            r16 = r9
            r9 = r12
            r3 = r11
            r11 = r16
            r6.<init>(r7, r8, r9, r10, r11)
            r2.addFirst(r3)
            boolean r3 = r13.isEmpty()
            if (r3 != 0) goto L_0x008a
            java.lang.Object r3 = r13.getLast()
            androidx.navigation.d r3 = (androidx.navigation.d) r3
            androidx.navigation.h r3 = r3.f1456p
            if (r3 != r15) goto L_0x008a
            int r3 = r15.f1494q
            r0.f(r3, r14)
        L_0x008a:
            if (r15 == 0) goto L_0x0091
            if (r15 != r1) goto L_0x008f
            goto L_0x0091
        L_0x008f:
            r6 = r15
            goto L_0x005b
        L_0x0091:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x0099
            r1 = r5
            goto L_0x00a1
        L_0x0099:
            java.lang.Object r1 = r2.getFirst()
            androidx.navigation.d r1 = (androidx.navigation.d) r1
            androidx.navigation.h r1 = r1.f1456p
        L_0x00a1:
            if (r1 == 0) goto L_0x00c1
            int r3 = r1.f1494q
            androidx.navigation.h r3 = r0.b(r3)
            if (r3 != 0) goto L_0x00c1
            androidx.navigation.i r1 = r1.f1493p
            if (r1 == 0) goto L_0x00a1
            androidx.navigation.d r3 = new androidx.navigation.d
            android.content.Context r7 = r0.f1434a
            androidx.lifecycle.n r10 = r0.f1441i
            androidx.navigation.f r11 = r0.f1442j
            r6 = r3
            r8 = r1
            r9 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r2.addFirst(r3)
            goto L_0x00a1
        L_0x00c1:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x00c9
            r1 = r5
            goto L_0x00d1
        L_0x00c9:
            java.lang.Object r1 = r2.getLast()
            androidx.navigation.d r1 = (androidx.navigation.d) r1
            androidx.navigation.h r1 = r1.f1456p
        L_0x00d1:
            boolean r3 = r13.isEmpty()
            if (r3 != 0) goto L_0x0107
            java.lang.Object r3 = r13.getLast()
            androidx.navigation.d r3 = (androidx.navigation.d) r3
            androidx.navigation.h r3 = r3.f1456p
            boolean r3 = r3 instanceof androidx.navigation.i
            if (r3 == 0) goto L_0x0107
            java.lang.Object r3 = r13.getLast()
            androidx.navigation.d r3 = (androidx.navigation.d) r3
            androidx.navigation.h r3 = r3.f1456p
            androidx.navigation.i r3 = (androidx.navigation.i) r3
            int r6 = r1.f1494q
            r15 = 0
            androidx.navigation.h r3 = r3.n(r6, r15)
            if (r3 != 0) goto L_0x0108
            java.lang.Object r3 = r13.getLast()
            androidx.navigation.d r3 = (androidx.navigation.d) r3
            androidx.navigation.h r3 = r3.f1456p
            int r3 = r3.f1494q
            boolean r3 = r0.f(r3, r14)
            if (r3 == 0) goto L_0x0108
            goto L_0x00d1
        L_0x0107:
            r15 = 0
        L_0x0108:
            r13.addAll(r2)
            boolean r1 = r13.isEmpty()
            if (r1 != 0) goto L_0x011d
            java.lang.Object r1 = r13.getFirst()
            androidx.navigation.d r1 = (androidx.navigation.d) r1
            androidx.navigation.h r1 = r1.f1456p
            androidx.navigation.i r2 = r0.d
            if (r1 == r2) goto L_0x012f
        L_0x011d:
            androidx.navigation.d r1 = new androidx.navigation.d
            android.content.Context r7 = r0.f1434a
            androidx.navigation.i r8 = r0.d
            androidx.lifecycle.n r10 = r0.f1441i
            androidx.navigation.f r11 = r0.f1442j
            r6 = r1
            r9 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r13.addFirst(r1)
        L_0x012f:
            androidx.navigation.d r1 = new androidx.navigation.d
            android.content.Context r7 = r0.f1434a
            android.os.Bundle r9 = r5.e(r12)
            androidx.lifecycle.n r10 = r0.f1441i
            androidx.navigation.f r11 = r0.f1442j
            r6 = r1
            r8 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            r13.add(r1)
            goto L_0x0157
        L_0x0144:
            r15 = 0
            if (r2 == 0) goto L_0x0157
            boolean r1 = r2.f1513a
            if (r1 == 0) goto L_0x0157
            java.lang.Object r1 = r13.peekLast()
            androidx.navigation.d r1 = (androidx.navigation.d) r1
            if (r1 == 0) goto L_0x0155
            r1.f1457q = r12
        L_0x0155:
            r3 = r14
            goto L_0x0158
        L_0x0157:
            r3 = r15
        L_0x0158:
            r17.h()
            if (r4 != 0) goto L_0x0161
            if (r5 != 0) goto L_0x0161
            if (r3 == 0) goto L_0x0164
        L_0x0161:
            r17.a()
        L_0x0164:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.d(androidx.navigation.h, android.os.Bundle, androidx.navigation.m):void");
    }

    public final void e() {
        if (!this.f1440h.isEmpty() && f(c().f1494q, true)) {
            a();
        }
    }

    public final boolean f(int i10, boolean z) {
        boolean z10;
        c0 remove;
        ArrayDeque arrayDeque = this.f1440h;
        boolean z11 = false;
        if (arrayDeque.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator descendingIterator = arrayDeque.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                z10 = false;
                break;
            }
            h hVar = ((d) descendingIterator.next()).f1456p;
            p c10 = this.f1443k.c(hVar.f1492o);
            if (z || hVar.f1494q != i10) {
                arrayList.add(c10);
            }
            if (hVar.f1494q == i10) {
                z10 = true;
                break;
            }
        }
        if (!z10) {
            Log.i("NavController", "Ignoring popBackStack to destination " + h.h(this.f1434a, i10) + " as it was not found on the current back stack");
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext() && ((p) it.next()).e()) {
            d dVar = (d) arrayDeque.removeLast();
            if (dVar.f1458r.f1394c.isAtLeast(h.c.CREATED)) {
                dVar.f1461v = h.c.DESTROYED;
                dVar.a();
            }
            f fVar = this.f1442j;
            if (!(fVar == null || (remove = fVar.f1468c.remove(dVar.f1460t)) == null)) {
                remove.a();
            }
            z11 = true;
        }
        h();
        return z11;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: androidx.navigation.i} */
    /* JADX WARNING: type inference failed for: r2v15, types: [androidx.navigation.h] */
    /* JADX WARNING: type inference failed for: r5v28, types: [androidx.navigation.h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(int r29, android.os.Bundle r30) {
        /*
            r28 = this;
            r0 = r28
            androidx.navigation.l r1 = r0.f1436c
            androidx.navigation.q r2 = r0.f1443k
            android.content.Context r3 = r0.f1434a
            if (r1 != 0) goto L_0x0011
            androidx.navigation.l r1 = new androidx.navigation.l
            r1.<init>(r3, r2)
            r0.f1436c = r1
        L_0x0011:
            androidx.navigation.l r1 = r0.f1436c
            r4 = r29
            androidx.navigation.i r1 = r1.c(r4)
            androidx.navigation.i r4 = r0.d
            r5 = 1
            if (r4 == 0) goto L_0x0023
            int r4 = r4.f1494q
            r0.f(r4, r5)
        L_0x0023:
            r0.d = r1
            android.os.Bundle r1 = r0.f1437e
            if (r1 == 0) goto L_0x0051
            java.lang.String r4 = "android-support-nav:controller:navigatorState:names"
            java.util.ArrayList r1 = r1.getStringArrayList(r4)
            if (r1 == 0) goto L_0x0051
            java.util.Iterator r1 = r1.iterator()
        L_0x0035:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0051
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            androidx.navigation.p r6 = r2.c(r4)
            android.os.Bundle r7 = r0.f1437e
            android.os.Bundle r4 = r7.getBundle(r4)
            if (r4 == 0) goto L_0x0035
            r6.c(r4)
            goto L_0x0035
        L_0x0051:
            android.os.Parcelable[] r1 = r0.f1438f
            java.util.ArrayDeque r2 = r0.f1440h
            java.lang.String r6 = " cannot be found from the current destination "
            r7 = 0
            if (r1 == 0) goto L_0x00bd
            int r8 = r1.length
            r9 = 0
        L_0x005c:
            if (r9 >= r8) goto L_0x00b8
            r10 = r1[r9]
            androidx.navigation.e r10 = (androidx.navigation.e) r10
            int r11 = r10.f1465p
            androidx.navigation.h r14 = r0.b(r11)
            if (r14 == 0) goto L_0x0094
            android.os.Bundle r15 = r10.f1466q
            if (r15 == 0) goto L_0x0075
            java.lang.ClassLoader r11 = r3.getClassLoader()
            r15.setClassLoader(r11)
        L_0x0075:
            androidx.navigation.d r11 = new androidx.navigation.d
            android.content.Context r13 = r0.f1434a
            androidx.lifecycle.n r12 = r0.f1441i
            androidx.navigation.f r4 = r0.f1442j
            java.util.UUID r5 = r10.f1464o
            android.os.Bundle r10 = r10.f1467r
            r16 = r12
            r12 = r11
            r17 = r4
            r18 = r5
            r19 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r2.add(r11)
            int r9 = r9 + 1
            r5 = 1
            goto L_0x005c
        L_0x0094:
            int r1 = r10.f1465p
            java.lang.String r1 = androidx.navigation.h.h(r3, r1)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Restoring the Navigation back stack failed: destination "
            r3.<init>(r4)
            r3.append(r1)
            r3.append(r6)
            androidx.navigation.h r1 = r28.c()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x00b8:
            r28.h()
            r0.f1438f = r7
        L_0x00bd:
            androidx.navigation.i r1 = r0.d
            if (r1 == 0) goto L_0x02eb
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x02eb
            boolean r1 = r0.f1439g
            if (r1 != 0) goto L_0x02df
            android.app.Activity r1 = r0.f1435b
            if (r1 == 0) goto L_0x02df
            android.content.Intent r4 = r1.getIntent()
            if (r4 != 0) goto L_0x00d7
            goto L_0x01bb
        L_0x00d7:
            android.os.Bundle r5 = r4.getExtras()
            if (r5 == 0) goto L_0x00e4
            java.lang.String r8 = "android-support-nav:controller:deepLinkIds"
            int[] r8 = r5.getIntArray(r8)
            goto L_0x00e5
        L_0x00e4:
            r8 = r7
        L_0x00e5:
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            if (r5 == 0) goto L_0x00f3
            java.lang.String r10 = "android-support-nav:controller:deepLinkExtras"
            android.os.Bundle r5 = r5.getBundle(r10)
            goto L_0x00f4
        L_0x00f3:
            r5 = r7
        L_0x00f4:
            if (r5 == 0) goto L_0x00f9
            r9.putAll(r5)
        L_0x00f9:
            if (r8 == 0) goto L_0x00fe
            int r5 = r8.length
            if (r5 != 0) goto L_0x0156
        L_0x00fe:
            android.net.Uri r5 = r4.getData()
            if (r5 == 0) goto L_0x0156
            androidx.navigation.i r5 = r0.d
            androidx.fragment.app.f0 r10 = new androidx.fragment.app.f0
            r10.<init>((android.content.Intent) r4)
            androidx.navigation.h$a r5 = r5.i(r10)
            if (r5 == 0) goto L_0x0156
            androidx.navigation.h r10 = r5.f1499o
            r10.getClass()
            java.util.ArrayDeque r11 = new java.util.ArrayDeque
            r11.<init>()
            r8 = r10
        L_0x011c:
            androidx.navigation.i r12 = r8.f1493p
            if (r12 == 0) goto L_0x0126
            int r13 = r12.f1504x
            int r14 = r8.f1494q
            if (r13 == r14) goto L_0x0129
        L_0x0126:
            r11.addFirst(r8)
        L_0x0129:
            if (r12 != 0) goto L_0x0154
            int r8 = r11.size()
            int[] r8 = new int[r8]
            java.util.Iterator r11 = r11.iterator()
            r12 = 0
        L_0x0136:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x014a
            java.lang.Object r13 = r11.next()
            androidx.navigation.h r13 = (androidx.navigation.h) r13
            int r14 = r12 + 1
            int r13 = r13.f1494q
            r8[r12] = r13
            r12 = r14
            goto L_0x0136
        L_0x014a:
            android.os.Bundle r5 = r5.f1500p
            android.os.Bundle r5 = r10.e(r5)
            r9.putAll(r5)
            goto L_0x0156
        L_0x0154:
            r8 = r12
            goto L_0x011c
        L_0x0156:
            if (r8 == 0) goto L_0x02d8
            int r5 = r8.length
            if (r5 != 0) goto L_0x015d
            goto L_0x02d8
        L_0x015d:
            androidx.navigation.i r5 = r0.d
            r10 = 0
        L_0x0160:
            int r11 = r8.length
            if (r10 >= r11) goto L_0x019d
            r11 = r8[r10]
            if (r10 != 0) goto L_0x0172
            androidx.navigation.i r12 = r0.d
            int r13 = r12.f1494q
            if (r13 != r11) goto L_0x016e
            goto L_0x016f
        L_0x016e:
            r12 = r7
        L_0x016f:
            r13 = r12
            r12 = 1
            goto L_0x0177
        L_0x0172:
            r12 = 1
            androidx.navigation.h r13 = r5.n(r11, r12)
        L_0x0177:
            if (r13 != 0) goto L_0x017e
            java.lang.String r5 = androidx.navigation.h.h(r3, r11)
            goto L_0x019e
        L_0x017e:
            int r11 = r8.length
            int r11 = r11 - r12
            if (r10 == r11) goto L_0x019a
            androidx.navigation.i r13 = (androidx.navigation.i) r13
        L_0x0184:
            int r5 = r13.f1504x
            androidx.navigation.h r5 = r13.n(r5, r12)
            boolean r5 = r5 instanceof androidx.navigation.i
            if (r5 == 0) goto L_0x0199
            int r5 = r13.f1504x
            androidx.navigation.h r5 = r13.n(r5, r12)
            r13 = r5
            androidx.navigation.i r13 = (androidx.navigation.i) r13
            r12 = 1
            goto L_0x0184
        L_0x0199:
            r5 = r13
        L_0x019a:
            int r10 = r10 + 1
            goto L_0x0160
        L_0x019d:
            r5 = r7
        L_0x019e:
            if (r5 == 0) goto L_0x01c0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not find destination "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r2 = " in the navigation graph, ignoring the deep link from "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "NavController"
            android.util.Log.i(r2, r1)
        L_0x01bb:
            r1 = 1
            r2 = 0
            r12 = 0
            goto L_0x02db
        L_0x01c0:
            java.lang.String r5 = "android-support-nav:controller:deepLinkIntent"
            r9.putParcelable(r5, r4)
            int r5 = r4.getFlags()
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            r10 = r10 & r5
            if (r10 == 0) goto L_0x0201
            r11 = 32768(0x8000, float:4.5918E-41)
            r5 = r5 & r11
            if (r5 != 0) goto L_0x0201
            r4.addFlags(r11)
            x.p r2 = new x.p
            r2.<init>(r3)
            android.content.ComponentName r3 = r4.getComponent()
            if (r3 != 0) goto L_0x01ec
            android.content.Context r3 = r2.f9432p
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            android.content.ComponentName r3 = r4.resolveActivity(r3)
        L_0x01ec:
            if (r3 == 0) goto L_0x01f1
            r2.e(r3)
        L_0x01f1:
            java.util.ArrayList<android.content.Intent> r3 = r2.f9431o
            r3.add(r4)
            r2.h()
            r1.finish()
            r12 = 0
            r1.overridePendingTransition(r12, r12)
            goto L_0x025c
        L_0x0201:
            r12 = 0
            java.lang.String r1 = "Deep Linking failed: destination "
            if (r10 == 0) goto L_0x025f
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0214
            androidx.navigation.i r2 = r0.d
            int r2 = r2.f1494q
            r4 = 1
            r0.f(r2, r4)
        L_0x0214:
            r2 = r12
        L_0x0215:
            int r4 = r8.length
            if (r2 >= r4) goto L_0x025c
            int r4 = r2 + 1
            r2 = r8[r2]
            androidx.navigation.h r5 = r0.b(r2)
            if (r5 == 0) goto L_0x023c
            r23 = 0
            r21 = 0
            r27 = -1
            r24 = 0
            r25 = 0
            androidx.navigation.m r2 = new androidx.navigation.m
            r20 = r2
            r22 = r27
            r26 = r27
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r0.d(r5, r9, r2)
            r2 = r4
            goto L_0x0215
        L_0x023c:
            java.lang.String r2 = androidx.navigation.h.h(r3, r2)
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r4.append(r2)
            r4.append(r6)
            androidx.navigation.h r1 = r28.c()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1)
            throw r3
        L_0x025c:
            r1 = 1
            goto L_0x02d6
        L_0x025f:
            androidx.navigation.i r2 = r0.d
            r4 = r12
        L_0x0262:
            int r5 = r8.length
            if (r4 >= r5) goto L_0x02d3
            r5 = r8[r4]
            if (r4 != 0) goto L_0x026e
            androidx.navigation.i r6 = r0.d
            r10 = r6
            r6 = 1
            goto L_0x0273
        L_0x026e:
            r6 = 1
            androidx.navigation.h r10 = r2.n(r5, r6)
        L_0x0273:
            if (r10 == 0) goto L_0x02b5
            int r5 = r8.length
            int r5 = r5 - r6
            if (r4 == r5) goto L_0x0292
            androidx.navigation.i r10 = (androidx.navigation.i) r10
        L_0x027b:
            int r2 = r10.f1504x
            androidx.navigation.h r2 = r10.n(r2, r6)
            boolean r2 = r2 instanceof androidx.navigation.i
            if (r2 == 0) goto L_0x0290
            int r2 = r10.f1504x
            androidx.navigation.h r2 = r10.n(r2, r6)
            r10 = r2
            androidx.navigation.i r10 = (androidx.navigation.i) r10
            r6 = 1
            goto L_0x027b
        L_0x0290:
            r2 = r10
            goto L_0x02b2
        L_0x0292:
            android.os.Bundle r5 = r10.e(r9)
            r21 = 0
            r27 = -1
            androidx.navigation.i r6 = r0.d
            int r6 = r6.f1494q
            r23 = 1
            r24 = 0
            r25 = 0
            androidx.navigation.m r11 = new androidx.navigation.m
            r20 = r11
            r22 = r6
            r26 = r27
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r0.d(r10, r5, r11)
        L_0x02b2:
            int r4 = r4 + 1
            goto L_0x0262
        L_0x02b5:
            java.lang.String r3 = androidx.navigation.h.h(r3, r5)
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r5.append(r3)
            java.lang.String r1 = " cannot be found in graph "
            r5.append(r1)
            r5.append(r2)
            java.lang.String r1 = r5.toString()
            r4.<init>(r1)
            throw r4
        L_0x02d3:
            r1 = 1
            r0.f1439g = r1
        L_0x02d6:
            r2 = r1
            goto L_0x02db
        L_0x02d8:
            r1 = 1
            r12 = 0
            r2 = r12
        L_0x02db:
            if (r2 == 0) goto L_0x02e0
            r5 = r1
            goto L_0x02e1
        L_0x02df:
            r12 = 0
        L_0x02e0:
            r5 = r12
        L_0x02e1:
            if (r5 != 0) goto L_0x02ee
            androidx.navigation.i r1 = r0.d
            r2 = r30
            r0.d(r1, r2, r7)
            goto L_0x02ee
        L_0x02eb:
            r28.a()
        L_0x02ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.g(int, android.os.Bundle):void");
    }

    public final void h() {
        boolean z = false;
        if (this.f1446o) {
            Iterator it = this.f1440h.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (!(((d) it.next()).f1456p instanceof i)) {
                    i10++;
                }
            }
            if (i10 > 1) {
                z = true;
            }
        }
        this.f1445n.f186a = z;
    }
}

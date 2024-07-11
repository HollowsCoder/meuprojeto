package w9;

import java.util.concurrent.atomic.AtomicReference;
import z8.g;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final w f9371a = new w(new byte[0], 0, 0, false);

    /* renamed from: b  reason: collision with root package name */
    public static final int f9372b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference<w>[] f9373c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f9372b = highestOneBit;
        AtomicReference<w>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i10 = 0; i10 < highestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        f9373c = atomicReferenceArr;
    }

    public static final void a(w wVar) {
        boolean z;
        int i10;
        boolean z10 = true;
        if (wVar.f9369f == null && wVar.f9370g == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!wVar.d) {
            Thread currentThread = Thread.currentThread();
            g.e(currentThread, "Thread.currentThread()");
            AtomicReference<w> atomicReference = f9373c[(int) (currentThread.getId() & (((long) f9372b) - 1))];
            w wVar2 = atomicReference.get();
            if (wVar2 != f9371a) {
                if (wVar2 != null) {
                    i10 = wVar2.f9367c;
                } else {
                    i10 = 0;
                }
                if (i10 < 65536) {
                    wVar.f9369f = wVar2;
                    wVar.f9366b = 0;
                    wVar.f9367c = i10 + 8192;
                    while (true) {
                        if (!atomicReference.compareAndSet(wVar2, wVar)) {
                            if (atomicReference.get() != wVar2) {
                                z10 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (!z10) {
                        wVar.f9369f = null;
                    }
                }
            }
        }
    }

    public static final w b() {
        Thread currentThread = Thread.currentThread();
        g.e(currentThread, "Thread.currentThread()");
        AtomicReference<w> atomicReference = f9373c[(int) (currentThread.getId() & (((long) f9372b) - 1))];
        w wVar = f9371a;
        w andSet = atomicReference.getAndSet(wVar);
        if (andSet == wVar) {
            return new w();
        }
        if (andSet == null) {
            atomicReference.set((Object) null);
            return new w();
        }
        atomicReference.set(andSet.f9369f);
        andSet.f9369f = null;
        andSet.f9367c = 0;
        return andSet;
    }
}

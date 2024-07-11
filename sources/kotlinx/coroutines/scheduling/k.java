package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6836b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6837c;
    public static final /* synthetic */ AtomicIntegerFieldUpdater d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6838e;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray<g> f6839a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<k> cls = k.class;
        f6836b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f6837c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f6838e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    public final g a(g gVar, boolean z) {
        if (z) {
            return b(gVar);
        }
        g gVar2 = (g) f6836b.getAndSet(this, gVar);
        if (gVar2 == null) {
            return null;
        }
        return b(gVar2);
    }

    public final g b(g gVar) {
        boolean z = true;
        if (gVar.f6830p.u() != 1) {
            z = false;
        }
        if (z) {
            f6838e.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return gVar;
        }
        int i10 = this.producerIndex & 127;
        while (this.f6839a.get(i10) != null) {
            Thread.yield();
        }
        this.f6839a.lazySet(i10, gVar);
        f6837c.incrementAndGet(this);
        return null;
    }

    public final int c() {
        if (this.lastScheduledTask != null) {
            return (this.producerIndex - this.consumerIndex) + 1;
        }
        return this.producerIndex - this.consumerIndex;
    }

    public final g d() {
        g andSet;
        while (true) {
            int i10 = this.consumerIndex;
            if (i10 - this.producerIndex == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (d.compareAndSet(this, i10, i10 + 1) && (andSet = this.f6839a.getAndSet(i11, (Object) null)) != null) {
                boolean z = true;
                if (andSet.f6830p.u() != 1) {
                    z = false;
                }
                if (z) {
                    f6838e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final long e(k kVar) {
        boolean z;
        int i10 = kVar.consumerIndex;
        int i11 = kVar.producerIndex;
        AtomicReferenceArray<g> atomicReferenceArray = kVar.f6839a;
        while (true) {
            boolean z10 = true;
            if (i10 == i11) {
                break;
            }
            int i12 = i10 & 127;
            if (kVar.blockingTasksInBuffer == 0) {
                break;
            }
            g gVar = atomicReferenceArray.get(i12);
            if (gVar != null) {
                if (gVar.f6830p.u() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i12, gVar, (Object) null)) {
                            if (atomicReferenceArray.get(i12) != gVar) {
                                z10 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z10) {
                        f6838e.decrementAndGet(kVar);
                        a(gVar, false);
                        return -1;
                    }
                } else {
                    continue;
                }
            }
            i10++;
        }
        return f(kVar, true);
    }

    public final long f(k kVar, boolean z) {
        g gVar;
        boolean z10;
        boolean z11;
        do {
            gVar = (g) kVar.lastScheduledTask;
            if (gVar != null) {
                z10 = true;
                if (z) {
                    if (gVar.f6830p.u() == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        return -2;
                    }
                }
                j.f6835e.getClass();
                long nanoTime = System.nanoTime() - gVar.f6829o;
                long j8 = j.f6832a;
                if (nanoTime >= j8) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6836b;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(kVar, gVar, (Object) null)) {
                            if (atomicReferenceFieldUpdater.get(kVar) != gVar) {
                                z10 = false;
                                continue;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    return j8 - nanoTime;
                }
            } else {
                return -2;
            }
        } while (!z10);
        a(gVar, false);
        return -1;
    }
}

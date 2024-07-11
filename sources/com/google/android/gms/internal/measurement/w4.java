package com.google.android.gms.internal.measurement;

import androidx.activity.result.c;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import s2.t;

public final class w4 extends c {

    /* renamed from: o  reason: collision with root package name */
    public final t f2976o = new t(3, 0);

    public final void x(Throwable th, Throwable th2) {
        ReferenceQueue referenceQueue;
        if (th2 != th) {
            t tVar = this.f2976o;
            Object obj = tVar.f8686p;
            while (true) {
                referenceQueue = (ReferenceQueue) obj;
                Reference poll = referenceQueue.poll();
                if (poll == null) {
                    break;
                }
                ((ConcurrentHashMap) tVar.f8685o).remove(poll);
            }
            List list = (List) ((ConcurrentHashMap) tVar.f8685o).get(new v4(th, (ReferenceQueue<Throwable>) null));
            if (list == null) {
                list = new Vector(2);
                List list2 = (List) ((ConcurrentHashMap) tVar.f8685o).putIfAbsent(new v4(th, referenceQueue), list);
                if (list2 != null) {
                    list = list2;
                }
            }
            list.add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }
}

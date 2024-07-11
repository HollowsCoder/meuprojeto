package com.google.android.gms.internal.vision;

import androidx.activity.result.c;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import m1.i;

public final class e extends c {

    /* renamed from: o  reason: collision with root package name */
    public final i f3083o = new i(5);

    public final void w(Exception exc) {
        exc.printStackTrace();
        i iVar = this.f3083o;
        while (true) {
            Reference poll = ((ReferenceQueue) iVar.f7057q).poll();
            if (poll == null) {
                break;
            }
            ((ConcurrentHashMap) iVar.f7056p).remove(poll);
        }
        List<Throwable> list = (List) ((ConcurrentHashMap) iVar.f7056p).get(new d(exc, (ReferenceQueue) null));
        if (list != null) {
            synchronized (list) {
                for (Throwable printStackTrace : list) {
                    System.err.print("Suppressed: ");
                    printStackTrace.printStackTrace();
                }
            }
        }
    }
}

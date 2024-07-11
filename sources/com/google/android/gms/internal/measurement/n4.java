package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import n.b;
import n.h;

public final class n4 {

    /* renamed from: a  reason: collision with root package name */
    public static final b f2843a = new b();

    public static synchronized void a() {
        synchronized (n4.class) {
            b bVar = f2843a;
            Iterator it = ((h.e) bVar.values()).iterator();
            if (!it.hasNext()) {
                bVar.clear();
            } else {
                ((n4) it.next()).getClass();
                throw null;
            }
        }
    }
}

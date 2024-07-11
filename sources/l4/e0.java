package l4;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import k4.b;
import m5.j;

public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<BasePendingResult<?>, Boolean> f6910a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public final Map<j<?>, Boolean> f6911b = Collections.synchronizedMap(new WeakHashMap());

    public final void a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f6910a) {
            hashMap = new HashMap(this.f6910a);
        }
        synchronized (this.f6911b) {
            hashMap2 = new HashMap(this.f6911b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                BasePendingResult basePendingResult = (BasePendingResult) entry.getKey();
                synchronized (basePendingResult.f2328a) {
                    if (!basePendingResult.b()) {
                        basePendingResult.c(basePendingResult.a(status));
                        basePendingResult.f2331e = true;
                    }
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((j) entry2.getKey()).b(new b(status));
            }
        }
    }
}

package n4;

import android.accounts.Account;
import android.os.IInterface;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import k4.a;

public abstract class f<T extends IInterface> extends b<T> implements a.e {
    public final Set<Scope> w;

    /* renamed from: x  reason: collision with root package name */
    public final Account f7430x;

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(@androidx.annotation.RecentlyNonNull android.content.Context r12, @androidx.annotation.RecentlyNonNull android.os.Looper r13, @androidx.annotation.RecentlyNonNull int r14, @androidx.annotation.RecentlyNonNull n4.c r15, @androidx.annotation.RecentlyNonNull k4.d.a r16, @androidx.annotation.RecentlyNonNull k4.d.b r17) {
        /*
            r11 = this;
            r10 = r11
            r0 = r15
            java.lang.Object r1 = n4.g.f7437a
            monitor-enter(r1)
            n4.d0 r2 = n4.g.f7438b     // Catch:{ all -> 0x005e }
            if (r2 != 0) goto L_0x0014
            n4.d0 r2 = new n4.d0     // Catch:{ all -> 0x005e }
            android.content.Context r3 = r12.getApplicationContext()     // Catch:{ all -> 0x005e }
            r2.<init>(r3)     // Catch:{ all -> 0x005e }
            n4.g.f7438b = r2     // Catch:{ all -> 0x005e }
        L_0x0014:
            monitor-exit(r1)     // Catch:{ all -> 0x005e }
            n4.d0 r4 = n4.g.f7438b
            j4.e r5 = j4.e.d
            n4.m.h(r16)
            n4.m.h(r17)
            n4.s r7 = new n4.s
            r1 = r16
            r7.<init>(r1)
            n4.t r8 = new n4.t
            r1 = r17
            r8.<init>(r1)
            java.lang.String r9 = r0.f7404e
            r1 = r11
            r2 = r12
            r3 = r13
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            android.accounts.Account r1 = r0.f7401a
            r10.f7430x = r1
            java.util.Set<com.google.android.gms.common.api.Scope> r0 = r0.f7403c
            java.util.Iterator r1 = r0.iterator()
        L_0x0040:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x005b
            java.lang.Object r2 = r1.next()
            com.google.android.gms.common.api.Scope r2 = (com.google.android.gms.common.api.Scope) r2
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x0053
            goto L_0x0040
        L_0x0053:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expanding scopes is not permitted, use implied scopes instead"
            r0.<init>(r1)
            throw r0
        L_0x005b:
            r10.w = r0
            return
        L_0x005e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x005e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.f.<init>(android.content.Context, android.os.Looper, int, n4.c, k4.d$a, k4.d$b):void");
    }

    public final Set<Scope> b() {
        return l() ? this.w : Collections.emptySet();
    }

    @RecentlyNullable
    public final Account r() {
        return this.f7430x;
    }

    @RecentlyNonNull
    public final Set<Scope> t() {
        return this.w;
    }
}

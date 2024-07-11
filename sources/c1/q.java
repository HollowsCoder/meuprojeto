package c1;

import android.view.View;
import androidx.appcompat.widget.x0;
import b0.d;
import java.util.ArrayList;
import java.util.HashMap;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f2126a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final View f2127b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<j> f2128c = new ArrayList<>();

    @Deprecated
    public q() {
    }

    public q(View view) {
        this.f2127b = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = (c1.q) r3;
        r0 = r3.f2127b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof c1.q
            if (r0 == 0) goto L_0x0018
            c1.q r3 = (c1.q) r3
            android.view.View r0 = r3.f2127b
            android.view.View r1 = r2.f2127b
            if (r1 != r0) goto L_0x0018
            java.util.HashMap r0 = r2.f2126a
            java.util.HashMap r3 = r3.f2126a
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0018
            r3 = 1
            return r3
        L_0x0018:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.q.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.f2126a.hashCode() + (this.f2127b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h10 = x0.h("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        h10.append(this.f2127b);
        h10.append("\n");
        String e10 = d.e(h10.toString(), "    values:");
        HashMap hashMap = this.f2126a;
        for (String str : hashMap.keySet()) {
            e10 = e10 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return e10;
    }
}

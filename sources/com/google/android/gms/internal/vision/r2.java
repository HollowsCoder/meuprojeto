package com.google.android.gms.internal.vision;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class r2<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: p  reason: collision with root package name */
    public static final r2 f3156p;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3157o = true;

    static {
        r2 r2Var = new r2();
        f3156p = r2Var;
        r2Var.f3157o = false;
    }

    public r2() {
    }

    public r2(Map<K, V> map) {
        super(map);
    }

    public static int c(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Charset charset = u1.f3170a;
            int length = bArr.length;
            int i10 = length;
            for (int i11 = 0; i11 < 0 + length; i11++) {
                i10 = (i10 * 31) + bArr[i11];
            }
            if (i10 == 0) {
                return 1;
            }
            return i10;
        } else if (!(obj instanceof t1)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        d();
        super.clear();
    }

    public final void d() {
        if (!this.f3157o) {
            throw new UnsupportedOperationException();
        }
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L_0x0059
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0015
            goto L_0x0057
        L_0x0015:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0034
            goto L_0x0057
        L_0x0034:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0051
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0051
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0055
        L_0x0051:
            boolean r3 = r4.equals(r3)
        L_0x0055:
            if (r3 != 0) goto L_0x001d
        L_0x0057:
            r7 = r1
            goto L_0x005a
        L_0x0059:
            r7 = r0
        L_0x005a:
            if (r7 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.r2.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i10 = 0;
        for (Map.Entry entry : entrySet()) {
            i10 += c(entry.getValue()) ^ c(entry.getKey());
        }
        return i10;
    }

    public final V put(K k10, V v10) {
        d();
        Charset charset = u1.f3170a;
        k10.getClass();
        v10.getClass();
        return super.put(k10, v10);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        d();
        for (Object next : map.keySet()) {
            Charset charset = u1.f3170a;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        d();
        return super.remove(obj);
    }
}

package n;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class i<K, V> {

    /* renamed from: r  reason: collision with root package name */
    public static Object[] f7328r;

    /* renamed from: s  reason: collision with root package name */
    public static int f7329s;

    /* renamed from: t  reason: collision with root package name */
    public static Object[] f7330t;
    public static int u;

    /* renamed from: o  reason: collision with root package name */
    public int[] f7331o;

    /* renamed from: p  reason: collision with root package name */
    public Object[] f7332p;

    /* renamed from: q  reason: collision with root package name */
    public int f7333q;

    public i() {
        this.f7331o = e.f7295o;
        this.f7332p = e.f7297q;
        this.f7333q = 0;
    }

    public i(int i10) {
        if (i10 == 0) {
            this.f7331o = e.f7295o;
            this.f7332p = e.f7297q;
        } else {
            a(i10);
        }
        this.f7333q = 0;
    }

    private void a(int i10) {
        if (i10 == 8) {
            synchronized (i.class) {
                Object[] objArr = f7330t;
                if (objArr != null) {
                    this.f7332p = objArr;
                    f7330t = (Object[]) objArr[0];
                    this.f7331o = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    u--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (i.class) {
                Object[] objArr2 = f7328r;
                if (objArr2 != null) {
                    this.f7332p = objArr2;
                    f7328r = (Object[]) objArr2[0];
                    this.f7331o = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f7329s--;
                    return;
                }
            }
        }
        this.f7331o = new int[i10];
        this.f7332p = new Object[(i10 << 1)];
    }

    public static void c(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (i.class) {
                if (u < 10) {
                    objArr[0] = f7330t;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f7330t = objArr;
                    u++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (i.class) {
                if (f7329s < 10) {
                    objArr[0] = f7328r;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f7328r = objArr;
                    f7329s++;
                }
            }
        }
    }

    public final void b(int i10) {
        int i11 = this.f7333q;
        int[] iArr = this.f7331o;
        if (iArr.length < i10) {
            Object[] objArr = this.f7332p;
            a(i10);
            if (this.f7333q > 0) {
                System.arraycopy(iArr, 0, this.f7331o, 0, i11);
                System.arraycopy(objArr, 0, this.f7332p, 0, i11 << 1);
            }
            c(iArr, objArr, i11);
        }
        if (this.f7333q != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i10 = this.f7333q;
        if (i10 > 0) {
            int[] iArr = this.f7331o;
            Object[] objArr = this.f7332p;
            this.f7331o = e.f7295o;
            this.f7332p = e.f7297q;
            this.f7333q = 0;
            c(iArr, objArr, i10);
        }
        if (this.f7333q > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final int d(int i10, Object obj) {
        int i11 = this.f7333q;
        if (i11 == 0) {
            return -1;
        }
        try {
            int l = e.l(i11, i10, this.f7331o);
            if (l < 0 || obj.equals(this.f7332p[l << 1])) {
                return l;
            }
            int i12 = l + 1;
            while (i12 < i11 && this.f7331o[i12] == i10) {
                if (obj.equals(this.f7332p[i12 << 1])) {
                    return i12;
                }
                i12++;
            }
            int i13 = l - 1;
            while (i13 >= 0 && this.f7331o[i13] == i10) {
                if (obj.equals(this.f7332p[i13 << 1])) {
                    return i13;
                }
                i13--;
            }
            return ~i12;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f7333q != iVar.f7333q) {
                return false;
            }
            int i10 = 0;
            while (i10 < this.f7333q) {
                try {
                    Object h10 = h(i10);
                    Object l = l(i10);
                    Object orDefault = iVar.getOrDefault(h10, (Object) null);
                    if (l == null) {
                        if (orDefault != null || !iVar.containsKey(h10)) {
                            return false;
                        }
                    } else if (!l.equals(orDefault)) {
                        return false;
                    }
                    i10++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f7333q != map.size()) {
                return false;
            }
            int i11 = 0;
            while (i11 < this.f7333q) {
                try {
                    Object h11 = h(i11);
                    Object l8 = l(i11);
                    Object obj2 = map.get(h11);
                    if (l8 == null) {
                        if (obj2 != null || !map.containsKey(h11)) {
                            return false;
                        }
                    } else if (!l8.equals(obj2)) {
                        return false;
                    }
                    i11++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i10 = this.f7333q;
        if (i10 == 0) {
            return -1;
        }
        try {
            int l = e.l(i10, 0, this.f7331o);
            if (l < 0 || this.f7332p[l << 1] == null) {
                return l;
            }
            int i11 = l + 1;
            while (i11 < i10 && this.f7331o[i11] == 0) {
                if (this.f7332p[i11 << 1] == null) {
                    return i11;
                }
                i11++;
            }
            int i12 = l - 1;
            while (i12 >= 0 && this.f7331o[i12] == 0) {
                if (this.f7332p[i12 << 1] == null) {
                    return i12;
                }
                i12--;
            }
            return ~i11;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int g(Object obj) {
        int i10 = this.f7333q * 2;
        Object[] objArr = this.f7332p;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public final V getOrDefault(Object obj, V v10) {
        int e10 = e(obj);
        return e10 >= 0 ? this.f7332p[(e10 << 1) + 1] : v10;
    }

    public final K h(int i10) {
        return this.f7332p[i10 << 1];
    }

    public int hashCode() {
        int[] iArr = this.f7331o;
        Object[] objArr = this.f7332p;
        int i10 = this.f7333q;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public void i(b bVar) {
        int i10 = bVar.f7333q;
        b(this.f7333q + i10);
        if (this.f7333q != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(bVar.h(i11), bVar.l(i11));
            }
        } else if (i10 > 0) {
            System.arraycopy(bVar.f7331o, 0, this.f7331o, 0, i10);
            System.arraycopy(bVar.f7332p, 0, this.f7332p, 0, i10 << 1);
            this.f7333q = i10;
        }
    }

    public final boolean isEmpty() {
        return this.f7333q <= 0;
    }

    public V j(int i10) {
        V[] vArr = this.f7332p;
        int i11 = i10 << 1;
        V v10 = vArr[i11 + 1];
        int i12 = this.f7333q;
        int i13 = 0;
        if (i12 <= 1) {
            c(this.f7331o, vArr, i12);
            this.f7331o = e.f7295o;
            this.f7332p = e.f7297q;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f7331o;
            int i15 = 8;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i14) {
                    int i16 = i10 + 1;
                    int i17 = i14 - i10;
                    System.arraycopy(iArr, i16, iArr, i10, i17);
                    Object[] objArr = this.f7332p;
                    System.arraycopy(objArr, i16 << 1, objArr, i11, i17 << 1);
                }
                Object[] objArr2 = this.f7332p;
                int i18 = i14 << 1;
                objArr2[i18] = null;
                objArr2[i18 + 1] = null;
            } else {
                if (i12 > 8) {
                    i15 = i12 + (i12 >> 1);
                }
                a(i15);
                if (i12 == this.f7333q) {
                    if (i10 > 0) {
                        System.arraycopy(iArr, 0, this.f7331o, 0, i10);
                        System.arraycopy(vArr, 0, this.f7332p, 0, i11);
                    }
                    if (i10 < i14) {
                        int i19 = i10 + 1;
                        int i20 = i14 - i10;
                        System.arraycopy(iArr, i19, this.f7331o, i10, i20);
                        System.arraycopy(vArr, i19 << 1, this.f7332p, i11, i20 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i13 = i14;
        }
        if (i12 == this.f7333q) {
            this.f7333q = i13;
            return v10;
        }
        throw new ConcurrentModificationException();
    }

    public V k(int i10, V v10) {
        int i11 = (i10 << 1) + 1;
        V[] vArr = this.f7332p;
        V v11 = vArr[i11];
        vArr[i11] = v10;
        return v11;
    }

    public final V l(int i10) {
        return this.f7332p[(i10 << 1) + 1];
    }

    public V put(K k10, V v10) {
        int i10;
        int i11;
        int i12 = this.f7333q;
        if (k10 == null) {
            i11 = f();
            i10 = 0;
        } else {
            int hashCode = k10.hashCode();
            i10 = hashCode;
            i11 = d(hashCode, k10);
        }
        if (i11 >= 0) {
            int i13 = (i11 << 1) + 1;
            V[] vArr = this.f7332p;
            V v11 = vArr[i13];
            vArr[i13] = v10;
            return v11;
        }
        int i14 = ~i11;
        int[] iArr = this.f7331o;
        if (i12 >= iArr.length) {
            int i15 = 8;
            if (i12 >= 8) {
                i15 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i15 = 4;
            }
            Object[] objArr = this.f7332p;
            a(i15);
            if (i12 == this.f7333q) {
                int[] iArr2 = this.f7331o;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f7332p, 0, objArr.length);
                }
                c(iArr, objArr, i12);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i14 < i12) {
            int[] iArr3 = this.f7331o;
            int i16 = i14 + 1;
            System.arraycopy(iArr3, i14, iArr3, i16, i12 - i14);
            Object[] objArr2 = this.f7332p;
            System.arraycopy(objArr2, i14 << 1, objArr2, i16 << 1, (this.f7333q - i14) << 1);
        }
        int i17 = this.f7333q;
        if (i12 == i17) {
            int[] iArr4 = this.f7331o;
            if (i14 < iArr4.length) {
                iArr4[i14] = i10;
                Object[] objArr3 = this.f7332p;
                int i18 = i14 << 1;
                objArr3[i18] = k10;
                objArr3[i18 + 1] = v10;
                this.f7333q = i17 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k10, V v10) {
        V orDefault = getOrDefault(k10, (Object) null);
        if (orDefault == null) {
            return put(k10, v10);
        }
        return orDefault;
    }

    public final V remove(Object obj) {
        int e10 = e(obj);
        if (e10 >= 0) {
            return j(e10);
        }
        return null;
    }

    public final boolean remove(Object obj, Object obj2) {
        int e10 = e(obj);
        if (e10 < 0) {
            return false;
        }
        Object l = l(e10);
        if (obj2 != l && (obj2 == null || !obj2.equals(l))) {
            return false;
        }
        j(e10);
        return true;
    }

    public final V replace(K k10, V v10) {
        int e10 = e(k10);
        if (e10 >= 0) {
            return k(e10, v10);
        }
        return null;
    }

    public final boolean replace(K k10, V v10, V v11) {
        int e10 = e(k10);
        if (e10 < 0) {
            return false;
        }
        V l = l(e10);
        if (l != v10 && (v10 == null || !v10.equals(l))) {
            return false;
        }
        k(e10, v11);
        return true;
    }

    public final int size() {
        return this.f7333q;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f7333q * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f7333q; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            Object h10 = h(i10);
            if (h10 != this) {
                sb.append(h10);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object l = l(i10);
            if (l != this) {
                sb.append(l);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

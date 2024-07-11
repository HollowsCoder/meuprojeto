package n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import n.h;

public final class d<E> implements Collection<E>, Set<E> {

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f7287s = new int[0];

    /* renamed from: t  reason: collision with root package name */
    public static final Object[] f7288t = new Object[0];
    public static Object[] u;

    /* renamed from: v  reason: collision with root package name */
    public static int f7289v;
    public static Object[] w;

    /* renamed from: x  reason: collision with root package name */
    public static int f7290x;

    /* renamed from: o  reason: collision with root package name */
    public int[] f7291o;

    /* renamed from: p  reason: collision with root package name */
    public Object[] f7292p;

    /* renamed from: q  reason: collision with root package name */
    public int f7293q;

    /* renamed from: r  reason: collision with root package name */
    public c f7294r;

    public d() {
        this(0);
    }

    public d(int i10) {
        if (i10 == 0) {
            this.f7291o = f7287s;
            this.f7292p = f7288t;
        } else {
            e(i10);
        }
        this.f7293q = 0;
    }

    public static void h(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (d.class) {
                if (f7290x < 10) {
                    objArr[0] = w;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    w = objArr;
                    f7290x++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (d.class) {
                if (f7289v < 10) {
                    objArr[0] = u;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    u = objArr;
                    f7289v++;
                }
            }
        }
    }

    public final boolean add(E e10) {
        int i10;
        int i11;
        if (e10 == null) {
            i11 = k();
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            i11 = i(hashCode, e10);
        }
        if (i11 >= 0) {
            return false;
        }
        int i12 = ~i11;
        int i13 = this.f7293q;
        int[] iArr = this.f7291o;
        if (i13 >= iArr.length) {
            int i14 = 8;
            if (i13 >= 8) {
                i14 = (i13 >> 1) + i13;
            } else if (i13 < 4) {
                i14 = 4;
            }
            Object[] objArr = this.f7292p;
            e(i14);
            int[] iArr2 = this.f7291o;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f7292p, 0, objArr.length);
            }
            h(iArr, objArr, this.f7293q);
        }
        int i15 = this.f7293q;
        if (i12 < i15) {
            int[] iArr3 = this.f7291o;
            int i16 = i12 + 1;
            System.arraycopy(iArr3, i12, iArr3, i16, i15 - i12);
            Object[] objArr2 = this.f7292p;
            System.arraycopy(objArr2, i12, objArr2, i16, this.f7293q - i12);
        }
        this.f7291o[i12] = i10;
        this.f7292p[i12] = e10;
        this.f7293q++;
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f7293q;
        int[] iArr = this.f7291o;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f7292p;
            e(size);
            int i10 = this.f7293q;
            if (i10 > 0) {
                System.arraycopy(iArr, 0, this.f7291o, 0, i10);
                System.arraycopy(objArr, 0, this.f7292p, 0, this.f7293q);
            }
            h(iArr, objArr, this.f7293q);
        }
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public final void clear() {
        int i10 = this.f7293q;
        if (i10 != 0) {
            h(this.f7291o, this.f7292p, i10);
            this.f7291o = f7287s;
            this.f7292p = f7288t;
            this.f7293q = 0;
        }
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final void e(int i10) {
        if (i10 == 8) {
            synchronized (d.class) {
                Object[] objArr = w;
                if (objArr != null) {
                    this.f7292p = objArr;
                    w = (Object[]) objArr[0];
                    this.f7291o = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f7290x--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (d.class) {
                Object[] objArr2 = u;
                if (objArr2 != null) {
                    this.f7292p = objArr2;
                    u = (Object[]) objArr2[0];
                    this.f7291o = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f7289v--;
                    return;
                }
            }
        }
        this.f7291o = new int[i10];
        this.f7292p = new Object[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f7293q != set.size()) {
                return false;
            }
            int i10 = 0;
            while (i10 < this.f7293q) {
                try {
                    if (!set.contains(this.f7292p[i10])) {
                        return false;
                    }
                    i10++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f7291o;
        int i10 = this.f7293q;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public final int i(int i10, Object obj) {
        int i11 = this.f7293q;
        if (i11 == 0) {
            return -1;
        }
        int l = e.l(i11, i10, this.f7291o);
        if (l < 0 || obj.equals(this.f7292p[l])) {
            return l;
        }
        int i12 = l + 1;
        while (i12 < i11 && this.f7291o[i12] == i10) {
            if (obj.equals(this.f7292p[i12])) {
                return i12;
            }
            i12++;
        }
        int i13 = l - 1;
        while (i13 >= 0 && this.f7291o[i13] == i10) {
            if (obj.equals(this.f7292p[i13])) {
                return i13;
            }
            i13--;
        }
        return ~i12;
    }

    public final int indexOf(Object obj) {
        return obj == null ? k() : i(obj.hashCode(), obj);
    }

    public final boolean isEmpty() {
        return this.f7293q <= 0;
    }

    public final Iterator<E> iterator() {
        if (this.f7294r == null) {
            this.f7294r = new c(this);
        }
        c cVar = this.f7294r;
        if (cVar.f7314b == null) {
            cVar.f7314b = new h.c();
        }
        return cVar.f7314b.iterator();
    }

    public final int k() {
        int i10 = this.f7293q;
        if (i10 == 0) {
            return -1;
        }
        int l = e.l(i10, 0, this.f7291o);
        if (l < 0 || this.f7292p[l] == null) {
            return l;
        }
        int i11 = l + 1;
        while (i11 < i10 && this.f7291o[i11] == 0) {
            if (this.f7292p[i11] == null) {
                return i11;
            }
            i11++;
        }
        int i12 = l - 1;
        while (i12 >= 0 && this.f7291o[i12] == 0) {
            if (this.f7292p[i12] == null) {
                return i12;
            }
            i12--;
        }
        return ~i11;
    }

    public final void m(int i10) {
        Object[] objArr = this.f7292p;
        Object obj = objArr[i10];
        int i11 = this.f7293q;
        if (i11 <= 1) {
            h(this.f7291o, objArr, i11);
            this.f7291o = f7287s;
            this.f7292p = f7288t;
            this.f7293q = 0;
            return;
        }
        int[] iArr = this.f7291o;
        int i12 = 8;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            int i13 = i11 - 1;
            this.f7293q = i13;
            if (i10 < i13) {
                int i14 = i10 + 1;
                System.arraycopy(iArr, i14, iArr, i10, i13 - i10);
                Object[] objArr2 = this.f7292p;
                System.arraycopy(objArr2, i14, objArr2, i10, this.f7293q - i10);
            }
            this.f7292p[this.f7293q] = null;
            return;
        }
        if (i11 > 8) {
            i12 = i11 + (i11 >> 1);
        }
        e(i12);
        this.f7293q--;
        if (i10 > 0) {
            System.arraycopy(iArr, 0, this.f7291o, 0, i10);
            System.arraycopy(objArr, 0, this.f7292p, 0, i10);
        }
        int i15 = this.f7293q;
        if (i10 < i15) {
            int i16 = i10 + 1;
            System.arraycopy(iArr, i16, this.f7291o, i10, i15 - i10);
            System.arraycopy(objArr, i16, this.f7292p, i10, this.f7293q - i10);
        }
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        m(indexOf);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public final boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i10 = this.f7293q - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f7292p[i10])) {
                m(i10);
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        return this.f7293q;
    }

    public final Object[] toArray() {
        int i10 = this.f7293q;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f7292p, 0, objArr, 0, i10);
        return objArr;
    }

    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f7293q) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f7293q);
        }
        System.arraycopy(this.f7292p, 0, tArr, 0, this.f7293q);
        int length = tArr.length;
        int i10 = this.f7293q;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f7293q * 14);
        sb.append('{');
        for (int i10 = 0; i10 < this.f7293q; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            Object obj = this.f7292p[i10];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

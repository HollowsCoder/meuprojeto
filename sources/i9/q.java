package i9;

import com.karumi.dexter.BuildConfig;
import f9.h;
import f9.l;
import j9.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n8.d;
import o8.k;
import z8.g;

public final class q implements Iterable<d<? extends String, ? extends String>> {

    /* renamed from: p  reason: collision with root package name */
    public static final b f6299p = new b();

    /* renamed from: o  reason: collision with root package name */
    public final String[] f6300o;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f6301a = new ArrayList(20);

        public final void a(String str, String str2) {
            g.f(str, "name");
            g.f(str2, "value");
            q.f6299p.getClass();
            b.a(str);
            b.b(str2, str);
            c(str, str2);
        }

        public final void b(String str) {
            g.f(str, "line");
            int g02 = l.g0(str, ':', 1, false, 4);
            if (g02 != -1) {
                String substring = str.substring(0, g02);
                g.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = str.substring(g02 + 1);
                g.e(substring2, "(this as java.lang.String).substring(startIndex)");
                c(substring, substring2);
                return;
            }
            if (str.charAt(0) == ':') {
                str = str.substring(1);
                g.e(str, "(this as java.lang.String).substring(startIndex)");
            }
            c(BuildConfig.FLAVOR, str);
        }

        public final void c(String str, String str2) {
            g.f(str, "name");
            g.f(str2, "value");
            ArrayList arrayList = this.f6301a;
            arrayList.add(str);
            arrayList.add(l.q0(str2).toString());
        }

        public final q d() {
            Object[] array = this.f6301a.toArray(new String[0]);
            if (array != null) {
                return new q((String[]) array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public final String e(String str) {
            g.f(str, "name");
            ArrayList arrayList = this.f6301a;
            c9.a I = s6.a.I(new c9.a(arrayList.size() - 2, 0, -1), 2);
            int i10 = I.f2194o;
            int i11 = I.f2195p;
            int i12 = I.f2196q;
            if (i12 >= 0) {
                if (i10 > i11) {
                    return null;
                }
            } else if (i10 < i11) {
                return null;
            }
            while (!h.V(str, (String) arrayList.get(i10))) {
                if (i10 == i11) {
                    return null;
                }
                i10 += i12;
            }
            return (String) arrayList.get(i10 + 1);
        }

        public final void f(String str) {
            g.f(str, "name");
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f6301a;
                if (i10 < arrayList.size()) {
                    if (h.V(str, (String) arrayList.get(i10))) {
                        arrayList.remove(i10);
                        arrayList.remove(i10);
                        i10 -= 2;
                    }
                    i10 += 2;
                } else {
                    return;
                }
            }
        }
    }

    public static final class b {
        public static void a(String str) {
            if (str.length() > 0) {
                int length = str.length();
                int i10 = 0;
                while (i10 < length) {
                    char charAt = str.charAt(i10);
                    if ('!' <= charAt && '~' >= charAt) {
                        i10++;
                    } else {
                        throw new IllegalArgumentException(c.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        public static void b(String str, String str2) {
            int length = str.length();
            int i10 = 0;
            while (i10 < length) {
                char charAt = str.charAt(i10);
                if (charAt == 9 || (' ' <= charAt && '~' >= charAt)) {
                    i10++;
                } else {
                    throw new IllegalArgumentException(c.h("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str2, str).toString());
                }
            }
        }

        public static q c(String... strArr) {
            if (strArr.length % 2 == 0) {
                Object clone = strArr.clone();
                if (clone != null) {
                    String[] strArr2 = (String[]) clone;
                    int length = strArr2.length;
                    int i10 = 0;
                    while (i10 < length) {
                        String str = strArr2[i10];
                        if (!(str != null)) {
                            throw new IllegalArgumentException("Headers cannot be null".toString());
                        } else if (str != null) {
                            strArr2[i10] = l.q0(str).toString();
                            i10++;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                    }
                    c9.a I = s6.a.I(s6.a.K(0, strArr2.length), 2);
                    int i11 = I.f2194o;
                    int i12 = I.f2195p;
                    int i13 = I.f2196q;
                    if (i13 < 0 ? i11 >= i12 : i11 <= i12) {
                        while (true) {
                            String str2 = strArr2[i11];
                            String str3 = strArr2[i11 + 1];
                            a(str2);
                            b(str3, str2);
                            if (i11 == i12) {
                                break;
                            }
                            i11 += i13;
                        }
                    }
                    return new q(strArr2);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    public q(String[] strArr) {
        this.f6300o = strArr;
    }

    public final String e(String str) {
        g.f(str, "name");
        f6299p.getClass();
        String[] strArr = this.f6300o;
        c9.a I = s6.a.I(new c9.a(strArr.length - 2, 0, -1), 2);
        int i10 = I.f2194o;
        int i11 = I.f2195p;
        int i12 = I.f2196q;
        if (i12 < 0 ? i10 >= i11 : i10 <= i11) {
            while (!h.V(str, strArr[i10])) {
                if (i10 != i11) {
                    i10 += i12;
                }
            }
            return strArr[i10 + 1];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            if (Arrays.equals(this.f6300o, ((q) obj).f6300o)) {
                return true;
            }
        }
        return false;
    }

    public final String h(int i10) {
        return this.f6300o[i10 * 2];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6300o);
    }

    public final a i() {
        a aVar = new a();
        ArrayList arrayList = aVar.f6301a;
        g.f(arrayList, "<this>");
        String[] strArr = this.f6300o;
        g.f(strArr, "elements");
        arrayList.addAll(f9.d.M(strArr));
        return aVar;
    }

    public final Iterator<d<String, String>> iterator() {
        int length = this.f6300o.length / 2;
        d[] dVarArr = new d[length];
        for (int i10 = 0; i10 < length; i10++) {
            dVarArr[i10] = new d(h(i10), k(i10));
        }
        return new z8.a(dVarArr);
    }

    public final String k(int i10) {
        return this.f6300o[(i10 * 2) + 1];
    }

    public final List<String> m(String str) {
        g.f(str, "name");
        int length = this.f6300o.length / 2;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < length; i10++) {
            if (h.V(str, h(i10))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(k(i10));
            }
        }
        if (arrayList == null) {
            return k.f7764o;
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        g.e(unmodifiableList, "Collections.unmodifiableList(result)");
        return unmodifiableList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.f6300o.length / 2;
        for (int i10 = 0; i10 < length; i10++) {
            sb.append(h(i10));
            sb.append(": ");
            sb.append(k(i10));
            sb.append("\n");
        }
        String sb2 = sb.toString();
        g.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}

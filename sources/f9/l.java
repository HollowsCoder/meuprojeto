package f9;

import b0.d;
import c9.a;
import c9.b;
import c9.c;
import e9.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o8.e;
import p9.u;
import z8.g;

public class l extends h {
    public static boolean c0(CharSequence charSequence, String str) {
        g.f(charSequence, "<this>");
        if (h0(charSequence, str, 0, false, 2) >= 0) {
            return true;
        }
        return false;
    }

    public static final int d0(CharSequence charSequence) {
        g.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int e0(int i10, CharSequence charSequence, String str, boolean z) {
        g.f(charSequence, "<this>");
        g.f(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i10);
        }
        return f0(charSequence, str, i10, charSequence.length(), z, false);
    }

    public static final int f0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z, boolean z10) {
        a aVar;
        if (!z10) {
            if (i10 < 0) {
                i10 = 0;
            }
            int length = charSequence.length();
            if (i11 > length) {
                i11 = length;
            }
            aVar = new c(i10, i11);
        } else {
            int d02 = d0(charSequence);
            if (i10 > d02) {
                i10 = d02;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            aVar = new a(i10, i11, -1);
        }
        boolean z11 = charSequence instanceof String;
        int i12 = aVar.f2194o;
        int i13 = aVar.f2196q;
        int i14 = aVar.f2195p;
        if (!z11 || !(charSequence2 instanceof String)) {
            if ((i13 > 0 && i12 <= i14) || (i13 < 0 && i14 <= i12)) {
                while (true) {
                    if (!k0(charSequence2, 0, charSequence, i12, charSequence2.length(), z)) {
                        if (i12 == i14) {
                            break;
                        }
                        i12 += i13;
                    } else {
                        return i12;
                    }
                }
            }
        } else if ((i13 > 0 && i12 <= i14) || (i13 < 0 && i14 <= i12)) {
            while (true) {
                if (!h.X(0, i12, charSequence2.length(), (String) charSequence2, (String) charSequence, z)) {
                    if (i12 == i14) {
                        break;
                    }
                    i12 += i13;
                } else {
                    return i12;
                }
            }
        }
        return -1;
    }

    public static int g0(CharSequence charSequence, char c10, int i10, boolean z, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z = false;
        }
        g.f(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c10, i10);
        }
        return i0(i10, charSequence, z, new char[]{c10});
    }

    public static /* synthetic */ int h0(CharSequence charSequence, String str, int i10, boolean z, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z = false;
        }
        return e0(i10, charSequence, str, z);
    }

    public static final int i0(int i10, CharSequence charSequence, boolean z, char[] cArr) {
        boolean z10;
        g.f(charSequence, "<this>");
        g.f(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            if (i10 < 0) {
                i10 = 0;
            }
            c cVar = new c(i10, d0(charSequence));
            b bVar = new b(i10, cVar.f2195p, cVar.f2196q);
            while (bVar.f2199q) {
                int nextInt = bVar.nextInt();
                char charAt = charSequence.charAt(nextInt);
                int length = cArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        z10 = false;
                        continue;
                        break;
                    } else if (u.g(cArr[i11], charAt, z)) {
                        z10 = true;
                        continue;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (z10) {
                    return nextInt;
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(d.R(cArr), i10);
    }

    public static int j0(CharSequence charSequence, char c10, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = d0(charSequence);
        }
        g.f(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c10, i10);
        }
        char[] cArr = {c10};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(d.R(cArr), i10);
        }
        int d02 = d0(charSequence);
        if (i10 > d02) {
            i10 = d02;
        }
        while (-1 < i10) {
            if (u.g(cArr[0], charSequence.charAt(i10), false)) {
                return i10;
            }
            i10--;
        }
        return -1;
    }

    public static final boolean k0(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z) {
        g.f(charSequence, "<this>");
        g.f(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!u.g(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z)) {
                return false;
            }
        }
        return true;
    }

    public static final String l0(String str, String str2) {
        if (!h.a0(str2, str, false)) {
            return str2;
        }
        String substring = str2.substring(str.length());
        g.e(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final void m0(int i10) {
        boolean z;
        if (i10 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(d.c("Limit must be non-negative, but was ", i10).toString());
        }
    }

    public static List n0(CharSequence charSequence, char[] cArr) {
        g.f(charSequence, "<this>");
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            m0(0);
            int e02 = e0(0, charSequence, valueOf, false);
            if (e02 == -1) {
                return u.l(charSequence.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int i10 = 0;
            do {
                arrayList.add(charSequence.subSequence(i10, e02).toString());
                i10 = valueOf.length() + e02;
                e02 = e0(i10, charSequence, valueOf, false);
            } while (e02 != -1);
            arrayList.add(charSequence.subSequence(i10, charSequence.length()).toString());
            return arrayList;
        }
        m0(0);
        h hVar = new h(new b(charSequence, 0, 0, new i(cArr, false)));
        ArrayList arrayList2 = new ArrayList(e.u(hVar));
        Iterator<Object> it = hVar.iterator();
        while (it.hasNext()) {
            arrayList2.add(o0(charSequence, (c) it.next()));
        }
        return arrayList2;
    }

    public static final String o0(CharSequence charSequence, c cVar) {
        g.f(charSequence, "<this>");
        g.f(cVar, "range");
        return charSequence.subSequence(Integer.valueOf(cVar.f2194o).intValue(), Integer.valueOf(cVar.f2195p).intValue() + 1).toString();
    }

    public static String p0(String str) {
        g.f(str, "<this>");
        g.f(str, "missingDelimiterValue");
        int j02 = j0(str, '.', 0, 6);
        if (j02 == -1) {
            return str;
        }
        String substring = str.substring(j02 + 1, str.length());
        g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final CharSequence q0(CharSequence charSequence) {
        g.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z = false;
        while (i10 <= length) {
            boolean i11 = u.i(charSequence.charAt(!z ? i10 : length));
            if (!z) {
                if (!i11) {
                    z = true;
                } else {
                    i10++;
                }
            } else if (!i11) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }
}

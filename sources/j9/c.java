package j9;

import f9.a;
import f9.d;
import f9.l;
import i9.a0;
import i9.b0;
import i9.c0;
import i9.d0;
import i9.e0;
import i9.q;
import i9.r;
import i9.t;
import i9.v;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import o8.k;
import p9.u;
import w9.f;
import w9.i;
import w9.j;
import w9.r;
import z8.g;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f6602a;

    /* renamed from: b  reason: collision with root package name */
    public static final q f6603b = q.b.c(new String[0]);

    /* renamed from: c  reason: collision with root package name */
    public static final e0 f6604c;
    public static final r d;

    /* renamed from: e  reason: collision with root package name */
    public static final TimeZone f6605e;

    /* renamed from: f  reason: collision with root package name */
    public static final f9.c f6606f = new f9.c("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: g  reason: collision with root package name */
    public static final String f6607g;

    static {
        byte[] bArr = new byte[0];
        f6602a = bArr;
        q.f6299p.getClass();
        d0.f6228p.getClass();
        f fVar = new f();
        fVar.write(bArr, 0, 0);
        long j8 = (long) 0;
        f6604c = new e0((t) null, j8, fVar);
        b0.f6166a.getClass();
        if ((j8 | j8) < 0 || j8 > j8 || j8 - j8 < j8) {
            throw new ArrayIndexOutOfBoundsException();
        }
        new a0((t) null, bArr, 0, 0);
        r.a aVar = r.f9347q;
        j jVar = j.f9328r;
        j[] jVarArr = {j.a.b("efbbbf"), j.a.b("feff"), j.a.b("fffe"), j.a.b("0000ffff"), j.a.b("ffff0000")};
        aVar.getClass();
        d = r.a.b(jVarArr);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        g.c(timeZone);
        f6605e = timeZone;
        String l02 = l.l0("okhttp3.", v.class.getName());
        if (l02.endsWith("Client")) {
            l02 = l02.substring(0, l02.length() - "Client".length());
            g.e(l02, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        f6607g = l02;
    }

    public static final boolean a(i9.r rVar, i9.r rVar2) {
        g.f(rVar, "$this$canReuseConnectionFor");
        g.f(rVar2, "other");
        return g.a(rVar.f6306e, rVar2.f6306e) && rVar.f6307f == rVar2.f6307f && g.a(rVar.f6304b, rVar2.f6304b);
    }

    public static final int b(TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(30);
        boolean z = true;
        if (millis <= ((long) Integer.MAX_VALUE)) {
            if (millis == 0) {
                z = false;
            }
            if (z) {
                return (int) millis;
            }
            throw new IllegalArgumentException("timeout".concat(" too small.").toString());
        }
        throw new IllegalArgumentException("timeout".concat(" too large.").toString());
    }

    public static final void c(Closeable closeable) {
        g.f(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Exception unused) {
        }
    }

    public static final int e(String str, char c10, int i10, int i11) {
        g.f(str, "$this$delimiterOffset");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int f(String str, String str2, int i10, int i11) {
        g.f(str, "$this$delimiterOffset");
        while (i10 < i11) {
            boolean z = false;
            if (l.g0(str2, str.charAt(i10), 0, false, 2) >= 0) {
                z = true;
            }
            if (z) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final boolean g(w9.b0 b0Var, TimeUnit timeUnit) {
        g.f(b0Var, "$this$discard");
        g.f(timeUnit, "timeUnit");
        try {
            return s(b0Var, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String h(String str, Object... objArr) {
        g.f(str, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        g.e(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public static final boolean i(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        g.f(strArr, "$this$hasIntersection");
        g.f(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String compare : strArr2) {
                        if (comparator.compare(str, compare) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long j(c0 c0Var) {
        String e10 = c0Var.u.e("Content-Length");
        if (e10 != null) {
            try {
                return Long.parseLong(e10);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    @SafeVarargs
    public static final <T> List<T> k(T... tArr) {
        List list;
        g.f(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        g.f(copyOf, "elements");
        if (copyOf.length > 0) {
            list = d.M(copyOf);
        } else {
            list = k.f7764o;
        }
        List<T> unmodifiableList = Collections.unmodifiableList(list);
        g.e(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int l(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (g.h(charAt, 31) <= 0 || g.h(charAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int m(String str, int i10, int i11) {
        g.f(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int n(String str, int i10, int i11) {
        g.f(str, "$this$indexOfLastNonAsciiWhitespace");
        int i12 = i11 - 1;
        if (i12 >= i10) {
            while (true) {
                char charAt = str.charAt(i12);
                if (charAt == 9 || charAt == 10 || charAt == 12 || charAt == 13 || charAt == ' ') {
                    if (i12 == i10) {
                        break;
                    }
                    i12--;
                } else {
                    return i12 + 1;
                }
            }
        }
        return i10;
    }

    public static final String[] o(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        g.f(strArr2, "other");
        g.f(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i10++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final int p(char c10) {
        if ('0' <= c10 && '9' >= c10) {
            return c10 - '0';
        }
        char c11 = 'a';
        if ('a' > c10 || 'f' < c10) {
            c11 = 'A';
            if ('A' > c10 || 'F' < c10) {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public static final Charset q(i iVar, Charset charset) {
        Charset charset2;
        String str;
        Charset charset3;
        g.f(iVar, "$this$readBomAsCharset");
        g.f(charset, "default");
        int A = iVar.A(d);
        if (A == -1) {
            return charset;
        }
        if (A == 0) {
            charset2 = StandardCharsets.UTF_8;
            str = "UTF_8";
        } else if (A == 1) {
            charset2 = StandardCharsets.UTF_16BE;
            str = "UTF_16BE";
        } else if (A != 2) {
            if (A == 3) {
                a.f4926a.getClass();
                charset3 = a.d;
                if (charset3 == null) {
                    charset3 = Charset.forName("UTF-32BE");
                    g.e(charset3, "forName(\"UTF-32BE\")");
                    a.d = charset3;
                }
            } else if (A == 4) {
                a.f4926a.getClass();
                charset3 = a.f4928c;
                if (charset3 == null) {
                    charset3 = Charset.forName("UTF-32LE");
                    g.e(charset3, "forName(\"UTF-32LE\")");
                    a.f4928c = charset3;
                }
            } else {
                throw new AssertionError();
            }
            return charset3;
        } else {
            charset2 = StandardCharsets.UTF_16LE;
            str = "UTF_16LE";
        }
        g.e(charset2, str);
        return charset2;
    }

    public static final int r(i iVar) {
        g.f(iVar, "$this$readMedium");
        return (iVar.readByte() & 255) | ((iVar.readByte() & 255) << 16) | ((iVar.readByte() & 255) << 8);
    }

    public static final boolean s(w9.b0 b0Var, int i10, TimeUnit timeUnit) {
        g.f(b0Var, "$this$skipAll");
        g.f(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c10 = b0Var.h().e() ? b0Var.h().c() - nanoTime : Long.MAX_VALUE;
        b0Var.h().d(Math.min(c10, timeUnit.toNanos((long) i10)) + nanoTime);
        try {
            f fVar = new f();
            while (b0Var.w(fVar, 8192) != -1) {
                fVar.c();
            }
            int i11 = (c10 > Long.MAX_VALUE ? 1 : (c10 == Long.MAX_VALUE ? 0 : -1));
            w9.c0 h10 = b0Var.h();
            if (i11 == 0) {
                h10.a();
            } else {
                h10.d(nanoTime + c10);
            }
            return true;
        } catch (InterruptedIOException unused) {
            int i12 = (c10 > Long.MAX_VALUE ? 1 : (c10 == Long.MAX_VALUE ? 0 : -1));
            w9.c0 h11 = b0Var.h();
            if (i12 == 0) {
                h11.a();
            } else {
                h11.d(nanoTime + c10);
            }
            return false;
        } catch (Throwable th) {
            int i13 = (c10 > Long.MAX_VALUE ? 1 : (c10 == Long.MAX_VALUE ? 0 : -1));
            w9.c0 h12 = b0Var.h();
            if (i13 == 0) {
                h12.a();
            } else {
                h12.d(nanoTime + c10);
            }
            throw th;
        }
    }

    public static final q t(List<p9.c> list) {
        q.a aVar = new q.a();
        for (p9.c next : list) {
            aVar.c(next.f7973b.s(), next.f7974c.s());
        }
        return aVar.d();
    }

    public static final String u(i9.r rVar, boolean z) {
        g.f(rVar, "$this$toHostHeader");
        String str = rVar.f6306e;
        if (l.c0(str, ":")) {
            str = "[" + str + ']';
        }
        int i10 = rVar.f6307f;
        if (!z) {
            i9.r.l.getClass();
            if (i10 == r.b.b(rVar.f6304b)) {
                return str;
            }
        }
        return str + ':' + i10;
    }

    public static final <T> List<T> v(List<? extends T> list) {
        g.f(list, "$this$toImmutableList");
        List<T> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        g.e(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int w(String str, int i10) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > ((long) Integer.MAX_VALUE)) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public static final String x(String str, int i10, int i11) {
        int m10 = m(str, i10, i11);
        String substring = str.substring(m10, n(str, m10, i11));
        g.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final void y(IOException iOException, List list) {
        g.f(iOException, "$this$withSuppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u.b(iOException, (Exception) it.next());
        }
    }
}

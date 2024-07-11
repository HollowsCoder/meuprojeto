package h5;

import android.text.TextUtils;
import android.util.Log;
import com.karumi.dexter.BuildConfig;
import n4.m;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class g3 extends r4 {
    public final e3 A = new e3(this, 3, false, false);
    public final e3 B = new e3(this, 2, false, false);

    /* renamed from: q  reason: collision with root package name */
    public char f5394q = 0;

    /* renamed from: r  reason: collision with root package name */
    public long f5395r = -1;

    /* renamed from: s  reason: collision with root package name */
    public String f5396s;

    /* renamed from: t  reason: collision with root package name */
    public final e3 f5397t = new e3(this, 6, false, false);
    public final e3 u = new e3(this, 6, true, false);

    /* renamed from: v  reason: collision with root package name */
    public final e3 f5398v = new e3(this, 6, false, true);
    public final e3 w = new e3(this, 5, false, false);

    /* renamed from: x  reason: collision with root package name */
    public final e3 f5399x = new e3(this, 5, true, false);

    /* renamed from: y  reason: collision with root package name */
    public final e3 f5400y = new e3(this, 5, false, true);
    public final e3 z = new e3(this, 4, false, false);

    public g3(i4 i4Var) {
        super(i4Var);
    }

    public static f3 p(String str) {
        if (str == null) {
            return null;
        }
        return new f3(str);
    }

    public static String s(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2 = BuildConfig.FLAVOR;
        if (str == null) {
            str = str2;
        }
        String t10 = t(obj, z10);
        String t11 = t(obj2, z10);
        String t12 = t(obj3, z10);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(t10)) {
            sb.append(str2);
            sb.append(t10);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(t11)) {
            sb.append(str2);
            sb.append(t11);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(t12)) {
            sb.append(str3);
            sb.append(t12);
        }
        return sb.toString();
    }

    public static String t(Object obj, boolean z10) {
        String str;
        String className;
        String str2 = BuildConfig.FLAVOR;
        if (obj == null) {
            return str2;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z10) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            int i10 = (Math.abs(l.longValue()) > 100 ? 1 : (Math.abs(l.longValue()) == 100 ? 0 : -1));
            String valueOf = String.valueOf(obj);
            if (i10 < 0) {
                return valueOf;
            }
            if (valueOf.charAt(0) == '-') {
                str2 = "-";
            }
            String valueOf2 = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf2.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf2.length()) - 4.0d);
            StringBuilder sb = new StringBuilder(str2.length() + 43 + str2.length());
            sb.append(str2);
            sb.append(round);
            sb.append("...");
            sb.append(str2);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                if (z10) {
                    str = th.getClass().getName();
                } else {
                    str = th.toString();
                }
                StringBuilder sb2 = new StringBuilder(str);
                String canonicalName = i4.class.getCanonicalName();
                if (TextUtils.isEmpty(canonicalName)) {
                    canonicalName = str2;
                } else {
                    int lastIndexOf = canonicalName.lastIndexOf(46);
                    if (lastIndexOf != -1) {
                        canonicalName = canonicalName.substring(0, lastIndexOf);
                    }
                }
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i11];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                        if (TextUtils.isEmpty(className)) {
                            className = str2;
                        } else {
                            int lastIndexOf2 = className.lastIndexOf(46);
                            if (lastIndexOf2 != -1) {
                                className = className.substring(0, lastIndexOf2);
                            }
                        }
                        if (className.equals(canonicalName)) {
                            sb2.append(": ");
                            sb2.append(stackTraceElement);
                            break;
                        }
                    }
                    i11++;
                }
                return sb2.toString();
            } else if (obj instanceof f3) {
                return ((f3) obj).f5372a;
            } else {
                if (z10) {
                    return "-";
                }
                return String.valueOf(obj);
            }
        }
    }

    public final boolean h() {
        return false;
    }

    public final e3 k() {
        return this.f5397t;
    }

    public final e3 l() {
        return this.w;
    }

    public final e3 m() {
        return this.f5400y;
    }

    public final e3 n() {
        return this.A;
    }

    public final e3 o() {
        return this.B;
    }

    public final void q(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        String r5;
        String str2;
        if (!z10 && Log.isLoggable(r(), i10)) {
            Log.println(i10, r(), s(false, str, obj, obj2, obj3));
        }
        if (!z11 && i10 >= 5) {
            m.h(str);
            h4 h4Var = this.f5649o.f5459x;
            if (h4Var == null) {
                r5 = r();
                str2 = "Scheduler not set. Not logging error/warn";
            } else if (!h4Var.f5671p) {
                r5 = r();
                str2 = "Scheduler not initialized. Not logging error/warn";
            } else {
                if (i10 >= 9) {
                    i10 = 8;
                }
                h4Var.n(new d3(this, i10, str, obj, obj2, obj3));
                return;
            }
            Log.println(6, r5, str2);
        }
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    public final String r() {
        String str;
        synchronized (this) {
            try {
                if (this.f5396s == null) {
                    i4 i4Var = this.f5649o;
                    String str2 = i4Var.f5455r;
                    if (str2 != null) {
                        this.f5396s = str2;
                    } else {
                        i4Var.u.f5649o.getClass();
                        this.f5396s = "FA";
                    }
                }
                m.h(this.f5396s);
                str = this.f5396s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}

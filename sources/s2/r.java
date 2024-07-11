package s2;

import android.util.Log;
import com.karumi.dexter.BuildConfig;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import q2.f;

public final class r extends Exception {

    /* renamed from: t  reason: collision with root package name */
    public static final StackTraceElement[] f8677t = new StackTraceElement[0];

    /* renamed from: o  reason: collision with root package name */
    public final List<Throwable> f8678o;

    /* renamed from: p  reason: collision with root package name */
    public f f8679p;

    /* renamed from: q  reason: collision with root package name */
    public q2.a f8680q;

    /* renamed from: r  reason: collision with root package name */
    public Class<?> f8681r;

    /* renamed from: s  reason: collision with root package name */
    public final String f8682s;

    public static final class a implements Appendable {

        /* renamed from: o  reason: collision with root package name */
        public final Appendable f8683o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f8684p = true;

        public a(Appendable appendable) {
            this.f8683o = appendable;
        }

        public final Appendable append(char c10) {
            boolean z = this.f8684p;
            Appendable appendable = this.f8683o;
            boolean z10 = false;
            if (z) {
                this.f8684p = false;
                appendable.append("  ");
            }
            if (c10 == 10) {
                z10 = true;
            }
            this.f8684p = z10;
            appendable.append(c10);
            return this;
        }

        public final Appendable append(CharSequence charSequence) {
            if (charSequence == null) {
                charSequence = BuildConfig.FLAVOR;
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        public final Appendable append(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null) {
                charSequence = BuildConfig.FLAVOR;
            }
            boolean z = this.f8684p;
            Appendable appendable = this.f8683o;
            boolean z10 = false;
            if (z) {
                this.f8684p = false;
                appendable.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i11 - 1) == 10) {
                z10 = true;
            }
            this.f8684p = z10;
            appendable.append(charSequence, i10, i11);
            return this;
        }
    }

    public r(String str) {
        this(str, Collections.emptyList());
    }

    public r(String str, List<Throwable> list) {
        this.f8682s = str;
        setStackTrace(f8677t);
        this.f8678o = list;
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (th instanceof r) {
            for (Throwable a10 : ((r) th).f8678o) {
                a(a10, arrayList);
            }
            return;
        }
        arrayList.add(th);
    }

    public static void b(List list, a aVar) {
        try {
            c(list, aVar);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void c(List list, a aVar) {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            aVar.append((CharSequence) "Cause (");
            int i11 = i10 + 1;
            aVar.append((CharSequence) String.valueOf(i11));
            aVar.append(" of ");
            aVar.append(String.valueOf(size));
            aVar.append("): ");
            Throwable th = (Throwable) list.get(i10);
            if (th instanceof r) {
                ((r) th).f(aVar);
            } else {
                d(th, aVar);
            }
            i10 = i11;
        }
    }

    public static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i11 = i10 + 1;
            sb.append(i11);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i10));
            i10 = i11;
        }
    }

    public final void f(Appendable appendable) {
        d(this, appendable);
        b(this.f8678o, new a(appendable));
    }

    public final Throwable fillInStackTrace() {
        return this;
    }

    public final String getMessage() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f8682s);
        Class<?> cls = this.f8681r;
        String str4 = BuildConfig.FLAVOR;
        if (cls != null) {
            str = ", " + this.f8681r;
        } else {
            str = str4;
        }
        sb.append(str);
        if (this.f8680q != null) {
            str2 = ", " + this.f8680q;
        } else {
            str2 = str4;
        }
        sb.append(str2);
        if (this.f8679p != null) {
            str4 = ", " + this.f8679p;
        }
        sb.append(str4);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            str3 = "\nThere was 1 root cause:";
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            str3 = " root causes:";
        }
        sb.append(str3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append(10);
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public final void printStackTrace() {
        f(System.err);
    }

    public final void printStackTrace(PrintStream printStream) {
        f(printStream);
    }

    public final void printStackTrace(PrintWriter printWriter) {
        f(printWriter);
    }
}

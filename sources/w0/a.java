package w0;

import androidx.activity.result.c;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.n;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import java.io.PrintWriter;
import n.j;

public final class a extends c {

    /* renamed from: o  reason: collision with root package name */
    public final n f9150o;

    /* renamed from: p  reason: collision with root package name */
    public final b f9151p;

    /* renamed from: w0.a$a  reason: collision with other inner class name */
    public static class C0144a<D> extends s<D> {
        public final void f() {
            throw null;
        }

        public final void g() {
            throw null;
        }

        public final void h(t<? super D> tVar) {
            super.h(tVar);
        }

        public final void i(D d) {
            super.i(d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #0 : ");
            s6.a.i((n) null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    public static class b extends a0 {
        public static final C0145a d = new C0145a();

        /* renamed from: c  reason: collision with root package name */
        public final j<C0144a> f9152c = new j<>();

        /* renamed from: w0.a$b$a  reason: collision with other inner class name */
        public static class C0145a implements b0.b {
            public final <T extends a0> T a(Class<T> cls) {
                return new b();
            }
        }

        public final void a() {
            j<C0144a> jVar = this.f9152c;
            if (jVar.j() <= 0) {
                int i10 = jVar.f7338r;
                Object[] objArr = jVar.f7337q;
                for (int i11 = 0; i11 < i10; i11++) {
                    objArr[i11] = null;
                }
                jVar.f7338r = 0;
                jVar.f7335o = false;
                return;
            }
            jVar.k(0).getClass();
            throw null;
        }
    }

    public a(n nVar, c0 c0Var) {
        this.f9150o = nVar;
        this.f9151p = (b) new b0(c0Var, b.d).a(b.class);
    }

    @Deprecated
    public final void E(String str, PrintWriter printWriter) {
        j<C0144a> jVar = this.f9151p.f9152c;
        if (jVar.j() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (jVar.j() > 0) {
                C0144a k10 = jVar.k(0);
                printWriter.print(str);
                printWriter.print("  #");
                if (jVar.f7335o) {
                    jVar.e();
                }
                printWriter.print(jVar.f7336p[0]);
                printWriter.print(": ");
                printWriter.println(k10.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println((Object) null);
                throw null;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        s6.a.i(this.f9150o, sb);
        sb.append("}}");
        return sb.toString();
    }
}

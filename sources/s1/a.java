package s1;

import androidx.appcompat.widget.x0;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import n8.h;
import q2.e;
import w9.f;
import w9.j;
import w9.r;

public abstract class a implements Closeable {

    /* renamed from: s  reason: collision with root package name */
    public static final String[] f8542s = new String[128];

    /* renamed from: o  reason: collision with root package name */
    public int f8543o;

    /* renamed from: p  reason: collision with root package name */
    public int[] f8544p = new int[32];

    /* renamed from: q  reason: collision with root package name */
    public String[] f8545q = new String[32];

    /* renamed from: r  reason: collision with root package name */
    public int[] f8546r = new int[32];

    /* renamed from: s1.a$a  reason: collision with other inner class name */
    public static final class C0126a {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f8547a;

        /* renamed from: b  reason: collision with root package name */
        public final r f8548b;

        public C0126a(String[] strArr, r rVar) {
            this.f8547a = strArr;
            this.f8548b = rVar;
        }

        public static C0126a a(String... strArr) {
            String str;
            try {
                j[] jVarArr = new j[strArr.length];
                f fVar = new f();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    String str2 = strArr[i10];
                    String[] strArr2 = a.f8542s;
                    fVar.M(34);
                    int length = str2.length();
                    int i11 = 0;
                    for (int i12 = 0; i12 < length; i12++) {
                        char charAt = str2.charAt(i12);
                        if (charAt < 128) {
                            str = strArr2[charAt];
                            if (str == null) {
                            }
                        } else if (charAt == 8232) {
                            str = "\\u2028";
                        } else if (charAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i11 < i12) {
                            fVar.h0(str2, i11, i12);
                        }
                        fVar.g0(str);
                        i11 = i12 + 1;
                    }
                    if (i11 < length) {
                        fVar.h0(str2, i11, length);
                    }
                    fVar.M(34);
                    fVar.readByte();
                    jVarArr[i10] = fVar.u();
                }
                r.f9347q.getClass();
                return new C0126a((String[]) strArr.clone(), r.a.b(jVarArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f8542s[i10] = String.format("\\u%04x", new Object[]{Integer.valueOf(i10)});
        }
        String[] strArr = f8542s;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public final String f() {
        int i10 = this.f8543o;
        int[] iArr = this.f8544p;
        String[] strArr = this.f8545q;
        int[] iArr2 = this.f8546r;
        StringBuilder sb = new StringBuilder("$");
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 == 1 || i12 == 2) {
                sb.append('[');
                sb.append(iArr2[i11]);
                sb.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb.append('.');
                String str = strArr[i11];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public abstract boolean g();

    public abstract boolean j();

    public abstract double l();

    public abstract int n();

    public abstract String o();

    public abstract b r();

    public final void s(int i10) {
        int i11 = this.f8543o;
        int[] iArr = this.f8544p;
        if (i11 == iArr.length) {
            if (i11 != 256) {
                this.f8544p = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f8545q;
                this.f8545q = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f8546r;
                this.f8546r = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new h("Nesting too deep at " + f());
            }
        }
        int[] iArr3 = this.f8544p;
        int i12 = this.f8543o;
        this.f8543o = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int t(C0126a aVar);

    public abstract void u();

    public abstract void x();

    public final void y(String str) {
        StringBuilder h10 = x0.h(str, " at path ");
        h10.append(f());
        throw new e(h10.toString());
    }
}

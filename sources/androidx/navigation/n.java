package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

public abstract class n<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final c f1519b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final d f1520c = new d();
    public static final e d = new e();

    /* renamed from: e  reason: collision with root package name */
    public static final f f1521e = new f();

    /* renamed from: f  reason: collision with root package name */
    public static final g f1522f = new g();

    /* renamed from: g  reason: collision with root package name */
    public static final h f1523g = new h();

    /* renamed from: h  reason: collision with root package name */
    public static final i f1524h = new i();

    /* renamed from: i  reason: collision with root package name */
    public static final j f1525i = new j();

    /* renamed from: j  reason: collision with root package name */
    public static final k f1526j = new k();

    /* renamed from: k  reason: collision with root package name */
    public static final a f1527k = new a();
    public static final b l = new b();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1528a;

    public class a extends n<String> {
        public a() {
            super(true);
        }

        public final Object a(String str, Bundle bundle) {
            return (String) bundle.get(str);
        }

        public final String b() {
            return "string";
        }

        public final Object c(String str) {
            return str;
        }

        public final void d(Bundle bundle, String str, Object obj) {
            bundle.putString(str, (String) obj);
        }
    }

    public class b extends n<String[]> {
        public b() {
            super(true);
        }

        public final Object a(String str, Bundle bundle) {
            return (String[]) bundle.get(str);
        }

        public final String b() {
            return "string[]";
        }

        public final Object c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public final void d(Bundle bundle, String str, Object obj) {
            bundle.putStringArray(str, (String[]) obj);
        }
    }

    public class c extends n<Integer> {
        public c() {
            super(false);
        }

        public final Object a(String str, Bundle bundle) {
            return (Integer) bundle.get(str);
        }

        public final String b() {
            return "integer";
        }

        public final Object c(String str) {
            int i10;
            if (str.startsWith("0x")) {
                i10 = Integer.parseInt(str.substring(2), 16);
            } else {
                i10 = Integer.parseInt(str);
            }
            return Integer.valueOf(i10);
        }

        public final void d(Bundle bundle, String str, Object obj) {
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    public class d extends n<Integer> {
        public d() {
            super(false);
        }

        public final Object a(String str, Bundle bundle) {
            return (Integer) bundle.get(str);
        }

        public final String b() {
            return "reference";
        }

        public final Object c(String str) {
            int i10;
            if (str.startsWith("0x")) {
                i10 = Integer.parseInt(str.substring(2), 16);
            } else {
                i10 = Integer.parseInt(str);
            }
            return Integer.valueOf(i10);
        }

        public final void d(Bundle bundle, String str, Object obj) {
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    public class e extends n<int[]> {
        public e() {
            super(true);
        }

        public final Object a(String str, Bundle bundle) {
            return (int[]) bundle.get(str);
        }

        public final String b() {
            return "integer[]";
        }

        public final Object c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public final void d(Bundle bundle, String str, Object obj) {
            bundle.putIntArray(str, (int[]) obj);
        }
    }

    public class f extends n<Long> {
        public f() {
            super(false);
        }

        public final Object a(String str, Bundle bundle) {
            return (Long) bundle.get(str);
        }

        public final String b() {
            return "long";
        }

        public final Object c(String str) {
            long j8;
            if (str.endsWith("L")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.startsWith("0x")) {
                j8 = Long.parseLong(str.substring(2), 16);
            } else {
                j8 = Long.parseLong(str);
            }
            return Long.valueOf(j8);
        }

        public final void d(Bundle bundle, String str, Object obj) {
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    public class g extends n<long[]> {
        public g() {
            super(true);
        }

        public final Object a(String str, Bundle bundle) {
            return (long[]) bundle.get(str);
        }

        public final String b() {
            return "long[]";
        }

        public final Object c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public final void d(Bundle bundle, String str, Object obj) {
            bundle.putLongArray(str, (long[]) obj);
        }
    }

    public class h extends n<Float> {
        public h() {
            super(false);
        }

        public final Object a(String str, Bundle bundle) {
            return (Float) bundle.get(str);
        }

        public final String b() {
            return "float";
        }

        public final Object c(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }

        public final void d(Bundle bundle, String str, Object obj) {
            bundle.putFloat(str, ((Float) obj).floatValue());
        }
    }

    public class i extends n<float[]> {
        public i() {
            super(true);
        }

        public final Object a(String str, Bundle bundle) {
            return (float[]) bundle.get(str);
        }

        public final String b() {
            return "float[]";
        }

        public final Object c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public final void d(Bundle bundle, String str, Object obj) {
            bundle.putFloatArray(str, (float[]) obj);
        }
    }

    public class j extends n<Boolean> {
        public j() {
            super(false);
        }

        public final Object a(String str, Bundle bundle) {
            return (Boolean) bundle.get(str);
        }

        public final String b() {
            return "boolean";
        }

        public final Object c(String str) {
            if ("true".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equals(str)) {
                return Boolean.FALSE;
            }
            throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        }

        public final void d(Bundle bundle, String str, Object obj) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    public class k extends n<boolean[]> {
        public k() {
            super(true);
        }

        public final Object a(String str, Bundle bundle) {
            return (boolean[]) bundle.get(str);
        }

        public final String b() {
            return "boolean[]";
        }

        public final Object c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public final void d(Bundle bundle, String str, Object obj) {
            bundle.putBooleanArray(str, (boolean[]) obj);
        }
    }

    public static final class l<D extends Enum> extends p<D> {

        /* renamed from: n  reason: collision with root package name */
        public final Class<D> f1529n;

        public l(Class<D> cls) {
            super(cls, 0);
            if (cls.isEnum()) {
                this.f1529n = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " is not an Enum type.");
        }

        public final String b() {
            return this.f1529n.getName();
        }

        /* renamed from: f */
        public final D e(String str) {
            Class<D> cls = this.f1529n;
            for (D d : (Enum[]) cls.getEnumConstants()) {
                if (d.name().equals(str)) {
                    return d;
                }
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + cls.getName() + ".");
        }
    }

    public static final class m<D extends Parcelable> extends n<D[]> {

        /* renamed from: m  reason: collision with root package name */
        public final Class<D[]> f1530m;

        public m(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls)) {
                try {
                    this.f1530m = Class.forName("[L" + cls.getName() + ";");
                } catch (ClassNotFoundException e10) {
                    throw new RuntimeException(e10);
                }
            } else {
                throw new IllegalArgumentException(cls + " does not implement Parcelable.");
            }
        }

        public final Object a(String str, Bundle bundle) {
            return (Parcelable[]) bundle.get(str);
        }

        public final String b() {
            return this.f1530m.getName();
        }

        public final Object c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public final void d(Bundle bundle, String str, Object obj) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            this.f1530m.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || m.class != obj.getClass()) {
                return false;
            }
            return this.f1530m.equals(((m) obj).f1530m);
        }

        public final int hashCode() {
            return this.f1530m.hashCode();
        }
    }

    /* renamed from: androidx.navigation.n$n  reason: collision with other inner class name */
    public static final class C0018n<D> extends n<D> {

        /* renamed from: m  reason: collision with root package name */
        public final Class<D> f1531m;

        public C0018n(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f1531m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Parcelable or Serializable.");
        }

        public final Object a(String str, Bundle bundle) {
            return bundle.get(str);
        }

        public final String b() {
            return this.f1531m.getName();
        }

        public final D c(String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public final void d(Bundle bundle, String str, D d) {
            this.f1531m.cast(d);
            if (d == null || (d instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d);
            } else if (d instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0018n.class != obj.getClass()) {
                return false;
            }
            return this.f1531m.equals(((C0018n) obj).f1531m);
        }

        public final int hashCode() {
            return this.f1531m.hashCode();
        }
    }

    public static final class o<D extends Serializable> extends n<D[]> {

        /* renamed from: m  reason: collision with root package name */
        public final Class<D[]> f1532m;

        public o(Class<D> cls) {
            super(true);
            if (Serializable.class.isAssignableFrom(cls)) {
                try {
                    this.f1532m = Class.forName("[L" + cls.getName() + ";");
                } catch (ClassNotFoundException e10) {
                    throw new RuntimeException(e10);
                }
            } else {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
        }

        public final Object a(String str, Bundle bundle) {
            return (Serializable[]) bundle.get(str);
        }

        public final String b() {
            return this.f1532m.getName();
        }

        public final Object c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, java.io.Serializable[], java.io.Serializable] */
        public final void d(Bundle bundle, String str, Object obj) {
            ? r42 = (Serializable[]) obj;
            this.f1532m.cast(r42);
            bundle.putSerializable(str, r42);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || o.class != obj.getClass()) {
                return false;
            }
            return this.f1532m.equals(((o) obj).f1532m);
        }

        public final int hashCode() {
            return this.f1532m.hashCode();
        }
    }

    public static class p<D extends Serializable> extends n<D> {

        /* renamed from: m  reason: collision with root package name */
        public final Class<D> f1533m;

        public p(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            } else if (!cls.isEnum()) {
                this.f1533m = cls;
            } else {
                throw new IllegalArgumentException(cls + " is an Enum. You should use EnumType instead.");
            }
        }

        public p(Class cls, int i10) {
            super(false);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f1533m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Serializable.");
        }

        public final Object a(String str, Bundle bundle) {
            return (Serializable) bundle.get(str);
        }

        public String b() {
            return this.f1533m.getName();
        }

        public final void d(Bundle bundle, String str, Object obj) {
            Serializable serializable = (Serializable) obj;
            this.f1533m.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        /* renamed from: e */
        public D c(String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            return this.f1533m.equals(((p) obj).f1533m);
        }

        public final int hashCode() {
            return this.f1533m.hashCode();
        }
    }

    public n(boolean z) {
        this.f1528a = z;
    }

    public abstract Object a(String str, Bundle bundle);

    public abstract String b();

    public abstract T c(String str);

    public abstract void d(Bundle bundle, String str, T t10);

    public final String toString() {
        return b();
    }
}

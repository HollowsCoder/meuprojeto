package f7;

import com.google.auto.value.AutoValue;
import f7.b;
import f7.g;
import f7.l;
import java.nio.charset.Charset;

@AutoValue
public abstract class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f4737a = Charset.forName("UTF-8");

    @AutoValue
    public static abstract class a {

        @AutoValue.Builder
        /* renamed from: f7.a0$a$a  reason: collision with other inner class name */
        public static abstract class C0056a {
        }

        public abstract int a();

        public abstract int b();

        public abstract String c();

        public abstract long d();

        public abstract int e();

        public abstract long f();

        public abstract long g();

        public abstract String h();
    }

    @AutoValue.Builder
    public static abstract class b {
    }

    @AutoValue
    public static abstract class c {
        public abstract String a();

        public abstract String b();
    }

    @AutoValue
    public static abstract class d {

        @AutoValue
        public static abstract class a {
            public abstract byte[] a();

            public abstract String b();
        }

        public abstract b0<a> a();

        public abstract String b();
    }

    @AutoValue
    public static abstract class e {

        @AutoValue
        public static abstract class a {

            @AutoValue
            /* renamed from: f7.a0$e$a$a  reason: collision with other inner class name */
            public static abstract class C0057a {
                public abstract void a();
            }

            public abstract String a();

            public abstract String b();

            public abstract String c();

            public abstract String d();

            public abstract String e();

            public abstract C0057a f();

            public abstract String g();
        }

        @AutoValue.Builder
        public static abstract class b {
        }

        @AutoValue
        public static abstract class c {

            @AutoValue.Builder
            public static abstract class a {
            }

            public abstract int a();

            public abstract int b();

            public abstract long c();

            public abstract String d();

            public abstract String e();

            public abstract String f();

            public abstract long g();

            public abstract int h();

            public abstract boolean i();
        }

        @AutoValue
        public static abstract class d {

            @AutoValue
            public static abstract class a {

                @AutoValue.Builder
                /* renamed from: f7.a0$e$d$a$a  reason: collision with other inner class name */
                public static abstract class C0058a {
                }

                @AutoValue
                public static abstract class b {

                    @AutoValue
                    /* renamed from: f7.a0$e$d$a$b$a  reason: collision with other inner class name */
                    public static abstract class C0059a {

                        @AutoValue.Builder
                        /* renamed from: f7.a0$e$d$a$b$a$a  reason: collision with other inner class name */
                        public static abstract class C0060a {
                        }

                        public abstract long a();

                        public abstract String b();

                        public abstract long c();

                        public abstract String d();
                    }

                    @AutoValue
                    /* renamed from: f7.a0$e$d$a$b$b  reason: collision with other inner class name */
                    public static abstract class C0061b {
                        public abstract C0061b a();

                        public abstract b0<C0062d.C0063a> b();

                        public abstract int c();

                        public abstract String d();

                        public abstract String e();
                    }

                    @AutoValue
                    public static abstract class c {
                        public abstract long a();

                        public abstract String b();

                        public abstract String c();
                    }

                    @AutoValue
                    /* renamed from: f7.a0$e$d$a$b$d  reason: collision with other inner class name */
                    public static abstract class C0062d {

                        @AutoValue
                        /* renamed from: f7.a0$e$d$a$b$d$a  reason: collision with other inner class name */
                        public static abstract class C0063a {

                            @AutoValue.Builder
                            /* renamed from: f7.a0$e$d$a$b$d$a$a  reason: collision with other inner class name */
                            public static abstract class C0064a {
                            }

                            public abstract String a();

                            public abstract int b();

                            public abstract long c();

                            public abstract long d();

                            public abstract String e();
                        }

                        public abstract b0<C0063a> a();

                        public abstract int b();

                        public abstract String c();
                    }

                    public abstract a a();

                    public abstract b0<C0059a> b();

                    public abstract C0061b c();

                    public abstract c d();

                    public abstract b0<C0062d> e();
                }

                public abstract Boolean a();

                public abstract b0<c> b();

                public abstract b c();

                public abstract b0<c> d();

                public abstract int e();

                public abstract l.a f();
            }

            @AutoValue.Builder
            public static abstract class b {
            }

            @AutoValue
            public static abstract class c {

                @AutoValue.Builder
                public static abstract class a {
                }

                public abstract Double a();

                public abstract int b();

                public abstract long c();

                public abstract int d();

                public abstract long e();

                public abstract boolean f();
            }

            @AutoValue
            /* renamed from: f7.a0$e$d$d  reason: collision with other inner class name */
            public static abstract class C0065d {
                public abstract String a();
            }

            public abstract a a();

            public abstract c b();

            public abstract C0065d c();

            public abstract long d();

            public abstract String e();
        }

        @AutoValue
        /* renamed from: f7.a0$e$e  reason: collision with other inner class name */
        public static abstract class C0066e {

            @AutoValue.Builder
            /* renamed from: f7.a0$e$e$a */
            public static abstract class a {
            }

            public abstract String a();

            public abstract int b();

            public abstract String c();

            public abstract boolean d();
        }

        @AutoValue
        public static abstract class f {
            public abstract String a();
        }

        public abstract a a();

        public abstract c b();

        public abstract Long c();

        public abstract b0<d> d();

        public abstract String e();

        public abstract int f();

        public abstract String g();

        public abstract C0066e h();

        public abstract long i();

        public abstract f j();

        public abstract boolean k();

        public abstract g.a l();
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract d e();

    public abstract int f();

    public abstract String g();

    public abstract e h();

    public final b i(long j8, boolean z, String str) {
        b bVar = (b) this;
        b.a aVar = new b.a(bVar);
        e eVar = bVar.f4743h;
        if (eVar != null) {
            g.a l = eVar.l();
            l.d = Long.valueOf(j8);
            l.f4786e = Boolean.valueOf(z);
            if (str != null) {
                l.f4788g = new v(str);
                l.a();
            }
            aVar.f4750g = l.a();
        }
        return aVar.a();
    }
}

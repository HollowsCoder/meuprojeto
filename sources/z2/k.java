package z2;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final e f9820a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static final c f9821b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final d f9822c;
    public static final f d = new f();

    /* renamed from: e  reason: collision with root package name */
    public static final d f9823e;

    /* renamed from: f  reason: collision with root package name */
    public static final q2.g<k> f9824f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f9825g = true;

    public static class a extends k {
        public final g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        public final float b(int i10, int i11, int i12, int i13) {
            int min = Math.min(i11 / i13, i10 / i12);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
    }

    public static class b extends k {
        public final g a(int i10, int i11, int i12, int i13) {
            return g.MEMORY;
        }

        public final float b(int i10, int i11, int i12, int i13) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i11) / ((float) i13), ((float) i10) / ((float) i12)));
            int i14 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i14 = 0;
            }
            return 1.0f / ((float) (max << i14));
        }
    }

    public static class c extends k {
        public final g a(int i10, int i11, int i12, int i13) {
            return b(i10, i11, i12, i13) == 1.0f ? g.QUALITY : k.f9820a.a(i10, i11, i12, i13);
        }

        public final float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, k.f9820a.b(i10, i11, i12, i13));
        }
    }

    public static class d extends k {
        public final g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        public final float b(int i10, int i11, int i12, int i13) {
            return Math.max(((float) i12) / ((float) i10), ((float) i13) / ((float) i11));
        }
    }

    public static class e extends k {
        public final g a(int i10, int i11, int i12, int i13) {
            return k.f9825g ? g.QUALITY : g.MEMORY;
        }

        public final float b(int i10, int i11, int i12, int i13) {
            if (k.f9825g) {
                return Math.min(((float) i12) / ((float) i10), ((float) i13) / ((float) i11));
            }
            int max = Math.max(i11 / i13, i10 / i12);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    public static class f extends k {
        public final g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        public final float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        new a();
        new b();
        d dVar = new d();
        f9822c = dVar;
        f9823e = dVar;
        f9824f = q2.g.a(dVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
    }

    public abstract g a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);
}

package g0;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final C0068d f4958a = new C0068d((a) null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final C0068d f4959b = new C0068d((a) null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final C0068d f4960c;
    public static final C0068d d;

    public static class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f4961a = new a();

        public final int a(CharSequence charSequence, int i10) {
            int i11 = i10 + 0;
            int i12 = 2;
            for (int i13 = 0; i13 < i11 && i12 == 2; i13++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i13));
                C0068d dVar = d.f4958a;
                if (directionality != 0) {
                    if (!(directionality == 1 || directionality == 2)) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i12 = 2;
                                break;
                        }
                    }
                    i12 = 0;
                }
                i12 = 1;
            }
            return i12;
        }
    }

    public interface b {
        int a(CharSequence charSequence, int i10);
    }

    public static abstract class c implements c {

        /* renamed from: a  reason: collision with root package name */
        public final b f4962a;

        public c(a aVar) {
            this.f4962a = aVar;
        }

        public abstract boolean a();

        public final boolean b(CharSequence charSequence, int i10) {
            if (charSequence == null || i10 < 0 || charSequence.length() - i10 < 0) {
                throw new IllegalArgumentException();
            }
            b bVar = this.f4962a;
            if (bVar == null) {
                return a();
            }
            int a10 = bVar.a(charSequence, i10);
            if (a10 == 0) {
                return true;
            }
            if (a10 != 1) {
                return a();
            }
            return false;
        }
    }

    /* renamed from: g0.d$d  reason: collision with other inner class name */
    public static class C0068d extends c {

        /* renamed from: b  reason: collision with root package name */
        public final boolean f4963b;

        public C0068d(a aVar, boolean z) {
            super(aVar);
            this.f4963b = z;
        }

        public final boolean a() {
            return this.f4963b;
        }
    }

    static {
        a aVar = a.f4961a;
        f4960c = new C0068d(aVar, false);
        d = new C0068d(aVar, true);
    }
}

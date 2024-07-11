package c8;

import c5.k;

public final class a {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ int f2179p = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f2180a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2181b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2182c;
    public final b d;

    /* renamed from: e  reason: collision with root package name */
    public final c f2183e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2184f;

    /* renamed from: g  reason: collision with root package name */
    public final String f2185g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2186h = 0;

    /* renamed from: i  reason: collision with root package name */
    public final int f2187i;

    /* renamed from: j  reason: collision with root package name */
    public final String f2188j;

    /* renamed from: k  reason: collision with root package name */
    public final long f2189k;
    public final C0029a l;

    /* renamed from: m  reason: collision with root package name */
    public final String f2190m;

    /* renamed from: n  reason: collision with root package name */
    public final long f2191n;

    /* renamed from: o  reason: collision with root package name */
    public final String f2192o;

    /* renamed from: c8.a$a  reason: collision with other inner class name */
    public enum C0029a implements k {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        
        private final int number_;

        private C0029a(int i10) {
            this.number_ = i10;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    public enum b implements k {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        
        private final int number_;

        private b(int i10) {
            this.number_ = i10;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    public enum c implements k {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        
        private final int number_;

        private c(int i10) {
            this.number_ = i10;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    static {
        b bVar = b.UNKNOWN;
        c cVar = c.UNKNOWN_OS;
        C0029a aVar = C0029a.UNKNOWN_EVENT;
    }

    public a(long j8, String str, String str2, b bVar, c cVar, String str3, String str4, int i10, String str5, C0029a aVar, String str6, String str7) {
        this.f2180a = j8;
        this.f2181b = str;
        this.f2182c = str2;
        this.d = bVar;
        this.f2183e = cVar;
        this.f2184f = str3;
        this.f2185g = str4;
        this.f2187i = i10;
        this.f2188j = str5;
        this.f2189k = 0;
        this.l = aVar;
        this.f2190m = str6;
        this.f2191n = 0;
        this.f2192o = str7;
    }
}

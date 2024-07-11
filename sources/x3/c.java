package x3;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final long f9474a;

    /* renamed from: b  reason: collision with root package name */
    public final a f9475b;

    public enum a implements r7.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        
        private final int number_;

        private a(int i10) {
            this.number_ = i10;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    static {
        a aVar = a.REASON_UNKNOWN;
    }

    public c(long j8, a aVar) {
        this.f9474a = j8;
        this.f9475b = aVar;
    }
}

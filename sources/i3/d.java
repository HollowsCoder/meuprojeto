package i3;

public interface d {

    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        
        private final boolean isComplete;

        private a(boolean z) {
            this.isComplete = z;
        }

        public boolean isComplete() {
            return this.isComplete;
        }
    }

    boolean a();

    void b(c cVar);

    void e(c cVar);

    d getRoot();

    boolean h(c cVar);

    boolean i(c cVar);

    boolean j(c cVar);
}

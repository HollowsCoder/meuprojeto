package t7;

public interface d {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        
        private final int code;

        private a(int i10) {
            this.code = i10;
        }

        public int getCode() {
            return this.code;
        }
    }

    a a(String str);
}

package j2;

public enum b {
    OK(0),
    ERROR(1),
    WARNING(2),
    INFO(3);
    
    private int value;

    private b(int i10) {
        this.value = i10;
    }

    public final int getValue() {
        return this.value;
    }

    public final void setValue(int i10) {
        this.value = i10;
    }
}

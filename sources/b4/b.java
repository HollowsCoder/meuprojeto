package b4;

public interface b {

    public interface a<T> {
        T b();
    }

    <T> T c(a<T> aVar);
}

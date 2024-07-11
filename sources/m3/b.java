package m3;

public final class b<K, V> extends n.b<K, V> {
    public int w;

    public final void clear() {
        this.w = 0;
        super.clear();
    }

    public final int hashCode() {
        if (this.w == 0) {
            this.w = super.hashCode();
        }
        return this.w;
    }

    public final void i(n.b bVar) {
        this.w = 0;
        super.i(bVar);
    }

    public final V j(int i10) {
        this.w = 0;
        return super.j(i10);
    }

    public final V k(int i10, V v10) {
        this.w = 0;
        return super.k(i10, v10);
    }

    public final V put(K k10, V v10) {
        this.w = 0;
        return super.put(k10, v10);
    }
}

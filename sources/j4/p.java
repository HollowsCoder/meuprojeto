package j4;

import java.lang.ref.WeakReference;

public abstract class p extends n {
    public static final WeakReference<byte[]> d = new WeakReference<>((Object) null);

    /* renamed from: c  reason: collision with root package name */
    public WeakReference<byte[]> f6562c = d;

    public p(byte[] bArr) {
        super(bArr);
    }

    public final byte[] J() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f6562c.get();
            if (bArr == null) {
                bArr = L();
                this.f6562c = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    public abstract byte[] L();
}

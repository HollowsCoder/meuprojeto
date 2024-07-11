package androidx.emoji2.text;

import java.nio.ByteBuffer;
import q0.a;
import q0.b;

public final class h {
    public static final ThreadLocal<a> d = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final int f1061a;

    /* renamed from: b  reason: collision with root package name */
    public final m f1062b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f1063c = 0;

    public h(m mVar, int i10) {
        this.f1062b = mVar;
        this.f1061a = i10;
    }

    public final int a(int i10) {
        a c10 = c();
        int a10 = c10.a(16);
        if (a10 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = c10.f8207b;
        int i11 = a10 + c10.f8206a;
        return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
    }

    public final int b() {
        a c10 = c();
        int a10 = c10.a(16);
        if (a10 == 0) {
            return 0;
        }
        int i10 = a10 + c10.f8206a;
        return c10.f8207b.getInt(c10.f8207b.getInt(i10) + i10);
    }

    public final a c() {
        short s10;
        ThreadLocal<a> threadLocal = d;
        a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new a();
            threadLocal.set(aVar);
        }
        b bVar = this.f1062b.f1085a;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i10 = a10 + bVar.f8206a;
            int i11 = (this.f1061a * 4) + bVar.f8207b.getInt(i10) + i10 + 4;
            int i12 = bVar.f8207b.getInt(i11) + i11;
            ByteBuffer byteBuffer = bVar.f8207b;
            aVar.f8207b = byteBuffer;
            if (byteBuffer != null) {
                aVar.f8206a = i12;
                int i13 = i12 - byteBuffer.getInt(i12);
                aVar.f8208c = i13;
                s10 = aVar.f8207b.getShort(i13);
            } else {
                s10 = 0;
                aVar.f8206a = 0;
                aVar.f8208c = 0;
            }
            aVar.d = s10;
        }
        return aVar;
    }

    public final String toString() {
        int i10;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        a c10 = c();
        int a10 = c10.a(4);
        if (a10 != 0) {
            i10 = c10.f8207b.getInt(a10 + c10.f8206a);
        } else {
            i10 = 0;
        }
        sb.append(Integer.toHexString(i10));
        sb.append(", codepoints:");
        int b10 = b();
        for (int i11 = 0; i11 < b10; i11++) {
            sb.append(Integer.toHexString(a(i11)));
            sb.append(" ");
        }
        return sb.toString();
    }
}

package z2;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import m3.a;
import q2.h;
import q2.j;
import s2.w;
import t2.c;
import z2.s;

public final class f implements j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9810a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f9811b;

    public /* synthetic */ f(int i10, Object obj) {
        this.f9810a = i10;
        this.f9811b = obj;
    }

    public final w a(Object obj, int i10, int i11, h hVar) {
        int i12 = this.f9810a;
        Object obj2 = this.f9811b;
        switch (i12) {
            case 0:
                AtomicReference<byte[]> atomicReference = a.f7060a;
                a.C0101a aVar = new a.C0101a((ByteBuffer) obj);
                m mVar = (m) obj2;
                return mVar.a(new s.a(mVar.f9834c, aVar, mVar.d), i10, i11, hVar, m.f9830j);
            default:
                return d.e(((p2.a) obj).b(), (c) obj2);
        }
    }

    public final boolean b(Object obj, h hVar) {
        switch (this.f9810a) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                ((m) this.f9811b).getClass();
                return true;
            default:
                p2.a aVar = (p2.a) obj;
                return true;
        }
    }
}

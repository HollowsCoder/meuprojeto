package j1;

import java.util.ArrayList;
import java.util.List;
import k1.a;
import k1.c;
import o1.q;
import p1.b;

public final class s implements c, a.C0091a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6514a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f6515b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final q.a f6516c;
    public final c d;

    /* renamed from: e  reason: collision with root package name */
    public final c f6517e;

    /* renamed from: f  reason: collision with root package name */
    public final c f6518f;

    public s(b bVar, q qVar) {
        qVar.getClass();
        this.f6514a = qVar.f7679e;
        this.f6516c = qVar.f7676a;
        a<Float, Float> a10 = qVar.f7677b.a();
        this.d = (c) a10;
        a<Float, Float> a11 = qVar.f7678c.a();
        this.f6517e = (c) a11;
        a<Float, Float> a12 = qVar.d.a();
        this.f6518f = (c) a12;
        bVar.d(a10);
        bVar.d(a11);
        bVar.d(a12);
        a10.a(this);
        a11.a(this);
        a12.a(this);
    }

    public final void b() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f6515b;
            if (i10 < arrayList.size()) {
                ((a.C0091a) arrayList.get(i10)).b();
                i10++;
            } else {
                return;
            }
        }
    }

    public final void c(List<c> list, List<c> list2) {
    }

    public final void d(a.C0091a aVar) {
        this.f6515b.add(aVar);
    }
}

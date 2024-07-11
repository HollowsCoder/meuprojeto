package r;

import java.util.ArrayList;
import java.util.Iterator;

public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public p f8297a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8298b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8299c = false;
    public final p d;

    /* renamed from: e  reason: collision with root package name */
    public a f8300e = a.UNKNOWN;

    /* renamed from: f  reason: collision with root package name */
    public int f8301f;

    /* renamed from: g  reason: collision with root package name */
    public int f8302g;

    /* renamed from: h  reason: collision with root package name */
    public int f8303h = 1;

    /* renamed from: i  reason: collision with root package name */
    public g f8304i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f8305j = false;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f8306k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.d = pVar;
    }

    public final void a(d dVar) {
        ArrayList arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f8305j) {
                return;
            }
        }
        this.f8299c = true;
        p pVar = this.f8297a;
        if (pVar != null) {
            pVar.a(this);
        }
        if (this.f8298b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        f fVar = null;
        int i10 = 0;
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f8305j) {
            g gVar = this.f8304i;
            if (gVar != null) {
                if (gVar.f8305j) {
                    this.f8301f = this.f8303h * gVar.f8302g;
                } else {
                    return;
                }
            }
            d(fVar.f8302g + this.f8301f);
        }
        p pVar2 = this.f8297a;
        if (pVar2 != null) {
            pVar2.a(this);
        }
    }

    public final void b(d dVar) {
        this.f8306k.add(dVar);
        if (this.f8305j) {
            dVar.a(dVar);
        }
    }

    public final void c() {
        this.l.clear();
        this.f8306k.clear();
        this.f8305j = false;
        this.f8302g = 0;
        this.f8299c = false;
        this.f8298b = false;
    }

    public void d(int i10) {
        if (!this.f8305j) {
            this.f8305j = true;
            this.f8302g = i10;
            Iterator it = this.f8306k.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                dVar.a(dVar);
            }
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f8321b.f8169j0);
        sb.append(":");
        sb.append(this.f8300e);
        sb.append("(");
        if (this.f8305j) {
            obj = Integer.valueOf(this.f8302g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.f8306k.size());
        sb.append(">");
        return sb.toString();
    }
}

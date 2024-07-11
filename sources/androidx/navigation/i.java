package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.fragment.app.f0;
import androidx.navigation.h;
import java.util.Iterator;
import java.util.NoSuchElementException;
import n.e;
import n.j;

public final class i extends h implements Iterable<h> {
    public final j<h> w = new j<>();

    /* renamed from: x  reason: collision with root package name */
    public int f1504x;

    /* renamed from: y  reason: collision with root package name */
    public String f1505y;

    public class a implements Iterator<h> {

        /* renamed from: o  reason: collision with root package name */
        public int f1506o = -1;

        /* renamed from: p  reason: collision with root package name */
        public boolean f1507p = false;

        public a() {
        }

        public final boolean hasNext() {
            return this.f1506o + 1 < i.this.w.j();
        }

        public final Object next() {
            if (hasNext()) {
                this.f1507p = true;
                j<h> jVar = i.this.w;
                int i10 = this.f1506o + 1;
                this.f1506o = i10;
                return jVar.k(i10);
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.f1507p) {
                i iVar = i.this;
                iVar.w.k(this.f1506o).f1493p = null;
                j<h> jVar = iVar.w;
                int i10 = this.f1506o;
                Object[] objArr = jVar.f7337q;
                Object obj = objArr[i10];
                Object obj2 = j.f7334s;
                if (obj != obj2) {
                    objArr[i10] = obj2;
                    jVar.f7335o = true;
                }
                this.f1506o = i10 - 1;
                this.f1507p = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
    }

    public i(p<? extends i> pVar) {
        super(pVar);
    }

    public final h.a i(f0 f0Var) {
        h.a i10 = super.i(f0Var);
        a aVar = new a();
        while (aVar.hasNext()) {
            h.a i11 = ((h) aVar.next()).i(f0Var);
            if (i11 != null && (i10 == null || i11.compareTo(i10) > 0)) {
                i10 = i11;
            }
        }
        return i10;
    }

    public final Iterator<h> iterator() {
        return new a();
    }

    public final void k(Context context, AttributeSet attributeSet) {
        super.k(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, e.E);
        int resourceId = obtainAttributes.getResourceId(0, 0);
        if (resourceId != this.f1494q) {
            this.f1504x = resourceId;
            this.f1505y = null;
            this.f1505y = h.h(context, resourceId);
            obtainAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Start destination " + resourceId + " cannot use the same id as the graph " + this);
    }

    public final void m(h hVar) {
        int i10 = hVar.f1494q;
        if (i10 == 0) {
            throw new IllegalArgumentException("Destinations must have an id. Call setId() or include an android:id in your navigation XML.");
        } else if (i10 != this.f1494q) {
            j<h> jVar = this.w;
            h hVar2 = (h) jVar.h(i10, (Integer) null);
            if (hVar2 != hVar) {
                if (hVar.f1493p == null) {
                    if (hVar2 != null) {
                        hVar2.f1493p = null;
                    }
                    hVar.f1493p = this;
                    jVar.i(hVar.f1494q, hVar);
                    return;
                }
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            }
        } else {
            throw new IllegalArgumentException("Destination " + hVar + " cannot have the same id as graph " + this);
        }
    }

    public final h n(int i10, boolean z) {
        i iVar;
        h hVar = (h) this.w.h(i10, (Integer) null);
        if (hVar != null) {
            return hVar;
        }
        if (!z || (iVar = this.f1493p) == null) {
            return null;
        }
        return iVar.n(i10, true);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" startDestination=");
        h n10 = n(this.f1504x, true);
        if (n10 == null) {
            str = this.f1505y;
            if (str == null) {
                sb.append("0x");
                str = Integer.toHexString(this.f1504x);
            }
        } else {
            sb.append("{");
            sb.append(n10.toString());
            str = "}";
        }
        sb.append(str);
        return sb.toString();
    }
}

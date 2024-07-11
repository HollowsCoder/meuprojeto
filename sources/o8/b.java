package o8;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import w8.a;
import z8.g;

public abstract class b<T> implements Iterator<T> {

    /* renamed from: o  reason: collision with root package name */
    public o f7751o = o.NotReady;

    /* renamed from: p  reason: collision with root package name */
    public T f7752p;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7753a;

        static {
            int[] iArr = new int[o.values().length];
            iArr[o.Done.ordinal()] = 1;
            iArr[o.Ready.ordinal()] = 2;
            f7753a = iArr;
        }
    }

    public final boolean hasNext() {
        boolean z;
        T t10;
        T a10;
        o oVar = this.f7751o;
        o oVar2 = o.Failed;
        if (oVar != oVar2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i10 = a.f7753a[oVar.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
            this.f7751o = oVar2;
            a.b bVar = (a.b) this;
            while (true) {
                ArrayDeque<a.c> arrayDeque = bVar.f9297q;
                a.c peek = arrayDeque.peek();
                if (peek == null) {
                    t10 = null;
                    break;
                }
                a10 = peek.a();
                if (a10 == null) {
                    arrayDeque.pop();
                } else if (g.a(a10, peek.f9308a) || !a10.isDirectory() || arrayDeque.size() >= w8.a.this.f9296c) {
                    t10 = a10;
                } else {
                    arrayDeque.push(bVar.a(a10));
                }
            }
            t10 = a10;
            if (t10 != null) {
                bVar.f7752p = t10;
                bVar.f7751o = o.Ready;
            } else {
                bVar.f7751o = o.Done;
            }
            if (this.f7751o == o.Ready) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final T next() {
        if (hasNext()) {
            this.f7751o = o.NotReady;
            return this.f7752p;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

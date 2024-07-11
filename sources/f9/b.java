package f9;

import c9.c;
import e9.d;
import java.util.Iterator;
import java.util.NoSuchElementException;
import y8.p;
import z8.g;

public final class b implements d<c> {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f4929a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4930b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4931c;
    public final p<CharSequence, Integer, n8.d<Integer, Integer>> d;

    public static final class a implements Iterator<c> {

        /* renamed from: o  reason: collision with root package name */
        public int f4932o = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f4933p;

        /* renamed from: q  reason: collision with root package name */
        public int f4934q;

        /* renamed from: r  reason: collision with root package name */
        public c f4935r;

        /* renamed from: s  reason: collision with root package name */
        public int f4936s;

        /* renamed from: t  reason: collision with root package name */
        public final /* synthetic */ b f4937t;

        public a(b bVar) {
            this.f4937t = bVar;
            int s10 = s6.a.s(bVar.f4930b, 0, bVar.f4929a.length());
            this.f4933p = s10;
            this.f4934q = s10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
            if (r6 < r3) goto L_0x001a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r7 = this;
                int r0 = r7.f4934q
                r1 = 0
                if (r0 >= 0) goto L_0x000b
                r7.f4932o = r1
                r0 = 0
                r7.f4935r = r0
                goto L_0x0077
            L_0x000b:
                f9.b r2 = r7.f4937t
                int r3 = r2.f4931c
                r4 = -1
                r5 = 1
                if (r3 <= 0) goto L_0x001a
                int r6 = r7.f4936s
                int r6 = r6 + r5
                r7.f4936s = r6
                if (r6 >= r3) goto L_0x0022
            L_0x001a:
                java.lang.CharSequence r3 = r2.f4929a
                int r3 = r3.length()
                if (r0 <= r3) goto L_0x0034
            L_0x0022:
                c9.c r0 = new c9.c
                int r1 = r7.f4933p
                java.lang.CharSequence r2 = r2.f4929a
                int r2 = f9.l.d0(r2)
                r0.<init>(r1, r2)
            L_0x002f:
                r7.f4935r = r0
                r7.f4934q = r4
                goto L_0x0075
            L_0x0034:
                y8.p<java.lang.CharSequence, java.lang.Integer, n8.d<java.lang.Integer, java.lang.Integer>> r0 = r2.d
                java.lang.CharSequence r3 = r2.f4929a
                int r6 = r7.f4934q
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object r0 = r0.i(r3, r6)
                n8.d r0 = (n8.d) r0
                if (r0 != 0) goto L_0x0054
                c9.c r0 = new c9.c
                int r1 = r7.f4933p
                java.lang.CharSequence r2 = r2.f4929a
                int r2 = f9.l.d0(r2)
                r0.<init>(r1, r2)
                goto L_0x002f
            L_0x0054:
                A r2 = r0.f7495o
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.f7496p
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.f4933p
                c9.c r3 = s6.a.K(r3, r2)
                r7.f4935r = r3
                int r2 = r2 + r0
                r7.f4933p = r2
                if (r0 != 0) goto L_0x0072
                r1 = r5
            L_0x0072:
                int r2 = r2 + r1
                r7.f4934q = r2
            L_0x0075:
                r7.f4932o = r5
            L_0x0077:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f9.b.a.a():void");
        }

        public final boolean hasNext() {
            if (this.f4932o == -1) {
                a();
            }
            return this.f4932o == 1;
        }

        public final Object next() {
            if (this.f4932o == -1) {
                a();
            }
            if (this.f4932o != 0) {
                c cVar = this.f4935r;
                g.d(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f4935r = null;
                this.f4932o = -1;
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(CharSequence charSequence, int i10, int i11, p<? super CharSequence, ? super Integer, n8.d<Integer, Integer>> pVar) {
        g.f(charSequence, "input");
        this.f4929a = charSequence;
        this.f4930b = i10;
        this.f4931c = i11;
        this.d = pVar;
    }

    public final Iterator<c> iterator() {
        return new a(this);
    }
}

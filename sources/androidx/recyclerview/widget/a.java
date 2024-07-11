package androidx.recyclerview.widget;

import androidx.recyclerview.widget.p;
import h0.d;
import java.util.ArrayList;

public final class a implements p.a {

    /* renamed from: a  reason: collision with root package name */
    public final d f1734a = new d(30);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f1735b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<b> f1736c = new ArrayList<>();
    public final C0020a d;

    /* renamed from: e  reason: collision with root package name */
    public final p f1737e;

    /* renamed from: f  reason: collision with root package name */
    public int f1738f = 0;

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    public interface C0020a {
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1739a;

        /* renamed from: b  reason: collision with root package name */
        public int f1740b;

        /* renamed from: c  reason: collision with root package name */
        public Object f1741c;
        public int d;

        public b(Object obj, int i10, int i11, int i12) {
            this.f1739a = i10;
            this.f1740b = i11;
            this.d = i12;
            this.f1741c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f1739a;
            if (i10 != bVar.f1739a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.d - this.f1740b) == 1 && this.d == bVar.f1740b && this.f1740b == bVar.d) {
                return true;
            }
            if (this.d != bVar.d || this.f1740b != bVar.f1740b) {
                return false;
            }
            Object obj2 = this.f1741c;
            Object obj3 = bVar.f1741c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f1739a * 31) + this.f1740b) * 31) + this.d;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i10 = this.f1739a;
            if (i10 == 1) {
                str = "add";
            } else if (i10 == 2) {
                str = "rm";
            } else if (i10 == 4) {
                str = "up";
            } else if (i10 != 8) {
                str = "??";
            } else {
                str = "mv";
            }
            sb.append(str);
            sb.append(",s:");
            sb.append(this.f1740b);
            sb.append("c:");
            sb.append(this.d);
            sb.append(",p:");
            sb.append(this.f1741c);
            sb.append("]");
            return sb.toString();
        }
    }

    public a(w wVar) {
        this.d = wVar;
        this.f1737e = new p(this);
    }

    public final boolean a(int i10) {
        ArrayList<b> arrayList = this.f1736c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = arrayList.get(i11);
            int i12 = bVar.f1739a;
            if (i12 == 8) {
                if (f(bVar.d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f1740b;
                int i14 = bVar.d + i13;
                while (i13 < i14) {
                    if (f(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList<b> arrayList = this.f1736c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((w) this.d).a(arrayList.get(i10));
        }
        l(arrayList);
        this.f1738f = 0;
    }

    public final void c() {
        b();
        ArrayList<b> arrayList = this.f1735b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = arrayList.get(i10);
            int i11 = bVar.f1739a;
            C0020a aVar = this.d;
            if (i11 == 1) {
                w wVar = (w) aVar;
                wVar.a(bVar);
                wVar.d(bVar.f1740b, bVar.d);
            } else if (i11 == 2) {
                w wVar2 = (w) aVar;
                wVar2.a(bVar);
                int i12 = bVar.f1740b;
                int i13 = bVar.d;
                RecyclerView recyclerView = wVar2.f1866a;
                recyclerView.O(i12, i13, true);
                recyclerView.y0 = true;
                recyclerView.f1595v0.f1689c += i13;
            } else if (i11 == 4) {
                w wVar3 = (w) aVar;
                wVar3.a(bVar);
                wVar3.c(bVar.f1740b, bVar.d, bVar.f1741c);
            } else if (i11 == 8) {
                w wVar4 = (w) aVar;
                wVar4.a(bVar);
                wVar4.e(bVar.f1740b, bVar.d);
            }
        }
        l(arrayList);
        this.f1738f = 0;
    }

    public final void d(b bVar) {
        int i10;
        d dVar;
        boolean z;
        int i11 = bVar.f1739a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m10 = m(bVar.f1740b, i11);
        int i12 = bVar.f1740b;
        int i13 = bVar.f1739a;
        if (i13 == 2) {
            i10 = 0;
        } else if (i13 == 4) {
            i10 = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i14 = 1;
        int i15 = 1;
        while (true) {
            int i16 = bVar.d;
            dVar = this.f1734a;
            if (i14 >= i16) {
                break;
            }
            int m11 = m((i10 * i14) + bVar.f1740b, bVar.f1739a);
            int i17 = bVar.f1739a;
            if (i17 == 2 ? m11 != m10 : !(i17 == 4 && m11 == m10 + 1)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i15++;
            } else {
                b h10 = h(bVar.f1741c, i17, m10, i15);
                e(h10, i12);
                h10.f1741c = null;
                dVar.a(h10);
                if (bVar.f1739a == 4) {
                    i12 += i15;
                }
                i15 = 1;
                m10 = m11;
            }
            i14++;
        }
        Object obj = bVar.f1741c;
        bVar.f1741c = null;
        dVar.a(bVar);
        if (i15 > 0) {
            b h11 = h(obj, bVar.f1739a, m10, i15);
            e(h11, i12);
            h11.f1741c = null;
            dVar.a(h11);
        }
    }

    public final void e(b bVar, int i10) {
        w wVar = (w) this.d;
        wVar.a(bVar);
        int i11 = bVar.f1739a;
        if (i11 == 2) {
            int i12 = bVar.d;
            RecyclerView recyclerView = wVar.f1866a;
            recyclerView.O(i10, i12, true);
            recyclerView.y0 = true;
            recyclerView.f1595v0.f1689c += i12;
        } else if (i11 == 4) {
            wVar.c(i10, bVar.d, bVar.f1741c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public final int f(int i10, int i11) {
        ArrayList<b> arrayList = this.f1736c;
        int size = arrayList.size();
        while (i11 < size) {
            b bVar = arrayList.get(i11);
            int i12 = bVar.f1739a;
            if (i12 == 8) {
                int i13 = bVar.f1740b;
                if (i13 == i10) {
                    i10 = bVar.d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f1740b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.d;
                }
            }
            i11++;
        }
        return i10;
    }

    public final boolean g() {
        return this.f1735b.size() > 0;
    }

    public final b h(Object obj, int i10, int i11, int i12) {
        b bVar = (b) this.f1734a.b();
        if (bVar == null) {
            return new b(obj, i10, i11, i12);
        }
        bVar.f1739a = i10;
        bVar.f1740b = i11;
        bVar.d = i12;
        bVar.f1741c = obj;
        return bVar;
    }

    public final void i(b bVar) {
        this.f1736c.add(bVar);
        int i10 = bVar.f1739a;
        C0020a aVar = this.d;
        if (i10 == 1) {
            ((w) aVar).d(bVar.f1740b, bVar.d);
        } else if (i10 == 2) {
            int i11 = bVar.f1740b;
            int i12 = bVar.d;
            RecyclerView recyclerView = ((w) aVar).f1866a;
            recyclerView.O(i11, i12, false);
            recyclerView.y0 = true;
        } else if (i10 == 4) {
            ((w) aVar).c(bVar.f1740b, bVar.d, bVar.f1741c);
        } else if (i10 == 8) {
            ((w) aVar).e(bVar.f1740b, bVar.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x015d, code lost:
        if (r5 > r12.f1740b) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0187, code lost:
        if (r5 >= r12.f1740b) goto L_0x0189;
     */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0009 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0134  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r16 = this;
            r0 = r16
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f1735b
            androidx.recyclerview.widget.p r2 = r0.f1737e
            r2.getClass()
        L_0x0009:
            int r3 = r1.size()
            r4 = 1
            int r3 = r3 - r4
            r6 = 0
        L_0x0010:
            r7 = 8
            r8 = -1
            if (r3 < 0) goto L_0x0026
            java.lang.Object r9 = r1.get(r3)
            androidx.recyclerview.widget.a$b r9 = (androidx.recyclerview.widget.a.b) r9
            int r9 = r9.f1739a
            if (r9 != r7) goto L_0x0022
            if (r6 == 0) goto L_0x0023
            goto L_0x0027
        L_0x0022:
            r6 = r4
        L_0x0023:
            int r3 = r3 + -1
            goto L_0x0010
        L_0x0026:
            r3 = r8
        L_0x0027:
            r6 = 0
            r9 = 4
            r10 = 2
            if (r3 == r8) goto L_0x01cf
            int r7 = r3 + 1
            java.lang.Object r11 = r1.get(r3)
            androidx.recyclerview.widget.a$b r11 = (androidx.recyclerview.widget.a.b) r11
            java.lang.Object r12 = r1.get(r7)
            androidx.recyclerview.widget.a$b r12 = (androidx.recyclerview.widget.a.b) r12
            int r13 = r12.f1739a
            if (r13 == r4) goto L_0x01a5
            androidx.recyclerview.widget.p$a r8 = r2.f1859a
            if (r13 == r10) goto L_0x00af
            if (r13 == r9) goto L_0x0045
            goto L_0x0009
        L_0x0045:
            int r5 = r11.d
            int r10 = r12.f1740b
            if (r5 >= r10) goto L_0x0050
            int r10 = r10 + -1
            r12.f1740b = r10
            goto L_0x0065
        L_0x0050:
            int r13 = r12.d
            int r10 = r10 + r13
            if (r5 >= r10) goto L_0x0065
            int r13 = r13 + -1
            r12.d = r13
            int r5 = r11.f1740b
            java.lang.Object r10 = r12.f1741c
            r13 = r8
            androidx.recyclerview.widget.a r13 = (androidx.recyclerview.widget.a) r13
            androidx.recyclerview.widget.a$b r4 = r13.h(r10, r9, r5, r4)
            goto L_0x0066
        L_0x0065:
            r4 = r6
        L_0x0066:
            int r5 = r11.f1740b
            int r10 = r12.f1740b
            if (r5 > r10) goto L_0x0071
            int r10 = r10 + 1
            r12.f1740b = r10
            goto L_0x0088
        L_0x0071:
            int r13 = r12.d
            int r10 = r10 + r13
            if (r5 >= r10) goto L_0x0088
            int r10 = r10 - r5
            int r5 = r5 + 1
            java.lang.Object r13 = r12.f1741c
            r14 = r8
            androidx.recyclerview.widget.a r14 = (androidx.recyclerview.widget.a) r14
            androidx.recyclerview.widget.a$b r5 = r14.h(r13, r9, r5, r10)
            int r9 = r12.d
            int r9 = r9 - r10
            r12.d = r9
            goto L_0x0089
        L_0x0088:
            r5 = r6
        L_0x0089:
            r1.set(r7, r11)
            int r7 = r12.d
            if (r7 <= 0) goto L_0x0094
            r1.set(r3, r12)
            goto L_0x00a3
        L_0x0094:
            r1.remove(r3)
            androidx.recyclerview.widget.a r8 = (androidx.recyclerview.widget.a) r8
            r8.getClass()
            r12.f1741c = r6
            h0.d r6 = r8.f1734a
            r6.a(r12)
        L_0x00a3:
            if (r4 == 0) goto L_0x00a8
            r1.add(r3, r4)
        L_0x00a8:
            if (r5 == 0) goto L_0x0009
            r1.add(r3, r5)
            goto L_0x0009
        L_0x00af:
            int r9 = r11.f1740b
            int r13 = r11.d
            int r14 = r12.f1740b
            if (r9 >= r13) goto L_0x00c4
            if (r14 != r9) goto L_0x00c2
            int r15 = r12.d
            int r9 = r13 - r9
            if (r15 != r9) goto L_0x00c2
            r5 = r4
            r9 = 0
            goto L_0x00d2
        L_0x00c2:
            r5 = 0
            goto L_0x00ce
        L_0x00c4:
            int r15 = r13 + 1
            if (r14 != r15) goto L_0x00d0
            int r15 = r12.d
            int r9 = r9 - r13
            if (r15 != r9) goto L_0x00d0
            r5 = r4
        L_0x00ce:
            r9 = r5
            goto L_0x00d2
        L_0x00d0:
            r9 = r4
            r5 = 0
        L_0x00d2:
            if (r13 >= r14) goto L_0x00d9
            int r14 = r14 + -1
            r12.f1740b = r14
            goto L_0x00fb
        L_0x00d9:
            int r15 = r12.d
            int r14 = r14 + r15
            if (r13 >= r14) goto L_0x00fb
            int r15 = r15 + -1
            r12.d = r15
            r11.f1739a = r10
            r11.d = r4
            int r3 = r12.d
            if (r3 != 0) goto L_0x0009
            r1.remove(r7)
            androidx.recyclerview.widget.a r8 = (androidx.recyclerview.widget.a) r8
            r8.getClass()
            r12.f1741c = r6
            h0.d r3 = r8.f1734a
            r3.a(r12)
            goto L_0x0009
        L_0x00fb:
            int r4 = r11.f1740b
            int r13 = r12.f1740b
            if (r4 > r13) goto L_0x0106
            int r13 = r13 + 1
            r12.f1740b = r13
            goto L_0x011d
        L_0x0106:
            int r14 = r12.d
            int r13 = r13 + r14
            if (r4 >= r13) goto L_0x011d
            int r13 = r13 - r4
            int r4 = r4 + 1
            r14 = r8
            androidx.recyclerview.widget.a r14 = (androidx.recyclerview.widget.a) r14
            androidx.recyclerview.widget.a$b r4 = r14.h(r6, r10, r4, r13)
            int r10 = r11.f1740b
            int r13 = r12.f1740b
            int r10 = r10 - r13
            r12.d = r10
            goto L_0x011e
        L_0x011d:
            r4 = r6
        L_0x011e:
            if (r5 == 0) goto L_0x0134
            r1.set(r3, r12)
            r1.remove(r7)
            androidx.recyclerview.widget.a r8 = (androidx.recyclerview.widget.a) r8
            r8.getClass()
            r11.f1741c = r6
            h0.d r3 = r8.f1734a
            r3.a(r11)
            goto L_0x0009
        L_0x0134:
            if (r9 == 0) goto L_0x0160
            if (r4 == 0) goto L_0x014e
            int r5 = r11.f1740b
            int r6 = r4.f1740b
            if (r5 <= r6) goto L_0x0143
            int r6 = r4.d
            int r5 = r5 - r6
            r11.f1740b = r5
        L_0x0143:
            int r5 = r11.d
            int r6 = r4.f1740b
            if (r5 <= r6) goto L_0x014e
            int r6 = r4.d
            int r5 = r5 - r6
            r11.d = r5
        L_0x014e:
            int r5 = r11.f1740b
            int r6 = r12.f1740b
            if (r5 <= r6) goto L_0x0159
            int r6 = r12.d
            int r5 = r5 - r6
            r11.f1740b = r5
        L_0x0159:
            int r5 = r11.d
            int r6 = r12.f1740b
            if (r5 <= r6) goto L_0x018e
            goto L_0x0189
        L_0x0160:
            if (r4 == 0) goto L_0x0178
            int r5 = r11.f1740b
            int r6 = r4.f1740b
            if (r5 < r6) goto L_0x016d
            int r6 = r4.d
            int r5 = r5 - r6
            r11.f1740b = r5
        L_0x016d:
            int r5 = r11.d
            int r6 = r4.f1740b
            if (r5 < r6) goto L_0x0178
            int r6 = r4.d
            int r5 = r5 - r6
            r11.d = r5
        L_0x0178:
            int r5 = r11.f1740b
            int r6 = r12.f1740b
            if (r5 < r6) goto L_0x0183
            int r6 = r12.d
            int r5 = r5 - r6
            r11.f1740b = r5
        L_0x0183:
            int r5 = r11.d
            int r6 = r12.f1740b
            if (r5 < r6) goto L_0x018e
        L_0x0189:
            int r6 = r12.d
            int r5 = r5 - r6
            r11.d = r5
        L_0x018e:
            r1.set(r3, r12)
            int r5 = r11.f1740b
            int r6 = r11.d
            if (r5 == r6) goto L_0x019b
            r1.set(r7, r11)
            goto L_0x019e
        L_0x019b:
            r1.remove(r7)
        L_0x019e:
            if (r4 == 0) goto L_0x0009
            r1.add(r3, r4)
            goto L_0x0009
        L_0x01a5:
            int r4 = r11.d
            int r6 = r12.f1740b
            if (r4 >= r6) goto L_0x01ad
            r5 = r8
            goto L_0x01ae
        L_0x01ad:
            r5 = 0
        L_0x01ae:
            int r8 = r11.f1740b
            if (r8 >= r6) goto L_0x01b4
            int r5 = r5 + 1
        L_0x01b4:
            if (r6 > r8) goto L_0x01bb
            int r6 = r12.d
            int r8 = r8 + r6
            r11.f1740b = r8
        L_0x01bb:
            int r6 = r12.f1740b
            if (r6 > r4) goto L_0x01c4
            int r8 = r12.d
            int r4 = r4 + r8
            r11.d = r4
        L_0x01c4:
            int r6 = r6 + r5
            r12.f1740b = r6
            r1.set(r3, r12)
            r1.set(r7, r11)
            goto L_0x0009
        L_0x01cf:
            int r2 = r1.size()
            r3 = 0
        L_0x01d4:
            if (r3 >= r2) goto L_0x02af
            java.lang.Object r11 = r1.get(r3)
            androidx.recyclerview.widget.a$b r11 = (androidx.recyclerview.widget.a.b) r11
            int r12 = r11.f1739a
            if (r12 == r4) goto L_0x02a3
            h0.d r13 = r0.f1734a
            androidx.recyclerview.widget.a$a r14 = r0.d
            if (r12 == r10) goto L_0x0247
            if (r12 == r9) goto L_0x01f1
            if (r12 == r7) goto L_0x01eb
            goto L_0x01ee
        L_0x01eb:
            r0.i(r11)
        L_0x01ee:
            r7 = r10
            goto L_0x02a7
        L_0x01f1:
            int r12 = r11.f1740b
            int r15 = r11.d
            int r15 = r15 + r12
            r5 = r12
            r7 = 0
        L_0x01f8:
            if (r12 >= r15) goto L_0x022c
            r10 = r14
            androidx.recyclerview.widget.w r10 = (androidx.recyclerview.widget.w) r10
            androidx.recyclerview.widget.RecyclerView$c0 r10 = r10.b(r12)
            if (r10 != 0) goto L_0x0219
            boolean r10 = r0.a(r12)
            if (r10 == 0) goto L_0x020a
            goto L_0x0219
        L_0x020a:
            if (r8 != r4) goto L_0x0217
            java.lang.Object r8 = r11.f1741c
            androidx.recyclerview.widget.a$b r5 = r0.h(r8, r9, r5, r7)
            r0.i(r5)
            r5 = r12
            r7 = 0
        L_0x0217:
            r8 = 0
            goto L_0x0227
        L_0x0219:
            if (r8 != 0) goto L_0x0226
            java.lang.Object r8 = r11.f1741c
            androidx.recyclerview.widget.a$b r5 = r0.h(r8, r9, r5, r7)
            r0.d(r5)
            r5 = r12
            r7 = 0
        L_0x0226:
            r8 = r4
        L_0x0227:
            int r7 = r7 + r4
            int r12 = r12 + 1
            r10 = 2
            goto L_0x01f8
        L_0x022c:
            int r10 = r11.d
            if (r7 == r10) goto L_0x023b
            java.lang.Object r10 = r11.f1741c
            r11.f1741c = r6
            r13.a(r11)
            androidx.recyclerview.widget.a$b r11 = r0.h(r10, r9, r5, r7)
        L_0x023b:
            if (r8 != 0) goto L_0x0241
            r0.d(r11)
            goto L_0x0244
        L_0x0241:
            r0.i(r11)
        L_0x0244:
            r7 = 2
            goto L_0x02a7
        L_0x0247:
            int r5 = r11.f1740b
            int r7 = r11.d
            int r7 = r7 + r5
            r8 = r5
            r10 = 0
            r12 = -1
        L_0x024f:
            if (r8 >= r7) goto L_0x0289
            r15 = r14
            androidx.recyclerview.widget.w r15 = (androidx.recyclerview.widget.w) r15
            androidx.recyclerview.widget.RecyclerView$c0 r15 = r15.b(r8)
            if (r15 != 0) goto L_0x0270
            boolean r15 = r0.a(r8)
            if (r15 == 0) goto L_0x0261
            goto L_0x0270
        L_0x0261:
            r15 = 2
            if (r12 != r4) goto L_0x026d
            androidx.recyclerview.widget.a$b r12 = r0.h(r6, r15, r5, r10)
            r0.i(r12)
            r12 = r4
            goto L_0x026e
        L_0x026d:
            r12 = 0
        L_0x026e:
            r15 = 0
            goto L_0x027e
        L_0x0270:
            r15 = 2
            if (r12 != 0) goto L_0x027c
            androidx.recyclerview.widget.a$b r12 = r0.h(r6, r15, r5, r10)
            r0.d(r12)
            r12 = r4
            goto L_0x027d
        L_0x027c:
            r12 = 0
        L_0x027d:
            r15 = r4
        L_0x027e:
            if (r12 == 0) goto L_0x0284
            int r8 = r8 - r10
            int r7 = r7 - r10
            r10 = r4
            goto L_0x0286
        L_0x0284:
            int r10 = r10 + 1
        L_0x0286:
            int r8 = r8 + r4
            r12 = r15
            goto L_0x024f
        L_0x0289:
            int r7 = r11.d
            if (r10 == r7) goto L_0x0298
            r11.f1741c = r6
            r13.a(r11)
            r7 = 2
            androidx.recyclerview.widget.a$b r11 = r0.h(r6, r7, r5, r10)
            goto L_0x0299
        L_0x0298:
            r7 = 2
        L_0x0299:
            if (r12 != 0) goto L_0x029f
            r0.d(r11)
            goto L_0x02a7
        L_0x029f:
            r0.i(r11)
            goto L_0x02a7
        L_0x02a3:
            r7 = r10
            r0.i(r11)
        L_0x02a7:
            int r3 = r3 + 1
            r10 = r7
            r7 = 8
            r8 = -1
            goto L_0x01d4
        L_0x02af:
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.j():void");
    }

    public final void k(b bVar) {
        bVar.f1741c = null;
        this.f1734a.a(bVar);
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k((b) arrayList.get(i10));
        }
        arrayList.clear();
    }

    public final int m(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList<b> arrayList = this.f1736c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b bVar = arrayList.get(size);
            int i18 = bVar.f1739a;
            if (i18 == 8) {
                int i19 = bVar.f1740b;
                int i20 = bVar.d;
                if (i19 < i20) {
                    i14 = i19;
                    i13 = i20;
                } else {
                    i13 = i19;
                    i14 = i20;
                }
                if (i10 < i14 || i10 > i13) {
                    if (i10 < i19) {
                        if (i11 == 1) {
                            bVar.f1740b = i19 + 1;
                            i15 = i20 + 1;
                        } else if (i11 == 2) {
                            bVar.f1740b = i19 - 1;
                            i15 = i20 - 1;
                        }
                        bVar.d = i15;
                    }
                } else if (i14 == i19) {
                    if (i11 == 1) {
                        i17 = i20 + 1;
                    } else {
                        if (i11 == 2) {
                            i17 = i20 - 1;
                        }
                        i10++;
                    }
                    bVar.d = i17;
                    i10++;
                } else {
                    if (i11 == 1) {
                        i16 = i19 + 1;
                    } else {
                        if (i11 == 2) {
                            i16 = i19 - 1;
                        }
                        i10--;
                    }
                    bVar.f1740b = i16;
                    i10--;
                }
            } else {
                int i21 = bVar.f1740b;
                if (i21 > i10) {
                    if (i11 == 1) {
                        i12 = i21 + 1;
                    } else if (i11 == 2) {
                        i12 = i21 - 1;
                    }
                    bVar.f1740b = i12;
                } else if (i18 == 1) {
                    i10 -= bVar.d;
                } else if (i18 == 2) {
                    i10 += bVar.d;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            b bVar2 = arrayList.get(size2);
            if (bVar2.f1739a == 8) {
                int i22 = bVar2.d;
                if (i22 != bVar2.f1740b && i22 >= 0) {
                }
            } else if (bVar2.d > 0) {
            }
            arrayList.remove(size2);
            k(bVar2);
        }
        return i10;
    }
}

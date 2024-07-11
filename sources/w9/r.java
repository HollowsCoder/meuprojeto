package w9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.RandomAccess;
import o8.c;
import o8.d;
import z8.g;

public final class r extends c<j> implements RandomAccess {

    /* renamed from: q  reason: collision with root package name */
    public static final a f9347q = new a();

    /* renamed from: o  reason: collision with root package name */
    public final j[] f9348o;

    /* renamed from: p  reason: collision with root package name */
    public final int[] f9349p;

    public static final class a {
        public static void a(long j8, f fVar, int i10, ArrayList arrayList, int i11, int i12, ArrayList arrayList2) {
            int i13;
            int i14;
            f fVar2;
            int i15;
            long j10;
            int i16;
            f fVar3;
            f fVar4 = fVar;
            int i17 = i10;
            ArrayList arrayList3 = arrayList;
            int i18 = i11;
            int i19 = i12;
            ArrayList arrayList4 = arrayList2;
            if (i18 < i19) {
                int i20 = i18;
                while (i20 < i19) {
                    if (((j) arrayList3.get(i20)).k() >= i17) {
                        i20++;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                j jVar = (j) arrayList.get(i11);
                j jVar2 = (j) arrayList3.get(i19 - 1);
                int i21 = -1;
                if (i17 == jVar.k()) {
                    int intValue = ((Number) arrayList4.get(i18)).intValue();
                    int i22 = i18 + 1;
                    j jVar3 = (j) arrayList3.get(i22);
                    i13 = i22;
                    i14 = intValue;
                    jVar = jVar3;
                } else {
                    i13 = i18;
                    i14 = -1;
                }
                if (jVar.o(i17) != jVar2.o(i17)) {
                    int i23 = 1;
                    for (int i24 = i13 + 1; i24 < i19; i24++) {
                        if (((j) arrayList3.get(i24 - 1)).o(i17) != ((j) arrayList3.get(i24)).o(i17)) {
                            i23++;
                        }
                    }
                    long j11 = (long) 4;
                    long j12 = ((long) (i23 * 2)) + (fVar4.f9325p / j11) + j8 + ((long) 2);
                    fVar4.U(i23);
                    fVar4.U(i14);
                    for (int i25 = i13; i25 < i19; i25++) {
                        byte o10 = ((j) arrayList3.get(i25)).o(i17);
                        if (i25 == i13 || o10 != ((j) arrayList3.get(i25 - 1)).o(i17)) {
                            fVar4.U(o10 & 255);
                        }
                    }
                    f fVar5 = new f();
                    while (i13 < i19) {
                        byte o11 = ((j) arrayList3.get(i13)).o(i17);
                        int i26 = i13 + 1;
                        int i27 = i26;
                        while (true) {
                            if (i27 >= i19) {
                                i15 = i19;
                                break;
                            } else if (o11 != ((j) arrayList3.get(i27)).o(i17)) {
                                i15 = i27;
                                break;
                            } else {
                                i27++;
                            }
                        }
                        if (i26 == i15 && i17 + 1 == ((j) arrayList3.get(i13)).k()) {
                            fVar4.U(((Number) arrayList4.get(i13)).intValue());
                            i16 = i15;
                            fVar3 = fVar5;
                            j10 = j11;
                        } else {
                            fVar4.U(((int) ((fVar5.f9325p / j11) + j12)) * i21);
                            i16 = i15;
                            fVar3 = fVar5;
                            j10 = j11;
                            a(j12, fVar5, i17 + 1, arrayList, i13, i16, arrayList2);
                        }
                        fVar5 = fVar3;
                        i13 = i16;
                        j11 = j10;
                        i21 = -1;
                    }
                    fVar2 = fVar5;
                } else {
                    int min = Math.min(jVar.k(), jVar2.k());
                    int i28 = i17;
                    int i29 = 0;
                    while (i28 < min && jVar.o(i28) == jVar2.o(i28)) {
                        i29++;
                        i28++;
                    }
                    long j13 = (long) 4;
                    long j14 = (fVar4.f9325p / j13) + j8 + ((long) 2) + ((long) i29) + 1;
                    fVar4.U(-i29);
                    fVar4.U(i14);
                    int i30 = i17 + i29;
                    while (i17 < i30) {
                        fVar4.U(jVar.o(i17) & 255);
                        i17++;
                    }
                    if (i13 + 1 == i19) {
                        if (i30 == ((j) arrayList3.get(i13)).k()) {
                            fVar4.U(((Number) arrayList4.get(i13)).intValue());
                            return;
                        }
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    fVar2 = new f();
                    fVar4.U(((int) ((fVar2.f9325p / j13) + j14)) * -1);
                    a(j14, fVar2, i30, arrayList, i13, i12, arrayList2);
                }
                fVar4.N(fVar2);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public static r b(j... jVarArr) {
            boolean z;
            ArrayList arrayList;
            boolean z10;
            boolean z11;
            int i10;
            int i11;
            int i12 = 0;
            if (jVarArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new r(new j[0], new int[]{0, -1});
            }
            ArrayList arrayList2 = new ArrayList(new d(jVarArr, false));
            if (arrayList2.size() > 1) {
                Collections.sort(arrayList2);
            }
            ArrayList arrayList3 = new ArrayList(jVarArr.length);
            for (j jVar : jVarArr) {
                arrayList3.add(-1);
            }
            Object[] array = arrayList3.toArray(new Integer[0]);
            if (array != null) {
                Integer[] numArr = (Integer[]) array;
                Integer[] numArr2 = (Integer[]) Arrays.copyOf(numArr, numArr.length);
                g.f(numArr2, "elements");
                if (numArr2.length == 0) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(new d(numArr2, true));
                }
                int length = jVarArr.length;
                int i13 = 0;
                int i14 = 0;
                while (i13 < length) {
                    j jVar2 = jVarArr[i13];
                    int i15 = i14 + 1;
                    int size = arrayList2.size();
                    int size2 = arrayList2.size();
                    if (size < 0) {
                        throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
                    } else if (size <= size2) {
                        int i16 = size - 1;
                        int i17 = 0;
                        while (true) {
                            if (i17 > i16) {
                                i10 = -(i17 + 1);
                                break;
                            }
                            i10 = (i17 + i16) >>> 1;
                            Comparable comparable = (Comparable) arrayList2.get(i10);
                            if (comparable == jVar2) {
                                i11 = 0;
                            } else if (comparable == null) {
                                i11 = -1;
                            } else if (jVar2 == null) {
                                i11 = 1;
                            } else {
                                i11 = comparable.compareTo(jVar2);
                            }
                            if (i11 >= 0) {
                                if (i11 <= 0) {
                                    break;
                                }
                                i16 = i10 - 1;
                            } else {
                                i17 = i10 + 1;
                            }
                        }
                        arrayList.set(i10, Integer.valueOf(i14));
                        i13++;
                        i14 = i15;
                    } else {
                        throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
                    }
                }
                if (((j) arrayList2.get(0)).k() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int i18 = 0;
                    while (i18 < arrayList2.size()) {
                        j jVar3 = (j) arrayList2.get(i18);
                        int i19 = i18 + 1;
                        int i20 = i19;
                        while (i20 < arrayList2.size()) {
                            j jVar4 = (j) arrayList2.get(i20);
                            jVar4.getClass();
                            g.f(jVar3, "prefix");
                            if (!jVar4.q(jVar3, jVar3.k())) {
                                continue;
                                break;
                            }
                            if (jVar4.k() != jVar3.k()) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                throw new IllegalArgumentException(("duplicate option: " + jVar4).toString());
                            } else if (((Number) arrayList.get(i20)).intValue() > ((Number) arrayList.get(i18)).intValue()) {
                                arrayList2.remove(i20);
                                arrayList.remove(i20);
                            } else {
                                i20++;
                            }
                        }
                        i18 = i19;
                    }
                    f fVar = new f();
                    a(0, fVar, 0, arrayList2, 0, arrayList2.size(), arrayList);
                    int[] iArr = new int[((int) (fVar.f9325p / ((long) 4)))];
                    while (!fVar.F()) {
                        iArr[i12] = fVar.readInt();
                        i12++;
                    }
                    Object[] copyOf = Arrays.copyOf(jVarArr, jVarArr.length);
                    g.e(copyOf, "java.util.Arrays.copyOf(this, size)");
                    return new r((j[]) copyOf, iArr);
                }
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public r(j[] jVarArr, int[] iArr) {
        this.f9348o = jVarArr;
        this.f9349p = iArr;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof j) {
            return super.contains((j) obj);
        }
        return false;
    }

    public final int e() {
        return this.f9348o.length;
    }

    public final Object get(int i10) {
        return this.f9348o[i10];
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof j) {
            return super.indexOf((j) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof j) {
            return super.lastIndexOf((j) obj);
        }
        return -1;
    }
}

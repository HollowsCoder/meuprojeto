package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.x0;
import androidx.databinding.a;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.List;

public final class t extends u {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2932b;

    public t(int i10) {
        this.f2932b = i10;
        if (i10 == 1) {
            ArrayList arrayList = this.f2943a;
            arrayList.add(z.APPLY);
            arrayList.add(z.BLOCK);
            arrayList.add(z.BREAK);
            arrayList.add(z.CASE);
            arrayList.add(z.DEFAULT);
            arrayList.add(z.CONTINUE);
            arrayList.add(z.DEFINE_FUNCTION);
            arrayList.add(z.FN);
            arrayList.add(z.IF);
            arrayList.add(z.QUOTE);
            arrayList.add(z.RETURN);
            arrayList.add(z.SWITCH);
            arrayList.add(z.TERNARY);
        } else if (i10 != 2) {
            ArrayList arrayList2 = this.f2943a;
            arrayList2.add(z.BITWISE_AND);
            arrayList2.add(z.BITWISE_LEFT_SHIFT);
            arrayList2.add(z.BITWISE_NOT);
            arrayList2.add(z.BITWISE_OR);
            arrayList2.add(z.BITWISE_RIGHT_SHIFT);
            arrayList2.add(z.BITWISE_UNSIGNED_RIGHT_SHIFT);
            arrayList2.add(z.BITWISE_XOR);
        } else {
            ArrayList arrayList3 = this.f2943a;
            arrayList3.add(z.ADD);
            arrayList3.add(z.DIVIDE);
            arrayList3.add(z.MODULUS);
            arrayList3.add(z.MULTIPLY);
            arrayList3.add(z.NEGATE);
            arrayList3.add(z.POST_DECREMENT);
            arrayList3.add(z.POST_INCREMENT);
            arrayList3.add(z.PRE_DECREMENT);
            arrayList3.add(z.PRE_INCREMENT);
            arrayList3.add(z.SUBTRACT);
        }
    }

    public static n c(i3 i3Var, ArrayList arrayList) {
        a.G(z.FN.name(), 2, arrayList);
        o a10 = i3Var.a((o) arrayList.get(0));
        o a11 = i3Var.a((o) arrayList.get(1));
        if (a11 instanceof e) {
            List<o> m10 = ((e) a11).m();
            List arrayList2 = new ArrayList();
            if (arrayList.size() > 2) {
                arrayList2 = arrayList.subList(2, arrayList.size());
            }
            return new n(a10.zzc(), (ArrayList) m10, arrayList2, i3Var);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", new Object[]{a11.getClass().getCanonicalName()}));
    }

    public final o a(String str, i3 i3Var, ArrayList arrayList) {
        o rVar;
        String str2;
        h hVar;
        o oVar;
        Object obj;
        o oVar2 = null;
        switch (this.f2932b) {
            case 0:
                z zVar = z.ADD;
                switch (a.K(str).ordinal()) {
                    case 4:
                        return new h(Double.valueOf((double) (a.N(i3Var.a((o) x0.b(z.BITWISE_AND, 2, arrayList, 0)).b().doubleValue()) & a.N(i3Var.a((o) arrayList.get(1)).b().doubleValue()))));
                    case 5:
                        hVar = new h(Double.valueOf((double) (a.N(i3Var.a((o) x0.b(z.BITWISE_LEFT_SHIFT, 2, arrayList, 0)).b().doubleValue()) << ((int) (a.O(i3Var.a((o) arrayList.get(1)).b().doubleValue()) & 31)))));
                        break;
                    case 6:
                        return new h(Double.valueOf((double) (~a.N(i3Var.a((o) x0.b(z.BITWISE_NOT, 1, arrayList, 0)).b().doubleValue()))));
                    case 7:
                        return new h(Double.valueOf((double) (a.N(i3Var.a((o) x0.b(z.BITWISE_OR, 2, arrayList, 0)).b().doubleValue()) | a.N(i3Var.a((o) arrayList.get(1)).b().doubleValue()))));
                    case 8:
                        hVar = new h(Double.valueOf((double) (a.N(i3Var.a((o) x0.b(z.BITWISE_RIGHT_SHIFT, 2, arrayList, 0)).b().doubleValue()) >> ((int) (a.O(i3Var.a((o) arrayList.get(1)).b().doubleValue()) & 31)))));
                        break;
                    case 9:
                        return new h(Double.valueOf((double) (a.O(i3Var.a((o) x0.b(z.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, arrayList, 0)).b().doubleValue()) >>> ((int) (a.O(i3Var.a((o) arrayList.get(1)).b().doubleValue()) & 31)))));
                    case 10:
                        return new h(Double.valueOf((double) (a.N(i3Var.a((o) x0.b(z.BITWISE_XOR, 2, arrayList, 0)).b().doubleValue()) ^ a.N(i3Var.a((o) arrayList.get(1)).b().doubleValue()))));
                    default:
                        b(str);
                        throw null;
                }
                return hVar;
            case 1:
                z zVar2 = z.ADD;
                int ordinal = a.K(str).ordinal();
                if (ordinal == 2) {
                    o a10 = i3Var.a((o) x0.b(z.APPLY, 3, arrayList, 0));
                    String zzc = i3Var.a((o) arrayList.get(1)).zzc();
                    o a11 = i3Var.a((o) arrayList.get(2));
                    if (!(a11 instanceof e)) {
                        throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", new Object[]{a11.getClass().getCanonicalName()}));
                    } else if (!zzc.isEmpty()) {
                        return a10.t(zzc, i3Var, (ArrayList) ((e) a11).m());
                    } else {
                        throw new IllegalArgumentException("Function name for apply is undefined");
                    }
                } else if (ordinal == 15) {
                    a.A(z.BREAK.name(), 0, arrayList);
                    return o.f2852c;
                } else if (ordinal == 25) {
                    return c(i3Var, arrayList);
                } else {
                    if (ordinal == 41) {
                        a.G(z.IF.name(), 2, arrayList);
                        o a12 = i3Var.a((o) arrayList.get(0));
                        o a13 = i3Var.a((o) arrayList.get(1));
                        if (arrayList.size() > 2) {
                            oVar2 = i3Var.a((o) arrayList.get(2));
                        }
                        s sVar = o.f2850a;
                        if (a12.c().booleanValue()) {
                            oVar = i3Var.b((e) a13);
                        } else if (oVar2 != null) {
                            oVar = i3Var.b((e) oVar2);
                        } else {
                            oVar = sVar;
                        }
                        if (oVar instanceof g) {
                            return oVar;
                        }
                        return sVar;
                    } else if (ordinal == 54) {
                        return new e(arrayList);
                    } else {
                        if (ordinal != 57) {
                            if (ordinal != 19) {
                                if (ordinal == 20) {
                                    a.G(z.DEFINE_FUNCTION.name(), 2, arrayList);
                                    n c10 = c(i3Var, arrayList);
                                    String str3 = c10.f2738o;
                                    if (str3 == null) {
                                        str3 = BuildConfig.FLAVOR;
                                    }
                                    i3Var.e(str3, c10);
                                    return c10;
                                } else if (ordinal == 60) {
                                    o a14 = i3Var.a((o) x0.b(z.SWITCH, 3, arrayList, 0));
                                    o a15 = i3Var.a((o) arrayList.get(1));
                                    o a16 = i3Var.a((o) arrayList.get(2));
                                    if (!(a15 instanceof e)) {
                                        throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                                    } else if (a16 instanceof e) {
                                        e eVar = (e) a15;
                                        e eVar2 = (e) a16;
                                        int i10 = 0;
                                        boolean z = false;
                                        while (true) {
                                            if (i10 < eVar.p()) {
                                                if (z || a14.equals(i3Var.a(eVar.u(i10)))) {
                                                    o a17 = i3Var.a(eVar2.u(i10));
                                                    if (!(a17 instanceof g)) {
                                                        z = true;
                                                    } else if (!((g) a17).f2710p.equals("break")) {
                                                        return a17;
                                                    }
                                                } else {
                                                    z = false;
                                                }
                                                i10++;
                                            } else if (eVar.p() + 1 == eVar2.p()) {
                                                o a18 = i3Var.a(eVar2.u(eVar.p()));
                                                if (a18 instanceof g) {
                                                    String str4 = ((g) a18).f2710p;
                                                    if (str4.equals("return") || str4.equals("continue")) {
                                                        return a18;
                                                    }
                                                }
                                            }
                                        }
                                        return o.f2850a;
                                    } else {
                                        throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                                    }
                                } else if (ordinal != 61) {
                                    switch (ordinal) {
                                        case 11:
                                            return i3Var.c().b(new e(arrayList));
                                        case 12:
                                            a.A(z.BREAK.name(), 0, arrayList);
                                            return o.d;
                                        case 13:
                                            break;
                                        default:
                                            b(str);
                                            throw null;
                                    }
                                } else {
                                    if (i3Var.a((o) x0.b(z.TERNARY, 3, arrayList, 0)).c().booleanValue()) {
                                        obj = arrayList.get(1);
                                    } else {
                                        obj = arrayList.get(2);
                                    }
                                    return i3Var.a((o) obj);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                o a19 = i3Var.a((o) arrayList.get(0));
                                if (a19 instanceof e) {
                                    return i3Var.b((e) a19);
                                }
                            }
                            return o.f2850a;
                        } else if (arrayList.isEmpty()) {
                            return o.f2853e;
                        } else {
                            return new g("return", i3Var.a((o) x0.b(z.RETURN, 1, arrayList, 0)));
                        }
                    }
                }
            default:
                z zVar3 = z.ADD;
                int ordinal2 = a.K(str).ordinal();
                if (ordinal2 == 0) {
                    o a20 = i3Var.a((o) x0.b(z.ADD, 2, arrayList, 0));
                    o a21 = i3Var.a((o) arrayList.get(1));
                    if ((a20 instanceof k) || (a20 instanceof r) || (a21 instanceof k) || (a21 instanceof r)) {
                        String valueOf = String.valueOf(a20.zzc());
                        String valueOf2 = String.valueOf(a21.zzc());
                        if (valueOf2.length() != 0) {
                            str2 = valueOf.concat(valueOf2);
                        } else {
                            str2 = new String(valueOf);
                        }
                        rVar = new r(str2);
                    } else {
                        rVar = new h(Double.valueOf(a21.b().doubleValue() + a20.b().doubleValue()));
                    }
                } else if (ordinal2 == 21) {
                    rVar = new h(Double.valueOf(i3Var.a((o) x0.b(z.DIVIDE, 2, arrayList, 0)).b().doubleValue() / i3Var.a((o) arrayList.get(1)).b().doubleValue()));
                } else if (ordinal2 == 59) {
                    o a22 = i3Var.a((o) x0.b(z.SUBTRACT, 2, arrayList, 0));
                    Double valueOf3 = Double.valueOf(-i3Var.a((o) arrayList.get(1)).b().doubleValue());
                    if (valueOf3 == null) {
                        valueOf3 = Double.valueOf(Double.NaN);
                    }
                    rVar = new h(Double.valueOf(valueOf3.doubleValue() + a22.b().doubleValue()));
                } else if (ordinal2 == 52 || ordinal2 == 53) {
                    a.A(str, 2, arrayList);
                    o a23 = i3Var.a((o) arrayList.get(0));
                    i3Var.a((o) arrayList.get(1));
                    return a23;
                } else if (ordinal2 == 55 || ordinal2 == 56) {
                    a.A(str, 1, arrayList);
                    return i3Var.a((o) arrayList.get(0));
                } else {
                    switch (ordinal2) {
                        case 44:
                            rVar = new h(Double.valueOf(i3Var.a((o) x0.b(z.MODULUS, 2, arrayList, 0)).b().doubleValue() % i3Var.a((o) arrayList.get(1)).b().doubleValue()));
                            break;
                        case 45:
                            rVar = new h(Double.valueOf(i3Var.a((o) x0.b(z.MULTIPLY, 2, arrayList, 0)).b().doubleValue() * i3Var.a((o) arrayList.get(1)).b().doubleValue()));
                            break;
                        case 46:
                            return new h(Double.valueOf(-i3Var.a((o) x0.b(z.NEGATE, 1, arrayList, 0)).b().doubleValue()));
                        default:
                            b(str);
                            throw null;
                    }
                }
                return rVar;
        }
    }
}

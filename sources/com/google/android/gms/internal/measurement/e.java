package com.google.android.gms.internal.measurement;

import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class e implements Iterable<o>, o, k {

    /* renamed from: o  reason: collision with root package name */
    public final TreeMap f2681o;

    /* renamed from: p  reason: collision with root package name */
    public final TreeMap f2682p;

    public e() {
        this.f2681o = new TreeMap();
        this.f2682p = new TreeMap();
    }

    public e(List<o> list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                v(i10, list.get(i10));
            }
        }
    }

    public final Double b() {
        TreeMap treeMap = this.f2681o;
        return treeMap.size() == 1 ? u(0).b() : treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public final Boolean c() {
        return Boolean.TRUE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r3 = (com.google.android.gms.internal.measurement.o) r2.f2682p.get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.o e(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "length"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0017
            com.google.android.gms.internal.measurement.h r3 = new com.google.android.gms.internal.measurement.h
            int r0 = r2.p()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.<init>(r0)
            return r3
        L_0x0017:
            boolean r0 = r2.k(r3)
            if (r0 == 0) goto L_0x0028
            java.util.TreeMap r0 = r2.f2682p
            java.lang.Object r3 = r0.get(r3)
            com.google.android.gms.internal.measurement.o r3 = (com.google.android.gms.internal.measurement.o) r3
            if (r3 == 0) goto L_0x0028
            return r3
        L_0x0028:
            com.google.android.gms.internal.measurement.s r3 = com.google.android.gms.internal.measurement.o.f2850a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.e.e(java.lang.String):com.google.android.gms.internal.measurement.o");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (p() != eVar.p()) {
            return false;
        }
        TreeMap treeMap = this.f2681o;
        if (treeMap.isEmpty()) {
            return eVar.f2681o.isEmpty();
        }
        for (int intValue = ((Integer) treeMap.firstKey()).intValue(); intValue <= ((Integer) treeMap.lastKey()).intValue(); intValue++) {
            if (!u(intValue).equals(eVar.u(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final void h(String str, o oVar) {
        TreeMap treeMap = this.f2682p;
        if (oVar == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, oVar);
        }
    }

    public final int hashCode() {
        return this.f2681o.hashCode() * 31;
    }

    public final Iterator<o> i() {
        return new c(this.f2681o.keySet().iterator(), this.f2682p.keySet().iterator());
    }

    public final Iterator<o> iterator() {
        return new d(0, this);
    }

    public final boolean k(String str) {
        return "length".equals(str) || this.f2682p.containsKey(str);
    }

    public final List<o> m() {
        ArrayList arrayList = new ArrayList(p());
        for (int i10 = 0; i10 < p(); i10++) {
            arrayList.add(u(i10));
        }
        return arrayList;
    }

    public final Iterator<Integer> n() {
        return this.f2681o.keySet().iterator();
    }

    public final int p() {
        TreeMap treeMap = this.f2681o;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final o q() {
        Integer num;
        o oVar;
        e eVar = new e();
        for (Map.Entry entry : this.f2681o.entrySet()) {
            boolean z = entry.getValue() instanceof k;
            TreeMap treeMap = eVar.f2681o;
            if (z) {
                num = (Integer) entry.getKey();
                oVar = (o) entry.getValue();
            } else {
                num = (Integer) entry.getKey();
                oVar = ((o) entry.getValue()).q();
            }
            treeMap.put(num, oVar);
        }
        return eVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v113, resolved type: com.google.android.gms.internal.measurement.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v129, resolved type: com.google.android.gms.internal.measurement.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v130, resolved type: com.google.android.gms.internal.measurement.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v131, resolved type: com.google.android.gms.internal.measurement.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v132, resolved type: com.google.android.gms.internal.measurement.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v133, resolved type: com.google.android.gms.internal.measurement.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v134, resolved type: com.google.android.gms.internal.measurement.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v135, resolved type: com.google.android.gms.internal.measurement.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v136, resolved type: com.google.android.gms.internal.measurement.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v137, resolved type: com.google.android.gms.internal.measurement.h} */
    /* JADX WARNING: type inference failed for: r1v103, types: [com.google.android.gms.internal.measurement.o] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01df, code lost:
        r6 = r17;
        r7 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01e4, code lost:
        r6 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0205, code lost:
        r7 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0217, code lost:
        r1 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0219, code lost:
        r16 = com.google.android.gms.internal.measurement.o.f2850a;
        r17 = com.google.android.gms.internal.measurement.o.f2855g;
        r18 = com.google.android.gms.internal.measurement.o.f2854f;
        r13 = ",";
        r21 = r6;
        r20 = "every";
        r8 = r30;
        r6 = r8.f2681o;
        r22 = r5;
        r26 = "lastIndexOf";
        r27 = "map";
        r14 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0235, code lost:
        switch(r1) {
            case 0: goto L_0x0869;
            case 1: goto L_0x082a;
            case 2: goto L_0x07c6;
            case 3: goto L_0x0796;
            case 4: goto L_0x0700;
            case 5: goto L_0x06c2;
            case 6: goto L_0x061b;
            case 7: goto L_0x05e6;
            case 8: goto L_0x05cd;
            case 9: goto L_0x0597;
            case 10: goto L_0x058c;
            case 11: goto L_0x0586;
            case 12: goto L_0x054e;
            case 13: goto L_0x0540;
            case 14: goto L_0x04bd;
            case 15: goto L_0x044c;
            case 16: goto L_0x03f0;
            case 17: goto L_0x02df;
            case 18: goto L_0x02cc;
            case 19: goto L_0x0240;
            default: goto L_0x0238;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x023f, code lost:
        throw new java.lang.IllegalArgumentException("Command not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0244, code lost:
        if (r33.isEmpty() != false) goto L_0x02bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0246, code lost:
        r0 = new com.google.android.gms.internal.measurement.e();
        r1 = r33.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0253, code lost:
        if (r1.hasNext() == false) goto L_0x0275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0255, code lost:
        r2 = r32.a((com.google.android.gms.internal.measurement.o) r1.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0263, code lost:
        if ((r2 instanceof com.google.android.gms.internal.measurement.g) != false) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0265, code lost:
        r0.v(r0.p(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0274, code lost:
        throw new java.lang.IllegalStateException("Argument evaluation failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0275, code lost:
        r1 = r0.p();
        r2 = n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0281, code lost:
        if (r2.hasNext() == false) goto L_0x029a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0283, code lost:
        r3 = r2.next();
        r0.v(r3.intValue() + r1, u(r3.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x029a, code lost:
        r6.clear();
        r1 = r0.n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02a5, code lost:
        if (r1.hasNext() == false) goto L_0x02bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02a7, code lost:
        r2 = r1.next();
        v(r2.intValue(), r0.u(r2.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02bd, code lost:
        r0 = new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf((double) p()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02cc, code lost:
        androidx.databinding.a.A(r7, 0, r33);
        r0 = new com.google.android.gms.internal.measurement.r(z(r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02db, code lost:
        r17 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02df, code lost:
        r3 = r32;
        r1 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02e8, code lost:
        if (r33.isEmpty() == false) goto L_0x02f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02ea, code lost:
        r17 = new com.google.android.gms.internal.measurement.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02f1, code lost:
        r2 = (int) androidx.databinding.a.P(r3.a((com.google.android.gms.internal.measurement.o) r1.get(0)).b().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0308, code lost:
        if (r2 >= 0) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x030a, code lost:
        r2 = java.lang.Math.max(0, p() + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0318, code lost:
        if (r2 <= p()) goto L_0x031e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x031a, code lost:
        r2 = p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x031e, code lost:
        r0 = p();
        r4 = new com.google.android.gms.internal.measurement.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x032c, code lost:
        if (r33.size() <= 1) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x032e, code lost:
        r5 = java.lang.Math.max(0, (int) androidx.databinding.a.P(r3.a((com.google.android.gms.internal.measurement.o) r1.get(1)).b().doubleValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x034a, code lost:
        if (r5 <= 0) goto L_0x0366;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x034c, code lost:
        r7 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0353, code lost:
        if (r7 >= java.lang.Math.min(r0, r2 + r5)) goto L_0x0366;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0355, code lost:
        r4.v(r4.p(), u(r2));
        y(r2);
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x036b, code lost:
        if (r33.size() <= 2) goto L_0x03ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x036d, code lost:
        r13 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0372, code lost:
        if (r13 >= r33.size()) goto L_0x03ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0374, code lost:
        r0 = r3.a((com.google.android.gms.internal.measurement.o) r1.get(r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0380, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.g) != false) goto L_0x03d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0382, code lost:
        r5 = (r2 + r13) - 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0386, code lost:
        if (r5 < 0) goto L_0x03b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x038c, code lost:
        if (r5 < p()) goto L_0x038f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x038f, code lost:
        r7 = ((java.lang.Integer) r6.lastKey()).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0399, code lost:
        if (r7 < r5) goto L_0x03b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x039b, code lost:
        r9 = java.lang.Integer.valueOf(r7);
        r10 = (com.google.android.gms.internal.measurement.o) r6.get(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03a5, code lost:
        if (r10 == null) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03a7, code lost:
        v(r7 + 1, r10);
        r6.remove(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03af, code lost:
        r7 = r7 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03b2, code lost:
        v(r5, r0);
        r13 = r13 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03b8, code lost:
        r1 = new java.lang.StringBuilder(32);
        r1.append("Invalid value index: ");
        r1.append(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03d0, code lost:
        throw new java.lang.IllegalArgumentException(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03d8, code lost:
        throw new java.lang.IllegalArgumentException("Failed to parse elements to add");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03d9, code lost:
        if (r2 >= r0) goto L_0x03ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03db, code lost:
        r4.v(r4.p(), u(r2));
        v(r2, (com.google.android.gms.internal.measurement.o) null);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03f0, code lost:
        r3 = r32;
        r1 = r33;
        androidx.databinding.a.I(r0, 1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03fd, code lost:
        if (p() >= 2) goto L_0x0401;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0401, code lost:
        r0 = m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0409, code lost:
        if (r33.isEmpty() != false) goto L_0x0426;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x040b, code lost:
        r1 = r3.a((com.google.android.gms.internal.measurement.o) r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0418, code lost:
        if ((r1 instanceof com.google.android.gms.internal.measurement.i) == false) goto L_0x041e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x041a, code lost:
        r5 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0425, code lost:
        throw new java.lang.IllegalArgumentException("Comparator should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0426, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0427, code lost:
        java.util.Collections.sort(r0, new com.google.android.gms.internal.measurement.w(r5, r3));
        r6.clear();
        r0 = ((java.util.ArrayList) r0).iterator();
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x043d, code lost:
        if (r0.hasNext() == false) goto L_0x0583;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x043f, code lost:
        v(r13, (com.google.android.gms.internal.measurement.o) r0.next());
        r13 = r13 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x044c, code lost:
        r3 = r32;
        r1 = r33;
        androidx.databinding.a.A(r10, 1, r1);
        r0 = r3.a((com.google.android.gms.internal.measurement.o) r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0461, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.i) == false) goto L_0x04b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0467, code lost:
        if (p() != 0) goto L_0x046b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x046b, code lost:
        r0 = (com.google.android.gms.internal.measurement.i) r0;
        r1 = n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0475, code lost:
        if (r1.hasNext() == false) goto L_0x0792;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0477, code lost:
        r2 = r1.next().intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0485, code lost:
        if (w(r2) == false) goto L_0x0471;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04b1, code lost:
        if (r0.a(r3, java.util.Arrays.asList(new com.google.android.gms.internal.measurement.o[]{u(r2), new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf((double) r2)), r8})).c().booleanValue() == false) goto L_0x0471;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04b3, code lost:
        r17 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04bc, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04bd, code lost:
        r3 = r32;
        r1 = r33;
        androidx.databinding.a.I("slice", 2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04c9, code lost:
        if (r33.isEmpty() == false) goto L_0x04d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04cb, code lost:
        r17 = q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04d1, code lost:
        r4 = (double) p();
        r6 = androidx.databinding.a.P(r3.a((com.google.android.gms.internal.measurement.o) r1.get(0)).b().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04ef, code lost:
        if (r6 >= 0.0d) goto L_0x04f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04f1, code lost:
        r6 = java.lang.Math.max(r6 + r4, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04f7, code lost:
        r6 = java.lang.Math.min(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0500, code lost:
        if (r33.size() != 2) goto L_0x0527;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0502, code lost:
        r0 = androidx.databinding.a.P(r3.a((com.google.android.gms.internal.measurement.o) r1.get(1)).b().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x051b, code lost:
        if (r0 >= 0.0d) goto L_0x0523;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x051d, code lost:
        r4 = java.lang.Math.max(r4 + r0, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0523, code lost:
        r4 = java.lang.Math.min(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0527, code lost:
        r0 = new com.google.android.gms.internal.measurement.e();
        r1 = (int) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0530, code lost:
        if (((double) r1) >= r4) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0532, code lost:
        r0.v(r0.p(), u(r1));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0540, code lost:
        r0 = 0;
        androidx.databinding.a.A("shift", 0, r33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x054a, code lost:
        if (p() != 0) goto L_0x05dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x054e, code lost:
        androidx.databinding.a.A("reverse", 0, r33);
        r0 = p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0558, code lost:
        if (r0 == 0) goto L_0x0583;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x055a, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x055d, code lost:
        if (r13 >= (r0 / 2)) goto L_0x0583;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0563, code lost:
        if (w(r13) == false) goto L_0x0580;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0565, code lost:
        r1 = u(r13);
        v(r13, (com.google.android.gms.internal.measurement.o) null);
        r2 = (r0 - 1) - r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0574, code lost:
        if (w(r2) == false) goto L_0x057d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0576, code lost:
        v(r13, u(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x057d, code lost:
        v(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0580, code lost:
        r13 = r13 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0586, code lost:
        r3 = r32;
        r1 = r33;
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x058c, code lost:
        r3 = r32;
        r1 = r33;
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0591, code lost:
        r0 = s6.a.f0(r8, r3, r1, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0597, code lost:
        r3 = r32;
        r1 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x059f, code lost:
        if (r33.isEmpty() != false) goto L_0x05bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x05a1, code lost:
        r0 = r33.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x05a9, code lost:
        if (r0.hasNext() == false) goto L_0x05bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x05ab, code lost:
        v(p(), r3.a((com.google.android.gms.internal.measurement.o) r0.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x05bd, code lost:
        r0 = new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf((double) p()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05cd, code lost:
        androidx.databinding.a.A("pop", 0, r33);
        r0 = p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05d7, code lost:
        if (r0 != 0) goto L_0x05db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05db, code lost:
        r0 = r0 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05dd, code lost:
        r1 = u(r0);
        y(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x05e6, code lost:
        r3 = r32;
        r1 = r33;
        androidx.databinding.a.A(r27, 1, r1);
        r0 = r3.a((com.google.android.gms.internal.measurement.o) r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x05fd, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.n) == false) goto L_0x0615;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0603, code lost:
        if (p() != 0) goto L_0x060c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0605, code lost:
        r17 = new com.google.android.gms.internal.measurement.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x060c, code lost:
        r17 = s6.a.l0(r8, r3, (com.google.android.gms.internal.measurement.n) r0, (java.lang.Boolean) null, (java.lang.Boolean) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x061a, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x061b, code lost:
        r3 = r32;
        r1 = r33;
        androidx.databinding.a.I(r26, 2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0629, code lost:
        if (r33.isEmpty() != false) goto L_0x0636;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x062b, code lost:
        r16 = r3.a((com.google.android.gms.internal.measurement.o) r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0636, code lost:
        r0 = r16;
        r4 = (double) (p() - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0644, code lost:
        if (r33.size() <= 1) goto L_0x067d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0646, code lost:
        r1 = r3.a((com.google.android.gms.internal.measurement.o) r1.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x065c, code lost:
        if (java.lang.Double.isNaN(r1.b().doubleValue()) == false) goto L_0x0666;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x065e, code lost:
        r1 = (double) (p() - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0666, code lost:
        r1 = androidx.databinding.a.P(r1.b().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0672, code lost:
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0675, code lost:
        if (r4 >= 0.0d) goto L_0x067d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0677, code lost:
        r4 = r4 + ((double) p());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x067f, code lost:
        if (r4 >= 0.0d) goto L_0x068c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0681, code lost:
        r0 = new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x068c, code lost:
        r1 = (int) java.lang.Math.min((double) p(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0696, code lost:
        if (r1 < 0) goto L_0x06b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x069c, code lost:
        if (w(r1) == false) goto L_0x06b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x06a6, code lost:
        if (androidx.databinding.a.M(u(r1), r0) == false) goto L_0x06b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x06a8, code lost:
        r0 = new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf((double) r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x06b4, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x06b7, code lost:
        r0 = new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x06c2, code lost:
        r3 = r32;
        r1 = r33;
        androidx.databinding.a.I(r12, 1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x06ce, code lost:
        if (p() != 0) goto L_0x06d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x06d0, code lost:
        r17 = com.google.android.gms.internal.measurement.o.f2856h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x06d8, code lost:
        if (r33.size() <= 0) goto L_0x06f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x06da, code lost:
        r0 = r3.a((com.google.android.gms.internal.measurement.o) r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x06e7, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.m) != false) goto L_0x06f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x06eb, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.s) == false) goto L_0x06ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x06ee, code lost:
        r13 = r0.zzc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x06f3, code lost:
        r13 = com.karumi.dexter.BuildConfig.FLAVOR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x06f5, code lost:
        r0 = new com.google.android.gms.internal.measurement.r(z(r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0700, code lost:
        r3 = r32;
        r1 = r33;
        androidx.databinding.a.I("indexOf", 2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x070c, code lost:
        if (r33.isEmpty() != false) goto L_0x0719;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x070e, code lost:
        r16 = r3.a((com.google.android.gms.internal.measurement.o) r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0719, code lost:
        r0 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0720, code lost:
        if (r33.size() <= 1) goto L_0x0759;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0722, code lost:
        r1 = androidx.databinding.a.P(r3.a((com.google.android.gms.internal.measurement.o) r1.get(1)).b().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x073f, code lost:
        if (r1 < ((double) p())) goto L_0x074c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0741, code lost:
        r0 = new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x074e, code lost:
        if (r1 >= 0.0d) goto L_0x0758;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0750, code lost:
        r14 = ((double) p()) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0758, code lost:
        r14 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0759, code lost:
        r1 = n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0761, code lost:
        if (r1.hasNext() == false) goto L_0x0787;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0763, code lost:
        r2 = r1.next().intValue();
        r3 = (double) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0770, code lost:
        if (r3 < r14) goto L_0x075d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x077a, code lost:
        if (androidx.databinding.a.M(u(r2), r0) == false) goto L_0x075d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x077c, code lost:
        r0 = new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0787, code lost:
        r0 = new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0796, code lost:
        r3 = r32;
        r1 = r33;
        androidx.databinding.a.A(r22, 1, r1);
        r0 = r3.a((com.google.android.gms.internal.measurement.o) r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x07ad, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.n) == false) goto L_0x07c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x07b3, code lost:
        if (r6.size() != 0) goto L_0x07b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x07b6, code lost:
        s6.a.l0(r8, r3, (com.google.android.gms.internal.measurement.n) r0, (java.lang.Boolean) null, (java.lang.Boolean) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x07c5, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x07c6, code lost:
        r3 = r32;
        r1 = r33;
        androidx.databinding.a.A(r21, 1, r1);
        r0 = r3.a((com.google.android.gms.internal.measurement.o) r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x07dd, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.n) == false) goto L_0x0824;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x07e3, code lost:
        if (r6.size() != 0) goto L_0x07ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x07e5, code lost:
        r0 = new com.google.android.gms.internal.measurement.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x07ec, code lost:
        r1 = q();
        r0 = s6.a.l0(r8, r3, (com.google.android.gms.internal.measurement.n) r0, (java.lang.Boolean) null, java.lang.Boolean.TRUE);
        r2 = new com.google.android.gms.internal.measurement.e();
        r0 = r0.n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0806, code lost:
        if (r0.hasNext() == false) goto L_0x0821;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0808, code lost:
        r2.v(r2.p(), ((com.google.android.gms.internal.measurement.e) r1).u(r0.next().intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0829, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x082a, code lost:
        r3 = r32;
        r1 = r33;
        androidx.databinding.a.A(r20, 1, r1);
        r0 = r3.a((com.google.android.gms.internal.measurement.o) r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0841, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.n) == false) goto L_0x0863;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0847, code lost:
        if (p() != 0) goto L_0x084a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x085c, code lost:
        if (s6.a.l0(r8, r3, (com.google.android.gms.internal.measurement.n) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).p() == p()) goto L_0x0860;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0868, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0869, code lost:
        r3 = r32;
        r1 = r33;
        r0 = q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0875, code lost:
        if (r33.isEmpty() != false) goto L_0x08c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0877, code lost:
        r1 = r33.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x087f, code lost:
        if (r1.hasNext() == false) goto L_0x08c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0881, code lost:
        r2 = r3.a((com.google.android.gms.internal.measurement.o) r1.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x088d, code lost:
        if ((r2 instanceof com.google.android.gms.internal.measurement.g) != false) goto L_0x08c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x088f, code lost:
        r4 = (com.google.android.gms.internal.measurement.e) r0;
        r5 = r4.p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0898, code lost:
        if ((r2 instanceof com.google.android.gms.internal.measurement.e) == false) goto L_0x08bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x089a, code lost:
        r2 = (com.google.android.gms.internal.measurement.e) r2;
        r6 = r2.n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x08a4, code lost:
        if (r6.hasNext() == false) goto L_0x087b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x08a6, code lost:
        r7 = r6.next();
        r4.v(r7.intValue() + r5, r2.u(r7.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x08bd, code lost:
        r4.v(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x08c8, code lost:
        throw new java.lang.IllegalStateException("Failed evaluation of arguments");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x02db, code lost:
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:?, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:?, code lost:
        return r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:?, code lost:
        return r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:?, code lost:
        return r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012f, code lost:
        r6 = r17;
        r7 = r18;
        r5 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01b9, code lost:
        r5 = r22;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.o t(java.lang.String r31, com.google.android.gms.internal.measurement.i3 r32, java.util.ArrayList r33) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            java.lang.String r4 = "concat"
            boolean r5 = r4.equals(r1)
            java.lang.String r6 = "reduceRight"
            java.lang.String r7 = "push"
            java.lang.String r8 = "unshift"
            java.lang.String r9 = "splice"
            java.lang.String r10 = "reduce"
            java.lang.String r11 = "toString"
            java.lang.String r12 = "filter"
            java.lang.String r13 = "forEach"
            java.lang.String r14 = "lastIndexOf"
            java.lang.String r15 = "map"
            r16 = r4
            java.lang.String r4 = "pop"
            java.lang.String r0 = "join"
            java.lang.String r2 = "some"
            java.lang.String r3 = "sort"
            r17 = r8
            java.lang.String r8 = "every"
            r18 = r11
            java.lang.String r11 = "shift"
            r19 = r9
            java.lang.String r9 = "slice"
            r20 = r3
            java.lang.String r3 = "reverse"
            r21 = r2
            java.lang.String r2 = "indexOf"
            if (r5 != 0) goto L_0x0117
            boolean r5 = r8.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r12.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r13.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r2.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r0.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r14.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r15.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r4.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r7.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r10.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r6.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r3.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r11.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r9.equals(r1)
            if (r5 != 0) goto L_0x0117
            r5 = r21
            boolean r21 = r5.equals(r1)
            if (r21 != 0) goto L_0x0108
            r21 = r0
            r0 = r20
            boolean r20 = r0.equals(r1)
            if (r20 != 0) goto L_0x00fc
            r20 = r0
            r0 = r19
            boolean r19 = r0.equals(r1)
            if (r19 != 0) goto L_0x00ec
            r19 = r5
            r5 = r18
            boolean r18 = r5.equals(r1)
            if (r18 != 0) goto L_0x00d7
            r18 = r5
            r5 = r17
            boolean r17 = r5.equals(r1)
            if (r17 == 0) goto L_0x00c7
            goto L_0x00db
        L_0x00c7:
            com.google.android.gms.internal.measurement.r r0 = new com.google.android.gms.internal.measurement.r
            r0.<init>(r1)
            r1 = r30
            r2 = r32
            r3 = r33
            com.google.android.gms.internal.measurement.o r0 = androidx.databinding.a.w(r1, r0, r2, r3)
            return r0
        L_0x00d7:
            r18 = r5
            r5 = r17
        L_0x00db:
            r17 = r12
            r12 = r21
            r28 = r20
            r20 = r0
            r0 = r28
            r29 = r19
            r19 = r10
            r10 = r29
            goto L_0x0124
        L_0x00ec:
            r19 = r10
            r10 = r5
            r5 = r17
            r17 = r12
            r12 = r21
            r28 = r20
            r20 = r0
            r0 = r28
            goto L_0x0124
        L_0x00fc:
            r20 = r19
            r19 = r10
            r10 = r5
            r5 = r17
            r17 = r12
            r12 = r21
            goto L_0x0124
        L_0x0108:
            r28 = r12
            r12 = r0
            r0 = r20
            r20 = r19
            r19 = r10
            r10 = r5
            r5 = r17
            r17 = r28
            goto L_0x0124
        L_0x0117:
            r5 = r17
            r17 = r12
            r12 = r0
            r0 = r20
            r20 = r19
            r19 = r10
            r10 = r21
        L_0x0124:
            int r21 = r31.hashCode()
            r22 = r13
            r23 = -1
            switch(r21) {
                case -1776922004: goto L_0x0208;
                case -1354795244: goto L_0x01f5;
                case -1274492040: goto L_0x01e7;
                case -934873754: goto L_0x01d3;
                case -895859076: goto L_0x01c6;
                case -678635926: goto L_0x01bc;
                case -467511597: goto L_0x01b2;
                case -277637751: goto L_0x01a9;
                case 107868: goto L_0x01a1;
                case 111185: goto L_0x0198;
                case 3267882: goto L_0x0190;
                case 3452698: goto L_0x0187;
                case 3536116: goto L_0x017e;
                case 3536286: goto L_0x0175;
                case 96891675: goto L_0x0166;
                case 109407362: goto L_0x015d;
                case 109526418: goto L_0x0154;
                case 965561430: goto L_0x014a;
                case 1099846370: goto L_0x0140;
                case 1943291465: goto L_0x0137;
                default: goto L_0x012f;
            }
        L_0x012f:
            r6 = r17
            r7 = r18
            r5 = r22
            goto L_0x0217
        L_0x0137:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x012f
            r1 = 4
            goto L_0x01b9
        L_0x0140:
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x012f
            r1 = 12
            goto L_0x01b9
        L_0x014a:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x012f
            r1 = 11
            goto L_0x01b9
        L_0x0154:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x012f
            r1 = 14
            goto L_0x01b9
        L_0x015d:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x012f
            r1 = 13
            goto L_0x01b9
        L_0x0166:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x012f
            r6 = r17
            r7 = r18
            r5 = r22
            r1 = 1
            goto L_0x0219
        L_0x0175:
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x012f
            r1 = 16
            goto L_0x01b9
        L_0x017e:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x012f
            r1 = 15
            goto L_0x01b9
        L_0x0187:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x012f
            r1 = 9
            goto L_0x01b9
        L_0x0190:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x012f
            r1 = 5
            goto L_0x01b9
        L_0x0198:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x012f
            r1 = 8
            goto L_0x01b9
        L_0x01a1:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x012f
            r1 = 7
            goto L_0x01b9
        L_0x01a9:
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x012f
            r1 = 19
            goto L_0x01b9
        L_0x01b2:
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x012f
            r1 = 6
        L_0x01b9:
            r5 = r22
            goto L_0x01df
        L_0x01bc:
            r5 = r22
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x01e4
            r1 = 3
            goto L_0x01df
        L_0x01c6:
            r6 = r20
            r5 = r22
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x01e4
            r1 = 17
            goto L_0x01df
        L_0x01d3:
            r6 = r19
            r5 = r22
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x01e4
            r1 = 10
        L_0x01df:
            r6 = r17
            r7 = r18
            goto L_0x0219
        L_0x01e4:
            r6 = r17
            goto L_0x0205
        L_0x01e7:
            r6 = r17
            r5 = r22
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0205
            r7 = r18
            r1 = 2
            goto L_0x0219
        L_0x01f5:
            r7 = r16
            r6 = r17
            r5 = r22
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0205
            r7 = r18
            r1 = 0
            goto L_0x0219
        L_0x0205:
            r7 = r18
            goto L_0x0217
        L_0x0208:
            r6 = r17
            r7 = r18
            r5 = r22
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0217
            r1 = 18
            goto L_0x0219
        L_0x0217:
            r1 = r23
        L_0x0219:
            com.google.android.gms.internal.measurement.s r16 = com.google.android.gms.internal.measurement.o.f2850a
            com.google.android.gms.internal.measurement.f r17 = com.google.android.gms.internal.measurement.o.f2855g
            com.google.android.gms.internal.measurement.f r18 = com.google.android.gms.internal.measurement.o.f2854f
            java.lang.String r13 = ","
            r21 = r6
            r20 = r8
            r8 = r30
            java.util.TreeMap r6 = r8.f2681o
            r22 = r5
            r24 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.String r5 = "Callback should be a method"
            r26 = r14
            r27 = r15
            r14 = 0
            switch(r1) {
                case 0: goto L_0x0869;
                case 1: goto L_0x082a;
                case 2: goto L_0x07c6;
                case 3: goto L_0x0796;
                case 4: goto L_0x0700;
                case 5: goto L_0x06c2;
                case 6: goto L_0x061b;
                case 7: goto L_0x05e6;
                case 8: goto L_0x05cd;
                case 9: goto L_0x0597;
                case 10: goto L_0x058c;
                case 11: goto L_0x0586;
                case 12: goto L_0x054e;
                case 13: goto L_0x0540;
                case 14: goto L_0x04bd;
                case 15: goto L_0x044c;
                case 16: goto L_0x03f0;
                case 17: goto L_0x02df;
                case 18: goto L_0x02cc;
                case 19: goto L_0x0240;
                default: goto L_0x0238;
            }
        L_0x0238:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Command not supported"
            r0.<init>(r1)
            throw r0
        L_0x0240:
            boolean r0 = r33.isEmpty()
            if (r0 != 0) goto L_0x02bd
            com.google.android.gms.internal.measurement.e r0 = new com.google.android.gms.internal.measurement.e
            r0.<init>()
            java.util.Iterator r1 = r33.iterator()
        L_0x024f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0275
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.measurement.o r2 = (com.google.android.gms.internal.measurement.o) r2
            r3 = r32
            com.google.android.gms.internal.measurement.o r2 = r3.a(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.measurement.g
            if (r4 != 0) goto L_0x026d
            int r4 = r0.p()
            r0.v(r4, r2)
            goto L_0x024f
        L_0x026d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Argument evaluation failed"
            r0.<init>(r1)
            throw r0
        L_0x0275:
            int r1 = r0.p()
            java.util.Iterator r2 = r30.n()
        L_0x027d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x029a
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r4 = r3.intValue()
            int r4 = r4 + r1
            int r3 = r3.intValue()
            com.google.android.gms.internal.measurement.o r3 = r8.u(r3)
            r0.v(r4, r3)
            goto L_0x027d
        L_0x029a:
            r6.clear()
            java.util.Iterator r1 = r0.n()
        L_0x02a1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x02bd
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r3 = r2.intValue()
            int r2 = r2.intValue()
            com.google.android.gms.internal.measurement.o r2 = r0.u(r2)
            r8.v(r3, r2)
            goto L_0x02a1
        L_0x02bd:
            com.google.android.gms.internal.measurement.h r0 = new com.google.android.gms.internal.measurement.h
            int r1 = r30.p()
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            goto L_0x02db
        L_0x02cc:
            r1 = r33
            r0 = 0
            androidx.databinding.a.A(r7, r0, r1)
            com.google.android.gms.internal.measurement.r r0 = new com.google.android.gms.internal.measurement.r
            java.lang.String r1 = r8.z(r13)
            r0.<init>(r1)
        L_0x02db:
            r17 = r0
            goto L_0x0792
        L_0x02df:
            r3 = r32
            r1 = r33
            r0 = 0
            boolean r2 = r33.isEmpty()
            if (r2 == 0) goto L_0x02f1
            com.google.android.gms.internal.measurement.e r17 = new com.google.android.gms.internal.measurement.e
            r17.<init>()
            goto L_0x0792
        L_0x02f1:
            java.lang.Object r2 = r1.get(r0)
            com.google.android.gms.internal.measurement.o r2 = (com.google.android.gms.internal.measurement.o) r2
            com.google.android.gms.internal.measurement.o r2 = r3.a(r2)
            java.lang.Double r2 = r2.b()
            double r4 = r2.doubleValue()
            double r4 = androidx.databinding.a.P(r4)
            int r2 = (int) r4
            if (r2 >= 0) goto L_0x0314
            int r4 = r30.p()
            int r4 = r4 + r2
            int r2 = java.lang.Math.max(r0, r4)
            goto L_0x031e
        L_0x0314:
            int r0 = r30.p()
            if (r2 <= r0) goto L_0x031e
            int r2 = r30.p()
        L_0x031e:
            int r0 = r30.p()
            com.google.android.gms.internal.measurement.e r4 = new com.google.android.gms.internal.measurement.e
            r4.<init>()
            int r5 = r33.size()
            r7 = 1
            if (r5 <= r7) goto L_0x03d9
            java.lang.Object r5 = r1.get(r7)
            com.google.android.gms.internal.measurement.o r5 = (com.google.android.gms.internal.measurement.o) r5
            com.google.android.gms.internal.measurement.o r5 = r3.a(r5)
            java.lang.Double r5 = r5.b()
            double r9 = r5.doubleValue()
            double r9 = androidx.databinding.a.P(r9)
            int r5 = (int) r9
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            if (r5 <= 0) goto L_0x0366
            r7 = r2
        L_0x034d:
            int r9 = r2 + r5
            int r9 = java.lang.Math.min(r0, r9)
            if (r7 >= r9) goto L_0x0366
            com.google.android.gms.internal.measurement.o r9 = r8.u(r2)
            int r10 = r4.p()
            r4.v(r10, r9)
            r8.y(r2)
            int r7 = r7 + 1
            goto L_0x034d
        L_0x0366:
            int r0 = r33.size()
            r5 = 2
            if (r0 <= r5) goto L_0x03ed
            r13 = 2
        L_0x036e:
            int r0 = r33.size()
            if (r13 >= r0) goto L_0x03ed
            java.lang.Object r0 = r1.get(r13)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r3.a(r0)
            boolean r5 = r0 instanceof com.google.android.gms.internal.measurement.g
            if (r5 != 0) goto L_0x03d1
            int r5 = r2 + r13
            int r5 = r5 + -2
            if (r5 < 0) goto L_0x03b8
            int r7 = r30.p()
            if (r5 < r7) goto L_0x038f
            goto L_0x03b2
        L_0x038f:
            java.lang.Object r7 = r6.lastKey()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
        L_0x0399:
            if (r7 < r5) goto L_0x03b2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            java.lang.Object r10 = r6.get(r9)
            com.google.android.gms.internal.measurement.o r10 = (com.google.android.gms.internal.measurement.o) r10
            if (r10 == 0) goto L_0x03af
            int r11 = r7 + 1
            r8.v(r11, r10)
            r6.remove(r9)
        L_0x03af:
            int r7 = r7 + -1
            goto L_0x0399
        L_0x03b2:
            r8.v(r5, r0)
            int r13 = r13 + 1
            goto L_0x036e
        L_0x03b8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 32
            r1.<init>(r2)
            java.lang.String r2 = "Invalid value index: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x03d1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed to parse elements to add"
            r0.<init>(r1)
            throw r0
        L_0x03d9:
            if (r2 >= r0) goto L_0x03ed
            com.google.android.gms.internal.measurement.o r1 = r8.u(r2)
            int r3 = r4.p()
            r4.v(r3, r1)
            r1 = 0
            r8.v(r2, r1)
            int r2 = r2 + 1
            goto L_0x03d9
        L_0x03ed:
            r1 = r4
            goto L_0x08ca
        L_0x03f0:
            r3 = r32
            r1 = r33
            r2 = 1
            androidx.databinding.a.I(r0, r2, r1)
            int r0 = r30.p()
            r2 = 2
            if (r0 >= r2) goto L_0x0401
            goto L_0x0583
        L_0x0401:
            java.util.List r0 = r30.m()
            boolean r2 = r33.isEmpty()
            if (r2 != 0) goto L_0x0426
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            com.google.android.gms.internal.measurement.o r1 = (com.google.android.gms.internal.measurement.o) r1
            com.google.android.gms.internal.measurement.o r1 = r3.a(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.i
            if (r2 == 0) goto L_0x041e
            r5 = r1
            com.google.android.gms.internal.measurement.i r5 = (com.google.android.gms.internal.measurement.i) r5
            goto L_0x0427
        L_0x041e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Comparator should be a method"
            r0.<init>(r1)
            throw r0
        L_0x0426:
            r5 = 0
        L_0x0427:
            com.google.android.gms.internal.measurement.w r1 = new com.google.android.gms.internal.measurement.w
            r1.<init>(r5, r3)
            java.util.Collections.sort(r0, r1)
            r6.clear()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            r13 = 0
        L_0x0439:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0583
            int r1 = r13 + 1
            java.lang.Object r2 = r0.next()
            com.google.android.gms.internal.measurement.o r2 = (com.google.android.gms.internal.measurement.o) r2
            r8.v(r13, r2)
            r13 = r1
            goto L_0x0439
        L_0x044c:
            r3 = r32
            r1 = r33
            r0 = 1
            androidx.databinding.a.A(r10, r0, r1)
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            com.google.android.gms.internal.measurement.o r1 = (com.google.android.gms.internal.measurement.o) r1
            com.google.android.gms.internal.measurement.o r0 = r3.a(r1)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.i
            if (r1 == 0) goto L_0x04b7
            int r1 = r30.p()
            if (r1 != 0) goto L_0x046b
            goto L_0x0792
        L_0x046b:
            com.google.android.gms.internal.measurement.i r0 = (com.google.android.gms.internal.measurement.i) r0
            java.util.Iterator r1 = r30.n()
        L_0x0471:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0792
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            boolean r4 = r8.w(r2)
            if (r4 == 0) goto L_0x0471
            r4 = 3
            com.google.android.gms.internal.measurement.o[] r5 = new com.google.android.gms.internal.measurement.o[r4]
            com.google.android.gms.internal.measurement.o r6 = r8.u(r2)
            r7 = 0
            r5[r7] = r6
            com.google.android.gms.internal.measurement.h r6 = new com.google.android.gms.internal.measurement.h
            double r9 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r9)
            r6.<init>(r2)
            r2 = 1
            r5[r2] = r6
            r2 = 2
            r5[r2] = r8
            java.util.List r2 = java.util.Arrays.asList(r5)
            com.google.android.gms.internal.measurement.o r2 = r0.a(r3, r2)
            java.lang.Boolean r2 = r2.c()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0471
            r17 = r18
            goto L_0x0792
        L_0x04b7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L_0x04bd:
            r3 = r32
            r1 = r33
            r0 = 2
            androidx.databinding.a.I(r9, r0, r1)
            boolean r0 = r33.isEmpty()
            if (r0 == 0) goto L_0x04d1
            com.google.android.gms.internal.measurement.o r17 = r30.q()
            goto L_0x0792
        L_0x04d1:
            int r0 = r30.p()
            double r4 = (double) r0
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r3.a(r0)
            java.lang.Double r0 = r0.b()
            double r6 = r0.doubleValue()
            double r6 = androidx.databinding.a.P(r6)
            int r0 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x04f7
            double r6 = r6 + r4
            double r6 = java.lang.Math.max(r6, r14)
            goto L_0x04fb
        L_0x04f7:
            double r6 = java.lang.Math.min(r6, r4)
        L_0x04fb:
            int r0 = r33.size()
            r2 = 2
            if (r0 != r2) goto L_0x0527
            r0 = 1
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r3.a(r0)
            java.lang.Double r0 = r0.b()
            double r0 = r0.doubleValue()
            double r0 = androidx.databinding.a.P(r0)
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 >= 0) goto L_0x0523
            double r4 = r4 + r0
            double r4 = java.lang.Math.max(r4, r14)
            goto L_0x0527
        L_0x0523:
            double r4 = java.lang.Math.min(r4, r0)
        L_0x0527:
            com.google.android.gms.internal.measurement.e r0 = new com.google.android.gms.internal.measurement.e
            r0.<init>()
            int r1 = (int) r6
        L_0x052d:
            double r2 = (double) r1
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x02db
            com.google.android.gms.internal.measurement.o r2 = r8.u(r1)
            int r3 = r0.p()
            r0.v(r3, r2)
            int r1 = r1 + 1
            goto L_0x052d
        L_0x0540:
            r1 = r33
            r0 = 0
            androidx.databinding.a.A(r11, r0, r1)
            int r1 = r30.p()
            if (r1 != 0) goto L_0x05dd
            goto L_0x07bc
        L_0x054e:
            r1 = r33
            r0 = 0
            androidx.databinding.a.A(r3, r0, r1)
            int r0 = r30.p()
            if (r0 == 0) goto L_0x0583
            r13 = 0
        L_0x055b:
            int r1 = r0 / 2
            if (r13 >= r1) goto L_0x0583
            boolean r1 = r8.w(r13)
            if (r1 == 0) goto L_0x0580
            com.google.android.gms.internal.measurement.o r1 = r8.u(r13)
            r2 = 0
            r8.v(r13, r2)
            int r2 = r0 + -1
            int r2 = r2 - r13
            boolean r3 = r8.w(r2)
            if (r3 == 0) goto L_0x057d
            com.google.android.gms.internal.measurement.o r3 = r8.u(r2)
            r8.v(r13, r3)
        L_0x057d:
            r8.v(r2, r1)
        L_0x0580:
            int r13 = r13 + 1
            goto L_0x055b
        L_0x0583:
            r1 = r8
            goto L_0x08ca
        L_0x0586:
            r3 = r32
            r1 = r33
            r13 = 0
            goto L_0x0591
        L_0x058c:
            r3 = r32
            r1 = r33
            r13 = 1
        L_0x0591:
            com.google.android.gms.internal.measurement.o r0 = s6.a.f0(r8, r3, r1, r13)
            goto L_0x08c9
        L_0x0597:
            r3 = r32
            r1 = r33
            boolean r0 = r33.isEmpty()
            if (r0 != 0) goto L_0x05bd
            java.util.Iterator r0 = r33.iterator()
        L_0x05a5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x05bd
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.o r1 = (com.google.android.gms.internal.measurement.o) r1
            com.google.android.gms.internal.measurement.o r1 = r3.a(r1)
            int r2 = r30.p()
            r8.v(r2, r1)
            goto L_0x05a5
        L_0x05bd:
            com.google.android.gms.internal.measurement.h r0 = new com.google.android.gms.internal.measurement.h
            int r1 = r30.p()
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            goto L_0x02db
        L_0x05cd:
            r1 = r33
            r0 = 0
            androidx.databinding.a.A(r4, r0, r1)
            int r0 = r30.p()
            if (r0 != 0) goto L_0x05db
            goto L_0x07bc
        L_0x05db:
            int r0 = r0 + -1
        L_0x05dd:
            com.google.android.gms.internal.measurement.o r1 = r8.u(r0)
            r8.y(r0)
            goto L_0x08ca
        L_0x05e6:
            r3 = r32
            r1 = r33
            r4 = r27
            r0 = 0
            r2 = 1
            androidx.databinding.a.A(r4, r2, r1)
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r3.a(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.n
            if (r1 == 0) goto L_0x0615
            int r1 = r30.p()
            if (r1 != 0) goto L_0x060c
            com.google.android.gms.internal.measurement.e r17 = new com.google.android.gms.internal.measurement.e
            r17.<init>()
            goto L_0x0792
        L_0x060c:
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.n) r0
            r1 = 0
            com.google.android.gms.internal.measurement.e r17 = s6.a.l0(r8, r3, r0, r1, r1)
            goto L_0x0792
        L_0x0615:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L_0x061b:
            r3 = r32
            r1 = r33
            r2 = r26
            r0 = 2
            androidx.databinding.a.I(r2, r0, r1)
            boolean r0 = r33.isEmpty()
            if (r0 != 0) goto L_0x0636
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r16 = r3.a(r0)
        L_0x0636:
            r0 = r16
            int r2 = r30.p()
            int r2 = r2 + -1
            double r4 = (double) r2
            int r2 = r33.size()
            r6 = 1
            if (r2 <= r6) goto L_0x067d
            java.lang.Object r1 = r1.get(r6)
            com.google.android.gms.internal.measurement.o r1 = (com.google.android.gms.internal.measurement.o) r1
            com.google.android.gms.internal.measurement.o r1 = r3.a(r1)
            java.lang.Double r2 = r1.b()
            double r2 = r2.doubleValue()
            boolean r2 = java.lang.Double.isNaN(r2)
            if (r2 == 0) goto L_0x0666
            int r1 = r30.p()
            int r1 = r1 + -1
            double r1 = (double) r1
            goto L_0x0672
        L_0x0666:
            java.lang.Double r1 = r1.b()
            double r1 = r1.doubleValue()
            double r1 = androidx.databinding.a.P(r1)
        L_0x0672:
            r4 = r1
            int r1 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r1 >= 0) goto L_0x067d
            int r1 = r30.p()
            double r1 = (double) r1
            double r4 = r4 + r1
        L_0x067d:
            int r1 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r1 >= 0) goto L_0x068c
            com.google.android.gms.internal.measurement.h r0 = new com.google.android.gms.internal.measurement.h
            java.lang.Double r1 = java.lang.Double.valueOf(r24)
            r0.<init>(r1)
            goto L_0x02db
        L_0x068c:
            int r1 = r30.p()
            double r1 = (double) r1
            double r1 = java.lang.Math.min(r1, r4)
            int r1 = (int) r1
        L_0x0696:
            if (r1 < 0) goto L_0x06b7
            boolean r2 = r8.w(r1)
            if (r2 == 0) goto L_0x06b4
            com.google.android.gms.internal.measurement.o r2 = r8.u(r1)
            boolean r2 = androidx.databinding.a.M(r2, r0)
            if (r2 == 0) goto L_0x06b4
            com.google.android.gms.internal.measurement.h r0 = new com.google.android.gms.internal.measurement.h
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            goto L_0x08c9
        L_0x06b4:
            int r1 = r1 + -1
            goto L_0x0696
        L_0x06b7:
            com.google.android.gms.internal.measurement.h r0 = new com.google.android.gms.internal.measurement.h
            java.lang.Double r1 = java.lang.Double.valueOf(r24)
            r0.<init>(r1)
            goto L_0x02db
        L_0x06c2:
            r3 = r32
            r1 = r33
            r0 = 1
            androidx.databinding.a.I(r12, r0, r1)
            int r0 = r30.p()
            if (r0 != 0) goto L_0x06d4
            com.google.android.gms.internal.measurement.r r17 = com.google.android.gms.internal.measurement.o.f2856h
            goto L_0x0792
        L_0x06d4:
            int r0 = r33.size()
            if (r0 <= 0) goto L_0x06f5
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r3.a(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.m
            if (r1 != 0) goto L_0x06f3
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.s
            if (r1 == 0) goto L_0x06ee
            goto L_0x06f3
        L_0x06ee:
            java.lang.String r13 = r0.zzc()
            goto L_0x06f5
        L_0x06f3:
            java.lang.String r13 = ""
        L_0x06f5:
            com.google.android.gms.internal.measurement.r r0 = new com.google.android.gms.internal.measurement.r
            java.lang.String r1 = r8.z(r13)
            r0.<init>(r1)
            goto L_0x08c9
        L_0x0700:
            r3 = r32
            r1 = r33
            r0 = 2
            androidx.databinding.a.I(r2, r0, r1)
            boolean r0 = r33.isEmpty()
            if (r0 != 0) goto L_0x0719
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r16 = r3.a(r0)
        L_0x0719:
            r0 = r16
            int r2 = r33.size()
            r4 = 1
            if (r2 <= r4) goto L_0x0759
            java.lang.Object r1 = r1.get(r4)
            com.google.android.gms.internal.measurement.o r1 = (com.google.android.gms.internal.measurement.o) r1
            com.google.android.gms.internal.measurement.o r1 = r3.a(r1)
            java.lang.Double r1 = r1.b()
            double r1 = r1.doubleValue()
            double r1 = androidx.databinding.a.P(r1)
            int r3 = r30.p()
            double r3 = (double) r3
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x074c
            com.google.android.gms.internal.measurement.h r0 = new com.google.android.gms.internal.measurement.h
            java.lang.Double r1 = java.lang.Double.valueOf(r24)
            r0.<init>(r1)
            goto L_0x02db
        L_0x074c:
            int r3 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r3 >= 0) goto L_0x0758
            int r3 = r30.p()
            double r3 = (double) r3
            double r14 = r3 + r1
            goto L_0x0759
        L_0x0758:
            r14 = r1
        L_0x0759:
            java.util.Iterator r1 = r30.n()
        L_0x075d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0787
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            double r3 = (double) r2
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 < 0) goto L_0x075d
            com.google.android.gms.internal.measurement.o r2 = r8.u(r2)
            boolean r2 = androidx.databinding.a.M(r2, r0)
            if (r2 == 0) goto L_0x075d
            com.google.android.gms.internal.measurement.h r0 = new com.google.android.gms.internal.measurement.h
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r0.<init>(r1)
            goto L_0x02db
        L_0x0787:
            com.google.android.gms.internal.measurement.h r0 = new com.google.android.gms.internal.measurement.h
            java.lang.Double r1 = java.lang.Double.valueOf(r24)
            r0.<init>(r1)
            goto L_0x02db
        L_0x0792:
            r1 = r17
            goto L_0x08ca
        L_0x0796:
            r3 = r32
            r1 = r33
            r2 = r22
            r0 = 1
            androidx.databinding.a.A(r2, r0, r1)
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r3.a(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.n
            if (r1 == 0) goto L_0x07c0
            int r1 = r6.size()
            if (r1 != 0) goto L_0x07b6
            goto L_0x07bc
        L_0x07b6:
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.n) r0
            r1 = 0
            s6.a.l0(r8, r3, r0, r1, r1)
        L_0x07bc:
            r1 = r16
            goto L_0x08ca
        L_0x07c0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L_0x07c6:
            r3 = r32
            r1 = r33
            r2 = r21
            r0 = 1
            androidx.databinding.a.A(r2, r0, r1)
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r3.a(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.n
            if (r1 == 0) goto L_0x0824
            int r1 = r6.size()
            if (r1 != 0) goto L_0x07ec
            com.google.android.gms.internal.measurement.e r0 = new com.google.android.gms.internal.measurement.e
            r0.<init>()
            goto L_0x08c9
        L_0x07ec:
            com.google.android.gms.internal.measurement.o r1 = r30.q()
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.n) r0
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r4 = 0
            com.google.android.gms.internal.measurement.e r0 = s6.a.l0(r8, r3, r0, r4, r2)
            com.google.android.gms.internal.measurement.e r2 = new com.google.android.gms.internal.measurement.e
            r2.<init>()
            java.util.Iterator r0 = r0.n()
        L_0x0802:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0821
            java.lang.Object r3 = r0.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = r1
            com.google.android.gms.internal.measurement.e r4 = (com.google.android.gms.internal.measurement.e) r4
            com.google.android.gms.internal.measurement.o r3 = r4.u(r3)
            int r4 = r2.p()
            r2.v(r4, r3)
            goto L_0x0802
        L_0x0821:
            r1 = r2
            goto L_0x08ca
        L_0x0824:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L_0x082a:
            r3 = r32
            r1 = r33
            r2 = r20
            r0 = 1
            androidx.databinding.a.A(r2, r0, r1)
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r3.a(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.n
            if (r1 == 0) goto L_0x0863
            int r1 = r30.p()
            if (r1 != 0) goto L_0x084a
            goto L_0x0860
        L_0x084a:
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.n) r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            com.google.android.gms.internal.measurement.e r0 = s6.a.l0(r8, r3, r0, r1, r2)
            int r0 = r0.p()
            int r1 = r30.p()
            if (r0 == r1) goto L_0x0860
            goto L_0x0792
        L_0x0860:
            r1 = r18
            goto L_0x08ca
        L_0x0863:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L_0x0869:
            r3 = r32
            r1 = r33
            com.google.android.gms.internal.measurement.o r0 = r30.q()
            boolean r2 = r33.isEmpty()
            if (r2 != 0) goto L_0x08c9
            java.util.Iterator r1 = r33.iterator()
        L_0x087b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x08c9
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.measurement.o r2 = (com.google.android.gms.internal.measurement.o) r2
            com.google.android.gms.internal.measurement.o r2 = r3.a(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.measurement.g
            if (r4 != 0) goto L_0x08c1
            r4 = r0
            com.google.android.gms.internal.measurement.e r4 = (com.google.android.gms.internal.measurement.e) r4
            int r5 = r4.p()
            boolean r6 = r2 instanceof com.google.android.gms.internal.measurement.e
            if (r6 == 0) goto L_0x08bd
            com.google.android.gms.internal.measurement.e r2 = (com.google.android.gms.internal.measurement.e) r2
            java.util.Iterator r6 = r2.n()
        L_0x08a0:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x087b
            java.lang.Object r7 = r6.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r9 = r7.intValue()
            int r7 = r7.intValue()
            com.google.android.gms.internal.measurement.o r7 = r2.u(r7)
            int r9 = r9 + r5
            r4.v(r9, r7)
            goto L_0x08a0
        L_0x08bd:
            r4.v(r5, r2)
            goto L_0x087b
        L_0x08c1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Failed evaluation of arguments"
            r0.<init>(r1)
            throw r0
        L_0x08c9:
            r1 = r0
        L_0x08ca:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.e.t(java.lang.String, com.google.android.gms.internal.measurement.i3, java.util.ArrayList):com.google.android.gms.internal.measurement.o");
    }

    public final String toString() {
        return z(",");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = (com.google.android.gms.internal.measurement.o) r1.f2681o.get(java.lang.Integer.valueOf(r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.o u(int r2) {
        /*
            r1 = this;
            int r0 = r1.p()
            if (r2 >= r0) goto L_0x001e
            boolean r0 = r1.w(r2)
            if (r0 == 0) goto L_0x001b
            java.util.TreeMap r0 = r1.f2681o
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.measurement.o r2 = (com.google.android.gms.internal.measurement.o) r2
            if (r2 == 0) goto L_0x001b
            return r2
        L_0x001b:
            com.google.android.gms.internal.measurement.s r2 = com.google.android.gms.internal.measurement.o.f2850a
            return r2
        L_0x001e:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Attempting to get element outside of current array"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.e.u(int):com.google.android.gms.internal.measurement.o");
    }

    @RequiresNonNull({"elements"})
    public final void v(int i10, o oVar) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        } else if (i10 >= 0) {
            TreeMap treeMap = this.f2681o;
            Integer valueOf = Integer.valueOf(i10);
            if (oVar == null) {
                treeMap.remove(valueOf);
            } else {
                treeMap.put(valueOf, oVar);
            }
        } else {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Out of bounds index: ");
            sb.append(i10);
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    public final boolean w(int i10) {
        if (i10 >= 0) {
            TreeMap treeMap = this.f2681o;
            if (i10 <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i10));
            }
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Out of bounds index: ");
        sb.append(i10);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void y(int i10) {
        TreeMap treeMap = this.f2681o;
        int intValue = ((Integer) treeMap.lastKey()).intValue();
        if (i10 <= intValue && i10 >= 0) {
            treeMap.remove(Integer.valueOf(i10));
            if (i10 == intValue) {
                int i11 = i10 - 1;
                Integer valueOf = Integer.valueOf(i11);
                if (!treeMap.containsKey(valueOf) && i11 >= 0) {
                    treeMap.put(valueOf, o.f2850a);
                    return;
                }
                return;
            }
            while (true) {
                i10++;
                if (i10 <= ((Integer) treeMap.lastKey()).intValue()) {
                    Integer valueOf2 = Integer.valueOf(i10);
                    o oVar = (o) treeMap.get(valueOf2);
                    if (oVar != null) {
                        treeMap.put(Integer.valueOf(i10 - 1), oVar);
                        treeMap.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final String z(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f2681o.isEmpty()) {
            for (int i10 = 0; i10 < p(); i10++) {
                o u = u(i10);
                sb.append(str);
                if (!(u instanceof s) && !(u instanceof m)) {
                    sb.append(u.zzc());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final String zzc() {
        return z(",");
    }
}

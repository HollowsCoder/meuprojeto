package com.google.android.gms.internal.measurement;

import java.util.Iterator;

public final class r implements Iterable<o>, o {

    /* renamed from: o  reason: collision with root package name */
    public final String f2901o;

    public r(String str) {
        if (str != null) {
            this.f2901o = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    public final Double b() {
        double d;
        String str = this.f2901o;
        if (str.isEmpty()) {
            d = 0.0d;
        } else {
            try {
                return Double.valueOf(str);
            } catch (NumberFormatException unused) {
                d = Double.NaN;
            }
        }
        return Double.valueOf(d);
    }

    public final Boolean c() {
        return Boolean.valueOf(!this.f2901o.isEmpty());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        return this.f2901o.equals(((r) obj).f2901o);
    }

    public final int hashCode() {
        return this.f2901o.hashCode();
    }

    public final Iterator<o> i() {
        return new d(1, this);
    }

    public final Iterator<o> iterator() {
        return new q(this);
    }

    public final o q() {
        return new r(this.f2901o);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0184, code lost:
        throw new java.lang.IllegalArgumentException("Command not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0185, code lost:
        androidx.databinding.a.A("toUpperCase", 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0196, code lost:
        androidx.databinding.a.A("toUpperCase", 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01a9, code lost:
        androidx.databinding.a.A("toString", 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01b1, code lost:
        androidx.databinding.a.A(r16, 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01c6, code lost:
        androidx.databinding.a.A(r3, 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01d7, code lost:
        androidx.databinding.a.A(r5, 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01e8, code lost:
        r1 = r24;
        androidx.databinding.a.I("substring", 2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01f3, code lost:
        if (r24.size() <= 0) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01f5, code lost:
        r3 = r23;
        r0 = (int) androidx.databinding.a.P(r3.a((com.google.android.gms.internal.measurement.o) r1.get(0)).b().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x020f, code lost:
        r3 = r23;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0217, code lost:
        if (r24.size() <= 1) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0219, code lost:
        r1 = (int) androidx.databinding.a.P(r3.a((com.google.android.gms.internal.measurement.o) r1.get(1)).b().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0231, code lost:
        r1 = r6.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0235, code lost:
        r0 = java.lang.Math.min(java.lang.Math.max(r0, 0), r6.length());
        r1 = java.lang.Math.min(java.lang.Math.max(r1, 0), r6.length());
        r3 = new com.google.android.gms.internal.measurement.r(r6.substring(java.lang.Math.min(r0, r1), java.lang.Math.max(r0, r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0261, code lost:
        r3 = r23;
        r1 = r24;
        androidx.databinding.a.I("split", 2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x026d, code lost:
        if (r6.length() != 0) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0280, code lost:
        r5 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x028a, code lost:
        if (r24.size() != 0) goto L_0x0291;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x028c, code lost:
        r5.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0291, code lost:
        r4 = r3.a((com.google.android.gms.internal.measurement.o) r1.get(0)).zzc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02a4, code lost:
        if (r24.size() <= 1) goto L_0x02bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02a6, code lost:
        r7 = androidx.databinding.a.O(r3.a((com.google.android.gms.internal.measurement.o) r1.get(1)).b().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02bd, code lost:
        r7 = 2147483647L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02c4, code lost:
        if (r7 != 0) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02cd, code lost:
        r1 = r6.split(java.util.regex.Pattern.quote(r4), ((int) r7) + 1);
        r3 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02dd, code lost:
        if (r4.equals(r0) == false) goto L_0x02f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02df, code lost:
        if (r3 <= 0) goto L_0x02f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02e1, code lost:
        r4 = r1[0].equals(r0);
        r6 = r3 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02f0, code lost:
        if (r1[r6].equals(r0) != false) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02f3, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02f4, code lost:
        r6 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02f8, code lost:
        if (((long) r3) <= r7) goto L_0x02fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02fa, code lost:
        r6 = r6 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02fc, code lost:
        if (r4 >= r6) goto L_0x030b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02fe, code lost:
        r5.add(new com.google.android.gms.internal.measurement.r(r1[r4]));
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0312, code lost:
        r3 = r23;
        r1 = r24;
        androidx.databinding.a.I("slice", 2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x031e, code lost:
        if (r24.size() <= 0) goto L_0x0334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0320, code lost:
        r4 = r3.a((com.google.android.gms.internal.measurement.o) r1.get(0)).b().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0334, code lost:
        r4 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0336, code lost:
        r4 = androidx.databinding.a.P(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x033e, code lost:
        if (r4 >= 0.0d) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0340, code lost:
        r4 = java.lang.Math.max(((double) r6.length()) + r4, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x034b, code lost:
        r4 = java.lang.Math.min(r4, (double) r6.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0354, code lost:
        r0 = (int) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x035a, code lost:
        if (r24.size() <= 1) goto L_0x036f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x035c, code lost:
        r3 = r3.a((com.google.android.gms.internal.measurement.o) r1.get(1)).b().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x036f, code lost:
        r3 = (double) r6.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0374, code lost:
        r3 = androidx.databinding.a.P(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x037c, code lost:
        if (r3 >= 0.0d) goto L_0x0389;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x037e, code lost:
        r3 = java.lang.Math.max(((double) r6.length()) + r3, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0389, code lost:
        r3 = java.lang.Math.min(r3, (double) r6.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0392, code lost:
        r3 = new com.google.android.gms.internal.measurement.r(r6.substring(r0, java.lang.Math.max(0, ((int) r3) - r0) + r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03a5, code lost:
        r3 = r23;
        r1 = r24;
        androidx.databinding.a.I(r18, 1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03b4, code lost:
        if (r24.size() <= 0) goto L_0x03c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03b6, code lost:
        r17 = r3.a((com.google.android.gms.internal.measurement.o) r1.get(0)).zzc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03c4, code lost:
        r0 = java.util.regex.Pattern.compile(r17).matcher(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03d0, code lost:
        if (r0.find() == false) goto L_0x03e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03d2, code lost:
        r1 = new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf((double) r0.start()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03ef, code lost:
        r3 = r23;
        r1 = r24;
        androidx.databinding.a.I("replace", 2, r1);
        r0 = com.google.android.gms.internal.measurement.o.f2850a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03fd, code lost:
        if (r24.size() <= 0) goto L_0x041f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03ff, code lost:
        r17 = r3.a((com.google.android.gms.internal.measurement.o) r1.get(0)).zzc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0413, code lost:
        if (r24.size() <= 1) goto L_0x041f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0415, code lost:
        r0 = r3.a((com.google.android.gms.internal.measurement.o) r1.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x041f, code lost:
        r1 = r17;
        r4 = r6.indexOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0425, code lost:
        if (r4 < 0) goto L_0x05f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0429, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.i) == false) goto L_0x0450;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x042b, code lost:
        r0 = ((com.google.android.gms.internal.measurement.i) r0).a(r3, java.util.Arrays.asList(new com.google.android.gms.internal.measurement.o[]{new com.google.android.gms.internal.measurement.r(r1), new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf((double) r4)), r2}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0450, code lost:
        r5 = r6.substring(0, r4);
        r0 = r0.zzc();
        r1 = r6.substring(r1.length() + r4);
        r3 = new com.google.android.gms.internal.measurement.r(androidx.appcompat.widget.x0.f(new java.lang.StringBuilder((java.lang.String.valueOf(r5).length() + java.lang.String.valueOf(r0).length()) + java.lang.String.valueOf(r1).length()), r5, r0, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x048c, code lost:
        r3 = r23;
        r1 = r24;
        androidx.databinding.a.I("match", 1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0498, code lost:
        if (r24.size() > 0) goto L_0x049b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x049b, code lost:
        r0 = r3.a((com.google.android.gms.internal.measurement.o) r1.get(0)).zzc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04aa, code lost:
        r0 = java.util.regex.Pattern.compile(r0).matcher(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04b6, code lost:
        if (r0.find() == false) goto L_0x04d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04b8, code lost:
        r1 = new com.google.android.gms.internal.measurement.e(java.util.Arrays.asList(new com.google.android.gms.internal.measurement.o[]{new com.google.android.gms.internal.measurement.r(r0.group())}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04d6, code lost:
        r3 = r23;
        r1 = r24;
        androidx.databinding.a.I("lastIndexOf", 2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04e3, code lost:
        if (r24.size() > 0) goto L_0x04e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x04e6, code lost:
        r17 = r3.a((com.google.android.gms.internal.measurement.o) r1.get(0)).zzc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x04f4, code lost:
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04fa, code lost:
        if (r24.size() >= 2) goto L_0x04ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x04fc, code lost:
        r0 = Double.NaN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04ff, code lost:
        r0 = r3.a((com.google.android.gms.internal.measurement.o) r1.get(1)).b().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0516, code lost:
        if (java.lang.Double.isNaN(r0) == false) goto L_0x051b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0518, code lost:
        r0 = Double.POSITIVE_INFINITY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x051b, code lost:
        r0 = androidx.databinding.a.P(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x051f, code lost:
        r3 = new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf((double) r6.lastIndexOf(r4, (int) r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x052f, code lost:
        r3 = r23;
        r1 = r24;
        r4 = 0.0d;
        androidx.databinding.a.I("indexOf", 2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x053d, code lost:
        if (r24.size() > 0) goto L_0x0540;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0540, code lost:
        r17 = r3.a((com.google.android.gms.internal.measurement.o) r1.get(0)).zzc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x054f, code lost:
        r7 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0555, code lost:
        if (r24.size() >= 2) goto L_0x0558;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0558, code lost:
        r4 = r3.a((com.google.android.gms.internal.measurement.o) r1.get(1)).b().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x056b, code lost:
        r3 = new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf((double) r6.indexOf(r7, (int) androidx.databinding.a.P(r4))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0581, code lost:
        r1 = r24;
        androidx.databinding.a.A(r7, 1, r1);
        r0 = r23.a((com.google.android.gms.internal.measurement.o) r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x059e, code lost:
        if ("length".equals(r0.zzc()) == false) goto L_0x05a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x05a1, code lost:
        r0 = r0.b().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x05af, code lost:
        if (r0 != java.lang.Math.floor(r0)) goto L_0x05be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x05b1, code lost:
        r0 = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x05b2, code lost:
        if (r0 < 0) goto L_0x05be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x05b8, code lost:
        if (r0 >= r6.length()) goto L_0x05be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05c2, code lost:
        r3 = r23;
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05ca, code lost:
        if (r24.size() == 0) goto L_0x05f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x05cc, code lost:
        r0 = new java.lang.StringBuilder(r6);
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05d6, code lost:
        if (r4 >= r24.size()) goto L_0x05ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x05d8, code lost:
        r0.append(r3.a((com.google.android.gms.internal.measurement.o) r1.get(r4)).zzc());
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x05ec, code lost:
        r1 = new com.google.android.gms.internal.measurement.r(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x05f9, code lost:
        r3 = r23;
        r1 = r24;
        androidx.databinding.a.I(r19, 1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0607, code lost:
        if (r24.size() <= 0) goto L_0x0622;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0609, code lost:
        r0 = (int) androidx.databinding.a.P(r3.a((com.google.android.gms.internal.measurement.o) r1.get(0)).b().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0622, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0623, code lost:
        if (r0 < 0) goto L_0x063a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0629, code lost:
        if (r0 < r6.length()) goto L_0x062c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x062c, code lost:
        r1 = new com.google.android.gms.internal.measurement.r(java.lang.String.valueOf(r6.charAt(r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:?, code lost:
        return com.google.android.gms.internal.measurement.o.f2856h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:?, code lost:
        return new com.google.android.gms.internal.measurement.r(r6.trim());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:?, code lost:
        return new com.google.android.gms.internal.measurement.r(r6.toUpperCase(java.util.Locale.ENGLISH));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:?, code lost:
        return new com.google.android.gms.internal.measurement.r(r6.toLowerCase(java.util.Locale.ENGLISH));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:?, code lost:
        return new com.google.android.gms.internal.measurement.r(r6.toLowerCase());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:?, code lost:
        return new com.google.android.gms.internal.measurement.r(r6.toUpperCase());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:?, code lost:
        return new com.google.android.gms.internal.measurement.e(java.util.Arrays.asList(new com.google.android.gms.internal.measurement.o[]{r2}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:?, code lost:
        return new com.google.android.gms.internal.measurement.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:?, code lost:
        return new com.google.android.gms.internal.measurement.e(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:?, code lost:
        return new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:?, code lost:
        return com.google.android.gms.internal.measurement.o.f2851b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:?, code lost:
        return com.google.android.gms.internal.measurement.o.f2854f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:?, code lost:
        return com.google.android.gms.internal.measurement.o.f2855g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bc, code lost:
        r6 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0130, code lost:
        r6 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0152, code lost:
        r7 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0155, code lost:
        r7 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0163, code lost:
        r16 = "toLocaleLowerCase";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0166, code lost:
        r1 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0168, code lost:
        r0 = com.karumi.dexter.BuildConfig.FLAVOR;
        r17 = "undefined";
        r18 = "search";
        r19 = r6;
        r2 = r21;
        r20 = r16;
        r16 = "toLowerCase";
        r3 = r20;
        r6 = r2.f2901o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x017a, code lost:
        switch(r1) {
            case 0: goto L_0x05f9;
            case 1: goto L_0x05c2;
            case 2: goto L_0x0581;
            case 3: goto L_0x052f;
            case 4: goto L_0x04d6;
            case 5: goto L_0x048c;
            case 6: goto L_0x03ef;
            case 7: goto L_0x03a5;
            case 8: goto L_0x0312;
            case 9: goto L_0x0261;
            case 10: goto L_0x01e8;
            case 11: goto L_0x01d7;
            case 12: goto L_0x01c6;
            case 13: goto L_0x01b1;
            case 14: goto L_0x01a9;
            case 15: goto L_0x0196;
            case 16: goto L_0x0185;
            default: goto L_0x017d;
        };
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0158  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.o t(java.lang.String r22, com.google.android.gms.internal.measurement.i3 r23, java.util.ArrayList r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            java.lang.String r4 = "charAt"
            boolean r5 = r4.equals(r1)
            java.lang.String r6 = "trim"
            java.lang.String r7 = "concat"
            java.lang.String r8 = "indexOf"
            java.lang.String r9 = "replace"
            java.lang.String r10 = "substring"
            java.lang.String r11 = "split"
            java.lang.String r12 = "slice"
            java.lang.String r13 = "match"
            java.lang.String r14 = "lastIndexOf"
            java.lang.String r15 = "toLocaleUpperCase"
            java.lang.String r2 = "search"
            java.lang.String r3 = "toLowerCase"
            java.lang.String r0 = "toLocaleLowerCase"
            r16 = r4
            java.lang.String r4 = "toString"
            r17 = r6
            java.lang.String r6 = "hasOwnProperty"
            r18 = r15
            java.lang.String r15 = "toUpperCase"
            if (r5 != 0) goto L_0x00af
            boolean r5 = r7.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r6.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r8.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r14.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r13.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r9.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r2.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r12.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r11.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r10.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r3.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r0.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r4.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r15.equals(r1)
            if (r5 != 0) goto L_0x00af
            r5 = r18
            boolean r18 = r5.equals(r1)
            if (r18 != 0) goto L_0x00b1
            r18 = r6
            r6 = r17
            boolean r17 = r6.equals(r1)
            if (r17 == 0) goto L_0x009d
            goto L_0x00b5
        L_0x009d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "%s is not a String function"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x00af:
            r5 = r18
        L_0x00b1:
            r18 = r6
            r6 = r17
        L_0x00b5:
            int r17 = r22.hashCode()
            switch(r17) {
                case -1789698943: goto L_0x0158;
                case -1776922004: goto L_0x0148;
                case -1464939364: goto L_0x013d;
                case -1361633751: goto L_0x0133;
                case -1354795244: goto L_0x0129;
                case -1137582698: goto L_0x0120;
                case -906336856: goto L_0x0118;
                case -726908483: goto L_0x010f;
                case -467511597: goto L_0x0107;
                case -399551817: goto L_0x00fe;
                case 3568674: goto L_0x00f5;
                case 103668165: goto L_0x00ed;
                case 109526418: goto L_0x00e4;
                case 109648666: goto L_0x00db;
                case 530542161: goto L_0x00d2;
                case 1094496948: goto L_0x00c9;
                case 1943291465: goto L_0x00c0;
                default: goto L_0x00bc;
            }
        L_0x00bc:
            r6 = r16
            goto L_0x0155
        L_0x00c0:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x00bc
            r1 = 3
            goto L_0x0130
        L_0x00c9:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x00bc
            r1 = 6
            goto L_0x0130
        L_0x00d2:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x00bc
            r1 = 10
            goto L_0x0130
        L_0x00db:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x00bc
            r1 = 9
            goto L_0x0130
        L_0x00e4:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x00bc
            r1 = 8
            goto L_0x0130
        L_0x00ed:
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x00bc
            r1 = 5
            goto L_0x0130
        L_0x00f5:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00bc
            r1 = 16
            goto L_0x0130
        L_0x00fe:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x00bc
            r1 = 15
            goto L_0x0130
        L_0x0107:
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x00bc
            r1 = 4
            goto L_0x0130
        L_0x010f:
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00bc
            r1 = 11
            goto L_0x0130
        L_0x0118:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00bc
            r1 = 7
            goto L_0x0130
        L_0x0120:
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00bc
            r1 = 13
            goto L_0x0130
        L_0x0129:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x00bc
            r1 = 1
        L_0x0130:
            r6 = r16
            goto L_0x0152
        L_0x0133:
            r6 = r16
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0155
            r1 = 0
            goto L_0x0152
        L_0x013d:
            r6 = r16
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0155
            r1 = 12
            goto L_0x0152
        L_0x0148:
            r6 = r16
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0155
            r1 = 14
        L_0x0152:
            r7 = r18
            goto L_0x0163
        L_0x0155:
            r7 = r18
            goto L_0x0166
        L_0x0158:
            r6 = r16
            r7 = r18
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0166
            r1 = 2
        L_0x0163:
            r16 = r0
            goto L_0x0168
        L_0x0166:
            r1 = -1
            goto L_0x0163
        L_0x0168:
            java.lang.String r0 = ""
            java.lang.String r17 = "undefined"
            r18 = r2
            r19 = r6
            r2 = r21
            r20 = r16
            r16 = r3
            r3 = r20
            java.lang.String r6 = r2.f2901o
            switch(r1) {
                case 0: goto L_0x05f9;
                case 1: goto L_0x05c2;
                case 2: goto L_0x0581;
                case 3: goto L_0x052f;
                case 4: goto L_0x04d6;
                case 5: goto L_0x048c;
                case 6: goto L_0x03ef;
                case 7: goto L_0x03a5;
                case 8: goto L_0x0312;
                case 9: goto L_0x0261;
                case 10: goto L_0x01e8;
                case 11: goto L_0x01d7;
                case 12: goto L_0x01c6;
                case 13: goto L_0x01b1;
                case 14: goto L_0x01a9;
                case 15: goto L_0x0196;
                case 16: goto L_0x0185;
                default: goto L_0x017d;
            }
        L_0x017d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Command not supported"
            r0.<init>(r1)
            throw r0
        L_0x0185:
            r0 = 0
            r1 = r24
            androidx.databinding.a.A(r15, r0, r1)
            com.google.android.gms.internal.measurement.r r0 = new com.google.android.gms.internal.measurement.r
            java.lang.String r1 = r6.trim()
            r0.<init>(r1)
            goto L_0x063c
        L_0x0196:
            r1 = r24
            r0 = 0
            androidx.databinding.a.A(r15, r0, r1)
            com.google.android.gms.internal.measurement.r r0 = new com.google.android.gms.internal.measurement.r
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r1 = r6.toUpperCase(r1)
            r0.<init>(r1)
            goto L_0x063c
        L_0x01a9:
            r1 = r24
            r0 = 0
            androidx.databinding.a.A(r4, r0, r1)
            goto L_0x05f7
        L_0x01b1:
            r1 = r24
            r0 = r16
            r3 = 0
            androidx.databinding.a.A(r0, r3, r1)
            com.google.android.gms.internal.measurement.r r0 = new com.google.android.gms.internal.measurement.r
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r1 = r6.toLowerCase(r1)
            r0.<init>(r1)
            goto L_0x063c
        L_0x01c6:
            r1 = r24
            r0 = 0
            androidx.databinding.a.A(r3, r0, r1)
            com.google.android.gms.internal.measurement.r r0 = new com.google.android.gms.internal.measurement.r
            java.lang.String r1 = r6.toLowerCase()
            r0.<init>(r1)
            goto L_0x063c
        L_0x01d7:
            r1 = r24
            r0 = 0
            androidx.databinding.a.A(r5, r0, r1)
            com.google.android.gms.internal.measurement.r r0 = new com.google.android.gms.internal.measurement.r
            java.lang.String r1 = r6.toUpperCase()
            r0.<init>(r1)
            goto L_0x063c
        L_0x01e8:
            r1 = r24
            r0 = 2
            r3 = 0
            androidx.databinding.a.I(r10, r0, r1)
            int r0 = r24.size()
            if (r0 <= 0) goto L_0x020f
            java.lang.Object r0 = r1.get(r3)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            r3 = r23
            com.google.android.gms.internal.measurement.o r0 = r3.a(r0)
            java.lang.Double r0 = r0.b()
            double r4 = r0.doubleValue()
            double r4 = androidx.databinding.a.P(r4)
            int r0 = (int) r4
            goto L_0x0212
        L_0x020f:
            r3 = r23
            r0 = 0
        L_0x0212:
            int r4 = r24.size()
            r5 = 1
            if (r4 <= r5) goto L_0x0231
            java.lang.Object r1 = r1.get(r5)
            com.google.android.gms.internal.measurement.o r1 = (com.google.android.gms.internal.measurement.o) r1
            com.google.android.gms.internal.measurement.o r1 = r3.a(r1)
            java.lang.Double r1 = r1.b()
            double r3 = r1.doubleValue()
            double r3 = androidx.databinding.a.P(r3)
            int r1 = (int) r3
            goto L_0x0235
        L_0x0231:
            int r1 = r6.length()
        L_0x0235:
            r3 = 0
            int r0 = java.lang.Math.max(r0, r3)
            int r4 = r6.length()
            int r0 = java.lang.Math.min(r0, r4)
            int r1 = java.lang.Math.max(r1, r3)
            int r3 = r6.length()
            int r1 = java.lang.Math.min(r1, r3)
            com.google.android.gms.internal.measurement.r r3 = new com.google.android.gms.internal.measurement.r
            int r4 = java.lang.Math.min(r0, r1)
            int r0 = java.lang.Math.max(r0, r1)
            java.lang.String r0 = r6.substring(r4, r0)
            r3.<init>(r0)
            goto L_0x057e
        L_0x0261:
            r3 = r23
            r1 = r24
            r4 = 2
            androidx.databinding.a.I(r11, r4, r1)
            int r4 = r6.length()
            if (r4 != 0) goto L_0x0280
            com.google.android.gms.internal.measurement.e r0 = new com.google.android.gms.internal.measurement.e
            r1 = 1
            com.google.android.gms.internal.measurement.o[] r1 = new com.google.android.gms.internal.measurement.o[r1]
            r3 = 0
            r1[r3] = r2
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            goto L_0x063c
        L_0x0280:
            r4 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r7 = r24.size()
            if (r7 != 0) goto L_0x0291
            r5.add(r2)
            goto L_0x030b
        L_0x0291:
            java.lang.Object r4 = r1.get(r4)
            com.google.android.gms.internal.measurement.o r4 = (com.google.android.gms.internal.measurement.o) r4
            com.google.android.gms.internal.measurement.o r4 = r3.a(r4)
            java.lang.String r4 = r4.zzc()
            int r7 = r24.size()
            r8 = 1
            if (r7 <= r8) goto L_0x02bd
            java.lang.Object r1 = r1.get(r8)
            com.google.android.gms.internal.measurement.o r1 = (com.google.android.gms.internal.measurement.o) r1
            com.google.android.gms.internal.measurement.o r1 = r3.a(r1)
            java.lang.Double r1 = r1.b()
            double r7 = r1.doubleValue()
            long r7 = androidx.databinding.a.O(r7)
            goto L_0x02c0
        L_0x02bd:
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
        L_0x02c0:
            r9 = 0
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x02cd
            com.google.android.gms.internal.measurement.e r0 = new com.google.android.gms.internal.measurement.e
            r0.<init>()
            goto L_0x063c
        L_0x02cd:
            java.lang.String r1 = java.util.regex.Pattern.quote(r4)
            int r3 = (int) r7
            int r3 = r3 + 1
            java.lang.String[] r1 = r6.split(r1, r3)
            int r3 = r1.length
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x02f3
            if (r3 <= 0) goto L_0x02f3
            r4 = 0
            r4 = r1[r4]
            boolean r4 = r4.equals(r0)
            int r6 = r3 + -1
            r9 = r1[r6]
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x02f5
            goto L_0x02f4
        L_0x02f3:
            r4 = 0
        L_0x02f4:
            r6 = r3
        L_0x02f5:
            long r9 = (long) r3
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x02fc
            int r6 = r6 + -1
        L_0x02fc:
            if (r4 >= r6) goto L_0x030b
            com.google.android.gms.internal.measurement.r r0 = new com.google.android.gms.internal.measurement.r
            r3 = r1[r4]
            r0.<init>(r3)
            r5.add(r0)
            int r4 = r4 + 1
            goto L_0x02fc
        L_0x030b:
            com.google.android.gms.internal.measurement.e r0 = new com.google.android.gms.internal.measurement.e
            r0.<init>(r5)
            goto L_0x063c
        L_0x0312:
            r3 = r23
            r1 = r24
            r0 = 2
            androidx.databinding.a.I(r12, r0, r1)
            int r0 = r24.size()
            if (r0 <= 0) goto L_0x0334
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r3.a(r0)
            java.lang.Double r0 = r0.b()
            double r4 = r0.doubleValue()
            goto L_0x0336
        L_0x0334:
            r4 = 0
        L_0x0336:
            double r4 = androidx.databinding.a.P(r4)
            r7 = 0
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x034b
            int r0 = r6.length()
            double r9 = (double) r0
            double r9 = r9 + r4
            double r4 = java.lang.Math.max(r9, r7)
            goto L_0x0354
        L_0x034b:
            int r0 = r6.length()
            double r7 = (double) r0
            double r4 = java.lang.Math.min(r4, r7)
        L_0x0354:
            int r0 = (int) r4
            int r4 = r24.size()
            r5 = 1
            if (r4 <= r5) goto L_0x036f
            java.lang.Object r1 = r1.get(r5)
            com.google.android.gms.internal.measurement.o r1 = (com.google.android.gms.internal.measurement.o) r1
            com.google.android.gms.internal.measurement.o r1 = r3.a(r1)
            java.lang.Double r1 = r1.b()
            double r3 = r1.doubleValue()
            goto L_0x0374
        L_0x036f:
            int r1 = r6.length()
            double r3 = (double) r1
        L_0x0374:
            double r3 = androidx.databinding.a.P(r3)
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0389
            int r1 = r6.length()
            double r9 = (double) r1
            double r9 = r9 + r3
            double r3 = java.lang.Math.max(r9, r7)
            goto L_0x0392
        L_0x0389:
            int r1 = r6.length()
            double r7 = (double) r1
            double r3 = java.lang.Math.min(r3, r7)
        L_0x0392:
            int r1 = (int) r3
            int r1 = r1 - r0
            r3 = 0
            int r1 = java.lang.Math.max(r3, r1)
            com.google.android.gms.internal.measurement.r r3 = new com.google.android.gms.internal.measurement.r
            int r1 = r1 + r0
            java.lang.String r0 = r6.substring(r0, r1)
            r3.<init>(r0)
            goto L_0x057e
        L_0x03a5:
            r3 = r23
            r1 = r24
            r0 = r18
            r4 = 1
            r5 = 0
            androidx.databinding.a.I(r0, r4, r1)
            int r0 = r24.size()
            if (r0 <= 0) goto L_0x03c4
            java.lang.Object r0 = r1.get(r5)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r3.a(r0)
            java.lang.String r17 = r0.zzc()
        L_0x03c4:
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r17)
            java.util.regex.Matcher r0 = r0.matcher(r6)
            boolean r1 = r0.find()
            if (r1 == 0) goto L_0x03e2
            com.google.android.gms.internal.measurement.h r1 = new com.google.android.gms.internal.measurement.h
            int r0 = r0.start()
            double r3 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            r1.<init>(r0)
            goto L_0x05f5
        L_0x03e2:
            com.google.android.gms.internal.measurement.h r0 = new com.google.android.gms.internal.measurement.h
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r0.<init>(r1)
            goto L_0x063c
        L_0x03ef:
            r3 = r23
            r1 = r24
            r0 = 2
            androidx.databinding.a.I(r9, r0, r1)
            com.google.android.gms.internal.measurement.s r0 = com.google.android.gms.internal.measurement.o.f2850a
            int r4 = r24.size()
            if (r4 <= 0) goto L_0x041f
            r4 = 0
            java.lang.Object r4 = r1.get(r4)
            com.google.android.gms.internal.measurement.o r4 = (com.google.android.gms.internal.measurement.o) r4
            com.google.android.gms.internal.measurement.o r4 = r3.a(r4)
            java.lang.String r17 = r4.zzc()
            int r4 = r24.size()
            r5 = 1
            if (r4 <= r5) goto L_0x041f
            java.lang.Object r0 = r1.get(r5)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r3.a(r0)
        L_0x041f:
            r1 = r17
            int r4 = r6.indexOf(r1)
            if (r4 < 0) goto L_0x05f7
            boolean r5 = r0 instanceof com.google.android.gms.internal.measurement.i
            if (r5 == 0) goto L_0x0450
            com.google.android.gms.internal.measurement.i r0 = (com.google.android.gms.internal.measurement.i) r0
            r5 = 3
            com.google.android.gms.internal.measurement.o[] r5 = new com.google.android.gms.internal.measurement.o[r5]
            com.google.android.gms.internal.measurement.r r7 = new com.google.android.gms.internal.measurement.r
            r7.<init>(r1)
            r8 = 0
            r5[r8] = r7
            com.google.android.gms.internal.measurement.h r7 = new com.google.android.gms.internal.measurement.h
            double r8 = (double) r4
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            r7.<init>(r8)
            r8 = 1
            r5[r8] = r7
            r7 = 2
            r5[r7] = r2
            java.util.List r5 = java.util.Arrays.asList(r5)
            com.google.android.gms.internal.measurement.o r0 = r0.a(r3, r5)
        L_0x0450:
            com.google.android.gms.internal.measurement.r r3 = new com.google.android.gms.internal.measurement.r
            r5 = 0
            java.lang.String r5 = r6.substring(r5, r4)
            java.lang.String r0 = r0.zzc()
            int r1 = r1.length()
            int r1 = r1 + r4
            java.lang.String r1 = r6.substring(r1)
            java.lang.String r4 = java.lang.String.valueOf(r5)
            int r4 = r4.length()
            java.lang.String r6 = java.lang.String.valueOf(r0)
            int r6 = r6.length()
            java.lang.String r7 = java.lang.String.valueOf(r1)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r4 = r4 + r6
            int r4 = r4 + r7
            r8.<init>(r4)
            java.lang.String r0 = androidx.appcompat.widget.x0.f(r8, r5, r0, r1)
            r3.<init>(r0)
            goto L_0x057e
        L_0x048c:
            r3 = r23
            r1 = r24
            r4 = 1
            androidx.databinding.a.I(r13, r4, r1)
            int r4 = r24.size()
            if (r4 > 0) goto L_0x049b
            goto L_0x04aa
        L_0x049b:
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r3.a(r0)
            java.lang.String r0 = r0.zzc()
        L_0x04aa:
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r0 = r0.matcher(r6)
            boolean r1 = r0.find()
            if (r1 == 0) goto L_0x04d2
            com.google.android.gms.internal.measurement.e r1 = new com.google.android.gms.internal.measurement.e
            r3 = 1
            com.google.android.gms.internal.measurement.o[] r3 = new com.google.android.gms.internal.measurement.o[r3]
            com.google.android.gms.internal.measurement.r r4 = new com.google.android.gms.internal.measurement.r
            java.lang.String r0 = r0.group()
            r4.<init>(r0)
            r0 = 0
            r3[r0] = r4
            java.util.List r0 = java.util.Arrays.asList(r3)
            r1.<init>(r0)
            goto L_0x05f5
        L_0x04d2:
            com.google.android.gms.internal.measurement.m r0 = com.google.android.gms.internal.measurement.o.f2851b
            goto L_0x063c
        L_0x04d6:
            r3 = r23
            r1 = r24
            r0 = 2
            r4 = 0
            androidx.databinding.a.I(r14, r0, r1)
            int r5 = r24.size()
            if (r5 > 0) goto L_0x04e6
            goto L_0x04f4
        L_0x04e6:
            java.lang.Object r4 = r1.get(r4)
            com.google.android.gms.internal.measurement.o r4 = (com.google.android.gms.internal.measurement.o) r4
            com.google.android.gms.internal.measurement.o r4 = r3.a(r4)
            java.lang.String r17 = r4.zzc()
        L_0x04f4:
            r4 = r17
            int r5 = r24.size()
            if (r5 >= r0) goto L_0x04ff
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            goto L_0x0512
        L_0x04ff:
            r0 = 1
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r3.a(r0)
            java.lang.Double r0 = r0.b()
            double r0 = r0.doubleValue()
        L_0x0512:
            boolean r3 = java.lang.Double.isNaN(r0)
            if (r3 == 0) goto L_0x051b
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L_0x051f
        L_0x051b:
            double r0 = androidx.databinding.a.P(r0)
        L_0x051f:
            com.google.android.gms.internal.measurement.h r3 = new com.google.android.gms.internal.measurement.h
            int r0 = (int) r0
            int r0 = r6.lastIndexOf(r4, r0)
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.<init>(r0)
            goto L_0x057e
        L_0x052f:
            r3 = r23
            r1 = r24
            r0 = 2
            r4 = 0
            androidx.databinding.a.I(r8, r0, r1)
            int r7 = r24.size()
            if (r7 > 0) goto L_0x0540
            goto L_0x054f
        L_0x0540:
            r7 = 0
            java.lang.Object r7 = r1.get(r7)
            com.google.android.gms.internal.measurement.o r7 = (com.google.android.gms.internal.measurement.o) r7
            com.google.android.gms.internal.measurement.o r7 = r3.a(r7)
            java.lang.String r17 = r7.zzc()
        L_0x054f:
            r7 = r17
            int r8 = r24.size()
            if (r8 >= r0) goto L_0x0558
            goto L_0x056b
        L_0x0558:
            r0 = 1
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r3.a(r0)
            java.lang.Double r0 = r0.b()
            double r4 = r0.doubleValue()
        L_0x056b:
            double r0 = androidx.databinding.a.P(r4)
            com.google.android.gms.internal.measurement.h r3 = new com.google.android.gms.internal.measurement.h
            int r0 = (int) r0
            int r0 = r6.indexOf(r7, r0)
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.<init>(r0)
        L_0x057e:
            r0 = r3
            goto L_0x063c
        L_0x0581:
            r3 = r23
            r1 = r24
            r0 = 1
            androidx.databinding.a.A(r7, r0, r1)
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r3.a(r0)
            java.lang.String r1 = r0.zzc()
            java.lang.String r3 = "length"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x05a1
            goto L_0x05ba
        L_0x05a1:
            java.lang.Double r0 = r0.b()
            double r0 = r0.doubleValue()
            double r3 = java.lang.Math.floor(r0)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x05be
            int r0 = (int) r0
            if (r0 < 0) goto L_0x05be
            int r1 = r6.length()
            if (r0 >= r1) goto L_0x05be
        L_0x05ba:
            com.google.android.gms.internal.measurement.f r0 = com.google.android.gms.internal.measurement.o.f2854f
            goto L_0x063c
        L_0x05be:
            com.google.android.gms.internal.measurement.f r0 = com.google.android.gms.internal.measurement.o.f2855g
            goto L_0x063c
        L_0x05c2:
            r3 = r23
            r1 = r24
            int r0 = r24.size()
            if (r0 == 0) goto L_0x05f7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r6)
            r4 = 0
        L_0x05d2:
            int r5 = r24.size()
            if (r4 >= r5) goto L_0x05ec
            java.lang.Object r5 = r1.get(r4)
            com.google.android.gms.internal.measurement.o r5 = (com.google.android.gms.internal.measurement.o) r5
            com.google.android.gms.internal.measurement.o r5 = r3.a(r5)
            java.lang.String r5 = r5.zzc()
            r0.append(r5)
            int r4 = r4 + 1
            goto L_0x05d2
        L_0x05ec:
            com.google.android.gms.internal.measurement.r r1 = new com.google.android.gms.internal.measurement.r
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
        L_0x05f5:
            r0 = r1
            goto L_0x063c
        L_0x05f7:
            r0 = r2
            goto L_0x063c
        L_0x05f9:
            r3 = r23
            r1 = r24
            r0 = 1
            r4 = r19
            androidx.databinding.a.I(r4, r0, r1)
            int r0 = r24.size()
            if (r0 <= 0) goto L_0x0622
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r3.a(r0)
            java.lang.Double r0 = r0.b()
            double r0 = r0.doubleValue()
            double r0 = androidx.databinding.a.P(r0)
            int r0 = (int) r0
            goto L_0x0623
        L_0x0622:
            r0 = 0
        L_0x0623:
            if (r0 < 0) goto L_0x063a
            int r1 = r6.length()
            if (r0 < r1) goto L_0x062c
            goto L_0x063a
        L_0x062c:
            com.google.android.gms.internal.measurement.r r1 = new com.google.android.gms.internal.measurement.r
            char r0 = r6.charAt(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r0)
            goto L_0x05f5
        L_0x063a:
            com.google.android.gms.internal.measurement.r r0 = com.google.android.gms.internal.measurement.o.f2856h
        L_0x063c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.r.t(java.lang.String, com.google.android.gms.internal.measurement.i3, java.util.ArrayList):com.google.android.gms.internal.measurement.o");
    }

    public final String toString() {
        String str = this.f2901o;
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('\"');
        sb.append(str);
        sb.append('\"');
        return sb.toString();
    }

    public final String zzc() {
        return this.f2901o;
    }
}

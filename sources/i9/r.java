package i9;

import com.karumi.dexter.BuildConfig;
import f9.l;
import j9.c;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import o8.e;
import w9.f;
import z8.g;

public final class r {

    /* renamed from: k  reason: collision with root package name */
    public static final char[] f6302k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final b l = new b();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6303a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6304b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6305c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6306e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6307f;

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f6308g;

    /* renamed from: h  reason: collision with root package name */
    public final List<String> f6309h;

    /* renamed from: i  reason: collision with root package name */
    public final String f6310i;

    /* renamed from: j  reason: collision with root package name */
    public final String f6311j;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f6312a;

        /* renamed from: b  reason: collision with root package name */
        public String f6313b = BuildConfig.FLAVOR;

        /* renamed from: c  reason: collision with root package name */
        public String f6314c = BuildConfig.FLAVOR;
        public String d;

        /* renamed from: e  reason: collision with root package name */
        public int f6315e = -1;

        /* renamed from: f  reason: collision with root package name */
        public final ArrayList f6316f;

        /* renamed from: g  reason: collision with root package name */
        public ArrayList f6317g;

        /* renamed from: h  reason: collision with root package name */
        public String f6318h;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f6316f = arrayList;
            arrayList.add(BuildConfig.FLAVOR);
        }

        public final r a() {
            int i10;
            ArrayList arrayList;
            String str;
            String str2;
            String str3 = this.f6312a;
            if (str3 != null) {
                b bVar = r.l;
                b bVar2 = bVar;
                String d10 = b.d(bVar2, this.f6313b, 0, 0, false, 7);
                String d11 = b.d(bVar2, this.f6314c, 0, 0, false, 7);
                String str4 = this.d;
                if (str4 != null) {
                    int i11 = this.f6315e;
                    if (i11 != -1) {
                        i10 = i11;
                    } else {
                        String str5 = this.f6312a;
                        g.c(str5);
                        bVar.getClass();
                        i10 = b.b(str5);
                    }
                    ArrayList arrayList2 = this.f6316f;
                    ArrayList arrayList3 = new ArrayList(e.u(arrayList2));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(b.d(r.l, (String) it.next(), 0, 0, false, 7));
                    }
                    ArrayList<String> arrayList4 = this.f6317g;
                    if (arrayList4 != null) {
                        arrayList = new ArrayList(e.u(arrayList4));
                        for (String str6 : arrayList4) {
                            if (str6 != null) {
                                str2 = b.d(r.l, str6, 0, 0, true, 3);
                            } else {
                                str2 = null;
                            }
                            arrayList.add(str2);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str7 = this.f6318h;
                    if (str7 != null) {
                        str = b.d(r.l, str7, 0, 0, false, 7);
                    } else {
                        str = null;
                    }
                    return new r(str3, d10, d11, str4, i10, arrayList3, arrayList, str, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final void b(String str) {
            this.f6317g = str != null ? b.e(b.a(r.l, str, 0, 0, " \"'<>#", true, false, true, false, (Charset) null, 211)) : null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:108:0x0270, code lost:
            if (65535 < r1) goto L_0x027d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x007d, code lost:
            if (r9 == ':') goto L_0x0081;
         */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x0229  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x02b1  */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x02d9  */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x02db  */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x02de  */
        /* JADX WARNING: Removed duplicated region for block: B:129:0x02e8  */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x02ef  */
        /* JADX WARNING: Removed duplicated region for block: B:138:0x0336  */
        /* JADX WARNING: Removed duplicated region for block: B:190:0x045e  */
        /* JADX WARNING: Removed duplicated region for block: B:191:0x0474  */
        /* JADX WARNING: Removed duplicated region for block: B:215:0x0220 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:220:0x0424 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:224:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0085  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00f3  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0134  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x0139  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x0200  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(i9.r r29, java.lang.String r30) {
            /*
                r28 = this;
                r0 = r28
                r1 = r29
                r12 = r30
                java.lang.String r2 = "input"
                z8.g.f(r12, r2)
                byte[] r2 = j9.c.f6602a
                int r2 = r30.length()
                r3 = 0
                int r2 = j9.c.m(r12, r3, r2)
                int r4 = r30.length()
                int r13 = j9.c.n(r12, r2, r4)
                int r4 = r13 - r2
                r5 = 2
                r6 = 58
                r14 = -1
                r7 = 1
                if (r4 >= r5) goto L_0x0029
                goto L_0x0080
            L_0x0029:
                char r4 = r12.charAt(r2)
                r8 = 97
                int r9 = z8.g.h(r4, r8)
                r10 = 90
                r11 = 122(0x7a, float:1.71E-43)
                r15 = 65
                if (r9 < 0) goto L_0x0041
                int r9 = z8.g.h(r4, r11)
                if (r9 <= 0) goto L_0x004e
            L_0x0041:
                int r9 = z8.g.h(r4, r15)
                if (r9 < 0) goto L_0x0080
                int r4 = z8.g.h(r4, r10)
                if (r4 <= 0) goto L_0x004e
                goto L_0x0080
            L_0x004e:
                r4 = r2
            L_0x004f:
                int r4 = r4 + r7
                if (r4 >= r13) goto L_0x0080
                char r9 = r12.charAt(r4)
                if (r8 <= r9) goto L_0x0059
                goto L_0x005c
            L_0x0059:
                if (r11 < r9) goto L_0x005c
                goto L_0x007a
            L_0x005c:
                if (r15 <= r9) goto L_0x005f
                goto L_0x0062
            L_0x005f:
                if (r10 < r9) goto L_0x0062
                goto L_0x007a
            L_0x0062:
                r8 = 48
                if (r8 <= r9) goto L_0x0067
                goto L_0x006c
            L_0x0067:
                r8 = 57
                if (r8 < r9) goto L_0x006c
                goto L_0x007a
            L_0x006c:
                r8 = 43
                if (r9 != r8) goto L_0x0071
                goto L_0x007a
            L_0x0071:
                r8 = 45
                if (r9 != r8) goto L_0x0076
                goto L_0x007a
            L_0x0076:
                r8 = 46
                if (r9 != r8) goto L_0x007d
            L_0x007a:
                r8 = 97
                goto L_0x004f
            L_0x007d:
                if (r9 != r6) goto L_0x0080
                goto L_0x0081
            L_0x0080:
                r4 = r14
            L_0x0081:
                java.lang.String r15 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                if (r4 == r14) goto L_0x00c3
                java.lang.String r6 = "https:"
                boolean r6 = f9.h.Z(r2, r12, r6, r7)
                if (r6 == 0) goto L_0x0094
                java.lang.String r4 = "https"
                r0.f6312a = r4
                int r2 = r2 + 6
                goto L_0x00c9
            L_0x0094:
                java.lang.String r6 = "http:"
                boolean r6 = f9.h.Z(r2, r12, r6, r7)
                if (r6 == 0) goto L_0x00a3
                java.lang.String r4 = "http"
                r0.f6312a = r4
                int r2 = r2 + 5
                goto L_0x00c9
            L_0x00a3:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r5 = "Expected URL scheme 'http' or 'https' but was '"
                r2.<init>(r5)
                java.lang.String r3 = r12.substring(r3, r4)
                z8.g.e(r3, r15)
                r2.append(r3)
                java.lang.String r3 = "'"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x00c3:
                if (r1 == 0) goto L_0x049a
                java.lang.String r4 = r1.f6304b
                r0.f6312a = r4
            L_0x00c9:
                r4 = r2
            L_0x00ca:
                r6 = 92
                r8 = 47
                if (r4 >= r13) goto L_0x00dd
                char r9 = r12.charAt(r4)
                if (r9 == r6) goto L_0x00d8
                if (r9 != r8) goto L_0x00dd
            L_0x00d8:
                int r3 = r3 + 1
                int r4 = r4 + 1
                goto L_0x00ca
            L_0x00dd:
                java.util.ArrayList r11 = r0.f6316f
                r4 = 63
                r9 = 35
                if (r3 >= r5) goto L_0x0124
                if (r1 == 0) goto L_0x0124
                java.lang.String r5 = r0.f6312a
                java.lang.String r10 = r1.f6304b
                boolean r5 = z8.g.a(r10, r5)
                r5 = r5 ^ r7
                if (r5 == 0) goto L_0x00f3
                goto L_0x0124
            L_0x00f3:
                java.lang.String r3 = r29.e()
                r0.f6313b = r3
                java.lang.String r3 = r29.a()
                r0.f6314c = r3
                java.lang.String r3 = r1.f6306e
                r0.d = r3
                int r3 = r1.f6307f
                r0.f6315e = r3
                r11.clear()
                java.util.ArrayList r3 = r29.c()
                r11.addAll(r3)
                if (r2 == r13) goto L_0x0119
                char r3 = r12.charAt(r2)
                if (r3 != r9) goto L_0x0120
            L_0x0119:
                java.lang.String r1 = r29.d()
                r0.b(r1)
            L_0x0120:
                r29 = r11
                goto L_0x02e0
            L_0x0124:
                int r2 = r2 + r3
                r1 = 0
                r3 = 0
                r16 = r1
                r10 = r2
                r17 = r3
            L_0x012c:
                java.lang.String r1 = "@/\\?#"
                int r7 = j9.c.f(r12, r1, r10, r13)
                if (r7 == r13) goto L_0x0139
                char r1 = r12.charAt(r7)
                goto L_0x013a
            L_0x0139:
                r1 = r14
            L_0x013a:
                if (r1 == r14) goto L_0x01fa
                if (r1 == r9) goto L_0x01fa
                if (r1 == r8) goto L_0x01fa
                if (r1 == r6) goto L_0x01fa
                if (r1 == r4) goto L_0x01fa
                r2 = 64
                if (r1 == r2) goto L_0x014c
                r29 = r11
                goto L_0x01ed
            L_0x014c:
                java.lang.String r9 = "%40"
                if (r16 != 0) goto L_0x01b7
                r1 = 58
                int r8 = j9.c.e(r12, r1, r10, r7)
                i9.r$b r18 = i9.r.l
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r6 = 1
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 240(0xf0, float:3.36E-43)
                r1 = r18
                r2 = r30
                r3 = r10
                r4 = r8
                r10 = r7
                r7 = r19
                r14 = r8
                r8 = r20
                r24 = r9
                r9 = r21
                r25 = r10
                r10 = r22
                r29 = r11
                r11 = r23
                java.lang.String r1 = i9.r.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r17 == 0) goto L_0x0190
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r0.f6313b
                r4 = r24
                java.lang.String r1 = androidx.appcompat.widget.x0.f(r2, r3, r4, r1)
            L_0x0190:
                r0.f6313b = r1
                r11 = r25
                if (r14 == r11) goto L_0x01b2
                int r3 = r14 + 1
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r14 = 240(0xf0, float:3.36E-43)
                r1 = r18
                r2 = r30
                r4 = r11
                r25 = r11
                r11 = r14
                java.lang.String r1 = i9.r.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r0.f6314c = r1
                r16 = 1
                goto L_0x01b4
            L_0x01b2:
                r25 = r11
            L_0x01b4:
                r17 = 1
                goto L_0x01e9
            L_0x01b7:
                r25 = r7
                r4 = r9
                r29 = r11
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r1 = r0.f6314c
                r14.append(r1)
                r14.append(r4)
                i9.r$b r1 = i9.r.l
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r11 = 0
                r18 = 240(0xf0, float:3.36E-43)
                r2 = r30
                r3 = r10
                r4 = r25
                r10 = r11
                r11 = r18
                java.lang.String r1 = i9.r.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r14.append(r1)
                java.lang.String r1 = r14.toString()
                r0.f6314c = r1
            L_0x01e9:
                r14 = r25
                int r10 = r14 + 1
            L_0x01ed:
                r4 = 63
                r8 = 47
                r6 = 92
                r9 = 35
                r11 = r29
                r14 = -1
                goto L_0x012c
            L_0x01fa:
                r14 = r7
                r29 = r11
                r7 = r10
            L_0x01fe:
                if (r7 >= r14) goto L_0x0220
                char r1 = r12.charAt(r7)
                r2 = 58
                if (r1 == r2) goto L_0x021c
                r2 = 91
                if (r1 == r2) goto L_0x020d
                goto L_0x0219
            L_0x020d:
                int r7 = r7 + 1
                if (r7 >= r14) goto L_0x0219
                char r1 = r12.charAt(r7)
                r2 = 93
                if (r1 != r2) goto L_0x020d
            L_0x0219:
                int r7 = r7 + 1
                goto L_0x01fe
            L_0x021c:
                r1 = 1
                r9 = r1
                r11 = r7
                goto L_0x0223
            L_0x0220:
                r1 = 1
                r9 = r1
                r11 = r14
            L_0x0223:
                int r8 = r11 + 1
                r7 = 34
                if (r8 >= r14) goto L_0x02b1
                i9.r$b r7 = i9.r.l
                r5 = 0
                r6 = 4
                r1 = r7
                r2 = r30
                r3 = r10
                r4 = r11
                java.lang.String r1 = i9.r.b.d(r1, r2, r3, r4, r5, r6)
                java.lang.String r1 = s6.a.J(r1)
                r0.d = r1
                java.lang.String r5 = ""
                r6 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 248(0xf8, float:3.48E-43)
                r1 = r7
                r2 = r30
                r3 = r8
                r4 = r14
                r7 = r16
                r26 = r8
                r8 = r17
                r27 = r9
                r9 = r18
                r16 = r10
                r10 = r19
                r17 = r11
                r11 = r20
                java.lang.String r1 = i9.r.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ NumberFormatException -> 0x0273 }
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0273 }
                r8 = r27
                if (r8 <= r1) goto L_0x026d
                goto L_0x027d
            L_0x026d:
                r2 = 65535(0xffff, float:9.1834E-41)
                if (r2 < r1) goto L_0x027d
                goto L_0x027e
            L_0x0273:
                r8 = r27
                goto L_0x027d
            L_0x0276:
                r26 = r8
                r8 = r9
                r16 = r10
                r17 = r11
            L_0x027d:
                r1 = -1
            L_0x027e:
                r0.f6315e = r1
                r2 = -1
                if (r1 == r2) goto L_0x0285
                r9 = r8
                goto L_0x0286
            L_0x0285:
                r9 = 0
            L_0x0286:
                if (r9 == 0) goto L_0x028b
                r7 = 34
                goto L_0x02d5
            L_0x028b:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Invalid URL port: \""
                r1.<init>(r2)
                r11 = r26
                java.lang.String r2 = r12.substring(r11, r14)
                z8.g.e(r2, r15)
                r1.append(r2)
                r2 = 34
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L_0x02b1:
                r8 = r9
                r16 = r10
                r17 = r11
                i9.r$b r1 = i9.r.l
                r5 = 0
                r6 = 4
                r2 = r30
                r3 = r16
                r4 = r17
                java.lang.String r1 = i9.r.b.d(r1, r2, r3, r4, r5, r6)
                java.lang.String r1 = s6.a.J(r1)
                r0.d = r1
                java.lang.String r1 = r0.f6312a
                z8.g.c(r1)
                int r1 = i9.r.b.b(r1)
                r0.f6315e = r1
            L_0x02d5:
                java.lang.String r1 = r0.d
                if (r1 == 0) goto L_0x02db
                r9 = r8
                goto L_0x02dc
            L_0x02db:
                r9 = 0
            L_0x02dc:
                if (r9 == 0) goto L_0x0474
                r7 = r8
                r2 = r14
            L_0x02e0:
                java.lang.String r1 = "?#"
                int r1 = j9.c.f(r12, r1, r2, r13)
                if (r2 != r1) goto L_0x02ef
                r15 = r0
                r14 = r1
                r1 = r12
                r0 = r13
                r13 = r1
                goto L_0x0428
            L_0x02ef:
                char r3 = r12.charAt(r2)
                java.lang.String r4 = ""
                r5 = 47
                if (r3 == r5) goto L_0x0317
                r5 = 92
                if (r3 != r5) goto L_0x02fe
                goto L_0x0317
            L_0x02fe:
                int r3 = r29.size()
                int r3 = r3 - r7
                r5 = r29
                r5.set(r3, r4)
                r17 = r0
                r14 = r1
                r15 = r14
                r11 = r5
                r16 = r7
                r1 = r12
                r10 = r1
                r18 = r13
                r13 = r10
                r12 = r4
                r4 = r2
                goto L_0x0334
            L_0x0317:
                r5 = r29
                r5.clear()
                r5.add(r4)
                r8 = r0
                r3 = r1
                r6 = r4
                r11 = r5
                r4 = r3
                r5 = r2
                r1 = r12
                r2 = r1
            L_0x0327:
                int r5 = r5 + r7
                r14 = r3
                r15 = r4
                r4 = r5
                r16 = r7
                r17 = r8
                r10 = r12
                r18 = r13
                r13 = r2
                r12 = r6
            L_0x0334:
                if (r4 >= r15) goto L_0x0424
                java.lang.String r2 = "/\\"
                int r9 = j9.c.f(r10, r2, r4, r15)
                if (r9 >= r15) goto L_0x0341
                r19 = r16
                goto L_0x0344
            L_0x0341:
                r2 = 0
                r19 = r2
            L_0x0344:
                r7 = 1
                i9.r$b r2 = i9.r.l
                java.lang.String r6 = " \"<>^`{}|/\\?#"
                r8 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 240(0xf0, float:3.36E-43)
                r3 = r10
                r5 = r9
                r24 = r9
                r9 = r20
                r20 = r10
                r10 = r21
                r29 = r11
                r11 = r22
                r0 = r12
                r12 = r23
                java.lang.String r2 = i9.r.b.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                java.lang.String r3 = "."
                boolean r3 = z8.g.a(r2, r3)
                if (r3 != 0) goto L_0x037a
                java.lang.String r3 = "%2e"
                boolean r3 = f9.h.V(r2, r3)
                if (r3 == 0) goto L_0x0378
                goto L_0x037a
            L_0x0378:
                r3 = 0
                goto L_0x037c
            L_0x037a:
                r3 = r16
            L_0x037c:
                if (r3 == 0) goto L_0x0382
                r5 = r29
                goto L_0x0405
            L_0x0382:
                java.lang.String r3 = ".."
                boolean r3 = z8.g.a(r2, r3)
                if (r3 != 0) goto L_0x03a5
                java.lang.String r3 = "%2e."
                boolean r3 = f9.h.V(r2, r3)
                if (r3 != 0) goto L_0x03a5
                java.lang.String r3 = ".%2e"
                boolean r3 = f9.h.V(r2, r3)
                if (r3 != 0) goto L_0x03a5
                java.lang.String r3 = "%2e%2e"
                boolean r3 = f9.h.V(r2, r3)
                if (r3 == 0) goto L_0x03a3
                goto L_0x03a5
            L_0x03a3:
                r3 = 0
                goto L_0x03a7
            L_0x03a5:
                r3 = r16
            L_0x03a7:
                if (r3 == 0) goto L_0x03d9
                int r2 = r29.size()
                int r2 = r2 - r16
                r5 = r29
                java.lang.Object r2 = r5.remove(r2)
                java.lang.String r2 = (java.lang.String) r2
                int r2 = r2.length()
                if (r2 != 0) goto L_0x03c0
                r2 = r16
                goto L_0x03c1
            L_0x03c0:
                r2 = 0
            L_0x03c1:
                if (r2 == 0) goto L_0x03d5
                boolean r2 = r5.isEmpty()
                r2 = r2 ^ r16
                if (r2 == 0) goto L_0x03d5
                int r2 = r5.size()
                int r2 = r2 - r16
                r5.set(r2, r0)
                goto L_0x0405
            L_0x03d5:
                r5.add(r0)
                goto L_0x0405
            L_0x03d9:
                r5 = r29
                int r3 = r5.size()
                int r3 = r3 - r16
                java.lang.Object r3 = r5.get(r3)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                int r3 = r3.length()
                if (r3 != 0) goto L_0x03f0
                r3 = r16
                goto L_0x03f1
            L_0x03f0:
                r3 = 0
            L_0x03f1:
                if (r3 == 0) goto L_0x03fd
                int r3 = r5.size()
                int r3 = r3 - r16
                r5.set(r3, r2)
                goto L_0x0400
            L_0x03fd:
                r5.add(r2)
            L_0x0400:
                if (r19 == 0) goto L_0x0405
                r5.add(r0)
            L_0x0405:
                if (r19 == 0) goto L_0x041a
                r6 = r0
                r11 = r5
                r2 = r13
                r3 = r14
                r4 = r15
                r7 = r16
                r8 = r17
                r13 = r18
                r12 = r20
                r5 = r24
                r0 = r28
                goto L_0x0327
            L_0x041a:
                r12 = r0
                r11 = r5
                r10 = r20
                r4 = r24
                r0 = r28
                goto L_0x0334
            L_0x0424:
                r15 = r17
                r0 = r18
            L_0x0428:
                if (r14 >= r0) goto L_0x0454
                char r2 = r1.charAt(r14)
                r3 = 63
                if (r2 != r3) goto L_0x0454
                r2 = 35
                int r16 = j9.c.e(r1, r2, r14, r0)
                i9.r$b r2 = i9.r.l
                int r4 = r14 + 1
                java.lang.String r6 = " \"'<>#"
                r7 = 1
                r8 = 0
                r9 = 1
                r10 = 0
                r11 = 0
                r12 = 208(0xd0, float:2.91E-43)
                r3 = r13
                r5 = r16
                java.lang.String r2 = i9.r.b.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                java.util.ArrayList r2 = i9.r.b.e(r2)
                r15.f6317g = r2
                r14 = r16
            L_0x0454:
                if (r14 >= r0) goto L_0x0473
                char r1 = r1.charAt(r14)
                r2 = 35
                if (r1 != r2) goto L_0x0473
                i9.r$b r2 = i9.r.l
                int r4 = r14 + 1
                java.lang.String r6 = ""
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 1
                r11 = 0
                r12 = 176(0xb0, float:2.47E-43)
                r3 = r13
                r5 = r0
                java.lang.String r0 = i9.r.b.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r15.f6318h = r0
            L_0x0473:
                return
            L_0x0474:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Invalid URL host: \""
                r0.<init>(r1)
                r2 = r16
                r14 = r17
                java.lang.String r1 = r12.substring(r2, r14)
                z8.g.e(r1, r15)
                r0.append(r1)
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L_0x049a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expected URL scheme 'http' or 'https' but no colon was found"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: i9.r.a.c(i9.r, java.lang.String):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
            if (r1 != false) goto L_0x0032;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x009c, code lost:
            if (r1 != i9.r.b.b(r3)) goto L_0x009e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.f6312a
                if (r1 == 0) goto L_0x000f
                r0.append(r1)
                java.lang.String r1 = "://"
                goto L_0x0011
            L_0x000f:
                java.lang.String r1 = "//"
            L_0x0011:
                r0.append(r1)
                java.lang.String r1 = r6.f6313b
                int r1 = r1.length()
                r2 = 0
                r3 = 1
                if (r1 <= 0) goto L_0x0020
                r1 = r3
                goto L_0x0021
            L_0x0020:
                r1 = r2
            L_0x0021:
                r4 = 58
                if (r1 != 0) goto L_0x0032
                java.lang.String r1 = r6.f6314c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x002f
                r1 = r3
                goto L_0x0030
            L_0x002f:
                r1 = r2
            L_0x0030:
                if (r1 == 0) goto L_0x0051
            L_0x0032:
                java.lang.String r1 = r6.f6313b
                r0.append(r1)
                java.lang.String r1 = r6.f6314c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0041
                r1 = r3
                goto L_0x0042
            L_0x0041:
                r1 = r2
            L_0x0042:
                if (r1 == 0) goto L_0x004c
                r0.append(r4)
                java.lang.String r1 = r6.f6314c
                r0.append(r1)
            L_0x004c:
                r1 = 64
                r0.append(r1)
            L_0x0051:
                java.lang.String r1 = r6.d
                if (r1 == 0) goto L_0x0075
                r5 = 2
                int r1 = f9.l.g0(r1, r4, r2, r2, r5)
                if (r1 < 0) goto L_0x005d
                goto L_0x005e
            L_0x005d:
                r3 = r2
            L_0x005e:
                if (r3 == 0) goto L_0x0070
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L_0x0075
            L_0x0070:
                java.lang.String r1 = r6.d
                r0.append(r1)
            L_0x0075:
                int r1 = r6.f6315e
                r3 = -1
                if (r1 != r3) goto L_0x007e
                java.lang.String r5 = r6.f6312a
                if (r5 == 0) goto L_0x00a4
            L_0x007e:
                if (r1 == r3) goto L_0x0081
                goto L_0x008f
            L_0x0081:
                i9.r$b r1 = i9.r.l
                java.lang.String r3 = r6.f6312a
                z8.g.c(r3)
                r1.getClass()
                int r1 = i9.r.b.b(r3)
            L_0x008f:
                java.lang.String r3 = r6.f6312a
                if (r3 == 0) goto L_0x009e
                i9.r$b r5 = i9.r.l
                r5.getClass()
                int r3 = i9.r.b.b(r3)
                if (r1 == r3) goto L_0x00a4
            L_0x009e:
                r0.append(r4)
                r0.append(r1)
            L_0x00a4:
                i9.r$b r1 = i9.r.l
                java.util.ArrayList r3 = r6.f6316f
                r1.getClass()
                java.lang.String r1 = "$this$toPathString"
                z8.g.f(r3, r1)
                int r1 = r3.size()
            L_0x00b4:
                if (r2 >= r1) goto L_0x00c7
                r4 = 47
                r0.append(r4)
                java.lang.Object r4 = r3.get(r2)
                java.lang.String r4 = (java.lang.String) r4
                r0.append(r4)
                int r2 = r2 + 1
                goto L_0x00b4
            L_0x00c7:
                java.util.ArrayList r1 = r6.f6317g
                if (r1 == 0) goto L_0x00dd
                r1 = 63
                r0.append(r1)
                i9.r$b r1 = i9.r.l
                java.util.ArrayList r2 = r6.f6317g
                z8.g.c(r2)
                r1.getClass()
                i9.r.b.f(r2, r0)
            L_0x00dd:
                java.lang.String r1 = r6.f6318h
                if (r1 == 0) goto L_0x00eb
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f6318h
                r0.append(r1)
            L_0x00eb:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                z8.g.e(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: i9.r.a.toString():java.lang.String");
        }
    }

    public static final class b {
        /* JADX WARNING: Removed duplicated region for block: B:124:0x01c6 A[LOOP:2: B:122:0x01c0->B:124:0x01c6, LOOP_END] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.String a(i9.r.b r18, java.lang.String r19, int r20, int r21, java.lang.String r22, boolean r23, boolean r24, boolean r25, boolean r26, java.nio.charset.Charset r27, int r28) {
            /*
                r0 = r19
                r1 = r28
                r2 = r1 & 1
                if (r2 == 0) goto L_0x000a
                r2 = 0
                goto L_0x000c
            L_0x000a:
                r2 = r20
            L_0x000c:
                r3 = r1 & 2
                if (r3 == 0) goto L_0x0015
                int r3 = r19.length()
                goto L_0x0017
            L_0x0015:
                r3 = r21
            L_0x0017:
                r4 = r1 & 8
                if (r4 == 0) goto L_0x001d
                r4 = 0
                goto L_0x001f
            L_0x001d:
                r4 = r23
            L_0x001f:
                r5 = r1 & 16
                if (r5 == 0) goto L_0x0025
                r5 = 0
                goto L_0x0027
            L_0x0025:
                r5 = r24
            L_0x0027:
                r6 = r1 & 32
                if (r6 == 0) goto L_0x002d
                r6 = 0
                goto L_0x002f
            L_0x002d:
                r6 = r25
            L_0x002f:
                r7 = r1 & 64
                if (r7 == 0) goto L_0x0035
                r7 = 0
                goto L_0x0037
            L_0x0035:
                r7 = r26
            L_0x0037:
                r8 = 128(0x80, float:1.794E-43)
                r1 = r1 & r8
                if (r1 == 0) goto L_0x003e
                r1 = 0
                goto L_0x0040
            L_0x003e:
                r1 = r27
            L_0x0040:
                r18.getClass()
                java.lang.String r9 = "$this$canonicalize"
                z8.g.f(r0, r9)
                r9 = r2
            L_0x0049:
                java.lang.String r10 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                if (r9 >= r3) goto L_0x0209
                int r11 = r0.codePointAt(r9)
                r12 = 127(0x7f, float:1.78E-43)
                r13 = 32
                r14 = 2
                r15 = 1
                if (r11 < r13) goto L_0x008b
                if (r11 == r12) goto L_0x008b
                if (r11 < r8) goto L_0x005f
                if (r7 == 0) goto L_0x008b
            L_0x005f:
                char r8 = (char) r11
                r12 = 0
                r13 = r22
                int r8 = f9.l.g0(r13, r8, r12, r12, r14)
                if (r8 < 0) goto L_0x006b
                r8 = r15
                goto L_0x006c
            L_0x006b:
                r8 = 0
            L_0x006c:
                if (r8 != 0) goto L_0x008d
                r8 = 37
                if (r11 != r8) goto L_0x007c
                if (r4 == 0) goto L_0x008d
                if (r5 == 0) goto L_0x007c
                boolean r8 = c(r0, r9, r3)
                if (r8 == 0) goto L_0x008d
            L_0x007c:
                r8 = 43
                if (r11 != r8) goto L_0x0083
                if (r6 == 0) goto L_0x0083
                goto L_0x008d
            L_0x0083:
                int r8 = java.lang.Character.charCount(r11)
                int r9 = r9 + r8
                r8 = 128(0x80, float:1.794E-43)
                goto L_0x0049
            L_0x008b:
                r13 = r22
            L_0x008d:
                w9.f r8 = new w9.f
                r8.<init>()
                r8.h0(r0, r2, r9)
                r2 = 0
                r11 = r10
                r12 = 32
                r10 = r9
                r9 = r8
                r8 = r7
                r7 = r6
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r0
            L_0x00a3:
                if (r10 >= r4) goto L_0x0204
                r18 = r15
                int r15 = r0.codePointAt(r10)
                r19 = r11
                if (r5 == 0) goto L_0x00bf
                r11 = 9
                if (r15 == r11) goto L_0x00fc
                r11 = 10
                if (r15 == r11) goto L_0x00fc
                r11 = 12
                if (r15 == r11) goto L_0x00fc
                r11 = 13
                if (r15 == r11) goto L_0x00fc
            L_0x00bf:
                r11 = 43
                if (r15 != r11) goto L_0x00d0
                if (r7 == 0) goto L_0x00d0
                if (r5 == 0) goto L_0x00ca
                java.lang.String r11 = "+"
                goto L_0x00cc
            L_0x00ca:
                java.lang.String r11 = "%2B"
            L_0x00cc:
                r9.g0(r11)
                goto L_0x00fc
            L_0x00d0:
                if (r15 < r12) goto L_0x0102
                r11 = 127(0x7f, float:1.78E-43)
                if (r15 == r11) goto L_0x0102
                r11 = 128(0x80, float:1.794E-43)
                if (r15 < r11) goto L_0x00dc
                if (r8 == 0) goto L_0x0102
            L_0x00dc:
                char r11 = (char) r15
                r12 = 0
                int r11 = f9.l.g0(r13, r11, r12, r12, r14)
                if (r11 < 0) goto L_0x00e7
                r11 = r18
                goto L_0x00e8
            L_0x00e7:
                r11 = 0
            L_0x00e8:
                if (r11 != 0) goto L_0x0102
                r11 = 37
                if (r15 != r11) goto L_0x00f9
                if (r5 == 0) goto L_0x0102
                if (r6 == 0) goto L_0x00f9
                boolean r11 = c(r0, r10, r4)
                if (r11 != 0) goto L_0x00f9
                goto L_0x0102
            L_0x00f9:
                r9.i0(r15)
            L_0x00fc:
                r12 = r18
                r11 = r19
                goto L_0x01f5
            L_0x0102:
                if (r3 != 0) goto L_0x0109
                w9.f r3 = new w9.f
                r3.<init>()
            L_0x0109:
                if (r2 == 0) goto L_0x01b3
                java.nio.charset.Charset r11 = java.nio.charset.StandardCharsets.UTF_8
                boolean r11 = z8.g.a(r2, r11)
                if (r11 == 0) goto L_0x0115
                goto L_0x01b3
            L_0x0115:
                int r11 = java.lang.Character.charCount(r15)
                int r11 = r11 + r10
                if (r10 < 0) goto L_0x011f
                r12 = r18
                goto L_0x0120
            L_0x011f:
                r12 = 0
            L_0x0120:
                if (r12 == 0) goto L_0x01a3
                if (r11 < r10) goto L_0x0127
                r12 = r18
                goto L_0x0128
            L_0x0127:
                r12 = 0
            L_0x0128:
                if (r12 == 0) goto L_0x0183
                int r12 = r1.length()
                if (r11 > r12) goto L_0x0133
                r12 = r18
                goto L_0x0134
            L_0x0133:
                r12 = 0
            L_0x0134:
                if (r12 == 0) goto L_0x015f
                java.nio.charset.Charset r12 = f9.a.f4927b
                boolean r12 = z8.g.a(r2, r12)
                if (r12 == 0) goto L_0x0145
                r3.h0(r0, r10, r11)
                r11 = r19
                goto L_0x01bd
            L_0x0145:
                java.lang.String r11 = r0.substring(r10, r11)
                r12 = r19
                z8.g.e(r11, r12)
                byte[] r11 = r11.getBytes(r2)
                java.lang.String r14 = "(this as java.lang.String).getBytes(charset)"
                z8.g.e(r11, r14)
                int r14 = r11.length
                r19 = r0
                r0 = 0
                r3.write((byte[]) r11, (int) r0, (int) r14)
                goto L_0x01ba
            L_0x015f:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "endIndex > string.length: "
                r0.<init>(r2)
                r0.append(r11)
                java.lang.String r2 = " > "
                r0.append(r2)
                int r1 = r1.length()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L_0x0183:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "endIndex < beginIndex: "
                r0.<init>(r1)
                r0.append(r11)
                java.lang.String r1 = " < "
                r0.append(r1)
                r0.append(r10)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L_0x01a3:
                java.lang.String r0 = "beginIndex < 0: "
                java.lang.String r0 = b0.d.c(r0, r10)
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L_0x01b3:
                r12 = r19
                r19 = r0
                r3.i0(r15)
            L_0x01ba:
                r0 = r19
                r11 = r12
            L_0x01bd:
                r12 = r15
                r15 = r18
            L_0x01c0:
                boolean r14 = r3.F()
                if (r14 != 0) goto L_0x01ec
                byte r14 = r3.readByte()
                r14 = r14 & 255(0xff, float:3.57E-43)
                r18 = r0
                r0 = 37
                r9.M(r0)
                char[] r0 = i9.r.f6302k
                int r16 = r14 >> 4
                r16 = r16 & 15
                r19 = r1
                char r1 = r0[r16]
                r9.M(r1)
                r1 = r14 & 15
                char r0 = r0[r1]
                r9.M(r0)
                r0 = r18
                r1 = r19
                goto L_0x01c0
            L_0x01ec:
                r18 = r0
                r19 = r1
                r17 = r15
                r15 = r12
                r12 = r17
            L_0x01f5:
                int r14 = java.lang.Character.charCount(r15)
                int r10 = r10 + r14
                r14 = 2
                r15 = 32
                r17 = r15
                r15 = r12
                r12 = r17
                goto L_0x00a3
            L_0x0204:
                java.lang.String r0 = r9.z()
                goto L_0x0210
            L_0x0209:
                java.lang.String r0 = r0.substring(r2, r3)
                z8.g.e(r0, r10)
            L_0x0210:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: i9.r.b.a(i9.r$b, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset, int):java.lang.String");
        }

        public static int b(String str) {
            g.f(str, "scheme");
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && str.equals("https")) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        public static boolean c(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && c.p(str.charAt(i10 + 1)) != -1 && c.p(str.charAt(i12)) != -1;
        }

        public static String d(b bVar, String str, int i10, int i11, boolean z, int i12) {
            int i13;
            int i14;
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z = false;
            }
            bVar.getClass();
            g.f(str, "$this$percentDecode");
            int i15 = i10;
            while (i13 < i11) {
                char charAt = str.charAt(i13);
                if (charAt == '%' || (charAt == '+' && z)) {
                    f fVar = new f();
                    fVar.h0(str, i10, i13);
                    while (i13 < i11) {
                        int codePointAt = str.codePointAt(i13);
                        if (codePointAt == 37 && (i14 = i13 + 2) < i11) {
                            int p10 = c.p(str.charAt(i13 + 1));
                            int p11 = c.p(str.charAt(i14));
                            if (!(p10 == -1 || p11 == -1)) {
                                fVar.M((p10 << 4) + p11);
                                i13 = Character.charCount(codePointAt) + i14;
                            }
                        } else if (codePointAt == 43 && z) {
                            fVar.M(32);
                            i13++;
                        }
                        fVar.i0(codePointAt);
                        i13 += Character.charCount(codePointAt);
                    }
                    return fVar.z();
                }
                i15 = i13 + 1;
            }
            String substring = str.substring(i10, i11);
            g.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public static ArrayList e(String str) {
            String str2;
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                int g02 = l.g0(str, '&', i10, false, 4);
                if (g02 == -1) {
                    g02 = str.length();
                }
                int g03 = l.g0(str, '=', i10, false, 4);
                if (g03 == -1 || g03 > g02) {
                    String substring = str.substring(i10, g02);
                    g.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    str2 = null;
                } else {
                    String substring2 = str.substring(i10, g03);
                    g.e(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    str2 = str.substring(g03 + 1, g02);
                    g.e(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                arrayList.add(str2);
                i10 = g02 + 1;
            }
            return arrayList;
        }

        public static void f(List list, StringBuilder sb) {
            g.f(list, "$this$toQueryString");
            c9.a I = s6.a.I(s6.a.K(0, list.size()), 2);
            int i10 = I.f2194o;
            int i11 = I.f2195p;
            int i12 = I.f2196q;
            if (i12 >= 0) {
                if (i10 > i11) {
                    return;
                }
            } else if (i10 < i11) {
                return;
            }
            while (true) {
                String str = (String) list.get(i10);
                String str2 = (String) list.get(i10 + 1);
                if (i10 > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (i10 != i11) {
                    i10 += i12;
                } else {
                    return;
                }
            }
        }
    }

    public r(String str, String str2, String str3, String str4, int i10, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f6304b = str;
        this.f6305c = str2;
        this.d = str3;
        this.f6306e = str4;
        this.f6307f = i10;
        this.f6308g = arrayList;
        this.f6309h = arrayList2;
        this.f6310i = str5;
        this.f6311j = str6;
        this.f6303a = g.a(str, "https");
    }

    public final String a() {
        if (this.d.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        String str = this.f6311j;
        int g02 = l.g0(str, ':', this.f6304b.length() + 3, false, 4) + 1;
        int g03 = l.g0(str, '@', 0, false, 6);
        if (str != null) {
            String substring = str.substring(g02, g03);
            g.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final String b() {
        String str = this.f6311j;
        int g02 = l.g0(str, '/', this.f6304b.length() + 3, false, 4);
        String substring = str.substring(g02, c.f(str, "?#", g02, str.length()));
        g.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        String str = this.f6311j;
        int g02 = l.g0(str, '/', this.f6304b.length() + 3, false, 4);
        int f10 = c.f(str, "?#", g02, str.length());
        ArrayList arrayList = new ArrayList();
        while (g02 < f10) {
            int i10 = g02 + 1;
            int e10 = c.e(str, '/', i10, f10);
            String substring = str.substring(i10, e10);
            g.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring);
            g02 = e10;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f6309h == null) {
            return null;
        }
        String str = this.f6311j;
        int g02 = l.g0(str, '?', 0, false, 6) + 1;
        String substring = str.substring(g02, c.e(str, '#', g02, str.length()));
        g.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f6305c.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        int length = this.f6304b.length() + 3;
        String str = this.f6311j;
        int f10 = c.f(str, ":@", length, str.length());
        if (str != null) {
            String substring = str.substring(length, f10);
            g.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof r) && g.a(((r) obj).f6311j, this.f6311j);
    }

    public final String f() {
        a aVar;
        try {
            aVar = new a();
            aVar.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        g.c(aVar);
        b bVar = l;
        aVar.f6313b = b.a(bVar, BuildConfig.FLAVOR, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
        aVar.f6314c = b.a(bVar, BuildConfig.FLAVOR, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
        return aVar.a().f6311j;
    }

    public final URI g() {
        String str;
        String str2;
        String str3;
        a aVar = new a();
        String str4 = this.f6304b;
        aVar.f6312a = str4;
        aVar.f6313b = e();
        aVar.f6314c = a();
        aVar.d = this.f6306e;
        l.getClass();
        int b10 = b.b(str4);
        int i10 = this.f6307f;
        if (i10 == b10) {
            i10 = -1;
        }
        aVar.f6315e = i10;
        ArrayList arrayList = aVar.f6316f;
        arrayList.clear();
        arrayList.addAll(c());
        aVar.b(d());
        String str5 = null;
        if (this.f6310i == null) {
            str = null;
        } else {
            String str6 = this.f6311j;
            int g02 = l.g0(str6, '#', 0, false, 6) + 1;
            if (str6 != null) {
                str = str6.substring(g02);
                g.e(str, "(this as java.lang.String).substring(startIndex)");
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        aVar.f6318h = str;
        String str7 = aVar.d;
        if (str7 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            g.e(compile, "compile(pattern)");
            str2 = compile.matcher(str7).replaceAll(BuildConfig.FLAVOR);
            g.e(str2, "nativePattern.matcher(in…).replaceAll(replacement)");
        } else {
            str2 = null;
        }
        aVar.d = str2;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.set(i11, b.a(l, (String) arrayList.get(i11), 0, 0, "[]", true, true, false, false, (Charset) null, 227));
        }
        ArrayList arrayList2 = aVar.f6317g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                String str8 = (String) arrayList2.get(i12);
                if (str8 != null) {
                    str3 = b.a(l, str8, 0, 0, "\\^`{|}", true, true, true, false, (Charset) null, 195);
                } else {
                    str3 = null;
                }
                arrayList2.set(i12, str3);
            }
        }
        String str9 = aVar.f6318h;
        if (str9 != null) {
            str5 = b.a(l, str9, 0, 0, " \"#<>\\^`{|}", true, true, false, true, (Charset) null, 163);
        }
        aVar.f6318h = str5;
        String aVar2 = aVar.toString();
        try {
            return new URI(aVar2);
        } catch (URISyntaxException e10) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                g.e(compile2, "compile(pattern)");
                String replaceAll = compile2.matcher(aVar2).replaceAll(BuildConfig.FLAVOR);
                g.e(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                URI create = URI.create(replaceAll);
                g.e(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final int hashCode() {
        return this.f6311j.hashCode();
    }

    public final String toString() {
        return this.f6311j;
    }
}

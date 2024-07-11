package g0;

import android.text.SpannableStringBuilder;
import com.karumi.dexter.BuildConfig;
import g0.d;

public final class a {
    public static final String d = Character.toString(8206);

    /* renamed from: e  reason: collision with root package name */
    public static final String f4945e = Character.toString(8207);

    /* renamed from: f  reason: collision with root package name */
    public static final a f4946f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f4947g;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4948a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4949b;

    /* renamed from: c  reason: collision with root package name */
    public final c f4950c;

    /* renamed from: g0.a$a  reason: collision with other inner class name */
    public static class C0067a {

        /* renamed from: e  reason: collision with root package name */
        public static final byte[] f4951e = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        public final CharSequence f4952a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4953b;

        /* renamed from: c  reason: collision with root package name */
        public int f4954c;
        public char d;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f4951e[i10] = Character.getDirectionality(i10);
            }
        }

        public C0067a(CharSequence charSequence) {
            this.f4952a = charSequence;
            this.f4953b = charSequence.length();
        }

        public final byte a() {
            CharSequence charSequence = this.f4952a;
            char charAt = charSequence.charAt(this.f4954c - 1);
            this.d = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(charSequence, this.f4954c);
                this.f4954c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f4954c--;
            char c10 = this.d;
            if (c10 < 1792) {
                return f4951e[c10];
            }
            return Character.getDirectionality(c10);
        }
    }

    static {
        d.C0068d dVar = d.f4960c;
        f4946f = new a(false, 2, dVar);
        f4947g = new a(true, 2, dVar);
    }

    public a(boolean z, int i10, d.C0068d dVar) {
        this.f4948a = z;
        this.f4949b = i10;
        this.f4950c = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        r3 = r3 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.CharSequence r9) {
        /*
            g0.a$a r0 = new g0.a$a
            r0.<init>(r9)
            r9 = 0
            r0.f4954c = r9
            r1 = r9
            r2 = r1
            r3 = r2
        L_0x000b:
            int r4 = r0.f4954c
            int r5 = r0.f4953b
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L_0x006e
            if (r1 != 0) goto L_0x006e
            java.lang.CharSequence r5 = r0.f4952a
            char r4 = r5.charAt(r4)
            r0.d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L_0x0037
            int r4 = r0.f4954c
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.f4954c
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.f4954c = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L_0x004b
        L_0x0037:
            int r4 = r0.f4954c
            int r4 = r4 + r7
            r0.f4954c = r4
            char r4 = r0.d
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L_0x0047
            byte[] r5 = g0.a.C0067a.f4951e
            byte r4 = r5[r4]
            goto L_0x004b
        L_0x0047:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L_0x004b:
            if (r4 == 0) goto L_0x0069
            if (r4 == r7) goto L_0x0066
            r5 = 2
            if (r4 == r5) goto L_0x0066
            r5 = 9
            if (r4 == r5) goto L_0x000b
            switch(r4) {
                case 14: goto L_0x0062;
                case 15: goto L_0x0062;
                case 16: goto L_0x005e;
                case 17: goto L_0x005e;
                case 18: goto L_0x005a;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x006c
        L_0x005a:
            int r3 = r3 + -1
            r2 = r9
            goto L_0x000b
        L_0x005e:
            int r3 = r3 + 1
            r2 = r7
            goto L_0x000b
        L_0x0062:
            int r3 = r3 + 1
            r2 = r6
            goto L_0x000b
        L_0x0066:
            if (r3 != 0) goto L_0x006c
            goto L_0x0086
        L_0x0069:
            if (r3 != 0) goto L_0x006c
            goto L_0x008a
        L_0x006c:
            r1 = r3
            goto L_0x000b
        L_0x006e:
            if (r1 != 0) goto L_0x0071
            goto L_0x008f
        L_0x0071:
            if (r2 == 0) goto L_0x0075
            r9 = r2
            goto L_0x008f
        L_0x0075:
            int r2 = r0.f4954c
            if (r2 <= 0) goto L_0x008f
            byte r2 = r0.a()
            switch(r2) {
                case 14: goto L_0x0088;
                case 15: goto L_0x0088;
                case 16: goto L_0x0084;
                case 17: goto L_0x0084;
                case 18: goto L_0x0081;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x0075
        L_0x0081:
            int r3 = r3 + 1
            goto L_0x0075
        L_0x0084:
            if (r1 != r3) goto L_0x008c
        L_0x0086:
            r9 = r7
            goto L_0x008f
        L_0x0088:
            if (r1 != r3) goto L_0x008c
        L_0x008a:
            r9 = r6
            goto L_0x008f
        L_0x008c:
            int r3 = r3 + -1
            goto L_0x0075
        L_0x008f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.a.a(java.lang.CharSequence):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(java.lang.CharSequence r6) {
        /*
            g0.a$a r0 = new g0.a$a
            r0.<init>(r6)
            int r6 = r0.f4953b
            r0.f4954c = r6
            r6 = 0
            r1 = r6
        L_0x000b:
            r2 = r1
        L_0x000c:
            int r3 = r0.f4954c
            if (r3 <= 0) goto L_0x0041
            byte r3 = r0.a()
            if (r3 == 0) goto L_0x0039
            r4 = 1
            if (r3 == r4) goto L_0x0032
            r5 = 2
            if (r3 == r5) goto L_0x0032
            r5 = 9
            if (r3 == r5) goto L_0x000c
            switch(r3) {
                case 14: goto L_0x002c;
                case 15: goto L_0x002c;
                case 16: goto L_0x0029;
                case 17: goto L_0x0029;
                case 18: goto L_0x0026;
                default: goto L_0x0023;
            }
        L_0x0023:
            if (r1 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0029:
            if (r1 != r2) goto L_0x002f
            goto L_0x0034
        L_0x002c:
            if (r1 != r2) goto L_0x002f
            goto L_0x003b
        L_0x002f:
            int r2 = r2 + -1
            goto L_0x000c
        L_0x0032:
            if (r2 != 0) goto L_0x0036
        L_0x0034:
            r6 = r4
            goto L_0x0041
        L_0x0036:
            if (r1 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0039:
            if (r2 != 0) goto L_0x003d
        L_0x003b:
            r6 = -1
            goto L_0x0041
        L_0x003d:
            if (r1 != 0) goto L_0x000c
        L_0x003f:
            r1 = r2
            goto L_0x000b
        L_0x0041:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.a.b(java.lang.CharSequence):int");
    }

    public final SpannableStringBuilder c(CharSequence charSequence, c cVar) {
        boolean z;
        d.C0068d dVar;
        char c10;
        d.C0068d dVar2;
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean b10 = ((d.c) cVar).b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if ((this.f4949b & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = f4945e;
        String str3 = d;
        boolean z10 = this.f4948a;
        if (z) {
            if (b10) {
                dVar2 = d.f4959b;
            } else {
                dVar2 = d.f4958a;
            }
            boolean b11 = dVar2.b(charSequence, charSequence.length());
            if (z10 || (!b11 && a(charSequence) != 1)) {
                str = (!z10 || (b11 && a(charSequence) != -1)) ? BuildConfig.FLAVOR : str2;
            } else {
                str = str3;
            }
            spannableStringBuilder.append(str);
        }
        if (b10 != z10) {
            if (b10) {
                c10 = 8235;
            } else {
                c10 = 8234;
            }
            spannableStringBuilder.append(c10);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (b10) {
            dVar = d.f4959b;
        } else {
            dVar = d.f4958a;
        }
        boolean b12 = dVar.b(charSequence, charSequence.length());
        if (!z10 && (b12 || b(charSequence) == 1)) {
            str2 = str3;
        } else if (!z10 || (b12 && b(charSequence) != -1)) {
            str2 = BuildConfig.FLAVOR;
        }
        spannableStringBuilder.append(str2);
        return spannableStringBuilder;
    }
}

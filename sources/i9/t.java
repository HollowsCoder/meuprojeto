package i9;

import f9.h;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z8.g;

public final class t {
    public static final Pattern d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f6319e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: f  reason: collision with root package name */
    public static final a f6320f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f6321a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6322b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f6323c;

    public static final class a {
        public static t a(String str) {
            g.f(str, "$this$toMediaType");
            Matcher matcher = t.d.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                g.e(group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                g.e(locale, "Locale.US");
                String lowerCase = group.toLowerCase(locale);
                g.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                g.e(group2, "typeSubtype.group(2)");
                g.e(group2.toLowerCase(locale), "(this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = t.f6319e.matcher(str);
                int end = matcher.end();
                while (end < str.length()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 != null) {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else if (h.a0(group4, "'", false) && group4.endsWith("'") && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                g.e(group4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                        }
                        end = matcher2.end();
                    } else {
                        StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                        String substring = str.substring(end);
                        g.e(substring, "(this as java.lang.String).substring(startIndex)");
                        sb.append(substring);
                        sb.append("\" for: \"");
                        sb.append(str);
                        sb.append('\"');
                        throw new IllegalArgumentException(sb.toString().toString());
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    return new t(str, lowerCase, (String[]) array);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
    }

    public t(String str, String str2, String[] strArr) {
        this.f6321a = str;
        this.f6322b = str2;
        this.f6323c = strArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038 A[SYNTHETIC, Splitter:B:11:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.nio.charset.Charset a(java.nio.charset.Charset r7) {
        /*
            r6 = this;
            java.lang.String r0 = "<this>"
            java.lang.String[] r1 = r6.f6323c
            z8.g.f(r1, r0)
            c9.c r0 = new c9.c
            int r2 = r1.length
            int r2 = r2 + -1
            r3 = 0
            r0.<init>(r3, r2)
            r2 = 2
            c9.a r0 = s6.a.I(r0, r2)
            int r2 = r0.f2194o
            int r3 = r0.f2195p
            int r0 = r0.f2196q
            if (r0 < 0) goto L_0x0020
            if (r2 > r3) goto L_0x0035
            goto L_0x0022
        L_0x0020:
            if (r2 < r3) goto L_0x0035
        L_0x0022:
            r4 = r1[r2]
            java.lang.String r5 = "charset"
            boolean r4 = f9.h.V(r4, r5)
            if (r4 == 0) goto L_0x0031
            int r2 = r2 + 1
            r0 = r1[r2]
            goto L_0x0036
        L_0x0031:
            if (r2 == r3) goto L_0x0035
            int r2 = r2 + r0
            goto L_0x0022
        L_0x0035:
            r0 = 0
        L_0x0036:
            if (r0 == 0) goto L_0x003c
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r0)     // Catch:{ IllegalArgumentException -> 0x003c }
        L_0x003c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.t.a(java.nio.charset.Charset):java.nio.charset.Charset");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof t) && g.a(((t) obj).f6321a, this.f6321a);
    }

    public final int hashCode() {
        return this.f6321a.hashCode();
    }

    public final String toString() {
        return this.f6321a;
    }
}

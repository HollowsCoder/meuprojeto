package i9;

import f9.l;
import j9.c;
import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import z8.g;

public final class j {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f6269j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f6270k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f6271m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: n  reason: collision with root package name */
    public static final a f6272n = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f6273a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6274b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6275c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6276e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6277f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6278g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f6279h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f6280i;

    public static final class a {
        public static int a(String str, int i10, int i11, boolean z) {
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (((charAt < ' ' && charAt != 9) || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        public static long b(String str, int i10) {
            boolean z;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            int a10 = a(str, 0, i10, false);
            Matcher matcher = j.f6271m.matcher(str);
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            while (a10 < i10) {
                int a11 = a(str, a10 + 1, i10, true);
                matcher.region(a10, a11);
                if (i12 == -1 && matcher.usePattern(j.f6271m).matches()) {
                    String group = matcher.group(1);
                    g.e(group, "matcher.group(1)");
                    i12 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    g.e(group2, "matcher.group(2)");
                    i15 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    g.e(group3, "matcher.group(3)");
                    i16 = Integer.parseInt(group3);
                } else if (i13 != -1 || !matcher.usePattern(j.l).matches()) {
                    if (i14 == -1) {
                        Pattern pattern = j.f6270k;
                        if (matcher.usePattern(pattern).matches()) {
                            String group4 = matcher.group(1);
                            g.e(group4, "matcher.group(1)");
                            Locale locale = Locale.US;
                            g.e(locale, "Locale.US");
                            String lowerCase = group4.toLowerCase(locale);
                            g.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            String pattern2 = pattern.pattern();
                            g.e(pattern2, "MONTH_PATTERN.pattern()");
                            i14 = l.h0(pattern2, lowerCase, 0, false, 6) / 4;
                        }
                    }
                    if (i11 == -1 && matcher.usePattern(j.f6269j).matches()) {
                        String group5 = matcher.group(1);
                        g.e(group5, "matcher.group(1)");
                        i11 = Integer.parseInt(group5);
                    }
                } else {
                    String group6 = matcher.group(1);
                    g.e(group6, "matcher.group(1)");
                    i13 = Integer.parseInt(group6);
                }
                a10 = a(str, a11 + 1, i10, false);
            }
            if (70 <= i11 && 99 >= i11) {
                i11 += 1900;
            }
            if (i11 >= 0 && 69 >= i11) {
                i11 += 2000;
            }
            if (i11 >= 1601) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i14 != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (1 <= i13 && 31 >= i13) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        if (i12 >= 0 && 23 >= i12) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            if (i15 >= 0 && 59 >= i15) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                if (i16 >= 0 && 59 >= i16) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (z14) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(c.f6605e);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i11);
                                    gregorianCalendar.set(2, i14 - 1);
                                    gregorianCalendar.set(5, i13);
                                    gregorianCalendar.set(11, i12);
                                    gregorianCalendar.set(12, i15);
                                    gregorianCalendar.set(13, i16);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public j(String str, String str2, long j8, String str3, String str4, boolean z, boolean z10, boolean z11, boolean z12) {
        this.f6273a = str;
        this.f6274b = str2;
        this.f6275c = j8;
        this.d = str3;
        this.f6276e = str4;
        this.f6277f = z;
        this.f6278g = z10;
        this.f6279h = z11;
        this.f6280i = z12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            return g.a(jVar.f6273a, this.f6273a) && g.a(jVar.f6274b, this.f6274b) && jVar.f6275c == this.f6275c && g.a(jVar.d, this.d) && g.a(jVar.f6276e, this.f6276e) && jVar.f6277f == this.f6277f && jVar.f6278g == this.f6278g && jVar.f6279h == this.f6279h && jVar.f6280i == this.f6280i;
        }
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        int hashCode = this.f6274b.hashCode();
        int hashCode2 = Long.hashCode(this.f6275c);
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.f6276e.hashCode();
        int hashCode5 = Boolean.hashCode(this.f6277f);
        int hashCode6 = Boolean.hashCode(this.f6278g);
        int hashCode7 = Boolean.hashCode(this.f6279h);
        return Boolean.hashCode(this.f6280i) + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f6273a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6273a);
        sb.append('=');
        sb.append(this.f6274b);
        if (this.f6279h) {
            long j8 = this.f6275c;
            if (j8 == Long.MIN_VALUE) {
                str = "; max-age=0";
            } else {
                sb.append("; expires=");
                str = ((DateFormat) n9.c.f7504a.get()).format(new Date(j8));
                g.e(str, "STANDARD_DATE_FORMAT.get().format(this)");
            }
            sb.append(str);
        }
        if (!this.f6280i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.f6276e);
        if (this.f6277f) {
            sb.append("; secure");
        }
        if (this.f6278g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        g.e(sb2, "toString()");
        return sb2;
    }
}

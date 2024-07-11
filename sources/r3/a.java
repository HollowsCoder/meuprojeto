package r3;

import com.karumi.dexter.BuildConfig;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import q3.b;
import t3.l;

public final class a implements l {

    /* renamed from: c  reason: collision with root package name */
    public static final String f8411c = s6.a.A("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
    public static final Set<b> d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new b[]{new b("proto"), new b("json")})));

    /* renamed from: e  reason: collision with root package name */
    public static final a f8412e;

    /* renamed from: a  reason: collision with root package name */
    public final String f8413a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8414b;

    static {
        String A = s6.a.A("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String A2 = s6.a.A("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f8412e = new a(A, A2);
    }

    public a(String str, String str2) {
        this.f8413a = str;
        this.f8414b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public final byte[] b() {
        String str = this.f8413a;
        String str2 = this.f8414b;
        if (str2 == null && str == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = str;
        objArr[2] = "\\";
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        objArr[3] = str2;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }
}

package j7;

import d2.c;
import f7.a0;
import q3.f;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final g7.a f6595b = new g7.a();

    /* renamed from: c  reason: collision with root package name */
    public static final String f6596c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    public static final String d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e  reason: collision with root package name */
    public static final c f6597e = new c(9);

    /* renamed from: a  reason: collision with root package name */
    public final f<a0> f6598a;

    public a(f fVar) {
        this.f6598a = fVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb.append(str2.charAt(i10));
            }
        }
        return sb.toString();
    }
}

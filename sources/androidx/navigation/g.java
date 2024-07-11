package androidx.navigation;

import android.net.Uri;
import b0.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class g {

    /* renamed from: i  reason: collision with root package name */
    public static final Pattern f1482i = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<String> f1483a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f1484b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Pattern f1485c = null;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f1486e;

    /* renamed from: f  reason: collision with root package name */
    public final String f1487f;

    /* renamed from: g  reason: collision with root package name */
    public final Pattern f1488g;

    /* renamed from: h  reason: collision with root package name */
    public final String f1489h;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f1490a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<String> f1491b = new ArrayList<>();
    }

    public g(String str, String str2, String str3) {
        boolean z;
        int i10 = 0;
        this.d = false;
        this.f1486e = false;
        this.f1488g = null;
        this.f1487f = str2;
        this.f1489h = str3;
        int i11 = 1;
        if (str != null) {
            Uri parse = Uri.parse(str);
            if (parse.getQuery() != null) {
                z = true;
            } else {
                z = false;
            }
            this.f1486e = z;
            StringBuilder sb = new StringBuilder("^");
            if (!f1482i.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (z) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    a(str.substring(0, matcher.start()), sb, compile);
                }
                this.d = false;
                for (String next : parse.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(next);
                    Matcher matcher2 = compile.matcher(queryParameter);
                    a aVar = new a();
                    while (matcher2.find()) {
                        aVar.f1491b.add(matcher2.group(i11));
                        sb2.append(Pattern.quote(queryParameter.substring(i10, matcher2.start())));
                        sb2.append("(.+?)?");
                        i10 = matcher2.end();
                        i11 = 1;
                    }
                    if (i10 < queryParameter.length()) {
                        sb2.append(Pattern.quote(queryParameter.substring(i10)));
                    }
                    aVar.f1490a = sb2.toString().replace(".*", "\\E.*\\Q");
                    this.f1484b.put(next, aVar);
                    i11 = 1;
                    i10 = 0;
                }
            } else {
                this.d = a(str, sb, compile);
            }
            this.f1485c = Pattern.compile(sb.toString().replace(".*", "\\E.*\\Q"), 2);
        }
        if (str3 == null) {
            return;
        }
        if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
            String[] split = str3.split("/", -1);
            this.f1488g = Pattern.compile(("^(" + split[0] + "|[*]+)/(" + split[1] + "|[*]+)$").replace("*|[*]", "[\\s\\S]"));
            return;
        }
        throw new IllegalArgumentException(d.f("The given mimeType ", str3, " does not match to required \"type/subtype\" format"));
    }

    public final boolean a(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z = !str.contains(".*");
        int i10 = 0;
        while (matcher.find()) {
            this.f1483a.add(matcher.group(1));
            sb.append(Pattern.quote(str.substring(i10, matcher.start())));
            sb.append("(.+?)");
            i10 = matcher.end();
            z = false;
        }
        if (i10 < str.length()) {
            sb.append(Pattern.quote(str.substring(i10)));
        }
        sb.append("($|(\\?(.)*))");
        return z;
    }
}

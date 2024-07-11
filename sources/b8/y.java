package b8;

import android.util.Log;
import androidx.appcompat.widget.x0;
import java.util.Arrays;
import java.util.regex.Pattern;

public final class y {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a  reason: collision with root package name */
    public final String f2059a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2060b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2061c;

    public y(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{str}));
            str3 = str2.substring(8);
        }
        if (str3 == null || !d.matcher(str3).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str3, "[a-zA-Z0-9-_.~%]{1,900}"}));
        }
        this.f2059a = str3;
        this.f2060b = str;
        this.f2061c = x0.f(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length()), str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f2059a.equals(yVar.f2059a) && this.f2060b.equals(yVar.f2060b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2060b, this.f2059a});
    }
}

package androidx.appcompat.widget;

import android.net.Uri;
import androidx.databinding.a;
import com.google.android.gms.internal.measurement.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final /* synthetic */ class x0 {
    public static int a(String str, int i10) {
        return String.valueOf(str).length() + i10;
    }

    public static Object b(z zVar, int i10, ArrayList arrayList, int i11) {
        a.A(zVar.name(), i10, arrayList);
        return arrayList.get(i11);
    }

    public static String c(int i10, String str, int i11, String str2, int i12) {
        StringBuilder sb = new StringBuilder(i10);
        sb.append(str);
        sb.append(i11);
        sb.append(str2);
        sb.append(i12);
        return sb.toString();
    }

    public static String d(String str, Uri uri) {
        return str + uri;
    }

    public static String e(String str, String str2) {
        return str + str2;
    }

    public static String f(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static StringBuilder g(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder h(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static Map i(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static /* bridge */ /* synthetic */ void j(Object obj, int i10, int i11, int i12) {
        throw null;
    }
}

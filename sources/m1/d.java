package m1;

import java.util.ArrayList;
import java.util.List;
import o1.n;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<n> f7043a;

    /* renamed from: b  reason: collision with root package name */
    public final char f7044b;

    /* renamed from: c  reason: collision with root package name */
    public final double f7045c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7046e;

    public d(ArrayList arrayList, char c10, double d10, String str, String str2) {
        this.f7043a = arrayList;
        this.f7044b = c10;
        this.f7045c = d10;
        this.d = str;
        this.f7046e = str2;
    }

    public static int a(char c10, String str, String str2) {
        int hashCode = str.hashCode();
        return str2.hashCode() + ((hashCode + ((0 + c10) * 31)) * 31);
    }

    public final int hashCode() {
        return a(this.f7044b, this.f7046e, this.d);
    }
}

package m1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final e f7047c = new e("COMPOSITION");

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f7048a;

    /* renamed from: b  reason: collision with root package name */
    public f f7049b;

    public e(e eVar) {
        this.f7048a = new ArrayList(eVar.f7048a);
        this.f7049b = eVar.f7049b;
    }

    public e(String... strArr) {
        this.f7048a = Arrays.asList(strArr);
    }

    public final boolean a(String str, int i10) {
        boolean z;
        boolean z10;
        boolean z11;
        List<String> list = this.f7048a;
        if (i10 >= list.size()) {
            return false;
        }
        if (i10 == list.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        String str2 = list.get(i10);
        if (!str2.equals("**")) {
            if (str2.equals(str) || str2.equals("*")) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((z || (i10 == list.size() - 2 && list.get(list.size() - 1).equals("**"))) && z11) {
                return true;
            }
            return false;
        }
        if (z || !list.get(i10 + 1).equals(str)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (i10 == list.size() - 2 || (i10 == list.size() - 3 && list.get(list.size() - 1).equals("**"))) {
                return true;
            }
            return false;
        } else if (z) {
            return true;
        } else {
            int i11 = i10 + 1;
            if (i11 < list.size() - 1) {
                return false;
            }
            return list.get(i11).equals(str);
        }
    }

    public final int b(String str, int i10) {
        if ("__container".equals(str)) {
            return 0;
        }
        List<String> list = this.f7048a;
        if (!list.get(i10).equals("**")) {
            return 1;
        }
        if (i10 != list.size() - 1 && list.get(i10 + 1).equals(str)) {
            return 2;
        }
        return 0;
    }

    public final boolean c(String str, int i10) {
        if ("__container".equals(str)) {
            return true;
        }
        List<String> list = this.f7048a;
        if (i10 >= list.size()) {
            return false;
        }
        if (list.get(i10).equals(str) || list.get(i10).equals("**") || list.get(i10).equals("*")) {
            return true;
        }
        return false;
    }

    public final boolean d(String str, int i10) {
        if ("__container".equals(str)) {
            return true;
        }
        List<String> list = this.f7048a;
        return i10 < list.size() - 1 || list.get(i10).equals("**");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.f7048a);
        sb.append(",resolved=");
        sb.append(this.f7049b != null);
        sb.append('}');
        return sb.toString();
    }
}

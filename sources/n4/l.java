package n4;

import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;

public final class l {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f7447a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final Object f7448b;

        public a(Object obj) {
            m.h(obj);
            this.f7448b = obj;
        }

        @RecentlyNonNull
        public final void a(Object obj, @RecentlyNonNull String str) {
            ArrayList arrayList = this.f7447a;
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(valueOf.length() + str.length() + 1);
            sb.append(str);
            sb.append("=");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }

        @RecentlyNonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f7448b.getClass().getSimpleName());
            sb.append('{');
            ArrayList arrayList = this.f7447a;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb.append((String) arrayList.get(i10));
                if (i10 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    @RecentlyNonNull
    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}

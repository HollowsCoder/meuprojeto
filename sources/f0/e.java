package f0;

import android.util.Base64;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f4559a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4560b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4561c;
    public final List<List<byte[]>> d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4562e;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        str.getClass();
        this.f4559a = str;
        str2.getClass();
        this.f4560b = str2;
        this.f4561c = str3;
        list.getClass();
        this.d = list;
        this.f4562e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f4559a + ", mProviderPackage: " + this.f4560b + ", mQuery: " + this.f4561c + ", mCertificates:");
        int i10 = 0;
        while (true) {
            List<List<byte[]>> list = this.d;
            if (i10 < list.size()) {
                sb.append(" [");
                List list2 = list.get(i10);
                for (int i11 = 0; i11 < list2.size(); i11++) {
                    sb.append(" \"");
                    sb.append(Base64.encodeToString((byte[]) list2.get(i11), 0));
                    sb.append("\"");
                }
                sb.append(" ]");
                i10++;
            } else {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
        }
    }
}

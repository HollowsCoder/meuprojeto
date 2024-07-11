package x;

import android.app.Activity;
import android.text.TextUtils;
import b0.d;
import java.util.Arrays;

public final class a extends y.a {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f9376c = 0;

    /* renamed from: x.a$a  reason: collision with other inner class name */
    public interface C0157a {
        void h();
    }

    public static void b(Activity activity, String[] strArr, int i10) {
        int length = strArr.length;
        int i11 = 0;
        while (i11 < length) {
            if (!TextUtils.isEmpty(strArr[i11])) {
                i11++;
            } else {
                throw new IllegalArgumentException(d.g(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
        }
        if (activity instanceof C0157a) {
            ((C0157a) activity).h();
        }
        activity.requestPermissions(strArr, i10);
    }
}

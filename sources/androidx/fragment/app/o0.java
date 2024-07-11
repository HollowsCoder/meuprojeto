package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

public final class o0 extends Writer {

    /* renamed from: o  reason: collision with root package name */
    public final String f1263o = "FragmentManager";

    /* renamed from: p  reason: collision with root package name */
    public final StringBuilder f1264p = new StringBuilder(128);

    public final void a() {
        StringBuilder sb = this.f1264p;
        if (sb.length() > 0) {
            Log.d(this.f1263o, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    public final void close() {
        a();
    }

    public final void flush() {
        a();
    }

    public final void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == 10) {
                a();
            } else {
                this.f1264p.append(c10);
            }
        }
    }
}

package androidx.recyclerview.widget;

import android.view.View;
import com.karumi.dexter.R;

public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final b f1751a;

    /* renamed from: b  reason: collision with root package name */
    public final a f1752b = new a();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f1753a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f1754b;

        /* renamed from: c  reason: collision with root package name */
        public int f1755c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f1756e;

        public final boolean a() {
            int i10 = this.f1753a;
            int i11 = 2;
            if ((i10 & 7) != 0) {
                int i12 = this.d;
                int i13 = this.f1754b;
                if ((((i12 > i13 ? 1 : i12 == i13 ? 2 : 4) << 0) & i10) == 0) {
                    return false;
                }
            }
            if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != 0) {
                int i14 = this.d;
                int i15 = this.f1755c;
                if ((((i14 > i15 ? 1 : i14 == i15 ? 2 : 4) << 4) & i10) == 0) {
                    return false;
                }
            }
            if ((i10 & 1792) != 0) {
                int i16 = this.f1756e;
                int i17 = this.f1754b;
                if ((((i16 > i17 ? 1 : i16 == i17 ? 2 : 4) << 8) & i10) == 0) {
                    return false;
                }
            }
            if ((i10 & 28672) != 0) {
                int i18 = this.f1756e;
                int i19 = this.f1755c;
                if (i18 > i19) {
                    i11 = 1;
                } else if (i18 != i19) {
                    i11 = 4;
                }
                if ((i10 & (i11 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public interface b {
        int a();

        int b(View view);

        View c(int i10);

        int d();

        int e(View view);
    }

    public b0(b bVar) {
        this.f1751a = bVar;
    }

    public final View a(int i10, int i11, int i12, int i13) {
        int i14;
        b bVar = this.f1751a;
        int d = bVar.d();
        int a10 = bVar.a();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View c10 = bVar.c(i10);
            int b10 = bVar.b(c10);
            int e10 = bVar.e(c10);
            a aVar = this.f1752b;
            aVar.f1754b = d;
            aVar.f1755c = a10;
            aVar.d = b10;
            aVar.f1756e = e10;
            if (i12 != 0) {
                aVar.f1753a = i12 | 0;
                if (aVar.a()) {
                    return c10;
                }
            }
            if (i13 != 0) {
                aVar.f1753a = i13 | 0;
                if (aVar.a()) {
                    view = c10;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public final boolean b(View view) {
        b bVar = this.f1751a;
        int d = bVar.d();
        int a10 = bVar.a();
        int b10 = bVar.b(view);
        int e10 = bVar.e(view);
        a aVar = this.f1752b;
        aVar.f1754b = d;
        aVar.f1755c = a10;
        aVar.d = b10;
        aVar.f1756e = e10;
        aVar.f1753a = 24579 | 0;
        return aVar.a();
    }
}

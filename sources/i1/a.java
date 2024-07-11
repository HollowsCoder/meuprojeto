package i1;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

public final class a extends Paint {
    public a() {
    }

    public a(int i10) {
        super(i10);
    }

    public a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public a(PorterDuff.Mode mode, int i10) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    public final void setTextLocales(LocaleList localeList) {
    }
}

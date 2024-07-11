package b0;

import a0.c;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

public class l {

    public interface a<T> {
        int a(T t10);

        boolean b(T t10);
    }

    public l() {
        new ConcurrentHashMap();
    }

    public static <T> T e(T[] tArr, int i10, a<T> aVar) {
        int i11 = (i10 & 1) == 0 ? 400 : 700;
        boolean z = (i10 & 2) != 0;
        T t10 = null;
        int i12 = Integer.MAX_VALUE;
        for (T t11 : tArr) {
            int abs = (Math.abs(aVar.a(t11) - i11) * 2) + (aVar.b(t11) == z ? 0 : 1);
            if (t10 == null || i12 > abs) {
                t10 = t11;
                i12 = abs;
            }
        }
        return t10;
    }

    public Typeface a(Context context, c.b bVar, Resources resources, int i10) {
        throw null;
    }

    public Typeface b(Context context, f0.l[] lVarArr, int i10) {
        throw null;
    }

    public Typeface c(Context context, InputStream inputStream) {
        File d = m.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (!m.c(d, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(d.getPath());
            d.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        File d = m.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (!m.b(d, resources, i10)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(d.getPath());
            d.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public f0.l f(int i10, f0.l[] lVarArr) {
        return (f0.l) e(lVarArr, i10, new k());
    }
}

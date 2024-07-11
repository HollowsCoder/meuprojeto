package f;

import a0.b;
import a0.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.t0;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
public final class a {
    public static ColorStateList a(Context context, int i10) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        d.a aVar;
        Object obj = y.a.f9523a;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        d.b bVar = new d.b(resources, theme);
        synchronized (d.f24c) {
            SparseArray sparseArray = d.f23b.get(bVar);
            colorStateList = null;
            if (!(sparseArray == null || sparseArray.size() <= 0 || (aVar = (d.a) sparseArray.get(i10)) == null)) {
                if (aVar.f26b.equals(resources.getConfiguration())) {
                    colorStateList2 = aVar.f25a;
                } else {
                    sparseArray.remove(i10);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal<TypedValue> threadLocal = d.f22a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z = true;
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.type;
        if (i11 < 28 || i11 > 31) {
            z = false;
        }
        if (!z) {
            try {
                colorStateList = b.a(resources, resources.getXml(i10), theme);
            } catch (Exception e10) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i10, theme);
        }
        synchronized (d.f24c) {
            WeakHashMap<d.b, SparseArray<d.a>> weakHashMap = d.f23b;
            SparseArray sparseArray2 = weakHashMap.get(bVar);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                weakHashMap.put(bVar, sparseArray2);
            }
            sparseArray2.append(i10, new d.a(colorStateList, bVar.f27a.getConfiguration()));
        }
        return colorStateList;
    }

    public static Drawable b(Context context, int i10) {
        return t0.c().f(context, i10);
    }
}

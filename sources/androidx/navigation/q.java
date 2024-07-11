package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.navigation.p;
import b0.d;
import java.util.HashMap;

@SuppressLint({"TypeParameterUnusedInFormals"})
public final class q {

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<Class<?>, String> f1534b = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, p<? extends h>> f1535a = new HashMap<>();

    public static String b(Class<? extends p> cls) {
        boolean z;
        HashMap<Class<?>, String> hashMap = f1534b;
        String str = hashMap.get(cls);
        if (str == null) {
            p.a aVar = (p.a) cls.getAnnotation(p.a.class);
            if (aVar != null) {
                str = aVar.value();
            } else {
                str = null;
            }
            if (str == null || str.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                hashMap.put(cls, str);
            } else {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
            }
        }
        return str;
    }

    public final void a(p pVar) {
        boolean z;
        String b10 = b(pVar.getClass());
        if (b10 == null || b10.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            p put = this.f1535a.put(b10, pVar);
            return;
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    public final <T extends p<?>> T c(String str) {
        boolean z;
        if (str == null || str.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            T t10 = (p) this.f1535a.get(str);
            if (t10 != null) {
                return t10;
            }
            throw new IllegalStateException(d.f("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }
}

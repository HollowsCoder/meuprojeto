package r0;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.n;

public final class b extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f8333a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile b f8334b;

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f8335c;

    @SuppressLint({"PrivateApi"})
    public b() {
        try {
            f8335c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f8335c;
        if (cls != null) {
            return new n(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}

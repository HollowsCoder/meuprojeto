package e;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.t;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import n.i;

public class n {

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?>[] f4389b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f4390c = {16843375};
    public static final int[] d = {16844160};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f4391e = {16844156};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f4392f = {16844148};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f4393g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h  reason: collision with root package name */
    public static final i<String, Constructor<? extends View>> f4394h = new i<>();

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f4395a = new Object[2];

    public static class a implements View.OnClickListener {

        /* renamed from: o  reason: collision with root package name */
        public final View f4396o;

        /* renamed from: p  reason: collision with root package name */
        public final String f4397p;

        /* renamed from: q  reason: collision with root package name */
        public Method f4398q;

        /* renamed from: r  reason: collision with root package name */
        public Context f4399r;

        public a(View view, String str) {
            this.f4396o = view;
            this.f4397p = str;
        }

        public final void onClick(View view) {
            String str;
            Method method;
            if (this.f4398q == null) {
                View view2 = this.f4396o;
                Context context = view2.getContext();
                while (true) {
                    String str2 = this.f4397p;
                    if (context != null) {
                        try {
                            if (!context.isRestricted() && (method = context.getClass().getMethod(str2, new Class[]{View.class})) != null) {
                                this.f4398q = method;
                                this.f4399r = context;
                                break;
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                        if (context instanceof ContextWrapper) {
                            context = ((ContextWrapper) context).getBaseContext();
                        } else {
                            context = null;
                        }
                    } else {
                        int id = view2.getId();
                        if (id == -1) {
                            str = BuildConfig.FLAVOR;
                        } else {
                            str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                        }
                        throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                    }
                }
            }
            try {
                this.f4398q.invoke(this.f4399r, new Object[]{view});
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    public d a(Context context, AttributeSet attributeSet) {
        return new d(context, attributeSet);
    }

    public f b(Context context, AttributeSet attributeSet) {
        return new f(context, attributeSet);
    }

    public g c(Context context, AttributeSet attributeSet) {
        return new g(context, attributeSet);
    }

    public t d(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String str3;
        i<String, Constructor<? extends View>> iVar = f4394h;
        Constructor<? extends U> orDefault = iVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f4389b);
            iVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return (View) orDefault.newInstance(this.f4395a);
    }
}

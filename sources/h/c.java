package h;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.karumi.dexter.R;

public final class c extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public int f5059a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f5060b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f5061c;
    public Configuration d;

    /* renamed from: e  reason: collision with root package name */
    public Resources f5062e;

    public c() {
        super((Context) null);
    }

    public c(Context context, int i10) {
        super(context);
        this.f5059a = i10;
    }

    public c(Context context, Resources.Theme theme) {
        super(context);
        this.f5060b = theme;
    }

    public final void a(Configuration configuration) {
        if (this.f5062e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.d == null) {
            this.d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        boolean z;
        if (this.f5060b == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f5060b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f5060b.setTo(theme);
            }
        }
        this.f5060b.applyStyle(this.f5059a, true);
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final Resources getResources() {
        if (this.f5062e == null) {
            Configuration configuration = this.d;
            this.f5062e = configuration == null ? super.getResources() : createConfigurationContext(configuration).getResources();
        }
        return this.f5062e;
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f5061c == null) {
            this.f5061c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f5061c;
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f5060b;
        if (theme != null) {
            return theme;
        }
        if (this.f5059a == 0) {
            this.f5059a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f5060b;
    }

    public final void setTheme(int i10) {
        if (this.f5059a != i10) {
            this.f5059a = i10;
            b();
        }
    }
}

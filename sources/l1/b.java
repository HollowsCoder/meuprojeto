package l1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import h1.n;
import java.util.HashMap;
import java.util.Map;
import t1.c;

public final class b {
    public static final Object d = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Context f6867a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6868b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, n> f6869c;

    public b(Drawable.Callback callback, String str, Map map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            str = str.concat("/");
        }
        this.f6868b = str;
        if (!(callback instanceof View)) {
            c.b("LottieDrawable must be inside of a view for images to work.");
            this.f6869c = new HashMap();
            this.f6867a = null;
            return;
        }
        this.f6867a = ((View) callback).getContext();
        this.f6869c = map;
    }
}

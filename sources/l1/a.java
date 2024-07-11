package l1;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import m1.i;
import t1.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final i f6863a = new i(0);

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f6864b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f6865c = new HashMap();
    public final AssetManager d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6866e = ".ttf";

    public a(Drawable.Callback callback) {
        AssetManager assetManager;
        if (!(callback instanceof View)) {
            c.b("LottieDrawable must be inside of a view for images to work.");
            assetManager = null;
        } else {
            assetManager = ((View) callback).getContext().getAssets();
        }
        this.d = assetManager;
    }
}

package m0;

import android.content.Context;
import android.view.LayoutInflater;

public abstract class c extends a {

    /* renamed from: v  reason: collision with root package name */
    public final int f7026v;
    public final int w;

    /* renamed from: x  reason: collision with root package name */
    public final LayoutInflater f7027x;

    @Deprecated
    public c(Context context, int i10) {
        super(context);
        this.w = i10;
        this.f7026v = i10;
        this.f7027x = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}

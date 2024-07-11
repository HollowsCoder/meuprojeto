package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.j;
import com.karumi.dexter.R;

public abstract class a implements j {

    /* renamed from: o  reason: collision with root package name */
    public final Context f274o;

    /* renamed from: p  reason: collision with root package name */
    public Context f275p;

    /* renamed from: q  reason: collision with root package name */
    public f f276q;

    /* renamed from: r  reason: collision with root package name */
    public final LayoutInflater f277r;

    /* renamed from: s  reason: collision with root package name */
    public j.a f278s;

    /* renamed from: t  reason: collision with root package name */
    public final int f279t = R.layout.abc_action_menu_layout;
    public final int u = R.layout.abc_action_menu_item_layout;

    /* renamed from: v  reason: collision with root package name */
    public k f280v;

    public a(Context context) {
        this.f274o = context;
        this.f277r = LayoutInflater.from(context);
    }

    public final boolean d(h hVar) {
        return false;
    }

    public final void j(j.a aVar) {
        this.f278s = aVar;
    }

    public final boolean k(h hVar) {
        return false;
    }
}

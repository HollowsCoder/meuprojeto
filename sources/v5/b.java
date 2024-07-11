package v5;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final class b extends FloatingActionButton.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9130a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f9131b;

    public class a extends FloatingActionButton.a {
        public a() {
        }

        public final void b() {
            BottomAppBar bottomAppBar = b.this.f9131b;
            int i10 = BottomAppBar.f3254n0;
            bottomAppBar.getClass();
        }
    }

    public b(BottomAppBar bottomAppBar, int i10) {
        this.f9131b = bottomAppBar;
        this.f9130a = i10;
    }

    public final void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.f9131b.x(this.f9130a));
        floatingActionButton.n(new a(), true);
    }
}

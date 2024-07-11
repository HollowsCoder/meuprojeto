package v5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

public final class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9134a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f9135b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9136c;
    public final /* synthetic */ boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f9137e;

    public d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i10, boolean z) {
        this.f9137e = bottomAppBar;
        this.f9135b = actionMenuView;
        this.f9136c = i10;
        this.d = z;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f9134a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        boolean z;
        if (!this.f9134a) {
            BottomAppBar bottomAppBar = this.f9137e;
            int i10 = bottomAppBar.f3260k0;
            if (i10 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (i10 != 0) {
                bottomAppBar.f3260k0 = 0;
                bottomAppBar.getMenu().clear();
                bottomAppBar.k(i10);
            }
            bottomAppBar.A(this.f9135b, this.f9136c, this.d, z);
        }
    }
}

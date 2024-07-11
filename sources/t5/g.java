package t5;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import com.karumi.dexter.R;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f9016a = {16843848};

    public static void a(View view, float f10) {
        int integer = view.getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j8 = (long) integer;
        stateListAnimator.addState(new int[]{16842766, R.attr.state_liftable, -2130969469}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j8));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f10}).setDuration(j8));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }
}

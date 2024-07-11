package h6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<b> f5885a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public ValueAnimator f5886b = null;

    /* renamed from: c  reason: collision with root package name */
    public final a f5887c = new a();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public final void onAnimationEnd(Animator animator) {
            g gVar = g.this;
            if (gVar.f5886b == animator) {
                gVar.f5886b = null;
            }
        }
    }

    public static class b {
        public b(int[] iArr, ValueAnimator valueAnimator) {
        }
    }

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f5887c);
        this.f5885a.add(bVar);
    }
}

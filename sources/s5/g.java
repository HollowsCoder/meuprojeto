package s5;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import n.i;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final i<String, h> f8795a = new i<>();

    /* renamed from: b  reason: collision with root package name */
    public final i<String, PropertyValuesHolder[]> f8796b = new i<>();

    public static g a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static g b(Context context, int i10) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (loadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return c(arrayList);
        } catch (Exception e10) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e10);
            return null;
        }
    }

    public static g c(ArrayList arrayList) {
        g gVar = new g();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Animator animator = (Animator) arrayList.get(i10);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                gVar.f8796b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = a.f8785b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = a.f8786c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = a.d;
                }
                h hVar = new h(startDelay, duration, interpolator);
                hVar.d = objectAnimator.getRepeatCount();
                hVar.f8800e = objectAnimator.getRepeatMode();
                gVar.f8795a.put(propertyName, hVar);
                i10++;
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return gVar;
    }

    public final h d(String str) {
        boolean z;
        i<String, h> iVar = this.f8795a;
        if (iVar.getOrDefault(str, null) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return iVar.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f8795a.equals(((g) obj).f8795a);
    }

    public final int hashCode() {
        return this.f8795a.hashCode();
    }

    public final String toString() {
        return "\n" + g.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f8795a + "}\n";
    }
}

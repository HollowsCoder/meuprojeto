package d2;

import android.animation.TypeEvaluator;

public final class h implements TypeEvaluator<Double> {
    public final Object evaluate(float f10, Object obj, Object obj2) {
        double doubleValue = ((Number) obj).doubleValue();
        return Double.valueOf(((((Number) obj2).doubleValue() - doubleValue) * ((double) f10)) + doubleValue);
    }
}

package h8;

import com.google.gson.internal.reflect.ReflectionAccessor;
import java.lang.reflect.AccessibleObject;

public final class a extends ReflectionAccessor {
    public final void makeAccessible(AccessibleObject accessibleObject) {
        accessibleObject.setAccessible(true);
    }
}

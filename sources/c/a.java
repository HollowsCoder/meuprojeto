package c;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import z8.g;

public abstract class a<I, O> {

    /* renamed from: c.a$a  reason: collision with other inner class name */
    public static final class C0025a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f2064a;

        public C0025a(T t10) {
            this.f2064a = t10;
        }
    }

    public abstract Intent a(ComponentActivity componentActivity, Intent intent);

    public C0025a b(ComponentActivity componentActivity, Intent intent) {
        g.f(componentActivity, "context");
        return null;
    }

    public abstract Object c(Intent intent, int i10);
}

package y9;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

public class y {

    /* renamed from: c  reason: collision with root package name */
    public static final y f9770c;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9771a = true;

    /* renamed from: b  reason: collision with root package name */
    public final Constructor<MethodHandles.Lookup> f9772b;

    public static final class a extends y {

        /* renamed from: y9.y$a$a  reason: collision with other inner class name */
        public static final class C0170a implements Executor {

            /* renamed from: o  reason: collision with root package name */
            public final Handler f9773o = new Handler(Looper.getMainLooper());

            public final void execute(Runnable runnable) {
                this.f9773o.post(runnable);
            }
        }

        public final Executor a() {
            return new C0170a();
        }

        public final Object b(Method method, Class<?> cls, Object obj, Object... objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return y.super.b(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    static {
        y yVar;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            yVar = new a();
        } else {
            yVar = new y();
        }
        f9770c = yVar;
    }

    public y() {
        Constructor<MethodHandles.Lookup> constructor;
        Class<MethodHandles.Lookup> cls = MethodHandles.Lookup.class;
        try {
            constructor = cls.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            try {
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        } catch (NoClassDefFoundError | NoSuchMethodException unused2) {
            constructor = null;
        }
        this.f9772b = constructor;
    }

    public Executor a() {
        return null;
    }

    @IgnoreJRERequirement
    public Object b(Method method, Class<?> cls, Object obj, Object... objArr) {
        MethodHandles.Lookup lookup;
        Constructor<MethodHandles.Lookup> constructor = this.f9772b;
        if (constructor != null) {
            lookup = constructor.newInstance(new Object[]{cls, -1});
        } else {
            lookup = MethodHandles.lookup();
        }
        return lookup.unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}

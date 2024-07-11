package y6;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import t7.e;
import v7.b;

public final /* synthetic */ class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9566a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9567b;

    public /* synthetic */ d(int i10, Object obj) {
        this.f9566a = i10;
        this.f9567b = obj;
    }

    public final Object get() {
        e eVar;
        switch (this.f9566a) {
            case 0:
                String str = (String) this.f9567b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (f.class.isAssignableFrom(cls)) {
                        return (f) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    }
                    throw new n(String.format("Class %s is not an instance of %s", new Object[]{str, "com.google.firebase.components.ComponentRegistrar"}));
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[]{str}));
                    return null;
                } catch (IllegalAccessException e10) {
                    throw new n(String.format("Could not instantiate %s.", new Object[]{str}), e10);
                } catch (InstantiationException e11) {
                    throw new n(String.format("Could not instantiate %s.", new Object[]{str}), e11);
                } catch (NoSuchMethodException e12) {
                    throw new n(String.format("Could not instantiate %s", new Object[]{str}), e12);
                } catch (InvocationTargetException e13) {
                    throw new n(String.format("Could not instantiate %s", new Object[]{str}), e13);
                }
            case 1:
                return (f) this.f9567b;
            default:
                Context context = (Context) this.f9567b;
                e eVar2 = e.f9029b;
                synchronized (e.class) {
                    if (e.f9029b == null) {
                        e.f9029b = new e(context);
                    }
                    eVar = e.f9029b;
                }
                return eVar;
        }
    }
}

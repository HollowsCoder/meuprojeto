package s8;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import n.e;
import n8.i;
import q8.d;
import s8.f;
import z8.g;

public abstract class a implements d<Object>, d, Serializable {

    /* renamed from: o  reason: collision with root package name */
    public final d<Object> f8832o;

    public a(d<Object> dVar) {
        this.f8832o = dVar;
    }

    public d<i> a(Object obj, d<?> dVar) {
        g.f(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public final StackTraceElement d() {
        int i10;
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Integer num;
        int i11;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v10 = eVar.v();
        if (v10 <= 1) {
            int i12 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj4 = declaredField.get(this);
                if (obj4 instanceof Integer) {
                    num = (Integer) obj4;
                } else {
                    num = null;
                }
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = 0;
                }
                i10 = i11 - 1;
            } catch (Exception unused) {
                i10 = -1;
            }
            if (i10 >= 0) {
                i12 = eVar.l()[i10];
            }
            f.a aVar = f.f8837b;
            f.a aVar2 = f.f8836a;
            if (aVar == null) {
                try {
                    f.a aVar3 = new f.a(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                    f.f8837b = aVar3;
                    aVar = aVar3;
                } catch (Exception unused2) {
                    f.f8837b = aVar2;
                    aVar = aVar2;
                }
            }
            if (aVar != aVar2) {
                Method method = aVar.f8838a;
                if (method != null) {
                    obj = method.invoke(getClass(), new Object[0]);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    Method method2 = aVar.f8839b;
                    if (method2 != null) {
                        obj2 = method2.invoke(obj, new Object[0]);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        Method method3 = aVar.f8840c;
                        if (method3 != null) {
                            obj3 = method3.invoke(obj2, new Object[0]);
                        } else {
                            obj3 = null;
                        }
                        if (obj3 instanceof String) {
                            str2 = (String) obj3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = eVar.c();
            } else {
                str = str2 + '/' + eVar.c();
            }
            return new StackTraceElement(str, eVar.m(), eVar.f(), i12);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v10 + ". Please update the Kotlin standard library.").toString());
    }

    public final d e() {
        d<Object> dVar = this.f8832o;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public abstract Object f(Object obj);

    public void g() {
    }

    public final void h(Object obj) {
        d dVar = this;
        while (true) {
            a aVar = (a) dVar;
            d dVar2 = aVar.f8832o;
            g.c(dVar2);
            try {
                obj = aVar.f(obj);
                if (obj == r8.a.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = e.s(th);
            }
            aVar.g();
            if (dVar2 instanceof a) {
                dVar = dVar2;
            } else {
                dVar2.h(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object d = d();
        if (d == null) {
            d = getClass().getName();
        }
        sb.append(d);
        return sb.toString();
    }
}

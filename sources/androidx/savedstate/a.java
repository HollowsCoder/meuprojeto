package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import androidx.savedstate.Recreator;
import k.b;

@SuppressLint({"RestrictedApi"})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final k.b<String, b> f1879a = new k.b<>();

    /* renamed from: b  reason: collision with root package name */
    public Bundle f1880b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1881c;
    public Recreator.a d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1882e = true;

    /* renamed from: androidx.savedstate.a$a  reason: collision with other inner class name */
    public interface C0022a {
        void a(c cVar);
    }

    public interface b {
        Bundle a();
    }

    public final Bundle a(String str) {
        if (this.f1881c) {
            Bundle bundle = this.f1880b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f1880b.remove(str);
            if (this.f1880b.isEmpty()) {
                this.f1880b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public final void b(String str, b bVar) {
        V v10;
        k.b<String, b> bVar2 = this.f1879a;
        b.c<String, b> e10 = bVar2.e(str);
        if (e10 != null) {
            v10 = e10.f6614p;
        } else {
            b.c<K, V> cVar = new b.c<>(str, bVar);
            bVar2.f6612r++;
            b.c<K, V> cVar2 = bVar2.f6610p;
            if (cVar2 == null) {
                bVar2.f6609o = cVar;
            } else {
                cVar2.f6615q = cVar;
                cVar.f6616r = cVar2;
            }
            bVar2.f6610p = cVar;
            v10 = null;
        }
        if (((b) v10) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void c() {
        Class<SavedStateHandleController.a> cls = SavedStateHandleController.a.class;
        if (this.f1882e) {
            if (this.d == null) {
                this.d = new Recreator.a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.a aVar = this.d;
                aVar.f1877a.add(cls.getName());
            } catch (NoSuchMethodException e10) {
                throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }
}

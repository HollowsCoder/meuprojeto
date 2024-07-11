package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MergedDataBinderMapper extends b {

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f990a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f991b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList f992c = new CopyOnWriteArrayList();

    public final ViewDataBinding b(View view, int i10) {
        Iterator it = this.f991b.iterator();
        while (it.hasNext()) {
            ViewDataBinding b10 = ((b) it.next()).b(view, i10);
            if (b10 != null) {
                return b10;
            }
        }
        if (e()) {
            return b(view, i10);
        }
        return null;
    }

    public final ViewDataBinding c(View[] viewArr, int i10) {
        Iterator it = this.f991b.iterator();
        while (it.hasNext()) {
            ViewDataBinding c10 = ((b) it.next()).c(viewArr, i10);
            if (c10 != null) {
                return c10;
            }
        }
        if (e()) {
            return c(viewArr, i10);
        }
        return null;
    }

    public final void d(b bVar) {
        if (this.f990a.add(bVar.getClass())) {
            this.f991b.add(bVar);
            for (b d : bVar.a()) {
                d(d);
            }
        }
    }

    public final boolean e() {
        StringBuilder sb;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f992c;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Class<?> cls = Class.forName(str);
                if (b.class.isAssignableFrom(cls)) {
                    d((b) cls.newInstance());
                    copyOnWriteArrayList.remove(str);
                    z = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e10) {
                e = e10;
                sb = new StringBuilder("unable to add feature mapper for ");
                sb.append(str);
                Log.e("MergedDataBinderMapper", sb.toString(), e);
            } catch (InstantiationException e11) {
                e = e11;
                sb = new StringBuilder("unable to add feature mapper for ");
                sb.append(str);
                Log.e("MergedDataBinderMapper", sb.toString(), e);
            }
        }
        return z;
    }
}

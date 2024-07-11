package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.activity.result.c;

public abstract class v<E> extends c {

    /* renamed from: o  reason: collision with root package name */
    public final Activity f1299o;

    /* renamed from: p  reason: collision with root package name */
    public final Context f1300p;

    /* renamed from: q  reason: collision with root package name */
    public final Handler f1301q;

    /* renamed from: r  reason: collision with root package name */
    public final z f1302r = new z();

    public v(q qVar) {
        Handler handler = new Handler();
        this.f1299o = qVar;
        if (qVar != null) {
            this.f1300p = qVar;
            this.f1301q = handler;
            return;
        }
        throw new NullPointerException("context == null");
    }

    public abstract q E();

    public abstract LayoutInflater F();

    public abstract void G();
}

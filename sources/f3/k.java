package f3;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.b;
import com.bumptech.glide.m;
import java.util.HashSet;

@Deprecated
public final class k extends Fragment {

    /* renamed from: o  reason: collision with root package name */
    public final a f4604o;

    /* renamed from: p  reason: collision with root package name */
    public final a f4605p = new a();

    /* renamed from: q  reason: collision with root package name */
    public final HashSet f4606q = new HashSet();

    /* renamed from: r  reason: collision with root package name */
    public m f4607r;

    /* renamed from: s  reason: collision with root package name */
    public k f4608s;

    /* renamed from: t  reason: collision with root package name */
    public Fragment f4609t;

    public class a implements m {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + k.this + "}";
        }
    }

    public k() {
        a aVar = new a();
        this.f4604o = aVar;
    }

    public final void a(Activity activity) {
        k kVar = this.f4608s;
        if (kVar != null) {
            kVar.f4606q.remove(this);
            this.f4608s = null;
        }
        l lVar = b.b(activity).f2237t;
        lVar.getClass();
        k h10 = lVar.h(activity.getFragmentManager(), (Fragment) null);
        this.f4608s = h10;
        if (!equals(h10)) {
            this.f4608s.f4606q.add(this);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e10) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e10);
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f4604o.c();
        k kVar = this.f4608s;
        if (kVar != null) {
            kVar.f4606q.remove(this);
            this.f4608s = null;
        }
    }

    public final void onDetach() {
        super.onDetach();
        k kVar = this.f4608s;
        if (kVar != null) {
            kVar.f4606q.remove(this);
            this.f4608s = null;
        }
    }

    public final void onStart() {
        super.onStart();
        this.f4604o.d();
    }

    public final void onStop() {
        super.onStop();
        this.f4604o.e();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f4609t;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}

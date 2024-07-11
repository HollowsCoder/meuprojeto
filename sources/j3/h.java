package j3;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.karumi.dexter.R;
import i3.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@Deprecated
public abstract class h<T extends View, Z> extends a<Z> {

    /* renamed from: o  reason: collision with root package name */
    public final T f6525o;

    /* renamed from: p  reason: collision with root package name */
    public final a f6526p;

    public static final class a {
        public static Integer d;

        /* renamed from: a  reason: collision with root package name */
        public final View f6527a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f6528b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public C0088a f6529c;

        /* renamed from: j3.h$a$a  reason: collision with other inner class name */
        public static final class C0088a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: o  reason: collision with root package name */
            public final WeakReference<a> f6530o;

            public C0088a(a aVar) {
                this.f6530o = new WeakReference<>(aVar);
            }

            public final boolean onPreDraw() {
                boolean z;
                boolean z10;
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f6530o.get();
                if (aVar != null) {
                    ArrayList arrayList = aVar.f6528b;
                    if (!arrayList.isEmpty()) {
                        int c10 = aVar.c();
                        int b10 = aVar.b();
                        boolean z11 = false;
                        if (c10 > 0 || c10 == Integer.MIN_VALUE) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if (b10 > 0 || b10 == Integer.MIN_VALUE) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                z11 = true;
                            }
                        }
                        if (z11) {
                            Iterator it = new ArrayList(arrayList).iterator();
                            while (it.hasNext()) {
                                ((f) it.next()).b(c10, b10);
                            }
                            ViewTreeObserver viewTreeObserver = aVar.f6527a.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnPreDrawListener(aVar.f6529c);
                            }
                            aVar.f6529c = null;
                            arrayList.clear();
                        }
                    }
                }
                return true;
            }
        }

        public a(View view) {
            this.f6527a = view;
        }

        public final int a(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            View view = this.f6527a;
            if (view.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = view.getContext();
            if (d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                s6.a.n(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return d.intValue();
        }

        public final int b() {
            View view = this.f6527a;
            int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            return a(view.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        public final int c() {
            View view = this.f6527a;
            int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            return a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }
    }

    public h(T t10) {
        s6.a.n(t10);
        this.f6525o = t10;
        this.f6526p = new a(t10);
    }

    public final void c(f fVar) {
        boolean z;
        boolean z10;
        a aVar = this.f6526p;
        int c10 = aVar.c();
        int b10 = aVar.b();
        boolean z11 = false;
        if (c10 > 0 || c10 == Integer.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (b10 > 0 || b10 == Integer.MIN_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        if (z11) {
            fVar.b(c10, b10);
            return;
        }
        ArrayList arrayList = aVar.f6528b;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
        if (aVar.f6529c == null) {
            ViewTreeObserver viewTreeObserver = aVar.f6527a.getViewTreeObserver();
            a.C0088a aVar2 = new a.C0088a(aVar);
            aVar.f6529c = aVar2;
            viewTreeObserver.addOnPreDrawListener(aVar2);
        }
    }

    public final void e(f fVar) {
        this.f6526p.f6528b.remove(fVar);
    }

    public final void g(c cVar) {
        this.f6525o.setTag(R.id.glide_custom_view_target_tag, cVar);
    }

    public final c h() {
        Object tag = this.f6525o.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof c) {
            return (c) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public void i(Drawable drawable) {
        a aVar = this.f6526p;
        ViewTreeObserver viewTreeObserver = aVar.f6527a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(aVar.f6529c);
        }
        aVar.f6529c = null;
        aVar.f6528b.clear();
    }

    public final String toString() {
        return "Target for: " + this.f6525o;
    }
}

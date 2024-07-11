package ooo.oxo.library.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.appfab.facematchlive.ui.flow.imagezoom.ImageZoomActivity;
import com.karumi.dexter.BuildConfig;
import i0.b0;
import i0.w;
import java.util.WeakHashMap;
import o0.c;
import z8.g;

public class PullBackLayout extends FrameLayout {

    /* renamed from: o  reason: collision with root package name */
    public final c f7796o;

    /* renamed from: p  reason: collision with root package name */
    public final int f7797p;

    /* renamed from: q  reason: collision with root package name */
    public a f7798q;

    public interface a {
    }

    public class b extends c.C0108c {
        public b() {
        }

        public final int a(View view, int i10) {
            return 0;
        }

        public final int b(View view, int i10) {
            return Math.max(0, i10);
        }

        public final int c(View view) {
            return 0;
        }

        public final int d() {
            return PullBackLayout.this.getHeight();
        }

        public final void e(View view, int i10) {
            a aVar = PullBackLayout.this.f7798q;
        }

        public final void g(View view, int i10, int i11) {
            PullBackLayout pullBackLayout = PullBackLayout.this;
            a aVar = pullBackLayout.f7798q;
            if (aVar != null) {
                float height = ((float) i11) / ((float) pullBackLayout.getHeight());
                T t10 = ImageZoomActivity.this.E;
                g.c(t10);
                ((x1.c) t10).M0.setAlpha(1.0f - (height * 2.0f));
            }
        }

        public final void h(View view, float f10, float f11) {
            int i10;
            PullBackLayout pullBackLayout = PullBackLayout.this;
            if (f11 > ((float) pullBackLayout.f7797p)) {
                i10 = pullBackLayout.getHeight() / 6;
            } else {
                i10 = pullBackLayout.getHeight() / 3;
            }
            if (view.getTop() > i10) {
                a aVar = pullBackLayout.f7798q;
                if (aVar != null) {
                    ImageZoomActivity imageZoomActivity = ImageZoomActivity.this;
                    imageZoomActivity.getClass();
                    imageZoomActivity.finish();
                    j2.a.f6520b = BuildConfig.FLAVOR;
                    return;
                }
                return;
            }
            a aVar2 = pullBackLayout.f7798q;
            if (aVar2 != null) {
                T t10 = ImageZoomActivity.this.E;
                g.c(t10);
                ((x1.c) t10).M0.setAlpha(1.0f);
            }
            pullBackLayout.f7796o.q(0, 0);
            pullBackLayout.invalidate();
        }

        public final boolean i(View view, int i10) {
            return true;
        }
    }

    public PullBackLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        c cVar = new c(getContext(), this, new b());
        cVar.f7587b = (int) (((float) cVar.f7587b) * 8.0f);
        this.f7796o = cVar;
        this.f7797p = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
    }

    public final void computeScroll() {
        if (this.f7796o.g()) {
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            w.d.k(this);
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f7796o.r(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f7796o.k(motionEvent);
        return true;
    }

    public void setCallback(a aVar) {
        this.f7798q = aVar;
    }
}

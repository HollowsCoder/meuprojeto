package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import j0.b;
import j0.c;
import java.util.WeakHashMap;

public final class x extends i0.a {
    public final RecyclerView d;

    /* renamed from: e  reason: collision with root package name */
    public final a f1867e;

    public static class a extends i0.a {
        public final x d;

        /* renamed from: e  reason: collision with root package name */
        public final WeakHashMap f1868e = new WeakHashMap();

        public a(x xVar) {
            this.d = xVar;
        }

        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            i0.a aVar = (i0.a) this.f1868e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        public final c b(View view) {
            i0.a aVar = (i0.a) this.f1868e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            i0.a aVar = (i0.a) this.f1868e.get(view);
            if (aVar != null) {
                aVar.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        public final void d(View view, b bVar) {
            boolean z;
            x xVar = this.d;
            RecyclerView recyclerView = xVar.d;
            if (!recyclerView.I || recyclerView.R || recyclerView.f1588r.g()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                RecyclerView recyclerView2 = xVar.d;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().W(view, bVar);
                    i0.a aVar = (i0.a) this.f1868e.get(view);
                    if (aVar != null) {
                        aVar.d(view, bVar);
                        return;
                    }
                }
            }
            this.f5951a.onInitializeAccessibilityNodeInfo(view, bVar.f6386a);
        }

        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            i0.a aVar = (i0.a) this.f1868e.get(view);
            if (aVar != null) {
                aVar.e(view, accessibilityEvent);
            } else {
                super.e(view, accessibilityEvent);
            }
        }

        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            i0.a aVar = (i0.a) this.f1868e.get(viewGroup);
            return aVar != null ? aVar.f(viewGroup, view, accessibilityEvent) : super.f(viewGroup, view, accessibilityEvent);
        }

        public final boolean g(View view, int i10, Bundle bundle) {
            boolean z;
            x xVar = this.d;
            RecyclerView recyclerView = xVar.d;
            if (!recyclerView.I || recyclerView.R || recyclerView.f1588r.g()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                RecyclerView recyclerView2 = xVar.d;
                if (recyclerView2.getLayoutManager() != null) {
                    i0.a aVar = (i0.a) this.f1868e.get(view);
                    if (aVar != null) {
                        if (aVar.g(view, i10, bundle)) {
                            return true;
                        }
                    } else if (super.g(view, i10, bundle)) {
                        return true;
                    }
                    RecyclerView.u uVar = recyclerView2.getLayoutManager().f1640b.f1584p;
                    return false;
                }
            }
            return super.g(view, i10, bundle);
        }

        public final void h(View view, int i10) {
            i0.a aVar = (i0.a) this.f1868e.get(view);
            if (aVar != null) {
                aVar.h(view, i10);
            } else {
                super.h(view, i10);
            }
        }

        public final void i(View view, AccessibilityEvent accessibilityEvent) {
            i0.a aVar = (i0.a) this.f1868e.get(view);
            if (aVar != null) {
                aVar.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }
    }

    public x(RecyclerView recyclerView) {
        this.d = recyclerView;
        a aVar = this.f1867e;
        this.f1867e = aVar == null ? new a(this) : aVar;
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        super.c(view, accessibilityEvent);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = this.d;
            if (!recyclerView.I || recyclerView.R || recyclerView.f1588r.g()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                RecyclerView recyclerView2 = (RecyclerView) view;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().U(accessibilityEvent);
                }
            }
        }
    }

    public final void d(View view, b bVar) {
        boolean z;
        this.f5951a.onInitializeAccessibilityNodeInfo(view, bVar.f6386a);
        RecyclerView recyclerView = this.d;
        if (!recyclerView.I || recyclerView.R || recyclerView.f1588r.g()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && recyclerView.getLayoutManager() != null) {
            RecyclerView.n layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f1640b;
            layoutManager.V(recyclerView2.f1584p, recyclerView2.f1595v0, bVar);
        }
    }

    public final boolean g(View view, int i10, Bundle bundle) {
        boolean z = true;
        if (super.g(view, i10, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.I && !recyclerView.R && !recyclerView.f1588r.g()) {
            z = false;
        }
        if (z || recyclerView.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.n layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f1640b;
        return layoutManager.i0(recyclerView2.f1584p, recyclerView2.f1595v0, i10, bundle);
    }
}

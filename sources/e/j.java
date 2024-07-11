package e;

import i0.c0;

public final class j implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ g f4383o;

    public class a extends androidx.databinding.a {
        public a() {
        }

        public final void a() {
            j jVar = j.this;
            jVar.f4383o.C.setAlpha(1.0f);
            g gVar = jVar.f4383o;
            gVar.F.d((c0) null);
            gVar.F = null;
        }

        public final void k() {
            j.this.f4383o.C.setVisibility(0);
        }
    }

    public j(g gVar) {
        this.f4383o = gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            e.g r0 = r5.f4383o
            android.widget.PopupWindow r1 = r0.D
            androidx.appcompat.widget.ActionBarContextView r2 = r0.C
            r3 = 55
            r4 = 0
            r1.showAtLocation(r2, r3, r4, r4)
            i0.b0 r1 = r0.F
            if (r1 == 0) goto L_0x0013
            r1.b()
        L_0x0013:
            boolean r1 = r0.H
            if (r1 == 0) goto L_0x0025
            android.view.ViewGroup r1 = r0.I
            if (r1 == 0) goto L_0x0025
            java.util.WeakHashMap<android.view.View, i0.b0> r2 = i0.w.f6004a
            boolean r1 = i0.w.g.c(r1)
            if (r1 == 0) goto L_0x0025
            r1 = 1
            goto L_0x0026
        L_0x0025:
            r1 = r4
        L_0x0026:
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x0044
            androidx.appcompat.widget.ActionBarContextView r1 = r0.C
            r3 = 0
            r1.setAlpha(r3)
            androidx.appcompat.widget.ActionBarContextView r1 = r0.C
            i0.b0 r1 = i0.w.a(r1)
            r1.a(r2)
            r0.F = r1
            e.j$a r0 = new e.j$a
            r0.<init>()
            r1.d(r0)
            goto L_0x004e
        L_0x0044:
            androidx.appcompat.widget.ActionBarContextView r1 = r0.C
            r1.setAlpha(r2)
            androidx.appcompat.widget.ActionBarContextView r0 = r0.C
            r0.setVisibility(r4)
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.run():void");
    }
}

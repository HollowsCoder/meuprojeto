package androidx.activity;

import android.annotation.SuppressLint;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f168a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<g> f169b = new ArrayDeque<>();

    public class LifecycleOnBackPressedCancellable implements l, a {

        /* renamed from: o  reason: collision with root package name */
        public final h f170o;

        /* renamed from: p  reason: collision with root package name */
        public final g f171p;

        /* renamed from: q  reason: collision with root package name */
        public a f172q;

        public LifecycleOnBackPressedCancellable(h hVar, g gVar) {
            this.f170o = hVar;
            this.f171p = gVar;
            hVar.a(this);
        }

        public final void cancel() {
            this.f170o.b(this);
            this.f171p.f187b.remove(this);
            a aVar = this.f172q;
            if (aVar != null) {
                aVar.cancel();
                this.f172q = null;
            }
        }

        public final void f(n nVar, h.b bVar) {
            if (bVar == h.b.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                ArrayDeque<g> arrayDeque = onBackPressedDispatcher.f169b;
                g gVar = this.f171p;
                arrayDeque.add(gVar);
                a aVar = new a(gVar);
                gVar.f187b.add(aVar);
                this.f172q = aVar;
            } else if (bVar == h.b.ON_STOP) {
                a aVar2 = this.f172q;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (bVar == h.b.ON_DESTROY) {
                cancel();
            }
        }
    }

    public class a implements a {

        /* renamed from: o  reason: collision with root package name */
        public final g f174o;

        public a(g gVar) {
            this.f174o = gVar;
        }

        public final void cancel() {
            ArrayDeque<g> arrayDeque = OnBackPressedDispatcher.this.f169b;
            g gVar = this.f174o;
            arrayDeque.remove(gVar);
            gVar.f187b.remove(this);
        }
    }

    public OnBackPressedDispatcher(ComponentActivity.a aVar) {
        this.f168a = aVar;
    }

    @SuppressLint({"LambdaLast"})
    public final void a(n nVar, g gVar) {
        o r5 = nVar.r();
        if (r5.f1394c != h.c.DESTROYED) {
            gVar.f187b.add(new LifecycleOnBackPressedCancellable(r5, gVar));
        }
    }

    public final void b() {
        Iterator<g> descendingIterator = this.f169b.descendingIterator();
        while (descendingIterator.hasNext()) {
            g next = descendingIterator.next();
            if (next.f186a) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.f168a;
        if (runnable != null) {
            runnable.run();
        }
    }
}

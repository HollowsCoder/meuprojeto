package m5;

import com.google.android.gms.common.api.internal.LifecycleCallback;
import f3.n;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import l4.f;
import n4.m;

public final class r<TResult> extends i<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7112a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final n f7113b = new n(1);

    /* renamed from: c  reason: collision with root package name */
    public boolean f7114c;
    public volatile boolean d;

    /* renamed from: e  reason: collision with root package name */
    public TResult f7115e;

    /* renamed from: f  reason: collision with root package name */
    public Exception f7116f;

    public static class a extends LifecycleCallback {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f7117a = new ArrayList();

        public a(f fVar) {
            super(fVar);
            fVar.a(this);
        }

        public final void a() {
            synchronized (this.f7117a) {
                Iterator it = this.f7117a.iterator();
                while (it.hasNext()) {
                    p pVar = (p) ((WeakReference) it.next()).get();
                    if (pVar != null) {
                        pVar.d();
                    }
                }
                this.f7117a.clear();
            }
        }
    }

    public final void a(Executor executor, c cVar) {
        this.f7113b.e(new o(executor, cVar));
        u();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: l4.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: l4.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: l4.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: l4.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: l4.i0} */
    /* JADX WARNING: type inference failed for: r2v14, types: [androidx.fragment.app.n, l4.i0] */
    /* JADX WARNING: type inference failed for: r2v16, types: [androidx.fragment.app.n, l4.i0] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r3 != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0079, code lost:
        if (r2 != null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008c, code lost:
        if (r3 != false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r2 != null) goto L_0x00aa;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.app.Activity r7, d2.b r8) {
        /*
            r6 = this;
            m5.m r0 = new m5.m
            m5.k$a r1 = m5.k.f7090a
            r0.<init>((java.util.concurrent.Executor) r1, (m5.d) r8)
            f3.n r8 = r6.f7113b
            r8.e(r0)
            java.lang.String r8 = "Activity must not be null"
            if (r7 == 0) goto L_0x00d5
            boolean r8 = r7 instanceof androidx.fragment.app.q
            if (r8 == 0) goto L_0x0067
            androidx.fragment.app.q r7 = (androidx.fragment.app.q) r7
            java.lang.String r8 = "SupportLifecycleFragmentImpl"
            java.util.WeakHashMap<androidx.fragment.app.q, java.lang.ref.WeakReference<l4.i0>> r1 = l4.i0.f6920k0
            java.lang.Object r2 = r1.get(r7)
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            if (r2 == 0) goto L_0x002c
            java.lang.Object r2 = r2.get()
            l4.i0 r2 = (l4.i0) r2
            if (r2 == 0) goto L_0x002c
            goto L_0x00aa
        L_0x002c:
            androidx.fragment.app.z r2 = r7.w()     // Catch:{ ClassCastException -> 0x005e }
            androidx.fragment.app.n r2 = r2.D(r8)     // Catch:{ ClassCastException -> 0x005e }
            l4.i0 r2 = (l4.i0) r2     // Catch:{ ClassCastException -> 0x005e }
            if (r2 == 0) goto L_0x003c
            boolean r3 = r2.z
            if (r3 == 0) goto L_0x0055
        L_0x003c:
            l4.i0 r2 = new l4.i0
            r2.<init>()
            androidx.fragment.app.z r3 = r7.w()
            r3.getClass()
            androidx.fragment.app.a r4 = new androidx.fragment.app.a
            r4.<init>(r3)
            r3 = 0
            r5 = 1
            r4.f(r3, r2, r8, r5)
            r4.e(r5)
        L_0x0055:
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference
            r8.<init>(r2)
            r1.put(r7, r8)
            goto L_0x00aa
        L_0x005e:
            r7 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl"
            r8.<init>(r0, r7)
            throw r8
        L_0x0067:
            java.lang.String r8 = "LifecycleFragmentImpl"
            java.util.WeakHashMap<android.app.Activity, java.lang.ref.WeakReference<l4.h0>> r1 = l4.h0.f6916r
            java.lang.Object r2 = r1.get(r7)
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            if (r2 == 0) goto L_0x007c
            java.lang.Object r2 = r2.get()
            l4.h0 r2 = (l4.h0) r2
            if (r2 == 0) goto L_0x007c
            goto L_0x00aa
        L_0x007c:
            android.app.FragmentManager r2 = r7.getFragmentManager()     // Catch:{ ClassCastException -> 0x00cc }
            android.app.Fragment r2 = r2.findFragmentByTag(r8)     // Catch:{ ClassCastException -> 0x00cc }
            l4.h0 r2 = (l4.h0) r2     // Catch:{ ClassCastException -> 0x00cc }
            if (r2 == 0) goto L_0x008e
            boolean r3 = r2.isRemoving()
            if (r3 == 0) goto L_0x00a2
        L_0x008e:
            l4.h0 r2 = new l4.h0
            r2.<init>()
            android.app.FragmentManager r3 = r7.getFragmentManager()
            android.app.FragmentTransaction r3 = r3.beginTransaction()
            android.app.FragmentTransaction r8 = r3.add(r2, r8)
            r8.commitAllowingStateLoss()
        L_0x00a2:
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference
            r8.<init>(r2)
            r1.put(r7, r8)
        L_0x00aa:
            com.google.android.gms.common.api.internal.LifecycleCallback r7 = r2.e()
            m5.r$a r7 = (m5.r.a) r7
            if (r7 != 0) goto L_0x00b7
            m5.r$a r7 = new m5.r$a
            r7.<init>(r2)
        L_0x00b7:
            java.util.ArrayList r8 = r7.f7117a
            monitor-enter(r8)
            java.util.ArrayList r7 = r7.f7117a     // Catch:{ all -> 0x00c9 }
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x00c9 }
            r1.<init>(r0)     // Catch:{ all -> 0x00c9 }
            r7.add(r1)     // Catch:{ all -> 0x00c9 }
            monitor-exit(r8)     // Catch:{ all -> 0x00c9 }
            r6.u()
            return
        L_0x00c9:
            r7 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00c9 }
            throw r7
        L_0x00cc:
            r7 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl"
            r8.<init>(r0, r7)
            throw r8
        L_0x00d5:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.r.b(android.app.Activity, d2.b):void");
    }

    public final r c(Executor executor, e eVar) {
        this.f7113b.e(new m(executor, eVar));
        u();
        return this;
    }

    public final r d(Executor executor, f fVar) {
        this.f7113b.e(new n(executor, fVar));
        u();
        return this;
    }

    public final <TContinuationResult> i<TContinuationResult> e(Executor executor, a<TResult, TContinuationResult> aVar) {
        r rVar = new r();
        this.f7113b.e(new m(executor, aVar, rVar));
        u();
        return rVar;
    }

    public final void f(a aVar) {
        e(k.f7090a, aVar);
    }

    public final <TContinuationResult> i<TContinuationResult> g(Executor executor, a<TResult, i<TContinuationResult>> aVar) {
        r rVar = new r();
        this.f7113b.e(new n(executor, aVar, rVar, 0));
        u();
        return rVar;
    }

    public final Exception h() {
        Exception exc;
        synchronized (this.f7112a) {
            exc = this.f7116f;
        }
        return exc;
    }

    public final TResult i() {
        TResult tresult;
        synchronized (this.f7112a) {
            m.j("Task is not yet complete", this.f7114c);
            if (this.d) {
                throw new CancellationException("Task is already canceled.");
            } else if (this.f7116f == null) {
                tresult = this.f7115e;
            } else {
                throw new g(this.f7116f);
            }
        }
        return tresult;
    }

    public final Object j() {
        TResult tresult;
        Class<IOException> cls = IOException.class;
        synchronized (this.f7112a) {
            m.j("Task is not yet complete", this.f7114c);
            if (this.d) {
                throw new CancellationException("Task is already canceled.");
            } else if (cls.isInstance(this.f7116f)) {
                throw cls.cast(this.f7116f);
            } else if (this.f7116f == null) {
                tresult = this.f7115e;
            } else {
                throw new g(this.f7116f);
            }
        }
        return tresult;
    }

    public final boolean k() {
        return this.d;
    }

    public final boolean l() {
        boolean z;
        synchronized (this.f7112a) {
            z = this.f7114c;
        }
        return z;
    }

    public final boolean m() {
        boolean z;
        synchronized (this.f7112a) {
            z = this.f7114c && !this.d && this.f7116f == null;
        }
        return z;
    }

    public final <TContinuationResult> i<TContinuationResult> n(Executor executor, h<TResult, TContinuationResult> hVar) {
        r rVar = new r();
        this.f7113b.e(new n(executor, hVar, rVar, 2));
        u();
        return rVar;
    }

    public final <TContinuationResult> i<TContinuationResult> o(h<TResult, TContinuationResult> hVar) {
        return n(k.f7090a, hVar);
    }

    public final r p(Executor executor, d dVar) {
        this.f7113b.e(new m(executor, dVar));
        u();
        return this;
    }

    public final void q() {
        synchronized (this.f7112a) {
            if (!this.f7114c) {
                this.f7114c = true;
                this.d = true;
                this.f7113b.d(this);
            }
        }
    }

    public final void r(Exception exc) {
        if (exc != null) {
            synchronized (this.f7112a) {
                t();
                this.f7114c = true;
                this.f7116f = exc;
            }
            this.f7113b.d(this);
            return;
        }
        throw new NullPointerException("Exception must not be null");
    }

    public final void s(TResult tresult) {
        synchronized (this.f7112a) {
            t();
            this.f7114c = true;
            this.f7115e = tresult;
        }
        this.f7113b.d(this);
    }

    public final void t() {
        Throwable th;
        String str;
        String str2;
        if (this.f7114c) {
            int i10 = b.f7088o;
            if (l()) {
                Exception h10 = h();
                if (h10 != null) {
                    str = "failure";
                } else if (m()) {
                    String valueOf = String.valueOf(i());
                    StringBuilder sb = new StringBuilder(valueOf.length() + 7);
                    sb.append("result ");
                    sb.append(valueOf);
                    str = sb.toString();
                } else if (this.d) {
                    str = "cancellation";
                } else {
                    str = "unknown issue";
                }
                String valueOf2 = String.valueOf(str);
                if (valueOf2.length() != 0) {
                    str2 = "Complete with: ".concat(valueOf2);
                } else {
                    str2 = new String("Complete with: ");
                }
                th = new b(str2, h10);
            } else {
                th = new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            throw th;
        }
    }

    public final void u() {
        synchronized (this.f7112a) {
            if (this.f7114c) {
                this.f7113b.d(this);
            }
        }
    }
}

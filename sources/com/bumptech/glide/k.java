package com.bumptech.glide;

import androidx.appcompat.widget.m;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.data.f;
import e3.c;
import h3.c;
import h3.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n3.a;
import q2.j;
import w2.n;
import w2.o;
import w2.p;
import w2.r;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final p f2251a;

    /* renamed from: b  reason: collision with root package name */
    public final h3.a f2252b;

    /* renamed from: c  reason: collision with root package name */
    public final h3.c f2253c;
    public final h3.d d;

    /* renamed from: e  reason: collision with root package name */
    public final f f2254e;

    /* renamed from: f  reason: collision with root package name */
    public final e3.c f2255f;

    /* renamed from: g  reason: collision with root package name */
    public final j1.b f2256g;

    /* renamed from: h  reason: collision with root package name */
    public final m f2257h = new m();

    /* renamed from: i  reason: collision with root package name */
    public final h3.b f2258i = new h3.b();

    /* renamed from: j  reason: collision with root package name */
    public final a.c f2259j;

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    public static class c extends a {
        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> c(M m10, List<n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m10);
        }
    }

    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public k() {
        a.c cVar = new a.c(new h0.e(20), new n3.b(), new n3.c());
        this.f2259j = cVar;
        this.f2251a = new p(cVar);
        this.f2252b = new h3.a();
        this.f2253c = new h3.c();
        this.d = new h3.d();
        this.f2254e = new f();
        this.f2255f = new e3.c();
        this.f2256g = new j1.b(2);
        List<String> asList = Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"});
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        for (String add : asList) {
            arrayList.add(add);
        }
        arrayList.add("legacy_append");
        h3.c cVar2 = this.f2253c;
        synchronized (cVar2) {
            ArrayList arrayList2 = new ArrayList(cVar2.f5226a);
            cVar2.f5226a.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cVar2.f5226a.add((String) it.next());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (!arrayList.contains(str)) {
                    cVar2.f5226a.add(str);
                }
            }
        }
    }

    public final void a(Class cls, Class cls2, o oVar) {
        p pVar = this.f2251a;
        synchronized (pVar) {
            r rVar = pVar.f9195a;
            synchronized (rVar) {
                r.b bVar = new r.b(cls, cls2, oVar);
                ArrayList arrayList = rVar.f9209a;
                arrayList.add(arrayList.size(), bVar);
            }
            pVar.f9196b.f9197a.clear();
        }
    }

    public final void b(Class cls, q2.k kVar) {
        h3.d dVar = this.d;
        synchronized (dVar) {
            dVar.f5231a.add(new d.a(cls, kVar));
        }
    }

    public final void c(j jVar, Class cls, Class cls2, String str) {
        h3.c cVar = this.f2253c;
        synchronized (cVar) {
            cVar.a(str).add(new c.a(cls, cls2, jVar));
        }
    }

    public final List<ImageHeaderParser> d() {
        List<ImageHeaderParser> list;
        j1.b bVar = this.f2256g;
        synchronized (bVar) {
            list = bVar.f6416a;
        }
        if (!list.isEmpty()) {
            return list;
        }
        throw new b();
    }

    public final <Model> List<n<Model, ?>> e(Model model) {
        List<n<Model, ?>> list;
        p pVar = this.f2251a;
        pVar.getClass();
        Class<?> cls = model.getClass();
        synchronized (pVar) {
            p.a.C0150a aVar = (p.a.C0150a) pVar.f9196b.f9197a.get(cls);
            if (aVar == null) {
                list = null;
            } else {
                list = aVar.f9198a;
            }
            if (list == null) {
                list = Collections.unmodifiableList(pVar.f9195a.a(cls));
                if (((p.a.C0150a) pVar.f9196b.f9197a.put(cls, new p.a.C0150a(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List<n<Model, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i10 = 0; i10 < size; i10++) {
                n nVar = list.get(i10);
                if (nVar.b(model)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i10);
                        z = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new c(model, list);
        }
        throw new c(model);
    }

    public final void f(e.a aVar) {
        f fVar = this.f2254e;
        synchronized (fVar) {
            fVar.f2273a.put(aVar.a(), aVar);
        }
    }

    public final void g(Class cls, Class cls2, e3.b bVar) {
        e3.c cVar = this.f2255f;
        synchronized (cVar) {
            cVar.f4472a.add(new c.a(cls, cls2, bVar));
        }
    }
}

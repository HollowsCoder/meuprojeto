package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.io.InputStream;
import t2.b;
import z2.w;

public final class j implements e<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final w f2284a;

    public static final class a implements e.a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final b f2285a;

        public a(b bVar) {
            this.f2285a = bVar;
        }

        public final Class<InputStream> a() {
            return InputStream.class;
        }

        public final e b(Object obj) {
            return new j((InputStream) obj, this.f2285a);
        }
    }

    public j(InputStream inputStream, b bVar) {
        w wVar = new w(inputStream, bVar);
        this.f2284a = wVar;
        wVar.mark(5242880);
    }

    public final Object a() {
        w wVar = this.f2284a;
        wVar.reset();
        return wVar;
    }

    public final void b() {
        this.f2284a.b();
    }
}

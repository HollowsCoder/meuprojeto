package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.util.HashMap;

public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f2272b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f2273a = new HashMap();

    public class a implements e.a<Object> {
        public final Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        public final e<Object> b(Object obj) {
            return new b(obj);
        }
    }

    public static final class b implements e<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f2274a;

        public b(Object obj) {
            this.f2274a = obj;
        }

        public final Object a() {
            return this.f2274a;
        }

        public final void b() {
        }
    }
}

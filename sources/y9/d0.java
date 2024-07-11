package y9;

import com.karumi.dexter.BuildConfig;
import i9.b0;
import i9.e;
import i9.r;
import i9.v;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import y9.c;
import y9.f;

public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f9666a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final e.a f9667b;

    /* renamed from: c  reason: collision with root package name */
    public final r f9668c;
    public final List<f.a> d;

    /* renamed from: e  reason: collision with root package name */
    public final List<c.a> f9669e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f9670f;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final y f9671a;

        /* renamed from: b  reason: collision with root package name */
        public e.a f9672b;

        /* renamed from: c  reason: collision with root package name */
        public r f9673c;
        public final ArrayList d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final ArrayList f9674e = new ArrayList();

        public a() {
            y yVar = y.f9770c;
            this.f9671a = yVar;
        }

        public final void a(String str) {
            r.l.getClass();
            r.a aVar = new r.a();
            aVar.c((r) null, str);
            r a10 = aVar.a();
            List<String> list = a10.f6308g;
            if (BuildConfig.FLAVOR.equals(list.get(list.size() - 1))) {
                this.f9673c = a10;
                return;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + a10);
        }

        public final d0 b() {
            List list;
            List list2;
            if (this.f9673c != null) {
                e.a aVar = this.f9672b;
                if (aVar == null) {
                    aVar = new v();
                }
                y yVar = this.f9671a;
                Executor a10 = yVar.a();
                ArrayList arrayList = new ArrayList(this.f9674e);
                i iVar = new i(a10);
                boolean z = yVar.f9771a;
                if (z) {
                    list = Arrays.asList(new c.a[]{e.f9675a, iVar});
                } else {
                    list = Collections.singletonList(iVar);
                }
                arrayList.addAll(list);
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + (z ? 1 : 0));
                arrayList3.add(new a());
                arrayList3.addAll(arrayList2);
                if (z) {
                    list2 = Collections.singletonList(u.f9730a);
                } else {
                    list2 = Collections.emptyList();
                }
                arrayList3.addAll(list2);
                return new d0(aVar, this.f9673c, Collections.unmodifiableList(arrayList3), Collections.unmodifiableList(arrayList));
            }
            throw new IllegalStateException("Base URL required.");
        }
    }

    public d0(e.a aVar, r rVar, List list, List list2) {
        this.f9667b = aVar;
        this.f9668c = rVar;
        this.d = list;
        this.f9669e = list2;
        this.f9670f = false;
    }

    public final c<?, ?> a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<c.a> list = this.f9669e;
        int indexOf = list.indexOf((Object) null) + 1;
        int size = list.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            c<?, ?> a10 = list.get(i10).a(type, annotationArr);
            if (a10 != null) {
                return a10;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final e0<?> b(Method method) {
        e0<?> e0Var;
        e0<?> e0Var2 = (e0) this.f9666a.get(method);
        if (e0Var2 != null) {
            return e0Var2;
        }
        synchronized (this.f9666a) {
            e0Var = (e0) this.f9666a.get(method);
            if (e0Var == null) {
                e0Var = e0.b(this, method);
                this.f9666a.put(method, e0Var);
            }
        }
        return e0Var;
    }

    public final <T> f<T, b0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List<f.a> list = this.d;
        int indexOf = list.indexOf((Object) null) + 1;
        int size = list.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            f<T, b0> a10 = list.get(i10).a(type);
            if (a10 != null) {
                return a10;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> f<i9.d0, T> d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<f.a> list = this.d;
        int indexOf = list.indexOf((Object) null) + 1;
        int size = list.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            f<i9.d0, ?> b10 = list.get(i10).b(type, annotationArr, this);
            if (b10 != null) {
                return b10;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final void e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List<f.a> list = this.d;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).getClass();
        }
    }
}

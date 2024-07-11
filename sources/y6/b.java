package y6;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Set<Class<? super T>> f9556a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<k> f9557b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9558c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final e<T> f9559e;

    /* renamed from: f  reason: collision with root package name */
    public final Set<Class<?>> f9560f;

    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final HashSet f9561a;

        /* renamed from: b  reason: collision with root package name */
        public final HashSet f9562b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        public int f9563c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public e<T> f9564e;

        /* renamed from: f  reason: collision with root package name */
        public final HashSet f9565f;

        public a(Class cls, Class[] clsArr) {
            HashSet hashSet = new HashSet();
            this.f9561a = hashSet;
            int i10 = 0;
            this.f9563c = 0;
            this.d = 0;
            this.f9565f = new HashSet();
            hashSet.add(cls);
            int length = clsArr.length;
            while (i10 < length) {
                if (clsArr[i10] != null) {
                    i10++;
                } else {
                    throw new NullPointerException("Null interface");
                }
            }
            Collections.addAll(this.f9561a, clsArr);
        }

        public final void a(k kVar) {
            if (!this.f9561a.contains(kVar.f9582a)) {
                this.f9562b.add(kVar);
                return;
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }

        public final b<T> b() {
            boolean z;
            if (this.f9564e != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new b(new HashSet(this.f9561a), new HashSet(this.f9562b), this.f9563c, this.d, this.f9564e, this.f9565f);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public final void c(int i10) {
            boolean z;
            if (this.f9563c == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f9563c = i10;
                return;
            }
            throw new IllegalStateException("Instantiation type has already been set.");
        }
    }

    public b() {
        throw null;
    }

    public b(HashSet hashSet, HashSet hashSet2, int i10, int i11, e eVar, HashSet hashSet3) {
        this.f9556a = Collections.unmodifiableSet(hashSet);
        this.f9557b = Collections.unmodifiableSet(hashSet2);
        this.f9558c = i10;
        this.d = i11;
        this.f9559e = eVar;
        this.f9560f = Collections.unmodifiableSet(hashSet3);
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> b(T t10, Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(cls);
        int length = clsArr.length;
        int i10 = 0;
        while (i10 < length) {
            if (clsArr[i10] != null) {
                i10++;
            } else {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet, clsArr);
        return new b(new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new a(t10), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f9556a.toArray()) + ">{" + this.f9558c + ", type=" + this.d + ", deps=" + Arrays.toString(this.f9557b.toArray()) + "}";
    }
}

package o1;

import h1.l;
import j1.c;
import p1.b;

public final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    public final a f7632a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f7633b;

    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a forId(int i10) {
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public h(String str, a aVar, boolean z) {
        this.f7632a = aVar;
        this.f7633b = z;
    }

    public final c a(l lVar, b bVar) {
        if (lVar.z) {
            return new j1.l(this);
        }
        t1.c.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        return "MergePaths{mode=" + this.f7632a + '}';
    }
}

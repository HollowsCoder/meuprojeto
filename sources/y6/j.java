package y6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class j {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final b<?> f9577a;

        /* renamed from: b  reason: collision with root package name */
        public final HashSet f9578b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        public final HashSet f9579c = new HashSet();

        public a(b<?> bVar) {
            this.f9577a = bVar;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Class<?> f9580a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f9581b;

        public b() {
            throw null;
        }

        public b(Class cls, boolean z) {
            this.f9580a = cls;
            this.f9581b = z;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f9580a.equals(this.f9580a) && bVar.f9581b == this.f9581b;
        }

        public final int hashCode() {
            return ((this.f9580a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f9581b).hashCode();
        }
    }

    public static void a(ArrayList arrayList) {
        boolean z;
        boolean z10;
        boolean z11;
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i10 = 0;
            if (it.hasNext()) {
                b bVar = (b) it.next();
                a aVar = new a(bVar);
                Iterator<Class<? super T>> it2 = bVar.f9556a.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Class next = it2.next();
                        if (bVar.d == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        boolean z12 = !z11;
                        b bVar2 = new b(next, z12);
                        if (!hashMap.containsKey(bVar2)) {
                            hashMap.put(bVar2, new HashSet());
                        }
                        Set set = (Set) hashMap.get(bVar2);
                        if (set.isEmpty() || z12) {
                            set.add(aVar);
                        } else {
                            throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{next}));
                        }
                    }
                }
            } else {
                for (Set<a> it3 : hashMap.values()) {
                    for (a aVar2 : it3) {
                        for (k next2 : aVar2.f9577a.f9557b) {
                            if (next2.f9584c == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                if (next2.f9583b == 2) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                Set<a> set2 = (Set) hashMap.get(new b(next2.f9582a, z10));
                                if (set2 != null) {
                                    for (a aVar3 : set2) {
                                        aVar2.f9578b.add(aVar3);
                                        aVar3.f9579c.add(aVar2);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (Set addAll : hashMap.values()) {
                    hashSet.addAll(addAll);
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    a aVar4 = (a) it4.next();
                    if (aVar4.f9579c.isEmpty()) {
                        hashSet2.add(aVar4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    a aVar5 = (a) hashSet2.iterator().next();
                    hashSet2.remove(aVar5);
                    i10++;
                    Iterator it5 = aVar5.f9578b.iterator();
                    while (it5.hasNext()) {
                        a aVar6 = (a) it5.next();
                        aVar6.f9579c.remove(aVar5);
                        if (aVar6.f9579c.isEmpty()) {
                            hashSet2.add(aVar6);
                        }
                    }
                }
                if (i10 != arrayList.size()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it6 = hashSet.iterator();
                    while (it6.hasNext()) {
                        a aVar7 = (a) it6.next();
                        if (!aVar7.f9579c.isEmpty() && !aVar7.f9578b.isEmpty()) {
                            arrayList2.add(aVar7.f9577a);
                        }
                    }
                    throw new l(arrayList2);
                }
                return;
            }
        }
    }
}

package t6;

import android.text.TextUtils;
import com.karumi.dexter.BuildConfig;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import v7.b;
import w6.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b<a> f9024a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9025b = "frc";

    /* renamed from: c  reason: collision with root package name */
    public Integer f9026c = null;

    public c(b bVar) {
        this.f9024a = bVar;
    }

    public final List<a.b> a() {
        return this.f9024a.get().d(this.f9025b);
    }

    public final void b(ArrayList arrayList) {
        String str;
        b<a> bVar = this.f9024a;
        if (bVar.get() != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                String[] strArr = b.f9017g;
                ArrayList arrayList3 = new ArrayList();
                String[] strArr2 = b.f9017g;
                for (int i10 = 0; i10 < 5; i10++) {
                    String str2 = strArr2[i10];
                    if (!map.containsKey(str2)) {
                        arrayList3.add(str2);
                    }
                }
                if (arrayList3.isEmpty()) {
                    try {
                        Date parse = b.f9018h.parse((String) map.get("experimentStartTime"));
                        long parseLong = Long.parseLong((String) map.get("triggerTimeoutMillis"));
                        long parseLong2 = Long.parseLong((String) map.get("timeToLiveMillis"));
                        String str3 = (String) map.get("experimentId");
                        String str4 = (String) map.get("variantId");
                        if (map.containsKey("triggerEvent")) {
                            str = (String) map.get("triggerEvent");
                        } else {
                            str = BuildConfig.FLAVOR;
                        }
                        arrayList2.add(new b(str3, str4, str, parse, parseLong, parseLong2));
                    } catch (ParseException e10) {
                        throw new a("Could not process experiment: parsing experiment start time failed.", e10);
                    } catch (NumberFormatException e11) {
                        throw new a("Could not process experiment: one of the durations could not be converted into a long.", e11);
                    }
                } else {
                    throw new a(String.format("The following keys are missing from the experiment info map: %s", new Object[]{arrayList3}));
                }
            }
            if (!arrayList2.isEmpty()) {
                HashSet hashSet = new HashSet();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    hashSet.add(((b) it2.next()).f9019a);
                }
                List<a.b> a10 = a();
                HashSet hashSet2 = new HashSet();
                for (a.b bVar2 : a10) {
                    hashSet2.add(bVar2.f9247b);
                }
                ArrayList<a.b> arrayList4 = new ArrayList<>();
                for (a.b next : a10) {
                    if (!hashSet.contains(next.f9247b)) {
                        arrayList4.add(next);
                    }
                }
                for (a.b bVar3 : arrayList4) {
                    bVar.get().a(bVar3.f9247b);
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    b bVar4 = (b) it3.next();
                    if (!hashSet2.contains(bVar4.f9019a)) {
                        arrayList5.add(bVar4);
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(a());
                Integer num = this.f9026c;
                String str5 = this.f9025b;
                if (num == null) {
                    this.f9026c = Integer.valueOf(bVar.get().h(str5));
                }
                int intValue = this.f9026c.intValue();
                Iterator it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    b bVar5 = (b) it4.next();
                    while (arrayDeque.size() >= intValue) {
                        bVar.get().a(((a.b) arrayDeque.pollFirst()).f9247b);
                    }
                    bVar5.getClass();
                    a.b bVar6 = new a.b();
                    bVar6.f9246a = str5;
                    bVar6.f9256m = bVar5.d.getTime();
                    bVar6.f9247b = bVar5.f9019a;
                    bVar6.f9248c = bVar5.f9020b;
                    String str6 = bVar5.f9021c;
                    if (TextUtils.isEmpty(str6)) {
                        str6 = null;
                    }
                    bVar6.d = str6;
                    bVar6.f9249e = bVar5.f9022e;
                    bVar6.f9254j = bVar5.f9023f;
                    bVar.get().f(bVar6);
                    arrayDeque.offer(bVar6);
                }
            } else if (bVar.get() != null) {
                for (a.b bVar7 : a()) {
                    bVar.get().a(bVar7.f9247b);
                }
            } else {
                throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
            }
        } else {
            throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }
}

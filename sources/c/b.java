package c;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import c.a;
import f9.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o8.e;
import o8.l;
import p9.u;
import z8.g;

public final class b extends a<String[], Map<String, Boolean>> {
    public final Intent a(ComponentActivity componentActivity, Intent intent) {
        g.f(componentActivity, "context");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) intent);
        g.e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    public final a.C0025a b(ComponentActivity componentActivity, Intent intent) {
        boolean z;
        boolean z10;
        String[] strArr = (String[]) intent;
        g.f(componentActivity, "context");
        boolean z11 = true;
        if (strArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new a.C0025a(l.f7765o);
        }
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (y.a.a(componentActivity, strArr[i10]) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                z11 = false;
                break;
            }
            i10++;
        }
        if (!z11) {
            return null;
        }
        int m10 = u.m(strArr.length);
        if (m10 < 16) {
            m10 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m10);
        for (String put : strArr) {
            linkedHashMap.put(put, Boolean.TRUE);
        }
        return new a.C0025a(linkedHashMap);
    }

    public final Object c(Intent intent, int i10) {
        boolean z;
        l lVar = l.f7765o;
        if (i10 != -1 || intent == null) {
            return lVar;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return lVar;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i11 : intArrayExtra) {
            if (i11 == 0) {
                z = true;
            } else {
                z = false;
            }
            arrayList.add(Boolean.valueOf(z));
        }
        ArrayList Q = d.Q(stringArrayExtra);
        Iterator it = Q.iterator();
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(e.u(Q), e.u(arrayList)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList2.add(new n8.d(it.next(), it2.next()));
        }
        return e9.g.u(arrayList2);
    }
}

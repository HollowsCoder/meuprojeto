package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class y {

    /* renamed from: e  reason: collision with root package name */
    public static final Class[] f1416e = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f1417a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f1418b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f1419c;
    public final a d;

    public class a implements a.b {
        public a() {
        }

        public final Bundle a() {
            y yVar = y.this;
            Iterator it = new HashMap(yVar.f1418b).entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                HashMap hashMap = yVar.f1417a;
                if (hasNext) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Bundle a10 = ((a.b) entry.getValue()).a();
                    String str = (String) entry.getKey();
                    if (a10 != null) {
                        Class[] clsArr = y.f1416e;
                        int i10 = 0;
                        while (i10 < 29) {
                            if (!clsArr[i10].isInstance(a10)) {
                                i10++;
                            }
                        }
                        throw new IllegalArgumentException("Can't put value with type " + a10.getClass() + " into saved state");
                    }
                    s sVar = (s) yVar.f1419c.get(str);
                    if (sVar != null) {
                        sVar.i(a10);
                    } else {
                        hashMap.put(str, a10);
                    }
                } else {
                    Set<String> keySet = hashMap.keySet();
                    ArrayList arrayList = new ArrayList(keySet.size());
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    for (String str2 : keySet) {
                        arrayList.add(str2);
                        arrayList2.add(hashMap.get(str2));
                    }
                    Bundle bundle = new Bundle();
                    bundle.putParcelableArrayList("keys", arrayList);
                    bundle.putParcelableArrayList("values", arrayList2);
                    return bundle;
                }
            }
        }
    }

    public y() {
        this.f1418b = new HashMap();
        this.f1419c = new HashMap();
        this.d = new a();
        this.f1417a = new HashMap();
    }

    public y(HashMap hashMap) {
        this.f1418b = new HashMap();
        this.f1419c = new HashMap();
        this.d = new a();
        this.f1417a = new HashMap(hashMap);
    }
}

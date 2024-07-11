package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.fragment.app.f0;
import androidx.navigation.g;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n.e;
import n.j;

public class h {

    /* renamed from: o  reason: collision with root package name */
    public final String f1492o;

    /* renamed from: p  reason: collision with root package name */
    public i f1493p;

    /* renamed from: q  reason: collision with root package name */
    public int f1494q;

    /* renamed from: r  reason: collision with root package name */
    public String f1495r;

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f1496s;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList<g> f1497t;
    public j<androidx.databinding.a> u;

    /* renamed from: v  reason: collision with root package name */
    public HashMap<String, c> f1498v;

    public static class a implements Comparable<a> {

        /* renamed from: o  reason: collision with root package name */
        public final h f1499o;

        /* renamed from: p  reason: collision with root package name */
        public final Bundle f1500p;

        /* renamed from: q  reason: collision with root package name */
        public final boolean f1501q;

        /* renamed from: r  reason: collision with root package name */
        public final boolean f1502r;

        /* renamed from: s  reason: collision with root package name */
        public final int f1503s;

        public a(h hVar, Bundle bundle, boolean z, boolean z10, int i10) {
            this.f1499o = hVar;
            this.f1500p = bundle;
            this.f1501q = z;
            this.f1502r = z10;
            this.f1503s = i10;
        }

        /* renamed from: g */
        public final int compareTo(a aVar) {
            boolean z = this.f1501q;
            if (z && !aVar.f1501q) {
                return 1;
            }
            if (!z && aVar.f1501q) {
                return -1;
            }
            Bundle bundle = this.f1500p;
            if (bundle != null && aVar.f1500p == null) {
                return 1;
            }
            if (bundle == null && aVar.f1500p != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size() - aVar.f1500p.size();
                if (size > 0) {
                    return 1;
                }
                if (size < 0) {
                    return -1;
                }
            }
            boolean z10 = this.f1502r;
            if (z10 && !aVar.f1502r) {
                return 1;
            }
            if (z10 || !aVar.f1502r) {
                return this.f1503s - aVar.f1503s;
            }
            return -1;
        }
    }

    static {
        new HashMap();
    }

    public h(p<? extends h> pVar) {
        this.f1492o = q.b(pVar.getClass());
    }

    public static String h(Context context, int i10) {
        if (i10 <= 16777215) {
            return Integer.toString(i10);
        }
        try {
            return context.getResources().getResourceName(i10);
        } catch (Resources.NotFoundException unused) {
            return Integer.toString(i10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0088 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle e(android.os.Bundle r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x000e
            java.util.HashMap<java.lang.String, androidx.navigation.c> r0 = r5.f1498v
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000e
        L_0x000c:
            r6 = 0
            return r6
        L_0x000e:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.HashMap<java.lang.String, androidx.navigation.c> r1 = r5.f1498v
            if (r1 == 0) goto L_0x0043
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x001f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0043
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            androidx.navigation.c r3 = (androidx.navigation.c) r3
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            boolean r4 = r3.f1454c
            if (r4 == 0) goto L_0x001f
            androidx.navigation.n r4 = r3.f1452a
            java.lang.Object r3 = r3.d
            r4.d(r0, r2, r3)
            goto L_0x001f
        L_0x0043:
            if (r6 == 0) goto L_0x00bb
            r0.putAll(r6)
            java.util.HashMap<java.lang.String, androidx.navigation.c> r6 = r5.f1498v
            if (r6 == 0) goto L_0x00bb
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0054:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x00bb
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            androidx.navigation.c r2 = (androidx.navigation.c) r2
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r2.f1453b
            if (r4 != 0) goto L_0x007d
            boolean r4 = r0.containsKey(r3)
            if (r4 == 0) goto L_0x007d
            java.lang.Object r4 = r0.get(r3)
            if (r4 != 0) goto L_0x007d
            goto L_0x0084
        L_0x007d:
            androidx.navigation.n r2 = r2.f1452a     // Catch:{ ClassCastException -> 0x0084 }
            r2.a(r3, r0)     // Catch:{ ClassCastException -> 0x0084 }
            r2 = 1
            goto L_0x0085
        L_0x0084:
            r2 = 0
        L_0x0085:
            if (r2 == 0) goto L_0x0088
            goto L_0x0054
        L_0x0088:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Wrong argument type for '"
            r0.<init>(r2)
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = "' in argument bundle. "
            r0.append(r2)
            java.lang.Object r1 = r1.getValue()
            androidx.navigation.c r1 = (androidx.navigation.c) r1
            androidx.navigation.n r1 = r1.f1452a
            java.lang.String r1 = r1.b()
            r0.append(r1)
            java.lang.String r1 = " expected."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x00bb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.h.e(android.os.Bundle):android.os.Bundle");
    }

    public a i(f0 f0Var) {
        Bundle bundle;
        boolean z;
        int i10;
        int i11;
        Map<String, c> map;
        Bundle bundle2;
        Matcher matcher;
        String str;
        HashMap hashMap;
        boolean z10;
        boolean z11;
        f0 f0Var2 = f0Var;
        ArrayList<g> arrayList = this.f1497t;
        Bundle bundle3 = null;
        if (arrayList == null) {
            return null;
        }
        Iterator<g> it = arrayList.iterator();
        a aVar = null;
        while (it.hasNext()) {
            g next = it.next();
            Uri uri = (Uri) f0Var2.f1151p;
            if (uri != null) {
                HashMap<String, c> hashMap2 = this.f1498v;
                if (hashMap2 == null) {
                    map = Collections.emptyMap();
                } else {
                    map = Collections.unmodifiableMap(hashMap2);
                }
                next.getClass();
                Matcher matcher2 = next.f1485c.matcher(uri.toString());
                if (!matcher2.matches()) {
                    bundle2 = bundle3;
                } else {
                    bundle2 = new Bundle();
                    ArrayList<String> arrayList2 = next.f1483a;
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size) {
                            String str2 = arrayList2.get(i12);
                            i12++;
                            String decode = Uri.decode(matcher2.group(i12));
                            c cVar = map.get(str2);
                            if (cVar != null) {
                                n nVar = cVar.f1452a;
                                try {
                                    nVar.d(bundle2, str2, nVar.c(decode));
                                } catch (IllegalArgumentException unused) {
                                    z11 = true;
                                }
                            } else {
                                bundle2.putString(str2, decode);
                            }
                            z11 = false;
                            if (z11) {
                                break;
                            }
                        } else if (next.f1486e) {
                            HashMap hashMap3 = next.f1484b;
                            Iterator it2 = hashMap3.keySet().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                String str3 = (String) it2.next();
                                g.a aVar2 = (g.a) hashMap3.get(str3);
                                String queryParameter = uri.getQueryParameter(str3);
                                if (queryParameter != null) {
                                    matcher = Pattern.compile(aVar2.f1490a).matcher(queryParameter);
                                    if (!matcher.matches()) {
                                        break;
                                    }
                                } else {
                                    matcher = null;
                                }
                                int i13 = 0;
                                while (true) {
                                    if (i13 < aVar2.f1491b.size()) {
                                        if (matcher != null) {
                                            str = Uri.decode(matcher.group(i13 + 1));
                                        } else {
                                            str = null;
                                        }
                                        String str4 = aVar2.f1491b.get(i13);
                                        c cVar2 = map.get(str4);
                                        Uri uri2 = uri;
                                        if (str != null) {
                                            hashMap = hashMap3;
                                            if (str.replaceAll("[{}]", BuildConfig.FLAVOR).equals(str4)) {
                                                continue;
                                            } else {
                                                if (cVar2 != null) {
                                                    n nVar2 = cVar2.f1452a;
                                                    try {
                                                        nVar2.d(bundle2, str4, nVar2.c(str));
                                                    } catch (IllegalArgumentException unused2) {
                                                        z10 = true;
                                                    }
                                                } else {
                                                    bundle2.putString(str4, str);
                                                }
                                                z10 = false;
                                                if (z10) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            hashMap = hashMap3;
                                        }
                                        i13++;
                                        uri = uri2;
                                        hashMap3 = hashMap;
                                    }
                                }
                            }
                        }
                    }
                    bundle2 = null;
                }
                bundle = bundle2;
            } else {
                bundle = null;
            }
            String str5 = (String) f0Var2.f1152q;
            if (str5 == null || !str5.equals(next.f1487f)) {
                z = false;
            } else {
                z = true;
            }
            String str6 = (String) f0Var2.f1153r;
            if (str6 != null) {
                String str7 = next.f1489h;
                if (str7 == null || !next.f1488g.matcher(str6).matches()) {
                    i11 = -1;
                } else {
                    String[] split = str7.split("/", -1);
                    String str8 = split[0];
                    String str9 = split[1];
                    String[] split2 = str6.split("/", -1);
                    String str10 = split2[0];
                    String str11 = split2[1];
                    if (str8.equals(str10)) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    if (str9.equals(str11)) {
                        i11++;
                    }
                }
                i10 = i11;
            } else {
                i10 = -1;
            }
            if (bundle != null || z || i10 > -1) {
                a aVar3 = new a(this, bundle, next.d, z, i10);
                if (aVar == null || aVar3.compareTo(aVar) > 0) {
                    aVar = aVar3;
                }
            }
            bundle3 = null;
        }
        return aVar;
    }

    public void k(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, e.F);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        this.f1494q = resourceId;
        this.f1495r = null;
        this.f1495r = h(context, resourceId);
        this.f1496s = obtainAttributes.getText(0);
        obtainAttributes.recycle();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f1495r;
        if (str == null) {
            sb.append("0x");
            str = Integer.toHexString(this.f1494q);
        }
        sb.append(str);
        sb.append(")");
        if (this.f1496s != null) {
            sb.append(" label=");
            sb.append(this.f1496s);
        }
        return sb.toString();
    }
}

package com.google.android.gms.internal.measurement;

import androidx.databinding.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class l implements o, k {

    /* renamed from: o  reason: collision with root package name */
    public final HashMap f2775o = new HashMap();

    public final Double b() {
        return Double.valueOf(Double.NaN);
    }

    public final Boolean c() {
        return Boolean.TRUE;
    }

    public final o e(String str) {
        HashMap hashMap = this.f2775o;
        return hashMap.containsKey(str) ? (o) hashMap.get(str) : o.f2850a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        return this.f2775o.equals(((l) obj).f2775o);
    }

    public final void h(String str, o oVar) {
        HashMap hashMap = this.f2775o;
        if (oVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, oVar);
        }
    }

    public final int hashCode() {
        return this.f2775o.hashCode();
    }

    public final Iterator<o> i() {
        return new j(this.f2775o.keySet().iterator());
    }

    public final boolean k(String str) {
        return this.f2775o.containsKey(str);
    }

    public final o q() {
        String str;
        o oVar;
        l lVar = new l();
        for (Map.Entry entry : this.f2775o.entrySet()) {
            boolean z = entry.getValue() instanceof k;
            HashMap hashMap = lVar.f2775o;
            if (z) {
                str = (String) entry.getKey();
                oVar = (o) entry.getValue();
            } else {
                str = (String) entry.getKey();
                oVar = ((o) entry.getValue()).q();
            }
            hashMap.put(str, oVar);
        }
        return lVar;
    }

    public o t(String str, i3 i3Var, ArrayList arrayList) {
        return "toString".equals(str) ? new r(toString()) : a.w(this, new r(str), i3Var, arrayList);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap hashMap = this.f2775o;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb.append(String.format("%s: %s,", new Object[]{str, hashMap.get(str)}));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    public final String zzc() {
        return "[object Object]";
    }
}

package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.v5;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import s6.a;

public final class w5<T extends v5<T>> {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f2977c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final v7 f2978a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2979b;

    static {
        new w5(0);
    }

    public w5() {
        this.f2978a = new v7(16);
    }

    public w5(int i10) {
        v7 v7Var = new v7(0);
        this.f2978a = v7Var;
        if (!this.f2979b) {
            v7Var.a();
            this.f2979b = true;
        }
        if (!this.f2979b) {
            v7Var.a();
            this.f2979b = true;
        }
    }

    public static final void b(T t10, Object obj) {
        boolean z;
        r8 a10 = t10.a();
        Charset charset = n6.f2844a;
        obj.getClass();
        r8 r8Var = r8.DOUBLE;
        s8 s8Var = s8.INT;
        switch (a10.zza().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof k5) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof h6)) {
                    return;
                }
            case 8:
                if (obj instanceof i7) {
                    return;
                }
                break;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t10.zza()), t10.a().zza(), obj.getClass().getName()}));
    }

    public final void a(T t10, Object obj) {
        if (!t10.zzc()) {
            b(t10, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                b(t10, arrayList.get(i10));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f2978a.put(t10, obj);
    }

    public final Object clone() {
        v7 v7Var;
        Iterable<Map.Entry> iterable;
        w5 w5Var = new w5();
        int i10 = 0;
        while (true) {
            v7Var = this.f2978a;
            if (i10 >= v7Var.f2640p.size()) {
                break;
            }
            Map.Entry entry = v7Var.f2640p.get(i10);
            w5Var.a((v5) entry.getKey(), entry.getValue());
            i10++;
        }
        if (v7Var.f2641q.isEmpty()) {
            iterable = a.D;
        } else {
            iterable = v7Var.f2641q.entrySet();
        }
        for (Map.Entry entry2 : iterable) {
            w5Var.a((v5) entry2.getKey(), entry2.getValue());
        }
        return w5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5)) {
            return false;
        }
        return this.f2978a.equals(((w5) obj).f2978a);
    }

    public final int hashCode() {
        return this.f2978a.hashCode();
    }
}

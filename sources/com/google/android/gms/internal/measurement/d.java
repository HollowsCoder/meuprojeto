package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class d implements Iterator {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f2663o;

    /* renamed from: p  reason: collision with root package name */
    public int f2664p = 0;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f2665q;

    public /* synthetic */ d(int i10, Object obj) {
        this.f2663o = i10;
        this.f2665q = obj;
    }

    public final boolean hasNext() {
        int i10 = this.f2663o;
        Object obj = this.f2665q;
        switch (i10) {
            case 0:
                if (this.f2664p < ((e) obj).p()) {
                    return true;
                }
                return false;
            default:
                if (this.f2664p < ((r) obj).f2901o.length()) {
                    return true;
                }
                return false;
        }
    }

    public final /* synthetic */ Object next() {
        int i10 = this.f2663o;
        Object obj = this.f2665q;
        switch (i10) {
            case 0:
                e eVar = (e) obj;
                if (this.f2664p < eVar.p()) {
                    int i11 = this.f2664p;
                    this.f2664p = i11 + 1;
                    return eVar.u(i11);
                }
                int i12 = this.f2664p;
                StringBuilder sb = new StringBuilder(32);
                sb.append("Out of bounds index: ");
                sb.append(i12);
                throw new NoSuchElementException(sb.toString());
            default:
                if (this.f2664p < ((r) obj).f2901o.length()) {
                    int i13 = this.f2664p;
                    this.f2664p = i13 + 1;
                    return new r(String.valueOf(i13));
                }
                throw new NoSuchElementException();
        }
    }
}

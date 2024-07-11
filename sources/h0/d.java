package h0;

import java.io.Serializable;

public class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public int f5109a;

    /* renamed from: b  reason: collision with root package name */
    public final Serializable f5110b;

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object[], java.io.Serializable] */
    public /* synthetic */ d(int i10) {
        if (i10 > 0) {
            this.f5110b = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public /* synthetic */ d(String str, int i10) {
        this.f5109a = i10;
        this.f5110b = str;
    }

    public boolean a(Object obj) {
        int i10;
        Serializable serializable;
        boolean z;
        int i11 = 0;
        while (true) {
            i10 = this.f5109a;
            serializable = this.f5110b;
            if (i11 >= i10) {
                z = false;
                break;
            } else if (((Object[]) serializable)[i11] == obj) {
                z = true;
                break;
            } else {
                i11++;
            }
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        } else if (i10 >= ((Object[]) serializable).length) {
            return false;
        } else {
            ((Object[]) serializable)[i10] = obj;
            this.f5109a = i10 + 1;
            return true;
        }
    }

    public Object b() {
        int i10 = this.f5109a;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Serializable serializable = this.f5110b;
        Object obj = ((Object[]) serializable)[i11];
        ((Object[]) serializable)[i11] = null;
        this.f5109a = i10 - 1;
        return obj;
    }
}

package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public final class q3 implements Cloneable {

    /* renamed from: o  reason: collision with root package name */
    public Object f2532o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f2533p = new ArrayList();

    public final void c() {
        if (this.f2532o == null) {
            Iterator it = this.f2533p.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NoSuchMethodError();
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    public final void d() {
        if (this.f2532o == null) {
            Iterator it = this.f2533p.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NoSuchMethodError();
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    /* renamed from: e */
    public final q3 clone() {
        Object obj;
        q3 q3Var = new q3();
        try {
            ArrayList arrayList = this.f2533p;
            if (arrayList == null) {
                q3Var.f2533p = null;
            } else {
                q3Var.f2533p.addAll(arrayList);
            }
            Object obj2 = this.f2532o;
            if (obj2 != null) {
                if (obj2 instanceof s3) {
                    obj = (s3) ((s3) obj2).clone();
                } else if (obj2 instanceof byte[]) {
                    obj = ((byte[]) obj2).clone();
                } else {
                    int i10 = 0;
                    if (obj2 instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj2;
                        byte[][] bArr2 = new byte[bArr.length][];
                        q3Var.f2532o = bArr2;
                        while (i10 < bArr.length) {
                            bArr2[i10] = (byte[]) bArr[i10].clone();
                            i10++;
                        }
                    } else if (obj2 instanceof boolean[]) {
                        obj = ((boolean[]) obj2).clone();
                    } else if (obj2 instanceof int[]) {
                        obj = ((int[]) obj2).clone();
                    } else if (obj2 instanceof long[]) {
                        obj = ((long[]) obj2).clone();
                    } else if (obj2 instanceof float[]) {
                        obj = ((float[]) obj2).clone();
                    } else if (obj2 instanceof double[]) {
                        obj = ((double[]) obj2).clone();
                    } else if (obj2 instanceof s3[]) {
                        s3[] s3VarArr = (s3[]) obj2;
                        s3[] s3VarArr2 = new s3[s3VarArr.length];
                        q3Var.f2532o = s3VarArr2;
                        while (i10 < s3VarArr.length) {
                            s3VarArr2[i10] = (s3) s3VarArr[i10].clone();
                            i10++;
                        }
                    }
                }
                q3Var.f2532o = obj;
            }
            return q3Var;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        ArrayList arrayList;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj;
        if (this.f2532o == null || q3Var.f2532o == null) {
            ArrayList arrayList2 = this.f2533p;
            if (arrayList2 != null && (arrayList = q3Var.f2533p) != null) {
                return arrayList2.equals(arrayList);
            }
            try {
                d();
                byte[] bArr = new byte[0];
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 0);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                wrap.order(byteOrder);
                c();
                q3Var.d();
                byte[] bArr2 = new byte[0];
                ByteBuffer.wrap(bArr2, 0, 0).order(byteOrder);
                q3Var.c();
                return Arrays.equals(bArr, bArr2);
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        } else {
            throw null;
        }
    }

    public final int hashCode() {
        try {
            d();
            byte[] bArr = new byte[0];
            ByteBuffer.wrap(bArr, 0, 0).order(ByteOrder.LITTLE_ENDIAN);
            c();
            return Arrays.hashCode(bArr) + 527;
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }
}

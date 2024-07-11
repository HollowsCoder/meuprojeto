package com.google.android.gms.internal.clearcut;

import androidx.databinding.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;

public class s3 {

    /* renamed from: o  reason: collision with root package name */
    public volatile int f2543o = -1;

    public static final void c(a4 a4Var, byte[] bArr, int i10) {
        try {
            n3 n3Var = new n3(bArr, i10);
            a4Var.i(n3Var);
            ByteBuffer byteBuffer = n3Var.f2506a;
            if (byteBuffer.remaining() != 0) {
                throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(byteBuffer.remaining())}));
            }
        } catch (IOException e10) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e10);
        }
    }

    public final int d() {
        int e10 = e();
        this.f2543o = e10;
        return e10;
    }

    public int e() {
        return 0;
    }

    /* renamed from: h */
    public s3 clone() {
        return (s3) super.clone();
    }

    public final String toString() {
        String str;
        String str2;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            a.B((String) null, this, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e10) {
            str2 = String.valueOf(e10.getMessage());
            if (str2.length() == 0) {
                str = new String("Error printing proto: ");
                return str;
            }
            return "Error printing proto: ".concat(str2);
        } catch (InvocationTargetException e11) {
            str2 = String.valueOf(e11.getMessage());
            if (str2.length() == 0) {
                str = new String("Error printing proto: ");
                return str;
            }
            return "Error printing proto: ".concat(str2);
        }
    }
}

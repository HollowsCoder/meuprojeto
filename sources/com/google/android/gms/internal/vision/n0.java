package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.a1;
import com.google.android.gms.internal.vision.m0;
import com.google.android.gms.internal.vision.n0;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

public abstract class n0<MessageType extends n0<MessageType, BuilderType>, BuilderType extends m0<MessageType, BuilderType>> implements w2 {
    protected int zza = 0;

    public static void a(Iterable iterable, a2 a2Var) {
        Charset charset = u1.f3170a;
        iterable.getClass();
        if (iterable instanceof j2) {
            List<?> b10 = ((j2) iterable).b();
            j2 j2Var = (j2) a2Var;
            int size = a2Var.size();
            for (Object next : b10) {
                if (next == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(j2Var.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    int size2 = j2Var.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            j2Var.remove(size2);
                        } else {
                            throw new NullPointerException(sb2);
                        }
                    }
                } else if (next instanceof w0) {
                    j2Var.G((w0) next);
                } else {
                    j2Var.add((String) next);
                }
            }
        } else if (iterable instanceof h3) {
            a2Var.addAll((Collection) iterable);
        } else {
            if ((a2Var instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) a2Var).ensureCapacity(((Collection) iterable).size() + a2Var.size());
            }
            int size3 = a2Var.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(a2Var.size() - size3);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    int size4 = a2Var.size();
                    while (true) {
                        size4--;
                        if (size4 >= size3) {
                            a2Var.remove(size4);
                        } else {
                            throw new NullPointerException(sb4);
                        }
                    }
                } else {
                    a2Var.add(next2);
                }
            }
        }
    }

    public void b(int i10) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int f() {
        throw new UnsupportedOperationException();
    }

    public final z0 j() {
        try {
            q1 q1Var = (q1) this;
            int n10 = q1Var.n();
            z0 z0Var = w0.f3182p;
            byte[] bArr = new byte[n10];
            Logger logger = a1.f3034p;
            a1.a aVar = new a1.a(bArr, n10);
            q1Var.c(aVar);
            if (aVar.E() == 0) {
                return new z0(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + 10);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e10);
        }
    }
}

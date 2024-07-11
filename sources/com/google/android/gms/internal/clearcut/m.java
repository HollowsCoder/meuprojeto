package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.m;
import com.google.android.gms.internal.clearcut.n;
import java.io.IOException;

public abstract class m<MessageType extends m<MessageType, BuilderType>, BuilderType extends n<MessageType, BuilderType>> implements r1 {
    private static boolean zzey = false;
    protected int zzex = 0;

    public void a(int i10) {
        throw new UnsupportedOperationException();
    }

    public int b() {
        throw new UnsupportedOperationException();
    }

    public final w h() {
        try {
            p0 p0Var = (p0) this;
            int l = p0Var.l();
            w wVar = u.f2544p;
            androidx.appcompat.widget.m mVar = new androidx.appcompat.widget.m(l, 0);
            Object obj = mVar.f652p;
            p0Var.i((x) obj);
            if (((x) obj).O() == 0) {
                return new w((byte[]) mVar.f653q);
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

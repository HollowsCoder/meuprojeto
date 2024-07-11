package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b6;
import com.google.android.gms.internal.measurement.f6;
import java.io.IOException;

public class b6<MessageType extends f6<MessageType, BuilderType>, BuilderType extends b6<MessageType, BuilderType>> extends a5<MessageType, BuilderType> {

    /* renamed from: o  reason: collision with root package name */
    public final MessageType f2634o;

    /* renamed from: p  reason: collision with root package name */
    public MessageType f2635p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2636q = false;

    public b6(MessageType messagetype) {
        this.f2634o = messagetype;
        this.f2635p = (f6) messagetype.q(4);
    }

    public final /* bridge */ /* synthetic */ f6 h() {
        return this.f2634o;
    }

    public final MessageType j() {
        MessageType p10 = p();
        boolean z = true;
        byte byteValue = ((Byte) p10.q(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z = false;
            } else {
                z = q7.f2894c.a(p10.getClass()).f(p10);
                p10.q(2);
            }
        }
        if (z) {
            return p10;
        }
        throw new d8(0);
    }

    public final void k(f6 f6Var) {
        if (this.f2636q) {
            m();
            this.f2636q = false;
        }
        MessageType messagetype = this.f2635p;
        q7.f2894c.a(messagetype.getClass()).i(messagetype, f6Var);
    }

    public final void l(byte[] bArr, int i10, r5 r5Var) {
        if (this.f2636q) {
            m();
            this.f2636q = false;
        }
        try {
            q7.f2894c.a(this.f2635p.getClass()).j(this.f2635p, bArr, 0, i10, new e5(r5Var));
        } catch (p6 e10) {
            throw e10;
        } catch (IndexOutOfBoundsException unused) {
            throw p6.a();
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        }
    }

    public final void m() {
        MessageType messagetype = (f6) this.f2635p.q(4);
        q7.f2894c.a(messagetype.getClass()).i(messagetype, this.f2635p);
        this.f2635p = messagetype;
    }

    /* renamed from: n */
    public final BuilderType clone() {
        BuilderType buildertype = (b6) this.f2634o.q(5);
        buildertype.k(p());
        return buildertype;
    }

    public final MessageType p() {
        if (this.f2636q) {
            return this.f2635p;
        }
        MessageType messagetype = this.f2635p;
        q7.f2894c.a(messagetype.getClass()).l(messagetype);
        this.f2636q = true;
        return this.f2635p;
    }
}

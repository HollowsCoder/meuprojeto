package androidx.activity.result;

import android.graphics.Path;
import android.graphics.Typeface;
import android.view.View;
import com.google.android.gms.internal.clearcut.e3;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Set;
import v7.b;

public abstract class c implements y6.c {
    public static void D(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i10;
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i11 = 0;
        while (i11 < length) {
            try {
                char charAt = charSequence.charAt(i11);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i11, (byte) charAt);
                i11++;
            } catch (IndexOutOfBoundsException unused) {
                int position2 = byteBuffer.position();
                char charAt2 = charSequence.charAt(i11);
                StringBuilder sb = new StringBuilder(37);
                sb.append("Failed writing ");
                sb.append(charAt2);
                sb.append(" at index ");
                sb.append(Math.max(i11, (position - byteBuffer.position()) + 1) + position2);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
        }
        if (i11 == length) {
            byteBuffer.position(position + i11);
            return;
        }
        position += i11;
        while (i11 < length) {
            char charAt3 = charSequence.charAt(i11);
            if (charAt3 < 128) {
                byteBuffer.put(position, (byte) charAt3);
            } else if (charAt3 < 2048) {
                i10 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt3 >>> 6) | 192));
                    byteBuffer.put(i10, (byte) ((charAt3 & '?') | 128));
                    position = i10;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i10;
                    int position22 = byteBuffer.position();
                    char charAt22 = charSequence.charAt(i11);
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Failed writing ");
                    sb2.append(charAt22);
                    sb2.append(" at index ");
                    sb2.append(Math.max(i11, (position - byteBuffer.position()) + 1) + position22);
                    throw new ArrayIndexOutOfBoundsException(sb2.toString());
                }
            } else if (charAt3 < 55296 || 57343 < charAt3) {
                i10 = position + 1;
                byteBuffer.put(position, (byte) ((charAt3 >>> 12) | 224));
                position = i10 + 1;
                byteBuffer.put(i10, (byte) (((charAt3 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt3 & '?') | 128));
            } else {
                int i12 = i11 + 1;
                if (i12 != length) {
                    try {
                        char charAt4 = charSequence.charAt(i12);
                        if (Character.isSurrogatePair(charAt3, charAt4)) {
                            int codePoint = Character.toCodePoint(charAt3, charAt4);
                            int i13 = position + 1;
                            try {
                                byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                position = i13 + 1;
                                byteBuffer.put(i13, (byte) (((codePoint >>> 12) & 63) | 128));
                                i13 = position + 1;
                                byteBuffer.put(position, (byte) (((codePoint >>> 6) & 63) | 128));
                                byteBuffer.put(i13, (byte) ((codePoint & 63) | 128));
                                position = i13;
                                i11 = i12;
                            } catch (IndexOutOfBoundsException unused3) {
                                position = i13;
                                i11 = i12;
                                int position222 = byteBuffer.position();
                                char charAt222 = charSequence.charAt(i11);
                                StringBuilder sb22 = new StringBuilder(37);
                                sb22.append("Failed writing ");
                                sb22.append(charAt222);
                                sb22.append(" at index ");
                                sb22.append(Math.max(i11, (position - byteBuffer.position()) + 1) + position222);
                                throw new ArrayIndexOutOfBoundsException(sb22.toString());
                            }
                        } else {
                            i11 = i12;
                        }
                    } catch (IndexOutOfBoundsException unused4) {
                        i11 = i12;
                        int position2222 = byteBuffer.position();
                        char charAt2222 = charSequence.charAt(i11);
                        StringBuilder sb222 = new StringBuilder(37);
                        sb222.append("Failed writing ");
                        sb222.append(charAt2222);
                        sb222.append(" at index ");
                        sb222.append(Math.max(i11, (position - byteBuffer.position()) + 1) + position2222);
                        throw new ArrayIndexOutOfBoundsException(sb222.toString());
                    }
                }
                throw new e3(i11, length);
            }
            i11++;
            position++;
        }
        byteBuffer.position(position);
    }

    public abstract int A(byte[] bArr, int i10, int i11);

    public abstract String B(byte[] bArr, int i10, int i11);

    public abstract void C(CharSequence charSequence, ByteBuffer byteBuffer);

    public Object a(Class cls) {
        b h10 = h(cls);
        if (h10 == null) {
            return null;
        }
        return h10.get();
    }

    public Set e(Class cls) {
        return (Set) i(cls).get();
    }

    public void f(View view, float f10) {
        float f11 = 0.0f;
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationY(0.0f);
        view.setTranslationX((-((float) view.getWidth())) * f10);
        if (f10 > -1.0f && f10 < 1.0f) {
            f11 = 1.0f;
        }
        view.setAlpha(f11);
        t(view, f10);
    }

    public abstract List k(String str, List list);

    public abstract Path m(float f10, float f11, float f12, float f13);

    public abstract View o(int i10);

    public abstract void p(int i10);

    public abstract void q(Typeface typeface, boolean z);

    public abstract boolean s();

    public abstract void t(View view, float f10);

    public abstract int u(CharSequence charSequence, byte[] bArr, int i10, int i11);

    public abstract int v(byte[] bArr, int i10, int i11);

    public abstract void w(Exception exc);

    public abstract void x(Throwable th, Throwable th2);

    public abstract void y(byte[] bArr, int i10, int i11);

    public abstract int z(CharSequence charSequence, byte[] bArr, int i10, int i11);
}

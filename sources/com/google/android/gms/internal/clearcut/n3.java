package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.x;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.logging.Logger;
import q2.e;

public final class n3 {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f2506a;

    /* renamed from: b  reason: collision with root package name */
    public x f2507b;

    /* renamed from: c  reason: collision with root package name */
    public int f2508c;

    public n3(byte[] bArr, int i10) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        this.f2506a = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) >= 65536) {
                                i11++;
                            } else {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i11);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(((long) i12) + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static int g(int i10, byte[] bArr) {
        return o(bArr.length) + bArr.length + n(i10);
    }

    public static int h(String str, int i10) {
        int n10 = n(i10);
        int a10 = a(str);
        return o(a10) + a10 + n10;
    }

    public static void j(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i10;
        int i11;
        int i12;
        char charAt;
        if (!byteBuffer.isReadOnly()) {
            int i13 = 0;
            if (byteBuffer.hasArray()) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i14 = remaining + arrayOffset;
                    while (i13 < length) {
                        int i15 = i13 + arrayOffset;
                        if (i15 >= i14 || (charAt = charSequence.charAt(i13)) >= 128) {
                            break;
                        }
                        array[i15] = (byte) charAt;
                        i13++;
                    }
                    if (i13 == length) {
                        i11 = arrayOffset + length;
                    } else {
                        i11 = arrayOffset + i13;
                        while (i13 < length) {
                            char charAt2 = charSequence.charAt(i13);
                            if (charAt2 < 128 && i11 < i14) {
                                i12 = i11 + 1;
                                array[i11] = (byte) charAt2;
                            } else if (charAt2 < 2048 && i11 <= i14 - 2) {
                                int i16 = i11 + 1;
                                array[i11] = (byte) ((charAt2 >>> 6) | 960);
                                i11 = i16 + 1;
                                array[i16] = (byte) ((charAt2 & '?') | 128);
                                i13++;
                            } else if ((charAt2 < 55296 || 57343 < charAt2) && i11 <= i14 - 3) {
                                int i17 = i11 + 1;
                                array[i11] = (byte) ((charAt2 >>> 12) | 480);
                                int i18 = i17 + 1;
                                array[i17] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i12 = i18 + 1;
                                array[i18] = (byte) ((charAt2 & '?') | 128);
                            } else if (i11 <= i14 - 4) {
                                int i19 = i13 + 1;
                                if (i19 != charSequence.length()) {
                                    char charAt3 = charSequence.charAt(i19);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        int i20 = i11 + 1;
                                        array[i11] = (byte) ((codePoint >>> 18) | 240);
                                        int i21 = i20 + 1;
                                        array[i20] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i22 = i21 + 1;
                                        array[i21] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i11 = i22 + 1;
                                        array[i22] = (byte) ((codePoint & 63) | 128);
                                        i13 = i19;
                                        i13++;
                                    } else {
                                        i13 = i19;
                                    }
                                }
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i13 - 1);
                                throw new IllegalArgumentException(sb.toString());
                            } else {
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(charAt2);
                                sb2.append(" at index ");
                                sb2.append(i11);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            i11 = i12;
                            i13++;
                        }
                    }
                    byteBuffer.position(i11 - byteBuffer.arrayOffset());
                } catch (ArrayIndexOutOfBoundsException e10) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e10);
                    throw bufferOverflowException;
                }
            } else {
                int length2 = charSequence.length();
                while (i13 < length2) {
                    char charAt4 = charSequence.charAt(i13);
                    if (charAt4 >= 128) {
                        if (charAt4 < 2048) {
                            i10 = (charAt4 >>> 6) | 960;
                        } else if (charAt4 < 55296 || 57343 < charAt4) {
                            byteBuffer.put((byte) ((charAt4 >>> 12) | 480));
                            i10 = ((charAt4 >>> 6) & 63) | 128;
                        } else {
                            int i23 = i13 + 1;
                            if (i23 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i23);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                                    byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                                    i13 = i23;
                                    i13++;
                                } else {
                                    i13 = i23;
                                }
                            }
                            StringBuilder sb3 = new StringBuilder(39);
                            sb3.append("Unpaired surrogate at index ");
                            sb3.append(i13 - 1);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                        byteBuffer.put((byte) i10);
                        charAt4 = (charAt4 & '?') | 128;
                    }
                    byteBuffer.put((byte) charAt4);
                    i13++;
                }
            }
        } else {
            throw new ReadOnlyBufferException();
        }
    }

    public static int m(long j8) {
        if ((-128 & j8) == 0) {
            return 1;
        }
        if ((-16384 & j8) == 0) {
            return 2;
        }
        if ((-2097152 & j8) == 0) {
            return 3;
        }
        if ((-268435456 & j8) == 0) {
            return 4;
        }
        if ((-34359738368L & j8) == 0) {
            return 5;
        }
        if ((-4398046511104L & j8) == 0) {
            return 6;
        }
        if ((-562949953421312L & j8) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j8) == 0) {
            return 8;
        }
        return (j8 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int n(int i10) {
        return o(i10 << 3);
    }

    public static int o(int i10) {
        if ((i10 & -128) == 0) {
            return 1;
        }
        if ((i10 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i10) == 0) {
            return 3;
        }
        return (i10 & -268435456) == 0 ? 4 : 5;
    }

    public final void b(int i10, o3 o3Var) {
        i(i10, 2);
        if (o3Var.f2543o < 0) {
            o3Var.d();
        }
        f(o3Var.f2543o);
        o3Var.i(this);
    }

    public final void c(int i10, byte[] bArr) {
        i(i10, 2);
        f(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = this.f2506a;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new e(byteBuffer.position(), byteBuffer.limit());
    }

    public final void d(String str, int i10) {
        ByteBuffer byteBuffer = this.f2506a;
        i(i10, 2);
        try {
            int o10 = o(str.length());
            if (o10 == o(str.length() * 3)) {
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= o10) {
                    byteBuffer.position(position + o10);
                    j(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    f((position2 - position) - o10);
                    byteBuffer.position(position2);
                    return;
                }
                throw new e(position + o10, byteBuffer.limit());
            }
            f(a(str));
            j(str, byteBuffer);
        } catch (BufferOverflowException e10) {
            e eVar = new e(byteBuffer.position(), byteBuffer.limit());
            eVar.initCause(e10);
            throw eVar;
        }
    }

    public final void e(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = this.f2506a;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b10);
            return;
        }
        throw new e(byteBuffer.position(), byteBuffer.limit());
    }

    public final void f(int i10) {
        while ((i10 & -128) != 0) {
            e((i10 & 127) | 128);
            i10 >>>= 7;
        }
        e(i10);
    }

    public final void i(int i10, int i11) {
        f((i10 << 3) | i11);
    }

    public final void k(int i10, p0 p0Var) {
        x xVar;
        x xVar2 = this.f2507b;
        ByteBuffer byteBuffer = this.f2506a;
        if (xVar2 == null) {
            Logger logger = x.f2576p;
            if (byteBuffer.hasArray()) {
                xVar = new x.b(byteBuffer);
            } else if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
                throw new IllegalArgumentException("ByteBuffer is read-only");
            } else if (a3.f2367e) {
                xVar = new x.e(byteBuffer);
            } else {
                xVar = new x.d(byteBuffer);
            }
            this.f2507b = xVar;
        } else {
            if (this.f2508c != byteBuffer.position()) {
                this.f2507b.F(byteBuffer.array(), this.f2508c, byteBuffer.position() - this.f2508c);
            }
            x xVar3 = this.f2507b;
            xVar3.K(i10, p0Var);
            xVar3.E();
            this.f2508c = byteBuffer.position();
        }
        this.f2508c = byteBuffer.position();
        x xVar32 = this.f2507b;
        xVar32.K(i10, p0Var);
        xVar32.E();
        this.f2508c = byteBuffer.position();
    }

    public final void l(long j8) {
        while ((-128 & j8) != 0) {
            e((((int) j8) & 127) | 128);
            j8 >>>= 7;
        }
        e((int) j8);
    }
}

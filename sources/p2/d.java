package p2;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f7871a = new byte[256];

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f7872b;

    /* renamed from: c  reason: collision with root package name */
    public c f7873c;
    public int d = 0;

    public final boolean a() {
        return this.f7873c.f7862b != 0;
    }

    public final c b() {
        boolean z;
        byte[] bArr;
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f7872b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (a()) {
            return this.f7873c;
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i10 = 0; i10 < 6; i10++) {
                sb.append((char) c());
            }
            if (!sb.toString().startsWith("GIF")) {
                this.f7873c.f7862b = 1;
            } else {
                this.f7873c.f7865f = f();
                this.f7873c.f7866g = f();
                int c10 = c();
                c cVar = this.f7873c;
                if ((c10 & 128) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                cVar.f7867h = z12;
                cVar.f7868i = (int) Math.pow(2.0d, (double) ((c10 & 7) + 1));
                this.f7873c.f7869j = c();
                c cVar2 = this.f7873c;
                c();
                cVar2.getClass();
                if (this.f7873c.f7867h && !a()) {
                    c cVar3 = this.f7873c;
                    cVar3.f7861a = e(cVar3.f7868i);
                    c cVar4 = this.f7873c;
                    cVar4.f7870k = cVar4.f7861a[cVar4.f7869j];
                }
            }
            if (!a()) {
                boolean z13 = false;
                while (!z13 && !a() && this.f7873c.f7863c <= Integer.MAX_VALUE) {
                    int c11 = c();
                    if (c11 == 33) {
                        int c12 = c();
                        if (c12 != 1) {
                            if (c12 == 249) {
                                this.f7873c.d = new b();
                                c();
                                int c13 = c();
                                b bVar = this.f7873c.d;
                                int i11 = (c13 & 28) >> 2;
                                bVar.f7856g = i11;
                                if (i11 == 0) {
                                    bVar.f7856g = 1;
                                }
                                if ((c13 & 1) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                bVar.f7855f = z;
                                int f10 = f();
                                if (f10 < 2) {
                                    f10 = 10;
                                }
                                b bVar2 = this.f7873c.d;
                                bVar2.f7858i = f10 * 10;
                                bVar2.f7857h = c();
                                c();
                            } else if (c12 != 254 && c12 == 255) {
                                d();
                                StringBuilder sb2 = new StringBuilder();
                                int i12 = 0;
                                while (true) {
                                    bArr = this.f7871a;
                                    if (i12 >= 11) {
                                        break;
                                    }
                                    sb2.append((char) bArr[i12]);
                                    i12++;
                                }
                                if (sb2.toString().equals("NETSCAPE2.0")) {
                                    do {
                                        d();
                                        if (bArr[0] == 1) {
                                            byte b10 = bArr[1];
                                            byte b11 = bArr[2];
                                            this.f7873c.getClass();
                                        }
                                        if (this.d <= 0) {
                                            break;
                                        }
                                    } while (a());
                                }
                            }
                        }
                        g();
                    } else if (c11 == 44) {
                        c cVar5 = this.f7873c;
                        if (cVar5.d == null) {
                            cVar5.d = new b();
                        }
                        this.f7873c.d.f7851a = f();
                        this.f7873c.d.f7852b = f();
                        this.f7873c.d.f7853c = f();
                        this.f7873c.d.d = f();
                        int c14 = c();
                        if ((c14 & 128) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int pow = (int) Math.pow(2.0d, (double) ((c14 & 7) + 1));
                        b bVar3 = this.f7873c.d;
                        if ((c14 & 64) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        bVar3.f7854e = z11;
                        if (z10) {
                            bVar3.f7860k = e(pow);
                        } else {
                            bVar3.f7860k = null;
                        }
                        this.f7873c.d.f7859j = this.f7872b.position();
                        c();
                        g();
                        if (!a()) {
                            c cVar6 = this.f7873c;
                            cVar6.f7863c++;
                            cVar6.f7864e.add(cVar6.d);
                        }
                    } else if (c11 != 59) {
                        this.f7873c.f7862b = 1;
                    } else {
                        z13 = true;
                    }
                }
                c cVar7 = this.f7873c;
                if (cVar7.f7863c < 0) {
                    cVar7.f7862b = 1;
                }
            }
            return this.f7873c;
        }
    }

    public final int c() {
        try {
            return this.f7872b.get() & 255;
        } catch (Exception unused) {
            this.f7873c.f7862b = 1;
            return 0;
        }
    }

    public final void d() {
        int c10 = c();
        this.d = c10;
        if (c10 > 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                try {
                    int i12 = this.d;
                    if (i10 < i12) {
                        i11 = i12 - i10;
                        this.f7872b.get(this.f7871a, i10, i11);
                        i10 += i11;
                    } else {
                        return;
                    }
                } catch (Exception e10) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i10 + " count: " + i11 + " blockSize: " + this.d, e10);
                    }
                    this.f7873c.f7862b = 1;
                    return;
                }
            }
        }
    }

    public final int[] e(int i10) {
        byte[] bArr = new byte[(i10 * 3)];
        int[] iArr = null;
        try {
            this.f7872b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                int i15 = i14 + 1;
                int i16 = i11 + 1;
                iArr[i11] = ((bArr[i12] & 255) << 16) | -16777216 | ((bArr[i13] & 255) << 8) | (bArr[i14] & 255);
                i12 = i15;
                i11 = i16;
            }
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f7873c.f7862b = 1;
        }
        return iArr;
    }

    public final int f() {
        return this.f7872b.getShort();
    }

    public final void g() {
        int c10;
        do {
            c10 = c();
            this.f7872b.position(Math.min(this.f7872b.position() + c10, this.f7872b.limit()));
        } while (c10 > 0);
    }
}

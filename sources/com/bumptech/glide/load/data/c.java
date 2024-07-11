package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.OutputStream;
import t2.b;

public final class c extends OutputStream {

    /* renamed from: o  reason: collision with root package name */
    public final OutputStream f2268o;

    /* renamed from: p  reason: collision with root package name */
    public byte[] f2269p;

    /* renamed from: q  reason: collision with root package name */
    public final b f2270q;

    /* renamed from: r  reason: collision with root package name */
    public int f2271r;

    public c(FileOutputStream fileOutputStream, b bVar) {
        this.f2268o = fileOutputStream;
        this.f2270q = bVar;
        this.f2269p = (byte[]) bVar.c(65536, byte[].class);
    }

    /* JADX INFO: finally extract failed */
    public final void close() {
        OutputStream outputStream = this.f2268o;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.f2269p;
            if (bArr != null) {
                this.f2270q.put(bArr);
                this.f2269p = null;
            }
        } catch (Throwable th) {
            outputStream.close();
            throw th;
        }
    }

    public final void flush() {
        int i10 = this.f2271r;
        OutputStream outputStream = this.f2268o;
        if (i10 > 0) {
            outputStream.write(this.f2269p, 0, i10);
            this.f2271r = 0;
        }
        outputStream.flush();
    }

    public final void write(int i10) {
        byte[] bArr = this.f2269p;
        int i11 = this.f2271r;
        int i12 = i11 + 1;
        this.f2271r = i12;
        bArr[i11] = (byte) i10;
        if (i12 == bArr.length && i12 > 0) {
            this.f2268o.write(bArr, 0, i12);
            this.f2271r = 0;
        }
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f2271r;
            OutputStream outputStream = this.f2268o;
            if (i15 != 0 || i13 < this.f2269p.length) {
                int min = Math.min(i13, this.f2269p.length - i15);
                System.arraycopy(bArr, i14, this.f2269p, this.f2271r, min);
                int i16 = this.f2271r + min;
                this.f2271r = i16;
                i12 += min;
                byte[] bArr2 = this.f2269p;
                if (i16 == bArr2.length && i16 > 0) {
                    outputStream.write(bArr2, 0, i16);
                    this.f2271r = 0;
                    continue;
                }
            } else {
                outputStream.write(bArr, i14, i13);
                return;
            }
        } while (i12 < i11);
    }
}

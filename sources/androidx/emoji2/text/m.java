package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import q0.b;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final b f1085a;

    /* renamed from: b  reason: collision with root package name */
    public final char[] f1086b;

    /* renamed from: c  reason: collision with root package name */
    public final a f1087c = new a(1024);
    public final Typeface d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<a> f1088a;

        /* renamed from: b  reason: collision with root package name */
        public h f1089b;

        public a() {
            this(1);
        }

        public a(int i10) {
            this.f1088a = new SparseArray<>(i10);
        }

        public final void a(h hVar, int i10, int i11) {
            a aVar;
            int a10 = hVar.a(i10);
            SparseArray<a> sparseArray = this.f1088a;
            if (sparseArray == null) {
                aVar = null;
            } else {
                aVar = sparseArray.get(a10);
            }
            if (aVar == null) {
                aVar = new a();
                sparseArray.put(hVar.a(i10), aVar);
            }
            if (i11 > i10) {
                aVar.a(hVar, i10 + 1, i11);
            } else {
                aVar.f1089b = hVar;
            }
        }
    }

    public m(Typeface typeface, b bVar) {
        int i10;
        int i11;
        int i12;
        boolean z;
        this.d = typeface;
        this.f1085a = bVar;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i13 = a10 + bVar.f8206a;
            i10 = bVar.f8207b.getInt(bVar.f8207b.getInt(i13) + i13);
        } else {
            i10 = 0;
        }
        this.f1086b = new char[(i10 * 2)];
        int a11 = bVar.a(6);
        if (a11 != 0) {
            int i14 = a11 + bVar.f8206a;
            i11 = bVar.f8207b.getInt(bVar.f8207b.getInt(i14) + i14);
        } else {
            i11 = 0;
        }
        for (int i15 = 0; i15 < i11; i15++) {
            h hVar = new h(this, i15);
            q0.a c10 = hVar.c();
            int a12 = c10.a(4);
            if (a12 != 0) {
                i12 = c10.f8207b.getInt(a12 + c10.f8206a);
            } else {
                i12 = 0;
            }
            Character.toChars(i12, this.f1086b, i15 * 2);
            if (hVar.b() > 0) {
                z = true;
            } else {
                z = false;
            }
            s6.a.k("invalid metadata codepoint length", z);
            this.f1087c.a(hVar, 0, hVar.b() - 1);
        }
    }
}

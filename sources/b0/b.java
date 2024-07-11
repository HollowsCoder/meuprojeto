package b0;

import android.graphics.Insets;

public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f1930e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f1931a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1932b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1933c;
    public final int d;

    public b(int i10, int i11, int i12, int i13) {
        this.f1931a = i10;
        this.f1932b = i11;
        this.f1933c = i12;
        this.d = i13;
    }

    public static b a(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f1930e : new b(i10, i11, i12, i13);
    }

    public static b b(Insets insets) {
        return a(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets c() {
        return Insets.of(this.f1931a, this.f1932b, this.f1933c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.d == bVar.d && this.f1931a == bVar.f1931a && this.f1933c == bVar.f1933c && this.f1932b == bVar.f1932b;
    }

    public final int hashCode() {
        return (((((this.f1931a * 31) + this.f1932b) * 31) + this.f1933c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f1931a + ", top=" + this.f1932b + ", right=" + this.f1933c + ", bottom=" + this.d + '}';
    }
}

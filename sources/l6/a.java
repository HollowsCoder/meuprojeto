package l6;

import android.graphics.Paint;
import android.graphics.Path;

public final class a {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f6962i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f6963j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f6964k = new int[4];
    public static final float[] l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f6965a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f6966b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f6967c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f6968e;

    /* renamed from: f  reason: collision with root package name */
    public int f6969f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f6970g = new Path();

    /* renamed from: h  reason: collision with root package name */
    public final Paint f6971h;

    public a() {
        Paint paint = new Paint();
        this.f6971h = paint;
        this.f6965a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f6966b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f6967c = new Paint(paint2);
    }

    public final void a(int i10) {
        this.d = b0.a.c(i10, 68);
        this.f6968e = b0.a.c(i10, 20);
        this.f6969f = b0.a.c(i10, 0);
        this.f6965a.setColor(this.d);
    }
}

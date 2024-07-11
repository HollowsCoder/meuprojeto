package com.squareup.picasso;

import java.io.PrintWriter;

public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f3911a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3912b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3913c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3914e;

    /* renamed from: f  reason: collision with root package name */
    public final long f3915f;

    /* renamed from: g  reason: collision with root package name */
    public final long f3916g;

    /* renamed from: h  reason: collision with root package name */
    public final long f3917h;

    /* renamed from: i  reason: collision with root package name */
    public final long f3918i;

    /* renamed from: j  reason: collision with root package name */
    public final long f3919j;

    /* renamed from: k  reason: collision with root package name */
    public final int f3920k;
    public final int l;

    /* renamed from: m  reason: collision with root package name */
    public final int f3921m;

    /* renamed from: n  reason: collision with root package name */
    public final long f3922n;

    public b0(int i10, int i11, long j8, long j10, long j11, long j12, long j13, long j14, long j15, long j16, int i12, int i13, int i14, long j17) {
        this.f3911a = i10;
        this.f3912b = i11;
        this.f3913c = j8;
        this.d = j10;
        this.f3914e = j11;
        this.f3915f = j12;
        this.f3916g = j13;
        this.f3917h = j14;
        this.f3918i = j15;
        this.f3919j = j16;
        this.f3920k = i12;
        this.l = i13;
        this.f3921m = i14;
        this.f3922n = j17;
    }

    public final void a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        int i10 = this.f3911a;
        printWriter.println(i10);
        printWriter.print("  Cache Size: ");
        int i11 = this.f3912b;
        printWriter.println(i11);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((double) ((((float) i11) / ((float) i10)) * 100.0f)));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f3913c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f3920k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f3914e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f3917h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f3915f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f3921m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f3916g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f3918i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f3919j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public final String toString() {
        return "StatsSnapshot{maxSize=" + this.f3911a + ", size=" + this.f3912b + ", cacheHits=" + this.f3913c + ", cacheMisses=" + this.d + ", downloadCount=" + this.f3920k + ", totalDownloadSize=" + this.f3914e + ", averageDownloadSize=" + this.f3917h + ", totalOriginalBitmapSize=" + this.f3915f + ", totalTransformedBitmapSize=" + this.f3916g + ", averageOriginalBitmapSize=" + this.f3918i + ", averageTransformedBitmapSize=" + this.f3919j + ", originalBitmapCount=" + this.l + ", transformedBitmapCount=" + this.f3921m + ", timeStamp=" + this.f3922n + '}';
    }
}

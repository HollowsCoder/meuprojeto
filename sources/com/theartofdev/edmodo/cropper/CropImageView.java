package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.theartofdev.edmodo.cropper.CropOverlayView;
import com.theartofdev.edmodo.cropper.c;
import java.io.File;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.UUID;

public class CropImageView extends FrameLayout {

    /* renamed from: a0  reason: collision with root package name */
    public static final /* synthetic */ int f4023a0 = 0;
    public boolean A;
    public int B;
    public int C;
    public int D;
    public k E;
    public boolean F = false;
    public boolean G = true;
    public boolean H = true;
    public boolean I = true;
    public int J;
    public i K;
    public e L;
    public Uri M;
    public int N = 1;
    public float O = 1.0f;
    public float P;
    public float Q;
    public RectF R;
    public int S;
    public boolean T;
    public Uri U;
    public WeakReference<b> V;
    public WeakReference<a> W;

    /* renamed from: o  reason: collision with root package name */
    public final ImageView f4024o;

    /* renamed from: p  reason: collision with root package name */
    public final CropOverlayView f4025p;

    /* renamed from: q  reason: collision with root package name */
    public final Matrix f4026q = new Matrix();

    /* renamed from: r  reason: collision with root package name */
    public final Matrix f4027r = new Matrix();

    /* renamed from: s  reason: collision with root package name */
    public final ProgressBar f4028s;

    /* renamed from: t  reason: collision with root package name */
    public final float[] f4029t = new float[8];
    public final float[] u = new float[8];

    /* renamed from: v  reason: collision with root package name */
    public k8.a f4030v;
    public Bitmap w;

    /* renamed from: x  reason: collision with root package name */
    public int f4031x;

    /* renamed from: y  reason: collision with root package name */
    public int f4032y;
    public boolean z;

    public class a implements CropOverlayView.a {
        public a() {
        }
    }

    public static class b {

        /* renamed from: o  reason: collision with root package name */
        public final Uri f4034o;

        /* renamed from: p  reason: collision with root package name */
        public final Uri f4035p;

        /* renamed from: q  reason: collision with root package name */
        public final Exception f4036q;

        /* renamed from: r  reason: collision with root package name */
        public final float[] f4037r;

        /* renamed from: s  reason: collision with root package name */
        public final Rect f4038s;

        /* renamed from: t  reason: collision with root package name */
        public final Rect f4039t;
        public final int u;

        /* renamed from: v  reason: collision with root package name */
        public final int f4040v;

        public b(Uri uri, Uri uri2, Exception exc, float[] fArr, Rect rect, Rect rect2, int i10, int i11) {
            this.f4034o = uri;
            this.f4035p = uri2;
            this.f4036q = exc;
            this.f4037r = fArr;
            this.f4038s = rect;
            this.f4039t = rect2;
            this.u = i10;
            this.f4040v = i11;
        }
    }

    public enum c {
        RECTANGLE,
        OVAL
    }

    public enum d {
        OFF,
        ON_TOUCH,
        ON
    }

    public interface e {
    }

    public interface f {
    }

    public interface g {
    }

    public interface h {
    }

    public interface i {
    }

    public enum j {
        NONE,
        SAMPLING,
        RESIZE_INSIDE,
        RESIZE_FIT,
        RESIZE_EXACT
    }

    public enum k {
        FIT_CENTER,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE
    }

    /* JADX WARNING: type inference failed for: r3v44, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CropImageView(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            r9.<init>(r10, r11)
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r9.f4026q = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r9.f4027r = r0
            r0 = 8
            float[] r1 = new float[r0]
            r9.f4029t = r1
            float[] r1 = new float[r0]
            r9.u = r1
            r1 = 0
            r9.F = r1
            r2 = 1
            r9.G = r2
            r9.H = r2
            r9.I = r2
            r9.N = r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r9.O = r3
            boolean r3 = r10 instanceof android.app.Activity
            r4 = 0
            if (r3 == 0) goto L_0x0038
            r3 = r10
            android.app.Activity r3 = (android.app.Activity) r3
            android.content.Intent r3 = r3.getIntent()
            goto L_0x0039
        L_0x0038:
            r3 = r4
        L_0x0039:
            if (r3 == 0) goto L_0x004c
            java.lang.String r5 = "CROP_IMAGE_EXTRA_BUNDLE"
            android.os.Bundle r3 = r3.getBundleExtra(r5)
            if (r3 == 0) goto L_0x004c
            java.lang.String r4 = "CROP_IMAGE_EXTRA_OPTIONS"
            android.os.Parcelable r3 = r3.getParcelable(r4)
            r4 = r3
            com.theartofdev.edmodo.cropper.e r4 = (com.theartofdev.edmodo.cropper.e) r4
        L_0x004c:
            if (r4 != 0) goto L_0x01dc
            com.theartofdev.edmodo.cropper.e r4 = new com.theartofdev.edmodo.cropper.e
            r4.<init>()
            if (r11 == 0) goto L_0x01dc
            int[] r3 = s6.a.P
            android.content.res.TypedArray r11 = r10.obtainStyledAttributes(r11, r3, r1, r1)
            boolean r3 = r4.z     // Catch:{ all -> 0x01d7 }
            r5 = 10
            boolean r3 = r11.getBoolean(r5, r3)     // Catch:{ all -> 0x01d7 }
            r4.z = r3     // Catch:{ all -> 0x01d7 }
            int r3 = r4.A     // Catch:{ all -> 0x01d7 }
            int r3 = r11.getInteger(r1, r3)     // Catch:{ all -> 0x01d7 }
            r4.A = r3     // Catch:{ all -> 0x01d7 }
            int r3 = r4.B     // Catch:{ all -> 0x01d7 }
            int r3 = r11.getInteger(r2, r3)     // Catch:{ all -> 0x01d7 }
            r4.B = r3     // Catch:{ all -> 0x01d7 }
            com.theartofdev.edmodo.cropper.CropImageView$k[] r3 = com.theartofdev.edmodo.cropper.CropImageView.k.values()     // Catch:{ all -> 0x01d7 }
            com.theartofdev.edmodo.cropper.CropImageView$k r6 = r4.f4103s     // Catch:{ all -> 0x01d7 }
            int r6 = r6.ordinal()     // Catch:{ all -> 0x01d7 }
            r7 = 26
            int r6 = r11.getInt(r7, r6)     // Catch:{ all -> 0x01d7 }
            r3 = r3[r6]     // Catch:{ all -> 0x01d7 }
            r4.f4103s = r3     // Catch:{ all -> 0x01d7 }
            boolean r3 = r4.f4105v     // Catch:{ all -> 0x01d7 }
            r6 = 2
            boolean r3 = r11.getBoolean(r6, r3)     // Catch:{ all -> 0x01d7 }
            r4.f4105v = r3     // Catch:{ all -> 0x01d7 }
            boolean r3 = r4.w     // Catch:{ all -> 0x01d7 }
            r6 = 24
            boolean r3 = r11.getBoolean(r6, r3)     // Catch:{ all -> 0x01d7 }
            r4.w = r3     // Catch:{ all -> 0x01d7 }
            int r3 = r4.f4106x     // Catch:{ all -> 0x01d7 }
            r6 = 19
            int r3 = r11.getInteger(r6, r3)     // Catch:{ all -> 0x01d7 }
            r4.f4106x = r3     // Catch:{ all -> 0x01d7 }
            com.theartofdev.edmodo.cropper.CropImageView$c[] r3 = com.theartofdev.edmodo.cropper.CropImageView.c.values()     // Catch:{ all -> 0x01d7 }
            com.theartofdev.edmodo.cropper.CropImageView$c r6 = r4.f4099o     // Catch:{ all -> 0x01d7 }
            int r6 = r6.ordinal()     // Catch:{ all -> 0x01d7 }
            r7 = 27
            int r6 = r11.getInt(r7, r6)     // Catch:{ all -> 0x01d7 }
            r3 = r3[r6]     // Catch:{ all -> 0x01d7 }
            r4.f4099o = r3     // Catch:{ all -> 0x01d7 }
            com.theartofdev.edmodo.cropper.CropImageView$d[] r3 = com.theartofdev.edmodo.cropper.CropImageView.d.values()     // Catch:{ all -> 0x01d7 }
            com.theartofdev.edmodo.cropper.CropImageView$d r6 = r4.f4102r     // Catch:{ all -> 0x01d7 }
            int r6 = r6.ordinal()     // Catch:{ all -> 0x01d7 }
            r7 = 13
            int r6 = r11.getInt(r7, r6)     // Catch:{ all -> 0x01d7 }
            r3 = r3[r6]     // Catch:{ all -> 0x01d7 }
            r4.f4102r = r3     // Catch:{ all -> 0x01d7 }
            float r3 = r4.f4100p     // Catch:{ all -> 0x01d7 }
            r6 = 30
            float r3 = r11.getDimension(r6, r3)     // Catch:{ all -> 0x01d7 }
            r4.f4100p = r3     // Catch:{ all -> 0x01d7 }
            float r3 = r4.f4101q     // Catch:{ all -> 0x01d7 }
            r6 = 31
            float r3 = r11.getDimension(r6, r3)     // Catch:{ all -> 0x01d7 }
            r4.f4101q = r3     // Catch:{ all -> 0x01d7 }
            float r3 = r4.f4107y     // Catch:{ all -> 0x01d7 }
            r6 = 16
            float r3 = r11.getFloat(r6, r3)     // Catch:{ all -> 0x01d7 }
            r4.f4107y = r3     // Catch:{ all -> 0x01d7 }
            float r3 = r4.C     // Catch:{ all -> 0x01d7 }
            r6 = 9
            float r3 = r11.getDimension(r6, r3)     // Catch:{ all -> 0x01d7 }
            r4.C = r3     // Catch:{ all -> 0x01d7 }
            int r3 = r4.D     // Catch:{ all -> 0x01d7 }
            int r0 = r11.getInteger(r0, r3)     // Catch:{ all -> 0x01d7 }
            r4.D = r0     // Catch:{ all -> 0x01d7 }
            float r0 = r4.E     // Catch:{ all -> 0x01d7 }
            r3 = 7
            float r0 = r11.getDimension(r3, r0)     // Catch:{ all -> 0x01d7 }
            r4.E = r0     // Catch:{ all -> 0x01d7 }
            float r0 = r4.F     // Catch:{ all -> 0x01d7 }
            r6 = 6
            float r0 = r11.getDimension(r6, r0)     // Catch:{ all -> 0x01d7 }
            r4.F = r0     // Catch:{ all -> 0x01d7 }
            float r0 = r4.G     // Catch:{ all -> 0x01d7 }
            r6 = 5
            float r0 = r11.getDimension(r6, r0)     // Catch:{ all -> 0x01d7 }
            r4.G = r0     // Catch:{ all -> 0x01d7 }
            int r0 = r4.H     // Catch:{ all -> 0x01d7 }
            r6 = 4
            int r0 = r11.getInteger(r6, r0)     // Catch:{ all -> 0x01d7 }
            r4.H = r0     // Catch:{ all -> 0x01d7 }
            float r0 = r4.I     // Catch:{ all -> 0x01d7 }
            r6 = 15
            float r0 = r11.getDimension(r6, r0)     // Catch:{ all -> 0x01d7 }
            r4.I = r0     // Catch:{ all -> 0x01d7 }
            int r0 = r4.J     // Catch:{ all -> 0x01d7 }
            r6 = 14
            int r0 = r11.getInteger(r6, r0)     // Catch:{ all -> 0x01d7 }
            r4.J = r0     // Catch:{ all -> 0x01d7 }
            int r0 = r4.K     // Catch:{ all -> 0x01d7 }
            r6 = 3
            int r0 = r11.getInteger(r6, r0)     // Catch:{ all -> 0x01d7 }
            r4.K = r0     // Catch:{ all -> 0x01d7 }
            boolean r0 = r9.G     // Catch:{ all -> 0x01d7 }
            r6 = 28
            boolean r0 = r11.getBoolean(r6, r0)     // Catch:{ all -> 0x01d7 }
            r4.f4104t = r0     // Catch:{ all -> 0x01d7 }
            boolean r0 = r9.H     // Catch:{ all -> 0x01d7 }
            r6 = 29
            boolean r0 = r11.getBoolean(r6, r0)     // Catch:{ all -> 0x01d7 }
            r4.u = r0     // Catch:{ all -> 0x01d7 }
            float r0 = r4.E     // Catch:{ all -> 0x01d7 }
            float r0 = r11.getDimension(r3, r0)     // Catch:{ all -> 0x01d7 }
            r4.E = r0     // Catch:{ all -> 0x01d7 }
            int r0 = r4.L     // Catch:{ all -> 0x01d7 }
            float r0 = (float) r0     // Catch:{ all -> 0x01d7 }
            r3 = 23
            float r0 = r11.getDimension(r3, r0)     // Catch:{ all -> 0x01d7 }
            int r0 = (int) r0     // Catch:{ all -> 0x01d7 }
            r4.L = r0     // Catch:{ all -> 0x01d7 }
            int r0 = r4.M     // Catch:{ all -> 0x01d7 }
            float r0 = (float) r0     // Catch:{ all -> 0x01d7 }
            r3 = 22
            float r0 = r11.getDimension(r3, r0)     // Catch:{ all -> 0x01d7 }
            int r0 = (int) r0     // Catch:{ all -> 0x01d7 }
            r4.M = r0     // Catch:{ all -> 0x01d7 }
            int r0 = r4.N     // Catch:{ all -> 0x01d7 }
            float r0 = (float) r0     // Catch:{ all -> 0x01d7 }
            r3 = 21
            float r0 = r11.getFloat(r3, r0)     // Catch:{ all -> 0x01d7 }
            int r0 = (int) r0     // Catch:{ all -> 0x01d7 }
            r4.N = r0     // Catch:{ all -> 0x01d7 }
            int r0 = r4.O     // Catch:{ all -> 0x01d7 }
            float r0 = (float) r0     // Catch:{ all -> 0x01d7 }
            r3 = 20
            float r0 = r11.getFloat(r3, r0)     // Catch:{ all -> 0x01d7 }
            int r0 = (int) r0     // Catch:{ all -> 0x01d7 }
            r4.O = r0     // Catch:{ all -> 0x01d7 }
            int r0 = r4.P     // Catch:{ all -> 0x01d7 }
            float r0 = (float) r0     // Catch:{ all -> 0x01d7 }
            r3 = 18
            float r0 = r11.getFloat(r3, r0)     // Catch:{ all -> 0x01d7 }
            int r0 = (int) r0     // Catch:{ all -> 0x01d7 }
            r4.P = r0     // Catch:{ all -> 0x01d7 }
            int r0 = r4.Q     // Catch:{ all -> 0x01d7 }
            float r0 = (float) r0     // Catch:{ all -> 0x01d7 }
            r3 = 17
            float r0 = r11.getFloat(r3, r0)     // Catch:{ all -> 0x01d7 }
            int r0 = (int) r0     // Catch:{ all -> 0x01d7 }
            r4.Q = r0     // Catch:{ all -> 0x01d7 }
            boolean r0 = r4.f4095g0     // Catch:{ all -> 0x01d7 }
            r3 = 11
            boolean r0 = r11.getBoolean(r3, r0)     // Catch:{ all -> 0x01d7 }
            r4.f4095g0 = r0     // Catch:{ all -> 0x01d7 }
            boolean r0 = r4.f4096h0     // Catch:{ all -> 0x01d7 }
            boolean r0 = r11.getBoolean(r3, r0)     // Catch:{ all -> 0x01d7 }
            r4.f4096h0 = r0     // Catch:{ all -> 0x01d7 }
            boolean r0 = r9.F     // Catch:{ all -> 0x01d7 }
            r3 = 25
            boolean r0 = r11.getBoolean(r3, r0)     // Catch:{ all -> 0x01d7 }
            r9.F = r0     // Catch:{ all -> 0x01d7 }
            boolean r0 = r11.hasValue(r1)     // Catch:{ all -> 0x01d7 }
            if (r0 == 0) goto L_0x01d3
            boolean r0 = r11.hasValue(r1)     // Catch:{ all -> 0x01d7 }
            if (r0 == 0) goto L_0x01d3
            boolean r0 = r11.hasValue(r5)     // Catch:{ all -> 0x01d7 }
            if (r0 != 0) goto L_0x01d3
            r4.z = r2     // Catch:{ all -> 0x01d7 }
        L_0x01d3:
            r11.recycle()
            goto L_0x01dc
        L_0x01d7:
            r10 = move-exception
            r11.recycle()
            throw r10
        L_0x01dc:
            int r11 = r4.f4106x
            if (r11 < 0) goto L_0x0302
            float r0 = r4.f4101q
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x02fa
            float r0 = r4.f4107y
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x02f2
            double r5 = (double) r0
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x02f2
            int r0 = r4.A
            java.lang.String r3 = "Cannot set aspect ratio value to a number less than or equal to 0."
            if (r0 <= 0) goto L_0x02ec
            int r0 = r4.B
            if (r0 <= 0) goto L_0x02e6
            float r0 = r4.C
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x02de
            float r0 = r4.E
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x02d6
            float r0 = r4.I
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x02ce
            int r0 = r4.M
            if (r0 < 0) goto L_0x02c6
            int r0 = r4.N
            if (r0 < 0) goto L_0x02be
            int r1 = r4.O
            if (r1 < 0) goto L_0x02b6
            int r3 = r4.P
            if (r3 < r0) goto L_0x02ae
            int r0 = r4.Q
            if (r0 < r1) goto L_0x02a6
            int r0 = r4.W
            if (r0 < 0) goto L_0x029e
            int r0 = r4.X
            if (r0 < 0) goto L_0x0296
            int r0 = r4.f4094f0
            if (r0 < 0) goto L_0x028e
            r1 = 360(0x168, float:5.04E-43)
            if (r0 > r1) goto L_0x028e
            com.theartofdev.edmodo.cropper.CropImageView$k r0 = r4.f4103s
            r9.E = r0
            boolean r0 = r4.f4105v
            r9.I = r0
            r9.J = r11
            boolean r11 = r4.f4104t
            r9.G = r11
            boolean r11 = r4.u
            r9.H = r11
            boolean r11 = r4.f4095g0
            r9.z = r11
            boolean r11 = r4.f4096h0
            r9.A = r11
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            r11 = 2131558438(0x7f0d0026, float:1.8742192E38)
            android.view.View r10 = r10.inflate(r11, r9, r2)
            r11 = 2131361799(0x7f0a0007, float:1.834336E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r9.f4024o = r11
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            r11.setScaleType(r0)
            r11 = 2131361796(0x7f0a0004, float:1.8343354E38)
            android.view.View r11 = r10.findViewById(r11)
            com.theartofdev.edmodo.cropper.CropOverlayView r11 = (com.theartofdev.edmodo.cropper.CropOverlayView) r11
            r9.f4025p = r11
            com.theartofdev.edmodo.cropper.CropImageView$a r0 = new com.theartofdev.edmodo.cropper.CropImageView$a
            r0.<init>()
            r11.setCropWindowChangeListener(r0)
            r11.setInitialAttributeValues(r4)
            r11 = 2131361797(0x7f0a0005, float:1.8343356E38)
            android.view.View r10 = r10.findViewById(r11)
            android.widget.ProgressBar r10 = (android.widget.ProgressBar) r10
            r9.f4028s = r10
            r9.h()
            return
        L_0x028e:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Cannot set rotation degrees value to a number < 0 or > 360"
            r10.<init>(r11)
            throw r10
        L_0x0296:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Cannot set request height value to a number < 0 "
            r10.<init>(r11)
            throw r10
        L_0x029e:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Cannot set request width value to a number < 0 "
            r10.<init>(r11)
            throw r10
        L_0x02a6:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Cannot set max crop result height to smaller value than min crop result height"
            r10.<init>(r11)
            throw r10
        L_0x02ae:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Cannot set max crop result width to smaller value than min crop result width"
            r10.<init>(r11)
            throw r10
        L_0x02b6:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Cannot set min crop result height value to a number < 0 "
            r10.<init>(r11)
            throw r10
        L_0x02be:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Cannot set min crop result width value to a number < 0 "
            r10.<init>(r11)
            throw r10
        L_0x02c6:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Cannot set min crop window height value to a number < 0 "
            r10.<init>(r11)
            throw r10
        L_0x02ce:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Cannot set guidelines thickness value to a number less than 0."
            r10.<init>(r11)
            throw r10
        L_0x02d6:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Cannot set corner thickness value to a number less than 0."
            r10.<init>(r11)
            throw r10
        L_0x02de:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Cannot set line thickness value to a number less than 0."
            r10.<init>(r11)
            throw r10
        L_0x02e6:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r3)
            throw r10
        L_0x02ec:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r3)
            throw r10
        L_0x02f2:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Cannot set initial crop window padding value to a number < 0 or >= 0.5"
            r10.<init>(r11)
            throw r10
        L_0x02fa:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Cannot set touch radius value to a number <= 0 "
            r10.<init>(r11)
            throw r10
        L_0x0302:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Cannot set max zoom to a number < 1"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.CropImageView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void a(float f10, float f11, boolean z10, boolean z11) {
        float f12;
        float f13;
        float f14;
        if (this.w != null) {
            float f15 = 0.0f;
            if (f10 > 0.0f && f11 > 0.0f) {
                Matrix matrix = this.f4026q;
                Matrix matrix2 = this.f4027r;
                matrix.invert(matrix2);
                CropOverlayView cropOverlayView = this.f4025p;
                RectF cropWindowRect = cropOverlayView.getCropWindowRect();
                matrix2.mapRect(cropWindowRect);
                matrix.reset();
                matrix.postTranslate((f10 - ((float) this.w.getWidth())) / 2.0f, (f11 - ((float) this.w.getHeight())) / 2.0f);
                d();
                int i10 = this.f4032y;
                float[] fArr = this.f4029t;
                if (i10 > 0) {
                    matrix.postRotate((float) i10, (c.o(fArr) + c.p(fArr)) / 2.0f, (c.q(fArr) + c.m(fArr)) / 2.0f);
                    d();
                }
                float min = Math.min(f10 / (c.p(fArr) - c.o(fArr)), f11 / (c.m(fArr) - c.q(fArr)));
                k kVar = this.E;
                if (kVar == k.FIT_CENTER || ((kVar == k.CENTER_INSIDE && min < 1.0f) || (min > 1.0f && this.I))) {
                    matrix.postScale(min, min, (c.o(fArr) + c.p(fArr)) / 2.0f, (c.q(fArr) + c.m(fArr)) / 2.0f);
                    d();
                }
                if (this.z) {
                    f12 = -this.O;
                } else {
                    f12 = this.O;
                }
                if (this.A) {
                    f13 = -this.O;
                } else {
                    f13 = this.O;
                }
                matrix.postScale(f12, f13, (c.o(fArr) + c.p(fArr)) / 2.0f, (c.q(fArr) + c.m(fArr)) / 2.0f);
                d();
                matrix.mapRect(cropWindowRect);
                if (z10) {
                    if (f10 > c.p(fArr) - c.o(fArr)) {
                        f14 = 0.0f;
                    } else {
                        f14 = Math.max(Math.min((f10 / 2.0f) - cropWindowRect.centerX(), -c.o(fArr)), ((float) getWidth()) - c.p(fArr)) / f12;
                    }
                    this.P = f14;
                    if (f11 <= c.m(fArr) - c.q(fArr)) {
                        f15 = Math.max(Math.min((f11 / 2.0f) - cropWindowRect.centerY(), -c.q(fArr)), ((float) getHeight()) - c.m(fArr)) / f13;
                    }
                    this.Q = f15;
                } else {
                    this.P = Math.min(Math.max(this.P * f12, -cropWindowRect.left), (-cropWindowRect.right) + f10) / f12;
                    this.Q = Math.min(Math.max(this.Q * f13, -cropWindowRect.top), (-cropWindowRect.bottom) + f11) / f13;
                }
                matrix.postTranslate(this.P * f12, this.Q * f13);
                cropWindowRect.offset(this.P * f12, this.Q * f13);
                cropOverlayView.setCropWindowRect(cropWindowRect);
                d();
                cropOverlayView.invalidate();
                ImageView imageView = this.f4024o;
                if (z11) {
                    k8.a aVar = this.f4030v;
                    System.arraycopy(fArr, 0, aVar.f6723r, 0, 8);
                    aVar.f6725t.set(aVar.f6721p.getCropWindowRect());
                    matrix.getValues(aVar.f6726v);
                    imageView.startAnimation(this.f4030v);
                } else {
                    imageView.setImageMatrix(matrix);
                }
                j(false);
            }
        }
    }

    public final void b() {
        Bitmap bitmap = this.w;
        if (bitmap != null && (this.D > 0 || this.M != null)) {
            bitmap.recycle();
        }
        this.w = null;
        this.D = 0;
        this.M = null;
        this.N = 1;
        this.f4032y = 0;
        this.O = 1.0f;
        this.P = 0.0f;
        this.Q = 0.0f;
        this.f4026q.reset();
        this.U = null;
        this.f4024o.setImageBitmap((Bitmap) null);
        g();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(boolean r13, boolean r14) {
        /*
            r12 = this;
            int r0 = r12.getWidth()
            int r1 = r12.getHeight()
            android.graphics.Bitmap r2 = r12.w
            if (r2 == 0) goto L_0x010c
            if (r0 <= 0) goto L_0x010c
            if (r1 <= 0) goto L_0x010c
            com.theartofdev.edmodo.cropper.CropOverlayView r2 = r12.f4025p
            android.graphics.RectF r3 = r2.getCropWindowRect()
            r4 = 0
            r5 = 0
            if (r13 == 0) goto L_0x003b
            float r13 = r3.left
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 < 0) goto L_0x0034
            float r13 = r3.top
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 < 0) goto L_0x0034
            float r13 = r3.right
            float r14 = (float) r0
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 > 0) goto L_0x0034
            float r13 = r3.bottom
            float r14 = (float) r1
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x010c
        L_0x0034:
            float r13 = (float) r0
            float r14 = (float) r1
            r12.a(r13, r14, r4, r4)
            goto L_0x010c
        L_0x003b:
            boolean r13 = r12.I
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r13 != 0) goto L_0x0047
            float r13 = r12.O
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r13 <= 0) goto L_0x010c
        L_0x0047:
            float r13 = r12.O
            int r7 = r12.J
            float r7 = (float) r7
            int r13 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r13 >= 0) goto L_0x0088
            float r13 = r3.width()
            float r7 = (float) r0
            r8 = 1056964608(0x3f000000, float:0.5)
            float r9 = r7 * r8
            int r13 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r13 >= 0) goto L_0x0088
            float r13 = r3.height()
            float r9 = (float) r1
            float r8 = r8 * r9
            int r13 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r13 >= 0) goto L_0x0088
            int r13 = r12.J
            float r13 = (float) r13
            float r8 = r3.width()
            float r10 = r12.O
            float r8 = r8 / r10
            r10 = 1059313418(0x3f23d70a, float:0.64)
            float r8 = r8 / r10
            float r7 = r7 / r8
            float r8 = r3.height()
            float r11 = r12.O
            float r8 = r8 / r11
            float r8 = r8 / r10
            float r9 = r9 / r8
            float r7 = java.lang.Math.min(r7, r9)
            float r13 = java.lang.Math.min(r13, r7)
            goto L_0x0089
        L_0x0088:
            r13 = r5
        L_0x0089:
            float r7 = r12.O
            int r7 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x00c5
            float r7 = r3.width()
            float r8 = (float) r0
            r9 = 1059481190(0x3f266666, float:0.65)
            float r10 = r8 * r9
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 > 0) goto L_0x00a7
            float r7 = r3.height()
            float r10 = (float) r1
            float r10 = r10 * r9
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x00c5
        L_0x00a7:
            float r13 = r3.width()
            float r7 = r12.O
            float r13 = r13 / r7
            r7 = 1057132380(0x3f028f5c, float:0.51)
            float r13 = r13 / r7
            float r8 = r8 / r13
            float r13 = (float) r1
            float r3 = r3.height()
            float r9 = r12.O
            float r3 = r3 / r9
            float r3 = r3 / r7
            float r13 = r13 / r3
            float r13 = java.lang.Math.min(r8, r13)
            float r13 = java.lang.Math.max(r6, r13)
        L_0x00c5:
            boolean r3 = r12.I
            if (r3 != 0) goto L_0x00ca
            goto L_0x00cb
        L_0x00ca:
            r6 = r13
        L_0x00cb:
            int r13 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r13 <= 0) goto L_0x010c
            float r13 = r12.O
            int r13 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r13 == 0) goto L_0x010c
            if (r14 == 0) goto L_0x0104
            k8.a r13 = r12.f4030v
            if (r13 != 0) goto L_0x00e4
            k8.a r13 = new k8.a
            android.widget.ImageView r3 = r12.f4024o
            r13.<init>(r3, r2)
            r12.f4030v = r13
        L_0x00e4:
            k8.a r13 = r12.f4030v
            android.graphics.Matrix r2 = r12.f4026q
            r13.reset()
            float[] r3 = r13.f6722q
            r5 = 8
            float[] r7 = r12.f4029t
            java.lang.System.arraycopy(r7, r4, r3, r4, r5)
            android.graphics.RectF r3 = r13.f6724s
            com.theartofdev.edmodo.cropper.CropOverlayView r4 = r13.f6721p
            android.graphics.RectF r4 = r4.getCropWindowRect()
            r3.set(r4)
            float[] r13 = r13.u
            r2.getValues(r13)
        L_0x0104:
            r12.O = r6
            float r13 = (float) r0
            float r0 = (float) r1
            r1 = 1
            r12.a(r13, r0, r1, r14)
        L_0x010c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.CropImageView.c(boolean, boolean):void");
    }

    public final void d() {
        float[] fArr = this.f4029t;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = (float) this.w.getWidth();
        fArr[3] = 0.0f;
        fArr[4] = (float) this.w.getWidth();
        fArr[5] = (float) this.w.getHeight();
        fArr[6] = 0.0f;
        fArr[7] = (float) this.w.getHeight();
        Matrix matrix = this.f4026q;
        matrix.mapPoints(fArr);
        float[] fArr2 = this.u;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 100.0f;
        fArr2[3] = 0.0f;
        fArr2[4] = 100.0f;
        fArr2[5] = 100.0f;
        fArr2[6] = 0.0f;
        fArr2[7] = 100.0f;
        matrix.mapPoints(fArr2);
    }

    public final void e(int i10) {
        int i11;
        boolean z10;
        float f10;
        float f11;
        int i12 = i10;
        if (this.w != null) {
            if (i12 < 0) {
                i11 = (i12 % 360) + 360;
            } else {
                i11 = i12 % 360;
            }
            CropOverlayView cropOverlayView = this.f4025p;
            if (cropOverlayView.I || ((i11 <= 45 || i11 >= 135) && (i11 <= 215 || i11 >= 305))) {
                z10 = false;
            } else {
                z10 = true;
            }
            RectF rectF = c.f4081c;
            rectF.set(cropOverlayView.getCropWindowRect());
            if (z10) {
                f10 = rectF.height();
            } else {
                f10 = rectF.width();
            }
            float f12 = f10 / 2.0f;
            if (z10) {
                f11 = rectF.width();
            } else {
                f11 = rectF.height();
            }
            float f13 = f11 / 2.0f;
            if (z10) {
                boolean z11 = this.z;
                this.z = this.A;
                this.A = z11;
            }
            Matrix matrix = this.f4026q;
            Matrix matrix2 = this.f4027r;
            matrix.invert(matrix2);
            float[] fArr = c.d;
            fArr[0] = rectF.centerX();
            fArr[1] = rectF.centerY();
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 1.0f;
            fArr[5] = 0.0f;
            matrix2.mapPoints(fArr);
            this.f4032y = (this.f4032y + i11) % 360;
            a((float) getWidth(), (float) getHeight(), true, false);
            float[] fArr2 = c.f4082e;
            matrix.mapPoints(fArr2, fArr);
            float sqrt = (float) (((double) this.O) / Math.sqrt(Math.pow((double) (fArr2[5] - fArr2[3]), 2.0d) + Math.pow((double) (fArr2[4] - fArr2[2]), 2.0d)));
            this.O = sqrt;
            this.O = Math.max(sqrt, 1.0f);
            a((float) getWidth(), (float) getHeight(), true, false);
            matrix.mapPoints(fArr2, fArr);
            double sqrt2 = Math.sqrt(Math.pow((double) (fArr2[5] - fArr2[3]), 2.0d) + Math.pow((double) (fArr2[4] - fArr2[2]), 2.0d));
            float f14 = (float) (((double) f12) * sqrt2);
            float f15 = (float) (((double) f13) * sqrt2);
            float f16 = fArr2[0];
            float f17 = fArr2[1];
            rectF.set(f16 - f14, f17 - f15, f16 + f14, f17 + f15);
            if (cropOverlayView.P) {
                cropOverlayView.setCropWindowRect(c.f4080b);
                cropOverlayView.f();
                cropOverlayView.invalidate();
            }
            cropOverlayView.setCropWindowRect(rectF);
            a((float) getWidth(), (float) getHeight(), true, false);
            c(false, false);
            RectF cropWindowRect = cropOverlayView.getCropWindowRect();
            cropOverlayView.d(cropWindowRect);
            cropOverlayView.f4043q.f4108a.set(cropWindowRect);
        }
    }

    public final void f(Bitmap bitmap, int i10, Uri uri, int i11, int i12) {
        Bitmap bitmap2 = this.w;
        if (bitmap2 == null || !bitmap2.equals(bitmap)) {
            ImageView imageView = this.f4024o;
            imageView.clearAnimation();
            b();
            this.w = bitmap;
            imageView.setImageBitmap(bitmap);
            this.M = uri;
            this.D = i10;
            this.N = i11;
            this.f4032y = i12;
            a((float) getWidth(), (float) getHeight(), true, false);
            CropOverlayView cropOverlayView = this.f4025p;
            if (cropOverlayView != null) {
                if (cropOverlayView.P) {
                    cropOverlayView.setCropWindowRect(c.f4080b);
                    cropOverlayView.f();
                    cropOverlayView.invalidate();
                }
                g();
            }
        }
    }

    public final void g() {
        CropOverlayView cropOverlayView = this.f4025p;
        if (cropOverlayView != null) {
            cropOverlayView.setVisibility((!this.G || this.w == null) ? 4 : 0);
        }
    }

    public Pair<Integer, Integer> getAspectRatio() {
        CropOverlayView cropOverlayView = this.f4025p;
        return new Pair<>(Integer.valueOf(cropOverlayView.getAspectRatioX()), Integer.valueOf(cropOverlayView.getAspectRatioY()));
    }

    public float[] getCropPoints() {
        RectF cropWindowRect = this.f4025p.getCropWindowRect();
        float f10 = cropWindowRect.left;
        float f11 = cropWindowRect.top;
        float f12 = cropWindowRect.right;
        float f13 = cropWindowRect.bottom;
        float[] fArr = {f10, f11, f12, f11, f12, f13, f10, f13};
        Matrix matrix = this.f4026q;
        Matrix matrix2 = this.f4027r;
        matrix.invert(matrix2);
        matrix2.mapPoints(fArr);
        for (int i10 = 0; i10 < 8; i10++) {
            fArr[i10] = fArr[i10] * ((float) this.N);
        }
        return fArr;
    }

    public Rect getCropRect() {
        int i10 = this.N;
        Bitmap bitmap = this.w;
        if (bitmap == null) {
            return null;
        }
        float[] cropPoints = getCropPoints();
        int width = bitmap.getWidth() * i10;
        int height = i10 * bitmap.getHeight();
        CropOverlayView cropOverlayView = this.f4025p;
        return c.n(cropPoints, width, height, cropOverlayView.I, cropOverlayView.getAspectRatioX(), cropOverlayView.getAspectRatioY());
    }

    public c getCropShape() {
        return this.f4025p.getCropShape();
    }

    public RectF getCropWindowRect() {
        CropOverlayView cropOverlayView = this.f4025p;
        if (cropOverlayView == null) {
            return null;
        }
        return cropOverlayView.getCropWindowRect();
    }

    public Bitmap getCroppedImage() {
        c.a aVar;
        j jVar = j.NONE;
        if (this.w == null) {
            return null;
        }
        this.f4024o.clearAnimation();
        Uri uri = this.M;
        CropOverlayView cropOverlayView = this.f4025p;
        if (uri == null || (this.N <= 1 && jVar != j.SAMPLING)) {
            aVar = c.f(this.w, getCropPoints(), this.f4032y, cropOverlayView.I, cropOverlayView.getAspectRatioX(), cropOverlayView.getAspectRatioY(), this.z, this.A);
        } else {
            int width = this.w.getWidth() * this.N;
            int height = this.w.getHeight() * this.N;
            Context context = getContext();
            Uri uri2 = this.M;
            float[] cropPoints = getCropPoints();
            int i10 = this.f4032y;
            boolean z10 = cropOverlayView.I;
            int aspectRatioX = cropOverlayView.getAspectRatioX();
            int aspectRatioY = cropOverlayView.getAspectRatioY();
            aVar = c.d(context, uri2, cropPoints, i10, width, height, z10, aspectRatioX, aspectRatioY, 0, 0, this.z, this.A);
        }
        return c.r(aVar.f4085a, 0, 0, jVar);
    }

    public void getCroppedImageAsync() {
        j jVar = j.NONE;
        if (this.L != null) {
            i(0, 0, 0, (Bitmap.CompressFormat) null, (Uri) null, jVar);
            return;
        }
        throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
    }

    public d getGuidelines() {
        return this.f4025p.getGuidelines();
    }

    public int getImageResource() {
        return this.D;
    }

    public Uri getImageUri() {
        return this.M;
    }

    public int getMaxZoom() {
        return this.J;
    }

    public int getRotatedDegrees() {
        return this.f4032y;
    }

    public k getScaleType() {
        return this.E;
    }

    public Rect getWholeImageRect() {
        int i10 = this.N;
        Bitmap bitmap = this.w;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i10, bitmap.getHeight() * i10);
    }

    public final void h() {
        int i10 = 0;
        if (!(this.H && ((this.w == null && this.V != null) || this.W != null))) {
            i10 = 4;
        }
        this.f4028s.setVisibility(i10);
    }

    public final void i(int i10, int i11, int i12, Bitmap.CompressFormat compressFormat, Uri uri, j jVar) {
        a aVar;
        int i13;
        int i14;
        CropImageView cropImageView;
        j jVar2 = jVar;
        Bitmap bitmap = this.w;
        if (bitmap != null) {
            this.f4024o.clearAnimation();
            WeakReference<a> weakReference = this.W;
            if (weakReference != null) {
                aVar = weakReference.get();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                aVar.cancel(true);
            }
            j jVar3 = j.NONE;
            if (jVar2 != jVar3) {
                i13 = i10;
            } else {
                i13 = 0;
            }
            if (jVar2 != jVar3) {
                i14 = i11;
            } else {
                i14 = 0;
            }
            int width = bitmap.getWidth() * this.N;
            int height = bitmap.getHeight();
            int i15 = this.N;
            int i16 = height * i15;
            Uri uri2 = this.M;
            CropOverlayView cropOverlayView = this.f4025p;
            if (uri2 == null || (i15 <= 1 && jVar2 != j.SAMPLING)) {
                a aVar2 = r0;
                a aVar3 = new a(this, bitmap, getCropPoints(), this.f4032y, cropOverlayView.I, cropOverlayView.getAspectRatioX(), cropOverlayView.getAspectRatioY(), i13, i14, this.z, this.A, jVar, uri, compressFormat, i12);
                cropImageView = this;
                cropImageView.W = new WeakReference<>(aVar2);
            } else {
                Uri uri3 = this.M;
                float[] cropPoints = getCropPoints();
                int i17 = this.f4032y;
                boolean z10 = cropOverlayView.I;
                a aVar4 = r0;
                a aVar5 = new a(this, uri3, cropPoints, i17, width, i16, z10, cropOverlayView.getAspectRatioX(), cropOverlayView.getAspectRatioY(), i13, i14, this.z, this.A, jVar, uri, compressFormat, i12);
                this.W = new WeakReference<>(aVar4);
                cropImageView = this;
            }
            cropImageView.W.get().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            h();
            return;
        }
    }

    public final void j(boolean z10) {
        float[] fArr;
        Bitmap bitmap = this.w;
        CropOverlayView cropOverlayView = this.f4025p;
        if (bitmap != null && !z10) {
            float[] fArr2 = this.u;
            float p10 = (((float) this.N) * 100.0f) / (c.p(fArr2) - c.o(fArr2));
            float m10 = (((float) this.N) * 100.0f) / (c.m(fArr2) - c.q(fArr2));
            f fVar = cropOverlayView.f4043q;
            fVar.f4111e = (float) getWidth();
            fVar.f4112f = (float) getHeight();
            fVar.f4117k = p10;
            fVar.l = m10;
        }
        if (z10) {
            fArr = null;
        } else {
            fArr = this.f4029t;
        }
        cropOverlayView.g(fArr, getWidth(), getHeight());
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.B > 0 && this.C > 0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = this.B;
            layoutParams.height = this.C;
            setLayoutParams(layoutParams);
            if (this.w != null) {
                float f10 = (float) (i12 - i10);
                float f11 = (float) (i13 - i11);
                a(f10, f11, true, false);
                if (this.R != null) {
                    int i14 = this.S;
                    if (i14 != this.f4031x) {
                        this.f4032y = i14;
                        a(f10, f11, true, false);
                    }
                    this.f4026q.mapRect(this.R);
                    RectF rectF = this.R;
                    CropOverlayView cropOverlayView = this.f4025p;
                    cropOverlayView.setCropWindowRect(rectF);
                    c(false, false);
                    RectF cropWindowRect = cropOverlayView.getCropWindowRect();
                    cropOverlayView.d(cropWindowRect);
                    cropOverlayView.f4043q.f4108a.set(cropWindowRect);
                    this.R = null;
                    return;
                } else if (this.T) {
                    this.T = false;
                    c(false, false);
                    return;
                } else {
                    return;
                }
            }
        }
        j(true);
    }

    public final void onMeasure(int i10, int i11) {
        double d10;
        double d11;
        int i12;
        int i13;
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        Bitmap bitmap = this.w;
        if (bitmap != null) {
            if (size2 == 0) {
                size2 = bitmap.getHeight();
            }
            if (size < this.w.getWidth()) {
                d10 = ((double) size) / ((double) this.w.getWidth());
            } else {
                d10 = Double.POSITIVE_INFINITY;
            }
            if (size2 < this.w.getHeight()) {
                d11 = ((double) size2) / ((double) this.w.getHeight());
            } else {
                d11 = Double.POSITIVE_INFINITY;
            }
            if (d10 == Double.POSITIVE_INFINITY && d11 == Double.POSITIVE_INFINITY) {
                i13 = this.w.getWidth();
                i12 = this.w.getHeight();
            } else if (d10 <= d11) {
                i12 = (int) (((double) this.w.getHeight()) * d10);
                i13 = size;
            } else {
                i13 = (int) (((double) this.w.getWidth()) * d11);
                i12 = size2;
            }
            if (mode != 1073741824) {
                if (mode == Integer.MIN_VALUE) {
                    size = Math.min(i13, size);
                } else {
                    size = i13;
                }
            }
            if (mode2 != 1073741824) {
                if (mode2 == Integer.MIN_VALUE) {
                    size2 = Math.min(i12, size2);
                } else {
                    size2 = i12;
                }
            }
            this.B = size;
            this.C = size2;
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005f, code lost:
        if (r7.M == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
        if (r0 != null) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRestoreInstanceState(android.os.Parcelable r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof android.os.Bundle
            if (r0 == 0) goto L_0x00f0
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.lang.ref.WeakReference<com.theartofdev.edmodo.cropper.b> r0 = r7.V
            if (r0 != 0) goto L_0x00ea
            android.net.Uri r0 = r7.M
            if (r0 != 0) goto L_0x00ea
            android.graphics.Bitmap r0 = r7.w
            if (r0 != 0) goto L_0x00ea
            int r0 = r7.D
            if (r0 != 0) goto L_0x00ea
            java.lang.String r0 = "LOADED_IMAGE_URI"
            android.os.Parcelable r0 = r8.getParcelable(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            if (r0 == 0) goto L_0x0062
            java.lang.String r1 = "LOADED_IMAGE_STATE_BITMAP_KEY"
            java.lang.String r1 = r8.getString(r1)
            if (r1 == 0) goto L_0x005d
            android.util.Pair<java.lang.String, java.lang.ref.WeakReference<android.graphics.Bitmap>> r2 = com.theartofdev.edmodo.cropper.c.f4084g
            r3 = 0
            if (r2 == 0) goto L_0x0045
            java.lang.Object r2 = r2.first
            java.lang.String r2 = (java.lang.String) r2
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0045
            android.util.Pair<java.lang.String, java.lang.ref.WeakReference<android.graphics.Bitmap>> r1 = com.theartofdev.edmodo.cropper.c.f4084g
            java.lang.Object r1 = r1.second
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r2 = r1
            goto L_0x0046
        L_0x0045:
            r2 = r3
        L_0x0046:
            com.theartofdev.edmodo.cropper.c.f4084g = r3
            if (r2 == 0) goto L_0x005d
            boolean r1 = r2.isRecycled()
            if (r1 != 0) goto L_0x005d
            r3 = 0
            java.lang.String r1 = "LOADED_SAMPLE_SIZE"
            int r5 = r8.getInt(r1)
            r6 = 0
            r1 = r7
            r4 = r0
            r1.f(r2, r3, r4, r5, r6)
        L_0x005d:
            android.net.Uri r1 = r7.M
            if (r1 != 0) goto L_0x007b
            goto L_0x0078
        L_0x0062:
            java.lang.String r0 = "LOADED_IMAGE_RESOURCE"
            int r0 = r8.getInt(r0)
            if (r0 <= 0) goto L_0x006e
            r7.setImageResource(r0)
            goto L_0x007b
        L_0x006e:
            java.lang.String r0 = "LOADING_IMAGE_URI"
            android.os.Parcelable r0 = r8.getParcelable(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            if (r0 == 0) goto L_0x007b
        L_0x0078:
            r7.setImageUriAsync(r0)
        L_0x007b:
            java.lang.String r0 = "DEGREES_ROTATED"
            int r0 = r8.getInt(r0)
            r7.S = r0
            r7.f4032y = r0
            java.lang.String r0 = "INITIAL_CROP_RECT"
            android.os.Parcelable r0 = r8.getParcelable(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            com.theartofdev.edmodo.cropper.CropOverlayView r1 = r7.f4025p
            if (r0 == 0) goto L_0x00a0
            int r2 = r0.width()
            if (r2 > 0) goto L_0x009d
            int r2 = r0.height()
            if (r2 <= 0) goto L_0x00a0
        L_0x009d:
            r1.setInitialCropWindowRect(r0)
        L_0x00a0:
            java.lang.String r0 = "CROP_WINDOW_RECT"
            android.os.Parcelable r0 = r8.getParcelable(r0)
            android.graphics.RectF r0 = (android.graphics.RectF) r0
            if (r0 == 0) goto L_0x00bd
            float r2 = r0.width()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x00bb
            float r2 = r0.height()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x00bd
        L_0x00bb:
            r7.R = r0
        L_0x00bd:
            java.lang.String r0 = "CROP_SHAPE"
            java.lang.String r0 = r8.getString(r0)
            com.theartofdev.edmodo.cropper.CropImageView$c r0 = com.theartofdev.edmodo.cropper.CropImageView.c.valueOf(r0)
            r1.setCropShape(r0)
            java.lang.String r0 = "CROP_AUTO_ZOOM_ENABLED"
            boolean r0 = r8.getBoolean(r0)
            r7.I = r0
            java.lang.String r0 = "CROP_MAX_ZOOM"
            int r0 = r8.getInt(r0)
            r7.J = r0
            java.lang.String r0 = "CROP_FLIP_HORIZONTALLY"
            boolean r0 = r8.getBoolean(r0)
            r7.z = r0
            java.lang.String r0 = "CROP_FLIP_VERTICALLY"
            boolean r0 = r8.getBoolean(r0)
            r7.A = r0
        L_0x00ea:
            java.lang.String r0 = "instanceState"
            android.os.Parcelable r8 = r8.getParcelable(r0)
        L_0x00f0:
            super.onRestoreInstanceState(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.CropImageView.onRestoreInstanceState(android.os.Parcelable):void");
    }

    public final Parcelable onSaveInstanceState() {
        b bVar;
        OutputStream outputStream;
        boolean z10 = true;
        if (this.M == null && this.w == null && this.D < 1) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        Uri uri = this.M;
        if (this.F && uri == null && this.D < 1) {
            Context context = getContext();
            Bitmap bitmap = this.w;
            Uri uri2 = this.U;
            Rect rect = c.f4079a;
            if (uri2 == null) {
                try {
                    uri2 = Uri.fromFile(File.createTempFile("aic_state_store_temp", ".jpg", context.getCacheDir()));
                } catch (Exception e10) {
                    Log.w("AIC", "Failed to write bitmap to temp file for image-cropper save instance state", e10);
                    uri = null;
                }
            } else if (new File(uri2.getPath()).exists()) {
                z10 = false;
            }
            if (z10) {
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                try {
                    outputStream = context.getContentResolver().openOutputStream(uri2);
                    try {
                        bitmap.compress(compressFormat, 95, outputStream);
                        c.c(outputStream);
                    } catch (Throwable th) {
                        th = th;
                        c.c(outputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = null;
                    c.c(outputStream);
                    throw th;
                }
            }
            uri = uri2;
            this.U = uri;
        }
        if (!(uri == null || this.w == null)) {
            String uuid = UUID.randomUUID().toString();
            c.f4084g = new Pair<>(uuid, new WeakReference(this.w));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", uuid);
        }
        WeakReference<b> weakReference = this.V;
        if (!(weakReference == null || (bVar = weakReference.get()) == null)) {
            bundle.putParcelable("LOADING_IMAGE_URI", bVar.f4072b);
        }
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", uri);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.D);
        bundle.putInt("LOADED_SAMPLE_SIZE", this.N);
        bundle.putInt("DEGREES_ROTATED", this.f4032y);
        CropOverlayView cropOverlayView = this.f4025p;
        bundle.putParcelable("INITIAL_CROP_RECT", cropOverlayView.getInitialCropWindowRect());
        RectF rectF = c.f4081c;
        rectF.set(cropOverlayView.getCropWindowRect());
        Matrix matrix = this.f4026q;
        Matrix matrix2 = this.f4027r;
        matrix.invert(matrix2);
        matrix2.mapRect(rectF);
        bundle.putParcelable("CROP_WINDOW_RECT", rectF);
        bundle.putString("CROP_SHAPE", cropOverlayView.getCropShape().name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.I);
        bundle.putInt("CROP_MAX_ZOOM", this.J);
        bundle.putBoolean("CROP_FLIP_HORIZONTALLY", this.z);
        bundle.putBoolean("CROP_FLIP_VERTICALLY", this.A);
        return bundle;
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.T = i12 > 0 && i13 > 0;
    }

    public void setAutoZoomEnabled(boolean z10) {
        if (this.I != z10) {
            this.I = z10;
            c(false, false);
            this.f4025p.invalidate();
        }
    }

    public void setCropRect(Rect rect) {
        this.f4025p.setInitialCropWindowRect(rect);
    }

    public void setCropShape(c cVar) {
        this.f4025p.setCropShape(cVar);
    }

    public void setFixedAspectRatio(boolean z10) {
        this.f4025p.setFixedAspectRatio(z10);
    }

    public void setFlippedHorizontally(boolean z10) {
        if (this.z != z10) {
            this.z = z10;
            a((float) getWidth(), (float) getHeight(), true, false);
        }
    }

    public void setFlippedVertically(boolean z10) {
        if (this.A != z10) {
            this.A = z10;
            a((float) getWidth(), (float) getHeight(), true, false);
        }
    }

    public void setGuidelines(d dVar) {
        this.f4025p.setGuidelines(dVar);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f4025p.setInitialCropWindowRect((Rect) null);
        f(bitmap, 0, (Uri) null, 1, 0);
    }

    public void setImageResource(int i10) {
        if (i10 != 0) {
            this.f4025p.setInitialCropWindowRect((Rect) null);
            f(BitmapFactory.decodeResource(getResources(), i10), i10, (Uri) null, 1, 0);
        }
    }

    public void setImageUriAsync(Uri uri) {
        if (uri != null) {
            WeakReference<b> weakReference = this.V;
            b bVar = weakReference != null ? weakReference.get() : null;
            if (bVar != null) {
                bVar.cancel(true);
            }
            b();
            this.R = null;
            this.S = 0;
            this.f4025p.setInitialCropWindowRect((Rect) null);
            WeakReference<b> weakReference2 = new WeakReference<>(new b(this, uri));
            this.V = weakReference2;
            weakReference2.get().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            h();
        }
    }

    public void setMaxZoom(int i10) {
        if (this.J != i10 && i10 > 0) {
            this.J = i10;
            c(false, false);
            this.f4025p.invalidate();
        }
    }

    public void setMultiTouchEnabled(boolean z10) {
        CropOverlayView cropOverlayView = this.f4025p;
        if (cropOverlayView.h(z10)) {
            c(false, false);
            cropOverlayView.invalidate();
        }
    }

    public void setOnCropImageCompleteListener(e eVar) {
        this.L = eVar;
    }

    public void setOnCropWindowChangedListener(h hVar) {
    }

    public void setOnSetCropOverlayMovedListener(f fVar) {
    }

    public void setOnSetCropOverlayReleasedListener(g gVar) {
    }

    public void setOnSetImageUriCompleteListener(i iVar) {
        this.K = iVar;
    }

    public void setRotatedDegrees(int i10) {
        int i11 = this.f4032y;
        if (i11 != i10) {
            e(i10 - i11);
        }
    }

    public void setSaveBitmapToInstanceState(boolean z10) {
        this.F = z10;
    }

    public void setScaleType(k kVar) {
        if (kVar != this.E) {
            this.E = kVar;
            this.O = 1.0f;
            this.Q = 0.0f;
            this.P = 0.0f;
            CropOverlayView cropOverlayView = this.f4025p;
            if (cropOverlayView.P) {
                cropOverlayView.setCropWindowRect(c.f4080b);
                cropOverlayView.f();
                cropOverlayView.invalidate();
            }
            requestLayout();
        }
    }

    public void setShowCropOverlay(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            g();
        }
    }

    public void setShowProgressBar(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            h();
        }
    }

    public void setSnapRadius(float f10) {
        if (f10 >= 0.0f) {
            this.f4025p.setSnapRadius(f10);
        }
    }
}

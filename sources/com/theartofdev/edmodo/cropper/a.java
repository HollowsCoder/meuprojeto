package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.theartofdev.edmodo.cropper.CropImageView;
import com.theartofdev.edmodo.cropper.c;
import java.io.OutputStream;
import java.lang.ref.WeakReference;

public final class a extends AsyncTask<Void, Void, C0049a> {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<CropImageView> f4051a;

    /* renamed from: b  reason: collision with root package name */
    public final Bitmap f4052b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f4053c;
    public final Context d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f4054e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4055f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4056g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4057h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f4058i;

    /* renamed from: j  reason: collision with root package name */
    public final int f4059j;

    /* renamed from: k  reason: collision with root package name */
    public final int f4060k;
    public final int l;

    /* renamed from: m  reason: collision with root package name */
    public final int f4061m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f4062n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f4063o;

    /* renamed from: p  reason: collision with root package name */
    public final CropImageView.j f4064p;

    /* renamed from: q  reason: collision with root package name */
    public final Uri f4065q;

    /* renamed from: r  reason: collision with root package name */
    public final Bitmap.CompressFormat f4066r;

    /* renamed from: s  reason: collision with root package name */
    public final int f4067s;

    /* renamed from: com.theartofdev.edmodo.cropper.a$a  reason: collision with other inner class name */
    public static final class C0049a {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f4068a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f4069b;

        /* renamed from: c  reason: collision with root package name */
        public final Exception f4070c;
        public final int d;

        public C0049a(Bitmap bitmap, int i10) {
            this.f4068a = bitmap;
            this.f4069b = null;
            this.f4070c = null;
            this.d = i10;
        }

        public C0049a(Uri uri, int i10) {
            this.f4068a = null;
            this.f4069b = uri;
            this.f4070c = null;
            this.d = i10;
        }

        public C0049a(Exception exc) {
            this.f4068a = null;
            this.f4069b = null;
            this.f4070c = exc;
            this.d = 1;
        }
    }

    public a(CropImageView cropImageView, Bitmap bitmap, float[] fArr, int i10, boolean z, int i11, int i12, int i13, int i14, boolean z10, boolean z11, CropImageView.j jVar, Uri uri, Bitmap.CompressFormat compressFormat, int i15) {
        CropImageView cropImageView2 = cropImageView;
        this.f4051a = new WeakReference<>(cropImageView);
        this.d = cropImageView.getContext();
        this.f4052b = bitmap;
        this.f4054e = fArr;
        this.f4053c = null;
        this.f4055f = i10;
        this.f4058i = z;
        this.f4059j = i11;
        this.f4060k = i12;
        this.l = i13;
        this.f4061m = i14;
        this.f4062n = z10;
        this.f4063o = z11;
        this.f4064p = jVar;
        this.f4065q = uri;
        this.f4066r = compressFormat;
        this.f4067s = i15;
        this.f4056g = 0;
        this.f4057h = 0;
    }

    public a(CropImageView cropImageView, Uri uri, float[] fArr, int i10, int i11, int i12, boolean z, int i13, int i14, int i15, int i16, boolean z10, boolean z11, CropImageView.j jVar, Uri uri2, Bitmap.CompressFormat compressFormat, int i17) {
        CropImageView cropImageView2 = cropImageView;
        this.f4051a = new WeakReference<>(cropImageView);
        this.d = cropImageView.getContext();
        this.f4053c = uri;
        this.f4054e = fArr;
        this.f4055f = i10;
        this.f4058i = z;
        this.f4059j = i13;
        this.f4060k = i14;
        this.f4056g = i11;
        this.f4057h = i12;
        this.l = i15;
        this.f4061m = i16;
        this.f4062n = z10;
        this.f4063o = z11;
        this.f4064p = jVar;
        this.f4065q = uri2;
        this.f4066r = compressFormat;
        this.f4067s = i17;
        this.f4052b = null;
    }

    public final Object doInBackground(Object[] objArr) {
        OutputStream outputStream;
        c.a aVar;
        Void[] voidArr = (Void[]) objArr;
        try {
            outputStream = null;
            if (isCancelled()) {
                return null;
            }
            Uri uri = this.f4053c;
            if (uri != null) {
                aVar = c.d(this.d, uri, this.f4054e, this.f4055f, this.f4056g, this.f4057h, this.f4058i, this.f4059j, this.f4060k, this.l, this.f4061m, this.f4062n, this.f4063o);
            } else {
                Bitmap bitmap = this.f4052b;
                if (bitmap == null) {
                    return new C0049a((Bitmap) null, 1);
                }
                aVar = c.f(bitmap, this.f4054e, this.f4055f, this.f4058i, this.f4059j, this.f4060k, this.f4062n, this.f4063o);
            }
            Bitmap r5 = c.r(aVar.f4085a, this.l, this.f4061m, this.f4064p);
            Uri uri2 = this.f4065q;
            int i10 = aVar.f4086b;
            if (uri2 == null) {
                return new C0049a(r5, i10);
            }
            Context context = this.d;
            Bitmap.CompressFormat compressFormat = this.f4066r;
            int i11 = this.f4067s;
            outputStream = context.getContentResolver().openOutputStream(uri2);
            r5.compress(compressFormat, i11, outputStream);
            c.c(outputStream);
            r5.recycle();
            return new C0049a(uri2, i10);
        } catch (Exception e10) {
            return new C0049a(e10);
        } catch (Throwable th) {
            c.c(outputStream);
            throw th;
        }
    }

    public final void onPostExecute(Object obj) {
        boolean z;
        Bitmap bitmap;
        CropImageView cropImageView;
        C0049a aVar = (C0049a) obj;
        if (aVar != null) {
            if (isCancelled() || (cropImageView = this.f4051a.get()) == null) {
                z = false;
            } else {
                cropImageView.W = null;
                cropImageView.h();
                CropImageView.e eVar = cropImageView.L;
                if (eVar != null) {
                    cropImageView.getCropPoints();
                    cropImageView.getCropRect();
                    cropImageView.getWholeImageRect();
                    cropImageView.getRotatedDegrees();
                    ((CropImageActivity) eVar).B(aVar.f4069b, aVar.f4070c, aVar.d);
                }
                z = true;
            }
            if (!z && (bitmap = aVar.f4068a) != null) {
                bitmap.recycle();
            }
        }
    }
}

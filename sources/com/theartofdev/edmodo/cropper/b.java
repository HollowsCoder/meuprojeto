package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import com.theartofdev.edmodo.cropper.CropImageView;
import com.theartofdev.edmodo.cropper.c;
import java.io.InputStream;
import java.lang.ref.WeakReference;

public final class b extends AsyncTask<Void, Void, a> {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<CropImageView> f4071a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f4072b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f4073c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4074e;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f4075a;

        /* renamed from: b  reason: collision with root package name */
        public final Bitmap f4076b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4077c;
        public final int d;

        /* renamed from: e  reason: collision with root package name */
        public final Exception f4078e;

        public a(Uri uri, Bitmap bitmap, int i10, int i11) {
            this.f4075a = uri;
            this.f4076b = bitmap;
            this.f4077c = i10;
            this.d = i11;
            this.f4078e = null;
        }

        public a(Uri uri, Exception exc) {
            this.f4075a = uri;
            this.f4076b = null;
            this.f4077c = 0;
            this.d = 0;
            this.f4078e = exc;
        }
    }

    public b(CropImageView cropImageView, Uri uri) {
        this.f4072b = uri;
        this.f4071a = new WeakReference<>(cropImageView);
        this.f4073c = cropImageView.getContext();
        DisplayMetrics displayMetrics = cropImageView.getResources().getDisplayMetrics();
        float f10 = displayMetrics.density;
        double d10 = f10 > 1.0f ? (double) (1.0f / f10) : 1.0d;
        this.d = (int) (((double) displayMetrics.widthPixels) * d10);
        this.f4074e = (int) (((double) displayMetrics.heightPixels) * d10);
    }

    public final Object doInBackground(Object[] objArr) {
        c.b bVar;
        Void[] voidArr = (Void[]) objArr;
        Context context = this.f4073c;
        Uri uri = this.f4072b;
        try {
            s0.a aVar = null;
            if (isCancelled()) {
                return null;
            }
            c.a j8 = c.j(context, uri, this.d, this.f4074e);
            if (isCancelled()) {
                return null;
            }
            Bitmap bitmap = j8.f4085a;
            try {
                InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                if (openInputStream != null) {
                    s0.a aVar2 = new s0.a(openInputStream);
                    try {
                        openInputStream.close();
                    } catch (Exception unused) {
                    }
                    aVar = aVar2;
                }
            } catch (Exception unused2) {
            }
            int i10 = 0;
            if (aVar != null) {
                int c10 = aVar.c();
                if (c10 == 3) {
                    i10 = 180;
                } else if (c10 == 6) {
                    i10 = 90;
                } else if (c10 == 8) {
                    i10 = 270;
                }
                bVar = new c.b(bitmap, i10);
            } else {
                bVar = new c.b(bitmap, 0);
            }
            return new a(uri, bVar.f4087a, j8.f4086b, bVar.f4088b);
        } catch (Exception e10) {
            return new a(uri, e10);
        }
    }

    public final void onPostExecute(Object obj) {
        boolean z;
        Bitmap bitmap;
        CropImageView cropImageView;
        a aVar = (a) obj;
        if (aVar != null) {
            if (isCancelled() || (cropImageView = this.f4071a.get()) == null) {
                z = false;
            } else {
                cropImageView.V = null;
                cropImageView.h();
                Exception exc = aVar.f4078e;
                if (exc == null) {
                    int i10 = aVar.d;
                    cropImageView.f4031x = i10;
                    cropImageView.f(aVar.f4076b, 0, aVar.f4075a, aVar.f4077c, i10);
                }
                CropImageView.i iVar = cropImageView.K;
                z = true;
                if (iVar != null) {
                    CropImageActivity cropImageActivity = (CropImageActivity) iVar;
                    if (exc == null) {
                        Rect rect = cropImageActivity.G.f4089a0;
                        if (rect != null) {
                            cropImageActivity.E.setCropRect(rect);
                        }
                        int i11 = cropImageActivity.G.f4090b0;
                        if (i11 > -1) {
                            cropImageActivity.E.setRotatedDegrees(i11);
                        }
                    } else {
                        cropImageActivity.B((Uri) null, exc, 1);
                    }
                }
            }
            if (!z && (bitmap = aVar.f4076b) != null) {
                bitmap.recycle();
            }
        }
    }
}

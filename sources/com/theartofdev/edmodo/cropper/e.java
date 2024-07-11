package com.theartofdev.edmodo.cropper;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.R;
import com.theartofdev.edmodo.cropper.CropImageView;

public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();
    public int A;
    public int B;
    public float C;
    public int D;
    public float E;
    public float F;
    public float G;
    public int H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public final CharSequence R;
    public final int S;
    public final Uri T;
    public final Bitmap.CompressFormat U;
    public final int V;
    public final int W;
    public final int X;
    public final CropImageView.j Y;
    public final boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public final Rect f4089a0;

    /* renamed from: b0  reason: collision with root package name */
    public final int f4090b0;

    /* renamed from: c0  reason: collision with root package name */
    public final boolean f4091c0;

    /* renamed from: d0  reason: collision with root package name */
    public final boolean f4092d0;

    /* renamed from: e0  reason: collision with root package name */
    public final boolean f4093e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int f4094f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f4095g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f4096h0;

    /* renamed from: i0  reason: collision with root package name */
    public final CharSequence f4097i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f4098j0;

    /* renamed from: o  reason: collision with root package name */
    public CropImageView.c f4099o;

    /* renamed from: p  reason: collision with root package name */
    public float f4100p;

    /* renamed from: q  reason: collision with root package name */
    public float f4101q;

    /* renamed from: r  reason: collision with root package name */
    public CropImageView.d f4102r;

    /* renamed from: s  reason: collision with root package name */
    public CropImageView.k f4103s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4104t;
    public boolean u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f4105v;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public int f4106x;

    /* renamed from: y  reason: collision with root package name */
    public float f4107y;
    public boolean z;

    public static class a implements Parcelable.Creator<e> {
        public final Object createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        public final Object[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        this.f4099o = CropImageView.c.RECTANGLE;
        this.f4100p = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f4101q = TypedValue.applyDimension(1, 24.0f, displayMetrics);
        this.f4102r = CropImageView.d.ON_TOUCH;
        this.f4103s = CropImageView.k.FIT_CENTER;
        this.f4104t = true;
        this.u = true;
        this.f4105v = true;
        this.w = false;
        this.f4106x = 4;
        this.f4107y = 0.1f;
        this.z = false;
        this.A = 1;
        this.B = 1;
        this.C = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.D = Color.argb(170, 255, 255, 255);
        this.E = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        this.F = TypedValue.applyDimension(1, 5.0f, displayMetrics);
        this.G = TypedValue.applyDimension(1, 14.0f, displayMetrics);
        this.H = -1;
        this.I = TypedValue.applyDimension(1, 1.0f, displayMetrics);
        this.J = Color.argb(170, 255, 255, 255);
        this.K = Color.argb(R.styleable.AppCompatTheme_windowActionModeOverlay, 0, 0, 0);
        this.L = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.M = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.N = 40;
        this.O = 40;
        this.P = 99999;
        this.Q = 99999;
        this.R = BuildConfig.FLAVOR;
        this.S = 0;
        this.T = Uri.EMPTY;
        this.U = Bitmap.CompressFormat.JPEG;
        this.V = 90;
        this.W = 0;
        this.X = 0;
        this.Y = CropImageView.j.NONE;
        this.Z = false;
        this.f4089a0 = null;
        this.f4090b0 = -1;
        this.f4091c0 = true;
        this.f4092d0 = true;
        this.f4093e0 = false;
        this.f4094f0 = 90;
        this.f4095g0 = false;
        this.f4096h0 = false;
        this.f4097i0 = null;
        this.f4098j0 = 0;
    }

    public e(Parcel parcel) {
        this.f4099o = CropImageView.c.values()[parcel.readInt()];
        this.f4100p = parcel.readFloat();
        this.f4101q = parcel.readFloat();
        this.f4102r = CropImageView.d.values()[parcel.readInt()];
        this.f4103s = CropImageView.k.values()[parcel.readInt()];
        boolean z10 = true;
        this.f4104t = parcel.readByte() != 0;
        this.u = parcel.readByte() != 0;
        this.f4105v = parcel.readByte() != 0;
        this.w = parcel.readByte() != 0;
        this.f4106x = parcel.readInt();
        this.f4107y = parcel.readFloat();
        this.z = parcel.readByte() != 0;
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readFloat();
        this.D = parcel.readInt();
        this.E = parcel.readFloat();
        this.F = parcel.readFloat();
        this.G = parcel.readFloat();
        this.H = parcel.readInt();
        this.I = parcel.readFloat();
        this.J = parcel.readInt();
        this.K = parcel.readInt();
        this.L = parcel.readInt();
        this.M = parcel.readInt();
        this.N = parcel.readInt();
        this.O = parcel.readInt();
        this.P = parcel.readInt();
        this.Q = parcel.readInt();
        this.R = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.S = parcel.readInt();
        this.T = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.U = Bitmap.CompressFormat.valueOf(parcel.readString());
        this.V = parcel.readInt();
        this.W = parcel.readInt();
        this.X = parcel.readInt();
        this.Y = CropImageView.j.values()[parcel.readInt()];
        this.Z = parcel.readByte() != 0;
        this.f4089a0 = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.f4090b0 = parcel.readInt();
        this.f4091c0 = parcel.readByte() != 0;
        this.f4092d0 = parcel.readByte() != 0;
        this.f4093e0 = parcel.readByte() != 0;
        this.f4094f0 = parcel.readInt();
        this.f4095g0 = parcel.readByte() != 0;
        this.f4096h0 = parcel.readByte() == 0 ? false : z10;
        this.f4097i0 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4098j0 = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4099o.ordinal());
        parcel.writeFloat(this.f4100p);
        parcel.writeFloat(this.f4101q);
        parcel.writeInt(this.f4102r.ordinal());
        parcel.writeInt(this.f4103s.ordinal());
        parcel.writeByte(this.f4104t ? (byte) 1 : 0);
        parcel.writeByte(this.u ? (byte) 1 : 0);
        parcel.writeByte(this.f4105v ? (byte) 1 : 0);
        parcel.writeByte(this.w ? (byte) 1 : 0);
        parcel.writeInt(this.f4106x);
        parcel.writeFloat(this.f4107y);
        parcel.writeByte(this.z ? (byte) 1 : 0);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeFloat(this.C);
        parcel.writeInt(this.D);
        parcel.writeFloat(this.E);
        parcel.writeFloat(this.F);
        parcel.writeFloat(this.G);
        parcel.writeInt(this.H);
        parcel.writeFloat(this.I);
        parcel.writeInt(this.J);
        parcel.writeInt(this.K);
        parcel.writeInt(this.L);
        parcel.writeInt(this.M);
        parcel.writeInt(this.N);
        parcel.writeInt(this.O);
        parcel.writeInt(this.P);
        parcel.writeInt(this.Q);
        TextUtils.writeToParcel(this.R, parcel, i10);
        parcel.writeInt(this.S);
        parcel.writeParcelable(this.T, i10);
        parcel.writeString(this.U.name());
        parcel.writeInt(this.V);
        parcel.writeInt(this.W);
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y.ordinal());
        parcel.writeInt(this.Z ? 1 : 0);
        parcel.writeParcelable(this.f4089a0, i10);
        parcel.writeInt(this.f4090b0);
        parcel.writeByte(this.f4091c0 ? (byte) 1 : 0);
        parcel.writeByte(this.f4092d0 ? (byte) 1 : 0);
        parcel.writeByte(this.f4093e0 ? (byte) 1 : 0);
        parcel.writeInt(this.f4094f0);
        parcel.writeByte(this.f4095g0 ? (byte) 1 : 0);
        parcel.writeByte(this.f4096h0 ? (byte) 1 : 0);
        TextUtils.writeToParcel(this.f4097i0, parcel, i10);
        parcel.writeInt(this.f4098j0);
    }
}

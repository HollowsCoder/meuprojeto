package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.t;
import w9.b0;

public abstract class y {
    public static void a(int i10, int i11, int i12, int i13, BitmapFactory.Options options, w wVar) {
        int i14;
        double d;
        if (i13 > i11 || i12 > i10) {
            if (i11 == 0) {
                d = (double) (((float) i12) / ((float) i10));
            } else if (i10 == 0) {
                d = (double) (((float) i13) / ((float) i11));
            } else {
                int floor = (int) Math.floor((double) (((float) i13) / ((float) i11)));
                int floor2 = (int) Math.floor((double) (((float) i12) / ((float) i10)));
                i14 = wVar.f4005j ? Math.max(floor, floor2) : Math.min(floor, floor2);
            }
            i14 = (int) Math.floor(d);
        } else {
            i14 = 1;
        }
        options.inSampleSize = i14;
        options.inJustDecodeBounds = false;
    }

    public static BitmapFactory.Options c(w wVar) {
        boolean a10 = wVar.a();
        Bitmap.Config config = wVar.f4011q;
        boolean z = config != null;
        boolean z10 = wVar.f4010p;
        if (!a10 && !z && !z10) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = a10;
        options.inInputShareable = z10;
        options.inPurgeable = z10;
        if (z) {
            options.inPreferredConfig = config;
        }
        return options;
    }

    public abstract boolean b(w wVar);

    public int d() {
        return 0;
    }

    public abstract a e(w wVar, int i10);

    public boolean f(NetworkInfo networkInfo) {
        return false;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final t.c f4019a;

        /* renamed from: b  reason: collision with root package name */
        public final Bitmap f4020b;

        /* renamed from: c  reason: collision with root package name */
        public final b0 f4021c;
        public final int d;

        public a(Bitmap bitmap, b0 b0Var, t.c cVar, int i10) {
            if ((bitmap != null) != (b0Var == null ? false : true)) {
                this.f4020b = bitmap;
                this.f4021c = b0Var;
                StringBuilder sb = e0.f3939a;
                if (cVar != null) {
                    this.f4019a = cVar;
                    this.d = i10;
                    return;
                }
                throw new NullPointerException("loadedFrom == null");
            }
            throw new AssertionError();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(b0 b0Var, t.c cVar) {
            this((Bitmap) null, b0Var, cVar, 0);
            StringBuilder sb = e0.f3939a;
            if (b0Var != null) {
                return;
            }
            throw new NullPointerException("source == null");
        }
    }
}

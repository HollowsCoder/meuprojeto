package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.x0;
import com.karumi.dexter.R;
import h1.f;
import h1.h;
import h1.i;
import h1.j;
import h1.k;
import h1.l;
import h1.o;
import h1.p;
import h1.q;
import h1.t;
import h1.u;
import h1.v;
import h1.w;
import h1.x;
import java.io.ByteArrayInputStream;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import javax.net.ssl.SSLException;
import t1.g;

public class LottieAnimationView extends AppCompatImageView {
    public static final a K = new a();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public v F;
    public final HashSet G;
    public int H;
    public t<f> I;
    public f J;

    /* renamed from: r  reason: collision with root package name */
    public final b f2202r = new b();

    /* renamed from: s  reason: collision with root package name */
    public final c f2203s = new c();

    /* renamed from: t  reason: collision with root package name */
    public o<Throwable> f2204t;
    public int u;

    /* renamed from: v  reason: collision with root package name */
    public final l f2205v;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public String f2206x;

    /* renamed from: y  reason: collision with root package name */
    public int f2207y;
    public boolean z;

    public class a implements o<Throwable> {
        public final void onResult(Object obj) {
            boolean z;
            Throwable th = (Throwable) obj;
            g.a aVar = g.f8886a;
            if ((th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                t1.c.c("Unable to load composition.", th);
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th);
        }
    }

    public class b implements o<f> {
        public b() {
        }

        public final void onResult(Object obj) {
            LottieAnimationView.this.setComposition((f) obj);
        }
    }

    public class c implements o<Throwable> {
        public c() {
        }

        public final void onResult(Object obj) {
            Throwable th = (Throwable) obj;
            LottieAnimationView lottieAnimationView = LottieAnimationView.this;
            int i10 = lottieAnimationView.u;
            if (i10 != 0) {
                lottieAnimationView.setImageResource(i10);
            }
            o oVar = lottieAnimationView.f2204t;
            if (oVar == null) {
                oVar = LottieAnimationView.K;
            }
            oVar.onResult(th);
        }
    }

    public static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2210a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                h1.v[] r0 = h1.v.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2210a = r0
                h1.v r1 = h1.v.HARDWARE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2210a     // Catch:{ NoSuchFieldError -> 0x001d }
                h1.v r1 = h1.v.SOFTWARE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2210a     // Catch:{ NoSuchFieldError -> 0x0028 }
                h1.v r1 = h1.v.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.d.<clinit>():void");
        }
    }

    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: o  reason: collision with root package name */
        public String f2211o;

        /* renamed from: p  reason: collision with root package name */
        public int f2212p;

        /* renamed from: q  reason: collision with root package name */
        public float f2213q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f2214r;

        /* renamed from: s  reason: collision with root package name */
        public String f2215s;

        /* renamed from: t  reason: collision with root package name */
        public int f2216t;
        public int u;

        public class a implements Parcelable.Creator<e> {
            public final Object createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            public final Object[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e(Parcel parcel) {
            super(parcel);
            this.f2211o = parcel.readString();
            this.f2213q = parcel.readFloat();
            this.f2214r = parcel.readInt() != 1 ? false : true;
            this.f2215s = parcel.readString();
            this.f2216t = parcel.readInt();
            this.u = parcel.readInt();
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f2211o);
            parcel.writeFloat(this.f2213q);
            parcel.writeInt(this.f2214r ? 1 : 0);
            parcel.writeString(this.f2215s);
            parcel.writeInt(this.f2216t);
            parcel.writeInt(this.u);
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String string;
        boolean z10 = false;
        this.u = 0;
        l lVar = new l();
        this.f2205v = lVar;
        this.z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = true;
        v vVar = v.AUTOMATIC;
        this.F = vVar;
        this.G = new HashSet();
        this.H = 0;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.databinding.a.f1011n0, R.attr.lottieAnimationViewStyle, 0);
        this.E = obtainStyledAttributes.getBoolean(1, true);
        boolean hasValue = obtainStyledAttributes.hasValue(10);
        boolean hasValue2 = obtainStyledAttributes.hasValue(5);
        boolean hasValue3 = obtainStyledAttributes.hasValue(16);
        if (!hasValue || !hasValue2) {
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(10, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(5);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(16)) != null) {
                setAnimationFromUrl(string);
            }
            setFallbackResource(obtainStyledAttributes.getResourceId(4, 0));
            if (obtainStyledAttributes.getBoolean(0, false)) {
                this.B = true;
                this.D = true;
            }
            if (obtainStyledAttributes.getBoolean(8, false)) {
                lVar.f5148q.setRepeatCount(-1);
            }
            if (obtainStyledAttributes.hasValue(13)) {
                setRepeatMode(obtainStyledAttributes.getInt(13, 1));
            }
            if (obtainStyledAttributes.hasValue(12)) {
                setRepeatCount(obtainStyledAttributes.getInt(12, -1));
            }
            if (obtainStyledAttributes.hasValue(15)) {
                setSpeed(obtainStyledAttributes.getFloat(15, 1.0f));
            }
            setImageAssetsFolder(obtainStyledAttributes.getString(7));
            setProgress(obtainStyledAttributes.getFloat(9, 0.0f));
            boolean z11 = obtainStyledAttributes.getBoolean(3, false);
            if (lVar.z != z11) {
                lVar.z = z11;
                if (lVar.f5147p != null) {
                    lVar.c();
                }
            }
            if (obtainStyledAttributes.hasValue(2)) {
                lVar.a(new m1.e("**"), q.E, new u1.c(new w(f.a.a(getContext(), obtainStyledAttributes.getResourceId(2, -1)).getDefaultColor())));
            }
            if (obtainStyledAttributes.hasValue(14)) {
                lVar.f5149r = obtainStyledAttributes.getFloat(14, 1.0f);
            }
            if (obtainStyledAttributes.hasValue(11)) {
                int i10 = obtainStyledAttributes.getInt(11, vVar.ordinal());
                setRenderMode(v.values()[i10 >= v.values().length ? vVar.ordinal() : i10]);
            }
            setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(6, false));
            obtainStyledAttributes.recycle();
            Context context2 = getContext();
            g.a aVar = g.f8886a;
            lVar.f5150s = Boolean.valueOf(Settings.Global.getFloat(context2.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f ? true : z10).booleanValue();
            d();
            this.w = true;
            return;
        }
        throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
    }

    private void setCompositionTask(t<f> tVar) {
        this.J = null;
        this.f2205v.d();
        c();
        b bVar = this.f2202r;
        synchronized (tVar) {
            if (!(tVar.d == null || tVar.d.f5206a == null)) {
                bVar.onResult(tVar.d.f5206a);
            }
            tVar.f5210a.add(bVar);
        }
        c cVar = this.f2203s;
        synchronized (tVar) {
            if (!(tVar.d == null || tVar.d.f5207b == null)) {
                cVar.onResult(tVar.d.f5207b);
            }
            tVar.f5211b.add(cVar);
        }
        this.I = tVar;
    }

    public final void buildDrawingCache(boolean z10) {
        this.H++;
        super.buildDrawingCache(z10);
        if (this.H == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z10) == null) {
            setRenderMode(v.HARDWARE);
        }
        this.H--;
        androidx.databinding.a.n();
    }

    public final void c() {
        t<f> tVar = this.I;
        if (tVar != null) {
            b bVar = this.f2202r;
            synchronized (tVar) {
                tVar.f5210a.remove(bVar);
            }
            t<f> tVar2 = this.I;
            c cVar = this.f2203s;
            synchronized (tVar2) {
                tVar2.f5211b.remove(cVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r3 != false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r6 = this;
            int[] r0 = com.airbnb.lottie.LottieAnimationView.d.f2210a
            h1.v r1 = r6.F
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L_0x003b
            if (r0 == r1) goto L_0x0013
            r3 = 3
            if (r0 == r3) goto L_0x0015
        L_0x0013:
            r1 = r2
            goto L_0x003b
        L_0x0015:
            h1.f r0 = r6.J
            r3 = 0
            if (r0 == 0) goto L_0x0025
            boolean r4 = r0.f5128n
            if (r4 == 0) goto L_0x0025
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 >= r5) goto L_0x0025
            goto L_0x0039
        L_0x0025:
            if (r0 == 0) goto L_0x002d
            int r0 = r0.f5129o
            r4 = 4
            if (r0 <= r4) goto L_0x002d
            goto L_0x0039
        L_0x002d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r0 == r4) goto L_0x0039
            r4 = 25
            if (r0 != r4) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r3 = r2
        L_0x0039:
            if (r3 == 0) goto L_0x0013
        L_0x003b:
            int r0 = r6.getLayerType()
            if (r1 == r0) goto L_0x0045
            r0 = 0
            r6.setLayerType(r1, r0)
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.d():void");
    }

    public final void e() {
        if (isShown()) {
            this.f2205v.f();
            d();
            return;
        }
        this.z = true;
    }

    public f getComposition() {
        return this.J;
    }

    public long getDuration() {
        f fVar = this.J;
        if (fVar != null) {
            return (long) fVar.b();
        }
        return 0;
    }

    public int getFrame() {
        return (int) this.f2205v.f5148q.f8880t;
    }

    public String getImageAssetsFolder() {
        return this.f2205v.f5153x;
    }

    public float getMaxFrame() {
        return this.f2205v.f5148q.e();
    }

    public float getMinFrame() {
        return this.f2205v.f5148q.h();
    }

    public u getPerformanceTracker() {
        f fVar = this.f2205v.f5147p;
        if (fVar != null) {
            return fVar.f5117a;
        }
        return null;
    }

    public float getProgress() {
        t1.d dVar = this.f2205v.f5148q;
        f fVar = dVar.f8882x;
        if (fVar == null) {
            return 0.0f;
        }
        float f10 = dVar.f8880t;
        float f11 = fVar.f5126k;
        return (f10 - f11) / (fVar.l - f11);
    }

    public int getRepeatCount() {
        return this.f2205v.f5148q.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f2205v.f5148q.getRepeatMode();
    }

    public float getScale() {
        return this.f2205v.f5149r;
    }

    public float getSpeed() {
        return this.f2205v.f5148q.f8877q;
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        l lVar = this.f2205v;
        if (drawable2 == lVar) {
            super.invalidateDrawable(lVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        if (this.D || this.B) {
            e();
            this.D = false;
            this.B = false;
        }
    }

    public final void onDetachedFromWindow() {
        boolean z10;
        l lVar = this.f2205v;
        t1.d dVar = lVar.f5148q;
        if (dVar == null) {
            z10 = false;
        } else {
            z10 = dVar.f8883y;
        }
        if (z10) {
            this.B = false;
            this.A = false;
            this.z = false;
            lVar.f5152v.clear();
            lVar.f5148q.cancel();
            d();
            this.B = true;
        }
        super.onDetachedFromWindow();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        String str = eVar.f2211o;
        this.f2206x = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f2206x);
        }
        int i10 = eVar.f2212p;
        this.f2207y = i10;
        if (i10 != 0) {
            setAnimation(i10);
        }
        setProgress(eVar.f2213q);
        if (eVar.f2214r) {
            e();
        }
        this.f2205v.f5153x = eVar.f2215s;
        setRepeatMode(eVar.f2216t);
        setRepeatCount(eVar.u);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r6.B != false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable onSaveInstanceState() {
        /*
            r6 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.airbnb.lottie.LottieAnimationView$e r1 = new com.airbnb.lottie.LottieAnimationView$e
            r1.<init>((android.os.Parcelable) r0)
            java.lang.String r0 = r6.f2206x
            r1.f2211o = r0
            int r0 = r6.f2207y
            r1.f2212p = r0
            h1.l r0 = r6.f2205v
            t1.d r2 = r0.f5148q
            h1.f r3 = r2.f8882x
            if (r3 != 0) goto L_0x001b
            r3 = 0
            goto L_0x0025
        L_0x001b:
            float r4 = r2.f8880t
            float r5 = r3.f5126k
            float r4 = r4 - r5
            float r3 = r3.l
            float r3 = r3 - r5
            float r3 = r4 / r3
        L_0x0025:
            r1.f2213q = r3
            r3 = 0
            if (r2 != 0) goto L_0x002c
            r2 = r3
            goto L_0x002e
        L_0x002c:
            boolean r2 = r2.f8883y
        L_0x002e:
            if (r2 != 0) goto L_0x003c
            java.util.WeakHashMap<android.view.View, i0.b0> r2 = i0.w.f6004a
            boolean r2 = i0.w.g.b(r6)
            if (r2 != 0) goto L_0x003d
            boolean r2 = r6.B
            if (r2 == 0) goto L_0x003d
        L_0x003c:
            r3 = 1
        L_0x003d:
            r1.f2214r = r3
            java.lang.String r2 = r0.f5153x
            r1.f2215s = r2
            t1.d r0 = r0.f5148q
            int r2 = r0.getRepeatMode()
            r1.f2216t = r2
            int r0 = r0.getRepeatCount()
            r1.u = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.onSaveInstanceState():android.os.Parcelable");
    }

    public final void onVisibilityChanged(View view, int i10) {
        boolean z10;
        if (this.w) {
            boolean isShown = isShown();
            l lVar = this.f2205v;
            if (isShown) {
                if (this.A) {
                    if (isShown()) {
                        lVar.g();
                        d();
                    } else {
                        this.z = false;
                        this.A = true;
                    }
                } else if (this.z) {
                    e();
                }
                this.A = false;
                this.z = false;
                return;
            }
            t1.d dVar = lVar.f5148q;
            if (dVar == null) {
                z10 = false;
            } else {
                z10 = dVar.f8883y;
            }
            if (z10) {
                this.D = false;
                this.B = false;
                this.A = false;
                this.z = false;
                lVar.f5152v.clear();
                lVar.f5148q.j(true);
                d();
                this.A = true;
            }
        }
    }

    public void setAnimation(int i10) {
        t<f> tVar;
        t<f> tVar2;
        this.f2207y = i10;
        this.f2206x = null;
        if (isInEditMode()) {
            tVar = new t<>(new h1.d(this, i10), true);
        } else {
            if (this.E) {
                Context context = getContext();
                String h10 = h1.g.h(context, i10);
                tVar2 = h1.g.a(h10, new j(new WeakReference(context), context.getApplicationContext(), i10, h10));
            } else {
                Context context2 = getContext();
                HashMap hashMap = h1.g.f5130a;
                tVar2 = h1.g.a((String) null, new j(new WeakReference(context2), context2.getApplicationContext(), i10, (String) null));
            }
            tVar = tVar2;
        }
        setCompositionTask(tVar);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setCompositionTask(h1.g.a((String) null, new k(new ByteArrayInputStream(str.getBytes()))));
    }

    public void setAnimationFromUrl(String str) {
        t<f> tVar;
        if (this.E) {
            Context context = getContext();
            HashMap hashMap = h1.g.f5130a;
            String e10 = x0.e("url_", str);
            tVar = h1.g.a(e10, new h(context, str, e10));
        } else {
            tVar = h1.g.a((String) null, new h(getContext(), str, (String) null));
        }
        setCompositionTask(tVar);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f2205v.E = z10;
    }

    public void setCacheComposition(boolean z10) {
        this.E = z10;
    }

    public void setComposition(f fVar) {
        boolean z10;
        float f10;
        float f11;
        l lVar = this.f2205v;
        lVar.setCallback(this);
        this.J = fVar;
        boolean z11 = true;
        this.C = true;
        boolean z12 = false;
        if (lVar.f5147p == fVar) {
            z11 = false;
        } else {
            lVar.G = false;
            lVar.d();
            lVar.f5147p = fVar;
            lVar.c();
            t1.d dVar = lVar.f5148q;
            if (dVar.f8882x == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            dVar.f8882x = fVar;
            if (z10) {
                f11 = (float) ((int) Math.max(dVar.f8881v, fVar.f5126k));
                f10 = Math.min(dVar.w, fVar.l);
            } else {
                f11 = (float) ((int) fVar.f5126k);
                f10 = fVar.l;
            }
            dVar.l(f11, (float) ((int) f10));
            float f12 = dVar.f8880t;
            dVar.f8880t = 0.0f;
            dVar.k((float) ((int) f12));
            dVar.d();
            lVar.p(dVar.getAnimatedFraction());
            lVar.f5149r = lVar.f5149r;
            ArrayList<l.n> arrayList = lVar.f5152v;
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                l.n nVar = (l.n) it.next();
                if (nVar != null) {
                    nVar.run();
                }
                it.remove();
            }
            arrayList.clear();
            fVar.f5117a.f5214a = lVar.C;
            Drawable.Callback callback = lVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable((Drawable) null);
                imageView.setImageDrawable(lVar);
            }
        }
        this.C = false;
        d();
        if (getDrawable() != lVar || z11) {
            if (!z11) {
                t1.d dVar2 = lVar.f5148q;
                if (dVar2 != null) {
                    z12 = dVar2.f8883y;
                }
                setImageDrawable((Drawable) null);
                setImageDrawable(lVar);
                if (z12) {
                    lVar.g();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it2 = this.G.iterator();
            while (it2.hasNext()) {
                ((p) it2.next()).a();
            }
        }
    }

    public void setFailureListener(o<Throwable> oVar) {
        this.f2204t = oVar;
    }

    public void setFallbackResource(int i10) {
        this.u = i10;
    }

    public void setFontAssetDelegate(h1.a aVar) {
        l1.a aVar2 = this.f2205v.f5154y;
    }

    public void setFrame(int i10) {
        this.f2205v.h(i10);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f2205v.f5151t = z10;
    }

    public void setImageAssetDelegate(h1.b bVar) {
        l1.b bVar2 = this.f2205v.w;
    }

    public void setImageAssetsFolder(String str) {
        this.f2205v.f5153x = str;
    }

    public void setImageBitmap(Bitmap bitmap) {
        c();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        c();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i10) {
        c();
        super.setImageResource(i10);
    }

    public void setMaxFrame(int i10) {
        this.f2205v.i(i10);
    }

    public void setMaxFrame(String str) {
        this.f2205v.j(str);
    }

    public void setMaxProgress(float f10) {
        this.f2205v.k(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.f2205v.l(str);
    }

    public void setMinFrame(int i10) {
        this.f2205v.m(i10);
    }

    public void setMinFrame(String str) {
        this.f2205v.n(str);
    }

    public void setMinProgress(float f10) {
        this.f2205v.o(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        l lVar = this.f2205v;
        if (lVar.D != z10) {
            lVar.D = z10;
            p1.c cVar = lVar.A;
            if (cVar != null) {
                cVar.p(z10);
            }
        }
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        l lVar = this.f2205v;
        lVar.C = z10;
        f fVar = lVar.f5147p;
        if (fVar != null) {
            fVar.f5117a.f5214a = z10;
        }
    }

    public void setProgress(float f10) {
        this.f2205v.p(f10);
    }

    public void setRenderMode(v vVar) {
        this.F = vVar;
        d();
    }

    public void setRepeatCount(int i10) {
        this.f2205v.f5148q.setRepeatCount(i10);
    }

    public void setRepeatMode(int i10) {
        this.f2205v.f5148q.setRepeatMode(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f2205v.u = z10;
    }

    public void setScale(float f10) {
        boolean z10;
        l lVar = this.f2205v;
        lVar.f5149r = f10;
        if (getDrawable() == lVar) {
            t1.d dVar = lVar.f5148q;
            if (dVar == null) {
                z10 = false;
            } else {
                z10 = dVar.f8883y;
            }
            setImageDrawable((Drawable) null);
            setImageDrawable(lVar);
            if (z10) {
                lVar.g();
            }
        }
    }

    public void setSpeed(float f10) {
        this.f2205v.f5148q.f8877q = f10;
    }

    public void setTextDelegate(x xVar) {
        this.f2205v.getClass();
    }

    public final void unscheduleDrawable(Drawable drawable) {
        l lVar;
        boolean z10;
        boolean z11 = this.C;
        boolean z12 = false;
        if (!z11 && drawable == (lVar = this.f2205v)) {
            t1.d dVar = lVar.f5148q;
            if (dVar == null) {
                z10 = false;
            } else {
                z10 = dVar.f8883y;
            }
            if (z10) {
                this.D = false;
                this.B = false;
                this.A = false;
                this.z = false;
                lVar.f5152v.clear();
                lVar.f5148q.j(true);
                d();
                super.unscheduleDrawable(drawable);
            }
        }
        if (!z11 && (drawable instanceof l)) {
            l lVar2 = (l) drawable;
            t1.d dVar2 = lVar2.f5148q;
            if (dVar2 != null) {
                z12 = dVar2.f8883y;
            }
            if (z12) {
                lVar2.f5152v.clear();
                lVar2.f5148q.j(true);
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setAnimation(String str) {
        t<f> tVar;
        t<f> tVar2;
        this.f2206x = str;
        this.f2207y = 0;
        if (isInEditMode()) {
            tVar = new t<>(new h1.e(this, str), true);
        } else {
            if (this.E) {
                Context context = getContext();
                HashMap hashMap = h1.g.f5130a;
                String e10 = x0.e("asset_", str);
                tVar2 = h1.g.a(e10, new i(context.getApplicationContext(), str, e10));
            } else {
                Context context2 = getContext();
                HashMap hashMap2 = h1.g.f5130a;
                tVar2 = h1.g.a((String) null, new i(context2.getApplicationContext(), str, (String) null));
            }
            tVar = tVar2;
        }
        setCompositionTask(tVar);
    }
}

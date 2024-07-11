package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.o;
import com.karumi.dexter.R;
import i0.w;

public class CheckableImageButton extends o implements Checkable {
    public static final int[] u = {16842912};

    /* renamed from: r  reason: collision with root package name */
    public boolean f3522r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f3523s = true;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3524t = true;

    public static class a extends n0.a {
        public static final Parcelable.Creator<a> CREATOR = new C0036a();

        /* renamed from: q  reason: collision with root package name */
        public boolean f3525q;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$a$a  reason: collision with other inner class name */
        public static class C0036a implements Parcelable.ClassLoaderCreator<a> {
            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i10) {
                return new a[i10];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3525q = parcel.readInt() != 1 ? false : true;
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f7340o, i10);
            parcel.writeInt(this.f3525q ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        w.k(this, new h6.a(this));
    }

    public final boolean isChecked() {
        return this.f3522r;
    }

    public final int[] onCreateDrawableState(int i10) {
        return this.f3522r ? View.mergeDrawableStates(super.onCreateDrawableState(i10 + 1), u) : super.onCreateDrawableState(i10);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f7340o);
        setChecked(aVar.f3525q);
    }

    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f3525q = this.f3522r;
        return aVar;
    }

    public void setCheckable(boolean z) {
        if (this.f3523s != z) {
            this.f3523s = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.f3523s && this.f3522r != z) {
            this.f3522r = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.f3524t = z;
    }

    public void setPressed(boolean z) {
        if (this.f3524t) {
            super.setPressed(z);
        }
    }

    public final void toggle() {
        setChecked(!this.f3522r);
    }
}

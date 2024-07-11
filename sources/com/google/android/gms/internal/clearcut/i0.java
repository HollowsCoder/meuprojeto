package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;

public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f2463a = 0;

    static {
        i0.class.getClassLoader();
    }

    public static <T extends Parcelable> T a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}

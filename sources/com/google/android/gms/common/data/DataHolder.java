package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import o4.a;
import o4.c;

@KeepName
public final class DataHolder extends a implements Closeable {
    @RecentlyNonNull
    public static final Parcelable.Creator<DataHolder> CREATOR = new m4.a();

    /* renamed from: o  reason: collision with root package name */
    public final int f2334o;

    /* renamed from: p  reason: collision with root package name */
    public final String[] f2335p;

    /* renamed from: q  reason: collision with root package name */
    public Bundle f2336q;

    /* renamed from: r  reason: collision with root package name */
    public final CursorWindow[] f2337r;

    /* renamed from: s  reason: collision with root package name */
    public final int f2338s;

    /* renamed from: t  reason: collision with root package name */
    public final Bundle f2339t;
    public int[] u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2340v = false;
    public final boolean w = true;

    static {
        new ArrayList();
        new HashMap();
    }

    public DataHolder(int i10, String[] strArr, CursorWindow[] cursorWindowArr, int i11, Bundle bundle) {
        this.f2334o = i10;
        this.f2335p = strArr;
        this.f2337r = cursorWindowArr;
        this.f2338s = i11;
        this.f2339t = bundle;
    }

    public final void close() {
        synchronized (this) {
            if (!this.f2340v) {
                this.f2340v = true;
                int i10 = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f2337r;
                    if (i10 >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i10].close();
                    i10++;
                }
            }
        }
    }

    public final void finalize() {
        boolean z;
        try {
            if (this.w && this.f2337r.length > 0) {
                synchronized (this) {
                    z = this.f2340v;
                }
                if (!z) {
                    close();
                    String obj = toString();
                    StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                    sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                    sb.append(obj);
                    sb.append(")");
                    Log.e("DataBuffer", sb.toString());
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10) {
        int h10 = c.h(parcel, 20293);
        String[] strArr = this.f2335p;
        if (strArr != null) {
            int h11 = c.h(parcel, 1);
            parcel.writeStringArray(strArr);
            c.k(parcel, h11);
        }
        c.g(parcel, 2, this.f2337r, i10);
        c.i(parcel, 3, 4);
        parcel.writeInt(this.f2338s);
        c.a(parcel, 4, this.f2339t);
        c.i(parcel, 1000, 4);
        parcel.writeInt(this.f2334o);
        c.k(parcel, h10);
        if ((i10 & 1) != 0) {
            close();
        }
    }
}

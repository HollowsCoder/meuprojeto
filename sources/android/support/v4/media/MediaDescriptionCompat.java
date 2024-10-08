package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: o  reason: collision with root package name */
    public final String f122o;

    /* renamed from: p  reason: collision with root package name */
    public final CharSequence f123p;

    /* renamed from: q  reason: collision with root package name */
    public final CharSequence f124q;

    /* renamed from: r  reason: collision with root package name */
    public final CharSequence f125r;

    /* renamed from: s  reason: collision with root package name */
    public final Bitmap f126s;

    /* renamed from: t  reason: collision with root package name */
    public final Uri f127t;
    public final Bundle u;

    /* renamed from: v  reason: collision with root package name */
    public final Uri f128v;
    public Object w;

    public static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        public final Object createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        public final Object[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    public MediaDescriptionCompat() {
        throw null;
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f122o = str;
        this.f123p = charSequence;
        this.f124q = charSequence2;
        this.f125r = charSequence3;
        this.f126s = bitmap;
        this.f127t = uri;
        this.u = bundle;
        this.f128v = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r14) {
        /*
            r0 = 0
            if (r14 == 0) goto L_0x005b
            r1 = r14
            android.media.MediaDescription r1 = (android.media.MediaDescription) r1
            java.lang.String r3 = r1.getMediaId()
            java.lang.CharSequence r4 = r1.getTitle()
            java.lang.CharSequence r5 = r1.getSubtitle()
            java.lang.CharSequence r6 = r1.getDescription()
            android.graphics.Bitmap r7 = r1.getIconBitmap()
            android.net.Uri r8 = r1.getIconUri()
            android.os.Bundle r2 = r1.getExtras()
            java.lang.String r9 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x0030
            android.support.v4.media.session.MediaSessionCompat.a(r2)
            android.os.Parcelable r10 = r2.getParcelable(r9)
            android.net.Uri r10 = (android.net.Uri) r10
            goto L_0x0031
        L_0x0030:
            r10 = r0
        L_0x0031:
            if (r10 == 0) goto L_0x004a
            java.lang.String r11 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r12 = r2.containsKey(r11)
            if (r12 == 0) goto L_0x0044
            int r12 = r2.size()
            r13 = 2
            if (r12 != r13) goto L_0x0044
            r9 = r0
            goto L_0x004b
        L_0x0044:
            r2.remove(r9)
            r2.remove(r11)
        L_0x004a:
            r9 = r2
        L_0x004b:
            if (r10 == 0) goto L_0x004e
            goto L_0x0053
        L_0x004e:
            android.net.Uri r0 = r1.getMediaUri()
            r10 = r0
        L_0x0053:
            android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.w = r14
        L_0x005b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f123p + ", " + this.f124q + ", " + this.f125r;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        Object obj = this.w;
        if (obj == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f122o);
            builder.setTitle(this.f123p);
            builder.setSubtitle(this.f124q);
            builder.setDescription(this.f125r);
            builder.setIconBitmap(this.f126s);
            builder.setIconUri(this.f127t);
            builder.setExtras(this.u);
            builder.setMediaUri(this.f128v);
            obj = builder.build();
            this.w = obj;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i10);
    }
}

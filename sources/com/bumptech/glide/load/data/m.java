package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import java.io.InputStream;

public final class m extends k<InputStream> {

    /* renamed from: r  reason: collision with root package name */
    public static final UriMatcher f2289r;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f2289r = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public m(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    public final Class<InputStream> a() {
        return InputStream.class;
    }

    public final void c(Object obj) {
        ((InputStream) obj).close();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(android.content.ContentResolver r4, android.net.Uri r5) {
        /*
            r3 = this;
            android.content.UriMatcher r0 = f2289r
            int r0 = r0.match(r5)
            r1 = 1
            if (r0 == r1) goto L_0x0019
            r2 = 3
            if (r0 == r2) goto L_0x0014
            r2 = 5
            if (r0 == r2) goto L_0x0019
            java.io.InputStream r4 = r4.openInputStream(r5)
            goto L_0x0023
        L_0x0014:
            java.io.InputStream r4 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r4, r5, r1)
            goto L_0x0023
        L_0x0019:
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.lookupContact(r4, r5)
            if (r0 == 0) goto L_0x0032
            java.io.InputStream r4 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r4, r0, r1)
        L_0x0023:
            if (r4 == 0) goto L_0x0026
            return r4
        L_0x0026:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r0 = "InputStream is null for "
            java.lang.String r5 = androidx.appcompat.widget.x0.d(r0, r5)
            r4.<init>(r5)
            throw r4
        L_0x0032:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r5 = "Contact cannot be found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.m.d(android.content.ContentResolver, android.net.Uri):java.lang.Object");
    }
}

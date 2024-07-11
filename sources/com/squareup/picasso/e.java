package com.squareup.picasso;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;

public final class e extends y {

    /* renamed from: b  reason: collision with root package name */
    public static final UriMatcher f3937b;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3938a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f3937b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public e(Context context) {
        this.f3938a = context;
    }

    public final boolean b(w wVar) {
        Uri uri = wVar.f3999c;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f3937b.match(wVar.f3999c) != -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.squareup.picasso.y.a e(com.squareup.picasso.w r5, int r6) {
        /*
            r4 = this;
            android.content.Context r6 = r4.f3938a
            android.content.ContentResolver r6 = r6.getContentResolver()
            android.net.Uri r5 = r5.f3999c
            android.content.UriMatcher r0 = f3937b
            int r0 = r0.match(r5)
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x002d
            r3 = 2
            if (r0 == r3) goto L_0x0028
            r3 = 3
            if (r0 == r3) goto L_0x0035
            r2 = 4
            if (r0 != r2) goto L_0x001c
            goto L_0x0028
        L_0x001c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Invalid uri: "
            java.lang.String r5 = androidx.appcompat.widget.x0.d(r0, r5)
            r6.<init>(r5)
            throw r6
        L_0x0028:
            java.io.InputStream r5 = r6.openInputStream(r5)
            goto L_0x0039
        L_0x002d:
            android.net.Uri r5 = android.provider.ContactsContract.Contacts.lookupContact(r6, r5)
            if (r5 != 0) goto L_0x0035
            r5 = r1
            goto L_0x0039
        L_0x0035:
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r6, r5, r2)
        L_0x0039:
            if (r5 != 0) goto L_0x003c
            return r1
        L_0x003c:
            com.squareup.picasso.y$a r6 = new com.squareup.picasso.y$a
            w9.p r5 = n.e.H(r5)
            com.squareup.picasso.t$c r0 = com.squareup.picasso.t.c.DISK
            r6.<init>(r5, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.e.e(com.squareup.picasso.w, int):com.squareup.picasso.y$a");
    }
}

package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.appcompat.widget.x0;
import java.io.FileNotFoundException;

public final class a extends k {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f2264r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ContentResolver contentResolver, Uri uri, int i10) {
        super(contentResolver, uri);
        this.f2264r = i10;
    }

    public final Class a() {
        switch (this.f2264r) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }

    public final void c(Object obj) {
        switch (this.f2264r) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                return;
            default:
                ((ParcelFileDescriptor) obj).close();
                return;
        }
    }

    public final Object d(ContentResolver contentResolver, Uri uri) {
        switch (this.f2264r) {
            case 0:
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                if (openAssetFileDescriptor != null) {
                    return openAssetFileDescriptor;
                }
                throw new FileNotFoundException(x0.d("FileDescriptor is null for: ", uri));
            default:
                AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(uri, "r");
                if (openAssetFileDescriptor2 != null) {
                    return openAssetFileDescriptor2.getParcelFileDescriptor();
                }
                throw new FileNotFoundException(x0.d("FileDescriptor is null for: ", uri));
        }
    }
}

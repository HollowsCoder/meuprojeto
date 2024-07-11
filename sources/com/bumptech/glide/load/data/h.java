package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;

public final class h extends b<ParcelFileDescriptor> {
    public h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    public final Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
    }

    public final void c(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    public final Object d(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}

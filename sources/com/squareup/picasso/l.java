package com.squareup.picasso;

import android.util.LruCache;
import com.squareup.picasso.m;

public final class l extends LruCache<String, m.a> {
    public l(int i10) {
        super(i10);
    }

    public final int sizeOf(Object obj, Object obj2) {
        String str = (String) obj;
        return ((m.a) obj2).f3959b;
    }
}

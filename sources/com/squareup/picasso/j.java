package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import n.e;
import s0.a;

public final class j extends f {
    public j(Context context) {
        super(context);
    }

    public final boolean b(w wVar) {
        return "file".equals(wVar.f3999c.getScheme());
    }

    public final y.a e(w wVar, int i10) {
        return new y.a((Bitmap) null, e.H(g(wVar)), t.c.DISK, new a(wVar.f3999c.getPath()).c());
    }
}

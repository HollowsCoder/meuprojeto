package com.squareup.picasso;

import android.content.Context;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import java.io.InputStream;
import n.e;

public class f extends y {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3942a;

    public f(Context context) {
        this.f3942a = context;
    }

    public boolean b(w wVar) {
        return "content".equals(wVar.f3999c.getScheme());
    }

    public y.a e(w wVar, int i10) {
        return new y.a(e.H(g(wVar)), t.c.DISK);
    }

    public final InputStream g(w wVar) {
        return this.f3942a.getContentResolver().openInputStream(wVar.f3999c);
    }
}

package com.appfab.facematchlive.ui.flow.imagezoom;

import android.os.Bundle;
import androidx.lifecycle.b0;
import com.appfab.facematchlive.data.model.GalleryModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.karumi.dexter.R;
import java.lang.ref.WeakReference;
import java.util.List;
import ooo.oxo.library.widget.PullBackLayout;
import v1.e;
import x1.c;
import z8.g;

public class ImageZoomActivity extends v1.b<c, b2.a> {
    public int H;
    public List<GalleryModel> I;

    public class a extends TypeToken<List<GalleryModel>> {
    }

    public class b implements PullBackLayout.a {
        public b() {
        }
    }

    public final int B() {
        return 6;
    }

    public final int C() {
        return R.layout.activity_image_zoom;
    }

    public final e D() {
        return (b2.a) new b0(this).a(b2.a.class);
    }

    public final void E() {
    }

    public final void onBackPressed() {
        super.onBackPressed();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((b2.a) new b0(this).a(b2.a.class)).f9121c = new WeakReference<>(this);
        this.H = getIntent().getIntExtra("position", 0);
        List<GalleryModel> list = (List) new Gson().fromJson(j2.a.f6520b, new a().getType());
        this.I = list;
        c2.a aVar = new c2.a(list);
        T t10 = this.E;
        g.c(t10);
        ((c) t10).L0.setAdapter(aVar);
        T t11 = this.E;
        g.c(t11);
        ((c) t11).L0.setCurrentItem(this.H);
        T t12 = this.E;
        g.c(t12);
        ((c) t12).L0.setOrientation(0);
        T t13 = this.E;
        g.c(t13);
        ((c) t13).L0.setClipToPadding(false);
        T t14 = this.E;
        g.c(t14);
        ((c) t14).L0.setClipChildren(false);
        T t15 = this.E;
        g.c(t15);
        ((c) t15).L0.setPageTransformer(new n2.a());
        T t16 = this.E;
        g.c(t16);
        ((c) t16).L0.setAdapter(aVar);
        aVar.f1628a.b();
        T t17 = this.E;
        g.c(t17);
        ((c) t17).M0.setCallback(new b());
    }

    public final void onPause() {
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
    }
}

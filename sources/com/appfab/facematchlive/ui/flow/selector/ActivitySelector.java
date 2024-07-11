package com.appfab.facematchlive.ui.flow.selector;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.provider.MediaStore;
import androidx.core.content.FileProvider;
import androidx.lifecycle.b0;
import c.c;
import com.appfab.facematchlive.FaceMatchApp;
import com.karumi.dexter.R;
import e2.d;
import e2.e;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import v1.a;
import v1.b;
import x1.g;

public final class ActivitySelector extends b<g, d> implements e {
    public static final /* synthetic */ int L = 0;
    public Uri H;
    public String I;
    public final androidx.activity.result.d J = v(new d2.b(1, this), new c());
    public final androidx.activity.result.d K = v(new a(this), new c());

    public ActivitySelector() {
        v(new e2.a(0, this), new c());
    }

    public final int B() {
        return 4;
    }

    public final int C() {
        return R.layout.activity_selector;
    }

    public final void E() {
        File file;
        boolean booleanExtra = getIntent().getBooleanExtra("camera", false);
        D();
        if (booleanExtra) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
            if (intent.resolveActivity(getPackageManager()) != null) {
                try {
                    file = i2.a.a(this);
                } catch (IOException unused) {
                    file = null;
                }
                if (file != null) {
                    this.H = FileProvider.a(getApplicationContext(), "com.appfab.facematchlive.fileprovider").b(file);
                    this.I = file.getAbsolutePath();
                    intent.putExtra("output", this.H);
                    this.J.E(intent);
                    return;
                }
                return;
            }
            return;
        }
        this.K.E(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI));
    }

    /* renamed from: G */
    public final d D() {
        return (d) new b0(this).a(d.class);
    }

    public final void j() {
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        D().f9121c = new WeakReference<>(this);
        D().d = this;
        d G = D();
        T t10 = this.E;
        z8.g.c(t10);
        G.f4465e = (g) t10;
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().build());
        FaceMatchApp a10 = FaceMatchApp.u.a();
        if (a10 != null) {
            a10.a();
        }
    }
}

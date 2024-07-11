package e2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.provider.MediaStore;
import androidx.activity.result.b;
import c7.c;
import com.appfab.facematchlive.data.model.GalleryModel;
import com.appfab.facematchlive.ui.flow.selector.ActivitySelector;
import com.theartofdev.edmodo.cropper.d;
import d7.p0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import m5.i;
import m5.j;
import o.e;
import z8.g;

public final /* synthetic */ class a implements b, c7.b, m5.a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f4457o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f4458p;

    public /* synthetic */ a(int i10, Object obj) {
        this.f4457o = i10;
        this.f4458p = obj;
    }

    public final void a(Object obj) {
        d.a aVar;
        Bitmap bitmap;
        ActivitySelector activitySelector = (ActivitySelector) this.f4458p;
        androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
        int i10 = ActivitySelector.L;
        g.f(activitySelector, "this$0");
        g.f(aVar2, "result");
        if (aVar2.f192o == -1) {
            Intent intent = aVar2.f193p;
            if (intent != null) {
                aVar = (d.a) intent.getParcelableExtra("CROP_IMAGE_EXTRA_RESULT");
            } else {
                aVar = null;
            }
            try {
                ArrayList arrayList = new ArrayList();
                String valueOf = String.valueOf(new Date().getTime());
                if (Build.VERSION.SDK_INT >= 28) {
                    ImageDecoder.Source g10 = ImageDecoder.createSource(activitySelector.getContentResolver(), aVar.f4035p);
                    g.e(g10, "createSource(contentResolver, resultData.uri)");
                    bitmap = ImageDecoder.decodeBitmap(g10);
                    g.e(bitmap, "decodeBitmap(source)");
                    g.e(activitySelector.getApplicationContext(), "applicationContext");
                } else {
                    g.e(activitySelector.getApplicationContext(), "applicationContext");
                    bitmap = MediaStore.Images.Media.getBitmap(activitySelector.getContentResolver(), aVar.f4035p);
                    g.e(bitmap, "getBitmap(contentResolver, resultData.uri)");
                }
                String a10 = e.a(bitmap, valueOf);
                if (a10 != null) {
                    arrayList.add(new GalleryModel(a10, valueOf, 0, false, false, 16, (z8.e) null));
                }
                activitySelector.runOnUiThread(new d2.d(1, activitySelector, arrayList));
                return;
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
        activitySelector.finish();
    }

    public final Object c(i iVar) {
        j jVar = (j) this.f4458p;
        ExecutorService executorService = p0.f4263a;
        if (iVar.m()) {
            jVar.c(iVar.i());
            return null;
        }
        Exception h10 = iVar.h();
        Objects.requireNonNull(h10);
        jVar.b(h10);
        return null;
    }

    public final void e(c7.a aVar) {
        z6.a aVar2 = (z6.a) this.f4458p;
        synchronized (aVar2) {
            if (aVar2.f9932b instanceof c) {
                aVar2.f9933c.add(aVar);
            }
            aVar2.f9932b.e(aVar);
        }
    }
}

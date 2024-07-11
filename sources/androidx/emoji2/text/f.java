package androidx.emoji2.text;

import android.net.Uri;
import android.widget.ImageView;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.e;
import androidx.emoji2.text.k;
import com.appfab.facematchlive.data.model.GalleryModel;
import com.appfab.facematchlive.ui.flow.main.MainActivity;
import com.karumi.dexter.R;
import f8.h;
import java.io.File;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.regex.Pattern;
import r4.b;
import y9.d;
import y9.i;
import z8.g;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f1055o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f1056p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f1057q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f1058r;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i10) {
        this.f1055o = i10;
        this.f1056p = obj;
        this.f1057q = obj2;
        this.f1058r = obj3;
    }

    public final void run() {
        String str;
        boolean z;
        String str2;
        switch (this.f1055o) {
            case 0:
                EmojiCompatInitializer.b bVar = (EmojiCompatInitializer.b) this.f1056p;
                e.h hVar = (e.h) this.f1057q;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1058r;
                bVar.getClass();
                try {
                    k a10 = c.a(bVar.f1034a);
                    if (a10 != null) {
                        k.b bVar2 = (k.b) a10.f1050a;
                        synchronized (bVar2.d) {
                            bVar2.f1081f = threadPoolExecutor;
                        }
                        a10.f1050a.a(new g(hVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th) {
                    hVar.a(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                GalleryModel galleryModel = (GalleryModel) this.f1056p;
                ImageView imageView = (ImageView) this.f1057q;
                MainActivity mainActivity = (MainActivity) this.f1058r;
                int i10 = MainActivity.P;
                g.f(imageView, "$imageView");
                g.f(mainActivity, "this$0");
                String str3 = null;
                if (galleryModel != null) {
                    str = galleryModel.getFileName();
                } else {
                    str = null;
                }
                if (str == null || str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (galleryModel != null) {
                        str2 = galleryModel.getImage();
                    } else {
                        str2 = null;
                    }
                    imageView.setImageURI(Uri.fromFile(new File(String.valueOf(str2))));
                    if (g.a(imageView.getTag(), "first")) {
                        if (galleryModel != null) {
                            str3 = galleryModel.getImage();
                        }
                        mainActivity.I = String.valueOf(str3);
                        return;
                    }
                    if (galleryModel != null) {
                        str3 = galleryModel.getImage();
                    }
                    mainActivity.J = String.valueOf(str3);
                    return;
                }
                imageView.setImageResource(R.drawable.ic_user_default_gray);
                if (g.a(imageView.getTag(), "first")) {
                    mainActivity.I = null;
                    return;
                } else {
                    mainActivity.J = null;
                    return;
                }
            case 2:
                Pattern pattern = h.f4918e;
                ((b) this.f1056p).a((String) this.f1057q, (f8.e) this.f1058r);
                return;
            default:
                ((d) this.f1057q).a(i.a.this, (Throwable) this.f1058r);
                return;
        }
    }
}

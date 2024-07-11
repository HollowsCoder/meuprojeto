package k2;

import android.app.Activity;
import androidx.appcompat.app.AlertController;
import com.appfab.facematchlive.ui.flow.main.MainActivity;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.R;
import d6.b;
import n8.i;
import y8.l;
import z8.g;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f6677a;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6678a;

        static {
            int[] iArr = new int[j2.c.values().length];
            iArr[j2.c.CAMERA_PERMISSION.ordinal()] = 1;
            iArr[j2.c.GALLERY_WRITE_PERMISSION.ordinal()] = 2;
            iArr[j2.c.GALLERY_READ_PERMISSION.ordinal()] = 3;
            f6678a = iArr;
        }
    }

    public c(MainActivity mainActivity) {
        this.f6677a = mainActivity;
    }

    public final void a(j2.c cVar, l<? super Boolean, i> lVar, y8.a<i> aVar) {
        boolean z;
        String str;
        String str2;
        g.f(cVar, "permission");
        String value = cVar.getValue();
        Activity activity = this.f6677a;
        if (y.a.a(activity, value) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            lVar.k(Boolean.TRUE);
            return;
        }
        int i10 = a.f6678a[cVar.ordinal()];
        if (i10 == 1) {
            str = activity.getString(R.string.permission_camera_desc);
            str2 = "activity.getString(R.str…g.permission_camera_desc)";
        } else if (i10 == 2 || i10 == 3) {
            str = activity.getString(R.string.permission_gallery_desc);
            str2 = "activity.getString(R.str….permission_gallery_desc)";
        } else {
            str = BuildConfig.FLAVOR;
            b bVar = new b(activity);
            String string = activity.getString(R.string.permission_dialog_info_title);
            AlertController.b bVar2 = bVar.f257a;
            bVar2.d = string;
            bVar2.f242f = str;
            bVar2.f247k = false;
            String string2 = activity.getString(R.string.cancel);
            a aVar2 = new a(0, aVar);
            bVar2.f245i = string2;
            bVar2.f246j = aVar2;
            String string3 = activity.getString(R.string.ok);
            b bVar3 = new b(this, cVar, lVar, aVar);
            bVar2.f243g = string3;
            bVar2.f244h = bVar3;
            bVar.a().show();
        }
        g.e(str, str2);
        b bVar4 = new b(activity);
        String string4 = activity.getString(R.string.permission_dialog_info_title);
        AlertController.b bVar22 = bVar4.f257a;
        bVar22.d = string4;
        bVar22.f242f = str;
        bVar22.f247k = false;
        String string22 = activity.getString(R.string.cancel);
        a aVar22 = new a(0, aVar);
        bVar22.f245i = string22;
        bVar22.f246j = aVar22;
        String string32 = activity.getString(R.string.ok);
        b bVar32 = new b(this, cVar, lVar, aVar);
        bVar22.f243g = string32;
        bVar22.f244h = bVar32;
        bVar4.a().show();
    }
}

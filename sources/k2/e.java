package k2;

import android.app.Activity;
import androidx.appcompat.app.AlertController;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.R;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import d6.b;
import n8.i;
import y8.a;
import y8.l;
import z8.g;

public final class e implements PermissionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l<Boolean, i> f6680a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f6681b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a<i> f6682c;

    public e(f fVar, c cVar, g gVar) {
        this.f6680a = fVar;
        this.f6681b = cVar;
        this.f6682c = gVar;
    }

    public final void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
        g.f(permissionDeniedResponse, "response");
        if (permissionDeniedResponse.isPermanentlyDenied()) {
            c cVar = this.f6681b;
            b bVar = new b(cVar.f6677a);
            Activity activity = cVar.f6677a;
            String string = activity.getString(R.string.permission_denied_title);
            AlertController.b bVar2 = bVar.f257a;
            bVar2.d = string;
            bVar2.f250o = R.layout.dialog_permission_denied;
            bVar2.f247k = false;
            String string2 = activity.getString(R.string.cancel);
            d dVar = new d(this.f6682c);
            bVar2.f245i = string2;
            bVar2.f246j = dVar;
            String string3 = activity.getString(R.string.yes);
            a aVar = new a(1, cVar);
            bVar2.f243g = string3;
            bVar2.f244h = aVar;
            bVar.a().show();
        }
        this.f6680a.k(Boolean.FALSE);
    }

    public final void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
        g.f(permissionGrantedResponse, "response");
        this.f6680a.k(Boolean.TRUE);
    }

    public final void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
        if (permissionToken != null) {
            permissionToken.continuePermissionRequest();
        }
        this.f6680a.k(Boolean.FALSE);
    }
}

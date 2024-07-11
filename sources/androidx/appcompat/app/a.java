package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

public final class a implements AdapterView.OnItemClickListener {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ AlertController f254o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ AlertController.b f255p;

    public a(AlertController.b bVar, AlertController alertController) {
        this.f255p = bVar;
        this.f254o = alertController;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j8) {
        AlertController.b bVar = this.f255p;
        DialogInterface.OnClickListener onClickListener = bVar.f249n;
        AlertController alertController = this.f254o;
        onClickListener.onClick(alertController.f215b, i10);
        if (!bVar.f251p) {
            alertController.f215b.dismiss();
        }
    }
}

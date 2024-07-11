package k2;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.karumi.dexter.R;
import z8.g;

public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f6671o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f6672p;

    public /* synthetic */ a(int i10, Object obj) {
        this.f6671o = i10;
        this.f6672p = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = this.f6671o;
        Object obj = this.f6672p;
        switch (i11) {
            case 0:
                y8.a aVar = (y8.a) obj;
                g.f(aVar, "$onCancel");
                aVar.n();
                dialogInterface.dismiss();
                return;
            default:
                c cVar = (c) obj;
                g.f(cVar, "this$0");
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                Activity activity = cVar.f6677a;
                Uri fromParts = Uri.fromParts("package", activity.getPackageName(), (String) null);
                g.e(fromParts, "fromParts(\"package\", activity.packageName, null)");
                intent.setData(fromParts);
                activity.startActivityForResult(intent, R.styleable.AppCompatTheme_switchStyle);
                Toast.makeText(activity, activity.getString(R.string.permission_denied_settings_message), 1).show();
                dialogInterface.dismiss();
                return;
        }
    }
}

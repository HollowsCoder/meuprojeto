package n4;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

public abstract class p implements DialogInterface.OnClickListener {
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            r rVar = (r) this;
            Intent intent = rVar.f7463o;
            if (intent != null) {
                rVar.f7464p.startActivityForResult(intent, rVar.f7465q);
            }
        } catch (ActivityNotFoundException e10) {
            String str = "Failed to start resolution intent.";
            if (Build.FINGERPRINT.contains("generic")) {
                str = str.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
            }
            Log.e("DialogRedirect", str, e10);
        } finally {
            dialogInterface.dismiss();
        }
    }
}

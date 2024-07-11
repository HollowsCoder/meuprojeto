package com.karumi.dexter;

import android.app.Activity;
import android.content.Context;
import s6.a;

class AndroidPermissionService {
    public int checkSelfPermission(Context context, String str) {
        return a.q(context, str);
    }

    public boolean isPermissionPermanentlyDenied(Activity activity, String str) {
        return !shouldShowRequestPermissionRationale(activity, str);
    }

    public void requestPermissions(Activity activity, String[] strArr, int i10) {
        if (activity != null) {
            x.a.b(activity, strArr, i10);
        }
    }

    public boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
        if (activity == null) {
            return false;
        }
        int i10 = x.a.f9376c;
        return activity.shouldShowRequestPermissionRationale(str);
    }
}

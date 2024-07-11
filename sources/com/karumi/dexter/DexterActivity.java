package com.karumi.dexter;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedList;

public final class DexterActivity extends Activity {
    private boolean isTargetSdkUnderAndroidM() {
        try {
            return getPackageManager().getPackageInfo(getPackageName(), 0).applicationInfo.targetSdkVersion < 23;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Dexter.onActivityReady(this);
        getWindow().addFlags(16);
    }

    public void onDestroy() {
        super.onDestroy();
        Dexter.onActivityDestroyed(this);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Dexter.onActivityReady(this);
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        if (isTargetSdkUnderAndroidM()) {
            linkedList2.addAll(Arrays.asList(strArr));
        } else {
            for (int i11 = 0; i11 < strArr.length; i11++) {
                String str = strArr[i11];
                int i12 = iArr[i11];
                if (i12 == -2 || i12 == -1) {
                    linkedList2.add(str);
                } else if (i12 == 0) {
                    linkedList.add(str);
                }
            }
        }
        Dexter.onPermissionsRequested(linkedList, linkedList2);
    }
}

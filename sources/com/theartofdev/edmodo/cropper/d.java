package com.theartofdev.edmodo.cropper;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.MediaStore;
import com.karumi.dexter.R;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

public final class d {

    public static final class a extends CropImageView.b implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0050a();

        /* renamed from: com.theartofdev.edmodo.cropper.d$a$a  reason: collision with other inner class name */
        public static class C0050a implements Parcelable.Creator<a> {
            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            public final Object[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a(Uri uri, Uri uri2, Exception exc, float[] fArr, Rect rect, int i10, Rect rect2, int i11) {
            super(uri, uri2, exc, fArr, rect, rect2, i10, i11);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(android.os.Parcel r12) {
            /*
                r11 = this;
                java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
                java.lang.ClassLoader r1 = r0.getClassLoader()
                android.os.Parcelable r1 = r12.readParcelable(r1)
                r3 = r1
                android.net.Uri r3 = (android.net.Uri) r3
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r12.readParcelable(r0)
                r4 = r0
                android.net.Uri r4 = (android.net.Uri) r4
                java.io.Serializable r0 = r12.readSerializable()
                r5 = r0
                java.lang.Exception r5 = (java.lang.Exception) r5
                float[] r6 = r12.createFloatArray()
                java.lang.Class<android.graphics.Rect> r0 = android.graphics.Rect.class
                java.lang.ClassLoader r1 = r0.getClassLoader()
                android.os.Parcelable r1 = r12.readParcelable(r1)
                r7 = r1
                android.graphics.Rect r7 = (android.graphics.Rect) r7
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r12.readParcelable(r0)
                r8 = r0
                android.graphics.Rect r8 = (android.graphics.Rect) r8
                int r9 = r12.readInt()
                int r10 = r12.readInt()
                r2 = r11
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.d.a.<init>(android.os.Parcel):void");
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f4034o, i10);
            parcel.writeParcelable(this.f4035p, i10);
            parcel.writeSerializable(this.f4036q);
            parcel.writeFloatArray(this.f4037r);
            parcel.writeParcelable(this.f4038s, i10);
            parcel.writeParcelable(this.f4039t, i10);
            parcel.writeInt(this.u);
            parcel.writeInt(this.f4040v);
        }
    }

    public static ArrayList a(PackageManager packageManager, String str) {
        ArrayList arrayList = new ArrayList();
        Intent intent = str == "android.intent.action.GET_CONTENT" ? new Intent(str) : new Intent(str, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/*");
        for (ResolveInfo next : packageManager.queryIntentActivities(intent, 0)) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = next.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(next.activityInfo.packageName);
            arrayList.add(intent2);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Intent intent3 = (Intent) it.next();
            if (intent3.getComponent().getClassName().equals("com.android.documentsui.DocumentsActivity")) {
                arrayList.remove(intent3);
                break;
            }
        }
        return arrayList;
    }

    public static boolean b(Context context) {
        boolean z;
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null && strArr.length > 0) {
                int length = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    } else if (strArr[i10].equalsIgnoreCase("android.permission.CAMERA")) {
                        z = true;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        z = false;
        if (!z || context.checkSelfPermission("android.permission.CAMERA") == 0) {
            return false;
        }
        return true;
    }

    public static boolean c(Context context, Uri uri) {
        boolean z;
        if (context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return false;
        }
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                openInputStream.close();
            }
            z = false;
        } catch (Exception unused) {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public static void d(Activity activity) {
        Intent intent;
        Uri uri;
        String string = activity.getString(R.string.pick_image_intent_chooser_title);
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = activity.getPackageManager();
        if (!b(activity)) {
            ArrayList arrayList2 = new ArrayList();
            File externalCacheDir = activity.getExternalCacheDir();
            if (externalCacheDir != null) {
                uri = Uri.fromFile(new File(externalCacheDir.getPath(), "pickImageResult.jpeg"));
            } else {
                uri = null;
            }
            Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
            for (ResolveInfo next : packageManager.queryIntentActivities(intent2, 0)) {
                Intent intent3 = new Intent(intent2);
                ActivityInfo activityInfo = next.activityInfo;
                intent3.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                intent3.setPackage(next.activityInfo.packageName);
                if (uri != null) {
                    intent3.putExtra("output", uri);
                }
                arrayList2.add(intent3);
            }
            arrayList.addAll(arrayList2);
        }
        ArrayList a10 = a(packageManager, "android.intent.action.GET_CONTENT");
        if (a10.size() == 0) {
            a10 = a(packageManager, "android.intent.action.PICK");
        }
        arrayList.addAll(a10);
        if (arrayList.isEmpty()) {
            intent = new Intent();
        } else {
            intent = (Intent) arrayList.get(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
        }
        Intent createChooser = Intent.createChooser(intent, string);
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
        activity.startActivityForResult(createChooser, 200);
    }
}

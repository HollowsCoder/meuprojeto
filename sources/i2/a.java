package i2;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Environment;
import b0.d;
import com.appfab.facematchlive.ui.flow.selector.ActivitySelector;
import java.io.File;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class a {
    public static File a(Activity activity) {
        return File.createTempFile(d.f("JPEG_", new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()), "_"), ".jpg", activity.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
    }

    public static Bitmap b(ActivitySelector activitySelector, Uri uri, String str) {
        int i10;
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i11 = 1;
        options.inJustDecodeBounds = true;
        InputStream openInputStream = activitySelector.getContentResolver().openInputStream(uri);
        Bitmap bitmap = null;
        BitmapFactory.decodeStream(openInputStream, (Rect) null, options);
        openInputStream.close();
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        if (i12 > 1024 || i13 > 1024) {
            float f10 = (float) 1024;
            i11 = Math.min(Math.round(((float) i12) / f10), Math.round(((float) i13) / f10));
            float f11 = (float) (i13 * i12);
            while (f11 / ((float) (i11 * i11)) > ((float) 2097152)) {
                i11++;
            }
        }
        options.inSampleSize = i11;
        options.inJustDecodeBounds = false;
        Bitmap decodeStream = BitmapFactory.decodeStream(activitySelector.getContentResolver().openInputStream(uri), (Rect) null, options);
        int c10 = new s0.a(str).c();
        if (c10 == 3) {
            i10 = 180;
        } else if (c10 == 6) {
            i10 = 90;
        } else if (c10 != 8) {
            return decodeStream;
        } else {
            i10 = 270;
        }
        try {
            Matrix matrix = new Matrix();
            matrix.postRotate((float) i10);
            Bitmap createBitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix, true);
            decodeStream.recycle();
            bitmap = createBitmap;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return bitmap;
    }
}

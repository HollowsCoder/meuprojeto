package i7;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final File f6130a;

    /* renamed from: b  reason: collision with root package name */
    public final File f6131b;

    /* renamed from: c  reason: collision with root package name */
    public final File f6132c;
    public final File d;

    /* renamed from: e  reason: collision with root package name */
    public final File f6133e;

    public e(Context context) {
        File file = new File(context.getFilesDir(), ".com.google.firebase.crashlytics.files.v1");
        b(file);
        this.f6130a = file;
        File file2 = new File(file, "open-sessions");
        b(file2);
        this.f6131b = file2;
        File file3 = new File(file, "reports");
        b(file3);
        this.f6132c = file3;
        File file4 = new File(file, "priority-reports");
        b(file4);
        this.d = file4;
        File file5 = new File(file, "native-reports");
        b(file5);
        this.f6133e = file5;
    }

    public static synchronized void b(File file) {
        synchronized (e.class) {
            if (file.exists()) {
                if (!file.isDirectory()) {
                    String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str, (Throwable) null);
                    }
                    file.delete();
                } else {
                    return;
                }
            }
            if (!file.mkdirs()) {
                throw new IllegalStateException("Could not create Crashlytics-specific directory: " + file);
            }
        }
    }

    public static boolean c(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File c10 : listFiles) {
                c(c10);
            }
        }
        return file.delete();
    }

    public static <T> List<T> d(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    public final File a(String str, String str2) {
        File file = new File(this.f6131b, str);
        file.mkdirs();
        return new File(file, str2);
    }
}

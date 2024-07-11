package androidx.startup;

import a1.a;
import a1.b;
import a1.c;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import com.karumi.dexter.R;
import java.util.HashSet;

public final class InitializationProvider extends ContentProvider {
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    public final boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            if (a.d == null) {
                synchronized (a.f46e) {
                    if (a.d == null) {
                        a.d = new a(context);
                    }
                }
            }
            a aVar = a.d;
            Context context2 = aVar.f49c;
            try {
                Trace.beginSection("Startup");
                Bundle bundle = context2.getPackageManager().getProviderInfo(new ComponentName(context2.getPackageName(), InitializationProvider.class.getName()), 128).metaData;
                String string = context2.getString(R.string.androidx_startup);
                if (bundle != null) {
                    HashSet hashSet = new HashSet();
                    for (String next : bundle.keySet()) {
                        if (string.equals(bundle.getString(next, (String) null))) {
                            Class<?> cls = Class.forName(next);
                            if (b.class.isAssignableFrom(cls)) {
                                aVar.f48b.add(cls);
                                aVar.a(cls, hashSet);
                            }
                        }
                    }
                }
                Trace.endSection();
                return true;
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException e10) {
                throw new c(e10);
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            throw new c("Context cannot be null");
        }
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}

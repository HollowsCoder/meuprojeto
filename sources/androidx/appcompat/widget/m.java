package androidx.appcompat.widget;

import android.content.ContentResolver;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import b8.t;
import com.google.android.gms.internal.clearcut.x;
import com.google.android.gms.internal.measurement.d4;
import com.google.android.gms.internal.measurement.i3;
import com.google.android.gms.internal.measurement.o;
import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.internal.measurement.x3;
import com.google.android.gms.internal.measurement.y;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import d7.h;
import i4.c;
import i4.w;
import i7.e;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Logger;
import m5.a;
import m5.i;
import n.b;
import q2.k;
import r0.a;
import r0.g;
import z2.d;

public final class m implements k, a, y {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f651o;

    /* renamed from: p  reason: collision with root package name */
    public final Object f652p;

    /* renamed from: q  reason: collision with root package name */
    public Object f653q;

    public m() {
        this.f651o = 3;
        this.f652p = new AtomicReference();
        this.f653q = new b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042 A[SYNTHETIC, Splitter:B:15:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047 A[SYNTHETIC, Splitter:B:19:0x0047] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.appcompat.widget.m a(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0035, Error -> 0x0033, OverlappingFileLockException -> 0x0031 }
            java.io.File r5 = r5.getFilesDir()     // Catch:{ IOException -> 0x0035, Error -> 0x0033, OverlappingFileLockException -> 0x0031 }
            r2.<init>(r5, r0)     // Catch:{ IOException -> 0x0035, Error -> 0x0033, OverlappingFileLockException -> 0x0031 }
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0035, Error -> 0x0033, OverlappingFileLockException -> 0x0031 }
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch:{ IOException -> 0x0035, Error -> 0x0033, OverlappingFileLockException -> 0x0031 }
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch:{ IOException -> 0x0035, Error -> 0x0033, OverlappingFileLockException -> 0x0031 }
            java.nio.channels.FileLock r0 = r5.lock()     // Catch:{ IOException -> 0x002d, Error -> 0x002b, OverlappingFileLockException -> 0x0029 }
            androidx.appcompat.widget.m r2 = new androidx.appcompat.widget.m     // Catch:{ IOException -> 0x0027, Error -> 0x0025, OverlappingFileLockException -> 0x0023 }
            r3 = 10
            r2.<init>(r3, r5, r0)     // Catch:{ IOException -> 0x0027, Error -> 0x0025, OverlappingFileLockException -> 0x0023 }
            return r2
        L_0x0023:
            r2 = move-exception
            goto L_0x0039
        L_0x0025:
            r2 = move-exception
            goto L_0x0039
        L_0x0027:
            r2 = move-exception
            goto L_0x0039
        L_0x0029:
            r0 = move-exception
            goto L_0x002e
        L_0x002b:
            r0 = move-exception
            goto L_0x002e
        L_0x002d:
            r0 = move-exception
        L_0x002e:
            r2 = r0
            r0 = r1
            goto L_0x0039
        L_0x0031:
            r5 = move-exception
            goto L_0x0036
        L_0x0033:
            r5 = move-exception
            goto L_0x0036
        L_0x0035:
            r5 = move-exception
        L_0x0036:
            r2 = r5
            r5 = r1
            r0 = r5
        L_0x0039:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L_0x0045
            r0.release()     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            if (r5 == 0) goto L_0x004a
            r5.close()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.m.a(android.content.Context):androidx.appcompat.widget.m");
    }

    public final void b() {
        Object obj = this.f652p;
        try {
            e eVar = (e) this.f653q;
            eVar.getClass();
            new File(eVar.f6130a, (String) obj).createNewFile();
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "Error creating marker: " + ((String) obj), e10);
        }
    }

    public final Object c(i iVar) {
        boolean z;
        switch (this.f651o) {
            case 4:
                c cVar = (c) this.f652p;
                Bundle bundle = (Bundle) this.f653q;
                cVar.getClass();
                if (!iVar.m()) {
                    return iVar;
                }
                Bundle bundle2 = (Bundle) iVar.i();
                if (bundle2 == null || !bundle2.containsKey("google.messenger")) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    return iVar;
                }
                return cVar.a(bundle).n(w.f6112o, h.f4229p);
            default:
                t tVar = (t) this.f652p;
                String str = (String) this.f653q;
                synchronized (tVar) {
                    tVar.f2046b.remove(str);
                }
                return iVar;
        }
    }

    public final boolean d(Object obj, File file, q2.h hVar) {
        return ((k) this.f653q).d(new d(((BitmapDrawable) ((s2.w) obj).get()).getBitmap(), (t2.c) this.f652p), file, hVar);
    }

    public final KeyListener e(KeyListener keyListener) {
        ((r0.a) this.f653q).f8330a.getClass();
        if (keyListener instanceof r0.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return new r0.e(keyListener);
    }

    public final TextClassifier f() {
        Object obj = this.f653q;
        if (((TextClassifier) obj) != null) {
            return (TextClassifier) obj;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) ((TextView) this.f652p).getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public final i3 g(o oVar) {
        i3 c10 = ((i3) this.f652p).c();
        c10.f((String) this.f653q, oVar);
        return c10;
    }

    public final q2.c h(q2.h hVar) {
        return ((k) this.f653q).h(hVar);
    }

    public final void i() {
        Object obj = this.f652p;
        boolean isFocusable = ((EditText) obj).isFocusable();
        int inputType = ((EditText) obj).getInputType();
        ((EditText) obj).setKeyListener(((EditText) obj).getKeyListener());
        ((EditText) obj).setRawInputType(inputType);
        ((EditText) obj).setFocusable(isFocusable);
    }

    /* JADX INFO: finally extract failed */
    public final void j(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = ((EditText) this.f652p).getContext().obtainStyledAttributes(attributeSet, androidx.databinding.a.H, i10, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            m(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final InputConnection k(InputConnection inputConnection, EditorInfo editorInfo) {
        r0.a aVar = (r0.a) this.f653q;
        if (inputConnection == null) {
            aVar.getClass();
            return null;
        }
        a.C0119a aVar2 = aVar.f8330a;
        aVar2.getClass();
        if (inputConnection instanceof r0.c) {
            return inputConnection;
        }
        return new r0.c(aVar2.f8331a, inputConnection, editorInfo);
    }

    public final void l() {
        try {
            ((FileLock) this.f653q).release();
            ((FileChannel) this.f652p).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    public final void m(boolean z) {
        g gVar = ((r0.a) this.f653q).f8330a.f8332b;
        if (gVar.f8352r != z) {
            if (gVar.f8351q != null) {
                androidx.emoji2.text.e a10 = androidx.emoji2.text.e.a();
                g.a aVar = gVar.f8351q;
                a10.getClass();
                s6.a.o(aVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a10.f1040a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a10.f1041b.remove(aVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            gVar.f8352r = z;
            if (z) {
                g.a(gVar.f8349o, androidx.emoji2.text.e.a().b());
            }
        }
    }

    public final Object n() {
        String str;
        String str2 = (String) this.f653q;
        ContentResolver contentResolver = ((d4) this.f652p).f2669a.getContentResolver();
        Uri uri = y3.f2998a;
        synchronized (y3.class) {
            if (y3.f3001e == null) {
                y3.d.set(false);
                y3.f3001e = new HashMap<>();
                y3.f3006j = new Object();
                contentResolver.registerContentObserver(y3.f2998a, true, new x3());
            } else if (y3.d.getAndSet(false)) {
                y3.f3001e.clear();
                y3.f3002f.clear();
                y3.f3003g.clear();
                y3.f3004h.clear();
                y3.f3005i.clear();
                y3.f3006j = new Object();
            }
            Object obj = y3.f3006j;
            str = null;
            if (y3.f3001e.containsKey(str2)) {
                String str3 = y3.f3001e.get(str2);
                if (str3 != null) {
                    str = str3;
                }
            } else {
                int length = y3.f3007k.length;
                Cursor query = contentResolver.query(y3.f2998a, (String[]) null, (String) null, new String[]{str2}, (String) null);
                if (query != null) {
                    try {
                        if (!query.moveToFirst()) {
                            synchronized (y3.class) {
                                if (obj == y3.f3006j) {
                                    y3.f3001e.put(str2, (Object) null);
                                }
                            }
                        } else {
                            String string = query.getString(1);
                            if (string != null && string.equals((Object) null)) {
                                string = null;
                            }
                            synchronized (y3.class) {
                                if (obj == y3.f3006j) {
                                    y3.f3001e.put(str2, string);
                                }
                            }
                            if (string != null) {
                                str = string;
                            }
                        }
                        query.close();
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
            }
        }
        return str;
    }

    public m(int i10) {
        this.f651o = 5;
        byte[] bArr = new byte[i10];
        this.f653q = bArr;
        Logger logger = x.f2576p;
        this.f652p = new x.a(bArr, 0, i10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i10, int i11) {
        this(i10);
        this.f651o = 5;
    }

    public /* synthetic */ m(int i10, Object obj, Object obj2) {
        this.f651o = i10;
        this.f652p = obj;
        this.f653q = obj2;
    }

    public m(EditText editText) {
        this.f651o = 0;
        this.f652p = editText;
        this.f653q = new r0.a(editText);
    }

    public m(TextView textView) {
        this.f651o = 1;
        textView.getClass();
        this.f652p = textView;
    }

    public m(AppMeasurementDynamiteService appMeasurementDynamiteService, t0 t0Var) {
        this.f651o = 8;
        this.f653q = appMeasurementDynamiteService;
        this.f652p = t0Var;
    }
}

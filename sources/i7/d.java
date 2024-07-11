package i7;

import android.util.Log;
import com.karumi.dexter.BuildConfig;
import f7.k;
import g7.a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import k7.c;

public final class d {
    public static final Charset d = Charset.forName("UTF-8");

    /* renamed from: e  reason: collision with root package name */
    public static final int f6123e = 15;

    /* renamed from: f  reason: collision with root package name */
    public static final a f6124f = new a();

    /* renamed from: g  reason: collision with root package name */
    public static final c f6125g = new c();

    /* renamed from: h  reason: collision with root package name */
    public static final a f6126h = new a(1);

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f6127a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    public final e f6128b;

    /* renamed from: c  reason: collision with root package name */
    public final k7.d f6129c;

    public d(e eVar, c cVar) {
        this.f6128b = eVar;
        this.f6129c = cVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String d(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), d);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        throw th;
    }

    public static void e(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        e eVar = this.f6128b;
        arrayList.addAll(e.d(eVar.d.listFiles()));
        arrayList.addAll(e.d(eVar.f6133e.listFiles()));
        c cVar = f6125g;
        Collections.sort(arrayList, cVar);
        List d10 = e.d(eVar.f6132c.listFiles());
        Collections.sort(d10, cVar);
        arrayList.addAll(d10);
        return arrayList;
    }

    public final void c(k kVar, String str, boolean z) {
        String str2;
        e eVar = this.f6128b;
        int i10 = ((c) this.f6129c).f6718h.get().a().f6974a;
        f6124f.getClass();
        q7.d dVar = a.f4992a;
        dVar.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            dVar.a(stringWriter, kVar);
        } catch (IOException unused) {
        }
        String stringWriter2 = stringWriter.toString();
        String format = String.format(Locale.US, "%010d", new Object[]{Integer.valueOf(this.f6127a.getAndIncrement())});
        if (z) {
            str2 = "_";
        } else {
            str2 = BuildConfig.FLAVOR;
        }
        try {
            e(eVar.a(str, b0.d.f("event", format, str2)), stringWriter2);
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e10);
        }
        a aVar = new a(0);
        eVar.getClass();
        File file = new File(eVar.f6131b, str);
        file.mkdirs();
        List<File> d10 = e.d(file.listFiles(aVar));
        Collections.sort(d10, new b());
        int size = d10.size();
        for (File file2 : d10) {
            if (size > i10) {
                e.c(file2);
                size--;
            } else {
                return;
            }
        }
    }
}

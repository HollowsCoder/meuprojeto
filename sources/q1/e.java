package q1;

import com.karumi.dexter.BuildConfig;
import h1.f;
import h1.g;
import h1.r;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import q0.d;
import t1.c;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final d f8214a;

    /* renamed from: b  reason: collision with root package name */
    public final d f8215b;

    public e(d dVar, d dVar2) {
        this.f8214a = dVar;
        this.f8215b = dVar2;
    }

    public final r<f> a(String str, InputStream inputStream, String str2, String str3) {
        b bVar;
        r<f> rVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        boolean contains = str2.contains("application/zip");
        d dVar = this.f8214a;
        if (contains || str.split("\\?")[0].endsWith(".lottie")) {
            c.a();
            bVar = b.ZIP;
            if (str3 == null) {
                rVar = g.f(new ZipInputStream(inputStream), (String) null);
            } else {
                rVar = g.f(new ZipInputStream(new FileInputStream(dVar.e(str, inputStream, bVar))), str);
            }
        } else {
            c.a();
            bVar = b.JSON;
            if (str3 == null) {
                rVar = g.c(inputStream, (String) null);
            } else {
                rVar = g.c(new FileInputStream(new File(dVar.e(str, inputStream, bVar).getAbsolutePath())), str);
            }
        }
        if (!(str3 == null || rVar.f5206a == null)) {
            dVar.getClass();
            File file = new File(dVar.b(), d.a(str, bVar, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", BuildConfig.FLAVOR));
            boolean renameTo = file.renameTo(file2);
            file2.toString();
            c.a();
            if (!renameTo) {
                c.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return rVar;
    }
}

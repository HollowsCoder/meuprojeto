package f8;

import java.io.FileOutputStream;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f4897a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f4898b;

    public /* synthetic */ b(d dVar, e eVar) {
        this.f4897a = dVar;
        this.f4898b = eVar;
    }

    public final Object call() {
        d dVar = this.f4897a;
        e eVar = this.f4898b;
        i iVar = dVar.f4904b;
        synchronized (iVar) {
            FileOutputStream openFileOutput = iVar.f4924a.openFileOutput(iVar.f4925b, 0);
            try {
                openFileOutput.write(eVar.toString().getBytes("UTF-8"));
            } finally {
                openFileOutput.close();
            }
        }
        return null;
    }
}

package androidx.lifecycle;

import com.appfab.facematchlive.data.model.CurrentConfigModel;
import j.a;

public class s<T> extends LiveData<T> {
    public void i(T t10) {
        LiveData.a("setValue");
        this.f1353g++;
        this.f1351e = t10;
        c((LiveData<T>.c) null);
    }

    public final void j(CurrentConfigModel currentConfigModel) {
        boolean z;
        synchronized (this.f1348a) {
            z = this.f1352f == LiveData.f1347k;
            this.f1352f = currentConfigModel;
        }
        if (z) {
            a.E().F(this.f1356j);
        }
    }
}

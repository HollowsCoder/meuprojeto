package e5;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import k4.d;
import n4.f;

public final class c extends f<a> {
    public c(Context context, Looper looper, n4.c cVar, d.a aVar, d.b bVar) {
        super(context, looper, 51, cVar, aVar, bVar);
    }

    public final int f() {
        return 11925000;
    }

    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new b(iBinder);
    }

    public final String v() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    public final String w() {
        return "com.google.android.gms.phenotype.service.START";
    }
}

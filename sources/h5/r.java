package h5;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.measurement.j9;
import java.io.IOException;
import java.util.List;
import m5.a;
import m5.i;

public final /* synthetic */ class r implements r2, a {

    /* renamed from: o  reason: collision with root package name */
    public static final r f5663o = new r();

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ r f5664p = new r();

    public Object c(i iVar) {
        if (iVar.m()) {
            return (Bundle) iVar.i();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(iVar.h());
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Error making request: ");
            sb.append(valueOf);
            Log.d("Rpc", sb.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", iVar.h());
    }

    public Object zza() {
        List<s2<?>> list = u2.f5707a;
        return Integer.valueOf((int) j9.f2758p.zza().t());
    }
}

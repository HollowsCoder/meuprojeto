package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.vision.a1;
import com.google.android.gms.internal.vision.d1;
import com.google.android.gms.internal.vision.o1;
import com.google.android.gms.internal.vision.t;
import h4.a;
import java.io.IOException;
import java.util.logging.Logger;
import n5.c;

@Keep
public class VisionClearcutLogger {
    private final a zza;
    private boolean zzb = true;

    public VisionClearcutLogger(@RecentlyNonNull Context context) {
        this.zza = new a(context);
    }

    public final void zza(int i10, t tVar) {
        d1 d1Var;
        tVar.getClass();
        try {
            int n10 = tVar.n();
            byte[] bArr = new byte[n10];
            Logger logger = a1.f3034p;
            a1.a aVar = new a1.a(bArr, n10);
            tVar.c(aVar);
            if (aVar.E() != 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            } else if (i10 < 0 || i10 > 3) {
                Object[] objArr = {Integer.valueOf(i10)};
                if (Log.isLoggable("Vision", 4)) {
                    Log.i("Vision", String.format("Illegal event code: %d", objArr));
                }
            } else {
                try {
                    if (this.zzb) {
                        a aVar2 = this.zza;
                        aVar2.getClass();
                        a.C0076a aVar3 = new a.C0076a(bArr);
                        aVar3.f5247e.f2376t = i10;
                        aVar3.a();
                        return;
                    }
                    t.a p10 = t.p();
                    try {
                        d1 d1Var2 = d1.f3078c;
                        if (d1Var2 == null) {
                            synchronized (d1.class) {
                                d1Var = d1.f3078c;
                                if (d1Var == null) {
                                    d1Var = o1.a();
                                    d1.f3078c = d1Var;
                                }
                            }
                            d1Var2 = d1Var;
                        }
                        p10.i(bArr, n10, d1Var2);
                        Object[] objArr2 = {p10.toString()};
                        if (Log.isLoggable("Vision", 6)) {
                            Log.e("Vision", String.format("Would have logged:\n%s", objArr2));
                        }
                    } catch (Exception e10) {
                        c.a(e10, "Parsing error", new Object[0]);
                    }
                } catch (Exception e11) {
                    com.google.android.gms.internal.vision.c.f3066a.w(e11);
                    c.a(e11, "Failed to log", new Object[0]);
                }
            }
        } catch (IOException e12) {
            String name = t.class.getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + 10);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e12);
        }
    }
}

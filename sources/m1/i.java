package m1;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.fragment.app.f0;
import b8.h;
import com.google.android.gms.internal.measurement.a7;
import com.google.android.gms.internal.measurement.b;
import com.google.android.gms.internal.measurement.i3;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.o;
import com.google.android.gms.internal.measurement.p;
import com.google.android.gms.internal.measurement.t;
import com.google.android.gms.internal.measurement.u;
import com.google.android.gms.internal.measurement.v;
import com.google.android.gms.internal.measurement.x;
import com.google.android.gms.internal.measurement.y;
import com.google.android.gms.internal.measurement.z;
import h5.c4;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import m5.a;
import r4.g;

public final class i implements y, a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f7055o;

    /* renamed from: p  reason: collision with root package name */
    public Object f7056p;

    /* renamed from: q  reason: collision with root package name */
    public Object f7057q;

    public i(int i10) {
        this.f7055o = i10;
        if (i10 == 2) {
            this.f7056p = new HashMap();
            this.f7057q = new x(1);
            a(new t(0));
            a(new v(0));
            a(new t(1));
            a(new x(0));
            a(new v(1));
            a(new t(2));
            a(new v(2));
        } else if (i10 == 4) {
            this.f7056p = new TreeMap();
            this.f7057q = new TreeMap();
        } else if (i10 == 5) {
            this.f7056p = new ConcurrentHashMap(16, 0.75f, 10);
            this.f7057q = new ReferenceQueue();
        }
    }

    public final void a(u uVar) {
        Iterator it = uVar.f2943a.iterator();
        while (it.hasNext()) {
            ((Map) this.f7056p).put(((z) it.next()).zzb().toString(), uVar);
        }
    }

    public final o b(i3 i3Var, o oVar) {
        u uVar;
        androidx.databinding.a.R(i3Var);
        if (!(oVar instanceof p)) {
            return oVar;
        }
        p pVar = (p) oVar;
        ArrayList<o> arrayList = pVar.f2875p;
        String str = pVar.f2874o;
        if (((Map) this.f7056p).containsKey(str)) {
            uVar = (u) ((Map) this.f7056p).get(str);
        } else {
            uVar = (x) this.f7057q;
        }
        return uVar.a(str, i3Var, arrayList);
    }

    public final Object c(m5.i iVar) {
        Context context = (Context) this.f7056p;
        Intent intent = (Intent) this.f7057q;
        Object obj = h.f2022b;
        if (!g.a() || ((Integer) iVar.i()).intValue() != 402) {
            return iVar;
        }
        return h.a(context, intent).e(b8.g.f2014o, s6.a.w);
    }

    public final void d(i3 i3Var, f0 f0Var) {
        int i10;
        a7 a7Var = new a7(f0Var);
        for (Integer num : ((TreeMap) this.f7056p).keySet()) {
            b a10 = ((b) f0Var.f1152q).clone();
            o a11 = ((n) ((TreeMap) this.f7056p).get(num)).a(i3Var, Collections.singletonList(a7Var));
            if (a11 instanceof com.google.android.gms.internal.measurement.h) {
                i10 = androidx.databinding.a.N(a11.b().doubleValue());
            } else {
                i10 = -1;
            }
            if (i10 == 2 || i10 == -1) {
                f0Var.f1152q = a10;
            }
        }
        for (Integer num2 : ((TreeMap) this.f7057q).keySet()) {
            o a12 = ((n) ((TreeMap) this.f7057q).get(num2)).a(i3Var, Collections.singletonList(a7Var));
            if (a12 instanceof com.google.android.gms.internal.measurement.h) {
                androidx.databinding.a.N(a12.b().doubleValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z10;
        switch (this.f7055o) {
            case 0:
                if (!(obj instanceof h0.b)) {
                    return false;
                }
                h0.b bVar = (h0.b) obj;
                bVar.getClass();
                if (this.f7056p != null) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    return false;
                }
                Object obj2 = this.f7057q;
                bVar.getClass();
                if (obj2 != null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    return true;
                }
                return false;
            default:
                return super.equals(obj);
        }
    }

    public final i3 g(o oVar) {
        ((i3) this.f7056p).f((String) this.f7057q, oVar);
        return (i3) this.f7056p;
    }

    public final int hashCode() {
        int i10;
        switch (this.f7055o) {
            case 0:
                Object obj = this.f7056p;
                int i11 = 0;
                if (obj == null) {
                    i10 = 0;
                } else {
                    i10 = obj.hashCode();
                }
                Object obj2 = this.f7057q;
                if (obj2 != null) {
                    i11 = obj2.hashCode();
                }
                return i10 ^ i11;
            default:
                return super.hashCode();
        }
    }

    public final String toString() {
        switch (this.f7055o) {
            case 0:
                return "Pair{" + String.valueOf(this.f7056p) + " " + String.valueOf(this.f7057q) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ i(int i10, Object obj, Object obj2) {
        this.f7055o = i10;
        this.f7056p = obj;
        this.f7057q = obj2;
    }

    public i(IBinder iBinder) {
        this.f7055o = 1;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f7056p = new Messenger(iBinder);
            this.f7057q = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f7057q = new i4.h(iBinder);
            this.f7056p = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    public i(c4 c4Var, String str) {
        this.f7055o = 6;
        this.f7057q = c4Var;
        this.f7056p = str;
    }

    public i(v7.b bVar) {
        this.f7055o = 8;
        this.f7057q = Collections.synchronizedMap(new HashMap());
        this.f7056p = bVar;
    }
}

package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.g0;
import androidx.fragment.app.n;
import androidx.lifecycle.h;
import com.karumi.dexter.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class y {
    public boolean A;
    public boolean B;
    public ArrayList<a> C;
    public ArrayList<Boolean> D;
    public ArrayList<n> E;
    public b0 F;
    public final g G;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<l> f1308a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f1309b;

    /* renamed from: c  reason: collision with root package name */
    public final f0 f1310c = new f0(0);
    public ArrayList<a> d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<n> f1311e;

    /* renamed from: f  reason: collision with root package name */
    public final w f1312f = new w(this);

    /* renamed from: g  reason: collision with root package name */
    public OnBackPressedDispatcher f1313g;

    /* renamed from: h  reason: collision with root package name */
    public final c f1314h = new c();

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f1315i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, Bundle> f1316j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    public final x f1317k;
    public final CopyOnWriteArrayList<c0> l;

    /* renamed from: m  reason: collision with root package name */
    public int f1318m;

    /* renamed from: n  reason: collision with root package name */
    public v<?> f1319n;

    /* renamed from: o  reason: collision with root package name */
    public androidx.activity.result.c f1320o;

    /* renamed from: p  reason: collision with root package name */
    public n f1321p;

    /* renamed from: q  reason: collision with root package name */
    public n f1322q;

    /* renamed from: r  reason: collision with root package name */
    public final e f1323r;

    /* renamed from: s  reason: collision with root package name */
    public final f f1324s;

    /* renamed from: t  reason: collision with root package name */
    public androidx.activity.result.e f1325t;
    public androidx.activity.result.e u;

    /* renamed from: v  reason: collision with root package name */
    public androidx.activity.result.e f1326v;
    public ArrayDeque<k> w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1327x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1328y;
    public boolean z;

    public class a implements androidx.activity.result.b<androidx.activity.result.a> {
        public a() {
        }

        public final void a(Object obj) {
            StringBuilder sb;
            androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
            y yVar = y.this;
            k pollFirst = yVar.w.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder("No IntentSenders were started for ");
                sb.append(this);
            } else {
                f0 f0Var = yVar.f1310c;
                String str = pollFirst.f1336o;
                n g10 = f0Var.g(str);
                if (g10 == null) {
                    sb = new StringBuilder("Intent Sender result delivered for unknown Fragment ");
                    sb.append(str);
                } else {
                    g10.t(pollFirst.f1337p, aVar.f192o, aVar.f193p);
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    public class b implements androidx.activity.result.b<Map<String, Boolean>> {
        public b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void a(Object obj) {
            StringBuilder sb;
            int i10;
            Map map = (Map) obj;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((Boolean) arrayList.get(i11)).booleanValue()) {
                    i10 = 0;
                } else {
                    i10 = -1;
                }
                iArr[i11] = i10;
            }
            y yVar = y.this;
            k pollFirst = yVar.w.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder("No permissions were requested for ");
                sb.append(this);
            } else {
                f0 f0Var = yVar.f1310c;
                String str = pollFirst.f1336o;
                if (f0Var.g(str) == null) {
                    sb = new StringBuilder("Permission request result delivered for unknown Fragment ");
                    sb.append(str);
                } else {
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    public class c extends androidx.activity.g {
        public c() {
        }

        public final void a() {
            y yVar = y.this;
            yVar.x(true);
            if (yVar.f1314h.f186a) {
                yVar.P();
            } else {
                yVar.f1313g.b();
            }
        }
    }

    public class d {
        public d(y yVar) {
        }
    }

    public class e extends u {
        public e() {
        }

        public final n a(String str) {
            Context context = y.this.f1319n.f1300p;
            Object obj = n.f1229g0;
            try {
                return (n) u.c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (InstantiationException e10) {
                throw new n.c(b0.d.f("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
            } catch (IllegalAccessException e11) {
                throw new n.c(b0.d.f("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
            } catch (NoSuchMethodException e12) {
                throw new n.c(b0.d.f("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
            } catch (InvocationTargetException e13) {
                throw new n.c(b0.d.f("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
            }
        }
    }

    public class f implements q0 {
    }

    public class g implements Runnable {
        public g() {
        }

        public final void run() {
            y.this.x(true);
        }
    }

    public class h implements c0 {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ n f1334o;

        public h(n nVar) {
            this.f1334o = nVar;
        }

        public final void g(n nVar) {
            this.f1334o.v(nVar);
        }
    }

    public class i implements androidx.activity.result.b<androidx.activity.result.a> {
        public i() {
        }

        public final void a(Object obj) {
            StringBuilder sb;
            androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
            y yVar = y.this;
            k pollFirst = yVar.w.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder("No Activities were started for result for ");
                sb.append(this);
            } else {
                f0 f0Var = yVar.f1310c;
                String str = pollFirst.f1336o;
                n g10 = f0Var.g(str);
                if (g10 == null) {
                    sb = new StringBuilder("Activity result delivered for unknown Fragment ");
                    sb.append(str);
                } else {
                    g10.t(pollFirst.f1337p, aVar.f192o, aVar.f193p);
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    public static class j extends c.a<androidx.activity.result.h, androidx.activity.result.a> {
        public final Intent a(ComponentActivity componentActivity, Intent intent) {
            Bundle bundleExtra;
            androidx.activity.result.h hVar = (androidx.activity.result.h) intent;
            Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent3 = hVar.f211p;
            if (!(intent3 == null || (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    hVar = new androidx.activity.result.h(hVar.f210o, (Intent) null, hVar.f212q, hVar.f213r);
                }
            }
            intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", hVar);
            if (y.I(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent2);
            }
            return intent2;
        }

        public final Object c(Intent intent, int i10) {
            return new androidx.activity.result.a(intent, i10);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class k implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: o  reason: collision with root package name */
        public final String f1336o;

        /* renamed from: p  reason: collision with root package name */
        public final int f1337p;

        public class a implements Parcelable.Creator<k> {
            public final Object createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            public final Object[] newArray(int i10) {
                return new k[i10];
            }
        }

        public k(Parcel parcel) {
            this.f1336o = parcel.readString();
            this.f1337p = parcel.readInt();
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f1336o);
            parcel.writeInt(this.f1337p);
        }
    }

    public interface l {
        boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2);
    }

    public class m implements l {

        /* renamed from: a  reason: collision with root package name */
        public final String f1338a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1339b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1340c = 1;

        public m(String str, int i10) {
            this.f1338a = str;
            this.f1339b = i10;
        }

        public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
            n nVar = y.this.f1322q;
            if (nVar != null && this.f1339b < 0 && this.f1338a == null && nVar.j().P()) {
                return false;
            }
            return y.this.Q(arrayList, arrayList2, this.f1338a, this.f1339b, this.f1340c);
        }
    }

    public y() {
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        new d(this);
        this.f1317k = new x(this);
        this.l = new CopyOnWriteArrayList<>();
        this.f1318m = -1;
        this.f1323r = new e();
        this.f1324s = new f();
        this.w = new ArrayDeque<>();
        this.G = new g();
    }

    public static boolean I(int i10) {
        return Log.isLoggable("FragmentManager", i10);
    }

    public static boolean J(n nVar) {
        nVar.getClass();
        Iterator it = nVar.H.f1310c.j().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            n nVar2 = (n) it.next();
            if (nVar2 != null) {
                z10 = J(nVar2);
                continue;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public static boolean K(n nVar) {
        if (nVar == null) {
            return true;
        }
        return nVar.P && (nVar.F == null || K(nVar.I));
    }

    public static boolean L(n nVar) {
        if (nVar == null) {
            return true;
        }
        y yVar = nVar.F;
        if (!nVar.equals(yVar.f1322q) || !L(yVar.f1321p)) {
            return false;
        }
        return true;
    }

    public static void a0(n nVar) {
        if (I(2)) {
            Log.v("FragmentManager", "show: " + nVar);
        }
        if (nVar.M) {
            nVar.M = false;
            nVar.W = !nVar.W;
        }
    }

    public final void A(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
    }

    public final n B(String str) {
        return this.f1310c.f(str);
    }

    public final n C(int i10) {
        f0 f0Var = this.f1310c;
        int size = ((ArrayList) f0Var.f1151p).size();
        while (true) {
            size--;
            if (size >= 0) {
                n nVar = (n) ((ArrayList) f0Var.f1151p).get(size);
                if (nVar != null && nVar.J == i10) {
                    return nVar;
                }
            } else {
                for (e0 e0Var : ((HashMap) f0Var.f1152q).values()) {
                    if (e0Var != null) {
                        n nVar2 = e0Var.f1145c;
                        if (nVar2.J == i10) {
                            return nVar2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final n D(String str) {
        f0 f0Var = this.f1310c;
        if (str != null) {
            int size = ((ArrayList) f0Var.f1151p).size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                n nVar = (n) ((ArrayList) f0Var.f1151p).get(size);
                if (nVar != null && str.equals(nVar.L)) {
                    return nVar;
                }
            }
        }
        if (str != null) {
            for (e0 e0Var : ((HashMap) f0Var.f1152q).values()) {
                if (e0Var != null) {
                    n nVar2 = e0Var.f1145c;
                    if (str.equals(nVar2.L)) {
                        return nVar2;
                    }
                }
            }
        } else {
            f0Var.getClass();
        }
        return null;
    }

    public final ViewGroup E(n nVar) {
        ViewGroup viewGroup = nVar.R;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (nVar.K > 0 && this.f1320o.s()) {
            View o10 = this.f1320o.o(nVar.K);
            if (o10 instanceof ViewGroup) {
                return (ViewGroup) o10;
            }
        }
        return null;
    }

    public final u F() {
        n nVar = this.f1321p;
        return nVar != null ? nVar.F.F() : this.f1323r;
    }

    public final q0 G() {
        n nVar = this.f1321p;
        return nVar != null ? nVar.F.G() : this.f1324s;
    }

    public final void H(n nVar) {
        if (I(2)) {
            Log.v("FragmentManager", "hide: " + nVar);
        }
        if (!nVar.M) {
            nVar.M = true;
            nVar.W = true ^ nVar.W;
            Z(nVar);
        }
    }

    public final boolean M() {
        return this.f1328y || this.z;
    }

    public final void N(int i10, boolean z10) {
        v<?> vVar;
        boolean z11;
        if (this.f1319n == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z10 || i10 != this.f1318m) {
            this.f1318m = i10;
            f0 f0Var = this.f1310c;
            Iterator it = ((ArrayList) f0Var.f1151p).iterator();
            while (it.hasNext()) {
                e0 e0Var = (e0) ((HashMap) f0Var.f1152q).get(((n) it.next()).f1240s);
                if (e0Var != null) {
                    e0Var.k();
                }
            }
            Iterator it2 = ((HashMap) f0Var.f1152q).values().iterator();
            while (true) {
                boolean z12 = false;
                if (!it2.hasNext()) {
                    break;
                }
                e0 e0Var2 = (e0) it2.next();
                if (e0Var2 != null) {
                    e0Var2.k();
                    n nVar = e0Var2.f1145c;
                    if (nVar.z) {
                        if (nVar.E > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            z12 = true;
                        }
                    }
                    if (z12) {
                        f0Var.o(e0Var2);
                    }
                }
            }
            b0();
            if (this.f1327x && (vVar = this.f1319n) != null && this.f1318m == 7) {
                vVar.G();
                this.f1327x = false;
            }
        }
    }

    public final void O() {
        if (this.f1319n != null) {
            this.f1328y = false;
            this.z = false;
            this.F.f1119h = false;
            for (n nVar : this.f1310c.k()) {
                if (nVar != null) {
                    nVar.H.O();
                }
            }
        }
    }

    public final boolean P() {
        x(false);
        w(true);
        n nVar = this.f1322q;
        if (nVar != null && nVar.j().P()) {
            return true;
        }
        boolean Q = Q(this.C, this.D, (String) null, -1, 0);
        if (Q) {
            this.f1309b = true;
            try {
                S(this.C, this.D);
            } finally {
                e();
            }
        }
        c0();
        if (this.B) {
            this.B = false;
            b0();
        }
        this.f1310c.e();
        return Q;
    }

    public final boolean Q(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        ArrayList<a> arrayList3 = this.d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i10 < 0 && (i11 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            int i12 = -1;
            if (str != null || i10 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    a aVar = this.d.get(size2);
                    if ((str != null && str.equals(aVar.f1165i)) || (i10 >= 0 && i10 == aVar.f1097s)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i11 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        a aVar2 = this.d.get(size2);
                        if ((str == null || !str.equals(aVar2.f1165i)) && (i10 < 0 || i10 != aVar2.f1097s)) {
                            break;
                        }
                    }
                }
                i12 = size2;
            }
            if (i12 == this.d.size() - 1) {
                return false;
            }
            for (int size3 = this.d.size() - 1; size3 > i12; size3--) {
                arrayList.add(this.d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public final void R(n nVar) {
        boolean z10;
        if (I(2)) {
            Log.v("FragmentManager", "remove: " + nVar + " nesting=" + nVar.E);
        }
        if (nVar.E > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = !z10;
        if (!nVar.N || z11) {
            f0 f0Var = this.f1310c;
            synchronized (((ArrayList) f0Var.f1151p)) {
                ((ArrayList) f0Var.f1151p).remove(nVar);
            }
            nVar.f1244y = false;
            if (J(nVar)) {
                this.f1327x = true;
            }
            nVar.z = true;
            Z(nVar);
        }
    }

    public final void S(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                A(arrayList, arrayList2);
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i10 < size) {
                    if (!arrayList.get(i10).f1171p) {
                        if (i11 != i10) {
                            z(arrayList, arrayList2, i11, i10);
                        }
                        i11 = i10 + 1;
                        if (arrayList2.get(i10).booleanValue()) {
                            while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f1171p) {
                                i11++;
                            }
                        }
                        z(arrayList, arrayList2, i10, i11);
                        i10 = i11 - 1;
                    }
                    i10++;
                }
                if (i11 != size) {
                    z(arrayList, arrayList2, i11, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public final void T(Parcelable parcelable) {
        x xVar;
        int i10;
        n nVar;
        e0 e0Var;
        if (parcelable != null) {
            a0 a0Var = (a0) parcelable;
            if (a0Var.f1098o != null) {
                f0 f0Var = this.f1310c;
                ((HashMap) f0Var.f1152q).clear();
                Iterator<d0> it = a0Var.f1098o.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    xVar = this.f1317k;
                    if (!hasNext) {
                        break;
                    }
                    d0 next = it.next();
                    if (next != null) {
                        n nVar2 = this.F.f1115c.get(next.f1131p);
                        if (nVar2 != null) {
                            if (I(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + nVar2);
                            }
                            e0Var = new e0(xVar, f0Var, nVar2, next);
                        } else {
                            e0Var = new e0(this.f1317k, this.f1310c, this.f1319n.f1300p.getClassLoader(), F(), next);
                        }
                        n nVar3 = e0Var.f1145c;
                        nVar3.F = this;
                        if (I(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + nVar3.f1240s + "): " + nVar3);
                        }
                        e0Var.m(this.f1319n.f1300p.getClassLoader());
                        f0Var.n(e0Var);
                        e0Var.f1146e = this.f1318m;
                    }
                }
                b0 b0Var = this.F;
                b0Var.getClass();
                Iterator it2 = new ArrayList(b0Var.f1115c.values()).iterator();
                while (true) {
                    i10 = 0;
                    if (!it2.hasNext()) {
                        break;
                    }
                    n nVar4 = (n) it2.next();
                    if (((HashMap) f0Var.f1152q).get(nVar4.f1240s) != null) {
                        i10 = 1;
                    }
                    if (i10 == 0) {
                        if (I(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + nVar4 + " that was not found in the set of active Fragments " + a0Var.f1098o);
                        }
                        this.F.c(nVar4);
                        nVar4.F = this;
                        e0 e0Var2 = new e0(xVar, f0Var, nVar4);
                        e0Var2.f1146e = 1;
                        e0Var2.k();
                        nVar4.z = true;
                        e0Var2.k();
                    }
                }
                ArrayList<String> arrayList = a0Var.f1099p;
                ((ArrayList) f0Var.f1151p).clear();
                if (arrayList != null) {
                    for (String next2 : arrayList) {
                        n f10 = f0Var.f(next2);
                        if (f10 != null) {
                            if (I(2)) {
                                Log.v("FragmentManager", "restoreSaveState: added (" + next2 + "): " + f10);
                            }
                            f0Var.a(f10);
                        } else {
                            throw new IllegalStateException(b0.d.f("No instantiated fragment for (", next2, ")"));
                        }
                    }
                }
                if (a0Var.f1100q != null) {
                    this.d = new ArrayList<>(a0Var.f1100q.length);
                    int i11 = 0;
                    while (true) {
                        b[] bVarArr = a0Var.f1100q;
                        if (i11 >= bVarArr.length) {
                            break;
                        }
                        b bVar = bVarArr[i11];
                        bVar.getClass();
                        a aVar = new a(this);
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            int[] iArr = bVar.f1105o;
                            if (i12 >= iArr.length) {
                                break;
                            }
                            g0.a aVar2 = new g0.a();
                            int i14 = i12 + 1;
                            aVar2.f1172a = iArr[i12];
                            if (I(2)) {
                                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i13 + " base fragment #" + iArr[i14]);
                            }
                            String str = bVar.f1106p.get(i13);
                            if (str != null) {
                                nVar = B(str);
                            } else {
                                nVar = null;
                            }
                            aVar2.f1173b = nVar;
                            aVar2.f1177g = h.c.values()[bVar.f1107q[i13]];
                            aVar2.f1178h = h.c.values()[bVar.f1108r[i13]];
                            int i15 = i14 + 1;
                            int i16 = iArr[i14];
                            aVar2.f1174c = i16;
                            int i17 = i15 + 1;
                            int i18 = iArr[i15];
                            aVar2.d = i18;
                            int i19 = i17 + 1;
                            int i20 = iArr[i17];
                            aVar2.f1175e = i20;
                            int i21 = iArr[i19];
                            aVar2.f1176f = i21;
                            aVar.f1159b = i16;
                            aVar.f1160c = i18;
                            aVar.d = i20;
                            aVar.f1161e = i21;
                            aVar.b(aVar2);
                            i13++;
                            i12 = i19 + 1;
                        }
                        aVar.f1162f = bVar.f1109s;
                        aVar.f1165i = bVar.f1110t;
                        aVar.f1097s = bVar.u;
                        aVar.f1163g = true;
                        aVar.f1166j = bVar.f1111v;
                        aVar.f1167k = bVar.w;
                        aVar.l = bVar.f1112x;
                        aVar.f1168m = bVar.f1113y;
                        aVar.f1169n = bVar.z;
                        aVar.f1170o = bVar.A;
                        aVar.f1171p = bVar.B;
                        aVar.c(1);
                        if (I(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i11 + " (index " + aVar.f1097s + "): " + aVar);
                            PrintWriter printWriter = new PrintWriter(new o0());
                            aVar.g("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.d.add(aVar);
                        i11++;
                    }
                } else {
                    this.d = null;
                }
                this.f1315i.set(a0Var.f1101r);
                String str2 = a0Var.f1102s;
                if (str2 != null) {
                    n B2 = B(str2);
                    this.f1322q = B2;
                    q(B2);
                }
                ArrayList<String> arrayList2 = a0Var.f1103t;
                if (arrayList2 != null) {
                    while (i10 < arrayList2.size()) {
                        Bundle bundle = a0Var.u.get(i10);
                        bundle.setClassLoader(this.f1319n.f1300p.getClassLoader());
                        this.f1316j.put(arrayList2.get(i10), bundle);
                        i10++;
                    }
                }
                this.w = new ArrayDeque<>(a0Var.f1104v);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: androidx.fragment.app.b[]} */
    /* JADX WARNING: type inference failed for: r4v13, types: [android.os.BaseBundle] */
    /* JADX WARNING: type inference failed for: r4v26 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.fragment.app.a0 U() {
        /*
            r11 = this;
            java.util.HashSet r0 = r11.f()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x001f
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.p0 r1 = (androidx.fragment.app.p0) r1
            boolean r3 = r1.f1269e
            if (r3 == 0) goto L_0x0008
            r1.f1269e = r2
            r1.c()
            goto L_0x0008
        L_0x001f:
            java.util.HashSet r0 = r11.f()
            java.util.Iterator r0 = r0.iterator()
        L_0x0027:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0037
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.p0 r1 = (androidx.fragment.app.p0) r1
            r1.e()
            goto L_0x0027
        L_0x0037:
            r0 = 1
            r11.x(r0)
            r11.f1328y = r0
            androidx.fragment.app.b0 r1 = r11.F
            r1.f1119h = r0
            androidx.fragment.app.f0 r0 = r11.f1310c
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.lang.Object r3 = r0.f1152q
            java.util.HashMap r3 = (java.util.HashMap) r3
            int r3 = r3.size()
            r1.<init>(r3)
            java.lang.Object r0 = r0.f1152q
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x005f:
            boolean r3 = r0.hasNext()
            r4 = 0
            r5 = 2
            if (r3 == 0) goto L_0x0136
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.e0 r3 = (androidx.fragment.app.e0) r3
            if (r3 == 0) goto L_0x005f
            androidx.fragment.app.d0 r6 = new androidx.fragment.app.d0
            androidx.fragment.app.n r7 = r3.f1145c
            r6.<init>((androidx.fragment.app.n) r7)
            int r8 = r7.f1236o
            r9 = -1
            if (r8 <= r9) goto L_0x010a
            android.os.Bundle r8 = r6.A
            if (r8 != 0) goto L_0x010a
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            r7.F(r8)
            androidx.savedstate.b r9 = r7.f1234e0
            r9.b(r8)
            androidx.fragment.app.z r9 = r7.H
            androidx.fragment.app.a0 r9 = r9.U()
            if (r9 == 0) goto L_0x0099
            java.lang.String r10 = "android:support:fragments"
            r8.putParcelable(r10, r9)
        L_0x0099:
            androidx.fragment.app.x r9 = r3.f1143a
            r9.j(r2)
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x00a5
            goto L_0x00a6
        L_0x00a5:
            r4 = r8
        L_0x00a6:
            android.view.View r8 = r7.S
            if (r8 == 0) goto L_0x00ad
            r3.o()
        L_0x00ad:
            android.util.SparseArray<android.os.Parcelable> r3 = r7.f1238q
            if (r3 == 0) goto L_0x00c0
            if (r4 != 0) goto L_0x00b9
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r4 = r3
        L_0x00b9:
            java.lang.String r3 = "android:view_state"
            android.util.SparseArray<android.os.Parcelable> r8 = r7.f1238q
            r4.putSparseParcelableArray(r3, r8)
        L_0x00c0:
            android.os.Bundle r3 = r7.f1239r
            if (r3 == 0) goto L_0x00d3
            if (r4 != 0) goto L_0x00cc
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r4 = r3
        L_0x00cc:
            java.lang.String r3 = "android:view_registry_state"
            android.os.Bundle r8 = r7.f1239r
            r4.putBundle(r3, r8)
        L_0x00d3:
            boolean r3 = r7.U
            if (r3 != 0) goto L_0x00e6
            if (r4 != 0) goto L_0x00df
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r4 = r3
        L_0x00df:
            java.lang.String r3 = "android:user_visible_hint"
            boolean r8 = r7.U
            r4.putBoolean(r3, r8)
        L_0x00e6:
            r6.A = r4
            java.lang.String r3 = r7.f1242v
            if (r3 == 0) goto L_0x010e
            if (r4 != 0) goto L_0x00f5
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r6.A = r3
        L_0x00f5:
            android.os.Bundle r3 = r6.A
            java.lang.String r4 = "android:target_state"
            java.lang.String r8 = r7.f1242v
            r3.putString(r4, r8)
            int r3 = r7.w
            if (r3 == 0) goto L_0x010e
            android.os.Bundle r4 = r6.A
            java.lang.String r8 = "android:target_req_state"
            r4.putInt(r8, r3)
            goto L_0x010e
        L_0x010a:
            android.os.Bundle r3 = r7.f1237p
            r6.A = r3
        L_0x010e:
            r1.add(r6)
            boolean r3 = I(r5)
            if (r3 == 0) goto L_0x005f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Saved state of "
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r4 = ": "
            r3.append(r4)
            android.os.Bundle r4 = r6.A
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "FragmentManager"
            android.util.Log.v(r4, r3)
            goto L_0x005f
        L_0x0136:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x014a
            boolean r0 = I(r5)
            if (r0 == 0) goto L_0x0149
            java.lang.String r0 = "FragmentManager"
            java.lang.String r1 = "saveAllState: no fragments!"
            android.util.Log.v(r0, r1)
        L_0x0149:
            return r4
        L_0x014a:
            androidx.fragment.app.f0 r0 = r11.f1310c
            java.lang.Object r3 = r0.f1151p
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            monitor-enter(r3)
            java.lang.Object r6 = r0.f1151p     // Catch:{ all -> 0x022e }
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ all -> 0x022e }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x022e }
            if (r6 == 0) goto L_0x015e
            monitor-exit(r3)     // Catch:{ all -> 0x022e }
            r6 = r4
            goto L_0x01ac
        L_0x015e:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x022e }
            java.lang.Object r7 = r0.f1151p     // Catch:{ all -> 0x022e }
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ all -> 0x022e }
            int r7 = r7.size()     // Catch:{ all -> 0x022e }
            r6.<init>(r7)     // Catch:{ all -> 0x022e }
            java.lang.Object r0 = r0.f1151p     // Catch:{ all -> 0x022e }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x022e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x022e }
        L_0x0173:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x022e }
            if (r7 == 0) goto L_0x01ab
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x022e }
            androidx.fragment.app.n r7 = (androidx.fragment.app.n) r7     // Catch:{ all -> 0x022e }
            java.lang.String r8 = r7.f1240s     // Catch:{ all -> 0x022e }
            r6.add(r8)     // Catch:{ all -> 0x022e }
            boolean r8 = I(r5)     // Catch:{ all -> 0x022e }
            if (r8 == 0) goto L_0x0173
            java.lang.String r8 = "FragmentManager"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x022e }
            r9.<init>()     // Catch:{ all -> 0x022e }
            java.lang.String r10 = "saveAllState: adding fragment ("
            r9.append(r10)     // Catch:{ all -> 0x022e }
            java.lang.String r10 = r7.f1240s     // Catch:{ all -> 0x022e }
            r9.append(r10)     // Catch:{ all -> 0x022e }
            java.lang.String r10 = "): "
            r9.append(r10)     // Catch:{ all -> 0x022e }
            r9.append(r7)     // Catch:{ all -> 0x022e }
            java.lang.String r7 = r9.toString()     // Catch:{ all -> 0x022e }
            android.util.Log.v(r8, r7)     // Catch:{ all -> 0x022e }
            goto L_0x0173
        L_0x01ab:
            monitor-exit(r3)     // Catch:{ all -> 0x022e }
        L_0x01ac:
            java.util.ArrayList<androidx.fragment.app.a> r0 = r11.d
            if (r0 == 0) goto L_0x01f3
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01f3
            androidx.fragment.app.b[] r4 = new androidx.fragment.app.b[r0]
        L_0x01b8:
            if (r2 >= r0) goto L_0x01f3
            androidx.fragment.app.b r3 = new androidx.fragment.app.b
            java.util.ArrayList<androidx.fragment.app.a> r7 = r11.d
            java.lang.Object r7 = r7.get(r2)
            androidx.fragment.app.a r7 = (androidx.fragment.app.a) r7
            r3.<init>((androidx.fragment.app.a) r7)
            r4[r2] = r3
            boolean r3 = I(r5)
            if (r3 == 0) goto L_0x01f0
            java.lang.String r3 = "FragmentManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "saveAllState: adding back stack #"
            r7.<init>(r8)
            r7.append(r2)
            java.lang.String r8 = ": "
            r7.append(r8)
            java.util.ArrayList<androidx.fragment.app.a> r8 = r11.d
            java.lang.Object r8 = r8.get(r2)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r3, r7)
        L_0x01f0:
            int r2 = r2 + 1
            goto L_0x01b8
        L_0x01f3:
            androidx.fragment.app.a0 r0 = new androidx.fragment.app.a0
            r0.<init>()
            r0.f1098o = r1
            r0.f1099p = r6
            r0.f1100q = r4
            java.util.concurrent.atomic.AtomicInteger r1 = r11.f1315i
            int r1 = r1.get()
            r0.f1101r = r1
            androidx.fragment.app.n r1 = r11.f1322q
            if (r1 == 0) goto L_0x020e
            java.lang.String r1 = r1.f1240s
            r0.f1102s = r1
        L_0x020e:
            java.util.ArrayList<java.lang.String> r1 = r0.f1103t
            java.util.Map<java.lang.String, android.os.Bundle> r2 = r11.f1316j
            java.util.Set r2 = r2.keySet()
            r1.addAll(r2)
            java.util.ArrayList<android.os.Bundle> r1 = r0.u
            java.util.Map<java.lang.String, android.os.Bundle> r2 = r11.f1316j
            java.util.Collection r2 = r2.values()
            r1.addAll(r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.ArrayDeque<androidx.fragment.app.y$k> r2 = r11.w
            r1.<init>(r2)
            r0.f1104v = r1
            return r0
        L_0x022e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x022e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.y.U():androidx.fragment.app.a0");
    }

    public final void V() {
        synchronized (this.f1308a) {
            boolean z10 = true;
            if (this.f1308a.size() != 1) {
                z10 = false;
            }
            if (z10) {
                this.f1319n.f1301q.removeCallbacks(this.G);
                this.f1319n.f1301q.post(this.G);
                c0();
            }
        }
    }

    public final void W(n nVar, boolean z10) {
        ViewGroup E2 = E(nVar);
        if (E2 != null && (E2 instanceof s)) {
            ((s) E2).setDrawDisappearingViewsLast(!z10);
        }
    }

    public final void X(n nVar, h.c cVar) {
        if (!nVar.equals(B(nVar.f1240s)) || !(nVar.G == null || nVar.F == this)) {
            throw new IllegalArgumentException("Fragment " + nVar + " is not an active fragment of FragmentManager " + this);
        }
        nVar.Z = cVar;
    }

    public final void Y(n nVar) {
        if (nVar == null || (nVar.equals(B(nVar.f1240s)) && (nVar.G == null || nVar.F == this))) {
            n nVar2 = this.f1322q;
            this.f1322q = nVar;
            q(nVar2);
            q(this.f1322q);
            return;
        }
        throw new IllegalArgumentException("Fragment " + nVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void Z(n nVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        ViewGroup E2 = E(nVar);
        if (E2 != null) {
            n.b bVar = nVar.V;
            boolean z10 = false;
            if (bVar == null) {
                i10 = 0;
            } else {
                i10 = bVar.f1247b;
            }
            if (bVar == null) {
                i11 = 0;
            } else {
                i11 = bVar.f1248c;
            }
            int i14 = i11 + i10;
            if (bVar == null) {
                i12 = 0;
            } else {
                i12 = bVar.d;
            }
            int i15 = i12 + i14;
            if (bVar == null) {
                i13 = 0;
            } else {
                i13 = bVar.f1249e;
            }
            if (i13 + i15 > 0) {
                if (E2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    E2.setTag(R.id.visible_removing_fragment_view_tag, nVar);
                }
                n nVar2 = (n) E2.getTag(R.id.visible_removing_fragment_view_tag);
                n.b bVar2 = nVar.V;
                if (bVar2 != null) {
                    z10 = bVar2.f1246a;
                }
                if (nVar2.V != null) {
                    nVar2.h().f1246a = z10;
                }
            }
        }
    }

    public final e0 a(n nVar) {
        if (I(2)) {
            Log.v("FragmentManager", "add: " + nVar);
        }
        e0 g10 = g(nVar);
        nVar.F = this;
        f0 f0Var = this.f1310c;
        f0Var.n(g10);
        if (!nVar.N) {
            f0Var.a(nVar);
            nVar.z = false;
            if (nVar.S == null) {
                nVar.W = false;
            }
            if (J(nVar)) {
                this.f1327x = true;
            }
        }
        return g10;
    }

    public final void b(c0 c0Var) {
        this.l.add(c0Var);
    }

    public final void b0() {
        Iterator it = this.f1310c.h().iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            n nVar = e0Var.f1145c;
            if (nVar.T) {
                if (this.f1309b) {
                    this.B = true;
                } else {
                    nVar.T = false;
                    e0Var.k();
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: androidx.activity.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: androidx.fragment.app.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: androidx.fragment.app.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: androidx.fragment.app.n} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.fragment.app.v<?> r3, androidx.activity.result.c r4, androidx.fragment.app.n r5) {
        /*
            r2 = this;
            androidx.fragment.app.v<?> r0 = r2.f1319n
            if (r0 != 0) goto L_0x00f0
            r2.f1319n = r3
            r2.f1320o = r4
            r2.f1321p = r5
            if (r5 == 0) goto L_0x0012
            androidx.fragment.app.y$h r4 = new androidx.fragment.app.y$h
            r4.<init>(r5)
            goto L_0x0019
        L_0x0012:
            boolean r4 = r3 instanceof androidx.fragment.app.c0
            if (r4 == 0) goto L_0x001c
            r4 = r3
            androidx.fragment.app.c0 r4 = (androidx.fragment.app.c0) r4
        L_0x0019:
            r2.b(r4)
        L_0x001c:
            androidx.fragment.app.n r4 = r2.f1321p
            if (r4 == 0) goto L_0x0023
            r2.c0()
        L_0x0023:
            boolean r4 = r3 instanceof androidx.activity.h
            if (r4 == 0) goto L_0x0038
            r4 = r3
            androidx.activity.h r4 = (androidx.activity.h) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.b()
            r2.f1313g = r0
            if (r5 == 0) goto L_0x0033
            r4 = r5
        L_0x0033:
            androidx.fragment.app.y$c r1 = r2.f1314h
            r0.a(r4, r1)
        L_0x0038:
            if (r5 == 0) goto L_0x0059
            androidx.fragment.app.y r3 = r5.F
            androidx.fragment.app.b0 r3 = r3.F
            java.util.HashMap<java.lang.String, androidx.fragment.app.b0> r4 = r3.d
            java.lang.String r0 = r5.f1240s
            java.lang.Object r0 = r4.get(r0)
            androidx.fragment.app.b0 r0 = (androidx.fragment.app.b0) r0
            if (r0 != 0) goto L_0x0056
            androidx.fragment.app.b0 r0 = new androidx.fragment.app.b0
            boolean r3 = r3.f1117f
            r0.<init>(r3)
            java.lang.String r3 = r5.f1240s
            r4.put(r3, r0)
        L_0x0056:
            r2.F = r0
            goto L_0x007b
        L_0x0059:
            boolean r4 = r3 instanceof androidx.lifecycle.d0
            if (r4 == 0) goto L_0x0073
            androidx.lifecycle.d0 r3 = (androidx.lifecycle.d0) r3
            androidx.lifecycle.c0 r3 = r3.n()
            androidx.lifecycle.b0 r4 = new androidx.lifecycle.b0
            androidx.fragment.app.b0$a r0 = androidx.fragment.app.b0.f1114i
            r4.<init>(r3, r0)
            java.lang.Class<androidx.fragment.app.b0> r3 = androidx.fragment.app.b0.class
            androidx.lifecycle.a0 r3 = r4.a(r3)
            androidx.fragment.app.b0 r3 = (androidx.fragment.app.b0) r3
            goto L_0x0079
        L_0x0073:
            androidx.fragment.app.b0 r3 = new androidx.fragment.app.b0
            r4 = 0
            r3.<init>(r4)
        L_0x0079:
            r2.F = r3
        L_0x007b:
            androidx.fragment.app.b0 r3 = r2.F
            boolean r4 = r2.M()
            r3.f1119h = r4
            androidx.fragment.app.b0 r3 = r2.F
            androidx.fragment.app.f0 r4 = r2.f1310c
            r4.f1153r = r3
            androidx.fragment.app.v<?> r3 = r2.f1319n
            boolean r4 = r3 instanceof androidx.activity.result.g
            if (r4 == 0) goto L_0x00ef
            androidx.activity.result.g r3 = (androidx.activity.result.g) r3
            androidx.activity.result.f r3 = r3.l()
            if (r5 == 0) goto L_0x00a5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r5.f1240s
            java.lang.String r0 = ":"
            java.lang.String r4 = b0.d.g(r4, r5, r0)
            goto L_0x00a7
        L_0x00a5:
            java.lang.String r4 = ""
        L_0x00a7:
            java.lang.String r5 = "FragmentManager:"
            java.lang.String r4 = androidx.appcompat.widget.x0.e(r5, r4)
            java.lang.String r5 = "StartActivityForResult"
            java.lang.String r5 = b0.d.e(r4, r5)
            c.c r0 = new c.c
            r0.<init>()
            androidx.fragment.app.y$i r1 = new androidx.fragment.app.y$i
            r1.<init>()
            androidx.activity.result.e r5 = r3.d(r5, r0, r1)
            r2.f1325t = r5
            java.lang.String r5 = "StartIntentSenderForResult"
            java.lang.String r5 = b0.d.e(r4, r5)
            androidx.fragment.app.y$j r0 = new androidx.fragment.app.y$j
            r0.<init>()
            androidx.fragment.app.y$a r1 = new androidx.fragment.app.y$a
            r1.<init>()
            androidx.activity.result.e r5 = r3.d(r5, r0, r1)
            r2.u = r5
            java.lang.String r5 = "RequestPermissions"
            java.lang.String r4 = b0.d.e(r4, r5)
            c.b r5 = new c.b
            r5.<init>()
            androidx.fragment.app.y$b r0 = new androidx.fragment.app.y$b
            r0.<init>()
            androidx.activity.result.e r3 = r3.d(r4, r5, r0)
            r2.f1326v = r3
        L_0x00ef:
            return
        L_0x00f0:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.y.c(androidx.fragment.app.v, androidx.activity.result.c, androidx.fragment.app.n):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r1 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r1 = r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r1 <= 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (L(r4.f1321p) == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r0.f186a = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r0 = r4.f1314h;
        r1 = r4.d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c0() {
        /*
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.y$l> r0 = r4.f1308a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.y$l> r1 = r4.f1308a     // Catch:{ all -> 0x002f }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002f }
            r2 = 1
            if (r1 != 0) goto L_0x0012
            androidx.fragment.app.y$c r1 = r4.f1314h     // Catch:{ all -> 0x002f }
            r1.f186a = r2     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            androidx.fragment.app.y$c r0 = r4.f1314h
            java.util.ArrayList<androidx.fragment.app.a> r1 = r4.d
            r3 = 0
            if (r1 == 0) goto L_0x001f
            int r1 = r1.size()
            goto L_0x0020
        L_0x001f:
            r1 = r3
        L_0x0020:
            if (r1 <= 0) goto L_0x002b
            androidx.fragment.app.n r1 = r4.f1321p
            boolean r1 = L(r1)
            if (r1 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r2 = r3
        L_0x002c:
            r0.f186a = r2
            return
        L_0x002f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.y.c0():void");
    }

    public final void d(n nVar) {
        if (I(2)) {
            Log.v("FragmentManager", "attach: " + nVar);
        }
        if (nVar.N) {
            nVar.N = false;
            if (!nVar.f1244y) {
                this.f1310c.a(nVar);
                if (I(2)) {
                    Log.v("FragmentManager", "add from attach: " + nVar);
                }
                if (J(nVar)) {
                    this.f1327x = true;
                }
            }
        }
    }

    public final void e() {
        this.f1309b = false;
        this.D.clear();
        this.C.clear();
    }

    public final HashSet f() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f1310c.h().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((e0) it.next()).f1145c.R;
            if (viewGroup != null) {
                hashSet.add(p0.f(viewGroup, G()));
            }
        }
        return hashSet;
    }

    public final e0 g(n nVar) {
        String str = nVar.f1240s;
        f0 f0Var = this.f1310c;
        e0 e0Var = (e0) ((HashMap) f0Var.f1152q).get(str);
        if (e0Var != null) {
            return e0Var;
        }
        e0 e0Var2 = new e0(this.f1317k, f0Var, nVar);
        e0Var2.m(this.f1319n.f1300p.getClassLoader());
        e0Var2.f1146e = this.f1318m;
        return e0Var2;
    }

    public final void h(n nVar) {
        if (I(2)) {
            Log.v("FragmentManager", "detach: " + nVar);
        }
        if (!nVar.N) {
            nVar.N = true;
            if (nVar.f1244y) {
                if (I(2)) {
                    Log.v("FragmentManager", "remove from detach: " + nVar);
                }
                f0 f0Var = this.f1310c;
                synchronized (((ArrayList) f0Var.f1151p)) {
                    ((ArrayList) f0Var.f1151p).remove(nVar);
                }
                nVar.f1244y = false;
                if (J(nVar)) {
                    this.f1327x = true;
                }
                Z(nVar);
            }
        }
    }

    public final void i(Configuration configuration) {
        for (n nVar : this.f1310c.k()) {
            if (nVar != null) {
                nVar.onConfigurationChanged(configuration);
                nVar.H.i(configuration);
            }
        }
    }

    public final boolean j() {
        boolean z10;
        if (this.f1318m < 1) {
            return false;
        }
        for (n nVar : this.f1310c.k()) {
            if (nVar != null) {
                if (!nVar.M) {
                    z10 = nVar.H.j();
                } else {
                    z10 = false;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean k() {
        boolean z10;
        if (this.f1318m < 1) {
            return false;
        }
        ArrayList<n> arrayList = null;
        boolean z11 = false;
        for (n nVar : this.f1310c.k()) {
            if (nVar != null && K(nVar)) {
                if (!nVar.M) {
                    z10 = nVar.H.k() | false;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(nVar);
                    z11 = true;
                }
            }
        }
        if (this.f1311e != null) {
            for (int i10 = 0; i10 < this.f1311e.size(); i10++) {
                n nVar2 = this.f1311e.get(i10);
                if (arrayList == null || !arrayList.contains(nVar2)) {
                    nVar2.getClass();
                }
            }
        }
        this.f1311e = arrayList;
        return z11;
    }

    public final void l() {
        this.A = true;
        x(true);
        Iterator it = f().iterator();
        while (it.hasNext()) {
            ((p0) it.next()).e();
        }
        t(-1);
        this.f1319n = null;
        this.f1320o = null;
        this.f1321p = null;
        if (this.f1313g != null) {
            Iterator<androidx.activity.a> it2 = this.f1314h.f187b.iterator();
            while (it2.hasNext()) {
                it2.next().cancel();
            }
            this.f1313g = null;
        }
        androidx.activity.result.e eVar = this.f1325t;
        if (eVar != null) {
            eVar.f198p.f(eVar.f197o);
            androidx.activity.result.e eVar2 = this.u;
            eVar2.f198p.f(eVar2.f197o);
            androidx.activity.result.e eVar3 = this.f1326v;
            eVar3.f198p.f(eVar3.f197o);
        }
    }

    public final void m() {
        for (n nVar : this.f1310c.k()) {
            if (nVar != null) {
                nVar.M();
            }
        }
    }

    public final void n(boolean z10) {
        for (n nVar : this.f1310c.k()) {
            if (nVar != null) {
                nVar.N(z10);
            }
        }
    }

    public final boolean o() {
        boolean z10;
        if (this.f1318m < 1) {
            return false;
        }
        for (n nVar : this.f1310c.k()) {
            if (nVar != null) {
                if (!nVar.M) {
                    z10 = nVar.H.o();
                } else {
                    z10 = false;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f1318m >= 1) {
            for (n nVar : this.f1310c.k()) {
                if (nVar != null && !nVar.M) {
                    nVar.H.p();
                }
            }
        }
    }

    public final void q(n nVar) {
        if (nVar != null && nVar.equals(B(nVar.f1240s))) {
            nVar.F.getClass();
            boolean L = L(nVar);
            Boolean bool = nVar.f1243x;
            if (bool == null || bool.booleanValue() != L) {
                nVar.f1243x = Boolean.valueOf(L);
                nVar.D(L);
                z zVar = nVar.H;
                zVar.c0();
                zVar.q(zVar.f1322q);
            }
        }
    }

    public final void r(boolean z10) {
        for (n nVar : this.f1310c.k()) {
            if (nVar != null) {
                nVar.O(z10);
            }
        }
    }

    public final boolean s() {
        boolean z10 = false;
        if (this.f1318m < 1) {
            return false;
        }
        for (n nVar : this.f1310c.k()) {
            if (nVar != null && K(nVar) && nVar.P()) {
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX INFO: finally extract failed */
    public final void t(int i10) {
        try {
            this.f1309b = true;
            for (e0 e0Var : ((HashMap) this.f1310c.f1152q).values()) {
                if (e0Var != null) {
                    e0Var.f1146e = i10;
                }
            }
            N(i10, false);
            Iterator it = f().iterator();
            while (it.hasNext()) {
                ((p0) it.next()).e();
            }
            this.f1309b = false;
            x(true);
        } catch (Throwable th) {
            this.f1309b = false;
            throw th;
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        n nVar = this.f1321p;
        if (nVar != null) {
            sb.append(nVar.getClass().getSimpleName());
            sb.append("{");
            obj = this.f1321p;
        } else {
            v<?> vVar = this.f1319n;
            if (vVar != null) {
                sb.append(vVar.getClass().getSimpleName());
                sb.append("{");
                obj = this.f1319n;
            } else {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String e10 = b0.d.e(str, "    ");
        f0 f0Var = this.f1310c;
        f0Var.getClass();
        String str2 = str + "    ";
        if (!((HashMap) f0Var.f1152q).isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (e0 e0Var : ((HashMap) f0Var.f1152q).values()) {
                printWriter.print(str);
                if (e0Var != null) {
                    n nVar = e0Var.f1145c;
                    printWriter.println(nVar);
                    nVar.g(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = ((ArrayList) f0Var.f1151p).size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size3; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(((n) ((ArrayList) f0Var.f1151p).get(i10)).toString());
            }
        }
        ArrayList<n> arrayList = this.f1311e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size2; i11++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(this.f1311e.get(i11).toString());
            }
        }
        ArrayList<a> arrayList2 = this.d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size; i12++) {
                a aVar = this.d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.g(e10, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1315i.get());
        synchronized (this.f1308a) {
            int size4 = this.f1308a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i13 = 0; i13 < size4; i13++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i13);
                    printWriter.print(": ");
                    printWriter.println(this.f1308a.get(i13));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1319n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1320o);
        if (this.f1321p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1321p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1318m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1328y);
        printWriter.print(" mStopped=");
        printWriter.print(this.z);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.A);
        if (this.f1327x) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1327x);
        }
    }

    public final void v(l lVar, boolean z10) {
        if (!z10) {
            if (this.f1319n == null) {
                if (this.A) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (M()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1308a) {
            if (this.f1319n != null) {
                this.f1308a.add(lVar);
                V();
            } else if (!z10) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public final void w(boolean z10) {
        if (this.f1309b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f1319n == null) {
            if (this.A) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.f1319n.f1301q.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (z10 || !M()) {
            if (this.C == null) {
                this.C = new ArrayList<>();
                this.D = new ArrayList<>();
            }
            this.f1309b = false;
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public final boolean x(boolean z10) {
        boolean z11;
        w(z10);
        boolean z12 = false;
        while (true) {
            ArrayList<a> arrayList = this.C;
            ArrayList<Boolean> arrayList2 = this.D;
            synchronized (this.f1308a) {
                if (this.f1308a.isEmpty()) {
                    z11 = false;
                } else {
                    int size = this.f1308a.size();
                    z11 = false;
                    for (int i10 = 0; i10 < size; i10++) {
                        z11 |= this.f1308a.get(i10).a(arrayList, arrayList2);
                    }
                    this.f1308a.clear();
                    this.f1319n.f1301q.removeCallbacks(this.G);
                }
            }
            if (z11) {
                z12 = true;
                this.f1309b = true;
                try {
                    S(this.C, this.D);
                } finally {
                    e();
                }
            } else {
                c0();
                if (this.B) {
                    this.B = false;
                    b0();
                }
                this.f1310c.e();
                return z12;
            }
        }
        while (true) {
        }
    }

    /* JADX INFO: finally extract failed */
    public final void y(a aVar, boolean z10) {
        if (!z10 || (this.f1319n != null && !this.A)) {
            w(z10);
            aVar.a(this.C, this.D);
            this.f1309b = true;
            try {
                S(this.C, this.D);
                e();
                c0();
                if (this.B) {
                    this.B = false;
                    b0();
                }
                this.f1310c.e();
            } catch (Throwable th) {
                e();
                throw th;
            }
        }
    }

    public final void z(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        ViewGroup viewGroup;
        f0 f0Var;
        f0 f0Var2;
        f0 f0Var3;
        int i12;
        ArrayList<a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i13 = i10;
        int i14 = i11;
        boolean z10 = arrayList3.get(i13).f1171p;
        ArrayList<n> arrayList5 = this.E;
        if (arrayList5 == null) {
            this.E = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        ArrayList<n> arrayList6 = this.E;
        f0 f0Var4 = this.f1310c;
        arrayList6.addAll(f0Var4.k());
        n nVar = this.f1322q;
        int i15 = i13;
        boolean z11 = false;
        while (true) {
            int i16 = 1;
            if (i15 < i14) {
                a aVar = arrayList3.get(i15);
                if (!arrayList4.get(i15).booleanValue()) {
                    ArrayList<n> arrayList7 = this.E;
                    int i17 = 0;
                    while (true) {
                        ArrayList<g0.a> arrayList8 = aVar.f1158a;
                        if (i17 < arrayList8.size()) {
                            g0.a aVar2 = arrayList8.get(i17);
                            int i18 = aVar2.f1172a;
                            if (i18 != i16) {
                                if (i18 != 2) {
                                    if (i18 == 3 || i18 == 6) {
                                        arrayList7.remove(aVar2.f1173b);
                                        n nVar2 = aVar2.f1173b;
                                        if (nVar2 == nVar) {
                                            arrayList8.add(i17, new g0.a(9, nVar2));
                                            i17++;
                                            f0Var3 = f0Var4;
                                            i12 = 1;
                                            nVar = null;
                                        }
                                    } else if (i18 == 7) {
                                        f0Var3 = f0Var4;
                                        i12 = 1;
                                    } else if (i18 == 8) {
                                        arrayList8.add(i17, new g0.a(9, nVar));
                                        i17++;
                                        nVar = aVar2.f1173b;
                                    }
                                    f0Var3 = f0Var4;
                                    i12 = 1;
                                } else {
                                    n nVar3 = aVar2.f1173b;
                                    int i19 = nVar3.K;
                                    int size = arrayList7.size() - 1;
                                    boolean z12 = false;
                                    while (size >= 0) {
                                        f0 f0Var5 = f0Var4;
                                        n nVar4 = arrayList7.get(size);
                                        if (nVar4.K == i19) {
                                            if (nVar4 == nVar3) {
                                                z12 = true;
                                            } else {
                                                if (nVar4 == nVar) {
                                                    arrayList8.add(i17, new g0.a(9, nVar4));
                                                    i17++;
                                                    nVar = null;
                                                }
                                                g0.a aVar3 = new g0.a(3, nVar4);
                                                aVar3.f1174c = aVar2.f1174c;
                                                aVar3.f1175e = aVar2.f1175e;
                                                aVar3.d = aVar2.d;
                                                aVar3.f1176f = aVar2.f1176f;
                                                arrayList8.add(i17, aVar3);
                                                arrayList7.remove(nVar4);
                                                i17++;
                                                nVar = nVar;
                                            }
                                        }
                                        size--;
                                        ArrayList<a> arrayList9 = arrayList;
                                        f0Var4 = f0Var5;
                                    }
                                    f0Var3 = f0Var4;
                                    i12 = 1;
                                    if (z12) {
                                        arrayList8.remove(i17);
                                        i17--;
                                    } else {
                                        aVar2.f1172a = 1;
                                        arrayList7.add(nVar3);
                                    }
                                }
                                i17 += i12;
                                ArrayList<Boolean> arrayList10 = arrayList2;
                                int i20 = i10;
                                i16 = i12;
                                f0Var4 = f0Var3;
                                ArrayList<a> arrayList11 = arrayList;
                            } else {
                                f0Var3 = f0Var4;
                                i12 = i16;
                            }
                            arrayList7.add(aVar2.f1173b);
                            i17 += i12;
                            ArrayList<Boolean> arrayList102 = arrayList2;
                            int i202 = i10;
                            i16 = i12;
                            f0Var4 = f0Var3;
                            ArrayList<a> arrayList112 = arrayList;
                        } else {
                            f0Var2 = f0Var4;
                        }
                    }
                } else {
                    f0Var2 = f0Var4;
                    int i21 = 1;
                    ArrayList<n> arrayList12 = this.E;
                    ArrayList<g0.a> arrayList13 = aVar.f1158a;
                    int size2 = arrayList13.size() - 1;
                    while (size2 >= 0) {
                        g0.a aVar4 = arrayList13.get(size2);
                        int i22 = aVar4.f1172a;
                        if (i22 != i21) {
                            if (i22 != 3) {
                                switch (i22) {
                                    case 6:
                                        break;
                                    case 7:
                                        break;
                                    case 8:
                                        nVar = null;
                                        break;
                                    case 9:
                                        nVar = aVar4.f1173b;
                                        break;
                                    case 10:
                                        aVar4.f1178h = aVar4.f1177g;
                                        break;
                                }
                            }
                            arrayList12.add(aVar4.f1173b);
                            size2--;
                            i21 = 1;
                        }
                        arrayList12.remove(aVar4.f1173b);
                        size2--;
                        i21 = 1;
                    }
                }
                if (z11 || aVar.f1163g) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i15++;
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                int i23 = i10;
                f0Var4 = f0Var2;
            } else {
                f0 f0Var6 = f0Var4;
                this.E.clear();
                if (!z10 && this.f1318m >= 1) {
                    for (int i24 = i10; i24 < i14; i24++) {
                        Iterator<g0.a> it = arrayList.get(i24).f1158a.iterator();
                        while (it.hasNext()) {
                            n nVar5 = it.next().f1173b;
                            if (nVar5 == null || nVar5.F == null) {
                                f0Var = f0Var6;
                            } else {
                                f0Var = f0Var6;
                                f0Var.n(g(nVar5));
                            }
                            f0Var6 = f0Var;
                        }
                        f0 f0Var7 = f0Var6;
                    }
                }
                ArrayList<a> arrayList14 = arrayList;
                for (int i25 = i10; i25 < i14; i25++) {
                    a aVar5 = arrayList14.get(i25);
                    if (arrayList2.get(i25).booleanValue()) {
                        aVar5.c(-1);
                        aVar5.i();
                    } else {
                        aVar5.c(1);
                        aVar5.h();
                    }
                }
                ArrayList<Boolean> arrayList15 = arrayList2;
                boolean booleanValue = arrayList15.get(i14 - 1).booleanValue();
                for (int i26 = i10; i26 < i14; i26++) {
                    a aVar6 = arrayList14.get(i26);
                    if (booleanValue) {
                        for (int size3 = aVar6.f1158a.size() - 1; size3 >= 0; size3--) {
                            n nVar6 = aVar6.f1158a.get(size3).f1173b;
                            if (nVar6 != null) {
                                g(nVar6).k();
                            }
                        }
                    } else {
                        Iterator<g0.a> it2 = aVar6.f1158a.iterator();
                        while (it2.hasNext()) {
                            n nVar7 = it2.next().f1173b;
                            if (nVar7 != null) {
                                g(nVar7).k();
                            }
                        }
                    }
                }
                N(this.f1318m, true);
                HashSet hashSet = new HashSet();
                for (int i27 = i10; i27 < i14; i27++) {
                    Iterator<g0.a> it3 = arrayList14.get(i27).f1158a.iterator();
                    while (it3.hasNext()) {
                        n nVar8 = it3.next().f1173b;
                        if (!(nVar8 == null || (viewGroup = nVar8.R) == null)) {
                            hashSet.add(p0.f(viewGroup, G()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    p0 p0Var = (p0) it4.next();
                    p0Var.d = booleanValue;
                    p0Var.g();
                    p0Var.c();
                }
                for (int i28 = i10; i28 < i14; i28++) {
                    a aVar7 = arrayList14.get(i28);
                    if (arrayList15.get(i28).booleanValue() && aVar7.f1097s >= 0) {
                        aVar7.f1097s = -1;
                    }
                    aVar7.getClass();
                }
                return;
            }
        }
    }
}

package androidx.fragment.app;

import android.util.Log;
import androidx.appcompat.widget.x0;
import androidx.fragment.app.g0;
import androidx.fragment.app.n;
import androidx.fragment.app.y;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public final class a extends g0 implements y.l {

    /* renamed from: q  reason: collision with root package name */
    public final y f1095q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1096r;

    /* renamed from: s  reason: collision with root package name */
    public int f1097s;

    public a(y yVar) {
        yVar.F();
        v<?> vVar = yVar.f1319n;
        if (vVar != null) {
            vVar.f1300p.getClassLoader();
        }
        this.f1097s = -1;
        this.f1095q = yVar;
    }

    public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (y.I(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1163g) {
            return true;
        }
        y yVar = this.f1095q;
        if (yVar.d == null) {
            yVar.d = new ArrayList<>();
        }
        yVar.d.add(this);
        return true;
    }

    public final void c(int i10) {
        if (this.f1163g) {
            if (y.I(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            ArrayList<g0.a> arrayList = this.f1158a;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                g0.a aVar = arrayList.get(i11);
                n nVar = aVar.f1173b;
                if (nVar != null) {
                    nVar.E += i10;
                    if (y.I(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f1173b + " to " + aVar.f1173b.E);
                    }
                }
            }
        }
    }

    public final int d() {
        return e(false);
    }

    public final int e(boolean z) {
        int i10;
        if (!this.f1096r) {
            if (y.I(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new o0());
                g("  ", printWriter, true);
                printWriter.close();
            }
            this.f1096r = true;
            boolean z10 = this.f1163g;
            y yVar = this.f1095q;
            if (z10) {
                i10 = yVar.f1315i.getAndIncrement();
            } else {
                i10 = -1;
            }
            this.f1097s = i10;
            yVar.v(this, z);
            return this.f1097s;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void f(int i10, n nVar, String str, int i11) {
        Class<?> cls = nVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = nVar.L;
            if (str2 == null || str.equals(str2)) {
                nVar.L = str;
            } else {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(nVar);
                sb.append(": was ");
                throw new IllegalStateException(x0.f(sb, nVar.L, " now ", str));
            }
        }
        if (i10 != 0) {
            if (i10 != -1) {
                int i12 = nVar.J;
                if (i12 == 0 || i12 == i10) {
                    nVar.J = i10;
                    nVar.K = i10;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + nVar + ": was " + nVar.J + " now " + i10);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + nVar + " with tag " + str + " to container view with no id");
            }
        }
        b(new g0.a(i11, nVar));
        nVar.F = this.f1095q;
    }

    public final void g(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1165i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1097s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1096r);
            if (this.f1162f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1162f));
            }
            if (!(this.f1159b == 0 && this.f1160c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1159b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1160c));
            }
            if (!(this.d == 0 && this.f1161e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1161e));
            }
            if (!(this.f1166j == 0 && this.f1167k == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1166j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1167k);
            }
            if (!(this.l == 0 && this.f1168m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1168m);
            }
        }
        ArrayList<g0.a> arrayList = this.f1158a;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                g0.a aVar = arrayList.get(i10);
                switch (aVar.f1172a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f1172a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f1173b);
                if (z) {
                    if (!(aVar.f1174c == 0 && aVar.d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1174c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.d));
                    }
                    if (aVar.f1175e != 0 || aVar.f1176f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1175e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1176f));
                    }
                }
            }
        }
    }

    public final void h() {
        ArrayList<g0.a> arrayList = this.f1158a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            g0.a aVar = arrayList.get(i10);
            n nVar = aVar.f1173b;
            if (nVar != null) {
                if (nVar.V != null) {
                    nVar.h().f1246a = false;
                }
                int i11 = this.f1162f;
                if (!(nVar.V == null && i11 == 0)) {
                    nVar.h();
                    nVar.V.f1250f = i11;
                }
                ArrayList<String> arrayList2 = this.f1169n;
                ArrayList<String> arrayList3 = this.f1170o;
                nVar.h();
                n.b bVar = nVar.V;
                bVar.f1251g = arrayList2;
                bVar.f1252h = arrayList3;
            }
            int i12 = aVar.f1172a;
            y yVar = this.f1095q;
            switch (i12) {
                case 1:
                    nVar.T(aVar.f1174c, aVar.d, aVar.f1175e, aVar.f1176f);
                    yVar.W(nVar, false);
                    yVar.a(nVar);
                    break;
                case 3:
                    nVar.T(aVar.f1174c, aVar.d, aVar.f1175e, aVar.f1176f);
                    yVar.R(nVar);
                    break;
                case 4:
                    nVar.T(aVar.f1174c, aVar.d, aVar.f1175e, aVar.f1176f);
                    yVar.H(nVar);
                    break;
                case 5:
                    nVar.T(aVar.f1174c, aVar.d, aVar.f1175e, aVar.f1176f);
                    yVar.W(nVar, false);
                    y.a0(nVar);
                    break;
                case 6:
                    nVar.T(aVar.f1174c, aVar.d, aVar.f1175e, aVar.f1176f);
                    yVar.h(nVar);
                    break;
                case 7:
                    nVar.T(aVar.f1174c, aVar.d, aVar.f1175e, aVar.f1176f);
                    yVar.W(nVar, false);
                    yVar.d(nVar);
                    break;
                case 8:
                    yVar.Y(nVar);
                    break;
                case 9:
                    yVar.Y((n) null);
                    break;
                case 10:
                    yVar.X(nVar, aVar.f1178h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1172a);
            }
        }
    }

    public final void i() {
        ArrayList<g0.a> arrayList = this.f1158a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g0.a aVar = arrayList.get(size);
            n nVar = aVar.f1173b;
            if (nVar != null) {
                if (nVar.V != null) {
                    nVar.h().f1246a = true;
                }
                int i10 = this.f1162f;
                int i11 = 8194;
                if (i10 != 4097) {
                    if (i10 == 4099) {
                        i11 = 4099;
                    } else if (i10 != 8194) {
                        i11 = 0;
                    } else {
                        i11 = 4097;
                    }
                }
                if (!(nVar.V == null && i11 == 0)) {
                    nVar.h();
                    nVar.V.f1250f = i11;
                }
                ArrayList<String> arrayList2 = this.f1170o;
                ArrayList<String> arrayList3 = this.f1169n;
                nVar.h();
                n.b bVar = nVar.V;
                bVar.f1251g = arrayList2;
                bVar.f1252h = arrayList3;
            }
            int i12 = aVar.f1172a;
            y yVar = this.f1095q;
            switch (i12) {
                case 1:
                    nVar.T(aVar.f1174c, aVar.d, aVar.f1175e, aVar.f1176f);
                    yVar.W(nVar, true);
                    yVar.R(nVar);
                    break;
                case 3:
                    nVar.T(aVar.f1174c, aVar.d, aVar.f1175e, aVar.f1176f);
                    yVar.a(nVar);
                    break;
                case 4:
                    nVar.T(aVar.f1174c, aVar.d, aVar.f1175e, aVar.f1176f);
                    yVar.getClass();
                    y.a0(nVar);
                    break;
                case 5:
                    nVar.T(aVar.f1174c, aVar.d, aVar.f1175e, aVar.f1176f);
                    yVar.W(nVar, true);
                    yVar.H(nVar);
                    break;
                case 6:
                    nVar.T(aVar.f1174c, aVar.d, aVar.f1175e, aVar.f1176f);
                    yVar.d(nVar);
                    break;
                case 7:
                    nVar.T(aVar.f1174c, aVar.d, aVar.f1175e, aVar.f1176f);
                    yVar.W(nVar, true);
                    yVar.h(nVar);
                    break;
                case 8:
                    yVar.Y((n) null);
                    break;
                case 9:
                    yVar.Y(nVar);
                    break;
                case 10:
                    yVar.X(nVar, aVar.f1177g);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1172a);
            }
        }
    }

    public final a j(n nVar) {
        y yVar;
        if (nVar == null || (yVar = nVar.F) == null || yVar == this.f1095q) {
            b(new g0.a(8, nVar));
            return this;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + nVar.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1097s >= 0) {
            sb.append(" #");
            sb.append(this.f1097s);
        }
        if (this.f1165i != null) {
            sb.append(" ");
            sb.append(this.f1165i);
        }
        sb.append("}");
        return sb.toString();
    }
}

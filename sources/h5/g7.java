package h5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.databinding.a;
import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.internal.measurement.qa;
import j4.f;
import j4.h;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import n4.m;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import t4.c;

public final class g7 extends r4 {
    public static final String[] u = {"firebase_", "google_", "ga_"};

    /* renamed from: v  reason: collision with root package name */
    public static final String[] f5417v = {"_err"};

    /* renamed from: q  reason: collision with root package name */
    public SecureRandom f5418q;

    /* renamed from: r  reason: collision with root package name */
    public final AtomicLong f5419r = new AtomicLong(0);

    /* renamed from: s  reason: collision with root package name */
    public int f5420s;

    /* renamed from: t  reason: collision with root package name */
    public Integer f5421t = null;

    public g7(i4 i4Var) {
        super(i4Var);
    }

    public static boolean A(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean B(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static byte[] F(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static ArrayList<Bundle> P(List<b> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (b next : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", next.f5275o);
            bundle.putString("origin", next.f5276p);
            bundle.putLong("creation_timestamp", next.f5278r);
            bundle.putString("name", next.f5277q.f5318p);
            a.z(bundle, next.f5277q.g0());
            bundle.putBoolean("active", next.f5279s);
            String str = next.f5280t;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            p pVar = next.u;
            if (pVar != null) {
                bundle.putString("timed_out_event_name", pVar.f5621o);
                n nVar = pVar.f5622p;
                if (nVar != null) {
                    bundle.putBundle("timed_out_event_params", nVar.h0());
                }
            }
            bundle.putLong("trigger_timeout", next.f5281v);
            p pVar2 = next.w;
            if (pVar2 != null) {
                bundle.putString("triggered_event_name", pVar2.f5621o);
                n nVar2 = next.w.f5622p;
                if (nVar2 != null) {
                    bundle.putBundle("triggered_event_params", nVar2.h0());
                }
            }
            bundle.putLong("triggered_timestamp", next.f5277q.f5319q);
            bundle.putLong("time_to_live", next.f5282x);
            p pVar3 = next.f5283y;
            if (pVar3 != null) {
                bundle.putString("expired_event_name", pVar3.f5621o);
                n nVar3 = pVar3.f5622p;
                if (nVar3 != null) {
                    bundle.putBundle("expired_event_params", nVar3.h0());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        r4 = r1.getReceiverInfo(new android.content.ComponentName(r4, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean Q(android.content.Context r4) {
        /*
            n4.m.h(r4)
            r0 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001e }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x001e }
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementReceiver"
            r2.<init>(r4, r3)     // Catch:{ NameNotFoundException -> 0x001e }
            android.content.pm.ActivityInfo r4 = r1.getReceiverInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            boolean r4 = r4.enabled     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            r4 = 1
            return r4
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.g7.Q(android.content.Context):boolean");
    }

    public static final boolean R(int i10, Bundle bundle) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i10);
        return true;
    }

    public static boolean U(String str, String[] strArr) {
        m.h(strArr);
        for (String B : strArr) {
            if (B(str, B)) {
                return true;
            }
        }
        return false;
    }

    public static boolean Y(String str) {
        m.e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean i0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static boolean l(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            m.h(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else {
            if (isEmpty) {
                return TextUtils.isEmpty(str3) || !str3.equals(str4);
            }
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    public static String m(String str, int i10, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...");
        }
        return null;
    }

    public static MessageDigest x() {
        int i10 = 0;
        while (i10 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i10++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static long y(byte[] bArr) {
        boolean z;
        m.h(bArr);
        int length = bArr.length;
        int i10 = 0;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i11 = length - 1;
            long j8 = 0;
            while (i11 >= 0 && i11 >= bArr.length - 8) {
                j8 += (((long) bArr[i11]) & 255) << i10;
                i10 += 8;
                i11--;
            }
            return j8;
        }
        throw new IllegalStateException();
    }

    public final Bundle C(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String next : bundle.keySet()) {
                Object o10 = o(bundle.get(next), next);
                if (o10 == null) {
                    i4 i4Var = this.f5649o;
                    g3 g3Var = i4Var.w;
                    i4.n(g3Var);
                    b3 b3Var = i4Var.A;
                    i4.l(b3Var);
                    g3Var.f5400y.b(b3Var.m(next), "Param value can't be null");
                } else {
                    v(bundle2, next, o10);
                }
            }
        }
        return bundle2;
    }

    public final p D(String str, String str2, Bundle bundle, String str3, long j8, boolean z) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (e0(str2) == 0) {
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString("_o", str3);
            Bundle p10 = p(str, str2, bundle2, Collections.singletonList("_o"), false);
            if (z) {
                p10 = C(p10);
            }
            return new p(str2, new n(p10), str3, j8);
        }
        i4 i4Var = this.f5649o;
        g3 g3Var = i4Var.w;
        i4.n(g3Var);
        b3 b3Var = i4Var.A;
        i4.l(b3Var);
        g3Var.f5397t.b(b3Var.n(str2), "Invalid conditional property event name");
        throw new IllegalArgumentException();
    }

    public final boolean E(Context context, String str) {
        g3 g3Var;
        String str2;
        Signature[] signatureArr;
        i4 i4Var = this.f5649o;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b10 = c.a(context).b(str, 64);
            if (b10 == null || (signatureArr = b10.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e10) {
            e = e10;
            g3Var = i4Var.w;
            i4.n(g3Var);
            str2 = "Error obtaining certificate";
            g3Var.f5397t.b(e, str2);
            return true;
        } catch (PackageManager.NameNotFoundException e11) {
            e = e11;
            g3Var = i4Var.w;
            i4.n(g3Var);
            str2 = "Package name not found";
            g3Var.f5397t.b(e, str2);
            return true;
        }
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int G() {
        if (this.f5421t == null) {
            f fVar = f.f6547b;
            Context context = this.f5649o.f5452o;
            fVar.getClass();
            boolean z = h.f6549a;
            int i10 = 0;
            try {
                i10 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.f5421t = Integer.valueOf(i10 / 1000);
        }
        return this.f5421t.intValue();
    }

    public final void H(Bundle bundle, long j8) {
        long j10 = bundle.getLong("_et");
        if (j10 != 0) {
            g3 g3Var = this.f5649o.w;
            i4.n(g3Var);
            g3Var.w.b(Long.valueOf(j10), "Params already contained engagement");
        }
        bundle.putLong("_et", j8 + j10);
    }

    public final void I(String str, q0 q0Var) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            q0Var.h(bundle);
        } catch (RemoteException e10) {
            g3 g3Var = this.f5649o.w;
            i4.n(g3Var);
            g3Var.w.b(e10, "Error returning string value to wrapper");
        }
    }

    public final void J(q0 q0Var, long j8) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j8);
        try {
            q0Var.h(bundle);
        } catch (RemoteException e10) {
            g3 g3Var = this.f5649o.w;
            i4.n(g3Var);
            g3Var.w.b(e10, "Error returning long value to wrapper");
        }
    }

    public final void K(q0 q0Var, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            q0Var.h(bundle);
        } catch (RemoteException e10) {
            g3 g3Var = this.f5649o.w;
            i4.n(g3Var);
            g3Var.w.b(e10, "Error returning int value to wrapper");
        }
    }

    public final void L(q0 q0Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            q0Var.h(bundle);
        } catch (RemoteException e10) {
            g3 g3Var = this.f5649o.w;
            i4.n(g3Var);
            g3Var.w.b(e10, "Error returning byte array to wrapper");
        }
    }

    public final void M(q0 q0Var, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            q0Var.h(bundle);
        } catch (RemoteException e10) {
            g3 g3Var = this.f5649o.w;
            i4.n(g3Var);
            g3Var.w.b(e10, "Error returning boolean value to wrapper");
        }
    }

    public final void N(q0 q0Var, Bundle bundle) {
        try {
            q0Var.h(bundle);
        } catch (RemoteException e10) {
            g3 g3Var = this.f5649o.w;
            i4.n(g3Var);
            g3Var.w.b(e10, "Error returning bundle value to wrapper");
        }
    }

    public final void O(q0 q0Var, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            q0Var.h(bundle);
        } catch (RemoteException e10) {
            g3 g3Var = this.f5649o.w;
            i4.n(g3Var);
            g3Var.w.b(e10, "Error returning bundle list to wrapper");
        }
    }

    public final Object S(int i10, Object obj, boolean z, boolean z10) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0 : 1);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return m(String.valueOf(obj), i10, z);
            }
            if (!z10 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle C = C((Bundle) parcelable);
                    if (!C.isEmpty()) {
                        arrayList.add(C);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    public final int T(String str) {
        boolean equals = "_ldl".equals(str);
        i4 i4Var = this.f5649o;
        if (equals) {
            i4Var.getClass();
            return 2048;
        } else if ("_id".equals(str)) {
            i4Var.getClass();
            return 256;
        } else if (!i4Var.u.m((String) null, u2.f5713d0) || !"_lgclid".equals(str)) {
            i4Var.getClass();
            return 36;
        } else {
            i4Var.getClass();
            return 100;
        }
    }

    public final void V() {
        g();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                g3 g3Var = this.f5649o.w;
                i4.n(g3Var);
                g3Var.w.a("Utils falling back to Random for random id");
            }
        }
        this.f5419r.set(nextLong);
    }

    public final long W() {
        long andIncrement;
        long j8;
        if (this.f5419r.get() == 0) {
            synchronized (this.f5419r) {
                long nanoTime = System.nanoTime();
                this.f5649o.B.getClass();
                long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                int i10 = this.f5420s + 1;
                this.f5420s = i10;
                j8 = nextLong + ((long) i10);
            }
            return j8;
        }
        synchronized (this.f5419r) {
            this.f5419r.compareAndSet(-1, 1);
            andIncrement = this.f5419r.getAndIncrement();
        }
        return andIncrement;
    }

    @EnsuresNonNull({"this.secureRandom"})
    public final SecureRandom X() {
        g();
        if (this.f5418q == null) {
            this.f5418q = new SecureRandom();
        }
        return this.f5418q;
    }

    public final Bundle Z(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str4 = uri.getQueryParameter("utm_campaign");
                    str3 = uri.getQueryParameter("utm_source");
                    str2 = uri.getQueryParameter("utm_medium");
                    str = uri.getQueryParameter("gclid");
                } else {
                    str4 = null;
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("campaign", str4);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("source", str3);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("medium", str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("gclid", str);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("content", queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                return bundle;
            } catch (UnsupportedOperationException e10) {
                g3 g3Var = this.f5649o.w;
                i4.n(g3Var);
                g3Var.w.b(e10, "Install referrer url isn't a hierarchical URI");
            }
        }
        return null;
    }

    public final boolean a0(String str, String str2) {
        i4 i4Var = this.f5649o;
        if (str2 == null) {
            g3 g3Var = i4Var.w;
            i4.n(g3Var);
            g3Var.f5398v.b(str, "Name is required and can't be null. Type");
            return false;
        } else if (str2.length() == 0) {
            g3 g3Var2 = i4Var.w;
            i4.n(g3Var2);
            g3Var2.f5398v.b(str, "Name is required and can't be empty. Type");
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                g3 g3Var3 = i4Var.w;
                i4.n(g3Var3);
                g3Var3.f5398v.c(str, str2, "Name must start with a letter. Type, name");
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    g3 g3Var4 = i4Var.w;
                    i4.n(g3Var4);
                    g3Var4.f5398v.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean b0(String str, String str2) {
        i4 i4Var = this.f5649o;
        if (str2 == null) {
            g3 g3Var = i4Var.w;
            i4.n(g3Var);
            g3Var.f5398v.b(str, "Name is required and can't be null. Type");
            return false;
        } else if (str2.length() == 0) {
            g3 g3Var2 = i4Var.w;
            i4.n(g3Var2);
            g3Var2.f5398v.b(str, "Name is required and can't be empty. Type");
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt == 95) {
                    codePointAt = 95;
                } else {
                    g3 g3Var3 = i4Var.w;
                    i4.n(g3Var3);
                    g3Var3.f5398v.c(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                    return false;
                }
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    g3 g3Var4 = i4Var.w;
                    i4.n(g3Var4);
                    g3Var4.f5398v.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean c0(String str, String[] strArr, String[] strArr2, String str2) {
        i4 i4Var = this.f5649o;
        if (str2 == null) {
            g3 g3Var = i4Var.w;
            i4.n(g3Var);
            g3Var.f5398v.b(str, "Name is required and can't be null. Type");
            return false;
        }
        String[] strArr3 = u;
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(strArr3[i10])) {
                g3 g3Var2 = i4Var.w;
                i4.n(g3Var2);
                g3Var2.f5398v.c(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !U(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && U(str2, strArr2)) {
            return true;
        }
        g3 g3Var3 = i4Var.w;
        i4.n(g3Var3);
        g3Var3.f5398v.c(str, str2, "Name is reserved. Type, name");
        return false;
    }

    public final boolean d0(String str, int i10, String str2) {
        i4 i4Var = this.f5649o;
        if (str2 == null) {
            g3 g3Var = i4Var.w;
            i4.n(g3Var);
            g3Var.f5398v.b(str, "Name is required and can't be null. Type");
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        } else {
            g3 g3Var2 = i4Var.w;
            i4.n(g3Var2);
            g3Var2.f5398v.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
            return false;
        }
    }

    public final int e0(String str) {
        if (!b0("event", str)) {
            return 2;
        }
        if (!c0("event", s6.a.J, s6.a.K, str)) {
            return 13;
        }
        this.f5649o.getClass();
        return !d0("event", 40, str) ? 2 : 0;
    }

    public final int f0(String str) {
        if (!b0("user property", str)) {
            return 6;
        }
        if (!c0("user property", s6.a.N, (String[]) null, str)) {
            return 15;
        }
        this.f5649o.getClass();
        return !d0("user property", 24, str) ? 6 : 0;
    }

    public final int g0(String str) {
        if (!a0("event param", str)) {
            return 3;
        }
        if (!c0("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.f5649o.getClass();
        return !d0("event param", 40, str) ? 3 : 0;
    }

    public final boolean h() {
        return true;
    }

    public final int h0(String str) {
        if (!b0("event param", str)) {
            return 3;
        }
        if (!c0("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.f5649o.getClass();
        return !d0("event param", 40, str) ? 3 : 0;
    }

    public final boolean j0(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i10) {
                g3 g3Var = this.f5649o.w;
                i4.n(g3Var);
                g3Var.f5400y.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    public final boolean k(String str, String str2, String str3) {
        boolean isEmpty = TextUtils.isEmpty(str);
        i4 i4Var = this.f5649o;
        if (!isEmpty) {
            m.h(str);
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (TextUtils.isEmpty(i4Var.f5453p)) {
                g3 g3Var = i4Var.w;
                i4.n(g3Var);
                g3Var.f5398v.b(g3.p(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
            }
            return false;
        }
        qa.a();
        if (i4Var.u.m((String) null, u2.f5717f0) && !TextUtils.isEmpty(str3)) {
            return true;
        }
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        g3 g3Var2 = i4Var.w;
        if (!isEmpty2) {
            m.h(str2);
            if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            i4.n(g3Var2);
            g3Var2.f5398v.b(g3.p(str2), "Invalid admob_app_id. Analytics disabled.");
            return false;
        }
        if (TextUtils.isEmpty(i4Var.f5453p)) {
            i4.n(g3Var2);
            g3Var2.f5398v.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        }
        return false;
    }

    public final void k0(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z) {
        int i10;
        g3 g3Var;
        String str4;
        int i11;
        String str5;
        String str6 = str2;
        Bundle bundle2 = bundle;
        List<String> list2 = list;
        if (bundle2 != null) {
            i4 i4Var = this.f5649o;
            i4Var.getClass();
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i12 = 0;
            while (it.hasNext()) {
                String str7 = (String) it.next();
                if (list2 == null || !list2.contains(str7)) {
                    if (z) {
                        i10 = g0(str7);
                    } else {
                        i10 = 0;
                    }
                    if (i10 == 0) {
                        i10 = h0(str7);
                    }
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    if (i10 == 3) {
                        str5 = str7;
                    } else {
                        str5 = null;
                    }
                    s(bundle2, i10, str7, str5);
                    bundle2.remove(str7);
                } else {
                    boolean i02 = i0(bundle2.get(str7));
                    g3 g3Var2 = i4Var.w;
                    if (i02) {
                        i4.n(g3Var2);
                        g3Var2.f5400y.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str6, str3, str7);
                        i11 = 22;
                        g3Var = g3Var2;
                        str4 = str7;
                    } else {
                        String str8 = str3;
                        g3Var = g3Var2;
                        str4 = str7;
                        i11 = n(str, str2, str7, bundle2.get(str7), bundle, list, z, false);
                    }
                    if (i11 != 0 && !"_ev".equals(str4)) {
                        s(bundle2, i11, str4, bundle2.get(str4));
                    } else if (Y(str4) && !U(str4, a.t0) && (i12 = i12 + 1) > 0) {
                        i4.n(g3Var);
                        b3 b3Var = i4Var.A;
                        i4.l(b3Var);
                        String l = b3Var.l(str6);
                        i4.l(b3Var);
                        g3Var.f5398v.c(l, b3Var.o(bundle2), "Item cannot contain custom parameters");
                        R(23, bundle2);
                    }
                    bundle2.remove(str4);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int n(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.Object r19, android.os.Bundle r20, java.util.List<java.lang.String> r21, boolean r22, boolean r23) {
        /*
            r15 = this;
            r7 = r15
            r8 = r18
            r0 = r19
            r1 = r20
            r15.g()
            boolean r2 = i0(r19)
            java.lang.String r3 = "param"
            r4 = 0
            h5.i4 r5 = r7.f5649o
            if (r2 == 0) goto L_0x00a0
            if (r23 == 0) goto L_0x009d
            java.lang.String[] r2 = androidx.databinding.a.f1021s0
            boolean r2 = U(r8, r2)
            if (r2 != 0) goto L_0x0022
            r0 = 20
            return r0
        L_0x0022:
            h5.f6 r2 = r5.r()
            r2.g()
            r2.h()
            boolean r6 = r2.l()
            if (r6 != 0) goto L_0x0033
            goto L_0x0046
        L_0x0033:
            h5.i4 r2 = r2.f5649o
            h5.g7 r2 = r2.z
            h5.i4.l(r2)
            int r2 = r2.G()
            r6 = 200900(0x310c4, float:2.81521E-40)
            if (r2 >= r6) goto L_0x0046
            r0 = 25
            return r0
        L_0x0046:
            boolean r2 = r0 instanceof android.os.Parcelable[]
            if (r2 == 0) goto L_0x004f
            r6 = r0
            android.os.Parcelable[] r6 = (android.os.Parcelable[]) r6
            int r6 = r6.length
            goto L_0x005a
        L_0x004f:
            boolean r6 = r0 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x00a0
            r6 = r0
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r6 = r6.size()
        L_0x005a:
            r9 = 200(0xc8, float:2.8E-43)
            if (r6 <= r9) goto L_0x00a0
            h5.g3 r10 = r5.w
            h5.i4.n(r10)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            h5.e3 r10 = r10.f5400y
            java.lang.String r11 = "Parameter array is too long; discarded. Value kind, name, array length"
            r10.d(r11, r3, r8, r6)
            if (r2 == 0) goto L_0x0080
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r6 = r2.length
            if (r6 <= r9) goto L_0x0099
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r9)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x0099
        L_0x0080:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x0099
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r6 = r2.size()
            if (r6 <= r9) goto L_0x0099
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r4, r9)
            r6.<init>(r2)
            r1.putParcelableArrayList(r8, r6)
        L_0x0099:
            r1 = 17
            r9 = r1
            goto L_0x00a1
        L_0x009d:
            r0 = 21
            return r0
        L_0x00a0:
            r9 = r4
        L_0x00a1:
            h5.e r1 = r5.u
            h5.s2<java.lang.Boolean> r2 = h5.u2.R
            r10 = r16
            boolean r1 = r1.m(r10, r2)
            if (r1 == 0) goto L_0x00b3
            boolean r1 = A(r17)
            if (r1 != 0) goto L_0x00b9
        L_0x00b3:
            boolean r1 = A(r18)
            if (r1 == 0) goto L_0x00bc
        L_0x00b9:
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x00be
        L_0x00bc:
            r1 = 100
        L_0x00be:
            boolean r1 = r15.j0(r3, r8, r1, r0)
            if (r1 == 0) goto L_0x00c5
            return r9
        L_0x00c5:
            if (r23 == 0) goto L_0x0150
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00de
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r21
            r6 = r22
            r0.k0(r1, r2, r3, r4, r5, r6)
            goto L_0x014f
        L_0x00de:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            h5.g3 r11 = r5.w
            if (r1 == 0) goto L_0x0111
            r12 = r0
            android.os.Parcelable[] r12 = (android.os.Parcelable[]) r12
            int r13 = r12.length
            r14 = r4
        L_0x00e9:
            if (r14 >= r13) goto L_0x014f
            r0 = r12[r14]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x00fd
            h5.i4.n(r11)
            java.lang.Class r0 = r0.getClass()
            h5.e3 r1 = r11.f5400y
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            goto L_0x0137
        L_0x00fd:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r21
            r6 = r22
            r0.k0(r1, r2, r3, r4, r5, r6)
            int r14 = r14 + 1
            goto L_0x00e9
        L_0x0111:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x0150
            r12 = r0
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            int r13 = r12.size()
            r14 = r4
        L_0x011d:
            if (r14 >= r13) goto L_0x014f
            java.lang.Object r0 = r12.get(r14)
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x013b
            h5.i4.n(r11)
            if (r0 == 0) goto L_0x0131
            java.lang.Class r0 = r0.getClass()
            goto L_0x0133
        L_0x0131:
            java.lang.String r0 = "null"
        L_0x0133:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            h5.e3 r1 = r11.f5400y
        L_0x0137:
            r1.c(r0, r8, r2)
            goto L_0x0150
        L_0x013b:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r21
            r6 = r22
            r0.k0(r1, r2, r3, r4, r5, r6)
            int r14 = r14 + 1
            goto L_0x011d
        L_0x014f:
            return r9
        L_0x0150:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.g7.n(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final Object o(Object obj, String str) {
        boolean equals = "_ev".equals(str);
        int i10 = 256;
        i4 i4Var = this.f5649o;
        if (equals) {
            i4Var.getClass();
            return S(256, obj, true, true);
        }
        boolean A = A(str);
        i4Var.getClass();
        if (!A) {
            i10 = 100;
        }
        return S(i10, obj, false, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle p(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, java.util.List<java.lang.String> r23, boolean r24) {
        /*
            r19 = this;
            r9 = r19
            r10 = r21
            r11 = r22
            r12 = r23
            java.lang.String[] r0 = s6.a.M
            boolean r13 = U(r10, r0)
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>(r11)
            h5.i4 r15 = r9.f5649o
            h5.e r0 = r15.u
            int r8 = r0.i()
            h5.e r0 = r15.u
            h5.s2<java.lang.Boolean> r1 = h5.u2.V
            r7 = r20
            boolean r0 = r0.m(r7, r1)
            if (r0 == 0) goto L_0x0031
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r22.keySet()
            r0.<init>(r1)
            goto L_0x0035
        L_0x0031:
            java.util.Set r0 = r22.keySet()
        L_0x0035:
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = r17
        L_0x003d:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x010d
            java.lang.Object r0 = r16.next()
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            if (r12 == 0) goto L_0x0056
            boolean r0 = r12.contains(r6)
            if (r0 != 0) goto L_0x0053
            goto L_0x0056
        L_0x0053:
            r0 = r17
            goto L_0x0065
        L_0x0056:
            if (r24 == 0) goto L_0x005d
            int r0 = r9.g0(r6)
            goto L_0x005f
        L_0x005d:
            r0 = r17
        L_0x005f:
            if (r0 != 0) goto L_0x0065
            int r0 = r9.h0(r6)
        L_0x0065:
            if (r0 == 0) goto L_0x0077
            r1 = 3
            if (r0 != r1) goto L_0x006c
            r1 = r6
            goto L_0x006d
        L_0x006c:
            r1 = 0
        L_0x006d:
            r9.s(r14, r0, r6, r1)
            r14.remove(r6)
            r5 = r8
            r4 = r10
            goto L_0x0105
        L_0x0077:
            java.lang.Object r4 = r11.get(r6)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r6
            r5 = r14
            r12 = r6
            r6 = r23
            r7 = r24
            r10 = r8
            r8 = r13
            int r0 = r0.n(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 17
            if (r0 != r1) goto L_0x0098
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.s(r14, r1, r12, r0)
            goto L_0x00b5
        L_0x0098:
            if (r0 == 0) goto L_0x00b5
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r12)
            if (r1 != 0) goto L_0x00b5
            r1 = 21
            if (r0 != r1) goto L_0x00a9
            r6 = r21
            goto L_0x00aa
        L_0x00a9:
            r6 = r12
        L_0x00aa:
            java.lang.Object r1 = r11.get(r12)
            r9.s(r14, r0, r6, r1)
            r14.remove(r12)
            goto L_0x0102
        L_0x00b5:
            boolean r0 = Y(r12)
            if (r0 == 0) goto L_0x0102
            int r0 = r18 + 1
            if (r0 <= r10) goto L_0x00fc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 48
            r1.<init>(r2)
            java.lang.String r2 = "Event can't contain more than "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = " params"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            h5.g3 r2 = r15.w
            h5.i4.n(r2)
            h5.b3 r3 = r15.A
            h5.i4.l(r3)
            r4 = r21
            r5 = r10
            java.lang.String r6 = r3.l(r4)
            h5.i4.l(r3)
            java.lang.String r3 = r3.o(r11)
            h5.e3 r2 = r2.f5398v
            r2.c(r6, r3, r1)
            r1 = 5
            R(r1, r14)
            r14.remove(r12)
            goto L_0x00ff
        L_0x00fc:
            r4 = r21
            r5 = r10
        L_0x00ff:
            r18 = r0
            goto L_0x0105
        L_0x0102:
            r4 = r21
            r5 = r10
        L_0x0105:
            r7 = r20
            r12 = r23
            r10 = r4
            r8 = r5
            goto L_0x003d
        L_0x010d:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.g7.p(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    public final void q(h3 h3Var, int i10) {
        Bundle bundle = h3Var.d;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i11 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (Y(str) && (i11 = i11 + 1) > i10) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Event can't contain more than ");
                sb.append(i10);
                sb.append(" params");
                String sb2 = sb.toString();
                i4 i4Var = this.f5649o;
                g3 g3Var = i4Var.w;
                i4.n(g3Var);
                b3 b3Var = i4Var.A;
                i4.l(b3Var);
                String l = b3Var.l(h3Var.f5426a);
                i4.l(b3Var);
                g3Var.f5398v.c(l, b3Var.o(bundle), sb2);
                R(5, bundle);
                bundle.remove(str);
            }
        }
    }

    public final void r(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String next : bundle2.keySet()) {
                if (!bundle.containsKey(next)) {
                    g7 g7Var = this.f5649o.z;
                    i4.l(g7Var);
                    g7Var.v(bundle, next, bundle2.get(next));
                }
            }
        }
    }

    public final void s(Bundle bundle, int i10, String str, Object obj) {
        if (R(i10, bundle)) {
            this.f5649o.getClass();
            bundle.putString("_ev", m(str, 40, true));
            if (obj == null) {
                return;
            }
            if ((obj instanceof String) || (obj instanceof CharSequence)) {
                bundle.putLong("_el", (long) String.valueOf(obj).length());
            }
        }
    }

    public final int t(Object obj, String str) {
        return j0("_ldl".equals(str) ? "user property referrer" : "user property", str, T(str), obj) ? 0 : 7;
    }

    public final Object u(Object obj, String str) {
        boolean equals = "_ldl".equals(str);
        int T = T(str);
        return equals ? S(T, obj, true, false) : S(T, obj, false, false);
    }

    public final void v(Bundle bundle, String str, Object obj) {
        String str2;
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                if (obj != null) {
                    str2 = obj.getClass().getSimpleName();
                } else {
                    str2 = null;
                }
                i4 i4Var = this.f5649o;
                g3 g3Var = i4Var.w;
                i4.n(g3Var);
                b3 b3Var = i4Var.A;
                i4.l(b3Var);
                g3Var.f5400y.c(b3Var.m(str), str2, "Not putting event parameter. Invalid value type. name, type");
            }
        }
    }

    public final void w(f7 f7Var, String str, int i10, String str2, String str3, int i11, boolean z) {
        Bundle bundle = new Bundle();
        R(i10, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", (long) i11);
        }
        if (z) {
            f7Var.a(str, bundle);
            return;
        }
        i4 i4Var = this.f5649o;
        i4Var.getClass();
        i5 i5Var = i4Var.D;
        i4.m(i5Var);
        i5Var.x("auto", "_err", bundle);
    }

    public final boolean z(String str) {
        g();
        i4 i4Var = this.f5649o;
        if (c.a(i4Var.f5452o).f8994a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        g3 g3Var = i4Var.w;
        i4.n(g3Var);
        g3Var.A.b(str, "Permission not granted");
        return false;
    }
}

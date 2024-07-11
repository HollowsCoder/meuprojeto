package n;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.internal.vision.w1;
import com.google.android.gms.internal.vision.y0;
import com.karumi.dexter.R;
import e3.b;
import f3.g;
import f9.l;
import g9.t;
import i0.b0;
import i0.w;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import kotlinx.coroutines.CoroutineExceptionHandler;
import m3.a;
import m6.f;
import m6.h;
import n8.e;
import org.json.JSONObject;
import q2.d;
import q8.e;
import q8.f;
import r1.d0;
import r1.m;
import s8.c;
import u2.a;
import w9.a0;
import w9.c0;
import w9.p;
import w9.q;
import w9.s;
import w9.u;
import w9.v;
import w9.z;

public class e implements d0, a, d, b, g, w1, y0, b7.a, k7.e {
    public static e A;
    public static final int[] B = {16842960, R.attr.destination, R.attr.enterAnim, R.attr.exitAnim, R.attr.launchSingleTop, R.attr.popEnterAnim, R.attr.popExitAnim, R.attr.popUpTo, R.attr.popUpToInclusive};
    public static final int[] C = {16842755, 16843245, R.attr.argType, R.attr.nullable};
    public static final int[] D = {16844014, R.attr.action, R.attr.mimeType, R.attr.uri};
    public static final int[] E = {R.attr.startDestination};
    public static final int[] F = {16842753, 16842960};
    public static final int[] G = {16842948, 16842987, 16842993, R.attr.fastScrollEnabled, R.attr.fastScrollHorizontalThumbDrawable, R.attr.fastScrollHorizontalTrackDrawable, R.attr.fastScrollVerticalThumbDrawable, R.attr.fastScrollVerticalTrackDrawable, R.attr.layoutManager, R.attr.reverseLayout, R.attr.spanCount, R.attr.stackFromEnd};
    public static final Object[] H = new Object[0];

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f7295o = new int[0];

    /* renamed from: p  reason: collision with root package name */
    public static final long[] f7296p = new long[0];

    /* renamed from: q  reason: collision with root package name */
    public static final Object[] f7297q = new Object[0];

    /* renamed from: r  reason: collision with root package name */
    public static final e f7298r = new e();

    /* renamed from: s  reason: collision with root package name */
    public static final e f7299s = new e();

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f7300t = {16842755, 16842960, 16842961};
    public static final int[] u = {16842755, 16842961};

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f7301v = {R.attr.keylines, R.attr.statusBarBackground};
    public static final int[] w = {16842931, R.attr.layout_anchor, R.attr.layout_anchorGravity, R.attr.layout_behavior, R.attr.layout_dodgeInsetEdges, R.attr.layout_insetEdge, R.attr.layout_keyline};

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f7302x = {16843173, 16843551, 16844359, R.attr.alpha, R.attr.lStar};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f7303y = {R.attr.fontProviderAuthority, R.attr.fontProviderCerts, R.attr.fontProviderFetchStrategy, R.attr.fontProviderFetchTimeout, R.attr.fontProviderPackage, R.attr.fontProviderQuery, R.attr.fontProviderSystemFontFamily};
    public static final int[] z = {16844082, 16844083, 16844095, 16844143, 16844144, R.attr.font, R.attr.fontStyle, R.attr.fontVariationSettings, R.attr.fontWeight, R.attr.ttcIndex};

    public /* synthetic */ e() {
    }

    public static final q8.d A(q8.d<Object> dVar) {
        c cVar;
        z8.g.f(dVar, "<this>");
        if (dVar instanceof c) {
            cVar = (c) dVar;
        } else {
            cVar = null;
        }
        if (cVar != null && (dVar = cVar.f8835q) == null) {
            f fVar = cVar.f8834p;
            z8.g.c(fVar);
            q8.e eVar = (q8.e) fVar.get(e.a.f8273o);
            if (eVar == null || (dVar = eVar.c(cVar)) == null) {
                dVar = cVar;
            }
            cVar.f8835q = dVar;
        }
        return dVar;
    }

    public static final boolean B(AssertionError assertionError) {
        boolean z10;
        Logger logger = q.f9346a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        if (message != null) {
            z10 = l.c0(message, "getsockname failed");
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return false;
    }

    public static int C(float f10, int i10, int i11) {
        return b0.a.b(b0.a.c(i11, Math.round(((float) Color.alpha(i11)) * f10)), i10);
    }

    public static final boolean D(String str) {
        z8.g.f(str, "method");
        return !z8.g.a(str, "GET") && !z8.g.a(str, "HEAD");
    }

    public static void E(View view, m6.f fVar) {
        boolean z10;
        e6.a aVar = fVar.f7121o.f7132b;
        if (aVar == null || !aVar.f4491a) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            float f10 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                f10 += w.i.i((View) parent);
            }
            f.b bVar = fVar.f7121o;
            if (bVar.f7141m != f10) {
                bVar.f7141m = f10;
                fVar.m();
            }
        }
    }

    public static final w9.c F(Socket socket) {
        Logger logger = q.f9346a;
        a0 a0Var = new a0(socket);
        OutputStream outputStream = socket.getOutputStream();
        z8.g.e(outputStream, "getOutputStream()");
        return new w9.c(a0Var, new s(outputStream, a0Var));
    }

    public static final w9.d G(Socket socket) {
        Logger logger = q.f9346a;
        a0 a0Var = new a0(socket);
        InputStream inputStream = socket.getInputStream();
        z8.g.e(inputStream, "getInputStream()");
        return new w9.d(a0Var, new p(inputStream, a0Var));
    }

    public static final p H(InputStream inputStream) {
        Logger logger = q.f9346a;
        z8.g.f(inputStream, "$this$source");
        return new p(inputStream, new c0());
    }

    public static final void I(Object obj) {
        if (obj instanceof e.a) {
            throw ((e.a) obj).f7497o;
        }
    }

    public static final Object[] J(Collection collection) {
        z8.g.f(collection, "collection");
        int size = collection.size();
        Object[] objArr = H;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            objArr2[i10] = it.next();
            if (i11 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i12 = ((i11 * 3) + 1) >>> 1;
                if (i12 <= i11) {
                    i12 = 2147483645;
                    if (i11 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i12);
                z8.g.e(objArr2, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr2, i11);
                z8.g.e(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i10 = i11;
        }
    }

    public static final Object[] K(Collection collection, Object[] objArr) {
        Object[] objArr2;
        z8.g.f(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i10 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    z8.g.d(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i11 = i10 + 1;
                    objArr2[i10] = it.next();
                    if (i11 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i12 = ((i11 * 3) + 1) >>> 1;
                        if (i12 <= i11) {
                            i12 = 2147483645;
                            if (i11 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i12);
                        z8.g.e(objArr2, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i11] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i11);
                        z8.g.e(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i10 = i11;
                }
            } else if (objArr.length <= 0) {
                return objArr;
            } else {
                objArr[0] = null;
                return objArr;
            }
        } else if (objArr.length <= 0) {
            return objArr;
        } else {
            objArr[0] = null;
            return objArr;
        }
    }

    public static final String L(q8.d dVar) {
        String str;
        if (dVar instanceof kotlinx.coroutines.internal.c) {
            return dVar.toString();
        }
        try {
            str = dVar + '@' + x(dVar);
        } catch (Throwable th) {
            str = s(th);
        }
        Throwable a10 = n8.e.a(str);
        String str2 = str;
        if (a10 != null) {
            str2 = dVar.getClass().getName() + '@' + x(dVar);
        }
        return (String) str2;
    }

    public static final void k(StringBuilder sb, Object obj, y8.l lVar) {
        CharSequence charSequence;
        if (lVar != null) {
            obj = lVar.k(obj);
        } else {
            if (!(obj == null ? true : obj instanceof CharSequence)) {
                if (obj instanceof Character) {
                    sb.append(((Character) obj).charValue());
                    return;
                }
                charSequence = String.valueOf(obj);
                sb.append(charSequence);
            }
        }
        charSequence = (CharSequence) obj;
        sb.append(charSequence);
    }

    public static int l(int i10, int i11, int[] iArr) {
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else if (i15 <= i11) {
                return i14;
            } else {
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    public static int m(long[] jArr, int i10, long j8) {
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = (jArr[i13] > j8 ? 1 : (jArr[i13] == j8 ? 0 : -1));
            if (i14 < 0) {
                i12 = i13 + 1;
            } else if (i14 <= 0) {
                return i13;
            } else {
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static final u n(z zVar) {
        z8.g.f(zVar, "$this$buffer");
        return new u(zVar);
    }

    public static final v o(w9.b0 b0Var) {
        z8.g.f(b0Var, "$this$buffer");
        return new v(b0Var);
    }

    public static e p(int i10) {
        if (i10 == 0) {
            return new h();
        }
        if (i10 != 1) {
            return new h();
        }
        return new m6.d();
    }

    public static final q8.d q(y8.p pVar, Object obj, q8.d dVar) {
        z8.g.f(pVar, "<this>");
        z8.g.f(dVar, "completion");
        if (pVar instanceof s8.a) {
            return ((s8.a) pVar).a(obj, dVar);
        }
        q8.f b10 = dVar.b();
        return b10 == q8.g.f8275o ? new r8.d(pVar, obj, dVar) : new r8.e(dVar, b10, pVar, obj);
    }

    public static final s8.a r(y8.l lVar, q8.d dVar) {
        z8.g.f(lVar, "<this>");
        z8.g.f(dVar, "completion");
        if (!(lVar instanceof s8.a)) {
            q8.f b10 = dVar.b();
            if (b10 == q8.g.f8275o) {
                return new r8.b(lVar, dVar);
            }
            return new r8.c(dVar, b10, lVar);
        }
        s8.a aVar = (s8.a) lVar;
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public static final e.a s(Throwable th) {
        z8.g.f(th, "exception");
        return new e.a(th);
    }

    public static boolean t(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int u(View view, int i10) {
        return j6.b.b(i10, view.getContext(), view.getClass().getCanonicalName());
    }

    public static final int w(i8.a aVar, int i10) {
        z8.g.g(aVar, "$this$getDimenPixelSize");
        return aVar.getResources().getDimensionPixelSize(i10);
    }

    public static final String x(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static TextView y(Toolbar toolbar, CharSequence charSequence) {
        for (int i10 = 0; i10 < toolbar.getChildCount(); i10++) {
            View childAt = toolbar.getChildAt(i10);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    return textView;
                }
            }
        }
        return null;
    }

    public static final void z(q8.f fVar, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) fVar.get(CoroutineExceptionHandler.a.f6770o);
            if (coroutineExceptionHandler == null) {
                t.a(fVar, th);
            } else {
                coroutineExceptionHandler.handleException(fVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                p9.u.b(runtimeException, th);
                th = runtimeException;
            }
            t.a(fVar, th);
        }
    }

    public void a(q2.f fVar, s2.g gVar) {
    }

    public s2.w b(s2.w wVar, q2.h hVar) {
        a.b bVar;
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = ((d3.c) wVar.get()).f4151o.f4159a.f4161a.g().asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = m3.a.f7060a;
        if (asReadOnlyBuffer.isReadOnly() || !asReadOnlyBuffer.hasArray()) {
            bVar = null;
        } else {
            bVar = new a.b(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        }
        if (bVar != null && bVar.f7063a == 0 && bVar.f7064b == bVar.f7065c.length) {
            bArr = asReadOnlyBuffer.array();
        } else {
            ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
            asReadOnlyBuffer2.position(0);
            asReadOnlyBuffer2.get(bArr2);
            bArr = bArr2;
        }
        return new a3.b(bArr);
    }

    public l7.e c(q0.d dVar, JSONObject jSONObject) {
        long j8;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        JSONObject jSONObject2 = jSONObject.getJSONObject("fabric");
        JSONObject jSONObject3 = jSONObject.getJSONObject("app");
        boolean equals = "new".equals(jSONObject3.getString("status"));
        String string = jSONObject2.getString("bundle_id");
        jSONObject2.getString("org_id");
        if (!equals) {
            String.format(Locale.US, "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s", new Object[]{string});
        }
        Locale locale = Locale.US;
        String.format(locale, "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports", new Object[]{string});
        String.format(locale, "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps", new Object[]{string});
        jSONObject3.optBoolean("update_required", false);
        jSONObject3.optInt("report_upload_variant", 0);
        jSONObject3.optInt("native_report_upload_variant", 0);
        l7.a aVar = new l7.a();
        l7.c cVar = new l7.c(8);
        JSONObject jSONObject4 = jSONObject.getJSONObject("features");
        l7.b bVar = new l7.b(jSONObject4.optBoolean("collect_reports", true), jSONObject4.optBoolean("collect_anrs", false));
        long j10 = (long) optInt;
        if (jSONObject.has("expires_at")) {
            j8 = jSONObject.optLong("expires_at");
        } else {
            dVar.getClass();
            j8 = (j10 * 1000) + System.currentTimeMillis();
        }
        return new l7.e(j8, aVar, cVar, bVar);
    }

    public boolean d(Object obj, File file, q2.h hVar) {
        try {
            m3.a.b((ByteBuffer) obj, file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e10);
            }
            return false;
        }
    }

    public File e(q2.f fVar) {
        return null;
    }

    public Object f(s1.a aVar, float f10) {
        return Float.valueOf(m.d(aVar) * f10);
    }

    public void g() {
    }

    public void i(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", (Throwable) null);
        }
    }

    public byte[] j(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return bArr2;
    }

    public void v(float f10, float f11, m6.l lVar) {
        throw null;
    }

    public /* synthetic */ e(int i10) {
    }
}

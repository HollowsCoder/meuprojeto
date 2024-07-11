package s6;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.n1;
import com.google.android.gms.internal.clearcut.c3;
import com.google.android.gms.internal.clearcut.q0;
import com.google.android.gms.internal.clearcut.r;
import com.google.android.gms.internal.clearcut.r0;
import com.google.android.gms.internal.clearcut.u0;
import com.google.android.gms.internal.clearcut.v0;
import com.google.android.gms.internal.clearcut.v2;
import com.google.android.gms.internal.clearcut.w;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.f8;
import com.google.android.gms.internal.measurement.g6;
import com.google.android.gms.internal.measurement.i3;
import com.google.android.gms.internal.measurement.i6;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.gms.internal.measurement.j9;
import com.google.android.gms.internal.measurement.k5;
import com.google.android.gms.internal.measurement.l7;
import com.google.android.gms.internal.measurement.m6;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.p;
import com.google.android.gms.internal.measurement.p6;
import com.google.android.gms.internal.measurement.q8;
import com.google.android.gms.internal.measurement.t7;
import com.google.android.gms.internal.measurement.v3;
import com.google.android.gms.internal.measurement.w3;
import com.google.android.gms.internal.measurement.w7;
import com.google.android.gms.internal.measurement.x7;
import com.google.android.gms.internal.vision.q3;
import com.google.android.gms.internal.vision.s3;
import com.google.android.gms.internal.vision.w0;
import com.google.android.gms.internal.vision.w1;
import com.google.android.gms.internal.vision.z1;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.R;
import d7.j0;
import e3.b;
import f9.h;
import f9.l;
import h1.f;
import h5.d4;
import h5.e3;
import h5.g3;
import h5.r2;
import h5.s2;
import h5.u2;
import i9.k;
import i9.m;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.logging.Logger;
import m5.i;
import n1.c;
import p9.u;
import q0.d;
import r1.e;
import r1.o;
import r1.s;
import t1.g;
import w9.y;

public class a implements m5.a, i6, w1, b, r2, k, m {
    public static final byte[][] A = new byte[0][];
    public static final byte[] B = new byte[0];
    public static final w7 C = new w7();
    public static final x7 D = new x7();
    public static final q3 E = new q3();
    public static final s3 F = new s3();
    public static d G;
    public static final a H = new a();
    public static final a I = new a();
    public static final String[] J = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_background", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "firebase_campaign"};
    public static final String[] K = {"ad_impression"};
    public static final String[] L = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_ab", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_cmp"};
    public static final String[] M = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};
    public static final String[] N = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};
    public static final String[] O = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};
    public static final int[] P = {R.attr.cropAspectRatioX, R.attr.cropAspectRatioY, R.attr.cropAutoZoomEnabled, R.attr.cropBackgroundColor, R.attr.cropBorderCornerColor, R.attr.cropBorderCornerLength, R.attr.cropBorderCornerOffset, R.attr.cropBorderCornerThickness, R.attr.cropBorderLineColor, R.attr.cropBorderLineThickness, R.attr.cropFixAspectRatio, R.attr.cropFlipHorizontally, R.attr.cropFlipVertically, R.attr.cropGuidelines, R.attr.cropGuidelinesColor, R.attr.cropGuidelinesThickness, R.attr.cropInitialCropWindowPaddingRatio, R.attr.cropMaxCropResultHeightPX, R.attr.cropMaxCropResultWidthPX, R.attr.cropMaxZoom, R.attr.cropMinCropResultHeightPX, R.attr.cropMinCropResultWidthPX, R.attr.cropMinCropWindowHeight, R.attr.cropMinCropWindowWidth, R.attr.cropMultiTouchEnabled, R.attr.cropSaveBitmapToInstanceState, R.attr.cropScaleType, R.attr.cropShape, R.attr.cropShowCropOverlay, R.attr.cropShowProgressBar, R.attr.cropSnapRadius, R.attr.cropTouchRadius};
    public static final j0 Q = new j0("NO_DECISION");
    public static final int[] R = {R.attr.civ_border_color, R.attr.civ_border_overlay, R.attr.civ_border_width, R.attr.civ_circle_background_color};

    /* renamed from: o  reason: collision with root package name */
    public static final float[][] f8801o = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: p  reason: collision with root package name */
    public static final float[][] f8802p = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: q  reason: collision with root package name */
    public static final float[] f8803q = {95.047f, 100.0f, 108.883f};

    /* renamed from: r  reason: collision with root package name */
    public static final float[][] f8804r = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: s  reason: collision with root package name */
    public static final a f8805s = new a();

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f8806t = {16842755};
    public static final int[] u = {16842755};

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f8807v = {R.attr.defaultNavHost};
    public static final /* synthetic */ a w = new a();

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f8808x = new int[0];

    /* renamed from: y  reason: collision with root package name */
    public static final long[] f8809y = new long[0];
    public static final String[] z = new String[0];

    public static String A(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb.append(str2.charAt(i10));
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A0(com.google.android.gms.internal.measurement.t7 r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.measurement.e5 r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = d0(r8, r7, r0, r10)
            int r8 = r10.f2685a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.zza()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.j(r1, r2, r3, r4, r5)
            r6.l(r9)
            r10.f2687c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.measurement.p6 r6 = com.google.android.gms.internal.measurement.p6.a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.a.A0(com.google.android.gms.internal.measurement.t7, byte[], int, int, com.google.android.gms.internal.measurement.e5):int");
    }

    public static void B(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof n1) {
                    editorInfo.hintText = ((n1) parent).a();
                    return;
                }
            }
        }
    }

    public static int B0(t7 t7Var, byte[] bArr, int i10, int i11, int i12, e5 e5Var) {
        l7 l7Var = (l7) t7Var;
        Object zza = l7Var.zza();
        int u10 = l7Var.u(zza, bArr, i10, i11, i12, e5Var);
        l7Var.l(zza);
        e5Var.f2687c = zza;
        return u10;
    }

    public static n1.a C(s1.b bVar, f fVar) {
        return new n1.a(0, o.a(bVar, fVar, 1.0f, e.f8365o, false));
    }

    public static int C0(int i10, byte[] bArr, int i11, int i12, m6 m6Var, e5 e5Var) {
        g6 g6Var = (g6) m6Var;
        int U = U(bArr, i11, e5Var);
        while (true) {
            g6Var.h(e5Var.f2685a);
            if (U >= i12) {
                break;
            }
            int U2 = U(bArr, U, e5Var);
            if (i10 != e5Var.f2685a) {
                break;
            }
            U = U(bArr, U2, e5Var);
        }
        return U;
    }

    public static n1.b D(s1.a aVar, f fVar, boolean z10) {
        float f10;
        if (z10) {
            f10 = g.c();
        } else {
            f10 = 1.0f;
        }
        return new n1.b(o.a(aVar, fVar, f10, n.e.f7299s, false));
    }

    public static int D0(byte[] bArr, int i10, m6 m6Var, e5 e5Var) {
        g6 g6Var = (g6) m6Var;
        int U = U(bArr, i10, e5Var);
        int i11 = e5Var.f2685a + U;
        while (U < i11) {
            U = U(bArr, U, e5Var);
            g6Var.h(e5Var.f2685a);
        }
        if (U == i11) {
            return U;
        }
        throw p6.a();
    }

    public static n1.d E(s1.b bVar, f fVar) {
        return new n1.d(0, o.a(bVar, fVar, 1.0f, u.f8111o, false));
    }

    public static int E0(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static c F(s1.b bVar, f fVar) {
        return new c(1, o.a(bVar, fVar, g.c(), s.f8392o, true));
    }

    public static int F0(t7 t7Var, int i10, byte[] bArr, int i11, int i12, m6 m6Var, e5 e5Var) {
        int A0 = A0(t7Var, bArr, i11, i12, e5Var);
        while (true) {
            m6Var.add(e5Var.f2687c);
            if (A0 >= i12) {
                break;
            }
            int U = U(bArr, A0, e5Var);
            if (i10 != e5Var.f2685a) {
                break;
            }
            A0 = A0(t7Var, bArr, U, i12, e5Var);
        }
        return A0;
    }

    public static final Object G(Object obj) {
        return obj instanceof g9.o ? n.e.s(((g9.o) obj).f5034a) : obj;
    }

    public static int G0(int i10, byte[] bArr, int i11, int i12, f8 f8Var, e5 e5Var) {
        j5 j5Var;
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int k02 = k0(bArr, i11, e5Var);
                f8Var.c(i10, Long.valueOf(e5Var.f2686b));
                return k02;
            } else if (i13 == 1) {
                f8Var.c(i10, Long.valueOf(u0(i11, bArr)));
                return i11 + 8;
            } else if (i13 == 2) {
                int U = U(bArr, i11, e5Var);
                int i14 = e5Var.f2685a;
                if (i14 < 0) {
                    throw p6.b();
                } else if (i14 <= bArr.length - U) {
                    if (i14 == 0) {
                        j5Var = k5.f2770p;
                    } else {
                        j5Var = k5.t(bArr, U, i14);
                    }
                    f8Var.c(i10, j5Var);
                    return U + i14;
                } else {
                    throw p6.a();
                }
            } else if (i13 == 3) {
                int i15 = (i10 & -8) | 4;
                f8 a10 = f8.a();
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int U2 = U(bArr, i11, e5Var);
                    int i17 = e5Var.f2685a;
                    i16 = i17;
                    if (i17 == i15) {
                        i11 = U2;
                        break;
                    }
                    int G0 = G0(i16, bArr, U2, i12, a10, e5Var);
                    i16 = i17;
                    i11 = G0;
                }
                if (i11 > i12 || i16 != i15) {
                    throw p6.c();
                }
                f8Var.c(i10, a10);
                return i11;
            } else if (i13 == 5) {
                f8Var.c(i10, Integer.valueOf(o0(i11, bArr)));
                return i11 + 4;
            } else {
                throw new p6("Protocol message contained an invalid tag (zero).");
            }
        } else {
            throw new p6("Protocol message contained an invalid tag (zero).");
        }
    }

    public static final int H(y yVar, int i10) {
        int i11;
        z8.g.f(yVar, "$this$segment");
        int i12 = i10 + 1;
        int length = yVar.f9374s.length;
        int[] iArr = yVar.f9375t;
        z8.g.f(iArr, "$this$binarySearch");
        int i13 = length - 1;
        int i14 = 0;
        while (true) {
            if (i14 <= i13) {
                i11 = (i14 + i13) >>> 1;
                int i15 = iArr[i11];
                if (i15 >= i12) {
                    if (i15 <= i12) {
                        break;
                    }
                    i13 = i11 - 1;
                } else {
                    i14 = i11 + 1;
                }
            } else {
                i11 = (-i14) - 1;
                break;
            }
        }
        if (i11 >= 0) {
            return i11;
        }
        return ~i11;
    }

    public static final c9.a I(c9.a aVar, int i10) {
        boolean z10;
        z8.g.f(aVar, "<this>");
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Integer valueOf = Integer.valueOf(i10);
        z8.g.f(valueOf, "step");
        if (z10) {
            if (aVar.f2196q <= 0) {
                i10 = -i10;
            }
            return new c9.a(aVar.f2194o, aVar.f2195p, i10);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static final String J(String str) {
        boolean z10;
        InetAddress inetAddress;
        z8.g.f(str, "$this$toCanonicalHost");
        int i10 = 0;
        int i11 = -1;
        if (l.c0(str, ":")) {
            if (!h.a0(str, "[", false) || !str.endsWith("]")) {
                inetAddress = u(str, 0, str.length());
            } else {
                inetAddress = u(str, 1, str.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                int i12 = 0;
                int i13 = 0;
                while (i12 < address.length) {
                    int i14 = i12;
                    while (i14 < 16 && address[i14] == 0 && address[i14 + 1] == 0) {
                        i14 += 2;
                    }
                    int i15 = i14 - i12;
                    if (i15 > i13 && i15 >= 4) {
                        i11 = i12;
                        i13 = i15;
                    }
                    i12 = i14 + 2;
                }
                w9.f fVar = new w9.f();
                while (i10 < address.length) {
                    if (i10 == i11) {
                        fVar.M(58);
                        i10 += i13;
                        if (i10 == 16) {
                            fVar.M(58);
                        }
                    } else {
                        if (i10 > 0) {
                            fVar.M(58);
                        }
                        byte b10 = address[i10];
                        byte[] bArr = j9.c.f6602a;
                        fVar.T((long) (((b10 & 255) << 8) | (address[i10 + 1] & 255)));
                        i10 += 2;
                    }
                }
                return fVar.z();
            } else if (address.length == 4) {
                return inetAddress.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                z8.g.e(ascii, "IDN.toASCII(host)");
                Locale locale = Locale.US;
                z8.g.e(locale, "Locale.US");
                String lowerCase = ascii.toLowerCase(locale);
                z8.g.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return null;
                }
                int length = lowerCase.length();
                int i16 = 0;
                while (true) {
                    if (i16 >= length) {
                        break;
                    }
                    char charAt = lowerCase.charAt(i16);
                    if (z8.g.h(charAt, 31) <= 0) {
                        break;
                    } else if (z8.g.h(charAt, 127) >= 0) {
                        break;
                    } else if (l.g0(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                        break;
                    } else {
                        i16++;
                    }
                }
                i10 = 1;
                if (i10 != 0) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public static final c9.c K(int i10, int i11) {
        if (i11 > Integer.MIN_VALUE) {
            return new c9.c(i10, i11 - 1);
        }
        c9.c cVar = c9.c.f2201r;
        return c9.c.f2201r;
    }

    public static float N() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static int O(int i10, byte[] bArr, int i11, int i12, r rVar) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                return e0(bArr, i11, rVar);
            }
            if (i13 == 1) {
                return i11 + 8;
            }
            if (i13 == 2) {
                return S(bArr, i11, rVar) + rVar.f2534a;
            }
            if (i13 == 3) {
                int i14 = (i10 & -8) | 4;
                int i15 = 0;
                while (i11 < i12) {
                    i11 = S(bArr, i11, rVar);
                    i15 = rVar.f2534a;
                    if (i15 == i14) {
                        break;
                    }
                    i11 = O(i15, bArr, i11, i12, rVar);
                }
                if (i11 <= i12 && i15 == i14) {
                    return i11;
                }
                throw v0.b();
            } else if (i13 == 5) {
                return i11 + 4;
            } else {
                throw new v0("Protocol message contained an invalid tag (zero).");
            }
        } else {
            throw new v0("Protocol message contained an invalid tag (zero).");
        }
    }

    public static int P(int i10, byte[] bArr, int i11, int i12, u0 u0Var, r rVar) {
        q0 q0Var = (q0) u0Var;
        int S = S(bArr, i11, rVar);
        while (true) {
            q0Var.h(rVar.f2534a);
            if (S >= i12) {
                break;
            }
            int S2 = S(bArr, S, rVar);
            if (i10 != rVar.f2534a) {
                break;
            }
            S = S(bArr, S2, rVar);
        }
        return S;
    }

    public static int Q(int i10, byte[] bArr, int i11, int i12, v2 v2Var, r rVar) {
        w wVar;
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int e02 = e0(bArr, i11, rVar);
                v2Var.c(i10, Long.valueOf(rVar.f2535b));
                return e02;
            } else if (i13 == 1) {
                v2Var.c(i10, Long.valueOf(q0(i11, bArr)));
                return i11 + 8;
            } else if (i13 == 2) {
                int S = S(bArr, i11, rVar);
                int i14 = rVar.f2534a;
                if (i14 == 0) {
                    wVar = com.google.android.gms.internal.clearcut.u.f2544p;
                } else {
                    wVar = com.google.android.gms.internal.clearcut.u.m(bArr, S, i14);
                }
                v2Var.c(i10, wVar);
                return S + i14;
            } else if (i13 == 3) {
                v2 v2Var2 = new v2();
                int i15 = (i10 & -8) | 4;
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int S2 = S(bArr, i11, rVar);
                    int i17 = rVar.f2534a;
                    i16 = i17;
                    if (i17 == i15) {
                        i11 = S2;
                        break;
                    }
                    int Q2 = Q(i16, bArr, S2, i12, v2Var2, rVar);
                    i16 = i17;
                    i11 = Q2;
                }
                if (i11 > i12 || i16 != i15) {
                    throw v0.b();
                }
                v2Var.c(i10, v2Var2);
                return i11;
            } else if (i13 == 5) {
                v2Var.c(i10, Integer.valueOf(i0(i11, bArr)));
                return i11 + 4;
            } else {
                throw new v0("Protocol message contained an invalid tag (zero).");
            }
        } else {
            throw new v0("Protocol message contained an invalid tag (zero).");
        }
    }

    public static int R(int i10, byte[] bArr, int i11, r rVar) {
        int i12;
        int i13;
        int i14 = i10 & 127;
        int i15 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            i13 = b10 << 7;
        } else {
            int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 7);
            int i17 = i15 + 1;
            byte b11 = bArr[i15];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                i14 = i16 | ((b11 & Byte.MAX_VALUE) << 14);
                i15 = i17 + 1;
                byte b12 = bArr[i17];
                if (b12 >= 0) {
                    i13 = b12 << 21;
                } else {
                    i16 = i14 | ((b12 & Byte.MAX_VALUE) << 21);
                    i17 = i15 + 1;
                    byte b13 = bArr[i15];
                    if (b13 >= 0) {
                        i12 = b13 << 28;
                    } else {
                        int i18 = i16 | ((b13 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i19 = i17 + 1;
                            if (bArr[i17] >= 0) {
                                rVar.f2534a = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            rVar.f2534a = i16 | i12;
            return i17;
        }
        rVar.f2534a = i14 | i13;
        return i15;
    }

    public static int S(byte[] bArr, int i10, r rVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return R(b10, bArr, i11, rVar);
        }
        rVar.f2534a = b10;
        return i11;
    }

    public static int T(byte[] bArr, int i10, u0 u0Var, r rVar) {
        q0 q0Var = (q0) u0Var;
        int S = S(bArr, i10, rVar);
        int i11 = rVar.f2534a + S;
        while (S < i11) {
            S = S(bArr, S, rVar);
            q0Var.h(rVar.f2534a);
        }
        if (S == i11) {
            return S;
        }
        throw v0.a();
    }

    public static int U(byte[] bArr, int i10, e5 e5Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return d0(b10, bArr, i11, e5Var);
        }
        e5Var.f2685a = b10;
        return i11;
    }

    public static long V(long j8) {
        return (-(j8 & 1)) ^ (j8 >>> 1);
    }

    public static com.google.android.gms.internal.measurement.o W(Object obj) {
        if (obj == null) {
            return com.google.android.gms.internal.measurement.o.f2851b;
        }
        if (obj instanceof String) {
            return new com.google.android.gms.internal.measurement.r((String) obj);
        }
        if (obj instanceof Double) {
            return new com.google.android.gms.internal.measurement.h((Double) obj);
        }
        if (obj instanceof Long) {
            return new com.google.android.gms.internal.measurement.h(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new com.google.android.gms.internal.measurement.h(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new com.google.android.gms.internal.measurement.f((Boolean) obj);
        }
        throw new IllegalArgumentException("Invalid value type");
    }

    public static String X(Context context, String str) {
        n4.m.h(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = d4.a(context);
        }
        return d4.b(resources, "google_app_id", str);
    }

    public static String Y(w0 w0Var) {
        String str;
        androidx.lifecycle.r rVar = new androidx.lifecycle.r((Object) w0Var);
        StringBuilder sb = new StringBuilder(w0Var.p());
        int i10 = 0;
        while (true) {
            Object obj = rVar.f1404o;
            if (i10 >= ((w0) obj).p()) {
                return sb.toString();
            }
            int e10 = ((w0) obj).e(i10);
            if (e10 == 34) {
                str = "\\\"";
            } else if (e10 == 39) {
                str = "\\'";
            } else if (e10 != 92) {
                switch (e10) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (e10 < 32 || e10 > 126) {
                            sb.append('\\');
                            sb.append((char) (((e10 >>> 6) & 3) + 48));
                            sb.append((char) (((e10 >>> 3) & 7) + 48));
                            e10 = (e10 & 7) + 48;
                        }
                        sb.append((char) e10);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
            i10++;
        }
    }

    public static void Z(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
        if (!y0(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !y0(b12) && !y0(b13)) {
                byte b14 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                cArr[i10] = (char) ((b14 >>> 10) + 55232);
                cArr[i10 + 1] = (char) ((b14 & 1023) + 56320);
                return;
            }
        }
        throw z1.d();
    }

    public static void a0(byte b10, byte b11, byte b12, char[] cArr, int i10) {
        if (y0(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || y0(b12)))) {
            throw z1.d();
        }
        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002b, code lost:
        if (r0 == false) goto L_0x003f;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f A[Catch:{ all -> 0x00e1, SQLiteException -> 0x00e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ba A[Catch:{ all -> 0x00e1, SQLiteException -> 0x00e6 }, LOOP:1: B:30:0x00ba->B:35:0x00cc, LOOP_START, PHI: r14 
      PHI: (r14v1 int) = (r14v0 int), (r14v2 int) binds: [B:29:0x00b8, B:35:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d5 A[Catch:{ all -> 0x00e1, SQLiteException -> 0x00e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[Catch:{  }, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b0(h5.g3 r16, android.database.sqlite.SQLiteDatabase r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String[] r21) {
        /*
            r1 = r16
            r10 = r17
            r11 = r18
            r12 = r21
            h5.e3 r13 = r1.w
            r14 = 0
            r15 = 0
            java.lang.String r0 = "name"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch:{ SQLiteException -> 0x0033, all -> 0x0030 }
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0033, all -> 0x0030 }
            r6[r14] = r11     // Catch:{ SQLiteException -> 0x0033, all -> 0x0030 }
            java.lang.String r3 = "SQLITE_MASTER"
            java.lang.String r5 = "name=?"
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r17
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0033, all -> 0x0030 }
            boolean r0 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x002e }
            r2.close()
            if (r0 != 0) goto L_0x0044
            goto L_0x003f
        L_0x002e:
            r0 = move-exception
            goto L_0x0035
        L_0x0030:
            r0 = move-exception
            goto L_0x00f1
        L_0x0033:
            r0 = move-exception
            r2 = r15
        L_0x0035:
            java.lang.String r3 = "Error querying for table"
            r13.c(r11, r0, r3)     // Catch:{ all -> 0x00ef }
            if (r2 == 0) goto L_0x003f
            r2.close()
        L_0x003f:
            r2 = r19
            r10.execSQL(r2)
        L_0x0044:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ SQLiteException -> 0x00e6 }
            r0.<init>()     // Catch:{ SQLiteException -> 0x00e6 }
            int r2 = r18.length()     // Catch:{ SQLiteException -> 0x00e6 }
            int r2 = r2 + 22
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00e6 }
            r3.<init>(r2)     // Catch:{ SQLiteException -> 0x00e6 }
            java.lang.String r2 = "SELECT * FROM "
            r3.append(r2)     // Catch:{ SQLiteException -> 0x00e6 }
            r3.append(r11)     // Catch:{ SQLiteException -> 0x00e6 }
            java.lang.String r2 = " LIMIT 0"
            r3.append(r2)     // Catch:{ SQLiteException -> 0x00e6 }
            java.lang.String r2 = r3.toString()     // Catch:{ SQLiteException -> 0x00e6 }
            android.database.Cursor r2 = r10.rawQuery(r2, r15)     // Catch:{ SQLiteException -> 0x00e6 }
            java.lang.String[] r3 = r2.getColumnNames()     // Catch:{ all -> 0x00e1 }
            java.util.Collections.addAll(r0, r3)     // Catch:{ all -> 0x00e1 }
            r2.close()     // Catch:{ SQLiteException -> 0x00e6 }
            java.lang.String r2 = ","
            r3 = r20
            java.lang.String[] r2 = r3.split(r2)     // Catch:{ SQLiteException -> 0x00e6 }
            int r3 = r2.length     // Catch:{ SQLiteException -> 0x00e6 }
            r4 = r14
        L_0x007d:
            if (r4 >= r3) goto L_0x00b8
            r5 = r2[r4]     // Catch:{ SQLiteException -> 0x00e6 }
            boolean r6 = r0.remove(r5)     // Catch:{ SQLiteException -> 0x00e6 }
            if (r6 == 0) goto L_0x008a
            int r4 = r4 + 1
            goto L_0x007d
        L_0x008a:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x00e6 }
            int r2 = r18.length()     // Catch:{ SQLiteException -> 0x00e6 }
            int r2 = r2 + 35
            java.lang.String r3 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x00e6 }
            int r3 = r3.length()     // Catch:{ SQLiteException -> 0x00e6 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00e6 }
            r3.<init>(r2)     // Catch:{ SQLiteException -> 0x00e6 }
            java.lang.String r2 = "Table "
            r3.append(r2)     // Catch:{ SQLiteException -> 0x00e6 }
            r3.append(r11)     // Catch:{ SQLiteException -> 0x00e6 }
            java.lang.String r2 = " is missing required column: "
            r3.append(r2)     // Catch:{ SQLiteException -> 0x00e6 }
            r3.append(r5)     // Catch:{ SQLiteException -> 0x00e6 }
            java.lang.String r2 = r3.toString()     // Catch:{ SQLiteException -> 0x00e6 }
            r0.<init>(r2)     // Catch:{ SQLiteException -> 0x00e6 }
            throw r0     // Catch:{ SQLiteException -> 0x00e6 }
        L_0x00b8:
            if (r12 == 0) goto L_0x00cf
        L_0x00ba:
            int r2 = r12.length     // Catch:{ SQLiteException -> 0x00e6 }
            if (r14 >= r2) goto L_0x00cf
            r2 = r12[r14]     // Catch:{ SQLiteException -> 0x00e6 }
            boolean r2 = r0.remove(r2)     // Catch:{ SQLiteException -> 0x00e6 }
            if (r2 != 0) goto L_0x00cc
            int r2 = r14 + 1
            r2 = r12[r2]     // Catch:{ SQLiteException -> 0x00e6 }
            r10.execSQL(r2)     // Catch:{ SQLiteException -> 0x00e6 }
        L_0x00cc:
            int r14 = r14 + 2
            goto L_0x00ba
        L_0x00cf:
            boolean r2 = r0.isEmpty()     // Catch:{ SQLiteException -> 0x00e6 }
            if (r2 != 0) goto L_0x00e0
            java.lang.String r2 = "Table has extra columns. table, columns"
            java.lang.String r3 = ", "
            java.lang.String r0 = android.text.TextUtils.join(r3, r0)     // Catch:{ SQLiteException -> 0x00e6 }
            r13.c(r11, r0, r2)     // Catch:{ SQLiteException -> 0x00e6 }
        L_0x00e0:
            return
        L_0x00e1:
            r0 = move-exception
            r2.close()     // Catch:{ SQLiteException -> 0x00e6 }
            throw r0     // Catch:{ SQLiteException -> 0x00e6 }
        L_0x00e6:
            r0 = move-exception
            java.lang.String r2 = "Failed to verify columns on table that was just created"
            h5.e3 r1 = r1.f5397t
            r1.b(r11, r2)
            throw r0
        L_0x00ef:
            r0 = move-exception
            r15 = r2
        L_0x00f1:
            if (r15 == 0) goto L_0x00f6
            r15.close()
        L_0x00f6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.a.b0(h5.g3, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public static long c0(long j8) {
        return (-(j8 & 1)) ^ (j8 >>> 1);
    }

    public static int d0(int i10, byte[] bArr, int i11, e5 e5Var) {
        int i12;
        int i13;
        int i14 = i10 & 127;
        int i15 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            i13 = b10 << 7;
        } else {
            int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 7);
            int i17 = i15 + 1;
            byte b11 = bArr[i15];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                i14 = i16 | ((b11 & Byte.MAX_VALUE) << 14);
                i15 = i17 + 1;
                byte b12 = bArr[i17];
                if (b12 >= 0) {
                    i13 = b12 << 21;
                } else {
                    i16 = i14 | ((b12 & Byte.MAX_VALUE) << 21);
                    i17 = i15 + 1;
                    byte b13 = bArr[i15];
                    if (b13 >= 0) {
                        i12 = b13 << 28;
                    } else {
                        int i18 = i16 | ((b13 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i19 = i17 + 1;
                            if (bArr[i17] < 0) {
                                i17 = i19;
                            } else {
                                e5Var.f2685a = i18;
                                return i19;
                            }
                        }
                    }
                }
            }
            e5Var.f2685a = i16 | i12;
            return i17;
        }
        e5Var.f2685a = i14 | i13;
        return i15;
    }

    public static int e0(byte[] bArr, int i10, r rVar) {
        int i11 = i10 + 1;
        long j8 = (long) bArr[i10];
        if (j8 >= 0) {
            rVar.f2535b = j8;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j10 = (j8 & 127) | (((long) (b10 & Byte.MAX_VALUE)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j10 |= ((long) (b11 & Byte.MAX_VALUE)) << i13;
            int i15 = i14;
            b10 = b11;
            i12 = i15;
        }
        rVar.f2535b = j10;
        return i12;
    }

    public static float f(float f10) {
        return f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((double) ((f10 + 0.055f) / 1.055f), 2.4000000953674316d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.o f0(com.google.android.gms.internal.measurement.e r9, com.google.android.gms.internal.measurement.i3 r10, java.util.ArrayList r11, boolean r12) {
        /*
            java.lang.String r0 = "reduce"
            r1 = 1
            androidx.databinding.a.G(r0, r1, r11)
            r2 = 2
            androidx.databinding.a.I(r0, r2, r11)
            r0 = 0
            java.lang.Object r3 = r11.get(r0)
            com.google.android.gms.internal.measurement.o r3 = (com.google.android.gms.internal.measurement.o) r3
            com.google.android.gms.internal.measurement.o r3 = r10.a(r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.i
            if (r4 == 0) goto L_0x009f
            int r4 = r11.size()
            if (r4 != r2) goto L_0x0036
            java.lang.Object r11 = r11.get(r1)
            com.google.android.gms.internal.measurement.o r11 = (com.google.android.gms.internal.measurement.o) r11
            com.google.android.gms.internal.measurement.o r11 = r10.a(r11)
            boolean r4 = r11 instanceof com.google.android.gms.internal.measurement.g
            if (r4 != 0) goto L_0x002e
            goto L_0x003d
        L_0x002e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Failed to parse initial value"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            int r11 = r9.p()
            if (r11 == 0) goto L_0x0097
            r11 = 0
        L_0x003d:
            com.google.android.gms.internal.measurement.i r3 = (com.google.android.gms.internal.measurement.i) r3
            int r4 = r9.p()
            if (r12 == 0) goto L_0x0047
            r5 = r0
            goto L_0x0049
        L_0x0047:
            int r5 = r4 + -1
        L_0x0049:
            r6 = -1
            if (r12 == 0) goto L_0x004e
            int r4 = r4 + r6
            goto L_0x004f
        L_0x004e:
            r4 = r0
        L_0x004f:
            if (r1 == r12) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r6 = r1
        L_0x0053:
            if (r11 != 0) goto L_0x005a
            com.google.android.gms.internal.measurement.o r11 = r9.u(r5)
            goto L_0x0094
        L_0x005a:
            int r12 = r4 - r5
            int r12 = r12 * r6
            if (r12 < 0) goto L_0x0096
            boolean r12 = r9.w(r5)
            if (r12 == 0) goto L_0x0094
            r12 = 4
            com.google.android.gms.internal.measurement.o[] r12 = new com.google.android.gms.internal.measurement.o[r12]
            r12[r0] = r11
            com.google.android.gms.internal.measurement.o r11 = r9.u(r5)
            r12[r1] = r11
            com.google.android.gms.internal.measurement.h r11 = new com.google.android.gms.internal.measurement.h
            double r7 = (double) r5
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r11.<init>(r7)
            r12[r2] = r11
            r11 = 3
            r12[r11] = r9
            java.util.List r11 = java.util.Arrays.asList(r12)
            com.google.android.gms.internal.measurement.o r11 = r3.a(r10, r11)
            boolean r12 = r11 instanceof com.google.android.gms.internal.measurement.g
            if (r12 != 0) goto L_0x008c
            goto L_0x0094
        L_0x008c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Reduce operation failed"
            r9.<init>(r10)
            throw r9
        L_0x0094:
            int r5 = r5 + r6
            goto L_0x005a
        L_0x0096:
            return r11
        L_0x0097:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Empty array with no initial value error"
            r9.<init>(r10)
            throw r9
        L_0x009f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Callback should be a method"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.a.f0(com.google.android.gms.internal.measurement.e, com.google.android.gms.internal.measurement.i3, java.util.ArrayList, boolean):com.google.android.gms.internal.measurement.o");
    }

    public static float g(float f10) {
        return f10 <= 0.0031308f ? f10 * 12.92f : (float) ((Math.pow((double) f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static com.google.android.gms.internal.measurement.o g0(w3 w3Var) {
        if (w3Var == null) {
            return com.google.android.gms.internal.measurement.o.f2850a;
        }
        v3 v3Var = v3.UNKNOWN;
        int ordinal = w3Var.r().ordinal();
        if (ordinal == 0) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        List<w3> s10 = w3Var.s();
                        ArrayList arrayList = new ArrayList();
                        for (w3 g02 : s10) {
                            arrayList.add(g0(g02));
                        }
                        return new p(w3Var.t(), arrayList);
                    }
                    String valueOf = String.valueOf(w3Var);
                    throw new IllegalStateException(b0.d.g(new StringBuilder(valueOf.length() + 16), "Invalid entity: ", valueOf));
                } else if (w3Var.w()) {
                    return new com.google.android.gms.internal.measurement.f(Boolean.valueOf(w3Var.x()));
                } else {
                    return new com.google.android.gms.internal.measurement.f((Boolean) null);
                }
            } else if (w3Var.y()) {
                return new com.google.android.gms.internal.measurement.h(Double.valueOf(w3Var.z()));
            } else {
                return new com.google.android.gms.internal.measurement.h((Double) null);
            }
        } else if (w3Var.u()) {
            return new com.google.android.gms.internal.measurement.r(w3Var.v());
        } else {
            return com.google.android.gms.internal.measurement.o.f2856h;
        }
    }

    public static final void h(l9.a aVar, l9.c cVar, String str) {
        Logger logger = l9.d.f6996i;
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.f6994f);
        sb.append(' ');
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        z8.g.e(format, "java.lang.String.format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(aVar.f6988c);
        logger.fine(sb.toString());
    }

    public static void h0(g3 g3Var, SQLiteDatabase sQLiteDatabase) {
        File file = new File(sQLiteDatabase.getPath());
        boolean readable = file.setReadable(false, false);
        e3 e3Var = g3Var.w;
        if (!readable) {
            e3Var.a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            e3Var.a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            e3Var.a("Failed to turn on database read permission for owner");
        }
        if (!file.setWritable(true, true)) {
            e3Var.a("Failed to turn on database write permission for owner");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r0 = r2.getClass().getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void i(androidx.lifecycle.n r2, java.lang.StringBuilder r3) {
        /*
            if (r2 != 0) goto L_0x0005
            java.lang.String r2 = "null"
            goto L_0x0039
        L_0x0005:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            int r1 = r0.length()
            if (r1 > 0) goto L_0x0029
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            if (r1 <= 0) goto L_0x0029
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L_0x0029:
            r3.append(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r3.append(r0)
            int r2 = java.lang.System.identityHashCode(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
        L_0x0039:
            r3.append(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.a.i(androidx.lifecycle.n, java.lang.StringBuilder):void");
    }

    public static int i0(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int j0(byte[] bArr, int i10, r rVar) {
        int S = S(bArr, i10, rVar);
        int i11 = rVar.f2534a;
        if (i11 == 0) {
            rVar.f2536c = BuildConfig.FLAVOR;
            return S;
        }
        rVar.f2536c = new String(bArr, S, i11, r0.f2537a);
        return S + i11;
    }

    public static void k(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static int k0(byte[] bArr, int i10, e5 e5Var) {
        int i11 = i10 + 1;
        long j8 = (long) bArr[i10];
        if (j8 < 0) {
            int i12 = i11 + 1;
            byte b10 = bArr[i11];
            long j10 = (j8 & 127) | (((long) (b10 & Byte.MAX_VALUE)) << 7);
            int i13 = 7;
            while (b10 < 0) {
                int i14 = i12 + 1;
                byte b11 = bArr[i12];
                i13 += 7;
                j10 |= ((long) (b11 & Byte.MAX_VALUE)) << i13;
                int i15 = i14;
                b10 = b11;
                i12 = i15;
            }
            e5Var.f2686b = j10;
            return i12;
        }
        e5Var.f2686b = j8;
        return i11;
    }

    public static void l(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static com.google.android.gms.internal.measurement.e l0(com.google.android.gms.internal.measurement.e eVar, i3 i3Var, n nVar, Boolean bool, Boolean bool2) {
        com.google.android.gms.internal.measurement.e eVar2 = new com.google.android.gms.internal.measurement.e();
        Iterator<Integer> n10 = eVar.n();
        while (n10.hasNext()) {
            int intValue = n10.next().intValue();
            if (eVar.w(intValue)) {
                com.google.android.gms.internal.measurement.o a10 = nVar.a(i3Var, Arrays.asList(new com.google.android.gms.internal.measurement.o[]{eVar.u(intValue), new com.google.android.gms.internal.measurement.h(Double.valueOf((double) intValue)), eVar}));
                if (a10.c().equals(bool)) {
                    return eVar2;
                }
                if (bool2 == null || a10.c().equals(bool2)) {
                    eVar2.v(intValue, a10);
                }
            }
        }
        return eVar2;
    }

    public static void m(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static String m0(com.google.android.gms.internal.clearcut.u uVar) {
        String str;
        c1.r rVar = new c1.r(5, uVar);
        StringBuilder sb = new StringBuilder(((com.google.android.gms.internal.clearcut.u) rVar.f2129o).size());
        for (int i10 = 0; i10 < ((com.google.android.gms.internal.clearcut.u) rVar.f2129o).size(); i10++) {
            int n10 = ((com.google.android.gms.internal.clearcut.u) rVar.f2129o).n(i10);
            if (n10 == 34) {
                str = "\\\"";
            } else if (n10 == 39) {
                str = "\\'";
            } else if (n10 != 92) {
                switch (n10) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (n10 < 32 || n10 > 126) {
                            sb.append('\\');
                            sb.append((char) (((n10 >>> 6) & 3) + 48));
                            sb.append((char) (((n10 >>> 3) & 7) + 48));
                            n10 = (n10 & 7) + 48;
                        }
                        sb.append((char) n10);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static void n(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Argument must not be null");
        }
    }

    public static String n0(String str, String[] strArr, String[] strArr2) {
        int min = Math.min(strArr.length, strArr2.length);
        for (int i10 = 0; i10 < min; i10++) {
            String str2 = strArr[i10];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i10];
            }
        }
        return null;
    }

    public static void o(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int o0(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int p(Context context, String str, int i10, int i11, String str2) {
        boolean z10;
        int i12;
        if (context.checkPermission(str, i10, i11) == -1) {
            return -1;
        }
        String permissionToOp = AppOpsManager.permissionToOp(str);
        if (permissionToOp == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i11);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (myUid != i11 || !Objects.equals(packageName, str2)) {
            z10 = false;
        } else {
            z10 = true;
        }
        Class cls = AppOpsManager.class;
        if (!z10) {
            i12 = ((AppOpsManager) context.getSystemService(cls)).noteProxyOpNoThrow(permissionToOp, str2);
        } else if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager c10 = x.d.c(context);
            i12 = x.d.a(c10, permissionToOp, Binder.getCallingUid(), str2);
            if (i12 == 0) {
                i12 = x.d.a(c10, permissionToOp, i11, x.d.b(context));
            }
        } else {
            i12 = ((AppOpsManager) context.getSystemService(cls)).noteProxyOpNoThrow(permissionToOp, str2);
        }
        if (i12 == 0) {
            return 0;
        }
        return -2;
    }

    public static int p0(byte[] bArr, int i10, r rVar) {
        int S = S(bArr, i10, rVar);
        int i11 = rVar.f2534a;
        if (i11 == 0) {
            rVar.f2536c = BuildConfig.FLAVOR;
            return S;
        }
        int i12 = S + i11;
        if (c3.c(bArr, S, i12)) {
            rVar.f2536c = new String(bArr, S, i11, r0.f2537a);
            return i12;
        }
        throw v0.c();
    }

    public static int q(Context context, String str) {
        return p(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    public static long q0(int i10, byte[] bArr) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public static final void r(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            u.b(th, th2);
        }
    }

    public static double r0(int i10, byte[] bArr) {
        return Double.longBitsToDouble(q0(i10, bArr));
    }

    public static final int s(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static int s0(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static int t0(byte[] bArr, int i10, r rVar) {
        int S = S(bArr, i10, rVar);
        int i11 = rVar.f2534a;
        if (i11 == 0) {
            rVar.f2536c = com.google.android.gms.internal.clearcut.u.f2544p;
            return S;
        }
        rVar.f2536c = com.google.android.gms.internal.clearcut.u.m(bArr, S, i11);
        return S + i11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        r0 = r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.net.InetAddress u(java.lang.String r17, int r18, int r19) {
        /*
            r0 = r17
            r1 = r19
            r2 = 16
            byte[] r3 = new byte[r2]
            r4 = 0
            r5 = -1
            r6 = r18
            r7 = r4
            r8 = r5
            r9 = r8
        L_0x000f:
            r10 = 0
            if (r6 >= r1) goto L_0x00df
            if (r7 != r2) goto L_0x0015
            return r10
        L_0x0015:
            int r11 = r6 + 2
            r12 = 255(0xff, float:3.57E-43)
            r13 = 4
            if (r11 > r1) goto L_0x0033
            java.lang.String r14 = "::"
            boolean r14 = f9.h.Z(r6, r0, r14, r4)
            if (r14 == 0) goto L_0x0033
            if (r8 == r5) goto L_0x0027
            return r10
        L_0x0027:
            int r7 = r7 + 2
            if (r11 != r1) goto L_0x002f
            r0 = r2
            r8 = r7
            goto L_0x00e0
        L_0x002f:
            r8 = r7
            r9 = r11
            goto L_0x00ac
        L_0x0033:
            if (r7 == 0) goto L_0x00ab
            java.lang.String r11 = ":"
            boolean r11 = f9.h.Z(r6, r0, r11, r4)
            if (r11 == 0) goto L_0x0041
            int r6 = r6 + 1
            goto L_0x00ab
        L_0x0041:
            java.lang.String r11 = "."
            boolean r6 = f9.h.Z(r6, r0, r11, r4)
            if (r6 == 0) goto L_0x00aa
            int r6 = r7 + -2
            r11 = r6
        L_0x004c:
            if (r9 >= r1) goto L_0x009c
            if (r11 != r2) goto L_0x0052
        L_0x0050:
            r0 = r4
            goto L_0x00a2
        L_0x0052:
            if (r11 == r6) goto L_0x005f
            char r14 = r0.charAt(r9)
            r15 = 46
            if (r14 == r15) goto L_0x005d
            goto L_0x0050
        L_0x005d:
            int r9 = r9 + 1
        L_0x005f:
            r15 = r4
            r14 = r9
        L_0x0061:
            if (r14 >= r1) goto L_0x008b
            char r4 = r0.charAt(r14)
            r2 = 48
            int r16 = z8.g.h(r4, r2)
            if (r16 < 0) goto L_0x008b
            r5 = 57
            int r5 = z8.g.h(r4, r5)
            if (r5 <= 0) goto L_0x0078
            goto L_0x008b
        L_0x0078:
            if (r15 != 0) goto L_0x007d
            if (r9 == r14) goto L_0x007d
            goto L_0x00a1
        L_0x007d:
            int r15 = r15 * 10
            int r15 = r15 + r4
            int r15 = r15 - r2
            if (r15 <= r12) goto L_0x0084
            goto L_0x00a1
        L_0x0084:
            int r14 = r14 + 1
            r2 = 16
            r4 = 0
            r5 = -1
            goto L_0x0061
        L_0x008b:
            int r2 = r14 - r9
            if (r2 != 0) goto L_0x0090
            goto L_0x00a1
        L_0x0090:
            int r2 = r11 + 1
            byte r4 = (byte) r15
            r3[r11] = r4
            r11 = r2
            r9 = r14
            r2 = 16
            r4 = 0
            r5 = -1
            goto L_0x004c
        L_0x009c:
            int r6 = r6 + r13
            if (r11 != r6) goto L_0x00a1
            r0 = 1
            goto L_0x00a2
        L_0x00a1:
            r0 = 0
        L_0x00a2:
            if (r0 != 0) goto L_0x00a5
            return r10
        L_0x00a5:
            int r7 = r7 + 2
            r0 = 16
            goto L_0x00e0
        L_0x00aa:
            return r10
        L_0x00ab:
            r9 = r6
        L_0x00ac:
            r6 = r9
            r2 = 0
        L_0x00ae:
            if (r6 >= r1) goto L_0x00c2
            char r4 = r0.charAt(r6)
            int r4 = j9.c.p(r4)
            r5 = -1
            if (r4 != r5) goto L_0x00bc
            goto L_0x00c2
        L_0x00bc:
            int r2 = r2 << 4
            int r2 = r2 + r4
            int r6 = r6 + 1
            goto L_0x00ae
        L_0x00c2:
            int r4 = r6 - r9
            if (r4 == 0) goto L_0x00de
            if (r4 <= r13) goto L_0x00c9
            goto L_0x00de
        L_0x00c9:
            int r4 = r7 + 1
            int r5 = r2 >>> 8
            r5 = r5 & r12
            byte r5 = (byte) r5
            r3[r7] = r5
            int r7 = r4 + 1
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r4] = r2
            r2 = 16
            r4 = 0
            r5 = -1
            goto L_0x000f
        L_0x00de:
            return r10
        L_0x00df:
            r0 = r2
        L_0x00e0:
            if (r7 == r0) goto L_0x00f5
            r1 = -1
            if (r8 != r1) goto L_0x00e6
            return r10
        L_0x00e6:
            int r1 = r7 - r8
            int r2 = 16 - r1
            java.lang.System.arraycopy(r3, r8, r3, r2, r1)
            int r2 = 16 - r7
            int r2 = r2 + r8
            r0 = 0
            byte r0 = (byte) r0
            java.util.Arrays.fill(r3, r8, r2, r0)
        L_0x00f5:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.a.u(java.lang.String, int, int):java.net.InetAddress");
    }

    public static long u0(int i10, byte[] bArr) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public static int v(float f10, int i10, int i11) {
        if (i10 == i11) {
            return i10;
        }
        float f11 = ((float) ((i10 >> 24) & 255)) / 255.0f;
        float f12 = f(((float) ((i10 >> 16) & 255)) / 255.0f);
        float f13 = f(((float) ((i10 >> 8) & 255)) / 255.0f);
        float f14 = f(((float) (i10 & 255)) / 255.0f);
        float f15 = f(((float) ((i11 >> 16) & 255)) / 255.0f);
        float f16 = f(((float) ((i11 >> 8) & 255)) / 255.0f);
        float f17 = f(((float) (i11 & 255)) / 255.0f);
        float a10 = b0.d.a(((float) ((i11 >> 24) & 255)) / 255.0f, f11, f10, f11);
        float a11 = b0.d.a(f15, f12, f10, f12);
        float a12 = b0.d.a(f16, f13, f10, f13);
        float a13 = b0.d.a(f17, f14, f10, f14);
        int round = Math.round(g(a11) * 255.0f) << 16;
        return Math.round(g(a13) * 255.0f) | round | (Math.round(a10 * 255.0f) << 24) | (Math.round(g(a12) * 255.0f) << 8);
    }

    public static float v0(int i10, byte[] bArr) {
        return Float.intBitsToFloat(i0(i10, bArr));
    }

    public static final String w(long j8) {
        StringBuilder sb;
        long j10;
        StringBuilder sb2;
        long j11;
        StringBuilder sb3;
        long j12;
        if (j8 <= ((long) -999500000)) {
            sb = new StringBuilder();
            j10 = j8 - ((long) 500000000);
        } else {
            if (j8 <= ((long) -999500)) {
                sb2 = new StringBuilder();
                j11 = j8 - ((long) 500000);
            } else {
                if (j8 <= 0) {
                    sb3 = new StringBuilder();
                    j12 = j8 - ((long) 500);
                } else if (j8 < ((long) 999500)) {
                    sb3 = new StringBuilder();
                    j12 = j8 + ((long) 500);
                } else if (j8 < ((long) 999500000)) {
                    sb2 = new StringBuilder();
                    j11 = j8 + ((long) 500000);
                } else {
                    sb = new StringBuilder();
                    j10 = j8 + ((long) 500000000);
                }
                sb3.append(j12 / ((long) 1000));
                sb3.append(" µs");
                String format = String.format("%6s", Arrays.copyOf(new Object[]{sb3.toString()}, 1));
                z8.g.e(format, "java.lang.String.format(format, *args)");
                return format;
            }
            sb3.append(j11 / ((long) 1000000));
            sb3.append(" ms");
            String format2 = String.format("%6s", Arrays.copyOf(new Object[]{sb3.toString()}, 1));
            z8.g.e(format2, "java.lang.String.format(format, *args)");
            return format2;
        }
        sb3.append(j10 / ((long) 1000000000));
        sb3.append(" s ");
        String format22 = String.format("%6s", Arrays.copyOf(new Object[]{sb3.toString()}, 1));
        z8.g.e(format22, "java.lang.String.format(format, *args)");
        return format22;
    }

    public static int w0(byte[] bArr, int i10, e5 e5Var) {
        int U = U(bArr, i10, e5Var);
        int i11 = e5Var.f2685a;
        if (i11 < 0) {
            throw p6.b();
        } else if (i11 == 0) {
            e5Var.f2687c = BuildConfig.FLAVOR;
            return U;
        } else {
            e5Var.f2687c = new String(bArr, U, i11, n6.f2844a);
            return U + i11;
        }
    }

    public static boolean x(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static int x0(byte[] bArr, int i10, e5 e5Var) {
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        int U = U(bArr, i10, e5Var);
        int i13 = e5Var.f2685a;
        if (i13 < 0) {
            throw p6.b();
        } else if (i13 == 0) {
            e5Var.f2687c = BuildConfig.FLAVOR;
            return U;
        } else {
            r2.a aVar = q8.f2897a;
            int length = bArr.length;
            if ((U | i13 | ((length - U) - i13)) >= 0) {
                int i14 = U + i13;
                char[] cArr = new char[i13];
                int i15 = 0;
                while (i11 < i14) {
                    byte b10 = bArr[i11];
                    if (b10 >= 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        break;
                    }
                    U = i11 + 1;
                    cArr[i12] = (char) b10;
                    i15 = i12 + 1;
                }
                while (i11 < i14) {
                    int i16 = i11 + 1;
                    byte b11 = bArr[i11];
                    if (b11 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        int i17 = i12 + 1;
                        cArr[i12] = (char) b11;
                        i11 = i16;
                        while (true) {
                            i12 = i17;
                            if (i11 >= i14) {
                                break;
                            }
                            byte b12 = bArr[i11];
                            if (b12 >= 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                break;
                            }
                            i11++;
                            i17 = i12 + 1;
                            cArr[i12] = (char) b12;
                        }
                    } else if (b11 < -32) {
                        if (i16 < i14) {
                            int i18 = i16 + 1;
                            int i19 = i12 + 1;
                            byte b13 = bArr[i16];
                            if (b11 < -62 || androidx.databinding.a.L(b13)) {
                                throw p6.d();
                            }
                            cArr[i12] = (char) (((b11 & 31) << 6) | (b13 & 63));
                            i11 = i18;
                            i12 = i19;
                        } else {
                            throw p6.d();
                        }
                    } else if (b11 < -16) {
                        if (i16 < i14 - 1) {
                            int i20 = i16 + 1;
                            int i21 = i20 + 1;
                            int i22 = i12 + 1;
                            byte b14 = bArr[i16];
                            byte b15 = bArr[i20];
                            if (!androidx.databinding.a.L(b14)) {
                                if (b11 == -32) {
                                    if (b14 >= -96) {
                                        b11 = -32;
                                    }
                                }
                                if (b11 == -19) {
                                    if (b14 < -96) {
                                        b11 = -19;
                                    }
                                }
                                if (!androidx.databinding.a.L(b15)) {
                                    cArr[i12] = (char) (((b11 & 15) << 12) | ((b14 & 63) << 6) | (b15 & 63));
                                    i11 = i21;
                                    i12 = i22;
                                }
                            }
                            throw p6.d();
                        }
                        throw p6.d();
                    } else if (i16 < i14 - 2) {
                        int i23 = i16 + 1;
                        int i24 = i23 + 1;
                        int i25 = i24 + 1;
                        byte b16 = bArr[i16];
                        byte b17 = bArr[i23];
                        byte b18 = bArr[i24];
                        if (!androidx.databinding.a.L(b16)) {
                            if ((((b16 + 112) + (b11 << 28)) >> 30) == 0 && !androidx.databinding.a.L(b17) && !androidx.databinding.a.L(b18)) {
                                byte b19 = ((b11 & 7) << 18) | ((b16 & 63) << 12) | ((b17 & 63) << 6) | (b18 & 63);
                                cArr[i12] = (char) ((b19 >>> 10) + 55232);
                                cArr[i12 + 1] = (char) ((b19 & 1023) + 56320);
                                i12 += 2;
                                i11 = i25;
                            }
                        }
                        throw p6.d();
                    } else {
                        throw p6.d();
                    }
                }
                e5Var.f2687c = new String(cArr, 0, i12);
                return i14;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(U), Integer.valueOf(i13)}));
        }
    }

    public static final boolean y(w9.f fVar) {
        long j8;
        z8.g.g(fVar, "$this$isProbablyUtf8");
        try {
            w9.f fVar2 = new w9.f();
            long j10 = fVar.f9325p;
            if (j10 > 64) {
                j8 = 64;
            } else {
                j8 = j10;
            }
            fVar.l(fVar2, 0, j8);
            for (int i10 = 0; i10 < 16; i10++) {
                if (fVar2.F()) {
                    return true;
                }
                int E2 = fVar2.E();
                if (Character.isISOControl(E2) && !Character.isWhitespace(E2)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean y0(byte b10) {
        return b10 > -65;
    }

    public static float z(int i10) {
        float f10 = ((float) i10) / 255.0f;
        return (f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((double) ((f10 + 0.055f) / 1.055f), 2.4000000953674316d)) * 100.0f;
    }

    public static int z0(byte[] bArr, int i10, e5 e5Var) {
        int U = U(bArr, i10, e5Var);
        int i11 = e5Var.f2685a;
        if (i11 < 0) {
            throw p6.b();
        } else if (i11 > bArr.length - U) {
            throw p6.a();
        } else if (i11 == 0) {
            e5Var.f2687c = k5.f2770p;
            return U;
        } else {
            e5Var.f2687c = k5.t(bArr, U, i11);
            return U + i11;
        }
    }

    public void L(String str) {
        if (j(2)) {
            Log.v("FirebaseCrashlytics", str, (Throwable) null);
        }
    }

    public void M(String str, Exception exc) {
        if (j(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }

    public void a(i9.r rVar, List list) {
        z8.g.f(rVar, "url");
    }

    public s2.w b(s2.w wVar, q2.h hVar) {
        return wVar;
    }

    public Object c(i iVar) {
        Object obj = b8.h.f2022b;
        return 403;
    }

    public List d(String str) {
        z8.g.f(str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            z8.g.e(allByName, "InetAddress.getAllByName(hostname)");
            int length = allByName.length;
            if (length == 0) {
                return o8.k.f7764o;
            }
            if (length != 1) {
                return new ArrayList(new o8.d(allByName, false));
            }
            return u.l(allByName[0]);
        } catch (NullPointerException e10) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e10);
            throw unknownHostException;
        }
    }

    public void e(i9.r rVar) {
        z8.g.f(rVar, "url");
    }

    public boolean j(int i10) {
        return 4 <= i10 || Log.isLoggable("FirebaseCrashlytics", i10);
    }

    public void t(String str) {
        if (j(3)) {
            Log.d("FirebaseCrashlytics", str, (Throwable) null);
        }
    }

    public Object zza() {
        List<s2<?>> list = u2.f5707a;
        return Long.valueOf(j9.f2758p.zza().zza());
    }
}

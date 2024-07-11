package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.karumi.dexter.R;
import java.util.ArrayList;
import java.util.HashMap;
import p9.u;
import q.e;
import q.f;
import q.g;
import q.j;
import q.k;
import r.b;
import t.d;

public class ConstraintLayout extends ViewGroup {
    public static d D;
    public HashMap<String, Integer> A = new HashMap<>();
    public final SparseArray<e> B = new SparseArray<>();
    public final c C = new c(this);

    /* renamed from: o  reason: collision with root package name */
    public final SparseArray<View> f770o = new SparseArray<>();

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList<b> f771p = new ArrayList<>(4);

    /* renamed from: q  reason: collision with root package name */
    public final f f772q = new f();

    /* renamed from: r  reason: collision with root package name */
    public int f773r = 0;

    /* renamed from: s  reason: collision with root package name */
    public int f774s = 0;

    /* renamed from: t  reason: collision with root package name */
    public int f775t = Integer.MAX_VALUE;
    public int u = Integer.MAX_VALUE;

    /* renamed from: v  reason: collision with root package name */
    public boolean f776v = true;
    public int w = 257;

    /* renamed from: x  reason: collision with root package name */
    public c f777x = null;

    /* renamed from: y  reason: collision with root package name */
    public t.a f778y = null;
    public int z = -1;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f779a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                q.e$b[] r0 = q.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f779a = r0
                q.e$b r1 = q.e.b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f779a     // Catch:{ NoSuchFieldError -> 0x001d }
                q.e$b r1 = q.e.b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f779a     // Catch:{ NoSuchFieldError -> 0x0028 }
                q.e$b r1 = q.e.b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f779a     // Catch:{ NoSuchFieldError -> 0x0033 }
                q.e$b r1 = q.e.b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.<clinit>():void");
        }
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public int A = Integer.MIN_VALUE;
        public final int B = Integer.MIN_VALUE;
        public final int C = 0;
        public float D = 0.5f;
        public float E = 0.5f;
        public String F = null;
        public float G = -1.0f;
        public float H = -1.0f;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = 0;
        public int P = 0;
        public float Q = 1.0f;
        public float R = 1.0f;
        public int S = -1;
        public int T = -1;
        public int U = -1;
        public boolean V = false;
        public boolean W = false;
        public String X = null;
        public int Y = 0;
        public boolean Z = true;

        /* renamed from: a  reason: collision with root package name */
        public int f780a = -1;

        /* renamed from: a0  reason: collision with root package name */
        public boolean f781a0 = true;

        /* renamed from: b  reason: collision with root package name */
        public int f782b = -1;

        /* renamed from: b0  reason: collision with root package name */
        public boolean f783b0 = false;

        /* renamed from: c  reason: collision with root package name */
        public float f784c = -1.0f;

        /* renamed from: c0  reason: collision with root package name */
        public boolean f785c0 = false;
        public int d = -1;

        /* renamed from: d0  reason: collision with root package name */
        public boolean f786d0 = false;

        /* renamed from: e  reason: collision with root package name */
        public int f787e = -1;

        /* renamed from: e0  reason: collision with root package name */
        public boolean f788e0 = false;

        /* renamed from: f  reason: collision with root package name */
        public int f789f = -1;

        /* renamed from: f0  reason: collision with root package name */
        public int f790f0 = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f791g = -1;

        /* renamed from: g0  reason: collision with root package name */
        public int f792g0 = -1;

        /* renamed from: h  reason: collision with root package name */
        public int f793h = -1;

        /* renamed from: h0  reason: collision with root package name */
        public int f794h0 = -1;

        /* renamed from: i  reason: collision with root package name */
        public int f795i = -1;

        /* renamed from: i0  reason: collision with root package name */
        public int f796i0 = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f797j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public int f798j0 = Integer.MIN_VALUE;

        /* renamed from: k  reason: collision with root package name */
        public int f799k = -1;

        /* renamed from: k0  reason: collision with root package name */
        public int f800k0 = Integer.MIN_VALUE;
        public int l = -1;

        /* renamed from: l0  reason: collision with root package name */
        public float f801l0 = 0.5f;

        /* renamed from: m  reason: collision with root package name */
        public int f802m = -1;

        /* renamed from: m0  reason: collision with root package name */
        public int f803m0;

        /* renamed from: n  reason: collision with root package name */
        public int f804n = -1;

        /* renamed from: n0  reason: collision with root package name */
        public int f805n0;

        /* renamed from: o  reason: collision with root package name */
        public int f806o = -1;

        /* renamed from: o0  reason: collision with root package name */
        public float f807o0;

        /* renamed from: p  reason: collision with root package name */
        public int f808p = 0;

        /* renamed from: p0  reason: collision with root package name */
        public e f809p0 = new e();

        /* renamed from: q  reason: collision with root package name */
        public float f810q = 0.0f;

        /* renamed from: r  reason: collision with root package name */
        public int f811r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f812s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f813t = -1;
        public int u = -1;

        /* renamed from: v  reason: collision with root package name */
        public final int f814v = Integer.MIN_VALUE;
        public int w = Integer.MIN_VALUE;

        /* renamed from: x  reason: collision with root package name */
        public final int f815x = Integer.MIN_VALUE;

        /* renamed from: y  reason: collision with root package name */
        public int f816y = Integer.MIN_VALUE;
        public int z = Integer.MIN_VALUE;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f817a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f817a = sparseIntArray;
                sparseIntArray.append(97, 64);
                sparseIntArray.append(74, 65);
                sparseIntArray.append(83, 8);
                sparseIntArray.append(84, 9);
                sparseIntArray.append(86, 10);
                sparseIntArray.append(87, 11);
                sparseIntArray.append(93, 12);
                sparseIntArray.append(92, 13);
                sparseIntArray.append(64, 14);
                sparseIntArray.append(63, 15);
                sparseIntArray.append(59, 16);
                sparseIntArray.append(61, 52);
                sparseIntArray.append(60, 53);
                sparseIntArray.append(65, 2);
                sparseIntArray.append(67, 3);
                sparseIntArray.append(66, 4);
                sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 49);
                sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceListItem, 50);
                sparseIntArray.append(71, 5);
                sparseIntArray.append(72, 6);
                sparseIntArray.append(73, 7);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(88, 17);
                sparseIntArray.append(89, 18);
                sparseIntArray.append(70, 19);
                sparseIntArray.append(69, 20);
                sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 21);
                sparseIntArray.append(R.styleable.AppCompatTheme_textColorAlertDialogListItem, 22);
                sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, 23);
                sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceListItemSmall, 24);
                sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, 25);
                sparseIntArray.append(R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 26);
                sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 55);
                sparseIntArray.append(R.styleable.AppCompatTheme_textColorSearchUrl, 54);
                sparseIntArray.append(79, 29);
                sparseIntArray.append(94, 30);
                sparseIntArray.append(68, 44);
                sparseIntArray.append(81, 45);
                sparseIntArray.append(96, 46);
                sparseIntArray.append(80, 47);
                sparseIntArray.append(95, 48);
                sparseIntArray.append(57, 27);
                sparseIntArray.append(56, 28);
                sparseIntArray.append(98, 31);
                sparseIntArray.append(75, 32);
                sparseIntArray.append(100, 33);
                sparseIntArray.append(99, 34);
                sparseIntArray.append(R.styleable.AppCompatTheme_switchStyle, 35);
                sparseIntArray.append(77, 36);
                sparseIntArray.append(76, 37);
                sparseIntArray.append(78, 38);
                sparseIntArray.append(82, 39);
                sparseIntArray.append(91, 40);
                sparseIntArray.append(85, 41);
                sparseIntArray.append(62, 42);
                sparseIntArray.append(58, 43);
                sparseIntArray.append(90, 51);
                sparseIntArray.append(R.styleable.AppCompatTheme_toolbarStyle, 66);
            }
        }

        public b() {
            super(-2, -2);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0148, code lost:
            android.util.Log.e("ConstraintLayout", r5);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(android.content.Context r10, android.util.AttributeSet r11) {
            /*
                r9 = this;
                r9.<init>(r10, r11)
                r0 = -1
                r9.f780a = r0
                r9.f782b = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r9.f784c = r1
                r9.d = r0
                r9.f787e = r0
                r9.f789f = r0
                r9.f791g = r0
                r9.f793h = r0
                r9.f795i = r0
                r9.f797j = r0
                r9.f799k = r0
                r9.l = r0
                r9.f802m = r0
                r9.f804n = r0
                r9.f806o = r0
                r2 = 0
                r9.f808p = r2
                r3 = 0
                r9.f810q = r3
                r9.f811r = r0
                r9.f812s = r0
                r9.f813t = r0
                r9.u = r0
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r9.f814v = r4
                r9.w = r4
                r9.f815x = r4
                r9.f816y = r4
                r9.z = r4
                r9.A = r4
                r9.B = r4
                r9.C = r2
                r5 = 1056964608(0x3f000000, float:0.5)
                r9.D = r5
                r9.E = r5
                r6 = 0
                r9.F = r6
                r9.G = r1
                r9.H = r1
                r9.I = r2
                r9.J = r2
                r9.K = r2
                r9.L = r2
                r9.M = r2
                r9.N = r2
                r9.O = r2
                r9.P = r2
                r1 = 1065353216(0x3f800000, float:1.0)
                r9.Q = r1
                r9.R = r1
                r9.S = r0
                r9.T = r0
                r9.U = r0
                r9.V = r2
                r9.W = r2
                r9.X = r6
                r9.Y = r2
                r1 = 1
                r9.Z = r1
                r9.f781a0 = r1
                r9.f783b0 = r2
                r9.f785c0 = r2
                r9.f786d0 = r2
                r9.f788e0 = r2
                r9.f790f0 = r0
                r9.f792g0 = r0
                r9.f794h0 = r0
                r9.f796i0 = r0
                r9.f798j0 = r4
                r9.f800k0 = r4
                r9.f801l0 = r5
                q.e r4 = new q.e
                r4.<init>()
                r9.f809p0 = r4
                int[] r4 = p9.u.W
                android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r4)
                int r11 = r10.getIndexCount()
                r4 = r2
            L_0x00a2:
                if (r4 >= r11) goto L_0x0382
                int r5 = r10.getIndex(r4)
                android.util.SparseIntArray r6 = androidx.constraintlayout.widget.ConstraintLayout.b.a.f817a
                int r6 = r6.get(r5)
                r7 = 2
                r8 = -2
                switch(r6) {
                    case 1: goto L_0x02ed;
                    case 2: goto L_0x02db;
                    case 3: goto L_0x02d1;
                    case 4: goto L_0x02bb;
                    case 5: goto L_0x02b1;
                    case 6: goto L_0x02a7;
                    case 7: goto L_0x029d;
                    case 8: goto L_0x028b;
                    case 9: goto L_0x0279;
                    case 10: goto L_0x0267;
                    case 11: goto L_0x0255;
                    case 12: goto L_0x0243;
                    case 13: goto L_0x0231;
                    case 14: goto L_0x021f;
                    case 15: goto L_0x020d;
                    case 16: goto L_0x01fb;
                    case 17: goto L_0x01e9;
                    case 18: goto L_0x01d7;
                    case 19: goto L_0x01c5;
                    case 20: goto L_0x01b3;
                    case 21: goto L_0x01a9;
                    case 22: goto L_0x019f;
                    case 23: goto L_0x0195;
                    case 24: goto L_0x018b;
                    case 25: goto L_0x0181;
                    case 26: goto L_0x0177;
                    case 27: goto L_0x016d;
                    case 28: goto L_0x0163;
                    case 29: goto L_0x0159;
                    case 30: goto L_0x014f;
                    case 31: goto L_0x013e;
                    case 32: goto L_0x0133;
                    case 33: goto L_0x011d;
                    case 34: goto L_0x0107;
                    case 35: goto L_0x00f7;
                    case 36: goto L_0x00e1;
                    case 37: goto L_0x00cb;
                    case 38: goto L_0x00bb;
                    default: goto L_0x00b3;
                }
            L_0x00b3:
                switch(r6) {
                    case 44: goto L_0x0366;
                    case 45: goto L_0x035d;
                    case 46: goto L_0x0354;
                    case 47: goto L_0x034d;
                    case 48: goto L_0x0346;
                    case 49: goto L_0x033d;
                    case 50: goto L_0x0334;
                    case 51: goto L_0x032d;
                    case 52: goto L_0x031c;
                    case 53: goto L_0x030b;
                    case 54: goto L_0x0301;
                    case 55: goto L_0x02f7;
                    default: goto L_0x00b6;
                }
            L_0x00b6:
                switch(r6) {
                    case 64: goto L_0x037b;
                    case 65: goto L_0x0377;
                    case 66: goto L_0x036e;
                    default: goto L_0x00b9;
                }
            L_0x00b9:
                goto L_0x037e
            L_0x00bb:
                float r6 = r9.R
                float r5 = r10.getFloat(r5, r6)
                float r5 = java.lang.Math.max(r3, r5)
                r9.R = r5
                r9.L = r7
                goto L_0x037e
            L_0x00cb:
                int r6 = r9.P     // Catch:{ Exception -> 0x00d5 }
                int r6 = r10.getDimensionPixelSize(r5, r6)     // Catch:{ Exception -> 0x00d5 }
                r9.P = r6     // Catch:{ Exception -> 0x00d5 }
                goto L_0x037e
            L_0x00d5:
                int r6 = r9.P
                int r5 = r10.getInt(r5, r6)
                if (r5 != r8) goto L_0x037e
                r9.P = r8
                goto L_0x037e
            L_0x00e1:
                int r6 = r9.N     // Catch:{ Exception -> 0x00eb }
                int r6 = r10.getDimensionPixelSize(r5, r6)     // Catch:{ Exception -> 0x00eb }
                r9.N = r6     // Catch:{ Exception -> 0x00eb }
                goto L_0x037e
            L_0x00eb:
                int r6 = r9.N
                int r5 = r10.getInt(r5, r6)
                if (r5 != r8) goto L_0x037e
                r9.N = r8
                goto L_0x037e
            L_0x00f7:
                float r6 = r9.Q
                float r5 = r10.getFloat(r5, r6)
                float r5 = java.lang.Math.max(r3, r5)
                r9.Q = r5
                r9.K = r7
                goto L_0x037e
            L_0x0107:
                int r6 = r9.O     // Catch:{ Exception -> 0x0111 }
                int r6 = r10.getDimensionPixelSize(r5, r6)     // Catch:{ Exception -> 0x0111 }
                r9.O = r6     // Catch:{ Exception -> 0x0111 }
                goto L_0x037e
            L_0x0111:
                int r6 = r9.O
                int r5 = r10.getInt(r5, r6)
                if (r5 != r8) goto L_0x037e
                r9.O = r8
                goto L_0x037e
            L_0x011d:
                int r6 = r9.M     // Catch:{ Exception -> 0x0127 }
                int r6 = r10.getDimensionPixelSize(r5, r6)     // Catch:{ Exception -> 0x0127 }
                r9.M = r6     // Catch:{ Exception -> 0x0127 }
                goto L_0x037e
            L_0x0127:
                int r6 = r9.M
                int r5 = r10.getInt(r5, r6)
                if (r5 != r8) goto L_0x037e
                r9.M = r8
                goto L_0x037e
            L_0x0133:
                int r5 = r10.getInt(r5, r2)
                r9.L = r5
                if (r5 != r1) goto L_0x037e
                java.lang.String r5 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
                goto L_0x0148
            L_0x013e:
                int r5 = r10.getInt(r5, r2)
                r9.K = r5
                if (r5 != r1) goto L_0x037e
                java.lang.String r5 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
            L_0x0148:
                java.lang.String r6 = "ConstraintLayout"
                android.util.Log.e(r6, r5)
                goto L_0x037e
            L_0x014f:
                float r6 = r9.E
                float r5 = r10.getFloat(r5, r6)
                r9.E = r5
                goto L_0x037e
            L_0x0159:
                float r6 = r9.D
                float r5 = r10.getFloat(r5, r6)
                r9.D = r5
                goto L_0x037e
            L_0x0163:
                boolean r6 = r9.W
                boolean r5 = r10.getBoolean(r5, r6)
                r9.W = r5
                goto L_0x037e
            L_0x016d:
                boolean r6 = r9.V
                boolean r5 = r10.getBoolean(r5, r6)
                r9.V = r5
                goto L_0x037e
            L_0x0177:
                int r6 = r9.A
                int r5 = r10.getDimensionPixelSize(r5, r6)
                r9.A = r5
                goto L_0x037e
            L_0x0181:
                int r6 = r9.z
                int r5 = r10.getDimensionPixelSize(r5, r6)
                r9.z = r5
                goto L_0x037e
            L_0x018b:
                int r6 = r9.f816y
                int r5 = r10.getDimensionPixelSize(r5, r6)
                r9.f816y = r5
                goto L_0x037e
            L_0x0195:
                int r6 = r9.f815x
                int r5 = r10.getDimensionPixelSize(r5, r6)
                r9.f815x = r5
                goto L_0x037e
            L_0x019f:
                int r6 = r9.w
                int r5 = r10.getDimensionPixelSize(r5, r6)
                r9.w = r5
                goto L_0x037e
            L_0x01a9:
                int r6 = r9.f814v
                int r5 = r10.getDimensionPixelSize(r5, r6)
                r9.f814v = r5
                goto L_0x037e
            L_0x01b3:
                int r6 = r9.u
                int r6 = r10.getResourceId(r5, r6)
                r9.u = r6
                if (r6 != r0) goto L_0x037e
                int r5 = r10.getInt(r5, r0)
                r9.u = r5
                goto L_0x037e
            L_0x01c5:
                int r6 = r9.f813t
                int r6 = r10.getResourceId(r5, r6)
                r9.f813t = r6
                if (r6 != r0) goto L_0x037e
                int r5 = r10.getInt(r5, r0)
                r9.f813t = r5
                goto L_0x037e
            L_0x01d7:
                int r6 = r9.f812s
                int r6 = r10.getResourceId(r5, r6)
                r9.f812s = r6
                if (r6 != r0) goto L_0x037e
                int r5 = r10.getInt(r5, r0)
                r9.f812s = r5
                goto L_0x037e
            L_0x01e9:
                int r6 = r9.f811r
                int r6 = r10.getResourceId(r5, r6)
                r9.f811r = r6
                if (r6 != r0) goto L_0x037e
                int r5 = r10.getInt(r5, r0)
                r9.f811r = r5
                goto L_0x037e
            L_0x01fb:
                int r6 = r9.l
                int r6 = r10.getResourceId(r5, r6)
                r9.l = r6
                if (r6 != r0) goto L_0x037e
                int r5 = r10.getInt(r5, r0)
                r9.l = r5
                goto L_0x037e
            L_0x020d:
                int r6 = r9.f799k
                int r6 = r10.getResourceId(r5, r6)
                r9.f799k = r6
                if (r6 != r0) goto L_0x037e
                int r5 = r10.getInt(r5, r0)
                r9.f799k = r5
                goto L_0x037e
            L_0x021f:
                int r6 = r9.f797j
                int r6 = r10.getResourceId(r5, r6)
                r9.f797j = r6
                if (r6 != r0) goto L_0x037e
                int r5 = r10.getInt(r5, r0)
                r9.f797j = r5
                goto L_0x037e
            L_0x0231:
                int r6 = r9.f795i
                int r6 = r10.getResourceId(r5, r6)
                r9.f795i = r6
                if (r6 != r0) goto L_0x037e
                int r5 = r10.getInt(r5, r0)
                r9.f795i = r5
                goto L_0x037e
            L_0x0243:
                int r6 = r9.f793h
                int r6 = r10.getResourceId(r5, r6)
                r9.f793h = r6
                if (r6 != r0) goto L_0x037e
                int r5 = r10.getInt(r5, r0)
                r9.f793h = r5
                goto L_0x037e
            L_0x0255:
                int r6 = r9.f791g
                int r6 = r10.getResourceId(r5, r6)
                r9.f791g = r6
                if (r6 != r0) goto L_0x037e
                int r5 = r10.getInt(r5, r0)
                r9.f791g = r5
                goto L_0x037e
            L_0x0267:
                int r6 = r9.f789f
                int r6 = r10.getResourceId(r5, r6)
                r9.f789f = r6
                if (r6 != r0) goto L_0x037e
                int r5 = r10.getInt(r5, r0)
                r9.f789f = r5
                goto L_0x037e
            L_0x0279:
                int r6 = r9.f787e
                int r6 = r10.getResourceId(r5, r6)
                r9.f787e = r6
                if (r6 != r0) goto L_0x037e
                int r5 = r10.getInt(r5, r0)
                r9.f787e = r5
                goto L_0x037e
            L_0x028b:
                int r6 = r9.d
                int r6 = r10.getResourceId(r5, r6)
                r9.d = r6
                if (r6 != r0) goto L_0x037e
                int r5 = r10.getInt(r5, r0)
                r9.d = r5
                goto L_0x037e
            L_0x029d:
                float r6 = r9.f784c
                float r5 = r10.getFloat(r5, r6)
                r9.f784c = r5
                goto L_0x037e
            L_0x02a7:
                int r6 = r9.f782b
                int r5 = r10.getDimensionPixelOffset(r5, r6)
                r9.f782b = r5
                goto L_0x037e
            L_0x02b1:
                int r6 = r9.f780a
                int r5 = r10.getDimensionPixelOffset(r5, r6)
                r9.f780a = r5
                goto L_0x037e
            L_0x02bb:
                float r6 = r9.f810q
                float r5 = r10.getFloat(r5, r6)
                r6 = 1135869952(0x43b40000, float:360.0)
                float r5 = r5 % r6
                r9.f810q = r5
                int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r7 >= 0) goto L_0x037e
                float r5 = r6 - r5
                float r5 = r5 % r6
                r9.f810q = r5
                goto L_0x037e
            L_0x02d1:
                int r6 = r9.f808p
                int r5 = r10.getDimensionPixelSize(r5, r6)
                r9.f808p = r5
                goto L_0x037e
            L_0x02db:
                int r6 = r9.f806o
                int r6 = r10.getResourceId(r5, r6)
                r9.f806o = r6
                if (r6 != r0) goto L_0x037e
                int r5 = r10.getInt(r5, r0)
                r9.f806o = r5
                goto L_0x037e
            L_0x02ed:
                int r6 = r9.U
                int r5 = r10.getInt(r5, r6)
                r9.U = r5
                goto L_0x037e
            L_0x02f7:
                int r6 = r9.B
                int r5 = r10.getDimensionPixelSize(r5, r6)
                r9.B = r5
                goto L_0x037e
            L_0x0301:
                int r6 = r9.C
                int r5 = r10.getDimensionPixelSize(r5, r6)
                r9.C = r5
                goto L_0x037e
            L_0x030b:
                int r6 = r9.f804n
                int r6 = r10.getResourceId(r5, r6)
                r9.f804n = r6
                if (r6 != r0) goto L_0x037e
                int r5 = r10.getInt(r5, r0)
                r9.f804n = r5
                goto L_0x037e
            L_0x031c:
                int r6 = r9.f802m
                int r6 = r10.getResourceId(r5, r6)
                r9.f802m = r6
                if (r6 != r0) goto L_0x037e
                int r5 = r10.getInt(r5, r0)
                r9.f802m = r5
                goto L_0x037e
            L_0x032d:
                java.lang.String r5 = r10.getString(r5)
                r9.X = r5
                goto L_0x037e
            L_0x0334:
                int r6 = r9.T
                int r5 = r10.getDimensionPixelOffset(r5, r6)
                r9.T = r5
                goto L_0x037e
            L_0x033d:
                int r6 = r9.S
                int r5 = r10.getDimensionPixelOffset(r5, r6)
                r9.S = r5
                goto L_0x037e
            L_0x0346:
                int r5 = r10.getInt(r5, r2)
                r9.J = r5
                goto L_0x037e
            L_0x034d:
                int r5 = r10.getInt(r5, r2)
                r9.I = r5
                goto L_0x037e
            L_0x0354:
                float r6 = r9.H
                float r5 = r10.getFloat(r5, r6)
                r9.H = r5
                goto L_0x037e
            L_0x035d:
                float r6 = r9.G
                float r5 = r10.getFloat(r5, r6)
                r9.G = r5
                goto L_0x037e
            L_0x0366:
                java.lang.String r5 = r10.getString(r5)
                androidx.constraintlayout.widget.c.i(r9, r5)
                goto L_0x037e
            L_0x036e:
                int r6 = r9.Y
                int r5 = r10.getInt(r5, r6)
                r9.Y = r5
                goto L_0x037e
            L_0x0377:
                androidx.constraintlayout.widget.c.h(r9, r10, r5, r1)
                goto L_0x037e
            L_0x037b:
                androidx.constraintlayout.widget.c.h(r9, r10, r5, r2)
            L_0x037e:
                int r4 = r4 + 1
                goto L_0x00a2
            L_0x0382:
                r10.recycle()
                r9.a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.<init>(android.content.Context, android.util.AttributeSet):void");
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public final void a() {
            this.f785c0 = false;
            this.Z = true;
            this.f781a0 = true;
            int i10 = this.width;
            if (i10 == -2 && this.V) {
                this.Z = false;
                if (this.K == 0) {
                    this.K = 1;
                }
            }
            int i11 = this.height;
            if (i11 == -2 && this.W) {
                this.f781a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.Z = false;
                if (i10 == 0 && this.K == 1) {
                    this.width = -2;
                    this.V = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f781a0 = false;
                if (i11 == 0 && this.L == 1) {
                    this.height = -2;
                    this.W = true;
                }
            }
            if (this.f784c != -1.0f || this.f780a != -1 || this.f782b != -1) {
                this.f785c0 = true;
                this.Z = true;
                this.f781a0 = true;
                if (!(this.f809p0 instanceof g)) {
                    this.f809p0 = new g();
                }
                ((g) this.f809p0).H(this.U);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:70:0x00cc, code lost:
            if (r1 > 0) goto L_0x00ce;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x00db, code lost:
            if (r1 > 0) goto L_0x00ce;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x00e2  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x00ed  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void resolveLayoutDirection(int r11) {
            /*
                r10 = this;
                int r0 = r10.leftMargin
                int r1 = r10.rightMargin
                super.resolveLayoutDirection(r11)
                int r11 = r10.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r11) goto L_0x0011
                r11 = r3
                goto L_0x0012
            L_0x0011:
                r11 = r2
            L_0x0012:
                r4 = -1
                r10.f794h0 = r4
                r10.f796i0 = r4
                r10.f790f0 = r4
                r10.f792g0 = r4
                int r5 = r10.f814v
                r10.f798j0 = r5
                int r5 = r10.f815x
                r10.f800k0 = r5
                float r5 = r10.D
                r10.f801l0 = r5
                int r6 = r10.f780a
                r10.f803m0 = r6
                int r7 = r10.f782b
                r10.f805n0 = r7
                float r8 = r10.f784c
                r10.f807o0 = r8
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r11 == 0) goto L_0x008e
                int r11 = r10.f811r
                if (r11 == r4) goto L_0x003f
                r10.f794h0 = r11
            L_0x003d:
                r2 = r3
                goto L_0x0046
            L_0x003f:
                int r11 = r10.f812s
                if (r11 == r4) goto L_0x0046
                r10.f796i0 = r11
                goto L_0x003d
            L_0x0046:
                int r11 = r10.f813t
                if (r11 == r4) goto L_0x004d
                r10.f792g0 = r11
                r2 = r3
            L_0x004d:
                int r11 = r10.u
                if (r11 == r4) goto L_0x0054
                r10.f790f0 = r11
                r2 = r3
            L_0x0054:
                int r11 = r10.z
                if (r11 == r9) goto L_0x005a
                r10.f800k0 = r11
            L_0x005a:
                int r11 = r10.A
                if (r11 == r9) goto L_0x0060
                r10.f798j0 = r11
            L_0x0060:
                r11 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x0068
                float r2 = r11 - r5
                r10.f801l0 = r2
            L_0x0068:
                boolean r2 = r10.f785c0
                if (r2 == 0) goto L_0x00b2
                int r2 = r10.U
                if (r2 != r3) goto L_0x00b2
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x007e
                float r11 = r11 - r8
                r10.f807o0 = r11
                r10.f803m0 = r4
                r10.f805n0 = r4
                goto L_0x00b2
            L_0x007e:
                if (r6 == r4) goto L_0x0087
                r10.f805n0 = r6
                r10.f803m0 = r4
            L_0x0084:
                r10.f807o0 = r2
                goto L_0x00b2
            L_0x0087:
                if (r7 == r4) goto L_0x00b2
                r10.f803m0 = r7
                r10.f805n0 = r4
                goto L_0x0084
            L_0x008e:
                int r11 = r10.f811r
                if (r11 == r4) goto L_0x0094
                r10.f792g0 = r11
            L_0x0094:
                int r11 = r10.f812s
                if (r11 == r4) goto L_0x009a
                r10.f790f0 = r11
            L_0x009a:
                int r11 = r10.f813t
                if (r11 == r4) goto L_0x00a0
                r10.f794h0 = r11
            L_0x00a0:
                int r11 = r10.u
                if (r11 == r4) goto L_0x00a6
                r10.f796i0 = r11
            L_0x00a6:
                int r11 = r10.z
                if (r11 == r9) goto L_0x00ac
                r10.f798j0 = r11
            L_0x00ac:
                int r11 = r10.A
                if (r11 == r9) goto L_0x00b2
                r10.f800k0 = r11
            L_0x00b2:
                int r11 = r10.f813t
                if (r11 != r4) goto L_0x00fa
                int r11 = r10.u
                if (r11 != r4) goto L_0x00fa
                int r11 = r10.f812s
                if (r11 != r4) goto L_0x00fa
                int r11 = r10.f811r
                if (r11 != r4) goto L_0x00fa
                int r11 = r10.f789f
                if (r11 == r4) goto L_0x00d1
                r10.f794h0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00de
                if (r1 <= 0) goto L_0x00de
            L_0x00ce:
                r10.rightMargin = r1
                goto L_0x00de
            L_0x00d1:
                int r11 = r10.f791g
                if (r11 == r4) goto L_0x00de
                r10.f796i0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00de
                if (r1 <= 0) goto L_0x00de
                goto L_0x00ce
            L_0x00de:
                int r11 = r10.d
                if (r11 == r4) goto L_0x00ed
                r10.f790f0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x00fa
                if (r0 <= 0) goto L_0x00fa
            L_0x00ea:
                r10.leftMargin = r0
                goto L_0x00fa
            L_0x00ed:
                int r11 = r10.f787e
                if (r11 == r4) goto L_0x00fa
                r10.f792g0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x00fa
                if (r0 <= 0) goto L_0x00fa
                goto L_0x00ea
            L_0x00fa:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }
    }

    public class c implements b.C0118b {

        /* renamed from: a  reason: collision with root package name */
        public final ConstraintLayout f818a;

        /* renamed from: b  reason: collision with root package name */
        public int f819b;

        /* renamed from: c  reason: collision with root package name */
        public int f820c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f821e;

        /* renamed from: f  reason: collision with root package name */
        public int f822f;

        /* renamed from: g  reason: collision with root package name */
        public int f823g;

        public c(ConstraintLayout constraintLayout) {
            this.f818a = constraintLayout;
        }

        public static boolean a(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
            }
            return false;
        }

        @SuppressLint({"WrongCall"})
        public final void b(e eVar, b.a aVar) {
            int i10;
            int i11;
            boolean z;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            int i12;
            int i13;
            boolean z15;
            int i14;
            int i15;
            boolean z16;
            boolean z17;
            boolean z18;
            int i16;
            int i17;
            boolean z19;
            int i18;
            int i19;
            int i20;
            int i21;
            boolean z20;
            boolean z21;
            boolean z22;
            int i22;
            int i23;
            int i24;
            int i25;
            boolean z23;
            boolean z24;
            boolean z25;
            e eVar2 = eVar;
            b.a aVar2 = aVar;
            if (eVar2 != null) {
                if (eVar2.f8167i0 == 8 && !eVar2.F) {
                    aVar2.f8283e = 0;
                    aVar2.f8284f = 0;
                    aVar2.f8285g = 0;
                } else if (eVar2.V != null) {
                    e.b bVar = aVar2.f8280a;
                    e.b bVar2 = aVar2.f8281b;
                    int i26 = aVar2.f8282c;
                    int i27 = aVar2.d;
                    int i28 = this.f819b + this.f820c;
                    int i29 = this.d;
                    View view = (View) eVar2.f8165h0;
                    int[] iArr = a.f779a;
                    int i30 = iArr[bVar.ordinal()];
                    q.d dVar = eVar2.L;
                    q.d dVar2 = eVar2.J;
                    if (i30 != 1) {
                        if (i30 == 2) {
                            i24 = this.f822f;
                            i23 = -2;
                        } else if (i30 == 3) {
                            i24 = this.f822f;
                            if (dVar2 != null) {
                                i25 = dVar2.f8147g + 0;
                            } else {
                                i25 = 0;
                            }
                            if (dVar != null) {
                                i25 += dVar.f8147g;
                            }
                            i29 += i25;
                            i23 = -1;
                        } else if (i30 != 4) {
                            i10 = 0;
                        } else {
                            i10 = ViewGroup.getChildMeasureSpec(this.f822f, i29, -2);
                            if (eVar2.f8183r == 1) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            int i31 = aVar2.f8288j;
                            if (i31 == 1 || i31 == 2) {
                                if (view.getMeasuredHeight() == eVar.i()) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                if (aVar2.f8288j == 2 || !z23 || ((z23 && z24) || (view instanceof e) || eVar.u())) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                if (z25) {
                                    i22 = View.MeasureSpec.makeMeasureSpec(eVar.k(), 1073741824);
                                    i10 = i22;
                                }
                            }
                        }
                        i22 = ViewGroup.getChildMeasureSpec(i24, i29, i23);
                        i10 = i22;
                    } else {
                        i10 = View.MeasureSpec.makeMeasureSpec(i26, 1073741824);
                    }
                    int i32 = iArr[bVar2.ordinal()];
                    if (i32 != 1) {
                        if (i32 == 2) {
                            i20 = this.f823g;
                            i19 = -2;
                        } else if (i32 == 3) {
                            i20 = this.f823g;
                            if (dVar2 != null) {
                                i21 = eVar2.K.f8147g + 0;
                            } else {
                                i21 = 0;
                            }
                            if (dVar != null) {
                                i21 += eVar2.M.f8147g;
                            }
                            i28 += i21;
                            i19 = -1;
                        } else if (i32 != 4) {
                            i11 = 0;
                        } else {
                            i18 = ViewGroup.getChildMeasureSpec(this.f823g, i28, -2);
                            if (eVar2.f8184s == 1) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            int i33 = aVar2.f8288j;
                            if (i33 == 1 || i33 == 2) {
                                if (view.getMeasuredWidth() == eVar.k()) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                if (aVar2.f8288j == 2 || !z20 || ((z20 && z21) || (view instanceof e) || eVar.v())) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                if (z22) {
                                    i18 = View.MeasureSpec.makeMeasureSpec(eVar.i(), 1073741824);
                                }
                            }
                            i11 = i18;
                        }
                        i18 = ViewGroup.getChildMeasureSpec(i20, i28, i19);
                        i11 = i18;
                    } else {
                        i11 = View.MeasureSpec.makeMeasureSpec(i27, 1073741824);
                    }
                    f fVar = (f) eVar2.V;
                    ConstraintLayout constraintLayout = ConstraintLayout.this;
                    if (fVar != null && j.b(constraintLayout.w, 256) && view.getMeasuredWidth() == eVar.k() && view.getMeasuredWidth() < fVar.k() && view.getMeasuredHeight() == eVar.i() && view.getMeasuredHeight() < fVar.i() && view.getBaseline() == eVar2.f8156c0 && !eVar.t()) {
                        if (!a(eVar2.H, i10, eVar.k()) || !a(eVar2.I, i11, eVar.i())) {
                            z19 = false;
                        } else {
                            z19 = true;
                        }
                        if (z19) {
                            aVar2.f8283e = eVar.k();
                            aVar2.f8284f = eVar.i();
                            aVar2.f8285g = eVar2.f8156c0;
                            return;
                        }
                    }
                    e.b bVar3 = e.b.MATCH_CONSTRAINT;
                    if (bVar == bVar3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVar2 == bVar3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e.b bVar4 = e.b.MATCH_PARENT;
                    if (bVar2 == bVar4 || bVar2 == e.b.FIXED) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (bVar == bVar4 || bVar == e.b.FIXED) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z || eVar2.Y <= 0.0f) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (!z10 || eVar2.Y <= 0.0f) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    if (view != null) {
                        b bVar5 = (b) view.getLayoutParams();
                        int i34 = aVar2.f8288j;
                        if (i34 == 1 || i34 == 2 || !z || eVar2.f8183r != 0 || !z10 || eVar2.f8184s != 0) {
                            if (!(view instanceof t.e) || !(eVar2 instanceof k)) {
                                view.measure(i10, i11);
                            } else {
                                k kVar = (k) eVar2;
                                t.e eVar3 = (t.e) view;
                            }
                            eVar2.H = i10;
                            eVar2.I = i11;
                            eVar2.f8162g = false;
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            int baseline = view.getBaseline();
                            int i35 = eVar2.u;
                            if (i35 > 0) {
                                i13 = Math.max(i35, measuredWidth);
                            } else {
                                i13 = measuredWidth;
                            }
                            int i36 = eVar2.f8186v;
                            if (i36 > 0) {
                                i13 = Math.min(i36, i13);
                            }
                            int i37 = eVar2.f8187x;
                            if (i37 > 0) {
                                i12 = Math.max(i37, measuredHeight);
                            } else {
                                i12 = measuredHeight;
                            }
                            int i38 = i10;
                            int i39 = eVar2.f8188y;
                            if (i39 > 0) {
                                i12 = Math.min(i39, i12);
                            }
                            if (!j.b(constraintLayout.w, 1)) {
                                if (z13 && z11) {
                                    i13 = (int) ((((float) i12) * eVar2.Y) + 0.5f);
                                } else if (z14 && z12) {
                                    i12 = (int) ((((float) i13) / eVar2.Y) + 0.5f);
                                }
                            }
                            if (measuredWidth == i13 && measuredHeight == i12) {
                                i14 = baseline;
                                i15 = -1;
                                z15 = false;
                            } else {
                                if (measuredWidth != i13) {
                                    i17 = 1073741824;
                                    i16 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                                } else {
                                    i17 = 1073741824;
                                    i16 = i38;
                                }
                                if (measuredHeight != i12) {
                                    i11 = View.MeasureSpec.makeMeasureSpec(i12, i17);
                                }
                                view.measure(i16, i11);
                                eVar2.H = i16;
                                eVar2.I = i11;
                                z15 = false;
                                eVar2.f8162g = false;
                                int measuredWidth2 = view.getMeasuredWidth();
                                int measuredHeight2 = view.getMeasuredHeight();
                                i14 = view.getBaseline();
                                i13 = measuredWidth2;
                                i12 = measuredHeight2;
                                i15 = -1;
                            }
                        } else {
                            i15 = -1;
                            i14 = 0;
                            z15 = false;
                            i13 = 0;
                            i12 = 0;
                        }
                        if (i14 != i15) {
                            z16 = true;
                        } else {
                            z16 = z15;
                        }
                        if (i13 == aVar2.f8282c && i12 == aVar2.d) {
                            z17 = z15;
                        } else {
                            z17 = true;
                        }
                        aVar2.f8287i = z17;
                        if (bVar5.f783b0) {
                            z18 = true;
                        } else {
                            z18 = z16;
                        }
                        if (!(!z18 || i14 == -1 || eVar2.f8156c0 == i14)) {
                            aVar2.f8287i = true;
                        }
                        aVar2.f8283e = i13;
                        aVar2.f8284f = i12;
                        aVar2.f8286h = z18;
                        aVar2.f8285g = i14;
                    }
                }
            }
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(attributeSet, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        d(attributeSet, i10);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static d getSharedValues() {
        if (D == null) {
            D = new d();
        }
        return D;
    }

    public final e c(View view) {
        if (view == this) {
            return this.f772q;
        }
        if (view == null) {
            return null;
        }
        if (!(view.getLayoutParams() instanceof b)) {
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (!(view.getLayoutParams() instanceof b)) {
                return null;
            }
        }
        return ((b) view.getLayoutParams()).f809p0;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    public final void d(AttributeSet attributeSet, int i10) {
        f fVar = this.f772q;
        fVar.f8165h0 = this;
        c cVar = this.C;
        fVar.f8193v0 = cVar;
        fVar.t0.f8294f = cVar;
        this.f770o.put(getId(), this);
        this.f777x = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u.W, i10, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == 16) {
                    this.f773r = obtainStyledAttributes.getDimensionPixelOffset(index, this.f773r);
                } else if (index == 17) {
                    this.f774s = obtainStyledAttributes.getDimensionPixelOffset(index, this.f774s);
                } else if (index == 14) {
                    this.f775t = obtainStyledAttributes.getDimensionPixelOffset(index, this.f775t);
                } else if (index == 15) {
                    this.u = obtainStyledAttributes.getDimensionPixelOffset(index, this.u);
                } else if (index == 112) {
                    this.w = obtainStyledAttributes.getInt(index, this.w);
                } else if (index == 55) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            f(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f778y = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        c cVar2 = new c();
                        this.f777x = cVar2;
                        cVar2.f(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f777x = null;
                    }
                    this.z = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        fVar.E0 = this.w;
        o.d.f7538p = fVar.M(512);
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<b> arrayList = this.f771p;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.get(i10).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i13 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = (float) i12;
                        float f11 = (float) i13;
                        float f12 = (float) (i12 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f13 = f11;
                        float f14 = f11;
                        float f15 = f12;
                        float f16 = f10;
                        Paint paint2 = paint;
                        canvas2.drawLine(f10, f13, f15, f14, paint);
                        float parseInt4 = (float) (i13 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f17 = f12;
                        float f18 = parseInt4;
                        canvas2.drawLine(f17, f14, f15, f18, paint);
                        float f19 = parseInt4;
                        float f20 = f16;
                        canvas2.drawLine(f17, f19, f20, f18, paint);
                        float f21 = f16;
                        canvas2.drawLine(f21, f19, f20, f14, paint);
                        paint.setColor(-16711936);
                        float f22 = f12;
                        Paint paint3 = paint;
                        canvas2.drawLine(f21, f14, f22, parseInt4, paint);
                        canvas2.drawLine(f21, parseInt4, f22, f14, paint);
                    }
                }
            }
        }
    }

    public final boolean e() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    public void f(int i10) {
        this.f778y = new t.a(getContext(), this, i10);
    }

    public final void forceLayout() {
        this.f776v = true;
        super.forceLayout();
    }

    public final void g(String str, Integer num) {
        if ((str instanceof String) && (num instanceof Integer)) {
            if (this.A == null) {
                this.A = new HashMap<>();
            }
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.A.put(str, Integer.valueOf(num.intValue()));
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getMaxHeight() {
        return this.u;
    }

    public int getMaxWidth() {
        return this.f775t;
    }

    public int getMinHeight() {
        return this.f774s;
    }

    public int getMinWidth() {
        return this.f773r;
    }

    public int getOptimizationLevel() {
        return this.f772q.E0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x010a, code lost:
        r2 = r14.f839v;
     */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02f1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x051a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h() {
        /*
            r21 = this;
            r0 = r21
            int r1 = r21.getChildCount()
            r2 = 0
            r3 = r2
        L_0x0008:
            r4 = 1
            if (r3 >= r1) goto L_0x001a
            android.view.View r5 = r0.getChildAt(r3)
            boolean r5 = r5.isLayoutRequested()
            if (r5 == 0) goto L_0x0017
            r1 = r4
            goto L_0x001b
        L_0x0017:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x001a:
            r1 = r2
        L_0x001b:
            if (r1 == 0) goto L_0x0594
            boolean r3 = r21.isInEditMode()
            int r5 = r21.getChildCount()
            r6 = r2
        L_0x0026:
            if (r6 >= r5) goto L_0x0039
            android.view.View r7 = r0.getChildAt(r6)
            q.e r7 = r0.c(r7)
            if (r7 != 0) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            r7.w()
        L_0x0036:
            int r6 = r6 + 1
            goto L_0x0026
        L_0x0039:
            r6 = 0
            android.util.SparseArray<android.view.View> r7 = r0.f770o
            r8 = -1
            q.f r9 = r0.f772q
            if (r3 == 0) goto L_0x00a2
            r10 = r2
        L_0x0042:
            if (r10 >= r5) goto L_0x00a2
            android.view.View r11 = r0.getChildAt(r10)
            android.content.res.Resources r12 = r21.getResources()     // Catch:{ NotFoundException -> 0x009f }
            int r13 = r11.getId()     // Catch:{ NotFoundException -> 0x009f }
            java.lang.String r12 = r12.getResourceName(r13)     // Catch:{ NotFoundException -> 0x009f }
            int r13 = r11.getId()     // Catch:{ NotFoundException -> 0x009f }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ NotFoundException -> 0x009f }
            r0.g(r12, r13)     // Catch:{ NotFoundException -> 0x009f }
            r13 = 47
            int r13 = r12.indexOf(r13)     // Catch:{ NotFoundException -> 0x009f }
            if (r13 == r8) goto L_0x006d
            int r13 = r13 + 1
            java.lang.String r12 = r12.substring(r13)     // Catch:{ NotFoundException -> 0x009f }
        L_0x006d:
            int r11 = r11.getId()     // Catch:{ NotFoundException -> 0x009f }
            if (r11 != 0) goto L_0x0074
            goto L_0x008f
        L_0x0074:
            java.lang.Object r13 = r7.get(r11)     // Catch:{ NotFoundException -> 0x009f }
            android.view.View r13 = (android.view.View) r13     // Catch:{ NotFoundException -> 0x009f }
            if (r13 != 0) goto L_0x008d
            android.view.View r13 = r0.findViewById(r11)     // Catch:{ NotFoundException -> 0x009f }
            if (r13 == 0) goto L_0x008d
            if (r13 == r0) goto L_0x008d
            android.view.ViewParent r11 = r13.getParent()     // Catch:{ NotFoundException -> 0x009f }
            if (r11 != r0) goto L_0x008d
            r0.onViewAdded(r13)     // Catch:{ NotFoundException -> 0x009f }
        L_0x008d:
            if (r13 != r0) goto L_0x0091
        L_0x008f:
            r11 = r9
            goto L_0x009d
        L_0x0091:
            if (r13 != 0) goto L_0x0095
            r11 = r6
            goto L_0x009d
        L_0x0095:
            android.view.ViewGroup$LayoutParams r11 = r13.getLayoutParams()     // Catch:{ NotFoundException -> 0x009f }
            androidx.constraintlayout.widget.ConstraintLayout$b r11 = (androidx.constraintlayout.widget.ConstraintLayout.b) r11     // Catch:{ NotFoundException -> 0x009f }
            q.e r11 = r11.f809p0     // Catch:{ NotFoundException -> 0x009f }
        L_0x009d:
            r11.f8169j0 = r12     // Catch:{ NotFoundException -> 0x009f }
        L_0x009f:
            int r10 = r10 + 1
            goto L_0x0042
        L_0x00a2:
            int r10 = r0.z
            if (r10 == r8) goto L_0x00c4
            r10 = r2
        L_0x00a7:
            if (r10 >= r5) goto L_0x00c4
            android.view.View r11 = r0.getChildAt(r10)
            int r12 = r11.getId()
            int r13 = r0.z
            if (r12 != r13) goto L_0x00c1
            boolean r12 = r11 instanceof androidx.constraintlayout.widget.d
            if (r12 == 0) goto L_0x00c1
            androidx.constraintlayout.widget.d r11 = (androidx.constraintlayout.widget.d) r11
            androidx.constraintlayout.widget.c r11 = r11.getConstraintSet()
            r0.f777x = r11
        L_0x00c1:
            int r10 = r10 + 1
            goto L_0x00a7
        L_0x00c4:
            androidx.constraintlayout.widget.c r10 = r0.f777x
            if (r10 == 0) goto L_0x00cb
            r10.b(r0)
        L_0x00cb:
            java.util.ArrayList<q.e> r10 = r9.f8205r0
            r10.clear()
            java.util.ArrayList<androidx.constraintlayout.widget.b> r10 = r0.f771p
            int r11 = r10.size()
            if (r11 <= 0) goto L_0x0171
            r13 = r2
        L_0x00d9:
            if (r13 >= r11) goto L_0x0171
            java.lang.Object r14 = r10.get(r13)
            androidx.constraintlayout.widget.b r14 = (androidx.constraintlayout.widget.b) r14
            boolean r15 = r14.isInEditMode()
            if (r15 == 0) goto L_0x00ec
            java.lang.String r15 = r14.f837s
            r14.setIds(r15)
        L_0x00ec:
            q.a r15 = r14.f836r
            if (r15 != 0) goto L_0x00f2
            goto L_0x0169
        L_0x00f2:
            r15.f8203s0 = r2
            q.e[] r15 = r15.f8202r0
            java.util.Arrays.fill(r15, r6)
            r15 = r2
        L_0x00fa:
            int r6 = r14.f834p
            if (r15 >= r6) goto L_0x0164
            int[] r6 = r14.f833o
            r6 = r6[r15]
            java.lang.Object r17 = r7.get(r6)
            android.view.View r17 = (android.view.View) r17
            if (r17 != 0) goto L_0x012f
            java.util.HashMap<java.lang.Integer, java.lang.String> r2 = r14.f839v
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r6 = r2.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            int r8 = r14.h(r0, r6)
            if (r8 == 0) goto L_0x012f
            int[] r12 = r14.f833o
            r12[r15] = r8
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            r2.put(r12, r6)
            java.lang.Object r2 = r7.get(r8)
            r17 = r2
            android.view.View r17 = (android.view.View) r17
        L_0x012f:
            r2 = r17
            if (r2 == 0) goto L_0x015e
            q.a r6 = r14.f836r
            q.e r2 = r0.c(r2)
            r6.getClass()
            if (r2 == r6) goto L_0x015e
            if (r2 != 0) goto L_0x0141
            goto L_0x015e
        L_0x0141:
            int r8 = r6.f8203s0
            int r8 = r8 + r4
            q.e[] r12 = r6.f8202r0
            int r4 = r12.length
            if (r8 <= r4) goto L_0x0154
            int r4 = r12.length
            r8 = 2
            int r4 = r4 * r8
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r12, r4)
            q.e[] r4 = (q.e[]) r4
            r6.f8202r0 = r4
        L_0x0154:
            q.e[] r4 = r6.f8202r0
            int r8 = r6.f8203s0
            r4[r8] = r2
            r2 = 1
            int r8 = r8 + r2
            r6.f8203s0 = r8
        L_0x015e:
            int r15 = r15 + 1
            r2 = 0
            r4 = 1
            r8 = -1
            goto L_0x00fa
        L_0x0164:
            q.a r2 = r14.f836r
            r2.getClass()
        L_0x0169:
            int r13 = r13 + 1
            r2 = 0
            r4 = 1
            r6 = 0
            r8 = -1
            goto L_0x00d9
        L_0x0171:
            r2 = 0
        L_0x0172:
            if (r2 >= r5) goto L_0x01af
            android.view.View r4 = r0.getChildAt(r2)
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.e
            if (r6 == 0) goto L_0x01ab
            androidx.constraintlayout.widget.e r4 = (androidx.constraintlayout.widget.e) r4
            int r6 = r4.f928o
            r8 = -1
            if (r6 != r8) goto L_0x018e
            boolean r6 = r4.isInEditMode()
            if (r6 != 0) goto L_0x018e
            int r6 = r4.f930q
            r4.setVisibility(r6)
        L_0x018e:
            int r6 = r4.f928o
            android.view.View r6 = r0.findViewById(r6)
            r4.f929p = r6
            if (r6 == 0) goto L_0x01ab
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$b r6 = (androidx.constraintlayout.widget.ConstraintLayout.b) r6
            r8 = 1
            r6.f788e0 = r8
            android.view.View r6 = r4.f929p
            r8 = 0
            r6.setVisibility(r8)
            r4.setVisibility(r8)
            goto L_0x01ac
        L_0x01ab:
            r8 = 0
        L_0x01ac:
            int r2 = r2 + 1
            goto L_0x0172
        L_0x01af:
            r8 = 0
            android.util.SparseArray<q.e> r2 = r0.B
            r2.clear()
            r2.put(r8, r9)
            int r4 = r21.getId()
            r2.put(r4, r9)
            r4 = 0
        L_0x01c0:
            if (r4 >= r5) goto L_0x01d4
            android.view.View r6 = r0.getChildAt(r4)
            q.e r8 = r0.c(r6)
            int r6 = r6.getId()
            r2.put(r6, r8)
            int r4 = r4 + 1
            goto L_0x01c0
        L_0x01d4:
            r8 = 0
        L_0x01d5:
            if (r8 >= r5) goto L_0x0594
            android.view.View r4 = r0.getChildAt(r8)
            q.e r6 = r0.c(r4)
            if (r6 != 0) goto L_0x01e3
            goto L_0x0252
        L_0x01e3:
            android.view.ViewGroup$LayoutParams r10 = r4.getLayoutParams()
            r15 = r10
            androidx.constraintlayout.widget.ConstraintLayout$b r15 = (androidx.constraintlayout.widget.ConstraintLayout.b) r15
            java.util.ArrayList<q.e> r10 = r9.f8205r0
            r10.add(r6)
            q.e r10 = r6.V
            if (r10 == 0) goto L_0x01fd
            q.l r10 = (q.l) r10
            java.util.ArrayList<q.e> r10 = r10.f8205r0
            r10.remove(r6)
            r6.w()
        L_0x01fd:
            r6.V = r9
            r15.a()
            int r10 = r4.getVisibility()
            r6.f8167i0 = r10
            boolean r10 = r15.f788e0
            if (r10 == 0) goto L_0x0213
            r10 = 1
            r6.F = r10
            r10 = 8
            r6.f8167i0 = r10
        L_0x0213:
            r6.f8165h0 = r4
            boolean r10 = r4 instanceof androidx.constraintlayout.widget.b
            if (r10 == 0) goto L_0x0220
            androidx.constraintlayout.widget.b r4 = (androidx.constraintlayout.widget.b) r4
            boolean r10 = r9.f8194w0
            r4.j(r6, r10)
        L_0x0220:
            boolean r4 = r15.f785c0
            if (r4 == 0) goto L_0x025e
            q.g r6 = (q.g) r6
            int r4 = r15.f803m0
            int r10 = r15.f805n0
            float r11 = r15.f807o0
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r13 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r13 == 0) goto L_0x023c
            if (r13 <= 0) goto L_0x0252
            r6.f8196r0 = r11
            r11 = -1
            r6.f8197s0 = r11
            r6.t0 = r11
            goto L_0x0252
        L_0x023c:
            r11 = -1
            if (r4 == r11) goto L_0x0248
            if (r4 <= r11) goto L_0x0252
            r6.f8196r0 = r12
            r6.f8197s0 = r4
            r6.t0 = r11
            goto L_0x0252
        L_0x0248:
            if (r10 == r11) goto L_0x0252
            if (r10 <= r11) goto L_0x0252
            r6.f8196r0 = r12
            r6.f8197s0 = r11
            r6.t0 = r10
        L_0x0252:
            r19 = r1
            r16 = r5
            r18 = r9
            r0 = 2
            r4 = -1
            r9 = 0
            r10 = 1
            goto L_0x0588
        L_0x025e:
            int r4 = r15.f790f0
            int r10 = r15.f792g0
            int r14 = r15.f794h0
            int r13 = r15.f796i0
            int r12 = r15.f798j0
            int r11 = r15.f800k0
            float r0 = r15.f801l0
            r16 = r5
            int r5 = r15.f806o
            r18 = r9
            r9 = -1
            if (r5 == r9) goto L_0x0294
            java.lang.Object r0 = r2.get(r5)
            r12 = r0
            q.e r12 = (q.e) r12
            if (r12 == 0) goto L_0x028f
            float r0 = r15.f810q
            int r14 = r15.f808p
            q.d$b r13 = q.d.b.CENTER
            r4 = 0
            r10 = r6
            r11 = r13
            r5 = r15
            r15 = r4
            r10.p(r11, r12, r13, r14, r15)
            r6.D = r0
            goto L_0x0290
        L_0x028f:
            r5 = r15
        L_0x0290:
            r19 = r1
            goto L_0x03e7
        L_0x0294:
            r5 = r15
            if (r4 == r9) goto L_0x02a8
            java.lang.Object r4 = r2.get(r4)
            q.e r4 = (q.e) r4
            if (r4 == 0) goto L_0x02d6
            q.d$b r10 = q.d.b.LEFT
            int r15 = r5.leftMargin
            r9 = r10
            r19 = r15
            r15 = r9
            goto L_0x02bb
        L_0x02a8:
            if (r10 == r9) goto L_0x02d6
            java.lang.Object r4 = r2.get(r10)
            q.e r4 = (q.e) r4
            if (r4 == 0) goto L_0x02ce
            q.d$b r9 = q.d.b.LEFT
            q.d$b r10 = q.d.b.RIGHT
            int r15 = r5.leftMargin
            r19 = r15
            r15 = r10
        L_0x02bb:
            r10 = r6
            r20 = r11
            r11 = r9
            r9 = r12
            r12 = r4
            r4 = r13
            r13 = r15
            r15 = r14
            r14 = r19
            r19 = r1
            r1 = r15
            r15 = r9
            r10.p(r11, r12, r13, r14, r15)
            goto L_0x02d4
        L_0x02ce:
            r19 = r1
            r20 = r11
            r4 = r13
            r1 = r14
        L_0x02d4:
            r9 = -1
            goto L_0x02dc
        L_0x02d6:
            r19 = r1
            r20 = r11
            r4 = r13
            r1 = r14
        L_0x02dc:
            if (r1 == r9) goto L_0x02f1
            java.lang.Object r1 = r2.get(r1)
            q.e r1 = (q.e) r1
            if (r1 == 0) goto L_0x0309
            q.d$b r4 = q.d.b.RIGHT
            q.d$b r10 = q.d.b.LEFT
            int r11 = r5.rightMargin
            r12 = r1
            r13 = r10
            r14 = r11
            r11 = r4
            goto L_0x0303
        L_0x02f1:
            if (r4 == r9) goto L_0x0309
            java.lang.Object r1 = r2.get(r4)
            q.e r1 = (q.e) r1
            if (r1 == 0) goto L_0x0309
            q.d$b r4 = q.d.b.RIGHT
            int r9 = r5.rightMargin
            r12 = r1
            r11 = r4
            r13 = r11
            r14 = r9
        L_0x0303:
            r10 = r6
            r15 = r20
            r10.p(r11, r12, r13, r14, r15)
        L_0x0309:
            int r1 = r5.f793h
            r4 = -1
            if (r1 == r4) goto L_0x0322
            java.lang.Object r1 = r2.get(r1)
            q.e r1 = (q.e) r1
            if (r1 == 0) goto L_0x033f
            q.d$b r9 = q.d.b.TOP
            int r10 = r5.topMargin
            int r11 = r5.w
            r12 = r1
            r13 = r9
            r14 = r10
            r15 = r11
            r11 = r13
            goto L_0x033b
        L_0x0322:
            int r1 = r5.f795i
            if (r1 == r4) goto L_0x033f
            java.lang.Object r1 = r2.get(r1)
            q.e r1 = (q.e) r1
            if (r1 == 0) goto L_0x033f
            q.d$b r4 = q.d.b.TOP
            q.d$b r9 = q.d.b.BOTTOM
            int r10 = r5.topMargin
            int r11 = r5.w
            r12 = r1
            r13 = r9
            r14 = r10
            r15 = r11
            r11 = r4
        L_0x033b:
            r10 = r6
            r10.p(r11, r12, r13, r14, r15)
        L_0x033f:
            int r1 = r5.f797j
            r4 = -1
            if (r1 == r4) goto L_0x035a
            java.lang.Object r1 = r2.get(r1)
            q.e r1 = (q.e) r1
            if (r1 == 0) goto L_0x0375
            q.d$b r9 = q.d.b.BOTTOM
            q.d$b r10 = q.d.b.TOP
            int r11 = r5.bottomMargin
            int r12 = r5.f816y
            r13 = r10
            r14 = r11
            r15 = r12
            r12 = r1
            r11 = r9
            goto L_0x0371
        L_0x035a:
            int r1 = r5.f799k
            if (r1 == r4) goto L_0x0375
            java.lang.Object r1 = r2.get(r1)
            q.e r1 = (q.e) r1
            if (r1 == 0) goto L_0x0375
            q.d$b r4 = q.d.b.BOTTOM
            int r9 = r5.bottomMargin
            int r10 = r5.f816y
            r12 = r1
            r11 = r4
            r13 = r11
            r14 = r9
            r15 = r10
        L_0x0371:
            r10 = r6
            r10.p(r11, r12, r13, r14, r15)
        L_0x0375:
            int r1 = r5.l
            r4 = -1
            if (r1 == r4) goto L_0x037d
            q.d$b r9 = q.d.b.BASELINE
            goto L_0x038a
        L_0x037d:
            int r1 = r5.f802m
            if (r1 == r4) goto L_0x0384
            q.d$b r9 = q.d.b.TOP
            goto L_0x038a
        L_0x0384:
            int r1 = r5.f804n
            if (r1 == r4) goto L_0x03d8
            q.d$b r9 = q.d.b.BOTTOM
        L_0x038a:
            java.lang.Object r4 = r7.get(r1)
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r1 = r2.get(r1)
            q.e r1 = (q.e) r1
            if (r1 == 0) goto L_0x03d8
            if (r4 == 0) goto L_0x03d8
            android.view.ViewGroup$LayoutParams r10 = r4.getLayoutParams()
            boolean r10 = r10 instanceof androidx.constraintlayout.widget.ConstraintLayout.b
            if (r10 == 0) goto L_0x03d8
            r10 = 1
            r5.f783b0 = r10
            q.d$b r11 = q.d.b.BASELINE
            if (r9 != r11) goto L_0x03b5
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$b r4 = (androidx.constraintlayout.widget.ConstraintLayout.b) r4
            r4.f783b0 = r10
            q.e r4 = r4.f809p0
            r4.E = r10
        L_0x03b5:
            q.d r4 = r6.g(r11)
            q.d r1 = r1.g(r9)
            int r9 = r5.C
            int r11 = r5.B
            r4.a(r1, r9, r11)
            r6.E = r10
            q.d$b r1 = q.d.b.TOP
            q.d r1 = r6.g(r1)
            r1.g()
            q.d$b r1 = q.d.b.BOTTOM
            q.d r1 = r6.g(r1)
            r1.g()
        L_0x03d8:
            r1 = 0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 < 0) goto L_0x03df
            r6.f8161f0 = r0
        L_0x03df:
            float r0 = r5.E
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 < 0) goto L_0x03e7
            r6.f8163g0 = r0
        L_0x03e7:
            if (r3 == 0) goto L_0x03f8
            int r0 = r5.S
            r1 = -1
            if (r0 != r1) goto L_0x03f2
            int r4 = r5.T
            if (r4 == r1) goto L_0x03f8
        L_0x03f2:
            int r1 = r5.T
            r6.f8152a0 = r0
            r6.f8154b0 = r1
        L_0x03f8:
            boolean r0 = r5.Z
            r1 = -2
            if (r0 != 0) goto L_0x042d
            int r0 = r5.width
            r4 = -1
            if (r0 != r4) goto L_0x0423
            boolean r0 = r5.V
            if (r0 == 0) goto L_0x0409
            q.e$b r0 = q.e.b.MATCH_CONSTRAINT
            goto L_0x040b
        L_0x0409:
            q.e$b r0 = q.e.b.MATCH_PARENT
        L_0x040b:
            r6.C(r0)
            q.d$b r0 = q.d.b.LEFT
            q.d r0 = r6.g(r0)
            int r4 = r5.leftMargin
            r0.f8147g = r4
            q.d$b r0 = q.d.b.RIGHT
            q.d r0 = r6.g(r0)
            int r4 = r5.rightMargin
            r0.f8147g = r4
            goto L_0x0440
        L_0x0423:
            q.e$b r0 = q.e.b.MATCH_CONSTRAINT
            r6.C(r0)
            r0 = 0
            r6.E(r0)
            goto L_0x0440
        L_0x042d:
            q.e$b r0 = q.e.b.FIXED
            r6.C(r0)
            int r0 = r5.width
            r6.E(r0)
            int r0 = r5.width
            if (r0 != r1) goto L_0x0440
            q.e$b r0 = q.e.b.WRAP_CONTENT
            r6.C(r0)
        L_0x0440:
            boolean r0 = r5.f781a0
            if (r0 != 0) goto L_0x0474
            int r0 = r5.height
            r4 = -1
            if (r0 != r4) goto L_0x046a
            boolean r0 = r5.W
            if (r0 == 0) goto L_0x0450
            q.e$b r0 = q.e.b.MATCH_CONSTRAINT
            goto L_0x0452
        L_0x0450:
            q.e$b r0 = q.e.b.MATCH_PARENT
        L_0x0452:
            r6.D(r0)
            q.d$b r0 = q.d.b.TOP
            q.d r0 = r6.g(r0)
            int r1 = r5.topMargin
            r0.f8147g = r1
            q.d$b r0 = q.d.b.BOTTOM
            q.d r0 = r6.g(r0)
            int r1 = r5.bottomMargin
            r0.f8147g = r1
            goto L_0x0488
        L_0x046a:
            q.e$b r0 = q.e.b.MATCH_CONSTRAINT
            r6.D(r0)
            r0 = 0
            r6.B(r0)
            goto L_0x0488
        L_0x0474:
            r4 = -1
            q.e$b r0 = q.e.b.FIXED
            r6.D(r0)
            int r0 = r5.height
            r6.B(r0)
            int r0 = r5.height
            if (r0 != r1) goto L_0x0488
            q.e$b r0 = q.e.b.WRAP_CONTENT
            r6.D(r0)
        L_0x0488:
            java.lang.String r0 = r5.F
            if (r0 == 0) goto L_0x051f
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0494
            goto L_0x051f
        L_0x0494:
            int r1 = r0.length()
            r9 = 44
            int r9 = r0.indexOf(r9)
            if (r9 <= 0) goto L_0x04c1
            int r10 = r1 + -1
            if (r9 >= r10) goto L_0x04c1
            r10 = 0
            java.lang.String r11 = r0.substring(r10, r9)
            java.lang.String r10 = "W"
            boolean r10 = r11.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x04b3
            r10 = 0
            goto L_0x04be
        L_0x04b3:
            java.lang.String r10 = "H"
            boolean r10 = r11.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x04bd
            r10 = 1
            goto L_0x04be
        L_0x04bd:
            r10 = r4
        L_0x04be:
            int r9 = r9 + 1
            goto L_0x04c3
        L_0x04c1:
            r10 = r4
            r9 = 0
        L_0x04c3:
            r11 = 58
            int r11 = r0.indexOf(r11)
            if (r11 < 0) goto L_0x0505
            int r1 = r1 + -1
            if (r11 >= r1) goto L_0x0505
            java.lang.String r1 = r0.substring(r9, r11)
            int r11 = r11 + 1
            java.lang.String r0 = r0.substring(r11)
            int r9 = r1.length()
            if (r9 <= 0) goto L_0x0514
            int r9 = r0.length()
            if (r9 <= 0) goto L_0x0514
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x0514 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0514 }
            r9 = 0
            int r11 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0514
            int r11 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0514
            r9 = 1
            if (r10 != r9) goto L_0x04ff
            float r0 = r0 / r1
            float r0 = java.lang.Math.abs(r0)     // Catch:{ NumberFormatException -> 0x0514 }
            goto L_0x0515
        L_0x04ff:
            float r1 = r1 / r0
            float r0 = java.lang.Math.abs(r1)     // Catch:{ NumberFormatException -> 0x0514 }
            goto L_0x0515
        L_0x0505:
            java.lang.String r0 = r0.substring(r9)
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x0514
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0514 }
            goto L_0x0515
        L_0x0514:
            r0 = 0
        L_0x0515:
            r1 = 0
            int r9 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r9 <= 0) goto L_0x0522
            r6.Y = r0
            r6.Z = r10
            goto L_0x0522
        L_0x051f:
            r1 = 0
            r6.Y = r1
        L_0x0522:
            float r0 = r5.G
            float[] r1 = r6.f8174m0
            r9 = 0
            r1[r9] = r0
            float r0 = r5.H
            r10 = 1
            r1[r10] = r0
            int r0 = r5.I
            r6.f8171k0 = r0
            int r0 = r5.J
            r6.f8172l0 = r0
            int r0 = r5.Y
            if (r0 < 0) goto L_0x053f
            r1 = 3
            if (r0 > r1) goto L_0x053f
            r6.f8181q = r0
        L_0x053f:
            int r0 = r5.K
            int r1 = r5.M
            int r11 = r5.O
            float r12 = r5.Q
            r6.f8183r = r0
            r6.u = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r11 != r1) goto L_0x0551
            r11 = r9
        L_0x0551:
            r6.f8186v = r11
            r6.w = r12
            r11 = 0
            int r13 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r13 <= 0) goto L_0x0565
            int r12 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r12 >= 0) goto L_0x0565
            if (r0 != 0) goto L_0x0565
            r0 = 2
            r6.f8183r = r0
        L_0x0565:
            int r0 = r5.L
            int r12 = r5.N
            int r13 = r5.P
            float r5 = r5.R
            r6.f8184s = r0
            r6.f8187x = r12
            if (r13 != r1) goto L_0x0574
            r13 = r9
        L_0x0574:
            r6.f8188y = r13
            r6.z = r5
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0587
            int r1 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r1 >= 0) goto L_0x0587
            if (r0 != 0) goto L_0x0587
            r0 = 2
            r6.f8184s = r0
            goto L_0x0588
        L_0x0587:
            r0 = 2
        L_0x0588:
            int r8 = r8 + 1
            r0 = r21
            r5 = r16
            r9 = r18
            r1 = r19
            goto L_0x01d5
        L_0x0594:
            r19 = r1
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.h():boolean");
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            e eVar = bVar.f809p0;
            if ((childAt.getVisibility() != 8 || bVar.f785c0 || bVar.f786d0 || isInEditMode) && !bVar.f788e0) {
                int l = eVar.l();
                int m10 = eVar.m();
                int k10 = eVar.k() + l;
                int i15 = eVar.i() + m10;
                childAt.layout(l, m10, k10, i15);
                if ((childAt instanceof e) && (content = ((e) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(l, m10, k10, i15);
                }
            }
        }
        ArrayList<b> arrayList = this.f771p;
        int size = arrayList.size();
        if (size > 0) {
            for (int i16 = 0; i16 < size; i16++) {
                arrayList.get(i16).getClass();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c1, code lost:
        if (r14 == 0) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0101, code lost:
        if (r14 == 0) goto L_0x010a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0786  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0789  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01ef A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r25, int r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            boolean r3 = r0.f776v
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0023
            int r3 = r24.getChildCount()
            r6 = r5
        L_0x0011:
            if (r6 >= r3) goto L_0x0023
            android.view.View r7 = r0.getChildAt(r6)
            boolean r7 = r7.isLayoutRequested()
            if (r7 == 0) goto L_0x0020
            r0.f776v = r4
            goto L_0x0023
        L_0x0020:
            int r6 = r6 + 1
            goto L_0x0011
        L_0x0023:
            boolean r3 = r24.e()
            q.f r4 = r0.f772q
            r4.f8194w0 = r3
            boolean r3 = r0.f776v
            r.b r6 = r4.f8191s0
            if (r3 == 0) goto L_0x003c
            r0.f776v = r5
            boolean r3 = r24.h()
            if (r3 == 0) goto L_0x003c
            r6.c(r4)
        L_0x003c:
            int r3 = r0.w
            int r7 = android.view.View.MeasureSpec.getMode(r25)
            int r8 = android.view.View.MeasureSpec.getSize(r25)
            int r9 = android.view.View.MeasureSpec.getMode(r26)
            int r10 = android.view.View.MeasureSpec.getSize(r26)
            int r11 = r24.getPaddingTop()
            int r11 = java.lang.Math.max(r5, r11)
            int r12 = r24.getPaddingBottom()
            int r12 = java.lang.Math.max(r5, r12)
            int r13 = r11 + r12
            int r14 = r24.getPaddingWidth()
            androidx.constraintlayout.widget.ConstraintLayout$c r15 = r0.C
            r15.f819b = r11
            r15.f820c = r12
            r15.d = r14
            r15.f821e = r13
            r15.f822f = r1
            r15.f823g = r2
            int r12 = r24.getPaddingStart()
            int r12 = java.lang.Math.max(r5, r12)
            int r2 = r24.getPaddingEnd()
            int r2 = java.lang.Math.max(r5, r2)
            if (r12 > 0) goto L_0x0090
            if (r2 <= 0) goto L_0x0087
            goto L_0x0090
        L_0x0087:
            int r2 = r24.getPaddingLeft()
            int r12 = java.lang.Math.max(r5, r2)
            goto L_0x0097
        L_0x0090:
            boolean r5 = r24.e()
            if (r5 == 0) goto L_0x0097
            r12 = r2
        L_0x0097:
            int r8 = r8 - r14
            int r10 = r10 - r13
            int r2 = r15.f821e
            int r5 = r15.d
            q.e$b r13 = q.e.b.FIXED
            int r14 = r24.getChildCount()
            r16 = r13
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r7 == r13) goto L_0x00d0
            if (r7 == 0) goto L_0x00bf
            if (r7 == r1) goto L_0x00b2
            r1 = r16
            goto L_0x00c4
        L_0x00b2:
            int r1 = r0.f775t
            int r1 = r1 - r5
            int r1 = java.lang.Math.min(r1, r8)
            r17 = r15
            r15 = r13
            r13 = r16
            goto L_0x00ec
        L_0x00bf:
            q.e$b r1 = q.e.b.WRAP_CONTENT
            if (r14 != 0) goto L_0x00c4
            goto L_0x00d4
        L_0x00c4:
            r17 = 0
            r23 = r13
            r13 = r1
            r1 = r17
            r17 = r15
            r15 = r23
            goto L_0x00ec
        L_0x00d0:
            q.e$b r1 = q.e.b.WRAP_CONTENT
            if (r14 != 0) goto L_0x00e7
        L_0x00d4:
            int r13 = r0.f773r
            r17 = r1
            r1 = 0
            int r1 = java.lang.Math.max(r1, r13)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r23 = r15
            r15 = r13
            r13 = r17
            r17 = r23
            goto L_0x00ec
        L_0x00e7:
            r17 = r15
            r15 = r13
            r13 = r1
            r1 = r8
        L_0x00ec:
            if (r9 == r15) goto L_0x0106
            if (r9 == 0) goto L_0x00ff
            r14 = 1073741824(0x40000000, float:2.0)
            if (r9 == r14) goto L_0x00f7
            r15 = r16
            goto L_0x0104
        L_0x00f7:
            int r14 = r0.u
            int r14 = r14 - r2
            int r14 = java.lang.Math.min(r14, r10)
            goto L_0x0113
        L_0x00ff:
            q.e$b r15 = q.e.b.WRAP_CONTENT
            if (r14 != 0) goto L_0x0104
            goto L_0x010a
        L_0x0104:
            r14 = 0
            goto L_0x0115
        L_0x0106:
            q.e$b r15 = q.e.b.WRAP_CONTENT
            if (r14 != 0) goto L_0x0118
        L_0x010a:
            int r14 = r0.f774s
            r16 = r15
            r15 = 0
            int r14 = java.lang.Math.max(r15, r14)
        L_0x0113:
            r15 = r16
        L_0x0115:
            r16 = r10
            goto L_0x011b
        L_0x0118:
            r14 = r10
            r16 = r14
        L_0x011b:
            int r10 = r4.k()
            r18 = r8
            r.e r8 = r4.t0
            if (r1 != r10) goto L_0x012b
            int r10 = r4.i()
            if (r14 == r10) goto L_0x012e
        L_0x012b:
            r10 = 1
            r8.f8292c = r10
        L_0x012e:
            r10 = 0
            r4.f8152a0 = r10
            r4.f8154b0 = r10
            int r10 = r0.f775t
            int r10 = r10 - r5
            r19 = r8
            int[] r8 = r4.C
            r20 = r9
            r9 = 0
            r8[r9] = r10
            int r10 = r0.u
            int r10 = r10 - r2
            r21 = 1
            r8[r21] = r10
            r4.f8157d0 = r9
            r4.f8159e0 = r9
            r4.C(r13)
            r4.E(r1)
            r4.D(r15)
            r4.B(r14)
            int r1 = r0.f773r
            int r1 = r1 - r5
            if (r1 >= 0) goto L_0x015c
            r1 = 0
        L_0x015c:
            r4.f8157d0 = r1
            int r1 = r0.f774s
            int r1 = r1 - r2
            if (r1 >= 0) goto L_0x0164
            r1 = 0
        L_0x0164:
            r4.f8159e0 = r1
            r4.y0 = r12
            r4.f8195z0 = r11
            r6.getClass()
            r.b$b r1 = r4.f8193v0
            java.util.ArrayList<q.e> r2 = r4.f8205r0
            int r2 = r2.size()
            int r5 = r4.k()
            int r9 = r4.i()
            r10 = 128(0x80, float:1.794E-43)
            boolean r10 = q.j.b(r3, r10)
            r11 = 64
            if (r10 != 0) goto L_0x0190
            boolean r3 = q.j.b(r3, r11)
            if (r3 == 0) goto L_0x018e
            goto L_0x0190
        L_0x018e:
            r3 = 0
            goto L_0x0191
        L_0x0190:
            r3 = 1
        L_0x0191:
            if (r3 == 0) goto L_0x01e9
            r11 = 0
        L_0x0194:
            if (r11 >= r2) goto L_0x01e9
            java.util.ArrayList<q.e> r12 = r4.f8205r0
            java.lang.Object r12 = r12.get(r11)
            q.e r12 = (q.e) r12
            q.e$b[] r13 = r12.U
            r14 = 0
            r14 = r13[r14]
            q.e$b r15 = q.e.b.MATCH_CONSTRAINT
            if (r14 != r15) goto L_0x01a9
            r14 = 1
            goto L_0x01aa
        L_0x01a9:
            r14 = 0
        L_0x01aa:
            r21 = 1
            r13 = r13[r21]
            if (r13 != r15) goto L_0x01b2
            r13 = 1
            goto L_0x01b3
        L_0x01b2:
            r13 = 0
        L_0x01b3:
            if (r14 == 0) goto L_0x01c0
            if (r13 == 0) goto L_0x01c0
            float r13 = r12.Y
            r14 = 0
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x01c0
            r13 = 1
            goto L_0x01c1
        L_0x01c0:
            r13 = 0
        L_0x01c1:
            boolean r14 = r12.r()
            if (r14 == 0) goto L_0x01ca
            if (r13 == 0) goto L_0x01ca
            goto L_0x01e8
        L_0x01ca:
            boolean r14 = r12.s()
            if (r14 == 0) goto L_0x01d3
            if (r13 == 0) goto L_0x01d3
            goto L_0x01e8
        L_0x01d3:
            boolean r13 = r12 instanceof q.k
            if (r13 == 0) goto L_0x01d8
            goto L_0x01e8
        L_0x01d8:
            boolean r13 = r12.r()
            if (r13 != 0) goto L_0x01e8
            boolean r12 = r12.s()
            if (r12 == 0) goto L_0x01e5
            goto L_0x01e8
        L_0x01e5:
            int r11 = r11 + 1
            goto L_0x0194
        L_0x01e8:
            r3 = 0
        L_0x01e9:
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = r20
            if (r7 != r11) goto L_0x01f1
            if (r12 == r11) goto L_0x01f3
        L_0x01f1:
            if (r10 == 0) goto L_0x01f5
        L_0x01f3:
            r11 = 1
            goto L_0x01f6
        L_0x01f5:
            r11 = 0
        L_0x01f6:
            r3 = r3 & r11
            if (r3 == 0) goto L_0x045d
            r11 = 0
            r11 = r8[r11]
            r13 = r18
            int r11 = java.lang.Math.min(r11, r13)
            r13 = 1
            r8 = r8[r13]
            r14 = r16
            int r8 = java.lang.Math.min(r8, r14)
            r14 = 1073741824(0x40000000, float:2.0)
            if (r7 != r14) goto L_0x021d
            int r15 = r4.k()
            if (r15 == r11) goto L_0x021d
            r4.E(r11)
            r11 = r19
            r11.f8291b = r13
            goto L_0x021f
        L_0x021d:
            r11 = r19
        L_0x021f:
            if (r12 != r14) goto L_0x022c
            int r15 = r4.i()
            if (r15 == r8) goto L_0x022c
            r4.B(r8)
            r11.f8291b = r13
        L_0x022c:
            if (r7 != r14) goto L_0x03bc
            if (r12 != r14) goto L_0x03bc
            r8 = r10 & 1
            boolean r10 = r11.f8291b
            q.f r13 = r11.f8290a
            if (r10 != 0) goto L_0x023f
            boolean r10 = r11.f8292c
            if (r10 == 0) goto L_0x023d
            goto L_0x023f
        L_0x023d:
            r10 = 0
            goto L_0x0274
        L_0x023f:
            java.util.ArrayList<q.e> r10 = r13.f8205r0
            java.util.Iterator r10 = r10.iterator()
        L_0x0245:
            boolean r14 = r10.hasNext()
            if (r14 == 0) goto L_0x0262
            java.lang.Object r14 = r10.next()
            q.e r14 = (q.e) r14
            r14.f()
            r15 = 0
            r14.f8151a = r15
            r.l r15 = r14.d
            r15.n()
            r.n r14 = r14.f8158e
            r14.m()
            goto L_0x0245
        L_0x0262:
            r13.f()
            r10 = 0
            r13.f8151a = r10
            r.l r14 = r13.d
            r14.n()
            r.n r14 = r13.f8158e
            r14.m()
            r11.f8292c = r10
        L_0x0274:
            q.f r14 = r11.d
            r11.b(r14)
            r13.f8152a0 = r10
            r13.f8154b0 = r10
            q.e$b r10 = r13.h(r10)
            r14 = 1
            q.e$b r14 = r13.h(r14)
            boolean r15 = r11.f8291b
            if (r15 == 0) goto L_0x028d
            r11.c()
        L_0x028d:
            int r15 = r13.l()
            int r0 = r13.m()
            r16 = r3
            r.l r3 = r13.d
            r.f r3 = r3.f8326h
            r3.d(r15)
            r.n r3 = r13.f8158e
            r.f r3 = r3.f8326h
            r3.d(r0)
            r11.g()
            q.e$b r3 = q.e.b.WRAP_CONTENT
            r18 = r1
            java.util.ArrayList<r.p> r1 = r11.f8293e
            if (r10 == r3) goto L_0x02b6
            if (r14 != r3) goto L_0x02b3
            goto L_0x02b6
        L_0x02b3:
            r19 = r5
            goto L_0x0310
        L_0x02b6:
            if (r8 == 0) goto L_0x02cf
            java.util.Iterator r3 = r1.iterator()
        L_0x02bc:
            boolean r19 = r3.hasNext()
            if (r19 == 0) goto L_0x02cf
            java.lang.Object r19 = r3.next()
            r.p r19 = (r.p) r19
            boolean r19 = r19.k()
            if (r19 != 0) goto L_0x02bc
            r8 = 0
        L_0x02cf:
            if (r8 == 0) goto L_0x02f0
            q.e$b r3 = q.e.b.WRAP_CONTENT
            if (r10 != r3) goto L_0x02f0
            q.e$b r3 = q.e.b.FIXED
            r13.C(r3)
            r3 = 0
            int r3 = r11.d(r13, r3)
            r13.E(r3)
            r.l r3 = r13.d
            r.g r3 = r3.f8323e
            r19 = r5
            int r5 = r13.k()
            r3.d(r5)
            goto L_0x02f2
        L_0x02f0:
            r19 = r5
        L_0x02f2:
            if (r8 == 0) goto L_0x0310
            q.e$b r3 = q.e.b.WRAP_CONTENT
            if (r14 != r3) goto L_0x0310
            q.e$b r3 = q.e.b.FIXED
            r13.D(r3)
            r3 = 1
            int r3 = r11.d(r13, r3)
            r13.B(r3)
            r.n r3 = r13.f8158e
            r.g r3 = r3.f8323e
            int r5 = r13.i()
            r3.d(r5)
        L_0x0310:
            q.e$b[] r3 = r13.U
            r5 = 0
            r5 = r3[r5]
            q.e$b r8 = q.e.b.FIXED
            r20 = r9
            if (r5 == r8) goto L_0x0322
            q.e$b r9 = q.e.b.MATCH_PARENT
            if (r5 != r9) goto L_0x0320
            goto L_0x0322
        L_0x0320:
            r0 = 0
            goto L_0x035a
        L_0x0322:
            int r5 = r13.k()
            int r5 = r5 + r15
            r.l r9 = r13.d
            r.f r9 = r9.f8327i
            r9.d(r5)
            r.l r9 = r13.d
            r.g r9 = r9.f8323e
            int r5 = r5 - r15
            r9.d(r5)
            r11.g()
            r5 = 1
            r3 = r3[r5]
            if (r3 == r8) goto L_0x0342
            q.e$b r5 = q.e.b.MATCH_PARENT
            if (r3 != r5) goto L_0x0356
        L_0x0342:
            int r3 = r13.i()
            int r3 = r3 + r0
            r.n r5 = r13.f8158e
            r.f r5 = r5.f8327i
            r5.d(r3)
            r.n r5 = r13.f8158e
            r.g r5 = r5.f8323e
            int r3 = r3 - r0
            r5.d(r3)
        L_0x0356:
            r11.g()
            r0 = 1
        L_0x035a:
            java.util.Iterator r3 = r1.iterator()
        L_0x035e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0377
            java.lang.Object r5 = r3.next()
            r.p r5 = (r.p) r5
            q.e r8 = r5.f8321b
            if (r8 != r13) goto L_0x0373
            boolean r8 = r5.f8325g
            if (r8 != 0) goto L_0x0373
            goto L_0x035e
        L_0x0373:
            r5.e()
            goto L_0x035e
        L_0x0377:
            java.util.Iterator r1 = r1.iterator()
        L_0x037b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x03b0
            java.lang.Object r3 = r1.next()
            r.p r3 = (r.p) r3
            if (r0 != 0) goto L_0x038e
            q.e r5 = r3.f8321b
            if (r5 != r13) goto L_0x038e
            goto L_0x037b
        L_0x038e:
            r.f r5 = r3.f8326h
            boolean r5 = r5.f8305j
            if (r5 != 0) goto L_0x0395
            goto L_0x03ae
        L_0x0395:
            r.f r5 = r3.f8327i
            boolean r5 = r5.f8305j
            if (r5 != 0) goto L_0x03a0
            boolean r5 = r3 instanceof r.j
            if (r5 != 0) goto L_0x03a0
            goto L_0x03ae
        L_0x03a0:
            r.g r5 = r3.f8323e
            boolean r5 = r5.f8305j
            if (r5 != 0) goto L_0x037b
            boolean r5 = r3 instanceof r.c
            if (r5 != 0) goto L_0x037b
            boolean r3 = r3 instanceof r.j
            if (r3 != 0) goto L_0x037b
        L_0x03ae:
            r0 = 0
            goto L_0x03b1
        L_0x03b0:
            r0 = 1
        L_0x03b1:
            r13.C(r10)
            r13.D(r14)
            r1 = 1073741824(0x40000000, float:2.0)
            r3 = 2
            goto L_0x044d
        L_0x03bc:
            r18 = r1
            r16 = r3
            r19 = r5
            r20 = r9
            boolean r0 = r11.f8291b
            q.f r1 = r11.f8290a
            if (r0 == 0) goto L_0x0419
            java.util.ArrayList<q.e> r0 = r1.f8205r0
            java.util.Iterator r0 = r0.iterator()
        L_0x03d0:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x03f9
            java.lang.Object r3 = r0.next()
            q.e r3 = (q.e) r3
            r3.f()
            r5 = 0
            r3.f8151a = r5
            r.l r8 = r3.d
            r.g r9 = r8.f8323e
            r9.f8305j = r5
            r8.f8325g = r5
            r8.n()
            r.n r3 = r3.f8158e
            r.g r8 = r3.f8323e
            r8.f8305j = r5
            r3.f8325g = r5
            r3.m()
            goto L_0x03d0
        L_0x03f9:
            r0 = 0
            r1.f()
            r1.f8151a = r0
            r.l r3 = r1.d
            r.g r5 = r3.f8323e
            r5.f8305j = r0
            r3.f8325g = r0
            r3.n()
            r.n r3 = r1.f8158e
            r.g r5 = r3.f8323e
            r5.f8305j = r0
            r3.f8325g = r0
            r3.m()
            r11.c()
            goto L_0x041a
        L_0x0419:
            r0 = 0
        L_0x041a:
            q.f r3 = r11.d
            r11.b(r3)
            r1.f8152a0 = r0
            r1.f8154b0 = r0
            r.l r3 = r1.d
            r.f r3 = r3.f8326h
            r3.d(r0)
            r.n r1 = r1.f8158e
            r.f r1 = r1.f8326h
            r1.d(r0)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r7 != r1) goto L_0x043e
            boolean r0 = r4.K(r0, r10)
            r3 = 1
            r0 = r0 & 1
            r5 = r3
            goto L_0x0442
        L_0x043e:
            r3 = 1
            r0 = 0
            r5 = r0
            r0 = r3
        L_0x0442:
            if (r12 != r1) goto L_0x044c
            boolean r3 = r4.K(r3, r10)
            r0 = r0 & r3
            int r3 = r5 + 1
            goto L_0x044d
        L_0x044c:
            r3 = r5
        L_0x044d:
            if (r0 == 0) goto L_0x0467
            if (r7 != r1) goto L_0x0453
            r5 = 1
            goto L_0x0454
        L_0x0453:
            r5 = 0
        L_0x0454:
            if (r12 != r1) goto L_0x0458
            r1 = 1
            goto L_0x0459
        L_0x0458:
            r1 = 0
        L_0x0459:
            r4.F(r5, r1)
            goto L_0x0467
        L_0x045d:
            r18 = r1
            r16 = r3
            r19 = r5
            r20 = r9
            r0 = 0
            r3 = 0
        L_0x0467:
            if (r0 == 0) goto L_0x0470
            r0 = 2
            if (r3 == r0) goto L_0x046d
            goto L_0x0470
        L_0x046d:
            r1 = r4
            goto L_0x074e
        L_0x0470:
            int r0 = r4.E0
            r1 = 8
            if (r2 <= 0) goto L_0x0583
            java.util.ArrayList<q.e> r3 = r4.f8205r0
            int r3 = r3.size()
            r5 = 64
            boolean r5 = r4.M(r5)
            r.b$b r7 = r4.f8193v0
            r8 = 0
        L_0x0485:
            if (r8 >= r3) goto L_0x0515
            java.util.ArrayList<q.e> r9 = r4.f8205r0
            java.lang.Object r9 = r9.get(r8)
            q.e r9 = (q.e) r9
            boolean r10 = r9 instanceof q.g
            if (r10 == 0) goto L_0x0495
            goto L_0x0511
        L_0x0495:
            boolean r10 = r9 instanceof q.a
            if (r10 == 0) goto L_0x049b
            goto L_0x0511
        L_0x049b:
            boolean r10 = r9.G
            if (r10 == 0) goto L_0x04a1
            goto L_0x0511
        L_0x04a1:
            if (r5 == 0) goto L_0x04b8
            r.l r10 = r9.d
            if (r10 == 0) goto L_0x04b8
            r.n r11 = r9.f8158e
            if (r11 == 0) goto L_0x04b8
            r.g r10 = r10.f8323e
            boolean r10 = r10.f8305j
            if (r10 == 0) goto L_0x04b8
            r.g r10 = r11.f8323e
            boolean r10 = r10.f8305j
            if (r10 == 0) goto L_0x04b8
            goto L_0x0511
        L_0x04b8:
            r10 = 0
            q.e$b r10 = r9.h(r10)
            r11 = 1
            q.e$b r12 = r9.h(r11)
            q.e$b r13 = q.e.b.MATCH_CONSTRAINT
            if (r10 != r13) goto L_0x04d2
            int r14 = r9.f8183r
            if (r14 == r11) goto L_0x04d2
            if (r12 != r13) goto L_0x04d2
            int r14 = r9.f8184s
            if (r14 == r11) goto L_0x04d2
            r14 = r11
            goto L_0x04d3
        L_0x04d2:
            r14 = 0
        L_0x04d3:
            if (r14 != 0) goto L_0x050a
            boolean r11 = r4.M(r11)
            if (r11 == 0) goto L_0x050a
            boolean r11 = r9 instanceof q.k
            if (r11 != 0) goto L_0x050a
            if (r10 != r13) goto L_0x04ee
            int r11 = r9.f8183r
            if (r11 != 0) goto L_0x04ee
            if (r12 == r13) goto L_0x04ee
            boolean r11 = r9.r()
            if (r11 != 0) goto L_0x04ee
            r14 = 1
        L_0x04ee:
            if (r12 != r13) goto L_0x04fe
            int r11 = r9.f8184s
            if (r11 != 0) goto L_0x04fe
            if (r10 == r13) goto L_0x04fe
            boolean r11 = r9.r()
            if (r11 != 0) goto L_0x04fe
            r11 = 1
            r14 = r11
        L_0x04fe:
            if (r10 == r13) goto L_0x0502
            if (r12 != r13) goto L_0x050a
        L_0x0502:
            float r10 = r9.Y
            r11 = 0
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x050a
            r14 = 1
        L_0x050a:
            if (r14 == 0) goto L_0x050d
            goto L_0x0511
        L_0x050d:
            r10 = 0
            r6.a(r10, r9, r7)
        L_0x0511:
            int r8 = r8 + 1
            goto L_0x0485
        L_0x0515:
            androidx.constraintlayout.widget.ConstraintLayout$c r7 = (androidx.constraintlayout.widget.ConstraintLayout.c) r7
            androidx.constraintlayout.widget.ConstraintLayout r3 = r7.f818a
            int r5 = r3.getChildCount()
            r7 = 0
        L_0x051e:
            if (r7 >= r5) goto L_0x056c
            android.view.View r8 = r3.getChildAt(r7)
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.e
            if (r9 == 0) goto L_0x0569
            androidx.constraintlayout.widget.e r8 = (androidx.constraintlayout.widget.e) r8
            android.view.View r9 = r8.f929p
            if (r9 != 0) goto L_0x052f
            goto L_0x0569
        L_0x052f:
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$b r9 = (androidx.constraintlayout.widget.ConstraintLayout.b) r9
            android.view.View r8 = r8.f929p
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$b r8 = (androidx.constraintlayout.widget.ConstraintLayout.b) r8
            q.e r10 = r8.f809p0
            r11 = 0
            r10.f8167i0 = r11
            q.e r12 = r9.f809p0
            q.e$b[] r13 = r12.U
            r11 = r13[r11]
            q.e$b r13 = q.e.b.FIXED
            if (r11 == r13) goto L_0x0553
            int r10 = r10.k()
            r12.E(r10)
        L_0x0553:
            q.e r9 = r9.f809p0
            q.e$b[] r10 = r9.U
            r11 = 1
            r10 = r10[r11]
            if (r10 == r13) goto L_0x0565
            q.e r10 = r8.f809p0
            int r10 = r10.i()
            r9.B(r10)
        L_0x0565:
            q.e r8 = r8.f809p0
            r8.f8167i0 = r1
        L_0x0569:
            int r7 = r7 + 1
            goto L_0x051e
        L_0x056c:
            java.util.ArrayList<androidx.constraintlayout.widget.b> r1 = r3.f771p
            int r3 = r1.size()
            if (r3 <= 0) goto L_0x0583
            r5 = 0
        L_0x0575:
            if (r5 >= r3) goto L_0x0583
            java.lang.Object r7 = r1.get(r5)
            androidx.constraintlayout.widget.b r7 = (androidx.constraintlayout.widget.b) r7
            r7.getClass()
            int r5 = r5 + 1
            goto L_0x0575
        L_0x0583:
            r6.c(r4)
            java.util.ArrayList<q.e> r1 = r6.f8277a
            int r3 = r1.size()
            if (r2 <= 0) goto L_0x0597
            r2 = 0
            r5 = r19
            r7 = r20
            r6.b(r4, r2, r5, r7)
            goto L_0x059c
        L_0x0597:
            r5 = r19
            r7 = r20
            r2 = 0
        L_0x059c:
            if (r3 <= 0) goto L_0x0743
            q.e$b[] r8 = r4.U
            r2 = r8[r2]
            q.e$b r9 = q.e.b.WRAP_CONTENT
            if (r2 != r9) goto L_0x05a9
            r2 = 1
            r10 = 1
            goto L_0x05ab
        L_0x05a9:
            r2 = 1
            r10 = 0
        L_0x05ab:
            r2 = r8[r2]
            if (r2 != r9) goto L_0x05b1
            r2 = 1
            goto L_0x05b2
        L_0x05b1:
            r2 = 0
        L_0x05b2:
            int r8 = r4.k()
            q.f r9 = r6.f8279c
            int r11 = r9.f8157d0
            int r8 = java.lang.Math.max(r8, r11)
            int r11 = r4.i()
            int r9 = r9.f8159e0
            int r9 = java.lang.Math.max(r11, r9)
            r11 = 0
            r12 = 0
        L_0x05ca:
            if (r11 >= r3) goto L_0x065d
            java.lang.Object r13 = r1.get(r11)
            q.e r13 = (q.e) r13
            boolean r14 = r13 instanceof q.k
            if (r14 != 0) goto L_0x05de
            r19 = r0
            r20 = r4
            r4 = r18
            goto L_0x0653
        L_0x05de:
            int r14 = r13.k()
            int r15 = r13.i()
            r19 = r0
            r0 = 1
            r20 = r4
            r4 = r18
            boolean r0 = r6.a(r0, r13, r4)
            r0 = r0 | r12
            int r12 = r13.k()
            r18 = r0
            int r0 = r13.i()
            if (r12 == r14) goto L_0x0625
            r13.E(r12)
            if (r10 == 0) goto L_0x0622
            int r12 = r13.l()
            int r14 = r13.W
            int r12 = r12 + r14
            if (r12 <= r8) goto L_0x0622
            int r12 = r13.l()
            int r14 = r13.W
            int r12 = r12 + r14
            q.d$b r14 = q.d.b.RIGHT
            q.d r14 = r13.g(r14)
            int r14 = r14.d()
            int r14 = r14 + r12
            int r8 = java.lang.Math.max(r8, r14)
        L_0x0622:
            r12 = 1
            r18 = r12
        L_0x0625:
            if (r0 == r15) goto L_0x064e
            r13.B(r0)
            if (r2 == 0) goto L_0x064c
            int r0 = r13.m()
            int r12 = r13.X
            int r0 = r0 + r12
            if (r0 <= r9) goto L_0x064c
            int r0 = r13.m()
            int r12 = r13.X
            int r0 = r0 + r12
            q.d$b r12 = q.d.b.BOTTOM
            q.d r12 = r13.g(r12)
            int r12 = r12.d()
            int r12 = r12 + r0
            int r0 = java.lang.Math.max(r9, r12)
            r9 = r0
        L_0x064c:
            r18 = 1
        L_0x064e:
            q.k r13 = (q.k) r13
            r0 = r18 | 0
            r12 = r0
        L_0x0653:
            int r11 = r11 + 1
            r18 = r4
            r0 = r19
            r4 = r20
            goto L_0x05ca
        L_0x065d:
            r19 = r0
            r20 = r4
            r4 = r18
            r0 = 0
            r11 = 2
        L_0x0665:
            if (r0 >= r11) goto L_0x073e
            r11 = 0
        L_0x0668:
            if (r11 >= r3) goto L_0x0729
            java.lang.Object r13 = r1.get(r11)
            q.e r13 = (q.e) r13
            boolean r14 = r13 instanceof q.h
            if (r14 == 0) goto L_0x0678
            boolean r14 = r13 instanceof q.k
            if (r14 == 0) goto L_0x069b
        L_0x0678:
            boolean r14 = r13 instanceof q.g
            if (r14 == 0) goto L_0x067d
            goto L_0x069b
        L_0x067d:
            int r14 = r13.f8167i0
            r15 = 8
            if (r14 != r15) goto L_0x0684
            goto L_0x069b
        L_0x0684:
            if (r16 == 0) goto L_0x0697
            r.l r14 = r13.d
            r.g r14 = r14.f8323e
            boolean r14 = r14.f8305j
            if (r14 == 0) goto L_0x0697
            r.n r14 = r13.f8158e
            r.g r14 = r14.f8323e
            boolean r14 = r14.f8305j
            if (r14 == 0) goto L_0x0697
            goto L_0x069b
        L_0x0697:
            boolean r14 = r13 instanceof q.k
            if (r14 == 0) goto L_0x06a1
        L_0x069b:
            r18 = r1
            r21 = r3
            goto L_0x0721
        L_0x06a1:
            int r14 = r13.k()
            int r15 = r13.i()
            r18 = r1
            int r1 = r13.f8156c0
            r21 = r3
            r3 = 1
            if (r0 != r3) goto L_0x06b3
            r3 = 2
        L_0x06b3:
            boolean r3 = r6.a(r3, r13, r4)
            r3 = r3 | r12
            int r12 = r13.k()
            r22 = r3
            int r3 = r13.i()
            if (r12 == r14) goto L_0x06eb
            r13.E(r12)
            if (r10 == 0) goto L_0x06e8
            int r12 = r13.l()
            int r14 = r13.W
            int r12 = r12 + r14
            if (r12 <= r8) goto L_0x06e8
            int r12 = r13.l()
            int r14 = r13.W
            int r12 = r12 + r14
            q.d$b r14 = q.d.b.RIGHT
            q.d r14 = r13.g(r14)
            int r14 = r14.d()
            int r14 = r14 + r12
            int r8 = java.lang.Math.max(r8, r14)
        L_0x06e8:
            r12 = 1
            r22 = r12
        L_0x06eb:
            if (r3 == r15) goto L_0x0714
            r13.B(r3)
            if (r2 == 0) goto L_0x0712
            int r3 = r13.m()
            int r12 = r13.X
            int r3 = r3 + r12
            if (r3 <= r9) goto L_0x0712
            int r3 = r13.m()
            int r12 = r13.X
            int r3 = r3 + r12
            q.d$b r12 = q.d.b.BOTTOM
            q.d r12 = r13.g(r12)
            int r12 = r12.d()
            int r12 = r12 + r3
            int r3 = java.lang.Math.max(r9, r12)
            r9 = r3
        L_0x0712:
            r22 = 1
        L_0x0714:
            boolean r3 = r13.E
            if (r3 == 0) goto L_0x071f
            int r3 = r13.f8156c0
            if (r1 == r3) goto L_0x071f
            r1 = 1
            r12 = r1
            goto L_0x0721
        L_0x071f:
            r12 = r22
        L_0x0721:
            int r11 = r11 + 1
            r1 = r18
            r3 = r21
            goto L_0x0668
        L_0x0729:
            r18 = r1
            r21 = r3
            if (r12 == 0) goto L_0x073e
            int r0 = r0 + 1
            r1 = r20
            r6.b(r1, r0, r5, r7)
            r11 = 2
            r12 = 0
            r1 = r18
            r3 = r21
            goto L_0x0665
        L_0x073e:
            r1 = r20
            r0 = r19
            goto L_0x0744
        L_0x0743:
            r1 = r4
        L_0x0744:
            r1.E0 = r0
            r0 = 512(0x200, float:7.175E-43)
            boolean r0 = r1.M(r0)
            o.d.f7538p = r0
        L_0x074e:
            int r0 = r1.k()
            int r2 = r1.i()
            boolean r3 = r1.F0
            boolean r1 = r1.G0
            r4 = r17
            int r5 = r4.f821e
            int r4 = r4.d
            int r0 = r0 + r4
            int r2 = r2 + r5
            r4 = 0
            r5 = r25
            int r0 = android.view.View.resolveSizeAndState(r0, r5, r4)
            r5 = r26
            int r2 = android.view.View.resolveSizeAndState(r2, r5, r4)
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r4
            r2 = r2 & r4
            r4 = r24
            int r5 = r4.f775t
            int r0 = java.lang.Math.min(r5, r0)
            int r5 = r4.u
            int r2 = java.lang.Math.min(r5, r2)
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            if (r3 == 0) goto L_0x0787
            r0 = r0 | r5
        L_0x0787:
            if (r1 == 0) goto L_0x078a
            r2 = r2 | r5
        L_0x078a:
            r4.setMeasuredDimension(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        e c10 = c(view);
        if ((view instanceof Guideline) && !(c10 instanceof g)) {
            b bVar = (b) view.getLayoutParams();
            g gVar = new g();
            bVar.f809p0 = gVar;
            bVar.f785c0 = true;
            gVar.H(bVar.U);
        }
        if (view instanceof b) {
            b bVar2 = (b) view;
            bVar2.k();
            ((b) view.getLayoutParams()).f786d0 = true;
            ArrayList<b> arrayList = this.f771p;
            if (!arrayList.contains(bVar2)) {
                arrayList.add(bVar2);
            }
        }
        this.f770o.put(view.getId(), view);
        this.f776v = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f770o.remove(view.getId());
        e c10 = c(view);
        this.f772q.f8205r0.remove(c10);
        c10.w();
        this.f771p.remove(view);
        this.f776v = true;
    }

    public void requestLayout() {
        this.f776v = true;
        super.requestLayout();
    }

    public void setConstraintSet(c cVar) {
        this.f777x = cVar;
    }

    public void setId(int i10) {
        int id = getId();
        SparseArray<View> sparseArray = this.f770o;
        sparseArray.remove(id);
        super.setId(i10);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 != this.u) {
            this.u = i10;
            requestLayout();
        }
    }

    public void setMaxWidth(int i10) {
        if (i10 != this.f775t) {
            this.f775t = i10;
            requestLayout();
        }
    }

    public void setMinHeight(int i10) {
        if (i10 != this.f774s) {
            this.f774s = i10;
            requestLayout();
        }
    }

    public void setMinWidth(int i10) {
        if (i10 != this.f773r) {
            this.f773r = i10;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(t.b bVar) {
        t.a aVar = this.f778y;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    public void setOptimizationLevel(int i10) {
        this.w = i10;
        f fVar = this.f772q;
        fVar.E0 = i10;
        o.d.f7538p = fVar.M(512);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.appcompat.widget.x0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.karumi.dexter.R;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p9.u;

public final class c {
    public static final int[] d = {0, 4, 8};

    /* renamed from: e  reason: collision with root package name */
    public static final SparseIntArray f840e;

    /* renamed from: f  reason: collision with root package name */
    public static final SparseIntArray f841f;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, a> f842a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f843b = true;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<Integer, a> f844c = new HashMap<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f845a;

        /* renamed from: b  reason: collision with root package name */
        public final d f846b = new d();

        /* renamed from: c  reason: collision with root package name */
        public final C0011c f847c = new C0011c();
        public final b d = new b();

        /* renamed from: e  reason: collision with root package name */
        public final e f848e = new e();

        /* renamed from: f  reason: collision with root package name */
        public HashMap<String, a> f849f = new HashMap<>();

        /* renamed from: androidx.constraintlayout.widget.c$a$a  reason: collision with other inner class name */
        public static class C0010a {

            /* renamed from: a  reason: collision with root package name */
            public int[] f850a = new int[10];

            /* renamed from: b  reason: collision with root package name */
            public int[] f851b = new int[10];

            /* renamed from: c  reason: collision with root package name */
            public int f852c = 0;
            public int[] d = new int[10];

            /* renamed from: e  reason: collision with root package name */
            public float[] f853e = new float[10];

            /* renamed from: f  reason: collision with root package name */
            public int f854f = 0;

            /* renamed from: g  reason: collision with root package name */
            public int[] f855g = new int[5];

            /* renamed from: h  reason: collision with root package name */
            public String[] f856h = new String[5];

            /* renamed from: i  reason: collision with root package name */
            public int f857i = 0;

            /* renamed from: j  reason: collision with root package name */
            public int[] f858j = new int[4];

            /* renamed from: k  reason: collision with root package name */
            public boolean[] f859k = new boolean[4];
            public int l = 0;

            public final void a(int i10, float f10) {
                int i11 = this.f854f;
                int[] iArr = this.d;
                if (i11 >= iArr.length) {
                    this.d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f853e;
                    this.f853e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.d;
                int i12 = this.f854f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f853e;
                this.f854f = i12 + 1;
                fArr2[i12] = f10;
            }

            public final void b(int i10, int i11) {
                int i12 = this.f852c;
                int[] iArr = this.f850a;
                if (i12 >= iArr.length) {
                    this.f850a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f851b;
                    this.f851b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f850a;
                int i13 = this.f852c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f851b;
                this.f852c = i13 + 1;
                iArr4[i13] = i11;
            }

            public final void c(int i10, boolean z) {
                int i11 = this.l;
                int[] iArr = this.f858j;
                if (i11 >= iArr.length) {
                    this.f858j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f859k;
                    this.f859k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f858j;
                int i12 = this.l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f859k;
                this.l = i12 + 1;
                zArr2[i12] = z;
            }

            public final void d(String str, int i10) {
                int i11 = this.f857i;
                int[] iArr = this.f855g;
                if (i11 >= iArr.length) {
                    this.f855g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f856h;
                    this.f856h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f855g;
                int i12 = this.f857i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f856h;
                this.f857i = i12 + 1;
                strArr2[i12] = str;
            }
        }

        public final void a(ConstraintLayout.b bVar) {
            b bVar2 = this.d;
            bVar.d = bVar2.f872g;
            bVar.f787e = bVar2.f874h;
            bVar.f789f = bVar2.f876i;
            bVar.f791g = bVar2.f878j;
            bVar.f793h = bVar2.f880k;
            bVar.f795i = bVar2.l;
            bVar.f797j = bVar2.f883m;
            bVar.f799k = bVar2.f885n;
            bVar.l = bVar2.f887o;
            bVar.f802m = bVar2.f888p;
            bVar.f804n = bVar2.f889q;
            bVar.f811r = bVar2.f890r;
            bVar.f812s = bVar2.f891s;
            bVar.f813t = bVar2.f892t;
            bVar.u = bVar2.u;
            bVar.leftMargin = bVar2.E;
            bVar.rightMargin = bVar2.F;
            bVar.topMargin = bVar2.G;
            bVar.bottomMargin = bVar2.H;
            bVar.z = bVar2.Q;
            bVar.A = bVar2.P;
            bVar.w = bVar2.M;
            bVar.f816y = bVar2.O;
            bVar.D = bVar2.f893v;
            bVar.E = bVar2.w;
            bVar.f806o = bVar2.f895y;
            bVar.f808p = bVar2.z;
            bVar.f810q = bVar2.A;
            bVar.F = bVar2.f894x;
            bVar.S = bVar2.B;
            bVar.T = bVar2.C;
            bVar.H = bVar2.S;
            bVar.G = bVar2.T;
            bVar.J = bVar2.V;
            bVar.I = bVar2.U;
            bVar.V = bVar2.f881k0;
            bVar.W = bVar2.f882l0;
            bVar.K = bVar2.W;
            bVar.L = bVar2.X;
            bVar.O = bVar2.Y;
            bVar.P = bVar2.Z;
            bVar.M = bVar2.f862a0;
            bVar.N = bVar2.f864b0;
            bVar.Q = bVar2.f866c0;
            bVar.R = bVar2.f867d0;
            bVar.U = bVar2.D;
            bVar.f784c = bVar2.f870f;
            bVar.f780a = bVar2.d;
            bVar.f782b = bVar2.f868e;
            bVar.width = bVar2.f863b;
            bVar.height = bVar2.f865c;
            String str = bVar2.f879j0;
            if (str != null) {
                bVar.X = str;
            }
            bVar.Y = bVar2.f886n0;
            bVar.setMarginStart(bVar2.J);
            bVar.setMarginEnd(bVar2.I);
            bVar.a();
        }

        public final void b(int i10, ConstraintLayout.b bVar) {
            this.f845a = i10;
            int i11 = bVar.d;
            b bVar2 = this.d;
            bVar2.f872g = i11;
            bVar2.f874h = bVar.f787e;
            bVar2.f876i = bVar.f789f;
            bVar2.f878j = bVar.f791g;
            bVar2.f880k = bVar.f793h;
            bVar2.l = bVar.f795i;
            bVar2.f883m = bVar.f797j;
            bVar2.f885n = bVar.f799k;
            bVar2.f887o = bVar.l;
            bVar2.f888p = bVar.f802m;
            bVar2.f889q = bVar.f804n;
            bVar2.f890r = bVar.f811r;
            bVar2.f891s = bVar.f812s;
            bVar2.f892t = bVar.f813t;
            bVar2.u = bVar.u;
            bVar2.f893v = bVar.D;
            bVar2.w = bVar.E;
            bVar2.f894x = bVar.F;
            bVar2.f895y = bVar.f806o;
            bVar2.z = bVar.f808p;
            bVar2.A = bVar.f810q;
            bVar2.B = bVar.S;
            bVar2.C = bVar.T;
            bVar2.D = bVar.U;
            bVar2.f870f = bVar.f784c;
            bVar2.d = bVar.f780a;
            bVar2.f868e = bVar.f782b;
            bVar2.f863b = bVar.width;
            bVar2.f865c = bVar.height;
            bVar2.E = bVar.leftMargin;
            bVar2.F = bVar.rightMargin;
            bVar2.G = bVar.topMargin;
            bVar2.H = bVar.bottomMargin;
            bVar2.K = bVar.C;
            bVar2.S = bVar.H;
            bVar2.T = bVar.G;
            bVar2.V = bVar.J;
            bVar2.U = bVar.I;
            bVar2.f881k0 = bVar.V;
            bVar2.f882l0 = bVar.W;
            bVar2.W = bVar.K;
            bVar2.X = bVar.L;
            bVar2.Y = bVar.O;
            bVar2.Z = bVar.P;
            bVar2.f862a0 = bVar.M;
            bVar2.f864b0 = bVar.N;
            bVar2.f866c0 = bVar.Q;
            bVar2.f867d0 = bVar.R;
            bVar2.f879j0 = bVar.X;
            bVar2.M = bVar.w;
            bVar2.O = bVar.f816y;
            bVar2.L = bVar.f814v;
            bVar2.N = bVar.f815x;
            bVar2.Q = bVar.z;
            bVar2.P = bVar.A;
            bVar2.R = bVar.B;
            bVar2.f886n0 = bVar.Y;
            bVar2.I = bVar.getMarginEnd();
            bVar2.J = bVar.getMarginStart();
        }

        public final void c(int i10, d.a aVar) {
            b(i10, aVar);
            this.f846b.f907c = aVar.f921q0;
            float f10 = aVar.t0;
            e eVar = this.f848e;
            eVar.f909a = f10;
            eVar.f910b = aVar.f924u0;
            eVar.f911c = aVar.f925v0;
            eVar.d = aVar.f926w0;
            eVar.f912e = aVar.x0;
            eVar.f913f = aVar.y0;
            eVar.f914g = aVar.f927z0;
            eVar.f916i = aVar.A0;
            eVar.f917j = aVar.B0;
            eVar.f918k = aVar.C0;
            eVar.f919m = aVar.f923s0;
            eVar.l = aVar.f922r0;
        }

        public final Object clone() {
            a aVar = new a();
            b bVar = aVar.d;
            bVar.getClass();
            b bVar2 = this.d;
            bVar.f861a = bVar2.f861a;
            bVar.f863b = bVar2.f863b;
            bVar.f865c = bVar2.f865c;
            bVar.d = bVar2.d;
            bVar.f868e = bVar2.f868e;
            bVar.f870f = bVar2.f870f;
            bVar.f872g = bVar2.f872g;
            bVar.f874h = bVar2.f874h;
            bVar.f876i = bVar2.f876i;
            bVar.f878j = bVar2.f878j;
            bVar.f880k = bVar2.f880k;
            bVar.l = bVar2.l;
            bVar.f883m = bVar2.f883m;
            bVar.f885n = bVar2.f885n;
            bVar.f887o = bVar2.f887o;
            bVar.f888p = bVar2.f888p;
            bVar.f889q = bVar2.f889q;
            bVar.f890r = bVar2.f890r;
            bVar.f891s = bVar2.f891s;
            bVar.f892t = bVar2.f892t;
            bVar.u = bVar2.u;
            bVar.f893v = bVar2.f893v;
            bVar.w = bVar2.w;
            bVar.f894x = bVar2.f894x;
            bVar.f895y = bVar2.f895y;
            bVar.z = bVar2.z;
            bVar.A = bVar2.A;
            bVar.B = bVar2.B;
            bVar.C = bVar2.C;
            bVar.D = bVar2.D;
            bVar.E = bVar2.E;
            bVar.F = bVar2.F;
            bVar.G = bVar2.G;
            bVar.H = bVar2.H;
            bVar.I = bVar2.I;
            bVar.J = bVar2.J;
            bVar.K = bVar2.K;
            bVar.L = bVar2.L;
            bVar.M = bVar2.M;
            bVar.N = bVar2.N;
            bVar.O = bVar2.O;
            bVar.P = bVar2.P;
            bVar.Q = bVar2.Q;
            bVar.R = bVar2.R;
            bVar.S = bVar2.S;
            bVar.T = bVar2.T;
            bVar.U = bVar2.U;
            bVar.V = bVar2.V;
            bVar.W = bVar2.W;
            bVar.X = bVar2.X;
            bVar.Y = bVar2.Y;
            bVar.Z = bVar2.Z;
            bVar.f862a0 = bVar2.f862a0;
            bVar.f864b0 = bVar2.f864b0;
            bVar.f866c0 = bVar2.f866c0;
            bVar.f867d0 = bVar2.f867d0;
            bVar.f869e0 = bVar2.f869e0;
            bVar.f871f0 = bVar2.f871f0;
            bVar.f873g0 = bVar2.f873g0;
            bVar.f879j0 = bVar2.f879j0;
            int[] iArr = bVar2.f875h0;
            if (iArr == null || bVar2.f877i0 != null) {
                bVar.f875h0 = null;
            } else {
                bVar.f875h0 = Arrays.copyOf(iArr, iArr.length);
            }
            bVar.f877i0 = bVar2.f877i0;
            bVar.f881k0 = bVar2.f881k0;
            bVar.f882l0 = bVar2.f882l0;
            bVar.f884m0 = bVar2.f884m0;
            bVar.f886n0 = bVar2.f886n0;
            C0011c cVar = aVar.f847c;
            cVar.getClass();
            C0011c cVar2 = this.f847c;
            cVar2.getClass();
            cVar.f897a = cVar2.f897a;
            cVar.f899c = cVar2.f899c;
            cVar.f900e = cVar2.f900e;
            cVar.d = cVar2.d;
            d dVar = aVar.f846b;
            dVar.getClass();
            d dVar2 = this.f846b;
            dVar2.getClass();
            dVar.f905a = dVar2.f905a;
            dVar.f907c = dVar2.f907c;
            dVar.d = dVar2.d;
            dVar.f906b = dVar2.f906b;
            e eVar = aVar.f848e;
            eVar.getClass();
            e eVar2 = this.f848e;
            eVar2.getClass();
            eVar.f909a = eVar2.f909a;
            eVar.f910b = eVar2.f910b;
            eVar.f911c = eVar2.f911c;
            eVar.d = eVar2.d;
            eVar.f912e = eVar2.f912e;
            eVar.f913f = eVar2.f913f;
            eVar.f914g = eVar2.f914g;
            eVar.f915h = eVar2.f915h;
            eVar.f916i = eVar2.f916i;
            eVar.f917j = eVar2.f917j;
            eVar.f918k = eVar2.f918k;
            eVar.l = eVar2.l;
            eVar.f919m = eVar2.f919m;
            aVar.f845a = this.f845a;
            return aVar;
        }
    }

    public static class b {

        /* renamed from: o0  reason: collision with root package name */
        public static final SparseIntArray f860o0;
        public float A = 0.0f;
        public int B = -1;
        public int C = -1;
        public int D = -1;
        public int E = 0;
        public int F = 0;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = Integer.MIN_VALUE;
        public int M = Integer.MIN_VALUE;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public float S = -1.0f;
        public float T = -1.0f;
        public int U = 0;
        public int V = 0;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f861a = false;

        /* renamed from: a0  reason: collision with root package name */
        public int f862a0 = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f863b;

        /* renamed from: b0  reason: collision with root package name */
        public int f864b0 = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f865c;

        /* renamed from: c0  reason: collision with root package name */
        public float f866c0 = 1.0f;
        public int d = -1;

        /* renamed from: d0  reason: collision with root package name */
        public float f867d0 = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public int f868e = -1;

        /* renamed from: e0  reason: collision with root package name */
        public int f869e0 = -1;

        /* renamed from: f  reason: collision with root package name */
        public float f870f = -1.0f;

        /* renamed from: f0  reason: collision with root package name */
        public int f871f0 = 0;

        /* renamed from: g  reason: collision with root package name */
        public int f872g = -1;

        /* renamed from: g0  reason: collision with root package name */
        public int f873g0 = -1;

        /* renamed from: h  reason: collision with root package name */
        public int f874h = -1;

        /* renamed from: h0  reason: collision with root package name */
        public int[] f875h0;

        /* renamed from: i  reason: collision with root package name */
        public int f876i = -1;

        /* renamed from: i0  reason: collision with root package name */
        public String f877i0;

        /* renamed from: j  reason: collision with root package name */
        public int f878j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public String f879j0;

        /* renamed from: k  reason: collision with root package name */
        public int f880k = -1;

        /* renamed from: k0  reason: collision with root package name */
        public boolean f881k0 = false;
        public int l = -1;

        /* renamed from: l0  reason: collision with root package name */
        public boolean f882l0 = false;

        /* renamed from: m  reason: collision with root package name */
        public int f883m = -1;

        /* renamed from: m0  reason: collision with root package name */
        public boolean f884m0 = true;

        /* renamed from: n  reason: collision with root package name */
        public int f885n = -1;

        /* renamed from: n0  reason: collision with root package name */
        public int f886n0 = 0;

        /* renamed from: o  reason: collision with root package name */
        public int f887o = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f888p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f889q = -1;

        /* renamed from: r  reason: collision with root package name */
        public int f890r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f891s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f892t = -1;
        public int u = -1;

        /* renamed from: v  reason: collision with root package name */
        public float f893v = 0.5f;
        public float w = 0.5f;

        /* renamed from: x  reason: collision with root package name */
        public String f894x = null;

        /* renamed from: y  reason: collision with root package name */
        public int f895y = -1;
        public int z = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f860o0 = sparseIntArray;
            sparseIntArray.append(42, 24);
            sparseIntArray.append(43, 25);
            sparseIntArray.append(45, 28);
            sparseIntArray.append(46, 29);
            sparseIntArray.append(51, 35);
            sparseIntArray.append(50, 34);
            sparseIntArray.append(23, 4);
            sparseIntArray.append(22, 3);
            sparseIntArray.append(18, 1);
            sparseIntArray.append(60, 6);
            sparseIntArray.append(61, 7);
            sparseIntArray.append(30, 17);
            sparseIntArray.append(31, 18);
            sparseIntArray.append(32, 19);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(47, 31);
            sparseIntArray.append(48, 32);
            sparseIntArray.append(29, 10);
            sparseIntArray.append(28, 9);
            sparseIntArray.append(65, 13);
            sparseIntArray.append(68, 16);
            sparseIntArray.append(66, 14);
            sparseIntArray.append(63, 11);
            sparseIntArray.append(67, 15);
            sparseIntArray.append(64, 12);
            sparseIntArray.append(54, 38);
            sparseIntArray.append(40, 37);
            sparseIntArray.append(39, 39);
            sparseIntArray.append(53, 40);
            sparseIntArray.append(38, 20);
            sparseIntArray.append(52, 36);
            sparseIntArray.append(27, 5);
            sparseIntArray.append(41, 76);
            sparseIntArray.append(49, 76);
            sparseIntArray.append(44, 76);
            sparseIntArray.append(21, 76);
            sparseIntArray.append(17, 76);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(55, 41);
            sparseIntArray.append(33, 42);
            sparseIntArray.append(16, 41);
            sparseIntArray.append(15, 42);
            sparseIntArray.append(70, 97);
            sparseIntArray.append(24, 61);
            sparseIntArray.append(26, 62);
            sparseIntArray.append(25, 63);
            sparseIntArray.append(59, 69);
            sparseIntArray.append(37, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            String str;
            String str2;
            int i10;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f8102a0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                SparseIntArray sparseIntArray = f860o0;
                int i12 = sparseIntArray.get(index);
                if (i12 == 80) {
                    this.f881k0 = obtainStyledAttributes.getBoolean(index, this.f881k0);
                } else if (i12 == 81) {
                    this.f882l0 = obtainStyledAttributes.getBoolean(index, this.f882l0);
                } else if (i12 != 97) {
                    switch (i12) {
                        case 1:
                            this.f887o = c.g(obtainStyledAttributes, index, this.f887o);
                            break;
                        case 2:
                            this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            break;
                        case 3:
                            this.f885n = c.g(obtainStyledAttributes, index, this.f885n);
                            break;
                        case 4:
                            this.f883m = c.g(obtainStyledAttributes, index, this.f883m);
                            break;
                        case 5:
                            this.f894x = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.B = obtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                            break;
                        case 7:
                            this.C = obtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                            break;
                        case 8:
                            this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                            break;
                        case 9:
                            this.u = c.g(obtainStyledAttributes, index, this.u);
                            break;
                        case 10:
                            this.f892t = c.g(obtainStyledAttributes, index, this.f892t);
                            break;
                        case 11:
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        case 12:
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        case 13:
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        case 14:
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        case 15:
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        case 16:
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        case 17:
                            this.d = obtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                            break;
                        case 18:
                            this.f868e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f868e);
                            break;
                        case 19:
                            this.f870f = obtainStyledAttributes.getFloat(index, this.f870f);
                            break;
                        case 20:
                            this.f893v = obtainStyledAttributes.getFloat(index, this.f893v);
                            break;
                        case 21:
                            this.f865c = obtainStyledAttributes.getLayoutDimension(index, this.f865c);
                            break;
                        case 22:
                            this.f863b = obtainStyledAttributes.getLayoutDimension(index, this.f863b);
                            break;
                        case 23:
                            this.E = obtainStyledAttributes.getDimensionPixelSize(index, this.E);
                            break;
                        case 24:
                            this.f872g = c.g(obtainStyledAttributes, index, this.f872g);
                            break;
                        case 25:
                            this.f874h = c.g(obtainStyledAttributes, index, this.f874h);
                            break;
                        case 26:
                            this.D = obtainStyledAttributes.getInt(index, this.D);
                            break;
                        case 27:
                            this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                            break;
                        case 28:
                            this.f876i = c.g(obtainStyledAttributes, index, this.f876i);
                            break;
                        case 29:
                            this.f878j = c.g(obtainStyledAttributes, index, this.f878j);
                            break;
                        case 30:
                            this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            break;
                        case 31:
                            this.f890r = c.g(obtainStyledAttributes, index, this.f890r);
                            break;
                        case 32:
                            this.f891s = c.g(obtainStyledAttributes, index, this.f891s);
                            break;
                        case 33:
                            this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            break;
                        case 34:
                            this.l = c.g(obtainStyledAttributes, index, this.l);
                            break;
                        case 35:
                            this.f880k = c.g(obtainStyledAttributes, index, this.f880k);
                            break;
                        case 36:
                            this.w = obtainStyledAttributes.getFloat(index, this.w);
                            break;
                        case 37:
                            this.T = obtainStyledAttributes.getFloat(index, this.T);
                            break;
                        case 38:
                            this.S = obtainStyledAttributes.getFloat(index, this.S);
                            break;
                        case 39:
                            this.U = obtainStyledAttributes.getInt(index, this.U);
                            break;
                        case 40:
                            this.V = obtainStyledAttributes.getInt(index, this.V);
                            break;
                        case 41:
                            c.h(this, obtainStyledAttributes, index, 0);
                            break;
                        case 42:
                            c.h(this, obtainStyledAttributes, index, 1);
                            break;
                        default:
                            switch (i12) {
                                case 54:
                                    this.W = obtainStyledAttributes.getInt(index, this.W);
                                    break;
                                case 55:
                                    this.X = obtainStyledAttributes.getInt(index, this.X);
                                    break;
                                case 56:
                                    this.Y = obtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                    break;
                                case 57:
                                    this.Z = obtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                    break;
                                case 58:
                                    this.f862a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f862a0);
                                    break;
                                case 59:
                                    this.f864b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f864b0);
                                    break;
                                default:
                                    switch (i12) {
                                        case 61:
                                            this.f895y = c.g(obtainStyledAttributes, index, this.f895y);
                                            break;
                                        case 62:
                                            this.z = obtainStyledAttributes.getDimensionPixelSize(index, this.z);
                                            break;
                                        case 63:
                                            this.A = obtainStyledAttributes.getFloat(index, this.A);
                                            break;
                                        default:
                                            switch (i12) {
                                                case R.styleable.AppCompatTheme_editTextColor /*69*/:
                                                    this.f866c0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case R.styleable.AppCompatTheme_editTextStyle /*70*/:
                                                    this.f867d0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case R.styleable.AppCompatTheme_homeAsUpIndicator /*71*/:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case R.styleable.AppCompatTheme_imageButtonStyle /*72*/:
                                                    this.f869e0 = obtainStyledAttributes.getInt(index, this.f869e0);
                                                    continue;
                                                case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /*73*/:
                                                    this.f871f0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f871f0);
                                                    continue;
                                                case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /*74*/:
                                                    this.f877i0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /*75*/:
                                                    this.f884m0 = obtainStyledAttributes.getBoolean(index, this.f884m0);
                                                    continue;
                                                case R.styleable.AppCompatTheme_listDividerAlertDialog /*76*/:
                                                    str = Integer.toHexString(index);
                                                    i10 = sparseIntArray.get(index);
                                                    sb = new StringBuilder(x0.a(str, 33));
                                                    str2 = "unused attribute 0x";
                                                    break;
                                                case R.styleable.AppCompatTheme_listMenuViewStyle /*77*/:
                                                    this.f879j0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    switch (i12) {
                                                        case R.styleable.AppCompatTheme_radioButtonStyle /*91*/:
                                                            this.f888p = c.g(obtainStyledAttributes, index, this.f888p);
                                                            continue;
                                                        case R.styleable.AppCompatTheme_ratingBarStyle /*92*/:
                                                            this.f889q = c.g(obtainStyledAttributes, index, this.f889q);
                                                            continue;
                                                        case R.styleable.AppCompatTheme_ratingBarStyleIndicator /*93*/:
                                                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                                                            continue;
                                                        case R.styleable.AppCompatTheme_ratingBarStyleSmall /*94*/:
                                                            this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                                                            continue;
                                                            continue;
                                                        default:
                                                            str = Integer.toHexString(index);
                                                            i10 = sparseIntArray.get(index);
                                                            sb = new StringBuilder(x0.a(str, 34));
                                                            str2 = "Unknown attribute 0x";
                                                            break;
                                                    }
                                            }
                                            sb.append(str2);
                                            sb.append(str);
                                            sb.append("   ");
                                            sb.append(i10);
                                            Log.w("ConstraintSet", sb.toString());
                                            break;
                                    }
                            }
                    }
                } else {
                    this.f886n0 = obtainStyledAttributes.getInt(index, this.f886n0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$c  reason: collision with other inner class name */
    public static class C0011c {

        /* renamed from: j  reason: collision with root package name */
        public static final SparseIntArray f896j;

        /* renamed from: a  reason: collision with root package name */
        public int f897a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f898b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f899c = -1;
        public float d = Float.NaN;

        /* renamed from: e  reason: collision with root package name */
        public float f900e = Float.NaN;

        /* renamed from: f  reason: collision with root package name */
        public float f901f = Float.NaN;

        /* renamed from: g  reason: collision with root package name */
        public int f902g = -1;

        /* renamed from: h  reason: collision with root package name */
        public String f903h = null;

        /* renamed from: i  reason: collision with root package name */
        public int f904i = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f896j = sparseIntArray;
            sparseIntArray.append(3, 1);
            sparseIntArray.append(5, 2);
            sparseIntArray.append(9, 3);
            sparseIntArray.append(2, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(4, 7);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(7, 9);
            sparseIntArray.append(6, 10);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f8103b0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f896j.get(index)) {
                    case 1:
                        this.f900e = obtainStyledAttributes.getFloat(index, this.f900e);
                        break;
                    case 2:
                        this.f899c = obtainStyledAttributes.getInt(index, this.f899c);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            String str = p.a.f7800b[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 4:
                        obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f897a = c.g(obtainStyledAttributes, index, this.f897a);
                        break;
                    case 6:
                        this.f898b = obtainStyledAttributes.getInteger(index, this.f898b);
                        break;
                    case 7:
                        this.d = obtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 8:
                        this.f902g = obtainStyledAttributes.getInteger(index, this.f902g);
                        break;
                    case 9:
                        this.f901f = obtainStyledAttributes.getFloat(index, this.f901f);
                        break;
                    case 10:
                        int i11 = obtainStyledAttributes.peekValue(index).type;
                        if (i11 != 1) {
                            if (i11 != 3) {
                                obtainStyledAttributes.getInteger(index, this.f904i);
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                this.f903h = string;
                                if (string.indexOf("/") <= 0) {
                                    break;
                                }
                            }
                        }
                        this.f904i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f905a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f906b = 0;

        /* renamed from: c  reason: collision with root package name */
        public float f907c = 1.0f;
        public float d = Float.NaN;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f8105d0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.f907c = obtainStyledAttributes.getFloat(index, this.f907c);
                } else if (index == 0) {
                    int i11 = obtainStyledAttributes.getInt(index, this.f905a);
                    this.f905a = i11;
                    this.f905a = c.d[i11];
                } else if (index == 4) {
                    this.f906b = obtainStyledAttributes.getInt(index, this.f906b);
                } else if (index == 3) {
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* renamed from: n  reason: collision with root package name */
        public static final SparseIntArray f908n;

        /* renamed from: a  reason: collision with root package name */
        public float f909a = 0.0f;

        /* renamed from: b  reason: collision with root package name */
        public float f910b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f911c = 0.0f;
        public float d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f912e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f913f = Float.NaN;

        /* renamed from: g  reason: collision with root package name */
        public float f914g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public int f915h = -1;

        /* renamed from: i  reason: collision with root package name */
        public float f916i = 0.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f917j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f918k = 0.0f;
        public boolean l = false;

        /* renamed from: m  reason: collision with root package name */
        public float f919m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f908n = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
            sparseIntArray.append(11, 12);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f8107f0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f908n.get(index)) {
                    case 1:
                        this.f909a = obtainStyledAttributes.getFloat(index, this.f909a);
                        break;
                    case 2:
                        this.f910b = obtainStyledAttributes.getFloat(index, this.f910b);
                        break;
                    case 3:
                        this.f911c = obtainStyledAttributes.getFloat(index, this.f911c);
                        break;
                    case 4:
                        this.d = obtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 5:
                        this.f912e = obtainStyledAttributes.getFloat(index, this.f912e);
                        break;
                    case 6:
                        this.f913f = obtainStyledAttributes.getDimension(index, this.f913f);
                        break;
                    case 7:
                        this.f914g = obtainStyledAttributes.getDimension(index, this.f914g);
                        break;
                    case 8:
                        this.f916i = obtainStyledAttributes.getDimension(index, this.f916i);
                        break;
                    case 9:
                        this.f917j = obtainStyledAttributes.getDimension(index, this.f917j);
                        break;
                    case 10:
                        this.f918k = obtainStyledAttributes.getDimension(index, this.f918k);
                        break;
                    case 11:
                        this.l = true;
                        this.f919m = obtainStyledAttributes.getDimension(index, this.f919m);
                        break;
                    case 12:
                        this.f915h = c.g(obtainStyledAttributes, index, this.f915h);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f840e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f841f = sparseIntArray2;
        sparseIntArray.append(81, 25);
        sparseIntArray.append(82, 26);
        sparseIntArray.append(84, 29);
        sparseIntArray.append(85, 30);
        sparseIntArray.append(91, 36);
        sparseIntArray.append(90, 35);
        sparseIntArray.append(62, 4);
        sparseIntArray.append(61, 3);
        sparseIntArray.append(57, 1);
        sparseIntArray.append(59, 91);
        sparseIntArray.append(58, 92);
        sparseIntArray.append(100, 6);
        sparseIntArray.append(R.styleable.AppCompatTheme_switchStyle, 7);
        sparseIntArray.append(69, 17);
        sparseIntArray.append(70, 18);
        sparseIntArray.append(71, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(86, 32);
        sparseIntArray.append(87, 33);
        sparseIntArray.append(68, 10);
        sparseIntArray.append(67, 9);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceListItemSmall, 13);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, 16);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 14);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceListItem, 11);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 15);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 12);
        sparseIntArray.append(94, 40);
        sparseIntArray.append(79, 39);
        sparseIntArray.append(78, 41);
        sparseIntArray.append(93, 42);
        sparseIntArray.append(77, 20);
        sparseIntArray.append(92, 37);
        sparseIntArray.append(66, 5);
        sparseIntArray.append(80, 87);
        sparseIntArray.append(89, 87);
        sparseIntArray.append(83, 87);
        sparseIntArray.append(60, 87);
        sparseIntArray.append(56, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(95, 95);
        sparseIntArray.append(72, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(96, 54);
        sparseIntArray.append(73, 55);
        sparseIntArray.append(97, 56);
        sparseIntArray.append(74, 57);
        sparseIntArray.append(98, 58);
        sparseIntArray.append(75, 59);
        sparseIntArray.append(63, 61);
        sparseIntArray.append(65, 62);
        sparseIntArray.append(64, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowFixedHeightMajor, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowFixedHeightMinor, 67);
        sparseIntArray.append(R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(R.styleable.AppCompatTheme_textColorSearchUrl, 68);
        sparseIntArray.append(99, 69);
        sparseIntArray.append(76, 70);
        sparseIntArray.append(R.styleable.AppCompatTheme_textColorAlertDialogListItem, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(R.styleable.AppCompatTheme_toolbarStyle, 76);
        sparseIntArray.append(88, 77);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowFixedWidthMajor, 78);
        sparseIntArray.append(55, 80);
        sparseIntArray.append(54, 81);
        sparseIntArray.append(R.styleable.AppCompatTheme_tooltipFrameBackground, 82);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowActionModeOverlay, 83);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowActionBarOverlay, 84);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowActionBar, 85);
        sparseIntArray.append(R.styleable.AppCompatTheme_viewInflaterClass, 86);
        sparseIntArray2.append(84, 6);
        sparseIntArray2.append(84, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(88, 13);
        sparseIntArray2.append(91, 16);
        sparseIntArray2.append(89, 14);
        sparseIntArray2.append(86, 11);
        sparseIntArray2.append(90, 15);
        sparseIntArray2.append(87, 12);
        sparseIntArray2.append(77, 40);
        sparseIntArray2.append(70, 39);
        sparseIntArray2.append(69, 41);
        sparseIntArray2.append(76, 42);
        sparseIntArray2.append(68, 20);
        sparseIntArray2.append(75, 37);
        sparseIntArray2.append(59, 5);
        sparseIntArray2.append(71, 87);
        sparseIntArray2.append(74, 87);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(55, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(78, 95);
        sparseIntArray2.append(63, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(79, 54);
        sparseIntArray2.append(64, 55);
        sparseIntArray2.append(80, 56);
        sparseIntArray2.append(65, 57);
        sparseIntArray2.append(81, 58);
        sparseIntArray2.append(66, 59);
        sparseIntArray2.append(58, 62);
        sparseIntArray2.append(57, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(R.styleable.AppCompatTheme_textAppearanceListItemSmall, 67);
        sparseIntArray2.append(95, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(96, 98);
        sparseIntArray2.append(94, 68);
        sparseIntArray2.append(82, 69);
        sparseIntArray2.append(67, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(97, 76);
        sparseIntArray2.append(73, 77);
        sparseIntArray2.append(R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 78);
        sparseIntArray2.append(54, 80);
        sparseIntArray2.append(53, 81);
        sparseIntArray2.append(99, 82);
        sparseIntArray2.append(R.styleable.AppCompatTheme_textAppearanceListItem, 83);
        sparseIntArray2.append(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 84);
        sparseIntArray2.append(R.styleable.AppCompatTheme_switchStyle, 85);
        sparseIntArray2.append(100, 86);
        sparseIntArray2.append(93, 97);
    }

    public static int[] d(Barrier barrier, String str) {
        int i10;
        HashMap<String, Integer> hashMap;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            Integer num = null;
            try {
                i10 = t.c.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i10 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.A) != null && hashMap.containsKey(trim)) {
                    num = constraintLayout.A.get(trim);
                }
                if (num != null && (num instanceof Integer)) {
                    i10 = num.intValue();
                }
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        if (i12 != split.length) {
            return Arrays.copyOf(iArr, i12);
        }
        return iArr;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x048c, code lost:
        r12.a(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0528, code lost:
        r3 = r2;
        r2 = r1.getString(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0531, code lost:
        r12.d(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0540, code lost:
        r12.b(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0543, code lost:
        r15 = r20;
        r3 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0549, code lost:
        r4 = r3;
        r20 = r15;
        r12 = r18;
        r15 = r22;
        r3 = r16 + 1;
        r2 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x05c2, code lost:
        h(r8, r1, r12, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x05e9, code lost:
        r16 = r4;
        r18 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x062f, code lost:
        if (r4 != -1) goto L_0x0774;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0774, code lost:
        r7.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00bd, code lost:
        r18 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ca, code lost:
        r18 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00e3, code lost:
        r18 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0af3, code lost:
        r12 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0af5, code lost:
        r4 = r16 + 1;
        r2 = r20;
        r15 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x012e, code lost:
        if (r7.f904i != -1) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01f1, code lost:
        r12.c(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0230, code lost:
        r3 = r1.getFloat(r15, 1.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0398, code lost:
        r12.a(r2, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.constraintlayout.widget.c.a e(android.content.Context r20, android.util.AttributeSet r21, boolean r22) {
        /*
            androidx.constraintlayout.widget.c$a r0 = new androidx.constraintlayout.widget.c$a
            r0.<init>()
            if (r22 == 0) goto L_0x000a
            int[] r1 = p9.u.X
            goto L_0x000c
        L_0x000a:
            int[] r1 = p9.u.V
        L_0x000c:
            r2 = r20
            r3 = r21
            android.content.res.TypedArray r1 = r2.obtainStyledAttributes(r3, r1)
            java.lang.String[] r2 = p.a.f7800b
            int[] r3 = d
            android.util.SparseIntArray r4 = f840e
            androidx.constraintlayout.widget.c$d r5 = r0.f846b
            androidx.constraintlayout.widget.c$e r6 = r0.f848e
            androidx.constraintlayout.widget.c$c r7 = r0.f847c
            androidx.constraintlayout.widget.c$b r8 = r0.d
            java.lang.String r9 = "/"
            java.lang.String r10 = "unused attribute 0x"
            java.lang.String r11 = "CURRENTLY UNSUPPORTED"
            java.lang.String r12 = "Unknown attribute 0x"
            java.lang.String r13 = "   "
            java.lang.String r14 = "ConstraintSet"
            if (r22 == 0) goto L_0x0557
            int r15 = r1.getIndexCount()
            r20 = r12
            androidx.constraintlayout.widget.c$a$a r12 = new androidx.constraintlayout.widget.c$a$a
            r12.<init>()
            r7.getClass()
            r8.getClass()
            r5.getClass()
            r6.getClass()
            r16 = 0
            r21 = r3
            r3 = r16
        L_0x004d:
            if (r3 >= r15) goto L_0x0b03
            r22 = r15
            int r15 = r1.getIndex(r3)
            r16 = r3
            android.util.SparseIntArray r3 = f841f
            int r3 = r3.get(r15)
            switch(r3) {
                case 2: goto L_0x0535;
                case 3: goto L_0x0060;
                case 4: goto L_0x0060;
                case 5: goto L_0x0523;
                case 6: goto L_0x0517;
                case 7: goto L_0x050b;
                case 8: goto L_0x04fe;
                case 9: goto L_0x0060;
                case 10: goto L_0x0060;
                case 11: goto L_0x04f1;
                case 12: goto L_0x04e4;
                case 13: goto L_0x04d7;
                case 14: goto L_0x04c9;
                case 15: goto L_0x04bb;
                case 16: goto L_0x04ad;
                case 17: goto L_0x049f;
                case 18: goto L_0x0491;
                case 19: goto L_0x0480;
                case 20: goto L_0x0473;
                case 21: goto L_0x0465;
                case 22: goto L_0x0455;
                case 23: goto L_0x0447;
                case 24: goto L_0x0439;
                case 25: goto L_0x0060;
                case 26: goto L_0x0060;
                case 27: goto L_0x042b;
                case 28: goto L_0x041d;
                case 29: goto L_0x0060;
                case 30: goto L_0x0060;
                case 31: goto L_0x040f;
                case 32: goto L_0x0060;
                case 33: goto L_0x0060;
                case 34: goto L_0x0401;
                case 35: goto L_0x0060;
                case 36: goto L_0x0060;
                case 37: goto L_0x03f3;
                case 38: goto L_0x03e3;
                case 39: goto L_0x03d5;
                case 40: goto L_0x03c7;
                case 41: goto L_0x03b9;
                case 42: goto L_0x03ab;
                case 43: goto L_0x039d;
                case 44: goto L_0x0388;
                case 45: goto L_0x037a;
                case 46: goto L_0x036c;
                case 47: goto L_0x035e;
                case 48: goto L_0x0350;
                case 49: goto L_0x0342;
                case 50: goto L_0x0334;
                case 51: goto L_0x0326;
                case 52: goto L_0x0318;
                case 53: goto L_0x030a;
                case 54: goto L_0x02fc;
                case 55: goto L_0x02ee;
                case 56: goto L_0x02e0;
                case 57: goto L_0x02d2;
                case 58: goto L_0x02c4;
                case 59: goto L_0x02b6;
                case 60: goto L_0x02a8;
                case 61: goto L_0x0060;
                case 62: goto L_0x029a;
                case 63: goto L_0x028c;
                case 64: goto L_0x027e;
                case 65: goto L_0x0261;
                case 66: goto L_0x0254;
                case 67: goto L_0x0246;
                case 68: goto L_0x0238;
                case 69: goto L_0x022a;
                case 70: goto L_0x0223;
                case 71: goto L_0x021a;
                case 72: goto L_0x020c;
                case 73: goto L_0x01fe;
                case 74: goto L_0x01f6;
                case 75: goto L_0x01e5;
                case 76: goto L_0x01d7;
                case 77: goto L_0x01cf;
                case 78: goto L_0x01c1;
                case 79: goto L_0x01b3;
                case 80: goto L_0x01a6;
                case 81: goto L_0x0199;
                case 82: goto L_0x018b;
                case 83: goto L_0x017d;
                case 84: goto L_0x016f;
                case 85: goto L_0x0161;
                case 86: goto L_0x0113;
                case 87: goto L_0x00e7;
                case 88: goto L_0x0060;
                case 89: goto L_0x0060;
                case 90: goto L_0x0060;
                case 91: goto L_0x0060;
                case 92: goto L_0x0060;
                case 93: goto L_0x00d9;
                case 94: goto L_0x00ce;
                case 95: goto L_0x00c1;
                case 96: goto L_0x00b7;
                case 97: goto L_0x00ac;
                case 98: goto L_0x0092;
                default: goto L_0x0060;
            }
        L_0x0060:
            r17 = r2
            r18 = r4
            java.lang.String r2 = java.lang.Integer.toHexString(r15)
            r3 = r18
            int r4 = r3.get(r15)
            r15 = 34
            int r15 = androidx.appcompat.widget.x0.a(r2, r15)
            r18 = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r15)
            r15 = r20
            r12.append(r15)
            r12.append(r2)
            r12.append(r13)
            r12.append(r4)
            java.lang.String r2 = r12.toString()
            android.util.Log.w(r14, r2)
            goto L_0x0549
        L_0x0092:
            int r3 = s.d.f8497b0
            android.util.TypedValue r3 = r1.peekValue(r15)
            int r3 = r3.type
            r17 = r2
            r2 = 3
            if (r3 != r2) goto L_0x00a3
            r1.getString(r15)
            goto L_0x00bd
        L_0x00a3:
            int r2 = r0.f845a
            int r2 = r1.getResourceId(r15, r2)
            r0.f845a = r2
            goto L_0x00bd
        L_0x00ac:
            r17 = r2
            int r2 = r8.f886n0
            int r2 = r1.getInt(r15, r2)
            r3 = 97
            goto L_0x00e3
        L_0x00b7:
            r17 = r2
            r2 = 1
            h(r12, r1, r15, r2)
        L_0x00bd:
            r18 = r4
            goto L_0x0543
        L_0x00c1:
            r17 = r2
            r2 = 0
            h(r12, r1, r15, r2)
            r15 = r20
            r3 = r4
        L_0x00ca:
            r18 = r12
            goto L_0x0549
        L_0x00ce:
            r17 = r2
            int r2 = r8.R
            int r2 = r1.getDimensionPixelSize(r15, r2)
            r3 = 94
            goto L_0x00e3
        L_0x00d9:
            r17 = r2
            int r2 = r8.K
            int r2 = r1.getDimensionPixelSize(r15, r2)
            r3 = 93
        L_0x00e3:
            r18 = r4
            goto L_0x0540
        L_0x00e7:
            r17 = r2
            java.lang.String r2 = java.lang.Integer.toHexString(r15)
            int r3 = r4.get(r15)
            r15 = 33
            int r15 = androidx.appcompat.widget.x0.a(r2, r15)
            r18 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r15)
            r4.append(r10)
            r4.append(r2)
            r4.append(r13)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            android.util.Log.w(r14, r2)
            goto L_0x0543
        L_0x0113:
            r17 = r2
            r18 = r4
            android.util.TypedValue r2 = r1.peekValue(r15)
            int r2 = r2.type
            r3 = 89
            r4 = 1
            if (r2 != r4) goto L_0x0131
            r2 = -1
            int r4 = r1.getResourceId(r15, r2)
            r7.f904i = r4
            r12.b(r3, r4)
            int r3 = r7.f904i
            if (r3 == r2) goto L_0x0543
            goto L_0x0153
        L_0x0131:
            r3 = 3
            r4 = -1
            if (r2 != r3) goto L_0x0157
            java.lang.String r2 = r1.getString(r15)
            r7.f903h = r2
            r3 = 90
            r12.d(r2, r3)
            java.lang.String r2 = r7.f903h
            int r2 = r2.indexOf(r9)
            if (r2 <= 0) goto L_0x0155
            int r2 = r1.getResourceId(r15, r4)
            r7.f904i = r2
            r3 = 89
            r12.b(r3, r2)
        L_0x0153:
            r2 = -2
            goto L_0x015d
        L_0x0155:
            r2 = -1
            goto L_0x015d
        L_0x0157:
            int r2 = r7.f904i
            int r2 = r1.getInteger(r15, r2)
        L_0x015d:
            r3 = 88
            goto L_0x0540
        L_0x0161:
            r17 = r2
            r18 = r4
            float r2 = r7.f901f
            float r2 = r1.getFloat(r15, r2)
            r3 = 85
            goto L_0x048c
        L_0x016f:
            r17 = r2
            r18 = r4
            int r2 = r7.f902g
            int r2 = r1.getInteger(r15, r2)
            r3 = 84
            goto L_0x0540
        L_0x017d:
            r17 = r2
            r18 = r4
            int r2 = r6.f915h
            int r2 = g(r1, r15, r2)
            r3 = 83
            goto L_0x0540
        L_0x018b:
            r17 = r2
            r18 = r4
            int r2 = r7.f898b
            int r2 = r1.getInteger(r15, r2)
            r3 = 82
            goto L_0x0540
        L_0x0199:
            r17 = r2
            r18 = r4
            boolean r2 = r8.f882l0
            boolean r2 = r1.getBoolean(r15, r2)
            r3 = 81
            goto L_0x01f1
        L_0x01a6:
            r17 = r2
            r18 = r4
            boolean r2 = r8.f881k0
            boolean r2 = r1.getBoolean(r15, r2)
            r3 = 80
            goto L_0x01f1
        L_0x01b3:
            r17 = r2
            r18 = r4
            float r2 = r7.d
            float r2 = r1.getFloat(r15, r2)
            r3 = 79
            goto L_0x048c
        L_0x01c1:
            r17 = r2
            r18 = r4
            int r2 = r5.f906b
            int r2 = r1.getInt(r15, r2)
            r3 = 78
            goto L_0x0540
        L_0x01cf:
            r17 = r2
            r18 = r4
            r2 = 77
            goto L_0x0528
        L_0x01d7:
            r17 = r2
            r18 = r4
            int r2 = r7.f899c
            int r2 = r1.getInt(r15, r2)
            r3 = 76
            goto L_0x0540
        L_0x01e5:
            r17 = r2
            r18 = r4
            boolean r2 = r8.f884m0
            boolean r2 = r1.getBoolean(r15, r2)
            r3 = 75
        L_0x01f1:
            r12.c(r3, r2)
            goto L_0x0543
        L_0x01f6:
            r17 = r2
            r18 = r4
            r2 = 74
            goto L_0x0528
        L_0x01fe:
            r17 = r2
            r18 = r4
            int r2 = r8.f871f0
            int r2 = r1.getDimensionPixelSize(r15, r2)
            r3 = 73
            goto L_0x0540
        L_0x020c:
            r17 = r2
            r18 = r4
            int r2 = r8.f869e0
            int r2 = r1.getInt(r15, r2)
            r3 = 72
            goto L_0x0540
        L_0x021a:
            r17 = r2
            r18 = r4
            android.util.Log.e(r14, r11)
            goto L_0x0543
        L_0x0223:
            r17 = r2
            r18 = r4
            r2 = 70
            goto L_0x0230
        L_0x022a:
            r17 = r2
            r18 = r4
            r2 = 69
        L_0x0230:
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = r1.getFloat(r15, r3)
            goto L_0x0398
        L_0x0238:
            r17 = r2
            r18 = r4
            float r2 = r5.d
            float r2 = r1.getFloat(r15, r2)
            r3 = 68
            goto L_0x048c
        L_0x0246:
            r17 = r2
            r18 = r4
            float r2 = r7.f900e
            float r2 = r1.getFloat(r15, r2)
            r3 = 67
            goto L_0x048c
        L_0x0254:
            r17 = r2
            r18 = r4
            r2 = 0
            int r2 = r1.getInt(r15, r2)
            r3 = 66
            goto L_0x0540
        L_0x0261:
            r17 = r2
            r18 = r4
            r2 = 0
            android.util.TypedValue r3 = r1.peekValue(r15)
            int r3 = r3.type
            r4 = 3
            if (r3 != r4) goto L_0x0274
            java.lang.String r2 = r1.getString(r15)
            goto L_0x027a
        L_0x0274:
            int r2 = r1.getInteger(r15, r2)
            r2 = r17[r2]
        L_0x027a:
            r3 = 65
            goto L_0x0531
        L_0x027e:
            r17 = r2
            r18 = r4
            int r2 = r7.f897a
            int r2 = g(r1, r15, r2)
            r3 = 64
            goto L_0x0540
        L_0x028c:
            r17 = r2
            r18 = r4
            float r2 = r8.A
            float r2 = r1.getFloat(r15, r2)
            r3 = 63
            goto L_0x048c
        L_0x029a:
            r17 = r2
            r18 = r4
            int r2 = r8.z
            int r2 = r1.getDimensionPixelSize(r15, r2)
            r3 = 62
            goto L_0x0540
        L_0x02a8:
            r17 = r2
            r18 = r4
            float r2 = r6.f909a
            float r2 = r1.getFloat(r15, r2)
            r3 = 60
            goto L_0x048c
        L_0x02b6:
            r17 = r2
            r18 = r4
            int r2 = r8.f864b0
            int r2 = r1.getDimensionPixelSize(r15, r2)
            r3 = 59
            goto L_0x0540
        L_0x02c4:
            r17 = r2
            r18 = r4
            int r2 = r8.f862a0
            int r2 = r1.getDimensionPixelSize(r15, r2)
            r3 = 58
            goto L_0x0540
        L_0x02d2:
            r17 = r2
            r18 = r4
            int r2 = r8.Z
            int r2 = r1.getDimensionPixelSize(r15, r2)
            r3 = 57
            goto L_0x0540
        L_0x02e0:
            r17 = r2
            r18 = r4
            int r2 = r8.Y
            int r2 = r1.getDimensionPixelSize(r15, r2)
            r3 = 56
            goto L_0x0540
        L_0x02ee:
            r17 = r2
            r18 = r4
            int r2 = r8.X
            int r2 = r1.getInt(r15, r2)
            r3 = 55
            goto L_0x0540
        L_0x02fc:
            r17 = r2
            r18 = r4
            int r2 = r8.W
            int r2 = r1.getInt(r15, r2)
            r3 = 54
            goto L_0x0540
        L_0x030a:
            r17 = r2
            r18 = r4
            float r2 = r6.f918k
            float r2 = r1.getDimension(r15, r2)
            r3 = 53
            goto L_0x048c
        L_0x0318:
            r17 = r2
            r18 = r4
            float r2 = r6.f917j
            float r2 = r1.getDimension(r15, r2)
            r3 = 52
            goto L_0x048c
        L_0x0326:
            r17 = r2
            r18 = r4
            float r2 = r6.f916i
            float r2 = r1.getDimension(r15, r2)
            r3 = 51
            goto L_0x048c
        L_0x0334:
            r17 = r2
            r18 = r4
            float r2 = r6.f914g
            float r2 = r1.getDimension(r15, r2)
            r3 = 50
            goto L_0x048c
        L_0x0342:
            r17 = r2
            r18 = r4
            float r2 = r6.f913f
            float r2 = r1.getDimension(r15, r2)
            r3 = 49
            goto L_0x048c
        L_0x0350:
            r17 = r2
            r18 = r4
            float r2 = r6.f912e
            float r2 = r1.getFloat(r15, r2)
            r3 = 48
            goto L_0x048c
        L_0x035e:
            r17 = r2
            r18 = r4
            float r2 = r6.d
            float r2 = r1.getFloat(r15, r2)
            r3 = 47
            goto L_0x048c
        L_0x036c:
            r17 = r2
            r18 = r4
            float r2 = r6.f911c
            float r2 = r1.getFloat(r15, r2)
            r3 = 46
            goto L_0x048c
        L_0x037a:
            r17 = r2
            r18 = r4
            float r2 = r6.f910b
            float r2 = r1.getFloat(r15, r2)
            r3 = 45
            goto L_0x048c
        L_0x0388:
            r17 = r2
            r18 = r4
            r2 = 44
            r3 = 1
            r12.c(r2, r3)
            float r3 = r6.f919m
            float r3 = r1.getDimension(r15, r3)
        L_0x0398:
            r12.a(r2, r3)
            goto L_0x0543
        L_0x039d:
            r17 = r2
            r18 = r4
            float r2 = r5.f907c
            float r2 = r1.getFloat(r15, r2)
            r3 = 43
            goto L_0x048c
        L_0x03ab:
            r17 = r2
            r18 = r4
            int r2 = r8.V
            int r2 = r1.getInt(r15, r2)
            r3 = 42
            goto L_0x0540
        L_0x03b9:
            r17 = r2
            r18 = r4
            int r2 = r8.U
            int r2 = r1.getInt(r15, r2)
            r3 = 41
            goto L_0x0540
        L_0x03c7:
            r17 = r2
            r18 = r4
            float r2 = r8.S
            float r2 = r1.getFloat(r15, r2)
            r3 = 40
            goto L_0x048c
        L_0x03d5:
            r17 = r2
            r18 = r4
            float r2 = r8.T
            float r2 = r1.getFloat(r15, r2)
            r3 = 39
            goto L_0x048c
        L_0x03e3:
            r17 = r2
            r18 = r4
            int r2 = r0.f845a
            int r2 = r1.getResourceId(r15, r2)
            r0.f845a = r2
            r3 = 38
            goto L_0x0540
        L_0x03f3:
            r17 = r2
            r18 = r4
            float r2 = r8.w
            float r2 = r1.getFloat(r15, r2)
            r3 = 37
            goto L_0x048c
        L_0x0401:
            r17 = r2
            r18 = r4
            int r2 = r8.G
            int r2 = r1.getDimensionPixelSize(r15, r2)
            r3 = 34
            goto L_0x0540
        L_0x040f:
            r17 = r2
            r18 = r4
            int r2 = r8.J
            int r2 = r1.getDimensionPixelSize(r15, r2)
            r3 = 31
            goto L_0x0540
        L_0x041d:
            r17 = r2
            r18 = r4
            int r2 = r8.F
            int r2 = r1.getDimensionPixelSize(r15, r2)
            r3 = 28
            goto L_0x0540
        L_0x042b:
            r17 = r2
            r18 = r4
            int r2 = r8.D
            int r2 = r1.getInt(r15, r2)
            r3 = 27
            goto L_0x0540
        L_0x0439:
            r17 = r2
            r18 = r4
            int r2 = r8.E
            int r2 = r1.getDimensionPixelSize(r15, r2)
            r3 = 24
            goto L_0x0540
        L_0x0447:
            r17 = r2
            r18 = r4
            int r2 = r8.f863b
            int r2 = r1.getLayoutDimension(r15, r2)
            r3 = 23
            goto L_0x0540
        L_0x0455:
            r17 = r2
            r18 = r4
            int r2 = r5.f905a
            int r2 = r1.getInt(r15, r2)
            r2 = r21[r2]
            r3 = 22
            goto L_0x0540
        L_0x0465:
            r17 = r2
            r18 = r4
            int r2 = r8.f865c
            int r2 = r1.getLayoutDimension(r15, r2)
            r3 = 21
            goto L_0x0540
        L_0x0473:
            r17 = r2
            r18 = r4
            float r2 = r8.f893v
            float r2 = r1.getFloat(r15, r2)
            r3 = 20
            goto L_0x048c
        L_0x0480:
            r17 = r2
            r18 = r4
            float r2 = r8.f870f
            float r2 = r1.getFloat(r15, r2)
            r3 = 19
        L_0x048c:
            r12.a(r3, r2)
            goto L_0x0543
        L_0x0491:
            r17 = r2
            r18 = r4
            int r2 = r8.f868e
            int r2 = r1.getDimensionPixelOffset(r15, r2)
            r3 = 18
            goto L_0x0540
        L_0x049f:
            r17 = r2
            r18 = r4
            int r2 = r8.d
            int r2 = r1.getDimensionPixelOffset(r15, r2)
            r3 = 17
            goto L_0x0540
        L_0x04ad:
            r17 = r2
            r18 = r4
            int r2 = r8.M
            int r2 = r1.getDimensionPixelSize(r15, r2)
            r3 = 16
            goto L_0x0540
        L_0x04bb:
            r17 = r2
            r18 = r4
            int r2 = r8.Q
            int r2 = r1.getDimensionPixelSize(r15, r2)
            r3 = 15
            goto L_0x0540
        L_0x04c9:
            r17 = r2
            r18 = r4
            int r2 = r8.N
            int r2 = r1.getDimensionPixelSize(r15, r2)
            r3 = 14
            goto L_0x0540
        L_0x04d7:
            r17 = r2
            r18 = r4
            int r2 = r8.L
            int r2 = r1.getDimensionPixelSize(r15, r2)
            r3 = 13
            goto L_0x0540
        L_0x04e4:
            r17 = r2
            r18 = r4
            int r2 = r8.P
            int r2 = r1.getDimensionPixelSize(r15, r2)
            r3 = 12
            goto L_0x0540
        L_0x04f1:
            r17 = r2
            r18 = r4
            int r2 = r8.O
            int r2 = r1.getDimensionPixelSize(r15, r2)
            r3 = 11
            goto L_0x0540
        L_0x04fe:
            r17 = r2
            r18 = r4
            int r2 = r8.I
            int r2 = r1.getDimensionPixelSize(r15, r2)
            r3 = 8
            goto L_0x0540
        L_0x050b:
            r17 = r2
            r18 = r4
            int r2 = r8.C
            int r2 = r1.getDimensionPixelOffset(r15, r2)
            r3 = 7
            goto L_0x0540
        L_0x0517:
            r17 = r2
            r18 = r4
            int r2 = r8.B
            int r2 = r1.getDimensionPixelOffset(r15, r2)
            r3 = 6
            goto L_0x0540
        L_0x0523:
            r17 = r2
            r18 = r4
            r2 = 5
        L_0x0528:
            java.lang.String r3 = r1.getString(r15)
            r19 = r3
            r3 = r2
            r2 = r19
        L_0x0531:
            r12.d(r2, r3)
            goto L_0x0543
        L_0x0535:
            r17 = r2
            r18 = r4
            int r2 = r8.H
            int r2 = r1.getDimensionPixelSize(r15, r2)
            r3 = 2
        L_0x0540:
            r12.b(r3, r2)
        L_0x0543:
            r15 = r20
            r3 = r18
            goto L_0x00ca
        L_0x0549:
            int r2 = r16 + 1
            r4 = r3
            r20 = r15
            r12 = r18
            r15 = r22
            r3 = r2
            r2 = r17
            goto L_0x004d
        L_0x0557:
            r17 = r2
            r21 = r3
            r3 = r4
            r15 = r12
            int r2 = r1.getIndexCount()
            r4 = 0
        L_0x0562:
            if (r4 >= r2) goto L_0x0afc
            int r12 = r1.getIndex(r4)
            r20 = r2
            r2 = 1
            if (r12 == r2) goto L_0x0581
            r2 = 23
            if (r2 == r12) goto L_0x0581
            r2 = 24
            if (r2 == r12) goto L_0x0581
            r7.getClass()
            r8.getClass()
            r5.getClass()
            r6.getClass()
        L_0x0581:
            int r2 = r3.get(r12)
            switch(r2) {
                case 1: goto L_0x0ae7;
                case 2: goto L_0x0ada;
                case 3: goto L_0x0acd;
                case 4: goto L_0x0ac0;
                case 5: goto L_0x0ab5;
                case 6: goto L_0x0aa8;
                case 7: goto L_0x0a9b;
                case 8: goto L_0x0a8e;
                case 9: goto L_0x0a80;
                case 10: goto L_0x0a72;
                case 11: goto L_0x0a64;
                case 12: goto L_0x0a56;
                case 13: goto L_0x0a48;
                case 14: goto L_0x0a3a;
                case 15: goto L_0x0a2c;
                case 16: goto L_0x0a1e;
                case 17: goto L_0x0a10;
                case 18: goto L_0x0a02;
                case 19: goto L_0x09f4;
                case 20: goto L_0x09e6;
                case 21: goto L_0x09d8;
                case 22: goto L_0x09c8;
                case 23: goto L_0x09ba;
                case 24: goto L_0x09ac;
                case 25: goto L_0x099e;
                case 26: goto L_0x0990;
                case 27: goto L_0x0982;
                case 28: goto L_0x0974;
                case 29: goto L_0x0966;
                case 30: goto L_0x0958;
                case 31: goto L_0x094a;
                case 32: goto L_0x093c;
                case 33: goto L_0x092e;
                case 34: goto L_0x0920;
                case 35: goto L_0x0912;
                case 36: goto L_0x0904;
                case 37: goto L_0x08f6;
                case 38: goto L_0x08e8;
                case 39: goto L_0x08da;
                case 40: goto L_0x08cc;
                case 41: goto L_0x08be;
                case 42: goto L_0x08b0;
                case 43: goto L_0x08a2;
                case 44: goto L_0x0891;
                case 45: goto L_0x0883;
                case 46: goto L_0x0875;
                case 47: goto L_0x0867;
                case 48: goto L_0x0859;
                case 49: goto L_0x084b;
                case 50: goto L_0x083d;
                case 51: goto L_0x082f;
                case 52: goto L_0x0821;
                case 53: goto L_0x0813;
                case 54: goto L_0x0805;
                case 55: goto L_0x07f7;
                case 56: goto L_0x07e9;
                case 57: goto L_0x07db;
                case 58: goto L_0x07cd;
                case 59: goto L_0x07bf;
                case 60: goto L_0x07b1;
                case 61: goto L_0x07a3;
                case 62: goto L_0x0795;
                case 63: goto L_0x0787;
                case 64: goto L_0x0779;
                case 65: goto L_0x075c;
                case 66: goto L_0x0753;
                case 67: goto L_0x0745;
                case 68: goto L_0x0737;
                case 69: goto L_0x0729;
                case 70: goto L_0x071b;
                case 71: goto L_0x0712;
                case 72: goto L_0x0704;
                case 73: goto L_0x06f6;
                case 74: goto L_0x06ea;
                case 75: goto L_0x06dc;
                case 76: goto L_0x06ce;
                case 77: goto L_0x06c2;
                case 78: goto L_0x06b4;
                case 79: goto L_0x06a6;
                case 80: goto L_0x0698;
                case 81: goto L_0x068a;
                case 82: goto L_0x067c;
                case 83: goto L_0x066e;
                case 84: goto L_0x0660;
                case 85: goto L_0x0652;
                case 86: goto L_0x061b;
                case 87: goto L_0x05ef;
                case 88: goto L_0x0588;
                case 89: goto L_0x0588;
                case 90: goto L_0x0588;
                case 91: goto L_0x05e1;
                case 92: goto L_0x05d8;
                case 93: goto L_0x05cf;
                case 94: goto L_0x05c6;
                case 95: goto L_0x05c1;
                case 96: goto L_0x05bf;
                case 97: goto L_0x05b6;
                default: goto L_0x0588;
            }
        L_0x0588:
            r16 = r4
            r18 = r15
            java.lang.String r2 = java.lang.Integer.toHexString(r12)
            int r4 = r3.get(r12)
            r12 = 34
            int r12 = androidx.appcompat.widget.x0.a(r2, r12)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r12)
            r12 = r18
            r15.append(r12)
            r15.append(r2)
            r15.append(r13)
            r15.append(r4)
            java.lang.String r2 = r15.toString()
            android.util.Log.w(r14, r2)
            goto L_0x0af5
        L_0x05b6:
            int r2 = r8.f886n0
            int r2 = r1.getInt(r12, r2)
            r8.f886n0 = r2
            goto L_0x05e9
        L_0x05bf:
            r2 = 1
            goto L_0x05c2
        L_0x05c1:
            r2 = 0
        L_0x05c2:
            h(r8, r1, r12, r2)
            goto L_0x05e9
        L_0x05c6:
            int r2 = r8.R
            int r2 = r1.getDimensionPixelSize(r12, r2)
            r8.R = r2
            goto L_0x05e9
        L_0x05cf:
            int r2 = r8.K
            int r2 = r1.getDimensionPixelSize(r12, r2)
            r8.K = r2
            goto L_0x05e9
        L_0x05d8:
            int r2 = r8.f889q
            int r2 = g(r1, r12, r2)
            r8.f889q = r2
            goto L_0x05e9
        L_0x05e1:
            int r2 = r8.f888p
            int r2 = g(r1, r12, r2)
            r8.f888p = r2
        L_0x05e9:
            r16 = r4
            r18 = r15
            goto L_0x0af3
        L_0x05ef:
            java.lang.String r2 = java.lang.Integer.toHexString(r12)
            int r12 = r3.get(r12)
            r16 = r4
            r4 = 33
            int r4 = androidx.appcompat.widget.x0.a(r2, r4)
            r18 = r15
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r4)
            r15.append(r10)
            r15.append(r2)
            r15.append(r13)
            r15.append(r12)
            java.lang.String r2 = r15.toString()
            android.util.Log.w(r14, r2)
            goto L_0x0af3
        L_0x061b:
            r16 = r4
            r18 = r15
            android.util.TypedValue r2 = r1.peekValue(r12)
            int r2 = r2.type
            r4 = 1
            if (r2 != r4) goto L_0x0633
            r2 = -1
            int r4 = r1.getResourceId(r12, r2)
            r7.f904i = r4
            if (r4 == r2) goto L_0x0af3
            goto L_0x0774
        L_0x0633:
            r4 = -1
            r15 = 3
            if (r2 != r15) goto L_0x064b
            java.lang.String r2 = r1.getString(r12)
            r7.f903h = r2
            int r2 = r2.indexOf(r9)
            if (r2 <= 0) goto L_0x0af3
            int r2 = r1.getResourceId(r12, r4)
            r7.f904i = r2
            goto L_0x0774
        L_0x064b:
            int r2 = r7.f904i
            r1.getInteger(r12, r2)
            goto L_0x0af3
        L_0x0652:
            r16 = r4
            r18 = r15
            float r2 = r7.f901f
            float r2 = r1.getFloat(r12, r2)
            r7.f901f = r2
            goto L_0x0af3
        L_0x0660:
            r16 = r4
            r18 = r15
            int r2 = r7.f902g
            int r2 = r1.getInteger(r12, r2)
            r7.f902g = r2
            goto L_0x0af3
        L_0x066e:
            r16 = r4
            r18 = r15
            int r2 = r6.f915h
            int r2 = g(r1, r12, r2)
            r6.f915h = r2
            goto L_0x0af3
        L_0x067c:
            r16 = r4
            r18 = r15
            int r2 = r7.f898b
            int r2 = r1.getInteger(r12, r2)
            r7.f898b = r2
            goto L_0x0af3
        L_0x068a:
            r16 = r4
            r18 = r15
            boolean r2 = r8.f882l0
            boolean r2 = r1.getBoolean(r12, r2)
            r8.f882l0 = r2
            goto L_0x0af3
        L_0x0698:
            r16 = r4
            r18 = r15
            boolean r2 = r8.f881k0
            boolean r2 = r1.getBoolean(r12, r2)
            r8.f881k0 = r2
            goto L_0x0af3
        L_0x06a6:
            r16 = r4
            r18 = r15
            float r2 = r7.d
            float r2 = r1.getFloat(r12, r2)
            r7.d = r2
            goto L_0x0af3
        L_0x06b4:
            r16 = r4
            r18 = r15
            int r2 = r5.f906b
            int r2 = r1.getInt(r12, r2)
            r5.f906b = r2
            goto L_0x0af3
        L_0x06c2:
            r16 = r4
            r18 = r15
            java.lang.String r2 = r1.getString(r12)
            r8.f879j0 = r2
            goto L_0x0af3
        L_0x06ce:
            r16 = r4
            r18 = r15
            int r2 = r7.f899c
            int r2 = r1.getInt(r12, r2)
            r7.f899c = r2
            goto L_0x0af3
        L_0x06dc:
            r16 = r4
            r18 = r15
            boolean r2 = r8.f884m0
            boolean r2 = r1.getBoolean(r12, r2)
            r8.f884m0 = r2
            goto L_0x0af3
        L_0x06ea:
            r16 = r4
            r18 = r15
            java.lang.String r2 = r1.getString(r12)
            r8.f877i0 = r2
            goto L_0x0af3
        L_0x06f6:
            r16 = r4
            r18 = r15
            int r2 = r8.f871f0
            int r2 = r1.getDimensionPixelSize(r12, r2)
            r8.f871f0 = r2
            goto L_0x0af3
        L_0x0704:
            r16 = r4
            r18 = r15
            int r2 = r8.f869e0
            int r2 = r1.getInt(r12, r2)
            r8.f869e0 = r2
            goto L_0x0af3
        L_0x0712:
            r16 = r4
            r18 = r15
            android.util.Log.e(r14, r11)
            goto L_0x0af3
        L_0x071b:
            r16 = r4
            r18 = r15
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r1.getFloat(r12, r2)
            r8.f867d0 = r2
            goto L_0x0af3
        L_0x0729:
            r16 = r4
            r18 = r15
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r1.getFloat(r12, r2)
            r8.f866c0 = r2
            goto L_0x0af3
        L_0x0737:
            r16 = r4
            r18 = r15
            float r2 = r5.d
            float r2 = r1.getFloat(r12, r2)
            r5.d = r2
            goto L_0x0af3
        L_0x0745:
            r16 = r4
            r18 = r15
            float r2 = r7.f900e
            float r2 = r1.getFloat(r12, r2)
            r7.f900e = r2
            goto L_0x0af3
        L_0x0753:
            r16 = r4
            r18 = r15
            r2 = 0
            r1.getInt(r12, r2)
            goto L_0x0774
        L_0x075c:
            r16 = r4
            r18 = r15
            r2 = 0
            android.util.TypedValue r4 = r1.peekValue(r12)
            int r4 = r4.type
            r15 = 3
            if (r4 != r15) goto L_0x076e
            r1.getString(r12)
            goto L_0x0774
        L_0x076e:
            int r2 = r1.getInteger(r12, r2)
            r2 = r17[r2]
        L_0x0774:
            r7.getClass()
            goto L_0x0af3
        L_0x0779:
            r16 = r4
            r18 = r15
            int r2 = r7.f897a
            int r2 = g(r1, r12, r2)
            r7.f897a = r2
            goto L_0x0af3
        L_0x0787:
            r16 = r4
            r18 = r15
            float r2 = r8.A
            float r2 = r1.getFloat(r12, r2)
            r8.A = r2
            goto L_0x0af3
        L_0x0795:
            r16 = r4
            r18 = r15
            int r2 = r8.z
            int r2 = r1.getDimensionPixelSize(r12, r2)
            r8.z = r2
            goto L_0x0af3
        L_0x07a3:
            r16 = r4
            r18 = r15
            int r2 = r8.f895y
            int r2 = g(r1, r12, r2)
            r8.f895y = r2
            goto L_0x0af3
        L_0x07b1:
            r16 = r4
            r18 = r15
            float r2 = r6.f909a
            float r2 = r1.getFloat(r12, r2)
            r6.f909a = r2
            goto L_0x0af3
        L_0x07bf:
            r16 = r4
            r18 = r15
            int r2 = r8.f864b0
            int r2 = r1.getDimensionPixelSize(r12, r2)
            r8.f864b0 = r2
            goto L_0x0af3
        L_0x07cd:
            r16 = r4
            r18 = r15
            int r2 = r8.f862a0
            int r2 = r1.getDimensionPixelSize(r12, r2)
            r8.f862a0 = r2
            goto L_0x0af3
        L_0x07db:
            r16 = r4
            r18 = r15
            int r2 = r8.Z
            int r2 = r1.getDimensionPixelSize(r12, r2)
            r8.Z = r2
            goto L_0x0af3
        L_0x07e9:
            r16 = r4
            r18 = r15
            int r2 = r8.Y
            int r2 = r1.getDimensionPixelSize(r12, r2)
            r8.Y = r2
            goto L_0x0af3
        L_0x07f7:
            r16 = r4
            r18 = r15
            int r2 = r8.X
            int r2 = r1.getInt(r12, r2)
            r8.X = r2
            goto L_0x0af3
        L_0x0805:
            r16 = r4
            r18 = r15
            int r2 = r8.W
            int r2 = r1.getInt(r12, r2)
            r8.W = r2
            goto L_0x0af3
        L_0x0813:
            r16 = r4
            r18 = r15
            float r2 = r6.f918k
            float r2 = r1.getDimension(r12, r2)
            r6.f918k = r2
            goto L_0x0af3
        L_0x0821:
            r16 = r4
            r18 = r15
            float r2 = r6.f917j
            float r2 = r1.getDimension(r12, r2)
            r6.f917j = r2
            goto L_0x0af3
        L_0x082f:
            r16 = r4
            r18 = r15
            float r2 = r6.f916i
            float r2 = r1.getDimension(r12, r2)
            r6.f916i = r2
            goto L_0x0af3
        L_0x083d:
            r16 = r4
            r18 = r15
            float r2 = r6.f914g
            float r2 = r1.getDimension(r12, r2)
            r6.f914g = r2
            goto L_0x0af3
        L_0x084b:
            r16 = r4
            r18 = r15
            float r2 = r6.f913f
            float r2 = r1.getDimension(r12, r2)
            r6.f913f = r2
            goto L_0x0af3
        L_0x0859:
            r16 = r4
            r18 = r15
            float r2 = r6.f912e
            float r2 = r1.getFloat(r12, r2)
            r6.f912e = r2
            goto L_0x0af3
        L_0x0867:
            r16 = r4
            r18 = r15
            float r2 = r6.d
            float r2 = r1.getFloat(r12, r2)
            r6.d = r2
            goto L_0x0af3
        L_0x0875:
            r16 = r4
            r18 = r15
            float r2 = r6.f911c
            float r2 = r1.getFloat(r12, r2)
            r6.f911c = r2
            goto L_0x0af3
        L_0x0883:
            r16 = r4
            r18 = r15
            float r2 = r6.f910b
            float r2 = r1.getFloat(r12, r2)
            r6.f910b = r2
            goto L_0x0af3
        L_0x0891:
            r16 = r4
            r18 = r15
            r2 = 1
            r6.l = r2
            float r2 = r6.f919m
            float r2 = r1.getDimension(r12, r2)
            r6.f919m = r2
            goto L_0x0af3
        L_0x08a2:
            r16 = r4
            r18 = r15
            float r2 = r5.f907c
            float r2 = r1.getFloat(r12, r2)
            r5.f907c = r2
            goto L_0x0af3
        L_0x08b0:
            r16 = r4
            r18 = r15
            int r2 = r8.V
            int r2 = r1.getInt(r12, r2)
            r8.V = r2
            goto L_0x0af3
        L_0x08be:
            r16 = r4
            r18 = r15
            int r2 = r8.U
            int r2 = r1.getInt(r12, r2)
            r8.U = r2
            goto L_0x0af3
        L_0x08cc:
            r16 = r4
            r18 = r15
            float r2 = r8.S
            float r2 = r1.getFloat(r12, r2)
            r8.S = r2
            goto L_0x0af3
        L_0x08da:
            r16 = r4
            r18 = r15
            float r2 = r8.T
            float r2 = r1.getFloat(r12, r2)
            r8.T = r2
            goto L_0x0af3
        L_0x08e8:
            r16 = r4
            r18 = r15
            int r2 = r0.f845a
            int r2 = r1.getResourceId(r12, r2)
            r0.f845a = r2
            goto L_0x0af3
        L_0x08f6:
            r16 = r4
            r18 = r15
            float r2 = r8.w
            float r2 = r1.getFloat(r12, r2)
            r8.w = r2
            goto L_0x0af3
        L_0x0904:
            r16 = r4
            r18 = r15
            int r2 = r8.f880k
            int r2 = g(r1, r12, r2)
            r8.f880k = r2
            goto L_0x0af3
        L_0x0912:
            r16 = r4
            r18 = r15
            int r2 = r8.l
            int r2 = g(r1, r12, r2)
            r8.l = r2
            goto L_0x0af3
        L_0x0920:
            r16 = r4
            r18 = r15
            int r2 = r8.G
            int r2 = r1.getDimensionPixelSize(r12, r2)
            r8.G = r2
            goto L_0x0af3
        L_0x092e:
            r16 = r4
            r18 = r15
            int r2 = r8.f891s
            int r2 = g(r1, r12, r2)
            r8.f891s = r2
            goto L_0x0af3
        L_0x093c:
            r16 = r4
            r18 = r15
            int r2 = r8.f890r
            int r2 = g(r1, r12, r2)
            r8.f890r = r2
            goto L_0x0af3
        L_0x094a:
            r16 = r4
            r18 = r15
            int r2 = r8.J
            int r2 = r1.getDimensionPixelSize(r12, r2)
            r8.J = r2
            goto L_0x0af3
        L_0x0958:
            r16 = r4
            r18 = r15
            int r2 = r8.f878j
            int r2 = g(r1, r12, r2)
            r8.f878j = r2
            goto L_0x0af3
        L_0x0966:
            r16 = r4
            r18 = r15
            int r2 = r8.f876i
            int r2 = g(r1, r12, r2)
            r8.f876i = r2
            goto L_0x0af3
        L_0x0974:
            r16 = r4
            r18 = r15
            int r2 = r8.F
            int r2 = r1.getDimensionPixelSize(r12, r2)
            r8.F = r2
            goto L_0x0af3
        L_0x0982:
            r16 = r4
            r18 = r15
            int r2 = r8.D
            int r2 = r1.getInt(r12, r2)
            r8.D = r2
            goto L_0x0af3
        L_0x0990:
            r16 = r4
            r18 = r15
            int r2 = r8.f874h
            int r2 = g(r1, r12, r2)
            r8.f874h = r2
            goto L_0x0af3
        L_0x099e:
            r16 = r4
            r18 = r15
            int r2 = r8.f872g
            int r2 = g(r1, r12, r2)
            r8.f872g = r2
            goto L_0x0af3
        L_0x09ac:
            r16 = r4
            r18 = r15
            int r2 = r8.E
            int r2 = r1.getDimensionPixelSize(r12, r2)
            r8.E = r2
            goto L_0x0af3
        L_0x09ba:
            r16 = r4
            r18 = r15
            int r2 = r8.f863b
            int r2 = r1.getLayoutDimension(r12, r2)
            r8.f863b = r2
            goto L_0x0af3
        L_0x09c8:
            r16 = r4
            r18 = r15
            int r2 = r5.f905a
            int r2 = r1.getInt(r12, r2)
            r2 = r21[r2]
            r5.f905a = r2
            goto L_0x0af3
        L_0x09d8:
            r16 = r4
            r18 = r15
            int r2 = r8.f865c
            int r2 = r1.getLayoutDimension(r12, r2)
            r8.f865c = r2
            goto L_0x0af3
        L_0x09e6:
            r16 = r4
            r18 = r15
            float r2 = r8.f893v
            float r2 = r1.getFloat(r12, r2)
            r8.f893v = r2
            goto L_0x0af3
        L_0x09f4:
            r16 = r4
            r18 = r15
            float r2 = r8.f870f
            float r2 = r1.getFloat(r12, r2)
            r8.f870f = r2
            goto L_0x0af3
        L_0x0a02:
            r16 = r4
            r18 = r15
            int r2 = r8.f868e
            int r2 = r1.getDimensionPixelOffset(r12, r2)
            r8.f868e = r2
            goto L_0x0af3
        L_0x0a10:
            r16 = r4
            r18 = r15
            int r2 = r8.d
            int r2 = r1.getDimensionPixelOffset(r12, r2)
            r8.d = r2
            goto L_0x0af3
        L_0x0a1e:
            r16 = r4
            r18 = r15
            int r2 = r8.M
            int r2 = r1.getDimensionPixelSize(r12, r2)
            r8.M = r2
            goto L_0x0af3
        L_0x0a2c:
            r16 = r4
            r18 = r15
            int r2 = r8.Q
            int r2 = r1.getDimensionPixelSize(r12, r2)
            r8.Q = r2
            goto L_0x0af3
        L_0x0a3a:
            r16 = r4
            r18 = r15
            int r2 = r8.N
            int r2 = r1.getDimensionPixelSize(r12, r2)
            r8.N = r2
            goto L_0x0af3
        L_0x0a48:
            r16 = r4
            r18 = r15
            int r2 = r8.L
            int r2 = r1.getDimensionPixelSize(r12, r2)
            r8.L = r2
            goto L_0x0af3
        L_0x0a56:
            r16 = r4
            r18 = r15
            int r2 = r8.P
            int r2 = r1.getDimensionPixelSize(r12, r2)
            r8.P = r2
            goto L_0x0af3
        L_0x0a64:
            r16 = r4
            r18 = r15
            int r2 = r8.O
            int r2 = r1.getDimensionPixelSize(r12, r2)
            r8.O = r2
            goto L_0x0af3
        L_0x0a72:
            r16 = r4
            r18 = r15
            int r2 = r8.f892t
            int r2 = g(r1, r12, r2)
            r8.f892t = r2
            goto L_0x0af3
        L_0x0a80:
            r16 = r4
            r18 = r15
            int r2 = r8.u
            int r2 = g(r1, r12, r2)
            r8.u = r2
            goto L_0x0af3
        L_0x0a8e:
            r16 = r4
            r18 = r15
            int r2 = r8.I
            int r2 = r1.getDimensionPixelSize(r12, r2)
            r8.I = r2
            goto L_0x0af3
        L_0x0a9b:
            r16 = r4
            r18 = r15
            int r2 = r8.C
            int r2 = r1.getDimensionPixelOffset(r12, r2)
            r8.C = r2
            goto L_0x0af3
        L_0x0aa8:
            r16 = r4
            r18 = r15
            int r2 = r8.B
            int r2 = r1.getDimensionPixelOffset(r12, r2)
            r8.B = r2
            goto L_0x0af3
        L_0x0ab5:
            r16 = r4
            r18 = r15
            java.lang.String r2 = r1.getString(r12)
            r8.f894x = r2
            goto L_0x0af3
        L_0x0ac0:
            r16 = r4
            r18 = r15
            int r2 = r8.f883m
            int r2 = g(r1, r12, r2)
            r8.f883m = r2
            goto L_0x0af3
        L_0x0acd:
            r16 = r4
            r18 = r15
            int r2 = r8.f885n
            int r2 = g(r1, r12, r2)
            r8.f885n = r2
            goto L_0x0af3
        L_0x0ada:
            r16 = r4
            r18 = r15
            int r2 = r8.H
            int r2 = r1.getDimensionPixelSize(r12, r2)
            r8.H = r2
            goto L_0x0af3
        L_0x0ae7:
            r16 = r4
            r18 = r15
            int r2 = r8.f887o
            int r2 = g(r1, r12, r2)
            r8.f887o = r2
        L_0x0af3:
            r12 = r18
        L_0x0af5:
            int r4 = r16 + 1
            r2 = r20
            r15 = r12
            goto L_0x0562
        L_0x0afc:
            java.lang.String r2 = r8.f877i0
            if (r2 == 0) goto L_0x0b03
            r2 = 0
            r8.f875h0 = r2
        L_0x0b03:
            r1.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.e(android.content.Context, android.util.AttributeSet, boolean):androidx.constraintlayout.widget.c$a");
    }

    public static int g(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void h(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            android.util.TypedValue r0 = r9.peekValue(r10)
            int r0 = r0.type
            r1 = 3
            r2 = 21
            r3 = 23
            r4 = 1
            r5 = -1
            r6 = 5
            r7 = 0
            if (r0 == r1) goto L_0x006a
            if (r0 == r6) goto L_0x0029
            int r9 = r9.getInt(r10, r7)
            r10 = -4
            r0 = -2
            if (r9 == r10) goto L_0x0027
            r10 = -3
            if (r9 == r10) goto L_0x0025
            if (r9 == r0) goto L_0x002d
            if (r9 == r5) goto L_0x002d
        L_0x0025:
            r4 = r7
            goto L_0x002f
        L_0x0027:
            r7 = r0
            goto L_0x002f
        L_0x0029:
            int r9 = r9.getDimensionPixelSize(r10, r7)
        L_0x002d:
            r4 = r7
            r7 = r9
        L_0x002f:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.b
            if (r9 == 0) goto L_0x0041
            androidx.constraintlayout.widget.ConstraintLayout$b r8 = (androidx.constraintlayout.widget.ConstraintLayout.b) r8
            if (r11 != 0) goto L_0x003c
            r8.width = r7
            r8.V = r4
            goto L_0x0069
        L_0x003c:
            r8.height = r7
            r8.W = r4
            goto L_0x0069
        L_0x0041:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.c.b
            if (r9 == 0) goto L_0x0053
            androidx.constraintlayout.widget.c$b r8 = (androidx.constraintlayout.widget.c.b) r8
            if (r11 != 0) goto L_0x004e
            r8.f863b = r7
            r8.f881k0 = r4
            goto L_0x0069
        L_0x004e:
            r8.f865c = r7
            r8.f882l0 = r4
            goto L_0x0069
        L_0x0053:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.c.a.C0010a
            if (r9 == 0) goto L_0x0069
            androidx.constraintlayout.widget.c$a$a r8 = (androidx.constraintlayout.widget.c.a.C0010a) r8
            if (r11 != 0) goto L_0x0061
            r8.b(r3, r7)
            r9 = 80
            goto L_0x0066
        L_0x0061:
            r8.b(r2, r7)
            r9 = 81
        L_0x0066:
            r8.c(r9, r4)
        L_0x0069:
            return
        L_0x006a:
            java.lang.String r9 = r9.getString(r10)
            if (r9 != 0) goto L_0x0072
            goto L_0x016c
        L_0x0072:
            r10 = 61
            int r10 = r9.indexOf(r10)
            int r0 = r9.length()
            if (r10 <= 0) goto L_0x016c
            int r0 = r0 + r5
            if (r10 >= r0) goto L_0x016c
            java.lang.String r0 = r9.substring(r7, r10)
            int r10 = r10 + r4
            java.lang.String r9 = r9.substring(r10)
            int r10 = r9.length()
            if (r10 <= 0) goto L_0x016c
            java.lang.String r10 = r0.trim()
            java.lang.String r9 = r9.trim()
            java.lang.String r0 = "ratio"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x00c7
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.b
            if (r10 == 0) goto L_0x00b2
            androidx.constraintlayout.widget.ConstraintLayout$b r8 = (androidx.constraintlayout.widget.ConstraintLayout.b) r8
            if (r11 != 0) goto L_0x00ab
            r8.width = r7
            goto L_0x00ad
        L_0x00ab:
            r8.height = r7
        L_0x00ad:
            i(r8, r9)
            goto L_0x016c
        L_0x00b2:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.c.b
            if (r10 == 0) goto L_0x00bc
            androidx.constraintlayout.widget.c$b r8 = (androidx.constraintlayout.widget.c.b) r8
            r8.f894x = r9
            goto L_0x016c
        L_0x00bc:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.c.a.C0010a
            if (r10 == 0) goto L_0x016c
            androidx.constraintlayout.widget.c$a$a r8 = (androidx.constraintlayout.widget.c.a.C0010a) r8
            r8.d(r9, r6)
            goto L_0x016c
        L_0x00c7:
            java.lang.String r0 = "weight"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x0112
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x016c }
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.b     // Catch:{ NumberFormatException -> 0x016c }
            if (r10 == 0) goto L_0x00e7
            androidx.constraintlayout.widget.ConstraintLayout$b r8 = (androidx.constraintlayout.widget.ConstraintLayout.b) r8     // Catch:{ NumberFormatException -> 0x016c }
            if (r11 != 0) goto L_0x00e1
            r8.width = r7     // Catch:{ NumberFormatException -> 0x016c }
            r8.G = r9     // Catch:{ NumberFormatException -> 0x016c }
            goto L_0x016c
        L_0x00e1:
            r8.height = r7     // Catch:{ NumberFormatException -> 0x016c }
            r8.H = r9     // Catch:{ NumberFormatException -> 0x016c }
            goto L_0x016c
        L_0x00e7:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.c.b     // Catch:{ NumberFormatException -> 0x016c }
            if (r10 == 0) goto L_0x00fb
            androidx.constraintlayout.widget.c$b r8 = (androidx.constraintlayout.widget.c.b) r8     // Catch:{ NumberFormatException -> 0x016c }
            if (r11 != 0) goto L_0x00f5
            r8.f863b = r7     // Catch:{ NumberFormatException -> 0x016c }
            r8.T = r9     // Catch:{ NumberFormatException -> 0x016c }
            goto L_0x016c
        L_0x00f5:
            r8.f865c = r7     // Catch:{ NumberFormatException -> 0x016c }
            r8.S = r9     // Catch:{ NumberFormatException -> 0x016c }
            goto L_0x016c
        L_0x00fb:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.c.a.C0010a     // Catch:{ NumberFormatException -> 0x016c }
            if (r10 == 0) goto L_0x016c
            androidx.constraintlayout.widget.c$a$a r8 = (androidx.constraintlayout.widget.c.a.C0010a) r8     // Catch:{ NumberFormatException -> 0x016c }
            if (r11 != 0) goto L_0x0109
            r8.b(r3, r7)     // Catch:{ NumberFormatException -> 0x016c }
            r10 = 39
            goto L_0x010e
        L_0x0109:
            r8.b(r2, r7)     // Catch:{ NumberFormatException -> 0x016c }
            r10 = 40
        L_0x010e:
            r8.a(r10, r9)     // Catch:{ NumberFormatException -> 0x016c }
            goto L_0x016c
        L_0x0112:
            java.lang.String r0 = "parent"
            boolean r10 = r0.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x016c
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x016c }
            r10 = 1065353216(0x3f800000, float:1.0)
            float r9 = java.lang.Math.min(r10, r9)     // Catch:{ NumberFormatException -> 0x016c }
            r10 = 0
            float r9 = java.lang.Math.max(r10, r9)     // Catch:{ NumberFormatException -> 0x016c }
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.b     // Catch:{ NumberFormatException -> 0x016c }
            r0 = 2
            if (r10 == 0) goto L_0x0140
            androidx.constraintlayout.widget.ConstraintLayout$b r8 = (androidx.constraintlayout.widget.ConstraintLayout.b) r8     // Catch:{ NumberFormatException -> 0x016c }
            if (r11 != 0) goto L_0x0139
            r8.width = r7     // Catch:{ NumberFormatException -> 0x016c }
            r8.Q = r9     // Catch:{ NumberFormatException -> 0x016c }
            r8.K = r0     // Catch:{ NumberFormatException -> 0x016c }
            goto L_0x016c
        L_0x0139:
            r8.height = r7     // Catch:{ NumberFormatException -> 0x016c }
            r8.R = r9     // Catch:{ NumberFormatException -> 0x016c }
            r8.L = r0     // Catch:{ NumberFormatException -> 0x016c }
            goto L_0x016c
        L_0x0140:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.c.b     // Catch:{ NumberFormatException -> 0x016c }
            if (r10 == 0) goto L_0x0156
            androidx.constraintlayout.widget.c$b r8 = (androidx.constraintlayout.widget.c.b) r8     // Catch:{ NumberFormatException -> 0x016c }
            if (r11 != 0) goto L_0x014f
            r8.f863b = r7     // Catch:{ NumberFormatException -> 0x016c }
            r8.f866c0 = r9     // Catch:{ NumberFormatException -> 0x016c }
            r8.W = r0     // Catch:{ NumberFormatException -> 0x016c }
            goto L_0x016c
        L_0x014f:
            r8.f865c = r7     // Catch:{ NumberFormatException -> 0x016c }
            r8.f867d0 = r9     // Catch:{ NumberFormatException -> 0x016c }
            r8.X = r0     // Catch:{ NumberFormatException -> 0x016c }
            goto L_0x016c
        L_0x0156:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.c.a.C0010a     // Catch:{ NumberFormatException -> 0x016c }
            if (r9 == 0) goto L_0x016c
            androidx.constraintlayout.widget.c$a$a r8 = (androidx.constraintlayout.widget.c.a.C0010a) r8     // Catch:{ NumberFormatException -> 0x016c }
            if (r11 != 0) goto L_0x0164
            r8.b(r3, r7)     // Catch:{ NumberFormatException -> 0x016c }
            r9 = 54
            goto L_0x0169
        L_0x0164:
            r8.b(r2, r7)     // Catch:{ NumberFormatException -> 0x016c }
            r9 = 55
        L_0x0169:
            r8.b(r9, r0)     // Catch:{ NumberFormatException -> 0x016c }
        L_0x016c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.h(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void i(ConstraintLayout.b bVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i10 = 0;
            int i11 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    i10 = substring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i11 = i10;
                i10 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i10);
                if (substring2.length() > 0) {
                    Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i10, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i11 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        bVar.F = str;
    }

    public final void a(ConstraintLayout constraintLayout) {
        b(constraintLayout);
        constraintLayout.setConstraintSet((c) null);
        constraintLayout.requestLayout();
    }

    public final void b(ConstraintLayout constraintLayout) {
        String str;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> hashMap = this.f844c;
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                String valueOf = String.valueOf(s.a.b(childAt));
                if (valueOf.length() != 0) {
                    str = "id unknown ".concat(valueOf);
                } else {
                    str = new String("id unknown ");
                }
                Log.w("ConstraintSet", str);
            } else if (this.f843b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (hashMap.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    a aVar = hashMap.get(Integer.valueOf(id));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            b bVar = aVar.d;
                            bVar.f873g0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(bVar.f869e0);
                            barrier.setMargin(bVar.f871f0);
                            barrier.setAllowsGoneWidget(bVar.f884m0);
                            int[] iArr = bVar.f875h0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str2 = bVar.f877i0;
                                if (str2 != null) {
                                    int[] d10 = d(barrier, str2);
                                    bVar.f875h0 = d10;
                                    barrier.setReferencedIds(d10);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.a(bVar2);
                        a.b(childAt, aVar.f849f);
                        childAt.setLayoutParams(bVar2);
                        d dVar = aVar.f846b;
                        if (dVar.f906b == 0) {
                            childAt.setVisibility(dVar.f905a);
                        }
                        childAt.setAlpha(dVar.f907c);
                        e eVar = aVar.f848e;
                        childAt.setRotation(eVar.f909a);
                        childAt.setRotationX(eVar.f910b);
                        childAt.setRotationY(eVar.f911c);
                        childAt.setScaleX(eVar.d);
                        childAt.setScaleY(eVar.f912e);
                        if (eVar.f915h != -1) {
                            View findViewById = ((View) childAt.getParent()).findViewById(eVar.f915h);
                            if (findViewById != null) {
                                float bottom = ((float) (findViewById.getBottom() + findViewById.getTop())) / 2.0f;
                                float right = ((float) (findViewById.getRight() + findViewById.getLeft())) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - ((float) childAt.getLeft()));
                                    childAt.setPivotY(bottom - ((float) childAt.getTop()));
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.f913f)) {
                                childAt.setPivotX(eVar.f913f);
                            }
                            if (!Float.isNaN(eVar.f914g)) {
                                childAt.setPivotY(eVar.f914g);
                            }
                        }
                        childAt.setTranslationX(eVar.f916i);
                        childAt.setTranslationY(eVar.f917j);
                        childAt.setTranslationZ(eVar.f918k);
                        if (eVar.l) {
                            childAt.setElevation(eVar.f919m);
                        }
                    }
                } else {
                    StringBuilder sb = new StringBuilder(43);
                    sb.append("WARNING NO CONSTRAINTS for view ");
                    sb.append(id);
                    Log.v("ConstraintSet", sb.toString());
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = hashMap.get(num);
            if (aVar2 != null) {
                b bVar3 = aVar2.d;
                if (bVar3.f873g0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = bVar3.f875h0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str3 = bVar3.f877i0;
                        if (str3 != null) {
                            int[] d11 = d(barrier2, str3);
                            bVar3.f875h0 = d11;
                            barrier2.setReferencedIds(d11);
                        }
                    }
                    barrier2.setType(bVar3.f869e0);
                    barrier2.setMargin(bVar3.f871f0);
                    t.d dVar2 = ConstraintLayout.D;
                    ConstraintLayout.b bVar4 = new ConstraintLayout.b();
                    barrier2.k();
                    aVar2.a(bVar4);
                    constraintLayout.addView(barrier2, bVar4);
                }
                if (bVar3.f861a) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    t.d dVar3 = ConstraintLayout.D;
                    ConstraintLayout.b bVar5 = new ConstraintLayout.b();
                    aVar2.a(bVar5);
                    constraintLayout.addView(guideline, bVar5);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof b) {
                ((b) childAt2).g(constraintLayout);
            }
        }
    }

    public final void c(ConstraintLayout constraintLayout) {
        int i10;
        int i11;
        a aVar;
        String str;
        c cVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> hashMap = cVar.f844c;
        hashMap.clear();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = constraintLayout.getChildAt(i12);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!cVar.f843b || id != -1) {
                if (!hashMap.containsKey(Integer.valueOf(id))) {
                    hashMap.put(Integer.valueOf(id), new a());
                }
                a aVar2 = hashMap.get(Integer.valueOf(id));
                if (aVar2 == null) {
                    i10 = childCount;
                } else {
                    HashMap<String, a> hashMap2 = cVar.f842a;
                    HashMap<String, a> hashMap3 = new HashMap<>();
                    Class<?> cls = childAt.getClass();
                    for (String next : hashMap2.keySet()) {
                        a aVar3 = hashMap2.get(next);
                        try {
                            if (next.equals("BackgroundColor")) {
                                aVar = new a(aVar3, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor()));
                                i11 = childCount;
                            } else {
                                if (next.length() != 0) {
                                    str = "getMap".concat(next);
                                    i11 = childCount;
                                } else {
                                    i11 = childCount;
                                    str = new String("getMap");
                                }
                                try {
                                    aVar = new a(aVar3, cls.getMethod(str, new Class[0]).invoke(childAt, new Object[0]));
                                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                                    e = e10;
                                    e.printStackTrace();
                                    childCount = i11;
                                }
                            }
                            hashMap3.put(next, aVar);
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e11) {
                            e = e11;
                            i11 = childCount;
                            e.printStackTrace();
                            childCount = i11;
                        }
                        childCount = i11;
                    }
                    i10 = childCount;
                    aVar2.f849f = hashMap3;
                    aVar2.b(id, bVar);
                    int visibility = childAt.getVisibility();
                    d dVar = aVar2.f846b;
                    dVar.f905a = visibility;
                    dVar.f907c = childAt.getAlpha();
                    float rotation = childAt.getRotation();
                    e eVar = aVar2.f848e;
                    eVar.f909a = rotation;
                    eVar.f910b = childAt.getRotationX();
                    eVar.f911c = childAt.getRotationY();
                    eVar.d = childAt.getScaleX();
                    eVar.f912e = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        eVar.f913f = pivotX;
                        eVar.f914g = pivotY;
                    }
                    eVar.f916i = childAt.getTranslationX();
                    eVar.f917j = childAt.getTranslationY();
                    eVar.f918k = childAt.getTranslationZ();
                    if (eVar.l) {
                        eVar.f919m = childAt.getElevation();
                    }
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
                        b bVar2 = aVar2.d;
                        bVar2.f884m0 = allowsGoneWidget;
                        bVar2.f875h0 = barrier.getReferencedIds();
                        bVar2.f869e0 = barrier.getType();
                        bVar2.f871f0 = barrier.getMargin();
                    }
                }
                i12++;
                cVar = this;
                childCount = i10;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public final void f(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a e10 = e(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        e10.d.f861a = true;
                    }
                    this.f844c.put(Integer.valueOf(e10.f845a), e10);
                }
            }
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        } catch (IOException e12) {
            e12.printStackTrace();
        }
    }
}

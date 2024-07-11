package m6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import n.e;
import p9.u;

public final class i {

    /* renamed from: m  reason: collision with root package name */
    public static final g f7150m = new g(0.5f);

    /* renamed from: a  reason: collision with root package name */
    public final e f7151a;

    /* renamed from: b  reason: collision with root package name */
    public final e f7152b;

    /* renamed from: c  reason: collision with root package name */
    public final e f7153c;
    public final e d;

    /* renamed from: e  reason: collision with root package name */
    public final c f7154e;

    /* renamed from: f  reason: collision with root package name */
    public final c f7155f;

    /* renamed from: g  reason: collision with root package name */
    public final c f7156g;

    /* renamed from: h  reason: collision with root package name */
    public final c f7157h;

    /* renamed from: i  reason: collision with root package name */
    public final e f7158i;

    /* renamed from: j  reason: collision with root package name */
    public final e f7159j;

    /* renamed from: k  reason: collision with root package name */
    public final e f7160k;
    public final e l;

    public i() {
        this.f7151a = new h();
        this.f7152b = new h();
        this.f7153c = new h();
        this.d = new h();
        this.f7154e = new a(0.0f);
        this.f7155f = new a(0.0f);
        this.f7156g = new a(0.0f);
        this.f7157h = new a(0.0f);
        this.f7158i = new e();
        this.f7159j = new e();
        this.f7160k = new e();
        this.l = new e();
    }

    public static a a(Context context, int i10, int i11, c cVar) {
        if (i11 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
            i10 = i11;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, u.P);
        try {
            int i12 = obtainStyledAttributes.getInt(0, 0);
            int i13 = obtainStyledAttributes.getInt(3, i12);
            int i14 = obtainStyledAttributes.getInt(4, i12);
            int i15 = obtainStyledAttributes.getInt(2, i12);
            int i16 = obtainStyledAttributes.getInt(1, i12);
            c b10 = b(obtainStyledAttributes, 5, cVar);
            c b11 = b(obtainStyledAttributes, 8, b10);
            c b12 = b(obtainStyledAttributes, 9, b10);
            c b13 = b(obtainStyledAttributes, 7, b10);
            c b14 = b(obtainStyledAttributes, 6, b10);
            a aVar = new a();
            e p10 = e.p(i13);
            aVar.f7161a = p10;
            float a10 = a.a(p10);
            if (a10 != -1.0f) {
                aVar.f7164e = new a(a10);
            }
            aVar.f7164e = b11;
            e p11 = e.p(i14);
            aVar.f7162b = p11;
            float a11 = a.a(p11);
            if (a11 != -1.0f) {
                aVar.f7165f = new a(a11);
            }
            aVar.f7165f = b12;
            e p12 = e.p(i15);
            aVar.f7163c = p12;
            float a12 = a.a(p12);
            if (a12 != -1.0f) {
                aVar.f7166g = new a(a12);
            }
            aVar.f7166g = b13;
            e p13 = e.p(i16);
            aVar.d = p13;
            float a13 = a.a(p13);
            if (a13 != -1.0f) {
                aVar.f7167h = new a(a13);
            }
            aVar.f7167h = b14;
            return aVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static c b(TypedArray typedArray, int i10, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return cVar;
        }
        int i11 = peekValue.type;
        return i11 == 5 ? new a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i11 == 6 ? new g(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public final boolean c(RectF rectF) {
        Class<e> cls = e.class;
        boolean z = this.l.getClass().equals(cls) && this.f7159j.getClass().equals(cls) && this.f7158i.getClass().equals(cls) && this.f7160k.getClass().equals(cls);
        float a10 = this.f7154e.a(rectF);
        return z && ((this.f7155f.a(rectF) > a10 ? 1 : (this.f7155f.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f7157h.a(rectF) > a10 ? 1 : (this.f7157h.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f7156g.a(rectF) > a10 ? 1 : (this.f7156g.a(rectF) == a10 ? 0 : -1)) == 0) && ((this.f7152b instanceof h) && (this.f7151a instanceof h) && (this.f7153c instanceof h) && (this.d instanceof h));
    }

    public final i d(float f10) {
        a aVar = new a(this);
        aVar.f7164e = new a(f10);
        aVar.f7165f = new a(f10);
        aVar.f7166g = new a(f10);
        aVar.f7167h = new a(f10);
        return new i(aVar);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public e f7161a = new h();

        /* renamed from: b  reason: collision with root package name */
        public e f7162b = new h();

        /* renamed from: c  reason: collision with root package name */
        public e f7163c = new h();
        public e d = new h();

        /* renamed from: e  reason: collision with root package name */
        public c f7164e = new a(0.0f);

        /* renamed from: f  reason: collision with root package name */
        public c f7165f = new a(0.0f);

        /* renamed from: g  reason: collision with root package name */
        public c f7166g = new a(0.0f);

        /* renamed from: h  reason: collision with root package name */
        public c f7167h = new a(0.0f);

        /* renamed from: i  reason: collision with root package name */
        public final e f7168i = new e();

        /* renamed from: j  reason: collision with root package name */
        public final e f7169j = new e();

        /* renamed from: k  reason: collision with root package name */
        public final e f7170k = new e();
        public final e l = new e();

        public a() {
        }

        public static float a(e eVar) {
            if (eVar instanceof h) {
                return ((h) eVar).I;
            }
            if (eVar instanceof d) {
                return ((d) eVar).I;
            }
            return -1.0f;
        }

        public a(i iVar) {
            this.f7161a = iVar.f7151a;
            this.f7162b = iVar.f7152b;
            this.f7163c = iVar.f7153c;
            this.d = iVar.d;
            this.f7164e = iVar.f7154e;
            this.f7165f = iVar.f7155f;
            this.f7166g = iVar.f7156g;
            this.f7167h = iVar.f7157h;
            this.f7168i = iVar.f7158i;
            this.f7169j = iVar.f7159j;
            this.f7170k = iVar.f7160k;
            this.l = iVar.l;
        }
    }

    public i(a aVar) {
        this.f7151a = aVar.f7161a;
        this.f7152b = aVar.f7162b;
        this.f7153c = aVar.f7163c;
        this.d = aVar.d;
        this.f7154e = aVar.f7164e;
        this.f7155f = aVar.f7165f;
        this.f7156g = aVar.f7166g;
        this.f7157h = aVar.f7167h;
        this.f7158i = aVar.f7168i;
        this.f7159j = aVar.f7169j;
        this.f7160k = aVar.f7170k;
        this.l = aVar.l;
    }
}

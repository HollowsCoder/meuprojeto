package b6;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

public interface d {

    public static class a implements TypeEvaluator<C0023d> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f1959b = new a();

        /* renamed from: a  reason: collision with root package name */
        public final C0023d f1960a = new C0023d();

        public final Object evaluate(float f10, Object obj, Object obj2) {
            C0023d dVar = (C0023d) obj;
            C0023d dVar2 = (C0023d) obj2;
            float f11 = dVar.f1963a;
            float f12 = 1.0f - f10;
            float f13 = (dVar2.f1963a * f10) + (f11 * f12);
            float f14 = dVar.f1964b;
            float f15 = dVar2.f1964b * f10;
            float f16 = dVar.f1965c;
            float f17 = f10 * dVar2.f1965c;
            C0023d dVar3 = this.f1960a;
            dVar3.f1963a = f13;
            dVar3.f1964b = f15 + (f14 * f12);
            dVar3.f1965c = f17 + (f12 * f16);
            return dVar3;
        }
    }

    public static class b extends Property<d, C0023d> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f1961a = new b();

        public b() {
            super(C0023d.class, "circularReveal");
        }

        public final Object get(Object obj) {
            return ((d) obj).getRevealInfo();
        }

        public final void set(Object obj, Object obj2) {
            ((d) obj).setRevealInfo((C0023d) obj2);
        }
    }

    public static class c extends Property<d, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f1962a = new c();

        public c() {
            super(Integer.class, "circularRevealScrimColor");
        }

        public final Object get(Object obj) {
            return Integer.valueOf(((d) obj).getCircularRevealScrimColor());
        }

        public final void set(Object obj, Object obj2) {
            ((d) obj).setCircularRevealScrimColor(((Integer) obj2).intValue());
        }
    }

    /* renamed from: b6.d$d  reason: collision with other inner class name */
    public static class C0023d {

        /* renamed from: a  reason: collision with root package name */
        public float f1963a;

        /* renamed from: b  reason: collision with root package name */
        public float f1964b;

        /* renamed from: c  reason: collision with root package name */
        public float f1965c;

        public C0023d() {
        }

        public C0023d(float f10, float f11, float f12) {
            this.f1963a = f10;
            this.f1964b = f11;
            this.f1965c = f12;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    C0023d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(C0023d dVar);
}

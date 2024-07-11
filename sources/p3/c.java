package p3;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Html;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.Arrays;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final View f7897a;

    /* renamed from: b  reason: collision with root package name */
    public final i f7898b;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7899a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f7900b;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        static {
            /*
                p3.c$b[] r0 = p3.c.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7900b = r0
                r1 = 1
                p3.c$b r2 = p3.c.b.END     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f7900b     // Catch:{ NoSuchFieldError -> 0x001d }
                p3.c$b r3 = p3.c.b.CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                p3.c$g[] r2 = p3.c.g.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f7899a = r2
                p3.c$g r3 = p3.c.g.TOP     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f7899a     // Catch:{ NoSuchFieldError -> 0x0038 }
                p3.c$g r2 = p3.c.g.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f7899a     // Catch:{ NoSuchFieldError -> 0x0043 }
                p3.c$g r1 = p3.c.g.LEFT     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f7899a     // Catch:{ NoSuchFieldError -> 0x004e }
                p3.c$g r1 = p3.c.g.RIGHT     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p3.c.a.<clinit>():void");
        }
    }

    public enum b {
        START,
        CENTER,
        END
    }

    /* renamed from: p3.c$c  reason: collision with other inner class name */
    public static class C0115c implements h {
        public final void a(View view, d dVar) {
            view.setAlpha(0.0f);
            view.animate().alpha(1.0f).setDuration(400).setListener(dVar);
        }

        public final void b(View view, e eVar) {
            view.animate().alpha(0.0f).setDuration(400).setListener(eVar);
        }
    }

    public interface d {
    }

    public interface e {
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f7901a;

        public f(Activity activity) {
            this.f7901a = activity;
        }
    }

    public enum g {
        LEFT,
        RIGHT,
        TOP,
        BOTTOM
    }

    public interface h {
        void a(View view, d dVar);

        void b(View view, e eVar);
    }

    public static class i extends FrameLayout {
        public boolean A = true;
        public long B = 4000;
        public d C;
        public e D;
        public h E = new C0115c();
        public int F = 30;
        public final int G = 20;
        public final int H = 30;
        public final int I = 30;
        public final int J = 30;
        public final int K = 4;
        public final int L = 8;
        public Rect M;
        public int N = 0;
        public int O = Color.parseColor("#aaaaaa");

        /* renamed from: o  reason: collision with root package name */
        public int f7902o = 15;

        /* renamed from: p  reason: collision with root package name */
        public int f7903p = 15;

        /* renamed from: q  reason: collision with root package name */
        public int f7904q = 0;

        /* renamed from: r  reason: collision with root package name */
        public int f7905r = 0;

        /* renamed from: s  reason: collision with root package name */
        public View f7906s;

        /* renamed from: t  reason: collision with root package name */
        public int f7907t = Color.parseColor("#1F7C82");
        public Path u;

        /* renamed from: v  reason: collision with root package name */
        public Paint f7908v;
        public Paint w;

        /* renamed from: x  reason: collision with root package name */
        public g f7909x = g.BOTTOM;

        /* renamed from: y  reason: collision with root package name */
        public b f7910y = b.CENTER;
        public boolean z;

        public i(Activity activity) {
            super(activity);
            setWillNotDraw(false);
            TextView textView = new TextView(activity);
            this.f7906s = textView;
            textView.setTextColor(-1);
            addView(this.f7906s, -2, -2);
            this.f7906s.setPadding(0, 0, 0, 0);
            Paint paint = new Paint(1);
            this.f7908v = paint;
            paint.setColor(this.f7907t);
            this.f7908v.setStyle(Paint.Style.FILL);
            this.w = null;
            setLayerType(1, this.f7908v);
            setWithShadow(true);
        }

        public final Path a(RectF rectF, float f10, float f11, float f12, float f13) {
            float f14;
            float f15;
            RectF rectF2 = rectF;
            Path path = new Path();
            Rect rect = this.M;
            if (rect == null) {
                return path;
            }
            float f16 = f10 < 0.0f ? 0.0f : f10;
            float f17 = f11 < 0.0f ? 0.0f : f11;
            float f18 = f13 < 0.0f ? 0.0f : f13;
            float f19 = f12 < 0.0f ? 0.0f : f12;
            g gVar = this.f7909x;
            g gVar2 = g.RIGHT;
            float f20 = gVar == gVar2 ? (float) this.f7902o : 0.0f;
            g gVar3 = g.BOTTOM;
            float f21 = gVar == gVar3 ? (float) this.f7902o : 0.0f;
            g gVar4 = g.LEFT;
            float f22 = gVar == gVar4 ? (float) this.f7902o : 0.0f;
            g gVar5 = g.TOP;
            float f23 = gVar == gVar5 ? (float) this.f7902o : 0.0f;
            float f24 = f20 + rectF2.left;
            float f25 = f21 + rectF2.top;
            float f26 = rectF2.right - f22;
            float f27 = rectF2.bottom - f23;
            float centerX = ((float) rect.centerX()) - getX();
            float f28 = f18;
            float f29 = f19;
            float f30 = Arrays.asList(new g[]{gVar5, gVar3}).contains(this.f7909x) ? ((float) this.f7904q) + centerX : centerX;
            float f31 = f26;
            if (Arrays.asList(new g[]{gVar5, gVar3}).contains(this.f7909x)) {
                centerX += (float) this.f7905r;
            }
            float f32 = Arrays.asList(new g[]{gVar2, gVar4}).contains(this.f7909x) ? (f27 / 2.0f) - ((float) this.f7904q) : f27 / 2.0f;
            g gVar6 = gVar2;
            if (Arrays.asList(new g[]{gVar2, gVar4}).contains(this.f7909x)) {
                f14 = (f27 / 2.0f) - ((float) this.f7905r);
                f15 = 2.0f;
            } else {
                f15 = 2.0f;
                f14 = f27 / 2.0f;
            }
            float f33 = f16 / f15;
            float f34 = f24 + f33;
            path.moveTo(f34, f25);
            float f35 = f34;
            if (this.f7909x == gVar3) {
                path.lineTo(f30 - ((float) this.f7903p), f25);
                path.lineTo(centerX, rectF2.top);
                path.lineTo(((float) this.f7903p) + f30, f25);
            }
            float f36 = f17 / 2.0f;
            path.lineTo(f31 - f36, f25);
            float f37 = f31;
            path.quadTo(f37, f25, f37, f36 + f25);
            if (this.f7909x == gVar4) {
                path.lineTo(f37, f32 - ((float) this.f7903p));
                path.lineTo(rectF2.right, f14);
                path.lineTo(f37, ((float) this.f7903p) + f32);
            }
            float f38 = f29 / 2.0f;
            path.lineTo(f37, f27 - f38);
            path.quadTo(f37, f27, f37 - f38, f27);
            if (this.f7909x == gVar5) {
                path.lineTo(((float) this.f7903p) + f30, f27);
                path.lineTo(centerX, rectF2.bottom);
                path.lineTo(f30 - ((float) this.f7903p), f27);
            }
            float f39 = f28 / 2.0f;
            path.lineTo(f24 + f39, f27);
            path.quadTo(f24, f27, f24, f27 - f39);
            if (this.f7909x == gVar6) {
                path.lineTo(f24, ((float) this.f7903p) + f32);
                path.lineTo(rectF2.left, f14);
                path.lineTo(f24, f32 - ((float) this.f7903p));
            }
            path.lineTo(f24, f33 + f25);
            path.quadTo(f24, f25, f35, f25);
            path.close();
            return path;
        }

        public final void b(Rect rect) {
            setupPosition(rect);
            float f10 = (float) this.K;
            float f11 = 2.0f * f10;
            RectF rectF = new RectF(f10, f10, ((float) getWidth()) - f11, ((float) getHeight()) - f11);
            float f12 = (float) this.F;
            this.u = a(rectF, f12, f12, f12, f12);
            this.E.a(this, new d(this));
            if (this.z) {
                setOnClickListener(new f(this));
            }
            if (this.A) {
                postDelayed(new g(this), this.B);
            }
        }

        public int getArrowHeight() {
            return this.f7902o;
        }

        public int getArrowSourceMargin() {
            return this.f7904q;
        }

        public int getArrowTargetMargin() {
            return this.f7905r;
        }

        public int getArrowWidth() {
            return this.f7903p;
        }

        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Path path = this.u;
            if (path != null) {
                canvas.drawPath(path, this.f7908v);
                Paint paint = this.w;
                if (paint != null) {
                    canvas.drawPath(this.u, paint);
                }
            }
        }

        public final void onSizeChanged(int i10, int i11, int i12, int i13) {
            super.onSizeChanged(i10, i11, i12, i13);
            int i14 = this.K;
            RectF rectF = new RectF((float) i14, (float) i14, (float) (i10 - (i14 * 2)), (float) (i11 - (i14 * 2)));
            int i15 = this.F;
            this.u = a(rectF, (float) i15, (float) i15, (float) i15, (float) i15);
        }

        public void setAlign(b bVar) {
            this.f7910y = bVar;
            postInvalidate();
        }

        public void setArrowHeight(int i10) {
            this.f7902o = i10;
            postInvalidate();
        }

        public void setArrowSourceMargin(int i10) {
            this.f7904q = i10;
            postInvalidate();
        }

        public void setArrowTargetMargin(int i10) {
            this.f7905r = i10;
            postInvalidate();
        }

        public void setArrowWidth(int i10) {
            this.f7903p = i10;
            postInvalidate();
        }

        public void setAutoHide(boolean z10) {
            this.A = z10;
        }

        public void setBorderPaint(Paint paint) {
            this.w = paint;
            postInvalidate();
        }

        public void setClickToHide(boolean z10) {
            this.z = z10;
        }

        public void setColor(int i10) {
            this.f7907t = i10;
            this.f7908v.setColor(i10);
            postInvalidate();
        }

        public void setCorner(int i10) {
            this.F = i10;
        }

        public void setCustomView(View view) {
            removeView(this.f7906s);
            this.f7906s = view;
            addView(view, -2, -2);
        }

        public void setDistanceWithView(int i10) {
            this.N = i10;
        }

        public void setDuration(long j8) {
            this.B = j8;
        }

        public void setListenerDisplay(d dVar) {
            this.C = dVar;
        }

        public void setListenerHide(e eVar) {
            this.D = eVar;
        }

        public void setPaint(Paint paint) {
            this.f7908v = paint;
            setLayerType(1, paint);
            postInvalidate();
        }

        public void setPosition(g gVar) {
            this.f7909x = gVar;
            int i10 = a.f7899a[gVar.ordinal()];
            int i11 = this.H;
            int i12 = this.I;
            int i13 = this.G;
            int i14 = this.J;
            if (i10 == 1) {
                i11 += this.f7902o;
            } else if (i10 == 2) {
                i13 += this.f7902o;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    i14 += this.f7902o;
                }
                postInvalidate();
            } else {
                i12 += this.f7902o;
            }
            setPadding(i14, i13, i12, i11);
            postInvalidate();
        }

        public void setShadowColor(int i10) {
            this.O = i10;
            postInvalidate();
        }

        public void setText(int i10) {
            View view = this.f7906s;
            if (view instanceof TextView) {
                ((TextView) view).setText(i10);
            }
            postInvalidate();
        }

        public void setText(String str) {
            View view = this.f7906s;
            if (view instanceof TextView) {
                ((TextView) view).setText(Html.fromHtml(str));
            }
            postInvalidate();
        }

        public void setTextColor(int i10) {
            View view = this.f7906s;
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i10);
            }
            postInvalidate();
        }

        public void setTextGravity(int i10) {
            View view = this.f7906s;
            if (view instanceof TextView) {
                ((TextView) view).setGravity(i10);
            }
            postInvalidate();
        }

        public void setTextTypeFace(Typeface typeface) {
            View view = this.f7906s;
            if (view instanceof TextView) {
                ((TextView) view).setTypeface(typeface);
            }
            postInvalidate();
        }

        public void setTooltipAnimation(h hVar) {
            this.E = hVar;
        }

        public void setWithShadow(boolean z10) {
            if (z10) {
                this.f7908v.setShadowLayer((float) this.L, 0.0f, 0.0f, this.O);
            } else {
                this.f7908v.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }

        public void setupPosition(Rect rect) {
            int i10;
            int i11;
            int i12;
            g gVar = this.f7909x;
            g gVar2 = g.LEFT;
            int i13 = 0;
            if (gVar == gVar2 || gVar == g.RIGHT) {
                if (gVar == gVar2) {
                    i12 = (rect.left - getWidth()) - this.N;
                } else {
                    i12 = rect.right + this.N;
                }
                int i14 = rect.top;
                int height = getHeight();
                int height2 = rect.height();
                int i15 = a.f7900b[this.f7910y.ordinal()];
                if (i15 == 1) {
                    i13 = height2 - height;
                } else if (i15 == 2) {
                    i13 = (height2 - height) / 2;
                }
                int i16 = i13 + i14;
                i10 = i12;
                i11 = i16;
            } else {
                if (gVar == g.BOTTOM) {
                    i11 = rect.bottom + this.N;
                } else {
                    i11 = (rect.top - getHeight()) - this.N;
                }
                int i17 = rect.left;
                int width = getWidth();
                int width2 = rect.width();
                int i18 = a.f7900b[this.f7910y.ordinal()];
                if (i18 == 1) {
                    i13 = width2 - width;
                } else if (i18 == 2) {
                    i13 = (width2 - width) / 2;
                }
                i10 = i13 + i17;
            }
            setTranslationX((float) i10);
            setTranslationY((float) i11);
        }
    }

    public c(f fVar, TextView textView) {
        this.f7897a = textView;
        Activity activity = fVar.f7901a;
        activity.getClass();
        this.f7898b = new i(activity);
        NestedScrollView a10 = a(textView);
        if (a10 != null) {
            a10.setOnScrollChangeListener(new a(this));
        }
    }

    public static NestedScrollView a(View view) {
        if (view.getParent() == null || !(view.getParent() instanceof View)) {
            return null;
        }
        boolean z = view.getParent() instanceof NestedScrollView;
        ViewParent parent = view.getParent();
        return z ? (NestedScrollView) parent : a((View) parent);
    }
}

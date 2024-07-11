package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.karumi.dexter.R;
import m.b;

public class CardView extends FrameLayout {

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f760t = {16842801};
    public static final androidx.databinding.a u = new androidx.databinding.a();

    /* renamed from: o  reason: collision with root package name */
    public boolean f761o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f762p;

    /* renamed from: q  reason: collision with root package name */
    public final Rect f763q;

    /* renamed from: r  reason: collision with root package name */
    public final Rect f764r = new Rect();

    /* renamed from: s  reason: collision with root package name */
    public final a f765s;

    public class a implements m.a {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f766a;

        public a() {
        }

        public final void a(int i10, int i11, int i12, int i13) {
            CardView cardView = CardView.this;
            cardView.f764r.set(i10, i11, i12, i13);
            Rect rect = cardView.f763q;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.cardViewStyle);
        ColorStateList colorStateList;
        Resources resources;
        int i10;
        Rect rect = new Rect();
        this.f763q = rect;
        a aVar = new a();
        this.f765s = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.databinding.a.y0, R.attr.cardViewStyle, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            colorStateList = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f760t);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i10 = R.color.cardview_light_background;
            } else {
                resources = getResources();
                i10 = R.color.cardview_dark_background;
            }
            colorStateList = ColorStateList.valueOf(resources.getColor(i10));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f761o = obtainStyledAttributes.getBoolean(7, false);
        this.f762p = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        androidx.databinding.a aVar2 = u;
        b bVar = new b(dimension, colorStateList);
        aVar.f766a = bVar;
        setBackgroundDrawable(bVar);
        setClipToOutline(true);
        setElevation(dimension2);
        aVar2.q(aVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((b) this.f765s.f766a).f7011h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f763q.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f763q.left;
    }

    public int getContentPaddingRight() {
        return this.f763q.right;
    }

    public int getContentPaddingTop() {
        return this.f763q.top;
    }

    public float getMaxCardElevation() {
        return ((b) this.f765s.f766a).f7008e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f762p;
    }

    public float getRadius() {
        return ((b) this.f765s.f766a).f7005a;
    }

    public boolean getUseCompatPadding() {
        return this.f761o;
    }

    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        ColorStateList valueOf = ColorStateList.valueOf(i10);
        b bVar = (b) this.f765s.f766a;
        bVar.b(valueOf);
        bVar.invalidateSelf();
    }

    public void setCardElevation(float f10) {
        CardView.this.setElevation(f10);
    }

    public void setMaxCardElevation(float f10) {
        u.q(this.f765s, f10);
    }

    public void setMinimumHeight(int i10) {
        super.setMinimumHeight(i10);
    }

    public void setMinimumWidth(int i10) {
        super.setMinimumWidth(i10);
    }

    public final void setPadding(int i10, int i11, int i12, int i13) {
    }

    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f762p) {
            this.f762p = z;
            androidx.databinding.a aVar = u;
            a aVar2 = this.f765s;
            aVar.q(aVar2, ((b) aVar2.f766a).f7008e);
        }
    }

    public void setRadius(float f10) {
        b bVar = (b) this.f765s.f766a;
        if (f10 != bVar.f7005a) {
            bVar.f7005a = f10;
            bVar.c((Rect) null);
            bVar.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f761o != z) {
            this.f761o = z;
            androidx.databinding.a aVar = u;
            a aVar2 = this.f765s;
            aVar.q(aVar2, ((b) aVar2.f766a).f7008e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        b bVar = (b) this.f765s.f766a;
        bVar.b(colorStateList);
        bVar.invalidateSelf();
    }
}

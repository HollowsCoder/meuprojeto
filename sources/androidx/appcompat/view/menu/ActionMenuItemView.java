package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.i1;
import androidx.appcompat.widget.n0;

public class ActionMenuItemView extends AppCompatTextView implements k.a, View.OnClickListener, ActionMenuView.a {
    public boolean A = e();
    public boolean B;
    public final int C;
    public int D;
    public final int E;
    public h u;

    /* renamed from: v  reason: collision with root package name */
    public CharSequence f259v;
    public Drawable w;

    /* renamed from: x  reason: collision with root package name */
    public f.b f260x;

    /* renamed from: y  reason: collision with root package name */
    public a f261y;
    public b z;

    public class a extends n0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        public final i.f b() {
            c.a aVar;
            b bVar = ActionMenuItemView.this.z;
            if (bVar == null || (aVar = c.this.H) == null) {
                return null;
            }
            return aVar.a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = b();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean c() {
            /*
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = androidx.appcompat.view.menu.ActionMenuItemView.this
                androidx.appcompat.view.menu.f$b r1 = r0.f260x
                r2 = 0
                if (r1 == 0) goto L_0x001c
                androidx.appcompat.view.menu.h r0 = r0.u
                boolean r0 = r1.a(r0)
                if (r0 == 0) goto L_0x001c
                i.f r0 = r3.b()
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.c()
                if (r0 == 0) goto L_0x001c
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.a.c():boolean");
        }
    }

    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.databinding.a.B, 0, 0);
        this.C = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.E = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.D = -1;
        setSaveEnabled(false);
    }

    public final boolean a() {
        return d();
    }

    public final boolean b() {
        return d() && this.u.getIcon() == null;
    }

    public final void c(h hVar) {
        int i10;
        this.u = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.getTitleCondensed());
        setId(hVar.f337a);
        if (hVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        setEnabled(hVar.isEnabled());
        if (hVar.hasSubMenu() && this.f261y == null) {
            this.f261y = new a();
        }
    }

    public final boolean d() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void f() {
        CharSequence charSequence;
        boolean z10;
        boolean z11 = true;
        boolean z12 = !TextUtils.isEmpty(this.f259v);
        if (this.w != null) {
            if ((this.u.f357y & 4) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 || (!this.A && !this.B)) {
                z11 = false;
            }
        }
        boolean z13 = z12 & z11;
        CharSequence charSequence2 = null;
        if (z13) {
            charSequence = this.f259v;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence3 = this.u.f351q;
        if (TextUtils.isEmpty(charSequence3)) {
            if (z13) {
                charSequence3 = null;
            } else {
                charSequence3 = this.u.f340e;
            }
        }
        setContentDescription(charSequence3);
        CharSequence charSequence4 = this.u.f352r;
        if (TextUtils.isEmpty(charSequence4)) {
            if (!z13) {
                charSequence2 = this.u.f340e;
            }
            i1.a(this, charSequence2);
            return;
        }
        i1.a(this, charSequence4);
    }

    public h getItemData() {
        return this.u;
    }

    public final void onClick(View view) {
        f.b bVar = this.f260x;
        if (bVar != null) {
            bVar.a(this.u);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A = e();
        f();
    }

    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean d = d();
        if (d && (i12 = this.D) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int i13 = this.C;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i13) : i13;
        if (mode != 1073741824 && i13 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i11);
        }
        if (!d && this.w != null) {
            super.setPadding((getMeasuredWidth() - this.w.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (!this.u.hasSubMenu() || (aVar = this.f261y) == null || !aVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.B != z10) {
            this.B = z10;
            h hVar = this.u;
            if (hVar != null) {
                f fVar = hVar.f348n;
                fVar.f323k = true;
                fVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.w = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.E;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i10) / ((float) intrinsicWidth)));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i10) / ((float) intrinsicHeight)));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        f();
    }

    public void setItemInvoker(f.b bVar) {
        this.f260x = bVar;
    }

    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.D = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.z = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f259v = charSequence;
        f();
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import i0.b0;
import i0.w;
import java.util.WeakHashMap;

public final class z extends Spinner {
    public static final int[] w = {16843505};

    /* renamed from: o  reason: collision with root package name */
    public final e f735o;

    /* renamed from: p  reason: collision with root package name */
    public final Context f736p;

    /* renamed from: q  reason: collision with root package name */
    public final y f737q;

    /* renamed from: r  reason: collision with root package name */
    public SpinnerAdapter f738r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f739s;

    /* renamed from: t  reason: collision with root package name */
    public final f f740t;
    public int u;

    /* renamed from: v  reason: collision with root package name */
    public final Rect f741v = new Rect();

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public final void onGlobalLayout() {
            z zVar = z.this;
            if (!zVar.getInternalPopup().c()) {
                zVar.f740t.m(zVar.getTextDirection(), zVar.getTextAlignment());
            }
            ViewTreeObserver viewTreeObserver = zVar.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    public class b implements f, DialogInterface.OnClickListener {

        /* renamed from: o  reason: collision with root package name */
        public androidx.appcompat.app.b f743o;

        /* renamed from: p  reason: collision with root package name */
        public ListAdapter f744p;

        /* renamed from: q  reason: collision with root package name */
        public CharSequence f745q;

        public b() {
        }

        public final boolean c() {
            androidx.appcompat.app.b bVar = this.f743o;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        public final int d() {
            return 0;
        }

        public final void dismiss() {
            androidx.appcompat.app.b bVar = this.f743o;
            if (bVar != null) {
                bVar.dismiss();
                this.f743o = null;
            }
        }

        public final Drawable f() {
            return null;
        }

        public final void h(CharSequence charSequence) {
            this.f745q = charSequence;
        }

        public final void i(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        public final void j(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        public final void k(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        public final void l(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        public final void m(int i10, int i11) {
            if (this.f744p != null) {
                z zVar = z.this;
                b.a aVar = new b.a(zVar.getPopupContext());
                CharSequence charSequence = this.f745q;
                AlertController.b bVar = aVar.f257a;
                if (charSequence != null) {
                    bVar.d = charSequence;
                }
                ListAdapter listAdapter = this.f744p;
                int selectedItemPosition = zVar.getSelectedItemPosition();
                bVar.f248m = listAdapter;
                bVar.f249n = this;
                bVar.f252q = selectedItemPosition;
                bVar.f251p = true;
                androidx.appcompat.app.b a10 = aVar.a();
                this.f743o = a10;
                AlertController.RecycleListView recycleListView = a10.f256q.f219g;
                recycleListView.setTextDirection(i10);
                recycleListView.setTextAlignment(i11);
                this.f743o.show();
            }
        }

        public final int n() {
            return 0;
        }

        public final CharSequence o() {
            return this.f745q;
        }

        public final void onClick(DialogInterface dialogInterface, int i10) {
            z zVar = z.this;
            zVar.setSelection(i10);
            if (zVar.getOnItemClickListener() != null) {
                zVar.performItemClick((View) null, i10, this.f744p.getItemId(i10));
            }
            dismiss();
        }

        public final void p(ListAdapter listAdapter) {
            this.f744p = listAdapter;
        }
    }

    public static class c implements ListAdapter, SpinnerAdapter {

        /* renamed from: o  reason: collision with root package name */
        public final SpinnerAdapter f747o;

        /* renamed from: p  reason: collision with root package name */
        public final ListAdapter f748p;

        public c(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f747o = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f748p = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof a1) {
                a1 a1Var = (a1) spinnerAdapter;
                if (a1Var.getDropDownViewTheme() == null) {
                    a1Var.a();
                }
            }
        }

        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f748p;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f747o;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f747o;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        public final Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f747o;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        public final long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f747o;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i10);
        }

        public final int getItemViewType(int i10) {
            return 0;
        }

        public final View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        public final int getViewTypeCount() {
            return 1;
        }

        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f747o;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public final boolean isEmpty() {
            return getCount() == 0;
        }

        public final boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f748p;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f747o;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f747o;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public class d extends q0 implements f {
        public CharSequence P;
        public ListAdapter Q;
        public final Rect R = new Rect();
        public int S;

        public class a implements AdapterView.OnItemClickListener {
            public a() {
            }

            public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j8) {
                d dVar = d.this;
                z.this.setSelection(i10);
                if (z.this.getOnItemClickListener() != null) {
                    z.this.performItemClick(view, i10, dVar.Q.getItemId(i10));
                }
                dVar.dismiss();
            }
        }

        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            public final void onGlobalLayout() {
                boolean z;
                d dVar = d.this;
                z zVar = z.this;
                dVar.getClass();
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                if (!w.g.b(zVar) || !zVar.getGlobalVisibleRect(dVar.R)) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    dVar.dismiss();
                    return;
                }
                dVar.s();
                dVar.a();
            }
        }

        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f751o;

            public c(b bVar) {
                this.f751o = bVar;
            }

            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = z.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f751o);
                }
            }
        }

        public d(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10, 0);
            this.C = z.this;
            this.L = true;
            this.M.setFocusable(true);
            this.D = new a();
        }

        public final void h(CharSequence charSequence) {
            this.P = charSequence;
        }

        public final void k(int i10) {
            this.S = i10;
        }

        public final void m(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean c10 = c();
            s();
            r rVar = this.M;
            rVar.setInputMethodMode(2);
            a();
            l0 l0Var = this.f688q;
            l0Var.setChoiceMode(1);
            l0Var.setTextDirection(i10);
            l0Var.setTextAlignment(i11);
            z zVar = z.this;
            int selectedItemPosition = zVar.getSelectedItemPosition();
            l0 l0Var2 = this.f688q;
            if (c() && l0Var2 != null) {
                l0Var2.setListSelectionHidden(false);
                l0Var2.setSelection(selectedItemPosition);
                if (l0Var2.getChoiceMode() != 0) {
                    l0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!c10 && (viewTreeObserver = zVar.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                rVar.setOnDismissListener(new c(bVar));
            }
        }

        public final CharSequence o() {
            return this.P;
        }

        public final void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.Q = listAdapter;
        }

        public final void s() {
            int i10;
            int i11;
            Drawable f10 = f();
            z zVar = z.this;
            if (f10 != null) {
                f10.getPadding(zVar.f741v);
                if (m1.a(zVar)) {
                    i10 = zVar.f741v.right;
                } else {
                    i10 = -zVar.f741v.left;
                }
            } else {
                Rect rect = zVar.f741v;
                rect.right = 0;
                rect.left = 0;
                i10 = 0;
            }
            int paddingLeft = zVar.getPaddingLeft();
            int paddingRight = zVar.getPaddingRight();
            int width = zVar.getWidth();
            int i12 = zVar.u;
            if (i12 == -2) {
                int a10 = zVar.a((SpinnerAdapter) this.Q, f());
                int i13 = zVar.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = zVar.f741v;
                int i14 = (i13 - rect2.left) - rect2.right;
                if (a10 > i14) {
                    a10 = i14;
                }
                i12 = Math.max(a10, (width - paddingLeft) - paddingRight);
            } else if (i12 == -1) {
                i12 = (width - paddingLeft) - paddingRight;
            }
            r(i12);
            if (m1.a(zVar)) {
                i11 = (((width - paddingRight) - this.f690s) - this.S) + i10;
            } else {
                i11 = paddingLeft + this.S + i10;
            }
            this.f691t = i11;
        }
    }

    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: o  reason: collision with root package name */
        public boolean f753o;

        public class a implements Parcelable.Creator<e> {
            public final Object createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            public final Object[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e(Parcel parcel) {
            super(parcel);
            this.f753o = parcel.readByte() != 0;
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f753o ? (byte) 1 : 0);
        }
    }

    public interface f {
        boolean c();

        int d();

        void dismiss();

        Drawable f();

        void h(CharSequence charSequence);

        void i(Drawable drawable);

        void j(int i10);

        void k(int i10);

        void l(int i10);

        void m(int i10, int i11);

        int n();

        CharSequence o();

        void p(ListAdapter listAdapter);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r5 != null) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public z(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            r10.<init>(r11, r12, r13)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.f741v = r0
            android.content.Context r0 = r10.getContext()
            androidx.appcompat.widget.z0.a(r10, r0)
            int[] r0 = androidx.databinding.a.U
            r1 = 0
            android.content.res.TypedArray r2 = r11.obtainStyledAttributes(r12, r0, r13, r1)
            androidx.appcompat.widget.e r3 = new androidx.appcompat.widget.e
            r3.<init>(r10)
            r10.f735o = r3
            r3 = 4
            int r3 = r2.getResourceId(r3, r1)
            if (r3 == 0) goto L_0x002e
            h.c r4 = new h.c
            r4.<init>((android.content.Context) r11, (int) r3)
            r10.f736p = r4
            goto L_0x0030
        L_0x002e:
            r10.f736p = r11
        L_0x0030:
            r3 = -1
            r4 = 0
            int[] r5 = w     // Catch:{ Exception -> 0x004c, all -> 0x0049 }
            android.content.res.TypedArray r5 = r11.obtainStyledAttributes(r12, r5, r13, r1)     // Catch:{ Exception -> 0x004c, all -> 0x0049 }
            boolean r6 = r5.hasValue(r1)     // Catch:{ Exception -> 0x0047 }
            if (r6 == 0) goto L_0x0058
            int r3 = r5.getInt(r1, r1)     // Catch:{ Exception -> 0x0047 }
            goto L_0x0058
        L_0x0043:
            r11 = move-exception
            r4 = r5
            goto L_0x00cb
        L_0x0047:
            r6 = move-exception
            goto L_0x004f
        L_0x0049:
            r11 = move-exception
            goto L_0x00cb
        L_0x004c:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L_0x004f:
            java.lang.String r7 = "AppCompatSpinner"
            java.lang.String r8 = "Could not read android:spinnerMode"
            android.util.Log.i(r7, r8, r6)     // Catch:{ all -> 0x0043 }
            if (r5 == 0) goto L_0x005b
        L_0x0058:
            r5.recycle()
        L_0x005b:
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0093
            if (r3 == r6) goto L_0x0062
            goto L_0x00a0
        L_0x0062:
            androidx.appcompat.widget.z$d r3 = new androidx.appcompat.widget.z$d
            android.content.Context r7 = r10.f736p
            r3.<init>(r7, r12, r13)
            android.content.Context r7 = r10.f736p
            androidx.appcompat.widget.e1 r0 = androidx.appcompat.widget.e1.m(r7, r12, r0, r13)
            android.content.res.TypedArray r7 = r0.f551b
            r8 = 3
            r9 = -2
            int r7 = r7.getLayoutDimension(r8, r9)
            r10.u = r7
            android.graphics.drawable.Drawable r7 = r0.e(r6)
            r3.i(r7)
            java.lang.String r5 = r2.getString(r5)
            r3.P = r5
            r0.n()
            r10.f740t = r3
            androidx.appcompat.widget.y r0 = new androidx.appcompat.widget.y
            r0.<init>(r10, r10, r3)
            r10.f737q = r0
            goto L_0x00a0
        L_0x0093:
            androidx.appcompat.widget.z$b r0 = new androidx.appcompat.widget.z$b
            r0.<init>()
            r10.f740t = r0
            java.lang.String r3 = r2.getString(r5)
            r0.f745q = r3
        L_0x00a0:
            java.lang.CharSequence[] r0 = r2.getTextArray(r1)
            if (r0 == 0) goto L_0x00b7
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r11, r3, r0)
            r11 = 2131558522(0x7f0d007a, float:1.8742362E38)
            r1.setDropDownViewResource(r11)
            r10.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00b7:
            r2.recycle()
            r10.f739s = r6
            android.widget.SpinnerAdapter r11 = r10.f738r
            if (r11 == 0) goto L_0x00c5
            r10.setAdapter((android.widget.SpinnerAdapter) r11)
            r10.f738r = r4
        L_0x00c5:
            androidx.appcompat.widget.e r11 = r10.f735o
            r11.d(r12, r13)
            return
        L_0x00cb:
            if (r4 == 0) goto L_0x00d0
            r4.recycle()
        L_0x00d0:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.z.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i11;
        }
        Rect rect = this.f741v;
        drawable.getPadding(rect);
        return i11 + rect.left + rect.right;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f735o;
        if (eVar != null) {
            eVar.a();
        }
    }

    public int getDropDownHorizontalOffset() {
        f fVar = this.f740t;
        return fVar != null ? fVar.d() : super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        f fVar = this.f740t;
        return fVar != null ? fVar.n() : super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        return this.f740t != null ? this.u : super.getDropDownWidth();
    }

    public final f getInternalPopup() {
        return this.f740t;
    }

    public Drawable getPopupBackground() {
        f fVar = this.f740t;
        return fVar != null ? fVar.f() : super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f736p;
    }

    public CharSequence getPrompt() {
        f fVar = this.f740t;
        return fVar != null ? fVar.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f735o;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f735o;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.f740t;
        if (fVar != null && fVar.c()) {
            fVar.dismiss();
        }
    }

    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f740t != null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        if (eVar.f753o && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new a());
        }
    }

    public final Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        f fVar = this.f740t;
        eVar.f753o = fVar != null && fVar.c();
        return eVar;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        y yVar = this.f737q;
        if (yVar == null || !yVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final boolean performClick() {
        f fVar = this.f740t;
        if (fVar == null) {
            return super.performClick();
        }
        if (fVar.c()) {
            return true;
        }
        fVar.m(getTextDirection(), getTextAlignment());
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f739s) {
            this.f738r = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        f fVar = this.f740t;
        if (fVar != null) {
            Context context = this.f736p;
            if (context == null) {
                context = getContext();
            }
            fVar.p(new c(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f735o;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f735o;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    public void setDropDownHorizontalOffset(int i10) {
        f fVar = this.f740t;
        if (fVar != null) {
            fVar.k(i10);
            fVar.l(i10);
            return;
        }
        super.setDropDownHorizontalOffset(i10);
    }

    public void setDropDownVerticalOffset(int i10) {
        f fVar = this.f740t;
        if (fVar != null) {
            fVar.j(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    public void setDropDownWidth(int i10) {
        if (this.f740t != null) {
            this.u = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        f fVar = this.f740t;
        if (fVar != null) {
            fVar.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(f.a.b(getPopupContext(), i10));
    }

    public void setPrompt(CharSequence charSequence) {
        f fVar = this.f740t;
        if (fVar != null) {
            fVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f735o;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f735o;
        if (eVar != null) {
            eVar.i(mode);
        }
    }
}

package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.e1;
import androidx.databinding.a;
import com.karumi.dexter.R;
import i0.b0;
import i0.w;
import java.util.WeakHashMap;

public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {
    public boolean A;
    public final Drawable B;
    public final boolean C;
    public LayoutInflater D;
    public boolean E;

    /* renamed from: o  reason: collision with root package name */
    public h f265o;

    /* renamed from: p  reason: collision with root package name */
    public ImageView f266p;

    /* renamed from: q  reason: collision with root package name */
    public RadioButton f267q;

    /* renamed from: r  reason: collision with root package name */
    public TextView f268r;

    /* renamed from: s  reason: collision with root package name */
    public CheckBox f269s;

    /* renamed from: t  reason: collision with root package name */
    public TextView f270t;
    public ImageView u;

    /* renamed from: v  reason: collision with root package name */
    public ImageView f271v;
    public LinearLayout w;

    /* renamed from: x  reason: collision with root package name */
    public final Drawable f272x;

    /* renamed from: y  reason: collision with root package name */
    public final int f273y;
    public final Context z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e1 m10 = e1.m(getContext(), attributeSet, a.Q, R.attr.listMenuViewStyle);
        this.f272x = m10.e(5);
        this.f273y = m10.i(1, -1);
        this.A = m10.a(7, false);
        this.z = context;
        this.B = m10.e(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.C = obtainStyledAttributes.hasValue(0);
        m10.n();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.D == null) {
            this.D = LayoutInflater.from(getContext());
        }
        return this.D;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.u;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f271v;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f271v.getLayoutParams();
            rect.top = this.f271v.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        if (r0 == false) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.appcompat.view.menu.h r11) {
        /*
            r10 = this;
            r10.f265o = r11
            boolean r0 = r11.isVisible()
            r1 = 0
            r2 = 8
            if (r0 == 0) goto L_0x000d
            r0 = r1
            goto L_0x000e
        L_0x000d:
            r0 = r2
        L_0x000e:
            r10.setVisibility(r0)
            java.lang.CharSequence r0 = r11.f340e
            r10.setTitle(r0)
            boolean r0 = r11.isCheckable()
            r10.setCheckable(r0)
            androidx.appcompat.view.menu.f r0 = r11.f348n
            boolean r3 = r0.o()
            r4 = 1
            if (r3 == 0) goto L_0x0035
            boolean r3 = r0.n()
            if (r3 == 0) goto L_0x002f
            char r3 = r11.f345j
            goto L_0x0031
        L_0x002f:
            char r3 = r11.f343h
        L_0x0031:
            if (r3 == 0) goto L_0x0035
            r3 = r4
            goto L_0x0036
        L_0x0035:
            r3 = r1
        L_0x0036:
            r0.n()
            if (r3 == 0) goto L_0x0058
            androidx.appcompat.view.menu.h r0 = r10.f265o
            androidx.appcompat.view.menu.f r3 = r0.f348n
            boolean r5 = r3.o()
            if (r5 == 0) goto L_0x0054
            boolean r3 = r3.n()
            if (r3 == 0) goto L_0x004e
            char r0 = r0.f345j
            goto L_0x0050
        L_0x004e:
            char r0 = r0.f343h
        L_0x0050:
            if (r0 == 0) goto L_0x0054
            r0 = r4
            goto L_0x0055
        L_0x0054:
            r0 = r1
        L_0x0055:
            if (r0 == 0) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r1 = r2
        L_0x0059:
            if (r1 != 0) goto L_0x0109
            android.widget.TextView r0 = r10.f270t
            androidx.appcompat.view.menu.h r3 = r10.f265o
            androidx.appcompat.view.menu.f r5 = r3.f348n
            boolean r5 = r5.n()
            if (r5 == 0) goto L_0x006a
            char r5 = r3.f345j
            goto L_0x006c
        L_0x006a:
            char r5 = r3.f343h
        L_0x006c:
            if (r5 != 0) goto L_0x0072
            java.lang.String r2 = ""
            goto L_0x0106
        L_0x0072:
            androidx.appcompat.view.menu.f r6 = r3.f348n
            android.content.Context r7 = r6.f314a
            android.content.res.Resources r7 = r7.getResources()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            android.content.Context r9 = r6.f314a
            android.view.ViewConfiguration r9 = android.view.ViewConfiguration.get(r9)
            boolean r9 = r9.hasPermanentMenuKey()
            if (r9 == 0) goto L_0x0095
            r9 = 2131886097(0x7f120011, float:1.9406763E38)
            java.lang.String r9 = r7.getString(r9)
            r8.append(r9)
        L_0x0095:
            boolean r6 = r6.n()
            if (r6 == 0) goto L_0x009e
            int r3 = r3.f346k
            goto L_0x00a0
        L_0x009e:
            int r3 = r3.f344i
        L_0x00a0:
            r6 = 2131886093(0x7f12000d, float:1.9406755E38)
            java.lang.String r6 = r7.getString(r6)
            r9 = 65536(0x10000, float:9.18355E-41)
            androidx.appcompat.view.menu.h.c(r8, r3, r9, r6)
            r6 = 2131886089(0x7f120009, float:1.9406747E38)
            java.lang.String r6 = r7.getString(r6)
            r9 = 4096(0x1000, float:5.74E-42)
            androidx.appcompat.view.menu.h.c(r8, r3, r9, r6)
            r6 = 2131886088(0x7f120008, float:1.9406745E38)
            java.lang.String r6 = r7.getString(r6)
            r9 = 2
            androidx.appcompat.view.menu.h.c(r8, r3, r9, r6)
            r6 = 2131886094(0x7f12000e, float:1.9406757E38)
            java.lang.String r6 = r7.getString(r6)
            androidx.appcompat.view.menu.h.c(r8, r3, r4, r6)
            r4 = 2131886096(0x7f120010, float:1.9406761E38)
            java.lang.String r4 = r7.getString(r4)
            r6 = 4
            androidx.appcompat.view.menu.h.c(r8, r3, r6, r4)
            r4 = 2131886092(0x7f12000c, float:1.9406753E38)
            java.lang.String r4 = r7.getString(r4)
            androidx.appcompat.view.menu.h.c(r8, r3, r2, r4)
            if (r5 == r2) goto L_0x00f8
            r2 = 10
            if (r5 == r2) goto L_0x00f4
            r2 = 32
            if (r5 == r2) goto L_0x00f0
            r8.append(r5)
            goto L_0x0102
        L_0x00f0:
            r2 = 2131886095(0x7f12000f, float:1.940676E38)
            goto L_0x00fb
        L_0x00f4:
            r2 = 2131886091(0x7f12000b, float:1.9406751E38)
            goto L_0x00fb
        L_0x00f8:
            r2 = 2131886090(0x7f12000a, float:1.940675E38)
        L_0x00fb:
            java.lang.String r2 = r7.getString(r2)
            r8.append(r2)
        L_0x0102:
            java.lang.String r2 = r8.toString()
        L_0x0106:
            r0.setText(r2)
        L_0x0109:
            android.widget.TextView r0 = r10.f270t
            int r0 = r0.getVisibility()
            if (r0 == r1) goto L_0x0116
            android.widget.TextView r0 = r10.f270t
            r0.setVisibility(r1)
        L_0x0116:
            android.graphics.drawable.Drawable r0 = r11.getIcon()
            r10.setIcon(r0)
            boolean r0 = r11.isEnabled()
            r10.setEnabled(r0)
            boolean r0 = r11.hasSubMenu()
            r10.setSubMenuArrowVisible(r0)
            java.lang.CharSequence r11 = r11.f351q
            r10.setContentDescription(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.c(androidx.appcompat.view.menu.h):void");
    }

    public h getItemData() {
        return this.f265o;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        w.d.q(this, this.f272x);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f268r = textView;
        int i10 = this.f273y;
        if (i10 != -1) {
            textView.setTextAppearance(this.z, i10);
        }
        this.f270t = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.u = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.B);
        }
        this.f271v = (ImageView) findViewById(R.id.group_divider);
        this.w = (LinearLayout) findViewById(R.id.content);
    }

    public final void onMeasure(int i10, int i11) {
        if (this.f266p != null && this.A) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f266p.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        boolean z11;
        View view;
        CompoundButton compoundButton;
        if (z10 || this.f267q != null || this.f269s != null) {
            if ((this.f265o.f356x & 4) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (this.f267q == null) {
                    RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
                    this.f267q = radioButton;
                    LinearLayout linearLayout = this.w;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.f267q;
                view = this.f269s;
            } else {
                if (this.f269s == null) {
                    CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
                    this.f269s = checkBox;
                    LinearLayout linearLayout2 = this.w;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.f269s;
                view = this.f267q;
            }
            if (z10) {
                compoundButton.setChecked(this.f265o.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox2 = this.f269s;
            if (checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.f267q;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z10) {
        boolean z11;
        CompoundButton compoundButton;
        if ((this.f265o.f356x & 4) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (this.f267q == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
                this.f267q = radioButton;
                LinearLayout linearLayout = this.w;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f267q;
        } else {
            if (this.f269s == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
                this.f269s = checkBox;
                LinearLayout linearLayout2 = this.w;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f269s;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.E = z10;
        this.A = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f271v;
        if (imageView != null) {
            imageView.setVisibility((this.C || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f265o.f348n.getClass();
        boolean z10 = this.E;
        if (z10 || this.A) {
            ImageView imageView = this.f266p;
            if (imageView != null || drawable != null || this.A) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, this, false);
                    this.f266p = imageView2;
                    LinearLayout linearLayout = this.w;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.A) {
                    ImageView imageView3 = this.f266p;
                    if (!z10) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.f266p.getVisibility() != 0) {
                        this.f266p.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f266p.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i10;
        if (charSequence != null) {
            this.f268r.setText(charSequence);
            if (this.f268r.getVisibility() != 0) {
                textView = this.f268r;
                i10 = 0;
            } else {
                return;
            }
        } else {
            i10 = 8;
            if (this.f268r.getVisibility() != 8) {
                textView = this.f268r;
            } else {
                return;
            }
        }
        textView.setVisibility(i10);
    }
}

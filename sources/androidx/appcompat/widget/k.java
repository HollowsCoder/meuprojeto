package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.appcompat.widget.t0;
import com.karumi.dexter.R;

public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f618b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static k f619c;

    /* renamed from: a  reason: collision with root package name */
    public t0 f620a;

    public class a implements t0.b {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f621a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b  reason: collision with root package name */
        public final int[] f622b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c  reason: collision with root package name */
        public final int[] f623c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        public final int[] d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e  reason: collision with root package name */
        public final int[] f624e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* renamed from: f  reason: collision with root package name */
        public final int[] f625f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(Context context, int i10) {
            int c10 = z0.c(context, R.attr.colorControlHighlight);
            int b10 = z0.b(context, R.attr.colorButtonNormal);
            return new ColorStateList(new int[][]{z0.f755b, z0.d, z0.f756c, z0.f758f}, new int[]{b10, b0.a.b(c10, i10), b0.a.b(c10, i10), i10});
        }

        public static void d(Drawable drawable, int i10, PorterDuff.Mode mode) {
            if (k0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = k.f618b;
            }
            drawable.setColorFilter(k.c(i10, mode));
        }

        public final ColorStateList c(Context context, int i10) {
            if (i10 == R.drawable.abc_edit_text_material) {
                return f.a.a(context, R.color.abc_tint_edittext);
            }
            if (i10 == R.drawable.abc_switch_track_mtrl_alpha) {
                return f.a.a(context, R.color.abc_tint_switch_track);
            }
            if (i10 == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                ColorStateList d10 = z0.d(context, R.attr.colorSwitchThumbNormal);
                if (d10 == null || !d10.isStateful()) {
                    iArr[0] = z0.f755b;
                    iArr2[0] = z0.b(context, R.attr.colorSwitchThumbNormal);
                    iArr[1] = z0.f757e;
                    iArr2[1] = z0.c(context, R.attr.colorControlActivated);
                    iArr[2] = z0.f758f;
                    iArr2[2] = z0.c(context, R.attr.colorSwitchThumbNormal);
                } else {
                    int[] iArr3 = z0.f755b;
                    iArr[0] = iArr3;
                    iArr2[0] = d10.getColorForState(iArr3, 0);
                    iArr[1] = z0.f757e;
                    iArr2[1] = z0.c(context, R.attr.colorControlActivated);
                    iArr[2] = z0.f758f;
                    iArr2[2] = d10.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, z0.c(context, R.attr.colorButtonNormal));
            } else {
                if (i10 == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i10 == R.drawable.abc_btn_colored_material) {
                    return b(context, z0.c(context, R.attr.colorAccent));
                }
                if (i10 == R.drawable.abc_spinner_mtrl_am_alpha || i10 == R.drawable.abc_spinner_textfield_background_material) {
                    return f.a.a(context, R.color.abc_tint_spinner);
                }
                if (a(this.f622b, i10)) {
                    return z0.d(context, R.attr.colorControlNormal);
                }
                if (a(this.f624e, i10)) {
                    return f.a.a(context, R.color.abc_tint_default);
                }
                if (a(this.f625f, i10)) {
                    return f.a.a(context, R.color.abc_tint_btn_checkable);
                }
                if (i10 == R.drawable.abc_seekbar_thumb_material) {
                    return f.a.a(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
        }
    }

    public static synchronized k a() {
        k kVar;
        synchronized (k.class) {
            if (f619c == null) {
                d();
            }
            kVar = f619c;
        }
        return kVar;
    }

    public static synchronized PorterDuffColorFilter c(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter g10;
        synchronized (k.class) {
            g10 = t0.g(i10, mode);
        }
        return g10;
    }

    public static synchronized void d() {
        synchronized (k.class) {
            if (f619c == null) {
                k kVar = new k();
                f619c = kVar;
                kVar.f620a = t0.c();
                t0 t0Var = f619c.f620a;
                a aVar = new a();
                synchronized (t0Var) {
                    t0Var.f713e = aVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, c1 c1Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = t0.f707f;
        if (!k0.a(drawable) || drawable.mutate() == drawable) {
            boolean z = c1Var.d;
            if (z || c1Var.f523c) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z) {
                    colorStateList = c1Var.f521a;
                } else {
                    colorStateList = null;
                }
                if (c1Var.f523c) {
                    mode = c1Var.f522b;
                } else {
                    mode = t0.f707f;
                }
                if (!(colorStateList == null || mode == null)) {
                    porterDuffColorFilter = t0.g(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
                return;
            }
            drawable.clearColorFilter();
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public final synchronized Drawable b(Context context, int i10) {
        return this.f620a.f(context, i10);
    }
}

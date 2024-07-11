package androidx.databinding;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.f0;
import com.google.android.gms.internal.clearcut.k;
import com.google.android.gms.internal.clearcut.n2;
import com.google.android.gms.internal.clearcut.o2;
import com.google.android.gms.internal.clearcut.s3;
import com.google.android.gms.internal.measurement.f;
import com.google.android.gms.internal.measurement.i;
import com.google.android.gms.internal.measurement.i3;
import com.google.android.gms.internal.measurement.j9;
import com.google.android.gms.internal.measurement.k5;
import com.google.android.gms.internal.measurement.m;
import com.google.android.gms.internal.measurement.o;
import com.google.android.gms.internal.measurement.r;
import com.google.android.gms.internal.measurement.r4;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.s4;
import com.google.android.gms.internal.measurement.t4;
import com.google.android.gms.internal.measurement.z;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.R;
import d7.j0;
import g9.b0;
import h5.d;
import h5.r2;
import h5.s2;
import h5.u2;
import i0.c0;
import i9.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import m5.h;
import m5.l;
import m7.c;
import y6.e;
import z8.g;

public class a implements m5.a, e, q3.e, k, h, d, r2, c0, b, kotlinx.coroutines.scheduling.h, c {
    public static final int[] A = {16842931};
    public static final int[] B = {16843071};
    public static final int[] C = {R.attr.background, R.attr.backgroundSplit, R.attr.closeItemLayout, R.attr.height, R.attr.subtitleTextStyle, R.attr.titleTextStyle};
    public static final int[] D = {16842994, R.attr.buttonIconDimen, R.attr.buttonPanelSideLayout, R.attr.listItemLayout, R.attr.listLayout, R.attr.multiChoiceItemLayout, R.attr.showTitle, R.attr.singleChoiceItemLayout};
    public static final int[] E = {16843033, R.attr.srcCompat, R.attr.tint, R.attr.tintMode};
    public static final int[] F = {16843074, R.attr.tickMark, R.attr.tickMarkTint, R.attr.tickMarkTintMode};
    public static final int[] G = {16842804, 16843117, 16843118, 16843119, 16843120, 16843666, 16843667};
    public static final int[] H = {16842804, R.attr.autoSizeMaxTextSize, R.attr.autoSizeMinTextSize, R.attr.autoSizePresetSizes, R.attr.autoSizeStepGranularity, R.attr.autoSizeTextType, R.attr.drawableBottomCompat, R.attr.drawableEndCompat, R.attr.drawableLeftCompat, R.attr.drawableRightCompat, R.attr.drawableStartCompat, R.attr.drawableTint, R.attr.drawableTintMode, R.attr.drawableTopCompat, R.attr.emojiCompatEnabled, R.attr.firstBaselineToTopHeight, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.lastBaselineToBottomHeight, R.attr.lineHeight, R.attr.textAllCaps, R.attr.textLocale};
    public static final int[] I = {16842839, 16842926, R.attr.actionBarDivider, R.attr.actionBarItemBackground, R.attr.actionBarPopupTheme, R.attr.actionBarSize, R.attr.actionBarSplitStyle, R.attr.actionBarStyle, R.attr.actionBarTabBarStyle, R.attr.actionBarTabStyle, R.attr.actionBarTabTextStyle, R.attr.actionBarTheme, R.attr.actionBarWidgetTheme, R.attr.actionButtonStyle, R.attr.actionDropDownStyle, R.attr.actionMenuTextAppearance, R.attr.actionMenuTextColor, R.attr.actionModeBackground, R.attr.actionModeCloseButtonStyle, R.attr.actionModeCloseContentDescription, R.attr.actionModeCloseDrawable, R.attr.actionModeCopyDrawable, R.attr.actionModeCutDrawable, R.attr.actionModeFindDrawable, R.attr.actionModePasteDrawable, R.attr.actionModePopupWindowStyle, R.attr.actionModeSelectAllDrawable, R.attr.actionModeShareDrawable, R.attr.actionModeSplitBackground, R.attr.actionModeStyle, R.attr.actionModeTheme, R.attr.actionModeWebSearchDrawable, R.attr.actionOverflowButtonStyle, R.attr.actionOverflowMenuStyle, R.attr.activityChooserViewStyle, R.attr.alertDialogButtonGroupStyle, R.attr.alertDialogCenterButtons, R.attr.alertDialogStyle, R.attr.alertDialogTheme, R.attr.autoCompleteTextViewStyle, R.attr.borderlessButtonStyle, R.attr.buttonBarButtonStyle, R.attr.buttonBarNegativeButtonStyle, R.attr.buttonBarNeutralButtonStyle, R.attr.buttonBarPositiveButtonStyle, R.attr.buttonBarStyle, R.attr.buttonStyle, R.attr.buttonStyleSmall, R.attr.checkboxStyle, R.attr.checkedTextViewStyle, R.attr.colorAccent, R.attr.colorBackgroundFloating, R.attr.colorButtonNormal, R.attr.colorControlActivated, R.attr.colorControlHighlight, R.attr.colorControlNormal, R.attr.colorError, R.attr.colorPrimary, R.attr.colorPrimaryDark, R.attr.colorSwitchThumbNormal, R.attr.controlBackground, R.attr.dialogCornerRadius, R.attr.dialogPreferredPadding, R.attr.dialogTheme, R.attr.dividerHorizontal, R.attr.dividerVertical, R.attr.dropDownListViewStyle, R.attr.dropdownListPreferredItemHeight, R.attr.editTextBackground, R.attr.editTextColor, R.attr.editTextStyle, R.attr.homeAsUpIndicator, R.attr.imageButtonStyle, R.attr.listChoiceBackgroundIndicator, R.attr.listChoiceIndicatorMultipleAnimated, R.attr.listChoiceIndicatorSingleAnimated, R.attr.listDividerAlertDialog, R.attr.listMenuViewStyle, R.attr.listPopupWindowStyle, R.attr.listPreferredItemHeight, R.attr.listPreferredItemHeightLarge, R.attr.listPreferredItemHeightSmall, R.attr.listPreferredItemPaddingEnd, R.attr.listPreferredItemPaddingLeft, R.attr.listPreferredItemPaddingRight, R.attr.listPreferredItemPaddingStart, R.attr.panelBackground, R.attr.panelMenuListTheme, R.attr.panelMenuListWidth, R.attr.popupMenuStyle, R.attr.popupWindowStyle, R.attr.radioButtonStyle, R.attr.ratingBarStyle, R.attr.ratingBarStyleIndicator, R.attr.ratingBarStyleSmall, R.attr.searchViewStyle, R.attr.seekBarStyle, R.attr.selectableItemBackground, R.attr.selectableItemBackgroundBorderless, R.attr.spinnerDropDownItemStyle, R.attr.spinnerStyle, R.attr.switchStyle, R.attr.textAppearanceLargePopupMenu, R.attr.textAppearanceListItem, R.attr.textAppearanceListItemSecondary, R.attr.textAppearanceListItemSmall, R.attr.textAppearancePopupMenuHeader, R.attr.textAppearanceSearchResultSubtitle, R.attr.textAppearanceSearchResultTitle, R.attr.textAppearanceSmallPopupMenu, R.attr.textColorAlertDialogListItem, R.attr.textColorSearchUrl, R.attr.toolbarNavigationButtonStyle, R.attr.toolbarStyle, R.attr.tooltipForegroundColor, R.attr.tooltipFrameBackground, R.attr.viewInflaterClass, R.attr.windowActionBar, R.attr.windowActionBarOverlay, R.attr.windowActionModeOverlay, R.attr.windowFixedHeightMajor, R.attr.windowFixedHeightMinor, R.attr.windowFixedWidthMajor, R.attr.windowFixedWidthMinor, R.attr.windowMinWidthMajor, R.attr.windowMinWidthMinor, R.attr.windowNoTitle};
    public static final int[] J = {R.attr.allowStacking};
    public static final int[] K = {16843016, R.attr.checkMarkCompat, R.attr.checkMarkTint, R.attr.checkMarkTintMode};
    public static final int[] L = {16843015, R.attr.buttonCompat, R.attr.buttonTint, R.attr.buttonTintMode};
    public static final int[] M = {16842927, 16842948, 16843046, 16843047, 16843048, R.attr.divider, R.attr.dividerPadding, R.attr.measureWithLargestChild, R.attr.showDividers};
    public static final int[] N = {16843436, 16843437};
    public static final int[] O = {16842766, 16842960, 16843156, 16843230, 16843231, 16843232};
    public static final int[] P = {16842754, 16842766, 16842960, 16843014, 16843156, 16843230, 16843231, 16843233, 16843234, 16843235, 16843236, 16843237, 16843375, R.attr.actionLayout, R.attr.actionProviderClass, R.attr.actionViewClass, R.attr.alphabeticModifiers, R.attr.contentDescription, R.attr.iconTint, R.attr.iconTintMode, R.attr.numericModifiers, R.attr.showAsAction, R.attr.tooltipText};
    public static final int[] Q = {16842926, 16843052, 16843053, 16843054, 16843055, 16843056, 16843057, R.attr.preserveIconSpacing, R.attr.subMenuArrow};
    public static final int[] R = {16843126, 16843465, R.attr.overlapAnchor};
    public static final int[] S = {R.attr.paddingBottomNoButtons, R.attr.paddingTopNoTitle};
    public static final int[] T = {16842970, 16843039, 16843296, 16843364, R.attr.closeIcon, R.attr.commitIcon, R.attr.defaultQueryHint, R.attr.goIcon, R.attr.iconifiedByDefault, R.attr.layout, R.attr.queryBackground, R.attr.queryHint, R.attr.searchHintIcon, R.attr.searchIcon, R.attr.submitBackground, R.attr.suggestionRowLayout, R.attr.voiceIcon};
    public static final int[] U = {16842930, 16843126, 16843131, 16843362, R.attr.popupTheme};
    public static final int[] V = {16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16844165, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};
    public static final int[] W = {16842927, 16843072, R.attr.buttonGravity, R.attr.collapseContentDescription, R.attr.collapseIcon, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.logo, R.attr.logoDescription, R.attr.maxButtonHeight, R.attr.menu, R.attr.navigationContentDescription, R.attr.navigationIcon, R.attr.popupTheme, R.attr.subtitle, R.attr.subtitleTextAppearance, R.attr.subtitleTextColor, R.attr.title, R.attr.titleMargin, R.attr.titleMarginBottom, R.attr.titleMarginEnd, R.attr.titleMarginStart, R.attr.titleMarginTop, R.attr.titleMargins, R.attr.titleTextAppearance, R.attr.titleTextColor};
    public static final int[] X = {16842752, 16842970, R.attr.paddingEnd, R.attr.paddingStart, R.attr.theme};
    public static final int[] Y = {16842964, R.attr.backgroundTint, R.attr.backgroundTintMode};
    public static final int[] Z = {16842960, 16842994, 16842995};

    /* renamed from: a0  reason: collision with root package name */
    public static final int[] f998a0 = {16842948};

    /* renamed from: b0  reason: collision with root package name */
    public static final j0 f999b0 = new j0("REMOVED_TASK");

    /* renamed from: c0  reason: collision with root package name */
    public static final j0 f1000c0 = new j0("CLOSED_EMPTY");

    /* renamed from: d0  reason: collision with root package name */
    public static final j0 f1001d0 = new j0("COMPLETING_ALREADY");

    /* renamed from: e0  reason: collision with root package name */
    public static final j0 f1002e0 = new j0("COMPLETING_WAITING_CHILDREN");

    /* renamed from: f0  reason: collision with root package name */
    public static final j0 f1003f0 = new j0("COMPLETING_RETRY");

    /* renamed from: g0  reason: collision with root package name */
    public static final j0 f1004g0 = new j0("TOO_LATE_TO_CANCEL");

    /* renamed from: h0  reason: collision with root package name */
    public static final j0 f1005h0 = new j0("SEALED");

    /* renamed from: i0  reason: collision with root package name */
    public static final b0 f1006i0 = new b0(false);

    /* renamed from: j0  reason: collision with root package name */
    public static final b0 f1007j0 = new b0(true);

    /* renamed from: k0  reason: collision with root package name */
    public static int f1008k0;

    /* renamed from: l0  reason: collision with root package name */
    public static volatile q1.e f1009l0;

    /* renamed from: m0  reason: collision with root package name */
    public static volatile q1.d f1010m0;

    /* renamed from: n0  reason: collision with root package name */
    public static final int[] f1011n0 = {R.attr.lottie_autoPlay, R.attr.lottie_cacheComposition, R.attr.lottie_colorFilter, R.attr.lottie_enableMergePathsForKitKatAndAbove, R.attr.lottie_fallbackRes, R.attr.lottie_fileName, R.attr.lottie_ignoreDisabledSystemAnimations, R.attr.lottie_imageAssetsFolder, R.attr.lottie_loop, R.attr.lottie_progress, R.attr.lottie_rawRes, R.attr.lottie_renderMode, R.attr.lottie_repeatCount, R.attr.lottie_repeatMode, R.attr.lottie_scale, R.attr.lottie_speed, R.attr.lottie_url};

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f1012o = {16842755, R.attr.action, R.attr.data, R.attr.dataPattern, R.attr.targetPackage};

    /* renamed from: o0  reason: collision with root package name */
    public static final a f1013o0 = new a();

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f1014p = {R.attr.navGraph};

    /* renamed from: p0  reason: collision with root package name */
    public static final a f1015p0 = new a();

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f1016q = {R.attr.graph};

    /* renamed from: q0  reason: collision with root package name */
    public static final String[] f1017q0 = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ a f1018r = new a();

    /* renamed from: r0  reason: collision with root package name */
    public static final String[] f1019r0 = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ a f1020s = new a();

    /* renamed from: s0  reason: collision with root package name */
    public static final String[] f1021s0 = {"items"};

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ a f1022t = new a();
    public static final String[] t0 = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};
    public static Field u;

    /* renamed from: u0  reason: collision with root package name */
    public static final j0 f1023u0 = new j0("UNDEFINED");

    /* renamed from: v  reason: collision with root package name */
    public static boolean f1024v;

    /* renamed from: v0  reason: collision with root package name */
    public static final j0 f1025v0 = new j0("REUSABLE_CLAIMED");
    public static final n2 w = new n2();

    /* renamed from: w0  reason: collision with root package name */
    public static final j0 f1026w0 = new j0("CONDITION_FALSE");

    /* renamed from: x  reason: collision with root package name */
    public static final o2 f1027x = new o2();
    public static final a x0 = new a();

    /* renamed from: y  reason: collision with root package name */
    public static final a f1028y = new a();
    public static final int[] y0 = {16843071, 16843072, R.attr.cardBackgroundColor, R.attr.cardCornerRadius, R.attr.cardElevation, R.attr.cardMaxElevation, R.attr.cardPreventCornerOverlap, R.attr.cardUseCompatPadding, R.attr.contentPadding, R.attr.contentPaddingBottom, R.attr.contentPaddingLeft, R.attr.contentPaddingRight, R.attr.contentPaddingTop};
    public static final int[] z = {R.attr.background, R.attr.backgroundSplit, R.attr.backgroundStacked, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.customNavigationLayout, R.attr.displayOptions, R.attr.divider, R.attr.elevation, R.attr.height, R.attr.hideOnContentScroll, R.attr.homeAsUpIndicator, R.attr.homeLayout, R.attr.icon, R.attr.indeterminateProgressStyle, R.attr.itemPadding, R.attr.logo, R.attr.navigationMode, R.attr.popupTheme, R.attr.progressBarPadding, R.attr.progressBarStyle, R.attr.subtitle, R.attr.subtitleTextStyle, R.attr.title, R.attr.titleTextStyle};

    public static void A(String str, int i10, List list) {
        if (list.size() != i10) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", new Object[]{str, Integer.valueOf(i10), Integer.valueOf(list.size())}));
        }
    }

    public static void B(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        if (obj == null) {
            return;
        }
        if (obj instanceof s3) {
            int length = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(S(str));
                stringBuffer2.append(" <\n");
                stringBuffer.append("  ");
            }
            Class<?> cls = obj.getClass();
            for (Field field : cls.getFields()) {
                int modifiers = field.getModifiers();
                String name = field.getName();
                if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                    Class<?> type = field.getType();
                    Object obj2 = field.get(obj);
                    if (!type.isArray() || type.getComponentType() == Byte.TYPE) {
                        B(name, obj2, stringBuffer, stringBuffer2);
                    } else {
                        int length2 = obj2 == null ? 0 : Array.getLength(obj2);
                        for (int i10 = 0; i10 < length2; i10++) {
                            B(name, Array.get(obj2, i10), stringBuffer, stringBuffer2);
                        }
                    }
                }
            }
            for (Method name2 : cls.getMethods()) {
                String name3 = name2.getName();
                if (name3.startsWith("set")) {
                    String substring = name3.substring(3);
                    try {
                        String valueOf = String.valueOf(substring);
                        if (((Boolean) cls.getMethod(valueOf.length() != 0 ? "has".concat(valueOf) : new String("has"), new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                            String valueOf2 = String.valueOf(substring);
                            B(substring, cls.getMethod(valueOf2.length() != 0 ? "get".concat(valueOf2) : new String("get"), new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
            }
            if (str != null) {
                stringBuffer.setLength(length);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
                return;
            }
            return;
        }
        String S2 = S(str);
        stringBuffer2.append(stringBuffer);
        stringBuffer2.append(S2);
        stringBuffer2.append(": ");
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (!str2.startsWith("http") && str2.length() > 200) {
                str2 = String.valueOf(str2.substring(0, 200)).concat("[...]");
            }
            int length3 = str2.length();
            StringBuilder sb = new StringBuilder(length3);
            for (int i11 = 0; i11 < length3; i11++) {
                char charAt = str2.charAt(i11);
                if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                    sb.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                } else {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            stringBuffer2.append("\"");
            stringBuffer2.append(sb2);
            stringBuffer2.append("\"");
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            stringBuffer2.append('\"');
            for (byte b10 : bArr) {
                byte b11 = b10 & 255;
                if (b11 == 92 || b11 == 34) {
                    stringBuffer2.append('\\');
                } else if (b11 < 32 || b11 >= Byte.MAX_VALUE) {
                    stringBuffer2.append(String.format("\\%03o", new Object[]{Integer.valueOf(b11)}));
                }
                stringBuffer2.append((char) b11);
            }
            stringBuffer2.append('\"');
        } else {
            stringBuffer2.append(obj);
        }
        stringBuffer2.append("\n");
    }

    public static void C(byte[] bArr, int i10, long j8, long j10, long[] jArr) {
        long E2 = E(i10, bArr);
        long E3 = E(i10 + 8, bArr);
        long E4 = E(i10 + 16, bArr);
        long E5 = E(i10 + 24, bArr);
        long j11 = j8 + E2;
        long rotateRight = Long.rotateRight(j10 + j11 + E5, 21);
        long j12 = E3 + j11 + E4;
        jArr[0] = j12 + E5;
        jArr[1] = Long.rotateRight(j12, 44) + rotateRight + j11;
    }

    public static int D(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long E(int i10, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i10, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }

    public static Object F(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[]{str, cls.getCanonicalName(), obj2.getClass().getCanonicalName()}));
    }

    public static void G(String str, int i10, List list) {
        if (list.size() < i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", new Object[]{str, Integer.valueOf(i10), Integer.valueOf(list.size())}));
        }
    }

    public static long H(long j8) {
        return (-(j8 & 1)) ^ (j8 >>> 1);
    }

    public static void I(String str, int i10, ArrayList arrayList) {
        if (arrayList.size() > i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", new Object[]{str, Integer.valueOf(i10), Integer.valueOf(arrayList.size())}));
        }
    }

    public static boolean J(o oVar) {
        if (oVar == null) {
            return false;
        }
        Double b10 = oVar.b();
        return !b10.isNaN() && b10.doubleValue() >= 0.0d && b10.equals(Double.valueOf(Math.floor(b10.doubleValue())));
    }

    public static z K(String str) {
        z zVar = null;
        if (str != null && !str.isEmpty()) {
            zVar = z.zza(Integer.parseInt(str));
        }
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", new Object[]{str}));
    }

    public static boolean L(byte b10) {
        return b10 > -65;
    }

    public static boolean M(o oVar, o oVar2) {
        if (!oVar.getClass().equals(oVar2.getClass())) {
            return false;
        }
        if ((oVar instanceof s) || (oVar instanceof m)) {
            return true;
        }
        if (!(oVar instanceof com.google.android.gms.internal.measurement.h)) {
            return oVar instanceof r ? oVar.zzc().equals(oVar2.zzc()) : oVar instanceof f ? oVar.c().equals(oVar2.c()) : oVar == oVar2;
        }
        if (Double.isNaN(oVar.b().doubleValue()) || Double.isNaN(oVar2.b().doubleValue())) {
            return false;
        }
        return oVar.b().equals(oVar2.b());
    }

    public static int N(double d) {
        int i10;
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) ((long) ((Math.floor(Math.abs(d)) * ((double) (i10 > 0 ? 1 : -1))) % 4.294967296E9d));
    }

    public static long O(double d) {
        return ((long) N(d)) & 4294967295L;
    }

    public static double P(double d) {
        int i10;
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || i10 == 0) {
            return d;
        }
        return Math.floor(Math.abs(d)) * ((double) (i10 > 0 ? 1 : -1));
    }

    public static Object Q(o oVar) {
        if (o.f2851b.equals(oVar)) {
            return null;
        }
        return o.f2850a.equals(oVar) ? BuildConfig.FLAVOR : !oVar.b().isNaN() ? oVar.b() : oVar.zzc();
    }

    public static void R(i3 i3Var) {
        int N2 = N(i3Var.g("runtime.counter").b().doubleValue() + 1.0d);
        if (N2 <= 1000000) {
            i3Var.e("runtime.counter", new com.google.android.gms.internal.measurement.h(Double.valueOf((double) N2)));
            return;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static String S(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (i10 != 0) {
                if (Character.isUpperCase(charAt)) {
                    stringBuffer.append('_');
                }
                stringBuffer.append(charAt);
            }
            charAt = Character.toLowerCase(charAt);
            stringBuffer.append(charAt);
        }
        return stringBuffer.toString();
    }

    public static int l(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    public static void m(Object obj, String str, String str2) {
        Log.d(o(str), String.format(str2, new Object[]{obj}));
    }

    public static void n() {
        int i10 = f1008k0;
        if (i10 > 0) {
            f1008k0 = i10 - 1;
        }
    }

    public static String o(String str) {
        return "TransportRuntime.".concat(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a2, code lost:
        if (r3.S() != false) goto L_0x00a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void p(q8.d r8, java.lang.Object r9, y8.l r10) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.internal.c
            if (r0 == 0) goto L_0x00c8
            kotlinx.coroutines.internal.c r8 = (kotlinx.coroutines.internal.c) r8
            java.lang.Throwable r0 = n8.e.a(r9)
            r1 = 0
            if (r0 != 0) goto L_0x0017
            if (r10 == 0) goto L_0x0015
            g9.p r0 = new g9.p
            r0.<init>(r9, r10)
            goto L_0x001d
        L_0x0015:
            r0 = r9
            goto L_0x001d
        L_0x0017:
            g9.o r10 = new g9.o
            r10.<init>(r0, r1)
            r0 = r10
        L_0x001d:
            g9.s r10 = r8.f6776r
            q8.d<T> r2 = r8.f6777s
            r8.b()
            boolean r10 = r10.x()
            r3 = 1
            if (r10 == 0) goto L_0x003a
            r8.f6778t = r0
            r8.f5054q = r3
            g9.s r9 = r8.f6776r
            q8.f r10 = r8.b()
            r9.b(r10, r8)
            goto L_0x00cb
        L_0x003a:
            g9.c0 r10 = g9.a1.a()
            long r4 = r10.f5000p
            r6 = 4294967296(0x100000000, double:2.121995791E-314)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x004b
            r4 = r3
            goto L_0x004c
        L_0x004b:
            r4 = r1
        L_0x004c:
            if (r4 == 0) goto L_0x0057
            r8.f6778t = r0
            r8.f5054q = r3
            r10.z(r8)
            goto L_0x00cb
        L_0x0057:
            r10.C(r3)
            r4 = 0
            q8.f r5 = r8.b()     // Catch:{ all -> 0x007f }
            g9.l0$b r6 = g9.l0.b.f5025o     // Catch:{ all -> 0x007f }
            q8.f$b r5 = r5.get(r6)     // Catch:{ all -> 0x007f }
            g9.l0 r5 = (g9.l0) r5     // Catch:{ all -> 0x007f }
            if (r5 == 0) goto L_0x0081
            boolean r6 = r5.a()     // Catch:{ all -> 0x007f }
            if (r6 != 0) goto L_0x0081
            java.util.concurrent.CancellationException r1 = r5.o()     // Catch:{ all -> 0x007f }
            r8.a(r0, r1)     // Catch:{ all -> 0x007f }
            n8.e$a r0 = n.e.s(r1)     // Catch:{ all -> 0x007f }
            r8.h(r0)     // Catch:{ all -> 0x007f }
            r1 = r3
            goto L_0x0081
        L_0x007f:
            r9 = move-exception
            goto L_0x00bc
        L_0x0081:
            if (r1 != 0) goto L_0x00b5
            java.lang.Object r0 = r8.u     // Catch:{ all -> 0x007f }
            q8.f r1 = r2.b()     // Catch:{ all -> 0x007f }
            java.lang.Object r0 = kotlinx.coroutines.internal.m.c(r1, r0)     // Catch:{ all -> 0x007f }
            d7.j0 r3 = kotlinx.coroutines.internal.m.f6795a     // Catch:{ all -> 0x007f }
            if (r0 == r3) goto L_0x0096
            g9.c1 r3 = g9.r.a(r2, r1, r0)     // Catch:{ all -> 0x007f }
            goto L_0x0097
        L_0x0096:
            r3 = r4
        L_0x0097:
            r2.h(r9)     // Catch:{ all -> 0x00a8 }
            n8.i r9 = n8.i.f7501a     // Catch:{ all -> 0x00a8 }
            if (r3 == 0) goto L_0x00a4
            boolean r9 = r3.S()     // Catch:{ all -> 0x007f }
            if (r9 == 0) goto L_0x00b5
        L_0x00a4:
            kotlinx.coroutines.internal.m.a(r1, r0)     // Catch:{ all -> 0x007f }
            goto L_0x00b5
        L_0x00a8:
            r9 = move-exception
            if (r3 == 0) goto L_0x00b1
            boolean r2 = r3.S()     // Catch:{ all -> 0x007f }
            if (r2 == 0) goto L_0x00b4
        L_0x00b1:
            kotlinx.coroutines.internal.m.a(r1, r0)     // Catch:{ all -> 0x007f }
        L_0x00b4:
            throw r9     // Catch:{ all -> 0x007f }
        L_0x00b5:
            boolean r9 = r10.E()     // Catch:{ all -> 0x007f }
            if (r9 != 0) goto L_0x00b5
            goto L_0x00bf
        L_0x00bc:
            r8.g(r9, r4)     // Catch:{ all -> 0x00c3 }
        L_0x00bf:
            r10.y()
            goto L_0x00cb
        L_0x00c3:
            r8 = move-exception
            r10.y()
            throw r8
        L_0x00c8:
            r8.h(r9)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.a.p(q8.d, java.lang.Object, y8.l):void");
    }

    public static int s(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static long t(long j8, long j10, long j11) {
        long j12 = (j8 ^ j10) * j11;
        long j13 = ((j12 ^ (j12 >>> 47)) ^ j10) * j11;
        return (j13 ^ (j13 >>> 47)) * j11;
    }

    public static long v(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        if (length < 0 || length > bArr2.length) {
            StringBuilder sb = new StringBuilder(67);
            sb.append("Out of bound index with offput: 0 and length: ");
            sb.append(length);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        int i10 = 37;
        if (length <= 32) {
            if (length > 16) {
                long j8 = ((long) (length << 1)) - 7286425919675154353L;
                long E2 = E(0, bArr2) * -5435081209227447693L;
                long E3 = E(8, bArr2);
                int i11 = length + 0;
                long E4 = E(i11 - 8, bArr2) * j8;
                return t(Long.rotateRight(E4, 30) + Long.rotateRight(E2 + E3, 43) + (E(i11 - 16, bArr2) * -7286425919675154353L), Long.rotateRight(E3 - 7286425919675154353L, 18) + E2 + E4, j8);
            } else if (length >= 8) {
                long j10 = ((long) (length << 1)) - 7286425919675154353L;
                long E5 = E(0, bArr2) - 7286425919675154353L;
                long E6 = E((length + 0) - 8, bArr2);
                return t((Long.rotateRight(E6, 37) * j10) + E5, (Long.rotateRight(E5, 25) + E6) * j10, j10);
            } else if (length >= 4) {
                return t(((long) length) + ((((long) s(0, bArr2)) & 4294967295L) << 3), ((long) s((length + 0) - 4, bArr2)) & 4294967295L, ((long) (length << 1)) - 7286425919675154353L);
            } else if (length <= 0) {
                return -7286425919675154353L;
            } else {
                long j11 = (((long) ((bArr2[0] & 255) + ((bArr2[(length >> 1) + 0] & 255) << 8))) * -7286425919675154353L) ^ (((long) (length + ((bArr2[(length - 1) + 0] & 255) << 2))) * -4348849565147123417L);
                return (j11 ^ (j11 >>> 47)) * -7286425919675154353L;
            }
        } else if (length <= 64) {
            long j12 = ((long) (length << 1)) - 7286425919675154353L;
            long E7 = E(0, bArr2) * -7286425919675154353L;
            long E8 = E(8, bArr2);
            int i12 = length + 0;
            long E9 = E(i12 - 8, bArr2) * j12;
            long rotateRight = Long.rotateRight(E9, 30) + Long.rotateRight(E7 + E8, 43) + (E(i12 - 16, bArr2) * -7286425919675154353L);
            long j13 = j12;
            long t10 = t(rotateRight, Long.rotateRight(-7286425919675154353L + E8, 18) + E7 + E9, j13);
            byte[] bArr3 = bArr;
            long E10 = E(16, bArr3) * j12;
            long E11 = E(24, bArr3);
            long j14 = E7;
            long E12 = (E(i12 - 32, bArr3) + rotateRight) * j12;
            return t(((E(i12 - 24, bArr3) + t10) * j12) + Long.rotateRight(E12, 30) + Long.rotateRight(E10 + E11, 43), Long.rotateRight(E11 + j14, 18) + E10 + E12, j13);
        } else {
            long[] jArr = new long[2];
            long[] jArr2 = new long[2];
            long E13 = E(0, bArr2) + 95310865018149119L;
            int i13 = length - 1;
            int i14 = ((i13 / 64) << 6) + 0;
            int i15 = i13 & 63;
            int i16 = (i14 + i15) - 63;
            long j15 = 2480279821605975764L;
            long j16 = 1390051526045402406L;
            int i17 = 0;
            while (true) {
                long j17 = E13 + j15 + jArr[0];
                long j18 = j15 + jArr[1];
                long rotateRight2 = (Long.rotateRight(E(i17 + 8, bArr2) + j17, i10) * -5435081209227447693L) ^ jArr2[1];
                long E14 = E(i17 + 40, bArr2) + jArr[0] + (Long.rotateRight(E(i17 + 48, bArr2) + j18, 42) * -5435081209227447693L);
                long rotateRight3 = Long.rotateRight(j16 + jArr2[0], 33) * -5435081209227447693L;
                int i18 = i15;
                int i19 = i14;
                C(bArr, i17, jArr[1] * -5435081209227447693L, rotateRight2 + jArr2[0], jArr);
                C(bArr, i17 + 32, rotateRight3 + jArr2[1], E(i17 + 16, bArr2) + E14, jArr2);
                int i20 = i17 + 64;
                if (i20 == i19) {
                    long j19 = ((rotateRight2 & 255) << 1) - 5435081209227447693L;
                    long j20 = jArr2[0] + ((long) i18);
                    jArr2[0] = j20;
                    long j21 = jArr[0] + j20;
                    jArr[0] = j21;
                    jArr2[0] = jArr2[0] + j21;
                    long j22 = rotateRight3 + E14 + jArr[0];
                    long j23 = E14 + jArr[1];
                    long rotateRight4 = (Long.rotateRight(E(i16 + 8, bArr2) + j22, 37) * j19) ^ (jArr2[1] * 9);
                    long E15 = E(i16 + 40, bArr2) + (jArr[0] * 9) + (Long.rotateRight(E(i16 + 48, bArr2) + j23, 42) * j19);
                    long rotateRight5 = Long.rotateRight(rotateRight2 + jArr2[0], 33) * j19;
                    C(bArr, i16, jArr[1] * j19, rotateRight4 + jArr2[0], jArr);
                    C(bArr, i16 + 32, rotateRight5 + jArr2[1], E(i16 + 16, bArr2) + E15, jArr2);
                    long j24 = j19;
                    return t((((E15 >>> 47) ^ E15) * -4348849565147123417L) + t(jArr[0], jArr2[0], j24) + rotateRight4, t(jArr[1], jArr2[1], j24) + rotateRight5, j24);
                }
                i17 = i20;
                i14 = i19;
                i15 = i18;
                E13 = rotateRight3;
                j16 = rotateRight2;
                j15 = E14;
                i10 = 37;
            }
        }
    }

    public static o w(com.google.android.gms.internal.measurement.k kVar, r rVar, i3 i3Var, ArrayList arrayList) {
        String str = rVar.f2901o;
        if (kVar.k(str)) {
            o e10 = kVar.e(str);
            if (e10 instanceof i) {
                return ((i) e10).a(i3Var, arrayList);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", new Object[]{str}));
        } else if ("hasOwnProperty".equals(str)) {
            A("hasOwnProperty", 1, arrayList);
            return kVar.k(i3Var.a((o) arrayList.get(0)).zzc()) ? o.f2854f : o.f2855g;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", new Object[]{str}));
        }
    }

    public static r4 x(r4 r4Var) {
        return ((r4Var instanceof t4) || (r4Var instanceof s4)) ? r4Var : r4Var instanceof Serializable ? new s4(r4Var) : new t4(r4Var);
    }

    public static String y(k5 k5Var) {
        String str;
        StringBuilder sb = new StringBuilder(k5Var.i());
        for (int i10 = 0; i10 < k5Var.i(); i10++) {
            int e10 = k5Var.e(i10);
            if (e10 == 34) {
                str = "\\\"";
            } else if (e10 == 39) {
                str = "\\'";
            } else if (e10 != 92) {
                switch (e10) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (e10 < 32 || e10 > 126) {
                            sb.append('\\');
                            sb.append((char) (((e10 >>> 6) & 3) + 48));
                            sb.append((char) (((e10 >>> 3) & 7) + 48));
                            e10 = (e10 & 7) + 48;
                        }
                        sb.append((char) e10);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static void z(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public Object apply(Object obj) {
        c8.b bVar = (c8.b) obj;
        bVar.getClass();
        f0 f0Var = c5.d.f2158a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f0Var.p(bVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public String b(String str, String str2) {
        return null;
    }

    public Object c(m5.i iVar) {
        Object obj = b8.h.f2022b;
        return -1;
    }

    public void d(i9.f0 f0Var, i9.c0 c0Var) {
        g.f(c0Var, "response");
    }

    public void f(View view) {
    }

    public void g() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.StackTraceElement[] h(java.lang.StackTraceElement[] r15) {
        /*
            r14 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r15.length
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            r2 = 1
            r3 = 0
            r6 = r2
            r4 = r3
            r5 = r4
        L_0x000d:
            int r7 = r15.length
            if (r4 >= r7) goto L_0x0066
            r7 = r15[r4]
            java.lang.Object r8 = r0.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L_0x0054
            int r9 = r8.intValue()
            int r10 = r4 - r9
            int r11 = r4 + r10
            int r12 = r15.length
            if (r11 <= r12) goto L_0x0026
            goto L_0x0037
        L_0x0026:
            r11 = r3
        L_0x0027:
            if (r11 >= r10) goto L_0x003c
            int r12 = r9 + r11
            r12 = r15[r12]
            int r13 = r4 + r11
            r13 = r15[r13]
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x0039
        L_0x0037:
            r9 = r3
            goto L_0x003d
        L_0x0039:
            int r11 = r11 + 1
            goto L_0x0027
        L_0x003c:
            r9 = r2
        L_0x003d:
            if (r9 != 0) goto L_0x0040
            goto L_0x0054
        L_0x0040:
            int r8 = r8.intValue()
            int r8 = r4 - r8
            r9 = 10
            if (r6 >= r9) goto L_0x0050
            java.lang.System.arraycopy(r15, r4, r1, r5, r8)
            int r5 = r5 + r8
            int r6 = r6 + 1
        L_0x0050:
            int r8 = r8 + -1
            int r8 = r8 + r4
            goto L_0x005c
        L_0x0054:
            r6 = r15[r4]
            r1[r5] = r6
            int r5 = r5 + 1
            r6 = r2
            r8 = r4
        L_0x005c:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r7, r4)
            int r4 = r8 + 1
            goto L_0x000d
        L_0x0066:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r5]
            java.lang.System.arraycopy(r1, r3, r0, r3, r5)
            int r1 = r15.length
            if (r5 >= r1) goto L_0x006f
            return r0
        L_0x006f:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.a.h(java.lang.StackTraceElement[]):java.lang.StackTraceElement[]");
    }

    public m5.i i(Object obj) {
        Void voidR = (Void) obj;
        return l.e(Boolean.TRUE);
    }

    public Object j(y6.s sVar) {
        return FirebaseMessagingRegistrar.lambda$getComponents$0(sVar);
    }

    public void k() {
    }

    public void q(m.a aVar, float f10) {
        float f11;
        CardView.a aVar2 = (CardView.a) aVar;
        m.b bVar = (m.b) aVar2.f766a;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        CardView cardView = CardView.this;
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (!(f10 == bVar.f7008e && bVar.f7009f == useCompatPadding && bVar.f7010g == preventCornerOverlap)) {
            bVar.f7008e = f10;
            bVar.f7009f = useCompatPadding;
            bVar.f7010g = preventCornerOverlap;
            bVar.c((Rect) null);
            bVar.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            aVar2.a(0, 0, 0, 0);
            return;
        }
        Drawable drawable = aVar2.f766a;
        float f12 = ((m.b) drawable).f7008e;
        float f13 = ((m.b) drawable).f7005a;
        if (cardView.getPreventCornerOverlap()) {
            f11 = (float) (((1.0d - m.c.f7015a) * ((double) f13)) + ((double) f12));
        } else {
            int i10 = m.c.f7016b;
            f11 = f12;
        }
        int ceil = (int) Math.ceil((double) f11);
        float f14 = f12 * 1.5f;
        if (cardView.getPreventCornerOverlap()) {
            f14 = (float) (((1.0d - m.c.f7015a) * ((double) f13)) + ((double) f14));
        }
        int ceil2 = (int) Math.ceil((double) f14);
        aVar2.a(ceil, ceil2, ceil, ceil2);
    }

    public void r(View view, int i10) {
        if (!f1024v) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                u = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f1024v = true;
        }
        Field field = u;
        if (field != null) {
            try {
                u.setInt(view, i10 | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public int u() {
        return 0;
    }

    public Object zza() {
        List<s2<?>> list = u2.f5707a;
        return Integer.valueOf((int) j9.f2758p.zza().s());
    }
}

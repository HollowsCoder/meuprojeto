package p9;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import c9.c;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.karumi.dexter.R;
import g9.c1;
import g9.f0;
import g9.r;
import g9.r0;
import g9.s0;
import g9.v;
import g9.x0;
import g9.y;
import g9.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.m;
import n8.i;
import o8.k;
import q8.d;
import q8.e;
import q8.f;
import r1.d0;
import s1.a;
import t8.b;
import y6.e;
import y6.s;
import y8.p;
import z8.g;

public class u implements v, d0, e {
    public static final int[] A = {16843017, 16843264, R.attr.foregroundInsidePadding};
    public static final int[] B = {R.attr.backgroundInsetBottom, R.attr.backgroundInsetEnd, R.attr.backgroundInsetStart, R.attr.backgroundInsetTop};
    public static final int[] C = {16843296};
    public static final int[] D = {16842964, 16843191, 16843192, 16843193, 16843194, 16843237, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.cornerRadius, R.attr.elevation, R.attr.icon, R.attr.iconGravity, R.attr.iconPadding, R.attr.iconSize, R.attr.iconTint, R.attr.iconTintMode, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.strokeColor, R.attr.strokeWidth};
    public static final int[] E = {R.attr.checkedButton, R.attr.selectionRequired, R.attr.singleSelection};
    public static final int[] F = {16843277, R.attr.dayInvalidStyle, R.attr.daySelectedStyle, R.attr.dayStyle, R.attr.dayTodayStyle, R.attr.nestedScrollable, R.attr.rangeFillColor, R.attr.yearSelectedStyle, R.attr.yearStyle, R.attr.yearTodayStyle};
    public static final int[] G = {16843191, 16843192, 16843193, 16843194, R.attr.itemFillColor, R.attr.itemShapeAppearance, R.attr.itemShapeAppearanceOverlay, R.attr.itemStrokeColor, R.attr.itemStrokeWidth, R.attr.itemTextColor};
    public static final int[] H = {R.attr.buttonTint, R.attr.useMaterialThemeColors};
    public static final int[] I = {R.attr.buttonTint, R.attr.useMaterialThemeColors};
    public static final int[] J = {R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};
    public static final int[] K = {16843958, 16844159, R.attr.lineHeight};
    public static final int[] L = {16842804, 16844159, R.attr.lineHeight};
    public static final int[] M = {R.attr.navigationIconTint, R.attr.subtitleCentered, R.attr.titleCentered};
    public static final int[] N = {R.attr.materialCircleRadius};
    public static final int[] O = {R.attr.behavior_overlapTop};
    public static final int[] P = {R.attr.cornerFamily, R.attr.cornerFamilyBottomLeft, R.attr.cornerFamilyBottomRight, R.attr.cornerFamilyTopLeft, R.attr.cornerFamilyTopRight, R.attr.cornerSize, R.attr.cornerSizeBottomLeft, R.attr.cornerSizeBottomRight, R.attr.cornerSizeTopLeft, R.attr.cornerSizeTopRight};
    public static final int[] Q = {16843039, R.attr.actionTextColorAlpha, R.attr.animationMode, R.attr.backgroundOverlayColorAlpha, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.elevation, R.attr.maxActionInlineWidth};
    public static final int[] R = {16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16844165, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};
    public static final int[] S = {R.attr.textInputLayoutFocusedRectEnabled};
    public static final int[] T = {16842766, 16842906, 16843039, 16843071, 16843088, R.attr.boxBackgroundColor, R.attr.boxBackgroundMode, R.attr.boxCollapsedPaddingTop, R.attr.boxCornerRadiusBottomEnd, R.attr.boxCornerRadiusBottomStart, R.attr.boxCornerRadiusTopEnd, R.attr.boxCornerRadiusTopStart, R.attr.boxStrokeColor, R.attr.boxStrokeErrorColor, R.attr.boxStrokeWidth, R.attr.boxStrokeWidthFocused, R.attr.counterEnabled, R.attr.counterMaxLength, R.attr.counterOverflowTextAppearance, R.attr.counterOverflowTextColor, R.attr.counterTextAppearance, R.attr.counterTextColor, R.attr.endIconCheckable, R.attr.endIconContentDescription, R.attr.endIconDrawable, R.attr.endIconMode, R.attr.endIconTint, R.attr.endIconTintMode, R.attr.errorContentDescription, R.attr.errorEnabled, R.attr.errorIconDrawable, R.attr.errorIconTint, R.attr.errorIconTintMode, R.attr.errorTextAppearance, R.attr.errorTextColor, R.attr.expandedHintEnabled, R.attr.helperText, R.attr.helperTextEnabled, R.attr.helperTextTextAppearance, R.attr.helperTextTextColor, R.attr.hintAnimationEnabled, R.attr.hintEnabled, R.attr.hintTextAppearance, R.attr.hintTextColor, R.attr.passwordToggleContentDescription, R.attr.passwordToggleDrawable, R.attr.passwordToggleEnabled, R.attr.passwordToggleTint, R.attr.passwordToggleTintMode, R.attr.placeholderText, R.attr.placeholderTextAppearance, R.attr.placeholderTextColor, R.attr.prefixText, R.attr.prefixTextAppearance, R.attr.prefixTextColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.startIconCheckable, R.attr.startIconContentDescription, R.attr.startIconDrawable, R.attr.startIconTint, R.attr.startIconTintMode, R.attr.suffixText, R.attr.suffixTextAppearance, R.attr.suffixTextColor};
    public static final int[] U = {16842804, R.attr.enforceMaterialTheme, R.attr.enforceTextAppearance};
    public static final int[] V;
    public static final int[] W;
    public static final int[] X;
    public static final int[] Y;
    public static final int[] Z = {R.attr.attributeName, R.attr.customBoolean, R.attr.customColorDrawableValue, R.attr.customColorValue, R.attr.customDimension, R.attr.customFloatValue, R.attr.customIntegerValue, R.attr.customPixelDimension, R.attr.customReference, R.attr.customStringValue, R.attr.methodName};

    /* renamed from: a0  reason: collision with root package name */
    public static final int[] f8102a0 = {16842948, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843701, 16843702, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.maxHeight, R.attr.maxWidth, R.attr.minHeight, R.attr.minWidth};

    /* renamed from: b0  reason: collision with root package name */
    public static final int[] f8103b0 = {R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.drawPath, R.attr.motionPathRotate, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.quantizeMotionInterpolator, R.attr.quantizeMotionPhase, R.attr.quantizeMotionSteps, R.attr.transitionEasing};

    /* renamed from: c0  reason: collision with root package name */
    public static final int[] f8104c0 = {R.attr.onHide, R.attr.onShow};

    /* renamed from: d0  reason: collision with root package name */
    public static final int[] f8105d0 = {16842972, 16843551, R.attr.layout_constraintTag, R.attr.motionProgress, R.attr.visibilityMode};

    /* renamed from: e0  reason: collision with root package name */
    public static final int[] f8106e0 = {16842960, R.attr.constraints};

    /* renamed from: f0  reason: collision with root package name */
    public static final int[] f8107f0 = {16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843770, 16843840, R.attr.transformPivotTarget};

    /* renamed from: g0  reason: collision with root package name */
    public static final int[] f8108g0 = {R.attr.constraints, R.attr.region_heightLessThan, R.attr.region_heightMoreThan, R.attr.region_widthLessThan, R.attr.region_widthMoreThan};

    /* renamed from: h0  reason: collision with root package name */
    public static final u f8109h0 = new u();

    /* renamed from: i0  reason: collision with root package name */
    public static final char[] f8110i0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: o  reason: collision with root package name */
    public static final u f8111o = new u();

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f8112p = {16842964, 16843919, 16844096, R.attr.elevation, R.attr.expanded, R.attr.liftOnScroll, R.attr.liftOnScrollTargetViewId, R.attr.statusBarForeground};

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f8113q = {R.attr.layout_scrollFlags, R.attr.layout_scrollInterpolator};

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f8114r = {16843039, 16843840, R.attr.backgroundTint, R.attr.behavior_draggable, R.attr.behavior_expandedOffset, R.attr.behavior_fitToContents, R.attr.behavior_halfExpandedRatio, R.attr.behavior_hideable, R.attr.behavior_peekHeight, R.attr.behavior_saveFlags, R.attr.behavior_skipCollapsed, R.attr.gestureInsetBottomIgnored, R.attr.paddingBottomSystemWindowInsets, R.attr.paddingLeftSystemWindowInsets, R.attr.paddingRightSystemWindowInsets, R.attr.paddingTopSystemWindowInsets, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f8115s = {16842804, 16842901, 16842904, 16842923, 16843039, 16843087, 16843237, R.attr.checkedIcon, R.attr.checkedIconEnabled, R.attr.checkedIconTint, R.attr.checkedIconVisible, R.attr.chipBackgroundColor, R.attr.chipCornerRadius, R.attr.chipEndPadding, R.attr.chipIcon, R.attr.chipIconEnabled, R.attr.chipIconSize, R.attr.chipIconTint, R.attr.chipIconVisible, R.attr.chipMinHeight, R.attr.chipMinTouchTargetSize, R.attr.chipStartPadding, R.attr.chipStrokeColor, R.attr.chipStrokeWidth, R.attr.chipSurfaceColor, R.attr.closeIcon, R.attr.closeIconEnabled, R.attr.closeIconEndPadding, R.attr.closeIconSize, R.attr.closeIconStartPadding, R.attr.closeIconTint, R.attr.closeIconVisible, R.attr.ensureMinTouchTargetSize, R.attr.hideMotionSpec, R.attr.iconEndPadding, R.attr.iconStartPadding, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.showMotionSpec, R.attr.textEndPadding, R.attr.textStartPadding};

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f8116t = {R.attr.checkedChip, R.attr.chipSpacing, R.attr.chipSpacingHorizontal, R.attr.chipSpacingVertical, R.attr.selectionRequired, R.attr.singleLine, R.attr.singleSelection};
    public static final int[] u = {R.attr.clockFaceBackgroundColor, R.attr.clockNumberTextColor};

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f8117v = {R.attr.clockHandColor, R.attr.materialCircleRadius, R.attr.selectorSize};
    public static final int[] w = {R.attr.behavior_autoHide, R.attr.behavior_autoShrink};

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f8118x = {16842766, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.borderWidth, R.attr.elevation, R.attr.ensureMinTouchTargetSize, R.attr.fabCustomSize, R.attr.fabSize, R.attr.hideMotionSpec, R.attr.hoveredFocusedTranslationZ, R.attr.maxImageSize, R.attr.pressedTranslationZ, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.showMotionSpec, R.attr.useCompatPadding};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f8119y = {R.attr.behavior_autoHide};
    public static final int[] z = {R.attr.itemSpacing, R.attr.lineSpacing};

    static {
        int[] iArr = new int[R.styleable.AppCompatTheme_windowFixedWidthMinor];
        // fill-array-data instruction
        iArr[0] = 16842948;
        iArr[1] = 16842960;
        iArr[2] = 16842972;
        iArr[3] = 16842996;
        iArr[4] = 16842997;
        iArr[5] = 16842999;
        iArr[6] = 16843000;
        iArr[7] = 16843001;
        iArr[8] = 16843002;
        iArr[9] = 16843039;
        iArr[10] = 16843040;
        iArr[11] = 16843071;
        iArr[12] = 16843072;
        iArr[13] = 16843551;
        iArr[14] = 16843552;
        iArr[15] = 16843553;
        iArr[16] = 16843554;
        iArr[17] = 16843555;
        iArr[18] = 16843556;
        iArr[19] = 16843557;
        iArr[20] = 16843558;
        iArr[21] = 16843559;
        iArr[22] = 16843560;
        iArr[23] = 16843701;
        iArr[24] = 16843702;
        iArr[25] = 16843770;
        iArr[26] = 16843840;
        iArr[27] = 2130968629;
        iArr[28] = 2130968630;
        iArr[29] = 2130968662;
        iArr[30] = 2130968663;
        iArr[31] = 2130968664;
        iArr[32] = 2130968729;
        iArr[33] = 2130968823;
        iArr[34] = 2130968824;
        iArr[35] = 2130968932;
        iArr[36] = 2130969000;
        iArr[37] = 2130969001;
        iArr[38] = 2130969002;
        iArr[39] = 2130969003;
        iArr[40] = 2130969004;
        iArr[41] = 2130969005;
        iArr[42] = 2130969006;
        iArr[43] = 2130969007;
        iArr[44] = 2130969008;
        iArr[45] = 2130969009;
        iArr[46] = 2130969010;
        iArr[47] = 2130969011;
        iArr[48] = 2130969012;
        iArr[49] = 2130969014;
        iArr[50] = 2130969015;
        iArr[51] = 2130969016;
        iArr[52] = 2130969017;
        iArr[53] = 2130969018;
        iArr[54] = 2130969129;
        iArr[55] = 2130969130;
        iArr[56] = 2130969131;
        iArr[57] = 2130969132;
        iArr[58] = 2130969133;
        iArr[59] = 2130969134;
        iArr[60] = 2130969135;
        iArr[61] = 2130969136;
        iArr[62] = 2130969137;
        iArr[63] = 2130969138;
        iArr[64] = 2130969139;
        iArr[65] = 2130969140;
        iArr[66] = 2130969141;
        iArr[67] = 2130969142;
        iArr[68] = 2130969143;
        iArr[69] = 2130969144;
        iArr[70] = 2130969145;
        iArr[71] = 2130969146;
        iArr[72] = 2130969147;
        iArr[73] = 2130969148;
        iArr[74] = 2130969149;
        iArr[75] = 2130969150;
        iArr[76] = 2130969151;
        iArr[77] = 2130969152;
        iArr[78] = 2130969153;
        iArr[79] = 2130969154;
        iArr[80] = 2130969155;
        iArr[81] = 2130969156;
        iArr[82] = 2130969157;
        iArr[83] = 2130969158;
        iArr[84] = 2130969159;
        iArr[85] = 2130969160;
        iArr[86] = 2130969161;
        iArr[87] = 2130969162;
        iArr[88] = 2130969163;
        iArr[89] = 2130969164;
        iArr[90] = 2130969165;
        iArr[91] = 2130969166;
        iArr[92] = 2130969167;
        iArr[93] = 2130969168;
        iArr[94] = 2130969169;
        iArr[95] = 2130969170;
        iArr[96] = 2130969171;
        iArr[97] = 2130969172;
        iArr[98] = 2130969173;
        iArr[99] = 2130969174;
        iArr[100] = 2130969176;
        iArr[101] = 2130969177;
        iArr[102] = 2130969178;
        iArr[103] = 2130969179;
        iArr[104] = 2130969180;
        iArr[105] = 2130969181;
        iArr[106] = 2130969182;
        iArr[107] = 2130969183;
        iArr[108] = 2130969184;
        iArr[109] = 2130969187;
        iArr[110] = 2130969191;
        iArr[111] = 2130969309;
        iArr[112] = 2130969310;
        iArr[113] = 2130969354;
        iArr[114] = 2130969361;
        iArr[115] = 2130969366;
        iArr[116] = 2130969382;
        iArr[117] = 2130969383;
        iArr[118] = 2130969384;
        iArr[119] = 2130969622;
        iArr[120] = 2130969624;
        iArr[121] = 2130969626;
        iArr[122] = 2130969643;
        V = iArr;
        int[] iArr2 = new int[R.styleable.AppCompatTheme_tooltipForegroundColor];
        // fill-array-data instruction
        iArr2[0] = 16842948;
        iArr2[1] = 16842965;
        iArr2[2] = 16842966;
        iArr2[3] = 16842967;
        iArr2[4] = 16842968;
        iArr2[5] = 16842969;
        iArr2[6] = 16842972;
        iArr2[7] = 16842996;
        iArr2[8] = 16842997;
        iArr2[9] = 16842998;
        iArr2[10] = 16842999;
        iArr2[11] = 16843000;
        iArr2[12] = 16843001;
        iArr2[13] = 16843002;
        iArr2[14] = 16843039;
        iArr2[15] = 16843040;
        iArr2[16] = 16843071;
        iArr2[17] = 16843072;
        iArr2[18] = 16843699;
        iArr2[19] = 16843700;
        iArr2[20] = 16843701;
        iArr2[21] = 16843702;
        iArr2[22] = 16843840;
        iArr2[23] = 16844091;
        iArr2[24] = 16844092;
        iArr2[25] = 2130968662;
        iArr2[26] = 2130968663;
        iArr2[27] = 2130968664;
        iArr2[28] = 2130968729;
        iArr2[29] = 2130968766;
        iArr2[30] = 2130968767;
        iArr2[31] = 2130968768;
        iArr2[32] = 2130968769;
        iArr2[33] = 2130968770;
        iArr2[34] = 2130968820;
        iArr2[35] = 2130968823;
        iArr2[36] = 2130968824;
        iArr2[37] = 2130969000;
        iArr2[38] = 2130969001;
        iArr2[39] = 2130969002;
        iArr2[40] = 2130969003;
        iArr2[41] = 2130969004;
        iArr2[42] = 2130969005;
        iArr2[43] = 2130969006;
        iArr2[44] = 2130969007;
        iArr2[45] = 2130969008;
        iArr2[46] = 2130969009;
        iArr2[47] = 2130969010;
        iArr2[48] = 2130969011;
        iArr2[49] = 2130969012;
        iArr2[50] = 2130969014;
        iArr2[51] = 2130969015;
        iArr2[52] = 2130969016;
        iArr2[53] = 2130969017;
        iArr2[54] = 2130969018;
        iArr2[55] = 2130969121;
        iArr2[56] = 2130969129;
        iArr2[57] = 2130969130;
        iArr2[58] = 2130969131;
        iArr2[59] = 2130969132;
        iArr2[60] = 2130969133;
        iArr2[61] = 2130969134;
        iArr2[62] = 2130969135;
        iArr2[63] = 2130969136;
        iArr2[64] = 2130969137;
        iArr2[65] = 2130969138;
        iArr2[66] = 2130969139;
        iArr2[67] = 2130969140;
        iArr2[68] = 2130969141;
        iArr2[69] = 2130969142;
        iArr2[70] = 2130969143;
        iArr2[71] = 2130969144;
        iArr2[72] = 2130969145;
        iArr2[73] = 2130969146;
        iArr2[74] = 2130969147;
        iArr2[75] = 2130969148;
        iArr2[76] = 2130969149;
        iArr2[77] = 2130969150;
        iArr2[78] = 2130969151;
        iArr2[79] = 2130969152;
        iArr2[80] = 2130969153;
        iArr2[81] = 2130969154;
        iArr2[82] = 2130969155;
        iArr2[83] = 2130969156;
        iArr2[84] = 2130969157;
        iArr2[85] = 2130969158;
        iArr2[86] = 2130969159;
        iArr2[87] = 2130969160;
        iArr2[88] = 2130969161;
        iArr2[89] = 2130969162;
        iArr2[90] = 2130969163;
        iArr2[91] = 2130969164;
        iArr2[92] = 2130969165;
        iArr2[93] = 2130969166;
        iArr2[94] = 2130969167;
        iArr2[95] = 2130969168;
        iArr2[96] = 2130969169;
        iArr2[97] = 2130969170;
        iArr2[98] = 2130969171;
        iArr2[99] = 2130969172;
        iArr2[100] = 2130969173;
        iArr2[101] = 2130969174;
        iArr2[102] = 2130969176;
        iArr2[103] = 2130969177;
        iArr2[104] = 2130969178;
        iArr2[105] = 2130969179;
        iArr2[106] = 2130969180;
        iArr2[107] = 2130969181;
        iArr2[108] = 2130969182;
        iArr2[109] = 2130969183;
        iArr2[110] = 2130969184;
        iArr2[111] = 2130969187;
        iArr2[112] = 2130969188;
        iArr2[113] = 2130969191;
        W = iArr2;
        int[] iArr3 = new int[R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle];
        // fill-array-data instruction
        iArr3[0] = 16842948;
        iArr3[1] = 16842960;
        iArr3[2] = 16842972;
        iArr3[3] = 16842996;
        iArr3[4] = 16842997;
        iArr3[5] = 16842999;
        iArr3[6] = 16843000;
        iArr3[7] = 16843001;
        iArr3[8] = 16843002;
        iArr3[9] = 16843039;
        iArr3[10] = 16843040;
        iArr3[11] = 16843071;
        iArr3[12] = 16843072;
        iArr3[13] = 16843551;
        iArr3[14] = 16843552;
        iArr3[15] = 16843553;
        iArr3[16] = 16843554;
        iArr3[17] = 16843555;
        iArr3[18] = 16843556;
        iArr3[19] = 16843557;
        iArr3[20] = 16843558;
        iArr3[21] = 16843559;
        iArr3[22] = 16843560;
        iArr3[23] = 16843701;
        iArr3[24] = 16843702;
        iArr3[25] = 16843770;
        iArr3[26] = 16843840;
        iArr3[27] = 2130968629;
        iArr3[28] = 2130968630;
        iArr3[29] = 2130968662;
        iArr3[30] = 2130968663;
        iArr3[31] = 2130968664;
        iArr3[32] = 2130968729;
        iArr3[33] = 2130968823;
        iArr3[34] = 2130968932;
        iArr3[35] = 2130969000;
        iArr3[36] = 2130969001;
        iArr3[37] = 2130969002;
        iArr3[38] = 2130969003;
        iArr3[39] = 2130969004;
        iArr3[40] = 2130969005;
        iArr3[41] = 2130969006;
        iArr3[42] = 2130969007;
        iArr3[43] = 2130969008;
        iArr3[44] = 2130969009;
        iArr3[45] = 2130969010;
        iArr3[46] = 2130969011;
        iArr3[47] = 2130969012;
        iArr3[48] = 2130969014;
        iArr3[49] = 2130969015;
        iArr3[50] = 2130969016;
        iArr3[51] = 2130969017;
        iArr3[52] = 2130969018;
        iArr3[53] = 2130969129;
        iArr3[54] = 2130969130;
        iArr3[55] = 2130969131;
        iArr3[56] = 2130969135;
        iArr3[57] = 2130969139;
        iArr3[58] = 2130969140;
        iArr3[59] = 2130969141;
        iArr3[60] = 2130969144;
        iArr3[61] = 2130969145;
        iArr3[62] = 2130969146;
        iArr3[63] = 2130969147;
        iArr3[64] = 2130969148;
        iArr3[65] = 2130969149;
        iArr3[66] = 2130969150;
        iArr3[67] = 2130969151;
        iArr3[68] = 2130969152;
        iArr3[69] = 2130969153;
        iArr3[70] = 2130969154;
        iArr3[71] = 2130969155;
        iArr3[72] = 2130969158;
        iArr3[73] = 2130969163;
        iArr3[74] = 2130969164;
        iArr3[75] = 2130969167;
        iArr3[76] = 2130969168;
        iArr3[77] = 2130969169;
        iArr3[78] = 2130969170;
        iArr3[79] = 2130969171;
        iArr3[80] = 2130969172;
        iArr3[81] = 2130969173;
        iArr3[82] = 2130969174;
        iArr3[83] = 2130969176;
        iArr3[84] = 2130969177;
        iArr3[85] = 2130969178;
        iArr3[86] = 2130969179;
        iArr3[87] = 2130969180;
        iArr3[88] = 2130969181;
        iArr3[89] = 2130969182;
        iArr3[90] = 2130969183;
        iArr3[91] = 2130969184;
        iArr3[92] = 2130969187;
        iArr3[93] = 2130969191;
        iArr3[94] = 2130969309;
        iArr3[95] = 2130969310;
        iArr3[96] = 2130969311;
        iArr3[97] = 2130969354;
        iArr3[98] = 2130969361;
        iArr3[99] = 2130969366;
        iArr3[100] = 2130969382;
        iArr3[101] = 2130969383;
        iArr3[102] = 2130969384;
        iArr3[103] = 2130969622;
        iArr3[104] = 2130969624;
        iArr3[105] = 2130969626;
        iArr3[106] = 2130969643;
        X = iArr3;
        int[] iArr4 = new int[R.styleable.AppCompatTheme_windowFixedHeightMinor];
        // fill-array-data instruction
        iArr4[0] = 16842948;
        iArr4[1] = 16842960;
        iArr4[2] = 16842972;
        iArr4[3] = 16842996;
        iArr4[4] = 16842997;
        iArr4[5] = 16842999;
        iArr4[6] = 16843000;
        iArr4[7] = 16843001;
        iArr4[8] = 16843002;
        iArr4[9] = 16843039;
        iArr4[10] = 16843040;
        iArr4[11] = 16843071;
        iArr4[12] = 16843072;
        iArr4[13] = 16843189;
        iArr4[14] = 16843190;
        iArr4[15] = 16843551;
        iArr4[16] = 16843552;
        iArr4[17] = 16843553;
        iArr4[18] = 16843554;
        iArr4[19] = 16843555;
        iArr4[20] = 16843556;
        iArr4[21] = 16843557;
        iArr4[22] = 16843558;
        iArr4[23] = 16843559;
        iArr4[24] = 16843560;
        iArr4[25] = 16843701;
        iArr4[26] = 16843702;
        iArr4[27] = 16843770;
        iArr4[28] = 16843840;
        iArr4[29] = 2130968629;
        iArr4[30] = 2130968630;
        iArr4[31] = 2130968662;
        iArr4[32] = 2130968663;
        iArr4[33] = 2130968664;
        iArr4[34] = 2130968729;
        iArr4[35] = 2130968819;
        iArr4[36] = 2130968823;
        iArr4[37] = 2130968824;
        iArr4[38] = 2130968919;
        iArr4[39] = 2130968932;
        iArr4[40] = 2130969000;
        iArr4[41] = 2130969001;
        iArr4[42] = 2130969002;
        iArr4[43] = 2130969003;
        iArr4[44] = 2130969004;
        iArr4[45] = 2130969005;
        iArr4[46] = 2130969006;
        iArr4[47] = 2130969007;
        iArr4[48] = 2130969008;
        iArr4[49] = 2130969009;
        iArr4[50] = 2130969010;
        iArr4[51] = 2130969011;
        iArr4[52] = 2130969012;
        iArr4[53] = 2130969014;
        iArr4[54] = 2130969015;
        iArr4[55] = 2130969016;
        iArr4[56] = 2130969017;
        iArr4[57] = 2130969018;
        iArr4[58] = 2130969129;
        iArr4[59] = 2130969130;
        iArr4[60] = 2130969131;
        iArr4[61] = 2130969132;
        iArr4[62] = 2130969133;
        iArr4[63] = 2130969134;
        iArr4[64] = 2130969135;
        iArr4[65] = 2130969136;
        iArr4[66] = 2130969137;
        iArr4[67] = 2130969138;
        iArr4[68] = 2130969139;
        iArr4[69] = 2130969140;
        iArr4[70] = 2130969141;
        iArr4[71] = 2130969142;
        iArr4[72] = 2130969143;
        iArr4[73] = 2130969144;
        iArr4[74] = 2130969145;
        iArr4[75] = 2130969146;
        iArr4[76] = 2130969148;
        iArr4[77] = 2130969149;
        iArr4[78] = 2130969150;
        iArr4[79] = 2130969151;
        iArr4[80] = 2130969152;
        iArr4[81] = 2130969153;
        iArr4[82] = 2130969154;
        iArr4[83] = 2130969155;
        iArr4[84] = 2130969156;
        iArr4[85] = 2130969157;
        iArr4[86] = 2130969158;
        iArr4[87] = 2130969159;
        iArr4[88] = 2130969160;
        iArr4[89] = 2130969161;
        iArr4[90] = 2130969162;
        iArr4[91] = 2130969163;
        iArr4[92] = 2130969164;
        iArr4[93] = 2130969165;
        iArr4[94] = 2130969166;
        iArr4[95] = 2130969167;
        iArr4[96] = 2130969168;
        iArr4[97] = 2130969169;
        iArr4[98] = 2130969171;
        iArr4[99] = 2130969172;
        iArr4[100] = 2130969173;
        iArr4[101] = 2130969174;
        iArr4[102] = 2130969176;
        iArr4[103] = 2130969177;
        iArr4[104] = 2130969178;
        iArr4[105] = 2130969179;
        iArr4[106] = 2130969180;
        iArr4[107] = 2130969181;
        iArr4[108] = 2130969182;
        iArr4[109] = 2130969183;
        iArr4[110] = 2130969184;
        iArr4[111] = 2130969187;
        iArr4[112] = 2130969191;
        iArr4[113] = 2130969309;
        iArr4[114] = 2130969310;
        iArr4[115] = 2130969354;
        iArr4[116] = 2130969361;
        iArr4[117] = 2130969366;
        iArr4[118] = 2130969384;
        iArr4[119] = 2130969624;
        iArr4[120] = 2130969626;
        Y = iArr4;
    }

    public static final int a(char c10) {
        if ('0' <= c10 && '9' >= c10) {
            return c10 - '0';
        }
        char c11 = 'a';
        if ('a' > c10 || 'f' < c10) {
            c11 = 'A';
            if ('A' > c10 || 'F' < c10) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c10);
            }
        }
        return (c10 - c11) + 10;
    }

    public static final void b(Throwable th, Throwable th2) {
        g.f(th, "<this>");
        g.f(th2, "exception");
        if (th != th2) {
            b.f9033a.a(th, th2);
        }
    }

    public static final boolean c(int i10, int i11, int i12, byte[] bArr, byte[] bArr2) {
        g.f(bArr, "a");
        g.f(bArr2, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void d(long j8, long j10, long j11) {
        if ((j10 | j11) < 0 || j10 > j8 || j8 - j10 < j11) {
            throw new ArrayIndexOutOfBoundsException("size=" + j8 + " offset=" + j10 + " byteCount=" + j11);
        }
    }

    public static final void e(int i10) {
        boolean z10;
        c cVar = new c(2, 36);
        if (2 > i10 || i10 > cVar.f2195p) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new c(2, 36));
        }
    }

    public static final boolean g(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final Class h(d9.b bVar) {
        g.f(bVar, "<this>");
        Class<?> a10 = ((z8.c) bVar).a();
        if (!a10.isPrimitive()) {
            return a10;
        }
        String name = a10.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? a10 : Double.class;
            case 104431:
                return !name.equals("int") ? a10 : Integer.class;
            case 3039496:
                return !name.equals("byte") ? a10 : Byte.class;
            case 3052374:
                return !name.equals("char") ? a10 : Character.class;
            case 3327612:
                return !name.equals("long") ? a10 : Long.class;
            case 3625364:
                return !name.equals("void") ? a10 : Void.class;
            case 64711720:
                return !name.equals("boolean") ? a10 : Boolean.class;
            case 97526364:
                return !name.equals("float") ? a10 : Float.class;
            case 109413500:
                return !name.equals("short") ? a10 : Short.class;
            default:
                return a10;
        }
    }

    public static final boolean i(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    public static void k(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, s0 s0Var, p pVar, int i10) {
        v vVar;
        d dVar;
        f fVar = s0Var;
        if ((i10 & 1) != 0) {
            fVar = q8.g.f8275o;
        }
        if ((i10 & 2) != 0) {
            vVar = v.DEFAULT;
        } else {
            vVar = null;
        }
        boolean z10 = r.f5045a;
        f plus = lifecycleCoroutineScopeImpl.f1346p.plus(fVar);
        f0 f0Var = z.f5055a;
        if (plus != f0Var && plus.get(e.a.f8273o) == null) {
            plus = plus.plus(f0Var);
        }
        if (vVar.isLazy()) {
            dVar = new r0(plus, pVar);
        } else {
            dVar = new x0(plus, true);
        }
        vVar.invoke(pVar, dVar, dVar);
    }

    public static final List l(Object obj) {
        List singletonList = Collections.singletonList(obj);
        g.e(singletonList, "singletonList(element)");
        return singletonList;
    }

    public static final int m(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((((float) i10) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final List n(ArrayList arrayList) {
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : l(arrayList.get(0)) : k.f7764o;
    }

    public static void o(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j8 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            j8 = Math.max(j8, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
        ofInt.setDuration(j8);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static final void p(y yVar, d dVar, boolean z10) {
        Object i10 = yVar.i();
        Throwable d = yVar.d(i10);
        Object s10 = d != null ? n.e.s(d) : yVar.f(i10);
        if (z10) {
            kotlinx.coroutines.internal.c cVar = (kotlinx.coroutines.internal.c) dVar;
            d<T> dVar2 = cVar.f6777s;
            f b10 = dVar2.b();
            Object c10 = m.c(b10, cVar.u);
            c1<?> a10 = c10 != m.f6795a ? r.a(dVar2, b10, c10) : null;
            try {
                cVar.f6777s.h(s10);
                i iVar = i.f7501a;
            } finally {
                if (a10 == null || a10.S()) {
                    m.a(b10, c10);
                }
            }
        } else {
            dVar.h(s10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0080 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long q(java.lang.String r21, long r22, long r24, long r26) {
        /*
            r0 = r21
            r1 = r24
            r3 = r26
            int r5 = kotlinx.coroutines.internal.l.f6794a
            java.lang.String r6 = java.lang.System.getProperty(r21)     // Catch:{ SecurityException -> 0x000d }
            goto L_0x000e
        L_0x000d:
            r6 = 0
        L_0x000e:
            if (r6 != 0) goto L_0x0014
            r5 = r22
            goto L_0x00a7
        L_0x0014:
            r7 = 10
            e(r7)
            int r8 = r6.length()
            r9 = 0
            r10 = 1
            if (r8 != 0) goto L_0x0022
            goto L_0x0078
        L_0x0022:
            char r11 = r6.charAt(r9)
            r12 = 48
            int r12 = z8.g.h(r11, r12)
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r12 >= 0) goto L_0x0045
            if (r8 != r10) goto L_0x0036
            goto L_0x0078
        L_0x0036:
            r12 = 45
            if (r11 != r12) goto L_0x003e
            r13 = -9223372036854775808
            r11 = r10
            goto L_0x0046
        L_0x003e:
            r12 = 43
            if (r11 != r12) goto L_0x0078
            r12 = r9
            r11 = r10
            goto L_0x0047
        L_0x0045:
            r11 = r9
        L_0x0046:
            r12 = r11
        L_0x0047:
            r15 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r17 = 0
            r9 = r17
            r17 = r15
        L_0x0052:
            if (r11 >= r8) goto L_0x0080
            char r5 = r6.charAt(r11)
            int r5 = java.lang.Character.digit(r5, r7)
            if (r5 >= 0) goto L_0x005f
            goto L_0x0078
        L_0x005f:
            int r19 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r19 >= 0) goto L_0x006f
            int r17 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r17 != 0) goto L_0x0078
            long r3 = (long) r7
            long r17 = r13 / r3
            int r3 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r3 >= 0) goto L_0x006f
            goto L_0x0078
        L_0x006f:
            long r3 = (long) r7
            long r9 = r9 * r3
            long r3 = (long) r5
            long r19 = r13 + r3
            int r5 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r5 >= 0) goto L_0x007a
        L_0x0078:
            r5 = 0
            goto L_0x008c
        L_0x007a:
            long r9 = r9 - r3
            int r11 = r11 + 1
            r3 = r26
            goto L_0x0052
        L_0x0080:
            if (r12 == 0) goto L_0x0087
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            goto L_0x008c
        L_0x0087:
            long r3 = -r9
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
        L_0x008c:
            r3 = 39
            java.lang.String r4 = "System property '"
            if (r5 == 0) goto L_0x00d9
            long r5 = r5.longValue()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x00a2
            r7 = r26
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x00a4
            r9 = 1
            goto L_0x00a5
        L_0x00a2:
            r7 = r26
        L_0x00a4:
            r9 = 0
        L_0x00a5:
            if (r9 == 0) goto L_0x00a8
        L_0x00a7:
            return r5
        L_0x00a8:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r4)
            r9.append(r0)
            java.lang.String r0 = "' should be in range "
            r9.append(r0)
            r9.append(r1)
            java.lang.String r0 = ".."
            r9.append(r0)
            r9.append(r7)
            java.lang.String r0 = ", but is '"
            r9.append(r0)
            r9.append(r5)
            r9.append(r3)
            java.lang.String r0 = r9.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x00d9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            r1.append(r0)
            java.lang.String r0 = "' has unrecognized value '"
            r1.append(r0)
            r1.append(r6)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.u.q(java.lang.String, long, long, long):long");
    }

    public static int r(String str, int i10, int i11, int i12, int i13) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return (int) q(str, (long) i10, (long) i11, (long) i12);
    }

    public static final String s(byte b10) {
        char[] cArr = f8110i0;
        return new String(new char[]{cArr[(b10 >> 4) & 15], cArr[b10 & 15]});
    }

    public static final Map t(LinkedHashMap linkedHashMap) {
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        g.e(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    public Object f(a aVar, float f10) {
        return Integer.valueOf(Math.round(r1.m.d(aVar) * f10));
    }

    public Object j(s sVar) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0$AnalyticsConnectorRegistrar(sVar);
    }
}

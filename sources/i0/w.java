package i0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import com.karumi.dexter.R;
import i0.a;
import i0.e;
import i0.e0;
import j0.b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap<View, b0> f6004a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Field f6005b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f6006c = false;
    public static final int[] d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e  reason: collision with root package name */
    public static final s f6007e = new s();

    /* renamed from: f  reason: collision with root package name */
    public static final a f6008f = new a();

    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: o  reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f6009o = new WeakHashMap<>();

        public final void onGlobalLayout() {
            boolean z;
            int i10;
            if (Build.VERSION.SDK_INT < 28) {
                WeakHashMap<View, Boolean> weakHashMap = this.f6009o;
                for (Map.Entry next : weakHashMap.entrySet()) {
                    View view = (View) next.getKey();
                    boolean booleanValue = ((Boolean) next.getValue()).booleanValue();
                    if (view.getVisibility() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (booleanValue != z) {
                        if (z) {
                            i10 = 16;
                        } else {
                            i10 = 32;
                        }
                        w.f(view, i10);
                        weakHashMap.put(view, Boolean.valueOf(z));
                    }
                }
            }
        }

        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public static abstract class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f6010a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<T> f6011b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6012c;
        public final int d;

        public b(int i10, Class<T> cls, int i11, int i12) {
            this.f6010a = i10;
            this.f6011b = cls;
            this.d = i11;
            this.f6012c = i12;
        }

        public static boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public abstract T b(View view);

        public abstract void c(View view, T t10);

        public final T d(View view) {
            boolean z;
            if (Build.VERSION.SDK_INT >= this.f6012c) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return b(view);
            }
            T tag = view.getTag(this.f6010a);
            if (this.f6011b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public final void e(View view, T t10) {
            boolean z;
            a aVar;
            if (Build.VERSION.SDK_INT >= this.f6012c) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c(view, t10);
            } else if (f(d(view), t10)) {
                View.AccessibilityDelegate c10 = w.c(view);
                if (c10 == null) {
                    aVar = null;
                } else if (c10 instanceof a.C0078a) {
                    aVar = ((a.C0078a) c10).f5953a;
                } else {
                    aVar = new a(c10);
                }
                if (aVar == null) {
                    aVar = new a();
                }
                w.k(view, aVar);
                view.setTag(this.f6010a, t10);
                w.f(view, this.d);
            }
        }

        public abstract boolean f(T t10, T t11);
    }

    public static class c {
        public static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    public static class d {
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        public static int d(View view) {
            return view.getMinimumHeight();
        }

        public static int e(View view) {
            return view.getMinimumWidth();
        }

        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        public static boolean i(View view) {
            return view.hasTransientState();
        }

        public static boolean j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long j8) {
            view.postOnAnimationDelayed(runnable, j8);
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public static void r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        public static void s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    public static class e {
        public static int a() {
            return View.generateViewId();
        }

        public static Display b(View view) {
            return view.getDisplay();
        }

        public static int c(View view) {
            return view.getLabelFor();
        }

        public static int d(View view) {
            return view.getLayoutDirection();
        }

        public static int e(View view) {
            return view.getPaddingEnd();
        }

        public static int f(View view) {
            return view.getPaddingStart();
        }

        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        public static void h(View view, int i10) {
            view.setLabelFor(i10);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        public static void k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    public static class f {
        public static Rect a(View view) {
            return view.getClipBounds();
        }

        public static boolean b(View view) {
            return view.isInLayout();
        }

        public static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    public static class g {
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        public static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        public static boolean c(View view) {
            return view.isLaidOut();
        }

        public static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        public static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        public static void f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    public static class h {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    public static class i {

        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            public e0 f6013a = null;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ View f6014b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ o f6015c;

            public a(View view, o oVar) {
                this.f6014b = view;
                this.f6015c = oVar;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                e0 g10 = e0.g(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                o oVar = this.f6015c;
                if (i10 < 30) {
                    i.a(windowInsets, this.f6014b);
                    if (g10.equals(this.f6013a)) {
                        return oVar.a(view, g10).f();
                    }
                }
                this.f6013a = g10;
                e0 a10 = oVar.a(view, g10);
                if (i10 >= 30) {
                    return a10.f();
                }
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                h.c(view);
                return a10.f();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static e0 b(View view, e0 e0Var, Rect rect) {
            WindowInsets f10 = e0Var.f();
            if (f10 != null) {
                return e0.g(view.computeSystemWindowInsets(f10, rect), view);
            }
            rect.setEmpty();
            return e0Var;
        }

        public static boolean c(View view, float f10, float f11, boolean z) {
            return view.dispatchNestedFling(f10, f11, z);
        }

        public static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        public static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        public static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static e0 j(View view) {
            e0.e eVar;
            if (e0.a.d && view.isAttachedToWindow()) {
                try {
                    Object obj = e0.a.f5970a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) e0.a.f5971b.get(obj);
                        Rect rect2 = (Rect) e0.a.f5972c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            int i10 = Build.VERSION.SDK_INT;
                            if (i10 >= 30) {
                                eVar = new e0.d();
                            } else if (i10 >= 29) {
                                eVar = new e0.c();
                            } else {
                                eVar = new e0.b();
                            }
                            eVar.c(b0.b.a(rect.left, rect.top, rect.right, rect.bottom));
                            eVar.d(b0.b.a(rect2.left, rect2.top, rect2.right, rect2.bottom));
                            e0 b10 = eVar.b();
                            b10.f5969a.m(b10);
                            b10.f5969a.d(view.getRootView());
                            return b10;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                }
            }
            return null;
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f10) {
            view.setElevation(f10);
        }

        public static void t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        public static void u(View view, o oVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, oVar);
            }
            if (oVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, oVar));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        public static void x(View view, float f10) {
            view.setZ(f10);
        }

        public static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    public static class j {
        public static e0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            e0 g10 = e0.g(rootWindowInsets, (View) null);
            e0.k kVar = g10.f5969a;
            kVar.m(g10);
            kVar.d(view.getRootView());
            return g10;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        public static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    public static class k {
        public static void a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        public static int b(View view) {
            return view.getImportantForAutofill();
        }

        public static int c(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View h(View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        public static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        public static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void k(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        public static void l(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        public static void m(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        public static void n(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        public static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static class l {
        public static void a(View view, q qVar) {
            n.i iVar = (n.i) view.getTag(R.id.tag_unhandled_key_listeners);
            if (iVar == null) {
                iVar = new n.i();
                view.setTag(R.id.tag_unhandled_key_listeners, iVar);
            }
            Objects.requireNonNull(qVar);
            x xVar = new x(qVar);
            iVar.put(qVar, xVar);
            view.addOnUnhandledKeyEventListener(xVar);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, q qVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            n.i iVar = (n.i) view.getTag(R.id.tag_unhandled_key_listeners);
            if (iVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) iVar.getOrDefault(qVar, null)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        public static <T> T f(View view, int i10) {
            return view.requireViewById(i10);
        }

        public static void g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    public static class m {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    public static class n {
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public static final class o {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static e b(View view, e eVar) {
            ContentInfo c10 = eVar.f5957a.c();
            ContentInfo d = view.performReceiveContent(c10);
            if (d == null) {
                return null;
            }
            if (d == c10) {
                return eVar;
            }
            return new e(new e.d(d));
        }

        public static void c(View view, String[] strArr, p pVar) {
            if (pVar == null) {
                view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
            } else {
                view.setOnReceiveContentListener(strArr, new p(pVar));
            }
        }
    }

    public static final class p implements OnReceiveContentListener {

        /* renamed from: a  reason: collision with root package name */
        public final p f6016a;

        public p(p pVar) {
            this.f6016a = pVar;
        }

        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            e eVar = new e(new e.d(contentInfo));
            e a10 = this.f6016a.a(view, eVar);
            if (a10 == null) {
                return null;
            }
            if (a10 == eVar) {
                return contentInfo;
            }
            return a10.f5957a.c();
        }
    }

    public interface q {
        boolean a();
    }

    public static class r {
        public static final ArrayList<WeakReference<View>> d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        public WeakHashMap<View, Boolean> f6017a = null;

        /* renamed from: b  reason: collision with root package name */
        public SparseArray<WeakReference<View>> f6018b = null;

        /* renamed from: c  reason: collision with root package name */
        public WeakReference<KeyEvent> f6019c = null;

        public static boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((q) arrayList.get(size)).a()) {
                    return true;
                }
            }
            return false;
        }

        public final View a(View view, KeyEvent keyEvent) {
            View a10;
            WeakHashMap<View, Boolean> weakHashMap = this.f6017a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        a10 = a(viewGroup.getChildAt(childCount), keyEvent);
                    }
                } while (a10 == null);
                return a10;
            }
            if (b(view, keyEvent)) {
                return view;
            }
            return null;
        }
    }

    static {
        new AtomicInteger(1);
    }

    public static b0 a(View view) {
        if (f6004a == null) {
            f6004a = new WeakHashMap<>();
        }
        b0 b0Var = f6004a.get(view);
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0(view);
        f6004a.put(view, b0Var2);
        return b0Var2;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = r.d;
        r rVar = (r) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (rVar == null) {
            rVar = new r();
            view.setTag(R.id.tag_unhandled_key_event_manager, rVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = rVar.f6017a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = r.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (rVar.f6017a == null) {
                        rVar.f6017a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = r.d;
                        View view2 = (View) arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            rVar.f6017a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                rVar.f6017a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a10 = rVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a10 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (rVar.f6018b == null) {
                    rVar.f6018b = new SparseArray<>();
                }
                rVar.f6018b.put(keyCode, new WeakReference(a10));
            }
        }
        if (a10 != null) {
            return true;
        }
        return false;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return m.a(view);
        }
        if (f6006c) {
            return null;
        }
        if (f6005b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f6005b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f6006c = true;
                return null;
            }
        }
        Object obj = f6005b.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    public static ArrayList d(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] e(View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void f(View view, int i10) {
        boolean z;
        Object obj;
        boolean z10;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i11 = Build.VERSION.SDK_INT;
            boolean z11 = true;
            boolean z12 = false;
            if (i11 >= 28) {
                z = true;
            } else {
                z = false;
            }
            Object obj2 = null;
            Class<CharSequence> cls = CharSequence.class;
            if (z) {
                obj = l.b(view);
            } else {
                obj = view.getTag(R.id.tag_accessibility_pane_title);
                if (!cls.isInstance(obj)) {
                    obj = null;
                }
            }
            if (((CharSequence) obj) == null || view.getVisibility() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            int i12 = 32;
            if (g.a(view) != 0 || z10) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z10) {
                    i12 = 2048;
                }
                obtain.setEventType(i12);
                g.g(obtain, i10);
                if (z10) {
                    List<CharSequence> text = obtain.getText();
                    if (i11 >= 28) {
                        z12 = true;
                    }
                    if (z12) {
                        obj2 = l.b(view);
                    } else {
                        Object tag = view.getTag(R.id.tag_accessibility_pane_title);
                        if (cls.isInstance(tag)) {
                            obj2 = tag;
                        }
                    }
                    text.add((CharSequence) obj2);
                    if (d.c(view) == 0) {
                        d.s(view, 1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            break;
                        } else if (d.c((View) parent) == 4) {
                            d.s(view, 2);
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i10 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                g.g(obtain2, i10);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                List<CharSequence> text2 = obtain2.getText();
                if (i11 < 28) {
                    z11 = false;
                }
                if (z11) {
                    obj2 = l.b(view);
                } else {
                    Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                    if (cls.isInstance(tag2)) {
                        obj2 = tag2;
                    }
                }
                text2.add((CharSequence) obj2);
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    g.e(view.getParent(), view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e10);
                }
            }
        }
    }

    public static e g(View view, e eVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + eVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, eVar);
        }
        p pVar = (p) view.getTag(R.id.tag_on_receive_content_listener);
        q qVar = f6007e;
        if (pVar != null) {
            e a10 = pVar.a(view, eVar);
            if (a10 == null) {
                return null;
            }
            if (view instanceof q) {
                qVar = (q) view;
            }
            return qVar.a(a10);
        }
        if (view instanceof q) {
            qVar = (q) view;
        }
        return qVar.a(eVar);
    }

    public static void h(View view, int i10) {
        ArrayList d10 = d(view);
        for (int i11 = 0; i11 < d10.size(); i11++) {
            if (((b.a) d10.get(i11)).a() == i10) {
                d10.remove(i11);
                return;
            }
        }
    }

    public static void i(View view, b.a aVar, j0.d dVar) {
        a aVar2;
        if (dVar == null) {
            h(view, aVar.a());
            f(view, 0);
            return;
        }
        b.a aVar3 = new b.a((Object) null, aVar.f6397b, (String) null, dVar, aVar.f6398c);
        View.AccessibilityDelegate c10 = c(view);
        if (c10 == null) {
            aVar2 = null;
        } else if (c10 instanceof a.C0078a) {
            aVar2 = ((a.C0078a) c10).f5953a;
        } else {
            aVar2 = new a(c10);
        }
        if (aVar2 == null) {
            aVar2 = new a();
        }
        k(view, aVar2);
        h(view, aVar3.a());
        d(view).add(aVar3);
        f(view, 0);
    }

    public static void j(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.c(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void k(View view, a aVar) {
        a.C0078a aVar2;
        if (aVar == null && (c(view) instanceof a.C0078a)) {
            aVar = new a();
        }
        if (aVar == null) {
            aVar2 = null;
        } else {
            aVar2 = aVar.f5952b;
        }
        view.setAccessibilityDelegate(aVar2);
    }

    public static void l(View view, CharSequence charSequence) {
        boolean z;
        new u().e(view, charSequence);
        a aVar = f6008f;
        if (charSequence != null) {
            WeakHashMap<View, Boolean> weakHashMap = aVar.f6009o;
            if (view.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(aVar);
            if (g.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
                return;
            }
            return;
        }
        aVar.f6009o.remove(view);
        view.removeOnAttachStateChangeListener(aVar);
        d.o(view.getViewTreeObserver(), aVar);
    }
}

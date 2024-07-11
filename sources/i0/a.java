package i0;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.karumi.dexter.R;
import i0.w;
import j0.b;
import j0.c;
import j0.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f5950c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f5951a;

    /* renamed from: b  reason: collision with root package name */
    public final C0078a f5952b;

    /* renamed from: i0.a$a  reason: collision with other inner class name */
    public static final class C0078a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final a f5953a;

        public C0078a(a aVar) {
            this.f5953a = aVar;
        }

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f5953a.a(view, accessibilityEvent);
        }

        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            c b10 = this.f5953a.b(view);
            if (b10 != null) {
                return (AccessibilityNodeProvider) b10.f6400a;
            }
            return null;
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f5953a.c(view, accessibilityEvent);
        }

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            boolean z;
            Object obj;
            boolean z10;
            boolean z11;
            Object obj2;
            boolean z12;
            boolean z13;
            Object obj3;
            boolean z14;
            Object obj4;
            int i10;
            View view2 = view;
            AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfo;
            b bVar = new b(accessibilityNodeInfo2);
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            boolean z15 = true;
            int i11 = 0;
            if (Build.VERSION.SDK_INT >= 28) {
                z = true;
            } else {
                z = false;
            }
            Class<Boolean> cls = Boolean.class;
            ClickableSpan[] clickableSpanArr = null;
            if (z) {
                obj = Boolean.valueOf(w.l.d(view));
            } else {
                obj = view2.getTag(R.id.tag_screen_reader_focusable);
                if (!cls.isInstance(obj)) {
                    obj = null;
                }
            }
            Boolean bool = (Boolean) obj;
            if (bool == null || !bool.booleanValue()) {
                z10 = false;
            } else {
                z10 = true;
            }
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 28) {
                accessibilityNodeInfo2.setScreenReaderFocusable(z10);
            } else {
                bVar.f(1, z10);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                obj2 = Boolean.valueOf(w.l.c(view));
            } else {
                obj2 = view2.getTag(R.id.tag_accessibility_heading);
                if (!cls.isInstance(obj2)) {
                    obj2 = null;
                }
            }
            Boolean bool2 = (Boolean) obj2;
            if (bool2 == null || !bool2.booleanValue()) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (i12 >= 28) {
                accessibilityNodeInfo2.setHeading(z12);
            } else {
                bVar.f(2, z12);
            }
            if (i12 >= 28) {
                z13 = true;
            } else {
                z13 = false;
            }
            Class<CharSequence> cls2 = CharSequence.class;
            if (z13) {
                obj3 = w.l.b(view);
            } else {
                obj3 = view2.getTag(R.id.tag_accessibility_pane_title);
                if (!cls2.isInstance(obj3)) {
                    obj3 = null;
                }
            }
            CharSequence charSequence = (CharSequence) obj3;
            if (i12 >= 28) {
                accessibilityNodeInfo2.setPaneTitle(charSequence);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
            }
            if (i12 >= 30) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                obj4 = w.n.a(view);
            } else {
                obj4 = view2.getTag(R.id.tag_state_description);
                if (!cls2.isInstance(obj4)) {
                    obj4 = null;
                }
            }
            CharSequence charSequence2 = (CharSequence) obj4;
            if (i12 < 30) {
                z15 = false;
            }
            if (z15) {
                accessibilityNodeInfo2.setStateDescription(charSequence2);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence2);
            }
            this.f5953a.d(view2, bVar);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i12 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view2.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                        if (((WeakReference) sparseArray.valueAt(i13)).get() == null) {
                            arrayList.add(Integer.valueOf(i13));
                        }
                    }
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        sparseArray.remove(((Integer) arrayList.get(i14)).intValue());
                    }
                }
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                }
                if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                    bVar.f6386a.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view2.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view2.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    int i15 = 0;
                    while (i15 < clickableSpanArr.length) {
                        ClickableSpan clickableSpan = clickableSpanArr[i15];
                        int i16 = i11;
                        while (true) {
                            if (i16 >= sparseArray2.size()) {
                                i10 = b.d;
                                b.d = i10 + 1;
                                break;
                            } else if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i16)).get())) {
                                i10 = sparseArray2.keyAt(i16);
                                break;
                            } else {
                                i16++;
                            }
                        }
                        sparseArray2.put(i10, new WeakReference(clickableSpanArr[i15]));
                        ClickableSpan clickableSpan2 = clickableSpanArr[i15];
                        Spanned spanned = (Spanned) text;
                        bVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        bVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        bVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        bVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
                        i15++;
                        i11 = 0;
                    }
                }
            }
            List list = (List) view2.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i17 = 0; i17 < list.size(); i17++) {
                bVar.b((b.a) list.get(i17));
            }
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f5953a.e(view, accessibilityEvent);
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f5953a.f(viewGroup, view, accessibilityEvent);
        }

        public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f5953a.g(view, i10, bundle);
        }

        public final void sendAccessibilityEvent(View view, int i10) {
            this.f5953a.h(view, i10);
        }

        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f5953a.i(view, accessibilityEvent);
        }
    }

    public a() {
        this(f5950c);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f5951a = accessibilityDelegate;
        this.f5952b = new C0078a(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f5951a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public c b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f5951a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new c(accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f5951a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, b bVar) {
        this.f5951a.onInitializeAccessibilityNodeInfo(view, bVar.f6386a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f5951a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f5951a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i10, Bundle bundle) {
        boolean z;
        WeakReference weakReference;
        boolean z10;
        ClickableSpan[] clickableSpanArr;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= list.size()) {
                break;
            }
            b.a aVar = (b.a) list.get(i11);
            if (aVar.a() == i10) {
                d dVar = aVar.d;
                if (dVar != null) {
                    Class<? extends d.a> cls = aVar.f6398c;
                    if (cls != null) {
                        try {
                            ((d.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).getClass();
                        } catch (Exception e10) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e10);
                        }
                    }
                    z = dVar.a(view);
                }
            } else {
                i11++;
            }
        }
        z = false;
        if (!z) {
            z = this.f5951a.performAccessibilityAction(view, i10, bundle);
        }
        if (z || i10 != R.id.accessibility_action_clickable_span) {
            return z;
        }
        int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (!(sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i12)) == null)) {
            ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
            if (clickableSpan != null) {
                CharSequence text = view.createAccessibilityNodeInfo().getText();
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                } else {
                    clickableSpanArr = null;
                }
                int i13 = 0;
                while (true) {
                    if (clickableSpanArr == null || i13 >= clickableSpanArr.length) {
                        break;
                    } else if (clickableSpan.equals(clickableSpanArr[i13])) {
                        z10 = true;
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            z10 = false;
            if (z10) {
                clickableSpan.onClick(view);
                z11 = true;
            }
        }
        return z11;
    }

    public void h(View view, int i10) {
        this.f5951a.sendAccessibilityEvent(view, i10);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f5951a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}

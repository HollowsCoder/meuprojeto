package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.R;
import i0.w;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends o0 implements h.b {

    /* renamed from: u0  reason: collision with root package name */
    public static final n f429u0 = (Build.VERSION.SDK_INT < 29 ? new n() : null);
    public final SearchAutoComplete D;
    public final View E;
    public final View F;
    public final View G;
    public final ImageView H;
    public final ImageView I;
    public final ImageView J;
    public final ImageView K;
    public final View L;
    public p M;
    public final Rect N;
    public final Rect O;
    public final int[] P;
    public final int[] Q;
    public final ImageView R;
    public final Drawable S;
    public final int T;
    public final int U;
    public final Intent V;
    public final Intent W;

    /* renamed from: a0  reason: collision with root package name */
    public final CharSequence f430a0;

    /* renamed from: b0  reason: collision with root package name */
    public View.OnFocusChangeListener f431b0;

    /* renamed from: c0  reason: collision with root package name */
    public View.OnClickListener f432c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f433d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f434e0;

    /* renamed from: f0  reason: collision with root package name */
    public m0.a f435f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f436g0;

    /* renamed from: h0  reason: collision with root package name */
    public CharSequence f437h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f438i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f439j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f440k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f441l0;

    /* renamed from: m0  reason: collision with root package name */
    public CharSequence f442m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f443n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f444o0;

    /* renamed from: p0  reason: collision with root package name */
    public SearchableInfo f445p0;

    /* renamed from: q0  reason: collision with root package name */
    public Bundle f446q0;

    /* renamed from: r0  reason: collision with root package name */
    public final b f447r0;

    /* renamed from: s0  reason: collision with root package name */
    public final c f448s0;
    public final WeakHashMap<String, Drawable.ConstantState> t0;

    public static class SearchAutoComplete extends d {

        /* renamed from: s  reason: collision with root package name */
        public int f449s = getThreshold();

        /* renamed from: t  reason: collision with root package name */
        public SearchView f450t;
        public boolean u;

        /* renamed from: v  reason: collision with root package name */
        public final a f451v = new a();

        public class a implements Runnable {
            public a() {
            }

            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.u) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.u = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, 0);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            n nVar = SearchView.f429u0;
            nVar.getClass();
            n.a();
            Method method = nVar.f465c;
            if (method != null) {
                try {
                    method.invoke(this, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }

        public final boolean enoughToFilter() {
            return this.f449s <= 0 || super.enoughToFilter();
        }

        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.u) {
                a aVar = this.f451v;
                removeCallbacks(aVar);
                post(aVar);
            }
            return onCreateInputConnection;
        }

        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public final void onFocusChanged(boolean z, int i10, Rect rect) {
            super.onFocusChanged(z, i10, rect);
            SearchView searchView = this.f450t;
            searchView.w(searchView.f434e0);
            searchView.post(searchView.f447r0);
            if (searchView.D.hasFocus()) {
                searchView.l();
            }
        }

        public final boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f450t.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f450t.hasFocus() && getVisibility() == 0) {
                boolean z10 = true;
                this.u = true;
                Context context = getContext();
                n nVar = SearchView.f429u0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z10 = false;
                }
                if (z10) {
                    a();
                }
            }
        }

        public final void performCompletion() {
        }

        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            a aVar = this.f451v;
            if (!z) {
                this.u = false;
                removeCallbacks(aVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.u = false;
                removeCallbacks(aVar);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.u = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f450t = searchView;
        }

        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f449s = i10;
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.D.getText();
            searchView.f442m0 = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.v(z);
            boolean z10 = !z;
            int i13 = 8;
            if (searchView.f441l0 && !searchView.f434e0 && z10) {
                searchView.I.setVisibility(8);
                i13 = 0;
            }
            searchView.K.setVisibility(i13);
            searchView.r();
            searchView.u();
            charSequence.toString();
            searchView.getClass();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            SearchView.this.s();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            m0.a aVar = SearchView.this.f435f0;
            if (aVar instanceof y0) {
                aVar.c((Cursor) null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        public final void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f431b0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView searchView = SearchView.this;
            View view2 = searchView.L;
            if (view2.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.F.getPaddingLeft();
                Rect rect = new Rect();
                boolean a10 = m1.a(searchView);
                int dimensionPixelSize = searchView.f433d0 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                SearchAutoComplete searchAutoComplete = searchView.D;
                searchAutoComplete.getDropDownBackground().getPadding(rect);
                searchAutoComplete.setDropDownHorizontalOffset(a10 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        public final void onClick(View view) {
            String str;
            SearchView searchView = SearchView.this;
            ImageView imageView = searchView.H;
            SearchAutoComplete searchAutoComplete = searchView.D;
            if (view == imageView) {
                searchView.w(false);
                searchAutoComplete.requestFocus();
                searchAutoComplete.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.f432c0;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                }
            } else if (view == searchView.J) {
                searchView.m();
            } else if (view == searchView.I) {
                searchView.q();
            } else if (view == searchView.K) {
                SearchableInfo searchableInfo = searchView.f445p0;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.V);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            if (searchActivity == null) {
                                str = null;
                            } else {
                                str = searchActivity.flattenToShortString();
                            }
                            intent.putExtra("calling_package", str);
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.k(searchView.W, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                        Log.w("SearchView", "Could not find voice search activity");
                    }
                }
            } else if (view == searchAutoComplete) {
                searchView.l();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
            boolean z;
            int i11;
            SearchView searchView = SearchView.this;
            if (searchView.f445p0 == null) {
                return false;
            }
            SearchAutoComplete searchAutoComplete = searchView.D;
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                    return false;
                }
                view.cancelLongPress();
                searchView.getContext().startActivity(searchView.j("android.intent.action.SEARCH", (Uri) null, (String) null, searchAutoComplete.getText().toString()));
                return true;
            } else if (searchView.f445p0 == null || searchView.f435f0 == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            } else {
                if (i10 == 66 || i10 == 84 || i10 == 61) {
                    searchView.n(searchAutoComplete.getListSelection());
                } else if (i10 == 21 || i10 == 22) {
                    if (i10 == 21) {
                        i11 = 0;
                    } else {
                        i11 = searchAutoComplete.length();
                    }
                    searchAutoComplete.setSelection(i11);
                    searchAutoComplete.setListSelection(0);
                    searchAutoComplete.clearListSelection();
                    searchAutoComplete.a();
                } else if (i10 != 19) {
                    return false;
                } else {
                    searchAutoComplete.getListSelection();
                    return false;
                }
                return true;
            }
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.q();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j8) {
            SearchView.this.n(i10);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j8) {
            SearchView.this.o(i10);
        }

        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public interface k {
    }

    public interface l {
    }

    public interface m {
    }

    public static class n {

        /* renamed from: a  reason: collision with root package name */
        public final Method f463a = null;

        /* renamed from: b  reason: collision with root package name */
        public final Method f464b = null;

        /* renamed from: c  reason: collision with root package name */
        public final Method f465c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public n() {
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            a();
            try {
                Method declaredMethod = cls.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f463a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = cls.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f464b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f465c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    public static class o extends n0.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: q  reason: collision with root package name */
        public boolean f466q;

        public class a implements Parcelable.ClassLoaderCreator<o> {
            public final Object createFromParcel(Parcel parcel) {
                return new o(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i10) {
                return new o[i10];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f466q = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        public o(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f466q + "}";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f7340o, i10);
            parcel.writeValue(Boolean.valueOf(this.f466q));
        }
    }

    public static class p extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final View f467a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f468b;

        /* renamed from: c  reason: collision with root package name */
        public final Rect f469c;
        public final Rect d;

        /* renamed from: e  reason: collision with root package name */
        public final int f470e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f471f;

        public p(Rect rect, Rect rect2, SearchAutoComplete searchAutoComplete) {
            super(rect, searchAutoComplete);
            int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
            this.f470e = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.f468b = rect3;
            Rect rect4 = new Rect();
            this.d = rect4;
            Rect rect5 = new Rect();
            this.f469c = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i10 = -scaledTouchSlop;
            rect4.inset(i10, i10);
            rect5.set(rect2);
            this.f467a = searchAutoComplete;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouchEvent(android.view.MotionEvent r9) {
            /*
                r8 = this;
                float r0 = r9.getX()
                int r0 = (int) r0
                float r1 = r9.getY()
                int r1 = (int) r1
                int r2 = r9.getAction()
                r3 = 2
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L_0x0033
                if (r2 == r5) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003f
            L_0x001b:
                boolean r2 = r8.f471f
                r8.f471f = r4
                goto L_0x002f
            L_0x0020:
                boolean r2 = r8.f471f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r8.d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r5 = r2
                r2 = r4
                goto L_0x0041
            L_0x002f:
                r7 = r5
                r5 = r2
                r2 = r7
                goto L_0x0041
            L_0x0033:
                android.graphics.Rect r2 = r8.f468b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003f
                r8.f471f = r5
                r2 = r5
                goto L_0x0041
            L_0x003f:
                r2 = r5
                r5 = r4
            L_0x0041:
                if (r5 == 0) goto L_0x006a
                android.graphics.Rect r4 = r8.f469c
                android.view.View r5 = r8.f467a
                if (r2 == 0) goto L_0x005b
                boolean r2 = r4.contains(r0, r1)
                if (r2 != 0) goto L_0x005b
                int r0 = r5.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                int r1 = r5.getHeight()
                int r1 = r1 / r3
                goto L_0x0062
            L_0x005b:
                int r2 = r4.left
                int r0 = r0 - r2
                float r0 = (float) r0
                int r2 = r4.top
                int r1 = r1 - r2
            L_0x0062:
                float r1 = (float) r1
                r9.setLocation(r0, r1)
                boolean r4 = r5.dispatchTouchEvent(r9)
            L_0x006a:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Context context2 = context;
        this.N = new Rect();
        this.O = new Rect();
        this.P = new int[2];
        this.Q = new int[2];
        this.f447r0 = new b();
        this.f448s0 = new c();
        this.t0 = new WeakHashMap<>();
        f fVar = new f();
        g gVar = new g();
        h hVar = new h();
        i iVar = new i();
        j jVar = new j();
        a aVar = new a();
        int[] iArr = androidx.databinding.a.T;
        AttributeSet attributeSet2 = attributeSet;
        int i11 = i10;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i11, 0);
        e1 e1Var = new e1(context2, obtainStyledAttributes);
        w.j(this, context, iArr, attributeSet2, obtainStyledAttributes, i11);
        LayoutInflater.from(context).inflate(e1Var.i(9, R.layout.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.D = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.E = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.F = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.G = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.H = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.I = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.J = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.K = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.R = imageView5;
        w.d.q(findViewById, e1Var.e(10));
        w.d.q(findViewById2, e1Var.e(14));
        imageView.setImageDrawable(e1Var.e(13));
        imageView2.setImageDrawable(e1Var.e(7));
        imageView3.setImageDrawable(e1Var.e(4));
        imageView4.setImageDrawable(e1Var.e(16));
        imageView5.setImageDrawable(e1Var.e(13));
        this.S = e1Var.e(12);
        i1.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.T = e1Var.i(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.U = e1Var.i(5, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(aVar);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(gVar);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(e1Var.a(8, true));
        int d10 = e1Var.d(1, -1);
        if (d10 != -1) {
            setMaxWidth(d10);
        }
        this.f430a0 = e1Var.k(6);
        this.f437h0 = e1Var.k(11);
        int h10 = e1Var.h(3, -1);
        if (h10 != -1) {
            setImeOptions(h10);
        }
        int h11 = e1Var.h(2, -1);
        if (h11 != -1) {
            setInputType(h11);
        }
        setFocusable(e1Var.a(0, true));
        e1Var.n();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.V = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.W = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.L = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        w(this.f433d0);
        t();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.D;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final void clearFocus() {
        this.f439j0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.D;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f439j0 = false;
    }

    public int getImeOptions() {
        return this.D.getImeOptions();
    }

    public int getInputType() {
        return this.D.getInputType();
    }

    public int getMaxWidth() {
        return this.f440k0;
    }

    public CharSequence getQuery() {
        return this.D.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f437h0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f445p0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f430a0 : getContext().getText(this.f445p0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.U;
    }

    public int getSuggestionRowLayout() {
        return this.T;
    }

    public m0.a getSuggestionsAdapter() {
        return this.f435f0;
    }

    public final Intent j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f442m0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f446q0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f445p0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f446q0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() {
        int i10 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.D;
        if (i10 >= 29) {
            searchAutoComplete.refreshAutoCompleteResults();
            return;
        }
        n nVar = f429u0;
        nVar.getClass();
        n.a();
        Method method = nVar.f463a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        nVar.getClass();
        n.a();
        Method method2 = nVar.f464b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchAutoComplete searchAutoComplete = this.D;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText(BuildConfig.FLAVOR);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f433d0) {
            clearFocus();
            w(true);
        }
    }

    public final void n(int i10) {
        int i11;
        Uri uri;
        String i12;
        Cursor cursor = this.f435f0.f7019q;
        if (cursor != null && cursor.moveToPosition(i10)) {
            Intent intent = null;
            try {
                int i13 = y0.L;
                String i14 = y0.i(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (i14 == null) {
                    i14 = this.f445p0.getSuggestIntentAction();
                }
                if (i14 == null) {
                    i14 = "android.intent.action.SEARCH";
                }
                String i15 = y0.i(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (i15 == null) {
                    i15 = this.f445p0.getSuggestIntentData();
                }
                if (!(i15 == null || (i12 = y0.i(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) == null)) {
                    i15 = i15 + "/" + Uri.encode(i12);
                }
                if (i15 == null) {
                    uri = null;
                } else {
                    uri = Uri.parse(i15);
                }
                intent = j(i14, uri, y0.i(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), y0.i(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e10) {
                try {
                    i11 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i11 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e11) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e11);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.D;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void o(int i10) {
        String d10;
        Editable text = this.D.getText();
        Cursor cursor = this.f435f0.f7019q;
        if (cursor != null) {
            if (!cursor.moveToPosition(i10) || (d10 = this.f435f0.d(cursor)) == null) {
                setQuery(text);
            } else {
                setQuery(d10);
            }
        }
    }

    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.D;
        searchAutoComplete.setText(BuildConfig.FLAVOR);
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f442m0 = BuildConfig.FLAVOR;
        clearFocus();
        w(true);
        searchAutoComplete.setImeOptions(this.f444o0);
        this.f443n0 = false;
    }

    public final void onActionViewExpanded() {
        if (!this.f443n0) {
            this.f443n0 = true;
            SearchAutoComplete searchAutoComplete = this.D;
            int imeOptions = searchAutoComplete.getImeOptions();
            this.f444o0 = imeOptions;
            searchAutoComplete.setImeOptions(imeOptions | 33554432);
            searchAutoComplete.setText(BuildConfig.FLAVOR);
            setIconified(false);
        }
    }

    public final void onDetachedFromWindow() {
        removeCallbacks(this.f447r0);
        post(this.f448s0);
        super.onDetachedFromWindow();
    }

    public final void onLayout(boolean z, int i10, int i11, int i12, int i13) {
        super.onLayout(z, i10, i11, i12, i13);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.D;
            int[] iArr = this.P;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.Q;
            getLocationInWindow(iArr2);
            int i14 = iArr[1] - iArr2[1];
            int i15 = iArr[0] - iArr2[0];
            Rect rect = this.N;
            rect.set(i15, i14, searchAutoComplete.getWidth() + i15, searchAutoComplete.getHeight() + i14);
            int i16 = rect.left;
            int i17 = rect.right;
            int i18 = i13 - i11;
            Rect rect2 = this.O;
            rect2.set(i16, 0, i17, i18);
            p pVar = this.M;
            if (pVar == null) {
                p pVar2 = new p(rect2, rect, searchAutoComplete);
                this.M = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.f468b.set(rect2);
            Rect rect3 = pVar.d;
            rect3.set(rect2);
            int i19 = -pVar.f470e;
            rect3.inset(i19, i19);
            pVar.f469c.set(rect);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0 <= 0) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.f434e0
            if (r0 == 0) goto L_0x0008
            super.onMeasure(r4, r5)
            return
        L_0x0008:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002a
            if (r0 == 0) goto L_0x0020
            if (r0 == r2) goto L_0x001b
            goto L_0x0037
        L_0x001b:
            int r0 = r3.f440k0
            if (r0 <= 0) goto L_0x0037
            goto L_0x002e
        L_0x0020:
            int r4 = r3.f440k0
            if (r4 <= 0) goto L_0x0025
            goto L_0x0037
        L_0x0025:
            int r4 = r3.getPreferredWidth()
            goto L_0x0037
        L_0x002a:
            int r0 = r3.f440k0
            if (r0 <= 0) goto L_0x002f
        L_0x002e:
            goto L_0x0033
        L_0x002f:
            int r0 = r3.getPreferredWidth()
        L_0x0033:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0037:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x0049
            if (r0 == 0) goto L_0x0044
            goto L_0x0051
        L_0x0044:
            int r5 = r3.getPreferredHeight()
            goto L_0x0051
        L_0x0049:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0051:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.f7340o);
        w(oVar.f466q);
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f466q = this.f434e0;
        return oVar;
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f447r0);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchAutoComplete searchAutoComplete = this.D;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f445p0 != null) {
                getContext().startActivity(j("android.intent.action.SEARCH", (Uri) null, (String) null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public final void r() {
        boolean z = true;
        boolean z10 = !TextUtils.isEmpty(this.D.getText());
        int i10 = 0;
        if (!z10 && (!this.f433d0 || this.f443n0)) {
            z = false;
        }
        if (!z) {
            i10 = 8;
        }
        ImageView imageView = this.J;
        imageView.setVisibility(i10);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z10 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final boolean requestFocus(int i10, Rect rect) {
        if (this.f439j0 || !isFocusable()) {
            return false;
        }
        if (this.f434e0) {
            return super.requestFocus(i10, rect);
        }
        boolean requestFocus = this.D.requestFocus(i10, rect);
        if (requestFocus) {
            w(false);
        }
        return requestFocus;
    }

    public final void s() {
        int[] iArr = this.D.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.F.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.G.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.f446q0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m();
            return;
        }
        w(false);
        SearchAutoComplete searchAutoComplete = this.D;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f432c0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f433d0 != z) {
            this.f433d0 = z;
            w(z);
            t();
        }
    }

    public void setImeOptions(int i10) {
        this.D.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.D.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f440k0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f431b0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f432c0 = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f437h0 = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z) {
        int i10;
        this.f438i0 = z;
        m0.a aVar = this.f435f0;
        if (aVar instanceof y0) {
            y0 y0Var = (y0) aVar;
            if (z) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            y0Var.D = i10;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0095, code lost:
        if (getContext().getPackageManager().resolveActivity(r3, 65536) != null) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r8) {
        /*
            r7 = this;
            r7.f445p0 = r8
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r7.D
            r1 = 1
            r2 = 65536(0x10000, float:9.18355E-41)
            r3 = 0
            if (r8 == 0) goto L_0x0068
            int r8 = r8.getSuggestThreshold()
            r0.setThreshold(r8)
            android.app.SearchableInfo r8 = r7.f445p0
            int r8 = r8.getImeOptions()
            r0.setImeOptions(r8)
            android.app.SearchableInfo r8 = r7.f445p0
            int r8 = r8.getInputType()
            r4 = r8 & 15
            if (r4 != r1) goto L_0x0034
            r4 = -65537(0xfffffffffffeffff, float:NaN)
            r8 = r8 & r4
            android.app.SearchableInfo r4 = r7.f445p0
            java.lang.String r4 = r4.getSuggestAuthority()
            if (r4 == 0) goto L_0x0034
            r8 = r8 | r2
            r4 = 524288(0x80000, float:7.34684E-40)
            r8 = r8 | r4
        L_0x0034:
            r0.setInputType(r8)
            m0.a r8 = r7.f435f0
            if (r8 == 0) goto L_0x003e
            r8.c(r3)
        L_0x003e:
            android.app.SearchableInfo r8 = r7.f445p0
            java.lang.String r8 = r8.getSuggestAuthority()
            if (r8 == 0) goto L_0x0065
            androidx.appcompat.widget.y0 r8 = new androidx.appcompat.widget.y0
            android.content.Context r4 = r7.getContext()
            android.app.SearchableInfo r5 = r7.f445p0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r6 = r7.t0
            r8.<init>(r4, r7, r5, r6)
            r7.f435f0 = r8
            r0.setAdapter(r8)
            m0.a r8 = r7.f435f0
            androidx.appcompat.widget.y0 r8 = (androidx.appcompat.widget.y0) r8
            boolean r4 = r7.f438i0
            if (r4 == 0) goto L_0x0062
            r4 = 2
            goto L_0x0063
        L_0x0062:
            r4 = r1
        L_0x0063:
            r8.D = r4
        L_0x0065:
            r7.t()
        L_0x0068:
            android.app.SearchableInfo r8 = r7.f445p0
            if (r8 == 0) goto L_0x0098
            boolean r8 = r8.getVoiceSearchEnabled()
            if (r8 == 0) goto L_0x0098
            android.app.SearchableInfo r8 = r7.f445p0
            boolean r8 = r8.getVoiceSearchLaunchWebSearch()
            if (r8 == 0) goto L_0x007d
            android.content.Intent r3 = r7.V
            goto L_0x0087
        L_0x007d:
            android.app.SearchableInfo r8 = r7.f445p0
            boolean r8 = r8.getVoiceSearchLaunchRecognizer()
            if (r8 == 0) goto L_0x0087
            android.content.Intent r3 = r7.W
        L_0x0087:
            if (r3 == 0) goto L_0x0098
            android.content.Context r8 = r7.getContext()
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            android.content.pm.ResolveInfo r8 = r8.resolveActivity(r3, r2)
            if (r8 == 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r1 = 0
        L_0x0099:
            r7.f441l0 = r1
            if (r1 == 0) goto L_0x00a2
            java.lang.String r8 = "nm"
            r0.setPrivateImeOptions(r8)
        L_0x00a2:
            boolean r8 = r7.f434e0
            r7.w(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f436g0 = z;
        w(this.f434e0);
    }

    public void setSuggestionsAdapter(m0.a aVar) {
        this.f435f0 = aVar;
        this.D.setAdapter(aVar);
    }

    public final void t() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = BuildConfig.FLAVOR;
        }
        boolean z = this.f433d0;
        SearchAutoComplete searchAutoComplete = this.D;
        if (z && (drawable = this.S) != null) {
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void u() {
        boolean z;
        int i10 = 0;
        if ((this.f436g0 || this.f441l0) && !this.f434e0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !(this.I.getVisibility() == 0 || this.K.getVisibility() == 0)) {
            i10 = 8;
        }
        this.G.setVisibility(i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001e, code lost:
        if (r2.f441l0 == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f436g0
            if (r0 == 0) goto L_0x0021
            r1 = 0
            if (r0 != 0) goto L_0x000b
            boolean r0 = r2.f441l0
            if (r0 == 0) goto L_0x0011
        L_0x000b:
            boolean r0 = r2.f434e0
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L_0x0021
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.f441l0
            if (r3 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 8
        L_0x0023:
            android.widget.ImageView r3 = r2.I
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.v(boolean):void");
    }

    public final void w(boolean z) {
        int i10;
        int i11;
        int i12;
        this.f434e0 = z;
        int i13 = 0;
        if (z) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        boolean z10 = !TextUtils.isEmpty(this.D.getText());
        this.H.setVisibility(i10);
        v(z10);
        if (z) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        this.E.setVisibility(i11);
        ImageView imageView = this.R;
        if (imageView.getDrawable() == null || this.f433d0) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        imageView.setVisibility(i12);
        r();
        boolean z11 = !z10;
        if (!this.f441l0 || this.f434e0 || !z11) {
            i13 = 8;
        } else {
            this.I.setVisibility(8);
        }
        this.K.setVisibility(i13);
        u();
    }
}

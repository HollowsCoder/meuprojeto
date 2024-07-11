package i8;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.DisplayCutout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.karumi.dexter.R;
import d9.d;
import i0.b0;
import i0.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import n.e;
import n8.f;
import y.a;
import z8.g;
import z8.k;
import z8.n;
import z8.o;

@SuppressLint({"ViewConstructor"})
public final class a extends FrameLayout implements View.OnClickListener, Animation.AnimationListener {
    public static final /* synthetic */ d[] G;
    public boolean A;
    public boolean B = true;
    public Uri C;
    public int D = 48;
    public final f E = new f(new b(this));
    public HashMap F;

    /* renamed from: o  reason: collision with root package name */
    public h f6134o;

    /* renamed from: p  reason: collision with root package name */
    public Animation f6135p;

    /* renamed from: q  reason: collision with root package name */
    public Animation f6136q;

    /* renamed from: r  reason: collision with root package name */
    public long f6137r = 3000;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f6138s = true;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f6139t = true;
    public boolean u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f6140v;
    public final boolean w = true;

    /* renamed from: x  reason: collision with root package name */
    public boolean f6141x = true;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<Button> f6142y = new ArrayList<>();
    public Typeface z;

    /* renamed from: i8.a$a  reason: collision with other inner class name */
    public static final class C0080a implements Animation.AnimationListener {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ a f6143o;

        public C0080a(a aVar) {
            this.f6143o = aVar;
        }

        public final void onAnimationEnd(Animation animation) {
            g.g(animation, "animation");
            a aVar = this.f6143o;
            aVar.clearAnimation();
            aVar.setVisibility(8);
            aVar.postDelayed(new c(aVar), (long) 100);
        }

        public final void onAnimationRepeat(Animation animation) {
            g.g(animation, "animation");
        }

        public final void onAnimationStart(Animation animation) {
            g.g(animation, "animation");
            a aVar = this.f6143o;
            LinearLayout linearLayout = (LinearLayout) aVar.a(R.id.llAlertBackground);
            if (linearLayout != null) {
                linearLayout.setOnClickListener((View.OnClickListener) null);
            }
            LinearLayout linearLayout2 = (LinearLayout) aVar.a(R.id.llAlertBackground);
            if (linearLayout2 != null) {
                linearLayout2.setClickable(false);
            }
        }
    }

    static {
        o oVar = n.f9972a;
        oVar.getClass();
        k kVar = new k(new z8.d(a.class));
        oVar.getClass();
        G = new d[]{kVar};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context, (AttributeSet) null, 0);
        g.g(context, "context");
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.alerter_slide_in_from_top);
        g.b(loadAnimation, "AnimationUtils.loadAnima…lerter_slide_in_from_top)");
        this.f6135p = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.alerter_slide_out_to_top);
        g.b(loadAnimation2, "AnimationUtils.loadAnima…alerter_slide_out_to_top)");
        this.f6136q = loadAnimation2;
        View.inflate(context, R.layout.alerter_alert_view, this);
        ViewStub viewStub = (ViewStub) findViewById(R.id.vAlertContentContainer);
        g.b(viewStub, "vAlertContentContainer");
        viewStub.setLayoutResource(R.layout.alerter_alert_default_layout);
        ((ViewStub) findViewById(R.id.vAlertContentContainer)).inflate();
        setHapticFeedbackEnabled(true);
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        w.i.w(this, (float) Integer.MAX_VALUE);
        ((LinearLayout) a(R.id.llAlertBackground)).setOnClickListener(this);
    }

    public final View a(int i10) {
        if (this.F == null) {
            this.F = new HashMap();
        }
        View view = (View) this.F.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i10);
        this.F.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    public final void b() {
        try {
            this.f6136q.setAnimationListener(new C0080a(this));
            startAnimation(this.f6136q);
        } catch (Exception e10) {
            Log.e(a.class.getSimpleName(), Log.getStackTraceString(e10));
        }
    }

    public final Typeface getButtonTypeFace() {
        return this.z;
    }

    public final int getContentGravity() {
        LinearLayout linearLayout = (LinearLayout) a(R.id.llAlertBackground);
        ViewGroup.LayoutParams layoutParams = linearLayout != null ? linearLayout.getLayoutParams() : null;
        if (layoutParams != null) {
            return ((FrameLayout.LayoutParams) layoutParams).gravity;
        }
        throw new n8.g("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public final long getDuration$alerter_release() {
        return this.f6137r;
    }

    public final Animation getEnterAnimation$alerter_release() {
        return this.f6135p;
    }

    public final Animation getExitAnimation$alerter_release() {
        return this.f6136q;
    }

    public final View getLayoutContainer() {
        d dVar = G[0];
        return (View) this.E.a();
    }

    public final int getLayoutGravity() {
        return this.D;
    }

    public final h getOnHideListener$alerter_release() {
        return this.f6134o;
    }

    public final TextView getText() {
        AppCompatTextView appCompatTextView = (AppCompatTextView) a(R.id.tvText);
        g.b(appCompatTextView, "tvText");
        return appCompatTextView;
    }

    public final TextView getTitle() {
        AppCompatTextView appCompatTextView = (AppCompatTextView) a(R.id.tvTitle);
        g.b(appCompatTextView, "tvTitle");
        return appCompatTextView;
    }

    public final void onAnimationEnd(Animation animation) {
        g.g(animation, "animation");
        if (!this.u) {
            postDelayed(new d(this), this.f6137r);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
        g.g(animation, "animation");
    }

    public final void onAnimationStart(Animation animation) {
        AppCompatImageView appCompatImageView;
        g.g(animation, "animation");
        if (!isInEditMode()) {
            setVisibility(0);
            if (this.B) {
                performHapticFeedback(1);
            }
            if (this.C != null) {
                RingtoneManager.getRingtone(getContext(), this.C).play();
            }
            if (this.f6140v) {
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) a(R.id.ivIcon);
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setVisibility(4);
                }
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) a(R.id.ivRightIcon);
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setVisibility(4);
                }
                ProgressBar progressBar = (ProgressBar) a(R.id.pbProgress);
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                    return;
                }
                return;
            }
            if (this.f6138s) {
                AppCompatImageView appCompatImageView4 = (AppCompatImageView) a(R.id.ivIcon);
                if (appCompatImageView4 != null) {
                    appCompatImageView4.setVisibility(0);
                }
                if (this.f6139t && (appCompatImageView = (AppCompatImageView) a(R.id.ivIcon)) != null) {
                    appCompatImageView.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.alerter_pulse));
                }
            } else {
                FrameLayout frameLayout = (FrameLayout) a(R.id.flIconContainer);
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
            }
            FrameLayout frameLayout2 = (FrameLayout) a(R.id.flRightIconContainer);
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
    }

    public final void onAttachedToWindow() {
        Drawable drawable;
        super.onAttachedToWindow();
        LinearLayout linearLayout = (LinearLayout) a(R.id.llAlertBackground);
        if (!this.w) {
            drawable = null;
        } else {
            Context context = linearLayout.getContext();
            g.b(context, "context");
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
            int i10 = typedValue.resourceId;
            Object obj = y.a.f9523a;
            drawable = a.c.b(context, i10);
        }
        linearLayout.setForeground(drawable);
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            int i11 = this.D;
            ((FrameLayout.LayoutParams) layoutParams).gravity = i11;
            if (i11 != 48) {
                linearLayout.setPadding(linearLayout.getPaddingLeft(), e.w(this, R.dimen.alerter_padding_default), linearLayout.getPaddingRight(), e.w(this, R.dimen.alerter_alert_padding));
            }
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (this.D != 48) {
                    marginLayoutParams.bottomMargin = e.w(this, R.dimen.navigation_bar_height);
                }
                this.f6135p.setAnimationListener(this);
                setAnimation(this.f6135p);
                for (Button button : this.f6142y) {
                    Typeface typeface = this.z;
                    if (typeface != null) {
                        button.setTypeface(typeface);
                    }
                    ((LinearLayout) a(R.id.llButtonContainer)).addView(button);
                }
                return;
            }
            throw new n8.g("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        throw new n8.g("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public final void onClick(View view) {
        g.g(view, "v");
        if (this.f6141x) {
            b();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6135p.setAnimationListener((Animation.AnimationListener) null);
    }

    public final void onMeasure(int i10, int i11) {
        int i12;
        Window window;
        View decorView;
        WindowInsets rootWindowInsets;
        DisplayCutout m10;
        if (!this.A) {
            this.A = true;
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = e.w(this, R.dimen.alerter_alert_negative_margin_top);
                if (Build.VERSION.SDK_INT >= 28) {
                    LinearLayout linearLayout = (LinearLayout) a(R.id.llAlertBackground);
                    int paddingLeft = linearLayout.getPaddingLeft();
                    int paddingTop = linearLayout.getPaddingTop();
                    Context context = getContext();
                    if (!(context instanceof Activity)) {
                        context = null;
                    }
                    Activity activity = (Activity) context;
                    if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || (rootWindowInsets = decorView.getRootWindowInsets()) == null || (m10 = rootWindowInsets.getDisplayCutout()) == null) {
                        i12 = 0;
                    } else {
                        i12 = m10.getSafeInsetTop();
                    }
                    linearLayout.setPadding(paddingLeft, (i12 / 2) + paddingTop, linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
                }
            } else {
                throw new n8.g("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        super.onMeasure(i10, i11);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        g.g(motionEvent, "event");
        performClick();
        return super.onTouchEvent(motionEvent);
    }

    public final void setAlertBackgroundColor(int i10) {
        ((LinearLayout) a(R.id.llAlertBackground)).setBackgroundColor(i10);
    }

    public final void setAlertBackgroundDrawable(Drawable drawable) {
        g.g(drawable, "drawable");
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        w.d.q((LinearLayout) a(R.id.llAlertBackground), drawable);
    }

    public final void setAlertBackgroundResource(int i10) {
        ((LinearLayout) a(R.id.llAlertBackground)).setBackgroundResource(i10);
    }

    public final void setButtonTypeFace(Typeface typeface) {
        this.z = typeface;
    }

    public final void setContentGravity(int i10) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) a(R.id.tvTitle);
        ViewGroup.LayoutParams layoutParams = null;
        ViewGroup.LayoutParams layoutParams2 = appCompatTextView != null ? appCompatTextView.getLayoutParams() : null;
        if (!(layoutParams2 instanceof LinearLayout.LayoutParams)) {
            layoutParams2 = null;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
        if (layoutParams3 != null) {
            layoutParams3.gravity = i10;
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) a(R.id.tvText);
        ViewGroup.LayoutParams layoutParams4 = appCompatTextView2 != null ? appCompatTextView2.getLayoutParams() : null;
        if (layoutParams4 instanceof LinearLayout.LayoutParams) {
            layoutParams = layoutParams4;
        }
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) layoutParams;
        if (layoutParams5 != null) {
            layoutParams5.gravity = i10;
        }
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) a(R.id.tvText);
        if (appCompatTextView3 != null) {
            appCompatTextView3.setLayoutParams(layoutParams5);
        }
    }

    public final void setDismissible(boolean z10) {
        this.f6141x = z10;
    }

    public final void setDuration$alerter_release(long j8) {
        this.f6137r = j8;
    }

    public final void setEnableInfiniteDuration(boolean z10) {
        this.u = z10;
    }

    public final void setEnableProgress(boolean z10) {
        this.f6140v = z10;
    }

    public final void setEnterAnimation$alerter_release(Animation animation) {
        g.g(animation, "<set-?>");
        this.f6135p = animation;
    }

    public final void setExitAnimation$alerter_release(Animation animation) {
        g.g(animation, "<set-?>");
        this.f6136q = animation;
    }

    public final void setIcon(int i10) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) a(R.id.ivIcon);
        if (appCompatImageView != null) {
            appCompatImageView.setImageDrawable(f.a.b(getContext(), i10));
        }
    }

    public final void setIcon(Bitmap bitmap) {
        g.g(bitmap, "bitmap");
        AppCompatImageView appCompatImageView = (AppCompatImageView) a(R.id.ivIcon);
        if (appCompatImageView != null) {
            appCompatImageView.setImageBitmap(bitmap);
        }
    }

    public final void setIcon(Drawable drawable) {
        g.g(drawable, "drawable");
        AppCompatImageView appCompatImageView = (AppCompatImageView) a(R.id.ivIcon);
        if (appCompatImageView != null) {
            appCompatImageView.setImageDrawable(drawable);
        }
    }

    public final void setIconColorFilter(int i10) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) a(R.id.ivIcon);
        if (appCompatImageView != null) {
            appCompatImageView.setColorFilter(i10);
        }
    }

    public final void setIconColorFilter(ColorFilter colorFilter) {
        g.g(colorFilter, "colorFilter");
        AppCompatImageView appCompatImageView = (AppCompatImageView) a(R.id.ivIcon);
        if (appCompatImageView != null) {
            appCompatImageView.setColorFilter(colorFilter);
        }
    }

    public final void setIconPixelSize(int i10) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) a(R.id.ivIcon);
        g.b(appCompatImageView, "ivIcon");
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) a(R.id.ivIcon);
        g.b(appCompatImageView2, "ivIcon");
        ViewGroup.LayoutParams layoutParams = appCompatImageView2.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        setMinimumWidth(i10);
        setMinimumHeight(i10);
        appCompatImageView.setLayoutParams(layoutParams);
    }

    public final void setIconSize(int i10) {
        setIconPixelSize(e.w(this, i10));
    }

    public final void setLayoutGravity(int i10) {
        if (i10 != 48) {
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.alerter_slide_in_from_bottom);
            g.b(loadAnimation, "AnimationUtils.loadAnima…ter_slide_in_from_bottom)");
            this.f6135p = loadAnimation;
            Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.alerter_slide_out_to_bottom);
            g.b(loadAnimation2, "AnimationUtils.loadAnima…rter_slide_out_to_bottom)");
            this.f6136q = loadAnimation2;
        }
        this.D = i10;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        ((LinearLayout) a(R.id.llAlertBackground)).setOnClickListener(onClickListener);
    }

    public final void setOnHideListener$alerter_release(h hVar) {
        this.f6134o = hVar;
    }

    public final void setOnShowListener(i iVar) {
        g.g(iVar, "listener");
    }

    public final void setProgressColorInt(int i10) {
        Drawable progressDrawable;
        ProgressBar progressBar = (ProgressBar) a(R.id.pbProgress);
        if (progressBar != null && (progressDrawable = progressBar.getProgressDrawable()) != null) {
            progressDrawable.setColorFilter(new LightingColorFilter(-16777216, i10));
        }
    }

    public final void setProgressColorRes(int i10) {
        Drawable progressDrawable;
        ProgressBar progressBar = (ProgressBar) a(R.id.pbProgress);
        if (progressBar != null && (progressDrawable = progressBar.getProgressDrawable()) != null) {
            Context context = getContext();
            Object obj = y.a.f9523a;
            progressDrawable.setColorFilter(new LightingColorFilter(-16777216, a.d.a(context, i10)));
        }
    }

    public final void setRightIcon(int i10) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) a(R.id.ivRightIcon);
        if (appCompatImageView != null) {
            appCompatImageView.setImageDrawable(f.a.b(getContext(), i10));
        }
    }

    public final void setRightIcon(Bitmap bitmap) {
        g.g(bitmap, "bitmap");
        AppCompatImageView appCompatImageView = (AppCompatImageView) a(R.id.ivRightIcon);
        if (appCompatImageView != null) {
            appCompatImageView.setImageBitmap(bitmap);
        }
    }

    public final void setRightIcon(Drawable drawable) {
        g.g(drawable, "drawable");
        AppCompatImageView appCompatImageView = (AppCompatImageView) a(R.id.ivRightIcon);
        if (appCompatImageView != null) {
            appCompatImageView.setImageDrawable(drawable);
        }
    }

    public final void setRightIconColorFilter(int i10) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) a(R.id.ivRightIcon);
        if (appCompatImageView != null) {
            appCompatImageView.setColorFilter(i10);
        }
    }

    public final void setRightIconColorFilter(ColorFilter colorFilter) {
        g.g(colorFilter, "colorFilter");
        AppCompatImageView appCompatImageView = (AppCompatImageView) a(R.id.ivRightIcon);
        if (appCompatImageView != null) {
            appCompatImageView.setColorFilter(colorFilter);
        }
    }

    public final void setRightIconPixelSize(int i10) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) a(R.id.ivRightIcon);
        g.b(appCompatImageView, "ivRightIcon");
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) a(R.id.ivRightIcon);
        g.b(appCompatImageView2, "ivRightIcon");
        ViewGroup.LayoutParams layoutParams = appCompatImageView2.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        setMinimumWidth(i10);
        setMinimumHeight(i10);
        appCompatImageView.setLayoutParams(layoutParams);
    }

    public final void setRightIconPosition(int i10) {
        if (i10 == 48 || i10 == 17 || i10 == 16 || i10 == 80) {
            FrameLayout frameLayout = (FrameLayout) a(R.id.flRightIconContainer);
            g.b(frameLayout, "flRightIconContainer");
            FrameLayout frameLayout2 = (FrameLayout) a(R.id.flRightIconContainer);
            g.b(frameLayout2, "flRightIconContainer");
            ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = i10;
                frameLayout.setLayoutParams(layoutParams2);
                return;
            }
            throw new n8.g("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
    }

    public final void setRightIconSize(int i10) {
        Context context = getContext();
        g.b(context, "context");
        setRightIconPixelSize(context.getResources().getDimensionPixelSize(i10));
    }

    public final void setSound(Uri uri) {
        this.C = uri;
    }

    public final void setText(int i10) {
        String string = getContext().getString(i10);
        g.b(string, "context.getString(textId)");
        setText((CharSequence) string);
    }

    public final void setText(CharSequence charSequence) {
        g.g(charSequence, "text");
        if (!TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) a(R.id.tvText);
            if (appCompatTextView != null) {
                appCompatTextView.setVisibility(0);
            }
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) a(R.id.tvText);
            if (appCompatTextView2 != null) {
                appCompatTextView2.setText(charSequence);
            }
        }
    }

    public final void setTextAppearance(int i10) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) a(R.id.tvText);
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i10);
        }
    }

    public final void setTextTypeface(Typeface typeface) {
        g.g(typeface, "typeface");
        AppCompatTextView appCompatTextView = (AppCompatTextView) a(R.id.tvText);
        if (appCompatTextView != null) {
            appCompatTextView.setTypeface(typeface);
        }
    }

    public final void setTitle(int i10) {
        String string = getContext().getString(i10);
        g.b(string, "context.getString(titleId)");
        setTitle((CharSequence) string);
    }

    public final void setTitle(CharSequence charSequence) {
        g.g(charSequence, "title");
        if (!TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) a(R.id.tvTitle);
            if (appCompatTextView != null) {
                appCompatTextView.setVisibility(0);
            }
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) a(R.id.tvTitle);
            if (appCompatTextView2 != null) {
                appCompatTextView2.setText(charSequence);
            }
        }
    }

    public final void setTitleAppearance(int i10) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) a(R.id.tvTitle);
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i10);
        }
    }

    public final void setTitleTypeface(Typeface typeface) {
        g.g(typeface, "typeface");
        AppCompatTextView appCompatTextView = (AppCompatTextView) a(R.id.tvTitle);
        if (appCompatTextView != null) {
            appCompatTextView.setTypeface(typeface);
        }
    }

    public final void setVibrationEnabled(boolean z10) {
        this.B = z10;
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            g.b(childAt, "getChildAt(i)");
            childAt.setVisibility(i10);
        }
    }
}

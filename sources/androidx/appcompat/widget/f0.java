package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public final class f0 {
    public static final RectF l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m  reason: collision with root package name */
    public static final ConcurrentHashMap<String, Method> f556m = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public int f557a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f558b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f559c = -1.0f;
    public float d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f560e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f561f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f562g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f563h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f564i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f565j;

    /* renamed from: k  reason: collision with root package name */
    public final a f566k;

    public static class a extends c {
        public void b(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) f0.e(textView, TextDirectionHeuristics.FIRSTSTRONG_LTR, "getTextDirectionHeuristic"));
        }
    }

    public static class b extends a {
        public boolean a(TextView textView) {
            return textView.isHorizontallyScrollable();
        }

        public void b(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }
    }

    public static class c {
        public boolean a(TextView textView) {
            return ((Boolean) f0.e(textView, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue();
        }
    }

    static {
        new ConcurrentHashMap();
    }

    public f0(TextView textView) {
        this.f564i = textView;
        this.f565j = textView.getContext();
        this.f566k = Build.VERSION.SDK_INT >= 29 ? new b() : new a();
    }

    public static int[] b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = f556m;
            Method method = concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public static Object e(Object obj, Object obj2, String str) {
        try {
            return d(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    public final void a() {
        boolean z;
        int i10;
        if (!i() || this.f557a == 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (this.f558b) {
                if (this.f564i.getMeasuredHeight() > 0 && this.f564i.getMeasuredWidth() > 0) {
                    if (this.f566k.a(this.f564i)) {
                        i10 = 1048576;
                    } else {
                        i10 = (this.f564i.getMeasuredWidth() - this.f564i.getTotalPaddingLeft()) - this.f564i.getTotalPaddingRight();
                    }
                    int height = (this.f564i.getHeight() - this.f564i.getCompoundPaddingBottom()) - this.f564i.getCompoundPaddingTop();
                    if (i10 > 0 && height > 0) {
                        RectF rectF = l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) i10;
                            rectF.bottom = (float) height;
                            float c10 = (float) c(rectF);
                            if (c10 != this.f564i.getTextSize()) {
                                f(0, c10);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f558b = true;
        }
    }

    public final int c(RectF rectF) {
        int i10;
        boolean z;
        CharSequence transformation;
        int length = this.f561f.length;
        if (length != 0) {
            int i11 = length - 1;
            int i12 = 1;
            int i13 = 0;
            while (i12 <= i11) {
                int i14 = (i12 + i11) / 2;
                int i15 = this.f561f[i14];
                TextView textView = this.f564i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null)) {
                    text = transformation;
                }
                int maxLines = textView.getMaxLines();
                TextPaint textPaint = this.f563h;
                if (textPaint == null) {
                    this.f563h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f563h.set(textView.getPaint());
                this.f563h.setTextSize((float) i15);
                StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f563h, Math.round(rectF.right));
                StaticLayout.Builder hyphenationFrequency = obtain.setAlignment((Layout.Alignment) e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment")).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
                if (maxLines == -1) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = maxLines;
                }
                hyphenationFrequency.setMaxLines(i10);
                try {
                    this.f566k.b(obtain, textView);
                } catch (ClassCastException unused) {
                    Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                }
                StaticLayout build = obtain.build();
                if ((maxLines == -1 || (build.getLineCount() <= maxLines && build.getLineEnd(build.getLineCount() - 1) == text.length())) && ((float) build.getHeight()) <= rectF.bottom) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int i16 = i14 + 1;
                    i13 = i12;
                    i12 = i16;
                } else {
                    i13 = i14 - 1;
                    i11 = i13;
                }
            }
            return this.f561f[i13];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final void f(int i10, float f10) {
        Resources resources;
        Context context = this.f565j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i10, f10, resources.getDisplayMetrics());
        TextView textView = this.f564i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f558b = false;
                try {
                    Method d10 = d("nullLayouts");
                    if (d10 != null) {
                        d10.invoke(textView, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (!isInLayout) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean g() {
        if (!i() || this.f557a != 1) {
            this.f558b = false;
        } else {
            if (!this.f562g || this.f561f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f560e - this.d) / this.f559c))) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round((((float) i10) * this.f559c) + this.d);
                }
                this.f561f = b(iArr);
            }
            this.f558b = true;
        }
        return this.f558b;
    }

    public final boolean h() {
        int[] iArr = this.f561f;
        int length = iArr.length;
        boolean z = length > 0;
        this.f562g = z;
        if (z) {
            this.f557a = 1;
            this.d = (float) iArr[0];
            this.f560e = (float) iArr[length - 1];
            this.f559c = -1.0f;
        }
        return z;
    }

    public final boolean i() {
        return !(this.f564i instanceof l);
    }

    public final void j(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        } else if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        } else if (f12 > 0.0f) {
            this.f557a = 1;
            this.d = f10;
            this.f560e = f11;
            this.f559c = f12;
            this.f562g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
    }
}

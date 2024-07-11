package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.karumi.dexter.R;

public final class k1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f628a;

    /* renamed from: b  reason: collision with root package name */
    public final View f629b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f630c;
    public final WindowManager.LayoutParams d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f631e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final int[] f632f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    public final int[] f633g = new int[2];

    public k1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.d = layoutParams;
        this.f628a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f629b = inflate;
        this.f630c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(k1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}

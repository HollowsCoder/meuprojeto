package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final CheckedTextView f597a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f598b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f599c = null;
    public boolean d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f600e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f601f;

    public i(CheckedTextView checkedTextView) {
        this.f597a = checkedTextView;
    }

    public final void a() {
        CheckedTextView checkedTextView = this.f597a;
        Drawable checkMarkDrawable = checkedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable == null) {
            return;
        }
        if (this.d || this.f600e) {
            Drawable mutate = checkMarkDrawable.mutate();
            if (this.d) {
                mutate.setTintList(this.f598b);
            }
            if (this.f600e) {
                mutate.setTintMode(this.f599c);
            }
            if (mutate.isStateful()) {
                mutate.setState(checkedTextView.getDrawableState());
            }
            checkedTextView.setCheckMarkDrawable(mutate);
        }
    }
}

package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.t;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import e.n;
import z5.a;

public class MaterialComponentsViewInflater extends n {
    public final d a(Context context, AttributeSet attributeSet) {
        return new p6.n(context, attributeSet);
    }

    public final f b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    public final g c(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    public final t d(Context context, AttributeSet attributeSet) {
        return new i6.a(context, attributeSet);
    }

    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}

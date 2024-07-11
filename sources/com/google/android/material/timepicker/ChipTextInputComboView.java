package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.karumi.dexter.R;
import h6.j;

class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: o  reason: collision with root package name */
    public final Chip f3660o;

    /* renamed from: p  reason: collision with root package name */
    public final EditText f3661p;

    public class a extends j {
        public a() {
        }

        public final void afterTextChanged(Editable editable) {
            boolean isEmpty = TextUtils.isEmpty(editable);
            ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
            if (isEmpty) {
                chipTextInputComboView.f3660o.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            } else {
                chipTextInputComboView.f3660o.setText(ChipTextInputComboView.a(chipTextInputComboView, editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, this, false);
        this.f3660o = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, this, false);
        EditText editText = textInputLayout.getEditText();
        this.f3661p = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a());
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        editText.setSaveEnabled(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
    }

    public final boolean isChecked() {
        return this.f3660o.isChecked();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3661p.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public final void setChecked(boolean z) {
        Chip chip = this.f3660o;
        chip.setChecked(z);
        int i10 = 0;
        int i11 = z ? 0 : 4;
        EditText editText = this.f3661p;
        editText.setVisibility(i11);
        if (z) {
            i10 = 8;
        }
        chip.setVisibility(i10);
        if (isChecked()) {
            editText.requestFocus();
            if (!TextUtils.isEmpty(editText.getText())) {
                editText.setSelection(editText.getText().length());
            }
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f3660o.setOnClickListener(onClickListener);
    }

    public final void setTag(int i10, Object obj) {
        this.f3660o.setTag(i10, obj);
    }

    public final void toggle() {
        this.f3660o.toggle();
    }
}

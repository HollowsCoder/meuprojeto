package com.karumi.dexter.listener.multi;

import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.listener.SettingsClickListener;
import com.karumi.dexter.listener.SnackbarUtils;

public class SnackbarOnAnyDeniedMultiplePermissionsListener extends BaseMultiplePermissionsListener {
    private final String buttonText;
    private final int duration;
    private final View.OnClickListener onButtonClickListener;
    private final Snackbar.a snackbarCallback;
    private final String text;
    private final View view;

    public static class Builder {
        private String buttonText;
        private int duration = 0;
        private View.OnClickListener onClickListener;
        private Snackbar.a snackbarCallback;
        private final String text;
        private final View view;

        private Builder(View view2, String str) {
            this.view = view2;
            this.text = str;
        }

        public static Builder with(View view2, int i10) {
            return with(view2, view2.getContext().getString(i10));
        }

        public static Builder with(View view2, String str) {
            return new Builder(view2, str);
        }

        public SnackbarOnAnyDeniedMultiplePermissionsListener build() {
            return new SnackbarOnAnyDeniedMultiplePermissionsListener(this.view, this.text, this.buttonText, this.onClickListener, (Snackbar.a) null, this.duration);
        }

        public Builder withButton(int i10, View.OnClickListener onClickListener2) {
            return withButton(this.view.getContext().getString(i10), onClickListener2);
        }

        public Builder withButton(String str, View.OnClickListener onClickListener2) {
            this.buttonText = str;
            this.onClickListener = onClickListener2;
            return this;
        }

        public Builder withCallback(Snackbar.a aVar) {
            return this;
        }

        public Builder withDuration(int i10) {
            this.duration = i10;
            return this;
        }

        public Builder withOpenSettingsButton(int i10) {
            return withOpenSettingsButton(this.view.getContext().getString(i10));
        }

        public Builder withOpenSettingsButton(String str) {
            this.buttonText = str;
            this.onClickListener = new SettingsClickListener();
            return this;
        }
    }

    private SnackbarOnAnyDeniedMultiplePermissionsListener(View view2, String str, String str2, View.OnClickListener onClickListener, Snackbar.a aVar, int i10) {
        this.view = view2;
        this.text = str;
        this.buttonText = str2;
        this.onButtonClickListener = onClickListener;
        this.duration = i10;
    }

    public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
        super.onPermissionsChecked(multiplePermissionsReport);
        if (!multiplePermissionsReport.areAllPermissionsGranted()) {
            SnackbarUtils.show(this.view, this.text, this.duration, this.buttonText, this.onButtonClickListener, (BaseTransientBottomBar.d<Snackbar>) null);
        }
    }
}

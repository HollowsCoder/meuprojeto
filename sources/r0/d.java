package r0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.e;
import java.lang.ref.WeakReference;

public final class d implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f8338a;

    /* renamed from: b  reason: collision with root package name */
    public a f8339b;

    public static class a extends e.C0013e {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference f8340a;

        /* renamed from: b  reason: collision with root package name */
        public final WeakReference f8341b;

        public a(TextView textView, d dVar) {
            this.f8340a = new WeakReference(textView);
            this.f8341b = new WeakReference(dVar);
        }

        public final void a() {
            boolean z;
            int i10;
            InputFilter[] filters;
            TextView textView = (TextView) this.f8340a.get();
            InputFilter inputFilter = (InputFilter) this.f8341b.get();
            if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= filters.length) {
                        break;
                    } else if (filters[i11] == inputFilter) {
                        z = true;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            z = false;
            if (z && textView.isAttachedToWindow()) {
                e a10 = e.a();
                CharSequence text = textView.getText();
                if (text == null) {
                    i10 = 0;
                } else {
                    a10.getClass();
                    i10 = text.length();
                }
                CharSequence f10 = a10.f(0, i10, text);
                int selectionStart = Selection.getSelectionStart(f10);
                int selectionEnd = Selection.getSelectionEnd(f10);
                textView.setText(f10);
                if (f10 instanceof Spannable) {
                    Spannable spannable = (Spannable) f10;
                    if (selectionStart >= 0 && selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                    } else if (selectionStart >= 0) {
                        Selection.setSelection(spannable, selectionStart);
                    } else if (selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionEnd);
                    }
                }
            }
        }
    }

    public d(TextView textView) {
        this.f8338a = textView;
    }

    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        TextView textView = this.f8338a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b10 = e.a().b();
        if (b10 != 0) {
            boolean z = true;
            if (b10 == 1) {
                if (i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == textView.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (!(i10 == 0 && i11 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return e.a().f(0, charSequence.length(), charSequence);
            } else if (b10 != 3) {
                return charSequence;
            }
        }
        e a10 = e.a();
        if (this.f8339b == null) {
            this.f8339b = new a(textView, this);
        }
        a10.g(this.f8339b);
        return charSequence;
    }
}

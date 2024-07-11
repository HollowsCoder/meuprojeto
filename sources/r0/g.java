package r0;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.e;
import java.lang.ref.WeakReference;

public final class g implements TextWatcher {

    /* renamed from: o  reason: collision with root package name */
    public final EditText f8349o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f8350p = false;

    /* renamed from: q  reason: collision with root package name */
    public a f8351q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f8352r = true;

    public static class a extends e.C0013e {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference f8353a;

        public a(EditText editText) {
            this.f8353a = new WeakReference(editText);
        }

        public final void a() {
            g.a((EditText) this.f8353a.get(), 1);
        }
    }

    public g(EditText editText) {
        this.f8349o = editText;
    }

    public static void a(EditText editText, int i10) {
        int i11;
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            e a10 = e.a();
            if (editableText == null) {
                i11 = 0;
            } else {
                a10.getClass();
                i11 = editableText.length();
            }
            a10.f(0, i11, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r1 == false) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            android.widget.EditText r0 = r4.f8349o
            boolean r1 = r0.isInEditMode()
            if (r1 != 0) goto L_0x0054
            boolean r1 = r4.f8352r
            r2 = 1
            if (r1 == 0) goto L_0x001b
            boolean r1 = r4.f8350p
            r3 = 0
            if (r1 != 0) goto L_0x001c
            androidx.emoji2.text.e r1 = androidx.emoji2.text.e.f1039j
            if (r1 == 0) goto L_0x0018
            r1 = r2
            goto L_0x0019
        L_0x0018:
            r1 = r3
        L_0x0019:
            if (r1 != 0) goto L_0x001c
        L_0x001b:
            r3 = r2
        L_0x001c:
            if (r3 == 0) goto L_0x001f
            goto L_0x0054
        L_0x001f:
            if (r7 > r8) goto L_0x0054
            boolean r7 = r5 instanceof android.text.Spannable
            if (r7 == 0) goto L_0x0054
            androidx.emoji2.text.e r7 = androidx.emoji2.text.e.a()
            int r7 = r7.b()
            if (r7 == 0) goto L_0x0040
            if (r7 == r2) goto L_0x0035
            r5 = 3
            if (r7 == r5) goto L_0x0040
            goto L_0x0054
        L_0x0035:
            android.text.Spannable r5 = (android.text.Spannable) r5
            androidx.emoji2.text.e r7 = androidx.emoji2.text.e.a()
            int r8 = r8 + r6
            r7.f(r6, r8, r5)
            goto L_0x0054
        L_0x0040:
            androidx.emoji2.text.e r5 = androidx.emoji2.text.e.a()
            r0.g$a r6 = r4.f8351q
            if (r6 != 0) goto L_0x004f
            r0.g$a r6 = new r0.g$a
            r6.<init>(r0)
            r4.f8351q = r6
        L_0x004f:
            r0.g$a r6 = r4.f8351q
            r5.g(r6)
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.g.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}

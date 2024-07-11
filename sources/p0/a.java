package p0;

import android.text.Spanned;
import android.widget.TextView;

public final class a {
    public static void a(TextView textView, String str) {
        boolean z;
        boolean z10;
        CharSequence text = textView.getText();
        if (str == text) {
            return;
        }
        if (str != null || text.length() != 0) {
            if (!(str instanceof Spanned)) {
                boolean z11 = true;
                if (str == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (text == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z == z10) {
                    if (str != null) {
                        int length = str.length();
                        if (length == text.length()) {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= length) {
                                    break;
                                } else if (str.charAt(i10) != text.charAt(i10)) {
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                    z11 = false;
                }
                if (!z11) {
                    return;
                }
            } else if (str.equals(text)) {
                return;
            }
            textView.setText(str);
        }
    }
}

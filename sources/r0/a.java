package r0;

import android.widget.EditText;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final C0119a f8330a;

    /* renamed from: r0.a$a  reason: collision with other inner class name */
    public static class C0119a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final EditText f8331a;

        /* renamed from: b  reason: collision with root package name */
        public final g f8332b;

        public C0119a(EditText editText) {
            this.f8331a = editText;
            g gVar = new g(editText);
            this.f8332b = gVar;
            editText.addTextChangedListener(gVar);
            if (b.f8334b == null) {
                synchronized (b.f8333a) {
                    if (b.f8334b == null) {
                        b.f8334b = new b();
                    }
                }
            }
            editText.setEditableFactory(b.f8334b);
        }
    }

    public static class b {
    }

    public a(EditText editText) {
        if (editText != null) {
            this.f8330a = new C0119a(editText);
            return;
        }
        throw new NullPointerException("editText cannot be null");
    }
}

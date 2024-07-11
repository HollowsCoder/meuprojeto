package k0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final c f6626a;

    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final InputContentInfo f6627a;

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f6627a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public a(Object obj) {
            this.f6627a = (InputContentInfo) obj;
        }

        public final ClipDescription a() {
            return this.f6627a.getDescription();
        }

        public final Object b() {
            return this.f6627a;
        }

        public final Uri c() {
            return this.f6627a.getContentUri();
        }

        public final void d() {
            this.f6627a.requestPermission();
        }

        public final Uri e() {
            return this.f6627a.getLinkUri();
        }
    }

    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f6628a;

        /* renamed from: b  reason: collision with root package name */
        public final ClipDescription f6629b;

        /* renamed from: c  reason: collision with root package name */
        public final Uri f6630c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f6628a = uri;
            this.f6629b = clipDescription;
            this.f6630c = uri2;
        }

        public final ClipDescription a() {
            return this.f6629b;
        }

        public final Object b() {
            return null;
        }

        public final Uri c() {
            return this.f6628a;
        }

        public final void d() {
        }

        public final Uri e() {
            return this.f6630c;
        }
    }

    public interface c {
        ClipDescription a();

        Object b();

        Uri c();

        void d();

        Uri e();
    }

    public h(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f6626a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    public h(a aVar) {
        this.f6626a = aVar;
    }
}

package i0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import com.karumi.dexter.BuildConfig;
import java.util.Locale;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final C0079e f5957a;

    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo.Builder f5958a;

        public a(ClipData clipData, int i10) {
            this.f5958a = new ContentInfo.Builder(clipData, i10);
        }

        public final void a(Uri uri) {
            this.f5958a.setLinkUri(uri);
        }

        public final void b(int i10) {
            this.f5958a.setFlags(i10);
        }

        public final e build() {
            return new e(new d(this.f5958a.build()));
        }

        public final void setExtras(Bundle bundle) {
            this.f5958a.setExtras(bundle);
        }
    }

    public interface b {
        void a(Uri uri);

        void b(int i10);

        e build();

        void setExtras(Bundle bundle);
    }

    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final ClipData f5959a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5960b;

        /* renamed from: c  reason: collision with root package name */
        public int f5961c;
        public Uri d;

        /* renamed from: e  reason: collision with root package name */
        public Bundle f5962e;

        public c(ClipData clipData, int i10) {
            this.f5959a = clipData;
            this.f5960b = i10;
        }

        public final void a(Uri uri) {
            this.d = uri;
        }

        public final void b(int i10) {
            this.f5961c = i10;
        }

        public final e build() {
            return new e(new f(this));
        }

        public final void setExtras(Bundle bundle) {
            this.f5962e = bundle;
        }
    }

    public static final class d implements C0079e {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo f5963a;

        public d(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f5963a = contentInfo;
        }

        public final ClipData a() {
            return this.f5963a.getClip();
        }

        public final int b() {
            return this.f5963a.getFlags();
        }

        public final ContentInfo c() {
            return this.f5963a;
        }

        public final int d() {
            return this.f5963a.getSource();
        }

        public final String toString() {
            return "ContentInfoCompat{" + this.f5963a + "}";
        }
    }

    /* renamed from: i0.e$e  reason: collision with other inner class name */
    public interface C0079e {
        ClipData a();

        int b();

        ContentInfo c();

        int d();
    }

    public static final class f implements C0079e {

        /* renamed from: a  reason: collision with root package name */
        public final ClipData f5964a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5965b;

        /* renamed from: c  reason: collision with root package name */
        public final int f5966c;
        public final Uri d;

        /* renamed from: e  reason: collision with root package name */
        public final Bundle f5967e;

        public f(c cVar) {
            ClipData clipData = cVar.f5959a;
            clipData.getClass();
            this.f5964a = clipData;
            int i10 = cVar.f5960b;
            if (i10 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{"source", 0, 5}));
            } else if (i10 <= 5) {
                this.f5965b = i10;
                int i11 = cVar.f5961c;
                if ((i11 & 1) == i11) {
                    this.f5966c = i11;
                    this.d = cVar.d;
                    this.f5967e = cVar.f5962e;
                    return;
                }
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{"source", 0, 5}));
            }
        }

        public final ClipData a() {
            return this.f5964a;
        }

        public final int b() {
            return this.f5966c;
        }

        public final ContentInfo c() {
            return null;
        }

        public final int d() {
            return this.f5965b;
        }

        public final String toString() {
            String str;
            String str2;
            String str3;
            StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.f5964a.getDescription());
            sb.append(", source=");
            int i10 = this.f5965b;
            if (i10 == 0) {
                str = "SOURCE_APP";
            } else if (i10 == 1) {
                str = "SOURCE_CLIPBOARD";
            } else if (i10 == 2) {
                str = "SOURCE_INPUT_METHOD";
            } else if (i10 == 3) {
                str = "SOURCE_DRAG_AND_DROP";
            } else if (i10 == 4) {
                str = "SOURCE_AUTOFILL";
            } else if (i10 != 5) {
                str = String.valueOf(i10);
            } else {
                str = "SOURCE_PROCESS_TEXT";
            }
            sb.append(str);
            sb.append(", flags=");
            int i11 = this.f5966c;
            if ((i11 & 1) != 0) {
                str2 = "FLAG_CONVERT_TO_PLAIN_TEXT";
            } else {
                str2 = String.valueOf(i11);
            }
            sb.append(str2);
            String str4 = BuildConfig.FLAVOR;
            Uri uri = this.d;
            if (uri == null) {
                str3 = str4;
            } else {
                str3 = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb.append(str3);
            if (this.f5967e != null) {
                str4 = ", hasExtras";
            }
            return b0.d.g(sb, str4, "}");
        }
    }

    public e(C0079e eVar) {
        this.f5957a = eVar;
    }

    public final String toString() {
        return this.f5957a.toString();
    }
}

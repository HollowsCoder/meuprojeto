package w2;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.h;
import com.bumptech.glide.load.data.l;
import java.io.InputStream;
import w2.n;

public final class a<Data> implements n<Uri, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final AssetManager f9153a;

    /* renamed from: b  reason: collision with root package name */
    public final C0146a<Data> f9154b;

    /* renamed from: w2.a$a  reason: collision with other inner class name */
    public interface C0146a<Data> {
        d<Data> a(AssetManager assetManager, String str);
    }

    public static class b implements o<Uri, ParcelFileDescriptor>, C0146a<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f9155a;

        public b(AssetManager assetManager) {
            this.f9155a = assetManager;
        }

        public final d<ParcelFileDescriptor> a(AssetManager assetManager, String str) {
            return new h(assetManager, str);
        }

        public final n<Uri, ParcelFileDescriptor> b(r rVar) {
            return new a(this.f9155a, this);
        }
    }

    public static class c implements o<Uri, InputStream>, C0146a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f9156a;

        public c(AssetManager assetManager) {
            this.f9156a = assetManager;
        }

        public final d<InputStream> a(AssetManager assetManager, String str) {
            return new l(assetManager, str);
        }

        public final n<Uri, InputStream> b(r rVar) {
            return new a(this.f9156a, this);
        }
    }

    public a(AssetManager assetManager, C0146a<Data> aVar) {
        this.f9153a = assetManager;
        this.f9154b = aVar;
    }

    public final n.a a(Object obj, int i10, int i11, q2.h hVar) {
        Uri uri = (Uri) obj;
        return new n.a(new l3.b(uri), this.f9154b.a(this.f9153a, uri.toString().substring(22)));
    }

    public final boolean b(Object obj) {
        Uri uri = (Uri) obj;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }
}

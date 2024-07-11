package w2;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.m;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import q2.h;
import w2.n;

public final class v<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f9225b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));

    /* renamed from: a  reason: collision with root package name */
    public final c<Data> f9226a;

    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f9227a;

        public a(ContentResolver contentResolver) {
            this.f9227a = contentResolver;
        }

        public final com.bumptech.glide.load.data.d<AssetFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f9227a, uri, 0);
        }

        public final n<Uri, AssetFileDescriptor> b(r rVar) {
            return new v(this);
        }
    }

    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f9228a;

        public b(ContentResolver contentResolver) {
            this.f9228a = contentResolver;
        }

        public final com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f9228a, uri, 1);
        }

        public final n<Uri, ParcelFileDescriptor> b(r rVar) {
            return new v(this);
        }
    }

    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> a(Uri uri);
    }

    public static class d implements o<Uri, InputStream>, c<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f9229a;

        public d(ContentResolver contentResolver) {
            this.f9229a = contentResolver;
        }

        public final com.bumptech.glide.load.data.d<InputStream> a(Uri uri) {
            return new m(this.f9229a, uri);
        }

        public final n<Uri, InputStream> b(r rVar) {
            return new v(this);
        }
    }

    public v(c<Data> cVar) {
        this.f9226a = cVar;
    }

    public final n.a a(Object obj, int i10, int i11, h hVar) {
        Uri uri = (Uri) obj;
        return new n.a(new l3.b(uri), this.f9226a.a(uri));
    }

    public final boolean b(Object obj) {
        return f9225b.contains(((Uri) obj).getScheme());
    }
}

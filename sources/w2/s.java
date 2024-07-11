package w2;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;
import q2.h;
import w2.n;

public final class s<Data> implements n<Integer, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final n<Uri, Data> f9215a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f9216b;

    public static final class a implements o<Integer, AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f9217a;

        public a(Resources resources) {
            this.f9217a = resources;
        }

        public final n<Integer, AssetFileDescriptor> b(r rVar) {
            return new s(this.f9217a, rVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements o<Integer, ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f9218a;

        public b(Resources resources) {
            this.f9218a = resources;
        }

        public final n<Integer, ParcelFileDescriptor> b(r rVar) {
            return new s(this.f9218a, rVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements o<Integer, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f9219a;

        public c(Resources resources) {
            this.f9219a = resources;
        }

        public final n<Integer, InputStream> b(r rVar) {
            return new s(this.f9219a, rVar.b(Uri.class, InputStream.class));
        }
    }

    public static class d implements o<Integer, Uri> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f9220a;

        public d(Resources resources) {
            this.f9220a = resources;
        }

        public final n<Integer, Uri> b(r rVar) {
            return new s(this.f9220a, u.f9222a);
        }
    }

    public s(Resources resources, n<Uri, Data> nVar) {
        this.f9216b = resources;
        this.f9215a = nVar;
    }

    public final n.a a(Object obj, int i10, int i11, h hVar) {
        Uri uri;
        Integer num = (Integer) obj;
        Resources resources = this.f9216b;
        try {
            uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num.intValue()) + '/' + resources.getResourceTypeName(num.intValue()) + '/' + resources.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f9215a.a(uri, i10, i11, hVar);
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        Integer num = (Integer) obj;
        return true;
    }
}

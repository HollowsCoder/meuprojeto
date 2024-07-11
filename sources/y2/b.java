package y2;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import q2.g;
import q2.h;
import q2.i;
import q2.j;
import z2.c;
import z2.d;
import z2.k;
import z2.m;
import z2.r;

public abstract class b<T> implements j<ImageDecoder.Source, T> {

    /* renamed from: a  reason: collision with root package name */
    public final r f9533a;

    public b() {
        if (r.f9843j == null) {
            synchronized (r.class) {
                if (r.f9843j == null) {
                    r.f9843j = new r();
                }
            }
        }
        this.f9533a = r.f9843j;
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj, h hVar) {
        ImageDecoder.Source source = (ImageDecoder.Source) obj;
        return true;
    }

    /* renamed from: c */
    public final d a(ImageDecoder.Source source, int i10, int i11, h hVar) {
        boolean z;
        q2.b bVar = (q2.b) hVar.c(m.f9826f);
        k kVar = (k) hVar.c(k.f9824f);
        g gVar = m.f9829i;
        if (hVar.c(gVar) == null || !((Boolean) hVar.c(gVar)).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        c cVar = (c) this;
        Bitmap d = ImageDecoder.decodeBitmap(source, new a(this, i10, i11, z, bVar, kVar, (i) hVar.c(m.f9827g)));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + d.getWidth() + "x" + d.getHeight() + "] for [" + i10 + "x" + i11 + "]");
        }
        return new d(d, cVar.f9799b);
    }
}

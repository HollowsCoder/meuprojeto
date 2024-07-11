package y2;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import q2.b;
import q2.i;
import z2.k;

public final class a implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9527a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f9528b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f9529c;
    public final /* synthetic */ b d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ k f9530e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ i f9531f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ b f9532g;

    /* renamed from: y2.a$a  reason: collision with other inner class name */
    public class C0164a implements ImageDecoder.OnPartialImageListener {
        public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public a(b bVar, int i10, int i11, boolean z, b bVar2, k kVar, i iVar) {
        this.f9532g = bVar;
        this.f9527a = i10;
        this.f9528b = i11;
        this.f9529c = z;
        this.d = bVar2;
        this.f9530e = kVar;
        this.f9531f = iVar;
    }

    @SuppressLint({"Override"})
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        boolean z = false;
        if (this.f9532g.f9533a.a(this.f9527a, this.f9528b, this.f9529c, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C0164a());
        Size l = imageInfo.getSize();
        int i10 = this.f9527a;
        if (i10 == Integer.MIN_VALUE) {
            i10 = l.getWidth();
        }
        int i11 = this.f9528b;
        if (i11 == Integer.MIN_VALUE) {
            i11 = l.getHeight();
        }
        float b10 = this.f9530e.b(l.getWidth(), l.getHeight(), i10, i11);
        int round = Math.round(((float) l.getWidth()) * b10);
        int round2 = Math.round(((float) l.getHeight()) * b10);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + l.getWidth() + "x" + l.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b10);
        }
        imageDecoder.setTargetSize(round, round2);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            if (this.f9531f == i.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                z = true;
            }
            imageDecoder.setTargetColorSpace(ColorSpace.get(z ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        } else if (i12 >= 26) {
            imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
        }
    }
}

package h6;

import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.activity.result.c;
import j6.d;
import java.lang.ref.WeakReference;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f5899a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    public final a f5900b = new a();

    /* renamed from: c  reason: collision with root package name */
    public float f5901c;
    public boolean d = true;

    /* renamed from: e  reason: collision with root package name */
    public WeakReference<b> f5902e = new WeakReference<>((Object) null);

    /* renamed from: f  reason: collision with root package name */
    public d f5903f;

    public class a extends c {
        public a() {
        }

        public final void p(int i10) {
            i iVar = i.this;
            iVar.d = true;
            b bVar = iVar.f5902e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        public final void q(Typeface typeface, boolean z) {
            if (!z) {
                i iVar = i.this;
                iVar.d = true;
                b bVar = iVar.f5902e.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public i(b bVar) {
        this.f5902e = new WeakReference<>(bVar);
    }
}

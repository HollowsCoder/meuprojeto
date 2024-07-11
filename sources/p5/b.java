package p5;

import android.util.Log;
import n5.a;
import n5.d;

public final class b extends a<a> {

    /* renamed from: b  reason: collision with root package name */
    public final d f7925b = new d();

    /* renamed from: c  reason: collision with root package name */
    public final q5.d f7926c;
    public final Object d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public boolean f7927e = true;

    public b(q5.d dVar) {
        this.f7926c = dVar;
    }

    public final void a() {
        synchronized (this.f7479a) {
        }
        synchronized (this.d) {
            if (this.f7927e) {
                this.f7926c.b();
                this.f7927e = false;
            }
        }
    }

    public final void finalize() {
        try {
            synchronized (this.d) {
                if (this.f7927e) {
                    Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                    a();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }
}

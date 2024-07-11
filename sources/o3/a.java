package o3;

import android.view.ScaleGestureDetector;
import o3.k;

public final class a implements ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f7707a;

    public a(b bVar) {
        this.f7707a = bVar;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
            return false;
        }
        if (scaleFactor < 0.0f) {
            return true;
        }
        ((k.a) this.f7707a.f7716j).a(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }
}

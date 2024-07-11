package t1;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8886a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f8887b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final c f8888c = new c();
    public static final d d = new d();

    /* renamed from: e  reason: collision with root package name */
    public static final float f8889e = ((float) (Math.sqrt(2.0d) / 2.0d));

    /* renamed from: f  reason: collision with root package name */
    public static float f8890f = -1.0f;

    public class a extends ThreadLocal<PathMeasure> {
        public final Object initialValue() {
            return new PathMeasure();
        }
    }

    public class b extends ThreadLocal<Path> {
        public final Object initialValue() {
            return new Path();
        }
    }

    public class c extends ThreadLocal<Path> {
        public final Object initialValue() {
            return new Path();
        }
    }

    public class d extends ThreadLocal<float[]> {
        public final Object initialValue() {
            return new float[4];
        }
    }

    public static void a(Path path, float f10, float f11, float f12) {
        PathMeasure pathMeasure = (PathMeasure) f8886a.get();
        Path path2 = (Path) f8887b.get();
        Path path3 = (Path) f8888c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f10 == 1.0f && f11 == 0.0f) {
            androidx.databinding.a.n();
        } else if (length < 1.0f || ((double) Math.abs((f11 - f10) - 1.0f)) < 0.01d) {
            androidx.databinding.a.n();
        } else {
            float f13 = f10 * length;
            float f14 = f11 * length;
            float f15 = f12 * length;
            float min = Math.min(f13, f14) + f15;
            float max = Math.max(f13, f14) + f15;
            if (min >= length && max >= length) {
                min = (float) f.c(min, length);
                max = (float) f.c(max, length);
            }
            if (min < 0.0f) {
                min = (float) f.c(min, length);
            }
            if (max < 0.0f) {
                max = (float) f.c(max, length);
            }
            int i10 = (min > max ? 1 : (min == max ? 0 : -1));
            if (i10 == 0) {
                path.reset();
            } else {
                if (i10 >= 0) {
                    min -= length;
                }
                path2.reset();
                pathMeasure.getSegment(min, max, path2, true);
                if (max > length) {
                    path3.reset();
                    pathMeasure.getSegment(0.0f, max % length, path3, true);
                } else {
                    if (min < 0.0f) {
                        path3.reset();
                        pathMeasure.getSegment(min + length, length, path3, true);
                    }
                    path.set(path2);
                }
                path2.addPath(path3);
                path.set(path2);
            }
            androidx.databinding.a.n();
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static float c() {
        if (f8890f == -1.0f) {
            f8890f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f8890f;
    }

    public static float d(Matrix matrix) {
        float[] fArr = (float[]) d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f10 = f8889e;
        fArr[2] = f10;
        fArr[3] = f10;
        matrix.mapPoints(fArr);
        return (float) Math.hypot((double) (fArr[2] - fArr[0]), (double) (fArr[3] - fArr[1]));
    }
}

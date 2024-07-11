package p5;

import android.graphics.PointF;
import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
import java.util.List;
import n.e;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f7920a;

    /* renamed from: b  reason: collision with root package name */
    public final PointF f7921b;

    /* renamed from: c  reason: collision with root package name */
    public final float f7922c;
    public final float d;

    /* renamed from: e  reason: collision with root package name */
    public final List<e> f7923e;

    /* renamed from: f  reason: collision with root package name */
    public final List<s6.a> f7924f;

    public a(int i10, @RecentlyNonNull PointF pointF, float f10, float f11, @RecentlyNonNull e[] eVarArr, @RecentlyNonNull s6.a[] aVarArr) {
        this.f7920a = i10;
        this.f7921b = pointF;
        this.f7922c = f10;
        this.d = f11;
        this.f7923e = Arrays.asList(eVarArr);
        this.f7924f = Arrays.asList(aVarArr);
    }

    @RecentlyNonNull
    public final PointF a() {
        PointF pointF = this.f7921b;
        return new PointF(pointF.x - (this.f7922c / 2.0f), pointF.y - (this.d / 2.0f));
    }
}

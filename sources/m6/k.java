package m6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
import l6.a;
import m6.l;

public final class k extends l.f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f7182b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Matrix f7183c;

    public k(ArrayList arrayList, Matrix matrix) {
        this.f7182b = arrayList;
        this.f7183c = matrix;
    }

    public final void a(Matrix matrix, a aVar, int i10, Canvas canvas) {
        for (l.f a10 : this.f7182b) {
            a10.a(this.f7183c, aVar, i10, canvas);
        }
    }
}

package a7;

import android.util.Log;
import androidx.appcompat.widget.x0;
import f7.c0;
import java.util.concurrent.atomic.AtomicReference;
import y6.r;
import z3.j;

public final class b implements a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f112c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final v7.a<a> f113a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<a> f114b = new AtomicReference<>((Object) null);

    public static final class a implements c {
    }

    public b(v7.a<a> aVar) {
        this.f113a = aVar;
        ((r) aVar).a(new d2.b(9, this));
    }

    public final c a(String str) {
        a aVar = this.f114b.get();
        return aVar == null ? f112c : aVar.a(str);
    }

    public final boolean b() {
        a aVar = this.f114b.get();
        return aVar != null && aVar.b();
    }

    public final void c(String str, String str2, long j8, c0 c0Var) {
        String e10 = x0.e("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", e10, (Throwable) null);
        }
        ((r) this.f113a).a(new j(str, str2, j8, c0Var));
    }

    public final boolean d(String str) {
        a aVar = this.f114b.get();
        return aVar != null && aVar.d(str);
    }
}

package k4;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import k4.a.c;
import k4.d;
import l4.o;
import n4.b;
import n4.h;

public final class a<O extends c> {

    /* renamed from: a  reason: collision with root package name */
    public final C0093a<?, O> f6686a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6687b = "ClearcutLogger.API";

    /* renamed from: k4.a$a  reason: collision with other inner class name */
    public static abstract class C0093a<T extends e, O> extends d<T, O> {
        @RecentlyNonNull
        @Deprecated
        public e a(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull n4.c cVar, @RecentlyNonNull c cVar2, @RecentlyNonNull d.a aVar, @RecentlyNonNull d.b bVar) {
            throw null;
        }
    }

    public static class b<C> {
    }

    public interface c {

        /* renamed from: k4.a$c$a  reason: collision with other inner class name */
        public interface C0094a extends c {
            @RecentlyNonNull
            Account a();
        }

        public interface b extends c {
            @RecentlyNonNull
            GoogleSignInAccount b();
        }
    }

    public static abstract class d<T, O> {
    }

    public interface e {
        @RecentlyNonNull
        boolean a();

        Set<Scope> b();

        void c(@RecentlyNonNull String str);

        void d(h hVar, Set<Scope> set);

        @RecentlyNonNull
        void e();

        @RecentlyNonNull
        int f();

        @RecentlyNonNull
        boolean g();

        @RecentlyNonNull
        void h();

        @RecentlyNullable
        String i();

        void j(@RecentlyNonNull b.c cVar);

        void k();

        @RecentlyNonNull
        boolean l();

        void o(@RecentlyNonNull o oVar);
    }

    public static final class f<C extends e> extends b<C> {
    }

    public a(@RecentlyNonNull h4.b bVar, @RecentlyNonNull f fVar) {
        this.f6686a = bVar;
    }
}

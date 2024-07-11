package n4;

import android.accounts.Account;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import n.d;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Account f7401a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Scope> f7402b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<Scope> f7403c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7404e;

    /* renamed from: f  reason: collision with root package name */
    public final j5.a f7405f;

    /* renamed from: g  reason: collision with root package name */
    public Integer f7406g;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Account f7407a;

        /* renamed from: b  reason: collision with root package name */
        public d<Scope> f7408b;

        /* renamed from: c  reason: collision with root package name */
        public String f7409c;
        public String d;
    }

    public static final class b {
    }

    public c(Account account, @RecentlyNonNull d dVar, @RecentlyNonNull String str, @RecentlyNonNull String str2) {
        j5.a aVar = j5.a.f6573a;
        this.f7401a = account;
        Set<Scope> emptySet = dVar == null ? Collections.emptySet() : Collections.unmodifiableSet(dVar);
        this.f7402b = emptySet;
        Map emptyMap = Collections.emptyMap();
        this.d = str;
        this.f7404e = str2;
        this.f7405f = aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (b bVar : emptyMap.values()) {
            bVar.getClass();
            hashSet.addAll((Collection) null);
        }
        this.f7403c = Collections.unmodifiableSet(hashSet);
    }
}

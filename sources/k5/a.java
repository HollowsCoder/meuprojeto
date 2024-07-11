package k5;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import j5.e;
import java.util.concurrent.locks.ReentrantLock;
import k4.d;
import l4.w;
import n4.b;
import n4.c;
import n4.f;
import n4.m;
import n4.v;
import org.json.JSONException;

public final class a extends f<f> implements e {
    public final Bundle A;
    public final Integer B;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f6697y = true;
    public final c z;

    public a(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull c cVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull d.a aVar, @RecentlyNonNull d.b bVar) {
        super(context, looper, 44, cVar, aVar, bVar);
        this.z = cVar;
        this.A = bundle;
        this.B = cVar.f7406g;
    }

    @RecentlyNonNull
    public final int f() {
        return 12451000;
    }

    @RecentlyNonNull
    public final boolean l() {
        return this.f6697y;
    }

    public final void m() {
        j(new b.d());
    }

    public final void n(d dVar) {
        GoogleSignInAccount googleSignInAccount;
        ReentrantLock reentrantLock;
        ReentrantLock reentrantLock2;
        if (dVar != null) {
            try {
                Account account = this.z.f7401a;
                if (account == null) {
                    account = new Account("<<default account>>", "com.google");
                }
                if ("<<default account>>".equals(account.name)) {
                    g4.a a10 = g4.a.a(this.f7371c);
                    reentrantLock = a10.f4972a;
                    reentrantLock.lock();
                    String string = a10.f4973b.getString("defaultGoogleSignInAccount", (String) null);
                    reentrantLock.unlock();
                    if (!TextUtils.isEmpty(string)) {
                        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 20);
                        sb.append("googleSignInAccount:");
                        sb.append(string);
                        String sb2 = sb.toString();
                        reentrantLock2 = a10.f4972a;
                        reentrantLock2.lock();
                        String string2 = a10.f4973b.getString(sb2, (String) null);
                        reentrantLock2.unlock();
                        if (string2 != null) {
                            try {
                                googleSignInAccount = GoogleSignInAccount.h0(string2);
                            } catch (JSONException unused) {
                            }
                            Integer num = this.B;
                            m.h(num);
                            ((f) u()).m(new l(1, new v(2, account, num.intValue(), googleSignInAccount)), dVar);
                        }
                    }
                }
                googleSignInAccount = null;
                Integer num2 = this.B;
                m.h(num2);
                ((f) u()).m(new l(1, new v(2, account, num2.intValue(), googleSignInAccount)), dVar);
            } catch (RemoteException e10) {
                Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
                try {
                    l4.v vVar = (l4.v) dVar;
                    vVar.f6943b.post(new w(0, vVar, new n(1, new j4.b(8, (PendingIntent) null), (n4.w) null)));
                } catch (RemoteException unused2) {
                    Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
                }
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } else {
            throw new NullPointerException("Expecting a valid ISignInCallbacks");
        }
    }

    @RecentlyNonNull
    public final /* synthetic */ IInterface q(@RecentlyNonNull IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new i(iBinder);
    }

    @RecentlyNonNull
    public final Bundle s() {
        c cVar = this.z;
        boolean equals = this.f7371c.getPackageName().equals(cVar.d);
        Bundle bundle = this.A;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", cVar.d);
        }
        return bundle;
    }

    @RecentlyNonNull
    public final String v() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @RecentlyNonNull
    public final String w() {
        return "com.google.android.gms.signin.service.START";
    }
}

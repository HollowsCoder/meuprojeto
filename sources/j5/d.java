package j5;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import k4.a;
import k4.d;
import n4.c;

public final class d extends a.C0093a<k5.a, a> {
    public final a.e a(Context context, Looper looper, c cVar, a.c cVar2, d.a aVar, d.b bVar) {
        a aVar2 = (a) cVar2;
        a aVar3 = cVar.f7405f;
        Integer num = cVar.f7406g;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", cVar.f7401a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        if (aVar3 != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
            bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        }
        return new k5.a(context, looper, cVar, bundle, aVar, bVar);
    }
}

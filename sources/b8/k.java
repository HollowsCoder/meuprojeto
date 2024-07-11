package b8;

import com.google.firebase.messaging.FirebaseMessaging;
import s7.a;
import s7.b;

public final /* synthetic */ class k implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging.a f2027a;

    public /* synthetic */ k(FirebaseMessaging.a aVar) {
        this.f2027a = aVar;
    }

    public final void a(a aVar) {
        boolean z;
        FirebaseMessaging.a aVar2 = this.f2027a;
        synchronized (aVar2) {
            aVar2.a();
            Boolean bool = aVar2.d;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = FirebaseMessaging.this.f3706a.g();
            }
        }
        if (z) {
            com.google.firebase.messaging.a aVar3 = FirebaseMessaging.f3704k;
            FirebaseMessaging.this.d();
        }
    }
}

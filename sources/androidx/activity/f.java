package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.ComponentActivity;

public final class f implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f183o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ IntentSender.SendIntentException f184p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity.b f185q;

    public f(ComponentActivity.b bVar, int i10, IntentSender.SendIntentException sendIntentException) {
        this.f185q = bVar;
        this.f183o = i10;
        this.f184p = sendIntentException;
    }

    public final void run() {
        this.f185q.a(this.f183o, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f184p));
    }
}

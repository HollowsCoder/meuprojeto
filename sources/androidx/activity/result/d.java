package androidx.activity.result;

import android.content.Intent;
import c.a;
import c.c;
import java.util.HashMap;

public final class d extends c {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ String f194o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ a f195p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ f f196q;

    public d(f fVar, String str, c cVar) {
        this.f196q = fVar;
        this.f194o = str;
        this.f195p = cVar;
    }

    public final void E(Intent intent) {
        f fVar = this.f196q;
        HashMap hashMap = fVar.f201c;
        String str = this.f194o;
        Integer num = (Integer) hashMap.get(str);
        a aVar = this.f195p;
        if (num != null) {
            fVar.f202e.add(str);
            try {
                fVar.b(num.intValue(), aVar, intent);
            } catch (Exception e10) {
                fVar.f202e.remove(str);
                throw e10;
            }
        } else {
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + intent + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }
}

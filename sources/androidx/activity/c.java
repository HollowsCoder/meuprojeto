package androidx.activity;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.savedstate.a;
import java.util.ArrayList;
import java.util.HashMap;

public final /* synthetic */ class c implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f178a;

    public /* synthetic */ c(ComponentActivity componentActivity) {
        this.f178a = componentActivity;
    }

    public final Bundle a() {
        ComponentActivity componentActivity = this.f178a;
        componentActivity.getClass();
        Bundle bundle = new Bundle();
        ComponentActivity.b bVar = componentActivity.f160x;
        bVar.getClass();
        HashMap hashMap = bVar.f201c;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(hashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(hashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(bVar.f202e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) bVar.f205h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", bVar.f199a);
        return bundle;
    }
}

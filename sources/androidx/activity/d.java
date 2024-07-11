package androidx.activity;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import b.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public final /* synthetic */ class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f179a;

    public /* synthetic */ d(ComponentActivity componentActivity) {
        this.f179a = componentActivity;
    }

    public final void a() {
        ComponentActivity componentActivity = this.f179a;
        Bundle a10 = componentActivity.f157s.f1884b.a("android:support:activity-result");
        if (a10 != null) {
            ComponentActivity.b bVar = componentActivity.f160x;
            bVar.getClass();
            ArrayList<Integer> integerArrayList = a10.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                bVar.f202e = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                bVar.f199a = (Random) a10.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                Bundle bundle = a10.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                Bundle bundle2 = bVar.f205h;
                bundle2.putAll(bundle);
                for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                    String str = stringArrayList.get(i10);
                    HashMap hashMap = bVar.f201c;
                    boolean containsKey = hashMap.containsKey(str);
                    HashMap hashMap2 = bVar.f200b;
                    if (containsKey) {
                        Integer num = (Integer) hashMap.remove(str);
                        if (!bundle2.containsKey(str)) {
                            hashMap2.remove(num);
                        }
                    }
                    int intValue = integerArrayList.get(i10).intValue();
                    String str2 = stringArrayList.get(i10);
                    hashMap2.put(Integer.valueOf(intValue), str2);
                    hashMap.put(str2, Integer.valueOf(intValue));
                }
            }
        }
    }
}

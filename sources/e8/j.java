package e8;

import android.os.Bundle;
import f8.e;
import java.util.Map;
import m1.i;
import org.json.JSONObject;
import r4.b;
import w6.a;

public final /* synthetic */ class j implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f4531a;

    public /* synthetic */ j(i iVar) {
        this.f4531a = iVar;
    }

    public final void a(String str, e eVar) {
        JSONObject optJSONObject;
        i iVar = this.f4531a;
        a aVar = (a) ((v7.b) iVar.f7056p).get();
        if (aVar != null) {
            JSONObject jSONObject = eVar.f4911e;
            if (jSONObject.length() >= 1) {
                JSONObject jSONObject2 = eVar.f4909b;
                if (jSONObject2.length() >= 1 && (optJSONObject = jSONObject.optJSONObject(str)) != null) {
                    String optString = optJSONObject.optString("choiceId");
                    if (!optString.isEmpty()) {
                        synchronized (((Map) iVar.f7057q)) {
                            if (!optString.equals(((Map) iVar.f7057q).get(str))) {
                                ((Map) iVar.f7057q).put(str, optString);
                                Bundle bundle = new Bundle();
                                bundle.putString("arm_key", str);
                                bundle.putString("arm_value", jSONObject2.optString(str));
                                bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                                bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                                bundle.putString("group", optJSONObject.optString("group"));
                                aVar.g("fp", "personalization_assignment", bundle);
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("_fpid", optString);
                                aVar.g("fp", "_fpc", bundle2);
                            }
                        }
                    }
                }
            }
        }
    }
}

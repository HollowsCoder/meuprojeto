package d7;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

public final class l0 {
    static {
        Charset.forName("UTF-8");
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, (String) null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }
}

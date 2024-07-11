package f8;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

public final class e {

    /* renamed from: f  reason: collision with root package name */
    public static final Date f4907f = new Date(0);

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f4908a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f4909b;

    /* renamed from: c  reason: collision with root package name */
    public final Date f4910c;
    public final JSONArray d;

    /* renamed from: e  reason: collision with root package name */
    public final JSONObject f4911e;

    public e(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        this.f4909b = jSONObject;
        this.f4910c = date;
        this.d = jSONArray;
        this.f4911e = jSONObject2;
        this.f4908a = jSONObject3;
    }

    public static e a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new e(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f4908a.toString().equals(((e) obj).toString());
    }

    public final int hashCode() {
        return this.f4908a.hashCode();
    }

    public final String toString() {
        return this.f4908a.toString();
    }
}

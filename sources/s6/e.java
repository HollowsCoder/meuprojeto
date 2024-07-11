package s6;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import n4.l;
import n4.m;
import n4.o;
import r4.i;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f8826a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8827b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8828c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f8829e;

    /* renamed from: f  reason: collision with root package name */
    public final String f8830f;

    /* renamed from: g  reason: collision with root package name */
    public final String f8831g;

    public e(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        m.j("ApplicationId must be set.", !i.a(str));
        this.f8827b = str;
        this.f8826a = str2;
        this.f8828c = str3;
        this.d = str4;
        this.f8829e = str5;
        this.f8830f = str6;
        this.f8831g = str7;
    }

    public static e a(Context context) {
        o oVar = new o(context);
        String a10 = oVar.a("google_app_id");
        if (TextUtils.isEmpty(a10)) {
            return null;
        }
        return new e(a10, oVar.a("google_api_key"), oVar.a("firebase_database_url"), oVar.a("ga_trackingId"), oVar.a("gcm_defaultSenderId"), oVar.a("google_storage_bucket"), oVar.a("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f8827b, eVar.f8827b) && l.a(this.f8826a, eVar.f8826a) && l.a(this.f8828c, eVar.f8828c) && l.a(this.d, eVar.d) && l.a(this.f8829e, eVar.f8829e) && l.a(this.f8830f, eVar.f8830f) && l.a(this.f8831g, eVar.f8831g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8827b, this.f8826a, this.f8828c, this.d, this.f8829e, this.f8830f, this.f8831g});
    }

    public final String toString() {
        l.a aVar = new l.a(this);
        aVar.a(this.f8827b, "applicationId");
        aVar.a(this.f8826a, "apiKey");
        aVar.a(this.f8828c, "databaseUrl");
        aVar.a(this.f8829e, "gcmSenderId");
        aVar.a(this.f8830f, "storageBucket");
        aVar.a(this.f8831g, "projectId");
        return aVar.toString();
    }
}

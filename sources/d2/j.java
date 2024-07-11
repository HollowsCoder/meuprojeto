package d2;

import com.appfab.facematchlive.ui.flow.main.MainActivity;
import n8.i;
import y8.a;
import z8.h;

public final class j extends h implements a<i> {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ MainActivity f4136p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(MainActivity mainActivity) {
        super(0);
        this.f4136p = mainActivity;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:1|2|3|4|5|6) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x003a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n() {
        /*
            r7 = this;
            java.lang.String r0 = "android.intent.action.VIEW"
            com.appfab.facematchlive.ui.flow.main.MainActivity r1 = r7.f4136p
            java.lang.String r2 = "https://play.google.com/store/apps/details?id="
            java.lang.String r3 = "market://details?id="
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0053 }
            r4.<init>()     // Catch:{ Exception -> 0x0053 }
            android.content.Context r5 = r1.getApplicationContext()     // Catch:{ Exception -> 0x0053 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ Exception -> 0x0053 }
            r4.append(r5)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r5 = "pro"
            r4.append(r5)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0053 }
            android.content.Intent r5 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x003a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ActivityNotFoundException -> 0x003a }
            r6.<init>(r3)     // Catch:{ ActivityNotFoundException -> 0x003a }
            r6.append(r4)     // Catch:{ ActivityNotFoundException -> 0x003a }
            java.lang.String r3 = r6.toString()     // Catch:{ ActivityNotFoundException -> 0x003a }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ ActivityNotFoundException -> 0x003a }
            r5.<init>(r0, r3)     // Catch:{ ActivityNotFoundException -> 0x003a }
            r1.startActivity(r5)     // Catch:{ ActivityNotFoundException -> 0x003a }
            goto L_0x0057
        L_0x003a:
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x0053 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0053 }
            r5.<init>(r2)     // Catch:{ Exception -> 0x0053 }
            r5.append(r4)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x0053 }
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x0053 }
            r3.<init>(r0, r2)     // Catch:{ Exception -> 0x0053 }
            r1.startActivity(r3)     // Catch:{ Exception -> 0x0053 }
            goto L_0x0057
        L_0x0053:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0057:
            n8.i r0 = n8.i.f7501a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.j.n():java.lang.Object");
    }
}

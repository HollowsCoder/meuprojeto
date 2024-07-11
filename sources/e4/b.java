package e4;

import android.net.Uri;
import android.util.Log;
import androidx.appcompat.widget.x0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public final class b extends Thread {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Map f4489o;

    public b(HashMap hashMap) {
        this.f4489o = hashMap;
    }

    public final void run() {
        StringBuilder sb;
        String str;
        String str2;
        HttpURLConnection httpURLConnection;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        Map map = this.f4489o;
        for (String str3 : map.keySet()) {
            buildUpon.appendQueryParameter(str3, (String) map.get(str3));
        }
        String uri = buildUpon.build().toString();
        try {
            httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 65);
                sb2.append("Received non-success response code ");
                sb2.append(responseCode);
                sb2.append(" from pinging URL: ");
                sb2.append(uri);
                Log.w("HttpUrlPinger", sb2.toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
            str2 = e.getMessage();
            sb = new StringBuilder(x0.a(str2, x0.a(uri, 32)));
            str = "Error while parsing ping URL: ";
            sb.append(str);
            sb.append(uri);
            sb.append(". ");
            sb.append(str2);
            Log.w("HttpUrlPinger", sb.toString(), e);
        } catch (IOException | RuntimeException e11) {
            e = e11;
            str2 = e.getMessage();
            sb = new StringBuilder(x0.a(str2, x0.a(uri, 27)));
            str = "Error while pinging URL: ";
            sb.append(str);
            sb.append(uri);
            sb.append(". ");
            sb.append(str2);
            Log.w("HttpUrlPinger", sb.toString(), e);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}

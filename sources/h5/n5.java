package h5;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public final class n5 extends r4 {
    public n5(i4 i4Var) {
        super(i4Var);
    }

    public final boolean h() {
        return false;
    }

    public final HttpURLConnection k(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            i4 i4Var = this.f5649o;
            i4Var.getClass();
            httpURLConnection.setConnectTimeout(60000);
            i4Var.getClass();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain HTTP connection");
    }
}

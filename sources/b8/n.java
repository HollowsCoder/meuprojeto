package b8;

import android.util.Log;
import c5.h;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import m5.r;

public final class n implements Closeable {

    /* renamed from: o  reason: collision with root package name */
    public final URL f2034o;

    /* renamed from: p  reason: collision with root package name */
    public r f2035p;

    /* renamed from: q  reason: collision with root package name */
    public volatile InputStream f2036q;

    public n(URL url) {
        this.f2034o = url;
    }

    public final void close() {
        try {
            InputStream inputStream = this.f2036q;
            Logger logger = h.f2162a;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    h.f2162a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", e10);
                }
            }
        } catch (IOException e11) {
            throw new AssertionError(e11);
        } catch (NullPointerException e12) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e12);
        }
    }
}
